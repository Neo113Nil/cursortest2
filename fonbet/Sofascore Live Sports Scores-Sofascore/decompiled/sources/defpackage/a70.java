package defpackage;

import android.graphics.ImageDecoder;
import android.graphics.drawable.AnimatedImageDrawable;
import android.media.AudioDescriptor;
import android.os.Handler;
import android.os.SystemClock;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import com.appsflyer.AppsFlyerLib;
import com.appsflyer.share.SessionReadyListener;
import com.blaze.gam.custom_native.BlazeCustomNativeAdsManager;
import com.google.android.gms.ads.nativead.NativeCustomFormatAd;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.unity3d.services.UnityAdsConstants;
import java.io.EOFException;
import java.util.ConcurrentModificationException;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final /* synthetic */ class a70 implements SessionReadyListener, og0, qdb, hvb, NativeCustomFormatAd.OnCustomClickListener, ye2, qj2 {
    public final /* synthetic */ int a;

    public /* synthetic */ a70(int i) {
        this.a = i;
    }

    public static /* bridge */ /* synthetic */ ImageDecoder.Source d(Object obj) {
        return (ImageDecoder.Source) obj;
    }

    public static /* bridge */ /* synthetic */ AnimatedImageDrawable e(Object obj) {
        return (AnimatedImageDrawable) obj;
    }

    public static /* bridge */ /* synthetic */ AudioDescriptor f(Object obj) {
        return (AudioDescriptor) obj;
    }

    public static /* bridge */ /* synthetic */ OnBackInvokedCallback g(Object obj) {
        return (OnBackInvokedCallback) obj;
    }

    public static /* bridge */ /* synthetic */ OnBackInvokedDispatcher h(Object obj) {
        return (OnBackInvokedDispatcher) obj;
    }

    public static /* synthetic */ void i() {
        throw new UnsupportedOperationException();
    }

    public static /* synthetic */ void j(Object obj) {
        throw new AssertionError(obj);
    }

    public static /* synthetic */ void k(Object obj, long j) {
        throw new EOFException("\\n not found: limit=" + j + ((Object) " content=") + obj + (char) 8230);
    }

    public static /* synthetic */ void l(Object obj, Object obj2, String str) {
        throw new IllegalStateException(str + obj + obj2);
    }

    public static /* synthetic */ void m(String str) {
        throw new UnsupportedOperationException(str);
    }

    public static /* synthetic */ void n(String str, Object obj, Object obj2, Object obj3) {
        throw new IllegalStateException((str + obj + obj2 + obj3).toString());
    }

    public static /* synthetic */ void o() {
        throw new ConcurrentModificationException();
    }

    public static /* synthetic */ void p(String str) {
        throw new IllegalArgumentException(str);
    }

    public static /* synthetic */ void q() {
        throw new EOFException();
    }

    public static /* synthetic */ void r(String str) {
        throw new IllegalStateException(str);
    }

    @Override // defpackage.ye2
    public String a(xe4 xe4Var) {
        String str = xe4Var.h;
        return str != null ? str : xe4Var.a.toString();
    }

    @Override // defpackage.hvb
    public int b(kx4 kx4Var, int i) {
        return kx4Var.e0(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
    }

    @Override // defpackage.og0
    public int c(int i, ema emaVar) {
        switch (this.a) {
            case 6:
                return Math.round((1.0f + (emaVar == ema.a ? -1.0f : 1.0f)) * (i / 2.0f));
            default:
                return Math.round((1.0f + UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) * ((i + 0) / 2.0f));
        }
    }

    @Override // defpackage.qdb
    public void invoke(Object obj) {
        long j;
        d4a d4aVar;
        zg6 zg6Var;
        iu4 iu4Var;
        switch (this.a) {
            case 10:
                in4 in4Var = (in4) obj;
                pn4 pn4Var = in4Var.a;
                if (in4Var == pn4Var.j && pn4Var.n != null) {
                    kn4 kn4Var = pn4Var.p;
                    int i = kn4Var.b;
                    if (i != -1) {
                        long j2 = ((do0) kn4Var.e).f / i;
                        lp0 lp0Var = pn4Var.t;
                        lp0Var.getClass();
                        j = nik.Z(lp0Var.a.getSampleRate(), j2);
                    } else {
                        j = C.TIME_UNSET;
                    }
                    long elapsedRealtime = SystemClock.elapsedRealtime() - pn4Var.W;
                    d4a d4aVar2 = pn4Var.n;
                    int i2 = ((do0) pn4Var.p.e).f;
                    long h0 = nik.h0(j);
                    ro0 ro0Var = ((u2c) d4aVar2.b).H0;
                    Handler handler = ro0Var.a;
                    if (handler != null) {
                        handler.post(new oo0(ro0Var, i2, h0, elapsedRealtime));
                        return;
                    }
                    return;
                }
                return;
            case 11:
                in4 in4Var2 = (in4) obj;
                in4Var2.getClass();
                pn4.c0.getAndDecrement();
                d4a d4aVar3 = in4Var2.a.n;
                if (d4aVar3 != null) {
                    ug5 ug5Var = new ug5();
                    ro0 ro0Var2 = ((u2c) d4aVar3.b).H0;
                    Handler handler2 = ro0Var2.a;
                    if (handler2 != null) {
                        handler2.post(new oo0(ro0Var2, ug5Var, 3));
                        return;
                    }
                    return;
                }
                return;
            case 12:
                in4 in4Var3 = (in4) obj;
                pn4 pn4Var2 = in4Var3.a;
                if (in4Var3 == pn4Var2.j && (d4aVar = pn4Var2.n) != null && pn4Var2.O && (zg6Var = ((u2c) d4aVar.b).I) != null) {
                    zg6Var.a();
                    return;
                }
                return;
            case 13:
                in4 in4Var4 = (in4) obj;
                pn4 pn4Var3 = in4Var4.a;
                if (in4Var4 == pn4Var3.j && pn4Var3.M) {
                    pn4Var3.N = true;
                    return;
                }
                return;
            default:
                d4a d4aVar4 = ((dn4) obj).a.n;
                if (d4aVar4 != null) {
                    u2c u2cVar = (u2c) d4aVar4.b;
                    synchronized (u2cVar.a) {
                        iu4Var = u2cVar.r;
                    }
                    if (iu4Var != null) {
                        synchronized (iu4Var.c) {
                            iu4Var.f.getClass();
                        }
                        return;
                    }
                    return;
                }
                return;
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeCustomFormatAd.OnCustomClickListener
    public void onCustomClick(NativeCustomFormatAd nativeCustomFormatAd, String str) {
        BlazeCustomNativeAdsManager.requestAd$lambda$1(nativeCustomFormatAd, str);
    }

    @Override // com.appsflyer.share.SessionReadyListener
    public void onSessionReady() {
        dg0.b = true;
        boolean z = dg0.a;
        if (dg0.b && dg0.c) {
            AppsFlyerLib.getInstance().start();
        }
    }

    @Override // defpackage.qj2
    public void cancel() {
    }
}
