package defpackage;

import com.blaze.blazesdk.data_source.BlazeDataSourcePersonalizedType;
import com.blaze.blazesdk.data_source.BlazeWidgetLabel;
import com.blaze.blazesdk.features.moments.widgets.grid.BlazeMomentsWidgetGridView;
import com.blaze.blazesdk.features.moments.widgets.row.BlazeMomentsWidgetRowView;
import com.blaze.blazesdk.features.stories.widgets.grid.BlazeStoriesWidgetGridView;
import com.blaze.blazesdk.features.stories.widgets.row.BlazeStoriesWidgetRowView;
import com.blaze.blazesdk.features.videos.widgets.grid.BlazeVideosWidgetGridView;
import com.blaze.blazesdk.features.videos.widgets.row.BlazeVideosWidgetRowView;
import com.blaze.blazesdk.players.inline.BlazeBaseInlinePlayerContainer;
import com.blaze.blazesdk.shared.results.BlazeResult;
import com.sofascore.model.mvvm.model.PlayerMatchesEventStatistics;
import com.sofascore.model.newNetwork.statistics.season.team.BasketballTeamSeasonStatistics;
import com.sofascore.results.view.BellButton;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final /* synthetic */ class ls1 implements Function1 {
    public final /* synthetic */ int a;

    public /* synthetic */ ls1(int i) {
        this.a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        CharSequence _get_stringRepresentation_$lambda$0;
        CharSequence _get_stringRepresentation_$lambda$1;
        switch (this.a) {
            case 0:
                c73 c73Var = (c73) obj;
                c73Var.getClass();
                BasketballTeamSeasonStatistics F = z8e.F(c73Var);
                return yid.i(F != null ? F.getTechnicalFouls() : null);
            case 1:
                c73 c73Var2 = (c73) obj;
                c73Var2.getClass();
                BasketballTeamSeasonStatistics F2 = z8e.F(c73Var2);
                return yid.i(F2 != null ? F2.getFlagrantFouls() : null);
            case 2:
                c73 c73Var3 = (c73) obj;
                c73Var3.getClass();
                BasketballTeamSeasonStatistics F3 = z8e.F(c73Var3);
                return z8e.P(F3 != null ? F3.getAssists() : null, z8e.F(c73Var3));
            case 3:
                c73 c73Var4 = (c73) obj;
                c73Var4.getClass();
                BasketballTeamSeasonStatistics F4 = z8e.F(c73Var4);
                if (F4 != null) {
                    return F4.getAssistTurnoverRatio();
                }
                return null;
            case 4:
                c73 c73Var5 = (c73) obj;
                c73Var5.getClass();
                BasketballTeamSeasonStatistics F5 = z8e.F(c73Var5);
                return z8e.P(F5 != null ? F5.getFieldGoalsMade() : null, z8e.F(c73Var5));
            case 5:
                c73 c73Var6 = (c73) obj;
                c73Var6.getClass();
                BasketballTeamSeasonStatistics F6 = z8e.F(c73Var6);
                if (F6 != null) {
                    return F6.getFieldGoalsPercentage();
                }
                return null;
            case 6:
                c73 c73Var7 = (c73) obj;
                c73Var7.getClass();
                BasketballTeamSeasonStatistics F7 = z8e.F(c73Var7);
                return z8e.P(F7 != null ? F7.getThreePointsMade() : null, z8e.F(c73Var7));
            case 7:
                PlayerMatchesEventStatistics playerMatchesEventStatistics = (PlayerMatchesEventStatistics) obj;
                playerMatchesEventStatistics.getClass();
                return String.valueOf(playerMatchesEventStatistics.getBattingAtBats());
            case 8:
                PlayerMatchesEventStatistics playerMatchesEventStatistics2 = (PlayerMatchesEventStatistics) obj;
                playerMatchesEventStatistics2.getClass();
                Double valueOf = Double.valueOf(playerMatchesEventStatistics2.getBattingSluggingPercentageToDate());
                yid.k(valueOf);
                String format = new DecimalFormat(".000", new DecimalFormatSymbols(Locale.US)).format(yid.k(valueOf));
                format.getClass();
                return format;
            case 9:
                PlayerMatchesEventStatistics playerMatchesEventStatistics3 = (PlayerMatchesEventStatistics) obj;
                playerMatchesEventStatistics3.getClass();
                Double valueOf2 = Double.valueOf(playerMatchesEventStatistics3.getBattingOpsToDate());
                yid.k(valueOf2);
                String format2 = new DecimalFormat(".000", new DecimalFormatSymbols(Locale.US)).format(yid.k(valueOf2));
                format2.getClass();
                return format2;
            case 10:
                PlayerMatchesEventStatistics playerMatchesEventStatistics4 = (PlayerMatchesEventStatistics) obj;
                playerMatchesEventStatistics4.getClass();
                return String.valueOf(playerMatchesEventStatistics4.getBattingRuns());
            case 11:
                PlayerMatchesEventStatistics playerMatchesEventStatistics5 = (PlayerMatchesEventStatistics) obj;
                playerMatchesEventStatistics5.getClass();
                return String.valueOf(playerMatchesEventStatistics5.getBattingHits());
            case 12:
                PlayerMatchesEventStatistics playerMatchesEventStatistics6 = (PlayerMatchesEventStatistics) obj;
                playerMatchesEventStatistics6.getClass();
                return String.valueOf(playerMatchesEventStatistics6.getBattingRbi());
            case 13:
                PlayerMatchesEventStatistics playerMatchesEventStatistics7 = (PlayerMatchesEventStatistics) obj;
                playerMatchesEventStatistics7.getClass();
                return String.valueOf(playerMatchesEventStatistics7.getBattingHomeRuns());
            case 14:
                PlayerMatchesEventStatistics playerMatchesEventStatistics8 = (PlayerMatchesEventStatistics) obj;
                playerMatchesEventStatistics8.getClass();
                return String.valueOf(playerMatchesEventStatistics8.getBattingBaseOnBalls());
            case 15:
                PlayerMatchesEventStatistics playerMatchesEventStatistics9 = (PlayerMatchesEventStatistics) obj;
                playerMatchesEventStatistics9.getClass();
                return String.valueOf(playerMatchesEventStatistics9.getBattingStrikeOuts());
            case 16:
                PlayerMatchesEventStatistics playerMatchesEventStatistics10 = (PlayerMatchesEventStatistics) obj;
                playerMatchesEventStatistics10.getClass();
                Double valueOf3 = Double.valueOf(playerMatchesEventStatistics10.getBattingAverageToDate());
                yid.k(valueOf3);
                String format3 = new DecimalFormat(".000", new DecimalFormatSymbols(Locale.US)).format(yid.k(valueOf3));
                format3.getClass();
                return format3;
            case 17:
                PlayerMatchesEventStatistics playerMatchesEventStatistics11 = (PlayerMatchesEventStatistics) obj;
                playerMatchesEventStatistics11.getClass();
                Double valueOf4 = Double.valueOf(playerMatchesEventStatistics11.getBattingOnBasePercentageToDate());
                yid.k(valueOf4);
                String format4 = new DecimalFormat(".000", new DecimalFormatSymbols(Locale.US)).format(yid.k(valueOf4));
                format4.getClass();
                return format4;
            case 18:
                ((Boolean) obj).getClass();
                int i = BellButton.h;
                return Unit.a;
            case 19:
                return BlazeBaseInlinePlayerContainer.c((BlazeResult) obj);
            case 20:
                return BlazeBaseInlinePlayerContainer.b((BlazeResult) obj);
            case 21:
                return BlazeBaseInlinePlayerContainer.a((BlazeResult) obj);
            case 22:
                ((BlazeMomentsWidgetGridView) obj).getClass();
                return Unit.a;
            case 23:
                ((BlazeMomentsWidgetRowView) obj).getClass();
                return Unit.a;
            case 24:
                ((BlazeStoriesWidgetGridView) obj).getClass();
                return Unit.a;
            case 25:
                ((BlazeStoriesWidgetRowView) obj).getClass();
                return Unit.a;
            case 26:
                ((BlazeVideosWidgetGridView) obj).getClass();
                return Unit.a;
            case 27:
                ((BlazeVideosWidgetRowView) obj).getClass();
                return Unit.a;
            case 28:
                _get_stringRepresentation_$lambda$0 = BlazeDataSourcePersonalizedType._get_stringRepresentation_$lambda$0((Map.Entry) obj);
                return _get_stringRepresentation_$lambda$0;
            default:
                _get_stringRepresentation_$lambda$1 = BlazeDataSourcePersonalizedType._get_stringRepresentation_$lambda$1((BlazeWidgetLabel) obj);
                return _get_stringRepresentation_$lambda$1;
        }
    }
}
