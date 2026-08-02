package defpackage;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.media.MediaCodec;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcel;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.sdk.openadsdk.api.interstitial.PAGInterstitialAdInteractionListener;
import com.google.android.gms.ads.mediation.MediationInterstitialAdCallback;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.internal.RemoteCall;
import com.google.android.gms.common.internal.service.zab;
import com.google.android.gms.common.internal.service.zaj;
import com.google.android.gms.common.internal.service.zaq;
import com.google.android.gms.internal.ads.s;
import com.google.android.gms.internal.ads.zzaaq;
import com.google.android.gms.internal.ads.zzaat;
import com.google.android.gms.internal.ads.zzabc;
import com.google.android.gms.internal.ads.zzakm;
import com.google.android.gms.internal.ads.zzbg;
import com.google.android.gms.internal.ads.zzgxj;
import com.google.android.gms.internal.ads.zzgxm;
import com.google.android.gms.internal.base.zac;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.ironsource.U3;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.io.IOException;
import java.io.StringWriter;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class d4a implements zrb, PAGInterstitialAdInteractionListener, tbg, jd4, v2c, gc, k80, RemoteCall, zzaat, obn, zzakm {
    public final /* synthetic */ int a;
    public Object b;

    public d4a(j80 j80Var, float f, float f2) {
        this.a = 22;
        int b = j80Var.b();
        e88[] e88VarArr = new e88[b];
        for (int i = 0; i < b; i++) {
            e88VarArr[i] = new e88(f, f2, j80Var.a(i));
        }
        this.b = e88VarArr;
    }

    @Override // defpackage.obn
    public boolean a(Class cls) {
        for (int i = 0; i < 2; i++) {
            if (((obn[]) this.b)[i].a(cls)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.obn
    public lcn b(Class cls) {
        for (int i = 0; i < 2; i++) {
            obn obnVar = ((obn[]) this.b)[i];
            if (obnVar.a(cls)) {
                return obnVar.b(cls);
            }
        }
        a70.m("No factory is available for message type: ".concat(cls.getName()));
        return null;
    }

    @Override // defpackage.v2c
    public void c(Bundle bundle) {
        ((MediaCodec) this.b).setParameters(bundle);
    }

    @Override // defpackage.tbg
    public void closeAdView(boolean z) {
        fcg fcgVar = (fcg) this.b;
        ViewParent parent = fcgVar.l.getParent();
        if (Intrinsics.c(parent, fcgVar) || !(parent instanceof ViewGroup)) {
            fcgVar.k.post(new zbg(fcgVar, 2));
            return;
        }
        hs4 hs4Var = z45.a;
        xw3.L(s9a.c(rob.a), null, null, new l84((ViewGroup) parent, fcgVar, z, (rq3) null, 6), 3);
    }

    @Override // defpackage.v2c
    public void d(int i, int i2, int i3, long j) {
        ((MediaCodec) this.b).queueInputBuffer(i, 0, i2, j, i3);
    }

    @Override // defpackage.tbg
    public void expandAdView(boolean z) {
        FrameLayout expandParentView;
        fcg fcgVar = (fcg) this.b;
        if (Intrinsics.c(fcgVar.l.getParent(), fcgVar)) {
            expandParentView = fcgVar.getExpandParentView();
            if (expandParentView != null) {
                hs4 hs4Var = z45.a;
                xw3.L(s9a.c(rob.a), null, null, new l84(fcgVar, expandParentView, z, (rq3) null, 7), 3);
                return;
            }
            hdg hdgVar = new hdg(gdg.h, "Can not determine UI root to expand SASBannerView");
            xag xagVar = fcgVar.j;
            if (xagVar != null) {
                Iterator it = ((zag) xagVar).v.iterator();
                while (it.hasNext()) {
                    ((wag) it.next()).b(hdgVar);
                }
            }
            jeg jegVar = jeg.d;
            hdgVar.toString();
            jegVar.f(4);
            Unit unit = Unit.a;
        }
    }

    @Override // defpackage.v2c
    public void f(int i, d74 d74Var, long j, int i2) {
        ((MediaCodec) this.b).queueSecureInputBuffer(i, 0, d74Var.i, j, i2);
    }

    @Override // defpackage.jd4
    public long g(long j, long j2) {
        return 0L;
    }

    @Override // defpackage.k80
    public u78 get(int i) {
        return ((e88[]) this.b)[i];
    }

    @Override // defpackage.jd4
    public long getTimeUs(long j) {
        return 0L;
    }

    @Override // defpackage.jd4
    public long h(long j, long j2) {
        return C.TIME_UNSET;
    }

    @Override // defpackage.jd4
    public jlf i(long j) {
        return (jlf) this.b;
    }

    @Override // defpackage.jd4
    public long j(long j, long j2) {
        return 0L;
    }

    @Override // defpackage.jd4
    public long l(long j) {
        return 1L;
    }

    public String m(Object obj) {
        StringWriter stringWriter = new StringWriter();
        try {
            lfa lfaVar = (lfa) this.b;
            pha phaVar = new pha(stringWriter, lfaVar.a, lfaVar.b, lfaVar.c, lfaVar.d);
            phaVar.h(obj);
            phaVar.j();
            phaVar.b.flush();
        } catch (IOException unused) {
        }
        return stringWriter.toString();
    }

    @Override // defpackage.jd4
    public boolean n() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzaat
    public s o(int i, zzbg zzbgVar, int[] iArr) {
        gio gioVar = zzabc.k;
        mio mioVar = zzgxm.b;
        zzgxj zzgxjVar = new zzgxj();
        for (int i2 = 0; i2 < zzbgVar.a; i2++) {
            zzgxjVar.c(new l5n(i, zzbgVar, i2, (zzaaq) this.b, iArr[i2]));
        }
        return zzgxjVar.f();
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGAdListener
    public void onAdClicked() {
        switch (this.a) {
            case 11:
                MediationInterstitialAdCallback mediationInterstitialAdCallback = ((u7e) this.b).d;
                if (mediationInterstitialAdCallback != null) {
                    mediationInterstitialAdCallback.reportAdClicked();
                    break;
                }
                break;
            default:
                fcg fcgVar = (fcg) this.b;
                fcgVar.k.post(new zbg(fcgVar, 4));
                break;
        }
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGAdListener
    public void onAdDismissed() {
        MediationInterstitialAdCallback mediationInterstitialAdCallback = ((u7e) this.b).d;
        if (mediationInterstitialAdCallback != null) {
            mediationInterstitialAdCallback.onAdClosed();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGAdListener
    public void onAdShowed() {
        u7e u7eVar = (u7e) this.b;
        MediationInterstitialAdCallback mediationInterstitialAdCallback = u7eVar.d;
        if (mediationInterstitialAdCallback != null) {
            mediationInterstitialAdCallback.onAdOpened();
            u7eVar.d.reportAdImpression();
        }
    }

    @Override // defpackage.jd4
    public long p() {
        return 0L;
    }

    @Override // defpackage.jd4
    public long q(long j, long j2) {
        return 1L;
    }

    /* JADX WARN: Removed duplicated region for block: B:57:0x0117  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public oec r(nt9 nt9Var, nec necVar, kjh kjhVar, jrg jrgVar) {
        boolean m;
        int abs;
        ze2 ze2Var = nt9Var.l;
        e3f e3fVar = nt9Var.u;
        if (ze2Var.a) {
            fpf d = ((apf) this.b).d();
            oec a = d != null ? d.a(necVar) : null;
            if (a != null) {
                nr9 nr9Var = a.a;
                ax1 ax1Var = nr9Var instanceof ax1 ? (ax1) nr9Var : null;
                if (ax1Var == null) {
                    m = true;
                } else {
                    Bitmap.Config config = ax1Var.a.getConfig();
                    if (config == null) {
                        config = Bitmap.Config.ARGB_8888;
                    }
                    m = f4a.m(nt9Var, config);
                }
                if (m) {
                    String str = (String) necVar.b.get("coil#size");
                    if (str == null) {
                        Object obj = a.b.get("coil#is_sampled");
                        Boolean bool = obj instanceof Boolean ? (Boolean) obj : null;
                        if ((bool != null ? bool.booleanValue() : false) || (!Intrinsics.c(kjhVar, kjh.c) && e3fVar != e3f.b)) {
                            int width = nr9Var.getWidth();
                            int height = nr9Var.getHeight();
                            kjh kjhVar2 = nr9Var instanceof ax1 ? (kjh) fqj.w(nt9Var, st9.b) : kjh.c;
                            a35 a35Var = kjhVar.a;
                            int i = a35Var instanceof t25 ? ((t25) a35Var).a : Integer.MAX_VALUE;
                            a35 a35Var2 = kjhVar2.a;
                            int min = Math.min(i, a35Var2 instanceof t25 ? ((t25) a35Var2).a : Integer.MAX_VALUE);
                            a35 a35Var3 = kjhVar.b;
                            int i2 = a35Var3 instanceof t25 ? ((t25) a35Var3).a : Integer.MAX_VALUE;
                            a35 a35Var4 = kjhVar2.b;
                            int min2 = Math.min(i2, a35Var4 instanceof t25 ? ((t25) a35Var4).a : Integer.MAX_VALUE);
                            double d2 = min / width;
                            double d3 = min2 / height;
                            int ordinal = ((min == Integer.MAX_VALUE || min2 == Integer.MAX_VALUE) ? jrg.b : jrgVar).ordinal();
                            if (ordinal != 0) {
                                if (ordinal != 1) {
                                    zzl.b();
                                    return null;
                                }
                                if (d2 < d3) {
                                    abs = Math.abs(min - width);
                                    if (abs > 1) {
                                        int ordinal2 = e3fVar.ordinal();
                                        if (ordinal2 != 0) {
                                            if (ordinal2 != 1) {
                                                zzl.b();
                                                return null;
                                            }
                                            if (d2 <= 1.0d) {
                                            }
                                        } else if (d2 == 1.0d) {
                                        }
                                    }
                                } else {
                                    abs = Math.abs(min2 - height);
                                    d2 = d3;
                                    if (abs > 1) {
                                    }
                                }
                            } else if (d2 > d3) {
                                abs = Math.abs(min - width);
                                if (abs > 1) {
                                }
                            } else {
                                abs = Math.abs(min2 - height);
                                d2 = d3;
                                if (abs > 1) {
                                }
                            }
                        }
                        return a;
                    }
                    if (str.equals(kjhVar.toString())) {
                        return a;
                    }
                }
            }
        }
        return null;
    }

    public nec s(nt9 nt9Var, Object obj, tvd tvdVar, f7a f7aVar) {
        String str;
        String D;
        ze2 ze2Var = nt9Var.l;
        Map map = nt9Var.f;
        if (ze2Var != ze2.DISABLED) {
            String str2 = nt9Var.e;
            if (str2 != null) {
                return new nec(str2, map);
            }
            List list = ((apf) this.b).d.c;
            int size = list.size();
            int i = 0;
            while (true) {
                if (i < size) {
                    Pair pair = (Pair) list.get(i);
                    w20 w20Var = (w20) pair.a;
                    if (((KClass) pair.b).isInstance(obj)) {
                        w20Var.getClass();
                        switch (w20Var.a) {
                            case 0:
                                eek eekVar = (eek) obj;
                                if (Intrinsics.c(eekVar.c, "android.resource")) {
                                    Configuration configuration = tvdVar.a.getResources().getConfiguration();
                                    Bitmap.Config[] configArr = gjk.a;
                                    str = eekVar + ":" + (configuration.uiMode & 48);
                                    break;
                                }
                                str = null;
                                break;
                            case 1:
                                eek eekVar2 = (eek) obj;
                                String str3 = eekVar2.c;
                                if ((str3 == null || str3.equals(U3.i.b)) && eekVar2.e != null) {
                                    Bitmap.Config[] configArr2 = gjk.a;
                                    if ((!Intrinsics.c(eekVar2.c, U3.i.b) || !Intrinsics.c(CollectionsKt.firstOrNull(nq8.E(eekVar2)), "android_asset")) && ((Boolean) fqj.x(tvdVar, st9.c)).booleanValue() && (D = nq8.D(eekVar2)) != null) {
                                        s18 s18Var = tvdVar.f;
                                        String str4 = uae.b;
                                        str = eekVar2 + "-" + ((Long) s18Var.n(tnf.j(D, false)).g);
                                        break;
                                    }
                                }
                                str = null;
                                break;
                            default:
                                str = ((eek) obj).a;
                                break;
                        }
                        if (str != null) {
                        }
                    }
                    i++;
                } else {
                    str = null;
                }
            }
            if (str != null) {
                if (((List) fqj.w(nt9Var, st9.a)).isEmpty()) {
                    return new nec(str, map);
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(map);
                linkedHashMap.put("coil#size", tvdVar.b.toString());
                return new nec(str, linkedHashMap);
            }
        }
        return null;
    }

    public void t(Exception exc) {
        tgj.A("Audio sink error", exc);
        ro0 ro0Var = ((u2c) this.b).H0;
        Handler handler = ro0Var.a;
        if (handler != null) {
            handler.post(new oo0(ro0Var, exc, 8));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.common.api.internal.RemoteCall
    public void u(Api.AnyClient anyClient, TaskCompletionSource taskCompletionSource) {
        Api api = zaq.l;
        zaj zajVar = (zaj) ((zab) anyClient).getService();
        com.google.android.gms.common.internal.zab zabVar = (com.google.android.gms.common.internal.zab) this.b;
        Parcel J = zajVar.J();
        zac.b(J, zabVar);
        try {
            zajVar.a.transact(1, J, null, 1);
            J.recycle();
            taskCompletionSource.setResult(null);
        } catch (Throwable th) {
            J.recycle();
            throw th;
        }
    }

    @Override // defpackage.tbg
    public void unloadAd(View view) {
        fcg fcgVar = (fcg) this.b;
        RelativeLayout relativeLayout = fcgVar.l;
        xbg xbgVar = fcgVar.i;
        if (xbgVar != null) {
            xbgVar.getBannerView();
        }
        if (!Intrinsics.c(relativeLayout.getParent(), fcgVar)) {
            closeAdView(false);
        }
        fcgVar.d();
        if (view != null) {
            relativeLayout.addView(view, new RelativeLayout.LayoutParams(-1, -1));
        }
        fcgVar.k.post(new zbg(fcgVar, 3));
    }

    public void v(int i) {
        RecyclerView recyclerView = (RecyclerView) this.b;
        View childAt = recyclerView.getChildAt(i);
        if (childAt != null) {
            recyclerView.dispatchChildDetached(childAt);
            childAt.clearAnimation();
        }
        recyclerView.removeViewAt(i);
    }

    public void w(String str, boolean z) {
        r38 r38Var = (r38) this.b;
        r38Var.a();
        SharedPreferences.Editor edit = ((Application) r38Var.a).getSharedPreferences("com.google.firebase.inappmessaging", 0).edit();
        edit.putBoolean(str, z);
        edit.apply();
    }

    public void x(boolean z) {
        qrb qrbVar = (qrb) this.b;
        qrbVar.Y.N(qrbVar.E, z);
    }

    @Override // defpackage.v2c
    public void flush() {
    }

    @Override // defpackage.v2c
    public void k() {
    }

    @Override // defpackage.v2c
    public void shutdown() {
    }

    @Override // defpackage.v2c
    public void start() {
    }

    public /* synthetic */ d4a(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    public d4a(Function1 function1) {
        this.a = 10;
        this.b = function1;
    }

    public d4a(e2f e2fVar) {
        this.a = 3;
        this.b = new HashMap();
    }

    public d4a(Context context) {
        this.a = 1;
        this.b = new u00(context, (byte) 0);
    }

    public d4a(apf apfVar, f4a f4aVar) {
        this.a = 7;
        this.b = apfVar;
    }

    public /* synthetic */ d4a(int i) {
        this.a = i;
    }

    @Override // defpackage.jd4
    public long e(long j, long j2) {
        return j2;
    }
}
