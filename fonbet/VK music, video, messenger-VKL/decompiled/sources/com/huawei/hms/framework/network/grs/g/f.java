package com.huawei.hms.framework.network.grs.g;

import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import com.huawei.hms.framework.common.IoUtils;
import com.huawei.hms.framework.common.Logger;
import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import javax.net.ssl.HttpsURLConnection;

/* loaded from: classes13.dex */
public class f extends a implements Callable<d> {
    private static final String i = "f";

    public f(String str, int i2, c cVar, Context context, String str2, GrsBaseInfo grsBaseInfo, com.huawei.hms.framework.network.grs.e.c cVar2) {
        super(str, i2, cVar, context, str2, grsBaseInfo, cVar2);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    /* JADX WARN: Not initialized variable reg: 10, insn: 0x0044: MOVE (r7 I:??[OBJECT, ARRAY]) = (r10 I:??[OBJECT, ARRAY]), block:B:69:0x0044 */
    /* JADX WARN: Removed duplicated region for block: B:40:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x014d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // java.util.concurrent.Callable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public d call() {
        HttpsURLConnection httpsURLConnection;
        long j;
        HttpURLConnection httpURLConnection;
        long currentTimeMillis;
        long elapsedRealtime;
        String str = i;
        Logger.i(str, "Post call execute");
        long j2 = 0;
        HttpURLConnection httpURLConnection2 = null;
        InputStream inputStream = null;
        byte[] bArr = null;
        try {
            try {
                try {
                    elapsedRealtime = SystemClock.elapsedRealtime();
                    try {
                        j2 = System.currentTimeMillis();
                        httpsURLConnection = com.huawei.hms.framework.network.grs.h.f.a.a(c(), a(), e());
                    } catch (IOException e) {
                        e = e;
                        httpsURLConnection = null;
                    }
                } catch (Throwable th) {
                    th = th;
                    httpURLConnection2 = httpURLConnection;
                    if (httpURLConnection2 != null) {
                        try {
                            httpURLConnection2.disconnect();
                        } catch (RuntimeException unused) {
                            Logger.w(i, "RequestCallableV2 disconnect HttpsURLConnection catch RuntimeException");
                        } catch (Throwable unused2) {
                            Logger.w(i, "RequestCallableV2 disconnect HttpsURLConnection catch Throwable");
                        }
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                if (httpURLConnection2 != null) {
                }
                throw th;
            }
        } catch (IOException e2) {
            e = e2;
            httpsURLConnection = null;
            j = 0;
        }
        try {
        } catch (IOException e3) {
            e = e3;
            j = j2;
            j2 = elapsedRealtime;
            long elapsedRealtime2 = SystemClock.elapsedRealtime();
            currentTimeMillis = System.currentTimeMillis();
            Logger.w(i, "RequestCallableV2 run task catch IOException", e);
            this.a = new d(e, elapsedRealtime2 - j2);
            if (httpsURLConnection != null) {
                try {
                    httpsURLConnection.disconnect();
                } catch (RuntimeException unused3) {
                    j2 = j;
                    Logger.w(i, "RequestCallableV2 disconnect HttpsURLConnection catch RuntimeException");
                    long j3 = currentTimeMillis;
                    this.a.b(c());
                    this.a.a(d());
                    this.a.b(j2);
                    this.a.a(j3);
                    if (b() != null) {
                    }
                    return this.a;
                } catch (Throwable unused4) {
                    j2 = j;
                    Logger.w(i, "RequestCallableV2 disconnect HttpsURLConnection catch Throwable");
                    long j32 = currentTimeMillis;
                    this.a.b(c());
                    this.a.a(d());
                    this.a.b(j2);
                    this.a.a(j32);
                    if (b() != null) {
                    }
                    return this.a;
                }
            }
            j2 = j;
            long j322 = currentTimeMillis;
            this.a.b(c());
            this.a.a(d());
            this.a.b(j2);
            this.a.a(j322);
            if (b() != null) {
            }
            return this.a;
        }
        if (httpsURLConnection == null) {
            Logger.w(str, "create HttpsURLConnection instance by url return null.");
            if (httpsURLConnection != null) {
                try {
                    httpsURLConnection.disconnect();
                    return null;
                } catch (RuntimeException unused5) {
                    Logger.w(i, "RequestCallableV2 disconnect HttpsURLConnection catch RuntimeException");
                } catch (Throwable unused6) {
                    Logger.w(i, "RequestCallableV2 disconnect HttpsURLConnection catch Throwable");
                }
            }
            return null;
        }
        httpsURLConnection.setRequestProperty("Content-Type", "application/json; charset=UTF-8");
        httpsURLConnection.setRequestProperty("Connection", CampaignEx.JSON_NATIVE_VIDEO_CLOSE);
        httpsURLConnection.setRequestMethod("POST");
        httpsURLConnection.setDoOutput(true);
        httpsURLConnection.setDoInput(true);
        String a = b() != null ? b().a() : "";
        if (TextUtils.isEmpty(a)) {
            a = "&";
        }
        httpsURLConnection.setRequestProperty("If-None-Match", a);
        httpsURLConnection.connect();
        com.huawei.hms.framework.network.grs.h.f.a.a(httpsURLConnection, f().a("services", ""));
        int responseCode = httpsURLConnection.getResponseCode();
        Logger.i(str, "httpsURLConnection result code:" + responseCode);
        if (responseCode == 200) {
            try {
                inputStream = httpsURLConnection.getInputStream();
                byte[] byteArray = IoUtils.toByteArray(inputStream);
                IoUtils.closeSecure(inputStream);
                bArr = byteArray;
            } catch (Throwable th3) {
                IoUtils.closeSecure(inputStream);
                throw th3;
            }
        }
        Map<String, List<String>> headerFields = httpsURLConnection.getHeaderFields();
        httpsURLConnection.disconnect();
        long elapsedRealtime3 = SystemClock.elapsedRealtime();
        currentTimeMillis = System.currentTimeMillis();
        if (bArr == null) {
            bArr = new byte[0];
        }
        this.a = new d(responseCode, headerFields, bArr, elapsedRealtime3 - elapsedRealtime);
        try {
            httpsURLConnection.disconnect();
        } catch (RuntimeException unused7) {
            Logger.w(i, "RequestCallableV2 disconnect HttpsURLConnection catch RuntimeException");
            long j3222 = currentTimeMillis;
            this.a.b(c());
            this.a.a(d());
            this.a.b(j2);
            this.a.a(j3222);
            if (b() != null) {
            }
            return this.a;
        } catch (Throwable unused8) {
            Logger.w(i, "RequestCallableV2 disconnect HttpsURLConnection catch Throwable");
            long j32222 = currentTimeMillis;
            this.a.b(c());
            this.a.a(d());
            this.a.b(j2);
            this.a.a(j32222);
            if (b() != null) {
            }
            return this.a;
        }
        long j322222 = currentTimeMillis;
        this.a.b(c());
        this.a.a(d());
        this.a.b(j2);
        this.a.a(j322222);
        if (b() != null) {
            b().a(this.a);
        }
        return this.a;
    }
}
