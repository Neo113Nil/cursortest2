package defpackage;

import com.sofascore.model.Sports;
import com.sofascore.results.featuredtournament.FeaturedTournamentFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final /* synthetic */ class bv7 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ FeaturedTournamentFragment b;
    public final /* synthetic */ qv7 c;

    public /* synthetic */ bv7(FeaturedTournamentFragment featuredTournamentFragment, qv7 qv7Var, int i) {
        this.a = i;
        this.b = featuredTournamentFragment;
        this.c = qv7Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        qv7 qv7Var = this.c;
        FeaturedTournamentFragment featuredTournamentFragment = this.b;
        Integer num = (Integer) obj;
        switch (i) {
            case 0:
                int intValue = num.intValue();
                rbi rbiVar = (rbi) featuredTournamentFragment.u.getValue();
                qv7Var.getClass();
                rbi.t(rbiVar, intValue, 71636, Sports.FOOTBALL, null, 112);
                break;
            default:
                int intValue2 = num.intValue();
                nv7 G = featuredTournamentFragment.G();
                qv7Var.getClass();
                xw3.L(un0.z(G), null, null, new ok0(G, intValue2, (rq3) null, 24), 3);
                break;
        }
        return Unit.a;
    }
}
