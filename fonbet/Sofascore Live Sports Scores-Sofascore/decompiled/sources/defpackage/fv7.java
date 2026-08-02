package defpackage;

import com.sofascore.model.firebase.AdType;
import com.sofascore.results.ads.iml.banner.AdBannerView;
import com.sofascore.results.featuredtournament.FeaturedTournamentFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class fv7 extends hoi implements Function2 {
    public final /* synthetic */ FeaturedTournamentFragment r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fv7(FeaturedTournamentFragment featuredTournamentFragment, rq3 rq3Var) {
        super(2, rq3Var);
        this.r = featuredTournamentFragment;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        return new fv7(this.r, rq3Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((fv7) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        lu3 lu3Var = lu3.a;
        y6a.M(obj);
        FeaturedTournamentFragment featuredTournamentFragment = this.r;
        ((AdBannerView) featuredTournamentFragment.w.getValue()).c(AdType.Banner.FeaturedTournamentSmall);
        ((AdBannerView) featuredTournamentFragment.x.getValue()).c(AdType.Banner.FeaturedTournamentBig);
        return Unit.a;
    }
}
