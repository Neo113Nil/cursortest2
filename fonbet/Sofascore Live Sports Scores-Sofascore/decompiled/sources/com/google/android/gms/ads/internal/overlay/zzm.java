package com.google.android.gms.ads.internal.overlay;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.view.textclassifier.TextClassifier;
import android.webkit.CookieManager;
import android.webkit.WebChromeClient;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import android.widget.Toolbar;
import com.google.android.gms.ads.impl.R;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbif;
import com.google.android.gms.internal.ads.zzbjg;
import com.google.android.gms.internal.ads.zzbox;
import com.google.android.gms.internal.ads.zzboz;
import com.google.android.gms.internal.ads.zzbyy;
import com.google.android.gms.internal.ads.zzbzm;
import com.google.android.gms.internal.ads.zzbzs;
import com.google.android.gms.internal.ads.zzclm;
import com.google.android.gms.internal.ads.zzclx;
import com.google.android.gms.internal.ads.zzcmc;
import com.google.android.gms.internal.ads.zzcni;
import com.google.android.gms.internal.ads.zzcnw;
import com.google.android.gms.internal.ads.zzdec;
import com.google.android.gms.internal.ads.zzdlw;
import com.google.android.gms.internal.ads.zzeai;
import com.google.android.gms.internal.ads.zzeaj;
import com.google.android.gms.internal.ads.zzelr;
import com.google.android.gms.internal.ads.zzemj;
import com.google.android.gms.internal.ads.zzeml;
import com.google.android.gms.internal.ads.zzfvp;
import com.google.android.gms.internal.ads.zzfvy;
import com.google.android.gms.internal.ads.zzgbp;
import com.ironsource.mediationsdk.metadata.a;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import defpackage.bea;
import defpackage.inn;
import defpackage.k4o;
import defpackage.w1l;
import defpackage.yhk;
import java.util.Collections;
import java.util.concurrent.ScheduledFuture;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public class zzm extends zzbzs implements zzah {
    public static final int x = Color.argb(0, 0, 0, 0);
    public static final /* synthetic */ int zzp = 0;
    public final Activity a;
    public AdOverlayInfoParcel b;
    public zzclm c;
    public zzj d;
    public zzu e;
    public FrameLayout g;
    public WebChromeClient.CustomViewCallback h;
    public zzi k;
    public Runnable p;
    public boolean q;
    public boolean r;
    public Toolbar v;
    public boolean f = false;
    public boolean i = false;
    public boolean j = false;
    public boolean l = false;
    public int w = 1;
    public int m = 0;
    public final Object n = new Object();
    public final View.OnClickListener o = new zzd(this);
    public boolean s = false;
    public boolean t = false;
    public boolean u = true;

    public zzm(Activity activity) {
        this.a = activity;
    }

    public static final void G4(zzeml zzemlVar, View view) {
        if (zzemlVar == null || view == null) {
            return;
        }
        if (((Boolean) zzba.zzc().a(zzbjg.s6)).booleanValue() && zzemlVar.b.g == zzfvp.HTML) {
            return;
        }
        com.google.android.gms.ads.internal.zzt.zzu().c(zzemlVar.a, view);
    }

    public final void E4() {
        zzclm zzclmVar;
        zzr zzrVar;
        if (this.t) {
            return;
        }
        this.t = true;
        zzclm zzclmVar2 = this.c;
        if (zzclmVar2 != null) {
            this.k.removeView(zzclmVar2.zzE());
            zzj zzjVar = this.d;
            if (zzjVar != null) {
                this.c.H(zzjVar.zzd);
                this.c.V(false);
                if (((Boolean) zzba.zzc().a(zzbjg.re)).booleanValue() && this.c.getParent() != null) {
                    ((ViewGroup) this.c.getParent()).removeView(this.c.zzE());
                }
                ViewGroup viewGroup = this.d.zzc;
                View zzE = this.c.zzE();
                zzj zzjVar2 = this.d;
                viewGroup.addView(zzE, zzjVar2.zza, zzjVar2.zzb);
                this.d = null;
            } else {
                Activity activity = this.a;
                if (activity.getApplicationContext() != null) {
                    this.c.H(activity.getApplicationContext());
                }
            }
            this.c = null;
        }
        AdOverlayInfoParcel adOverlayInfoParcel = this.b;
        if (adOverlayInfoParcel != null && (zzrVar = adOverlayInfoParcel.zzc) != null) {
            zzrVar.zzdW(this.w);
        }
        AdOverlayInfoParcel adOverlayInfoParcel2 = this.b;
        if (adOverlayInfoParcel2 == null || (zzclmVar = adOverlayInfoParcel2.zzd) == null) {
            return;
        }
        G4(zzclmVar.s(), this.b.zzd.zzE());
    }

    public final void F4(View view) {
        zzeml s;
        zzemj a;
        zzclm zzclmVar = this.c;
        if (zzclmVar == null) {
            return;
        }
        if (!((Boolean) zzba.zzc().a(zzbjg.t6)).booleanValue() || (a = zzclmVar.a()) == null) {
            if (((Boolean) zzba.zzc().a(zzbjg.s6)).booleanValue() && (s = zzclmVar.s()) != null && s.b.g == zzfvp.HTML) {
                com.google.android.gms.ads.internal.zzt.zzu().b(s.a, view);
                return;
            }
            return;
        }
        synchronized (a) {
            zzfvy zzfvyVar = a.f;
            if (zzfvyVar != null) {
                com.google.android.gms.ads.internal.zzt.zzu().a(zzfvyVar, view);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:116:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x021c  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x022c  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0312  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0322  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0210  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00c7 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void W1(boolean z) {
        boolean z2;
        boolean z3;
        boolean z4;
        Window window;
        int i;
        int i2;
        zzclm zzclmVar;
        boolean z5 = this.r;
        Activity activity = this.a;
        if (!z5) {
            activity.requestWindowFeature(1);
        }
        Window window2 = activity.getWindow();
        if (window2 == null) {
            throw new zzh("Invalid activity, no window available.");
        }
        zzclm zzclmVar2 = this.b.zzd;
        zzclx zzP = zzclmVar2 != null ? zzclmVar2.zzP() : null;
        boolean z6 = zzP != null && zzP.n0();
        this.l = false;
        if (z6) {
            int i3 = this.b.zzj;
            if (i3 == 6) {
                z2 = activity.getResources().getConfiguration().orientation == 1;
                this.l = z2;
            } else if (i3 == 7) {
                z2 = activity.getResources().getConfiguration().orientation == 2;
                this.l = z2;
            }
            StringBuilder sb = new StringBuilder(String.valueOf(z2).length() + 41);
            sb.append("Delay onShow to next orientation change: ");
            sb.append(z2);
            String sb2 = sb.toString();
            int i4 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzd(sb2);
            zzv(this.b.zzj);
            window2.setFlags(C.DEFAULT_MUXED_BUFFER_SIZE, C.DEFAULT_MUXED_BUFFER_SIZE);
            com.google.android.gms.ads.internal.util.client.zzo.zzd("Hardware acceleration on the AdActivity window enabled.");
            activity.setContentView(this.k);
            this.r = true;
            z3 = this.j;
            zzi zziVar = this.k;
            if (z3) {
                zziVar.setBackgroundColor(-16777216);
            } else {
                zziVar.setBackgroundColor(x);
                if (((Boolean) zzba.zzc().a(zzbjg.z1)).booleanValue() && Build.VERSION.SDK_INT >= 31) {
                    window2.setBackgroundBlurRadius(this.m);
                }
            }
            if (z) {
                window = window2;
                z4 = z6;
                i = 31;
                zzclm zzclmVar3 = this.b.zzd;
                this.c = zzclmVar3;
                zzclmVar3.H(activity);
            } else {
                try {
                    com.google.android.gms.ads.internal.zzt.zzd();
                    zzclm zzclmVar4 = this.b.zzd;
                    zzcnw zzN = zzclmVar4 != null ? zzclmVar4.zzN() : null;
                    zzclm zzclmVar5 = this.b.zzd;
                    String m = zzclmVar5 != null ? zzclmVar5.m() : null;
                    AdOverlayInfoParcel adOverlayInfoParcel = this.b;
                    VersionInfoParcel versionInfoParcel = adOverlayInfoParcel.zzm;
                    zzclm zzclmVar6 = adOverlayInfoParcel.zzd;
                    z4 = z6;
                    window = window2;
                    i = 31;
                    zzclm a = zzcmc.a(activity, zzN, m, true, z4, null, null, versionInfoParcel, null, zzclmVar6 != null ? zzclmVar6.zzk() : null, zzbif.a(), null, null, null, null, null);
                    this.c = a;
                    zzclx zzP2 = a.zzP();
                    AdOverlayInfoParcel adOverlayInfoParcel2 = this.b;
                    zzbox zzboxVar = adOverlayInfoParcel2.zzp;
                    zzboz zzbozVar = adOverlayInfoParcel2.zze;
                    zzad zzadVar = adOverlayInfoParcel2.zzi;
                    zzclm zzclmVar7 = adOverlayInfoParcel2.zzd;
                    zzP2.L(null, zzboxVar, null, zzbozVar, zzadVar, true, null, zzclmVar7 != null ? zzclmVar7.zzP().w : null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
                    this.c.zzP().g = new zzcni() { // from class: com.google.android.gms.ads.internal.overlay.zzg
                        @Override // com.google.android.gms.internal.ads.zzcni
                        public final /* synthetic */ void zza(boolean z7, int i5, String str, String str2) {
                            zzclm zzclmVar8 = zzm.this.c;
                            if (zzclmVar8 != null) {
                                zzclmVar8.l();
                            }
                        }
                    };
                    AdOverlayInfoParcel adOverlayInfoParcel3 = this.b;
                    String str = adOverlayInfoParcel3.zzl;
                    if (str != null) {
                        this.c.loadUrl(str);
                    } else {
                        String str2 = adOverlayInfoParcel3.zzh;
                        if (str2 == null) {
                            throw new zzh("No URL or HTML to display in ad overlay.");
                        }
                        this.c.loadDataWithBaseURL(adOverlayInfoParcel3.zzf, str2, "text/html", C.UTF8_NAME, null);
                    }
                    zzclm zzclmVar8 = this.b.zzd;
                    if (zzclmVar8 != null) {
                        zzclmVar8.g0(this);
                    }
                } catch (Exception e) {
                    com.google.android.gms.ads.internal.util.client.zzo.zzg("Error obtaining webview.", e);
                    throw new zzh("Could not obtain webview for the overlay.", e);
                }
            }
            if (this.b.zzw) {
                i2 = 0;
            } else {
                i2 = 0;
                CookieManager.getInstance().setAcceptThirdPartyCookies(this.c.zzD(), false);
                if (((Boolean) zzba.zzc().a(zzbjg.G1)).booleanValue() && Build.VERSION.SDK_INT >= 27) {
                    this.c.zzD().setTextClassifier(TextClassifier.NO_OP);
                }
                if (((Boolean) zzba.zzc().a(zzbjg.H1)).booleanValue()) {
                    this.c.zzD().setDownloadListener(zze.a);
                }
            }
            this.c.F(this);
            zzclmVar = this.b.zzd;
            if (zzclmVar != null) {
                G4(zzclmVar.s(), this.k);
            }
            if (this.b.zzk != 5) {
                ViewParent parent = this.c.getParent();
                if (parent instanceof ViewGroup) {
                    ((ViewGroup) parent).removeView(this.c.zzE());
                }
                if (this.j) {
                    this.c.k();
                    if (((Boolean) zzba.zzc().a(zzbjg.z1)).booleanValue() && Build.VERSION.SDK_INT >= i) {
                        window.setBackgroundBlurRadius(this.m);
                    }
                }
                if (this.b.zzw) {
                    Toolbar toolbar = new Toolbar(activity);
                    this.v = toolbar;
                    toolbar.setId(View.generateViewId());
                    this.c.zzE().setId(View.generateViewId());
                    this.v.setBackgroundColor(-12303292);
                    this.v.setVisibility(i2);
                    try {
                        this.v.setNavigationIcon(com.google.android.gms.ads.internal.zzt.zzh().c().getDrawable(R.drawable.admob_close_button_white_cross, null));
                    } catch (Resources.NotFoundException | NullPointerException e2) {
                        com.google.android.gms.ads.internal.util.zze.zzb("Error obtaining close icon.", e2);
                    }
                    this.v.setNavigationOnClickListener(this.o);
                    this.v.setTitleMarginStart(i2);
                    RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
                    layoutParams.addRule(10);
                    this.k.addView(this.v, layoutParams);
                    RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -2);
                    layoutParams2.addRule(3, this.v.getId());
                    layoutParams2.addRule(12);
                    this.k.addView(this.c.zzE(), layoutParams2);
                    F4(this.v);
                } else {
                    this.k.addView(this.c.zzE(), -1, -1);
                }
            }
            if (!z && !this.l) {
                this.c.l();
            }
            if (this.b.zzk == 5) {
                zzq(z4);
                if (this.c.zzR()) {
                    zzs(z4, true);
                    return;
                }
                return;
            }
            k4o k4oVar = new k4o();
            k4oVar.a = activity;
            k4oVar.b = this;
            AdOverlayInfoParcel adOverlayInfoParcel4 = this.b;
            k4oVar.c = adOverlayInfoParcel4.zzq;
            k4oVar.d = adOverlayInfoParcel4.zzr;
            try {
                zzF(k4oVar.a());
                return;
            } catch (RemoteException | zzh e3) {
                throw new zzh(e3.getMessage(), e3);
            }
        }
        z2 = false;
        StringBuilder sb3 = new StringBuilder(String.valueOf(z2).length() + 41);
        sb3.append("Delay onShow to next orientation change: ");
        sb3.append(z2);
        String sb22 = sb3.toString();
        int i42 = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzd(sb22);
        zzv(this.b.zzj);
        window2.setFlags(C.DEFAULT_MUXED_BUFFER_SIZE, C.DEFAULT_MUXED_BUFFER_SIZE);
        com.google.android.gms.ads.internal.util.client.zzo.zzd("Hardware acceleration on the AdActivity window enabled.");
        activity.setContentView(this.k);
        this.r = true;
        z3 = this.j;
        zzi zziVar2 = this.k;
        if (z3) {
        }
        if (z) {
        }
        if (this.b.zzw) {
        }
        this.c.F(this);
        zzclmVar = this.b.zzd;
        if (zzclmVar != null) {
        }
        if (this.b.zzk != 5) {
        }
        if (!z) {
            this.c.l();
        }
        if (this.b.zzk == 5) {
        }
    }

    public final void zzB() {
        if (this.l) {
            this.l = false;
            this.c.l();
        }
    }

    public final void zzD() {
        this.k.b = true;
    }

    public final void zzE() {
        synchronized (this.n) {
            try {
                this.q = true;
                Runnable runnable = this.p;
                if (runnable != null) {
                    zzgbp zzgbpVar = com.google.android.gms.ads.internal.util.zzs.zza;
                    zzgbpVar.removeCallbacks(runnable);
                    zzgbpVar.post(this.p);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void zzF(zzelr zzelrVar) throws zzh, RemoteException {
        zzbzm zzbzmVar;
        AdOverlayInfoParcel adOverlayInfoParcel = this.b;
        if (adOverlayInfoParcel == null || (zzbzmVar = adOverlayInfoParcel.zzv) == null) {
            throw new zzh("noioou");
        }
        zzbzmVar.t(new ObjectWrapper(zzelrVar));
    }

    @Override // com.google.android.gms.internal.ads.zzbzt
    public final void zzG(int i, String[] strArr, int[] iArr) {
        if (i == 12345) {
            k4o k4oVar = new k4o();
            Activity activity = this.a;
            if (activity == null) {
                yhk.s("Null activity");
                return;
            }
            k4oVar.a = activity;
            k4oVar.b = this.b.zzk == 5 ? this : null;
            try {
                this.b.zzv.T1(strArr, iArr, new ObjectWrapper(k4oVar.a()));
            } catch (RemoteException unused) {
            }
        }
    }

    public final void zza() {
        this.w = 3;
        Activity activity = this.a;
        activity.finish();
        AdOverlayInfoParcel adOverlayInfoParcel = this.b;
        if (adOverlayInfoParcel == null || adOverlayInfoParcel.zzk != 5) {
            return;
        }
        activity.overridePendingTransition(0, 0);
        zzclm zzclmVar = this.c;
        if (zzclmVar != null) {
            zzclmVar.F(null);
        }
    }

    public final void zzb() {
        AdOverlayInfoParcel adOverlayInfoParcel = this.b;
        if (adOverlayInfoParcel != null && this.f) {
            zzv(adOverlayInfoParcel.zzj);
        }
        if (this.g != null) {
            this.a.setContentView(this.k);
            this.r = true;
            this.g.removeAllViews();
            this.g = null;
        }
        WebChromeClient.CustomViewCallback customViewCallback = this.h;
        if (customViewCallback != null) {
            customViewCallback.onCustomViewHidden();
            this.h = null;
        }
        this.f = false;
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzah
    public final void zzc() {
        this.w = 2;
        this.a.finish();
    }

    @Override // com.google.android.gms.internal.ads.zzbzt
    public final void zzd() {
        this.w = 1;
    }

    @Override // com.google.android.gms.internal.ads.zzbzt
    public final void zze() {
        zzr zzrVar;
        AdOverlayInfoParcel adOverlayInfoParcel = this.b;
        if (adOverlayInfoParcel == null || (zzrVar = adOverlayInfoParcel.zzc) == null) {
            return;
        }
        zzrVar.zzdv();
    }

    @Override // com.google.android.gms.internal.ads.zzbzt
    public final boolean zzf() {
        this.w = 1;
        if (this.c == null) {
            return true;
        }
        if (((Boolean) zzba.zzc().a(zzbjg.va)).booleanValue() && this.c.canGoBack()) {
            this.c.goBack();
            return false;
        }
        boolean i = this.c.i();
        if (!i) {
            this.c.n("onbackblocked", Collections.EMPTY_MAP);
        }
        return i;
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0091 A[Catch: zzh -> 0x0037, TryCatch #1 {zzh -> 0x0037, blocks: (B:11:0x001b, B:13:0x0029, B:15:0x002d, B:17:0x0033, B:18:0x003a, B:19:0x0043, B:21:0x004e, B:22:0x0050, B:24:0x0056, B:25:0x0062, B:27:0x0069, B:30:0x007b, B:32:0x007f, B:34:0x0084, B:36:0x0091, B:38:0x0095, B:40:0x009b, B:46:0x00a6, B:49:0x00a9, B:51:0x00aa, B:53:0x00b0, B:54:0x00b3, B:56:0x00b9, B:58:0x00bd, B:59:0x00c0, B:61:0x00c6, B:62:0x00c9, B:64:0x00cd, B:66:0x00d1, B:67:0x00d4, B:74:0x00ff, B:76:0x0103, B:77:0x010a, B:78:0x010b, B:80:0x010f, B:82:0x011c, B:84:0x0075, B:86:0x0079, B:87:0x008d, B:88:0x0120, B:89:0x0127, B:42:0x009c, B:44:0x00a0), top: B:10:0x001b, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00cd A[Catch: zzh -> 0x0037, TryCatch #1 {zzh -> 0x0037, blocks: (B:11:0x001b, B:13:0x0029, B:15:0x002d, B:17:0x0033, B:18:0x003a, B:19:0x0043, B:21:0x004e, B:22:0x0050, B:24:0x0056, B:25:0x0062, B:27:0x0069, B:30:0x007b, B:32:0x007f, B:34:0x0084, B:36:0x0091, B:38:0x0095, B:40:0x009b, B:46:0x00a6, B:49:0x00a9, B:51:0x00aa, B:53:0x00b0, B:54:0x00b3, B:56:0x00b9, B:58:0x00bd, B:59:0x00c0, B:61:0x00c6, B:62:0x00c9, B:64:0x00cd, B:66:0x00d1, B:67:0x00d4, B:74:0x00ff, B:76:0x0103, B:77:0x010a, B:78:0x010b, B:80:0x010f, B:82:0x011c, B:84:0x0075, B:86:0x0079, B:87:0x008d, B:88:0x0120, B:89:0x0127, B:42:0x009c, B:44:0x00a0), top: B:10:0x001b, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x011c A[Catch: zzh -> 0x0037, TryCatch #1 {zzh -> 0x0037, blocks: (B:11:0x001b, B:13:0x0029, B:15:0x002d, B:17:0x0033, B:18:0x003a, B:19:0x0043, B:21:0x004e, B:22:0x0050, B:24:0x0056, B:25:0x0062, B:27:0x0069, B:30:0x007b, B:32:0x007f, B:34:0x0084, B:36:0x0091, B:38:0x0095, B:40:0x009b, B:46:0x00a6, B:49:0x00a9, B:51:0x00aa, B:53:0x00b0, B:54:0x00b3, B:56:0x00b9, B:58:0x00bd, B:59:0x00c0, B:61:0x00c6, B:62:0x00c9, B:64:0x00cd, B:66:0x00d1, B:67:0x00d4, B:74:0x00ff, B:76:0x0103, B:77:0x010a, B:78:0x010b, B:80:0x010f, B:82:0x011c, B:84:0x0075, B:86:0x0079, B:87:0x008d, B:88:0x0120, B:89:0x0127, B:42:0x009c, B:44:0x00a0), top: B:10:0x001b, inners: #0 }] */
    @Override // com.google.android.gms.internal.ads.zzbzt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void zzg(Bundle bundle) {
        Activity activity;
        AdOverlayInfoParcel zza;
        AdOverlayInfoParcel adOverlayInfoParcel;
        int i;
        zzr zzrVar;
        if (!this.r) {
            this.a.requestWindowFeature(1);
        }
        this.i = bundle != null && bundle.getBoolean("com.google.android.gms.ads.internal.overlay.hasResumed", false);
        try {
            activity = this.a;
            zza = AdOverlayInfoParcel.zza(activity.getIntent());
            this.b = zza;
        } catch (zzh e) {
            String message = e.getMessage();
            int i2 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi(message);
            this.w = 4;
            this.a.finish();
        }
        if (zza == null) {
            throw new zzh("Could not get info for ad overlay.");
        }
        if (zza.zzw) {
            if (Build.VERSION.SDK_INT >= 28) {
                activity.setShowWhenLocked(true);
            } else {
                activity.getWindow().addFlags(524288);
            }
        }
        if (this.b.zzm.clientJarVersion > 7500000) {
            this.w = 4;
        }
        if (activity.getIntent() != null) {
            this.u = activity.getIntent().getBooleanExtra("shouldCallOnOverlayOpened", true);
        }
        AdOverlayInfoParcel adOverlayInfoParcel2 = this.b;
        com.google.android.gms.ads.internal.zzl zzlVar = adOverlayInfoParcel2.zzo;
        if (zzlVar != null) {
            boolean z = zzlVar.zza;
            this.j = z;
            this.m = (int) zzlVar.zze;
            if (z) {
                if (adOverlayInfoParcel2.zzk != 5 && zzlVar.zzf != -1) {
                    new zzl(this).zzb();
                }
            }
            if (bundle == null) {
                if (this.u) {
                    zzdec zzdecVar = this.b.zzt;
                    if (zzdecVar != null) {
                        synchronized (zzdecVar) {
                            ScheduledFuture scheduledFuture = zzdecVar.c;
                            if (scheduledFuture != null) {
                                scheduledFuture.cancel(true);
                            }
                        }
                    }
                    zzr zzrVar2 = this.b.zzc;
                    if (zzrVar2 != null) {
                        zzrVar2.zzh();
                    }
                }
                AdOverlayInfoParcel adOverlayInfoParcel3 = this.b;
                if (adOverlayInfoParcel3.zzk != 1) {
                    com.google.android.gms.ads.internal.client.zza zzaVar = adOverlayInfoParcel3.zzb;
                    if (zzaVar != null) {
                        zzaVar.onAdClicked();
                    }
                    zzdlw zzdlwVar = this.b.zzu;
                    if (zzdlwVar != null) {
                        zzdlwVar.M();
                    }
                }
            }
            adOverlayInfoParcel = this.b;
            if (adOverlayInfoParcel != null && (zzrVar = adOverlayInfoParcel.zzc) != null) {
                zzrVar.zzdo();
            }
            AdOverlayInfoParcel adOverlayInfoParcel4 = this.b;
            zzi zziVar = new zzi(activity, adOverlayInfoParcel4.zzn, adOverlayInfoParcel4.zzm.afmaVersion, adOverlayInfoParcel4.zzs);
            this.k = zziVar;
            zziVar.setId(1000);
            com.google.android.gms.ads.internal.zzt.zzf().zzh(activity);
            AdOverlayInfoParcel adOverlayInfoParcel5 = this.b;
            i = adOverlayInfoParcel5.zzk;
            if (i == 1) {
                W1(false);
                return;
            }
            if (i == 2) {
                this.d = new zzj(adOverlayInfoParcel5.zzd);
                W1(false);
                return;
            } else if (i == 3) {
                W1(true);
                return;
            } else {
                if (i != 5) {
                    throw new zzh("Could not determine ad overlay type.");
                }
                W1(false);
                return;
            }
        }
        if (adOverlayInfoParcel2.zzk == 5) {
            this.j = true;
            if (adOverlayInfoParcel2.zzk != 5) {
                new zzl(this).zzb();
            }
            if (bundle == null) {
            }
            adOverlayInfoParcel = this.b;
            if (adOverlayInfoParcel != null) {
                zzrVar.zzdo();
            }
            AdOverlayInfoParcel adOverlayInfoParcel42 = this.b;
            zzi zziVar2 = new zzi(activity, adOverlayInfoParcel42.zzn, adOverlayInfoParcel42.zzm.afmaVersion, adOverlayInfoParcel42.zzs);
            this.k = zziVar2;
            zziVar2.setId(1000);
            com.google.android.gms.ads.internal.zzt.zzf().zzh(activity);
            AdOverlayInfoParcel adOverlayInfoParcel52 = this.b;
            i = adOverlayInfoParcel52.zzk;
            if (i == 1) {
            }
        } else {
            this.j = false;
            if (bundle == null) {
            }
            adOverlayInfoParcel = this.b;
            if (adOverlayInfoParcel != null) {
            }
            AdOverlayInfoParcel adOverlayInfoParcel422 = this.b;
            zzi zziVar22 = new zzi(activity, adOverlayInfoParcel422.zzn, adOverlayInfoParcel422.zzm.afmaVersion, adOverlayInfoParcel422.zzs);
            this.k = zziVar22;
            zziVar22.setId(1000);
            com.google.android.gms.ads.internal.zzt.zzf().zzh(activity);
            AdOverlayInfoParcel adOverlayInfoParcel522 = this.b;
            i = adOverlayInfoParcel522.zzk;
            if (i == 1) {
            }
        }
        String message2 = e.getMessage();
        int i22 = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzi(message2);
        this.w = 4;
        this.a.finish();
    }

    @Override // com.google.android.gms.internal.ads.zzbzt
    public final void zzh() {
        zzr zzrVar;
        AdOverlayInfoParcel adOverlayInfoParcel = this.b;
        if (adOverlayInfoParcel == null || (zzrVar = adOverlayInfoParcel.zzc) == null) {
            return;
        }
        zzrVar.zzdq();
    }

    @Override // com.google.android.gms.internal.ads.zzbzt
    public final void zzi() {
        zzr zzrVar;
        if (((Boolean) zzba.zzc().a(zzbjg.h6)).booleanValue()) {
            zzclm zzclmVar = this.c;
            if (zzclmVar == null || zzclmVar.q()) {
                int i = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzi("The webview does not exist. Ignoring action.");
            } else {
                this.c.onResume();
            }
        }
        AdOverlayInfoParcel adOverlayInfoParcel = this.b;
        if (adOverlayInfoParcel == null || (zzrVar = adOverlayInfoParcel.zzc) == null) {
            return;
        }
        zzrVar.zzdp();
    }

    @Override // com.google.android.gms.internal.ads.zzbzt
    public final void zzj() {
        int i;
        com.google.android.gms.ads.internal.zzl zzlVar;
        zzr zzrVar;
        AdOverlayInfoParcel adOverlayInfoParcel = this.b;
        if (adOverlayInfoParcel != null && (zzrVar = adOverlayInfoParcel.zzc) != null) {
            zzrVar.zzdx();
        }
        AdOverlayInfoParcel adOverlayInfoParcel2 = this.b;
        boolean z = (adOverlayInfoParcel2 == null || (zzlVar = adOverlayInfoParcel2.zzo) == null || !zzlVar.zzg) ? false : true;
        Window window = this.a.getWindow();
        if (((Boolean) zzba.zzc().a(zzbjg.V1)).booleanValue()) {
            window.getDecorView().setSystemUiVisibility(true != z ? 5380 : 5894);
        } else {
            window.addFlags(1024);
            window.clearFlags(a.o);
            if (z) {
                window.getDecorView().setSystemUiVisibility(4098);
            }
        }
        if (((Boolean) zzba.zzc().a(zzbjg.lf)).booleanValue() && (i = Build.VERSION.SDK_INT) <= 34 && i >= 28) {
            window.getAttributes().layoutInDisplayCutoutMode = 1;
            bea.L(window, false);
        }
        if (((Boolean) zzba.zzc().a(zzbjg.h6)).booleanValue()) {
            return;
        }
        zzclm zzclmVar = this.c;
        if (zzclmVar != null && !zzclmVar.q()) {
            this.c.onResume();
        } else {
            int i2 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi("The webview does not exist. Ignoring action.");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbzt
    public final void zzk() {
        zzr zzrVar;
        zzb();
        AdOverlayInfoParcel adOverlayInfoParcel = this.b;
        if (adOverlayInfoParcel != null && (zzrVar = adOverlayInfoParcel.zzc) != null) {
            zzrVar.zzdw();
        }
        if (!((Boolean) zzba.zzc().a(zzbjg.h6)).booleanValue() && this.c != null && (!this.a.isFinishing() || this.d == null)) {
            this.c.onPause();
        }
        zzz();
    }

    @Override // com.google.android.gms.internal.ads.zzbzt
    public final void zzl(int i, int i2, Intent intent) {
        zzeaj zzeajVar;
        AdOverlayInfoParcel adOverlayInfoParcel;
        if (i == 236) {
            inn innVar = zzbjg.Ve;
            if (((Boolean) zzba.zzc().a(innVar)).booleanValue()) {
                StringBuilder sb = new StringBuilder(String.valueOf(i2).length() + 66);
                sb.append("Callback from intent launch with requestCode: 236 and resultCode: ");
                sb.append(i2);
                com.google.android.gms.ads.internal.util.zze.zza(sb.toString());
                zzclm zzclmVar = this.c;
                if (zzclmVar == null || zzclmVar.zzP() == null || (zzeajVar = zzclmVar.zzP().z) == null || (adOverlayInfoParcel = this.b) == null || !((Boolean) zzba.zzc().a(innVar)).booleanValue()) {
                    return;
                }
                zzeai a = zzeajVar.a();
                a.b("action", "hilca");
                String str = adOverlayInfoParcel.zzq;
                if (str == null) {
                    str = "";
                }
                a.b("gqi", str);
                StringBuilder sb2 = new StringBuilder(String.valueOf(i2).length());
                sb2.append(i2);
                a.b("hilr", sb2.toString());
                if (i2 == -1 && intent != null) {
                    String stringExtra = intent.getStringExtra("callerPackage");
                    String stringExtra2 = intent.getStringExtra("loadingStage");
                    if (stringExtra != null) {
                        a.b("hilcp", stringExtra);
                    }
                    if (stringExtra2 != null) {
                        a.b("hills", stringExtra2);
                    }
                }
                a.e();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbzt
    public final void zzn(Bundle bundle) {
        bundle.putBoolean("com.google.android.gms.ads.internal.overlay.hasResumed", this.i);
    }

    @Override // com.google.android.gms.internal.ads.zzbzt
    public final void zzo() {
        zzr zzrVar;
        AdOverlayInfoParcel adOverlayInfoParcel = this.b;
        if (adOverlayInfoParcel != null && (zzrVar = adOverlayInfoParcel.zzc) != null) {
            zzrVar.zzdy();
        }
        if (((Boolean) zzba.zzc().a(zzbjg.h6)).booleanValue() && this.c != null && (!this.a.isFinishing() || this.d == null)) {
            this.c.onPause();
        }
        zzz();
    }

    @Override // com.google.android.gms.internal.ads.zzbzt
    public final void zzp() {
        zzr zzrVar;
        AdOverlayInfoParcel adOverlayInfoParcel = this.b;
        if (adOverlayInfoParcel != null && (zzrVar = adOverlayInfoParcel.zzc) != null) {
            zzrVar.zzdz();
        }
        zzclm zzclmVar = this.c;
        if (zzclmVar != null) {
            try {
                this.k.removeView(zzclmVar.zzE());
            } catch (NullPointerException unused) {
            }
        }
        zzz();
    }

    public final void zzq(boolean z) {
        if (this.b.zzw) {
            return;
        }
        int intValue = ((Integer) zzba.zzc().a(zzbjg.j6)).intValue();
        boolean z2 = ((Boolean) zzba.zzc().a(zzbjg.R1)).booleanValue() || z;
        zzt zztVar = new zzt();
        zztVar.zzd = 50;
        zztVar.zza = true != z2 ? 0 : intValue;
        zztVar.zzb = true != z2 ? intValue : 0;
        zztVar.zzc = intValue;
        this.e = new zzu(this.a, zztVar, this);
        RelativeLayout.LayoutParams c = w1l.c(-2, -2, 10);
        c.addRule(true != z2 ? 9 : 11);
        zzs(z, this.b.zzg);
        this.k.addView(this.e, c);
        F4(this.e);
    }

    @Override // com.google.android.gms.internal.ads.zzbzt
    public final void zzr() {
        this.r = true;
    }

    public final void zzs(boolean z, boolean z2) {
        AdOverlayInfoParcel adOverlayInfoParcel;
        com.google.android.gms.ads.internal.zzl zzlVar;
        AdOverlayInfoParcel adOverlayInfoParcel2;
        com.google.android.gms.ads.internal.zzl zzlVar2;
        boolean z3 = true;
        boolean z4 = ((Boolean) zzba.zzc().a(zzbjg.P1)).booleanValue() && (adOverlayInfoParcel2 = this.b) != null && (zzlVar2 = adOverlayInfoParcel2.zzo) != null && zzlVar2.zzh;
        boolean z5 = ((Boolean) zzba.zzc().a(zzbjg.Q1)).booleanValue() && (adOverlayInfoParcel = this.b) != null && (zzlVar = adOverlayInfoParcel.zzo) != null && zzlVar.zzi;
        if (z && z2 && z4 && !z5) {
            new zzbyy(this.c, "useCustomClose").b("Custom close has been disabled for interstitial ads in this ad slot.");
        }
        zzu zzuVar = this.e;
        if (zzuVar != null) {
            if (!z5 && (!z2 || z4)) {
                z3 = false;
            }
            zzuVar.zza(z3);
        }
    }

    public final void zzt(boolean z, int i) {
        zzi zziVar = this.k;
        if (!z) {
            zziVar.setBackgroundColor(-16777216);
            return;
        }
        zziVar.setBackgroundColor(0);
        this.m = i;
        Window window = this.a.getWindow();
        if (!((Boolean) zzba.zzc().a(zzbjg.z1)).booleanValue() || Build.VERSION.SDK_INT < 31 || window == null) {
            return;
        }
        window.setBackgroundBlurRadius(i);
    }

    public final void zzu() {
        this.k.removeView(this.e);
        zzq(true);
    }

    public final void zzv(int i) {
        Activity activity = this.a;
        if (activity.getApplicationInfo().targetSdkVersion >= ((Integer) zzba.zzc().a(zzbjg.b7)).intValue()) {
            if (activity.getApplicationInfo().targetSdkVersion <= ((Integer) zzba.zzc().a(zzbjg.c7)).intValue()) {
                int i2 = Build.VERSION.SDK_INT;
                if (i2 >= ((Integer) zzba.zzc().a(zzbjg.d7)).intValue()) {
                    if (i2 <= ((Integer) zzba.zzc().a(zzbjg.e7)).intValue()) {
                        return;
                    }
                }
            }
        }
        try {
            activity.setRequestedOrientation(i);
        } catch (Throwable th) {
            com.google.android.gms.ads.internal.zzt.zzh().e("AdOverlay.setRequestedOrientation", th);
        }
    }

    public final void zzw(View view, WebChromeClient.CustomViewCallback customViewCallback) {
        Activity activity = this.a;
        FrameLayout frameLayout = new FrameLayout(activity);
        this.g = frameLayout;
        frameLayout.setBackgroundColor(-16777216);
        this.g.addView(view, -1, -1);
        activity.setContentView(this.g);
        this.r = true;
        this.h = customViewCallback;
        this.f = true;
    }

    public final void zzy(String str) {
        Toolbar toolbar = this.v;
        if (toolbar != null) {
            toolbar.setSubtitle(str);
        }
    }

    public final void zzz() {
        AdOverlayInfoParcel adOverlayInfoParcel;
        zzr zzrVar;
        if (!this.a.isFinishing() || this.s) {
            return;
        }
        this.s = true;
        zzclm zzclmVar = this.c;
        if (zzclmVar != null) {
            zzclmVar.Q(this.w - 1);
            synchronized (this.n) {
                try {
                    if (!this.q && this.c.y()) {
                        if (((Boolean) zzba.zzc().a(zzbjg.g6)).booleanValue() && !this.t && (adOverlayInfoParcel = this.b) != null && (zzrVar = adOverlayInfoParcel.zzc) != null) {
                            zzrVar.zzdV();
                        }
                        Runnable runnable = new Runnable() { // from class: com.google.android.gms.ads.internal.overlay.zzf
                            @Override // java.lang.Runnable
                            public final /* synthetic */ void run() {
                                zzm.this.E4();
                            }
                        };
                        this.p = runnable;
                        com.google.android.gms.ads.internal.util.zzs.zza.postDelayed(runnable, ((Long) zzba.zzc().a(zzbjg.O1)).longValue());
                        return;
                    }
                } finally {
                }
            }
        }
        E4();
    }

    @Override // com.google.android.gms.internal.ads.zzbzt
    public final void zzm(IObjectWrapper iObjectWrapper) {
    }
}
