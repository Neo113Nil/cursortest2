package defpackage;

import com.sofascore.results.fantasy.league.settings.FantasyLeagueSettingsFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final /* synthetic */ class m57 implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ FantasyLeagueSettingsFragment b;

    public /* synthetic */ m57(FantasyLeagueSettingsFragment fantasyLeagueSettingsFragment, int i) {
        this.a = i;
        this.b = fantasyLeagueSettingsFragment;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        FantasyLeagueSettingsFragment fantasyLeagueSettingsFragment = this.b;
        int i2 = 1;
        of3 of3Var = (of3) obj;
        int intValue = ((Integer) obj2).intValue();
        switch (i) {
            case 0:
                av8 av8Var = (av8) of3Var;
                if (av8Var.T(intValue & 1, (intValue & 3) != 2)) {
                    haa.f(yqo.H(1824967136, av8Var, new m57(fantasyLeagueSettingsFragment, i2)), av8Var, 6);
                } else {
                    av8Var.W();
                }
                break;
            default:
                av8 av8Var2 = (av8) of3Var;
                if (av8Var2.T(intValue & 1, (intValue & 3) != 2)) {
                    c5n.g((r57) fantasyLeagueSettingsFragment.r.getValue(), (j37) fantasyLeagueSettingsFragment.s.getValue(), av8Var2, 0);
                } else {
                    av8Var2.W();
                }
                break;
        }
        return Unit.a;
    }
}
