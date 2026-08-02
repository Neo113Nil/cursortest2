package defpackage;

import android.content.Context;
import com.sofascore.results.league.fragment.events.LeagueEventsFragment;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class pwa extends hoi implements Function1 {
    public final /* synthetic */ int r;
    public final /* synthetic */ LeagueEventsFragment s;
    public final /* synthetic */ List t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ pwa(LeagueEventsFragment leagueEventsFragment, List list, rq3 rq3Var, int i) {
        super(1, rq3Var);
        this.r = i;
        this.s = leagueEventsFragment;
        this.t = list;
    }

    @Override // defpackage.h21
    public final rq3 create(rq3 rq3Var) {
        int i = this.r;
        List list = this.t;
        LeagueEventsFragment leagueEventsFragment = this.s;
        switch (i) {
            case 0:
                return new pwa(leagueEventsFragment, list, rq3Var, 0);
            default:
                return new pwa(leagueEventsFragment, list, rq3Var, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        rq3 rq3Var = (rq3) obj;
        switch (this.r) {
        }
        return ((pwa) create(rq3Var)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        int i = this.r;
        LeagueEventsFragment leagueEventsFragment = this.s;
        switch (i) {
            case 0:
                lu3 lu3Var = lu3.a;
                y6a.M(obj);
                Context requireContext = leagueEventsFragment.requireContext();
                requireContext.getClass();
                return mx9.u(requireContext, this.t, null, null, false, false, false, false, new z16(1), 6140);
            default:
                lu3 lu3Var2 = lu3.a;
                y6a.M(obj);
                Context requireContext2 = leagueEventsFragment.requireContext();
                requireContext2.getClass();
                return mx9.u(requireContext2, this.t, null, null, false, false, false, false, new z16(1), 6140);
        }
    }
}
