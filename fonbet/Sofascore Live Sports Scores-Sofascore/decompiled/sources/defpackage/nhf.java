package defpackage;

import com.unity3d.services.UnityAdsConstants;
import kotlin.Unit;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class nhf implements ct8 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;

    public nhf(long j, xhf xhfVar) {
        this.b = j;
        this.c = xhfVar;
    }

    @Override // defpackage.ct8
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.a;
        Object obj4 = this.c;
        switch (i) {
            case 0:
                boolean booleanValue = ((Boolean) obj).booleanValue();
                of3 of3Var = (of3) obj2;
                int intValue = ((Number) obj3).intValue();
                final xhf xhfVar = (xhf) obj4;
                if ((intValue & 6) == 0) {
                    intValue |= ((av8) of3Var).h(booleanValue) ? 4 : 2;
                }
                av8 av8Var = (av8) of3Var;
                if (!av8Var.T(intValue & 1, (intValue & 19) != 18)) {
                    av8Var.W();
                } else if (booleanValue) {
                    av8Var.d0(-499784343);
                    ncf.a(bkh.l(utc.a, 16.0f), this.b, 2.5f, 0L, 0, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, av8Var, 390, 56);
                    av8Var.s(false);
                } else {
                    av8Var.d0(-499540745);
                    boolean g = av8Var.g(xhfVar);
                    Object O = av8Var.O();
                    if (g || O == nf3.a) {
                        O = new a88() { // from class: mhf
                            @Override // defpackage.a88
                            public final float invoke() {
                                return ((Number) xhf.this.a.d()).floatValue();
                            }
                        };
                        av8Var.n0(O);
                    }
                    x2a.a((a88) O, this.b, av8Var, 0);
                    av8Var.s(false);
                }
                break;
            default:
                of3 of3Var2 = (of3) obj2;
                int intValue2 = ((Number) obj3).intValue();
                ((n8g) obj).getClass();
                if ((intValue2 & 17) == 16) {
                    av8 av8Var2 = (av8) of3Var2;
                    if (av8Var2.D()) {
                        av8Var2.W();
                        break;
                    }
                }
                av8 av8Var3 = (av8) of3Var2;
                av8Var3.e0(-1632146269);
                av8Var3.s(false);
                vdj.c((String) obj4, null, this.b, 0L, null, null, 0L, null, 0L, 0, false, 1, null, null, av8Var3, 0, 3072, 57338);
        }
        return Unit.a;
    }

    public nhf(String str, long j) {
        this.c = str;
        this.b = j;
    }
}
