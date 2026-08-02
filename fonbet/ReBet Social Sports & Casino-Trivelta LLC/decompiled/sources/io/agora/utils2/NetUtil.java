package io.agora.utils2;

import android.text.TextUtils;
import android.util.Log;
import io.agora.base.internal.CalledByNative;
import io.agora.utils2.internal.Logging;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URL;
import java.net.URLDecoder;

/* loaded from: classes3.dex */
public class NetUtil {
    private static final String TAG = "NetUtil";

    public static boolean checkUrlEncoded(String str) {
        try {
            return !TextUtils.equals(str, URLDecoder.decode(str, "UTF-8"));
        } catch (Exception e10) {
            Log.e(TAG, "checkUrlEncoded failed: ", e10);
            return false;
        }
    }

    public static String encodeUrl(String str) {
        Logging.d(TAG, "encodedUrl()");
        try {
            URL url = new URL(str);
            return new URI(url.getProtocol(), url.getUserInfo(), url.getHost(), url.getPort(), url.getPath(), url.getQuery(), url.getRef()).toASCIIString();
        } catch (Exception e10) {
            Log.e(TAG, "encodeUrl failed: ", e10);
            return str;
        }
    }

    @CalledByNative
    public static String getDecodedUrl(String str) {
        try {
            return URLDecoder.decode(str, "UTF-8");
        } catch (Exception e10) {
            Log.e(TAG, "getDecodedUrl failed: ", e10);
            return str;
        }
    }

    @CalledByNative
    public static String getEncodedUrl(String str) {
        return checkUrlEncoded(str) ? str : encodeUrl(str);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x004f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean testNetworkUrlAvailable(String str) {
        Throwable th2;
        HttpURLConnection httpURLConnection;
        Exception e10;
        Logging.d(TAG, "testNetworkUrlAvailable encodedUrl");
        try {
            httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
            try {
                try {
                    httpURLConnection.setConnectTimeout(1000);
                    httpURLConnection.setReadTimeout(1000);
                    r1 = httpURLConnection.getResponseCode() != 404;
                    InputStream inputStream = httpURLConnection.getInputStream();
                    if (inputStream != null) {
                        inputStream.close();
                    }
                    httpURLConnection.disconnect();
                    return r1;
                } catch (Exception e11) {
                    e10 = e11;
                    Log.e(TAG, "testNetworkUrlAvailable failed: ", e10);
                    if (httpURLConnection != null) {
                        httpURLConnection.disconnect();
                    }
                    return r1;
                }
            } catch (Throwable th3) {
                th2 = th3;
                if (httpURLConnection != null) {
                    httpURLConnection.disconnect();
                }
                throw th2;
            }
        } catch (Exception e12) {
            e10 = e12;
            httpURLConnection = null;
        } catch (Throwable th4) {
            th2 = th4;
            httpURLConnection = null;
            if (httpURLConnection != null) {
            }
            throw th2;
        }
    }
}
