package com.mbridge.msdk.click;

import android.text.TextUtils;
import android.webkit.URLUtil;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import com.ironsource.C4094gc;
import com.mbridge.msdk.foundation.download.Command;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.same.net.MBridgeHostnameVerifier;
import com.mbridge.msdk.foundation.tools.m0;
import com.mbridge.msdk.foundation.tools.q0;
import defpackage.w1l;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.zip.GZIPInputStream;
import javax.net.ssl.HttpsURLConnection;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public class i {
    private static final String f = "i";
    private com.mbridge.msdk.setting.g a;
    private String b;
    private boolean c = true;
    private final int d = 3145728;
    private com.mbridge.msdk.click.entity.a e;

    public i() {
        com.mbridge.msdk.setting.g e = w1l.e(com.mbridge.msdk.setting.i.b());
        this.a = e;
        if (e == null) {
            this.a = com.mbridge.msdk.setting.i.b().a();
        }
    }

    public com.mbridge.msdk.click.entity.a a(String str, boolean z, boolean z2, CampaignEx campaignEx) {
        HttpsURLConnection httpsURLConnection;
        int i;
        HttpsURLConnection httpsURLConnection2 = null;
        if (!URLUtil.isNetworkUrl(str)) {
            return null;
        }
        String replace = str.replace(" ", "%20");
        this.e = new com.mbridge.msdk.click.entity.a();
        try {
            httpsURLConnection = (HttpsURLConnection) ((URLConnection) FirebasePerfUrlConnection.instrument(new URL(replace).openConnection()));
        } catch (Throwable th) {
            th = th;
        }
        try {
            httpsURLConnection.setHostnameVerifier(new MBridgeHostnameVerifier(replace));
            httpsURLConnection.setRequestMethod(C4094gc.a);
            if ((!z && !z2) || campaignEx == null) {
                httpsURLConnection.setRequestProperty(Command.HTTP_HEADER_USER_AGENT, m0.i());
            }
            if (z && campaignEx != null && campaignEx.getcUA() == 1) {
                httpsURLConnection.setRequestProperty(Command.HTTP_HEADER_USER_AGENT, m0.i());
            }
            if (z2 && campaignEx != null && campaignEx.getImpUA() == 1) {
                httpsURLConnection.setRequestProperty(Command.HTTP_HEADER_USER_AGENT, m0.i());
            }
            httpsURLConnection.setRequestProperty("Accept-Encoding", "gzip");
            if (this.a.O0() && !TextUtils.isEmpty(this.b)) {
                httpsURLConnection.setRequestProperty("referer", this.b);
            }
            httpsURLConnection.setConnectTimeout(60000);
            httpsURLConnection.setReadTimeout(60000);
            httpsURLConnection.setInstanceFollowRedirects(false);
            httpsURLConnection.connect();
            this.e.a = httpsURLConnection.getHeaderField("Location");
            this.e.d = httpsURLConnection.getHeaderField("Referer");
            this.e.f = httpsURLConnection.getResponseCode();
            this.e.b = httpsURLConnection.getContentType();
            this.e.e = httpsURLConnection.getContentLength();
            this.e.c = httpsURLConnection.getContentEncoding();
            boolean equalsIgnoreCase = "gzip".equalsIgnoreCase(this.e.c);
            com.mbridge.msdk.click.entity.a aVar = this.e;
            if (aVar.f == 200 && this.c && (i = aVar.e) > 0 && i < 3145728 && !TextUtils.isEmpty(replace)) {
                try {
                    String a = a(httpsURLConnection.getInputStream(), equalsIgnoreCase);
                    if (!TextUtils.isEmpty(a)) {
                        byte[] bytes = a.getBytes();
                        if (bytes.length > 0 && bytes.length < 3145728) {
                            this.e.g = a.trim();
                        }
                    }
                } catch (Throwable th2) {
                    q0.b(f, th2.getMessage());
                }
            }
            this.b = replace;
            httpsURLConnection.disconnect();
            return this.e;
        } catch (Throwable th3) {
            th = th3;
            httpsURLConnection2 = httpsURLConnection;
            try {
                this.e.h = th.getMessage();
                return this.e;
            } finally {
                if (httpsURLConnection2 != null) {
                    httpsURLConnection2.disconnect();
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0036 A[Catch: all -> 0x000f, TryCatch #5 {all -> 0x000f, blocks: (B:41:0x0008, B:4:0x0013, B:8:0x0032, B:10:0x0036, B:11:0x0043), top: B:40:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x004e A[Catch: Exception -> 0x002f, TRY_ENTER, TRY_LEAVE, TryCatch #0 {Exception -> 0x002f, blocks: (B:35:0x002b, B:13:0x004e), top: B:2:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0063 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private String a(InputStream inputStream, boolean z) {
        BufferedReader bufferedReader;
        Throwable th;
        Exception e;
        StringBuilder sb = new StringBuilder();
        BufferedReader bufferedReader2 = null;
        try {
            if (z) {
                try {
                    try {
                        inputStream = new GZIPInputStream(inputStream);
                    } catch (Exception e2) {
                        e = e2;
                        if (this.e == null) {
                            com.mbridge.msdk.click.entity.a aVar = new com.mbridge.msdk.click.entity.a();
                            this.e = aVar;
                            aVar.h = e.getMessage();
                        }
                        q0.b(f, e.getMessage());
                        if (bufferedReader2 != null) {
                            bufferedReader2.close();
                        }
                        return sb.toString();
                    }
                } catch (Throwable th2) {
                    th = th2;
                    bufferedReader = bufferedReader2;
                    if (bufferedReader != null) {
                        try {
                            bufferedReader.close();
                        } catch (Exception e3) {
                            q0.b(f, e3.getMessage());
                        }
                    }
                    throw th;
                }
            }
            bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
            while (true) {
                try {
                    String readLine = bufferedReader.readLine();
                    if (readLine == null) {
                        break;
                    }
                    sb.append(readLine);
                } catch (Exception e4) {
                    e = e4;
                    bufferedReader2 = bufferedReader;
                    if (this.e == null) {
                    }
                    q0.b(f, e.getMessage());
                    if (bufferedReader2 != null) {
                    }
                    return sb.toString();
                } catch (Throwable th3) {
                    th = th3;
                    if (bufferedReader != null) {
                    }
                    throw th;
                }
            }
            bufferedReader.close();
        } catch (Exception e5) {
            q0.b(f, e5.getMessage());
        }
        return sb.toString();
    }
}
