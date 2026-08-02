package com.sofascore.results.sofaSeason;

import android.content.Context;
import android.os.Bundle;
import androidx.core.app.NotificationCompat;
import com.ironsource.mediationsdk.metadata.a;
import com.unity3d.services.UnityAdsConstants;
import defpackage.a99;
import defpackage.av8;
import defpackage.cce;
import defpackage.ct8;
import defpackage.d2a;
import defpackage.duf;
import defpackage.e1d;
import defpackage.e44;
import defpackage.eqf;
import defpackage.fm8;
import defpackage.g6b;
import defpackage.hth;
import defpackage.hz8;
import defpackage.kth;
import defpackage.mhb;
import defpackage.ml4;
import defpackage.mp9;
import defpackage.msh;
import defpackage.nf3;
import defpackage.nz;
import defpackage.of3;
import defpackage.og5;
import defpackage.osh;
import defpackage.otk;
import defpackage.q50;
import defpackage.qgb;
import defpackage.qqi;
import defpackage.rfo;
import defpackage.rq3;
import defpackage.tc3;
import defpackage.tfi;
import defpackage.tol;
import defpackage.tu5;
import defpackage.u6b;
import defpackage.uv;
import defpackage.yqo;
import defpackage.z1h;
import defpackage.zb3;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006²\u0006\f\u0010\u0005\u001a\u00020\u00048\nX\u008a\u0084\u0002"}, d2 = {"Lcom/sofascore/results/sofaSeason/SofaSeasonActivity;", "Lcom/sofascore/results/mvvm/base/AbstractActivity;", "<init>", "()V", "Lhth;", "state", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class SofaSeasonActivity extends Hilt_SofaSeasonActivity {
    public static final /* synthetic */ int L = 0;
    public final otk K = new otk(duf.a.getOrCreateKotlinClass(kth.class), new osh(this, 1), new osh(this, 0), new osh(this, 2));

    @Override // com.sofascore.results.base.BaseActivity
    /* renamed from: B */
    public final boolean getM() {
        return false;
    }

    public final void Q(kth kthVar, Function0 function0, Function1 function1, of3 of3Var, int i) {
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-61660081);
        int i2 = i | (av8Var.i(kthVar) ? 4 : 2) | (av8Var.i(function0) ? 32 : 16) | (av8Var.i(function1) ? NotificationCompat.FLAG_LOCAL_ONLY : 128) | (av8Var.i(this) ? a.o : 1024);
        if (av8Var.T(i2 & 1, (i2 & 1171) != 1170)) {
            e1d x = rfo.x(kthVar.i, av8Var, 0);
            g6b lifecycle = ((u6b) av8Var.k(mhb.a)).getLifecycle();
            boolean e = av8Var.e(((hth) x.getValue()).b);
            Object O = av8Var.O();
            a99 a99Var = nf3.a;
            float f = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            if (e || O == a99Var) {
                O = ml4.b(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                av8Var.n0(O);
            }
            q50 q50Var = (q50) O;
            Context context = (Context) av8Var.k(nz.b);
            hth hthVar = (hth) x.getValue();
            boolean i3 = av8Var.i(context);
            Object O2 = av8Var.O();
            if (i3 || O2 == a99Var) {
                O2 = new tu5(context, 6);
                av8Var.n0(O2);
            }
            d2a.e(hthVar, (ct8) O2, av8Var, 0);
            Object[] objArr = {((hth) x.getValue()).b(), Boolean.valueOf(((hth) x.getValue()).e), lifecycle, q50Var};
            boolean g = av8Var.g(x) | av8Var.i(q50Var) | av8Var.i(lifecycle) | av8Var.i(kthVar);
            Object O3 = av8Var.O();
            if (g || O3 == a99Var) {
                cce cceVar = new cce(q50Var, lifecycle, x, kthVar, (rq3) null);
                av8Var.n0(cceVar);
                O3 = cceVar;
            }
            hz8.r(objArr, (Function2) O3, av8Var);
            boolean e2 = av8Var.e(((hth) x.getValue()).b) | av8Var.e(((hth) x.getValue()).c) | av8Var.d(((Number) q50Var.d()).floatValue());
            Object O4 = av8Var.O();
            if (e2 || O4 == a99Var) {
                tfi tfiVar = (tfi) CollectionsKt.a0(((hth) x.getValue()).b, ((hth) x.getValue()).a);
                if (tfiVar != null) {
                    Iterator<E> it = tfiVar.e().iterator();
                    int i4 = 0;
                    while (it.hasNext()) {
                        i4 += ((fm8) it.next()).a();
                    }
                    float f2 = i4;
                    if (f2 == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                        f = 1.0f;
                    } else {
                        float f3 = 0.0f;
                        for (int i5 = 0; i5 < ((hth) x.getValue()).c; i5++) {
                            f3 += ((fm8) tfiVar.e().get(i5)).a();
                        }
                        fm8 b = ((hth) x.getValue()).b();
                        if (b != null) {
                            f = b.a();
                        }
                        f = ((((Number) q50Var.d()).floatValue() * f) + f3) / f2;
                    }
                }
                O4 = Float.valueOf(f);
                av8Var.n0(O4);
            }
            tol.b(qgb.a.a(new uv(this)), yqo.H(1513330575, av8Var, new e44(hth.a((hth) x.getValue(), null, 0, 0, ((Number) O4).floatValue(), false, false, 55), kthVar, x, context, function0, function1)), av8Var, 56);
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new mp9(i, 13, this, kthVar, function0, function1);
        }
    }

    @Override // com.sofascore.results.mvvm.base.AbstractActivity, com.sofascore.results.base.BaseActivity, com.sofascore.results.base.Hilt_BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        getWindow().addFlags(128);
        og5.b(this, null, new qqi(0, 0, 0, new z1h(17)), 1);
        zb3.a(this, new tc3(-456012304, new msh(this, 1), true));
    }

    @Override // com.sofascore.results.base.BaseActivity
    public final String u() {
        return "SeasonScreen";
    }

    @Override // com.sofascore.results.mvvm.base.AbstractActivity
    public final void N() {
    }
}
