package com.mbridge.msdk.foundation.same.net;

import android.text.TextUtils;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.system.NoProGuard;
import java.net.URL;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSession;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public class MBridgeHostnameVerifier implements HostnameVerifier, NoProGuard {
    private String hostName;

    public MBridgeHostnameVerifier(String str) {
        if (TextUtils.isEmpty(str)) {
            this.hostName = "";
            return;
        }
        try {
            this.hostName = new URL(str).getHost();
        } catch (Exception unused) {
            this.hostName = "";
        }
    }

    @Override // javax.net.ssl.HostnameVerifier
    public boolean verify(String str, SSLSession sSLSession) {
        if (!TextUtils.isEmpty(str) && TextUtils.equals(str, this.hostName)) {
            return true;
        }
        try {
            HostnameVerifier defaultHostnameVerifier = HttpsURLConnection.getDefaultHostnameVerifier();
            if (defaultHostnameVerifier == null || (defaultHostnameVerifier instanceof MBridgeHostnameVerifier)) {
                return false;
            }
            return defaultHostnameVerifier.verify(str, sSLSession);
        } catch (Exception e) {
            q0.b("MBridgeHostnameVerifier", "verify failed " + e.getLocalizedMessage());
            return false;
        }
    }

    public MBridgeHostnameVerifier(URL url) {
        this.hostName = url == null ? "" : url.getHost();
    }
}
