package defpackage;

import com.sofascore.results.fantasy.competition.articles.FantasyNewsArticlesActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final /* synthetic */ class h87 implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ FantasyNewsArticlesActivity b;

    public /* synthetic */ h87(FantasyNewsArticlesActivity fantasyNewsArticlesActivity, int i) {
        this.a = i;
        this.b = fantasyNewsArticlesActivity;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        FantasyNewsArticlesActivity fantasyNewsArticlesActivity = this.b;
        int i2 = 2;
        int i3 = 1;
        of3 of3Var = (of3) obj;
        int intValue = ((Integer) obj2).intValue();
        switch (i) {
            case 0:
                int i4 = FantasyNewsArticlesActivity.M;
                av8 av8Var = (av8) of3Var;
                if (av8Var.T(intValue & 1, (intValue & 3) != 2)) {
                    haa.f(yqo.H(1439333378, av8Var, new h87(fantasyNewsArticlesActivity, i3)), av8Var, 6);
                } else {
                    av8Var.W();
                }
                break;
            default:
                int i5 = FantasyNewsArticlesActivity.M;
                av8 av8Var2 = (av8) of3Var;
                if (av8Var2.T(intValue & 1, (intValue & 3) != 2)) {
                    e1d x = rfo.x(((n87) fantasyNewsArticlesActivity.L.getValue()).h, av8Var2, 0);
                    wkn.a(((m87) x.getValue()).a, null, null, null, yqo.H(-2118364067, av8Var2, new hl6(i2, fantasyNewsArticlesActivity, x)), av8Var2, 24576, 14);
                } else {
                    av8Var2.W();
                }
                break;
        }
        return Unit.a;
    }
}
