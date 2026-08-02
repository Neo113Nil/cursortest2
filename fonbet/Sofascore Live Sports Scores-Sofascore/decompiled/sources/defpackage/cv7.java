package defpackage;

import com.sofascore.results.featuredtournament.FeaturedTournamentFragment;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class cv7 implements b98 {
    public final /* synthetic */ int a;
    public final /* synthetic */ FeaturedTournamentFragment b;
    public final /* synthetic */ FeaturedTournamentFragment c;

    public /* synthetic */ cv7(FeaturedTournamentFragment featuredTournamentFragment, FeaturedTournamentFragment featuredTournamentFragment2, int i) {
        this.a = i;
        this.b = featuredTournamentFragment;
        this.c = featuredTournamentFragment2;
    }

    @Override // defpackage.b98
    public final Object emit(Object obj, rq3 rq3Var) {
        int i = this.a;
        FeaturedTournamentFragment featuredTournamentFragment = this.b;
        FeaturedTournamentFragment featuredTournamentFragment2 = this.c;
        switch (i) {
            case 0:
                j52 j52Var = (j52) obj;
                if (!(j52Var instanceof i42)) {
                    if (j52Var == null) {
                        yhk.s("null cannot be cast to non-null type com.sofascore.common.broadcastUtil.BroadcastEvent.RefreshFavorites");
                        break;
                    }
                } else {
                    if (Intrinsics.c(featuredTournamentFragment.toString(), ((i42) j52Var).a)) {
                    }
                    break;
                }
                featuredTournamentFragment2.H();
                featuredTournamentFragment2.D().G();
            default:
                j52 j52Var2 = (j52) obj;
                if (!(j52Var2 instanceof i42)) {
                    if (j52Var2 == null) {
                        yhk.s("null cannot be cast to non-null type com.sofascore.common.broadcastUtil.BroadcastEvent.OddsConfigChanged");
                        break;
                    }
                } else {
                    if (Intrinsics.c(featuredTournamentFragment.toString(), ((i42) j52Var2).a)) {
                    }
                    break;
                }
                featuredTournamentFragment2.D().notifyDataSetChanged();
                featuredTournamentFragment2.u();
        }
        return null;
    }
}
