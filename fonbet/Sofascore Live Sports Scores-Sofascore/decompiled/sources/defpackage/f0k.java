package defpackage;

import com.sofascore.results.main.matches.redesign.trending.TrendingMatchesFragment;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class f0k implements b98 {
    public final /* synthetic */ int a;
    public final /* synthetic */ TrendingMatchesFragment b;
    public final /* synthetic */ TrendingMatchesFragment c;

    public /* synthetic */ f0k(TrendingMatchesFragment trendingMatchesFragment, TrendingMatchesFragment trendingMatchesFragment2, int i) {
        this.a = i;
        this.b = trendingMatchesFragment;
        this.c = trendingMatchesFragment2;
    }

    @Override // defpackage.b98
    public final Object emit(Object obj, rq3 rq3Var) {
        int i = this.a;
        TrendingMatchesFragment trendingMatchesFragment = this.b;
        TrendingMatchesFragment trendingMatchesFragment2 = this.c;
        switch (i) {
            case 0:
                j52 j52Var = (j52) obj;
                if (!(j52Var instanceof i42)) {
                    if (j52Var == null) {
                        yhk.s("null cannot be cast to non-null type com.sofascore.common.broadcastUtil.BroadcastEvent.ScrollToTop");
                        break;
                    }
                } else {
                    if (Intrinsics.c(trendingMatchesFragment.toString(), ((i42) j52Var).a)) {
                    }
                    break;
                }
                trendingMatchesFragment2.D();
            case 1:
                j52 j52Var2 = (j52) obj;
                if (!(j52Var2 instanceof i42)) {
                    if (j52Var2 == null) {
                        yhk.s("null cannot be cast to non-null type com.sofascore.common.broadcastUtil.BroadcastEvent.RefreshFavorites");
                        break;
                    }
                } else {
                    if (Intrinsics.c(trendingMatchesFragment.toString(), ((i42) j52Var2).a)) {
                    }
                    break;
                }
                trendingMatchesFragment2.C().U();
            default:
                j52 j52Var3 = (j52) obj;
                if (!(j52Var3 instanceof i42)) {
                    if (j52Var3 == null) {
                        yhk.s("null cannot be cast to non-null type com.sofascore.common.broadcastUtil.BroadcastEvent.RefreshDetailsBellButton");
                        break;
                    }
                } else {
                    if (Intrinsics.c(trendingMatchesFragment.toString(), ((i42) j52Var3).a)) {
                    }
                    break;
                }
                trendingMatchesFragment2.C().U();
        }
        return null;
    }
}
