package com.vk.push.core.network.http;

import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import javax.net.ssl.HttpsURLConnection;

/* compiled from: HttpOpenConnection.kt */
/* loaded from: classes.dex */
public interface HttpOpenConnectionDelegate {

    /* compiled from: HttpOpenConnection.kt */
    public static final class Https implements HttpOpenConnectionDelegate {
        @Override // com.vk.push.core.network.http.HttpOpenConnectionDelegate
        public HttpURLConnection invoke(URL url) {
            URLConnection openConnection = url.openConnection();
            if (openConnection instanceof HttpsURLConnection) {
                return (HttpsURLConnection) openConnection;
            }
            return null;
        }
    }

    /* compiled from: HttpOpenConnection.kt */
    /* loaded from: classes5.dex */
    public static final class Unsafe implements HttpOpenConnectionDelegate {
        @Override // com.vk.push.core.network.http.HttpOpenConnectionDelegate
        public HttpURLConnection invoke(URL url) {
            URLConnection openConnection = url.openConnection();
            if (openConnection instanceof HttpURLConnection) {
                return (HttpURLConnection) openConnection;
            }
            return null;
        }
    }

    HttpURLConnection invoke(URL url);
}
