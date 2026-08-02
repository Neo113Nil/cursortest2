package com.twilio.voice;

import android.net.TrafficStats;
import java.net.URL;
import javax.net.ssl.HttpsURLConnection;

/* loaded from: classes4.dex */
class VoiceURLConnection {
    static final int CONNECTION_TIMEOUT = 10000;
    private static final String HEADER_ACCEPT_KEY = "Accept";
    private static final String HEADER_CONTENT_TYPE_KEY = "Content-Type";
    private static final String HEADER_CONTENT_TYPE_VALUE = "application/json";
    private static final String HEADER_TWILIO_TOKEN_KEY = "X-Twilio-Token";
    static final int HTTP_TOO_MANY_REQUEST = 429;
    static final int HTTP_UPGRADE_REQUIRED = 426;
    public static final String METHOD_TYPE_DELETE = "DELETE";
    public static final String METHOD_TYPE_POST = "POST";
    static final int SOCKET_READ_TIMEOUT = 10000;
    private static final int VOICE_URL_CONNECTION_THREAD_ID = 1000;
    private static final Logger logger = Logger.getLogger(VoiceURLConnection.class);

    private VoiceURLConnection() {
    }

    public static HttpsURLConnection create(String str, String str2, String str3) {
        TrafficStats.setThreadStatsTag(1000);
        HttpsURLConnection httpsURLConnection = (HttpsURLConnection) new URL(str2).openConnection();
        if (str3.equals(METHOD_TYPE_DELETE)) {
            httpsURLConnection.setDoOutput(false);
        } else {
            httpsURLConnection.setDoOutput(true);
        }
        httpsURLConnection.setDoInput(true);
        httpsURLConnection.setRequestProperty(HEADER_CONTENT_TYPE_KEY, "application/json");
        httpsURLConnection.setRequestProperty("Accept", "application/json");
        httpsURLConnection.setRequestProperty(HEADER_TWILIO_TOKEN_KEY, str);
        httpsURLConnection.setConnectTimeout(10000);
        httpsURLConnection.setReadTimeout(10000);
        httpsURLConnection.setRequestMethod(str3);
        return httpsURLConnection;
    }

    public static void release(HttpsURLConnection httpsURLConnection) {
        if (httpsURLConnection != null) {
            try {
                httpsURLConnection.getInputStream().close();
            } catch (Exception unused) {
            }
            try {
                httpsURLConnection.getOutputStream().close();
            } catch (Exception unused2) {
            }
            try {
                httpsURLConnection.getErrorStream().close();
            } catch (Exception unused3) {
            }
            httpsURLConnection.disconnect();
        }
    }
}
