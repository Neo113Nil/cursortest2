package org.chromium.net.urlconnection;

import android.net.TrafficStats;
import android.os.Build;
import android.util.Log;
import android.util.Pair;
import com.facebook.appevents.AppEventsConstants;
import com.google.common.net.HttpHeaders;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;
import java.nio.ByteBuffer;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.Executor;
import org.chromium.base.metrics.ScopedSysTraceEvent;
import org.chromium.net.CronetEngine;
import org.chromium.net.CronetException;
import org.chromium.net.ExperimentalUrlRequest;
import org.chromium.net.UrlRequest;
import org.chromium.net.UrlResponseInfo;

/* loaded from: classes10.dex */
public class CronetHttpURLConnection extends HttpURLConnection {
    private static final String CONTENT_LENGTH = "Content-Length";
    private static final String TAG = "CronetHttpURLConnection";
    private final CronetEngine mCronetEngine;
    private IOException mException;
    private boolean mHasResponseHeadersOrCompleted;
    private final CronetInputStream mInputStream;
    private final MessageLoop mMessageLoop;
    private boolean mOnRedirectCalled;
    private CronetOutputStream mOutputStream;
    private UrlRequest mRequest;
    private final List<Pair<String, String>> mRequestHeaders;
    private List<Map.Entry<String, String>> mResponseHeadersList;
    private Map<String, List<String>> mResponseHeadersMap;
    private UrlResponseInfo mResponseInfo;
    private int mTrafficStatsTag;
    private boolean mTrafficStatsTagSet;
    private int mTrafficStatsUid;
    private boolean mTrafficStatsUidSet;

    @Override // java.net.HttpURLConnection
    public boolean usingProxy() {
        return false;
    }

    public CronetHttpURLConnection(URL url, CronetEngine cronetEngine) {
        super(url);
        ScopedSysTraceEvent scoped = ScopedSysTraceEvent.scoped("CronetHttpURLConnection#CronetHttpURLConnection");
        try {
            this.mCronetEngine = cronetEngine;
            this.mMessageLoop = new MessageLoop();
            this.mInputStream = new CronetInputStream(this);
            this.mRequestHeaders = new ArrayList();
            if (scoped != null) {
                scoped.close();
            }
        } catch (Throwable th) {
            if (scoped != null) {
                try {
                    scoped.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    @Override // java.net.URLConnection
    public void connect() throws IOException {
        getOutputStream();
        startRequest();
    }

    @Override // java.net.HttpURLConnection
    public void disconnect() {
        if (this.connected) {
            this.mRequest.cancel();
        }
    }

    @Override // java.net.HttpURLConnection
    public String getResponseMessage() throws IOException {
        getResponse();
        return this.mResponseInfo.getHttpStatusText();
    }

    @Override // java.net.HttpURLConnection
    public int getResponseCode() throws IOException {
        getResponse();
        return this.mResponseInfo.getHttpStatusCode();
    }

    @Override // java.net.URLConnection
    public Map<String, List<String>> getHeaderFields() {
        try {
            getResponse();
            return getAllHeaders();
        } catch (IOException unused) {
            return Collections.EMPTY_MAP;
        }
    }

    @Override // java.net.URLConnection
    public final String getHeaderField(String fieldName) {
        try {
            getResponse();
            Map<String, List<String>> allHeaders = getAllHeaders();
            if (!allHeaders.containsKey(fieldName)) {
                return null;
            }
            return allHeaders.get(fieldName).get(r4.size() - 1);
        } catch (IOException unused) {
            return null;
        }
    }

    @Override // java.net.HttpURLConnection, java.net.URLConnection
    public final String getHeaderFieldKey(int pos) {
        Map.Entry<String, String> headerFieldEntry = getHeaderFieldEntry(pos);
        if (headerFieldEntry == null) {
            return null;
        }
        return headerFieldEntry.getKey();
    }

    @Override // java.net.HttpURLConnection, java.net.URLConnection
    public final String getHeaderField(int pos) {
        Map.Entry<String, String> headerFieldEntry = getHeaderFieldEntry(pos);
        if (headerFieldEntry == null) {
            return null;
        }
        return headerFieldEntry.getValue();
    }

    @Override // java.net.URLConnection
    public InputStream getInputStream() throws IOException {
        getResponse();
        if (!this.instanceFollowRedirects && this.mOnRedirectCalled) {
            throw new IOException("Cannot read response body of a redirect.");
        }
        if (this.mResponseInfo.getHttpStatusCode() >= 400) {
            throw new FileNotFoundException(this.url.toString());
        }
        return this.mInputStream;
    }

    @Override // java.net.URLConnection
    public OutputStream getOutputStream() throws IOException {
        if (this.mOutputStream == null && this.doOutput) {
            if (this.connected) {
                throw new ProtocolException("Cannot write to OutputStream after receiving response.");
            }
            if (isChunkedUpload()) {
                this.mOutputStream = new CronetChunkedOutputStream(this, this.chunkLength, this.mMessageLoop);
                startRequest();
            } else {
                long streamingModeContentLength = getStreamingModeContentLength();
                if (streamingModeContentLength != -1) {
                    this.mOutputStream = new CronetFixedModeOutputStream(this, streamingModeContentLength, this.mMessageLoop);
                    startRequest();
                } else {
                    String str = TAG;
                    if (Log.isLoggable(str, 3)) {
                        Log.d(str, "Outputstream is being buffered in memory.");
                    }
                    String requestProperty = getRequestProperty("Content-Length");
                    if (requestProperty == null) {
                        this.mOutputStream = new CronetBufferedOutputStream(this);
                    } else {
                        this.mOutputStream = new CronetBufferedOutputStream(this, Long.parseLong(requestProperty));
                    }
                }
            }
        }
        return this.mOutputStream;
    }

    private long getStreamingModeContentLength() {
        return this.fixedContentLengthLong != -1 ? this.fixedContentLengthLong : this.fixedContentLength;
    }

    private void startRequest() throws IOException {
        if (this.connected) {
            return;
        }
        CronetOutputStream cronetOutputStream = this.mOutputStream;
        if (cronetOutputStream == null || cronetOutputStream.connectRequested()) {
            ScopedSysTraceEvent scoped = ScopedSysTraceEvent.scoped("CronetHttpURLConnection#startRequest");
            try {
                ExperimentalUrlRequest.Builder builder = (ExperimentalUrlRequest.Builder) this.mCronetEngine.newUrlRequestBuilder(getURL().toString(), new CronetUrlRequestCallback(), this.mMessageLoop);
                if (this.doOutput) {
                    if (this.method.equals("GET")) {
                        this.method = "POST";
                    }
                    CronetOutputStream cronetOutputStream2 = this.mOutputStream;
                    if (cronetOutputStream2 != null) {
                        builder.setUploadDataProvider(cronetOutputStream2.getUploadDataProvider(), (Executor) this.mMessageLoop);
                        if (getRequestProperty("Content-Length") == null && !isChunkedUpload()) {
                            addRequestProperty("Content-Length", Long.toString(this.mOutputStream.getUploadDataProvider().getLength()));
                        }
                    } else if (getRequestProperty("Content-Length") == null) {
                        addRequestProperty("Content-Length", AppEventsConstants.EVENT_PARAM_VALUE_NO);
                    }
                    if (getRequestProperty("Content-Type") == null) {
                        addRequestProperty("Content-Type", "application/x-www-form-urlencoded");
                    }
                }
                for (Pair<String, String> pair : this.mRequestHeaders) {
                    builder.addHeader((String) pair.first, (String) pair.second);
                }
                if (!getUseCaches()) {
                    builder.disableCache();
                }
                builder.setHttpMethod(this.method);
                if (checkTrafficStatsTag()) {
                    builder.setTrafficStatsTag(this.mTrafficStatsTag);
                }
                if (checkTrafficStatsUid()) {
                    builder.setTrafficStatsUid(this.mTrafficStatsUid);
                }
                ExperimentalUrlRequest build = builder.build();
                this.mRequest = build;
                build.start();
                this.connected = true;
                if (scoped != null) {
                    scoped.close();
                }
            } catch (Throwable th) {
                if (scoped != null) {
                    try {
                        scoped.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        }
    }

    private boolean checkTrafficStatsTag() {
        if (this.mTrafficStatsTagSet) {
            return true;
        }
        int threadStatsTag = TrafficStats.getThreadStatsTag();
        if (threadStatsTag != -1) {
            this.mTrafficStatsTag = threadStatsTag;
            this.mTrafficStatsTagSet = true;
        }
        return this.mTrafficStatsTagSet;
    }

    private boolean checkTrafficStatsUid() {
        int threadStatsUid;
        if (this.mTrafficStatsUidSet) {
            return true;
        }
        if (Build.VERSION.SDK_INT < 28) {
            return false;
        }
        threadStatsUid = TrafficStats.getThreadStatsUid();
        if (threadStatsUid != -1) {
            this.mTrafficStatsUid = threadStatsUid;
            this.mTrafficStatsUidSet = true;
        }
        return this.mTrafficStatsUidSet;
    }

    @Override // java.net.HttpURLConnection
    public InputStream getErrorStream() {
        try {
            getResponse();
            if (this.mResponseInfo.getHttpStatusCode() >= 400) {
                return this.mInputStream;
            }
            return null;
        } catch (IOException unused) {
            return null;
        }
    }

    @Override // java.net.URLConnection
    public final void addRequestProperty(String key, String value) {
        setRequestPropertyInternal(key, value, false);
    }

    @Override // java.net.URLConnection
    public final void setRequestProperty(String key, String value) {
        setRequestPropertyInternal(key, value, true);
    }

    private final void setRequestPropertyInternal(String key, String value, boolean overwrite) {
        if (this.connected) {
            throw new IllegalStateException("Cannot modify request property after connection is made.");
        }
        int findRequestProperty = findRequestProperty(key);
        if (findRequestProperty >= 0) {
            if (overwrite) {
                this.mRequestHeaders.remove(findRequestProperty);
            } else {
                throw new UnsupportedOperationException("Cannot add multiple headers of the same key, " + key + ". crbug.com/432719.");
            }
        }
        this.mRequestHeaders.add(Pair.create(key, value));
    }

    @Override // java.net.URLConnection
    public Map<String, List<String>> getRequestProperties() {
        if (this.connected) {
            throw new IllegalStateException("Cannot access request headers after connection is set.");
        }
        TreeMap treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
        for (Pair<String, String> pair : this.mRequestHeaders) {
            if (treeMap.containsKey(pair.first)) {
                throw new IllegalStateException("Should not have multiple values.");
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add((String) pair.second);
            treeMap.put((String) pair.first, Collections.unmodifiableList(arrayList));
        }
        return Collections.unmodifiableMap(treeMap);
    }

    @Override // java.net.URLConnection
    public String getRequestProperty(String key) {
        int findRequestProperty = findRequestProperty(key);
        if (findRequestProperty >= 0) {
            return (String) this.mRequestHeaders.get(findRequestProperty).second;
        }
        return null;
    }

    @Override // java.net.URLConnection
    public void setConnectTimeout(int timeout) {
        Log.d(TAG, "setConnectTimeout is not supported by CronetHttpURLConnection");
    }

    void getMoreData(ByteBuffer byteBuffer) throws IOException {
        ScopedSysTraceEvent scoped = ScopedSysTraceEvent.scoped("CronetHttpURLConnection#getMoreData");
        try {
            this.mRequest.read(byteBuffer);
            this.mMessageLoop.loop(getReadTimeout());
            if (scoped != null) {
                scoped.close();
            }
        } catch (Throwable th) {
            if (scoped != null) {
                try {
                    scoped.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    public void setTrafficStatsTag(int tag) {
        if (this.connected) {
            throw new IllegalStateException("Cannot modify traffic stats tag after connection is made.");
        }
        this.mTrafficStatsTagSet = true;
        this.mTrafficStatsTag = tag;
    }

    public void setTrafficStatsUid(int uid) {
        if (this.connected) {
            throw new IllegalStateException("Cannot modify traffic stats UID after connection is made.");
        }
        this.mTrafficStatsUidSet = true;
        this.mTrafficStatsUid = uid;
    }

    private int findRequestProperty(String key) {
        for (int i = 0; i < this.mRequestHeaders.size(); i++) {
            if (((String) this.mRequestHeaders.get(i).first).equalsIgnoreCase(key)) {
                return i;
            }
        }
        return -1;
    }

    private class CronetUrlRequestCallback extends UrlRequest.Callback {
        public CronetUrlRequestCallback() {
        }

        @Override // org.chromium.net.UrlRequest.Callback
        public void onResponseStarted(UrlRequest request, UrlResponseInfo info) {
            ScopedSysTraceEvent scoped = ScopedSysTraceEvent.scoped("CronetHttpURLConnection.CronetUrlRequestCallback#onResponseStarted");
            try {
                CronetHttpURLConnection.this.mResponseInfo = info;
                CronetHttpURLConnection.this.mHasResponseHeadersOrCompleted = true;
                CronetHttpURLConnection.this.mMessageLoop.quit();
                if (scoped != null) {
                    scoped.close();
                }
            } catch (Throwable th) {
                if (scoped != null) {
                    try {
                        scoped.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        }

        @Override // org.chromium.net.UrlRequest.Callback
        public void onReadCompleted(UrlRequest request, UrlResponseInfo info, ByteBuffer byteBuffer) {
            ScopedSysTraceEvent scoped = ScopedSysTraceEvent.scoped("CronetHttpURLConnection.CronetUrlRequestCallback#onReadCompleted");
            try {
                CronetHttpURLConnection.this.mResponseInfo = info;
                CronetHttpURLConnection.this.mMessageLoop.quit();
                if (scoped != null) {
                    scoped.close();
                }
            } catch (Throwable th) {
                if (scoped != null) {
                    try {
                        scoped.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        }

        @Override // org.chromium.net.UrlRequest.Callback
        public void onRedirectReceived(UrlRequest request, UrlResponseInfo info, String newLocationUrl) {
            ScopedSysTraceEvent scoped = ScopedSysTraceEvent.scoped("CronetHttpURLConnection.CronetUrlRequestCallback#onRedirectReceived");
            try {
                CronetHttpURLConnection.this.mOnRedirectCalled = true;
                try {
                    URL url = new URL(newLocationUrl);
                    boolean equals = url.getProtocol().equals(CronetHttpURLConnection.this.url.getProtocol());
                    if (CronetHttpURLConnection.this.instanceFollowRedirects) {
                        CronetHttpURLConnection.this.url = url;
                    }
                    if (CronetHttpURLConnection.this.instanceFollowRedirects && equals) {
                        CronetHttpURLConnection.this.mRequest.followRedirect();
                        if (scoped != null) {
                            scoped.close();
                            return;
                        }
                        return;
                    }
                } catch (MalformedURLException unused) {
                }
                CronetHttpURLConnection.this.mResponseInfo = info;
                CronetHttpURLConnection.this.mRequest.cancel();
                setResponseDataCompleted(null);
                if (scoped != null) {
                    scoped.close();
                }
            } catch (Throwable th) {
                if (scoped != null) {
                    try {
                        scoped.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        }

        @Override // org.chromium.net.UrlRequest.Callback
        public void onSucceeded(UrlRequest request, UrlResponseInfo info) {
            ScopedSysTraceEvent scoped = ScopedSysTraceEvent.scoped("CronetHttpURLConnection.CronetUrlRequestCallback#onSucceeded");
            try {
                CronetHttpURLConnection.this.mResponseInfo = info;
                setResponseDataCompleted(null);
                if (scoped != null) {
                    scoped.close();
                }
            } catch (Throwable th) {
                if (scoped != null) {
                    try {
                        scoped.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        }

        @Override // org.chromium.net.UrlRequest.Callback
        public void onFailed(UrlRequest request, UrlResponseInfo info, CronetException exception) {
            ScopedSysTraceEvent scoped = ScopedSysTraceEvent.scoped("CronetHttpURLConnection.CronetUrlRequestCallback#onFailed");
            try {
                if (exception == null) {
                    throw new IllegalStateException("Exception cannot be null in onFailed.");
                }
                CronetHttpURLConnection.this.mResponseInfo = info;
                setResponseDataCompleted(exception);
                if (scoped != null) {
                    scoped.close();
                }
            } catch (Throwable th) {
                if (scoped != null) {
                    try {
                        scoped.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        }

        @Override // org.chromium.net.UrlRequest.Callback
        public void onCanceled(UrlRequest request, UrlResponseInfo info) {
            ScopedSysTraceEvent scoped = ScopedSysTraceEvent.scoped("CronetHttpURLConnection.CronetUrlRequestCallback#onCanceled");
            try {
                CronetHttpURLConnection.this.mResponseInfo = info;
                setResponseDataCompleted(new IOException("disconnect() called"));
                if (scoped != null) {
                    scoped.close();
                }
            } catch (Throwable th) {
                if (scoped != null) {
                    try {
                        scoped.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        }

        private void setResponseDataCompleted(IOException exception) {
            CronetHttpURLConnection.this.mException = exception;
            if (CronetHttpURLConnection.this.mInputStream != null) {
                CronetHttpURLConnection.this.mInputStream.setResponseDataCompleted(exception);
            }
            if (CronetHttpURLConnection.this.mOutputStream != null) {
                CronetHttpURLConnection.this.mOutputStream.setRequestCompleted(exception);
            }
            CronetHttpURLConnection.this.mHasResponseHeadersOrCompleted = true;
            CronetHttpURLConnection.this.mMessageLoop.quit();
        }
    }

    private void getResponse() throws IOException {
        ScopedSysTraceEvent scoped = ScopedSysTraceEvent.scoped("CronetHttpURLConnection#getResponse");
        try {
            CronetOutputStream cronetOutputStream = this.mOutputStream;
            if (cronetOutputStream != null) {
                cronetOutputStream.checkReceivedEnoughContent();
                this.mOutputStream.close();
            }
            if (!this.mHasResponseHeadersOrCompleted) {
                startRequest();
                this.mMessageLoop.loop();
            }
            checkHasResponseHeaders();
            if (scoped != null) {
                scoped.close();
            }
        } catch (Throwable th) {
            if (scoped != null) {
                try {
                    scoped.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    private void checkHasResponseHeaders() throws IOException {
        if (!this.mHasResponseHeadersOrCompleted) {
            throw new IllegalStateException("No response.");
        }
        IOException iOException = this.mException;
        if (iOException != null) {
            throw iOException;
        }
        if (this.mResponseInfo == null) {
            throw new NullPointerException("Response info is null when there is no exception.");
        }
    }

    private Map.Entry<String, String> getHeaderFieldEntry(int pos) {
        try {
            getResponse();
            List<Map.Entry<String, String>> allHeadersAsList = getAllHeadersAsList();
            if (pos >= allHeadersAsList.size()) {
                return null;
            }
            return allHeadersAsList.get(pos);
        } catch (IOException unused) {
            return null;
        }
    }

    private boolean isChunkedUpload() {
        return this.chunkLength > 0;
    }

    private Map<String, List<String>> getAllHeaders() {
        Map<String, List<String>> map = this.mResponseHeadersMap;
        if (map != null) {
            return map;
        }
        TreeMap treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
        for (Map.Entry<String, String> entry : getAllHeadersAsList()) {
            ArrayList arrayList = new ArrayList();
            if (treeMap.containsKey(entry.getKey())) {
                arrayList.addAll((Collection) treeMap.get(entry.getKey()));
            }
            arrayList.add(entry.getValue());
            treeMap.put(entry.getKey(), Collections.unmodifiableList(arrayList));
        }
        Map<String, List<String>> unmodifiableMap = Collections.unmodifiableMap(treeMap);
        this.mResponseHeadersMap = unmodifiableMap;
        return unmodifiableMap;
    }

    private List<Map.Entry<String, String>> getAllHeadersAsList() {
        List<Map.Entry<String, String>> list = this.mResponseHeadersList;
        if (list != null) {
            return list;
        }
        this.mResponseHeadersList = new ArrayList();
        for (Map.Entry<String, String> entry : this.mResponseInfo.getAllHeadersAsList()) {
            if (!entry.getKey().equalsIgnoreCase(HttpHeaders.CONTENT_ENCODING)) {
                this.mResponseHeadersList.add(new AbstractMap.SimpleImmutableEntry(entry));
            }
        }
        List<Map.Entry<String, String>> unmodifiableList = Collections.unmodifiableList(this.mResponseHeadersList);
        this.mResponseHeadersList = unmodifiableList;
        return unmodifiableList;
    }
}
