package defpackage;

import android.content.Context;
import android.widget.FrameLayout;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.sofascore.model.fantasy.FantasyNewsArticle;
import com.sofascore.model.fantasy.FantasyPlayerFixture;
import com.sofascore.model.fantasy.FantasyPlayerPriceChanges;
import com.sofascore.results.fantasy.competition.articles.FantasyNewsArticlesActivity;
import com.sofascore.results.fantasy.ui.model.FantasyPlayerFixtureUiModel;
import com.sofascore.results.view.SofascoreRatingView;
import com.sofascore.results.view.SofascoreSmallRatingView;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final /* synthetic */ class e87 implements Function1 {
    public final /* synthetic */ int a;

    public /* synthetic */ e87(int i) {
        this.a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                ((Boolean) obj).getClass();
                return Unit.a;
            case 1:
                ((Boolean) obj).getClass();
                return Unit.a;
            case 2:
                FantasyNewsArticle fantasyNewsArticle = (FantasyNewsArticle) obj;
                int i = FantasyNewsArticlesActivity.M;
                fantasyNewsArticle.getClass();
                return Integer.valueOf(fantasyNewsArticle.getId());
            case 3:
                int i2 = FantasyNewsArticlesActivity.M;
                ((FantasyNewsArticle) obj).getClass();
                return "article";
            case 4:
                efh efhVar = (efh) obj;
                efhVar.getClass();
                return Boolean.valueOf(efhVar != efh.a);
            case 5:
                efh efhVar2 = (efh) obj;
                efhVar2.getClass();
                return Boolean.valueOf(efhVar2 != efh.a);
            case 6:
                ((kpa) obj).getClass();
                return new o39(waa.b(kpa.c));
            case 7:
                ((kpa) obj).getClass();
                return new o39(waa.b(kpa.c));
            case 8:
                ((mp6) obj).getClass();
                return "competition_tile";
            case 9:
                pb7 pb7Var = (pb7) obj;
                int i3 = wb7.o;
                pb7Var.getClass();
                return pb7Var.f;
            case 10:
                Context context = (Context) obj;
                context.getClass();
                FrameLayout frameLayout = new FrameLayout(context);
                frameLayout.addView(new SofascoreSmallRatingView(context, null, 6));
                return frameLayout;
            case 11:
                Context context2 = (Context) obj;
                context2.getClass();
                FrameLayout frameLayout2 = new FrameLayout(context2);
                frameLayout2.addView(new SofascoreSmallRatingView(context2, null, 6));
                return frameLayout2;
            case 12:
                dz6 dz6Var = (dz6) obj;
                dz6Var.getClass();
                return dz6Var.getClass().getName();
            case 13:
                ae7 ae7Var = (ae7) obj;
                ae7Var.getClass();
                return Intrinsics.c(ae7Var.a, CampaignEx.JSON_KEY_STAR) ? "rating_row" : "statistic_row";
            case 14:
                ae7 ae7Var2 = (ae7) obj;
                ae7Var2.getClass();
                return Intrinsics.c(ae7Var2.a, CampaignEx.JSON_KEY_STAR) ? "rating_row" : "statistic_row";
            case 15:
                kj7 kj7Var = (kj7) obj;
                kj7Var.getClass();
                return fc6.g(kj7Var.a.a, kj7Var.b, "_");
            case 16:
                ((kj7) obj).getClass();
                return "player_item";
            case 17:
                FantasyPlayerPriceChanges fantasyPlayerPriceChanges = (FantasyPlayerPriceChanges) obj;
                fantasyPlayerPriceChanges.getClass();
                return Integer.valueOf(fantasyPlayerPriceChanges.getFantasyPlayerId());
            case 18:
                ((FantasyPlayerPriceChanges) obj).getClass();
                return "player_item";
            case 19:
                gf7 gf7Var = (gf7) obj;
                gf7Var.getClass();
                return gf7Var.b;
            case 20:
                mj7 mj7Var = (mj7) obj;
                mj7Var.getClass();
                return Integer.valueOf(mj7Var.a);
            case 21:
                ((mj7) obj).getClass();
                return "rail_item";
            case 22:
                FantasyPlayerFixture fantasyPlayerFixture = (FantasyPlayerFixture) obj;
                fantasyPlayerFixture.getClass();
                String nameCode = fantasyPlayerFixture.getTeam().getNameCode();
                if (nameCode != null) {
                    return nameCode;
                }
                String shortName = fantasyPlayerFixture.getTeam().getShortName();
                return shortName == null ? fantasyPlayerFixture.getTeam().getName() : shortName;
            case 23:
                FantasyPlayerFixture fantasyPlayerFixture2 = (FantasyPlayerFixture) obj;
                fantasyPlayerFixture2.getClass();
                String nameCode2 = fantasyPlayerFixture2.getTeam().getNameCode();
                if (nameCode2 != null) {
                    return nameCode2;
                }
                String shortName2 = fantasyPlayerFixture2.getTeam().getShortName();
                return shortName2 == null ? fantasyPlayerFixture2.getTeam().getName() : shortName2;
            case 24:
                FantasyPlayerFixtureUiModel fantasyPlayerFixtureUiModel = (FantasyPlayerFixtureUiModel) obj;
                fantasyPlayerFixtureUiModel.getClass();
                return fantasyPlayerFixtureUiModel.h;
            case 25:
                q67 q67Var = (q67) obj;
                q67Var.getClass();
                return Integer.valueOf(q67Var.a.a);
            case 26:
                ((Integer) obj).getClass();
                return "statistic_item";
            case 27:
                Context context3 = (Context) obj;
                context3.getClass();
                return new SofascoreRatingView(context3, null, 6);
            case 28:
                Context context4 = (Context) obj;
                context4.getClass();
                return new SofascoreRatingView(context4, null, 6);
            default:
                ((Boolean) obj).getClass();
                return Unit.a;
        }
    }
}
