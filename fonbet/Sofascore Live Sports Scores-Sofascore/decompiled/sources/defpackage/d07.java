package defpackage;

import com.sofascore.results.fantasy.highlights.gameweek.FantasyGameweekHighlightsActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.reflect.KFunction;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final /* synthetic */ class d07 implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ FantasyGameweekHighlightsActivity b;

    public /* synthetic */ d07(FantasyGameweekHighlightsActivity fantasyGameweekHighlightsActivity, int i) {
        this.a = i;
        this.b = fantasyGameweekHighlightsActivity;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        int i2 = 1;
        of3 of3Var = (of3) obj;
        int intValue = ((Integer) obj2).intValue();
        switch (i) {
            case 0:
                int i3 = FantasyGameweekHighlightsActivity.Z;
                av8 av8Var = (av8) of3Var;
                if (av8Var.T(intValue & 1, (intValue & 3) != 2)) {
                    haa.f(yqo.H(-1567945294, av8Var, new d07(this.b, i2)), av8Var, 6);
                } else {
                    av8Var.W();
                }
                break;
            default:
                int i4 = FantasyGameweekHighlightsActivity.Z;
                av8 av8Var2 = (av8) of3Var;
                if (av8Var2.T(intValue & 1, (intValue & 3) != 2)) {
                    FantasyGameweekHighlightsActivity fantasyGameweekHighlightsActivity = this.b;
                    String str = (String) fantasyGameweekHighlightsActivity.W.getValue();
                    int intValue2 = ((Number) fantasyGameweekHighlightsActivity.X.getValue()).intValue();
                    boolean i5 = av8Var2.i(fantasyGameweekHighlightsActivity);
                    Object O = av8Var2.O();
                    if (i5 || O == nf3.a) {
                        av6 av6Var = new av6(0, fantasyGameweekHighlightsActivity, FantasyGameweekHighlightsActivity.class, "finish", "finish()V", 0, 6);
                        av8Var2.n0(av6Var);
                        O = av6Var;
                    }
                    gz8.e(intValue2, 0, av8Var2, null, str, (Function0) ((KFunction) O));
                } else {
                    av8Var2.W();
                }
                break;
        }
        return Unit.a;
    }
}
