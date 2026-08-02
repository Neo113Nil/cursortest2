package defpackage;

import com.sofascore.results.R;
import com.unity3d.services.UnityAdsConstants;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final /* synthetic */ class o47 implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;

    public /* synthetic */ o47(a88 a88Var, long j, int i) {
        this.a = 3;
        this.c = a88Var;
        this.b = j;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        utc utcVar = utc.a;
        long j = this.b;
        Object obj3 = this.c;
        switch (i) {
            case 0:
                s77 s77Var = (s77) obj3;
                of3 of3Var = (of3) obj;
                int intValue = ((Integer) obj2).intValue();
                av8 av8Var = (av8) of3Var;
                if (av8Var.T(intValue & 1, (intValue & 3) != 2)) {
                    mv1 mv1Var = uxf.g;
                    xtc h = ljg.h(4.0f, bkh.q(utcVar, 32.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2), lz.D(R.color.surface_2, av8Var), 4.0f);
                    k1c c = e12.c(mv1Var, false);
                    int hashCode = Long.hashCode(av8Var.T);
                    aee m = av8Var.m();
                    xtc C = fqj.C(av8Var, h);
                    if3.k7.getClass();
                    zg3 zg3Var = hf3.b;
                    av8Var.h0();
                    if (av8Var.S) {
                        av8Var.l(zg3Var);
                    } else {
                        av8Var.q0();
                    }
                    waa.K(av8Var, c, hf3.g);
                    waa.K(av8Var, m, hf3.f);
                    waa.K(av8Var, Integer.valueOf(hashCode), hf3.j);
                    waa.J(av8Var, hf3.k);
                    waa.K(av8Var, C, hf3.d);
                    String str = s77Var.f;
                    yf8 yf8Var = xth.a;
                    udj.c(str, null, this.b, null, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, xth.l(), av8Var, 0, 24960, 110586);
                    av8Var.s(true);
                } else {
                    av8Var.W();
                }
                break;
            case 1:
                ((Integer) obj2).getClass();
                aba.a(j, (Function0) obj3, (of3) obj, aba.K(1));
                break;
            case 2:
                bqh bqhVar = (bqh) obj3;
                of3 of3Var2 = (of3) obj;
                int intValue2 = ((Integer) obj2).intValue();
                av8 av8Var2 = (av8) of3Var2;
                if (av8Var2.T(intValue2 & 1, (intValue2 & 3) != 2)) {
                    kq9.b(bqhVar.a, null, bkh.l(utcVar, 16.0f), this.b, av8Var2, 432, 0);
                } else {
                    av8Var2.W();
                }
                break;
            case 3:
                ((Integer) obj2).getClass();
                x2a.a((a88) obj3, j, (of3) obj, aba.K(1));
                break;
            default:
                ((Integer) obj2).getClass();
                qha.c(j, (Function2) obj3, (of3) obj, aba.K(1));
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ o47(long j, dt8 dt8Var, int i, int i2) {
        this.a = i2;
        this.b = j;
        this.c = dt8Var;
    }

    public /* synthetic */ o47(Object obj, long j, int i) {
        this.a = i;
        this.c = obj;
        this.b = j;
    }
}
