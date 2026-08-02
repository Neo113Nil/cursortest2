package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.graphics.Canvas;
import android.net.Uri;
import android.os.Looper;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import android.webkit.DownloadListener;
import android.webkit.ValueCallback;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zzci;
import com.google.android.gms.ads.internal.zzn;
import com.ironsource.C4018c8;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.unity3d.ads.BuildConfig;
import com.unity3d.ads.adplayer.AndroidWebViewClient;
import com.unity3d.services.UnityAdsConstants;
import com.vungle.ads.internal.protos.Sdk;
import defpackage.bnn;
import defpackage.ddb;
import defpackage.dun;
import defpackage.eun;
import defpackage.fc6;
import defpackage.fjn;
import defpackage.fsn;
import defpackage.gpn;
import defpackage.lv4;
import defpackage.mz1;
import defpackage.v0l;
import defpackage.wtn;
import defpackage.xe6;
import defpackage.xlo;
import defpackage.y0l;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class n extends WebView implements DownloadListener, ViewTreeObserver.OnGlobalLayoutListener, zzclm {
    public static final /* synthetic */ int c0 = 0;
    public zzcms A;
    public boolean B;
    public boolean C;
    public zzbmi D;
    public zzdux E;
    public zzbgt F;
    public int G;
    public int H;
    public zzbjs I;
    public final zzbjs J;
    public zzbjs K;
    public final zzbjt L;
    public int M;
    public com.google.android.gms.ads.internal.overlay.zzm N;
    public boolean O;
    public final zzci P;
    public int Q;
    public int R;
    public int S;
    public int T;
    public int U;
    public HashMap V;
    public final WindowManager W;
    public final zzcno a;
    public final zzbif a0;
    public final zzbbd b;
    public boolean b0;
    public final zzfma c;
    public final zzbkn d;
    public final VersionInfoParcel e;
    public zzn f;
    public final com.google.android.gms.ads.internal.zza g;
    public final DisplayMetrics h;
    public final float i;
    public zzfld j;
    public zzflg k;
    public boolean l;
    public boolean m;
    public zzclx n;
    public com.google.android.gms.ads.internal.overlay.zzm o;
    public zzeml p;
    public zzemj q;
    public zzcnw r;
    public final String s;
    public boolean t;
    public boolean u;
    public boolean v;
    public boolean w;
    public Boolean x;
    public boolean y;
    public final String z;

    public n(zzcno zzcnoVar, zzcnw zzcnwVar, String str, boolean z, zzbbd zzbbdVar, zzbkn zzbknVar, VersionInfoParcel versionInfoParcel, zzn zznVar, com.google.android.gms.ads.internal.zza zzaVar, zzbif zzbifVar, zzfld zzfldVar, zzflg zzflgVar, zzfma zzfmaVar) {
        super(zzcnoVar);
        zzflg zzflgVar2;
        String str2;
        this.l = false;
        this.m = false;
        this.y = true;
        this.z = "";
        this.Q = -1;
        this.R = -1;
        this.S = -1;
        this.T = -1;
        this.U = -1;
        this.a = zzcnoVar;
        this.r = zzcnwVar;
        this.s = str;
        this.v = z;
        this.b = zzbbdVar;
        this.c = zzfmaVar;
        this.d = zzbknVar;
        this.e = versionInfoParcel;
        this.f = zznVar;
        this.g = zzaVar;
        WindowManager windowManager = (WindowManager) getContext().getSystemService("window");
        this.W = windowManager;
        com.google.android.gms.ads.internal.zzt.zzc();
        DisplayMetrics zzv = com.google.android.gms.ads.internal.util.zzs.zzv(windowManager);
        this.h = zzv;
        this.i = zzv.density;
        this.a0 = zzbifVar;
        this.j = zzfldVar;
        this.k = zzflgVar;
        this.P = new zzci(zzcnoVar.a, this, this, null);
        this.b0 = false;
        setBackgroundColor(0);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.md)).booleanValue()) {
            setSoundEffectsEnabled(false);
        }
        WebSettings settings = getSettings();
        settings.setAllowFileAccess(false);
        try {
            settings.setJavaScriptEnabled(true);
        } catch (NullPointerException e) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            zzo.zzg("Unable to enable Javascript.", e);
        }
        settings.setSavePassword(false);
        settings.setSupportMultipleWindows(true);
        settings.setJavaScriptCanOpenWindowsAutomatically(true);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.ld)).booleanValue()) {
            settings.setMixedContentMode(1);
        } else {
            settings.setMixedContentMode(2);
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.Ye)).booleanValue()) {
            settings.setGeolocationEnabled(false);
        }
        settings.setUserAgentString(com.google.android.gms.ads.internal.zzt.zzc().zze(zzcnoVar, versionInfoParcel.afmaVersion));
        com.google.android.gms.ads.internal.zzt.zzc();
        com.google.android.gms.ads.internal.util.zzs.zzp(getContext(), settings);
        setDownloadListener(this);
        x0();
        addJavascriptInterface(new zzcmx(this, new fjn(this, 5)), "googleAdsJsInterface");
        removeJavascriptInterface("accessibility");
        removeJavascriptInterface("accessibilityTraversal");
        zzbjt zzbjtVar = this.L;
        if (zzbjtVar != null) {
            zzbjv zzbjvVar = zzbjtVar.b;
            zzbjl a = com.google.android.gms.ads.internal.zzt.zzh().a();
            if (a != null) {
                a.a.offer(zzbjvVar);
            }
        }
        zzbjv zzbjvVar2 = new zzbjv(this.s);
        zzbjt zzbjtVar2 = new zzbjt(zzbjvVar2);
        this.L = zzbjtVar2;
        synchronized (zzbjvVar2.c) {
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.G2)).booleanValue() && (zzflgVar2 = this.k) != null && (str2 = zzflgVar2.b) != null) {
            zzbjvVar2.c("gqi", str2);
        }
        zzbjs zzbjsVar = new zzbjs(com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime(), null, null);
        this.J = zzbjsVar;
        zzbjtVar2.a.put("native:view_create", zzbjsVar);
        this.K = null;
        this.I = null;
        com.google.android.gms.ads.internal.util.zzce.zza().zzb(zzcnoVar);
        com.google.android.gms.ads.internal.zzt.zzh().k.incrementAndGet();
    }

    @Override // com.google.android.gms.internal.ads.zzbfg
    public final void A(zzbff zzbffVar) {
        boolean z;
        synchronized (this) {
            z = zzbffVar.j;
            this.B = z;
        }
        A0(z);
    }

    public final void A0(boolean z) {
        HashMap hashMap = new HashMap();
        hashMap.put(C4018c8.k, true != z ? "0" : "1");
        n("onAdVisibilityChanged", hashMap);
    }

    @Override // com.google.android.gms.internal.ads.zzclm
    public final synchronized zzbgt B() {
        return this.F;
    }

    public final synchronized String B0() {
        return this.z;
    }

    @Override // com.google.android.gms.internal.ads.zzclm
    public final synchronized void C(zzbgt zzbgtVar) {
        this.F = zzbgtVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcif
    public final synchronized void D(String str, zzcjs zzcjsVar) {
        try {
            HashMap hashMap = this.V;
            if (hashMap == null) {
                hashMap = new HashMap();
                this.V = hashMap;
            }
            hashMap.put(str, zzcjsVar);
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzclm
    public final ddb E() {
        zzbkn zzbknVar = this.d;
        return zzbknVar == null ? xlo.b : (zzhcq) zzhcy.g(zzhcq.r(xlo.b), ((Long) zzblg.c.c()).longValue(), TimeUnit.MILLISECONDS, zzbknVar.c);
    }

    @Override // com.google.android.gms.internal.ads.zzclm
    public final synchronized void F(com.google.android.gms.ads.internal.overlay.zzm zzmVar) {
        this.o = zzmVar;
    }

    @Override // com.google.android.gms.internal.ads.zzclm
    public final synchronized void G(String str, String str2) {
        n nVar;
        Throwable th;
        String str3;
        try {
            try {
                if (q()) {
                    int i = com.google.android.gms.ads.internal.util.zze.zza;
                    zzo.zzi("#004 The webview is destroyed. Ignoring action.");
                    return;
                }
                String str4 = (String) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.H0);
                JSONObject jSONObject = new JSONObject();
                try {
                    try {
                        jSONObject.put("version", str4);
                        jSONObject.put("sdk", "Google Mobile Ads");
                        jSONObject.put("sdkVersion", "12.4.51-000");
                        str3 = "<script>Object.defineProperty(window,'MRAID_ENV',{get:function(){return " + jSONObject.toString() + "}});</script>";
                    } catch (Throwable th2) {
                        th = th2;
                        nVar = this;
                        throw th;
                    }
                } catch (JSONException e) {
                    int i2 = com.google.android.gms.ads.internal.util.zze.zza;
                    zzo.zzj("Unable to build MRAID_ENV", e);
                    str3 = null;
                }
                super.loadDataWithBaseURL(str, zzcnd.a(str2, str3), "text/html", C.UTF8_NAME, null);
            } catch (Throwable th3) {
                th = th3;
                th = th;
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
            nVar = this;
            th = th;
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzclm
    public final void H(Context context) {
        zzcno zzcnoVar = this.a;
        zzcnoVar.setBaseContext(context);
        this.P.zza(zzcnoVar.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v1, types: [com.google.android.gms.internal.ads.zzbzm] */
    /* JADX WARN: Type inference failed for: r9v2 */
    @Override // com.google.android.gms.internal.ads.zzcnc
    public final void I(int i, boolean z, boolean z2) {
        com.google.android.gms.ads.internal.client.zza zzaVar;
        zzdlw zzdlwVar;
        ?? r9;
        int i2;
        com.google.android.gms.ads.internal.client.zza zzaVar2;
        boolean z3;
        zzclx zzclxVar = this.n;
        zzclm zzclmVar = zzclxVar.a;
        boolean f0 = zzclx.f0(zzclmVar.d(), zzclmVar);
        boolean z4 = true;
        if (!f0 && z2) {
            z4 = false;
        }
        if (f0) {
            zzaVar = null;
            zzdlwVar = null;
        } else {
            zzaVar = zzclxVar.e;
            zzdlwVar = null;
        }
        com.google.android.gms.ads.internal.overlay.zzr zzrVar = zzclxVar.f;
        zzdlw zzdlwVar2 = zzdlwVar;
        com.google.android.gms.ads.internal.overlay.zzad zzadVar = zzclxVar.u;
        VersionInfoParcel zzs = zzclmVar.zzs();
        zzdlw zzdlwVar3 = z4 ? zzdlwVar2 : zzclxVar.k;
        if (zzclx.c0(zzclmVar)) {
            r9 = zzclxVar.G;
            i2 = i;
            z3 = z;
            zzaVar2 = zzaVar;
        } else {
            r9 = zzdlwVar2;
            i2 = i;
            zzaVar2 = zzaVar;
            z3 = z;
        }
        zzclxVar.c(new AdOverlayInfoParcel(zzaVar2, zzrVar, zzadVar, zzclmVar, z3, i2, zzs, zzdlwVar3, r9));
    }

    @Override // com.google.android.gms.internal.ads.zzclm
    public final synchronized void J(zzcnw zzcnwVar) {
        this.r = zzcnwVar;
        requestLayout();
    }

    @Override // com.google.android.gms.internal.ads.zzclm
    public final synchronized void K(boolean z) {
        com.google.android.gms.ads.internal.overlay.zzm zzmVar;
        int i = this.G + (true != z ? -1 : 1);
        this.G = i;
        if (i > 0 || (zzmVar = this.o) == null) {
            return;
        }
        zzmVar.zzE();
    }

    @Override // com.google.android.gms.internal.ads.zzcif
    public final void L(long j, boolean z) {
        HashMap hashMap = new HashMap(2);
        hashMap.put("success", true != z ? "0" : "1");
        hashMap.put(IronSourceConstants.EVENTS_DURATION, Long.toString(j));
        n("onCacheAccessComplete", hashMap);
    }

    @Override // com.google.android.gms.internal.ads.zzdlw
    public final void M() {
        zzclx zzclxVar = this.n;
        if (zzclxVar != null) {
            zzclxVar.M();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcnc
    public final void N(boolean z, int i, String str, boolean z2, String str2) {
        zzclx zzclxVar = this.n;
        zzclm zzclmVar = zzclxVar.a;
        boolean d = zzclmVar.d();
        boolean f0 = zzclx.f0(d, zzclmVar);
        boolean z3 = true;
        if (!f0 && z2) {
            z3 = false;
        }
        com.google.android.gms.ads.internal.client.zza zzaVar = f0 ? null : zzclxVar.e;
        wtn wtnVar = d ? null : new wtn(zzclmVar, zzclxVar.f);
        zzbox zzboxVar = zzclxVar.i;
        zzelp zzelpVar = null;
        zzboz zzbozVar = zzclxVar.j;
        boolean z4 = z3;
        wtn wtnVar2 = wtnVar;
        com.google.android.gms.ads.internal.overlay.zzad zzadVar = zzclxVar.u;
        VersionInfoParcel zzs = zzclmVar.zzs();
        zzdlw zzdlwVar = z4 ? null : zzclxVar.k;
        if (zzclx.c0(zzclmVar)) {
            zzelpVar = zzclxVar.G;
        }
        zzclxVar.c(new AdOverlayInfoParcel(zzaVar, wtnVar2, zzboxVar, zzbozVar, zzadVar, zzclmVar, z, i, str, str2, zzs, zzdlwVar, zzelpVar));
    }

    @Override // com.google.android.gms.internal.ads.zzdlw
    public final void O() {
        zzclx zzclxVar = this.n;
        if (zzclxVar != null) {
            zzclxVar.O();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzclm
    public final void P(String str, zzbqh zzbqhVar) {
        zzclx zzclxVar = this.n;
        if (zzclxVar != null) {
            synchronized (zzclxVar.d) {
                try {
                    List list = (List) zzclxVar.c.get(str);
                    if (list == null) {
                        return;
                    }
                    list.remove(zzbqhVar);
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzclm
    public final void Q(int i) {
        zzbjs zzbjsVar = this.J;
        zzbjt zzbjtVar = this.L;
        if (i == 0) {
            zzbjn.a(zzbjtVar.b, zzbjsVar, "aebb2");
        }
        zzbjn.a(zzbjtVar.b, zzbjsVar, "aeh2");
        zzbjtVar.b.c("close_type", String.valueOf(i));
        HashMap hashMap = new HashMap(2);
        hashMap.put("closetype", String.valueOf(i));
        hashMap.put("version", this.e.afmaVersion);
        n("onhide", hashMap);
    }

    @Override // com.google.android.gms.internal.ads.zzclm
    public final boolean R(int i, boolean z) {
        destroy();
        xe6 xe6Var = new xe6(z, i);
        zzbif zzbifVar = this.a0;
        zzbifVar.b(xe6Var);
        zzbifVar.c(10003);
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzclm
    public final void S(boolean z) {
        this.n.E = z;
    }

    @Override // com.google.android.gms.internal.ads.zzclm
    public final void T(String str, zzbqh zzbqhVar) {
        zzclx zzclxVar = this.n;
        if (zzclxVar != null) {
            zzclxVar.h(str, zzbqhVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzclm
    public final void U() {
        this.b0 = true;
    }

    @Override // com.google.android.gms.internal.ads.zzclm
    public final synchronized void V(boolean z) {
        try {
            boolean z2 = this.v;
            this.v = z;
            x0();
            if (z != z2) {
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.I0)).booleanValue()) {
                    if (!this.r.b()) {
                    }
                }
                new zzbyy(this, "").d(true != z ? BuildConfig.FLAVOR : "expanded");
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzclm
    public final synchronized void W(zzdux zzduxVar) {
        this.E = zzduxVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0042 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x001e A[SYNTHETIC] */
    @Override // com.google.android.gms.internal.ads.zzclm
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void X(String str, fjn fjnVar) {
        boolean z;
        zzclx zzclxVar = this.n;
        if (zzclxVar != null) {
            synchronized (zzclxVar.d) {
                try {
                    List<zzbqh> list = (List) zzclxVar.c.get(str);
                    if (list == null) {
                        return;
                    }
                    ArrayList arrayList = new ArrayList();
                    for (zzbqh zzbqhVar : list) {
                        if (zzbqhVar instanceof gpn) {
                            if (((gpn) zzbqhVar).a.equals((zzbqh) fjnVar.b)) {
                                z = true;
                                if (!z) {
                                    arrayList.add(zzbqhVar);
                                }
                            }
                        }
                        z = false;
                        if (!z) {
                        }
                    }
                    list.removeAll(arrayList);
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzclm
    public final synchronized void Y(int i) {
        com.google.android.gms.ads.internal.overlay.zzm zzmVar = this.o;
        if (zzmVar != null) {
            zzmVar.zzv(i);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcnc
    public final void Z(String str, String str2) {
        zzclx zzclxVar = this.n;
        zzelp zzelpVar = zzclxVar.G;
        zzclm zzclmVar = zzclxVar.a;
        zzclxVar.c(new AdOverlayInfoParcel(zzclmVar, zzclmVar.zzs(), str, str2, 14, zzelpVar));
    }

    @Override // com.google.android.gms.internal.ads.zzclm
    public final synchronized zzemj a() {
        return this.q;
    }

    @Override // com.google.android.gms.internal.ads.zzclm
    public final Context b() {
        return this.a.c;
    }

    @Override // com.google.android.gms.internal.ads.zzcnc
    public final void b0(com.google.android.gms.ads.internal.overlay.zzc zzcVar, boolean z, boolean z2, String str) {
        this.n.s0(zzcVar, z, z2, str);
    }

    @Override // com.google.android.gms.internal.ads.zzbtq
    public final void c(String str, String str2) {
        q0(fc6.o(new StringBuilder(mz1.d(1, String.valueOf(str2).length(), str) + 2), str, "(", str2, ");"));
    }

    @Override // com.google.android.gms.internal.ads.zzclm
    public final synchronized boolean d() {
        return this.v;
    }

    @Override // com.google.android.gms.internal.ads.zzclm
    public final synchronized void d0(boolean z) {
        com.google.android.gms.ads.internal.overlay.zzm zzmVar = this.o;
        if (zzmVar != null) {
            zzmVar.zzs(this.n.n0(), z);
        } else {
            this.t = z;
        }
    }

    @Override // android.webkit.WebView, com.google.android.gms.internal.ads.zzclm
    public final synchronized void destroy() {
        try {
            zzbjt zzbjtVar = this.L;
            if (zzbjtVar != null) {
                zzbjv zzbjvVar = zzbjtVar.b;
                zzbjl a = com.google.android.gms.ads.internal.zzt.zzh().a();
                if (a != null) {
                    a.a.offer(zzbjvVar);
                }
            }
            this.P.zzc();
            com.google.android.gms.ads.internal.overlay.zzm zzmVar = this.o;
            if (zzmVar != null) {
                zzmVar.zza();
                this.o.zzp();
                this.o = null;
            }
            this.p = null;
            this.q = null;
            this.n.n();
            this.F = null;
            this.f = null;
            setOnClickListener(null);
            setOnTouchListener(null);
            if (this.u) {
                return;
            }
            com.google.android.gms.ads.internal.zzt.zzB().a(this);
            z0();
            this.u = true;
            if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.tc)).booleanValue()) {
                com.google.android.gms.ads.internal.util.zze.zza("Destroying the WebView immediately...");
                u();
                return;
            }
            Activity activity = this.a.a;
            if (activity != null && activity.isDestroyed()) {
                com.google.android.gms.ads.internal.util.zze.zza("Destroying the WebView immediately...");
                u();
            } else {
                com.google.android.gms.ads.internal.util.zze.zza("Initiating WebView self destruct sequence in 3...");
                com.google.android.gms.ads.internal.util.zze.zza("Loading blank page in WebView, 2...");
                w0();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzclm, com.google.android.gms.internal.ads.zzcld
    public final zzfld e() {
        return this.j;
    }

    @Override // com.google.android.gms.internal.ads.zzclm
    public final synchronized void e0(int i, boolean z) {
        if (z) {
            try {
                setBackgroundColor(0);
            } catch (Throwable th) {
                throw th;
            }
        }
        com.google.android.gms.ads.internal.overlay.zzm zzmVar = this.o;
        if (zzmVar != null) {
            zzmVar.zzt(z, i);
        }
    }

    @Override // android.webkit.WebView
    public final synchronized void evaluateJavascript(String str, ValueCallback valueCallback) {
        Throwable th;
        n nVar;
        try {
            try {
                if (!q()) {
                    if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.uc)).booleanValue() || Looper.getMainLooper().getThread() == Thread.currentThread()) {
                        super.evaluateJavascript(str, valueCallback);
                        return;
                    } else {
                        zzcgj.f.submit(new lv4(this, str, valueCallback, false, 22));
                        return;
                    }
                }
                try {
                    int i = com.google.android.gms.ads.internal.util.zze.zza;
                    zzo.zzl("#004 The webview is destroyed. Ignoring action.", null);
                    if (valueCallback != null) {
                        valueCallback.onReceiveValue(null);
                    }
                } catch (Throwable th2) {
                    th = th2;
                    nVar = this;
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                nVar = this;
                th = th;
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzclm
    public final void f() {
        this.P.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzcif
    public final synchronized void f0(zzcms zzcmsVar) {
        if (this.A == null) {
            this.A = zzcmsVar;
        } else {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            zzo.zzf("Attempt to create multiple AdWebViewVideoControllers.");
        }
    }

    public final void finalize() {
        try {
            synchronized (this) {
                try {
                    if (!this.u) {
                        this.n.n();
                        com.google.android.gms.ads.internal.zzt.zzB().a(this);
                        z0();
                        y0();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } finally {
            super.finalize();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzclm, com.google.android.gms.internal.ads.zzcmt
    public final zzflg g() {
        return this.k;
    }

    @Override // com.google.android.gms.internal.ads.zzclm
    public final synchronized void g0(com.google.android.gms.ads.internal.overlay.zzm zzmVar) {
        this.N = zzmVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbtq
    public final void h(String str, JSONObject jSONObject) {
        c(str, jSONObject.toString());
    }

    @Override // com.google.android.gms.internal.ads.zzclm
    public final synchronized void h0(zzemj zzemjVar) {
        this.q = zzemjVar;
    }

    @Override // com.google.android.gms.internal.ads.zzclm
    public final synchronized boolean i() {
        return this.y;
    }

    @Override // com.google.android.gms.internal.ads.zzcnc
    public final void i0(int i, String str, boolean z, boolean z2, boolean z3) {
        zzclx zzclxVar = this.n;
        zzclm zzclmVar = zzclxVar.a;
        boolean d = zzclmVar.d();
        boolean f0 = zzclx.f0(d, zzclmVar);
        boolean z4 = true;
        if (!f0 && z2) {
            z4 = false;
        }
        com.google.android.gms.ads.internal.client.zza zzaVar = f0 ? null : zzclxVar.e;
        wtn wtnVar = d ? null : new wtn(zzclmVar, zzclxVar.f);
        zzbox zzboxVar = zzclxVar.i;
        zzelp zzelpVar = null;
        zzboz zzbozVar = zzclxVar.j;
        boolean z5 = z4;
        wtn wtnVar2 = wtnVar;
        com.google.android.gms.ads.internal.overlay.zzad zzadVar = zzclxVar.u;
        VersionInfoParcel zzs = zzclmVar.zzs();
        zzdlw zzdlwVar = z5 ? null : zzclxVar.k;
        if (zzclx.c0(zzclmVar)) {
            zzelpVar = zzclxVar.G;
        }
        zzclxVar.c(new AdOverlayInfoParcel(zzaVar, wtnVar2, zzboxVar, zzbozVar, zzadVar, zzclmVar, z, i, str, zzs, zzdlwVar, zzelpVar, z3));
    }

    @Override // com.google.android.gms.internal.ads.zzcif
    public final int j() {
        return getMeasuredWidth();
    }

    @Override // com.google.android.gms.internal.ads.zzclm
    public final synchronized void j0(zzeml zzemlVar) {
        this.p = zzemlVar;
    }

    @Override // com.google.android.gms.internal.ads.zzclm
    public final void k() {
        setBackgroundColor(0);
    }

    @Override // com.google.android.gms.internal.ads.zzclm
    public final synchronized void k0(zzbmi zzbmiVar) {
        this.D = zzbmiVar;
    }

    @Override // com.google.android.gms.internal.ads.zzclm
    public final void l() {
        if (this.I == null) {
            zzbjt zzbjtVar = this.L;
            zzbjn.a(zzbjtVar.b, this.J, "aes2");
            zzbjs zzbjsVar = new zzbjs(com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime(), null, null);
            this.I = zzbjsVar;
            zzbjtVar.a.put("native:view_show", zzbjsVar);
        }
        HashMap hashMap = new HashMap(1);
        hashMap.put("version", this.e.afmaVersion);
        n("onshow", hashMap);
    }

    @Override // com.google.android.gms.internal.ads.zzcif
    public final zzchu l0() {
        return null;
    }

    @Override // android.webkit.WebView, com.google.android.gms.internal.ads.zzclm
    public final synchronized void loadData(String str, String str2, String str3) {
        if (!q()) {
            super.loadData(str, str2, str3);
        } else {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            zzo.zzi("#004 The webview is destroyed. Ignoring action.");
        }
    }

    @Override // android.webkit.WebView, com.google.android.gms.internal.ads.zzclm
    public final synchronized void loadDataWithBaseURL(String str, String str2, String str3, String str4, String str5) {
        if (!q()) {
            super.loadDataWithBaseURL(str, str2, str3, str4, str5);
        } else {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            zzo.zzi("#004 The webview is destroyed. Ignoring action.");
        }
    }

    @Override // android.webkit.WebView, com.google.android.gms.internal.ads.zzclm
    public final synchronized void loadUrl(String str) {
        if (q()) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            zzo.zzi("#004 The webview is destroyed. Ignoring action.");
            return;
        }
        try {
            com.google.android.gms.ads.internal.util.zzs.zza.post(new bnn(7, this, str));
        } catch (Throwable th) {
            com.google.android.gms.ads.internal.zzt.zzh().d("AdWebViewImpl.loadUrl", th);
            int i2 = com.google.android.gms.ads.internal.util.zze.zza;
            zzo.zzj("Could not call loadUrl. ", th);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzclm
    public final synchronized String m() {
        return this.s;
    }

    @Override // com.google.android.gms.internal.ads.zzclm
    public final void m0(zzfld zzfldVar, zzflg zzflgVar) {
        this.j = zzfldVar;
        this.k = zzflgVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbte
    public final void n(String str, Map map) {
        try {
            t(str, com.google.android.gms.ads.internal.client.zzay.zza().zzm(map));
        } catch (JSONException unused) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            zzo.zzi("Could not convert parameters to JSON.");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcif
    public final synchronized void n0(int i) {
        this.M = i;
    }

    @Override // com.google.android.gms.internal.ads.zzclm
    public final void o() {
        zzbjn.a(this.L.b, this.J, "aeh2");
        HashMap hashMap = new HashMap(1);
        hashMap.put("version", this.e.afmaVersion);
        n("onhide", hashMap);
    }

    @Override // com.google.android.gms.internal.ads.zzclm
    public final synchronized void o0(boolean z) {
        this.y = z;
    }

    @Override // com.google.android.gms.ads.internal.client.zza
    public final void onAdClicked() {
        zzclx zzclxVar = this.n;
        if (zzclxVar != null) {
            zzclxVar.onAdClicked();
        }
    }

    @Override // android.webkit.WebView, android.view.ViewGroup, android.view.View
    public final synchronized void onAttachedToWindow() {
        try {
            super.onAttachedToWindow();
            if (!q()) {
                this.P.zzd();
            }
            if (this.b0) {
                onResume();
                this.b0 = false;
            }
            boolean z = this.B;
            zzclx zzclxVar = this.n;
            if (zzclxVar != null && zzclxVar.p0()) {
                if (!this.C) {
                    synchronized (this.n.d) {
                    }
                    synchronized (this.n.d) {
                    }
                    this.C = true;
                }
                p0();
                z = true;
            }
            A0(z);
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        zzclx zzclxVar;
        synchronized (this) {
            try {
                if (!q()) {
                    this.P.zze();
                }
                super.onDetachedFromWindow();
                if (this.C && (zzclxVar = this.n) != null && zzclxVar.p0() && getViewTreeObserver() != null && getViewTreeObserver().isAlive()) {
                    synchronized (this.n.d) {
                    }
                    synchronized (this.n.d) {
                    }
                    this.C = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        A0(false);
    }

    @Override // android.webkit.DownloadListener
    public final void onDownloadStart(String str, String str2, String str3, String str4, long j) {
        try {
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setDataAndType(Uri.parse(str), str4);
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.Ic)).booleanValue() && getContext() != null) {
                intent.setPackage(getContext().getPackageName());
            }
            com.google.android.gms.ads.internal.zzt.zzc();
            com.google.android.gms.ads.internal.util.zzs.zzY(getContext(), intent);
        } catch (ActivityNotFoundException e) {
            String o = fc6.o(new StringBuilder(String.valueOf(str).length() + 51 + String.valueOf(str4).length()), "Couldn't find an Activity to view url/mimetype: ", str, " / ", str4);
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            zzo.zzd(o);
            com.google.android.gms.ads.internal.zzt.zzh().d("AdWebViewImpl.onDownloadStart: ".concat(String.valueOf(str)), e);
        }
    }

    @Override // android.webkit.WebView, android.view.View
    public final void onDraw(Canvas canvas) {
        if (q()) {
            return;
        }
        super.onDraw(canvas);
    }

    @Override // android.webkit.WebView, android.view.View
    public final boolean onGenericMotionEvent(MotionEvent motionEvent) {
        float axisValue = motionEvent.getAxisValue(9);
        float axisValue2 = motionEvent.getAxisValue(10);
        if (motionEvent.getActionMasked() == 8) {
            if (axisValue > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && !canScrollVertically(-1)) {
                return false;
            }
            if (axisValue < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && !canScrollVertically(1)) {
                return false;
            }
            if (axisValue2 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && !canScrollHorizontally(-1)) {
                return false;
            }
            if (axisValue2 < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && !canScrollHorizontally(1)) {
                return false;
            }
        }
        return super.onGenericMotionEvent(motionEvent);
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        boolean p0 = p0();
        com.google.android.gms.ads.internal.overlay.zzm zzL = zzL();
        if (zzL == null || !p0) {
            return;
        }
        zzL.zzB();
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x01d3 A[Catch: all -> 0x000d, TRY_ENTER, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0008, B:9:0x0010, B:11:0x0016, B:13:0x001a, B:18:0x0025, B:23:0x002d, B:25:0x003f, B:28:0x0044, B:30:0x004b, B:33:0x0055, B:36:0x005a, B:39:0x006b, B:40:0x0083, B:44:0x0072, B:47:0x0077, B:53:0x0093, B:55:0x00a5, B:58:0x00aa, B:60:0x00c6, B:61:0x00ce, B:64:0x00ca, B:65:0x00d3, B:67:0x00d9, B:70:0x00e4, B:77:0x0108, B:79:0x010f, B:82:0x0116, B:84:0x0128, B:86:0x0136, B:89:0x0143, B:93:0x0148, B:95:0x01bc, B:96:0x01bf, B:98:0x01c6, B:103:0x01d3, B:105:0x01d9, B:106:0x01dc, B:108:0x01e0, B:109:0x01e9, B:115:0x01f4), top: B:2:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0128 A[Catch: all -> 0x000d, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0008, B:9:0x0010, B:11:0x0016, B:13:0x001a, B:18:0x0025, B:23:0x002d, B:25:0x003f, B:28:0x0044, B:30:0x004b, B:33:0x0055, B:36:0x005a, B:39:0x006b, B:40:0x0083, B:44:0x0072, B:47:0x0077, B:53:0x0093, B:55:0x00a5, B:58:0x00aa, B:60:0x00c6, B:61:0x00ce, B:64:0x00ca, B:65:0x00d3, B:67:0x00d9, B:70:0x00e4, B:77:0x0108, B:79:0x010f, B:82:0x0116, B:84:0x0128, B:86:0x0136, B:89:0x0143, B:93:0x0148, B:95:0x01bc, B:96:0x01bf, B:98:0x01c6, B:103:0x01d3, B:105:0x01d9, B:106:0x01dc, B:108:0x01e0, B:109:0x01e9, B:115:0x01f4), top: B:2:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0148 A[Catch: all -> 0x000d, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0008, B:9:0x0010, B:11:0x0016, B:13:0x001a, B:18:0x0025, B:23:0x002d, B:25:0x003f, B:28:0x0044, B:30:0x004b, B:33:0x0055, B:36:0x005a, B:39:0x006b, B:40:0x0083, B:44:0x0072, B:47:0x0077, B:53:0x0093, B:55:0x00a5, B:58:0x00aa, B:60:0x00c6, B:61:0x00ce, B:64:0x00ca, B:65:0x00d3, B:67:0x00d9, B:70:0x00e4, B:77:0x0108, B:79:0x010f, B:82:0x0116, B:84:0x0128, B:86:0x0136, B:89:0x0143, B:93:0x0148, B:95:0x01bc, B:96:0x01bf, B:98:0x01c6, B:103:0x01d3, B:105:0x01d9, B:106:0x01dc, B:108:0x01e0, B:109:0x01e9, B:115:0x01f4), top: B:2:0x0001 }] */
    @Override // android.webkit.WebView, android.widget.AbsoluteLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized void onMeasure(int i, int i2) {
        zzcnw zzcnwVar;
        int i3;
        int i4;
        boolean z;
        int i5;
        int i6;
        int i7 = 0;
        if (q()) {
            setMeasuredDimension(0, 0);
            return;
        }
        if (!isInEditMode() && !this.v && (i3 = (zzcnwVar = this.r).a) != 0) {
            if (i3 == 5) {
                super.onMeasure(i, i2);
                return;
            }
            if (i3 == 4) {
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.S4)).booleanValue()) {
                    super.onMeasure(i, i2);
                    return;
                }
                zzcms zzh = zzh();
                float zzm = zzh != null ? zzh.zzm() : 0.0f;
                if (zzm == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                    super.onMeasure(i, i2);
                    return;
                }
                int size = View.MeasureSpec.getSize(i);
                int size2 = View.MeasureSpec.getSize(i2);
                float f = size2 * zzm;
                int i8 = (int) (size / zzm);
                if (size2 == 0) {
                    if (i8 != 0) {
                        i6 = (int) (i8 * zzm);
                        i7 = size;
                        i5 = i8;
                        setMeasuredDimension(Math.min(i6, i7), Math.min(i8, i5));
                        return;
                    }
                    size2 = 0;
                }
                int i9 = (int) f;
                if (size != 0) {
                    i7 = size;
                } else if (i9 != 0) {
                    i8 = (int) (i9 / zzm);
                    i5 = size2;
                    i6 = i9;
                    i7 = i6;
                    setMeasuredDimension(Math.min(i6, i7), Math.min(i8, i5));
                    return;
                }
                i5 = size2;
                i6 = i9;
                setMeasuredDimension(Math.min(i6, i7), Math.min(i8, i5));
                return;
            }
            if (i3 == 2) {
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.a5)).booleanValue()) {
                    super.onMeasure(i, i2);
                    return;
                }
                T("/contentHeight", new dun(this, i7));
                q0("(function() {  var height = -1;  if (document.body) {    height = document.body.offsetHeight;  } else if (document.documentElement) {    height = document.documentElement.offsetHeight;  }  var url = 'gmsg://mobileads.google.com/contentHeight?';  url += 'height=' + height;  try {    window.googleAdsJsInterface.notify(url);  } catch (e) {    var frame = document.getElementById('afma-notify-fluid');    if (!frame) {      frame = document.createElement('IFRAME');      frame.id = 'afma-notify-fluid';      frame.style.display = 'none';      var body = document.body || document.documentElement;      body.appendChild(frame);    }    frame.src = url;  }})();");
                float f2 = this.h.density;
                int size3 = View.MeasureSpec.getSize(i);
                int i10 = this.H;
                setMeasuredDimension(size3, i10 != -1 ? (int) (i10 * f2) : View.MeasureSpec.getSize(i2));
                return;
            }
            if (zzcnwVar.b()) {
                DisplayMetrics displayMetrics = this.h;
                setMeasuredDimension(displayMetrics.widthPixels, displayMetrics.heightPixels);
                return;
            }
            int mode = View.MeasureSpec.getMode(i);
            int size4 = View.MeasureSpec.getSize(i);
            int mode2 = View.MeasureSpec.getMode(i2);
            int size5 = View.MeasureSpec.getSize(i2);
            if (mode != Integer.MIN_VALUE && mode != 1073741824) {
                i4 = Integer.MAX_VALUE;
                int i11 = (mode2 != Integer.MIN_VALUE || mode2 == 1073741824) ? size5 : Integer.MAX_VALUE;
                zzcnw zzcnwVar2 = this.r;
                z = zzcnwVar2.c <= i4 || zzcnwVar2.b > i11;
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.D6)).booleanValue()) {
                    zzcnw zzcnwVar3 = this.r;
                    float f3 = zzcnwVar3.c;
                    float f4 = this.i;
                    z &= f3 / f4 <= ((float) i4) / f4 && ((float) zzcnwVar3.b) / f4 <= ((float) i11) / f4;
                }
                if (z) {
                    if (getVisibility() != 8) {
                        setVisibility(0);
                    }
                    if (!this.m) {
                        this.a0.c(Sdk.SDKError.Reason.AD_LOAD_TOO_FREQUENTLY_VALUE);
                        this.m = true;
                    }
                    zzcnw zzcnwVar4 = this.r;
                    setMeasuredDimension(zzcnwVar4.c, zzcnwVar4.b);
                    return;
                }
                float f5 = this.r.c;
                float f6 = this.i;
                int i12 = (int) (f5 / f6);
                int i13 = (int) (r2.b / f6);
                int i14 = (int) (size4 / f6);
                int i15 = (int) (size5 / f6);
                StringBuilder sb = new StringBuilder(String.valueOf(i12).length() + 36 + String.valueOf(i13).length() + 18 + String.valueOf(i14).length() + 1 + String.valueOf(i15).length() + 4);
                sb.append("Not enough space to show ad. Needs ");
                sb.append(i12);
                sb.append("x");
                sb.append(i13);
                sb.append(" dp, but only has ");
                sb.append(i14);
                sb.append("x");
                sb.append(i15);
                sb.append(" dp.");
                String sb2 = sb.toString();
                int i16 = com.google.android.gms.ads.internal.util.zze.zza;
                zzo.zzi(sb2);
                if (getVisibility() != 8) {
                    setVisibility(4);
                }
                setMeasuredDimension(0, 0);
                if (this.l) {
                    return;
                }
                this.a0.c(Sdk.SDKError.Reason.AD_NO_FILL_VALUE);
                this.l = true;
                return;
            }
            i4 = size4;
            if (mode2 != Integer.MIN_VALUE) {
            }
            zzcnw zzcnwVar22 = this.r;
            if (zzcnwVar22.c <= i4) {
            }
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.D6)).booleanValue()) {
            }
            if (z) {
            }
        }
        super.onMeasure(i, i2);
    }

    @Override // android.webkit.WebView, com.google.android.gms.internal.ads.zzclm
    public final void onPause() {
        if (q()) {
            return;
        }
        try {
            super.onPause();
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.me)).booleanValue() && y0l.b("MUTE_AUDIO")) {
                int i = com.google.android.gms.ads.internal.util.zze.zza;
                zzo.zzd("Muting webview");
                v0l.e(this, true);
            }
        } catch (Exception e) {
            int i2 = com.google.android.gms.ads.internal.util.zze.zza;
            zzo.zzg("Could not pause webview.", e);
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.pe)).booleanValue()) {
                com.google.android.gms.ads.internal.zzt.zzh().d("AdWebViewImpl.onPause", e);
            }
        }
    }

    @Override // android.webkit.WebView, com.google.android.gms.internal.ads.zzclm
    public final void onResume() {
        if (q()) {
            return;
        }
        try {
            super.onResume();
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.me)).booleanValue() && y0l.b("MUTE_AUDIO")) {
                int i = com.google.android.gms.ads.internal.util.zze.zza;
                zzo.zzd("Unmuting webview");
                v0l.e(this, false);
            }
        } catch (Exception e) {
            int i2 = com.google.android.gms.ads.internal.util.zze.zza;
            zzo.zzg("Could not resume webview.", e);
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.pe)).booleanValue()) {
                com.google.android.gms.ads.internal.zzt.zzh().d("AdWebViewImpl.onResume", e);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0094 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x004c  */
    @Override // android.webkit.WebView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z;
        boolean z2;
        boolean z3;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.A4)).booleanValue()) {
            zzclx zzclxVar = this.n;
            synchronized (zzclxVar.d) {
                z3 = zzclxVar.s;
            }
            if (z3) {
                z = true;
                if (this.n.p0()) {
                    zzclx zzclxVar2 = this.n;
                    synchronized (zzclxVar2.d) {
                        z2 = zzclxVar2.t;
                    }
                    if (z2) {
                    }
                    synchronized (this) {
                        try {
                            zzbmi zzbmiVar = this.D;
                            if (zzbmiVar != null) {
                                zzbmiVar.d(motionEvent);
                            }
                        } finally {
                        }
                    }
                    if (q()) {
                        return super.onTouchEvent(motionEvent);
                    }
                    return false;
                }
                if (!z) {
                    zzbbd zzbbdVar = this.b;
                    if (zzbbdVar != null) {
                        zzbbdVar.b.zzd(motionEvent);
                    }
                    zzbkn zzbknVar = this.d;
                    if (zzbknVar != null) {
                        if (motionEvent.getAction() == 1 && motionEvent.getEventTime() > zzbknVar.a.getEventTime()) {
                            zzbknVar.a = MotionEvent.obtain(motionEvent);
                        } else if (motionEvent.getAction() == 0 && motionEvent.getEventTime() > zzbknVar.b.getEventTime()) {
                            zzbknVar.b = MotionEvent.obtain(motionEvent);
                        }
                    }
                    if (q()) {
                    }
                }
                synchronized (this) {
                }
            }
        }
        z = false;
        if (this.n.p0()) {
        }
        if (!z) {
        }
        synchronized (this) {
        }
    }

    @Override // com.google.android.gms.internal.ads.zzclm, com.google.android.gms.internal.ads.zzcnf
    public final zzbbd p() {
        return this.b;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0083, code lost:
    
        if (r10.U != r8) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00a3, code lost:
    
        if (r10.U != r8) goto L36;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean p0() {
        int i;
        int i2;
        boolean z = false;
        if (this.n.n0() || this.n.p0()) {
            com.google.android.gms.ads.internal.client.zzay.zza();
            DisplayMetrics displayMetrics = this.h;
            int zzC = com.google.android.gms.ads.internal.util.client.zzf.zzC(displayMetrics, displayMetrics.widthPixels);
            com.google.android.gms.ads.internal.client.zzay.zza();
            int zzC2 = com.google.android.gms.ads.internal.util.client.zzf.zzC(displayMetrics, displayMetrics.heightPixels);
            Activity activity = this.a.a;
            if (activity == null || activity.getWindow() == null) {
                i = zzC;
                i2 = zzC2;
            } else {
                com.google.android.gms.ads.internal.zzt.zzc();
                int[] zzV = com.google.android.gms.ads.internal.util.zzs.zzV(activity);
                com.google.android.gms.ads.internal.client.zzay.zza();
                i = com.google.android.gms.ads.internal.util.client.zzf.zzC(displayMetrics, zzV[0]);
                com.google.android.gms.ads.internal.client.zzay.zza();
                i2 = com.google.android.gms.ads.internal.util.client.zzf.zzC(displayMetrics, zzV[1]);
            }
            com.google.android.gms.ads.internal.zzt.zzc();
            int rotation = this.W.getDefaultDisplay().getRotation();
            if (this.R == zzC && this.Q == zzC2 && this.S == i && this.T == i2) {
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.K0)).booleanValue()) {
                }
            }
            if (this.R == zzC && this.Q == zzC2) {
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.K0)).booleanValue()) {
                }
                this.R = zzC;
                this.Q = zzC2;
                this.S = i;
                this.T = i2;
                this.U = rotation;
                new zzbyy(this, "").e(zzC, zzC2, i, i2, rotation, displayMetrics.density);
                return z;
            }
            z = true;
            this.R = zzC;
            this.Q = zzC2;
            this.S = i;
            this.T = i2;
            this.U = rotation;
            new zzbyy(this, "").e(zzC, zzC2, i, i2, rotation, displayMetrics.density);
            return z;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzclm
    public final synchronized boolean q() {
        return this.u;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0053  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void q0(String str) {
        Boolean bool;
        Boolean bool2;
        Boolean bool3;
        synchronized (this) {
            bool = this.x;
        }
        if (bool == null) {
            synchronized (this) {
                zzcfv zzh = com.google.android.gms.ads.internal.zzt.zzh();
                synchronized (zzh.a) {
                    bool3 = zzh.j;
                }
                this.x = bool3;
                if (bool3 == null) {
                    try {
                        evaluateJavascript("(function(){})()", null);
                        r0(Boolean.TRUE);
                    } catch (IllegalStateException unused) {
                        r0(Boolean.FALSE);
                    }
                }
            }
            if (!bool2.booleanValue()) {
                synchronized (this) {
                    if (q()) {
                        int i = com.google.android.gms.ads.internal.util.zze.zza;
                        zzo.zzi("#004 The webview is destroyed. Ignoring action.");
                    } else {
                        evaluateJavascript(str, null);
                    }
                }
                return;
            }
            String concat = "javascript:".concat(str);
            synchronized (this) {
                if (q()) {
                    int i2 = com.google.android.gms.ads.internal.util.zze.zza;
                    zzo.zzi("#004 The webview is destroyed. Ignoring action.");
                } else {
                    loadUrl(concat);
                }
            }
            return;
        }
        synchronized (this) {
            bool2 = this.x;
            if (!bool2.booleanValue()) {
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzclm
    public final void r() {
        com.google.android.gms.ads.internal.util.zze.zza("Cannot add text view to inner AdWebView");
    }

    public final void r0(Boolean bool) {
        synchronized (this) {
            this.x = bool;
        }
        zzcfv zzh = com.google.android.gms.ads.internal.zzt.zzh();
        synchronized (zzh.a) {
            zzh.j = bool;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzclm
    public final synchronized zzeml s() {
        return this.p;
    }

    @Override // android.webkit.WebView, com.google.android.gms.internal.ads.zzclm
    public final void setWebViewClient(WebViewClient webViewClient) {
        super.setWebViewClient(webViewClient);
        if (webViewClient instanceof zzclx) {
            this.n = (zzclx) webViewClient;
        }
    }

    @Override // android.webkit.WebView
    public final void stopLoading() {
        if (q()) {
            return;
        }
        try {
            super.stopLoading();
        } catch (Exception e) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            zzo.zzg("Could not stop loading webview.", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbte
    public final void t(String str, JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        StringBuilder s = mz1.s("(window.AFMA_ReceiveMessage || function() {})('", str, "',", jSONObject.toString(), ");");
        String sb = s.toString();
        int i = com.google.android.gms.ads.internal.util.zze.zza;
        zzo.zzd("Dispatching AFMA event: ".concat(sb));
        q0(s.toString());
    }

    public final /* synthetic */ void t0(String str, ValueCallback valueCallback) {
        super.evaluateJavascript(str, valueCallback);
    }

    @Override // com.google.android.gms.internal.ads.zzclm
    public final synchronized void u() {
        com.google.android.gms.ads.internal.util.zze.zza("Destroying WebView!");
        y0();
        com.google.android.gms.ads.internal.util.zzs.zza.post(new eun(this, 0));
    }

    public final /* synthetic */ void u0(String str) {
        super.loadUrl(str);
    }

    @Override // com.google.android.gms.internal.ads.zzclm
    public final void v() {
        if (this.K == null) {
            zzbjt zzbjtVar = this.L;
            zzbjv zzbjvVar = zzbjtVar.b;
            zzbjs zzbjsVar = new zzbjs(com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime(), null, null);
            this.K = zzbjsVar;
            zzbjtVar.a.put("native:view_load", zzbjsVar);
        }
    }

    public final /* synthetic */ void v0() {
        super.loadUrl(AndroidWebViewClient.BLANK_PAGE);
    }

    @Override // com.google.android.gms.internal.ads.zzclm
    public final synchronized com.google.android.gms.ads.internal.overlay.zzm w() {
        return this.N;
    }

    public final synchronized void w0() {
        try {
            com.google.android.gms.ads.internal.util.zzs.zza.post(new eun(this, 1));
        } catch (Throwable th) {
            com.google.android.gms.ads.internal.zzt.zzh().d("AdWebViewImpl.loadUrlUnsafe", th);
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            zzo.zzj("Could not call loadUrl in destroy(). ", th);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzclm
    public final boolean x() {
        return false;
    }

    public final synchronized void x0() {
        try {
            zzfld zzfldVar = this.j;
            if (zzfldVar != null && zzfldVar.m0) {
                int i = com.google.android.gms.ads.internal.util.zze.zza;
                zzo.zzd("Disabling hardware acceleration on an overlay.");
                synchronized (this) {
                    try {
                        if (!this.w) {
                            setLayerType(1, null);
                        }
                        this.w = true;
                    } finally {
                    }
                }
                return;
            }
            if (!this.v && !this.r.b()) {
                int i2 = com.google.android.gms.ads.internal.util.zze.zza;
                zzo.zzd("Enabling hardware acceleration on an AdView.");
                synchronized (this) {
                    try {
                        if (this.w) {
                            setLayerType(0, null);
                        }
                        this.w = false;
                    } finally {
                    }
                }
                return;
            }
            int i3 = com.google.android.gms.ads.internal.util.zze.zza;
            zzo.zzd("Enabling hardware acceleration on an overlay.");
            synchronized (this) {
                try {
                    if (this.w) {
                        setLayerType(0, null);
                    }
                    this.w = false;
                } finally {
                }
            }
            return;
        } catch (Throwable th) {
            throw th;
        }
        throw th;
    }

    @Override // com.google.android.gms.internal.ads.zzclm
    public final synchronized boolean y() {
        return this.G > 0;
    }

    public final synchronized void y0() {
        if (this.O) {
            return;
        }
        this.O = true;
        com.google.android.gms.ads.internal.zzt.zzh().k.decrementAndGet();
    }

    @Override // com.google.android.gms.internal.ads.zzclm
    public final synchronized zzbmi z() {
        return this.D;
    }

    public final synchronized void z0() {
        try {
            HashMap hashMap = this.V;
            if (hashMap != null) {
                Iterator it = hashMap.values().iterator();
                while (it.hasNext()) {
                    ((zzcjs) it.next()).release();
                }
            }
            this.V = null;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzclm
    public final ArrayList zzF() {
        return new ArrayList();
    }

    @Override // com.google.android.gms.internal.ads.zzclm
    public final void zzJ() {
        HashMap hashMap = new HashMap(3);
        hashMap.put("app_muted", String.valueOf(com.google.android.gms.ads.internal.zzt.zzi().zzd()));
        hashMap.put("app_volume", String.valueOf(com.google.android.gms.ads.internal.zzt.zzi().zzb()));
        hashMap.put("device_volume", String.valueOf(com.google.android.gms.ads.internal.util.zzaa.zze(getContext())));
        n("volume", hashMap);
    }

    @Override // com.google.android.gms.internal.ads.zzclm
    public final synchronized com.google.android.gms.ads.internal.overlay.zzm zzL() {
        return this.o;
    }

    @Override // com.google.android.gms.internal.ads.zzclm
    public final synchronized zzcnw zzN() {
        return this.r;
    }

    @Override // com.google.android.gms.internal.ads.zzclm
    public final /* synthetic */ zzclx zzP() {
        return this.n;
    }

    @Override // com.google.android.gms.internal.ads.zzclm
    public final synchronized boolean zzR() {
        return this.t;
    }

    @Override // com.google.android.gms.internal.ads.zzclm
    public final zzfma zzT() {
        return this.c;
    }

    @Override // com.google.android.gms.internal.ads.zzbtq
    public final void zza(String str) {
        q0(str);
    }

    @Override // com.google.android.gms.ads.internal.zzn
    public final synchronized void zzdk() {
        zzn zznVar = this.f;
        if (zznVar != null) {
            zznVar.zzdk();
        }
    }

    @Override // com.google.android.gms.ads.internal.zzn
    public final synchronized void zzdl() {
        zzn zznVar = this.f;
        if (zznVar != null) {
            zznVar.zzdl();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzclm, com.google.android.gms.internal.ads.zzcif
    public final synchronized zzcms zzh() {
        return this.A;
    }

    @Override // com.google.android.gms.internal.ads.zzcif
    public final zzbjs zzi() {
        return this.J;
    }

    @Override // com.google.android.gms.internal.ads.zzclm
    public final Activity zzj() {
        return this.a.a;
    }

    @Override // com.google.android.gms.internal.ads.zzclm, com.google.android.gms.internal.ads.zzcif
    public final com.google.android.gms.ads.internal.zza zzk() {
        return this.g;
    }

    @Override // com.google.android.gms.internal.ads.zzcif
    public final void zzl() {
        com.google.android.gms.ads.internal.overlay.zzm zzL = zzL();
        if (zzL != null) {
            zzL.zzD();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcif
    public final synchronized String zzn() {
        zzflg zzflgVar = this.k;
        if (zzflgVar == null) {
            return null;
        }
        return zzflgVar.b;
    }

    @Override // com.google.android.gms.internal.ads.zzcif
    public final synchronized int zzp() {
        return this.M;
    }

    @Override // com.google.android.gms.internal.ads.zzclm
    public final zzbjt zzq() {
        return this.L;
    }

    @Override // com.google.android.gms.internal.ads.zzclm, com.google.android.gms.internal.ads.zzcng, com.google.android.gms.internal.ads.zzcif
    public final VersionInfoParcel zzs() {
        return this.e;
    }

    @Override // com.google.android.gms.internal.ads.zzcif
    public final int zzx() {
        return getMeasuredHeight();
    }

    @Override // com.google.android.gms.internal.ads.zzcif
    public final synchronized void zzz() {
        zzdux zzduxVar = this.E;
        if (zzduxVar != null) {
            com.google.android.gms.ads.internal.util.zzs.zza.post(new fsn(zzduxVar, 24));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzclm
    public final WebView zzD() {
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzclm, com.google.android.gms.internal.ads.zzcnh
    public final View zzE() {
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzcif
    public final void zzv(int i) {
    }
}
