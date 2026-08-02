package com.google.android.gms.internal.ads;

import android.net.TrafficStats;
import android.net.Uri;
import android.os.Parcelable;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.appsflyer.sdk_base.referrer.Payload;
import com.blaze.blazesdk.data_source.BlazeDataSourcePersonalizedType;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.internal.ads.zzclx;
import com.ironsource.C4427z5;
import com.ironsource.U3;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.TsExtractor;
import com.unity3d.services.core.network.model.HttpRequest;
import defpackage.a16;
import defpackage.bsk;
import defpackage.ddb;
import defpackage.dx2;
import defpackage.fjn;
import defpackage.fsn;
import defpackage.g6n;
import defpackage.is8;
import defpackage.mon;
import defpackage.qon;
import defpackage.sb2;
import defpackage.sgo;
import defpackage.utn;
import defpackage.vlo;
import defpackage.zmn;
import defpackage.zzn;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public class zzclx extends WebViewClient implements zzcnk {
    public static final /* synthetic */ int I = 0;
    public zzdck A;
    public boolean B;
    public boolean C;
    public int D;
    public boolean E;
    public final zzelp G;
    public a16 H;
    public final zzclm a;
    public final zzbif b;
    public com.google.android.gms.ads.internal.client.zza e;
    public com.google.android.gms.ads.internal.overlay.zzr f;
    public zzcni g;
    public zzcnj h;
    public zzbox i;
    public zzboz j;
    public zzdlw k;
    public boolean l;
    public boolean m;
    public boolean q;
    public boolean r;
    public boolean s;
    public boolean t;
    public com.google.android.gms.ads.internal.overlay.zzad u;
    public zzbyx v;
    public com.google.android.gms.ads.internal.zzb w;
    public zzcef y;
    public zzeaj z;
    public final HashMap c = new HashMap();
    public final Object d = new Object();
    public int n = 0;
    public String o = "";
    public String p = "";
    public zzbys x = null;
    public final HashSet F = new HashSet(Arrays.asList(((String) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.N6)).split(BlazeDataSourcePersonalizedType.STRING_SEPARATOR)));

    public zzclx(zzclm zzclmVar, zzbif zzbifVar, boolean z, zzbyx zzbyxVar, zzelp zzelpVar) {
        this.b = zzbifVar;
        this.a = zzclmVar;
        this.q = z;
        this.v = zzbyxVar;
        this.G = zzelpVar;
    }

    public static WebResourceResponse Z() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.A1)).booleanValue()) {
            return new WebResourceResponse("", "", new ByteArrayInputStream(new byte[0]));
        }
        return null;
    }

    public static final boolean c0(zzclm zzclmVar) {
        return zzclmVar.e() != null && zzclmVar.e().b();
    }

    public static final boolean f0(boolean z, zzclm zzclmVar) {
        return (!z || zzclmVar.zzN().b() || zzclmVar.m().equals("interstitial_mb")) ? false : true;
    }

    public final void A(Uri uri) {
        com.google.android.gms.ads.internal.util.zze.zza("Received GMSG: ".concat(String.valueOf(uri)));
        String path = uri.getPath();
        List list = (List) this.c.get(path);
        if (path == null || list == null) {
            com.google.android.gms.ads.internal.util.zze.zza("No GMSG handler found for GMSG: ".concat(String.valueOf(uri)));
            if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.N7)).booleanValue() || com.google.android.gms.ads.internal.zzt.zzh().a() == null) {
                return;
            }
            zzcgj.a.execute(new fsn((path == null || path.length() < 2) ? "null" : path.substring(1), 6));
            return;
        }
        String encodedQuery = uri.getEncodedQuery();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.M6)).booleanValue() && this.F.contains(path) && encodedQuery != null) {
            if (encodedQuery.length() >= ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.O6)).intValue()) {
                com.google.android.gms.ads.internal.util.zze.zza("Parsing gmsg query params on BG thread: ".concat(path));
                ddb zzf = com.google.android.gms.ads.internal.zzt.zzc().zzf(uri);
                zzf.addListener(new vlo(0, zzf, new utn(this, list, path, uri, 0)), zzcgj.f);
                return;
            }
        }
        com.google.android.gms.ads.internal.zzt.zzc();
        b0(com.google.android.gms.ads.internal.util.zzs.zzT(uri), list, path);
    }

    public final void D(boolean z) {
        synchronized (this.d) {
            this.t = z;
        }
    }

    public final void I(int i, int i2) {
        zzbyx zzbyxVar = this.v;
        if (zzbyxVar != null) {
            zzbyxVar.f(i, i2);
        }
        zzbys zzbysVar = this.x;
        if (zzbysVar != null) {
            synchronized (zzbysVar.k) {
                zzbysVar.e = i;
                zzbysVar.f = i2;
            }
        }
    }

    public final void L(com.google.android.gms.ads.internal.client.zza zzaVar, zzbox zzboxVar, com.google.android.gms.ads.internal.overlay.zzr zzrVar, zzboz zzbozVar, com.google.android.gms.ads.internal.overlay.zzad zzadVar, boolean z, zzbqk zzbqkVar, com.google.android.gms.ads.internal.zzb zzbVar, fjn fjnVar, zzcef zzcefVar, zzele zzeleVar, zzfte zzfteVar, zzeaj zzeajVar, zzbrd zzbrdVar, zzdlw zzdlwVar, zzbrc zzbrcVar, zzbqw zzbqwVar, zzbqi zzbqiVar, zzcub zzcubVar, zzebm zzebmVar, zzdcq zzdcqVar, zzdck zzdckVar, zzdcg zzdcgVar) {
        zzclm zzclmVar = this.a;
        com.google.android.gms.ads.internal.zzb zzbVar2 = zzbVar == null ? new com.google.android.gms.ads.internal.zzb(zzclmVar.getContext(), zzcefVar, null) : zzbVar;
        this.x = new zzbys(zzclmVar, fjnVar);
        this.y = zzcefVar;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.J1)).booleanValue()) {
            h("/adMetadata", new zzbow(zzboxVar));
        }
        if (zzbozVar != null) {
            h("/appEvent", new zzboy(zzbozVar));
        }
        h("/backButton", zzbqg.e);
        h("/refresh", zzbqg.f);
        h("/canOpenApp", mon.b);
        h("/canOpenURLs", mon.f);
        h("/canOpenIntents", mon.c);
        h("/close", zzbqg.a);
        h("/customClose", zzbqg.b);
        h("/instrument", zzbqg.i);
        h("/delayPageLoaded", zzbqg.k);
        h("/delayPageClosed", zzbqg.l);
        h("/getLocationInfo", zzbqg.m);
        h("/log", zzbqg.c);
        h("/mraid", new zzbqo(zzbVar2, this.x, fjnVar));
        zzbyx zzbyxVar = this.v;
        if (zzbyxVar != null) {
            h("/mraidLoaded", zzbyxVar);
        }
        com.google.android.gms.ads.internal.zzb zzbVar3 = zzbVar2;
        h("/open", new zzbqv(zzbVar3, this.x, zzeleVar, zzeajVar, zzcubVar, zzdcqVar, zzdcgVar));
        h("/precache", new zzcjt());
        h("/touch", mon.e);
        h("/video", zzbqg.g);
        h("/videoMeta", zzbqg.h);
        if (zzeleVar == null || zzfteVar == null) {
            h("/click", new qon(0, zzdlwVar, zzcubVar));
            h("/httpTrack", mon.d);
        } else {
            h("/click", new zzn(zzdlwVar, zzcubVar, zzfteVar, zzeleVar));
            h("/httpTrack", new qon(4, zzfteVar, zzeleVar));
        }
        if (com.google.android.gms.ads.internal.zzt.zzD().a(zzclmVar.getContext())) {
            Map hashMap = new HashMap();
            if (zzclmVar.e() != null) {
                hashMap = zzclmVar.e().w0;
            }
            h("/logScionEvent", new zzbqn(zzclmVar.getContext(), hashMap));
        }
        if (zzbqkVar != null) {
            h("/setInterstitialProperties", new zzbqj(zzbqkVar));
        }
        if (zzbrdVar != null) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.va)).booleanValue()) {
                h("/inspectorNetworkExtras", zzbrdVar);
            }
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.Oa)).booleanValue() && zzbrcVar != null) {
            h("/shareSheet", zzbrcVar);
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.Q8)).booleanValue() && zzebmVar != null) {
            h("/onDeviceStorageEvent", new zzbqp(zzebmVar));
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.Ta)).booleanValue() && zzbqwVar != null) {
            h("/inspectorOutOfContextTest", zzbqwVar);
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.Ya)).booleanValue() && zzbqiVar != null) {
            h("/inspectorStorage", zzbqiVar);
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.id)).booleanValue()) {
            h("/bindPlayStoreOverlay", zzbqg.p);
            h("/presentPlayStoreOverlay", zzbqg.q);
            h("/expandPlayStoreOverlay", zzbqg.r);
            h("/collapsePlayStoreOverlay", zzbqg.s);
            h("/closePlayStoreOverlay", zzbqg.t);
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.q4)).booleanValue()) {
            h("/setPAIDPersonalizationEnabled", zzbqg.v);
            h("/resetPAID", zzbqg.u);
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.Cd)).booleanValue() && zzclmVar.e() != null && zzclmVar.e().r0) {
            h("/writeToLocalStorage", zzbqg.w);
            h("/clearLocalStorageKeys", zzbqg.x);
        }
        this.e = zzaVar;
        this.f = zzrVar;
        this.i = zzboxVar;
        this.j = zzbozVar;
        this.u = zzadVar;
        this.w = zzbVar3;
        this.k = zzdlwVar;
        this.z = zzeajVar;
        this.A = zzdckVar;
        this.l = z;
    }

    @Override // com.google.android.gms.internal.ads.zzdlw
    public final void M() {
        zzdlw zzdlwVar = this.k;
        if (zzdlwVar != null) {
            zzdlwVar.M();
        }
    }

    public final void N(View view, zzcef zzcefVar, int i) {
        if (!zzcefVar.zzc() || i <= 0) {
            return;
        }
        zzcefVar.b(view);
        if (zzcefVar.zzc()) {
            com.google.android.gms.ads.internal.util.zzs.zza.postDelayed(new g6n(this, view, zzcefVar, i, 2), 100L);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdlw
    public final void O() {
        zzdlw zzdlwVar = this.k;
        if (zzdlwVar != null) {
            zzdlwVar.O();
        }
    }

    public final WebResourceResponse a0(String str, Map map) {
        WebResourceResponse webResourceResponse;
        HttpURLConnection httpURLConnection;
        URL url = new URL(str);
        try {
            TrafficStats.setThreadStatsTag(264);
            int i = 0;
            while (true) {
                i++;
                webResourceResponse = null;
                if (i > 20) {
                    TrafficStats.clearThreadStatsTag();
                    is8.e("Too many redirects (20)");
                    return null;
                }
                URLConnection openConnection = url.openConnection();
                openConnection.setConnectTimeout(10000);
                openConnection.setReadTimeout(10000);
                for (Map.Entry entry : map.entrySet()) {
                    openConnection.addRequestProperty((String) entry.getKey(), (String) entry.getValue());
                }
                if (!(openConnection instanceof HttpURLConnection)) {
                    throw new IOException("Invalid protocol.");
                }
                httpURLConnection = (HttpURLConnection) openConnection;
                com.google.android.gms.ads.internal.util.zzs zzc = com.google.android.gms.ads.internal.zzt.zzc();
                zzclm zzclmVar = this.a;
                zzc.zzb(zzclmVar.getContext(), zzclmVar.zzs().afmaVersion, false, httpURLConnection, false, 60000);
                com.google.android.gms.ads.internal.util.client.zzl zzlVar = new com.google.android.gms.ads.internal.util.client.zzl(null);
                zzlVar.zza(httpURLConnection, null);
                int responseCode = httpURLConnection.getResponseCode();
                zzlVar.zzc(httpURLConnection, responseCode);
                if (responseCode < 300 || responseCode >= 400) {
                    break;
                }
                String headerField = httpURLConnection.getHeaderField("Location");
                if (headerField == null) {
                    throw new IOException("Missing Location header in redirect");
                }
                if (headerField.startsWith("tel:")) {
                    break;
                }
                URL url2 = new URL(url, headerField);
                String protocol = url2.getProtocol();
                if (protocol == null) {
                    int i2 = com.google.android.gms.ads.internal.util.zze.zza;
                    zzo.zzi("Protocol is null");
                    webResourceResponse = Z();
                    break;
                }
                if (!protocol.equals("http") && !protocol.equals(HttpRequest.DEFAULT_SCHEME)) {
                    StringBuilder sb = new StringBuilder(protocol.length() + 20);
                    sb.append("Unsupported scheme: ");
                    sb.append(protocol);
                    String sb2 = sb.toString();
                    int i3 = com.google.android.gms.ads.internal.util.zze.zza;
                    zzo.zzi(sb2);
                    webResourceResponse = Z();
                    break;
                }
                StringBuilder sb3 = new StringBuilder(headerField.length() + 15);
                sb3.append("Redirecting to ");
                sb3.append(headerField);
                String sb4 = sb3.toString();
                int i4 = com.google.android.gms.ads.internal.util.zze.zza;
                zzo.zzd(sb4);
                httpURLConnection.disconnect();
                url = url2;
            }
            com.google.android.gms.ads.internal.zzt.zzc();
            com.google.android.gms.ads.internal.zzt.zzc();
            String contentType = httpURLConnection.getContentType();
            String str2 = "";
            String trim = TextUtils.isEmpty(contentType) ? "" : contentType.split(";")[0].trim();
            com.google.android.gms.ads.internal.zzt.zzc();
            String contentType2 = httpURLConnection.getContentType();
            if (!TextUtils.isEmpty(contentType2)) {
                String[] split = contentType2.split(";");
                if (split.length != 1) {
                    int i5 = 1;
                    while (true) {
                        if (i5 >= split.length) {
                            break;
                        }
                        if (split[i5].trim().startsWith(C4427z5.N)) {
                            String[] split2 = split[i5].trim().split(U3.j.b);
                            if (split2.length > 1) {
                                str2 = split2[1].trim();
                                break;
                            }
                        }
                        i5++;
                    }
                }
            }
            String str3 = str2;
            Map<String, List<String>> headerFields = httpURLConnection.getHeaderFields();
            HashMap hashMap = new HashMap(headerFields.size());
            for (Map.Entry<String, List<String>> entry2 : headerFields.entrySet()) {
                if (entry2.getKey() != null && entry2.getValue() != null && !entry2.getValue().isEmpty()) {
                    hashMap.put(entry2.getKey(), entry2.getValue().get(0));
                }
            }
            webResourceResponse = com.google.android.gms.ads.internal.zzt.zzf().zzc(trim, str3, httpURLConnection.getResponseCode(), httpURLConnection.getResponseMessage(), hashMap, httpURLConnection.getInputStream());
            return webResourceResponse;
        } finally {
            TrafficStats.clearThreadStatsTag();
        }
    }

    public final void b0(Map map, List list, String str) {
        if (com.google.android.gms.ads.internal.util.zze.zzc()) {
            com.google.android.gms.ads.internal.util.zze.zza("Received GMSG: ".concat(str));
            for (String str2 : map.keySet()) {
                String str3 = (String) map.get(str2);
                StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 4 + String.valueOf(str3).length());
                sb.append("  ");
                sb.append(str2);
                sb.append(": ");
                sb.append(str3);
                com.google.android.gms.ads.internal.util.zze.zza(sb.toString());
            }
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((zzbqh) it.next()).a(this.a, map);
        }
    }

    public final void c(AdOverlayInfoParcel adOverlayInfoParcel) {
        com.google.android.gms.ads.internal.overlay.zzc zzcVar;
        zzbys zzbysVar = this.x;
        if (zzbysVar != null) {
            synchronized (zzbysVar.k) {
                r1 = zzbysVar.r != null;
            }
        }
        com.google.android.gms.ads.internal.zzt.zzb();
        com.google.android.gms.ads.internal.overlay.zzn.zza(this.a.getContext(), adOverlayInfoParcel, !r1, this.z);
        zzcef zzcefVar = this.y;
        if (zzcefVar != null) {
            String str = adOverlayInfoParcel.zzl;
            if (str == null && (zzcVar = adOverlayInfoParcel.zza) != null) {
                str = zzcVar.zzb;
            }
            zzcefVar.zzb(str);
        }
    }

    public final void h(String str, zzbqh zzbqhVar) {
        synchronized (this.d) {
            try {
                HashMap hashMap = this.c;
                List list = (List) hashMap.get(str);
                if (list == null) {
                    list = new CopyOnWriteArrayList();
                    hashMap.put(str, list);
                }
                list.add(zzbqhVar);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void i0(zzcub zzcubVar, zzele zzeleVar, zzfte zzfteVar) {
        j("/click");
        if (zzeleVar != null && zzfteVar != null) {
            h("/click", new zzn(this.k, zzcubVar, zzfteVar, zzeleVar));
            return;
        }
        zzdlw zzdlwVar = this.k;
        mon monVar = zzbqg.a;
        h("/click", new qon(0, zzdlwVar, zzcubVar));
    }

    public final void j(String str) {
        synchronized (this.d) {
            try {
                List list = (List) this.c.get(str);
                if (list == null) {
                    return;
                }
                list.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void l0(zzcub zzcubVar, zzele zzeleVar, zzeaj zzeajVar) {
        j("/open");
        h("/open", new zzbqv(this.w, this.x, zzeleVar, zzeajVar, zzcubVar, null, null));
    }

    public final void n() {
        zzcef zzcefVar = this.y;
        if (zzcefVar != null) {
            zzcefVar.zzf();
            this.y = null;
        }
        a16 a16Var = this.H;
        if (a16Var != null) {
            ((View) this.a).removeOnAttachStateChangeListener(a16Var);
        }
        synchronized (this.d) {
            try {
                this.c.clear();
                this.e = null;
                this.f = null;
                this.g = null;
                this.h = null;
                this.i = null;
                this.j = null;
                this.l = false;
                this.q = false;
                this.r = false;
                this.s = false;
                this.u = null;
                this.w = null;
                this.v = null;
                zzbys zzbysVar = this.x;
                if (zzbysVar != null) {
                    zzbysVar.f(true);
                    this.x = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean n0() {
        boolean z;
        synchronized (this.d) {
            z = this.q;
        }
        return z;
    }

    @Override // com.google.android.gms.ads.internal.client.zza
    public final void onAdClicked() {
        com.google.android.gms.ads.internal.client.zza zzaVar = this.e;
        if (zzaVar != null) {
            zzaVar.onAdClicked();
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onLoadResource(WebView webView, String str) {
        com.google.android.gms.ads.internal.util.zze.zza("Loading resource: ".concat(String.valueOf(str)));
        Uri parse = Uri.parse(str);
        if ("gmsg".equalsIgnoreCase(parse.getScheme()) && "mobileads.google.com".equalsIgnoreCase(parse.getHost())) {
            A(parse);
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        synchronized (this.d) {
            try {
                zzclm zzclmVar = this.a;
                if (zzclmVar.q()) {
                    com.google.android.gms.ads.internal.util.zze.zza("Blank page loaded, 1...");
                    zzclmVar.u();
                    return;
                }
                this.B = true;
                zzcnj zzcnjVar = this.h;
                if (zzcnjVar != null) {
                    zzcnjVar.mo12zza();
                    this.h = null;
                }
                r0();
                zzclm zzclmVar2 = this.a;
                if (zzclmVar2.zzL() != null) {
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.Dd)).booleanValue()) {
                        zzclmVar2.zzL().zzy(str);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, int i, String str, String str2) {
        this.m = true;
        this.n = i;
        this.o = str;
        this.p = str2;
    }

    public final boolean p0() {
        boolean z;
        synchronized (this.d) {
            z = this.r;
        }
        return z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void q0() {
        zzcef zzcefVar = this.y;
        if (zzcefVar != null) {
            zzclm zzclmVar = this.a;
            WebView zzD = zzclmVar.zzD();
            WeakHashMap weakHashMap = bsk.a;
            if (zzD.isAttachedToWindow()) {
                N(zzD, zzcefVar, 10);
                return;
            }
            a16 a16Var = this.H;
            if (a16Var != null) {
                ((View) zzclmVar).removeOnAttachStateChangeListener(a16Var);
            }
            a16 a16Var2 = new a16(this, zzcefVar);
            this.H = a16Var2;
            ((View) zzclmVar).addOnAttachStateChangeListener(a16Var2);
        }
    }

    public final void r0() {
        zzcni zzcniVar = this.g;
        zzclm zzclmVar = this.a;
        if (zzcniVar != null && ((this.B && this.D <= 0) || this.C || this.m)) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.G2)).booleanValue() && zzclmVar.zzq() != null) {
                zzbjn.a(zzclmVar.zzq().b, zzclmVar.zzi(), "awfllc");
            }
            zzcni zzcniVar2 = this.g;
            boolean z = false;
            if (!this.C && !this.m) {
                z = true;
            }
            zzcniVar2.zza(z, this.n, this.o, this.p);
            this.g = null;
        }
        zzclmVar.v();
    }

    public final void s0(com.google.android.gms.ads.internal.overlay.zzc zzcVar, boolean z, boolean z2, String str) {
        boolean z3;
        zzclm zzclmVar = this.a;
        boolean d = zzclmVar.d();
        boolean z4 = false;
        boolean z5 = f0(d, zzclmVar) || z2;
        if (z5 || !z) {
            z3 = d;
            z4 = true;
        } else {
            z3 = d;
        }
        c(new AdOverlayInfoParcel(zzcVar, z5 ? null : this.e, z3 ? null : this.f, this.u, zzclmVar.zzs(), zzclmVar, z4 ? null : this.k, str));
    }

    @Override // android.webkit.WebViewClient
    public final WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        return t(str, Collections.EMPTY_MAP);
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideKeyEvent(WebView webView, KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        if (keyCode == 79 || keyCode == 222) {
            return true;
        }
        switch (keyCode) {
            case 85:
            case 86:
            case 87:
            case 88:
            case TsExtractor.TS_STREAM_TYPE_DVBSUBS /* 89 */:
            case 90:
            case 91:
                return true;
            default:
                switch (keyCode) {
                    case ASSET_FAILED_INSUFFICIENT_SPACE_VALUE:
                    case ASSET_FAILED_MAX_SPACE_EXCEEDED_VALUE:
                    case 128:
                    case 129:
                    case 130:
                        return true;
                    default:
                        return false;
                }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        com.google.android.gms.ads.internal.util.zze.zza("AdWebView shouldOverrideUrlLoading: ".concat(String.valueOf(str)));
        Uri parse = Uri.parse(str);
        if ("gmsg".equalsIgnoreCase(parse.getScheme()) && "mobileads.google.com".equalsIgnoreCase(parse.getHost())) {
            A(parse);
            return true;
        }
        boolean z = this.l;
        zzclm zzclmVar = this.a;
        if (z && webView == zzclmVar.zzD()) {
            String scheme = parse.getScheme();
            if ("http".equalsIgnoreCase(scheme) || HttpRequest.DEFAULT_SCHEME.equalsIgnoreCase(scheme)) {
                com.google.android.gms.ads.internal.client.zza zzaVar = this.e;
                if (zzaVar != null) {
                    zzaVar.onAdClicked();
                    zzcef zzcefVar = this.y;
                    if (zzcefVar != null) {
                        zzcefVar.zzb(str);
                    }
                    this.e = null;
                }
                zzdlw zzdlwVar = this.k;
                if (zzdlwVar != null) {
                    zzdlwVar.M();
                    this.k = null;
                }
                return super.shouldOverrideUrlLoading(webView, str);
            }
        }
        if (zzclmVar.zzD().willNotDraw()) {
            zzo.zzi("AdWebView unable to handle URL: ".concat(String.valueOf(str)));
            return true;
        }
        try {
            zzbbd p = zzclmVar.p();
            zzfma zzT = zzclmVar.zzT();
            if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.Hd)).booleanValue() || zzT == null) {
                if (p != null && p.a(parse)) {
                    parse = p.b(parse, zzclmVar.getContext(), (View) zzclmVar, zzclmVar.zzj());
                }
            } else if (p != null && p.a(parse)) {
                parse = zzT.a(parse, zzclmVar.getContext(), (View) zzclmVar, zzclmVar.zzj());
            }
        } catch (zzbbe unused) {
            zzo.zzi("Unable to append parameter to URL: ".concat(String.valueOf(str)));
        }
        com.google.android.gms.ads.internal.zzb zzbVar = this.w;
        if (zzbVar == null || zzbVar.zzb()) {
            s0(new com.google.android.gms.ads.internal.overlay.zzc("android.intent.action.VIEW", parse.toString(), null, null, null, null, null, null), true, false, zzclmVar.zzn());
        } else {
            zzbVar.zzc(str);
        }
        return true;
    }

    /* JADX WARN: Not initialized variable reg: 18, insn: 0x01c1: MOVE (r2 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]) = (r18 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]) (LINE:450), block:B:89:0x01c1 */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00bb A[Catch: Exception | NoClassDefFoundError -> 0x031c, Exception | NoClassDefFoundError -> 0x031c, TryCatch #9 {Exception | NoClassDefFoundError -> 0x031c, blocks: (B:3:0x0014, B:5:0x0021, B:6:0x0027, B:8:0x0037, B:11:0x003e, B:13:0x004c, B:121:0x0068, B:122:0x006f, B:122:0x006f, B:124:0x0082, B:124:0x0082, B:126:0x009b, B:126:0x009b, B:127:0x00a1, B:127:0x00a1, B:16:0x00a9, B:16:0x00a9, B:18:0x00bb, B:18:0x00bb, B:21:0x00c3, B:21:0x00c3, B:23:0x00cf, B:23:0x00cf, B:25:0x00e8, B:25:0x00e8, B:66:0x022b, B:66:0x022b, B:46:0x0201, B:46:0x0201, B:50:0x02f2, B:50:0x02f2, B:52:0x0302, B:52:0x0302, B:54:0x0308, B:54:0x0308, B:56:0x0316, B:56:0x0316, B:45:0x01ce, B:45:0x01ce, B:73:0x0261, B:73:0x0261, B:74:0x0297, B:74:0x0297, B:68:0x0149, B:68:0x0149, B:91:0x00dc, B:91:0x00dc, B:92:0x0298, B:92:0x0298, B:94:0x02a2, B:94:0x02a2, B:96:0x02a8, B:99:0x02ab, B:100:0x02ac, B:100:0x02ac, B:101:0x02c9, B:104:0x02cc, B:105:0x02cd, B:105:0x02cd, B:109:0x02dc, B:114:0x02e8, B:118:0x02eb), top: B:2:0x0014 }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x02f0  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0308 A[Catch: Exception | NoClassDefFoundError -> 0x031c, Exception | NoClassDefFoundError -> 0x031c, TryCatch #9 {Exception | NoClassDefFoundError -> 0x031c, blocks: (B:3:0x0014, B:5:0x0021, B:6:0x0027, B:8:0x0037, B:11:0x003e, B:13:0x004c, B:121:0x0068, B:122:0x006f, B:122:0x006f, B:124:0x0082, B:124:0x0082, B:126:0x009b, B:126:0x009b, B:127:0x00a1, B:127:0x00a1, B:16:0x00a9, B:16:0x00a9, B:18:0x00bb, B:18:0x00bb, B:21:0x00c3, B:21:0x00c3, B:23:0x00cf, B:23:0x00cf, B:25:0x00e8, B:25:0x00e8, B:66:0x022b, B:66:0x022b, B:46:0x0201, B:46:0x0201, B:50:0x02f2, B:50:0x02f2, B:52:0x0302, B:52:0x0302, B:54:0x0308, B:54:0x0308, B:56:0x0316, B:56:0x0316, B:45:0x01ce, B:45:0x01ce, B:73:0x0261, B:73:0x0261, B:74:0x0297, B:74:0x0297, B:68:0x0149, B:68:0x0149, B:91:0x00dc, B:91:0x00dc, B:92:0x0298, B:92:0x0298, B:94:0x02a2, B:94:0x02a2, B:96:0x02a8, B:99:0x02ab, B:100:0x02ac, B:100:0x02ac, B:101:0x02c9, B:104:0x02cc, B:105:0x02cd, B:105:0x02cd, B:109:0x02dc, B:114:0x02e8, B:118:0x02eb), top: B:2:0x0014 }] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0220 A[Catch: all -> 0x01c0, TryCatch #0 {all -> 0x01c0, blocks: (B:62:0x020e, B:64:0x0220, B:65:0x0227, B:40:0x01a5, B:42:0x01b7, B:44:0x01c4), top: B:24:0x00e8 }] */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0298 A[Catch: Exception | NoClassDefFoundError -> 0x031c, Exception | NoClassDefFoundError -> 0x031c, TryCatch #9 {Exception | NoClassDefFoundError -> 0x031c, blocks: (B:3:0x0014, B:5:0x0021, B:6:0x0027, B:8:0x0037, B:11:0x003e, B:13:0x004c, B:121:0x0068, B:122:0x006f, B:122:0x006f, B:124:0x0082, B:124:0x0082, B:126:0x009b, B:126:0x009b, B:127:0x00a1, B:127:0x00a1, B:16:0x00a9, B:16:0x00a9, B:18:0x00bb, B:18:0x00bb, B:21:0x00c3, B:21:0x00c3, B:23:0x00cf, B:23:0x00cf, B:25:0x00e8, B:25:0x00e8, B:66:0x022b, B:66:0x022b, B:46:0x0201, B:46:0x0201, B:50:0x02f2, B:50:0x02f2, B:52:0x0302, B:52:0x0302, B:54:0x0308, B:54:0x0308, B:56:0x0316, B:56:0x0316, B:45:0x01ce, B:45:0x01ce, B:73:0x0261, B:73:0x0261, B:74:0x0297, B:74:0x0297, B:68:0x0149, B:68:0x0149, B:91:0x00dc, B:91:0x00dc, B:92:0x0298, B:92:0x0298, B:94:0x02a2, B:94:0x02a2, B:96:0x02a8, B:99:0x02ab, B:100:0x02ac, B:100:0x02ac, B:101:0x02c9, B:104:0x02cc, B:105:0x02cd, B:105:0x02cd, B:109:0x02dc, B:114:0x02e8, B:118:0x02eb), top: B:2:0x0014 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final WebResourceResponse t(String str, Map map) {
        WebResourceResponse webResourceResponse;
        String str2;
        int i;
        InputStream inputStream;
        boolean z;
        long j;
        InputStream Y0;
        boolean z2;
        final boolean z3;
        Throwable th;
        InputStream inputStream2;
        boolean z4;
        boolean z5;
        String sb;
        try {
            Map hashMap = new HashMap();
            zzclm zzclmVar = this.a;
            if (zzclmVar.e() != null) {
                hashMap = zzclmVar.e().w0;
            }
            String a = zzcet.a(str, zzclmVar.getContext(), this.E, hashMap);
            if (!a.equals(str)) {
                return a0(a, map);
            }
            Parcelable.Creator<zzbhr> creator = zzbhr.CREATOR;
            zzbhr Y02 = zzbhr.Y0(Uri.parse(str));
            if (Y02 != null) {
                HashMap hashMap2 = new HashMap();
                webResourceResponse = null;
                hashMap2.put("Access-Control-Allow-Origin", "*");
                Uri parse = Uri.parse(str);
                if (parse.getQueryParameterNames().contains("range")) {
                    try {
                        List c = zzguz.a(new sgo('-')).c(parse.getQueryParameter("range"));
                        if (c.size() == 2) {
                            int parseInt = Integer.parseInt((String) c.get(0));
                            int parseInt2 = Integer.parseInt((String) c.get(1)) + 1;
                            if (parseInt > 0) {
                                str2 = "ms";
                                Y02.h = parseInt;
                            } else {
                                str2 = "ms";
                            }
                            i = parseInt2 - parseInt;
                            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.s5)).booleanValue()) {
                                zzbho b = com.google.android.gms.ads.internal.zzt.zzj().b(Y02);
                                if (b == null || !b.zza()) {
                                    inputStream = null;
                                } else {
                                    synchronized (b) {
                                        z = b.b;
                                    }
                                    hashMap2.put("X-Afma-Gcache-HasAdditionalMetadataFromReadV2", Boolean.toString(z));
                                    hashMap2.put("X-Afma-Gcache-IsGcacheHit", Boolean.toString(b.Z0()));
                                    hashMap2.put("X-Afma-Gcache-IsDownloaded", Boolean.toString(b.zze()));
                                    synchronized (b) {
                                        j = b.d;
                                    }
                                    hashMap2.put("X-Afma-Gcache-CachedBytes", Long.toString(j));
                                    Y0 = b.Y0();
                                    if (i != -1) {
                                        long j2 = i;
                                        int i2 = zzham.a;
                                        inputStream = new sb2(j2, Y0);
                                    }
                                    inputStream = Y0;
                                }
                                if (inputStream != null) {
                                }
                            } else {
                                String zzn = zzclmVar.zzn();
                                if (zzn == null) {
                                    zzn = "";
                                }
                                Y02.i = zzn;
                                Y02.j = zzclmVar.zzp();
                                try {
                                    long longValue = (Y02.g ? (Long) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.u5) : (Long) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.t5)).longValue();
                                    long elapsedRealtime = com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime();
                                    com.google.android.gms.ads.internal.zzt.zzz();
                                    zmn a2 = zzbic.a(zzclmVar.getContext(), Y02);
                                    try {
                                        zzbid zzbidVar = (zzbid) a2.get(longValue, TimeUnit.MILLISECONDS);
                                        try {
                                            try {
                                                hashMap2.put("X-Afma-Gcache-HasAdditionalMetadataFromReadV2", Boolean.toString(zzbidVar.b));
                                                hashMap2.put("X-Afma-Gcache-IsGcacheHit", Boolean.toString(zzbidVar.c));
                                                hashMap2.put("X-Afma-Gcache-IsDownloaded", Boolean.toString(zzbidVar.e));
                                                hashMap2.put("X-Afma-Gcache-CachedBytes", Long.toString(zzbidVar.d));
                                                Y0 = zzbidVar.a;
                                                if (i != -1) {
                                                    long j3 = i;
                                                    try {
                                                        int i3 = zzham.a;
                                                        Y0 = new sb2(j3, Y0);
                                                    } catch (InterruptedException e) {
                                                        e = e;
                                                        inputStream2 = Y0;
                                                        z5 = true;
                                                        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.x5)).booleanValue()) {
                                                            com.google.android.gms.ads.internal.zzt.zzh().d("AdWebViewClient.interceptRequest.gcache", e);
                                                        }
                                                        a2.cancel(true);
                                                        Thread.currentThread().interrupt();
                                                        final long elapsedRealtime2 = com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime() - elapsedRealtime;
                                                        final int i4 = 1;
                                                        final boolean z6 = z5;
                                                        com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable(this) { // from class: vtn
                                                            public final /* synthetic */ zzclx b;

                                                            {
                                                                this.b = this;
                                                            }

                                                            @Override // java.lang.Runnable
                                                            public final /* synthetic */ void run() {
                                                                int i5 = i4;
                                                                long j4 = elapsedRealtime2;
                                                                boolean z7 = z6;
                                                                zzclx zzclxVar = this.b;
                                                                switch (i5) {
                                                                    case 0:
                                                                        zzclxVar.a.L(j4, z7);
                                                                        break;
                                                                    case 1:
                                                                        zzclxVar.a.L(j4, z7);
                                                                        break;
                                                                    default:
                                                                        zzclxVar.a.L(j4, z7);
                                                                        break;
                                                                }
                                                            }
                                                        });
                                                        StringBuilder sb2 = new StringBuilder(String.valueOf(elapsedRealtime2).length() + 24);
                                                        sb2.append("Cache connection took ");
                                                        sb2.append(elapsedRealtime2);
                                                        sb2.append(str2);
                                                        sb = sb2.toString();
                                                        com.google.android.gms.ads.internal.util.zze.zza(sb);
                                                        inputStream = inputStream2;
                                                        if (inputStream != null) {
                                                        }
                                                        if (com.google.android.gms.ads.internal.util.client.zzl.zzj()) {
                                                        }
                                                    } catch (ExecutionException e2) {
                                                        e = e2;
                                                        inputStream2 = Y0;
                                                        z4 = true;
                                                        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.x5)).booleanValue()) {
                                                        }
                                                        a2.cancel(true);
                                                        final long elapsedRealtime3 = com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime() - elapsedRealtime;
                                                        final int i5 = 0;
                                                        final boolean z7 = z4;
                                                        com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable(this) { // from class: vtn
                                                            public final /* synthetic */ zzclx b;

                                                            {
                                                                this.b = this;
                                                            }

                                                            @Override // java.lang.Runnable
                                                            public final /* synthetic */ void run() {
                                                                int i52 = i5;
                                                                long j4 = elapsedRealtime3;
                                                                boolean z72 = z7;
                                                                zzclx zzclxVar = this.b;
                                                                switch (i52) {
                                                                    case 0:
                                                                        zzclxVar.a.L(j4, z72);
                                                                        break;
                                                                    case 1:
                                                                        zzclxVar.a.L(j4, z72);
                                                                        break;
                                                                    default:
                                                                        zzclxVar.a.L(j4, z72);
                                                                        break;
                                                                }
                                                            }
                                                        });
                                                        StringBuilder sb3 = new StringBuilder(String.valueOf(elapsedRealtime3).length() + 24);
                                                        sb3.append("Cache connection took ");
                                                        sb3.append(elapsedRealtime3);
                                                        sb3.append(str2);
                                                        sb = sb3.toString();
                                                        com.google.android.gms.ads.internal.util.zze.zza(sb);
                                                        inputStream = inputStream2;
                                                        if (inputStream != null) {
                                                        }
                                                        if (com.google.android.gms.ads.internal.util.client.zzl.zzj()) {
                                                        }
                                                    } catch (TimeoutException e3) {
                                                        e = e3;
                                                        inputStream2 = Y0;
                                                        z4 = true;
                                                        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.x5)).booleanValue()) {
                                                        }
                                                        a2.cancel(true);
                                                        final long elapsedRealtime32 = com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime() - elapsedRealtime;
                                                        final int i52 = 0;
                                                        final boolean z72 = z4;
                                                        com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable(this) { // from class: vtn
                                                            public final /* synthetic */ zzclx b;

                                                            {
                                                                this.b = this;
                                                            }

                                                            @Override // java.lang.Runnable
                                                            public final /* synthetic */ void run() {
                                                                int i522 = i52;
                                                                long j4 = elapsedRealtime32;
                                                                boolean z722 = z72;
                                                                zzclx zzclxVar = this.b;
                                                                switch (i522) {
                                                                    case 0:
                                                                        zzclxVar.a.L(j4, z722);
                                                                        break;
                                                                    case 1:
                                                                        zzclxVar.a.L(j4, z722);
                                                                        break;
                                                                    default:
                                                                        zzclxVar.a.L(j4, z722);
                                                                        break;
                                                                }
                                                            }
                                                        });
                                                        StringBuilder sb32 = new StringBuilder(String.valueOf(elapsedRealtime32).length() + 24);
                                                        sb32.append("Cache connection took ");
                                                        sb32.append(elapsedRealtime32);
                                                        sb32.append(str2);
                                                        sb = sb32.toString();
                                                        com.google.android.gms.ads.internal.util.zze.zza(sb);
                                                        inputStream = inputStream2;
                                                        if (inputStream != null) {
                                                        }
                                                        if (com.google.android.gms.ads.internal.util.client.zzl.zzj()) {
                                                        }
                                                    }
                                                }
                                                long elapsedRealtime4 = com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime() - elapsedRealtime;
                                                com.google.android.gms.ads.internal.util.zzs.zza.post(new dx2(this, elapsedRealtime4, 3));
                                                StringBuilder sb4 = new StringBuilder(String.valueOf(elapsedRealtime4).length() + 24);
                                                sb4.append("Cache connection took ");
                                                sb4.append(elapsedRealtime4);
                                                sb4.append(str2);
                                                com.google.android.gms.ads.internal.util.zze.zza(sb4.toString());
                                                inputStream = Y0;
                                            } catch (Throwable th2) {
                                                th = th2;
                                                z3 = true;
                                                final long elapsedRealtime5 = com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime() - elapsedRealtime;
                                                final int i6 = 2;
                                                com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable(this) { // from class: vtn
                                                    public final /* synthetic */ zzclx b;

                                                    {
                                                        this.b = this;
                                                    }

                                                    @Override // java.lang.Runnable
                                                    public final /* synthetic */ void run() {
                                                        int i522 = i6;
                                                        long j4 = elapsedRealtime5;
                                                        boolean z722 = z3;
                                                        zzclx zzclxVar = this.b;
                                                        switch (i522) {
                                                            case 0:
                                                                zzclxVar.a.L(j4, z722);
                                                                break;
                                                            case 1:
                                                                zzclxVar.a.L(j4, z722);
                                                                break;
                                                            default:
                                                                zzclxVar.a.L(j4, z722);
                                                                break;
                                                        }
                                                    }
                                                });
                                                StringBuilder sb5 = new StringBuilder(String.valueOf(elapsedRealtime5).length() + 24);
                                                sb5.append("Cache connection took ");
                                                sb5.append(elapsedRealtime5);
                                                sb5.append(str2);
                                                com.google.android.gms.ads.internal.util.zze.zza(sb5.toString());
                                                throw th;
                                            }
                                        } catch (InterruptedException e4) {
                                            e = e4;
                                            inputStream2 = null;
                                        } catch (ExecutionException e5) {
                                            e = e5;
                                            inputStream2 = null;
                                            z4 = true;
                                            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.x5)).booleanValue()) {
                                                com.google.android.gms.ads.internal.zzt.zzh().d("AdWebViewClient.interceptRequest.gcache", e);
                                            }
                                            a2.cancel(true);
                                            final long elapsedRealtime322 = com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime() - elapsedRealtime;
                                            final int i522 = 0;
                                            final boolean z722 = z4;
                                            com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable(this) { // from class: vtn
                                                public final /* synthetic */ zzclx b;

                                                {
                                                    this.b = this;
                                                }

                                                @Override // java.lang.Runnable
                                                public final /* synthetic */ void run() {
                                                    int i5222 = i522;
                                                    long j4 = elapsedRealtime322;
                                                    boolean z7222 = z722;
                                                    zzclx zzclxVar = this.b;
                                                    switch (i5222) {
                                                        case 0:
                                                            zzclxVar.a.L(j4, z7222);
                                                            break;
                                                        case 1:
                                                            zzclxVar.a.L(j4, z7222);
                                                            break;
                                                        default:
                                                            zzclxVar.a.L(j4, z7222);
                                                            break;
                                                    }
                                                }
                                            });
                                            StringBuilder sb322 = new StringBuilder(String.valueOf(elapsedRealtime322).length() + 24);
                                            sb322.append("Cache connection took ");
                                            sb322.append(elapsedRealtime322);
                                            sb322.append(str2);
                                            sb = sb322.toString();
                                            com.google.android.gms.ads.internal.util.zze.zza(sb);
                                            inputStream = inputStream2;
                                            if (inputStream != null) {
                                            }
                                            if (com.google.android.gms.ads.internal.util.client.zzl.zzj()) {
                                            }
                                        } catch (TimeoutException e6) {
                                            e = e6;
                                            inputStream2 = null;
                                            z4 = true;
                                            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.x5)).booleanValue()) {
                                            }
                                            a2.cancel(true);
                                            final long elapsedRealtime3222 = com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime() - elapsedRealtime;
                                            final int i5222 = 0;
                                            final boolean z7222 = z4;
                                            com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable(this) { // from class: vtn
                                                public final /* synthetic */ zzclx b;

                                                {
                                                    this.b = this;
                                                }

                                                @Override // java.lang.Runnable
                                                public final /* synthetic */ void run() {
                                                    int i52222 = i5222;
                                                    long j4 = elapsedRealtime3222;
                                                    boolean z72222 = z7222;
                                                    zzclx zzclxVar = this.b;
                                                    switch (i52222) {
                                                        case 0:
                                                            zzclxVar.a.L(j4, z72222);
                                                            break;
                                                        case 1:
                                                            zzclxVar.a.L(j4, z72222);
                                                            break;
                                                        default:
                                                            zzclxVar.a.L(j4, z72222);
                                                            break;
                                                    }
                                                }
                                            });
                                            StringBuilder sb3222 = new StringBuilder(String.valueOf(elapsedRealtime3222).length() + 24);
                                            sb3222.append("Cache connection took ");
                                            sb3222.append(elapsedRealtime3222);
                                            sb3222.append(str2);
                                            sb = sb3222.toString();
                                            com.google.android.gms.ads.internal.util.zze.zza(sb);
                                            inputStream = inputStream2;
                                            if (inputStream != null) {
                                            }
                                            if (com.google.android.gms.ads.internal.util.client.zzl.zzj()) {
                                            }
                                        }
                                    } catch (InterruptedException e7) {
                                        e = e7;
                                        inputStream2 = null;
                                        z5 = false;
                                    } catch (ExecutionException e8) {
                                        e = e8;
                                        inputStream2 = null;
                                        z4 = false;
                                        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.x5)).booleanValue()) {
                                        }
                                        a2.cancel(true);
                                        final long elapsedRealtime32222 = com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime() - elapsedRealtime;
                                        final int i52222 = 0;
                                        final boolean z72222 = z4;
                                        com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable(this) { // from class: vtn
                                            public final /* synthetic */ zzclx b;

                                            {
                                                this.b = this;
                                            }

                                            @Override // java.lang.Runnable
                                            public final /* synthetic */ void run() {
                                                int i522222 = i52222;
                                                long j4 = elapsedRealtime32222;
                                                boolean z722222 = z72222;
                                                zzclx zzclxVar = this.b;
                                                switch (i522222) {
                                                    case 0:
                                                        zzclxVar.a.L(j4, z722222);
                                                        break;
                                                    case 1:
                                                        zzclxVar.a.L(j4, z722222);
                                                        break;
                                                    default:
                                                        zzclxVar.a.L(j4, z722222);
                                                        break;
                                                }
                                            }
                                        });
                                        StringBuilder sb32222 = new StringBuilder(String.valueOf(elapsedRealtime32222).length() + 24);
                                        sb32222.append("Cache connection took ");
                                        sb32222.append(elapsedRealtime32222);
                                        sb32222.append(str2);
                                        sb = sb32222.toString();
                                        com.google.android.gms.ads.internal.util.zze.zza(sb);
                                        inputStream = inputStream2;
                                        if (inputStream != null) {
                                        }
                                        if (com.google.android.gms.ads.internal.util.client.zzl.zzj()) {
                                        }
                                    } catch (TimeoutException e9) {
                                        e = e9;
                                        inputStream2 = null;
                                        z4 = false;
                                        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.x5)).booleanValue()) {
                                        }
                                        a2.cancel(true);
                                        final long elapsedRealtime322222 = com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime() - elapsedRealtime;
                                        final int i522222 = 0;
                                        final boolean z722222 = z4;
                                        com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable(this) { // from class: vtn
                                            public final /* synthetic */ zzclx b;

                                            {
                                                this.b = this;
                                            }

                                            @Override // java.lang.Runnable
                                            public final /* synthetic */ void run() {
                                                int i5222222 = i522222;
                                                long j4 = elapsedRealtime322222;
                                                boolean z7222222 = z722222;
                                                zzclx zzclxVar = this.b;
                                                switch (i5222222) {
                                                    case 0:
                                                        zzclxVar.a.L(j4, z7222222);
                                                        break;
                                                    case 1:
                                                        zzclxVar.a.L(j4, z7222222);
                                                        break;
                                                    default:
                                                        zzclxVar.a.L(j4, z7222222);
                                                        break;
                                                }
                                            }
                                        });
                                        StringBuilder sb322222 = new StringBuilder(String.valueOf(elapsedRealtime322222).length() + 24);
                                        sb322222.append("Cache connection took ");
                                        sb322222.append(elapsedRealtime322222);
                                        sb322222.append(str2);
                                        sb = sb322222.toString();
                                        com.google.android.gms.ads.internal.util.zze.zza(sb);
                                        inputStream = inputStream2;
                                        if (inputStream != null) {
                                        }
                                        if (com.google.android.gms.ads.internal.util.client.zzl.zzj()) {
                                        }
                                    } catch (Throwable th3) {
                                        th = th3;
                                        z3 = false;
                                    }
                                    if (inputStream != null) {
                                        return new WebResourceResponse("", "", 200, Payload.RESPONSE_OK, hashMap2, inputStream);
                                    }
                                } catch (Throwable th4) {
                                    z3 = z2;
                                    th = th4;
                                }
                            }
                        }
                    } catch (NoClassDefFoundError e10) {
                        e = e10;
                        com.google.android.gms.ads.internal.zzt.zzh().d("AdWebViewClient.interceptRequest", e);
                        return Z();
                    }
                }
                str2 = "ms";
                i = -1;
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.s5)).booleanValue()) {
                }
            } else {
                webResourceResponse = null;
            }
            return (com.google.android.gms.ads.internal.util.client.zzl.zzj() || !((Boolean) zzbld.b.c()).booleanValue()) ? webResourceResponse : a0(str, map);
        } catch (Exception | NoClassDefFoundError e11) {
            e = e11;
        }
    }
}
