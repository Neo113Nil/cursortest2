package defpackage;

import com.sofascore.results.fantasy.welcome.FantasyWelcomeActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final /* synthetic */ class bq7 implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ FantasyWelcomeActivity b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ bq7(boolean z, FantasyWelcomeActivity fantasyWelcomeActivity) {
        this.a = 2;
        this.c = z;
        this.b = fantasyWelcomeActivity;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        FantasyWelcomeActivity fantasyWelcomeActivity = this.b;
        boolean z = this.c;
        int i2 = 1;
        of3 of3Var = (of3) obj;
        int intValue = ((Integer) obj2).intValue();
        switch (i) {
            case 0:
                int i3 = FantasyWelcomeActivity.M;
                av8 av8Var = (av8) of3Var;
                if (av8Var.T(intValue & 1, (intValue & 3) != 2)) {
                    haa.f(yqo.H(-661460506, av8Var, new bq7(fantasyWelcomeActivity, z, i2)), av8Var, 6);
                } else {
                    av8Var.W();
                }
                break;
            case 1:
                int i4 = FantasyWelcomeActivity.M;
                av8 av8Var2 = (av8) of3Var;
                if (av8Var2.T(intValue & 1, (intValue & 3) != 2)) {
                    tol.b(qgb.a.a(new uv(fantasyWelcomeActivity)), yqo.H(-1479967450, av8Var2, new bq7(z, fantasyWelcomeActivity)), av8Var2, 56);
                } else {
                    av8Var2.W();
                }
                break;
            default:
                int i5 = FantasyWelcomeActivity.M;
                av8 av8Var3 = (av8) of3Var;
                if (av8Var3.T(intValue & 1, (intValue & 3) != 2)) {
                    boolean i6 = av8Var3.i(fantasyWelcomeActivity);
                    Object O = av8Var3.O();
                    if (i6 || O == nf3.a) {
                        O = new cq7(fantasyWelcomeActivity, 2);
                        av8Var3.n0(O);
                    }
                    jq7.c(z, (Function0) O, av8Var3, 0);
                } else {
                    av8Var3.W();
                }
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ bq7(FantasyWelcomeActivity fantasyWelcomeActivity, boolean z, int i) {
        this.a = i;
        this.b = fantasyWelcomeActivity;
        this.c = z;
    }
}
