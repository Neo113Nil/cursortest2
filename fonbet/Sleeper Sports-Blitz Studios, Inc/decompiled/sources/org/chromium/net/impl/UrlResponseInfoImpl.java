package org.chromium.net.impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.atomic.AtomicLong;
import org.chromium.net.UrlResponseInfo;

/* loaded from: classes10.dex */
public final class UrlResponseInfoImpl extends UrlResponseInfo {
    private final HeaderBlockImpl mHeaders;
    private final int mHttpStatusCode;
    private final String mHttpStatusText;
    private final String mNegotiatedProtocol;
    private final String mProxyServer;
    private final AtomicLong mReceivedByteCount;
    private final List<String> mResponseInfoUrlChain;
    private final boolean mWasCached;

    public static final class HeaderBlockImpl extends UrlResponseInfo.HeaderBlock {
        private final List<Map.Entry<String, String>> mAllHeadersList;
        private Map<String, List<String>> mHeadersMap;

        HeaderBlockImpl(List<Map.Entry<String, String>> allHeadersList) {
            this.mAllHeadersList = allHeadersList;
        }

        @Override // org.chromium.net.UrlResponseInfo.HeaderBlock
        public List<Map.Entry<String, String>> getAsList() {
            return this.mAllHeadersList;
        }

        @Override // org.chromium.net.UrlResponseInfo.HeaderBlock
        public Map<String, List<String>> getAsMap() {
            Map<String, List<String>> map = this.mHeadersMap;
            if (map != null) {
                return map;
            }
            TreeMap treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
            for (Map.Entry<String, String> entry : this.mAllHeadersList) {
                ArrayList arrayList = new ArrayList();
                if (treeMap.containsKey(entry.getKey())) {
                    arrayList.addAll((Collection) treeMap.get(entry.getKey()));
                }
                arrayList.add(entry.getValue());
                treeMap.put(entry.getKey(), Collections.unmodifiableList(arrayList));
            }
            Map<String, List<String>> unmodifiableMap = Collections.unmodifiableMap(treeMap);
            this.mHeadersMap = unmodifiableMap;
            return unmodifiableMap;
        }
    }

    public UrlResponseInfoImpl(List<String> urlChain, int httpStatusCode, String httpStatusText, List<Map.Entry<String, String>> allHeadersList, boolean wasCached, String negotiatedProtocol, String proxyServer, long receivedByteCount) {
        this.mResponseInfoUrlChain = Collections.unmodifiableList(urlChain);
        this.mHttpStatusCode = httpStatusCode;
        this.mHttpStatusText = httpStatusText;
        this.mHeaders = new HeaderBlockImpl(Collections.unmodifiableList(allHeadersList));
        this.mWasCached = wasCached;
        this.mNegotiatedProtocol = negotiatedProtocol;
        this.mProxyServer = proxyServer;
        this.mReceivedByteCount = new AtomicLong(receivedByteCount);
    }

    @Deprecated
    public UrlResponseInfoImpl(List<String> urlChain, int httpStatusCode, String httpStatusText, List<Map.Entry<String, String>> allHeadersList, boolean wasCached, String negotiatedProtocol, String proxyServer) {
        this(urlChain, httpStatusCode, httpStatusText, allHeadersList, wasCached, negotiatedProtocol, proxyServer, 0L);
    }

    @Override // org.chromium.net.UrlResponseInfo
    public String getUrl() {
        return this.mResponseInfoUrlChain.get(r0.size() - 1);
    }

    @Override // org.chromium.net.UrlResponseInfo
    public List<String> getUrlChain() {
        return this.mResponseInfoUrlChain;
    }

    @Override // org.chromium.net.UrlResponseInfo
    public int getHttpStatusCode() {
        return this.mHttpStatusCode;
    }

    @Override // org.chromium.net.UrlResponseInfo
    public String getHttpStatusText() {
        return this.mHttpStatusText;
    }

    @Override // org.chromium.net.UrlResponseInfo
    public List<Map.Entry<String, String>> getAllHeadersAsList() {
        return this.mHeaders.getAsList();
    }

    @Override // org.chromium.net.UrlResponseInfo
    public Map<String, List<String>> getAllHeaders() {
        return this.mHeaders.getAsMap();
    }

    @Override // org.chromium.net.UrlResponseInfo
    public boolean wasCached() {
        return this.mWasCached;
    }

    @Override // org.chromium.net.UrlResponseInfo
    public String getNegotiatedProtocol() {
        return this.mNegotiatedProtocol;
    }

    @Override // org.chromium.net.UrlResponseInfo
    public String getProxyServer() {
        return this.mProxyServer;
    }

    @Override // org.chromium.net.UrlResponseInfo
    public long getReceivedByteCount() {
        return this.mReceivedByteCount.get();
    }

    public String toString() {
        return String.format(Locale.ROOT, "UrlResponseInfo@[%s][%s]: urlChain = %s, httpStatus = %d %s, headers = %s, wasCached = %b, negotiatedProtocol = %s, proxyServer= %s, receivedByteCount = %d", Integer.toHexString(System.identityHashCode(this)), getUrl(), getUrlChain().toString(), Integer.valueOf(getHttpStatusCode()), getHttpStatusText(), getAllHeadersAsList().toString(), Boolean.valueOf(wasCached()), getNegotiatedProtocol(), getProxyServer(), Long.valueOf(getReceivedByteCount()));
    }

    public void setReceivedByteCount(long currentReceivedByteCount) {
        this.mReceivedByteCount.set(currentReceivedByteCount);
    }
}
