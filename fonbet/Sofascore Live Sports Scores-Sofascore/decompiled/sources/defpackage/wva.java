package defpackage;

import android.content.Context;
import com.sofascore.results.R;
import com.unity3d.services.UnityAdsConstants;
import com.vungle.ads.internal.protos.Sdk;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.b;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class wva implements et8 {
    public final /* synthetic */ int a;
    public final /* synthetic */ List b;
    public final /* synthetic */ xva c;
    public final /* synthetic */ Context d;

    public /* synthetic */ wva(List list, xva xvaVar, Context context, int i) {
        this.a = i;
        this.b = list;
        this.c = xvaVar;
        this.d = context;
    }

    @Override // defpackage.et8
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        boolean z;
        gv9 gv9Var;
        int i2;
        int i3 = this.a;
        Object obj5 = nf3.a;
        utc utcVar = utc.a;
        List list = this.b;
        xva xvaVar = this.c;
        Context context = this.d;
        switch (i3) {
            case 0:
                xpa xpaVar = (xpa) obj;
                int intValue = ((Number) obj2).intValue();
                of3 of3Var = (of3) obj3;
                int intValue2 = ((Number) obj4).intValue();
                if ((intValue2 & 6) == 0) {
                    i = intValue2 | (((av8) of3Var).g(xpaVar) ? 4 : 2);
                } else {
                    i = intValue2;
                }
                if ((intValue2 & 48) == 0) {
                    i |= ((av8) of3Var).e(intValue) ? 32 : 16;
                }
                av8 av8Var = (av8) of3Var;
                if (av8Var.T(i & 1, (i & 147) != 146)) {
                    Object obj6 = list.get(intValue);
                    int i4 = i & Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE;
                    v75 v75Var = (v75) obj6;
                    av8Var.d0(-802473407);
                    boolean z2 = xvaVar.p;
                    gv9 gv9Var2 = xvaVar.a;
                    av8Var.d0(1082514627);
                    av8Var.d0(1082504267);
                    xtc a = xpa.a(xpaVar, l98.d0(utcVar, 8.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2), 7);
                    if (b.i(gv9Var2) == intValue) {
                        z = z2;
                        gv9Var = gv9Var2;
                        a = a.z(l98.f0(n9e.q(utcVar, lz.D(R.color.surface_1, av8Var), o7g.c(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 16.0f, 16.0f, 3)), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8.0f, 7));
                    } else {
                        z = z2;
                        gv9Var = gv9Var2;
                    }
                    av8Var.s(false);
                    if (gv9Var.size() - 1 != intValue) {
                        a = a.z(n9e.q(utcVar, lz.D(R.color.surface_1, av8Var), oyn.e));
                    }
                    xtc xtcVar = a;
                    av8Var.s(false);
                    boolean i5 = av8Var.i(context) | av8Var.g(v75Var);
                    Object O = av8Var.O();
                    if (i5 || O == obj5) {
                        O = new vva(context, v75Var, 0);
                        av8Var.n0(O);
                    }
                    rz8.h(intValue, v75Var, z, tol.y(xtcVar, false, false, false, 0L, null, (Function0) O, av8Var, 31), av8Var, (i4 >> 3) & 14);
                    av8Var.s(false);
                } else {
                    av8Var.W();
                }
                break;
            default:
                xpa xpaVar2 = (xpa) obj;
                int intValue3 = ((Number) obj2).intValue();
                of3 of3Var2 = (of3) obj3;
                int intValue4 = ((Number) obj4).intValue();
                gv9 gv9Var3 = xvaVar.g;
                if ((intValue4 & 6) == 0) {
                    i2 = intValue4 | (((av8) of3Var2).g(xpaVar2) ? 4 : 2);
                } else {
                    i2 = intValue4;
                }
                if ((intValue4 & 48) == 0) {
                    i2 |= ((av8) of3Var2).e(intValue3) ? 32 : 16;
                }
                av8 av8Var2 = (av8) of3Var2;
                if (av8Var2.T(i2 & 1, (i2 & 147) != 146)) {
                    u75 u75Var = (u75) list.get(intValue3);
                    av8Var2.d0(1278333261);
                    av8Var2.d0(1426729610);
                    av8Var2.d0(1426718422);
                    xtc a2 = xpa.a(xpaVar2, l98.d0(utcVar, 8.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2), 7);
                    if (b.i(gv9Var3) == intValue3) {
                        a2 = a2.z(l98.f0(n9e.q(utcVar, lz.D(R.color.surface_1, av8Var2), o7g.c(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 16.0f, 16.0f, 3)), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8.0f, 7));
                    }
                    av8Var2.s(false);
                    if (b.i(gv9Var3) != intValue3) {
                        a2 = a2.z(n9e.q(utcVar, lz.D(R.color.surface_1, av8Var2), oyn.e));
                    }
                    xtc xtcVar2 = a2;
                    av8Var2.s(false);
                    boolean z3 = u75Var.a != null;
                    boolean i6 = av8Var2.i(context) | av8Var2.g(u75Var);
                    Object O2 = av8Var2.O();
                    if (i6 || O2 == obj5) {
                        O2 = new pi(16, context, u75Var);
                        av8Var2.n0(O2);
                    }
                    iz8.g(u75Var, tol.y(xtcVar2, z3, false, false, 0L, null, (Function0) O2, av8Var2, 30), av8Var2, 0);
                    av8Var2.s(false);
                } else {
                    av8Var2.W();
                }
                break;
        }
        return Unit.a;
    }
}
