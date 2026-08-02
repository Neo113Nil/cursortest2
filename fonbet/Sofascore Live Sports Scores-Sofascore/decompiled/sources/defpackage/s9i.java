package defpackage;

import com.blaze.blazesdk.features.stories.models.ui.StoryModel;
import com.blaze.blazesdk.features.stories.repos.StoriesRepositoryImpl;
import com.sofascore.model.mvvm.model.StandingsTableRow;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Arrays;
import java.util.Locale;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final /* synthetic */ class s9i implements Function1 {
    public final /* synthetic */ int a;

    public /* synthetic */ s9i(int i) {
        this.a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Double netRunRate;
        Double gamesBehind;
        Double percentage;
        switch (this.a) {
            case 0:
                StandingsTableRow standingsTableRow = (StandingsTableRow) obj;
                if (standingsTableRow != null) {
                    return standingsTableRow.getMatches();
                }
                return null;
            case 1:
                StandingsTableRow standingsTableRow2 = (StandingsTableRow) obj;
                if (standingsTableRow2 == null || (netRunRate = standingsTableRow2.getNetRunRate()) == null) {
                    return null;
                }
                return String.format(Intrinsics.c(Locale.getDefault().getLanguage(), new Locale("ar").getLanguage()) ? Locale.US : Locale.getDefault(), "%.3f", Arrays.copyOf(new Object[]{Double.valueOf(netRunRate.doubleValue())}, 1));
            case 2:
                StandingsTableRow standingsTableRow3 = (StandingsTableRow) obj;
                if (standingsTableRow3 != null) {
                    return standingsTableRow3.getWins();
                }
                return null;
            case 3:
                StandingsTableRow standingsTableRow4 = (StandingsTableRow) obj;
                if (standingsTableRow4 != null) {
                    return standingsTableRow4.getNoResult();
                }
                return null;
            case 4:
                StandingsTableRow standingsTableRow5 = (StandingsTableRow) obj;
                if (standingsTableRow5 != null) {
                    return standingsTableRow5.getStreak();
                }
                return null;
            case 5:
                StandingsTableRow standingsTableRow6 = (StandingsTableRow) obj;
                if (standingsTableRow6 == null || (gamesBehind = standingsTableRow6.getGamesBehind()) == null) {
                    return null;
                }
                if (wzb.a(gamesBehind.doubleValue()) <= 0) {
                    gamesBehind = null;
                }
                if (gamesBehind != null) {
                    return new DecimalFormat("#0.#", new DecimalFormatSymbols(Locale.US)).format(gamesBehind.doubleValue());
                }
                return null;
            case 6:
                StandingsTableRow standingsTableRow7 = (StandingsTableRow) obj;
                if (standingsTableRow7 != null) {
                    return standingsTableRow7.getPointsPrevPrevSeason();
                }
                return null;
            case 7:
                StandingsTableRow standingsTableRow8 = (StandingsTableRow) obj;
                if (standingsTableRow8 != null) {
                    return standingsTableRow8.getPointsPrevSeason();
                }
                return null;
            case 8:
                StandingsTableRow standingsTableRow9 = (StandingsTableRow) obj;
                if (standingsTableRow9 != null) {
                    return standingsTableRow9.getPointsCurrSeason();
                }
                return null;
            case 9:
                StandingsTableRow standingsTableRow10 = (StandingsTableRow) obj;
                if (standingsTableRow10 != null) {
                    return standingsTableRow10.getPoints();
                }
                return null;
            case 10:
                StandingsTableRow standingsTableRow11 = (StandingsTableRow) obj;
                if (standingsTableRow11 != null) {
                    return standingsTableRow11.getPointsPerGame();
                }
                return null;
            case 11:
                StandingsTableRow standingsTableRow12 = (StandingsTableRow) obj;
                if (standingsTableRow12 != null) {
                    return standingsTableRow12.getScoreDiffFormatted();
                }
                return null;
            case 12:
                StandingsTableRow standingsTableRow13 = (StandingsTableRow) obj;
                if (standingsTableRow13 == null || (percentage = standingsTableRow13.getPercentage()) == null) {
                    return null;
                }
                return rei.a(Double.valueOf(percentage.doubleValue()), true);
            case 13:
                StandingsTableRow standingsTableRow14 = (StandingsTableRow) obj;
                if (standingsTableRow14 != null) {
                    return standingsTableRow14.getDraws();
                }
                return null;
            case 14:
                StandingsTableRow standingsTableRow15 = (StandingsTableRow) obj;
                if (standingsTableRow15 != null) {
                    return standingsTableRow15.getLosses();
                }
                return null;
            case 15:
                StandingsTableRow standingsTableRow16 = (StandingsTableRow) obj;
                if (standingsTableRow16 != null) {
                    return standingsTableRow16.getWinLosses();
                }
                return null;
            case 16:
                StandingsTableRow standingsTableRow17 = (StandingsTableRow) obj;
                if (standingsTableRow17 != null) {
                    return standingsTableRow17.getWinsLossesTies();
                }
                return null;
            case 17:
                StandingsTableRow standingsTableRow18 = (StandingsTableRow) obj;
                if (standingsTableRow18 != null) {
                    return standingsTableRow18.getGoals();
                }
                return null;
            case 18:
                StandingsTableRow standingsTableRow19 = (StandingsTableRow) obj;
                if (standingsTableRow19 != null) {
                    return standingsTableRow19.getGoals();
                }
                return null;
            case 19:
                StandingsTableRow standingsTableRow20 = (StandingsTableRow) obj;
                if (standingsTableRow20 != null) {
                    return standingsTableRow20.getPctGoals();
                }
                return null;
            case 20:
                StandingsTableRow standingsTableRow21 = (StandingsTableRow) obj;
                if (standingsTableRow21 != null) {
                    return standingsTableRow21.getPctGoals();
                }
                return null;
            case 21:
                StandingsTableRow standingsTableRow22 = (StandingsTableRow) obj;
                if (standingsTableRow22 != null) {
                    return standingsTableRow22.getOvertimeWins();
                }
                return null;
            case 22:
                StandingsTableRow standingsTableRow23 = (StandingsTableRow) obj;
                if (standingsTableRow23 != null) {
                    return standingsTableRow23.getAvailableLosses();
                }
                return null;
            case 23:
                StandingsTableRow standingsTableRow24 = (StandingsTableRow) obj;
                if (standingsTableRow24 != null) {
                    return standingsTableRow24.getAvailableOvertimeLosses();
                }
                return null;
            case 24:
                StandingsTableRow standingsTableRow25 = (StandingsTableRow) obj;
                if (standingsTableRow25 != null) {
                    return standingsTableRow25.getOvertimeRecord();
                }
                return null;
            case 25:
                StandingsTableRow standingsTableRow26 = (StandingsTableRow) obj;
                if (standingsTableRow26 != null) {
                    return standingsTableRow26.getShootoutRecord();
                }
                return null;
            case 26:
                StandingsTableRow standingsTableRow27 = (StandingsTableRow) obj;
                if (standingsTableRow27 != null) {
                    return standingsTableRow27.getPenaltyWins();
                }
                return null;
            case 27:
                StandingsTableRow standingsTableRow28 = (StandingsTableRow) obj;
                if (standingsTableRow28 != null) {
                    return standingsTableRow28.getPenaltyLosses();
                }
                return null;
            case 28:
                StandingsTableRow standingsTableRow29 = (StandingsTableRow) obj;
                if (standingsTableRow29 != null) {
                    return standingsTableRow29.getOvertimeAndPenaltyWins();
                }
                return null;
            default:
                StoryModel storyModel = (StoryModel) obj;
                StoriesRepositoryImpl storiesRepositoryImpl = StoriesRepositoryImpl.a;
                storyModel.getClass();
                return Boolean.valueOf(storyModel.c);
        }
    }
}
