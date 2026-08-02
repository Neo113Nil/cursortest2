package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.ads.interactivemedia.v3.impl.JavaScriptMessage$MsgChannel;
import com.google.ads.interactivemedia.v3.impl.JavaScriptMessage$MsgType;
import com.google.ads.interactivemedia.v3.impl.data.GsonAdsRequest;
import com.google.ads.interactivemedia.v3.impl.data.IdentifierInfo;
import com.google.ads.interactivemedia.v3.impl.data.InstrumentationData;
import com.google.ads.interactivemedia.v3.impl.data.MarketAppInfo;
import com.google.ads.interactivemedia.v3.impl.data.VideoEnvironmentData;
import com.google.ads.interactivemedia.v3.impl.data.WebViewInitData;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbxt;
import com.google.android.gms.internal.ads.zzcgo;
import com.google.android.gms.internal.ads.zzesx;
import com.google.android.gms.internal.ads.zzfco;
import com.google.android.gms.measurement.internal.zzal;
import com.google.android.gms.measurement.internal.zzgs;
import com.google.android.gms.measurement.internal.zzgu;
import com.google.android.gms.measurement.internal.zzgz;
import com.google.android.gms.measurement.internal.zzhz;
import com.google.android.gms.measurement.internal.zzic;
import com.google.android.gms.measurement.internal.zzlo;
import com.google.android.gms.measurement.internal.zzpg;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ExecutionException;
import java.util.zip.GZIPOutputStream;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final /* synthetic */ class ugn implements Runnable {
    public final /* synthetic */ int a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final /* synthetic */ Object f;
    public final Object g;

    public ugn(zzgz zzgzVar, String str, URL url, byte[] bArr, Map map, who whoVar) {
        this.a = 2;
        Objects.requireNonNull(zzgzVar);
        this.f = zzgzVar;
        Preconditions.f(str);
        Preconditions.i(url);
        this.b = url;
        this.c = bArr;
        this.d = whoVar;
        this.g = str;
        this.e = map;
    }

    public void a(int i, IOException iOException, byte[] bArr, Map map) {
        zzhz zzhzVar = ((zzic) ((zzlo) this.f).b).g;
        zzic.m(zzhzVar);
        zzhzVar.Z(new hk0(this, i, iOException, bArr, map));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:129:0x030e  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x02f9 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:141:0x02dd  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x02c8 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:240:0x0420  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x0496  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x0423  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x016b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0148 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v46, types: [com.google.android.gms.measurement.internal.zzpk, p0p] */
    /* JADX WARN: Type inference failed for: r13v12, types: [java.lang.Integer, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v9, types: [byte[]] */
    /* JADX WARN: Type inference failed for: r6v23 */
    /* JADX WARN: Type inference failed for: r6v24 */
    /* JADX WARN: Type inference failed for: r6v25 */
    /* JADX WARN: Type inference failed for: r6v26 */
    /* JADX WARN: Type inference failed for: r6v27 */
    /* JADX WARN: Type inference failed for: r6v28 */
    /* JADX WARN: Type inference failed for: r8v26, types: [com.google.android.gms.measurement.internal.zzgs] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        ConnectivityManager connectivityManager;
        NetworkCapabilities networkCapabilities;
        MarketAppInfo marketAppInfo;
        ActivityInfo activityInfo;
        PackageInfo packageInfo;
        String str;
        who whoVar;
        Throwable th;
        int i;
        OutputStream outputStream;
        Map map;
        HttpURLConnection httpURLConnection;
        IOException iOException;
        HttpURLConnection httpURLConnection2;
        Map map2;
        OutputStream outputStream2;
        Map map3;
        Map map4;
        Map map5;
        InputStream inputStream;
        Throwable th2;
        OutputStream outputStream3;
        HttpURLConnection httpURLConnection3;
        Map map6;
        IOException iOException2;
        HttpURLConnection httpURLConnection4;
        Map map7;
        ?? r6;
        ?? r62;
        int responseCode;
        InputStream inputStream2;
        int i2 = this.a;
        Object obj = this.d;
        Object obj2 = this.c;
        Object obj3 = this.e;
        Object obj4 = this.b;
        Object obj5 = this.f;
        int i3 = 0;
        Object obj6 = this.g;
        switch (i2) {
            case 0:
                zin zinVar = (zin) obj4;
                o7p o7pVar = (o7p) obj2;
                sf sfVar = (sf) obj;
                gl glVar = (gl) obj3;
                WebViewInitData webViewInitData = (WebViewInitData) obj5;
                String str2 = (String) obj6;
                t6o t6oVar = zinVar.d;
                Context context = zinVar.a;
                try {
                    pkn pknVar = (pkn) mha.J(o7pVar);
                    p4o p4oVar = zinVar.p;
                    p4oVar.getClass();
                    HashMap b = p4oVar.b();
                    b2p b2pVar = pknVar.a;
                    String n = fc6.n("android", Build.VERSION.RELEASE, ":3.39.0:", context.getPackageName());
                    q3p q3pVar = pknVar.c;
                    Map map8 = (Map) pknVar.d.i();
                    Integer valueOf = (context.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") != 0 || (connectivityManager = (ConnectivityManager) context.getSystemService("connectivity")) == null || (networkCapabilities = connectivityManager.getNetworkCapabilities(connectivityManager.getActiveNetwork())) == null) ? null : Integer.valueOf(networkCapabilities.getLinkDownstreamBandwidthKbps());
                    zinVar.h.getClass();
                    VideoEnvironmentData create = valueOf == null ? null : VideoEnvironmentData.create(valueOf, false);
                    bqn bqnVar = zinVar.h;
                    PackageManager packageManager = context.getPackageManager();
                    ResolveInfo resolveActivity = packageManager.resolveActivity(new Intent("android.intent.action.VIEW", Uri.parse("market://details?id=com.google.ads.interactivemedia.v3")), C.DEFAULT_BUFFER_SEGMENT_SIZE);
                    if (resolveActivity != null && (activityInfo = resolveActivity.activityInfo) != null) {
                        try {
                            packageInfo = packageManager.getPackageInfo(activityInfo.packageName, 0);
                        } catch (PackageManager.NameNotFoundException unused) {
                        }
                        if (packageInfo != null) {
                            marketAppInfo = MarketAppInfo.create(packageInfo.versionCode, activityInfo.packageName);
                            GsonAdsRequest create2 = GsonAdsRequest.create(glVar, n, b, q3pVar, map8, "android:0", create, bqnVar, marketAppInfo, y9.u(context, null), y9.v(context), pknVar.b, (IdentifierInfo) b2pVar.i(), sfVar, webViewInitData.omidInitializer.c == null, context.getResources().getDisplayMetrics().density);
                            boolean z = !b2pVar.d() && ((IdentifierInfo) b2pVar.g()).isLimitedAdTracking();
                            b2p l = b2p.l(webViewInitData.initData.enableGks());
                            mqn mqnVar = zinVar.c;
                            mqnVar.c(str2, JavaScriptMessage$MsgChannel.nativeXhr, new exn(context, l, z, mqnVar, zinVar.n));
                            mqnVar.d(new lda(JavaScriptMessage$MsgChannel.adsLoader, JavaScriptMessage$MsgType.requestAds, str2, create2, null));
                            pen s = qen.s();
                            s.g(System.currentTimeMillis());
                            if (glVar.h.d()) {
                                s.f(((Long) glVar.h.g()).longValue());
                            }
                            sen b2 = t6oVar.b(str2);
                            b2.b();
                            ((uen) b2.b).E((qen) s.c());
                            return;
                        }
                    }
                    marketAppInfo = null;
                    GsonAdsRequest create22 = GsonAdsRequest.create(glVar, n, b, q3pVar, map8, "android:0", create, bqnVar, marketAppInfo, y9.u(context, null), y9.v(context), pknVar.b, (IdentifierInfo) b2pVar.i(), sfVar, webViewInitData.omidInitializer.c == null, context.getResources().getDisplayMetrics().density);
                    if (b2pVar.d()) {
                    }
                    b2p l2 = b2p.l(webViewInitData.initData.enableGks());
                    mqn mqnVar2 = zinVar.c;
                    mqnVar2.c(str2, JavaScriptMessage$MsgChannel.nativeXhr, new exn(context, l2, z, mqnVar2, zinVar.n));
                    mqnVar2.d(new lda(JavaScriptMessage$MsgChannel.adsLoader, JavaScriptMessage$MsgType.requestAds, str2, create22, null));
                    pen s2 = qen.s();
                    s2.g(System.currentTimeMillis());
                    if (glVar.h.d()) {
                    }
                    sen b22 = t6oVar.b(str2);
                    b22.b();
                    ((uen) b22.b).E((qen) s2.c());
                    return;
                } catch (ExecutionException e) {
                    zinVar.f.v(new zjo(new tf(1, 1, "The SDK failed to gather the necessary information for the request.", null), new Object()));
                    t6oVar.d(InstrumentationData.Component.ADS_LOADER, InstrumentationData.Method.COLLECT_SIGNALS, e);
                    return;
                }
            case 1:
                zzfco zzfcoVar = (zzfco) obj4;
                zzcgo zzcgoVar = (zzcgo) obj6;
                try {
                    ((zzbxt) obj2).r1(new ObjectWrapper(zzfcoVar.d), zzfcoVar.i, (Bundle) obj, (Bundle) ((List) obj3).get(0), zzfcoVar.e.f, (zzesx) obj5);
                    return;
                } catch (RemoteException e2) {
                    zzcgoVar.zzd(e2);
                    return;
                }
            case 2:
                who whoVar2 = (who) obj;
                String str3 = (String) obj6;
                zzgz zzgzVar = (zzgz) obj5;
                zzic zzicVar = (zzic) zzgzVar.b;
                zzic zzicVar2 = (zzic) zzgzVar.b;
                zzhz zzhzVar = zzicVar.g;
                zzic.m(zzhzVar);
                zzhzVar.U();
                try {
                    URLConnection openConnection = ((URL) obj4).openConnection();
                    if (!(openConnection instanceof HttpURLConnection)) {
                        str = "Error closing HTTP compressed POST connection output stream. appId";
                        whoVar = whoVar2;
                        try {
                            throw new IOException("Failed to obtain HTTP connection");
                        } catch (IOException e3) {
                            e = e3;
                            iOException = e;
                            i = 0;
                            httpURLConnection2 = null;
                            map2 = null;
                            outputStream2 = null;
                            map3 = map2;
                            if (outputStream2 != null) {
                            }
                            if (httpURLConnection2 != null) {
                            }
                            zzhz zzhzVar2 = zzicVar2.g;
                            zzic.m(zzhzVar2);
                            zzhzVar2.Z(new wfo((String) obj6, whoVar, i, iOException, (byte[]) null, map3));
                            return;
                        } catch (Throwable th3) {
                            th = th3;
                            th = th;
                            i = 0;
                            outputStream = null;
                            map = null;
                            httpURLConnection = null;
                            if (outputStream != null) {
                            }
                            if (httpURLConnection != null) {
                            }
                            zzhz zzhzVar3 = zzicVar2.g;
                            zzic.m(zzhzVar3);
                            zzhzVar3.Z(new wfo((String) obj6, whoVar, i, (IOException) null, (byte[]) null, map));
                            throw th;
                        }
                    }
                    httpURLConnection2 = (HttpURLConnection) openConnection;
                    httpURLConnection2.setDefaultUseCaches(false);
                    zzal zzalVar = zzicVar2.d;
                    httpURLConnection2.setConnectTimeout(60000);
                    httpURLConnection2.setReadTimeout(61000);
                    httpURLConnection2.setInstanceFollowRedirects(false);
                    httpURLConnection2.setDoInput(true);
                    try {
                        Map map9 = (Map) obj3;
                        if (map9 != null) {
                            for (Map.Entry entry : map9.entrySet()) {
                                httpURLConnection2.addRequestProperty((String) entry.getKey(), (String) entry.getValue());
                            }
                        }
                        ?? r13 = (byte[]) obj2;
                        map5 = r13;
                        if (r13 != 0) {
                            ?? r0 = zzgzVar.c.g;
                            zzpg.U(r0);
                            byte[] A0 = r0.A0(r13);
                            zzgu zzguVar = zzicVar2.f;
                            zzic.m(zzguVar);
                            ?? r8 = zzguVar.o;
                            int length = A0.length;
                            ?? valueOf2 = Integer.valueOf(length);
                            r8.b(valueOf2, "Uploading data. size");
                            httpURLConnection2.setDoOutput(true);
                            httpURLConnection2.addRequestProperty("Content-Encoding", "gzip");
                            httpURLConnection2.setFixedLengthStreamingMode(length);
                            httpURLConnection2.connect();
                            OutputStream outputStream4 = httpURLConnection2.getOutputStream();
                            try {
                                outputStream4.write(A0);
                                outputStream4.close();
                                map5 = valueOf2;
                            } catch (IOException e4) {
                                iOException = e4;
                                outputStream2 = outputStream4;
                                str = "Error closing HTTP compressed POST connection output stream. appId";
                                whoVar = whoVar2;
                                map3 = null;
                                i = 0;
                                if (outputStream2 != null) {
                                }
                                if (httpURLConnection2 != null) {
                                }
                                zzhz zzhzVar22 = zzicVar2.g;
                                zzic.m(zzhzVar22);
                                zzhzVar22.Z(new wfo((String) obj6, whoVar, i, iOException, (byte[]) null, map3));
                                return;
                            } catch (Throwable th4) {
                                httpURLConnection = httpURLConnection2;
                                outputStream = outputStream4;
                                str = "Error closing HTTP compressed POST connection output stream. appId";
                                whoVar = whoVar2;
                                map = null;
                                th = th4;
                                i = 0;
                                if (outputStream != null) {
                                }
                                if (httpURLConnection != null) {
                                }
                                zzhz zzhzVar32 = zzicVar2.g;
                                zzic.m(zzhzVar32);
                                zzhzVar32.Z(new wfo((String) obj6, whoVar, i, (IOException) null, (byte[]) null, map));
                                throw th;
                            }
                        }
                        str = "Error closing HTTP compressed POST connection output stream. appId";
                        whoVar = whoVar2;
                        try {
                            i = httpURLConnection2.getResponseCode();
                        } catch (IOException e5) {
                            e = e5;
                            iOException = e;
                            i = 0;
                            map2 = null;
                            outputStream2 = null;
                            map3 = map2;
                            if (outputStream2 != null) {
                                try {
                                    outputStream2.close();
                                } catch (IOException e6) {
                                    zzgu zzguVar2 = zzicVar2.f;
                                    zzic.m(zzguVar2);
                                    zzguVar2.g.c(zzgu.U(str3), e6, str);
                                }
                            }
                            if (httpURLConnection2 != null) {
                                httpURLConnection2.disconnect();
                            }
                            zzhz zzhzVar222 = zzicVar2.g;
                            zzic.m(zzhzVar222);
                            zzhzVar222.Z(new wfo((String) obj6, whoVar, i, iOException, (byte[]) null, map3));
                            return;
                        } catch (Throwable th5) {
                            th = th5;
                            httpURLConnection = httpURLConnection2;
                            i = 0;
                            outputStream = null;
                            map4 = null;
                            th = th;
                            map = map4;
                            if (outputStream != null) {
                                try {
                                    outputStream.close();
                                } catch (IOException e7) {
                                    zzgu zzguVar3 = zzicVar2.f;
                                    zzic.m(zzguVar3);
                                    zzguVar3.g.c(zzgu.U(str3), e7, str);
                                }
                            }
                            if (httpURLConnection != null) {
                                httpURLConnection.disconnect();
                            }
                            zzhz zzhzVar322 = zzicVar2.g;
                            zzic.m(zzhzVar322);
                            zzhzVar322.Z(new wfo((String) obj6, whoVar, i, (IOException) null, (byte[]) null, map));
                            throw th;
                        }
                    } catch (IOException e8) {
                        e = e8;
                        str = "Error closing HTTP compressed POST connection output stream. appId";
                        whoVar = whoVar2;
                    } catch (Throwable th6) {
                        th = th6;
                        str = "Error closing HTTP compressed POST connection output stream. appId";
                        whoVar = whoVar2;
                    }
                    try {
                        try {
                            Map<String, List<String>> headerFields = httpURLConnection2.getHeaderFields();
                            try {
                                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                                inputStream = httpURLConnection2.getInputStream();
                                try {
                                    byte[] bArr = new byte[1024];
                                    while (true) {
                                        int read = inputStream.read(bArr);
                                        if (read <= 0) {
                                            byte[] byteArray = byteArrayOutputStream.toByteArray();
                                            inputStream.close();
                                            httpURLConnection2.disconnect();
                                            zzhz zzhzVar4 = zzicVar2.g;
                                            zzic.m(zzhzVar4);
                                            zzhzVar4.Z(new wfo((String) obj6, whoVar, i, (IOException) null, byteArray, headerFields));
                                            return;
                                        }
                                        byteArrayOutputStream.write(bArr, 0, read);
                                    }
                                } catch (Throwable th7) {
                                    th = th7;
                                    if (inputStream != null) {
                                        inputStream.close();
                                    }
                                    throw th;
                                }
                            } catch (Throwable th8) {
                                th = th8;
                                inputStream = null;
                            }
                        } catch (IOException e9) {
                            iOException = e9;
                            map2 = map5;
                            outputStream2 = null;
                            map3 = map2;
                            if (outputStream2 != null) {
                            }
                            if (httpURLConnection2 != null) {
                            }
                            zzhz zzhzVar2222 = zzicVar2.g;
                            zzic.m(zzhzVar2222);
                            zzhzVar2222.Z(new wfo((String) obj6, whoVar, i, iOException, (byte[]) null, map3));
                            return;
                        } catch (Throwable th9) {
                            th = th9;
                            httpURLConnection = httpURLConnection2;
                            outputStream = null;
                            map4 = map5;
                            th = th;
                            map = map4;
                            if (outputStream != null) {
                            }
                            if (httpURLConnection != null) {
                            }
                            zzhz zzhzVar3222 = zzicVar2.g;
                            zzic.m(zzhzVar3222);
                            zzhzVar3222.Z(new wfo((String) obj6, whoVar, i, (IOException) null, (byte[]) null, map));
                            throw th;
                        }
                    } catch (IOException e10) {
                        iOException = e10;
                        map2 = null;
                        outputStream2 = null;
                        map3 = map2;
                        if (outputStream2 != null) {
                        }
                        if (httpURLConnection2 != null) {
                        }
                        zzhz zzhzVar22222 = zzicVar2.g;
                        zzic.m(zzhzVar22222);
                        zzhzVar22222.Z(new wfo((String) obj6, whoVar, i, iOException, (byte[]) null, map3));
                        return;
                    } catch (Throwable th10) {
                        th = th10;
                        httpURLConnection = httpURLConnection2;
                        outputStream = null;
                        map4 = null;
                        th = th;
                        map = map4;
                        if (outputStream != null) {
                        }
                        if (httpURLConnection != null) {
                        }
                        zzhz zzhzVar32222 = zzicVar2.g;
                        zzic.m(zzhzVar32222);
                        zzhzVar32222.Z(new wfo((String) obj6, whoVar, i, (IOException) null, (byte[]) null, map));
                        throw th;
                    }
                } catch (IOException e11) {
                    e = e11;
                    str = "Error closing HTTP compressed POST connection output stream. appId";
                    whoVar = whoVar2;
                } catch (Throwable th11) {
                    th = th11;
                    str = "Error closing HTTP compressed POST connection output stream. appId";
                    whoVar = whoVar2;
                }
            default:
                String str4 = (String) obj6;
                zzlo zzloVar = (zzlo) obj5;
                zzic zzicVar3 = (zzic) zzloVar.b;
                zzic zzicVar4 = (zzic) zzloVar.b;
                zzhz zzhzVar5 = zzicVar3.g;
                zzic.m(zzhzVar5);
                zzhzVar5.U();
                try {
                    URLConnection openConnection2 = ((URL) obj4).openConnection();
                    if (!(openConnection2 instanceof HttpURLConnection)) {
                        throw new IOException("Failed to obtain HTTP connection");
                    }
                    HttpURLConnection httpURLConnection5 = (HttpURLConnection) openConnection2;
                    httpURLConnection5.setDefaultUseCaches(false);
                    zzal zzalVar2 = zzicVar4.d;
                    httpURLConnection5.setConnectTimeout(60000);
                    httpURLConnection5.setReadTimeout(61000);
                    httpURLConnection5.setInstanceFollowRedirects(false);
                    httpURLConnection5.setDoInput(true);
                    try {
                        try {
                            Map map10 = (Map) obj3;
                            if (map10 != null) {
                                for (Map.Entry entry2 : map10.entrySet()) {
                                    httpURLConnection5.addRequestProperty((String) entry2.getKey(), (String) entry2.getValue());
                                }
                            }
                            byte[] bArr2 = (byte[]) obj2;
                            if (bArr2 != null) {
                                try {
                                    ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                                    GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream2);
                                    gZIPOutputStream.write(bArr2);
                                    gZIPOutputStream.close();
                                    byteArrayOutputStream2.close();
                                    byte[] byteArray2 = byteArrayOutputStream2.toByteArray();
                                    zzgu zzguVar4 = zzicVar4.f;
                                    zzic.m(zzguVar4);
                                    zzgs zzgsVar = zzguVar4.o;
                                    int length2 = byteArray2.length;
                                    zzgsVar.b(Integer.valueOf(length2), "Uploading data. size");
                                    httpURLConnection5.setDoOutput(true);
                                    httpURLConnection5.addRequestProperty("Content-Encoding", "gzip");
                                    httpURLConnection5.setFixedLengthStreamingMode(length2);
                                    httpURLConnection5.connect();
                                    outputStream3 = httpURLConnection5.getOutputStream();
                                    try {
                                        outputStream3.write(byteArray2);
                                        outputStream3.close();
                                    } catch (IOException e12) {
                                        e = e12;
                                        httpURLConnection4 = httpURLConnection5;
                                        r62 = 0;
                                        iOException2 = e;
                                        map7 = r62;
                                        if (outputStream3 != null) {
                                        }
                                        if (httpURLConnection4 != null) {
                                        }
                                        a(i3, iOException2, null, map7);
                                        return;
                                    } catch (Throwable th12) {
                                        th = th12;
                                        httpURLConnection3 = httpURLConnection5;
                                        r6 = 0;
                                        th2 = th;
                                        map6 = r6;
                                        if (outputStream3 != null) {
                                        }
                                        if (httpURLConnection3 != null) {
                                        }
                                        a(i3, null, null, map6);
                                        throw th2;
                                    }
                                } catch (IOException e13) {
                                    zzgu zzguVar5 = zzicVar4.f;
                                    zzic.m(zzguVar5);
                                    zzguVar5.g.b(e13, "Failed to gzip post request content");
                                    throw e13;
                                }
                            }
                            responseCode = httpURLConnection5.getResponseCode();
                        } catch (IOException e14) {
                            e = e14;
                            httpURLConnection4 = httpURLConnection5;
                        }
                    } catch (Throwable th13) {
                        th = th13;
                        httpURLConnection3 = httpURLConnection5;
                    }
                    try {
                        try {
                            Map<String, List<String>> headerFields2 = httpURLConnection5.getHeaderFields();
                            try {
                                ByteArrayOutputStream byteArrayOutputStream3 = new ByteArrayOutputStream();
                                inputStream2 = httpURLConnection5.getInputStream();
                                try {
                                    byte[] bArr3 = new byte[1024];
                                    while (true) {
                                        int read2 = inputStream2.read(bArr3);
                                        if (read2 <= 0) {
                                            byte[] byteArray3 = byteArrayOutputStream3.toByteArray();
                                            inputStream2.close();
                                            httpURLConnection5.disconnect();
                                            a(responseCode, null, byteArray3, headerFields2);
                                            return;
                                        }
                                        byteArrayOutputStream3.write(bArr3, 0, read2);
                                    }
                                } catch (Throwable th14) {
                                    th = th14;
                                    if (inputStream2 != null) {
                                        inputStream2.close();
                                    }
                                    throw th;
                                }
                            } catch (Throwable th15) {
                                th = th15;
                                inputStream2 = null;
                            }
                        } catch (IOException e15) {
                            e = e15;
                            httpURLConnection4 = httpURLConnection5;
                            i3 = responseCode;
                            outputStream3 = null;
                            r62 = 0;
                            iOException2 = e;
                            map7 = r62;
                            if (outputStream3 != null) {
                                try {
                                    outputStream3.close();
                                } catch (IOException e16) {
                                    zzgu zzguVar6 = zzicVar4.f;
                                    zzic.m(zzguVar6);
                                    zzguVar6.g.c(zzgu.U(str4), e16, "Error closing HTTP compressed POST connection output stream. appId");
                                }
                            }
                            if (httpURLConnection4 != null) {
                                httpURLConnection4.disconnect();
                            }
                            a(i3, iOException2, null, map7);
                            return;
                        } catch (Throwable th16) {
                            th = th16;
                            httpURLConnection3 = httpURLConnection5;
                            i3 = responseCode;
                            outputStream3 = null;
                            r6 = 0;
                            th2 = th;
                            map6 = r6;
                            if (outputStream3 != null) {
                                try {
                                    outputStream3.close();
                                } catch (IOException e17) {
                                    zzgu zzguVar7 = zzicVar4.f;
                                    zzic.m(zzguVar7);
                                    zzguVar7.g.c(zzgu.U(str4), e17, "Error closing HTTP compressed POST connection output stream. appId");
                                }
                            }
                            if (httpURLConnection3 != null) {
                                httpURLConnection3.disconnect();
                            }
                            a(i3, null, null, map6);
                            throw th2;
                        }
                    } catch (IOException e18) {
                        e = e18;
                        i3 = responseCode;
                        r62 = "Content-Encoding";
                        outputStream3 = null;
                        httpURLConnection4 = httpURLConnection5;
                        iOException2 = e;
                        map7 = r62;
                        if (outputStream3 != null) {
                        }
                        if (httpURLConnection4 != null) {
                        }
                        a(i3, iOException2, null, map7);
                        return;
                    } catch (Throwable th17) {
                        th = th17;
                        i3 = responseCode;
                        r6 = "Content-Encoding";
                        outputStream3 = null;
                        httpURLConnection3 = httpURLConnection5;
                        th2 = th;
                        map6 = r6;
                        if (outputStream3 != null) {
                        }
                        if (httpURLConnection3 != null) {
                        }
                        a(i3, null, null, map6);
                        throw th2;
                    }
                } catch (IOException e19) {
                    iOException2 = e19;
                    outputStream3 = null;
                    httpURLConnection4 = null;
                    map7 = null;
                } catch (Throwable th18) {
                    th2 = th18;
                    outputStream3 = null;
                    httpURLConnection3 = null;
                    map6 = null;
                }
        }
    }

    public /* synthetic */ ugn(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
        this.f = obj5;
        this.g = obj6;
    }

    public ugn(zzlo zzloVar, String str, URL url, byte[] bArr, HashMap hashMap, fwo fwoVar) {
        this.a = 3;
        Objects.requireNonNull(zzloVar);
        this.f = zzloVar;
        Preconditions.f(str);
        this.b = url;
        this.c = bArr;
        this.d = fwoVar;
        this.g = str;
        this.e = hashMap;
    }
}
