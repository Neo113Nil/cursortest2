package defpackage;

import android.content.Context;
import com.sofascore.model.newNetwork.topperformance.response.BaseballTopPlayersStatistics;
import com.sofascore.model.newNetwork.topperformance.topPlayers.items.BaseballTopPlayersStatisticsItem;
import com.sofascore.results.R;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.functions.Function1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class kab implements zab {
    public static final /* synthetic */ kab[] e;
    public static final /* synthetic */ kp5 f;
    public final wj1 a;
    public final int b;
    public final Function1 c;
    public final Function1 d;

    static {
        wj1 wj1Var = wj1.b;
        kab kabVar = new kab("AT_BATS", 0, wj1Var, R.string.baseball_at_bats, new gab(21), new gab(23));
        final int i = 5;
        final int i2 = 17;
        kab kabVar2 = new kab("HITS", 1, wj1Var, R.string.baseball_hits, new Function1() { // from class: iab
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                switch (i) {
                    case 0:
                        BaseballTopPlayersStatistics baseballTopPlayersStatistics = (BaseballTopPlayersStatistics) obj;
                        baseballTopPlayersStatistics.getClass();
                        return baseballTopPlayersStatistics.getPitchingSaves();
                    case 1:
                        BaseballTopPlayersStatisticsItem baseballTopPlayersStatisticsItem = (BaseballTopPlayersStatisticsItem) obj;
                        baseballTopPlayersStatisticsItem.getClass();
                        return yid.j(baseballTopPlayersStatisticsItem.getPitchingSaves());
                    case 2:
                        BaseballTopPlayersStatistics baseballTopPlayersStatistics2 = (BaseballTopPlayersStatistics) obj;
                        baseballTopPlayersStatistics2.getClass();
                        return baseballTopPlayersStatistics2.getBattingRbi();
                    case 3:
                        BaseballTopPlayersStatistics baseballTopPlayersStatistics3 = (BaseballTopPlayersStatistics) obj;
                        baseballTopPlayersStatistics3.getClass();
                        return baseballTopPlayersStatistics3.getPitchingInningsPitched();
                    case 4:
                        BaseballTopPlayersStatisticsItem baseballTopPlayersStatisticsItem2 = (BaseballTopPlayersStatisticsItem) obj;
                        baseballTopPlayersStatisticsItem2.getClass();
                        return rei.b(1, baseballTopPlayersStatisticsItem2.getPitchingInningsPitched());
                    case 5:
                        BaseballTopPlayersStatistics baseballTopPlayersStatistics4 = (BaseballTopPlayersStatistics) obj;
                        baseballTopPlayersStatistics4.getClass();
                        return baseballTopPlayersStatistics4.getBattingHits();
                    case 6:
                        BaseballTopPlayersStatistics baseballTopPlayersStatistics5 = (BaseballTopPlayersStatistics) obj;
                        baseballTopPlayersStatistics5.getClass();
                        return baseballTopPlayersStatistics5.getPitchingEarnedRunsAverage();
                    case 7:
                        BaseballTopPlayersStatisticsItem baseballTopPlayersStatisticsItem3 = (BaseballTopPlayersStatisticsItem) obj;
                        baseballTopPlayersStatisticsItem3.getClass();
                        return rei.b(2, baseballTopPlayersStatisticsItem3.getPitchingEarnedRunsAverage());
                    case 8:
                        BaseballTopPlayersStatistics baseballTopPlayersStatistics6 = (BaseballTopPlayersStatistics) obj;
                        baseballTopPlayersStatistics6.getClass();
                        return baseballTopPlayersStatistics6.getPitchingStrikeOuts();
                    case 9:
                        BaseballTopPlayersStatisticsItem baseballTopPlayersStatisticsItem4 = (BaseballTopPlayersStatisticsItem) obj;
                        baseballTopPlayersStatisticsItem4.getClass();
                        return yid.j(baseballTopPlayersStatisticsItem4.getPitchingStrikeOuts());
                    case 10:
                        BaseballTopPlayersStatistics baseballTopPlayersStatistics7 = (BaseballTopPlayersStatistics) obj;
                        baseballTopPlayersStatistics7.getClass();
                        return baseballTopPlayersStatistics7.getPitchingQualityStarts();
                    case 11:
                        BaseballTopPlayersStatisticsItem baseballTopPlayersStatisticsItem5 = (BaseballTopPlayersStatisticsItem) obj;
                        baseballTopPlayersStatisticsItem5.getClass();
                        return yid.j(baseballTopPlayersStatisticsItem5.getPitchingQualityStarts());
                    case 12:
                        BaseballTopPlayersStatistics baseballTopPlayersStatistics8 = (BaseballTopPlayersStatistics) obj;
                        baseballTopPlayersStatistics8.getClass();
                        return baseballTopPlayersStatistics8.getPitchingWhip();
                    case 13:
                        BaseballTopPlayersStatisticsItem baseballTopPlayersStatisticsItem6 = (BaseballTopPlayersStatisticsItem) obj;
                        baseballTopPlayersStatisticsItem6.getClass();
                        return yid.j(baseballTopPlayersStatisticsItem6.getBattingRbi());
                    case 14:
                        BaseballTopPlayersStatisticsItem baseballTopPlayersStatisticsItem7 = (BaseballTopPlayersStatisticsItem) obj;
                        baseballTopPlayersStatisticsItem7.getClass();
                        Double pitchingWhip = baseballTopPlayersStatisticsItem7.getPitchingWhip();
                        yid.k(pitchingWhip);
                        String format = new DecimalFormat(".000", new DecimalFormatSymbols(Locale.US)).format(yid.k(pitchingWhip));
                        format.getClass();
                        return format;
                    case 15:
                        BaseballTopPlayersStatistics baseballTopPlayersStatistics9 = (BaseballTopPlayersStatistics) obj;
                        baseballTopPlayersStatistics9.getClass();
                        return baseballTopPlayersStatistics9.getPitchingWar();
                    case 16:
                        BaseballTopPlayersStatisticsItem baseballTopPlayersStatisticsItem8 = (BaseballTopPlayersStatisticsItem) obj;
                        baseballTopPlayersStatisticsItem8.getClass();
                        return rei.b(1, baseballTopPlayersStatisticsItem8.getPitchingWar());
                    case 17:
                        BaseballTopPlayersStatisticsItem baseballTopPlayersStatisticsItem9 = (BaseballTopPlayersStatisticsItem) obj;
                        baseballTopPlayersStatisticsItem9.getClass();
                        return yid.j(baseballTopPlayersStatisticsItem9.getBattingHits());
                    case 18:
                        BaseballTopPlayersStatistics baseballTopPlayersStatistics10 = (BaseballTopPlayersStatistics) obj;
                        baseballTopPlayersStatistics10.getClass();
                        return baseballTopPlayersStatistics10.getPitchingFieldingIndependentPitching();
                    case 19:
                        BaseballTopPlayersStatisticsItem baseballTopPlayersStatisticsItem10 = (BaseballTopPlayersStatisticsItem) obj;
                        baseballTopPlayersStatisticsItem10.getClass();
                        return rei.b(2, baseballTopPlayersStatisticsItem10.getPitchingFieldingIndependentPitching());
                    case 20:
                        BaseballTopPlayersStatistics baseballTopPlayersStatistics11 = (BaseballTopPlayersStatistics) obj;
                        baseballTopPlayersStatistics11.getClass();
                        return baseballTopPlayersStatistics11.getPitchingOpponentBattingAvg();
                    case 21:
                        BaseballTopPlayersStatisticsItem baseballTopPlayersStatisticsItem11 = (BaseballTopPlayersStatisticsItem) obj;
                        baseballTopPlayersStatisticsItem11.getClass();
                        Double pitchingOpponentBattingAvg = baseballTopPlayersStatisticsItem11.getPitchingOpponentBattingAvg();
                        yid.k(pitchingOpponentBattingAvg);
                        String format2 = new DecimalFormat(".000", new DecimalFormatSymbols(Locale.US)).format(yid.k(pitchingOpponentBattingAvg));
                        format2.getClass();
                        return format2;
                    case 22:
                        BaseballTopPlayersStatistics baseballTopPlayersStatistics12 = (BaseballTopPlayersStatistics) obj;
                        baseballTopPlayersStatistics12.getClass();
                        return baseballTopPlayersStatistics12.getFieldingPutOuts();
                    case 23:
                        BaseballTopPlayersStatisticsItem baseballTopPlayersStatisticsItem12 = (BaseballTopPlayersStatisticsItem) obj;
                        baseballTopPlayersStatisticsItem12.getClass();
                        return yid.j(baseballTopPlayersStatisticsItem12.getFieldingPutOuts());
                    case 24:
                        BaseballTopPlayersStatistics baseballTopPlayersStatistics13 = (BaseballTopPlayersStatistics) obj;
                        baseballTopPlayersStatistics13.getClass();
                        return baseballTopPlayersStatistics13.getBattingStolenBases();
                    case 25:
                        BaseballTopPlayersStatistics baseballTopPlayersStatistics14 = (BaseballTopPlayersStatistics) obj;
                        baseballTopPlayersStatistics14.getClass();
                        return baseballTopPlayersStatistics14.getFieldingAssists();
                    case 26:
                        BaseballTopPlayersStatisticsItem baseballTopPlayersStatisticsItem13 = (BaseballTopPlayersStatisticsItem) obj;
                        baseballTopPlayersStatisticsItem13.getClass();
                        return yid.j(baseballTopPlayersStatisticsItem13.getFieldingAssists());
                    case 27:
                        BaseballTopPlayersStatistics baseballTopPlayersStatistics15 = (BaseballTopPlayersStatistics) obj;
                        baseballTopPlayersStatistics15.getClass();
                        return baseballTopPlayersStatistics15.getFieldingTotalErrors();
                    case 28:
                        BaseballTopPlayersStatisticsItem baseballTopPlayersStatisticsItem14 = (BaseballTopPlayersStatisticsItem) obj;
                        baseballTopPlayersStatisticsItem14.getClass();
                        return yid.j(baseballTopPlayersStatisticsItem14.getFieldingTotalErrors());
                    default:
                        BaseballTopPlayersStatistics baseballTopPlayersStatistics16 = (BaseballTopPlayersStatistics) obj;
                        baseballTopPlayersStatistics16.getClass();
                        return baseballTopPlayersStatistics16.getBattingHomeRuns();
                }
            }
        }, new Function1() { // from class: iab
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                switch (i2) {
                    case 0:
                        BaseballTopPlayersStatistics baseballTopPlayersStatistics = (BaseballTopPlayersStatistics) obj;
                        baseballTopPlayersStatistics.getClass();
                        return baseballTopPlayersStatistics.getPitchingSaves();
                    case 1:
                        BaseballTopPlayersStatisticsItem baseballTopPlayersStatisticsItem = (BaseballTopPlayersStatisticsItem) obj;
                        baseballTopPlayersStatisticsItem.getClass();
                        return yid.j(baseballTopPlayersStatisticsItem.getPitchingSaves());
                    case 2:
                        BaseballTopPlayersStatistics baseballTopPlayersStatistics2 = (BaseballTopPlayersStatistics) obj;
                        baseballTopPlayersStatistics2.getClass();
                        return baseballTopPlayersStatistics2.getBattingRbi();
                    case 3:
                        BaseballTopPlayersStatistics baseballTopPlayersStatistics3 = (BaseballTopPlayersStatistics) obj;
                        baseballTopPlayersStatistics3.getClass();
                        return baseballTopPlayersStatistics3.getPitchingInningsPitched();
                    case 4:
                        BaseballTopPlayersStatisticsItem baseballTopPlayersStatisticsItem2 = (BaseballTopPlayersStatisticsItem) obj;
                        baseballTopPlayersStatisticsItem2.getClass();
                        return rei.b(1, baseballTopPlayersStatisticsItem2.getPitchingInningsPitched());
                    case 5:
                        BaseballTopPlayersStatistics baseballTopPlayersStatistics4 = (BaseballTopPlayersStatistics) obj;
                        baseballTopPlayersStatistics4.getClass();
                        return baseballTopPlayersStatistics4.getBattingHits();
                    case 6:
                        BaseballTopPlayersStatistics baseballTopPlayersStatistics5 = (BaseballTopPlayersStatistics) obj;
                        baseballTopPlayersStatistics5.getClass();
                        return baseballTopPlayersStatistics5.getPitchingEarnedRunsAverage();
                    case 7:
                        BaseballTopPlayersStatisticsItem baseballTopPlayersStatisticsItem3 = (BaseballTopPlayersStatisticsItem) obj;
                        baseballTopPlayersStatisticsItem3.getClass();
                        return rei.b(2, baseballTopPlayersStatisticsItem3.getPitchingEarnedRunsAverage());
                    case 8:
                        BaseballTopPlayersStatistics baseballTopPlayersStatistics6 = (BaseballTopPlayersStatistics) obj;
                        baseballTopPlayersStatistics6.getClass();
                        return baseballTopPlayersStatistics6.getPitchingStrikeOuts();
                    case 9:
                        BaseballTopPlayersStatisticsItem baseballTopPlayersStatisticsItem4 = (BaseballTopPlayersStatisticsItem) obj;
                        baseballTopPlayersStatisticsItem4.getClass();
                        return yid.j(baseballTopPlayersStatisticsItem4.getPitchingStrikeOuts());
                    case 10:
                        BaseballTopPlayersStatistics baseballTopPlayersStatistics7 = (BaseballTopPlayersStatistics) obj;
                        baseballTopPlayersStatistics7.getClass();
                        return baseballTopPlayersStatistics7.getPitchingQualityStarts();
                    case 11:
                        BaseballTopPlayersStatisticsItem baseballTopPlayersStatisticsItem5 = (BaseballTopPlayersStatisticsItem) obj;
                        baseballTopPlayersStatisticsItem5.getClass();
                        return yid.j(baseballTopPlayersStatisticsItem5.getPitchingQualityStarts());
                    case 12:
                        BaseballTopPlayersStatistics baseballTopPlayersStatistics8 = (BaseballTopPlayersStatistics) obj;
                        baseballTopPlayersStatistics8.getClass();
                        return baseballTopPlayersStatistics8.getPitchingWhip();
                    case 13:
                        BaseballTopPlayersStatisticsItem baseballTopPlayersStatisticsItem6 = (BaseballTopPlayersStatisticsItem) obj;
                        baseballTopPlayersStatisticsItem6.getClass();
                        return yid.j(baseballTopPlayersStatisticsItem6.getBattingRbi());
                    case 14:
                        BaseballTopPlayersStatisticsItem baseballTopPlayersStatisticsItem7 = (BaseballTopPlayersStatisticsItem) obj;
                        baseballTopPlayersStatisticsItem7.getClass();
                        Double pitchingWhip = baseballTopPlayersStatisticsItem7.getPitchingWhip();
                        yid.k(pitchingWhip);
                        String format = new DecimalFormat(".000", new DecimalFormatSymbols(Locale.US)).format(yid.k(pitchingWhip));
                        format.getClass();
                        return format;
                    case 15:
                        BaseballTopPlayersStatistics baseballTopPlayersStatistics9 = (BaseballTopPlayersStatistics) obj;
                        baseballTopPlayersStatistics9.getClass();
                        return baseballTopPlayersStatistics9.getPitchingWar();
                    case 16:
                        BaseballTopPlayersStatisticsItem baseballTopPlayersStatisticsItem8 = (BaseballTopPlayersStatisticsItem) obj;
                        baseballTopPlayersStatisticsItem8.getClass();
                        return rei.b(1, baseballTopPlayersStatisticsItem8.getPitchingWar());
                    case 17:
                        BaseballTopPlayersStatisticsItem baseballTopPlayersStatisticsItem9 = (BaseballTopPlayersStatisticsItem) obj;
                        baseballTopPlayersStatisticsItem9.getClass();
                        return yid.j(baseballTopPlayersStatisticsItem9.getBattingHits());
                    case 18:
                        BaseballTopPlayersStatistics baseballTopPlayersStatistics10 = (BaseballTopPlayersStatistics) obj;
                        baseballTopPlayersStatistics10.getClass();
                        return baseballTopPlayersStatistics10.getPitchingFieldingIndependentPitching();
                    case 19:
                        BaseballTopPlayersStatisticsItem baseballTopPlayersStatisticsItem10 = (BaseballTopPlayersStatisticsItem) obj;
                        baseballTopPlayersStatisticsItem10.getClass();
                        return rei.b(2, baseballTopPlayersStatisticsItem10.getPitchingFieldingIndependentPitching());
                    case 20:
                        BaseballTopPlayersStatistics baseballTopPlayersStatistics11 = (BaseballTopPlayersStatistics) obj;
                        baseballTopPlayersStatistics11.getClass();
                        return baseballTopPlayersStatistics11.getPitchingOpponentBattingAvg();
                    case 21:
                        BaseballTopPlayersStatisticsItem baseballTopPlayersStatisticsItem11 = (BaseballTopPlayersStatisticsItem) obj;
                        baseballTopPlayersStatisticsItem11.getClass();
                        Double pitchingOpponentBattingAvg = baseballTopPlayersStatisticsItem11.getPitchingOpponentBattingAvg();
                        yid.k(pitchingOpponentBattingAvg);
                        String format2 = new DecimalFormat(".000", new DecimalFormatSymbols(Locale.US)).format(yid.k(pitchingOpponentBattingAvg));
                        format2.getClass();
                        return format2;
                    case 22:
                        BaseballTopPlayersStatistics baseballTopPlayersStatistics12 = (BaseballTopPlayersStatistics) obj;
                        baseballTopPlayersStatistics12.getClass();
                        return baseballTopPlayersStatistics12.getFieldingPutOuts();
                    case 23:
                        BaseballTopPlayersStatisticsItem baseballTopPlayersStatisticsItem12 = (BaseballTopPlayersStatisticsItem) obj;
                        baseballTopPlayersStatisticsItem12.getClass();
                        return yid.j(baseballTopPlayersStatisticsItem12.getFieldingPutOuts());
                    case 24:
                        BaseballTopPlayersStatistics baseballTopPlayersStatistics13 = (BaseballTopPlayersStatistics) obj;
                        baseballTopPlayersStatistics13.getClass();
                        return baseballTopPlayersStatistics13.getBattingStolenBases();
                    case 25:
                        BaseballTopPlayersStatistics baseballTopPlayersStatistics14 = (BaseballTopPlayersStatistics) obj;
                        baseballTopPlayersStatistics14.getClass();
                        return baseballTopPlayersStatistics14.getFieldingAssists();
                    case 26:
                        BaseballTopPlayersStatisticsItem baseballTopPlayersStatisticsItem13 = (BaseballTopPlayersStatisticsItem) obj;
                        baseballTopPlayersStatisticsItem13.getClass();
                        return yid.j(baseballTopPlayersStatisticsItem13.getFieldingAssists());
                    case 27:
                        BaseballTopPlayersStatistics baseballTopPlayersStatistics15 = (BaseballTopPlayersStatistics) obj;
                        baseballTopPlayersStatistics15.getClass();
                        return baseballTopPlayersStatistics15.getFieldingTotalErrors();
                    case 28:
                        BaseballTopPlayersStatisticsItem baseballTopPlayersStatisticsItem14 = (BaseballTopPlayersStatisticsItem) obj;
                        baseballTopPlayersStatisticsItem14.getClass();
                        return yid.j(baseballTopPlayersStatisticsItem14.getFieldingTotalErrors());
                    default:
                        BaseballTopPlayersStatistics baseballTopPlayersStatistics16 = (BaseballTopPlayersStatistics) obj;
                        baseballTopPlayersStatistics16.getClass();
                        return baseballTopPlayersStatistics16.getBattingHomeRuns();
                }
            }
        });
        final int i3 = 29;
        final int i4 = 4;
        kab kabVar3 = new kab("HOME_RUNS", 2, wj1Var, R.string.baseball_home_runs, new Function1() { // from class: iab
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                switch (i3) {
                    case 0:
                        BaseballTopPlayersStatistics baseballTopPlayersStatistics = (BaseballTopPlayersStatistics) obj;
                        baseballTopPlayersStatistics.getClass();
                        return baseballTopPlayersStatistics.getPitchingSaves();
                    case 1:
                        BaseballTopPlayersStatisticsItem baseballTopPlayersStatisticsItem = (BaseballTopPlayersStatisticsItem) obj;
                        baseballTopPlayersStatisticsItem.getClass();
                        return yid.j(baseballTopPlayersStatisticsItem.getPitchingSaves());
                    case 2:
                        BaseballTopPlayersStatistics baseballTopPlayersStatistics2 = (BaseballTopPlayersStatistics) obj;
                        baseballTopPlayersStatistics2.getClass();
                        return baseballTopPlayersStatistics2.getBattingRbi();
                    case 3:
                        BaseballTopPlayersStatistics baseballTopPlayersStatistics3 = (BaseballTopPlayersStatistics) obj;
                        baseballTopPlayersStatistics3.getClass();
                        return baseballTopPlayersStatistics3.getPitchingInningsPitched();
                    case 4:
                        BaseballTopPlayersStatisticsItem baseballTopPlayersStatisticsItem2 = (BaseballTopPlayersStatisticsItem) obj;
                        baseballTopPlayersStatisticsItem2.getClass();
                        return rei.b(1, baseballTopPlayersStatisticsItem2.getPitchingInningsPitched());
                    case 5:
                        BaseballTopPlayersStatistics baseballTopPlayersStatistics4 = (BaseballTopPlayersStatistics) obj;
                        baseballTopPlayersStatistics4.getClass();
                        return baseballTopPlayersStatistics4.getBattingHits();
                    case 6:
                        BaseballTopPlayersStatistics baseballTopPlayersStatistics5 = (BaseballTopPlayersStatistics) obj;
                        baseballTopPlayersStatistics5.getClass();
                        return baseballTopPlayersStatistics5.getPitchingEarnedRunsAverage();
                    case 7:
                        BaseballTopPlayersStatisticsItem baseballTopPlayersStatisticsItem3 = (BaseballTopPlayersStatisticsItem) obj;
                        baseballTopPlayersStatisticsItem3.getClass();
                        return rei.b(2, baseballTopPlayersStatisticsItem3.getPitchingEarnedRunsAverage());
                    case 8:
                        BaseballTopPlayersStatistics baseballTopPlayersStatistics6 = (BaseballTopPlayersStatistics) obj;
                        baseballTopPlayersStatistics6.getClass();
                        return baseballTopPlayersStatistics6.getPitchingStrikeOuts();
                    case 9:
                        BaseballTopPlayersStatisticsItem baseballTopPlayersStatisticsItem4 = (BaseballTopPlayersStatisticsItem) obj;
                        baseballTopPlayersStatisticsItem4.getClass();
                        return yid.j(baseballTopPlayersStatisticsItem4.getPitchingStrikeOuts());
                    case 10:
                        BaseballTopPlayersStatistics baseballTopPlayersStatistics7 = (BaseballTopPlayersStatistics) obj;
                        baseballTopPlayersStatistics7.getClass();
                        return baseballTopPlayersStatistics7.getPitchingQualityStarts();
                    case 11:
                        BaseballTopPlayersStatisticsItem baseballTopPlayersStatisticsItem5 = (BaseballTopPlayersStatisticsItem) obj;
                        baseballTopPlayersStatisticsItem5.getClass();
                        return yid.j(baseballTopPlayersStatisticsItem5.getPitchingQualityStarts());
                    case 12:
                        BaseballTopPlayersStatistics baseballTopPlayersStatistics8 = (BaseballTopPlayersStatistics) obj;
                        baseballTopPlayersStatistics8.getClass();
                        return baseballTopPlayersStatistics8.getPitchingWhip();
                    case 13:
                        BaseballTopPlayersStatisticsItem baseballTopPlayersStatisticsItem6 = (BaseballTopPlayersStatisticsItem) obj;
                        baseballTopPlayersStatisticsItem6.getClass();
                        return yid.j(baseballTopPlayersStatisticsItem6.getBattingRbi());
                    case 14:
                        BaseballTopPlayersStatisticsItem baseballTopPlayersStatisticsItem7 = (BaseballTopPlayersStatisticsItem) obj;
                        baseballTopPlayersStatisticsItem7.getClass();
                        Double pitchingWhip = baseballTopPlayersStatisticsItem7.getPitchingWhip();
                        yid.k(pitchingWhip);
                        String format = new DecimalFormat(".000", new DecimalFormatSymbols(Locale.US)).format(yid.k(pitchingWhip));
                        format.getClass();
                        return format;
                    case 15:
                        BaseballTopPlayersStatistics baseballTopPlayersStatistics9 = (BaseballTopPlayersStatistics) obj;
                        baseballTopPlayersStatistics9.getClass();
                        return baseballTopPlayersStatistics9.getPitchingWar();
                    case 16:
                        BaseballTopPlayersStatisticsItem baseballTopPlayersStatisticsItem8 = (BaseballTopPlayersStatisticsItem) obj;
                        baseballTopPlayersStatisticsItem8.getClass();
                        return rei.b(1, baseballTopPlayersStatisticsItem8.getPitchingWar());
                    case 17:
                        BaseballTopPlayersStatisticsItem baseballTopPlayersStatisticsItem9 = (BaseballTopPlayersStatisticsItem) obj;
                        baseballTopPlayersStatisticsItem9.getClass();
                        return yid.j(baseballTopPlayersStatisticsItem9.getBattingHits());
                    case 18:
                        BaseballTopPlayersStatistics baseballTopPlayersStatistics10 = (BaseballTopPlayersStatistics) obj;
                        baseballTopPlayersStatistics10.getClass();
                        return baseballTopPlayersStatistics10.getPitchingFieldingIndependentPitching();
                    case 19:
                        BaseballTopPlayersStatisticsItem baseballTopPlayersStatisticsItem10 = (BaseballTopPlayersStatisticsItem) obj;
                        baseballTopPlayersStatisticsItem10.getClass();
                        return rei.b(2, baseballTopPlayersStatisticsItem10.getPitchingFieldingIndependentPitching());
                    case 20:
                        BaseballTopPlayersStatistics baseballTopPlayersStatistics11 = (BaseballTopPlayersStatistics) obj;
                        baseballTopPlayersStatistics11.getClass();
                        return baseballTopPlayersStatistics11.getPitchingOpponentBattingAvg();
                    case 21:
                        BaseballTopPlayersStatisticsItem baseballTopPlayersStatisticsItem11 = (BaseballTopPlayersStatisticsItem) obj;
                        baseballTopPlayersStatisticsItem11.getClass();
                        Double pitchingOpponentBattingAvg = baseballTopPlayersStatisticsItem11.getPitchingOpponentBattingAvg();
                        yid.k(pitchingOpponentBattingAvg);
                        String format2 = new DecimalFormat(".000", new DecimalFormatSymbols(Locale.US)).format(yid.k(pitchingOpponentBattingAvg));
                        format2.getClass();
                        return format2;
                    case 22:
                        BaseballTopPlayersStatistics baseballTopPlayersStatistics12 = (BaseballTopPlayersStatistics) obj;
                        baseballTopPlayersStatistics12.getClass();
                        return baseballTopPlayersStatistics12.getFieldingPutOuts();
                    case 23:
                        BaseballTopPlayersStatisticsItem baseballTopPlayersStatisticsItem12 = (BaseballTopPlayersStatisticsItem) obj;
                        baseballTopPlayersStatisticsItem12.getClass();
                        return yid.j(baseballTopPlayersStatisticsItem12.getFieldingPutOuts());
                    case 24:
                        BaseballTopPlayersStatistics baseballTopPlayersStatistics13 = (BaseballTopPlayersStatistics) obj;
                        baseballTopPlayersStatistics13.getClass();
                        return baseballTopPlayersStatistics13.getBattingStolenBases();
                    case 25:
                        BaseballTopPlayersStatistics baseballTopPlayersStatistics14 = (BaseballTopPlayersStatistics) obj;
                        baseballTopPlayersStatistics14.getClass();
                        return baseballTopPlayersStatistics14.getFieldingAssists();
                    case 26:
                        BaseballTopPlayersStatisticsItem baseballTopPlayersStatisticsItem13 = (BaseballTopPlayersStatisticsItem) obj;
                        baseballTopPlayersStatisticsItem13.getClass();
                        return yid.j(baseballTopPlayersStatisticsItem13.getFieldingAssists());
                    case 27:
                        BaseballTopPlayersStatistics baseballTopPlayersStatistics15 = (BaseballTopPlayersStatistics) obj;
                        baseballTopPlayersStatistics15.getClass();
                        return baseballTopPlayersStatistics15.getFieldingTotalErrors();
                    case 28:
                        BaseballTopPlayersStatisticsItem baseballTopPlayersStatisticsItem14 = (BaseballTopPlayersStatisticsItem) obj;
                        baseballTopPlayersStatisticsItem14.getClass();
                        return yid.j(baseballTopPlayersStatisticsItem14.getFieldingTotalErrors());
                    default:
                        BaseballTopPlayersStatistics baseballTopPlayersStatistics16 = (BaseballTopPlayersStatistics) obj;
                        baseballTopPlayersStatistics16.getClass();
                        return baseballTopPlayersStatistics16.getBattingHomeRuns();
                }
            }
        }, new jab(4));
        final int i5 = 6;
        final int i6 = 7;
        kab kabVar4 = new kab("BATTING_AVG", 3, wj1Var, R.string.baseball_batting_average, new jab(6), new jab(7));
        kab kabVar5 = new kab("RUNS", 4, wj1Var, R.string.baseball_runs, new jab(8), new jab(9));
        final int i7 = 2;
        final int i8 = 13;
        kab kabVar6 = new kab("RBI", 5, wj1Var, R.string.baseball_runs_batted_in, new Function1() { // from class: iab
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                switch (i7) {
                    case 0:
                        BaseballTopPlayersStatistics baseballTopPlayersStatistics = (BaseballTopPlayersStatistics) obj;
                        baseballTopPlayersStatistics.getClass();
                        return baseballTopPlayersStatistics.getPitchingSaves();
                    case 1:
                        BaseballTopPlayersStatisticsItem baseballTopPlayersStatisticsItem = (BaseballTopPlayersStatisticsItem) obj;
                        baseballTopPlayersStatisticsItem.getClass();
                        return yid.j(baseballTopPlayersStatisticsItem.getPitchingSaves());
                    case 2:
                        BaseballTopPlayersStatistics baseballTopPlayersStatistics2 = (BaseballTopPlayersStatistics) obj;
                        baseballTopPlayersStatistics2.getClass();
                        return baseballTopPlayersStatistics2.getBattingRbi();
                    case 3:
                        BaseballTopPlayersStatistics baseballTopPlayersStatistics3 = (BaseballTopPlayersStatistics) obj;
                        baseballTopPlayersStatistics3.getClass();
                        return baseballTopPlayersStatistics3.getPitchingInningsPitched();
                    case 4:
                        BaseballTopPlayersStatisticsItem baseballTopPlayersStatisticsItem2 = (BaseballTopPlayersStatisticsItem) obj;
                        baseballTopPlayersStatisticsItem2.getClass();
                        return rei.b(1, baseballTopPlayersStatisticsItem2.getPitchingInningsPitched());
                    case 5:
                        BaseballTopPlayersStatistics baseballTopPlayersStatistics4 = (BaseballTopPlayersStatistics) obj;
                        baseballTopPlayersStatistics4.getClass();
                        return baseballTopPlayersStatistics4.getBattingHits();
                    case 6:
                        BaseballTopPlayersStatistics baseballTopPlayersStatistics5 = (BaseballTopPlayersStatistics) obj;
                        baseballTopPlayersStatistics5.getClass();
                        return baseballTopPlayersStatistics5.getPitchingEarnedRunsAverage();
                    case 7:
                        BaseballTopPlayersStatisticsItem baseballTopPlayersStatisticsItem3 = (BaseballTopPlayersStatisticsItem) obj;
                        baseballTopPlayersStatisticsItem3.getClass();
                        return rei.b(2, baseballTopPlayersStatisticsItem3.getPitchingEarnedRunsAverage());
                    case 8:
                        BaseballTopPlayersStatistics baseballTopPlayersStatistics6 = (BaseballTopPlayersStatistics) obj;
                        baseballTopPlayersStatistics6.getClass();
                        return baseballTopPlayersStatistics6.getPitchingStrikeOuts();
                    case 9:
                        BaseballTopPlayersStatisticsItem baseballTopPlayersStatisticsItem4 = (BaseballTopPlayersStatisticsItem) obj;
                        baseballTopPlayersStatisticsItem4.getClass();
                        return yid.j(baseballTopPlayersStatisticsItem4.getPitchingStrikeOuts());
                    case 10:
                        BaseballTopPlayersStatistics baseballTopPlayersStatistics7 = (BaseballTopPlayersStatistics) obj;
                        baseballTopPlayersStatistics7.getClass();
                        return baseballTopPlayersStatistics7.getPitchingQualityStarts();
                    case 11:
                        BaseballTopPlayersStatisticsItem baseballTopPlayersStatisticsItem5 = (BaseballTopPlayersStatisticsItem) obj;
                        baseballTopPlayersStatisticsItem5.getClass();
                        return yid.j(baseballTopPlayersStatisticsItem5.getPitchingQualityStarts());
                    case 12:
                        BaseballTopPlayersStatistics baseballTopPlayersStatistics8 = (BaseballTopPlayersStatistics) obj;
                        baseballTopPlayersStatistics8.getClass();
                        return baseballTopPlayersStatistics8.getPitchingWhip();
                    case 13:
                        BaseballTopPlayersStatisticsItem baseballTopPlayersStatisticsItem6 = (BaseballTopPlayersStatisticsItem) obj;
                        baseballTopPlayersStatisticsItem6.getClass();
                        return yid.j(baseballTopPlayersStatisticsItem6.getBattingRbi());
                    case 14:
                        BaseballTopPlayersStatisticsItem baseballTopPlayersStatisticsItem7 = (BaseballTopPlayersStatisticsItem) obj;
                        baseballTopPlayersStatisticsItem7.getClass();
                        Double pitchingWhip = baseballTopPlayersStatisticsItem7.getPitchingWhip();
                        yid.k(pitchingWhip);
                        String format = new DecimalFormat(".000", new DecimalFormatSymbols(Locale.US)).format(yid.k(pitchingWhip));
                        format.getClass();
                        return format;
                    case 15:
                        BaseballTopPlayersStatistics baseballTopPlayersStatistics9 = (BaseballTopPlayersStatistics) obj;
                        baseballTopPlayersStatistics9.getClass();
                        return baseballTopPlayersStatistics9.getPitchingWar();
                    case 16:
                        BaseballTopPlayersStatisticsItem baseballTopPlayersStatisticsItem8 = (BaseballTopPlayersStatisticsItem) obj;
                        baseballTopPlayersStatisticsItem8.getClass();
                        return rei.b(1, baseballTopPlayersStatisticsItem8.getPitchingWar());
                    case 17:
                        BaseballTopPlayersStatisticsItem baseballTopPlayersStatisticsItem9 = (BaseballTopPlayersStatisticsItem) obj;
                        baseballTopPlayersStatisticsItem9.getClass();
                        return yid.j(baseballTopPlayersStatisticsItem9.getBattingHits());
                    case 18:
                        BaseballTopPlayersStatistics baseballTopPlayersStatistics10 = (BaseballTopPlayersStatistics) obj;
                        baseballTopPlayersStatistics10.getClass();
                        return baseballTopPlayersStatistics10.getPitchingFieldingIndependentPitching();
                    case 19:
                        BaseballTopPlayersStatisticsItem baseballTopPlayersStatisticsItem10 = (BaseballTopPlayersStatisticsItem) obj;
                        baseballTopPlayersStatisticsItem10.getClass();
                        return rei.b(2, baseballTopPlayersStatisticsItem10.getPitchingFieldingIndependentPitching());
                    case 20:
                        BaseballTopPlayersStatistics baseballTopPlayersStatistics11 = (BaseballTopPlayersStatistics) obj;
                        baseballTopPlayersStatistics11.getClass();
                        return baseballTopPlayersStatistics11.getPitchingOpponentBattingAvg();
                    case 21:
                        BaseballTopPlayersStatisticsItem baseballTopPlayersStatisticsItem11 = (BaseballTopPlayersStatisticsItem) obj;
                        baseballTopPlayersStatisticsItem11.getClass();
                        Double pitchingOpponentBattingAvg = baseballTopPlayersStatisticsItem11.getPitchingOpponentBattingAvg();
                        yid.k(pitchingOpponentBattingAvg);
                        String format2 = new DecimalFormat(".000", new DecimalFormatSymbols(Locale.US)).format(yid.k(pitchingOpponentBattingAvg));
                        format2.getClass();
                        return format2;
                    case 22:
                        BaseballTopPlayersStatistics baseballTopPlayersStatistics12 = (BaseballTopPlayersStatistics) obj;
                        baseballTopPlayersStatistics12.getClass();
                        return baseballTopPlayersStatistics12.getFieldingPutOuts();
                    case 23:
                        BaseballTopPlayersStatisticsItem baseballTopPlayersStatisticsItem12 = (BaseballTopPlayersStatisticsItem) obj;
                        baseballTopPlayersStatisticsItem12.getClass();
                        return yid.j(baseballTopPlayersStatisticsItem12.getFieldingPutOuts());
                    case 24:
                        BaseballTopPlayersStatistics baseballTopPlayersStatistics13 = (BaseballTopPlayersStatistics) obj;
                        baseballTopPlayersStatistics13.getClass();
                        return baseballTopPlayersStatistics13.getBattingStolenBases();
                    case 25:
                        BaseballTopPlayersStatistics baseballTopPlayersStatistics14 = (BaseballTopPlayersStatistics) obj;
                        baseballTopPlayersStatistics14.getClass();
                        return baseballTopPlayersStatistics14.getFieldingAssists();
                    case 26:
                        BaseballTopPlayersStatisticsItem baseballTopPlayersStatisticsItem13 = (BaseballTopPlayersStatisticsItem) obj;
                        baseballTopPlayersStatisticsItem13.getClass();
                        return yid.j(baseballTopPlayersStatisticsItem13.getFieldingAssists());
                    case 27:
                        BaseballTopPlayersStatistics baseballTopPlayersStatistics15 = (BaseballTopPlayersStatistics) obj;
                        baseballTopPlayersStatistics15.getClass();
                        return baseballTopPlayersStatistics15.getFieldingTotalErrors();
                    case 28:
                        BaseballTopPlayersStatisticsItem baseballTopPlayersStatisticsItem14 = (BaseballTopPlayersStatisticsItem) obj;
                        baseballTopPlayersStatisticsItem14.getClass();
                        return yid.j(baseballTopPlayersStatisticsItem14.getFieldingTotalErrors());
                    default:
                        BaseballTopPlayersStatistics baseballTopPlayersStatistics16 = (BaseballTopPlayersStatistics) obj;
                        baseballTopPlayersStatistics16.getClass();
                        return baseballTopPlayersStatistics16.getBattingHomeRuns();
                }
            }
        }, new Function1() { // from class: iab
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                switch (i8) {
                    case 0:
                        BaseballTopPlayersStatistics baseballTopPlayersStatistics = (BaseballTopPlayersStatistics) obj;
                        baseballTopPlayersStatistics.getClass();
                        return baseballTopPlayersStatistics.getPitchingSaves();
                    case 1:
                        BaseballTopPlayersStatisticsItem baseballTopPlayersStatisticsItem = (BaseballTopPlayersStatisticsItem) obj;
                        baseballTopPlayersStatisticsItem.getClass();
                        return yid.j(baseballTopPlayersStatisticsItem.getPitchingSaves());
                    case 2:
                        BaseballTopPlayersStatistics baseballTopPlayersStatistics2 = (BaseballTopPlayersStatistics) obj;
                        baseballTopPlayersStatistics2.getClass();
                        return baseballTopPlayersStatistics2.getBattingRbi();
                    case 3:
                        BaseballTopPlayersStatistics baseballTopPlayersStatistics3 = (BaseballTopPlayersStatistics) obj;
                        baseballTopPlayersStatistics3.getClass();
                        return baseballTopPlayersStatistics3.getPitchingInningsPitched();
                    case 4:
                        BaseballTopPlayersStatisticsItem baseballTopPlayersStatisticsItem2 = (BaseballTopPlayersStatisticsItem) obj;
                        baseballTopPlayersStatisticsItem2.getClass();
                        return rei.b(1, baseballTopPlayersStatisticsItem2.getPitchingInningsPitched());
                    case 5:
                        BaseballTopPlayersStatistics baseballTopPlayersStatistics4 = (BaseballTopPlayersStatistics) obj;
                        baseballTopPlayersStatistics4.getClass();
                        return baseballTopPlayersStatistics4.getBattingHits();
                    case 6:
                        BaseballTopPlayersStatistics baseballTopPlayersStatistics5 = (BaseballTopPlayersStatistics) obj;
                        baseballTopPlayersStatistics5.getClass();
                        return baseballTopPlayersStatistics5.getPitchingEarnedRunsAverage();
                    case 7:
                        BaseballTopPlayersStatisticsItem baseballTopPlayersStatisticsItem3 = (BaseballTopPlayersStatisticsItem) obj;
                        baseballTopPlayersStatisticsItem3.getClass();
                        return rei.b(2, baseballTopPlayersStatisticsItem3.getPitchingEarnedRunsAverage());
                    case 8:
                        BaseballTopPlayersStatistics baseballTopPlayersStatistics6 = (BaseballTopPlayersStatistics) obj;
                        baseballTopPlayersStatistics6.getClass();
                        return baseballTopPlayersStatistics6.getPitchingStrikeOuts();
                    case 9:
                        BaseballTopPlayersStatisticsItem baseballTopPlayersStatisticsItem4 = (BaseballTopPlayersStatisticsItem) obj;
                        baseballTopPlayersStatisticsItem4.getClass();
                        return yid.j(baseballTopPlayersStatisticsItem4.getPitchingStrikeOuts());
                    case 10:
                        BaseballTopPlayersStatistics baseballTopPlayersStatistics7 = (BaseballTopPlayersStatistics) obj;
                        baseballTopPlayersStatistics7.getClass();
                        return baseballTopPlayersStatistics7.getPitchingQualityStarts();
                    case 11:
                        BaseballTopPlayersStatisticsItem baseballTopPlayersStatisticsItem5 = (BaseballTopPlayersStatisticsItem) obj;
                        baseballTopPlayersStatisticsItem5.getClass();
                        return yid.j(baseballTopPlayersStatisticsItem5.getPitchingQualityStarts());
                    case 12:
                        BaseballTopPlayersStatistics baseballTopPlayersStatistics8 = (BaseballTopPlayersStatistics) obj;
                        baseballTopPlayersStatistics8.getClass();
                        return baseballTopPlayersStatistics8.getPitchingWhip();
                    case 13:
                        BaseballTopPlayersStatisticsItem baseballTopPlayersStatisticsItem6 = (BaseballTopPlayersStatisticsItem) obj;
                        baseballTopPlayersStatisticsItem6.getClass();
                        return yid.j(baseballTopPlayersStatisticsItem6.getBattingRbi());
                    case 14:
                        BaseballTopPlayersStatisticsItem baseballTopPlayersStatisticsItem7 = (BaseballTopPlayersStatisticsItem) obj;
                        baseballTopPlayersStatisticsItem7.getClass();
                        Double pitchingWhip = baseballTopPlayersStatisticsItem7.getPitchingWhip();
                        yid.k(pitchingWhip);
                        String format = new DecimalFormat(".000", new DecimalFormatSymbols(Locale.US)).format(yid.k(pitchingWhip));
                        format.getClass();
                        return format;
                    case 15:
                        BaseballTopPlayersStatistics baseballTopPlayersStatistics9 = (BaseballTopPlayersStatistics) obj;
                        baseballTopPlayersStatistics9.getClass();
                        return baseballTopPlayersStatistics9.getPitchingWar();
                    case 16:
                        BaseballTopPlayersStatisticsItem baseballTopPlayersStatisticsItem8 = (BaseballTopPlayersStatisticsItem) obj;
                        baseballTopPlayersStatisticsItem8.getClass();
                        return rei.b(1, baseballTopPlayersStatisticsItem8.getPitchingWar());
                    case 17:
                        BaseballTopPlayersStatisticsItem baseballTopPlayersStatisticsItem9 = (BaseballTopPlayersStatisticsItem) obj;
                        baseballTopPlayersStatisticsItem9.getClass();
                        return yid.j(baseballTopPlayersStatisticsItem9.getBattingHits());
                    case 18:
                        BaseballTopPlayersStatistics baseballTopPlayersStatistics10 = (BaseballTopPlayersStatistics) obj;
                        baseballTopPlayersStatistics10.getClass();
                        return baseballTopPlayersStatistics10.getPitchingFieldingIndependentPitching();
                    case 19:
                        BaseballTopPlayersStatisticsItem baseballTopPlayersStatisticsItem10 = (BaseballTopPlayersStatisticsItem) obj;
                        baseballTopPlayersStatisticsItem10.getClass();
                        return rei.b(2, baseballTopPlayersStatisticsItem10.getPitchingFieldingIndependentPitching());
                    case 20:
                        BaseballTopPlayersStatistics baseballTopPlayersStatistics11 = (BaseballTopPlayersStatistics) obj;
                        baseballTopPlayersStatistics11.getClass();
                        return baseballTopPlayersStatistics11.getPitchingOpponentBattingAvg();
                    case 21:
                        BaseballTopPlayersStatisticsItem baseballTopPlayersStatisticsItem11 = (BaseballTopPlayersStatisticsItem) obj;
                        baseballTopPlayersStatisticsItem11.getClass();
                        Double pitchingOpponentBattingAvg = baseballTopPlayersStatisticsItem11.getPitchingOpponentBattingAvg();
                        yid.k(pitchingOpponentBattingAvg);
                        String format2 = new DecimalFormat(".000", new DecimalFormatSymbols(Locale.US)).format(yid.k(pitchingOpponentBattingAvg));
                        format2.getClass();
                        return format2;
                    case 22:
                        BaseballTopPlayersStatistics baseballTopPlayersStatistics12 = (BaseballTopPlayersStatistics) obj;
                        baseballTopPlayersStatistics12.getClass();
                        return baseballTopPlayersStatistics12.getFieldingPutOuts();
                    case 23:
                        BaseballTopPlayersStatisticsItem baseballTopPlayersStatisticsItem12 = (BaseballTopPlayersStatisticsItem) obj;
                        baseballTopPlayersStatisticsItem12.getClass();
                        return yid.j(baseballTopPlayersStatisticsItem12.getFieldingPutOuts());
                    case 24:
                        BaseballTopPlayersStatistics baseballTopPlayersStatistics13 = (BaseballTopPlayersStatistics) obj;
                        baseballTopPlayersStatistics13.getClass();
                        return baseballTopPlayersStatistics13.getBattingStolenBases();
                    case 25:
                        BaseballTopPlayersStatistics baseballTopPlayersStatistics14 = (BaseballTopPlayersStatistics) obj;
                        baseballTopPlayersStatistics14.getClass();
                        return baseballTopPlayersStatistics14.getFieldingAssists();
                    case 26:
                        BaseballTopPlayersStatisticsItem baseballTopPlayersStatisticsItem13 = (BaseballTopPlayersStatisticsItem) obj;
                        baseballTopPlayersStatisticsItem13.getClass();
                        return yid.j(baseballTopPlayersStatisticsItem13.getFieldingAssists());
                    case 27:
                        BaseballTopPlayersStatistics baseballTopPlayersStatistics15 = (BaseballTopPlayersStatistics) obj;
                        baseballTopPlayersStatistics15.getClass();
                        return baseballTopPlayersStatistics15.getFieldingTotalErrors();
                    case 28:
                        BaseballTopPlayersStatisticsItem baseballTopPlayersStatisticsItem14 = (BaseballTopPlayersStatisticsItem) obj;
                        baseballTopPlayersStatisticsItem14.getClass();
                        return yid.j(baseballTopPlayersStatisticsItem14.getFieldingTotalErrors());
                    default:
                        BaseballTopPlayersStatistics baseballTopPlayersStatistics16 = (BaseballTopPlayersStatistics) obj;
                        baseballTopPlayersStatistics16.getClass();
                        return baseballTopPlayersStatistics16.getBattingHomeRuns();
                }
            }
        });
        final int i9 = 24;
        kab kabVar7 = new kab("STOLEN_BASES", 6, wj1Var, R.string.baseball_stolen_bases, new Function1() { // from class: iab
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                switch (i9) {
                    case 0:
                        BaseballTopPlayersStatistics baseballTopPlayersStatistics = (BaseballTopPlayersStatistics) obj;
                        baseballTopPlayersStatistics.getClass();
                        return baseballTopPlayersStatistics.getPitchingSaves();
                    case 1:
                        BaseballTopPlayersStatisticsItem baseballTopPlayersStatisticsItem = (BaseballTopPlayersStatisticsItem) obj;
                        baseballTopPlayersStatisticsItem.getClass();
                        return yid.j(baseballTopPlayersStatisticsItem.getPitchingSaves());
                    case 2:
                        BaseballTopPlayersStatistics baseballTopPlayersStatistics2 = (BaseballTopPlayersStatistics) obj;
                        baseballTopPlayersStatistics2.getClass();
                        return baseballTopPlayersStatistics2.getBattingRbi();
                    case 3:
                        BaseballTopPlayersStatistics baseballTopPlayersStatistics3 = (BaseballTopPlayersStatistics) obj;
                        baseballTopPlayersStatistics3.getClass();
                        return baseballTopPlayersStatistics3.getPitchingInningsPitched();
                    case 4:
                        BaseballTopPlayersStatisticsItem baseballTopPlayersStatisticsItem2 = (BaseballTopPlayersStatisticsItem) obj;
                        baseballTopPlayersStatisticsItem2.getClass();
                        return rei.b(1, baseballTopPlayersStatisticsItem2.getPitchingInningsPitched());
                    case 5:
                        BaseballTopPlayersStatistics baseballTopPlayersStatistics4 = (BaseballTopPlayersStatistics) obj;
                        baseballTopPlayersStatistics4.getClass();
                        return baseballTopPlayersStatistics4.getBattingHits();
                    case 6:
                        BaseballTopPlayersStatistics baseballTopPlayersStatistics5 = (BaseballTopPlayersStatistics) obj;
                        baseballTopPlayersStatistics5.getClass();
                        return baseballTopPlayersStatistics5.getPitchingEarnedRunsAverage();
                    case 7:
                        BaseballTopPlayersStatisticsItem baseballTopPlayersStatisticsItem3 = (BaseballTopPlayersStatisticsItem) obj;
                        baseballTopPlayersStatisticsItem3.getClass();
                        return rei.b(2, baseballTopPlayersStatisticsItem3.getPitchingEarnedRunsAverage());
                    case 8:
                        BaseballTopPlayersStatistics baseballTopPlayersStatistics6 = (BaseballTopPlayersStatistics) obj;
                        baseballTopPlayersStatistics6.getClass();
                        return baseballTopPlayersStatistics6.getPitchingStrikeOuts();
                    case 9:
                        BaseballTopPlayersStatisticsItem baseballTopPlayersStatisticsItem4 = (BaseballTopPlayersStatisticsItem) obj;
                        baseballTopPlayersStatisticsItem4.getClass();
                        return yid.j(baseballTopPlayersStatisticsItem4.getPitchingStrikeOuts());
                    case 10:
                        BaseballTopPlayersStatistics baseballTopPlayersStatistics7 = (BaseballTopPlayersStatistics) obj;
                        baseballTopPlayersStatistics7.getClass();
                        return baseballTopPlayersStatistics7.getPitchingQualityStarts();
                    case 11:
                        BaseballTopPlayersStatisticsItem baseballTopPlayersStatisticsItem5 = (BaseballTopPlayersStatisticsItem) obj;
                        baseballTopPlayersStatisticsItem5.getClass();
                        return yid.j(baseballTopPlayersStatisticsItem5.getPitchingQualityStarts());
                    case 12:
                        BaseballTopPlayersStatistics baseballTopPlayersStatistics8 = (BaseballTopPlayersStatistics) obj;
                        baseballTopPlayersStatistics8.getClass();
                        return baseballTopPlayersStatistics8.getPitchingWhip();
                    case 13:
                        BaseballTopPlayersStatisticsItem baseballTopPlayersStatisticsItem6 = (BaseballTopPlayersStatisticsItem) obj;
                        baseballTopPlayersStatisticsItem6.getClass();
                        return yid.j(baseballTopPlayersStatisticsItem6.getBattingRbi());
                    case 14:
                        BaseballTopPlayersStatisticsItem baseballTopPlayersStatisticsItem7 = (BaseballTopPlayersStatisticsItem) obj;
                        baseballTopPlayersStatisticsItem7.getClass();
                        Double pitchingWhip = baseballTopPlayersStatisticsItem7.getPitchingWhip();
                        yid.k(pitchingWhip);
                        String format = new DecimalFormat(".000", new DecimalFormatSymbols(Locale.US)).format(yid.k(pitchingWhip));
                        format.getClass();
                        return format;
                    case 15:
                        BaseballTopPlayersStatistics baseballTopPlayersStatistics9 = (BaseballTopPlayersStatistics) obj;
                        baseballTopPlayersStatistics9.getClass();
                        return baseballTopPlayersStatistics9.getPitchingWar();
                    case 16:
                        BaseballTopPlayersStatisticsItem baseballTopPlayersStatisticsItem8 = (BaseballTopPlayersStatisticsItem) obj;
                        baseballTopPlayersStatisticsItem8.getClass();
                        return rei.b(1, baseballTopPlayersStatisticsItem8.getPitchingWar());
                    case 17:
                        BaseballTopPlayersStatisticsItem baseballTopPlayersStatisticsItem9 = (BaseballTopPlayersStatisticsItem) obj;
                        baseballTopPlayersStatisticsItem9.getClass();
                        return yid.j(baseballTopPlayersStatisticsItem9.getBattingHits());
                    case 18:
                        BaseballTopPlayersStatistics baseballTopPlayersStatistics10 = (BaseballTopPlayersStatistics) obj;
                        baseballTopPlayersStatistics10.getClass();
                        return baseballTopPlayersStatistics10.getPitchingFieldingIndependentPitching();
                    case 19:
                        BaseballTopPlayersStatisticsItem baseballTopPlayersStatisticsItem10 = (BaseballTopPlayersStatisticsItem) obj;
                        baseballTopPlayersStatisticsItem10.getClass();
                        return rei.b(2, baseballTopPlayersStatisticsItem10.getPitchingFieldingIndependentPitching());
                    case 20:
                        BaseballTopPlayersStatistics baseballTopPlayersStatistics11 = (BaseballTopPlayersStatistics) obj;
                        baseballTopPlayersStatistics11.getClass();
                        return baseballTopPlayersStatistics11.getPitchingOpponentBattingAvg();
                    case 21:
                        BaseballTopPlayersStatisticsItem baseballTopPlayersStatisticsItem11 = (BaseballTopPlayersStatisticsItem) obj;
                        baseballTopPlayersStatisticsItem11.getClass();
                        Double pitchingOpponentBattingAvg = baseballTopPlayersStatisticsItem11.getPitchingOpponentBattingAvg();
                        yid.k(pitchingOpponentBattingAvg);
                        String format2 = new DecimalFormat(".000", new DecimalFormatSymbols(Locale.US)).format(yid.k(pitchingOpponentBattingAvg));
                        format2.getClass();
                        return format2;
                    case 22:
                        BaseballTopPlayersStatistics baseballTopPlayersStatistics12 = (BaseballTopPlayersStatistics) obj;
                        baseballTopPlayersStatistics12.getClass();
                        return baseballTopPlayersStatistics12.getFieldingPutOuts();
                    case 23:
                        BaseballTopPlayersStatisticsItem baseballTopPlayersStatisticsItem12 = (BaseballTopPlayersStatisticsItem) obj;
                        baseballTopPlayersStatisticsItem12.getClass();
                        return yid.j(baseballTopPlayersStatisticsItem12.getFieldingPutOuts());
                    case 24:
                        BaseballTopPlayersStatistics baseballTopPlayersStatistics13 = (BaseballTopPlayersStatistics) obj;
                        baseballTopPlayersStatistics13.getClass();
                        return baseballTopPlayersStatistics13.getBattingStolenBases();
                    case 25:
                        BaseballTopPlayersStatistics baseballTopPlayersStatistics14 = (BaseballTopPlayersStatistics) obj;
                        baseballTopPlayersStatistics14.getClass();
                        return baseballTopPlayersStatistics14.getFieldingAssists();
                    case 26:
                        BaseballTopPlayersStatisticsItem baseballTopPlayersStatisticsItem13 = (BaseballTopPlayersStatisticsItem) obj;
                        baseballTopPlayersStatisticsItem13.getClass();
                        return yid.j(baseballTopPlayersStatisticsItem13.getFieldingAssists());
                    case 27:
                        BaseballTopPlayersStatistics baseballTopPlayersStatistics15 = (BaseballTopPlayersStatistics) obj;
                        baseballTopPlayersStatistics15.getClass();
                        return baseballTopPlayersStatistics15.getFieldingTotalErrors();
                    case 28:
                        BaseballTopPlayersStatisticsItem baseballTopPlayersStatisticsItem14 = (BaseballTopPlayersStatisticsItem) obj;
                        baseballTopPlayersStatisticsItem14.getClass();
                        return yid.j(baseballTopPlayersStatisticsItem14.getFieldingTotalErrors());
                    default:
                        BaseballTopPlayersStatistics baseballTopPlayersStatistics16 = (BaseballTopPlayersStatistics) obj;
                        baseballTopPlayersStatistics16.getClass();
                        return baseballTopPlayersStatistics16.getBattingHomeRuns();
                }
            }
        }, new jab(5));
        kab kabVar8 = new kab("OBP", 7, wj1Var, R.string.baseball_on_base_percentage, new jab(10), new jab(11));
        final int i10 = 12;
        kab kabVar9 = new kab("SLG", 8, wj1Var, R.string.baseball_slugging_percentage, new jab(12), new jab(13));
        kab kabVar10 = new kab("WAR", 9, wj1Var, R.string.baseball_wins_above_replacement, new jab(14), new gab(22));
        wj1 wj1Var2 = wj1.c;
        final int i11 = 25;
        kab kabVar11 = new kab("PITCHING_GAMES_PLAYED", 10, wj1Var2, R.string.baseball_games_pitched, new gab(24), new gab(25));
        final int i12 = 26;
        kab kabVar12 = new kab("PITCHING_WINS", 11, wj1Var2, R.string.wins, new gab(26), new gab(27));
        kab kabVar13 = new kab("PITCHING_LOSSES", 12, wj1Var2, R.string.losses, new gab(28), new gab(29));
        final int i13 = 0;
        final int i14 = 1;
        kab kabVar14 = new kab("PITCHING_SAVES", 13, wj1Var2, R.string.baseball_saves, new Function1() { // from class: iab
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                switch (i13) {
                    case 0:
                        BaseballTopPlayersStatistics baseballTopPlayersStatistics = (BaseballTopPlayersStatistics) obj;
                        baseballTopPlayersStatistics.getClass();
                        return baseballTopPlayersStatistics.getPitchingSaves();
                    case 1:
                        BaseballTopPlayersStatisticsItem baseballTopPlayersStatisticsItem = (BaseballTopPlayersStatisticsItem) obj;
                        baseballTopPlayersStatisticsItem.getClass();
                        return yid.j(baseballTopPlayersStatisticsItem.getPitchingSaves());
                    case 2:
                        BaseballTopPlayersStatistics baseballTopPlayersStatistics2 = (BaseballTopPlayersStatistics) obj;
                        baseballTopPlayersStatistics2.getClass();
                        return baseballTopPlayersStatistics2.getBattingRbi();
                    case 3:
                        BaseballTopPlayersStatistics baseballTopPlayersStatistics3 = (BaseballTopPlayersStatistics) obj;
                        baseballTopPlayersStatistics3.getClass();
                        return baseballTopPlayersStatistics3.getPitchingInningsPitched();
                    case 4:
                        BaseballTopPlayersStatisticsItem baseballTopPlayersStatisticsItem2 = (BaseballTopPlayersStatisticsItem) obj;
                        baseballTopPlayersStatisticsItem2.getClass();
                        return rei.b(1, baseballTopPlayersStatisticsItem2.getPitchingInningsPitched());
                    case 5:
                        BaseballTopPlayersStatistics baseballTopPlayersStatistics4 = (BaseballTopPlayersStatistics) obj;
                        baseballTopPlayersStatistics4.getClass();
                        return baseballTopPlayersStatistics4.getBattingHits();
                    case 6:
                        BaseballTopPlayersStatistics baseballTopPlayersStatistics5 = (BaseballTopPlayersStatistics) obj;
                        baseballTopPlayersStatistics5.getClass();
                        return baseballTopPlayersStatistics5.getPitchingEarnedRunsAverage();
                    case 7:
                        BaseballTopPlayersStatisticsItem baseballTopPlayersStatisticsItem3 = (BaseballTopPlayersStatisticsItem) obj;
                        baseballTopPlayersStatisticsItem3.getClass();
                        return rei.b(2, baseballTopPlayersStatisticsItem3.getPitchingEarnedRunsAverage());
                    case 8:
                        BaseballTopPlayersStatistics baseballTopPlayersStatistics6 = (BaseballTopPlayersStatistics) obj;
                        baseballTopPlayersStatistics6.getClass();
                        return baseballTopPlayersStatistics6.getPitchingStrikeOuts();
                    case 9:
                        BaseballTopPlayersStatisticsItem baseballTopPlayersStatisticsItem4 = (BaseballTopPlayersStatisticsItem) obj;
                        baseballTopPlayersStatisticsItem4.getClass();
                        return yid.j(baseballTopPlayersStatisticsItem4.getPitchingStrikeOuts());
                    case 10:
                        BaseballTopPlayersStatistics baseballTopPlayersStatistics7 = (BaseballTopPlayersStatistics) obj;
                        baseballTopPlayersStatistics7.getClass();
                        return baseballTopPlayersStatistics7.getPitchingQualityStarts();
                    case 11:
                        BaseballTopPlayersStatisticsItem baseballTopPlayersStatisticsItem5 = (BaseballTopPlayersStatisticsItem) obj;
                        baseballTopPlayersStatisticsItem5.getClass();
                        return yid.j(baseballTopPlayersStatisticsItem5.getPitchingQualityStarts());
                    case 12:
                        BaseballTopPlayersStatistics baseballTopPlayersStatistics8 = (BaseballTopPlayersStatistics) obj;
                        baseballTopPlayersStatistics8.getClass();
                        return baseballTopPlayersStatistics8.getPitchingWhip();
                    case 13:
                        BaseballTopPlayersStatisticsItem baseballTopPlayersStatisticsItem6 = (BaseballTopPlayersStatisticsItem) obj;
                        baseballTopPlayersStatisticsItem6.getClass();
                        return yid.j(baseballTopPlayersStatisticsItem6.getBattingRbi());
                    case 14:
                        BaseballTopPlayersStatisticsItem baseballTopPlayersStatisticsItem7 = (BaseballTopPlayersStatisticsItem) obj;
                        baseballTopPlayersStatisticsItem7.getClass();
                        Double pitchingWhip = baseballTopPlayersStatisticsItem7.getPitchingWhip();
                        yid.k(pitchingWhip);
                        String format = new DecimalFormat(".000", new DecimalFormatSymbols(Locale.US)).format(yid.k(pitchingWhip));
                        format.getClass();
                        return format;
                    case 15:
                        BaseballTopPlayersStatistics baseballTopPlayersStatistics9 = (BaseballTopPlayersStatistics) obj;
                        baseballTopPlayersStatistics9.getClass();
                        return baseballTopPlayersStatistics9.getPitchingWar();
                    case 16:
                        BaseballTopPlayersStatisticsItem baseballTopPlayersStatisticsItem8 = (BaseballTopPlayersStatisticsItem) obj;
                        baseballTopPlayersStatisticsItem8.getClass();
                        return rei.b(1, baseballTopPlayersStatisticsItem8.getPitchingWar());
                    case 17:
                        BaseballTopPlayersStatisticsItem baseballTopPlayersStatisticsItem9 = (BaseballTopPlayersStatisticsItem) obj;
                        baseballTopPlayersStatisticsItem9.getClass();
                        return yid.j(baseballTopPlayersStatisticsItem9.getBattingHits());
                    case 18:
                        BaseballTopPlayersStatistics baseballTopPlayersStatistics10 = (BaseballTopPlayersStatistics) obj;
                        baseballTopPlayersStatistics10.getClass();
                        return baseballTopPlayersStatistics10.getPitchingFieldingIndependentPitching();
                    case 19:
                        BaseballTopPlayersStatisticsItem baseballTopPlayersStatisticsItem10 = (BaseballTopPlayersStatisticsItem) obj;
                        baseballTopPlayersStatisticsItem10.getClass();
                        return rei.b(2, baseballTopPlayersStatisticsItem10.getPitchingFieldingIndependentPitching());
                    case 20:
                        BaseballTopPlayersStatistics baseballTopPlayersStatistics11 = (BaseballTopPlayersStatistics) obj;
                        baseballTopPlayersStatistics11.getClass();
                        return baseballTopPlayersStatistics11.getPitchingOpponentBattingAvg();
                    case 21:
                        BaseballTopPlayersStatisticsItem baseballTopPlayersStatisticsItem11 = (BaseballTopPlayersStatisticsItem) obj;
                        baseballTopPlayersStatisticsItem11.getClass();
                        Double pitchingOpponentBattingAvg = baseballTopPlayersStatisticsItem11.getPitchingOpponentBattingAvg();
                        yid.k(pitchingOpponentBattingAvg);
                        String format2 = new DecimalFormat(".000", new DecimalFormatSymbols(Locale.US)).format(yid.k(pitchingOpponentBattingAvg));
                        format2.getClass();
                        return format2;
                    case 22:
                        BaseballTopPlayersStatistics baseballTopPlayersStatistics12 = (BaseballTopPlayersStatistics) obj;
                        baseballTopPlayersStatistics12.getClass();
                        return baseballTopPlayersStatistics12.getFieldingPutOuts();
                    case 23:
                        BaseballTopPlayersStatisticsItem baseballTopPlayersStatisticsItem12 = (BaseballTopPlayersStatisticsItem) obj;
                        baseballTopPlayersStatisticsItem12.getClass();
                        return yid.j(baseballTopPlayersStatisticsItem12.getFieldingPutOuts());
                    case 24:
                        BaseballTopPlayersStatistics baseballTopPlayersStatistics13 = (BaseballTopPlayersStatistics) obj;
                        baseballTopPlayersStatistics13.getClass();
                        return baseballTopPlayersStatistics13.getBattingStolenBases();
                    case 25:
                        BaseballTopPlayersStatistics baseballTopPlayersStatistics14 = (BaseballTopPlayersStatistics) obj;
                        baseballTopPlayersStatistics14.getClass();
                        return baseballTopPlayersStatistics14.getFieldingAssists();
                    case 26:
                        BaseballTopPlayersStatisticsItem baseballTopPlayersStatisticsItem13 = (BaseballTopPlayersStatisticsItem) obj;
                        baseballTopPlayersStatisticsItem13.getClass();
                        return yid.j(baseballTopPlayersStatisticsItem13.getFieldingAssists());
                    case 27:
                        BaseballTopPlayersStatistics baseballTopPlayersStatistics15 = (BaseballTopPlayersStatistics) obj;
                        baseballTopPlayersStatistics15.getClass();
                        return baseballTopPlayersStatistics15.getFieldingTotalErrors();
                    case 28:
                        BaseballTopPlayersStatisticsItem baseballTopPlayersStatisticsItem14 = (BaseballTopPlayersStatisticsItem) obj;
                        baseballTopPlayersStatisticsItem14.getClass();
                        return yid.j(baseballTopPlayersStatisticsItem14.getFieldingTotalErrors());
                    default:
                        BaseballTopPlayersStatistics baseballTopPlayersStatistics16 = (BaseballTopPlayersStatistics) obj;
                        baseballTopPlayersStatistics16.getClass();
                        return baseballTopPlayersStatistics16.getBattingHomeRuns();
                }
            }
        }, new Function1() { // from class: iab
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                switch (i14) {
                    case 0:
                        BaseballTopPlayersStatistics baseballTopPlayersStatistics = (BaseballTopPlayersStatistics) obj;
                        baseballTopPlayersStatistics.getClass();
                        return baseballTopPlayersStatistics.getPitchingSaves();
                    case 1:
                        BaseballTopPlayersStatisticsItem baseballTopPlayersStatisticsItem = (BaseballTopPlayersStatisticsItem) obj;
                        baseballTopPlayersStatisticsItem.getClass();
                        return yid.j(baseballTopPlayersStatisticsItem.getPitchingSaves());
                    case 2:
                        BaseballTopPlayersStatistics baseballTopPlayersStatistics2 = (BaseballTopPlayersStatistics) obj;
                        baseballTopPlayersStatistics2.getClass();
                        return baseballTopPlayersStatistics2.getBattingRbi();
                    case 3:
                        BaseballTopPlayersStatistics baseballTopPlayersStatistics3 = (BaseballTopPlayersStatistics) obj;
                        baseballTopPlayersStatistics3.getClass();
                        return baseballTopPlayersStatistics3.getPitchingInningsPitched();
                    case 4:
                        BaseballTopPlayersStatisticsItem baseballTopPlayersStatisticsItem2 = (BaseballTopPlayersStatisticsItem) obj;
                        baseballTopPlayersStatisticsItem2.getClass();
                        return rei.b(1, baseballTopPlayersStatisticsItem2.getPitchingInningsPitched());
                    case 5:
                        BaseballTopPlayersStatistics baseballTopPlayersStatistics4 = (BaseballTopPlayersStatistics) obj;
                        baseballTopPlayersStatistics4.getClass();
                        return baseballTopPlayersStatistics4.getBattingHits();
                    case 6:
                        BaseballTopPlayersStatistics baseballTopPlayersStatistics5 = (BaseballTopPlayersStatistics) obj;
                        baseballTopPlayersStatistics5.getClass();
                        return baseballTopPlayersStatistics5.getPitchingEarnedRunsAverage();
                    case 7:
                        BaseballTopPlayersStatisticsItem baseballTopPlayersStatisticsItem3 = (BaseballTopPlayersStatisticsItem) obj;
                        baseballTopPlayersStatisticsItem3.getClass();
                        return rei.b(2, baseballTopPlayersStatisticsItem3.getPitchingEarnedRunsAverage());
                    case 8:
                        BaseballTopPlayersStatistics baseballTopPlayersStatistics6 = (BaseballTopPlayersStatistics) obj;
                        baseballTopPlayersStatistics6.getClass();
                        return baseballTopPlayersStatistics6.getPitchingStrikeOuts();
                    case 9:
                        BaseballTopPlayersStatisticsItem baseballTopPlayersStatisticsItem4 = (BaseballTopPlayersStatisticsItem) obj;
                        baseballTopPlayersStatisticsItem4.getClass();
                        return yid.j(baseballTopPlayersStatisticsItem4.getPitchingStrikeOuts());
                    case 10:
                        BaseballTopPlayersStatistics baseballTopPlayersStatistics7 = (BaseballTopPlayersStatistics) obj;
                        baseballTopPlayersStatistics7.getClass();
                        return baseballTopPlayersStatistics7.getPitchingQualityStarts();
                    case 11:
                        BaseballTopPlayersStatisticsItem baseballTopPlayersStatisticsItem5 = (BaseballTopPlayersStatisticsItem) obj;
                        baseballTopPlayersStatisticsItem5.getClass();
                        return yid.j(baseballTopPlayersStatisticsItem5.getPitchingQualityStarts());
                    case 12:
                        BaseballTopPlayersStatistics baseballTopPlayersStatistics8 = (BaseballTopPlayersStatistics) obj;
                        baseballTopPlayersStatistics8.getClass();
                        return baseballTopPlayersStatistics8.getPitchingWhip();
                    case 13:
                        BaseballTopPlayersStatisticsItem baseballTopPlayersStatisticsItem6 = (BaseballTopPlayersStatisticsItem) obj;
                        baseballTopPlayersStatisticsItem6.getClass();
                        return yid.j(baseballTopPlayersStatisticsItem6.getBattingRbi());
                    case 14:
                        BaseballTopPlayersStatisticsItem baseballTopPlayersStatisticsItem7 = (BaseballTopPlayersStatisticsItem) obj;
                        baseballTopPlayersStatisticsItem7.getClass();
                        Double pitchingWhip = baseballTopPlayersStatisticsItem7.getPitchingWhip();
                        yid.k(pitchingWhip);
                        String format = new DecimalFormat(".000", new DecimalFormatSymbols(Locale.US)).format(yid.k(pitchingWhip));
                        format.getClass();
                        return format;
                    case 15:
                        BaseballTopPlayersStatistics baseballTopPlayersStatistics9 = (BaseballTopPlayersStatistics) obj;
                        baseballTopPlayersStatistics9.getClass();
                        return baseballTopPlayersStatistics9.getPitchingWar();
                    case 16:
                        BaseballTopPlayersStatisticsItem baseballTopPlayersStatisticsItem8 = (BaseballTopPlayersStatisticsItem) obj;
                        baseballTopPlayersStatisticsItem8.getClass();
                        return rei.b(1, baseballTopPlayersStatisticsItem8.getPitchingWar());
                    case 17:
                        BaseballTopPlayersStatisticsItem baseballTopPlayersStatisticsItem9 = (BaseballTopPlayersStatisticsItem) obj;
                        baseballTopPlayersStatisticsItem9.getClass();
                        return yid.j(baseballTopPlayersStatisticsItem9.getBattingHits());
                    case 18:
                        BaseballTopPlayersStatistics baseballTopPlayersStatistics10 = (BaseballTopPlayersStatistics) obj;
                        baseballTopPlayersStatistics10.getClass();
                        return baseballTopPlayersStatistics10.getPitchingFieldingIndependentPitching();
                    case 19:
                        BaseballTopPlayersStatisticsItem baseballTopPlayersStatisticsItem10 = (BaseballTopPlayersStatisticsItem) obj;
                        baseballTopPlayersStatisticsItem10.getClass();
                        return rei.b(2, baseballTopPlayersStatisticsItem10.getPitchingFieldingIndependentPitching());
                    case 20:
                        BaseballTopPlayersStatistics baseballTopPlayersStatistics11 = (BaseballTopPlayersStatistics) obj;
                        baseballTopPlayersStatistics11.getClass();
                        return baseballTopPlayersStatistics11.getPitchingOpponentBattingAvg();
                    case 21:
                        BaseballTopPlayersStatisticsItem baseballTopPlayersStatisticsItem11 = (BaseballTopPlayersStatisticsItem) obj;
                        baseballTopPlayersStatisticsItem11.getClass();
                        Double pitchingOpponentBattingAvg = baseballTopPlayersStatisticsItem11.getPitchingOpponentBattingAvg();
                        yid.k(pitchingOpponentBattingAvg);
                        String format2 = new DecimalFormat(".000", new DecimalFormatSymbols(Locale.US)).format(yid.k(pitchingOpponentBattingAvg));
                        format2.getClass();
                        return format2;
                    case 22:
                        BaseballTopPlayersStatistics baseballTopPlayersStatistics12 = (BaseballTopPlayersStatistics) obj;
                        baseballTopPlayersStatistics12.getClass();
                        return baseballTopPlayersStatistics12.getFieldingPutOuts();
                    case 23:
                        BaseballTopPlayersStatisticsItem baseballTopPlayersStatisticsItem12 = (BaseballTopPlayersStatisticsItem) obj;
                        baseballTopPlayersStatisticsItem12.getClass();
                        return yid.j(baseballTopPlayersStatisticsItem12.getFieldingPutOuts());
                    case 24:
                        BaseballTopPlayersStatistics baseballTopPlayersStatistics13 = (BaseballTopPlayersStatistics) obj;
                        baseballTopPlayersStatistics13.getClass();
                        return baseballTopPlayersStatistics13.getBattingStolenBases();
                    case 25:
                        BaseballTopPlayersStatistics baseballTopPlayersStatistics14 = (BaseballTopPlayersStatistics) obj;
                        baseballTopPlayersStatistics14.getClass();
                        return baseballTopPlayersStatistics14.getFieldingAssists();
                    case 26:
                        BaseballTopPlayersStatisticsItem baseballTopPlayersStatisticsItem13 = (BaseballTopPlayersStatisticsItem) obj;
                        baseballTopPlayersStatisticsItem13.getClass();
                        return yid.j(baseballTopPlayersStatisticsItem13.getFieldingAssists());
                    case 27:
                        BaseballTopPlayersStatistics baseballTopPlayersStatistics15 = (BaseballTopPlayersStatistics) obj;
                        baseballTopPlayersStatistics15.getClass();
                        return baseballTopPlayersStatistics15.getFieldingTotalErrors();
                    case 28:
                        BaseballTopPlayersStatisticsItem baseballTopPlayersStatisticsItem14 = (BaseballTopPlayersStatisticsItem) obj;
                        baseballTopPlayersStatisticsItem14.getClass();
                        return yid.j(baseballTopPlayersStatisticsItem14.getFieldingTotalErrors());
                    default:
                        BaseballTopPlayersStatistics baseballTopPlayersStatistics16 = (BaseballTopPlayersStatistics) obj;
                        baseballTopPlayersStatistics16.getClass();
                        return baseballTopPlayersStatistics16.getBattingHomeRuns();
                }
            }
        });
        final int i15 = 3;
        kab kabVar15 = new kab("PITCHING_INNINGS_PITCHED", 14, wj1Var2, R.string.baseball_innings_pitched, new Function1() { // from class: iab
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                switch (i15) {
                    case 0:
                        BaseballTopPlayersStatistics baseballTopPlayersStatistics = (BaseballTopPlayersStatistics) obj;
                        baseballTopPlayersStatistics.getClass();
                        return baseballTopPlayersStatistics.getPitchingSaves();
                    case 1:
                        BaseballTopPlayersStatisticsItem baseballTopPlayersStatisticsItem = (BaseballTopPlayersStatisticsItem) obj;
                        baseballTopPlayersStatisticsItem.getClass();
                        return yid.j(baseballTopPlayersStatisticsItem.getPitchingSaves());
                    case 2:
                        BaseballTopPlayersStatistics baseballTopPlayersStatistics2 = (BaseballTopPlayersStatistics) obj;
                        baseballTopPlayersStatistics2.getClass();
                        return baseballTopPlayersStatistics2.getBattingRbi();
                    case 3:
                        BaseballTopPlayersStatistics baseballTopPlayersStatistics3 = (BaseballTopPlayersStatistics) obj;
                        baseballTopPlayersStatistics3.getClass();
                        return baseballTopPlayersStatistics3.getPitchingInningsPitched();
                    case 4:
                        BaseballTopPlayersStatisticsItem baseballTopPlayersStatisticsItem2 = (BaseballTopPlayersStatisticsItem) obj;
                        baseballTopPlayersStatisticsItem2.getClass();
                        return rei.b(1, baseballTopPlayersStatisticsItem2.getPitchingInningsPitched());
                    case 5:
                        BaseballTopPlayersStatistics baseballTopPlayersStatistics4 = (BaseballTopPlayersStatistics) obj;
                        baseballTopPlayersStatistics4.getClass();
                        return baseballTopPlayersStatistics4.getBattingHits();
                    case 6:
                        BaseballTopPlayersStatistics baseballTopPlayersStatistics5 = (BaseballTopPlayersStatistics) obj;
                        baseballTopPlayersStatistics5.getClass();
                        return baseballTopPlayersStatistics5.getPitchingEarnedRunsAverage();
                    case 7:
                        BaseballTopPlayersStatisticsItem baseballTopPlayersStatisticsItem3 = (BaseballTopPlayersStatisticsItem) obj;
                        baseballTopPlayersStatisticsItem3.getClass();
                        return rei.b(2, baseballTopPlayersStatisticsItem3.getPitchingEarnedRunsAverage());
                    case 8:
                        BaseballTopPlayersStatistics baseballTopPlayersStatistics6 = (BaseballTopPlayersStatistics) obj;
                        baseballTopPlayersStatistics6.getClass();
                        return baseballTopPlayersStatistics6.getPitchingStrikeOuts();
                    case 9:
                        BaseballTopPlayersStatisticsItem baseballTopPlayersStatisticsItem4 = (BaseballTopPlayersStatisticsItem) obj;
                        baseballTopPlayersStatisticsItem4.getClass();
                        return yid.j(baseballTopPlayersStatisticsItem4.getPitchingStrikeOuts());
                    case 10:
                        BaseballTopPlayersStatistics baseballTopPlayersStatistics7 = (BaseballTopPlayersStatistics) obj;
                        baseballTopPlayersStatistics7.getClass();
                        return baseballTopPlayersStatistics7.getPitchingQualityStarts();
                    case 11:
                        BaseballTopPlayersStatisticsItem baseballTopPlayersStatisticsItem5 = (BaseballTopPlayersStatisticsItem) obj;
                        baseballTopPlayersStatisticsItem5.getClass();
                        return yid.j(baseballTopPlayersStatisticsItem5.getPitchingQualityStarts());
                    case 12:
                        BaseballTopPlayersStatistics baseballTopPlayersStatistics8 = (BaseballTopPlayersStatistics) obj;
                        baseballTopPlayersStatistics8.getClass();
                        return baseballTopPlayersStatistics8.getPitchingWhip();
                    case 13:
                        BaseballTopPlayersStatisticsItem baseballTopPlayersStatisticsItem6 = (BaseballTopPlayersStatisticsItem) obj;
                        baseballTopPlayersStatisticsItem6.getClass();
                        return yid.j(baseballTopPlayersStatisticsItem6.getBattingRbi());
                    case 14:
                        BaseballTopPlayersStatisticsItem baseballTopPlayersStatisticsItem7 = (BaseballTopPlayersStatisticsItem) obj;
                        baseballTopPlayersStatisticsItem7.getClass();
                        Double pitchingWhip = baseballTopPlayersStatisticsItem7.getPitchingWhip();
                        yid.k(pitchingWhip);
                        String format = new DecimalFormat(".000", new DecimalFormatSymbols(Locale.US)).format(yid.k(pitchingWhip));
                        format.getClass();
                        return format;
                    case 15:
                        BaseballTopPlayersStatistics baseballTopPlayersStatistics9 = (BaseballTopPlayersStatistics) obj;
                        baseballTopPlayersStatistics9.getClass();
                        return baseballTopPlayersStatistics9.getPitchingWar();
                    case 16:
                        BaseballTopPlayersStatisticsItem baseballTopPlayersStatisticsItem8 = (BaseballTopPlayersStatisticsItem) obj;
                        baseballTopPlayersStatisticsItem8.getClass();
                        return rei.b(1, baseballTopPlayersStatisticsItem8.getPitchingWar());
                    case 17:
                        BaseballTopPlayersStatisticsItem baseballTopPlayersStatisticsItem9 = (BaseballTopPlayersStatisticsItem) obj;
                        baseballTopPlayersStatisticsItem9.getClass();
                        return yid.j(baseballTopPlayersStatisticsItem9.getBattingHits());
                    case 18:
                        BaseballTopPlayersStatistics baseballTopPlayersStatistics10 = (BaseballTopPlayersStatistics) obj;
                        baseballTopPlayersStatistics10.getClass();
                        return baseballTopPlayersStatistics10.getPitchingFieldingIndependentPitching();
                    case 19:
                        BaseballTopPlayersStatisticsItem baseballTopPlayersStatisticsItem10 = (BaseballTopPlayersStatisticsItem) obj;
                        baseballTopPlayersStatisticsItem10.getClass();
                        return rei.b(2, baseballTopPlayersStatisticsItem10.getPitchingFieldingIndependentPitching());
                    case 20:
                        BaseballTopPlayersStatistics baseballTopPlayersStatistics11 = (BaseballTopPlayersStatistics) obj;
                        baseballTopPlayersStatistics11.getClass();
                        return baseballTopPlayersStatistics11.getPitchingOpponentBattingAvg();
                    case 21:
                        BaseballTopPlayersStatisticsItem baseballTopPlayersStatisticsItem11 = (BaseballTopPlayersStatisticsItem) obj;
                        baseballTopPlayersStatisticsItem11.getClass();
                        Double pitchingOpponentBattingAvg = baseballTopPlayersStatisticsItem11.getPitchingOpponentBattingAvg();
                        yid.k(pitchingOpponentBattingAvg);
                        String format2 = new DecimalFormat(".000", new DecimalFormatSymbols(Locale.US)).format(yid.k(pitchingOpponentBattingAvg));
                        format2.getClass();
                        return format2;
                    case 22:
                        BaseballTopPlayersStatistics baseballTopPlayersStatistics12 = (BaseballTopPlayersStatistics) obj;
                        baseballTopPlayersStatistics12.getClass();
                        return baseballTopPlayersStatistics12.getFieldingPutOuts();
                    case 23:
                        BaseballTopPlayersStatisticsItem baseballTopPlayersStatisticsItem12 = (BaseballTopPlayersStatisticsItem) obj;
                        baseballTopPlayersStatisticsItem12.getClass();
                        return yid.j(baseballTopPlayersStatisticsItem12.getFieldingPutOuts());
                    case 24:
                        BaseballTopPlayersStatistics baseballTopPlayersStatistics13 = (BaseballTopPlayersStatistics) obj;
                        baseballTopPlayersStatistics13.getClass();
                        return baseballTopPlayersStatistics13.getBattingStolenBases();
                    case 25:
                        BaseballTopPlayersStatistics baseballTopPlayersStatistics14 = (BaseballTopPlayersStatistics) obj;
                        baseballTopPlayersStatistics14.getClass();
                        return baseballTopPlayersStatistics14.getFieldingAssists();
                    case 26:
                        BaseballTopPlayersStatisticsItem baseballTopPlayersStatisticsItem13 = (BaseballTopPlayersStatisticsItem) obj;
                        baseballTopPlayersStatisticsItem13.getClass();
                        return yid.j(baseballTopPlayersStatisticsItem13.getFieldingAssists());
                    case 27:
                        BaseballTopPlayersStatistics baseballTopPlayersStatistics15 = (BaseballTopPlayersStatistics) obj;
                        baseballTopPlayersStatistics15.getClass();
                        return baseballTopPlayersStatistics15.getFieldingTotalErrors();
                    case 28:
                        BaseballTopPlayersStatisticsItem baseballTopPlayersStatisticsItem14 = (BaseballTopPlayersStatisticsItem) obj;
                        baseballTopPlayersStatisticsItem14.getClass();
                        return yid.j(baseballTopPlayersStatisticsItem14.getFieldingTotalErrors());
                    default:
                        BaseballTopPlayersStatistics baseballTopPlayersStatistics16 = (BaseballTopPlayersStatistics) obj;
                        baseballTopPlayersStatistics16.getClass();
                        return baseballTopPlayersStatistics16.getBattingHomeRuns();
                }
            }
        }, new Function1() { // from class: iab
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                switch (i4) {
                    case 0:
                        BaseballTopPlayersStatistics baseballTopPlayersStatistics = (BaseballTopPlayersStatistics) obj;
                        baseballTopPlayersStatistics.getClass();
                        return baseballTopPlayersStatistics.getPitchingSaves();
                    case 1:
                        BaseballTopPlayersStatisticsItem baseballTopPlayersStatisticsItem = (BaseballTopPlayersStatisticsItem) obj;
                        baseballTopPlayersStatisticsItem.getClass();
                        return yid.j(baseballTopPlayersStatisticsItem.getPitchingSaves());
                    case 2:
                        BaseballTopPlayersStatistics baseballTopPlayersStatistics2 = (BaseballTopPlayersStatistics) obj;
                        baseballTopPlayersStatistics2.getClass();
                        return baseballTopPlayersStatistics2.getBattingRbi();
                    case 3:
                        BaseballTopPlayersStatistics baseballTopPlayersStatistics3 = (BaseballTopPlayersStatistics) obj;
                        baseballTopPlayersStatistics3.getClass();
                        return baseballTopPlayersStatistics3.getPitchingInningsPitched();
                    case 4:
                        BaseballTopPlayersStatisticsItem baseballTopPlayersStatisticsItem2 = (BaseballTopPlayersStatisticsItem) obj;
                        baseballTopPlayersStatisticsItem2.getClass();
                        return rei.b(1, baseballTopPlayersStatisticsItem2.getPitchingInningsPitched());
                    case 5:
                        BaseballTopPlayersStatistics baseballTopPlayersStatistics4 = (BaseballTopPlayersStatistics) obj;
                        baseballTopPlayersStatistics4.getClass();
                        return baseballTopPlayersStatistics4.getBattingHits();
                    case 6:
                        BaseballTopPlayersStatistics baseballTopPlayersStatistics5 = (BaseballTopPlayersStatistics) obj;
                        baseballTopPlayersStatistics5.getClass();
                        return baseballTopPlayersStatistics5.getPitchingEarnedRunsAverage();
                    case 7:
                        BaseballTopPlayersStatisticsItem baseballTopPlayersStatisticsItem3 = (BaseballTopPlayersStatisticsItem) obj;
                        baseballTopPlayersStatisticsItem3.getClass();
                        return rei.b(2, baseballTopPlayersStatisticsItem3.getPitchingEarnedRunsAverage());
                    case 8:
                        BaseballTopPlayersStatistics baseballTopPlayersStatistics6 = (BaseballTopPlayersStatistics) obj;
                        baseballTopPlayersStatistics6.getClass();
                        return baseballTopPlayersStatistics6.getPitchingStrikeOuts();
                    case 9:
                        BaseballTopPlayersStatisticsItem baseballTopPlayersStatisticsItem4 = (BaseballTopPlayersStatisticsItem) obj;
                        baseballTopPlayersStatisticsItem4.getClass();
                        return yid.j(baseballTopPlayersStatisticsItem4.getPitchingStrikeOuts());
                    case 10:
                        BaseballTopPlayersStatistics baseballTopPlayersStatistics7 = (BaseballTopPlayersStatistics) obj;
                        baseballTopPlayersStatistics7.getClass();
                        return baseballTopPlayersStatistics7.getPitchingQualityStarts();
                    case 11:
                        BaseballTopPlayersStatisticsItem baseballTopPlayersStatisticsItem5 = (BaseballTopPlayersStatisticsItem) obj;
                        baseballTopPlayersStatisticsItem5.getClass();
                        return yid.j(baseballTopPlayersStatisticsItem5.getPitchingQualityStarts());
                    case 12:
                        BaseballTopPlayersStatistics baseballTopPlayersStatistics8 = (BaseballTopPlayersStatistics) obj;
                        baseballTopPlayersStatistics8.getClass();
                        return baseballTopPlayersStatistics8.getPitchingWhip();
                    case 13:
                        BaseballTopPlayersStatisticsItem baseballTopPlayersStatisticsItem6 = (BaseballTopPlayersStatisticsItem) obj;
                        baseballTopPlayersStatisticsItem6.getClass();
                        return yid.j(baseballTopPlayersStatisticsItem6.getBattingRbi());
                    case 14:
                        BaseballTopPlayersStatisticsItem baseballTopPlayersStatisticsItem7 = (BaseballTopPlayersStatisticsItem) obj;
                        baseballTopPlayersStatisticsItem7.getClass();
                        Double pitchingWhip = baseballTopPlayersStatisticsItem7.getPitchingWhip();
                        yid.k(pitchingWhip);
                        String format = new DecimalFormat(".000", new DecimalFormatSymbols(Locale.US)).format(yid.k(pitchingWhip));
                        format.getClass();
                        return format;
                    case 15:
                        BaseballTopPlayersStatistics baseballTopPlayersStatistics9 = (BaseballTopPlayersStatistics) obj;
                        baseballTopPlayersStatistics9.getClass();
                        return baseballTopPlayersStatistics9.getPitchingWar();
                    case 16:
                        BaseballTopPlayersStatisticsItem baseballTopPlayersStatisticsItem8 = (BaseballTopPlayersStatisticsItem) obj;
                        baseballTopPlayersStatisticsItem8.getClass();
                        return rei.b(1, baseballTopPlayersStatisticsItem8.getPitchingWar());
                    case 17:
                        BaseballTopPlayersStatisticsItem baseballTopPlayersStatisticsItem9 = (BaseballTopPlayersStatisticsItem) obj;
                        baseballTopPlayersStatisticsItem9.getClass();
                        return yid.j(baseballTopPlayersStatisticsItem9.getBattingHits());
                    case 18:
                        BaseballTopPlayersStatistics baseballTopPlayersStatistics10 = (BaseballTopPlayersStatistics) obj;
                        baseballTopPlayersStatistics10.getClass();
                        return baseballTopPlayersStatistics10.getPitchingFieldingIndependentPitching();
                    case 19:
                        BaseballTopPlayersStatisticsItem baseballTopPlayersStatisticsItem10 = (BaseballTopPlayersStatisticsItem) obj;
                        baseballTopPlayersStatisticsItem10.getClass();
                        return rei.b(2, baseballTopPlayersStatisticsItem10.getPitchingFieldingIndependentPitching());
                    case 20:
                        BaseballTopPlayersStatistics baseballTopPlayersStatistics11 = (BaseballTopPlayersStatistics) obj;
                        baseballTopPlayersStatistics11.getClass();
                        return baseballTopPlayersStatistics11.getPitchingOpponentBattingAvg();
                    case 21:
                        BaseballTopPlayersStatisticsItem baseballTopPlayersStatisticsItem11 = (BaseballTopPlayersStatisticsItem) obj;
                        baseballTopPlayersStatisticsItem11.getClass();
                        Double pitchingOpponentBattingAvg = baseballTopPlayersStatisticsItem11.getPitchingOpponentBattingAvg();
                        yid.k(pitchingOpponentBattingAvg);
                        String format2 = new DecimalFormat(".000", new DecimalFormatSymbols(Locale.US)).format(yid.k(pitchingOpponentBattingAvg));
                        format2.getClass();
                        return format2;
                    case 22:
                        BaseballTopPlayersStatistics baseballTopPlayersStatistics12 = (BaseballTopPlayersStatistics) obj;
                        baseballTopPlayersStatistics12.getClass();
                        return baseballTopPlayersStatistics12.getFieldingPutOuts();
                    case 23:
                        BaseballTopPlayersStatisticsItem baseballTopPlayersStatisticsItem12 = (BaseballTopPlayersStatisticsItem) obj;
                        baseballTopPlayersStatisticsItem12.getClass();
                        return yid.j(baseballTopPlayersStatisticsItem12.getFieldingPutOuts());
                    case 24:
                        BaseballTopPlayersStatistics baseballTopPlayersStatistics13 = (BaseballTopPlayersStatistics) obj;
                        baseballTopPlayersStatistics13.getClass();
                        return baseballTopPlayersStatistics13.getBattingStolenBases();
                    case 25:
                        BaseballTopPlayersStatistics baseballTopPlayersStatistics14 = (BaseballTopPlayersStatistics) obj;
                        baseballTopPlayersStatistics14.getClass();
                        return baseballTopPlayersStatistics14.getFieldingAssists();
                    case 26:
                        BaseballTopPlayersStatisticsItem baseballTopPlayersStatisticsItem13 = (BaseballTopPlayersStatisticsItem) obj;
                        baseballTopPlayersStatisticsItem13.getClass();
                        return yid.j(baseballTopPlayersStatisticsItem13.getFieldingAssists());
                    case 27:
                        BaseballTopPlayersStatistics baseballTopPlayersStatistics15 = (BaseballTopPlayersStatistics) obj;
                        baseballTopPlayersStatistics15.getClass();
                        return baseballTopPlayersStatistics15.getFieldingTotalErrors();
                    case 28:
                        BaseballTopPlayersStatisticsItem baseballTopPlayersStatisticsItem14 = (BaseballTopPlayersStatisticsItem) obj;
                        baseballTopPlayersStatisticsItem14.getClass();
                        return yid.j(baseballTopPlayersStatisticsItem14.getFieldingTotalErrors());
                    default:
                        BaseballTopPlayersStatistics baseballTopPlayersStatistics16 = (BaseballTopPlayersStatistics) obj;
                        baseballTopPlayersStatistics16.getClass();
                        return baseballTopPlayersStatistics16.getBattingHomeRuns();
                }
            }
        });
        kab kabVar16 = new kab("PITCHING_ERA", 15, wj1Var2, R.string.baseball_earned_run_average, new Function1() { // from class: iab
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                switch (i5) {
                    case 0:
                        BaseballTopPlayersStatistics baseballTopPlayersStatistics = (BaseballTopPlayersStatistics) obj;
                        baseballTopPlayersStatistics.getClass();
                        return baseballTopPlayersStatistics.getPitchingSaves();
                    case 1:
                        BaseballTopPlayersStatisticsItem baseballTopPlayersStatisticsItem = (BaseballTopPlayersStatisticsItem) obj;
                        baseballTopPlayersStatisticsItem.getClass();
                        return yid.j(baseballTopPlayersStatisticsItem.getPitchingSaves());
                    case 2:
                        BaseballTopPlayersStatistics baseballTopPlayersStatistics2 = (BaseballTopPlayersStatistics) obj;
                        baseballTopPlayersStatistics2.getClass();
                        return baseballTopPlayersStatistics2.getBattingRbi();
                    case 3:
                        BaseballTopPlayersStatistics baseballTopPlayersStatistics3 = (BaseballTopPlayersStatistics) obj;
                        baseballTopPlayersStatistics3.getClass();
                        return baseballTopPlayersStatistics3.getPitchingInningsPitched();
                    case 4:
                        BaseballTopPlayersStatisticsItem baseballTopPlayersStatisticsItem2 = (BaseballTopPlayersStatisticsItem) obj;
                        baseballTopPlayersStatisticsItem2.getClass();
                        return rei.b(1, baseballTopPlayersStatisticsItem2.getPitchingInningsPitched());
                    case 5:
                        BaseballTopPlayersStatistics baseballTopPlayersStatistics4 = (BaseballTopPlayersStatistics) obj;
                        baseballTopPlayersStatistics4.getClass();
                        return baseballTopPlayersStatistics4.getBattingHits();
                    case 6:
                        BaseballTopPlayersStatistics baseballTopPlayersStatistics5 = (BaseballTopPlayersStatistics) obj;
                        baseballTopPlayersStatistics5.getClass();
                        return baseballTopPlayersStatistics5.getPitchingEarnedRunsAverage();
                    case 7:
                        BaseballTopPlayersStatisticsItem baseballTopPlayersStatisticsItem3 = (BaseballTopPlayersStatisticsItem) obj;
                        baseballTopPlayersStatisticsItem3.getClass();
                        return rei.b(2, baseballTopPlayersStatisticsItem3.getPitchingEarnedRunsAverage());
                    case 8:
                        BaseballTopPlayersStatistics baseballTopPlayersStatistics6 = (BaseballTopPlayersStatistics) obj;
                        baseballTopPlayersStatistics6.getClass();
                        return baseballTopPlayersStatistics6.getPitchingStrikeOuts();
                    case 9:
                        BaseballTopPlayersStatisticsItem baseballTopPlayersStatisticsItem4 = (BaseballTopPlayersStatisticsItem) obj;
                        baseballTopPlayersStatisticsItem4.getClass();
                        return yid.j(baseballTopPlayersStatisticsItem4.getPitchingStrikeOuts());
                    case 10:
                        BaseballTopPlayersStatistics baseballTopPlayersStatistics7 = (BaseballTopPlayersStatistics) obj;
                        baseballTopPlayersStatistics7.getClass();
                        return baseballTopPlayersStatistics7.getPitchingQualityStarts();
                    case 11:
                        BaseballTopPlayersStatisticsItem baseballTopPlayersStatisticsItem5 = (BaseballTopPlayersStatisticsItem) obj;
                        baseballTopPlayersStatisticsItem5.getClass();
                        return yid.j(baseballTopPlayersStatisticsItem5.getPitchingQualityStarts());
                    case 12:
                        BaseballTopPlayersStatistics baseballTopPlayersStatistics8 = (BaseballTopPlayersStatistics) obj;
                        baseballTopPlayersStatistics8.getClass();
                        return baseballTopPlayersStatistics8.getPitchingWhip();
                    case 13:
                        BaseballTopPlayersStatisticsItem baseballTopPlayersStatisticsItem6 = (BaseballTopPlayersStatisticsItem) obj;
                        baseballTopPlayersStatisticsItem6.getClass();
                        return yid.j(baseballTopPlayersStatisticsItem6.getBattingRbi());
                    case 14:
                        BaseballTopPlayersStatisticsItem baseballTopPlayersStatisticsItem7 = (BaseballTopPlayersStatisticsItem) obj;
                        baseballTopPlayersStatisticsItem7.getClass();
                        Double pitchingWhip = baseballTopPlayersStatisticsItem7.getPitchingWhip();
                        yid.k(pitchingWhip);
                        String format = new DecimalFormat(".000", new DecimalFormatSymbols(Locale.US)).format(yid.k(pitchingWhip));
                        format.getClass();
                        return format;
                    case 15:
                        BaseballTopPlayersStatistics baseballTopPlayersStatistics9 = (BaseballTopPlayersStatistics) obj;
                        baseballTopPlayersStatistics9.getClass();
                        return baseballTopPlayersStatistics9.getPitchingWar();
                    case 16:
                        BaseballTopPlayersStatisticsItem baseballTopPlayersStatisticsItem8 = (BaseballTopPlayersStatisticsItem) obj;
                        baseballTopPlayersStatisticsItem8.getClass();
                        return rei.b(1, baseballTopPlayersStatisticsItem8.getPitchingWar());
                    case 17:
                        BaseballTopPlayersStatisticsItem baseballTopPlayersStatisticsItem9 = (BaseballTopPlayersStatisticsItem) obj;
                        baseballTopPlayersStatisticsItem9.getClass();
                        return yid.j(baseballTopPlayersStatisticsItem9.getBattingHits());
                    case 18:
                        BaseballTopPlayersStatistics baseballTopPlayersStatistics10 = (BaseballTopPlayersStatistics) obj;
                        baseballTopPlayersStatistics10.getClass();
                        return baseballTopPlayersStatistics10.getPitchingFieldingIndependentPitching();
                    case 19:
                        BaseballTopPlayersStatisticsItem baseballTopPlayersStatisticsItem10 = (BaseballTopPlayersStatisticsItem) obj;
                        baseballTopPlayersStatisticsItem10.getClass();
                        return rei.b(2, baseballTopPlayersStatisticsItem10.getPitchingFieldingIndependentPitching());
                    case 20:
                        BaseballTopPlayersStatistics baseballTopPlayersStatistics11 = (BaseballTopPlayersStatistics) obj;
                        baseballTopPlayersStatistics11.getClass();
                        return baseballTopPlayersStatistics11.getPitchingOpponentBattingAvg();
                    case 21:
                        BaseballTopPlayersStatisticsItem baseballTopPlayersStatisticsItem11 = (BaseballTopPlayersStatisticsItem) obj;
                        baseballTopPlayersStatisticsItem11.getClass();
                        Double pitchingOpponentBattingAvg = baseballTopPlayersStatisticsItem11.getPitchingOpponentBattingAvg();
                        yid.k(pitchingOpponentBattingAvg);
                        String format2 = new DecimalFormat(".000", new DecimalFormatSymbols(Locale.US)).format(yid.k(pitchingOpponentBattingAvg));
                        format2.getClass();
                        return format2;
                    case 22:
                        BaseballTopPlayersStatistics baseballTopPlayersStatistics12 = (BaseballTopPlayersStatistics) obj;
                        baseballTopPlayersStatistics12.getClass();
                        return baseballTopPlayersStatistics12.getFieldingPutOuts();
                    case 23:
                        BaseballTopPlayersStatisticsItem baseballTopPlayersStatisticsItem12 = (BaseballTopPlayersStatisticsItem) obj;
                        baseballTopPlayersStatisticsItem12.getClass();
                        return yid.j(baseballTopPlayersStatisticsItem12.getFieldingPutOuts());
                    case 24:
                        BaseballTopPlayersStatistics baseballTopPlayersStatistics13 = (BaseballTopPlayersStatistics) obj;
                        baseballTopPlayersStatistics13.getClass();
                        return baseballTopPlayersStatistics13.getBattingStolenBases();
                    case 25:
                        BaseballTopPlayersStatistics baseballTopPlayersStatistics14 = (BaseballTopPlayersStatistics) obj;
                        baseballTopPlayersStatistics14.getClass();
                        return baseballTopPlayersStatistics14.getFieldingAssists();
                    case 26:
                        BaseballTopPlayersStatisticsItem baseballTopPlayersStatisticsItem13 = (BaseballTopPlayersStatisticsItem) obj;
                        baseballTopPlayersStatisticsItem13.getClass();
                        return yid.j(baseballTopPlayersStatisticsItem13.getFieldingAssists());
                    case 27:
                        BaseballTopPlayersStatistics baseballTopPlayersStatistics15 = (BaseballTopPlayersStatistics) obj;
                        baseballTopPlayersStatistics15.getClass();
                        return baseballTopPlayersStatistics15.getFieldingTotalErrors();
                    case 28:
                        BaseballTopPlayersStatisticsItem baseballTopPlayersStatisticsItem14 = (BaseballTopPlayersStatisticsItem) obj;
                        baseballTopPlayersStatisticsItem14.getClass();
                        return yid.j(baseballTopPlayersStatisticsItem14.getFieldingTotalErrors());
                    default:
                        BaseballTopPlayersStatistics baseballTopPlayersStatistics16 = (BaseballTopPlayersStatistics) obj;
                        baseballTopPlayersStatistics16.getClass();
                        return baseballTopPlayersStatistics16.getBattingHomeRuns();
                }
            }
        }, new Function1() { // from class: iab
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                switch (i6) {
                    case 0:
                        BaseballTopPlayersStatistics baseballTopPlayersStatistics = (BaseballTopPlayersStatistics) obj;
                        baseballTopPlayersStatistics.getClass();
                        return baseballTopPlayersStatistics.getPitchingSaves();
                    case 1:
                        BaseballTopPlayersStatisticsItem baseballTopPlayersStatisticsItem = (BaseballTopPlayersStatisticsItem) obj;
                        baseballTopPlayersStatisticsItem.getClass();
                        return yid.j(baseballTopPlayersStatisticsItem.getPitchingSaves());
                    case 2:
                        BaseballTopPlayersStatistics baseballTopPlayersStatistics2 = (BaseballTopPlayersStatistics) obj;
                        baseballTopPlayersStatistics2.getClass();
                        return baseballTopPlayersStatistics2.getBattingRbi();
                    case 3:
                        BaseballTopPlayersStatistics baseballTopPlayersStatistics3 = (BaseballTopPlayersStatistics) obj;
                        baseballTopPlayersStatistics3.getClass();
                        return baseballTopPlayersStatistics3.getPitchingInningsPitched();
                    case 4:
                        BaseballTopPlayersStatisticsItem baseballTopPlayersStatisticsItem2 = (BaseballTopPlayersStatisticsItem) obj;
                        baseballTopPlayersStatisticsItem2.getClass();
                        return rei.b(1, baseballTopPlayersStatisticsItem2.getPitchingInningsPitched());
                    case 5:
                        BaseballTopPlayersStatistics baseballTopPlayersStatistics4 = (BaseballTopPlayersStatistics) obj;
                        baseballTopPlayersStatistics4.getClass();
                        return baseballTopPlayersStatistics4.getBattingHits();
                    case 6:
                        BaseballTopPlayersStatistics baseballTopPlayersStatistics5 = (BaseballTopPlayersStatistics) obj;
                        baseballTopPlayersStatistics5.getClass();
                        return baseballTopPlayersStatistics5.getPitchingEarnedRunsAverage();
                    case 7:
                        BaseballTopPlayersStatisticsItem baseballTopPlayersStatisticsItem3 = (BaseballTopPlayersStatisticsItem) obj;
                        baseballTopPlayersStatisticsItem3.getClass();
                        return rei.b(2, baseballTopPlayersStatisticsItem3.getPitchingEarnedRunsAverage());
                    case 8:
                        BaseballTopPlayersStatistics baseballTopPlayersStatistics6 = (BaseballTopPlayersStatistics) obj;
                        baseballTopPlayersStatistics6.getClass();
                        return baseballTopPlayersStatistics6.getPitchingStrikeOuts();
                    case 9:
                        BaseballTopPlayersStatisticsItem baseballTopPlayersStatisticsItem4 = (BaseballTopPlayersStatisticsItem) obj;
                        baseballTopPlayersStatisticsItem4.getClass();
                        return yid.j(baseballTopPlayersStatisticsItem4.getPitchingStrikeOuts());
                    case 10:
                        BaseballTopPlayersStatistics baseballTopPlayersStatistics7 = (BaseballTopPlayersStatistics) obj;
                        baseballTopPlayersStatistics7.getClass();
                        return baseballTopPlayersStatistics7.getPitchingQualityStarts();
                    case 11:
                        BaseballTopPlayersStatisticsItem baseballTopPlayersStatisticsItem5 = (BaseballTopPlayersStatisticsItem) obj;
                        baseballTopPlayersStatisticsItem5.getClass();
                        return yid.j(baseballTopPlayersStatisticsItem5.getPitchingQualityStarts());
                    case 12:
                        BaseballTopPlayersStatistics baseballTopPlayersStatistics8 = (BaseballTopPlayersStatistics) obj;
                        baseballTopPlayersStatistics8.getClass();
                        return baseballTopPlayersStatistics8.getPitchingWhip();
                    case 13:
                        BaseballTopPlayersStatisticsItem baseballTopPlayersStatisticsItem6 = (BaseballTopPlayersStatisticsItem) obj;
                        baseballTopPlayersStatisticsItem6.getClass();
                        return yid.j(baseballTopPlayersStatisticsItem6.getBattingRbi());
                    case 14:
                        BaseballTopPlayersStatisticsItem baseballTopPlayersStatisticsItem7 = (BaseballTopPlayersStatisticsItem) obj;
                        baseballTopPlayersStatisticsItem7.getClass();
                        Double pitchingWhip = baseballTopPlayersStatisticsItem7.getPitchingWhip();
                        yid.k(pitchingWhip);
                        String format = new DecimalFormat(".000", new DecimalFormatSymbols(Locale.US)).format(yid.k(pitchingWhip));
                        format.getClass();
                        return format;
                    case 15:
                        BaseballTopPlayersStatistics baseballTopPlayersStatistics9 = (BaseballTopPlayersStatistics) obj;
                        baseballTopPlayersStatistics9.getClass();
                        return baseballTopPlayersStatistics9.getPitchingWar();
                    case 16:
                        BaseballTopPlayersStatisticsItem baseballTopPlayersStatisticsItem8 = (BaseballTopPlayersStatisticsItem) obj;
                        baseballTopPlayersStatisticsItem8.getClass();
                        return rei.b(1, baseballTopPlayersStatisticsItem8.getPitchingWar());
                    case 17:
                        BaseballTopPlayersStatisticsItem baseballTopPlayersStatisticsItem9 = (BaseballTopPlayersStatisticsItem) obj;
                        baseballTopPlayersStatisticsItem9.getClass();
                        return yid.j(baseballTopPlayersStatisticsItem9.getBattingHits());
                    case 18:
                        BaseballTopPlayersStatistics baseballTopPlayersStatistics10 = (BaseballTopPlayersStatistics) obj;
                        baseballTopPlayersStatistics10.getClass();
                        return baseballTopPlayersStatistics10.getPitchingFieldingIndependentPitching();
                    case 19:
                        BaseballTopPlayersStatisticsItem baseballTopPlayersStatisticsItem10 = (BaseballTopPlayersStatisticsItem) obj;
                        baseballTopPlayersStatisticsItem10.getClass();
                        return rei.b(2, baseballTopPlayersStatisticsItem10.getPitchingFieldingIndependentPitching());
                    case 20:
                        BaseballTopPlayersStatistics baseballTopPlayersStatistics11 = (BaseballTopPlayersStatistics) obj;
                        baseballTopPlayersStatistics11.getClass();
                        return baseballTopPlayersStatistics11.getPitchingOpponentBattingAvg();
                    case 21:
                        BaseballTopPlayersStatisticsItem baseballTopPlayersStatisticsItem11 = (BaseballTopPlayersStatisticsItem) obj;
                        baseballTopPlayersStatisticsItem11.getClass();
                        Double pitchingOpponentBattingAvg = baseballTopPlayersStatisticsItem11.getPitchingOpponentBattingAvg();
                        yid.k(pitchingOpponentBattingAvg);
                        String format2 = new DecimalFormat(".000", new DecimalFormatSymbols(Locale.US)).format(yid.k(pitchingOpponentBattingAvg));
                        format2.getClass();
                        return format2;
                    case 22:
                        BaseballTopPlayersStatistics baseballTopPlayersStatistics12 = (BaseballTopPlayersStatistics) obj;
                        baseballTopPlayersStatistics12.getClass();
                        return baseballTopPlayersStatistics12.getFieldingPutOuts();
                    case 23:
                        BaseballTopPlayersStatisticsItem baseballTopPlayersStatisticsItem12 = (BaseballTopPlayersStatisticsItem) obj;
                        baseballTopPlayersStatisticsItem12.getClass();
                        return yid.j(baseballTopPlayersStatisticsItem12.getFieldingPutOuts());
                    case 24:
                        BaseballTopPlayersStatistics baseballTopPlayersStatistics13 = (BaseballTopPlayersStatistics) obj;
                        baseballTopPlayersStatistics13.getClass();
                        return baseballTopPlayersStatistics13.getBattingStolenBases();
                    case 25:
                        BaseballTopPlayersStatistics baseballTopPlayersStatistics14 = (BaseballTopPlayersStatistics) obj;
                        baseballTopPlayersStatistics14.getClass();
                        return baseballTopPlayersStatistics14.getFieldingAssists();
                    case 26:
                        BaseballTopPlayersStatisticsItem baseballTopPlayersStatisticsItem13 = (BaseballTopPlayersStatisticsItem) obj;
                        baseballTopPlayersStatisticsItem13.getClass();
                        return yid.j(baseballTopPlayersStatisticsItem13.getFieldingAssists());
                    case 27:
                        BaseballTopPlayersStatistics baseballTopPlayersStatistics15 = (BaseballTopPlayersStatistics) obj;
                        baseballTopPlayersStatistics15.getClass();
                        return baseballTopPlayersStatistics15.getFieldingTotalErrors();
                    case 28:
                        BaseballTopPlayersStatisticsItem baseballTopPlayersStatisticsItem14 = (BaseballTopPlayersStatisticsItem) obj;
                        baseballTopPlayersStatisticsItem14.getClass();
                        return yid.j(baseballTopPlayersStatisticsItem14.getFieldingTotalErrors());
                    default:
                        BaseballTopPlayersStatistics baseballTopPlayersStatistics16 = (BaseballTopPlayersStatistics) obj;
                        baseballTopPlayersStatistics16.getClass();
                        return baseballTopPlayersStatistics16.getBattingHomeRuns();
                }
            }
        });
        final int i16 = 8;
        final int i17 = 9;
        kab kabVar17 = new kab("PITCHING_STRIKEOUTS", 16, wj1Var2, R.string.baseball_strikeouts, new Function1() { // from class: iab
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                switch (i16) {
                    case 0:
                        BaseballTopPlayersStatistics baseballTopPlayersStatistics = (BaseballTopPlayersStatistics) obj;
                        baseballTopPlayersStatistics.getClass();
                        return baseballTopPlayersStatistics.getPitchingSaves();
                    case 1:
                        BaseballTopPlayersStatisticsItem baseballTopPlayersStatisticsItem = (BaseballTopPlayersStatisticsItem) obj;
                        baseballTopPlayersStatisticsItem.getClass();
                        return yid.j(baseballTopPlayersStatisticsItem.getPitchingSaves());
                    case 2:
                        BaseballTopPlayersStatistics baseballTopPlayersStatistics2 = (BaseballTopPlayersStatistics) obj;
                        baseballTopPlayersStatistics2.getClass();
                        return baseballTopPlayersStatistics2.getBattingRbi();
                    case 3:
                        BaseballTopPlayersStatistics baseballTopPlayersStatistics3 = (BaseballTopPlayersStatistics) obj;
                        baseballTopPlayersStatistics3.getClass();
                        return baseballTopPlayersStatistics3.getPitchingInningsPitched();
                    case 4:
                        BaseballTopPlayersStatisticsItem baseballTopPlayersStatisticsItem2 = (BaseballTopPlayersStatisticsItem) obj;
                        baseballTopPlayersStatisticsItem2.getClass();
                        return rei.b(1, baseballTopPlayersStatisticsItem2.getPitchingInningsPitched());
                    case 5:
                        BaseballTopPlayersStatistics baseballTopPlayersStatistics4 = (BaseballTopPlayersStatistics) obj;
                        baseballTopPlayersStatistics4.getClass();
                        return baseballTopPlayersStatistics4.getBattingHits();
                    case 6:
                        BaseballTopPlayersStatistics baseballTopPlayersStatistics5 = (BaseballTopPlayersStatistics) obj;
                        baseballTopPlayersStatistics5.getClass();
                        return baseballTopPlayersStatistics5.getPitchingEarnedRunsAverage();
                    case 7:
                        BaseballTopPlayersStatisticsItem baseballTopPlayersStatisticsItem3 = (BaseballTopPlayersStatisticsItem) obj;
                        baseballTopPlayersStatisticsItem3.getClass();
                        return rei.b(2, baseballTopPlayersStatisticsItem3.getPitchingEarnedRunsAverage());
                    case 8:
                        BaseballTopPlayersStatistics baseballTopPlayersStatistics6 = (BaseballTopPlayersStatistics) obj;
                        baseballTopPlayersStatistics6.getClass();
                        return baseballTopPlayersStatistics6.getPitchingStrikeOuts();
                    case 9:
                        BaseballTopPlayersStatisticsItem baseballTopPlayersStatisticsItem4 = (BaseballTopPlayersStatisticsItem) obj;
                        baseballTopPlayersStatisticsItem4.getClass();
                        return yid.j(baseballTopPlayersStatisticsItem4.getPitchingStrikeOuts());
                    case 10:
                        BaseballTopPlayersStatistics baseballTopPlayersStatistics7 = (BaseballTopPlayersStatistics) obj;
                        baseballTopPlayersStatistics7.getClass();
                        return baseballTopPlayersStatistics7.getPitchingQualityStarts();
                    case 11:
                        BaseballTopPlayersStatisticsItem baseballTopPlayersStatisticsItem5 = (BaseballTopPlayersStatisticsItem) obj;
                        baseballTopPlayersStatisticsItem5.getClass();
                        return yid.j(baseballTopPlayersStatisticsItem5.getPitchingQualityStarts());
                    case 12:
                        BaseballTopPlayersStatistics baseballTopPlayersStatistics8 = (BaseballTopPlayersStatistics) obj;
                        baseballTopPlayersStatistics8.getClass();
                        return baseballTopPlayersStatistics8.getPitchingWhip();
                    case 13:
                        BaseballTopPlayersStatisticsItem baseballTopPlayersStatisticsItem6 = (BaseballTopPlayersStatisticsItem) obj;
                        baseballTopPlayersStatisticsItem6.getClass();
                        return yid.j(baseballTopPlayersStatisticsItem6.getBattingRbi());
                    case 14:
                        BaseballTopPlayersStatisticsItem baseballTopPlayersStatisticsItem7 = (BaseballTopPlayersStatisticsItem) obj;
                        baseballTopPlayersStatisticsItem7.getClass();
                        Double pitchingWhip = baseballTopPlayersStatisticsItem7.getPitchingWhip();
                        yid.k(pitchingWhip);
                        String format = new DecimalFormat(".000", new DecimalFormatSymbols(Locale.US)).format(yid.k(pitchingWhip));
                        format.getClass();
                        return format;
                    case 15:
                        BaseballTopPlayersStatistics baseballTopPlayersStatistics9 = (BaseballTopPlayersStatistics) obj;
                        baseballTopPlayersStatistics9.getClass();
                        return baseballTopPlayersStatistics9.getPitchingWar();
                    case 16:
                        BaseballTopPlayersStatisticsItem baseballTopPlayersStatisticsItem8 = (BaseballTopPlayersStatisticsItem) obj;
                        baseballTopPlayersStatisticsItem8.getClass();
                        return rei.b(1, baseballTopPlayersStatisticsItem8.getPitchingWar());
                    case 17:
                        BaseballTopPlayersStatisticsItem baseballTopPlayersStatisticsItem9 = (BaseballTopPlayersStatisticsItem) obj;
                        baseballTopPlayersStatisticsItem9.getClass();
                        return yid.j(baseballTopPlayersStatisticsItem9.getBattingHits());
                    case 18:
                        BaseballTopPlayersStatistics baseballTopPlayersStatistics10 = (BaseballTopPlayersStatistics) obj;
                        baseballTopPlayersStatistics10.getClass();
                        return baseballTopPlayersStatistics10.getPitchingFieldingIndependentPitching();
                    case 19:
                        BaseballTopPlayersStatisticsItem baseballTopPlayersStatisticsItem10 = (BaseballTopPlayersStatisticsItem) obj;
                        baseballTopPlayersStatisticsItem10.getClass();
                        return rei.b(2, baseballTopPlayersStatisticsItem10.getPitchingFieldingIndependentPitching());
                    case 20:
                        BaseballTopPlayersStatistics baseballTopPlayersStatistics11 = (BaseballTopPlayersStatistics) obj;
                        baseballTopPlayersStatistics11.getClass();
                        return baseballTopPlayersStatistics11.getPitchingOpponentBattingAvg();
                    case 21:
                        BaseballTopPlayersStatisticsItem baseballTopPlayersStatisticsItem11 = (BaseballTopPlayersStatisticsItem) obj;
                        baseballTopPlayersStatisticsItem11.getClass();
                        Double pitchingOpponentBattingAvg = baseballTopPlayersStatisticsItem11.getPitchingOpponentBattingAvg();
                        yid.k(pitchingOpponentBattingAvg);
                        String format2 = new DecimalFormat(".000", new DecimalFormatSymbols(Locale.US)).format(yid.k(pitchingOpponentBattingAvg));
                        format2.getClass();
                        return format2;
                    case 22:
                        BaseballTopPlayersStatistics baseballTopPlayersStatistics12 = (BaseballTopPlayersStatistics) obj;
                        baseballTopPlayersStatistics12.getClass();
                        return baseballTopPlayersStatistics12.getFieldingPutOuts();
                    case 23:
                        BaseballTopPlayersStatisticsItem baseballTopPlayersStatisticsItem12 = (BaseballTopPlayersStatisticsItem) obj;
                        baseballTopPlayersStatisticsItem12.getClass();
                        return yid.j(baseballTopPlayersStatisticsItem12.getFieldingPutOuts());
                    case 24:
                        BaseballTopPlayersStatistics baseballTopPlayersStatistics13 = (BaseballTopPlayersStatistics) obj;
                        baseballTopPlayersStatistics13.getClass();
                        return baseballTopPlayersStatistics13.getBattingStolenBases();
                    case 25:
                        BaseballTopPlayersStatistics baseballTopPlayersStatistics14 = (BaseballTopPlayersStatistics) obj;
                        baseballTopPlayersStatistics14.getClass();
                        return baseballTopPlayersStatistics14.getFieldingAssists();
                    case 26:
                        BaseballTopPlayersStatisticsItem baseballTopPlayersStatisticsItem13 = (BaseballTopPlayersStatisticsItem) obj;
                        baseballTopPlayersStatisticsItem13.getClass();
                        return yid.j(baseballTopPlayersStatisticsItem13.getFieldingAssists());
                    case 27:
                        BaseballTopPlayersStatistics baseballTopPlayersStatistics15 = (BaseballTopPlayersStatistics) obj;
                        baseballTopPlayersStatistics15.getClass();
                        return baseballTopPlayersStatistics15.getFieldingTotalErrors();
                    case 28:
                        BaseballTopPlayersStatisticsItem baseballTopPlayersStatisticsItem14 = (BaseballTopPlayersStatisticsItem) obj;
                        baseballTopPlayersStatisticsItem14.getClass();
                        return yid.j(baseballTopPlayersStatisticsItem14.getFieldingTotalErrors());
                    default:
                        BaseballTopPlayersStatistics baseballTopPlayersStatistics16 = (BaseballTopPlayersStatistics) obj;
                        baseballTopPlayersStatistics16.getClass();
                        return baseballTopPlayersStatistics16.getBattingHomeRuns();
                }
            }
        }, new Function1() { // from class: iab
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                switch (i17) {
                    case 0:
                        BaseballTopPlayersStatistics baseballTopPlayersStatistics = (BaseballTopPlayersStatistics) obj;
                        baseballTopPlayersStatistics.getClass();
                        return baseballTopPlayersStatistics.getPitchingSaves();
                    case 1:
                        BaseballTopPlayersStatisticsItem baseballTopPlayersStatisticsItem = (BaseballTopPlayersStatisticsItem) obj;
                        baseballTopPlayersStatisticsItem.getClass();
                        return yid.j(baseballTopPlayersStatisticsItem.getPitchingSaves());
                    case 2:
                        BaseballTopPlayersStatistics baseballTopPlayersStatistics2 = (BaseballTopPlayersStatistics) obj;
                        baseballTopPlayersStatistics2.getClass();
                        return baseballTopPlayersStatistics2.getBattingRbi();
                    case 3:
                        BaseballTopPlayersStatistics baseballTopPlayersStatistics3 = (BaseballTopPlayersStatistics) obj;
                        baseballTopPlayersStatistics3.getClass();
                        return baseballTopPlayersStatistics3.getPitchingInningsPitched();
                    case 4:
                        BaseballTopPlayersStatisticsItem baseballTopPlayersStatisticsItem2 = (BaseballTopPlayersStatisticsItem) obj;
                        baseballTopPlayersStatisticsItem2.getClass();
                        return rei.b(1, baseballTopPlayersStatisticsItem2.getPitchingInningsPitched());
                    case 5:
                        BaseballTopPlayersStatistics baseballTopPlayersStatistics4 = (BaseballTopPlayersStatistics) obj;
                        baseballTopPlayersStatistics4.getClass();
                        return baseballTopPlayersStatistics4.getBattingHits();
                    case 6:
                        BaseballTopPlayersStatistics baseballTopPlayersStatistics5 = (BaseballTopPlayersStatistics) obj;
                        baseballTopPlayersStatistics5.getClass();
                        return baseballTopPlayersStatistics5.getPitchingEarnedRunsAverage();
                    case 7:
                        BaseballTopPlayersStatisticsItem baseballTopPlayersStatisticsItem3 = (BaseballTopPlayersStatisticsItem) obj;
                        baseballTopPlayersStatisticsItem3.getClass();
                        return rei.b(2, baseballTopPlayersStatisticsItem3.getPitchingEarnedRunsAverage());
                    case 8:
                        BaseballTopPlayersStatistics baseballTopPlayersStatistics6 = (BaseballTopPlayersStatistics) obj;
                        baseballTopPlayersStatistics6.getClass();
                        return baseballTopPlayersStatistics6.getPitchingStrikeOuts();
                    case 9:
                        BaseballTopPlayersStatisticsItem baseballTopPlayersStatisticsItem4 = (BaseballTopPlayersStatisticsItem) obj;
                        baseballTopPlayersStatisticsItem4.getClass();
                        return yid.j(baseballTopPlayersStatisticsItem4.getPitchingStrikeOuts());
                    case 10:
                        BaseballTopPlayersStatistics baseballTopPlayersStatistics7 = (BaseballTopPlayersStatistics) obj;
                        baseballTopPlayersStatistics7.getClass();
                        return baseballTopPlayersStatistics7.getPitchingQualityStarts();
                    case 11:
                        BaseballTopPlayersStatisticsItem baseballTopPlayersStatisticsItem5 = (BaseballTopPlayersStatisticsItem) obj;
                        baseballTopPlayersStatisticsItem5.getClass();
                        return yid.j(baseballTopPlayersStatisticsItem5.getPitchingQualityStarts());
                    case 12:
                        BaseballTopPlayersStatistics baseballTopPlayersStatistics8 = (BaseballTopPlayersStatistics) obj;
                        baseballTopPlayersStatistics8.getClass();
                        return baseballTopPlayersStatistics8.getPitchingWhip();
                    case 13:
                        BaseballTopPlayersStatisticsItem baseballTopPlayersStatisticsItem6 = (BaseballTopPlayersStatisticsItem) obj;
                        baseballTopPlayersStatisticsItem6.getClass();
                        return yid.j(baseballTopPlayersStatisticsItem6.getBattingRbi());
                    case 14:
                        BaseballTopPlayersStatisticsItem baseballTopPlayersStatisticsItem7 = (BaseballTopPlayersStatisticsItem) obj;
                        baseballTopPlayersStatisticsItem7.getClass();
                        Double pitchingWhip = baseballTopPlayersStatisticsItem7.getPitchingWhip();
                        yid.k(pitchingWhip);
                        String format = new DecimalFormat(".000", new DecimalFormatSymbols(Locale.US)).format(yid.k(pitchingWhip));
                        format.getClass();
                        return format;
                    case 15:
                        BaseballTopPlayersStatistics baseballTopPlayersStatistics9 = (BaseballTopPlayersStatistics) obj;
                        baseballTopPlayersStatistics9.getClass();
                        return baseballTopPlayersStatistics9.getPitchingWar();
                    case 16:
                        BaseballTopPlayersStatisticsItem baseballTopPlayersStatisticsItem8 = (BaseballTopPlayersStatisticsItem) obj;
                        baseballTopPlayersStatisticsItem8.getClass();
                        return rei.b(1, baseballTopPlayersStatisticsItem8.getPitchingWar());
                    case 17:
                        BaseballTopPlayersStatisticsItem baseballTopPlayersStatisticsItem9 = (BaseballTopPlayersStatisticsItem) obj;
                        baseballTopPlayersStatisticsItem9.getClass();
                        return yid.j(baseballTopPlayersStatisticsItem9.getBattingHits());
                    case 18:
                        BaseballTopPlayersStatistics baseballTopPlayersStatistics10 = (BaseballTopPlayersStatistics) obj;
                        baseballTopPlayersStatistics10.getClass();
                        return baseballTopPlayersStatistics10.getPitchingFieldingIndependentPitching();
                    case 19:
                        BaseballTopPlayersStatisticsItem baseballTopPlayersStatisticsItem10 = (BaseballTopPlayersStatisticsItem) obj;
                        baseballTopPlayersStatisticsItem10.getClass();
                        return rei.b(2, baseballTopPlayersStatisticsItem10.getPitchingFieldingIndependentPitching());
                    case 20:
                        BaseballTopPlayersStatistics baseballTopPlayersStatistics11 = (BaseballTopPlayersStatistics) obj;
                        baseballTopPlayersStatistics11.getClass();
                        return baseballTopPlayersStatistics11.getPitchingOpponentBattingAvg();
                    case 21:
                        BaseballTopPlayersStatisticsItem baseballTopPlayersStatisticsItem11 = (BaseballTopPlayersStatisticsItem) obj;
                        baseballTopPlayersStatisticsItem11.getClass();
                        Double pitchingOpponentBattingAvg = baseballTopPlayersStatisticsItem11.getPitchingOpponentBattingAvg();
                        yid.k(pitchingOpponentBattingAvg);
                        String format2 = new DecimalFormat(".000", new DecimalFormatSymbols(Locale.US)).format(yid.k(pitchingOpponentBattingAvg));
                        format2.getClass();
                        return format2;
                    case 22:
                        BaseballTopPlayersStatistics baseballTopPlayersStatistics12 = (BaseballTopPlayersStatistics) obj;
                        baseballTopPlayersStatistics12.getClass();
                        return baseballTopPlayersStatistics12.getFieldingPutOuts();
                    case 23:
                        BaseballTopPlayersStatisticsItem baseballTopPlayersStatisticsItem12 = (BaseballTopPlayersStatisticsItem) obj;
                        baseballTopPlayersStatisticsItem12.getClass();
                        return yid.j(baseballTopPlayersStatisticsItem12.getFieldingPutOuts());
                    case 24:
                        BaseballTopPlayersStatistics baseballTopPlayersStatistics13 = (BaseballTopPlayersStatistics) obj;
                        baseballTopPlayersStatistics13.getClass();
                        return baseballTopPlayersStatistics13.getBattingStolenBases();
                    case 25:
                        BaseballTopPlayersStatistics baseballTopPlayersStatistics14 = (BaseballTopPlayersStatistics) obj;
                        baseballTopPlayersStatistics14.getClass();
                        return baseballTopPlayersStatistics14.getFieldingAssists();
                    case 26:
                        BaseballTopPlayersStatisticsItem baseballTopPlayersStatisticsItem13 = (BaseballTopPlayersStatisticsItem) obj;
                        baseballTopPlayersStatisticsItem13.getClass();
                        return yid.j(baseballTopPlayersStatisticsItem13.getFieldingAssists());
                    case 27:
                        BaseballTopPlayersStatistics baseballTopPlayersStatistics15 = (BaseballTopPlayersStatistics) obj;
                        baseballTopPlayersStatistics15.getClass();
                        return baseballTopPlayersStatistics15.getFieldingTotalErrors();
                    case 28:
                        BaseballTopPlayersStatisticsItem baseballTopPlayersStatisticsItem14 = (BaseballTopPlayersStatisticsItem) obj;
                        baseballTopPlayersStatisticsItem14.getClass();
                        return yid.j(baseballTopPlayersStatisticsItem14.getFieldingTotalErrors());
                    default:
                        BaseballTopPlayersStatistics baseballTopPlayersStatistics16 = (BaseballTopPlayersStatistics) obj;
                        baseballTopPlayersStatistics16.getClass();
                        return baseballTopPlayersStatistics16.getBattingHomeRuns();
                }
            }
        });
        final int i18 = 10;
        final int i19 = 11;
        kab kabVar18 = new kab("PITCHING_QUALITY_STARTS", 17, wj1Var2, R.string.baseball_quality_starts, new Function1() { // from class: iab
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                switch (i18) {
                    case 0:
                        BaseballTopPlayersStatistics baseballTopPlayersStatistics = (BaseballTopPlayersStatistics) obj;
                        baseballTopPlayersStatistics.getClass();
                        return baseballTopPlayersStatistics.getPitchingSaves();
                    case 1:
                        BaseballTopPlayersStatisticsItem baseballTopPlayersStatisticsItem = (BaseballTopPlayersStatisticsItem) obj;
                        baseballTopPlayersStatisticsItem.getClass();
                        return yid.j(baseballTopPlayersStatisticsItem.getPitchingSaves());
                    case 2:
                        BaseballTopPlayersStatistics baseballTopPlayersStatistics2 = (BaseballTopPlayersStatistics) obj;
                        baseballTopPlayersStatistics2.getClass();
                        return baseballTopPlayersStatistics2.getBattingRbi();
                    case 3:
                        BaseballTopPlayersStatistics baseballTopPlayersStatistics3 = (BaseballTopPlayersStatistics) obj;
                        baseballTopPlayersStatistics3.getClass();
                        return baseballTopPlayersStatistics3.getPitchingInningsPitched();
                    case 4:
                        BaseballTopPlayersStatisticsItem baseballTopPlayersStatisticsItem2 = (BaseballTopPlayersStatisticsItem) obj;
                        baseballTopPlayersStatisticsItem2.getClass();
                        return rei.b(1, baseballTopPlayersStatisticsItem2.getPitchingInningsPitched());
                    case 5:
                        BaseballTopPlayersStatistics baseballTopPlayersStatistics4 = (BaseballTopPlayersStatistics) obj;
                        baseballTopPlayersStatistics4.getClass();
                        return baseballTopPlayersStatistics4.getBattingHits();
                    case 6:
                        BaseballTopPlayersStatistics baseballTopPlayersStatistics5 = (BaseballTopPlayersStatistics) obj;
                        baseballTopPlayersStatistics5.getClass();
                        return baseballTopPlayersStatistics5.getPitchingEarnedRunsAverage();
                    case 7:
                        BaseballTopPlayersStatisticsItem baseballTopPlayersStatisticsItem3 = (BaseballTopPlayersStatisticsItem) obj;
                        baseballTopPlayersStatisticsItem3.getClass();
                        return rei.b(2, baseballTopPlayersStatisticsItem3.getPitchingEarnedRunsAverage());
                    case 8:
                        BaseballTopPlayersStatistics baseballTopPlayersStatistics6 = (BaseballTopPlayersStatistics) obj;
                        baseballTopPlayersStatistics6.getClass();
                        return baseballTopPlayersStatistics6.getPitchingStrikeOuts();
                    case 9:
                        BaseballTopPlayersStatisticsItem baseballTopPlayersStatisticsItem4 = (BaseballTopPlayersStatisticsItem) obj;
                        baseballTopPlayersStatisticsItem4.getClass();
                        return yid.j(baseballTopPlayersStatisticsItem4.getPitchingStrikeOuts());
                    case 10:
                        BaseballTopPlayersStatistics baseballTopPlayersStatistics7 = (BaseballTopPlayersStatistics) obj;
                        baseballTopPlayersStatistics7.getClass();
                        return baseballTopPlayersStatistics7.getPitchingQualityStarts();
                    case 11:
                        BaseballTopPlayersStatisticsItem baseballTopPlayersStatisticsItem5 = (BaseballTopPlayersStatisticsItem) obj;
                        baseballTopPlayersStatisticsItem5.getClass();
                        return yid.j(baseballTopPlayersStatisticsItem5.getPitchingQualityStarts());
                    case 12:
                        BaseballTopPlayersStatistics baseballTopPlayersStatistics8 = (BaseballTopPlayersStatistics) obj;
                        baseballTopPlayersStatistics8.getClass();
                        return baseballTopPlayersStatistics8.getPitchingWhip();
                    case 13:
                        BaseballTopPlayersStatisticsItem baseballTopPlayersStatisticsItem6 = (BaseballTopPlayersStatisticsItem) obj;
                        baseballTopPlayersStatisticsItem6.getClass();
                        return yid.j(baseballTopPlayersStatisticsItem6.getBattingRbi());
                    case 14:
                        BaseballTopPlayersStatisticsItem baseballTopPlayersStatisticsItem7 = (BaseballTopPlayersStatisticsItem) obj;
                        baseballTopPlayersStatisticsItem7.getClass();
                        Double pitchingWhip = baseballTopPlayersStatisticsItem7.getPitchingWhip();
                        yid.k(pitchingWhip);
                        String format = new DecimalFormat(".000", new DecimalFormatSymbols(Locale.US)).format(yid.k(pitchingWhip));
                        format.getClass();
                        return format;
                    case 15:
                        BaseballTopPlayersStatistics baseballTopPlayersStatistics9 = (BaseballTopPlayersStatistics) obj;
                        baseballTopPlayersStatistics9.getClass();
                        return baseballTopPlayersStatistics9.getPitchingWar();
                    case 16:
                        BaseballTopPlayersStatisticsItem baseballTopPlayersStatisticsItem8 = (BaseballTopPlayersStatisticsItem) obj;
                        baseballTopPlayersStatisticsItem8.getClass();
                        return rei.b(1, baseballTopPlayersStatisticsItem8.getPitchingWar());
                    case 17:
                        BaseballTopPlayersStatisticsItem baseballTopPlayersStatisticsItem9 = (BaseballTopPlayersStatisticsItem) obj;
                        baseballTopPlayersStatisticsItem9.getClass();
                        return yid.j(baseballTopPlayersStatisticsItem9.getBattingHits());
                    case 18:
                        BaseballTopPlayersStatistics baseballTopPlayersStatistics10 = (BaseballTopPlayersStatistics) obj;
                        baseballTopPlayersStatistics10.getClass();
                        return baseballTopPlayersStatistics10.getPitchingFieldingIndependentPitching();
                    case 19:
                        BaseballTopPlayersStatisticsItem baseballTopPlayersStatisticsItem10 = (BaseballTopPlayersStatisticsItem) obj;
                        baseballTopPlayersStatisticsItem10.getClass();
                        return rei.b(2, baseballTopPlayersStatisticsItem10.getPitchingFieldingIndependentPitching());
                    case 20:
                        BaseballTopPlayersStatistics baseballTopPlayersStatistics11 = (BaseballTopPlayersStatistics) obj;
                        baseballTopPlayersStatistics11.getClass();
                        return baseballTopPlayersStatistics11.getPitchingOpponentBattingAvg();
                    case 21:
                        BaseballTopPlayersStatisticsItem baseballTopPlayersStatisticsItem11 = (BaseballTopPlayersStatisticsItem) obj;
                        baseballTopPlayersStatisticsItem11.getClass();
                        Double pitchingOpponentBattingAvg = baseballTopPlayersStatisticsItem11.getPitchingOpponentBattingAvg();
                        yid.k(pitchingOpponentBattingAvg);
                        String format2 = new DecimalFormat(".000", new DecimalFormatSymbols(Locale.US)).format(yid.k(pitchingOpponentBattingAvg));
                        format2.getClass();
                        return format2;
                    case 22:
                        BaseballTopPlayersStatistics baseballTopPlayersStatistics12 = (BaseballTopPlayersStatistics) obj;
                        baseballTopPlayersStatistics12.getClass();
                        return baseballTopPlayersStatistics12.getFieldingPutOuts();
                    case 23:
                        BaseballTopPlayersStatisticsItem baseballTopPlayersStatisticsItem12 = (BaseballTopPlayersStatisticsItem) obj;
                        baseballTopPlayersStatisticsItem12.getClass();
                        return yid.j(baseballTopPlayersStatisticsItem12.getFieldingPutOuts());
                    case 24:
                        BaseballTopPlayersStatistics baseballTopPlayersStatistics13 = (BaseballTopPlayersStatistics) obj;
                        baseballTopPlayersStatistics13.getClass();
                        return baseballTopPlayersStatistics13.getBattingStolenBases();
                    case 25:
                        BaseballTopPlayersStatistics baseballTopPlayersStatistics14 = (BaseballTopPlayersStatistics) obj;
                        baseballTopPlayersStatistics14.getClass();
                        return baseballTopPlayersStatistics14.getFieldingAssists();
                    case 26:
                        BaseballTopPlayersStatisticsItem baseballTopPlayersStatisticsItem13 = (BaseballTopPlayersStatisticsItem) obj;
                        baseballTopPlayersStatisticsItem13.getClass();
                        return yid.j(baseballTopPlayersStatisticsItem13.getFieldingAssists());
                    case 27:
                        BaseballTopPlayersStatistics baseballTopPlayersStatistics15 = (BaseballTopPlayersStatistics) obj;
                        baseballTopPlayersStatistics15.getClass();
                        return baseballTopPlayersStatistics15.getFieldingTotalErrors();
                    case 28:
                        BaseballTopPlayersStatisticsItem baseballTopPlayersStatisticsItem14 = (BaseballTopPlayersStatisticsItem) obj;
                        baseballTopPlayersStatisticsItem14.getClass();
                        return yid.j(baseballTopPlayersStatisticsItem14.getFieldingTotalErrors());
                    default:
                        BaseballTopPlayersStatistics baseballTopPlayersStatistics16 = (BaseballTopPlayersStatistics) obj;
                        baseballTopPlayersStatistics16.getClass();
                        return baseballTopPlayersStatistics16.getBattingHomeRuns();
                }
            }
        }, new Function1() { // from class: iab
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                switch (i19) {
                    case 0:
                        BaseballTopPlayersStatistics baseballTopPlayersStatistics = (BaseballTopPlayersStatistics) obj;
                        baseballTopPlayersStatistics.getClass();
                        return baseballTopPlayersStatistics.getPitchingSaves();
                    case 1:
                        BaseballTopPlayersStatisticsItem baseballTopPlayersStatisticsItem = (BaseballTopPlayersStatisticsItem) obj;
                        baseballTopPlayersStatisticsItem.getClass();
                        return yid.j(baseballTopPlayersStatisticsItem.getPitchingSaves());
                    case 2:
                        BaseballTopPlayersStatistics baseballTopPlayersStatistics2 = (BaseballTopPlayersStatistics) obj;
                        baseballTopPlayersStatistics2.getClass();
                        return baseballTopPlayersStatistics2.getBattingRbi();
                    case 3:
                        BaseballTopPlayersStatistics baseballTopPlayersStatistics3 = (BaseballTopPlayersStatistics) obj;
                        baseballTopPlayersStatistics3.getClass();
                        return baseballTopPlayersStatistics3.getPitchingInningsPitched();
                    case 4:
                        BaseballTopPlayersStatisticsItem baseballTopPlayersStatisticsItem2 = (BaseballTopPlayersStatisticsItem) obj;
                        baseballTopPlayersStatisticsItem2.getClass();
                        return rei.b(1, baseballTopPlayersStatisticsItem2.getPitchingInningsPitched());
                    case 5:
                        BaseballTopPlayersStatistics baseballTopPlayersStatistics4 = (BaseballTopPlayersStatistics) obj;
                        baseballTopPlayersStatistics4.getClass();
                        return baseballTopPlayersStatistics4.getBattingHits();
                    case 6:
                        BaseballTopPlayersStatistics baseballTopPlayersStatistics5 = (BaseballTopPlayersStatistics) obj;
                        baseballTopPlayersStatistics5.getClass();
                        return baseballTopPlayersStatistics5.getPitchingEarnedRunsAverage();
                    case 7:
                        BaseballTopPlayersStatisticsItem baseballTopPlayersStatisticsItem3 = (BaseballTopPlayersStatisticsItem) obj;
                        baseballTopPlayersStatisticsItem3.getClass();
                        return rei.b(2, baseballTopPlayersStatisticsItem3.getPitchingEarnedRunsAverage());
                    case 8:
                        BaseballTopPlayersStatistics baseballTopPlayersStatistics6 = (BaseballTopPlayersStatistics) obj;
                        baseballTopPlayersStatistics6.getClass();
                        return baseballTopPlayersStatistics6.getPitchingStrikeOuts();
                    case 9:
                        BaseballTopPlayersStatisticsItem baseballTopPlayersStatisticsItem4 = (BaseballTopPlayersStatisticsItem) obj;
                        baseballTopPlayersStatisticsItem4.getClass();
                        return yid.j(baseballTopPlayersStatisticsItem4.getPitchingStrikeOuts());
                    case 10:
                        BaseballTopPlayersStatistics baseballTopPlayersStatistics7 = (BaseballTopPlayersStatistics) obj;
                        baseballTopPlayersStatistics7.getClass();
                        return baseballTopPlayersStatistics7.getPitchingQualityStarts();
                    case 11:
                        BaseballTopPlayersStatisticsItem baseballTopPlayersStatisticsItem5 = (BaseballTopPlayersStatisticsItem) obj;
                        baseballTopPlayersStatisticsItem5.getClass();
                        return yid.j(baseballTopPlayersStatisticsItem5.getPitchingQualityStarts());
                    case 12:
                        BaseballTopPlayersStatistics baseballTopPlayersStatistics8 = (BaseballTopPlayersStatistics) obj;
                        baseballTopPlayersStatistics8.getClass();
                        return baseballTopPlayersStatistics8.getPitchingWhip();
                    case 13:
                        BaseballTopPlayersStatisticsItem baseballTopPlayersStatisticsItem6 = (BaseballTopPlayersStatisticsItem) obj;
                        baseballTopPlayersStatisticsItem6.getClass();
                        return yid.j(baseballTopPlayersStatisticsItem6.getBattingRbi());
                    case 14:
                        BaseballTopPlayersStatisticsItem baseballTopPlayersStatisticsItem7 = (BaseballTopPlayersStatisticsItem) obj;
                        baseballTopPlayersStatisticsItem7.getClass();
                        Double pitchingWhip = baseballTopPlayersStatisticsItem7.getPitchingWhip();
                        yid.k(pitchingWhip);
                        String format = new DecimalFormat(".000", new DecimalFormatSymbols(Locale.US)).format(yid.k(pitchingWhip));
                        format.getClass();
                        return format;
                    case 15:
                        BaseballTopPlayersStatistics baseballTopPlayersStatistics9 = (BaseballTopPlayersStatistics) obj;
                        baseballTopPlayersStatistics9.getClass();
                        return baseballTopPlayersStatistics9.getPitchingWar();
                    case 16:
                        BaseballTopPlayersStatisticsItem baseballTopPlayersStatisticsItem8 = (BaseballTopPlayersStatisticsItem) obj;
                        baseballTopPlayersStatisticsItem8.getClass();
                        return rei.b(1, baseballTopPlayersStatisticsItem8.getPitchingWar());
                    case 17:
                        BaseballTopPlayersStatisticsItem baseballTopPlayersStatisticsItem9 = (BaseballTopPlayersStatisticsItem) obj;
                        baseballTopPlayersStatisticsItem9.getClass();
                        return yid.j(baseballTopPlayersStatisticsItem9.getBattingHits());
                    case 18:
                        BaseballTopPlayersStatistics baseballTopPlayersStatistics10 = (BaseballTopPlayersStatistics) obj;
                        baseballTopPlayersStatistics10.getClass();
                        return baseballTopPlayersStatistics10.getPitchingFieldingIndependentPitching();
                    case 19:
                        BaseballTopPlayersStatisticsItem baseballTopPlayersStatisticsItem10 = (BaseballTopPlayersStatisticsItem) obj;
                        baseballTopPlayersStatisticsItem10.getClass();
                        return rei.b(2, baseballTopPlayersStatisticsItem10.getPitchingFieldingIndependentPitching());
                    case 20:
                        BaseballTopPlayersStatistics baseballTopPlayersStatistics11 = (BaseballTopPlayersStatistics) obj;
                        baseballTopPlayersStatistics11.getClass();
                        return baseballTopPlayersStatistics11.getPitchingOpponentBattingAvg();
                    case 21:
                        BaseballTopPlayersStatisticsItem baseballTopPlayersStatisticsItem11 = (BaseballTopPlayersStatisticsItem) obj;
                        baseballTopPlayersStatisticsItem11.getClass();
                        Double pitchingOpponentBattingAvg = baseballTopPlayersStatisticsItem11.getPitchingOpponentBattingAvg();
                        yid.k(pitchingOpponentBattingAvg);
                        String format2 = new DecimalFormat(".000", new DecimalFormatSymbols(Locale.US)).format(yid.k(pitchingOpponentBattingAvg));
                        format2.getClass();
                        return format2;
                    case 22:
                        BaseballTopPlayersStatistics baseballTopPlayersStatistics12 = (BaseballTopPlayersStatistics) obj;
                        baseballTopPlayersStatistics12.getClass();
                        return baseballTopPlayersStatistics12.getFieldingPutOuts();
                    case 23:
                        BaseballTopPlayersStatisticsItem baseballTopPlayersStatisticsItem12 = (BaseballTopPlayersStatisticsItem) obj;
                        baseballTopPlayersStatisticsItem12.getClass();
                        return yid.j(baseballTopPlayersStatisticsItem12.getFieldingPutOuts());
                    case 24:
                        BaseballTopPlayersStatistics baseballTopPlayersStatistics13 = (BaseballTopPlayersStatistics) obj;
                        baseballTopPlayersStatistics13.getClass();
                        return baseballTopPlayersStatistics13.getBattingStolenBases();
                    case 25:
                        BaseballTopPlayersStatistics baseballTopPlayersStatistics14 = (BaseballTopPlayersStatistics) obj;
                        baseballTopPlayersStatistics14.getClass();
                        return baseballTopPlayersStatistics14.getFieldingAssists();
                    case 26:
                        BaseballTopPlayersStatisticsItem baseballTopPlayersStatisticsItem13 = (BaseballTopPlayersStatisticsItem) obj;
                        baseballTopPlayersStatisticsItem13.getClass();
                        return yid.j(baseballTopPlayersStatisticsItem13.getFieldingAssists());
                    case 27:
                        BaseballTopPlayersStatistics baseballTopPlayersStatistics15 = (BaseballTopPlayersStatistics) obj;
                        baseballTopPlayersStatistics15.getClass();
                        return baseballTopPlayersStatistics15.getFieldingTotalErrors();
                    case 28:
                        BaseballTopPlayersStatisticsItem baseballTopPlayersStatisticsItem14 = (BaseballTopPlayersStatisticsItem) obj;
                        baseballTopPlayersStatisticsItem14.getClass();
                        return yid.j(baseballTopPlayersStatisticsItem14.getFieldingTotalErrors());
                    default:
                        BaseballTopPlayersStatistics baseballTopPlayersStatistics16 = (BaseballTopPlayersStatistics) obj;
                        baseballTopPlayersStatistics16.getClass();
                        return baseballTopPlayersStatistics16.getBattingHomeRuns();
                }
            }
        });
        final int i20 = 14;
        kab kabVar19 = new kab("PITCHING_WHIP", 18, wj1Var2, R.string.baseball_walks_hits_per_inning_pitched, new Function1() { // from class: iab
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                switch (i10) {
                    case 0:
                        BaseballTopPlayersStatistics baseballTopPlayersStatistics = (BaseballTopPlayersStatistics) obj;
                        baseballTopPlayersStatistics.getClass();
                        return baseballTopPlayersStatistics.getPitchingSaves();
                    case 1:
                        BaseballTopPlayersStatisticsItem baseballTopPlayersStatisticsItem = (BaseballTopPlayersStatisticsItem) obj;
                        baseballTopPlayersStatisticsItem.getClass();
                        return yid.j(baseballTopPlayersStatisticsItem.getPitchingSaves());
                    case 2:
                        BaseballTopPlayersStatistics baseballTopPlayersStatistics2 = (BaseballTopPlayersStatistics) obj;
                        baseballTopPlayersStatistics2.getClass();
                        return baseballTopPlayersStatistics2.getBattingRbi();
                    case 3:
                        BaseballTopPlayersStatistics baseballTopPlayersStatistics3 = (BaseballTopPlayersStatistics) obj;
                        baseballTopPlayersStatistics3.getClass();
                        return baseballTopPlayersStatistics3.getPitchingInningsPitched();
                    case 4:
                        BaseballTopPlayersStatisticsItem baseballTopPlayersStatisticsItem2 = (BaseballTopPlayersStatisticsItem) obj;
                        baseballTopPlayersStatisticsItem2.getClass();
                        return rei.b(1, baseballTopPlayersStatisticsItem2.getPitchingInningsPitched());
                    case 5:
                        BaseballTopPlayersStatistics baseballTopPlayersStatistics4 = (BaseballTopPlayersStatistics) obj;
                        baseballTopPlayersStatistics4.getClass();
                        return baseballTopPlayersStatistics4.getBattingHits();
                    case 6:
                        BaseballTopPlayersStatistics baseballTopPlayersStatistics5 = (BaseballTopPlayersStatistics) obj;
                        baseballTopPlayersStatistics5.getClass();
                        return baseballTopPlayersStatistics5.getPitchingEarnedRunsAverage();
                    case 7:
                        BaseballTopPlayersStatisticsItem baseballTopPlayersStatisticsItem3 = (BaseballTopPlayersStatisticsItem) obj;
                        baseballTopPlayersStatisticsItem3.getClass();
                        return rei.b(2, baseballTopPlayersStatisticsItem3.getPitchingEarnedRunsAverage());
                    case 8:
                        BaseballTopPlayersStatistics baseballTopPlayersStatistics6 = (BaseballTopPlayersStatistics) obj;
                        baseballTopPlayersStatistics6.getClass();
                        return baseballTopPlayersStatistics6.getPitchingStrikeOuts();
                    case 9:
                        BaseballTopPlayersStatisticsItem baseballTopPlayersStatisticsItem4 = (BaseballTopPlayersStatisticsItem) obj;
                        baseballTopPlayersStatisticsItem4.getClass();
                        return yid.j(baseballTopPlayersStatisticsItem4.getPitchingStrikeOuts());
                    case 10:
                        BaseballTopPlayersStatistics baseballTopPlayersStatistics7 = (BaseballTopPlayersStatistics) obj;
                        baseballTopPlayersStatistics7.getClass();
                        return baseballTopPlayersStatistics7.getPitchingQualityStarts();
                    case 11:
                        BaseballTopPlayersStatisticsItem baseballTopPlayersStatisticsItem5 = (BaseballTopPlayersStatisticsItem) obj;
                        baseballTopPlayersStatisticsItem5.getClass();
                        return yid.j(baseballTopPlayersStatisticsItem5.getPitchingQualityStarts());
                    case 12:
                        BaseballTopPlayersStatistics baseballTopPlayersStatistics8 = (BaseballTopPlayersStatistics) obj;
                        baseballTopPlayersStatistics8.getClass();
                        return baseballTopPlayersStatistics8.getPitchingWhip();
                    case 13:
                        BaseballTopPlayersStatisticsItem baseballTopPlayersStatisticsItem6 = (BaseballTopPlayersStatisticsItem) obj;
                        baseballTopPlayersStatisticsItem6.getClass();
                        return yid.j(baseballTopPlayersStatisticsItem6.getBattingRbi());
                    case 14:
                        BaseballTopPlayersStatisticsItem baseballTopPlayersStatisticsItem7 = (BaseballTopPlayersStatisticsItem) obj;
                        baseballTopPlayersStatisticsItem7.getClass();
                        Double pitchingWhip = baseballTopPlayersStatisticsItem7.getPitchingWhip();
                        yid.k(pitchingWhip);
                        String format = new DecimalFormat(".000", new DecimalFormatSymbols(Locale.US)).format(yid.k(pitchingWhip));
                        format.getClass();
                        return format;
                    case 15:
                        BaseballTopPlayersStatistics baseballTopPlayersStatistics9 = (BaseballTopPlayersStatistics) obj;
                        baseballTopPlayersStatistics9.getClass();
                        return baseballTopPlayersStatistics9.getPitchingWar();
                    case 16:
                        BaseballTopPlayersStatisticsItem baseballTopPlayersStatisticsItem8 = (BaseballTopPlayersStatisticsItem) obj;
                        baseballTopPlayersStatisticsItem8.getClass();
                        return rei.b(1, baseballTopPlayersStatisticsItem8.getPitchingWar());
                    case 17:
                        BaseballTopPlayersStatisticsItem baseballTopPlayersStatisticsItem9 = (BaseballTopPlayersStatisticsItem) obj;
                        baseballTopPlayersStatisticsItem9.getClass();
                        return yid.j(baseballTopPlayersStatisticsItem9.getBattingHits());
                    case 18:
                        BaseballTopPlayersStatistics baseballTopPlayersStatistics10 = (BaseballTopPlayersStatistics) obj;
                        baseballTopPlayersStatistics10.getClass();
                        return baseballTopPlayersStatistics10.getPitchingFieldingIndependentPitching();
                    case 19:
                        BaseballTopPlayersStatisticsItem baseballTopPlayersStatisticsItem10 = (BaseballTopPlayersStatisticsItem) obj;
                        baseballTopPlayersStatisticsItem10.getClass();
                        return rei.b(2, baseballTopPlayersStatisticsItem10.getPitchingFieldingIndependentPitching());
                    case 20:
                        BaseballTopPlayersStatistics baseballTopPlayersStatistics11 = (BaseballTopPlayersStatistics) obj;
                        baseballTopPlayersStatistics11.getClass();
                        return baseballTopPlayersStatistics11.getPitchingOpponentBattingAvg();
                    case 21:
                        BaseballTopPlayersStatisticsItem baseballTopPlayersStatisticsItem11 = (BaseballTopPlayersStatisticsItem) obj;
                        baseballTopPlayersStatisticsItem11.getClass();
                        Double pitchingOpponentBattingAvg = baseballTopPlayersStatisticsItem11.getPitchingOpponentBattingAvg();
                        yid.k(pitchingOpponentBattingAvg);
                        String format2 = new DecimalFormat(".000", new DecimalFormatSymbols(Locale.US)).format(yid.k(pitchingOpponentBattingAvg));
                        format2.getClass();
                        return format2;
                    case 22:
                        BaseballTopPlayersStatistics baseballTopPlayersStatistics12 = (BaseballTopPlayersStatistics) obj;
                        baseballTopPlayersStatistics12.getClass();
                        return baseballTopPlayersStatistics12.getFieldingPutOuts();
                    case 23:
                        BaseballTopPlayersStatisticsItem baseballTopPlayersStatisticsItem12 = (BaseballTopPlayersStatisticsItem) obj;
                        baseballTopPlayersStatisticsItem12.getClass();
                        return yid.j(baseballTopPlayersStatisticsItem12.getFieldingPutOuts());
                    case 24:
                        BaseballTopPlayersStatistics baseballTopPlayersStatistics13 = (BaseballTopPlayersStatistics) obj;
                        baseballTopPlayersStatistics13.getClass();
                        return baseballTopPlayersStatistics13.getBattingStolenBases();
                    case 25:
                        BaseballTopPlayersStatistics baseballTopPlayersStatistics14 = (BaseballTopPlayersStatistics) obj;
                        baseballTopPlayersStatistics14.getClass();
                        return baseballTopPlayersStatistics14.getFieldingAssists();
                    case 26:
                        BaseballTopPlayersStatisticsItem baseballTopPlayersStatisticsItem13 = (BaseballTopPlayersStatisticsItem) obj;
                        baseballTopPlayersStatisticsItem13.getClass();
                        return yid.j(baseballTopPlayersStatisticsItem13.getFieldingAssists());
                    case 27:
                        BaseballTopPlayersStatistics baseballTopPlayersStatistics15 = (BaseballTopPlayersStatistics) obj;
                        baseballTopPlayersStatistics15.getClass();
                        return baseballTopPlayersStatistics15.getFieldingTotalErrors();
                    case 28:
                        BaseballTopPlayersStatisticsItem baseballTopPlayersStatisticsItem14 = (BaseballTopPlayersStatisticsItem) obj;
                        baseballTopPlayersStatisticsItem14.getClass();
                        return yid.j(baseballTopPlayersStatisticsItem14.getFieldingTotalErrors());
                    default:
                        BaseballTopPlayersStatistics baseballTopPlayersStatistics16 = (BaseballTopPlayersStatistics) obj;
                        baseballTopPlayersStatistics16.getClass();
                        return baseballTopPlayersStatistics16.getBattingHomeRuns();
                }
            }
        }, new Function1() { // from class: iab
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                switch (i20) {
                    case 0:
                        BaseballTopPlayersStatistics baseballTopPlayersStatistics = (BaseballTopPlayersStatistics) obj;
                        baseballTopPlayersStatistics.getClass();
                        return baseballTopPlayersStatistics.getPitchingSaves();
                    case 1:
                        BaseballTopPlayersStatisticsItem baseballTopPlayersStatisticsItem = (BaseballTopPlayersStatisticsItem) obj;
                        baseballTopPlayersStatisticsItem.getClass();
                        return yid.j(baseballTopPlayersStatisticsItem.getPitchingSaves());
                    case 2:
                        BaseballTopPlayersStatistics baseballTopPlayersStatistics2 = (BaseballTopPlayersStatistics) obj;
                        baseballTopPlayersStatistics2.getClass();
                        return baseballTopPlayersStatistics2.getBattingRbi();
                    case 3:
                        BaseballTopPlayersStatistics baseballTopPlayersStatistics3 = (BaseballTopPlayersStatistics) obj;
                        baseballTopPlayersStatistics3.getClass();
                        return baseballTopPlayersStatistics3.getPitchingInningsPitched();
                    case 4:
                        BaseballTopPlayersStatisticsItem baseballTopPlayersStatisticsItem2 = (BaseballTopPlayersStatisticsItem) obj;
                        baseballTopPlayersStatisticsItem2.getClass();
                        return rei.b(1, baseballTopPlayersStatisticsItem2.getPitchingInningsPitched());
                    case 5:
                        BaseballTopPlayersStatistics baseballTopPlayersStatistics4 = (BaseballTopPlayersStatistics) obj;
                        baseballTopPlayersStatistics4.getClass();
                        return baseballTopPlayersStatistics4.getBattingHits();
                    case 6:
                        BaseballTopPlayersStatistics baseballTopPlayersStatistics5 = (BaseballTopPlayersStatistics) obj;
                        baseballTopPlayersStatistics5.getClass();
                        return baseballTopPlayersStatistics5.getPitchingEarnedRunsAverage();
                    case 7:
                        BaseballTopPlayersStatisticsItem baseballTopPlayersStatisticsItem3 = (BaseballTopPlayersStatisticsItem) obj;
                        baseballTopPlayersStatisticsItem3.getClass();
                        return rei.b(2, baseballTopPlayersStatisticsItem3.getPitchingEarnedRunsAverage());
                    case 8:
                        BaseballTopPlayersStatistics baseballTopPlayersStatistics6 = (BaseballTopPlayersStatistics) obj;
                        baseballTopPlayersStatistics6.getClass();
                        return baseballTopPlayersStatistics6.getPitchingStrikeOuts();
                    case 9:
                        BaseballTopPlayersStatisticsItem baseballTopPlayersStatisticsItem4 = (BaseballTopPlayersStatisticsItem) obj;
                        baseballTopPlayersStatisticsItem4.getClass();
                        return yid.j(baseballTopPlayersStatisticsItem4.getPitchingStrikeOuts());
                    case 10:
                        BaseballTopPlayersStatistics baseballTopPlayersStatistics7 = (BaseballTopPlayersStatistics) obj;
                        baseballTopPlayersStatistics7.getClass();
                        return baseballTopPlayersStatistics7.getPitchingQualityStarts();
                    case 11:
                        BaseballTopPlayersStatisticsItem baseballTopPlayersStatisticsItem5 = (BaseballTopPlayersStatisticsItem) obj;
                        baseballTopPlayersStatisticsItem5.getClass();
                        return yid.j(baseballTopPlayersStatisticsItem5.getPitchingQualityStarts());
                    case 12:
                        BaseballTopPlayersStatistics baseballTopPlayersStatistics8 = (BaseballTopPlayersStatistics) obj;
                        baseballTopPlayersStatistics8.getClass();
                        return baseballTopPlayersStatistics8.getPitchingWhip();
                    case 13:
                        BaseballTopPlayersStatisticsItem baseballTopPlayersStatisticsItem6 = (BaseballTopPlayersStatisticsItem) obj;
                        baseballTopPlayersStatisticsItem6.getClass();
                        return yid.j(baseballTopPlayersStatisticsItem6.getBattingRbi());
                    case 14:
                        BaseballTopPlayersStatisticsItem baseballTopPlayersStatisticsItem7 = (BaseballTopPlayersStatisticsItem) obj;
                        baseballTopPlayersStatisticsItem7.getClass();
                        Double pitchingWhip = baseballTopPlayersStatisticsItem7.getPitchingWhip();
                        yid.k(pitchingWhip);
                        String format = new DecimalFormat(".000", new DecimalFormatSymbols(Locale.US)).format(yid.k(pitchingWhip));
                        format.getClass();
                        return format;
                    case 15:
                        BaseballTopPlayersStatistics baseballTopPlayersStatistics9 = (BaseballTopPlayersStatistics) obj;
                        baseballTopPlayersStatistics9.getClass();
                        return baseballTopPlayersStatistics9.getPitchingWar();
                    case 16:
                        BaseballTopPlayersStatisticsItem baseballTopPlayersStatisticsItem8 = (BaseballTopPlayersStatisticsItem) obj;
                        baseballTopPlayersStatisticsItem8.getClass();
                        return rei.b(1, baseballTopPlayersStatisticsItem8.getPitchingWar());
                    case 17:
                        BaseballTopPlayersStatisticsItem baseballTopPlayersStatisticsItem9 = (BaseballTopPlayersStatisticsItem) obj;
                        baseballTopPlayersStatisticsItem9.getClass();
                        return yid.j(baseballTopPlayersStatisticsItem9.getBattingHits());
                    case 18:
                        BaseballTopPlayersStatistics baseballTopPlayersStatistics10 = (BaseballTopPlayersStatistics) obj;
                        baseballTopPlayersStatistics10.getClass();
                        return baseballTopPlayersStatistics10.getPitchingFieldingIndependentPitching();
                    case 19:
                        BaseballTopPlayersStatisticsItem baseballTopPlayersStatisticsItem10 = (BaseballTopPlayersStatisticsItem) obj;
                        baseballTopPlayersStatisticsItem10.getClass();
                        return rei.b(2, baseballTopPlayersStatisticsItem10.getPitchingFieldingIndependentPitching());
                    case 20:
                        BaseballTopPlayersStatistics baseballTopPlayersStatistics11 = (BaseballTopPlayersStatistics) obj;
                        baseballTopPlayersStatistics11.getClass();
                        return baseballTopPlayersStatistics11.getPitchingOpponentBattingAvg();
                    case 21:
                        BaseballTopPlayersStatisticsItem baseballTopPlayersStatisticsItem11 = (BaseballTopPlayersStatisticsItem) obj;
                        baseballTopPlayersStatisticsItem11.getClass();
                        Double pitchingOpponentBattingAvg = baseballTopPlayersStatisticsItem11.getPitchingOpponentBattingAvg();
                        yid.k(pitchingOpponentBattingAvg);
                        String format2 = new DecimalFormat(".000", new DecimalFormatSymbols(Locale.US)).format(yid.k(pitchingOpponentBattingAvg));
                        format2.getClass();
                        return format2;
                    case 22:
                        BaseballTopPlayersStatistics baseballTopPlayersStatistics12 = (BaseballTopPlayersStatistics) obj;
                        baseballTopPlayersStatistics12.getClass();
                        return baseballTopPlayersStatistics12.getFieldingPutOuts();
                    case 23:
                        BaseballTopPlayersStatisticsItem baseballTopPlayersStatisticsItem12 = (BaseballTopPlayersStatisticsItem) obj;
                        baseballTopPlayersStatisticsItem12.getClass();
                        return yid.j(baseballTopPlayersStatisticsItem12.getFieldingPutOuts());
                    case 24:
                        BaseballTopPlayersStatistics baseballTopPlayersStatistics13 = (BaseballTopPlayersStatistics) obj;
                        baseballTopPlayersStatistics13.getClass();
                        return baseballTopPlayersStatistics13.getBattingStolenBases();
                    case 25:
                        BaseballTopPlayersStatistics baseballTopPlayersStatistics14 = (BaseballTopPlayersStatistics) obj;
                        baseballTopPlayersStatistics14.getClass();
                        return baseballTopPlayersStatistics14.getFieldingAssists();
                    case 26:
                        BaseballTopPlayersStatisticsItem baseballTopPlayersStatisticsItem13 = (BaseballTopPlayersStatisticsItem) obj;
                        baseballTopPlayersStatisticsItem13.getClass();
                        return yid.j(baseballTopPlayersStatisticsItem13.getFieldingAssists());
                    case 27:
                        BaseballTopPlayersStatistics baseballTopPlayersStatistics15 = (BaseballTopPlayersStatistics) obj;
                        baseballTopPlayersStatistics15.getClass();
                        return baseballTopPlayersStatistics15.getFieldingTotalErrors();
                    case 28:
                        BaseballTopPlayersStatisticsItem baseballTopPlayersStatisticsItem14 = (BaseballTopPlayersStatisticsItem) obj;
                        baseballTopPlayersStatisticsItem14.getClass();
                        return yid.j(baseballTopPlayersStatisticsItem14.getFieldingTotalErrors());
                    default:
                        BaseballTopPlayersStatistics baseballTopPlayersStatistics16 = (BaseballTopPlayersStatistics) obj;
                        baseballTopPlayersStatistics16.getClass();
                        return baseballTopPlayersStatistics16.getBattingHomeRuns();
                }
            }
        });
        final int i21 = 15;
        final int i22 = 16;
        kab kabVar20 = new kab("PITCHING_WAR", 19, wj1Var2, R.string.baseball_wins_above_replacement, new Function1() { // from class: iab
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                switch (i21) {
                    case 0:
                        BaseballTopPlayersStatistics baseballTopPlayersStatistics = (BaseballTopPlayersStatistics) obj;
                        baseballTopPlayersStatistics.getClass();
                        return baseballTopPlayersStatistics.getPitchingSaves();
                    case 1:
                        BaseballTopPlayersStatisticsItem baseballTopPlayersStatisticsItem = (BaseballTopPlayersStatisticsItem) obj;
                        baseballTopPlayersStatisticsItem.getClass();
                        return yid.j(baseballTopPlayersStatisticsItem.getPitchingSaves());
                    case 2:
                        BaseballTopPlayersStatistics baseballTopPlayersStatistics2 = (BaseballTopPlayersStatistics) obj;
                        baseballTopPlayersStatistics2.getClass();
                        return baseballTopPlayersStatistics2.getBattingRbi();
                    case 3:
                        BaseballTopPlayersStatistics baseballTopPlayersStatistics3 = (BaseballTopPlayersStatistics) obj;
                        baseballTopPlayersStatistics3.getClass();
                        return baseballTopPlayersStatistics3.getPitchingInningsPitched();
                    case 4:
                        BaseballTopPlayersStatisticsItem baseballTopPlayersStatisticsItem2 = (BaseballTopPlayersStatisticsItem) obj;
                        baseballTopPlayersStatisticsItem2.getClass();
                        return rei.b(1, baseballTopPlayersStatisticsItem2.getPitchingInningsPitched());
                    case 5:
                        BaseballTopPlayersStatistics baseballTopPlayersStatistics4 = (BaseballTopPlayersStatistics) obj;
                        baseballTopPlayersStatistics4.getClass();
                        return baseballTopPlayersStatistics4.getBattingHits();
                    case 6:
                        BaseballTopPlayersStatistics baseballTopPlayersStatistics5 = (BaseballTopPlayersStatistics) obj;
                        baseballTopPlayersStatistics5.getClass();
                        return baseballTopPlayersStatistics5.getPitchingEarnedRunsAverage();
                    case 7:
                        BaseballTopPlayersStatisticsItem baseballTopPlayersStatisticsItem3 = (BaseballTopPlayersStatisticsItem) obj;
                        baseballTopPlayersStatisticsItem3.getClass();
                        return rei.b(2, baseballTopPlayersStatisticsItem3.getPitchingEarnedRunsAverage());
                    case 8:
                        BaseballTopPlayersStatistics baseballTopPlayersStatistics6 = (BaseballTopPlayersStatistics) obj;
                        baseballTopPlayersStatistics6.getClass();
                        return baseballTopPlayersStatistics6.getPitchingStrikeOuts();
                    case 9:
                        BaseballTopPlayersStatisticsItem baseballTopPlayersStatisticsItem4 = (BaseballTopPlayersStatisticsItem) obj;
                        baseballTopPlayersStatisticsItem4.getClass();
                        return yid.j(baseballTopPlayersStatisticsItem4.getPitchingStrikeOuts());
                    case 10:
                        BaseballTopPlayersStatistics baseballTopPlayersStatistics7 = (BaseballTopPlayersStatistics) obj;
                        baseballTopPlayersStatistics7.getClass();
                        return baseballTopPlayersStatistics7.getPitchingQualityStarts();
                    case 11:
                        BaseballTopPlayersStatisticsItem baseballTopPlayersStatisticsItem5 = (BaseballTopPlayersStatisticsItem) obj;
                        baseballTopPlayersStatisticsItem5.getClass();
                        return yid.j(baseballTopPlayersStatisticsItem5.getPitchingQualityStarts());
                    case 12:
                        BaseballTopPlayersStatistics baseballTopPlayersStatistics8 = (BaseballTopPlayersStatistics) obj;
                        baseballTopPlayersStatistics8.getClass();
                        return baseballTopPlayersStatistics8.getPitchingWhip();
                    case 13:
                        BaseballTopPlayersStatisticsItem baseballTopPlayersStatisticsItem6 = (BaseballTopPlayersStatisticsItem) obj;
                        baseballTopPlayersStatisticsItem6.getClass();
                        return yid.j(baseballTopPlayersStatisticsItem6.getBattingRbi());
                    case 14:
                        BaseballTopPlayersStatisticsItem baseballTopPlayersStatisticsItem7 = (BaseballTopPlayersStatisticsItem) obj;
                        baseballTopPlayersStatisticsItem7.getClass();
                        Double pitchingWhip = baseballTopPlayersStatisticsItem7.getPitchingWhip();
                        yid.k(pitchingWhip);
                        String format = new DecimalFormat(".000", new DecimalFormatSymbols(Locale.US)).format(yid.k(pitchingWhip));
                        format.getClass();
                        return format;
                    case 15:
                        BaseballTopPlayersStatistics baseballTopPlayersStatistics9 = (BaseballTopPlayersStatistics) obj;
                        baseballTopPlayersStatistics9.getClass();
                        return baseballTopPlayersStatistics9.getPitchingWar();
                    case 16:
                        BaseballTopPlayersStatisticsItem baseballTopPlayersStatisticsItem8 = (BaseballTopPlayersStatisticsItem) obj;
                        baseballTopPlayersStatisticsItem8.getClass();
                        return rei.b(1, baseballTopPlayersStatisticsItem8.getPitchingWar());
                    case 17:
                        BaseballTopPlayersStatisticsItem baseballTopPlayersStatisticsItem9 = (BaseballTopPlayersStatisticsItem) obj;
                        baseballTopPlayersStatisticsItem9.getClass();
                        return yid.j(baseballTopPlayersStatisticsItem9.getBattingHits());
                    case 18:
                        BaseballTopPlayersStatistics baseballTopPlayersStatistics10 = (BaseballTopPlayersStatistics) obj;
                        baseballTopPlayersStatistics10.getClass();
                        return baseballTopPlayersStatistics10.getPitchingFieldingIndependentPitching();
                    case 19:
                        BaseballTopPlayersStatisticsItem baseballTopPlayersStatisticsItem10 = (BaseballTopPlayersStatisticsItem) obj;
                        baseballTopPlayersStatisticsItem10.getClass();
                        return rei.b(2, baseballTopPlayersStatisticsItem10.getPitchingFieldingIndependentPitching());
                    case 20:
                        BaseballTopPlayersStatistics baseballTopPlayersStatistics11 = (BaseballTopPlayersStatistics) obj;
                        baseballTopPlayersStatistics11.getClass();
                        return baseballTopPlayersStatistics11.getPitchingOpponentBattingAvg();
                    case 21:
                        BaseballTopPlayersStatisticsItem baseballTopPlayersStatisticsItem11 = (BaseballTopPlayersStatisticsItem) obj;
                        baseballTopPlayersStatisticsItem11.getClass();
                        Double pitchingOpponentBattingAvg = baseballTopPlayersStatisticsItem11.getPitchingOpponentBattingAvg();
                        yid.k(pitchingOpponentBattingAvg);
                        String format2 = new DecimalFormat(".000", new DecimalFormatSymbols(Locale.US)).format(yid.k(pitchingOpponentBattingAvg));
                        format2.getClass();
                        return format2;
                    case 22:
                        BaseballTopPlayersStatistics baseballTopPlayersStatistics12 = (BaseballTopPlayersStatistics) obj;
                        baseballTopPlayersStatistics12.getClass();
                        return baseballTopPlayersStatistics12.getFieldingPutOuts();
                    case 23:
                        BaseballTopPlayersStatisticsItem baseballTopPlayersStatisticsItem12 = (BaseballTopPlayersStatisticsItem) obj;
                        baseballTopPlayersStatisticsItem12.getClass();
                        return yid.j(baseballTopPlayersStatisticsItem12.getFieldingPutOuts());
                    case 24:
                        BaseballTopPlayersStatistics baseballTopPlayersStatistics13 = (BaseballTopPlayersStatistics) obj;
                        baseballTopPlayersStatistics13.getClass();
                        return baseballTopPlayersStatistics13.getBattingStolenBases();
                    case 25:
                        BaseballTopPlayersStatistics baseballTopPlayersStatistics14 = (BaseballTopPlayersStatistics) obj;
                        baseballTopPlayersStatistics14.getClass();
                        return baseballTopPlayersStatistics14.getFieldingAssists();
                    case 26:
                        BaseballTopPlayersStatisticsItem baseballTopPlayersStatisticsItem13 = (BaseballTopPlayersStatisticsItem) obj;
                        baseballTopPlayersStatisticsItem13.getClass();
                        return yid.j(baseballTopPlayersStatisticsItem13.getFieldingAssists());
                    case 27:
                        BaseballTopPlayersStatistics baseballTopPlayersStatistics15 = (BaseballTopPlayersStatistics) obj;
                        baseballTopPlayersStatistics15.getClass();
                        return baseballTopPlayersStatistics15.getFieldingTotalErrors();
                    case 28:
                        BaseballTopPlayersStatisticsItem baseballTopPlayersStatisticsItem14 = (BaseballTopPlayersStatisticsItem) obj;
                        baseballTopPlayersStatisticsItem14.getClass();
                        return yid.j(baseballTopPlayersStatisticsItem14.getFieldingTotalErrors());
                    default:
                        BaseballTopPlayersStatistics baseballTopPlayersStatistics16 = (BaseballTopPlayersStatistics) obj;
                        baseballTopPlayersStatistics16.getClass();
                        return baseballTopPlayersStatistics16.getBattingHomeRuns();
                }
            }
        }, new Function1() { // from class: iab
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                switch (i22) {
                    case 0:
                        BaseballTopPlayersStatistics baseballTopPlayersStatistics = (BaseballTopPlayersStatistics) obj;
                        baseballTopPlayersStatistics.getClass();
                        return baseballTopPlayersStatistics.getPitchingSaves();
                    case 1:
                        BaseballTopPlayersStatisticsItem baseballTopPlayersStatisticsItem = (BaseballTopPlayersStatisticsItem) obj;
                        baseballTopPlayersStatisticsItem.getClass();
                        return yid.j(baseballTopPlayersStatisticsItem.getPitchingSaves());
                    case 2:
                        BaseballTopPlayersStatistics baseballTopPlayersStatistics2 = (BaseballTopPlayersStatistics) obj;
                        baseballTopPlayersStatistics2.getClass();
                        return baseballTopPlayersStatistics2.getBattingRbi();
                    case 3:
                        BaseballTopPlayersStatistics baseballTopPlayersStatistics3 = (BaseballTopPlayersStatistics) obj;
                        baseballTopPlayersStatistics3.getClass();
                        return baseballTopPlayersStatistics3.getPitchingInningsPitched();
                    case 4:
                        BaseballTopPlayersStatisticsItem baseballTopPlayersStatisticsItem2 = (BaseballTopPlayersStatisticsItem) obj;
                        baseballTopPlayersStatisticsItem2.getClass();
                        return rei.b(1, baseballTopPlayersStatisticsItem2.getPitchingInningsPitched());
                    case 5:
                        BaseballTopPlayersStatistics baseballTopPlayersStatistics4 = (BaseballTopPlayersStatistics) obj;
                        baseballTopPlayersStatistics4.getClass();
                        return baseballTopPlayersStatistics4.getBattingHits();
                    case 6:
                        BaseballTopPlayersStatistics baseballTopPlayersStatistics5 = (BaseballTopPlayersStatistics) obj;
                        baseballTopPlayersStatistics5.getClass();
                        return baseballTopPlayersStatistics5.getPitchingEarnedRunsAverage();
                    case 7:
                        BaseballTopPlayersStatisticsItem baseballTopPlayersStatisticsItem3 = (BaseballTopPlayersStatisticsItem) obj;
                        baseballTopPlayersStatisticsItem3.getClass();
                        return rei.b(2, baseballTopPlayersStatisticsItem3.getPitchingEarnedRunsAverage());
                    case 8:
                        BaseballTopPlayersStatistics baseballTopPlayersStatistics6 = (BaseballTopPlayersStatistics) obj;
                        baseballTopPlayersStatistics6.getClass();
                        return baseballTopPlayersStatistics6.getPitchingStrikeOuts();
                    case 9:
                        BaseballTopPlayersStatisticsItem baseballTopPlayersStatisticsItem4 = (BaseballTopPlayersStatisticsItem) obj;
                        baseballTopPlayersStatisticsItem4.getClass();
                        return yid.j(baseballTopPlayersStatisticsItem4.getPitchingStrikeOuts());
                    case 10:
                        BaseballTopPlayersStatistics baseballTopPlayersStatistics7 = (BaseballTopPlayersStatistics) obj;
                        baseballTopPlayersStatistics7.getClass();
                        return baseballTopPlayersStatistics7.getPitchingQualityStarts();
                    case 11:
                        BaseballTopPlayersStatisticsItem baseballTopPlayersStatisticsItem5 = (BaseballTopPlayersStatisticsItem) obj;
                        baseballTopPlayersStatisticsItem5.getClass();
                        return yid.j(baseballTopPlayersStatisticsItem5.getPitchingQualityStarts());
                    case 12:
                        BaseballTopPlayersStatistics baseballTopPlayersStatistics8 = (BaseballTopPlayersStatistics) obj;
                        baseballTopPlayersStatistics8.getClass();
                        return baseballTopPlayersStatistics8.getPitchingWhip();
                    case 13:
                        BaseballTopPlayersStatisticsItem baseballTopPlayersStatisticsItem6 = (BaseballTopPlayersStatisticsItem) obj;
                        baseballTopPlayersStatisticsItem6.getClass();
                        return yid.j(baseballTopPlayersStatisticsItem6.getBattingRbi());
                    case 14:
                        BaseballTopPlayersStatisticsItem baseballTopPlayersStatisticsItem7 = (BaseballTopPlayersStatisticsItem) obj;
                        baseballTopPlayersStatisticsItem7.getClass();
                        Double pitchingWhip = baseballTopPlayersStatisticsItem7.getPitchingWhip();
                        yid.k(pitchingWhip);
                        String format = new DecimalFormat(".000", new DecimalFormatSymbols(Locale.US)).format(yid.k(pitchingWhip));
                        format.getClass();
                        return format;
                    case 15:
                        BaseballTopPlayersStatistics baseballTopPlayersStatistics9 = (BaseballTopPlayersStatistics) obj;
                        baseballTopPlayersStatistics9.getClass();
                        return baseballTopPlayersStatistics9.getPitchingWar();
                    case 16:
                        BaseballTopPlayersStatisticsItem baseballTopPlayersStatisticsItem8 = (BaseballTopPlayersStatisticsItem) obj;
                        baseballTopPlayersStatisticsItem8.getClass();
                        return rei.b(1, baseballTopPlayersStatisticsItem8.getPitchingWar());
                    case 17:
                        BaseballTopPlayersStatisticsItem baseballTopPlayersStatisticsItem9 = (BaseballTopPlayersStatisticsItem) obj;
                        baseballTopPlayersStatisticsItem9.getClass();
                        return yid.j(baseballTopPlayersStatisticsItem9.getBattingHits());
                    case 18:
                        BaseballTopPlayersStatistics baseballTopPlayersStatistics10 = (BaseballTopPlayersStatistics) obj;
                        baseballTopPlayersStatistics10.getClass();
                        return baseballTopPlayersStatistics10.getPitchingFieldingIndependentPitching();
                    case 19:
                        BaseballTopPlayersStatisticsItem baseballTopPlayersStatisticsItem10 = (BaseballTopPlayersStatisticsItem) obj;
                        baseballTopPlayersStatisticsItem10.getClass();
                        return rei.b(2, baseballTopPlayersStatisticsItem10.getPitchingFieldingIndependentPitching());
                    case 20:
                        BaseballTopPlayersStatistics baseballTopPlayersStatistics11 = (BaseballTopPlayersStatistics) obj;
                        baseballTopPlayersStatistics11.getClass();
                        return baseballTopPlayersStatistics11.getPitchingOpponentBattingAvg();
                    case 21:
                        BaseballTopPlayersStatisticsItem baseballTopPlayersStatisticsItem11 = (BaseballTopPlayersStatisticsItem) obj;
                        baseballTopPlayersStatisticsItem11.getClass();
                        Double pitchingOpponentBattingAvg = baseballTopPlayersStatisticsItem11.getPitchingOpponentBattingAvg();
                        yid.k(pitchingOpponentBattingAvg);
                        String format2 = new DecimalFormat(".000", new DecimalFormatSymbols(Locale.US)).format(yid.k(pitchingOpponentBattingAvg));
                        format2.getClass();
                        return format2;
                    case 22:
                        BaseballTopPlayersStatistics baseballTopPlayersStatistics12 = (BaseballTopPlayersStatistics) obj;
                        baseballTopPlayersStatistics12.getClass();
                        return baseballTopPlayersStatistics12.getFieldingPutOuts();
                    case 23:
                        BaseballTopPlayersStatisticsItem baseballTopPlayersStatisticsItem12 = (BaseballTopPlayersStatisticsItem) obj;
                        baseballTopPlayersStatisticsItem12.getClass();
                        return yid.j(baseballTopPlayersStatisticsItem12.getFieldingPutOuts());
                    case 24:
                        BaseballTopPlayersStatistics baseballTopPlayersStatistics13 = (BaseballTopPlayersStatistics) obj;
                        baseballTopPlayersStatistics13.getClass();
                        return baseballTopPlayersStatistics13.getBattingStolenBases();
                    case 25:
                        BaseballTopPlayersStatistics baseballTopPlayersStatistics14 = (BaseballTopPlayersStatistics) obj;
                        baseballTopPlayersStatistics14.getClass();
                        return baseballTopPlayersStatistics14.getFieldingAssists();
                    case 26:
                        BaseballTopPlayersStatisticsItem baseballTopPlayersStatisticsItem13 = (BaseballTopPlayersStatisticsItem) obj;
                        baseballTopPlayersStatisticsItem13.getClass();
                        return yid.j(baseballTopPlayersStatisticsItem13.getFieldingAssists());
                    case 27:
                        BaseballTopPlayersStatistics baseballTopPlayersStatistics15 = (BaseballTopPlayersStatistics) obj;
                        baseballTopPlayersStatistics15.getClass();
                        return baseballTopPlayersStatistics15.getFieldingTotalErrors();
                    case 28:
                        BaseballTopPlayersStatisticsItem baseballTopPlayersStatisticsItem14 = (BaseballTopPlayersStatisticsItem) obj;
                        baseballTopPlayersStatisticsItem14.getClass();
                        return yid.j(baseballTopPlayersStatisticsItem14.getFieldingTotalErrors());
                    default:
                        BaseballTopPlayersStatistics baseballTopPlayersStatistics16 = (BaseballTopPlayersStatistics) obj;
                        baseballTopPlayersStatistics16.getClass();
                        return baseballTopPlayersStatistics16.getBattingHomeRuns();
                }
            }
        });
        final int i23 = 18;
        final int i24 = 19;
        kab kabVar21 = new kab("PITCHING_FIP", 20, wj1Var2, R.string.baseball_fielding_independent_pitching, new Function1() { // from class: iab
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                switch (i23) {
                    case 0:
                        BaseballTopPlayersStatistics baseballTopPlayersStatistics = (BaseballTopPlayersStatistics) obj;
                        baseballTopPlayersStatistics.getClass();
                        return baseballTopPlayersStatistics.getPitchingSaves();
                    case 1:
                        BaseballTopPlayersStatisticsItem baseballTopPlayersStatisticsItem = (BaseballTopPlayersStatisticsItem) obj;
                        baseballTopPlayersStatisticsItem.getClass();
                        return yid.j(baseballTopPlayersStatisticsItem.getPitchingSaves());
                    case 2:
                        BaseballTopPlayersStatistics baseballTopPlayersStatistics2 = (BaseballTopPlayersStatistics) obj;
                        baseballTopPlayersStatistics2.getClass();
                        return baseballTopPlayersStatistics2.getBattingRbi();
                    case 3:
                        BaseballTopPlayersStatistics baseballTopPlayersStatistics3 = (BaseballTopPlayersStatistics) obj;
                        baseballTopPlayersStatistics3.getClass();
                        return baseballTopPlayersStatistics3.getPitchingInningsPitched();
                    case 4:
                        BaseballTopPlayersStatisticsItem baseballTopPlayersStatisticsItem2 = (BaseballTopPlayersStatisticsItem) obj;
                        baseballTopPlayersStatisticsItem2.getClass();
                        return rei.b(1, baseballTopPlayersStatisticsItem2.getPitchingInningsPitched());
                    case 5:
                        BaseballTopPlayersStatistics baseballTopPlayersStatistics4 = (BaseballTopPlayersStatistics) obj;
                        baseballTopPlayersStatistics4.getClass();
                        return baseballTopPlayersStatistics4.getBattingHits();
                    case 6:
                        BaseballTopPlayersStatistics baseballTopPlayersStatistics5 = (BaseballTopPlayersStatistics) obj;
                        baseballTopPlayersStatistics5.getClass();
                        return baseballTopPlayersStatistics5.getPitchingEarnedRunsAverage();
                    case 7:
                        BaseballTopPlayersStatisticsItem baseballTopPlayersStatisticsItem3 = (BaseballTopPlayersStatisticsItem) obj;
                        baseballTopPlayersStatisticsItem3.getClass();
                        return rei.b(2, baseballTopPlayersStatisticsItem3.getPitchingEarnedRunsAverage());
                    case 8:
                        BaseballTopPlayersStatistics baseballTopPlayersStatistics6 = (BaseballTopPlayersStatistics) obj;
                        baseballTopPlayersStatistics6.getClass();
                        return baseballTopPlayersStatistics6.getPitchingStrikeOuts();
                    case 9:
                        BaseballTopPlayersStatisticsItem baseballTopPlayersStatisticsItem4 = (BaseballTopPlayersStatisticsItem) obj;
                        baseballTopPlayersStatisticsItem4.getClass();
                        return yid.j(baseballTopPlayersStatisticsItem4.getPitchingStrikeOuts());
                    case 10:
                        BaseballTopPlayersStatistics baseballTopPlayersStatistics7 = (BaseballTopPlayersStatistics) obj;
                        baseballTopPlayersStatistics7.getClass();
                        return baseballTopPlayersStatistics7.getPitchingQualityStarts();
                    case 11:
                        BaseballTopPlayersStatisticsItem baseballTopPlayersStatisticsItem5 = (BaseballTopPlayersStatisticsItem) obj;
                        baseballTopPlayersStatisticsItem5.getClass();
                        return yid.j(baseballTopPlayersStatisticsItem5.getPitchingQualityStarts());
                    case 12:
                        BaseballTopPlayersStatistics baseballTopPlayersStatistics8 = (BaseballTopPlayersStatistics) obj;
                        baseballTopPlayersStatistics8.getClass();
                        return baseballTopPlayersStatistics8.getPitchingWhip();
                    case 13:
                        BaseballTopPlayersStatisticsItem baseballTopPlayersStatisticsItem6 = (BaseballTopPlayersStatisticsItem) obj;
                        baseballTopPlayersStatisticsItem6.getClass();
                        return yid.j(baseballTopPlayersStatisticsItem6.getBattingRbi());
                    case 14:
                        BaseballTopPlayersStatisticsItem baseballTopPlayersStatisticsItem7 = (BaseballTopPlayersStatisticsItem) obj;
                        baseballTopPlayersStatisticsItem7.getClass();
                        Double pitchingWhip = baseballTopPlayersStatisticsItem7.getPitchingWhip();
                        yid.k(pitchingWhip);
                        String format = new DecimalFormat(".000", new DecimalFormatSymbols(Locale.US)).format(yid.k(pitchingWhip));
                        format.getClass();
                        return format;
                    case 15:
                        BaseballTopPlayersStatistics baseballTopPlayersStatistics9 = (BaseballTopPlayersStatistics) obj;
                        baseballTopPlayersStatistics9.getClass();
                        return baseballTopPlayersStatistics9.getPitchingWar();
                    case 16:
                        BaseballTopPlayersStatisticsItem baseballTopPlayersStatisticsItem8 = (BaseballTopPlayersStatisticsItem) obj;
                        baseballTopPlayersStatisticsItem8.getClass();
                        return rei.b(1, baseballTopPlayersStatisticsItem8.getPitchingWar());
                    case 17:
                        BaseballTopPlayersStatisticsItem baseballTopPlayersStatisticsItem9 = (BaseballTopPlayersStatisticsItem) obj;
                        baseballTopPlayersStatisticsItem9.getClass();
                        return yid.j(baseballTopPlayersStatisticsItem9.getBattingHits());
                    case 18:
                        BaseballTopPlayersStatistics baseballTopPlayersStatistics10 = (BaseballTopPlayersStatistics) obj;
                        baseballTopPlayersStatistics10.getClass();
                        return baseballTopPlayersStatistics10.getPitchingFieldingIndependentPitching();
                    case 19:
                        BaseballTopPlayersStatisticsItem baseballTopPlayersStatisticsItem10 = (BaseballTopPlayersStatisticsItem) obj;
                        baseballTopPlayersStatisticsItem10.getClass();
                        return rei.b(2, baseballTopPlayersStatisticsItem10.getPitchingFieldingIndependentPitching());
                    case 20:
                        BaseballTopPlayersStatistics baseballTopPlayersStatistics11 = (BaseballTopPlayersStatistics) obj;
                        baseballTopPlayersStatistics11.getClass();
                        return baseballTopPlayersStatistics11.getPitchingOpponentBattingAvg();
                    case 21:
                        BaseballTopPlayersStatisticsItem baseballTopPlayersStatisticsItem11 = (BaseballTopPlayersStatisticsItem) obj;
                        baseballTopPlayersStatisticsItem11.getClass();
                        Double pitchingOpponentBattingAvg = baseballTopPlayersStatisticsItem11.getPitchingOpponentBattingAvg();
                        yid.k(pitchingOpponentBattingAvg);
                        String format2 = new DecimalFormat(".000", new DecimalFormatSymbols(Locale.US)).format(yid.k(pitchingOpponentBattingAvg));
                        format2.getClass();
                        return format2;
                    case 22:
                        BaseballTopPlayersStatistics baseballTopPlayersStatistics12 = (BaseballTopPlayersStatistics) obj;
                        baseballTopPlayersStatistics12.getClass();
                        return baseballTopPlayersStatistics12.getFieldingPutOuts();
                    case 23:
                        BaseballTopPlayersStatisticsItem baseballTopPlayersStatisticsItem12 = (BaseballTopPlayersStatisticsItem) obj;
                        baseballTopPlayersStatisticsItem12.getClass();
                        return yid.j(baseballTopPlayersStatisticsItem12.getFieldingPutOuts());
                    case 24:
                        BaseballTopPlayersStatistics baseballTopPlayersStatistics13 = (BaseballTopPlayersStatistics) obj;
                        baseballTopPlayersStatistics13.getClass();
                        return baseballTopPlayersStatistics13.getBattingStolenBases();
                    case 25:
                        BaseballTopPlayersStatistics baseballTopPlayersStatistics14 = (BaseballTopPlayersStatistics) obj;
                        baseballTopPlayersStatistics14.getClass();
                        return baseballTopPlayersStatistics14.getFieldingAssists();
                    case 26:
                        BaseballTopPlayersStatisticsItem baseballTopPlayersStatisticsItem13 = (BaseballTopPlayersStatisticsItem) obj;
                        baseballTopPlayersStatisticsItem13.getClass();
                        return yid.j(baseballTopPlayersStatisticsItem13.getFieldingAssists());
                    case 27:
                        BaseballTopPlayersStatistics baseballTopPlayersStatistics15 = (BaseballTopPlayersStatistics) obj;
                        baseballTopPlayersStatistics15.getClass();
                        return baseballTopPlayersStatistics15.getFieldingTotalErrors();
                    case 28:
                        BaseballTopPlayersStatisticsItem baseballTopPlayersStatisticsItem14 = (BaseballTopPlayersStatisticsItem) obj;
                        baseballTopPlayersStatisticsItem14.getClass();
                        return yid.j(baseballTopPlayersStatisticsItem14.getFieldingTotalErrors());
                    default:
                        BaseballTopPlayersStatistics baseballTopPlayersStatistics16 = (BaseballTopPlayersStatistics) obj;
                        baseballTopPlayersStatistics16.getClass();
                        return baseballTopPlayersStatistics16.getBattingHomeRuns();
                }
            }
        }, new Function1() { // from class: iab
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                switch (i24) {
                    case 0:
                        BaseballTopPlayersStatistics baseballTopPlayersStatistics = (BaseballTopPlayersStatistics) obj;
                        baseballTopPlayersStatistics.getClass();
                        return baseballTopPlayersStatistics.getPitchingSaves();
                    case 1:
                        BaseballTopPlayersStatisticsItem baseballTopPlayersStatisticsItem = (BaseballTopPlayersStatisticsItem) obj;
                        baseballTopPlayersStatisticsItem.getClass();
                        return yid.j(baseballTopPlayersStatisticsItem.getPitchingSaves());
                    case 2:
                        BaseballTopPlayersStatistics baseballTopPlayersStatistics2 = (BaseballTopPlayersStatistics) obj;
                        baseballTopPlayersStatistics2.getClass();
                        return baseballTopPlayersStatistics2.getBattingRbi();
                    case 3:
                        BaseballTopPlayersStatistics baseballTopPlayersStatistics3 = (BaseballTopPlayersStatistics) obj;
                        baseballTopPlayersStatistics3.getClass();
                        return baseballTopPlayersStatistics3.getPitchingInningsPitched();
                    case 4:
                        BaseballTopPlayersStatisticsItem baseballTopPlayersStatisticsItem2 = (BaseballTopPlayersStatisticsItem) obj;
                        baseballTopPlayersStatisticsItem2.getClass();
                        return rei.b(1, baseballTopPlayersStatisticsItem2.getPitchingInningsPitched());
                    case 5:
                        BaseballTopPlayersStatistics baseballTopPlayersStatistics4 = (BaseballTopPlayersStatistics) obj;
                        baseballTopPlayersStatistics4.getClass();
                        return baseballTopPlayersStatistics4.getBattingHits();
                    case 6:
                        BaseballTopPlayersStatistics baseballTopPlayersStatistics5 = (BaseballTopPlayersStatistics) obj;
                        baseballTopPlayersStatistics5.getClass();
                        return baseballTopPlayersStatistics5.getPitchingEarnedRunsAverage();
                    case 7:
                        BaseballTopPlayersStatisticsItem baseballTopPlayersStatisticsItem3 = (BaseballTopPlayersStatisticsItem) obj;
                        baseballTopPlayersStatisticsItem3.getClass();
                        return rei.b(2, baseballTopPlayersStatisticsItem3.getPitchingEarnedRunsAverage());
                    case 8:
                        BaseballTopPlayersStatistics baseballTopPlayersStatistics6 = (BaseballTopPlayersStatistics) obj;
                        baseballTopPlayersStatistics6.getClass();
                        return baseballTopPlayersStatistics6.getPitchingStrikeOuts();
                    case 9:
                        BaseballTopPlayersStatisticsItem baseballTopPlayersStatisticsItem4 = (BaseballTopPlayersStatisticsItem) obj;
                        baseballTopPlayersStatisticsItem4.getClass();
                        return yid.j(baseballTopPlayersStatisticsItem4.getPitchingStrikeOuts());
                    case 10:
                        BaseballTopPlayersStatistics baseballTopPlayersStatistics7 = (BaseballTopPlayersStatistics) obj;
                        baseballTopPlayersStatistics7.getClass();
                        return baseballTopPlayersStatistics7.getPitchingQualityStarts();
                    case 11:
                        BaseballTopPlayersStatisticsItem baseballTopPlayersStatisticsItem5 = (BaseballTopPlayersStatisticsItem) obj;
                        baseballTopPlayersStatisticsItem5.getClass();
                        return yid.j(baseballTopPlayersStatisticsItem5.getPitchingQualityStarts());
                    case 12:
                        BaseballTopPlayersStatistics baseballTopPlayersStatistics8 = (BaseballTopPlayersStatistics) obj;
                        baseballTopPlayersStatistics8.getClass();
                        return baseballTopPlayersStatistics8.getPitchingWhip();
                    case 13:
                        BaseballTopPlayersStatisticsItem baseballTopPlayersStatisticsItem6 = (BaseballTopPlayersStatisticsItem) obj;
                        baseballTopPlayersStatisticsItem6.getClass();
                        return yid.j(baseballTopPlayersStatisticsItem6.getBattingRbi());
                    case 14:
                        BaseballTopPlayersStatisticsItem baseballTopPlayersStatisticsItem7 = (BaseballTopPlayersStatisticsItem) obj;
                        baseballTopPlayersStatisticsItem7.getClass();
                        Double pitchingWhip = baseballTopPlayersStatisticsItem7.getPitchingWhip();
                        yid.k(pitchingWhip);
                        String format = new DecimalFormat(".000", new DecimalFormatSymbols(Locale.US)).format(yid.k(pitchingWhip));
                        format.getClass();
                        return format;
                    case 15:
                        BaseballTopPlayersStatistics baseballTopPlayersStatistics9 = (BaseballTopPlayersStatistics) obj;
                        baseballTopPlayersStatistics9.getClass();
                        return baseballTopPlayersStatistics9.getPitchingWar();
                    case 16:
                        BaseballTopPlayersStatisticsItem baseballTopPlayersStatisticsItem8 = (BaseballTopPlayersStatisticsItem) obj;
                        baseballTopPlayersStatisticsItem8.getClass();
                        return rei.b(1, baseballTopPlayersStatisticsItem8.getPitchingWar());
                    case 17:
                        BaseballTopPlayersStatisticsItem baseballTopPlayersStatisticsItem9 = (BaseballTopPlayersStatisticsItem) obj;
                        baseballTopPlayersStatisticsItem9.getClass();
                        return yid.j(baseballTopPlayersStatisticsItem9.getBattingHits());
                    case 18:
                        BaseballTopPlayersStatistics baseballTopPlayersStatistics10 = (BaseballTopPlayersStatistics) obj;
                        baseballTopPlayersStatistics10.getClass();
                        return baseballTopPlayersStatistics10.getPitchingFieldingIndependentPitching();
                    case 19:
                        BaseballTopPlayersStatisticsItem baseballTopPlayersStatisticsItem10 = (BaseballTopPlayersStatisticsItem) obj;
                        baseballTopPlayersStatisticsItem10.getClass();
                        return rei.b(2, baseballTopPlayersStatisticsItem10.getPitchingFieldingIndependentPitching());
                    case 20:
                        BaseballTopPlayersStatistics baseballTopPlayersStatistics11 = (BaseballTopPlayersStatistics) obj;
                        baseballTopPlayersStatistics11.getClass();
                        return baseballTopPlayersStatistics11.getPitchingOpponentBattingAvg();
                    case 21:
                        BaseballTopPlayersStatisticsItem baseballTopPlayersStatisticsItem11 = (BaseballTopPlayersStatisticsItem) obj;
                        baseballTopPlayersStatisticsItem11.getClass();
                        Double pitchingOpponentBattingAvg = baseballTopPlayersStatisticsItem11.getPitchingOpponentBattingAvg();
                        yid.k(pitchingOpponentBattingAvg);
                        String format2 = new DecimalFormat(".000", new DecimalFormatSymbols(Locale.US)).format(yid.k(pitchingOpponentBattingAvg));
                        format2.getClass();
                        return format2;
                    case 22:
                        BaseballTopPlayersStatistics baseballTopPlayersStatistics12 = (BaseballTopPlayersStatistics) obj;
                        baseballTopPlayersStatistics12.getClass();
                        return baseballTopPlayersStatistics12.getFieldingPutOuts();
                    case 23:
                        BaseballTopPlayersStatisticsItem baseballTopPlayersStatisticsItem12 = (BaseballTopPlayersStatisticsItem) obj;
                        baseballTopPlayersStatisticsItem12.getClass();
                        return yid.j(baseballTopPlayersStatisticsItem12.getFieldingPutOuts());
                    case 24:
                        BaseballTopPlayersStatistics baseballTopPlayersStatistics13 = (BaseballTopPlayersStatistics) obj;
                        baseballTopPlayersStatistics13.getClass();
                        return baseballTopPlayersStatistics13.getBattingStolenBases();
                    case 25:
                        BaseballTopPlayersStatistics baseballTopPlayersStatistics14 = (BaseballTopPlayersStatistics) obj;
                        baseballTopPlayersStatistics14.getClass();
                        return baseballTopPlayersStatistics14.getFieldingAssists();
                    case 26:
                        BaseballTopPlayersStatisticsItem baseballTopPlayersStatisticsItem13 = (BaseballTopPlayersStatisticsItem) obj;
                        baseballTopPlayersStatisticsItem13.getClass();
                        return yid.j(baseballTopPlayersStatisticsItem13.getFieldingAssists());
                    case 27:
                        BaseballTopPlayersStatistics baseballTopPlayersStatistics15 = (BaseballTopPlayersStatistics) obj;
                        baseballTopPlayersStatistics15.getClass();
                        return baseballTopPlayersStatistics15.getFieldingTotalErrors();
                    case 28:
                        BaseballTopPlayersStatisticsItem baseballTopPlayersStatisticsItem14 = (BaseballTopPlayersStatisticsItem) obj;
                        baseballTopPlayersStatisticsItem14.getClass();
                        return yid.j(baseballTopPlayersStatisticsItem14.getFieldingTotalErrors());
                    default:
                        BaseballTopPlayersStatistics baseballTopPlayersStatistics16 = (BaseballTopPlayersStatistics) obj;
                        baseballTopPlayersStatistics16.getClass();
                        return baseballTopPlayersStatistics16.getBattingHomeRuns();
                }
            }
        });
        final int i25 = 20;
        final int i26 = 21;
        kab kabVar22 = new kab("PITCHING_BAA", 21, wj1Var2, R.string.baseball_batting_average_against, new Function1() { // from class: iab
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                switch (i25) {
                    case 0:
                        BaseballTopPlayersStatistics baseballTopPlayersStatistics = (BaseballTopPlayersStatistics) obj;
                        baseballTopPlayersStatistics.getClass();
                        return baseballTopPlayersStatistics.getPitchingSaves();
                    case 1:
                        BaseballTopPlayersStatisticsItem baseballTopPlayersStatisticsItem = (BaseballTopPlayersStatisticsItem) obj;
                        baseballTopPlayersStatisticsItem.getClass();
                        return yid.j(baseballTopPlayersStatisticsItem.getPitchingSaves());
                    case 2:
                        BaseballTopPlayersStatistics baseballTopPlayersStatistics2 = (BaseballTopPlayersStatistics) obj;
                        baseballTopPlayersStatistics2.getClass();
                        return baseballTopPlayersStatistics2.getBattingRbi();
                    case 3:
                        BaseballTopPlayersStatistics baseballTopPlayersStatistics3 = (BaseballTopPlayersStatistics) obj;
                        baseballTopPlayersStatistics3.getClass();
                        return baseballTopPlayersStatistics3.getPitchingInningsPitched();
                    case 4:
                        BaseballTopPlayersStatisticsItem baseballTopPlayersStatisticsItem2 = (BaseballTopPlayersStatisticsItem) obj;
                        baseballTopPlayersStatisticsItem2.getClass();
                        return rei.b(1, baseballTopPlayersStatisticsItem2.getPitchingInningsPitched());
                    case 5:
                        BaseballTopPlayersStatistics baseballTopPlayersStatistics4 = (BaseballTopPlayersStatistics) obj;
                        baseballTopPlayersStatistics4.getClass();
                        return baseballTopPlayersStatistics4.getBattingHits();
                    case 6:
                        BaseballTopPlayersStatistics baseballTopPlayersStatistics5 = (BaseballTopPlayersStatistics) obj;
                        baseballTopPlayersStatistics5.getClass();
                        return baseballTopPlayersStatistics5.getPitchingEarnedRunsAverage();
                    case 7:
                        BaseballTopPlayersStatisticsItem baseballTopPlayersStatisticsItem3 = (BaseballTopPlayersStatisticsItem) obj;
                        baseballTopPlayersStatisticsItem3.getClass();
                        return rei.b(2, baseballTopPlayersStatisticsItem3.getPitchingEarnedRunsAverage());
                    case 8:
                        BaseballTopPlayersStatistics baseballTopPlayersStatistics6 = (BaseballTopPlayersStatistics) obj;
                        baseballTopPlayersStatistics6.getClass();
                        return baseballTopPlayersStatistics6.getPitchingStrikeOuts();
                    case 9:
                        BaseballTopPlayersStatisticsItem baseballTopPlayersStatisticsItem4 = (BaseballTopPlayersStatisticsItem) obj;
                        baseballTopPlayersStatisticsItem4.getClass();
                        return yid.j(baseballTopPlayersStatisticsItem4.getPitchingStrikeOuts());
                    case 10:
                        BaseballTopPlayersStatistics baseballTopPlayersStatistics7 = (BaseballTopPlayersStatistics) obj;
                        baseballTopPlayersStatistics7.getClass();
                        return baseballTopPlayersStatistics7.getPitchingQualityStarts();
                    case 11:
                        BaseballTopPlayersStatisticsItem baseballTopPlayersStatisticsItem5 = (BaseballTopPlayersStatisticsItem) obj;
                        baseballTopPlayersStatisticsItem5.getClass();
                        return yid.j(baseballTopPlayersStatisticsItem5.getPitchingQualityStarts());
                    case 12:
                        BaseballTopPlayersStatistics baseballTopPlayersStatistics8 = (BaseballTopPlayersStatistics) obj;
                        baseballTopPlayersStatistics8.getClass();
                        return baseballTopPlayersStatistics8.getPitchingWhip();
                    case 13:
                        BaseballTopPlayersStatisticsItem baseballTopPlayersStatisticsItem6 = (BaseballTopPlayersStatisticsItem) obj;
                        baseballTopPlayersStatisticsItem6.getClass();
                        return yid.j(baseballTopPlayersStatisticsItem6.getBattingRbi());
                    case 14:
                        BaseballTopPlayersStatisticsItem baseballTopPlayersStatisticsItem7 = (BaseballTopPlayersStatisticsItem) obj;
                        baseballTopPlayersStatisticsItem7.getClass();
                        Double pitchingWhip = baseballTopPlayersStatisticsItem7.getPitchingWhip();
                        yid.k(pitchingWhip);
                        String format = new DecimalFormat(".000", new DecimalFormatSymbols(Locale.US)).format(yid.k(pitchingWhip));
                        format.getClass();
                        return format;
                    case 15:
                        BaseballTopPlayersStatistics baseballTopPlayersStatistics9 = (BaseballTopPlayersStatistics) obj;
                        baseballTopPlayersStatistics9.getClass();
                        return baseballTopPlayersStatistics9.getPitchingWar();
                    case 16:
                        BaseballTopPlayersStatisticsItem baseballTopPlayersStatisticsItem8 = (BaseballTopPlayersStatisticsItem) obj;
                        baseballTopPlayersStatisticsItem8.getClass();
                        return rei.b(1, baseballTopPlayersStatisticsItem8.getPitchingWar());
                    case 17:
                        BaseballTopPlayersStatisticsItem baseballTopPlayersStatisticsItem9 = (BaseballTopPlayersStatisticsItem) obj;
                        baseballTopPlayersStatisticsItem9.getClass();
                        return yid.j(baseballTopPlayersStatisticsItem9.getBattingHits());
                    case 18:
                        BaseballTopPlayersStatistics baseballTopPlayersStatistics10 = (BaseballTopPlayersStatistics) obj;
                        baseballTopPlayersStatistics10.getClass();
                        return baseballTopPlayersStatistics10.getPitchingFieldingIndependentPitching();
                    case 19:
                        BaseballTopPlayersStatisticsItem baseballTopPlayersStatisticsItem10 = (BaseballTopPlayersStatisticsItem) obj;
                        baseballTopPlayersStatisticsItem10.getClass();
                        return rei.b(2, baseballTopPlayersStatisticsItem10.getPitchingFieldingIndependentPitching());
                    case 20:
                        BaseballTopPlayersStatistics baseballTopPlayersStatistics11 = (BaseballTopPlayersStatistics) obj;
                        baseballTopPlayersStatistics11.getClass();
                        return baseballTopPlayersStatistics11.getPitchingOpponentBattingAvg();
                    case 21:
                        BaseballTopPlayersStatisticsItem baseballTopPlayersStatisticsItem11 = (BaseballTopPlayersStatisticsItem) obj;
                        baseballTopPlayersStatisticsItem11.getClass();
                        Double pitchingOpponentBattingAvg = baseballTopPlayersStatisticsItem11.getPitchingOpponentBattingAvg();
                        yid.k(pitchingOpponentBattingAvg);
                        String format2 = new DecimalFormat(".000", new DecimalFormatSymbols(Locale.US)).format(yid.k(pitchingOpponentBattingAvg));
                        format2.getClass();
                        return format2;
                    case 22:
                        BaseballTopPlayersStatistics baseballTopPlayersStatistics12 = (BaseballTopPlayersStatistics) obj;
                        baseballTopPlayersStatistics12.getClass();
                        return baseballTopPlayersStatistics12.getFieldingPutOuts();
                    case 23:
                        BaseballTopPlayersStatisticsItem baseballTopPlayersStatisticsItem12 = (BaseballTopPlayersStatisticsItem) obj;
                        baseballTopPlayersStatisticsItem12.getClass();
                        return yid.j(baseballTopPlayersStatisticsItem12.getFieldingPutOuts());
                    case 24:
                        BaseballTopPlayersStatistics baseballTopPlayersStatistics13 = (BaseballTopPlayersStatistics) obj;
                        baseballTopPlayersStatistics13.getClass();
                        return baseballTopPlayersStatistics13.getBattingStolenBases();
                    case 25:
                        BaseballTopPlayersStatistics baseballTopPlayersStatistics14 = (BaseballTopPlayersStatistics) obj;
                        baseballTopPlayersStatistics14.getClass();
                        return baseballTopPlayersStatistics14.getFieldingAssists();
                    case 26:
                        BaseballTopPlayersStatisticsItem baseballTopPlayersStatisticsItem13 = (BaseballTopPlayersStatisticsItem) obj;
                        baseballTopPlayersStatisticsItem13.getClass();
                        return yid.j(baseballTopPlayersStatisticsItem13.getFieldingAssists());
                    case 27:
                        BaseballTopPlayersStatistics baseballTopPlayersStatistics15 = (BaseballTopPlayersStatistics) obj;
                        baseballTopPlayersStatistics15.getClass();
                        return baseballTopPlayersStatistics15.getFieldingTotalErrors();
                    case 28:
                        BaseballTopPlayersStatisticsItem baseballTopPlayersStatisticsItem14 = (BaseballTopPlayersStatisticsItem) obj;
                        baseballTopPlayersStatisticsItem14.getClass();
                        return yid.j(baseballTopPlayersStatisticsItem14.getFieldingTotalErrors());
                    default:
                        BaseballTopPlayersStatistics baseballTopPlayersStatistics16 = (BaseballTopPlayersStatistics) obj;
                        baseballTopPlayersStatistics16.getClass();
                        return baseballTopPlayersStatistics16.getBattingHomeRuns();
                }
            }
        }, new Function1() { // from class: iab
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                switch (i26) {
                    case 0:
                        BaseballTopPlayersStatistics baseballTopPlayersStatistics = (BaseballTopPlayersStatistics) obj;
                        baseballTopPlayersStatistics.getClass();
                        return baseballTopPlayersStatistics.getPitchingSaves();
                    case 1:
                        BaseballTopPlayersStatisticsItem baseballTopPlayersStatisticsItem = (BaseballTopPlayersStatisticsItem) obj;
                        baseballTopPlayersStatisticsItem.getClass();
                        return yid.j(baseballTopPlayersStatisticsItem.getPitchingSaves());
                    case 2:
                        BaseballTopPlayersStatistics baseballTopPlayersStatistics2 = (BaseballTopPlayersStatistics) obj;
                        baseballTopPlayersStatistics2.getClass();
                        return baseballTopPlayersStatistics2.getBattingRbi();
                    case 3:
                        BaseballTopPlayersStatistics baseballTopPlayersStatistics3 = (BaseballTopPlayersStatistics) obj;
                        baseballTopPlayersStatistics3.getClass();
                        return baseballTopPlayersStatistics3.getPitchingInningsPitched();
                    case 4:
                        BaseballTopPlayersStatisticsItem baseballTopPlayersStatisticsItem2 = (BaseballTopPlayersStatisticsItem) obj;
                        baseballTopPlayersStatisticsItem2.getClass();
                        return rei.b(1, baseballTopPlayersStatisticsItem2.getPitchingInningsPitched());
                    case 5:
                        BaseballTopPlayersStatistics baseballTopPlayersStatistics4 = (BaseballTopPlayersStatistics) obj;
                        baseballTopPlayersStatistics4.getClass();
                        return baseballTopPlayersStatistics4.getBattingHits();
                    case 6:
                        BaseballTopPlayersStatistics baseballTopPlayersStatistics5 = (BaseballTopPlayersStatistics) obj;
                        baseballTopPlayersStatistics5.getClass();
                        return baseballTopPlayersStatistics5.getPitchingEarnedRunsAverage();
                    case 7:
                        BaseballTopPlayersStatisticsItem baseballTopPlayersStatisticsItem3 = (BaseballTopPlayersStatisticsItem) obj;
                        baseballTopPlayersStatisticsItem3.getClass();
                        return rei.b(2, baseballTopPlayersStatisticsItem3.getPitchingEarnedRunsAverage());
                    case 8:
                        BaseballTopPlayersStatistics baseballTopPlayersStatistics6 = (BaseballTopPlayersStatistics) obj;
                        baseballTopPlayersStatistics6.getClass();
                        return baseballTopPlayersStatistics6.getPitchingStrikeOuts();
                    case 9:
                        BaseballTopPlayersStatisticsItem baseballTopPlayersStatisticsItem4 = (BaseballTopPlayersStatisticsItem) obj;
                        baseballTopPlayersStatisticsItem4.getClass();
                        return yid.j(baseballTopPlayersStatisticsItem4.getPitchingStrikeOuts());
                    case 10:
                        BaseballTopPlayersStatistics baseballTopPlayersStatistics7 = (BaseballTopPlayersStatistics) obj;
                        baseballTopPlayersStatistics7.getClass();
                        return baseballTopPlayersStatistics7.getPitchingQualityStarts();
                    case 11:
                        BaseballTopPlayersStatisticsItem baseballTopPlayersStatisticsItem5 = (BaseballTopPlayersStatisticsItem) obj;
                        baseballTopPlayersStatisticsItem5.getClass();
                        return yid.j(baseballTopPlayersStatisticsItem5.getPitchingQualityStarts());
                    case 12:
                        BaseballTopPlayersStatistics baseballTopPlayersStatistics8 = (BaseballTopPlayersStatistics) obj;
                        baseballTopPlayersStatistics8.getClass();
                        return baseballTopPlayersStatistics8.getPitchingWhip();
                    case 13:
                        BaseballTopPlayersStatisticsItem baseballTopPlayersStatisticsItem6 = (BaseballTopPlayersStatisticsItem) obj;
                        baseballTopPlayersStatisticsItem6.getClass();
                        return yid.j(baseballTopPlayersStatisticsItem6.getBattingRbi());
                    case 14:
                        BaseballTopPlayersStatisticsItem baseballTopPlayersStatisticsItem7 = (BaseballTopPlayersStatisticsItem) obj;
                        baseballTopPlayersStatisticsItem7.getClass();
                        Double pitchingWhip = baseballTopPlayersStatisticsItem7.getPitchingWhip();
                        yid.k(pitchingWhip);
                        String format = new DecimalFormat(".000", new DecimalFormatSymbols(Locale.US)).format(yid.k(pitchingWhip));
                        format.getClass();
                        return format;
                    case 15:
                        BaseballTopPlayersStatistics baseballTopPlayersStatistics9 = (BaseballTopPlayersStatistics) obj;
                        baseballTopPlayersStatistics9.getClass();
                        return baseballTopPlayersStatistics9.getPitchingWar();
                    case 16:
                        BaseballTopPlayersStatisticsItem baseballTopPlayersStatisticsItem8 = (BaseballTopPlayersStatisticsItem) obj;
                        baseballTopPlayersStatisticsItem8.getClass();
                        return rei.b(1, baseballTopPlayersStatisticsItem8.getPitchingWar());
                    case 17:
                        BaseballTopPlayersStatisticsItem baseballTopPlayersStatisticsItem9 = (BaseballTopPlayersStatisticsItem) obj;
                        baseballTopPlayersStatisticsItem9.getClass();
                        return yid.j(baseballTopPlayersStatisticsItem9.getBattingHits());
                    case 18:
                        BaseballTopPlayersStatistics baseballTopPlayersStatistics10 = (BaseballTopPlayersStatistics) obj;
                        baseballTopPlayersStatistics10.getClass();
                        return baseballTopPlayersStatistics10.getPitchingFieldingIndependentPitching();
                    case 19:
                        BaseballTopPlayersStatisticsItem baseballTopPlayersStatisticsItem10 = (BaseballTopPlayersStatisticsItem) obj;
                        baseballTopPlayersStatisticsItem10.getClass();
                        return rei.b(2, baseballTopPlayersStatisticsItem10.getPitchingFieldingIndependentPitching());
                    case 20:
                        BaseballTopPlayersStatistics baseballTopPlayersStatistics11 = (BaseballTopPlayersStatistics) obj;
                        baseballTopPlayersStatistics11.getClass();
                        return baseballTopPlayersStatistics11.getPitchingOpponentBattingAvg();
                    case 21:
                        BaseballTopPlayersStatisticsItem baseballTopPlayersStatisticsItem11 = (BaseballTopPlayersStatisticsItem) obj;
                        baseballTopPlayersStatisticsItem11.getClass();
                        Double pitchingOpponentBattingAvg = baseballTopPlayersStatisticsItem11.getPitchingOpponentBattingAvg();
                        yid.k(pitchingOpponentBattingAvg);
                        String format2 = new DecimalFormat(".000", new DecimalFormatSymbols(Locale.US)).format(yid.k(pitchingOpponentBattingAvg));
                        format2.getClass();
                        return format2;
                    case 22:
                        BaseballTopPlayersStatistics baseballTopPlayersStatistics12 = (BaseballTopPlayersStatistics) obj;
                        baseballTopPlayersStatistics12.getClass();
                        return baseballTopPlayersStatistics12.getFieldingPutOuts();
                    case 23:
                        BaseballTopPlayersStatisticsItem baseballTopPlayersStatisticsItem12 = (BaseballTopPlayersStatisticsItem) obj;
                        baseballTopPlayersStatisticsItem12.getClass();
                        return yid.j(baseballTopPlayersStatisticsItem12.getFieldingPutOuts());
                    case 24:
                        BaseballTopPlayersStatistics baseballTopPlayersStatistics13 = (BaseballTopPlayersStatistics) obj;
                        baseballTopPlayersStatistics13.getClass();
                        return baseballTopPlayersStatistics13.getBattingStolenBases();
                    case 25:
                        BaseballTopPlayersStatistics baseballTopPlayersStatistics14 = (BaseballTopPlayersStatistics) obj;
                        baseballTopPlayersStatistics14.getClass();
                        return baseballTopPlayersStatistics14.getFieldingAssists();
                    case 26:
                        BaseballTopPlayersStatisticsItem baseballTopPlayersStatisticsItem13 = (BaseballTopPlayersStatisticsItem) obj;
                        baseballTopPlayersStatisticsItem13.getClass();
                        return yid.j(baseballTopPlayersStatisticsItem13.getFieldingAssists());
                    case 27:
                        BaseballTopPlayersStatistics baseballTopPlayersStatistics15 = (BaseballTopPlayersStatistics) obj;
                        baseballTopPlayersStatistics15.getClass();
                        return baseballTopPlayersStatistics15.getFieldingTotalErrors();
                    case 28:
                        BaseballTopPlayersStatisticsItem baseballTopPlayersStatisticsItem14 = (BaseballTopPlayersStatisticsItem) obj;
                        baseballTopPlayersStatisticsItem14.getClass();
                        return yid.j(baseballTopPlayersStatisticsItem14.getFieldingTotalErrors());
                    default:
                        BaseballTopPlayersStatistics baseballTopPlayersStatistics16 = (BaseballTopPlayersStatistics) obj;
                        baseballTopPlayersStatistics16.getClass();
                        return baseballTopPlayersStatistics16.getBattingHomeRuns();
                }
            }
        });
        wj1 wj1Var3 = wj1.d;
        final int i27 = 22;
        final int i28 = 23;
        final int i29 = 27;
        final int i30 = 28;
        kab[] kabVarArr = {kabVar, kabVar2, kabVar3, kabVar4, kabVar5, kabVar6, kabVar7, kabVar8, kabVar9, kabVar10, kabVar11, kabVar12, kabVar13, kabVar14, kabVar15, kabVar16, kabVar17, kabVar18, kabVar19, kabVar20, kabVar21, kabVar22, new kab("FIELDING_PUTOUTS", 22, wj1Var3, R.string.baseball_putouts, new Function1() { // from class: iab
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                switch (i27) {
                    case 0:
                        BaseballTopPlayersStatistics baseballTopPlayersStatistics = (BaseballTopPlayersStatistics) obj;
                        baseballTopPlayersStatistics.getClass();
                        return baseballTopPlayersStatistics.getPitchingSaves();
                    case 1:
                        BaseballTopPlayersStatisticsItem baseballTopPlayersStatisticsItem = (BaseballTopPlayersStatisticsItem) obj;
                        baseballTopPlayersStatisticsItem.getClass();
                        return yid.j(baseballTopPlayersStatisticsItem.getPitchingSaves());
                    case 2:
                        BaseballTopPlayersStatistics baseballTopPlayersStatistics2 = (BaseballTopPlayersStatistics) obj;
                        baseballTopPlayersStatistics2.getClass();
                        return baseballTopPlayersStatistics2.getBattingRbi();
                    case 3:
                        BaseballTopPlayersStatistics baseballTopPlayersStatistics3 = (BaseballTopPlayersStatistics) obj;
                        baseballTopPlayersStatistics3.getClass();
                        return baseballTopPlayersStatistics3.getPitchingInningsPitched();
                    case 4:
                        BaseballTopPlayersStatisticsItem baseballTopPlayersStatisticsItem2 = (BaseballTopPlayersStatisticsItem) obj;
                        baseballTopPlayersStatisticsItem2.getClass();
                        return rei.b(1, baseballTopPlayersStatisticsItem2.getPitchingInningsPitched());
                    case 5:
                        BaseballTopPlayersStatistics baseballTopPlayersStatistics4 = (BaseballTopPlayersStatistics) obj;
                        baseballTopPlayersStatistics4.getClass();
                        return baseballTopPlayersStatistics4.getBattingHits();
                    case 6:
                        BaseballTopPlayersStatistics baseballTopPlayersStatistics5 = (BaseballTopPlayersStatistics) obj;
                        baseballTopPlayersStatistics5.getClass();
                        return baseballTopPlayersStatistics5.getPitchingEarnedRunsAverage();
                    case 7:
                        BaseballTopPlayersStatisticsItem baseballTopPlayersStatisticsItem3 = (BaseballTopPlayersStatisticsItem) obj;
                        baseballTopPlayersStatisticsItem3.getClass();
                        return rei.b(2, baseballTopPlayersStatisticsItem3.getPitchingEarnedRunsAverage());
                    case 8:
                        BaseballTopPlayersStatistics baseballTopPlayersStatistics6 = (BaseballTopPlayersStatistics) obj;
                        baseballTopPlayersStatistics6.getClass();
                        return baseballTopPlayersStatistics6.getPitchingStrikeOuts();
                    case 9:
                        BaseballTopPlayersStatisticsItem baseballTopPlayersStatisticsItem4 = (BaseballTopPlayersStatisticsItem) obj;
                        baseballTopPlayersStatisticsItem4.getClass();
                        return yid.j(baseballTopPlayersStatisticsItem4.getPitchingStrikeOuts());
                    case 10:
                        BaseballTopPlayersStatistics baseballTopPlayersStatistics7 = (BaseballTopPlayersStatistics) obj;
                        baseballTopPlayersStatistics7.getClass();
                        return baseballTopPlayersStatistics7.getPitchingQualityStarts();
                    case 11:
                        BaseballTopPlayersStatisticsItem baseballTopPlayersStatisticsItem5 = (BaseballTopPlayersStatisticsItem) obj;
                        baseballTopPlayersStatisticsItem5.getClass();
                        return yid.j(baseballTopPlayersStatisticsItem5.getPitchingQualityStarts());
                    case 12:
                        BaseballTopPlayersStatistics baseballTopPlayersStatistics8 = (BaseballTopPlayersStatistics) obj;
                        baseballTopPlayersStatistics8.getClass();
                        return baseballTopPlayersStatistics8.getPitchingWhip();
                    case 13:
                        BaseballTopPlayersStatisticsItem baseballTopPlayersStatisticsItem6 = (BaseballTopPlayersStatisticsItem) obj;
                        baseballTopPlayersStatisticsItem6.getClass();
                        return yid.j(baseballTopPlayersStatisticsItem6.getBattingRbi());
                    case 14:
                        BaseballTopPlayersStatisticsItem baseballTopPlayersStatisticsItem7 = (BaseballTopPlayersStatisticsItem) obj;
                        baseballTopPlayersStatisticsItem7.getClass();
                        Double pitchingWhip = baseballTopPlayersStatisticsItem7.getPitchingWhip();
                        yid.k(pitchingWhip);
                        String format = new DecimalFormat(".000", new DecimalFormatSymbols(Locale.US)).format(yid.k(pitchingWhip));
                        format.getClass();
                        return format;
                    case 15:
                        BaseballTopPlayersStatistics baseballTopPlayersStatistics9 = (BaseballTopPlayersStatistics) obj;
                        baseballTopPlayersStatistics9.getClass();
                        return baseballTopPlayersStatistics9.getPitchingWar();
                    case 16:
                        BaseballTopPlayersStatisticsItem baseballTopPlayersStatisticsItem8 = (BaseballTopPlayersStatisticsItem) obj;
                        baseballTopPlayersStatisticsItem8.getClass();
                        return rei.b(1, baseballTopPlayersStatisticsItem8.getPitchingWar());
                    case 17:
                        BaseballTopPlayersStatisticsItem baseballTopPlayersStatisticsItem9 = (BaseballTopPlayersStatisticsItem) obj;
                        baseballTopPlayersStatisticsItem9.getClass();
                        return yid.j(baseballTopPlayersStatisticsItem9.getBattingHits());
                    case 18:
                        BaseballTopPlayersStatistics baseballTopPlayersStatistics10 = (BaseballTopPlayersStatistics) obj;
                        baseballTopPlayersStatistics10.getClass();
                        return baseballTopPlayersStatistics10.getPitchingFieldingIndependentPitching();
                    case 19:
                        BaseballTopPlayersStatisticsItem baseballTopPlayersStatisticsItem10 = (BaseballTopPlayersStatisticsItem) obj;
                        baseballTopPlayersStatisticsItem10.getClass();
                        return rei.b(2, baseballTopPlayersStatisticsItem10.getPitchingFieldingIndependentPitching());
                    case 20:
                        BaseballTopPlayersStatistics baseballTopPlayersStatistics11 = (BaseballTopPlayersStatistics) obj;
                        baseballTopPlayersStatistics11.getClass();
                        return baseballTopPlayersStatistics11.getPitchingOpponentBattingAvg();
                    case 21:
                        BaseballTopPlayersStatisticsItem baseballTopPlayersStatisticsItem11 = (BaseballTopPlayersStatisticsItem) obj;
                        baseballTopPlayersStatisticsItem11.getClass();
                        Double pitchingOpponentBattingAvg = baseballTopPlayersStatisticsItem11.getPitchingOpponentBattingAvg();
                        yid.k(pitchingOpponentBattingAvg);
                        String format2 = new DecimalFormat(".000", new DecimalFormatSymbols(Locale.US)).format(yid.k(pitchingOpponentBattingAvg));
                        format2.getClass();
                        return format2;
                    case 22:
                        BaseballTopPlayersStatistics baseballTopPlayersStatistics12 = (BaseballTopPlayersStatistics) obj;
                        baseballTopPlayersStatistics12.getClass();
                        return baseballTopPlayersStatistics12.getFieldingPutOuts();
                    case 23:
                        BaseballTopPlayersStatisticsItem baseballTopPlayersStatisticsItem12 = (BaseballTopPlayersStatisticsItem) obj;
                        baseballTopPlayersStatisticsItem12.getClass();
                        return yid.j(baseballTopPlayersStatisticsItem12.getFieldingPutOuts());
                    case 24:
                        BaseballTopPlayersStatistics baseballTopPlayersStatistics13 = (BaseballTopPlayersStatistics) obj;
                        baseballTopPlayersStatistics13.getClass();
                        return baseballTopPlayersStatistics13.getBattingStolenBases();
                    case 25:
                        BaseballTopPlayersStatistics baseballTopPlayersStatistics14 = (BaseballTopPlayersStatistics) obj;
                        baseballTopPlayersStatistics14.getClass();
                        return baseballTopPlayersStatistics14.getFieldingAssists();
                    case 26:
                        BaseballTopPlayersStatisticsItem baseballTopPlayersStatisticsItem13 = (BaseballTopPlayersStatisticsItem) obj;
                        baseballTopPlayersStatisticsItem13.getClass();
                        return yid.j(baseballTopPlayersStatisticsItem13.getFieldingAssists());
                    case 27:
                        BaseballTopPlayersStatistics baseballTopPlayersStatistics15 = (BaseballTopPlayersStatistics) obj;
                        baseballTopPlayersStatistics15.getClass();
                        return baseballTopPlayersStatistics15.getFieldingTotalErrors();
                    case 28:
                        BaseballTopPlayersStatisticsItem baseballTopPlayersStatisticsItem14 = (BaseballTopPlayersStatisticsItem) obj;
                        baseballTopPlayersStatisticsItem14.getClass();
                        return yid.j(baseballTopPlayersStatisticsItem14.getFieldingTotalErrors());
                    default:
                        BaseballTopPlayersStatistics baseballTopPlayersStatistics16 = (BaseballTopPlayersStatistics) obj;
                        baseballTopPlayersStatistics16.getClass();
                        return baseballTopPlayersStatistics16.getBattingHomeRuns();
                }
            }
        }, new Function1() { // from class: iab
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                switch (i28) {
                    case 0:
                        BaseballTopPlayersStatistics baseballTopPlayersStatistics = (BaseballTopPlayersStatistics) obj;
                        baseballTopPlayersStatistics.getClass();
                        return baseballTopPlayersStatistics.getPitchingSaves();
                    case 1:
                        BaseballTopPlayersStatisticsItem baseballTopPlayersStatisticsItem = (BaseballTopPlayersStatisticsItem) obj;
                        baseballTopPlayersStatisticsItem.getClass();
                        return yid.j(baseballTopPlayersStatisticsItem.getPitchingSaves());
                    case 2:
                        BaseballTopPlayersStatistics baseballTopPlayersStatistics2 = (BaseballTopPlayersStatistics) obj;
                        baseballTopPlayersStatistics2.getClass();
                        return baseballTopPlayersStatistics2.getBattingRbi();
                    case 3:
                        BaseballTopPlayersStatistics baseballTopPlayersStatistics3 = (BaseballTopPlayersStatistics) obj;
                        baseballTopPlayersStatistics3.getClass();
                        return baseballTopPlayersStatistics3.getPitchingInningsPitched();
                    case 4:
                        BaseballTopPlayersStatisticsItem baseballTopPlayersStatisticsItem2 = (BaseballTopPlayersStatisticsItem) obj;
                        baseballTopPlayersStatisticsItem2.getClass();
                        return rei.b(1, baseballTopPlayersStatisticsItem2.getPitchingInningsPitched());
                    case 5:
                        BaseballTopPlayersStatistics baseballTopPlayersStatistics4 = (BaseballTopPlayersStatistics) obj;
                        baseballTopPlayersStatistics4.getClass();
                        return baseballTopPlayersStatistics4.getBattingHits();
                    case 6:
                        BaseballTopPlayersStatistics baseballTopPlayersStatistics5 = (BaseballTopPlayersStatistics) obj;
                        baseballTopPlayersStatistics5.getClass();
                        return baseballTopPlayersStatistics5.getPitchingEarnedRunsAverage();
                    case 7:
                        BaseballTopPlayersStatisticsItem baseballTopPlayersStatisticsItem3 = (BaseballTopPlayersStatisticsItem) obj;
                        baseballTopPlayersStatisticsItem3.getClass();
                        return rei.b(2, baseballTopPlayersStatisticsItem3.getPitchingEarnedRunsAverage());
                    case 8:
                        BaseballTopPlayersStatistics baseballTopPlayersStatistics6 = (BaseballTopPlayersStatistics) obj;
                        baseballTopPlayersStatistics6.getClass();
                        return baseballTopPlayersStatistics6.getPitchingStrikeOuts();
                    case 9:
                        BaseballTopPlayersStatisticsItem baseballTopPlayersStatisticsItem4 = (BaseballTopPlayersStatisticsItem) obj;
                        baseballTopPlayersStatisticsItem4.getClass();
                        return yid.j(baseballTopPlayersStatisticsItem4.getPitchingStrikeOuts());
                    case 10:
                        BaseballTopPlayersStatistics baseballTopPlayersStatistics7 = (BaseballTopPlayersStatistics) obj;
                        baseballTopPlayersStatistics7.getClass();
                        return baseballTopPlayersStatistics7.getPitchingQualityStarts();
                    case 11:
                        BaseballTopPlayersStatisticsItem baseballTopPlayersStatisticsItem5 = (BaseballTopPlayersStatisticsItem) obj;
                        baseballTopPlayersStatisticsItem5.getClass();
                        return yid.j(baseballTopPlayersStatisticsItem5.getPitchingQualityStarts());
                    case 12:
                        BaseballTopPlayersStatistics baseballTopPlayersStatistics8 = (BaseballTopPlayersStatistics) obj;
                        baseballTopPlayersStatistics8.getClass();
                        return baseballTopPlayersStatistics8.getPitchingWhip();
                    case 13:
                        BaseballTopPlayersStatisticsItem baseballTopPlayersStatisticsItem6 = (BaseballTopPlayersStatisticsItem) obj;
                        baseballTopPlayersStatisticsItem6.getClass();
                        return yid.j(baseballTopPlayersStatisticsItem6.getBattingRbi());
                    case 14:
                        BaseballTopPlayersStatisticsItem baseballTopPlayersStatisticsItem7 = (BaseballTopPlayersStatisticsItem) obj;
                        baseballTopPlayersStatisticsItem7.getClass();
                        Double pitchingWhip = baseballTopPlayersStatisticsItem7.getPitchingWhip();
                        yid.k(pitchingWhip);
                        String format = new DecimalFormat(".000", new DecimalFormatSymbols(Locale.US)).format(yid.k(pitchingWhip));
                        format.getClass();
                        return format;
                    case 15:
                        BaseballTopPlayersStatistics baseballTopPlayersStatistics9 = (BaseballTopPlayersStatistics) obj;
                        baseballTopPlayersStatistics9.getClass();
                        return baseballTopPlayersStatistics9.getPitchingWar();
                    case 16:
                        BaseballTopPlayersStatisticsItem baseballTopPlayersStatisticsItem8 = (BaseballTopPlayersStatisticsItem) obj;
                        baseballTopPlayersStatisticsItem8.getClass();
                        return rei.b(1, baseballTopPlayersStatisticsItem8.getPitchingWar());
                    case 17:
                        BaseballTopPlayersStatisticsItem baseballTopPlayersStatisticsItem9 = (BaseballTopPlayersStatisticsItem) obj;
                        baseballTopPlayersStatisticsItem9.getClass();
                        return yid.j(baseballTopPlayersStatisticsItem9.getBattingHits());
                    case 18:
                        BaseballTopPlayersStatistics baseballTopPlayersStatistics10 = (BaseballTopPlayersStatistics) obj;
                        baseballTopPlayersStatistics10.getClass();
                        return baseballTopPlayersStatistics10.getPitchingFieldingIndependentPitching();
                    case 19:
                        BaseballTopPlayersStatisticsItem baseballTopPlayersStatisticsItem10 = (BaseballTopPlayersStatisticsItem) obj;
                        baseballTopPlayersStatisticsItem10.getClass();
                        return rei.b(2, baseballTopPlayersStatisticsItem10.getPitchingFieldingIndependentPitching());
                    case 20:
                        BaseballTopPlayersStatistics baseballTopPlayersStatistics11 = (BaseballTopPlayersStatistics) obj;
                        baseballTopPlayersStatistics11.getClass();
                        return baseballTopPlayersStatistics11.getPitchingOpponentBattingAvg();
                    case 21:
                        BaseballTopPlayersStatisticsItem baseballTopPlayersStatisticsItem11 = (BaseballTopPlayersStatisticsItem) obj;
                        baseballTopPlayersStatisticsItem11.getClass();
                        Double pitchingOpponentBattingAvg = baseballTopPlayersStatisticsItem11.getPitchingOpponentBattingAvg();
                        yid.k(pitchingOpponentBattingAvg);
                        String format2 = new DecimalFormat(".000", new DecimalFormatSymbols(Locale.US)).format(yid.k(pitchingOpponentBattingAvg));
                        format2.getClass();
                        return format2;
                    case 22:
                        BaseballTopPlayersStatistics baseballTopPlayersStatistics12 = (BaseballTopPlayersStatistics) obj;
                        baseballTopPlayersStatistics12.getClass();
                        return baseballTopPlayersStatistics12.getFieldingPutOuts();
                    case 23:
                        BaseballTopPlayersStatisticsItem baseballTopPlayersStatisticsItem12 = (BaseballTopPlayersStatisticsItem) obj;
                        baseballTopPlayersStatisticsItem12.getClass();
                        return yid.j(baseballTopPlayersStatisticsItem12.getFieldingPutOuts());
                    case 24:
                        BaseballTopPlayersStatistics baseballTopPlayersStatistics13 = (BaseballTopPlayersStatistics) obj;
                        baseballTopPlayersStatistics13.getClass();
                        return baseballTopPlayersStatistics13.getBattingStolenBases();
                    case 25:
                        BaseballTopPlayersStatistics baseballTopPlayersStatistics14 = (BaseballTopPlayersStatistics) obj;
                        baseballTopPlayersStatistics14.getClass();
                        return baseballTopPlayersStatistics14.getFieldingAssists();
                    case 26:
                        BaseballTopPlayersStatisticsItem baseballTopPlayersStatisticsItem13 = (BaseballTopPlayersStatisticsItem) obj;
                        baseballTopPlayersStatisticsItem13.getClass();
                        return yid.j(baseballTopPlayersStatisticsItem13.getFieldingAssists());
                    case 27:
                        BaseballTopPlayersStatistics baseballTopPlayersStatistics15 = (BaseballTopPlayersStatistics) obj;
                        baseballTopPlayersStatistics15.getClass();
                        return baseballTopPlayersStatistics15.getFieldingTotalErrors();
                    case 28:
                        BaseballTopPlayersStatisticsItem baseballTopPlayersStatisticsItem14 = (BaseballTopPlayersStatisticsItem) obj;
                        baseballTopPlayersStatisticsItem14.getClass();
                        return yid.j(baseballTopPlayersStatisticsItem14.getFieldingTotalErrors());
                    default:
                        BaseballTopPlayersStatistics baseballTopPlayersStatistics16 = (BaseballTopPlayersStatistics) obj;
                        baseballTopPlayersStatistics16.getClass();
                        return baseballTopPlayersStatistics16.getBattingHomeRuns();
                }
            }
        }), new kab("FIELDING_ASSISTS", 23, wj1Var3, R.string.baseball_assists, new Function1() { // from class: iab
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                switch (i11) {
                    case 0:
                        BaseballTopPlayersStatistics baseballTopPlayersStatistics = (BaseballTopPlayersStatistics) obj;
                        baseballTopPlayersStatistics.getClass();
                        return baseballTopPlayersStatistics.getPitchingSaves();
                    case 1:
                        BaseballTopPlayersStatisticsItem baseballTopPlayersStatisticsItem = (BaseballTopPlayersStatisticsItem) obj;
                        baseballTopPlayersStatisticsItem.getClass();
                        return yid.j(baseballTopPlayersStatisticsItem.getPitchingSaves());
                    case 2:
                        BaseballTopPlayersStatistics baseballTopPlayersStatistics2 = (BaseballTopPlayersStatistics) obj;
                        baseballTopPlayersStatistics2.getClass();
                        return baseballTopPlayersStatistics2.getBattingRbi();
                    case 3:
                        BaseballTopPlayersStatistics baseballTopPlayersStatistics3 = (BaseballTopPlayersStatistics) obj;
                        baseballTopPlayersStatistics3.getClass();
                        return baseballTopPlayersStatistics3.getPitchingInningsPitched();
                    case 4:
                        BaseballTopPlayersStatisticsItem baseballTopPlayersStatisticsItem2 = (BaseballTopPlayersStatisticsItem) obj;
                        baseballTopPlayersStatisticsItem2.getClass();
                        return rei.b(1, baseballTopPlayersStatisticsItem2.getPitchingInningsPitched());
                    case 5:
                        BaseballTopPlayersStatistics baseballTopPlayersStatistics4 = (BaseballTopPlayersStatistics) obj;
                        baseballTopPlayersStatistics4.getClass();
                        return baseballTopPlayersStatistics4.getBattingHits();
                    case 6:
                        BaseballTopPlayersStatistics baseballTopPlayersStatistics5 = (BaseballTopPlayersStatistics) obj;
                        baseballTopPlayersStatistics5.getClass();
                        return baseballTopPlayersStatistics5.getPitchingEarnedRunsAverage();
                    case 7:
                        BaseballTopPlayersStatisticsItem baseballTopPlayersStatisticsItem3 = (BaseballTopPlayersStatisticsItem) obj;
                        baseballTopPlayersStatisticsItem3.getClass();
                        return rei.b(2, baseballTopPlayersStatisticsItem3.getPitchingEarnedRunsAverage());
                    case 8:
                        BaseballTopPlayersStatistics baseballTopPlayersStatistics6 = (BaseballTopPlayersStatistics) obj;
                        baseballTopPlayersStatistics6.getClass();
                        return baseballTopPlayersStatistics6.getPitchingStrikeOuts();
                    case 9:
                        BaseballTopPlayersStatisticsItem baseballTopPlayersStatisticsItem4 = (BaseballTopPlayersStatisticsItem) obj;
                        baseballTopPlayersStatisticsItem4.getClass();
                        return yid.j(baseballTopPlayersStatisticsItem4.getPitchingStrikeOuts());
                    case 10:
                        BaseballTopPlayersStatistics baseballTopPlayersStatistics7 = (BaseballTopPlayersStatistics) obj;
                        baseballTopPlayersStatistics7.getClass();
                        return baseballTopPlayersStatistics7.getPitchingQualityStarts();
                    case 11:
                        BaseballTopPlayersStatisticsItem baseballTopPlayersStatisticsItem5 = (BaseballTopPlayersStatisticsItem) obj;
                        baseballTopPlayersStatisticsItem5.getClass();
                        return yid.j(baseballTopPlayersStatisticsItem5.getPitchingQualityStarts());
                    case 12:
                        BaseballTopPlayersStatistics baseballTopPlayersStatistics8 = (BaseballTopPlayersStatistics) obj;
                        baseballTopPlayersStatistics8.getClass();
                        return baseballTopPlayersStatistics8.getPitchingWhip();
                    case 13:
                        BaseballTopPlayersStatisticsItem baseballTopPlayersStatisticsItem6 = (BaseballTopPlayersStatisticsItem) obj;
                        baseballTopPlayersStatisticsItem6.getClass();
                        return yid.j(baseballTopPlayersStatisticsItem6.getBattingRbi());
                    case 14:
                        BaseballTopPlayersStatisticsItem baseballTopPlayersStatisticsItem7 = (BaseballTopPlayersStatisticsItem) obj;
                        baseballTopPlayersStatisticsItem7.getClass();
                        Double pitchingWhip = baseballTopPlayersStatisticsItem7.getPitchingWhip();
                        yid.k(pitchingWhip);
                        String format = new DecimalFormat(".000", new DecimalFormatSymbols(Locale.US)).format(yid.k(pitchingWhip));
                        format.getClass();
                        return format;
                    case 15:
                        BaseballTopPlayersStatistics baseballTopPlayersStatistics9 = (BaseballTopPlayersStatistics) obj;
                        baseballTopPlayersStatistics9.getClass();
                        return baseballTopPlayersStatistics9.getPitchingWar();
                    case 16:
                        BaseballTopPlayersStatisticsItem baseballTopPlayersStatisticsItem8 = (BaseballTopPlayersStatisticsItem) obj;
                        baseballTopPlayersStatisticsItem8.getClass();
                        return rei.b(1, baseballTopPlayersStatisticsItem8.getPitchingWar());
                    case 17:
                        BaseballTopPlayersStatisticsItem baseballTopPlayersStatisticsItem9 = (BaseballTopPlayersStatisticsItem) obj;
                        baseballTopPlayersStatisticsItem9.getClass();
                        return yid.j(baseballTopPlayersStatisticsItem9.getBattingHits());
                    case 18:
                        BaseballTopPlayersStatistics baseballTopPlayersStatistics10 = (BaseballTopPlayersStatistics) obj;
                        baseballTopPlayersStatistics10.getClass();
                        return baseballTopPlayersStatistics10.getPitchingFieldingIndependentPitching();
                    case 19:
                        BaseballTopPlayersStatisticsItem baseballTopPlayersStatisticsItem10 = (BaseballTopPlayersStatisticsItem) obj;
                        baseballTopPlayersStatisticsItem10.getClass();
                        return rei.b(2, baseballTopPlayersStatisticsItem10.getPitchingFieldingIndependentPitching());
                    case 20:
                        BaseballTopPlayersStatistics baseballTopPlayersStatistics11 = (BaseballTopPlayersStatistics) obj;
                        baseballTopPlayersStatistics11.getClass();
                        return baseballTopPlayersStatistics11.getPitchingOpponentBattingAvg();
                    case 21:
                        BaseballTopPlayersStatisticsItem baseballTopPlayersStatisticsItem11 = (BaseballTopPlayersStatisticsItem) obj;
                        baseballTopPlayersStatisticsItem11.getClass();
                        Double pitchingOpponentBattingAvg = baseballTopPlayersStatisticsItem11.getPitchingOpponentBattingAvg();
                        yid.k(pitchingOpponentBattingAvg);
                        String format2 = new DecimalFormat(".000", new DecimalFormatSymbols(Locale.US)).format(yid.k(pitchingOpponentBattingAvg));
                        format2.getClass();
                        return format2;
                    case 22:
                        BaseballTopPlayersStatistics baseballTopPlayersStatistics12 = (BaseballTopPlayersStatistics) obj;
                        baseballTopPlayersStatistics12.getClass();
                        return baseballTopPlayersStatistics12.getFieldingPutOuts();
                    case 23:
                        BaseballTopPlayersStatisticsItem baseballTopPlayersStatisticsItem12 = (BaseballTopPlayersStatisticsItem) obj;
                        baseballTopPlayersStatisticsItem12.getClass();
                        return yid.j(baseballTopPlayersStatisticsItem12.getFieldingPutOuts());
                    case 24:
                        BaseballTopPlayersStatistics baseballTopPlayersStatistics13 = (BaseballTopPlayersStatistics) obj;
                        baseballTopPlayersStatistics13.getClass();
                        return baseballTopPlayersStatistics13.getBattingStolenBases();
                    case 25:
                        BaseballTopPlayersStatistics baseballTopPlayersStatistics14 = (BaseballTopPlayersStatistics) obj;
                        baseballTopPlayersStatistics14.getClass();
                        return baseballTopPlayersStatistics14.getFieldingAssists();
                    case 26:
                        BaseballTopPlayersStatisticsItem baseballTopPlayersStatisticsItem13 = (BaseballTopPlayersStatisticsItem) obj;
                        baseballTopPlayersStatisticsItem13.getClass();
                        return yid.j(baseballTopPlayersStatisticsItem13.getFieldingAssists());
                    case 27:
                        BaseballTopPlayersStatistics baseballTopPlayersStatistics15 = (BaseballTopPlayersStatistics) obj;
                        baseballTopPlayersStatistics15.getClass();
                        return baseballTopPlayersStatistics15.getFieldingTotalErrors();
                    case 28:
                        BaseballTopPlayersStatisticsItem baseballTopPlayersStatisticsItem14 = (BaseballTopPlayersStatisticsItem) obj;
                        baseballTopPlayersStatisticsItem14.getClass();
                        return yid.j(baseballTopPlayersStatisticsItem14.getFieldingTotalErrors());
                    default:
                        BaseballTopPlayersStatistics baseballTopPlayersStatistics16 = (BaseballTopPlayersStatistics) obj;
                        baseballTopPlayersStatistics16.getClass();
                        return baseballTopPlayersStatistics16.getBattingHomeRuns();
                }
            }
        }, new Function1() { // from class: iab
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                switch (i12) {
                    case 0:
                        BaseballTopPlayersStatistics baseballTopPlayersStatistics = (BaseballTopPlayersStatistics) obj;
                        baseballTopPlayersStatistics.getClass();
                        return baseballTopPlayersStatistics.getPitchingSaves();
                    case 1:
                        BaseballTopPlayersStatisticsItem baseballTopPlayersStatisticsItem = (BaseballTopPlayersStatisticsItem) obj;
                        baseballTopPlayersStatisticsItem.getClass();
                        return yid.j(baseballTopPlayersStatisticsItem.getPitchingSaves());
                    case 2:
                        BaseballTopPlayersStatistics baseballTopPlayersStatistics2 = (BaseballTopPlayersStatistics) obj;
                        baseballTopPlayersStatistics2.getClass();
                        return baseballTopPlayersStatistics2.getBattingRbi();
                    case 3:
                        BaseballTopPlayersStatistics baseballTopPlayersStatistics3 = (BaseballTopPlayersStatistics) obj;
                        baseballTopPlayersStatistics3.getClass();
                        return baseballTopPlayersStatistics3.getPitchingInningsPitched();
                    case 4:
                        BaseballTopPlayersStatisticsItem baseballTopPlayersStatisticsItem2 = (BaseballTopPlayersStatisticsItem) obj;
                        baseballTopPlayersStatisticsItem2.getClass();
                        return rei.b(1, baseballTopPlayersStatisticsItem2.getPitchingInningsPitched());
                    case 5:
                        BaseballTopPlayersStatistics baseballTopPlayersStatistics4 = (BaseballTopPlayersStatistics) obj;
                        baseballTopPlayersStatistics4.getClass();
                        return baseballTopPlayersStatistics4.getBattingHits();
                    case 6:
                        BaseballTopPlayersStatistics baseballTopPlayersStatistics5 = (BaseballTopPlayersStatistics) obj;
                        baseballTopPlayersStatistics5.getClass();
                        return baseballTopPlayersStatistics5.getPitchingEarnedRunsAverage();
                    case 7:
                        BaseballTopPlayersStatisticsItem baseballTopPlayersStatisticsItem3 = (BaseballTopPlayersStatisticsItem) obj;
                        baseballTopPlayersStatisticsItem3.getClass();
                        return rei.b(2, baseballTopPlayersStatisticsItem3.getPitchingEarnedRunsAverage());
                    case 8:
                        BaseballTopPlayersStatistics baseballTopPlayersStatistics6 = (BaseballTopPlayersStatistics) obj;
                        baseballTopPlayersStatistics6.getClass();
                        return baseballTopPlayersStatistics6.getPitchingStrikeOuts();
                    case 9:
                        BaseballTopPlayersStatisticsItem baseballTopPlayersStatisticsItem4 = (BaseballTopPlayersStatisticsItem) obj;
                        baseballTopPlayersStatisticsItem4.getClass();
                        return yid.j(baseballTopPlayersStatisticsItem4.getPitchingStrikeOuts());
                    case 10:
                        BaseballTopPlayersStatistics baseballTopPlayersStatistics7 = (BaseballTopPlayersStatistics) obj;
                        baseballTopPlayersStatistics7.getClass();
                        return baseballTopPlayersStatistics7.getPitchingQualityStarts();
                    case 11:
                        BaseballTopPlayersStatisticsItem baseballTopPlayersStatisticsItem5 = (BaseballTopPlayersStatisticsItem) obj;
                        baseballTopPlayersStatisticsItem5.getClass();
                        return yid.j(baseballTopPlayersStatisticsItem5.getPitchingQualityStarts());
                    case 12:
                        BaseballTopPlayersStatistics baseballTopPlayersStatistics8 = (BaseballTopPlayersStatistics) obj;
                        baseballTopPlayersStatistics8.getClass();
                        return baseballTopPlayersStatistics8.getPitchingWhip();
                    case 13:
                        BaseballTopPlayersStatisticsItem baseballTopPlayersStatisticsItem6 = (BaseballTopPlayersStatisticsItem) obj;
                        baseballTopPlayersStatisticsItem6.getClass();
                        return yid.j(baseballTopPlayersStatisticsItem6.getBattingRbi());
                    case 14:
                        BaseballTopPlayersStatisticsItem baseballTopPlayersStatisticsItem7 = (BaseballTopPlayersStatisticsItem) obj;
                        baseballTopPlayersStatisticsItem7.getClass();
                        Double pitchingWhip = baseballTopPlayersStatisticsItem7.getPitchingWhip();
                        yid.k(pitchingWhip);
                        String format = new DecimalFormat(".000", new DecimalFormatSymbols(Locale.US)).format(yid.k(pitchingWhip));
                        format.getClass();
                        return format;
                    case 15:
                        BaseballTopPlayersStatistics baseballTopPlayersStatistics9 = (BaseballTopPlayersStatistics) obj;
                        baseballTopPlayersStatistics9.getClass();
                        return baseballTopPlayersStatistics9.getPitchingWar();
                    case 16:
                        BaseballTopPlayersStatisticsItem baseballTopPlayersStatisticsItem8 = (BaseballTopPlayersStatisticsItem) obj;
                        baseballTopPlayersStatisticsItem8.getClass();
                        return rei.b(1, baseballTopPlayersStatisticsItem8.getPitchingWar());
                    case 17:
                        BaseballTopPlayersStatisticsItem baseballTopPlayersStatisticsItem9 = (BaseballTopPlayersStatisticsItem) obj;
                        baseballTopPlayersStatisticsItem9.getClass();
                        return yid.j(baseballTopPlayersStatisticsItem9.getBattingHits());
                    case 18:
                        BaseballTopPlayersStatistics baseballTopPlayersStatistics10 = (BaseballTopPlayersStatistics) obj;
                        baseballTopPlayersStatistics10.getClass();
                        return baseballTopPlayersStatistics10.getPitchingFieldingIndependentPitching();
                    case 19:
                        BaseballTopPlayersStatisticsItem baseballTopPlayersStatisticsItem10 = (BaseballTopPlayersStatisticsItem) obj;
                        baseballTopPlayersStatisticsItem10.getClass();
                        return rei.b(2, baseballTopPlayersStatisticsItem10.getPitchingFieldingIndependentPitching());
                    case 20:
                        BaseballTopPlayersStatistics baseballTopPlayersStatistics11 = (BaseballTopPlayersStatistics) obj;
                        baseballTopPlayersStatistics11.getClass();
                        return baseballTopPlayersStatistics11.getPitchingOpponentBattingAvg();
                    case 21:
                        BaseballTopPlayersStatisticsItem baseballTopPlayersStatisticsItem11 = (BaseballTopPlayersStatisticsItem) obj;
                        baseballTopPlayersStatisticsItem11.getClass();
                        Double pitchingOpponentBattingAvg = baseballTopPlayersStatisticsItem11.getPitchingOpponentBattingAvg();
                        yid.k(pitchingOpponentBattingAvg);
                        String format2 = new DecimalFormat(".000", new DecimalFormatSymbols(Locale.US)).format(yid.k(pitchingOpponentBattingAvg));
                        format2.getClass();
                        return format2;
                    case 22:
                        BaseballTopPlayersStatistics baseballTopPlayersStatistics12 = (BaseballTopPlayersStatistics) obj;
                        baseballTopPlayersStatistics12.getClass();
                        return baseballTopPlayersStatistics12.getFieldingPutOuts();
                    case 23:
                        BaseballTopPlayersStatisticsItem baseballTopPlayersStatisticsItem12 = (BaseballTopPlayersStatisticsItem) obj;
                        baseballTopPlayersStatisticsItem12.getClass();
                        return yid.j(baseballTopPlayersStatisticsItem12.getFieldingPutOuts());
                    case 24:
                        BaseballTopPlayersStatistics baseballTopPlayersStatistics13 = (BaseballTopPlayersStatistics) obj;
                        baseballTopPlayersStatistics13.getClass();
                        return baseballTopPlayersStatistics13.getBattingStolenBases();
                    case 25:
                        BaseballTopPlayersStatistics baseballTopPlayersStatistics14 = (BaseballTopPlayersStatistics) obj;
                        baseballTopPlayersStatistics14.getClass();
                        return baseballTopPlayersStatistics14.getFieldingAssists();
                    case 26:
                        BaseballTopPlayersStatisticsItem baseballTopPlayersStatisticsItem13 = (BaseballTopPlayersStatisticsItem) obj;
                        baseballTopPlayersStatisticsItem13.getClass();
                        return yid.j(baseballTopPlayersStatisticsItem13.getFieldingAssists());
                    case 27:
                        BaseballTopPlayersStatistics baseballTopPlayersStatistics15 = (BaseballTopPlayersStatistics) obj;
                        baseballTopPlayersStatistics15.getClass();
                        return baseballTopPlayersStatistics15.getFieldingTotalErrors();
                    case 28:
                        BaseballTopPlayersStatisticsItem baseballTopPlayersStatisticsItem14 = (BaseballTopPlayersStatisticsItem) obj;
                        baseballTopPlayersStatisticsItem14.getClass();
                        return yid.j(baseballTopPlayersStatisticsItem14.getFieldingTotalErrors());
                    default:
                        BaseballTopPlayersStatistics baseballTopPlayersStatistics16 = (BaseballTopPlayersStatistics) obj;
                        baseballTopPlayersStatistics16.getClass();
                        return baseballTopPlayersStatistics16.getBattingHomeRuns();
                }
            }
        }), new kab("FIELDING_ERRORS", 24, wj1Var3, R.string.baseball_errors, new Function1() { // from class: iab
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                switch (i29) {
                    case 0:
                        BaseballTopPlayersStatistics baseballTopPlayersStatistics = (BaseballTopPlayersStatistics) obj;
                        baseballTopPlayersStatistics.getClass();
                        return baseballTopPlayersStatistics.getPitchingSaves();
                    case 1:
                        BaseballTopPlayersStatisticsItem baseballTopPlayersStatisticsItem = (BaseballTopPlayersStatisticsItem) obj;
                        baseballTopPlayersStatisticsItem.getClass();
                        return yid.j(baseballTopPlayersStatisticsItem.getPitchingSaves());
                    case 2:
                        BaseballTopPlayersStatistics baseballTopPlayersStatistics2 = (BaseballTopPlayersStatistics) obj;
                        baseballTopPlayersStatistics2.getClass();
                        return baseballTopPlayersStatistics2.getBattingRbi();
                    case 3:
                        BaseballTopPlayersStatistics baseballTopPlayersStatistics3 = (BaseballTopPlayersStatistics) obj;
                        baseballTopPlayersStatistics3.getClass();
                        return baseballTopPlayersStatistics3.getPitchingInningsPitched();
                    case 4:
                        BaseballTopPlayersStatisticsItem baseballTopPlayersStatisticsItem2 = (BaseballTopPlayersStatisticsItem) obj;
                        baseballTopPlayersStatisticsItem2.getClass();
                        return rei.b(1, baseballTopPlayersStatisticsItem2.getPitchingInningsPitched());
                    case 5:
                        BaseballTopPlayersStatistics baseballTopPlayersStatistics4 = (BaseballTopPlayersStatistics) obj;
                        baseballTopPlayersStatistics4.getClass();
                        return baseballTopPlayersStatistics4.getBattingHits();
                    case 6:
                        BaseballTopPlayersStatistics baseballTopPlayersStatistics5 = (BaseballTopPlayersStatistics) obj;
                        baseballTopPlayersStatistics5.getClass();
                        return baseballTopPlayersStatistics5.getPitchingEarnedRunsAverage();
                    case 7:
                        BaseballTopPlayersStatisticsItem baseballTopPlayersStatisticsItem3 = (BaseballTopPlayersStatisticsItem) obj;
                        baseballTopPlayersStatisticsItem3.getClass();
                        return rei.b(2, baseballTopPlayersStatisticsItem3.getPitchingEarnedRunsAverage());
                    case 8:
                        BaseballTopPlayersStatistics baseballTopPlayersStatistics6 = (BaseballTopPlayersStatistics) obj;
                        baseballTopPlayersStatistics6.getClass();
                        return baseballTopPlayersStatistics6.getPitchingStrikeOuts();
                    case 9:
                        BaseballTopPlayersStatisticsItem baseballTopPlayersStatisticsItem4 = (BaseballTopPlayersStatisticsItem) obj;
                        baseballTopPlayersStatisticsItem4.getClass();
                        return yid.j(baseballTopPlayersStatisticsItem4.getPitchingStrikeOuts());
                    case 10:
                        BaseballTopPlayersStatistics baseballTopPlayersStatistics7 = (BaseballTopPlayersStatistics) obj;
                        baseballTopPlayersStatistics7.getClass();
                        return baseballTopPlayersStatistics7.getPitchingQualityStarts();
                    case 11:
                        BaseballTopPlayersStatisticsItem baseballTopPlayersStatisticsItem5 = (BaseballTopPlayersStatisticsItem) obj;
                        baseballTopPlayersStatisticsItem5.getClass();
                        return yid.j(baseballTopPlayersStatisticsItem5.getPitchingQualityStarts());
                    case 12:
                        BaseballTopPlayersStatistics baseballTopPlayersStatistics8 = (BaseballTopPlayersStatistics) obj;
                        baseballTopPlayersStatistics8.getClass();
                        return baseballTopPlayersStatistics8.getPitchingWhip();
                    case 13:
                        BaseballTopPlayersStatisticsItem baseballTopPlayersStatisticsItem6 = (BaseballTopPlayersStatisticsItem) obj;
                        baseballTopPlayersStatisticsItem6.getClass();
                        return yid.j(baseballTopPlayersStatisticsItem6.getBattingRbi());
                    case 14:
                        BaseballTopPlayersStatisticsItem baseballTopPlayersStatisticsItem7 = (BaseballTopPlayersStatisticsItem) obj;
                        baseballTopPlayersStatisticsItem7.getClass();
                        Double pitchingWhip = baseballTopPlayersStatisticsItem7.getPitchingWhip();
                        yid.k(pitchingWhip);
                        String format = new DecimalFormat(".000", new DecimalFormatSymbols(Locale.US)).format(yid.k(pitchingWhip));
                        format.getClass();
                        return format;
                    case 15:
                        BaseballTopPlayersStatistics baseballTopPlayersStatistics9 = (BaseballTopPlayersStatistics) obj;
                        baseballTopPlayersStatistics9.getClass();
                        return baseballTopPlayersStatistics9.getPitchingWar();
                    case 16:
                        BaseballTopPlayersStatisticsItem baseballTopPlayersStatisticsItem8 = (BaseballTopPlayersStatisticsItem) obj;
                        baseballTopPlayersStatisticsItem8.getClass();
                        return rei.b(1, baseballTopPlayersStatisticsItem8.getPitchingWar());
                    case 17:
                        BaseballTopPlayersStatisticsItem baseballTopPlayersStatisticsItem9 = (BaseballTopPlayersStatisticsItem) obj;
                        baseballTopPlayersStatisticsItem9.getClass();
                        return yid.j(baseballTopPlayersStatisticsItem9.getBattingHits());
                    case 18:
                        BaseballTopPlayersStatistics baseballTopPlayersStatistics10 = (BaseballTopPlayersStatistics) obj;
                        baseballTopPlayersStatistics10.getClass();
                        return baseballTopPlayersStatistics10.getPitchingFieldingIndependentPitching();
                    case 19:
                        BaseballTopPlayersStatisticsItem baseballTopPlayersStatisticsItem10 = (BaseballTopPlayersStatisticsItem) obj;
                        baseballTopPlayersStatisticsItem10.getClass();
                        return rei.b(2, baseballTopPlayersStatisticsItem10.getPitchingFieldingIndependentPitching());
                    case 20:
                        BaseballTopPlayersStatistics baseballTopPlayersStatistics11 = (BaseballTopPlayersStatistics) obj;
                        baseballTopPlayersStatistics11.getClass();
                        return baseballTopPlayersStatistics11.getPitchingOpponentBattingAvg();
                    case 21:
                        BaseballTopPlayersStatisticsItem baseballTopPlayersStatisticsItem11 = (BaseballTopPlayersStatisticsItem) obj;
                        baseballTopPlayersStatisticsItem11.getClass();
                        Double pitchingOpponentBattingAvg = baseballTopPlayersStatisticsItem11.getPitchingOpponentBattingAvg();
                        yid.k(pitchingOpponentBattingAvg);
                        String format2 = new DecimalFormat(".000", new DecimalFormatSymbols(Locale.US)).format(yid.k(pitchingOpponentBattingAvg));
                        format2.getClass();
                        return format2;
                    case 22:
                        BaseballTopPlayersStatistics baseballTopPlayersStatistics12 = (BaseballTopPlayersStatistics) obj;
                        baseballTopPlayersStatistics12.getClass();
                        return baseballTopPlayersStatistics12.getFieldingPutOuts();
                    case 23:
                        BaseballTopPlayersStatisticsItem baseballTopPlayersStatisticsItem12 = (BaseballTopPlayersStatisticsItem) obj;
                        baseballTopPlayersStatisticsItem12.getClass();
                        return yid.j(baseballTopPlayersStatisticsItem12.getFieldingPutOuts());
                    case 24:
                        BaseballTopPlayersStatistics baseballTopPlayersStatistics13 = (BaseballTopPlayersStatistics) obj;
                        baseballTopPlayersStatistics13.getClass();
                        return baseballTopPlayersStatistics13.getBattingStolenBases();
                    case 25:
                        BaseballTopPlayersStatistics baseballTopPlayersStatistics14 = (BaseballTopPlayersStatistics) obj;
                        baseballTopPlayersStatistics14.getClass();
                        return baseballTopPlayersStatistics14.getFieldingAssists();
                    case 26:
                        BaseballTopPlayersStatisticsItem baseballTopPlayersStatisticsItem13 = (BaseballTopPlayersStatisticsItem) obj;
                        baseballTopPlayersStatisticsItem13.getClass();
                        return yid.j(baseballTopPlayersStatisticsItem13.getFieldingAssists());
                    case 27:
                        BaseballTopPlayersStatistics baseballTopPlayersStatistics15 = (BaseballTopPlayersStatistics) obj;
                        baseballTopPlayersStatistics15.getClass();
                        return baseballTopPlayersStatistics15.getFieldingTotalErrors();
                    case 28:
                        BaseballTopPlayersStatisticsItem baseballTopPlayersStatisticsItem14 = (BaseballTopPlayersStatisticsItem) obj;
                        baseballTopPlayersStatisticsItem14.getClass();
                        return yid.j(baseballTopPlayersStatisticsItem14.getFieldingTotalErrors());
                    default:
                        BaseballTopPlayersStatistics baseballTopPlayersStatistics16 = (BaseballTopPlayersStatistics) obj;
                        baseballTopPlayersStatistics16.getClass();
                        return baseballTopPlayersStatistics16.getBattingHomeRuns();
                }
            }
        }, new Function1() { // from class: iab
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                switch (i30) {
                    case 0:
                        BaseballTopPlayersStatistics baseballTopPlayersStatistics = (BaseballTopPlayersStatistics) obj;
                        baseballTopPlayersStatistics.getClass();
                        return baseballTopPlayersStatistics.getPitchingSaves();
                    case 1:
                        BaseballTopPlayersStatisticsItem baseballTopPlayersStatisticsItem = (BaseballTopPlayersStatisticsItem) obj;
                        baseballTopPlayersStatisticsItem.getClass();
                        return yid.j(baseballTopPlayersStatisticsItem.getPitchingSaves());
                    case 2:
                        BaseballTopPlayersStatistics baseballTopPlayersStatistics2 = (BaseballTopPlayersStatistics) obj;
                        baseballTopPlayersStatistics2.getClass();
                        return baseballTopPlayersStatistics2.getBattingRbi();
                    case 3:
                        BaseballTopPlayersStatistics baseballTopPlayersStatistics3 = (BaseballTopPlayersStatistics) obj;
                        baseballTopPlayersStatistics3.getClass();
                        return baseballTopPlayersStatistics3.getPitchingInningsPitched();
                    case 4:
                        BaseballTopPlayersStatisticsItem baseballTopPlayersStatisticsItem2 = (BaseballTopPlayersStatisticsItem) obj;
                        baseballTopPlayersStatisticsItem2.getClass();
                        return rei.b(1, baseballTopPlayersStatisticsItem2.getPitchingInningsPitched());
                    case 5:
                        BaseballTopPlayersStatistics baseballTopPlayersStatistics4 = (BaseballTopPlayersStatistics) obj;
                        baseballTopPlayersStatistics4.getClass();
                        return baseballTopPlayersStatistics4.getBattingHits();
                    case 6:
                        BaseballTopPlayersStatistics baseballTopPlayersStatistics5 = (BaseballTopPlayersStatistics) obj;
                        baseballTopPlayersStatistics5.getClass();
                        return baseballTopPlayersStatistics5.getPitchingEarnedRunsAverage();
                    case 7:
                        BaseballTopPlayersStatisticsItem baseballTopPlayersStatisticsItem3 = (BaseballTopPlayersStatisticsItem) obj;
                        baseballTopPlayersStatisticsItem3.getClass();
                        return rei.b(2, baseballTopPlayersStatisticsItem3.getPitchingEarnedRunsAverage());
                    case 8:
                        BaseballTopPlayersStatistics baseballTopPlayersStatistics6 = (BaseballTopPlayersStatistics) obj;
                        baseballTopPlayersStatistics6.getClass();
                        return baseballTopPlayersStatistics6.getPitchingStrikeOuts();
                    case 9:
                        BaseballTopPlayersStatisticsItem baseballTopPlayersStatisticsItem4 = (BaseballTopPlayersStatisticsItem) obj;
                        baseballTopPlayersStatisticsItem4.getClass();
                        return yid.j(baseballTopPlayersStatisticsItem4.getPitchingStrikeOuts());
                    case 10:
                        BaseballTopPlayersStatistics baseballTopPlayersStatistics7 = (BaseballTopPlayersStatistics) obj;
                        baseballTopPlayersStatistics7.getClass();
                        return baseballTopPlayersStatistics7.getPitchingQualityStarts();
                    case 11:
                        BaseballTopPlayersStatisticsItem baseballTopPlayersStatisticsItem5 = (BaseballTopPlayersStatisticsItem) obj;
                        baseballTopPlayersStatisticsItem5.getClass();
                        return yid.j(baseballTopPlayersStatisticsItem5.getPitchingQualityStarts());
                    case 12:
                        BaseballTopPlayersStatistics baseballTopPlayersStatistics8 = (BaseballTopPlayersStatistics) obj;
                        baseballTopPlayersStatistics8.getClass();
                        return baseballTopPlayersStatistics8.getPitchingWhip();
                    case 13:
                        BaseballTopPlayersStatisticsItem baseballTopPlayersStatisticsItem6 = (BaseballTopPlayersStatisticsItem) obj;
                        baseballTopPlayersStatisticsItem6.getClass();
                        return yid.j(baseballTopPlayersStatisticsItem6.getBattingRbi());
                    case 14:
                        BaseballTopPlayersStatisticsItem baseballTopPlayersStatisticsItem7 = (BaseballTopPlayersStatisticsItem) obj;
                        baseballTopPlayersStatisticsItem7.getClass();
                        Double pitchingWhip = baseballTopPlayersStatisticsItem7.getPitchingWhip();
                        yid.k(pitchingWhip);
                        String format = new DecimalFormat(".000", new DecimalFormatSymbols(Locale.US)).format(yid.k(pitchingWhip));
                        format.getClass();
                        return format;
                    case 15:
                        BaseballTopPlayersStatistics baseballTopPlayersStatistics9 = (BaseballTopPlayersStatistics) obj;
                        baseballTopPlayersStatistics9.getClass();
                        return baseballTopPlayersStatistics9.getPitchingWar();
                    case 16:
                        BaseballTopPlayersStatisticsItem baseballTopPlayersStatisticsItem8 = (BaseballTopPlayersStatisticsItem) obj;
                        baseballTopPlayersStatisticsItem8.getClass();
                        return rei.b(1, baseballTopPlayersStatisticsItem8.getPitchingWar());
                    case 17:
                        BaseballTopPlayersStatisticsItem baseballTopPlayersStatisticsItem9 = (BaseballTopPlayersStatisticsItem) obj;
                        baseballTopPlayersStatisticsItem9.getClass();
                        return yid.j(baseballTopPlayersStatisticsItem9.getBattingHits());
                    case 18:
                        BaseballTopPlayersStatistics baseballTopPlayersStatistics10 = (BaseballTopPlayersStatistics) obj;
                        baseballTopPlayersStatistics10.getClass();
                        return baseballTopPlayersStatistics10.getPitchingFieldingIndependentPitching();
                    case 19:
                        BaseballTopPlayersStatisticsItem baseballTopPlayersStatisticsItem10 = (BaseballTopPlayersStatisticsItem) obj;
                        baseballTopPlayersStatisticsItem10.getClass();
                        return rei.b(2, baseballTopPlayersStatisticsItem10.getPitchingFieldingIndependentPitching());
                    case 20:
                        BaseballTopPlayersStatistics baseballTopPlayersStatistics11 = (BaseballTopPlayersStatistics) obj;
                        baseballTopPlayersStatistics11.getClass();
                        return baseballTopPlayersStatistics11.getPitchingOpponentBattingAvg();
                    case 21:
                        BaseballTopPlayersStatisticsItem baseballTopPlayersStatisticsItem11 = (BaseballTopPlayersStatisticsItem) obj;
                        baseballTopPlayersStatisticsItem11.getClass();
                        Double pitchingOpponentBattingAvg = baseballTopPlayersStatisticsItem11.getPitchingOpponentBattingAvg();
                        yid.k(pitchingOpponentBattingAvg);
                        String format2 = new DecimalFormat(".000", new DecimalFormatSymbols(Locale.US)).format(yid.k(pitchingOpponentBattingAvg));
                        format2.getClass();
                        return format2;
                    case 22:
                        BaseballTopPlayersStatistics baseballTopPlayersStatistics12 = (BaseballTopPlayersStatistics) obj;
                        baseballTopPlayersStatistics12.getClass();
                        return baseballTopPlayersStatistics12.getFieldingPutOuts();
                    case 23:
                        BaseballTopPlayersStatisticsItem baseballTopPlayersStatisticsItem12 = (BaseballTopPlayersStatisticsItem) obj;
                        baseballTopPlayersStatisticsItem12.getClass();
                        return yid.j(baseballTopPlayersStatisticsItem12.getFieldingPutOuts());
                    case 24:
                        BaseballTopPlayersStatistics baseballTopPlayersStatistics13 = (BaseballTopPlayersStatistics) obj;
                        baseballTopPlayersStatistics13.getClass();
                        return baseballTopPlayersStatistics13.getBattingStolenBases();
                    case 25:
                        BaseballTopPlayersStatistics baseballTopPlayersStatistics14 = (BaseballTopPlayersStatistics) obj;
                        baseballTopPlayersStatistics14.getClass();
                        return baseballTopPlayersStatistics14.getFieldingAssists();
                    case 26:
                        BaseballTopPlayersStatisticsItem baseballTopPlayersStatisticsItem13 = (BaseballTopPlayersStatisticsItem) obj;
                        baseballTopPlayersStatisticsItem13.getClass();
                        return yid.j(baseballTopPlayersStatisticsItem13.getFieldingAssists());
                    case 27:
                        BaseballTopPlayersStatistics baseballTopPlayersStatistics15 = (BaseballTopPlayersStatistics) obj;
                        baseballTopPlayersStatistics15.getClass();
                        return baseballTopPlayersStatistics15.getFieldingTotalErrors();
                    case 28:
                        BaseballTopPlayersStatisticsItem baseballTopPlayersStatisticsItem14 = (BaseballTopPlayersStatisticsItem) obj;
                        baseballTopPlayersStatisticsItem14.getClass();
                        return yid.j(baseballTopPlayersStatisticsItem14.getFieldingTotalErrors());
                    default:
                        BaseballTopPlayersStatistics baseballTopPlayersStatistics16 = (BaseballTopPlayersStatistics) obj;
                        baseballTopPlayersStatistics16.getClass();
                        return baseballTopPlayersStatistics16.getBattingHomeRuns();
                }
            }
        }), new kab("FIELDING_TOTAL_CHANCES", 25, wj1Var3, R.string.baseball_total_chances, new jab(0), new jab(1)), new kab("FIELDING_DOUBLE_PLAYS", 26, wj1Var3, R.string.baseball_double_plays, new jab(2), new jab(3))};
        e = kabVarArr;
        f = new kp5(kabVarArr);
    }

    public kab(String str, int i, wj1 wj1Var, int i2, Function1 function1, Function1 function12) {
        this.a = wj1Var;
        this.b = i2;
        this.c = function1;
        this.d = function12;
    }

    public static kab valueOf(String str) {
        return (kab) Enum.valueOf(kab.class, str);
    }

    public static kab[] values() {
        return (kab[]) e.clone();
    }

    @Override // defpackage.zab
    public final String a(Object obj) {
        BaseballTopPlayersStatisticsItem baseballTopPlayersStatisticsItem = (BaseballTopPlayersStatisticsItem) obj;
        baseballTopPlayersStatisticsItem.getClass();
        return (String) this.d.invoke(baseballTopPlayersStatisticsItem);
    }

    @Override // defpackage.zab
    public final List b(Object obj) {
        BaseballTopPlayersStatistics baseballTopPlayersStatistics = (BaseballTopPlayersStatistics) obj;
        baseballTopPlayersStatistics.getClass();
        return (List) this.c.invoke(baseballTopPlayersStatistics);
    }

    @Override // defpackage.zab
    public final boolean c(hub hubVar) {
        hubVar.getClass();
        return true;
    }

    @Override // defpackage.zab
    public final String d(Context context) {
        context.getClass();
        String string = context.getString(this.b);
        string.getClass();
        return string;
    }
}
