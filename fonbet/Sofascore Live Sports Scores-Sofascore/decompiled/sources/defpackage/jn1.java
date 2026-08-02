package defpackage;

import com.sofascore.model.network.response.PlayerOrTeam;
import com.sofascore.results.R;
import com.unity3d.services.UnityAdsConstants;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final /* synthetic */ class jn1 implements Function2 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ int b;
    public final /* synthetic */ float c;
    public final /* synthetic */ Object d;

    public /* synthetic */ jn1(float f, int i, int i2, Integer num) {
        this.b = i;
        this.d = num;
        this.c = f;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        int i2 = this.b;
        float f = this.c;
        Object obj3 = this.d;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                m6k.l(i2, (Integer) obj3, f, (of3) obj, aba.K(1));
                break;
            case 1:
                s4c s4cVar = (s4c) obj3;
                of3 of3Var = (of3) obj;
                int intValue = ((Integer) obj2).intValue();
                av8 av8Var = (av8) of3Var;
                if (av8Var.T(intValue & 1, (intValue & 3) != 2)) {
                    xtc q = n9e.q(wnn.A(bkh.e(new goa(1.0f, true), 6.0f), o7g.a(16.0f)), lz.D(R.color.n_lv_5, av8Var), oyn.e);
                    long j0 = fcp.j0(i2, av8Var, true, s4cVar.h);
                    long j = r13.h;
                    boolean d = av8Var.d(f);
                    Object O = av8Var.O();
                    a99 a99Var = nf3.a;
                    if (d || O == a99Var) {
                        O = new va6(f);
                        av8Var.n0(O);
                    }
                    Function0 function0 = (Function0) O;
                    Object O2 = av8Var.O();
                    if (O2 == a99Var) {
                        O2 = new au5(23);
                        av8Var.n0(O2);
                    }
                    ncf.c(function0, q, j0, j, 2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, (Function1) O2, av8Var, 1772544);
                } else {
                    av8Var.W();
                }
                break;
            default:
                ((Integer) obj2).getClass();
                c6o.m((PlayerOrTeam) obj3, f, (of3) obj, aba.K(1 | i2));
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ jn1(s4c s4cVar, int i, float f) {
        this.d = s4cVar;
        this.b = i;
        this.c = f;
    }

    public /* synthetic */ jn1(PlayerOrTeam playerOrTeam, float f, int i) {
        this.d = playerOrTeam;
        this.c = f;
        this.b = i;
    }
}
