package com.nimbusds.jose.util;

import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.Proxy;
import java.net.URL;
import java.net.URLConnection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSocketFactory;
import net.jcip.annotations.ThreadSafe;

@ThreadSafe
/* loaded from: classes8.dex */
public class DefaultResourceRetriever extends AbstractRestrictedResourceRetriever implements RestrictedResourceRetriever {
    private boolean disconnectAfterUse;
    private Proxy proxy;
    private final SSLSocketFactory sslSocketFactory;

    public DefaultResourceRetriever() {
        this(0, 0);
    }

    public DefaultResourceRetriever(int i, int i2) {
        this(i, i2, 0);
    }

    public DefaultResourceRetriever(int i, int i2, int i3) {
        this(i, i2, i3, true);
    }

    public DefaultResourceRetriever(int i, int i2, int i3, boolean z) {
        this(i, i2, i3, z, null);
    }

    public DefaultResourceRetriever(int i, int i2, int i3, boolean z, SSLSocketFactory sSLSocketFactory) {
        super(i, i2, i3);
        this.disconnectAfterUse = z;
        this.sslSocketFactory = sSLSocketFactory;
    }

    public boolean disconnectsAfterUse() {
        return this.disconnectAfterUse;
    }

    public void setDisconnectsAfterUse(boolean z) {
        this.disconnectAfterUse = z;
    }

    public Proxy getProxy() {
        return this.proxy;
    }

    public void setProxy(Proxy proxy) {
        this.proxy = proxy;
    }

    @Override // com.nimbusds.jose.util.ResourceRetriever
    public Resource retrieveResource(URL url) throws IOException {
        URLConnection openConnection;
        SSLSocketFactory sSLSocketFactory;
        URLConnection uRLConnection = null;
        try {
            try {
                if ("file".equals(url.getProtocol())) {
                    openConnection = openFileConnection(url);
                } else {
                    openConnection = openConnection(url);
                }
            } catch (Exception e) {
                e = e;
            }
        } catch (Throwable th) {
            th = th;
        }
        try {
            openConnection.setConnectTimeout(getConnectTimeout());
            openConnection.setReadTimeout(getReadTimeout());
            if ((openConnection instanceof HttpsURLConnection) && (sSLSocketFactory = this.sslSocketFactory) != null) {
                ((HttpsURLConnection) openConnection).setSSLSocketFactory(sSLSocketFactory);
            }
            if ((openConnection instanceof HttpURLConnection) && getHeaders() != null && !getHeaders().isEmpty()) {
                for (Map.Entry<String, List<String>> entry : getHeaders().entrySet()) {
                    Iterator<String> it = entry.getValue().iterator();
                    while (it.hasNext()) {
                        openConnection.addRequestProperty(entry.getKey(), it.next());
                    }
                }
            }
            InputStream inputStream = getInputStream(openConnection, getSizeLimit());
            try {
                String readInputStreamToString = IOUtils.readInputStreamToString(inputStream, StandardCharset.UTF_8);
                if (inputStream != null) {
                    inputStream.close();
                }
                if (openConnection instanceof HttpURLConnection) {
                    HttpURLConnection httpURLConnection = (HttpURLConnection) openConnection;
                    int responseCode = httpURLConnection.getResponseCode();
                    String responseMessage = httpURLConnection.getResponseMessage();
                    if (responseCode > 299 || responseCode < 200) {
                        throw new IOException("HTTP " + responseCode + ": " + responseMessage);
                    }
                }
                Resource resource = new Resource(readInputStreamToString, openConnection instanceof HttpURLConnection ? openConnection.getContentType() : null);
                if (this.disconnectAfterUse && (openConnection instanceof HttpURLConnection)) {
                    ((HttpURLConnection) openConnection).disconnect();
                }
                return resource;
            } catch (Throwable th2) {
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                }
                throw th2;
            }
        } catch (Exception e2) {
            e = e2;
            if (e instanceof IOException) {
                throw e;
            }
            throw new IOException("Couldn't open URL connection: " + e.getMessage(), e);
        } catch (Throwable th4) {
            uRLConnection = openConnection;
            th = th4;
            if (this.disconnectAfterUse && (uRLConnection instanceof HttpURLConnection)) {
                ((HttpURLConnection) uRLConnection).disconnect();
            }
            throw th;
        }
    }

    @Deprecated
    protected HttpURLConnection openConnection(URL url) throws IOException {
        return openHTTPConnection(url);
    }

    protected HttpURLConnection openHTTPConnection(URL url) throws IOException {
        Proxy proxy = this.proxy;
        if (proxy != null) {
            return (HttpURLConnection) url.openConnection(proxy);
        }
        return (HttpURLConnection) url.openConnection();
    }

    protected URLConnection openFileConnection(URL url) throws IOException {
        return url.openConnection();
    }

    private InputStream getInputStream(URLConnection uRLConnection, int i) throws IOException {
        InputStream inputStream = uRLConnection.getInputStream();
        return i > 0 ? new BoundedInputStream(inputStream, getSizeLimit()) : inputStream;
    }
}
