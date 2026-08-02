package defpackage;

import com.sofascore.results.R;
import com.unity3d.services.UnityAdsConstants;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final /* synthetic */ class j4b implements et8 {
    public final /* synthetic */ int a;
    public final /* synthetic */ osa b;

    public /* synthetic */ j4b(osa osaVar, int i) {
        this.a = i;
        this.b = osaVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0127  */
    @Override // defpackage.et8
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        boolean z;
        utc utcVar;
        int i;
        int i2 = this.a;
        boolean z2 = true;
        osa osaVar = this.b;
        switch (i2) {
            case 0:
                int intValue = ((Integer) obj2).intValue();
                of3 of3Var = (of3) obj3;
                int intValue2 = ((Integer) obj4).intValue();
                ((xpa) obj).getClass();
                if ((intValue2 & 48) == 0) {
                    intValue2 |= ((av8) of3Var).e(intValue) ? 32 : 16;
                }
                av8 av8Var = (av8) of3Var;
                if (av8Var.T(intValue2 & 1, (intValue2 & 145) != 144)) {
                    lya lyaVar = (lya) osaVar.b(intValue);
                    if (lyaVar == null) {
                        av8Var.d0(-1101091398);
                        av8Var.s(false);
                    } else {
                        String str = lyaVar.g;
                        av8Var.d0(-1101091397);
                        if (intValue != 0) {
                            lya lyaVar2 = (lya) osaVar.b(intValue - 1);
                            if (Intrinsics.c(lyaVar2 != null ? lyaVar2.g : null, str)) {
                                z = false;
                                if (intValue != osaVar.c() - 1) {
                                    lya lyaVar3 = (lya) osaVar.b(intValue + 1);
                                    if (Intrinsics.c(lyaVar3 != null ? lyaVar3.g : null, str)) {
                                        z2 = false;
                                    }
                                }
                                float f = !z2 ? 16.0f : 0.0f;
                                utc utcVar2 = utc.a;
                                if (z) {
                                    utcVar = utcVar2;
                                    av8Var.d0(989919944);
                                    av8Var.s(false);
                                } else {
                                    av8Var.d0(989420224);
                                    utcVar = utcVar2;
                                    rha.c(str, n9e.q(l98.f0(utcVar2, 8.0f, 8.0f, 8.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8), lz.D(R.color.surface_1, av8Var), o7g.c(16.0f, 16.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 12)), null, av8Var, 0, 4);
                                    av8Var.s(false);
                                }
                                xtc q = n9e.q(l98.d0(utcVar, 8.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2), lz.D(R.color.surface_1, av8Var), o7g.c(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f, f, 3));
                                if (z2) {
                                    q = q.z(l98.f0(utcVar, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8.0f, 7));
                                }
                                i9a.e(lyaVar, q, av8Var, 0);
                                av8Var.s(false);
                            }
                        }
                        z = true;
                        if (intValue != osaVar.c() - 1) {
                        }
                        if (!z2) {
                        }
                        utc utcVar22 = utc.a;
                        if (z) {
                        }
                        xtc q2 = n9e.q(l98.d0(utcVar, 8.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2), lz.D(R.color.surface_1, av8Var), o7g.c(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f, f, 3));
                        if (z2) {
                        }
                        i9a.e(lyaVar, q2, av8Var, 0);
                        av8Var.s(false);
                    }
                } else {
                    av8Var.W();
                }
                break;
            default:
                xpa xpaVar = (xpa) obj;
                int intValue3 = ((Integer) obj2).intValue();
                of3 of3Var2 = (of3) obj3;
                int intValue4 = ((Integer) obj4).intValue();
                xpaVar.getClass();
                if ((intValue4 & 6) == 0) {
                    i = (((av8) of3Var2).g(xpaVar) ? 4 : 2) | intValue4;
                } else {
                    i = intValue4;
                }
                if ((intValue4 & 48) == 0) {
                    i |= ((av8) of3Var2).e(intValue3) ? 32 : 16;
                }
                av8 av8Var2 = (av8) of3Var2;
                if (av8Var2.T(i & 1, (i & 147) != 146)) {
                    m1e m1eVar = (m1e) osaVar.b(intValue3);
                    if (m1eVar == null) {
                        av8Var2.d0(886125682);
                        av8Var2.s(false);
                    } else {
                        av8Var2.d0(886125683);
                        xw3.i(m1eVar, xpa.a(xpaVar, u0a.F(utc.a, icb.d, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, av8Var2, 62), 7), av8Var2, 0);
                        av8Var2.s(false);
                    }
                } else {
                    av8Var2.W();
                }
                break;
        }
        return Unit.a;
    }
}
