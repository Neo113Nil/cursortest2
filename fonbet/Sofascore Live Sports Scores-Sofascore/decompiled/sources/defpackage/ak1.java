package defpackage;

import com.sofascore.results.R;
import com.unity3d.services.UnityAdsConstants;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final /* synthetic */ class ak1 implements ct8 {
    public final /* synthetic */ int a;
    public final /* synthetic */ xhf b;
    public final /* synthetic */ e1d c;

    public /* synthetic */ ak1(xhf xhfVar, e1d e1dVar, int i) {
        this.a = i;
        this.b = xhfVar;
        this.c = e1dVar;
    }

    @Override // defpackage.ct8
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        boolean z;
        m4b m4bVar;
        int i = this.a;
        utc utcVar = utc.a;
        e1d e1dVar = this.c;
        switch (i) {
            case 0:
                m12 m12Var = (m12) obj;
                of3 of3Var = (of3) obj2;
                int intValue = ((Integer) obj3).intValue();
                m12Var.getClass();
                if ((intValue & 6) == 0) {
                    intValue |= ((av8) of3Var).g(m12Var) ? 4 : 2;
                }
                av8 av8Var = (av8) of3Var;
                if (av8Var.T(intValue & 1, (intValue & 19) != 18)) {
                    phf phfVar = phf.a;
                    xtc a = m12Var.a(utcVar, uxf.d);
                    if (!Intrinsics.c((vnb) e1dVar.getValue(), tnb.a)) {
                        fk1 fk1Var = (fk1) ((vnb) e1dVar.getValue()).a();
                        if (!Intrinsics.c(fk1Var != null ? Boolean.valueOf(fk1Var.g) : null, Boolean.TRUE)) {
                            z = false;
                            phfVar.a(this.b, z, a, lz.D(R.color.surface_P, av8Var), lz.D(R.color.primary_default, av8Var), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, av8Var, 0, 32);
                        }
                    }
                    z = true;
                    phfVar.a(this.b, z, a, lz.D(R.color.surface_P, av8Var), lz.D(R.color.primary_default, av8Var), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, av8Var, 0, 32);
                } else {
                    av8Var.W();
                }
                break;
            case 1:
                m12 m12Var2 = (m12) obj;
                of3 of3Var2 = (of3) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                m12Var2.getClass();
                if ((intValue2 & 6) == 0) {
                    intValue2 |= ((av8) of3Var2).g(m12Var2) ? 4 : 2;
                }
                av8 av8Var2 = (av8) of3Var2;
                if (av8Var2.T(intValue2 & 1, (intValue2 & 19) != 18)) {
                    phf phfVar2 = phf.a;
                    is3 is3Var = (is3) ((vnb) e1dVar.getValue()).a();
                    phfVar2.a(this.b, Intrinsics.c(is3Var != null ? Boolean.valueOf(is3Var.e) : null, Boolean.TRUE), m12Var2.a(utcVar, uxf.d), lz.D(R.color.surface_P, av8Var2), lz.D(R.color.primary_default, av8Var2), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, av8Var2, 0, 32);
                } else {
                    av8Var2.W();
                }
                break;
            case 2:
                m12 m12Var3 = (m12) obj;
                of3 of3Var3 = (of3) obj2;
                int intValue3 = ((Integer) obj3).intValue();
                m12Var3.getClass();
                if ((intValue3 & 6) == 0) {
                    intValue3 |= ((av8) of3Var3).g(m12Var3) ? 4 : 2;
                }
                av8 av8Var3 = (av8) of3Var3;
                if (av8Var3.T(intValue3 & 1, (intValue3 & 19) != 18)) {
                    phf phfVar3 = phf.a;
                    vnb vnbVar = (vnb) e1dVar.getValue();
                    unb unbVar = vnbVar instanceof unb ? (unb) vnbVar : null;
                    if (unbVar != null && (m4bVar = (m4b) unbVar.a) != null) {
                        r2 = Boolean.valueOf(m4bVar.f);
                    }
                    phfVar3.a(this.b, Intrinsics.c(r2, Boolean.TRUE), m12Var3.a(utcVar, uxf.d), lz.D(R.color.surface_P, av8Var3), lz.D(R.color.primary_default, av8Var3), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, av8Var3, 0, 32);
                } else {
                    av8Var3.W();
                }
                break;
            case 3:
                m12 m12Var4 = (m12) obj;
                of3 of3Var4 = (of3) obj2;
                int intValue4 = ((Integer) obj3).intValue();
                m12Var4.getClass();
                if ((intValue4 & 6) == 0) {
                    intValue4 |= ((av8) of3Var4).g(m12Var4) ? 4 : 2;
                }
                av8 av8Var4 = (av8) of3Var4;
                if (av8Var4.T(intValue4 & 1, (intValue4 & 19) != 18)) {
                    phf phfVar4 = phf.a;
                    zbc zbcVar = (zbc) ((vnb) e1dVar.getValue()).a();
                    phfVar4.a(this.b, Intrinsics.c(zbcVar != null ? zbcVar.e : null, Boolean.TRUE), m12Var4.a(utcVar, uxf.d), lz.D(R.color.surface_P, av8Var4), lz.D(R.color.primary_default, av8Var4), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, av8Var4, 0, 32);
                } else {
                    av8Var4.W();
                }
                break;
            case 4:
                m12 m12Var5 = (m12) obj;
                of3 of3Var5 = (of3) obj2;
                int intValue5 = ((Integer) obj3).intValue();
                m12Var5.getClass();
                if ((intValue5 & 6) == 0) {
                    intValue5 |= ((av8) of3Var5).g(m12Var5) ? 4 : 2;
                }
                av8 av8Var5 = (av8) of3Var5;
                if (av8Var5.T(intValue5 & 1, (intValue5 & 19) != 18)) {
                    phf.a.a(this.b, ((Boolean) e1dVar.getValue()).booleanValue(), m12Var5.a(utcVar, uxf.d), lz.D(R.color.surface_P, av8Var5), lz.D(R.color.primary_default, av8Var5), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, av8Var5, 0, 32);
                } else {
                    av8Var5.W();
                }
                break;
            case 5:
                m12 m12Var6 = (m12) obj;
                of3 of3Var6 = (of3) obj2;
                int intValue6 = ((Integer) obj3).intValue();
                m12Var6.getClass();
                if ((intValue6 & 6) == 0) {
                    intValue6 |= ((av8) of3Var6).g(m12Var6) ? 4 : 2;
                }
                av8 av8Var6 = (av8) of3Var6;
                if (av8Var6.T(intValue6 & 1, (intValue6 & 19) != 18)) {
                    phf phfVar5 = phf.a;
                    pi5 pi5Var = (pi5) ((vnb) e1dVar.getValue()).a();
                    phfVar5.a(this.b, pi5Var != null && pi5Var.f, m12Var6.a(utcVar, uxf.d), lz.D(R.color.surface_P, av8Var6), lz.D(R.color.primary_default, av8Var6), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, av8Var6, 0, 32);
                } else {
                    av8Var6.W();
                }
                break;
            case 6:
                m12 m12Var7 = (m12) obj;
                of3 of3Var7 = (of3) obj2;
                int intValue7 = ((Integer) obj3).intValue();
                m12Var7.getClass();
                if ((intValue7 & 6) == 0) {
                    intValue7 |= ((av8) of3Var7).g(m12Var7) ? 4 : 2;
                }
                av8 av8Var7 = (av8) of3Var7;
                if (av8Var7.T(intValue7 & 1, (intValue7 & 19) != 18)) {
                    phf.a.a(this.b, ((Boolean) e1dVar.getValue()).booleanValue(), m12Var7.a(utcVar, uxf.d), lz.D(R.color.surface_P, av8Var7), lz.D(R.color.primary_default, av8Var7), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, av8Var7, 0, 32);
                } else {
                    av8Var7.W();
                }
                break;
            case 7:
                m12 m12Var8 = (m12) obj;
                of3 of3Var8 = (of3) obj2;
                int intValue8 = ((Integer) obj3).intValue();
                m12Var8.getClass();
                if ((intValue8 & 6) == 0) {
                    intValue8 |= ((av8) of3Var8).g(m12Var8) ? 4 : 2;
                }
                av8 av8Var8 = (av8) of3Var8;
                if (av8Var8.T(intValue8 & 1, (intValue8 & 19) != 18)) {
                    phf.a.a(this.b, ((Boolean) e1dVar.getValue()).booleanValue(), m12Var8.a(utcVar, uxf.d), lz.D(R.color.surface_P, av8Var8), lz.D(R.color.primary_default, av8Var8), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, av8Var8, 0, 32);
                } else {
                    av8Var8.W();
                }
                break;
            default:
                m12 m12Var9 = (m12) obj;
                of3 of3Var9 = (of3) obj2;
                int intValue9 = ((Integer) obj3).intValue();
                m12Var9.getClass();
                if ((intValue9 & 6) == 0) {
                    intValue9 |= ((av8) of3Var9).g(m12Var9) ? 4 : 2;
                }
                av8 av8Var9 = (av8) of3Var9;
                if (av8Var9.T(intValue9 & 1, (intValue9 & 19) != 18)) {
                    phf.a.a(this.b, ((Boolean) e1dVar.getValue()).booleanValue(), m12Var9.a(utcVar, uxf.d), lz.D(R.color.surface_P, av8Var9), lz.D(R.color.primary_default, av8Var9), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, av8Var9, 0, 32);
                } else {
                    av8Var9.W();
                }
                break;
        }
        return Unit.a;
    }
}
