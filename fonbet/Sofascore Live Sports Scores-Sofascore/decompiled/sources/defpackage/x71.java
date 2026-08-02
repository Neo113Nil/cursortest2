package defpackage;

import com.sofascore.model.network.response.BaseballPlayerEventStatistics;
import com.sofascore.results.R;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;
import kotlin.jvm.functions.Function1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class x71 implements e1 {
    public static final /* synthetic */ x71[] g;
    public static final /* synthetic */ kp5 h;
    public final int a;
    public final int b;
    public final Function1 c;
    public final Function1 d;
    public final Function1 e;
    public final boolean f;

    static {
        final int i = 0;
        Function1 function1 = new Function1() { // from class: v71
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                BaseballPlayerEventStatistics baseballPlayerEventStatistics = (BaseballPlayerEventStatistics) obj;
                switch (i) {
                    case 0:
                        baseballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(baseballPlayerEventStatistics.getBattingAtBats()));
                    case 1:
                        baseballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(baseballPlayerEventStatistics.getBattingStrikeOuts()));
                    case 2:
                        baseballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(baseballPlayerEventStatistics.getBattingAtBats()));
                    case 3:
                        baseballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    case 4:
                        baseballPlayerEventStatistics.getClass();
                        Double valueOf = Double.valueOf(yid.k(baseballPlayerEventStatistics.getBattingAverageToDate()));
                        yid.k(valueOf);
                        String format = new DecimalFormat(".000", new DecimalFormatSymbols(Locale.US)).format(yid.k(valueOf));
                        format.getClass();
                        return format;
                    case 5:
                        baseballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.k(baseballPlayerEventStatistics.getBattingAverageToDate()));
                    case 6:
                        baseballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    case 7:
                        baseballPlayerEventStatistics.getClass();
                        Double valueOf2 = Double.valueOf(yid.k(baseballPlayerEventStatistics.getBattingOnBasePercentageToDate()));
                        yid.k(valueOf2);
                        String format2 = new DecimalFormat(".000", new DecimalFormatSymbols(Locale.US)).format(yid.k(valueOf2));
                        format2.getClass();
                        return format2;
                    case 8:
                        baseballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.k(baseballPlayerEventStatistics.getBattingOnBasePercentageToDate()));
                    case 9:
                        baseballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    case 10:
                        baseballPlayerEventStatistics.getClass();
                        Double valueOf3 = Double.valueOf(yid.k(baseballPlayerEventStatistics.getBattingSluggingPercentageToDate()));
                        yid.k(valueOf3);
                        String format3 = new DecimalFormat(".000", new DecimalFormatSymbols(Locale.US)).format(yid.k(valueOf3));
                        format3.getClass();
                        return format3;
                    case 11:
                        baseballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(baseballPlayerEventStatistics.getBattingRbi()));
                    case 12:
                        baseballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.k(baseballPlayerEventStatistics.getBattingSluggingPercentageToDate()));
                    case 13:
                        baseballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    case 14:
                        baseballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    case 15:
                        baseballPlayerEventStatistics.getClass();
                        Double valueOf4 = Double.valueOf(yid.k(baseballPlayerEventStatistics.getBattingOpsToDate()));
                        yid.k(valueOf4);
                        String format4 = new DecimalFormat(".000", new DecimalFormatSymbols(Locale.US)).format(yid.k(valueOf4));
                        format4.getClass();
                        return format4;
                    case 16:
                        baseballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.k(baseballPlayerEventStatistics.getBattingOpsToDate()));
                    case 17:
                        baseballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    case 18:
                        baseballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(baseballPlayerEventStatistics.getBattingRuns()));
                    case 19:
                        baseballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(baseballPlayerEventStatistics.getBattingRuns()));
                    case 20:
                        baseballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    case 21:
                        baseballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(baseballPlayerEventStatistics.getBattingHits()));
                    case 22:
                        baseballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    case 23:
                        baseballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(baseballPlayerEventStatistics.getBattingHits()));
                    case 24:
                        baseballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    case 25:
                        baseballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(baseballPlayerEventStatistics.getBattingRbi()));
                    case 26:
                        baseballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(baseballPlayerEventStatistics.getBattingHomeRuns()));
                    case 27:
                        baseballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(baseballPlayerEventStatistics.getBattingHomeRuns()));
                    case 28:
                        baseballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    default:
                        baseballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(baseballPlayerEventStatistics.getBattingBaseOnBalls()));
                }
            }
        };
        final int i2 = 2;
        Function1 function12 = new Function1() { // from class: v71
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                BaseballPlayerEventStatistics baseballPlayerEventStatistics = (BaseballPlayerEventStatistics) obj;
                switch (i2) {
                    case 0:
                        baseballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(baseballPlayerEventStatistics.getBattingAtBats()));
                    case 1:
                        baseballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(baseballPlayerEventStatistics.getBattingStrikeOuts()));
                    case 2:
                        baseballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(baseballPlayerEventStatistics.getBattingAtBats()));
                    case 3:
                        baseballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    case 4:
                        baseballPlayerEventStatistics.getClass();
                        Double valueOf = Double.valueOf(yid.k(baseballPlayerEventStatistics.getBattingAverageToDate()));
                        yid.k(valueOf);
                        String format = new DecimalFormat(".000", new DecimalFormatSymbols(Locale.US)).format(yid.k(valueOf));
                        format.getClass();
                        return format;
                    case 5:
                        baseballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.k(baseballPlayerEventStatistics.getBattingAverageToDate()));
                    case 6:
                        baseballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    case 7:
                        baseballPlayerEventStatistics.getClass();
                        Double valueOf2 = Double.valueOf(yid.k(baseballPlayerEventStatistics.getBattingOnBasePercentageToDate()));
                        yid.k(valueOf2);
                        String format2 = new DecimalFormat(".000", new DecimalFormatSymbols(Locale.US)).format(yid.k(valueOf2));
                        format2.getClass();
                        return format2;
                    case 8:
                        baseballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.k(baseballPlayerEventStatistics.getBattingOnBasePercentageToDate()));
                    case 9:
                        baseballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    case 10:
                        baseballPlayerEventStatistics.getClass();
                        Double valueOf3 = Double.valueOf(yid.k(baseballPlayerEventStatistics.getBattingSluggingPercentageToDate()));
                        yid.k(valueOf3);
                        String format3 = new DecimalFormat(".000", new DecimalFormatSymbols(Locale.US)).format(yid.k(valueOf3));
                        format3.getClass();
                        return format3;
                    case 11:
                        baseballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(baseballPlayerEventStatistics.getBattingRbi()));
                    case 12:
                        baseballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.k(baseballPlayerEventStatistics.getBattingSluggingPercentageToDate()));
                    case 13:
                        baseballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    case 14:
                        baseballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    case 15:
                        baseballPlayerEventStatistics.getClass();
                        Double valueOf4 = Double.valueOf(yid.k(baseballPlayerEventStatistics.getBattingOpsToDate()));
                        yid.k(valueOf4);
                        String format4 = new DecimalFormat(".000", new DecimalFormatSymbols(Locale.US)).format(yid.k(valueOf4));
                        format4.getClass();
                        return format4;
                    case 16:
                        baseballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.k(baseballPlayerEventStatistics.getBattingOpsToDate()));
                    case 17:
                        baseballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    case 18:
                        baseballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(baseballPlayerEventStatistics.getBattingRuns()));
                    case 19:
                        baseballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(baseballPlayerEventStatistics.getBattingRuns()));
                    case 20:
                        baseballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    case 21:
                        baseballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(baseballPlayerEventStatistics.getBattingHits()));
                    case 22:
                        baseballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    case 23:
                        baseballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(baseballPlayerEventStatistics.getBattingHits()));
                    case 24:
                        baseballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    case 25:
                        baseballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(baseballPlayerEventStatistics.getBattingRbi()));
                    case 26:
                        baseballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(baseballPlayerEventStatistics.getBattingHomeRuns()));
                    case 27:
                        baseballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(baseballPlayerEventStatistics.getBattingHomeRuns()));
                    case 28:
                        baseballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    default:
                        baseballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(baseballPlayerEventStatistics.getBattingBaseOnBalls()));
                }
            }
        };
        final int i3 = 14;
        x71 x71Var = new x71(0, R.string.baseball_at_bats_short, R.string.baseball_at_bats, "AT_BATS", function1, function12, new Function1() { // from class: v71
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                BaseballPlayerEventStatistics baseballPlayerEventStatistics = (BaseballPlayerEventStatistics) obj;
                switch (i3) {
                    case 0:
                        baseballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(baseballPlayerEventStatistics.getBattingAtBats()));
                    case 1:
                        baseballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(baseballPlayerEventStatistics.getBattingStrikeOuts()));
                    case 2:
                        baseballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(baseballPlayerEventStatistics.getBattingAtBats()));
                    case 3:
                        baseballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    case 4:
                        baseballPlayerEventStatistics.getClass();
                        Double valueOf = Double.valueOf(yid.k(baseballPlayerEventStatistics.getBattingAverageToDate()));
                        yid.k(valueOf);
                        String format = new DecimalFormat(".000", new DecimalFormatSymbols(Locale.US)).format(yid.k(valueOf));
                        format.getClass();
                        return format;
                    case 5:
                        baseballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.k(baseballPlayerEventStatistics.getBattingAverageToDate()));
                    case 6:
                        baseballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    case 7:
                        baseballPlayerEventStatistics.getClass();
                        Double valueOf2 = Double.valueOf(yid.k(baseballPlayerEventStatistics.getBattingOnBasePercentageToDate()));
                        yid.k(valueOf2);
                        String format2 = new DecimalFormat(".000", new DecimalFormatSymbols(Locale.US)).format(yid.k(valueOf2));
                        format2.getClass();
                        return format2;
                    case 8:
                        baseballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.k(baseballPlayerEventStatistics.getBattingOnBasePercentageToDate()));
                    case 9:
                        baseballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    case 10:
                        baseballPlayerEventStatistics.getClass();
                        Double valueOf3 = Double.valueOf(yid.k(baseballPlayerEventStatistics.getBattingSluggingPercentageToDate()));
                        yid.k(valueOf3);
                        String format3 = new DecimalFormat(".000", new DecimalFormatSymbols(Locale.US)).format(yid.k(valueOf3));
                        format3.getClass();
                        return format3;
                    case 11:
                        baseballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(baseballPlayerEventStatistics.getBattingRbi()));
                    case 12:
                        baseballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.k(baseballPlayerEventStatistics.getBattingSluggingPercentageToDate()));
                    case 13:
                        baseballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    case 14:
                        baseballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    case 15:
                        baseballPlayerEventStatistics.getClass();
                        Double valueOf4 = Double.valueOf(yid.k(baseballPlayerEventStatistics.getBattingOpsToDate()));
                        yid.k(valueOf4);
                        String format4 = new DecimalFormat(".000", new DecimalFormatSymbols(Locale.US)).format(yid.k(valueOf4));
                        format4.getClass();
                        return format4;
                    case 16:
                        baseballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.k(baseballPlayerEventStatistics.getBattingOpsToDate()));
                    case 17:
                        baseballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    case 18:
                        baseballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(baseballPlayerEventStatistics.getBattingRuns()));
                    case 19:
                        baseballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(baseballPlayerEventStatistics.getBattingRuns()));
                    case 20:
                        baseballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    case 21:
                        baseballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(baseballPlayerEventStatistics.getBattingHits()));
                    case 22:
                        baseballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    case 23:
                        baseballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(baseballPlayerEventStatistics.getBattingHits()));
                    case 24:
                        baseballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    case 25:
                        baseballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(baseballPlayerEventStatistics.getBattingRbi()));
                    case 26:
                        baseballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(baseballPlayerEventStatistics.getBattingHomeRuns()));
                    case 27:
                        baseballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(baseballPlayerEventStatistics.getBattingHomeRuns()));
                    case 28:
                        baseballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    default:
                        baseballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(baseballPlayerEventStatistics.getBattingBaseOnBalls()));
                }
            }
        }, true);
        final int i4 = 18;
        Function1 function13 = new Function1() { // from class: v71
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                BaseballPlayerEventStatistics baseballPlayerEventStatistics = (BaseballPlayerEventStatistics) obj;
                switch (i4) {
                    case 0:
                        baseballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(baseballPlayerEventStatistics.getBattingAtBats()));
                    case 1:
                        baseballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(baseballPlayerEventStatistics.getBattingStrikeOuts()));
                    case 2:
                        baseballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(baseballPlayerEventStatistics.getBattingAtBats()));
                    case 3:
                        baseballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    case 4:
                        baseballPlayerEventStatistics.getClass();
                        Double valueOf = Double.valueOf(yid.k(baseballPlayerEventStatistics.getBattingAverageToDate()));
                        yid.k(valueOf);
                        String format = new DecimalFormat(".000", new DecimalFormatSymbols(Locale.US)).format(yid.k(valueOf));
                        format.getClass();
                        return format;
                    case 5:
                        baseballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.k(baseballPlayerEventStatistics.getBattingAverageToDate()));
                    case 6:
                        baseballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    case 7:
                        baseballPlayerEventStatistics.getClass();
                        Double valueOf2 = Double.valueOf(yid.k(baseballPlayerEventStatistics.getBattingOnBasePercentageToDate()));
                        yid.k(valueOf2);
                        String format2 = new DecimalFormat(".000", new DecimalFormatSymbols(Locale.US)).format(yid.k(valueOf2));
                        format2.getClass();
                        return format2;
                    case 8:
                        baseballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.k(baseballPlayerEventStatistics.getBattingOnBasePercentageToDate()));
                    case 9:
                        baseballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    case 10:
                        baseballPlayerEventStatistics.getClass();
                        Double valueOf3 = Double.valueOf(yid.k(baseballPlayerEventStatistics.getBattingSluggingPercentageToDate()));
                        yid.k(valueOf3);
                        String format3 = new DecimalFormat(".000", new DecimalFormatSymbols(Locale.US)).format(yid.k(valueOf3));
                        format3.getClass();
                        return format3;
                    case 11:
                        baseballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(baseballPlayerEventStatistics.getBattingRbi()));
                    case 12:
                        baseballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.k(baseballPlayerEventStatistics.getBattingSluggingPercentageToDate()));
                    case 13:
                        baseballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    case 14:
                        baseballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    case 15:
                        baseballPlayerEventStatistics.getClass();
                        Double valueOf4 = Double.valueOf(yid.k(baseballPlayerEventStatistics.getBattingOpsToDate()));
                        yid.k(valueOf4);
                        String format4 = new DecimalFormat(".000", new DecimalFormatSymbols(Locale.US)).format(yid.k(valueOf4));
                        format4.getClass();
                        return format4;
                    case 16:
                        baseballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.k(baseballPlayerEventStatistics.getBattingOpsToDate()));
                    case 17:
                        baseballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    case 18:
                        baseballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(baseballPlayerEventStatistics.getBattingRuns()));
                    case 19:
                        baseballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(baseballPlayerEventStatistics.getBattingRuns()));
                    case 20:
                        baseballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    case 21:
                        baseballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(baseballPlayerEventStatistics.getBattingHits()));
                    case 22:
                        baseballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    case 23:
                        baseballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(baseballPlayerEventStatistics.getBattingHits()));
                    case 24:
                        baseballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    case 25:
                        baseballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(baseballPlayerEventStatistics.getBattingRbi()));
                    case 26:
                        baseballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(baseballPlayerEventStatistics.getBattingHomeRuns()));
                    case 27:
                        baseballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(baseballPlayerEventStatistics.getBattingHomeRuns()));
                    case 28:
                        baseballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    default:
                        baseballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(baseballPlayerEventStatistics.getBattingBaseOnBalls()));
                }
            }
        };
        final int i5 = 19;
        Function1 function14 = new Function1() { // from class: v71
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                BaseballPlayerEventStatistics baseballPlayerEventStatistics = (BaseballPlayerEventStatistics) obj;
                switch (i5) {
                    case 0:
                        baseballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(baseballPlayerEventStatistics.getBattingAtBats()));
                    case 1:
                        baseballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(baseballPlayerEventStatistics.getBattingStrikeOuts()));
                    case 2:
                        baseballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(baseballPlayerEventStatistics.getBattingAtBats()));
                    case 3:
                        baseballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    case 4:
                        baseballPlayerEventStatistics.getClass();
                        Double valueOf = Double.valueOf(yid.k(baseballPlayerEventStatistics.getBattingAverageToDate()));
                        yid.k(valueOf);
                        String format = new DecimalFormat(".000", new DecimalFormatSymbols(Locale.US)).format(yid.k(valueOf));
                        format.getClass();
                        return format;
                    case 5:
                        baseballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.k(baseballPlayerEventStatistics.getBattingAverageToDate()));
                    case 6:
                        baseballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    case 7:
                        baseballPlayerEventStatistics.getClass();
                        Double valueOf2 = Double.valueOf(yid.k(baseballPlayerEventStatistics.getBattingOnBasePercentageToDate()));
                        yid.k(valueOf2);
                        String format2 = new DecimalFormat(".000", new DecimalFormatSymbols(Locale.US)).format(yid.k(valueOf2));
                        format2.getClass();
                        return format2;
                    case 8:
                        baseballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.k(baseballPlayerEventStatistics.getBattingOnBasePercentageToDate()));
                    case 9:
                        baseballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    case 10:
                        baseballPlayerEventStatistics.getClass();
                        Double valueOf3 = Double.valueOf(yid.k(baseballPlayerEventStatistics.getBattingSluggingPercentageToDate()));
                        yid.k(valueOf3);
                        String format3 = new DecimalFormat(".000", new DecimalFormatSymbols(Locale.US)).format(yid.k(valueOf3));
                        format3.getClass();
                        return format3;
                    case 11:
                        baseballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(baseballPlayerEventStatistics.getBattingRbi()));
                    case 12:
                        baseballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.k(baseballPlayerEventStatistics.getBattingSluggingPercentageToDate()));
                    case 13:
                        baseballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    case 14:
                        baseballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    case 15:
                        baseballPlayerEventStatistics.getClass();
                        Double valueOf4 = Double.valueOf(yid.k(baseballPlayerEventStatistics.getBattingOpsToDate()));
                        yid.k(valueOf4);
                        String format4 = new DecimalFormat(".000", new DecimalFormatSymbols(Locale.US)).format(yid.k(valueOf4));
                        format4.getClass();
                        return format4;
                    case 16:
                        baseballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.k(baseballPlayerEventStatistics.getBattingOpsToDate()));
                    case 17:
                        baseballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    case 18:
                        baseballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(baseballPlayerEventStatistics.getBattingRuns()));
                    case 19:
                        baseballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(baseballPlayerEventStatistics.getBattingRuns()));
                    case 20:
                        baseballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    case 21:
                        baseballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(baseballPlayerEventStatistics.getBattingHits()));
                    case 22:
                        baseballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    case 23:
                        baseballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(baseballPlayerEventStatistics.getBattingHits()));
                    case 24:
                        baseballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    case 25:
                        baseballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(baseballPlayerEventStatistics.getBattingRbi()));
                    case 26:
                        baseballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(baseballPlayerEventStatistics.getBattingHomeRuns()));
                    case 27:
                        baseballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(baseballPlayerEventStatistics.getBattingHomeRuns()));
                    case 28:
                        baseballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    default:
                        baseballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(baseballPlayerEventStatistics.getBattingBaseOnBalls()));
                }
            }
        };
        final int i6 = 20;
        x71 x71Var2 = new x71(1, R.string.baseball_runs_short, R.string.baseball_runs, "RUNS", function13, function14, new Function1() { // from class: v71
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                BaseballPlayerEventStatistics baseballPlayerEventStatistics = (BaseballPlayerEventStatistics) obj;
                switch (i6) {
                    case 0:
                        baseballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(baseballPlayerEventStatistics.getBattingAtBats()));
                    case 1:
                        baseballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(baseballPlayerEventStatistics.getBattingStrikeOuts()));
                    case 2:
                        baseballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(baseballPlayerEventStatistics.getBattingAtBats()));
                    case 3:
                        baseballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    case 4:
                        baseballPlayerEventStatistics.getClass();
                        Double valueOf = Double.valueOf(yid.k(baseballPlayerEventStatistics.getBattingAverageToDate()));
                        yid.k(valueOf);
                        String format = new DecimalFormat(".000", new DecimalFormatSymbols(Locale.US)).format(yid.k(valueOf));
                        format.getClass();
                        return format;
                    case 5:
                        baseballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.k(baseballPlayerEventStatistics.getBattingAverageToDate()));
                    case 6:
                        baseballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    case 7:
                        baseballPlayerEventStatistics.getClass();
                        Double valueOf2 = Double.valueOf(yid.k(baseballPlayerEventStatistics.getBattingOnBasePercentageToDate()));
                        yid.k(valueOf2);
                        String format2 = new DecimalFormat(".000", new DecimalFormatSymbols(Locale.US)).format(yid.k(valueOf2));
                        format2.getClass();
                        return format2;
                    case 8:
                        baseballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.k(baseballPlayerEventStatistics.getBattingOnBasePercentageToDate()));
                    case 9:
                        baseballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    case 10:
                        baseballPlayerEventStatistics.getClass();
                        Double valueOf3 = Double.valueOf(yid.k(baseballPlayerEventStatistics.getBattingSluggingPercentageToDate()));
                        yid.k(valueOf3);
                        String format3 = new DecimalFormat(".000", new DecimalFormatSymbols(Locale.US)).format(yid.k(valueOf3));
                        format3.getClass();
                        return format3;
                    case 11:
                        baseballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(baseballPlayerEventStatistics.getBattingRbi()));
                    case 12:
                        baseballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.k(baseballPlayerEventStatistics.getBattingSluggingPercentageToDate()));
                    case 13:
                        baseballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    case 14:
                        baseballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    case 15:
                        baseballPlayerEventStatistics.getClass();
                        Double valueOf4 = Double.valueOf(yid.k(baseballPlayerEventStatistics.getBattingOpsToDate()));
                        yid.k(valueOf4);
                        String format4 = new DecimalFormat(".000", new DecimalFormatSymbols(Locale.US)).format(yid.k(valueOf4));
                        format4.getClass();
                        return format4;
                    case 16:
                        baseballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.k(baseballPlayerEventStatistics.getBattingOpsToDate()));
                    case 17:
                        baseballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    case 18:
                        baseballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(baseballPlayerEventStatistics.getBattingRuns()));
                    case 19:
                        baseballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(baseballPlayerEventStatistics.getBattingRuns()));
                    case 20:
                        baseballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    case 21:
                        baseballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(baseballPlayerEventStatistics.getBattingHits()));
                    case 22:
                        baseballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    case 23:
                        baseballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(baseballPlayerEventStatistics.getBattingHits()));
                    case 24:
                        baseballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    case 25:
                        baseballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(baseballPlayerEventStatistics.getBattingRbi()));
                    case 26:
                        baseballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(baseballPlayerEventStatistics.getBattingHomeRuns()));
                    case 27:
                        baseballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(baseballPlayerEventStatistics.getBattingHomeRuns()));
                    case 28:
                        baseballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    default:
                        baseballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(baseballPlayerEventStatistics.getBattingBaseOnBalls()));
                }
            }
        }, true);
        final int i7 = 21;
        Function1 function15 = new Function1() { // from class: v71
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                BaseballPlayerEventStatistics baseballPlayerEventStatistics = (BaseballPlayerEventStatistics) obj;
                switch (i7) {
                    case 0:
                        baseballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(baseballPlayerEventStatistics.getBattingAtBats()));
                    case 1:
                        baseballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(baseballPlayerEventStatistics.getBattingStrikeOuts()));
                    case 2:
                        baseballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(baseballPlayerEventStatistics.getBattingAtBats()));
                    case 3:
                        baseballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    case 4:
                        baseballPlayerEventStatistics.getClass();
                        Double valueOf = Double.valueOf(yid.k(baseballPlayerEventStatistics.getBattingAverageToDate()));
                        yid.k(valueOf);
                        String format = new DecimalFormat(".000", new DecimalFormatSymbols(Locale.US)).format(yid.k(valueOf));
                        format.getClass();
                        return format;
                    case 5:
                        baseballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.k(baseballPlayerEventStatistics.getBattingAverageToDate()));
                    case 6:
                        baseballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    case 7:
                        baseballPlayerEventStatistics.getClass();
                        Double valueOf2 = Double.valueOf(yid.k(baseballPlayerEventStatistics.getBattingOnBasePercentageToDate()));
                        yid.k(valueOf2);
                        String format2 = new DecimalFormat(".000", new DecimalFormatSymbols(Locale.US)).format(yid.k(valueOf2));
                        format2.getClass();
                        return format2;
                    case 8:
                        baseballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.k(baseballPlayerEventStatistics.getBattingOnBasePercentageToDate()));
                    case 9:
                        baseballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    case 10:
                        baseballPlayerEventStatistics.getClass();
                        Double valueOf3 = Double.valueOf(yid.k(baseballPlayerEventStatistics.getBattingSluggingPercentageToDate()));
                        yid.k(valueOf3);
                        String format3 = new DecimalFormat(".000", new DecimalFormatSymbols(Locale.US)).format(yid.k(valueOf3));
                        format3.getClass();
                        return format3;
                    case 11:
                        baseballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(baseballPlayerEventStatistics.getBattingRbi()));
                    case 12:
                        baseballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.k(baseballPlayerEventStatistics.getBattingSluggingPercentageToDate()));
                    case 13:
                        baseballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    case 14:
                        baseballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    case 15:
                        baseballPlayerEventStatistics.getClass();
                        Double valueOf4 = Double.valueOf(yid.k(baseballPlayerEventStatistics.getBattingOpsToDate()));
                        yid.k(valueOf4);
                        String format4 = new DecimalFormat(".000", new DecimalFormatSymbols(Locale.US)).format(yid.k(valueOf4));
                        format4.getClass();
                        return format4;
                    case 16:
                        baseballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.k(baseballPlayerEventStatistics.getBattingOpsToDate()));
                    case 17:
                        baseballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    case 18:
                        baseballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(baseballPlayerEventStatistics.getBattingRuns()));
                    case 19:
                        baseballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(baseballPlayerEventStatistics.getBattingRuns()));
                    case 20:
                        baseballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    case 21:
                        baseballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(baseballPlayerEventStatistics.getBattingHits()));
                    case 22:
                        baseballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    case 23:
                        baseballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(baseballPlayerEventStatistics.getBattingHits()));
                    case 24:
                        baseballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    case 25:
                        baseballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(baseballPlayerEventStatistics.getBattingRbi()));
                    case 26:
                        baseballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(baseballPlayerEventStatistics.getBattingHomeRuns()));
                    case 27:
                        baseballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(baseballPlayerEventStatistics.getBattingHomeRuns()));
                    case 28:
                        baseballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    default:
                        baseballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(baseballPlayerEventStatistics.getBattingBaseOnBalls()));
                }
            }
        };
        final int i8 = 23;
        Function1 function16 = new Function1() { // from class: v71
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                BaseballPlayerEventStatistics baseballPlayerEventStatistics = (BaseballPlayerEventStatistics) obj;
                switch (i8) {
                    case 0:
                        baseballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(baseballPlayerEventStatistics.getBattingAtBats()));
                    case 1:
                        baseballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(baseballPlayerEventStatistics.getBattingStrikeOuts()));
                    case 2:
                        baseballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(baseballPlayerEventStatistics.getBattingAtBats()));
                    case 3:
                        baseballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    case 4:
                        baseballPlayerEventStatistics.getClass();
                        Double valueOf = Double.valueOf(yid.k(baseballPlayerEventStatistics.getBattingAverageToDate()));
                        yid.k(valueOf);
                        String format = new DecimalFormat(".000", new DecimalFormatSymbols(Locale.US)).format(yid.k(valueOf));
                        format.getClass();
                        return format;
                    case 5:
                        baseballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.k(baseballPlayerEventStatistics.getBattingAverageToDate()));
                    case 6:
                        baseballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    case 7:
                        baseballPlayerEventStatistics.getClass();
                        Double valueOf2 = Double.valueOf(yid.k(baseballPlayerEventStatistics.getBattingOnBasePercentageToDate()));
                        yid.k(valueOf2);
                        String format2 = new DecimalFormat(".000", new DecimalFormatSymbols(Locale.US)).format(yid.k(valueOf2));
                        format2.getClass();
                        return format2;
                    case 8:
                        baseballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.k(baseballPlayerEventStatistics.getBattingOnBasePercentageToDate()));
                    case 9:
                        baseballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    case 10:
                        baseballPlayerEventStatistics.getClass();
                        Double valueOf3 = Double.valueOf(yid.k(baseballPlayerEventStatistics.getBattingSluggingPercentageToDate()));
                        yid.k(valueOf3);
                        String format3 = new DecimalFormat(".000", new DecimalFormatSymbols(Locale.US)).format(yid.k(valueOf3));
                        format3.getClass();
                        return format3;
                    case 11:
                        baseballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(baseballPlayerEventStatistics.getBattingRbi()));
                    case 12:
                        baseballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.k(baseballPlayerEventStatistics.getBattingSluggingPercentageToDate()));
                    case 13:
                        baseballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    case 14:
                        baseballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    case 15:
                        baseballPlayerEventStatistics.getClass();
                        Double valueOf4 = Double.valueOf(yid.k(baseballPlayerEventStatistics.getBattingOpsToDate()));
                        yid.k(valueOf4);
                        String format4 = new DecimalFormat(".000", new DecimalFormatSymbols(Locale.US)).format(yid.k(valueOf4));
                        format4.getClass();
                        return format4;
                    case 16:
                        baseballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.k(baseballPlayerEventStatistics.getBattingOpsToDate()));
                    case 17:
                        baseballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    case 18:
                        baseballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(baseballPlayerEventStatistics.getBattingRuns()));
                    case 19:
                        baseballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(baseballPlayerEventStatistics.getBattingRuns()));
                    case 20:
                        baseballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    case 21:
                        baseballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(baseballPlayerEventStatistics.getBattingHits()));
                    case 22:
                        baseballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    case 23:
                        baseballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(baseballPlayerEventStatistics.getBattingHits()));
                    case 24:
                        baseballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    case 25:
                        baseballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(baseballPlayerEventStatistics.getBattingRbi()));
                    case 26:
                        baseballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(baseballPlayerEventStatistics.getBattingHomeRuns()));
                    case 27:
                        baseballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(baseballPlayerEventStatistics.getBattingHomeRuns()));
                    case 28:
                        baseballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    default:
                        baseballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(baseballPlayerEventStatistics.getBattingBaseOnBalls()));
                }
            }
        };
        final int i9 = 24;
        x71 x71Var3 = new x71(2, R.string.baseball_hits_short, R.string.baseball_hits, "HITS", function15, function16, new Function1() { // from class: v71
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                BaseballPlayerEventStatistics baseballPlayerEventStatistics = (BaseballPlayerEventStatistics) obj;
                switch (i9) {
                    case 0:
                        baseballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(baseballPlayerEventStatistics.getBattingAtBats()));
                    case 1:
                        baseballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(baseballPlayerEventStatistics.getBattingStrikeOuts()));
                    case 2:
                        baseballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(baseballPlayerEventStatistics.getBattingAtBats()));
                    case 3:
                        baseballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    case 4:
                        baseballPlayerEventStatistics.getClass();
                        Double valueOf = Double.valueOf(yid.k(baseballPlayerEventStatistics.getBattingAverageToDate()));
                        yid.k(valueOf);
                        String format = new DecimalFormat(".000", new DecimalFormatSymbols(Locale.US)).format(yid.k(valueOf));
                        format.getClass();
                        return format;
                    case 5:
                        baseballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.k(baseballPlayerEventStatistics.getBattingAverageToDate()));
                    case 6:
                        baseballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    case 7:
                        baseballPlayerEventStatistics.getClass();
                        Double valueOf2 = Double.valueOf(yid.k(baseballPlayerEventStatistics.getBattingOnBasePercentageToDate()));
                        yid.k(valueOf2);
                        String format2 = new DecimalFormat(".000", new DecimalFormatSymbols(Locale.US)).format(yid.k(valueOf2));
                        format2.getClass();
                        return format2;
                    case 8:
                        baseballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.k(baseballPlayerEventStatistics.getBattingOnBasePercentageToDate()));
                    case 9:
                        baseballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    case 10:
                        baseballPlayerEventStatistics.getClass();
                        Double valueOf3 = Double.valueOf(yid.k(baseballPlayerEventStatistics.getBattingSluggingPercentageToDate()));
                        yid.k(valueOf3);
                        String format3 = new DecimalFormat(".000", new DecimalFormatSymbols(Locale.US)).format(yid.k(valueOf3));
                        format3.getClass();
                        return format3;
                    case 11:
                        baseballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(baseballPlayerEventStatistics.getBattingRbi()));
                    case 12:
                        baseballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.k(baseballPlayerEventStatistics.getBattingSluggingPercentageToDate()));
                    case 13:
                        baseballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    case 14:
                        baseballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    case 15:
                        baseballPlayerEventStatistics.getClass();
                        Double valueOf4 = Double.valueOf(yid.k(baseballPlayerEventStatistics.getBattingOpsToDate()));
                        yid.k(valueOf4);
                        String format4 = new DecimalFormat(".000", new DecimalFormatSymbols(Locale.US)).format(yid.k(valueOf4));
                        format4.getClass();
                        return format4;
                    case 16:
                        baseballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.k(baseballPlayerEventStatistics.getBattingOpsToDate()));
                    case 17:
                        baseballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    case 18:
                        baseballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(baseballPlayerEventStatistics.getBattingRuns()));
                    case 19:
                        baseballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(baseballPlayerEventStatistics.getBattingRuns()));
                    case 20:
                        baseballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    case 21:
                        baseballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(baseballPlayerEventStatistics.getBattingHits()));
                    case 22:
                        baseballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    case 23:
                        baseballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(baseballPlayerEventStatistics.getBattingHits()));
                    case 24:
                        baseballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    case 25:
                        baseballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(baseballPlayerEventStatistics.getBattingRbi()));
                    case 26:
                        baseballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(baseballPlayerEventStatistics.getBattingHomeRuns()));
                    case 27:
                        baseballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(baseballPlayerEventStatistics.getBattingHomeRuns()));
                    case 28:
                        baseballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    default:
                        baseballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(baseballPlayerEventStatistics.getBattingBaseOnBalls()));
                }
            }
        }, true);
        final int i10 = 25;
        Function1 function17 = new Function1() { // from class: v71
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                BaseballPlayerEventStatistics baseballPlayerEventStatistics = (BaseballPlayerEventStatistics) obj;
                switch (i10) {
                    case 0:
                        baseballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(baseballPlayerEventStatistics.getBattingAtBats()));
                    case 1:
                        baseballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(baseballPlayerEventStatistics.getBattingStrikeOuts()));
                    case 2:
                        baseballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(baseballPlayerEventStatistics.getBattingAtBats()));
                    case 3:
                        baseballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    case 4:
                        baseballPlayerEventStatistics.getClass();
                        Double valueOf = Double.valueOf(yid.k(baseballPlayerEventStatistics.getBattingAverageToDate()));
                        yid.k(valueOf);
                        String format = new DecimalFormat(".000", new DecimalFormatSymbols(Locale.US)).format(yid.k(valueOf));
                        format.getClass();
                        return format;
                    case 5:
                        baseballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.k(baseballPlayerEventStatistics.getBattingAverageToDate()));
                    case 6:
                        baseballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    case 7:
                        baseballPlayerEventStatistics.getClass();
                        Double valueOf2 = Double.valueOf(yid.k(baseballPlayerEventStatistics.getBattingOnBasePercentageToDate()));
                        yid.k(valueOf2);
                        String format2 = new DecimalFormat(".000", new DecimalFormatSymbols(Locale.US)).format(yid.k(valueOf2));
                        format2.getClass();
                        return format2;
                    case 8:
                        baseballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.k(baseballPlayerEventStatistics.getBattingOnBasePercentageToDate()));
                    case 9:
                        baseballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    case 10:
                        baseballPlayerEventStatistics.getClass();
                        Double valueOf3 = Double.valueOf(yid.k(baseballPlayerEventStatistics.getBattingSluggingPercentageToDate()));
                        yid.k(valueOf3);
                        String format3 = new DecimalFormat(".000", new DecimalFormatSymbols(Locale.US)).format(yid.k(valueOf3));
                        format3.getClass();
                        return format3;
                    case 11:
                        baseballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(baseballPlayerEventStatistics.getBattingRbi()));
                    case 12:
                        baseballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.k(baseballPlayerEventStatistics.getBattingSluggingPercentageToDate()));
                    case 13:
                        baseballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    case 14:
                        baseballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    case 15:
                        baseballPlayerEventStatistics.getClass();
                        Double valueOf4 = Double.valueOf(yid.k(baseballPlayerEventStatistics.getBattingOpsToDate()));
                        yid.k(valueOf4);
                        String format4 = new DecimalFormat(".000", new DecimalFormatSymbols(Locale.US)).format(yid.k(valueOf4));
                        format4.getClass();
                        return format4;
                    case 16:
                        baseballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.k(baseballPlayerEventStatistics.getBattingOpsToDate()));
                    case 17:
                        baseballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    case 18:
                        baseballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(baseballPlayerEventStatistics.getBattingRuns()));
                    case 19:
                        baseballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(baseballPlayerEventStatistics.getBattingRuns()));
                    case 20:
                        baseballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    case 21:
                        baseballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(baseballPlayerEventStatistics.getBattingHits()));
                    case 22:
                        baseballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    case 23:
                        baseballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(baseballPlayerEventStatistics.getBattingHits()));
                    case 24:
                        baseballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    case 25:
                        baseballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(baseballPlayerEventStatistics.getBattingRbi()));
                    case 26:
                        baseballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(baseballPlayerEventStatistics.getBattingHomeRuns()));
                    case 27:
                        baseballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(baseballPlayerEventStatistics.getBattingHomeRuns()));
                    case 28:
                        baseballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    default:
                        baseballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(baseballPlayerEventStatistics.getBattingBaseOnBalls()));
                }
            }
        };
        final int i11 = 11;
        Function1 function18 = new Function1() { // from class: v71
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                BaseballPlayerEventStatistics baseballPlayerEventStatistics = (BaseballPlayerEventStatistics) obj;
                switch (i11) {
                    case 0:
                        baseballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(baseballPlayerEventStatistics.getBattingAtBats()));
                    case 1:
                        baseballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(baseballPlayerEventStatistics.getBattingStrikeOuts()));
                    case 2:
                        baseballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(baseballPlayerEventStatistics.getBattingAtBats()));
                    case 3:
                        baseballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    case 4:
                        baseballPlayerEventStatistics.getClass();
                        Double valueOf = Double.valueOf(yid.k(baseballPlayerEventStatistics.getBattingAverageToDate()));
                        yid.k(valueOf);
                        String format = new DecimalFormat(".000", new DecimalFormatSymbols(Locale.US)).format(yid.k(valueOf));
                        format.getClass();
                        return format;
                    case 5:
                        baseballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.k(baseballPlayerEventStatistics.getBattingAverageToDate()));
                    case 6:
                        baseballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    case 7:
                        baseballPlayerEventStatistics.getClass();
                        Double valueOf2 = Double.valueOf(yid.k(baseballPlayerEventStatistics.getBattingOnBasePercentageToDate()));
                        yid.k(valueOf2);
                        String format2 = new DecimalFormat(".000", new DecimalFormatSymbols(Locale.US)).format(yid.k(valueOf2));
                        format2.getClass();
                        return format2;
                    case 8:
                        baseballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.k(baseballPlayerEventStatistics.getBattingOnBasePercentageToDate()));
                    case 9:
                        baseballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    case 10:
                        baseballPlayerEventStatistics.getClass();
                        Double valueOf3 = Double.valueOf(yid.k(baseballPlayerEventStatistics.getBattingSluggingPercentageToDate()));
                        yid.k(valueOf3);
                        String format3 = new DecimalFormat(".000", new DecimalFormatSymbols(Locale.US)).format(yid.k(valueOf3));
                        format3.getClass();
                        return format3;
                    case 11:
                        baseballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(baseballPlayerEventStatistics.getBattingRbi()));
                    case 12:
                        baseballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.k(baseballPlayerEventStatistics.getBattingSluggingPercentageToDate()));
                    case 13:
                        baseballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    case 14:
                        baseballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    case 15:
                        baseballPlayerEventStatistics.getClass();
                        Double valueOf4 = Double.valueOf(yid.k(baseballPlayerEventStatistics.getBattingOpsToDate()));
                        yid.k(valueOf4);
                        String format4 = new DecimalFormat(".000", new DecimalFormatSymbols(Locale.US)).format(yid.k(valueOf4));
                        format4.getClass();
                        return format4;
                    case 16:
                        baseballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.k(baseballPlayerEventStatistics.getBattingOpsToDate()));
                    case 17:
                        baseballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    case 18:
                        baseballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(baseballPlayerEventStatistics.getBattingRuns()));
                    case 19:
                        baseballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(baseballPlayerEventStatistics.getBattingRuns()));
                    case 20:
                        baseballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    case 21:
                        baseballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(baseballPlayerEventStatistics.getBattingHits()));
                    case 22:
                        baseballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    case 23:
                        baseballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(baseballPlayerEventStatistics.getBattingHits()));
                    case 24:
                        baseballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    case 25:
                        baseballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(baseballPlayerEventStatistics.getBattingRbi()));
                    case 26:
                        baseballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(baseballPlayerEventStatistics.getBattingHomeRuns()));
                    case 27:
                        baseballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(baseballPlayerEventStatistics.getBattingHomeRuns()));
                    case 28:
                        baseballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    default:
                        baseballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(baseballPlayerEventStatistics.getBattingBaseOnBalls()));
                }
            }
        };
        final int i12 = 22;
        x71 x71Var4 = new x71(3, R.string.baseball_runs_batted_in_short, R.string.baseball_runs_batted_in, "RBI", function17, function18, new Function1() { // from class: v71
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                BaseballPlayerEventStatistics baseballPlayerEventStatistics = (BaseballPlayerEventStatistics) obj;
                switch (i12) {
                    case 0:
                        baseballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(baseballPlayerEventStatistics.getBattingAtBats()));
                    case 1:
                        baseballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(baseballPlayerEventStatistics.getBattingStrikeOuts()));
                    case 2:
                        baseballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(baseballPlayerEventStatistics.getBattingAtBats()));
                    case 3:
                        baseballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    case 4:
                        baseballPlayerEventStatistics.getClass();
                        Double valueOf = Double.valueOf(yid.k(baseballPlayerEventStatistics.getBattingAverageToDate()));
                        yid.k(valueOf);
                        String format = new DecimalFormat(".000", new DecimalFormatSymbols(Locale.US)).format(yid.k(valueOf));
                        format.getClass();
                        return format;
                    case 5:
                        baseballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.k(baseballPlayerEventStatistics.getBattingAverageToDate()));
                    case 6:
                        baseballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    case 7:
                        baseballPlayerEventStatistics.getClass();
                        Double valueOf2 = Double.valueOf(yid.k(baseballPlayerEventStatistics.getBattingOnBasePercentageToDate()));
                        yid.k(valueOf2);
                        String format2 = new DecimalFormat(".000", new DecimalFormatSymbols(Locale.US)).format(yid.k(valueOf2));
                        format2.getClass();
                        return format2;
                    case 8:
                        baseballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.k(baseballPlayerEventStatistics.getBattingOnBasePercentageToDate()));
                    case 9:
                        baseballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    case 10:
                        baseballPlayerEventStatistics.getClass();
                        Double valueOf3 = Double.valueOf(yid.k(baseballPlayerEventStatistics.getBattingSluggingPercentageToDate()));
                        yid.k(valueOf3);
                        String format3 = new DecimalFormat(".000", new DecimalFormatSymbols(Locale.US)).format(yid.k(valueOf3));
                        format3.getClass();
                        return format3;
                    case 11:
                        baseballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(baseballPlayerEventStatistics.getBattingRbi()));
                    case 12:
                        baseballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.k(baseballPlayerEventStatistics.getBattingSluggingPercentageToDate()));
                    case 13:
                        baseballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    case 14:
                        baseballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    case 15:
                        baseballPlayerEventStatistics.getClass();
                        Double valueOf4 = Double.valueOf(yid.k(baseballPlayerEventStatistics.getBattingOpsToDate()));
                        yid.k(valueOf4);
                        String format4 = new DecimalFormat(".000", new DecimalFormatSymbols(Locale.US)).format(yid.k(valueOf4));
                        format4.getClass();
                        return format4;
                    case 16:
                        baseballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.k(baseballPlayerEventStatistics.getBattingOpsToDate()));
                    case 17:
                        baseballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    case 18:
                        baseballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(baseballPlayerEventStatistics.getBattingRuns()));
                    case 19:
                        baseballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(baseballPlayerEventStatistics.getBattingRuns()));
                    case 20:
                        baseballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    case 21:
                        baseballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(baseballPlayerEventStatistics.getBattingHits()));
                    case 22:
                        baseballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    case 23:
                        baseballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(baseballPlayerEventStatistics.getBattingHits()));
                    case 24:
                        baseballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    case 25:
                        baseballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(baseballPlayerEventStatistics.getBattingRbi()));
                    case 26:
                        baseballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(baseballPlayerEventStatistics.getBattingHomeRuns()));
                    case 27:
                        baseballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(baseballPlayerEventStatistics.getBattingHomeRuns()));
                    case 28:
                        baseballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    default:
                        baseballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(baseballPlayerEventStatistics.getBattingBaseOnBalls()));
                }
            }
        }, true);
        final int i13 = 26;
        Function1 function19 = new Function1() { // from class: v71
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                BaseballPlayerEventStatistics baseballPlayerEventStatistics = (BaseballPlayerEventStatistics) obj;
                switch (i13) {
                    case 0:
                        baseballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(baseballPlayerEventStatistics.getBattingAtBats()));
                    case 1:
                        baseballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(baseballPlayerEventStatistics.getBattingStrikeOuts()));
                    case 2:
                        baseballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(baseballPlayerEventStatistics.getBattingAtBats()));
                    case 3:
                        baseballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    case 4:
                        baseballPlayerEventStatistics.getClass();
                        Double valueOf = Double.valueOf(yid.k(baseballPlayerEventStatistics.getBattingAverageToDate()));
                        yid.k(valueOf);
                        String format = new DecimalFormat(".000", new DecimalFormatSymbols(Locale.US)).format(yid.k(valueOf));
                        format.getClass();
                        return format;
                    case 5:
                        baseballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.k(baseballPlayerEventStatistics.getBattingAverageToDate()));
                    case 6:
                        baseballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    case 7:
                        baseballPlayerEventStatistics.getClass();
                        Double valueOf2 = Double.valueOf(yid.k(baseballPlayerEventStatistics.getBattingOnBasePercentageToDate()));
                        yid.k(valueOf2);
                        String format2 = new DecimalFormat(".000", new DecimalFormatSymbols(Locale.US)).format(yid.k(valueOf2));
                        format2.getClass();
                        return format2;
                    case 8:
                        baseballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.k(baseballPlayerEventStatistics.getBattingOnBasePercentageToDate()));
                    case 9:
                        baseballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    case 10:
                        baseballPlayerEventStatistics.getClass();
                        Double valueOf3 = Double.valueOf(yid.k(baseballPlayerEventStatistics.getBattingSluggingPercentageToDate()));
                        yid.k(valueOf3);
                        String format3 = new DecimalFormat(".000", new DecimalFormatSymbols(Locale.US)).format(yid.k(valueOf3));
                        format3.getClass();
                        return format3;
                    case 11:
                        baseballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(baseballPlayerEventStatistics.getBattingRbi()));
                    case 12:
                        baseballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.k(baseballPlayerEventStatistics.getBattingSluggingPercentageToDate()));
                    case 13:
                        baseballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    case 14:
                        baseballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    case 15:
                        baseballPlayerEventStatistics.getClass();
                        Double valueOf4 = Double.valueOf(yid.k(baseballPlayerEventStatistics.getBattingOpsToDate()));
                        yid.k(valueOf4);
                        String format4 = new DecimalFormat(".000", new DecimalFormatSymbols(Locale.US)).format(yid.k(valueOf4));
                        format4.getClass();
                        return format4;
                    case 16:
                        baseballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.k(baseballPlayerEventStatistics.getBattingOpsToDate()));
                    case 17:
                        baseballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    case 18:
                        baseballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(baseballPlayerEventStatistics.getBattingRuns()));
                    case 19:
                        baseballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(baseballPlayerEventStatistics.getBattingRuns()));
                    case 20:
                        baseballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    case 21:
                        baseballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(baseballPlayerEventStatistics.getBattingHits()));
                    case 22:
                        baseballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    case 23:
                        baseballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(baseballPlayerEventStatistics.getBattingHits()));
                    case 24:
                        baseballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    case 25:
                        baseballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(baseballPlayerEventStatistics.getBattingRbi()));
                    case 26:
                        baseballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(baseballPlayerEventStatistics.getBattingHomeRuns()));
                    case 27:
                        baseballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(baseballPlayerEventStatistics.getBattingHomeRuns()));
                    case 28:
                        baseballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    default:
                        baseballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(baseballPlayerEventStatistics.getBattingBaseOnBalls()));
                }
            }
        };
        final int i14 = 27;
        Function1 function110 = new Function1() { // from class: v71
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                BaseballPlayerEventStatistics baseballPlayerEventStatistics = (BaseballPlayerEventStatistics) obj;
                switch (i14) {
                    case 0:
                        baseballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(baseballPlayerEventStatistics.getBattingAtBats()));
                    case 1:
                        baseballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(baseballPlayerEventStatistics.getBattingStrikeOuts()));
                    case 2:
                        baseballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(baseballPlayerEventStatistics.getBattingAtBats()));
                    case 3:
                        baseballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    case 4:
                        baseballPlayerEventStatistics.getClass();
                        Double valueOf = Double.valueOf(yid.k(baseballPlayerEventStatistics.getBattingAverageToDate()));
                        yid.k(valueOf);
                        String format = new DecimalFormat(".000", new DecimalFormatSymbols(Locale.US)).format(yid.k(valueOf));
                        format.getClass();
                        return format;
                    case 5:
                        baseballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.k(baseballPlayerEventStatistics.getBattingAverageToDate()));
                    case 6:
                        baseballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    case 7:
                        baseballPlayerEventStatistics.getClass();
                        Double valueOf2 = Double.valueOf(yid.k(baseballPlayerEventStatistics.getBattingOnBasePercentageToDate()));
                        yid.k(valueOf2);
                        String format2 = new DecimalFormat(".000", new DecimalFormatSymbols(Locale.US)).format(yid.k(valueOf2));
                        format2.getClass();
                        return format2;
                    case 8:
                        baseballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.k(baseballPlayerEventStatistics.getBattingOnBasePercentageToDate()));
                    case 9:
                        baseballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    case 10:
                        baseballPlayerEventStatistics.getClass();
                        Double valueOf3 = Double.valueOf(yid.k(baseballPlayerEventStatistics.getBattingSluggingPercentageToDate()));
                        yid.k(valueOf3);
                        String format3 = new DecimalFormat(".000", new DecimalFormatSymbols(Locale.US)).format(yid.k(valueOf3));
                        format3.getClass();
                        return format3;
                    case 11:
                        baseballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(baseballPlayerEventStatistics.getBattingRbi()));
                    case 12:
                        baseballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.k(baseballPlayerEventStatistics.getBattingSluggingPercentageToDate()));
                    case 13:
                        baseballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    case 14:
                        baseballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    case 15:
                        baseballPlayerEventStatistics.getClass();
                        Double valueOf4 = Double.valueOf(yid.k(baseballPlayerEventStatistics.getBattingOpsToDate()));
                        yid.k(valueOf4);
                        String format4 = new DecimalFormat(".000", new DecimalFormatSymbols(Locale.US)).format(yid.k(valueOf4));
                        format4.getClass();
                        return format4;
                    case 16:
                        baseballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.k(baseballPlayerEventStatistics.getBattingOpsToDate()));
                    case 17:
                        baseballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    case 18:
                        baseballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(baseballPlayerEventStatistics.getBattingRuns()));
                    case 19:
                        baseballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(baseballPlayerEventStatistics.getBattingRuns()));
                    case 20:
                        baseballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    case 21:
                        baseballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(baseballPlayerEventStatistics.getBattingHits()));
                    case 22:
                        baseballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    case 23:
                        baseballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(baseballPlayerEventStatistics.getBattingHits()));
                    case 24:
                        baseballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    case 25:
                        baseballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(baseballPlayerEventStatistics.getBattingRbi()));
                    case 26:
                        baseballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(baseballPlayerEventStatistics.getBattingHomeRuns()));
                    case 27:
                        baseballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(baseballPlayerEventStatistics.getBattingHomeRuns()));
                    case 28:
                        baseballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    default:
                        baseballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(baseballPlayerEventStatistics.getBattingBaseOnBalls()));
                }
            }
        };
        final int i15 = 28;
        x71 x71Var5 = new x71(4, R.string.baseball_home_runs_short, R.string.baseball_home_runs, "HOME_RUNS", function19, function110, new Function1() { // from class: v71
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                BaseballPlayerEventStatistics baseballPlayerEventStatistics = (BaseballPlayerEventStatistics) obj;
                switch (i15) {
                    case 0:
                        baseballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(baseballPlayerEventStatistics.getBattingAtBats()));
                    case 1:
                        baseballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(baseballPlayerEventStatistics.getBattingStrikeOuts()));
                    case 2:
                        baseballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(baseballPlayerEventStatistics.getBattingAtBats()));
                    case 3:
                        baseballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    case 4:
                        baseballPlayerEventStatistics.getClass();
                        Double valueOf = Double.valueOf(yid.k(baseballPlayerEventStatistics.getBattingAverageToDate()));
                        yid.k(valueOf);
                        String format = new DecimalFormat(".000", new DecimalFormatSymbols(Locale.US)).format(yid.k(valueOf));
                        format.getClass();
                        return format;
                    case 5:
                        baseballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.k(baseballPlayerEventStatistics.getBattingAverageToDate()));
                    case 6:
                        baseballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    case 7:
                        baseballPlayerEventStatistics.getClass();
                        Double valueOf2 = Double.valueOf(yid.k(baseballPlayerEventStatistics.getBattingOnBasePercentageToDate()));
                        yid.k(valueOf2);
                        String format2 = new DecimalFormat(".000", new DecimalFormatSymbols(Locale.US)).format(yid.k(valueOf2));
                        format2.getClass();
                        return format2;
                    case 8:
                        baseballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.k(baseballPlayerEventStatistics.getBattingOnBasePercentageToDate()));
                    case 9:
                        baseballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    case 10:
                        baseballPlayerEventStatistics.getClass();
                        Double valueOf3 = Double.valueOf(yid.k(baseballPlayerEventStatistics.getBattingSluggingPercentageToDate()));
                        yid.k(valueOf3);
                        String format3 = new DecimalFormat(".000", new DecimalFormatSymbols(Locale.US)).format(yid.k(valueOf3));
                        format3.getClass();
                        return format3;
                    case 11:
                        baseballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(baseballPlayerEventStatistics.getBattingRbi()));
                    case 12:
                        baseballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.k(baseballPlayerEventStatistics.getBattingSluggingPercentageToDate()));
                    case 13:
                        baseballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    case 14:
                        baseballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    case 15:
                        baseballPlayerEventStatistics.getClass();
                        Double valueOf4 = Double.valueOf(yid.k(baseballPlayerEventStatistics.getBattingOpsToDate()));
                        yid.k(valueOf4);
                        String format4 = new DecimalFormat(".000", new DecimalFormatSymbols(Locale.US)).format(yid.k(valueOf4));
                        format4.getClass();
                        return format4;
                    case 16:
                        baseballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.k(baseballPlayerEventStatistics.getBattingOpsToDate()));
                    case 17:
                        baseballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    case 18:
                        baseballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(baseballPlayerEventStatistics.getBattingRuns()));
                    case 19:
                        baseballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(baseballPlayerEventStatistics.getBattingRuns()));
                    case 20:
                        baseballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    case 21:
                        baseballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(baseballPlayerEventStatistics.getBattingHits()));
                    case 22:
                        baseballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    case 23:
                        baseballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(baseballPlayerEventStatistics.getBattingHits()));
                    case 24:
                        baseballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    case 25:
                        baseballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(baseballPlayerEventStatistics.getBattingRbi()));
                    case 26:
                        baseballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(baseballPlayerEventStatistics.getBattingHomeRuns()));
                    case 27:
                        baseballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(baseballPlayerEventStatistics.getBattingHomeRuns()));
                    case 28:
                        baseballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    default:
                        baseballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(baseballPlayerEventStatistics.getBattingBaseOnBalls()));
                }
            }
        }, true);
        final int i16 = 29;
        x71 x71Var6 = new x71(5, R.string.baseball_walks_short, R.string.baseball_walks, "WALKS", new Function1() { // from class: v71
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                BaseballPlayerEventStatistics baseballPlayerEventStatistics = (BaseballPlayerEventStatistics) obj;
                switch (i16) {
                    case 0:
                        baseballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(baseballPlayerEventStatistics.getBattingAtBats()));
                    case 1:
                        baseballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(baseballPlayerEventStatistics.getBattingStrikeOuts()));
                    case 2:
                        baseballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(baseballPlayerEventStatistics.getBattingAtBats()));
                    case 3:
                        baseballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    case 4:
                        baseballPlayerEventStatistics.getClass();
                        Double valueOf = Double.valueOf(yid.k(baseballPlayerEventStatistics.getBattingAverageToDate()));
                        yid.k(valueOf);
                        String format = new DecimalFormat(".000", new DecimalFormatSymbols(Locale.US)).format(yid.k(valueOf));
                        format.getClass();
                        return format;
                    case 5:
                        baseballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.k(baseballPlayerEventStatistics.getBattingAverageToDate()));
                    case 6:
                        baseballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    case 7:
                        baseballPlayerEventStatistics.getClass();
                        Double valueOf2 = Double.valueOf(yid.k(baseballPlayerEventStatistics.getBattingOnBasePercentageToDate()));
                        yid.k(valueOf2);
                        String format2 = new DecimalFormat(".000", new DecimalFormatSymbols(Locale.US)).format(yid.k(valueOf2));
                        format2.getClass();
                        return format2;
                    case 8:
                        baseballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.k(baseballPlayerEventStatistics.getBattingOnBasePercentageToDate()));
                    case 9:
                        baseballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    case 10:
                        baseballPlayerEventStatistics.getClass();
                        Double valueOf3 = Double.valueOf(yid.k(baseballPlayerEventStatistics.getBattingSluggingPercentageToDate()));
                        yid.k(valueOf3);
                        String format3 = new DecimalFormat(".000", new DecimalFormatSymbols(Locale.US)).format(yid.k(valueOf3));
                        format3.getClass();
                        return format3;
                    case 11:
                        baseballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(baseballPlayerEventStatistics.getBattingRbi()));
                    case 12:
                        baseballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.k(baseballPlayerEventStatistics.getBattingSluggingPercentageToDate()));
                    case 13:
                        baseballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    case 14:
                        baseballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    case 15:
                        baseballPlayerEventStatistics.getClass();
                        Double valueOf4 = Double.valueOf(yid.k(baseballPlayerEventStatistics.getBattingOpsToDate()));
                        yid.k(valueOf4);
                        String format4 = new DecimalFormat(".000", new DecimalFormatSymbols(Locale.US)).format(yid.k(valueOf4));
                        format4.getClass();
                        return format4;
                    case 16:
                        baseballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.k(baseballPlayerEventStatistics.getBattingOpsToDate()));
                    case 17:
                        baseballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    case 18:
                        baseballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(baseballPlayerEventStatistics.getBattingRuns()));
                    case 19:
                        baseballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(baseballPlayerEventStatistics.getBattingRuns()));
                    case 20:
                        baseballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    case 21:
                        baseballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(baseballPlayerEventStatistics.getBattingHits()));
                    case 22:
                        baseballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    case 23:
                        baseballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(baseballPlayerEventStatistics.getBattingHits()));
                    case 24:
                        baseballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    case 25:
                        baseballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(baseballPlayerEventStatistics.getBattingRbi()));
                    case 26:
                        baseballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(baseballPlayerEventStatistics.getBattingHomeRuns()));
                    case 27:
                        baseballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(baseballPlayerEventStatistics.getBattingHomeRuns()));
                    case 28:
                        baseballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    default:
                        baseballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(baseballPlayerEventStatistics.getBattingBaseOnBalls()));
                }
            }
        }, new w71(0), new w71(1), true);
        w71 w71Var = new w71(2);
        final int i17 = 1;
        Function1 function111 = new Function1() { // from class: v71
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                BaseballPlayerEventStatistics baseballPlayerEventStatistics = (BaseballPlayerEventStatistics) obj;
                switch (i17) {
                    case 0:
                        baseballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(baseballPlayerEventStatistics.getBattingAtBats()));
                    case 1:
                        baseballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(baseballPlayerEventStatistics.getBattingStrikeOuts()));
                    case 2:
                        baseballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(baseballPlayerEventStatistics.getBattingAtBats()));
                    case 3:
                        baseballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    case 4:
                        baseballPlayerEventStatistics.getClass();
                        Double valueOf = Double.valueOf(yid.k(baseballPlayerEventStatistics.getBattingAverageToDate()));
                        yid.k(valueOf);
                        String format = new DecimalFormat(".000", new DecimalFormatSymbols(Locale.US)).format(yid.k(valueOf));
                        format.getClass();
                        return format;
                    case 5:
                        baseballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.k(baseballPlayerEventStatistics.getBattingAverageToDate()));
                    case 6:
                        baseballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    case 7:
                        baseballPlayerEventStatistics.getClass();
                        Double valueOf2 = Double.valueOf(yid.k(baseballPlayerEventStatistics.getBattingOnBasePercentageToDate()));
                        yid.k(valueOf2);
                        String format2 = new DecimalFormat(".000", new DecimalFormatSymbols(Locale.US)).format(yid.k(valueOf2));
                        format2.getClass();
                        return format2;
                    case 8:
                        baseballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.k(baseballPlayerEventStatistics.getBattingOnBasePercentageToDate()));
                    case 9:
                        baseballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    case 10:
                        baseballPlayerEventStatistics.getClass();
                        Double valueOf3 = Double.valueOf(yid.k(baseballPlayerEventStatistics.getBattingSluggingPercentageToDate()));
                        yid.k(valueOf3);
                        String format3 = new DecimalFormat(".000", new DecimalFormatSymbols(Locale.US)).format(yid.k(valueOf3));
                        format3.getClass();
                        return format3;
                    case 11:
                        baseballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(baseballPlayerEventStatistics.getBattingRbi()));
                    case 12:
                        baseballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.k(baseballPlayerEventStatistics.getBattingSluggingPercentageToDate()));
                    case 13:
                        baseballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    case 14:
                        baseballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    case 15:
                        baseballPlayerEventStatistics.getClass();
                        Double valueOf4 = Double.valueOf(yid.k(baseballPlayerEventStatistics.getBattingOpsToDate()));
                        yid.k(valueOf4);
                        String format4 = new DecimalFormat(".000", new DecimalFormatSymbols(Locale.US)).format(yid.k(valueOf4));
                        format4.getClass();
                        return format4;
                    case 16:
                        baseballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.k(baseballPlayerEventStatistics.getBattingOpsToDate()));
                    case 17:
                        baseballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    case 18:
                        baseballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(baseballPlayerEventStatistics.getBattingRuns()));
                    case 19:
                        baseballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(baseballPlayerEventStatistics.getBattingRuns()));
                    case 20:
                        baseballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    case 21:
                        baseballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(baseballPlayerEventStatistics.getBattingHits()));
                    case 22:
                        baseballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    case 23:
                        baseballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(baseballPlayerEventStatistics.getBattingHits()));
                    case 24:
                        baseballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    case 25:
                        baseballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(baseballPlayerEventStatistics.getBattingRbi()));
                    case 26:
                        baseballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(baseballPlayerEventStatistics.getBattingHomeRuns()));
                    case 27:
                        baseballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(baseballPlayerEventStatistics.getBattingHomeRuns()));
                    case 28:
                        baseballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    default:
                        baseballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(baseballPlayerEventStatistics.getBattingBaseOnBalls()));
                }
            }
        };
        final int i18 = 3;
        x71 x71Var7 = new x71(6, R.string.baseball_strikeouts_short, R.string.baseball_strikeouts, "STRIKEOUTS", w71Var, function111, new Function1() { // from class: v71
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                BaseballPlayerEventStatistics baseballPlayerEventStatistics = (BaseballPlayerEventStatistics) obj;
                switch (i18) {
                    case 0:
                        baseballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(baseballPlayerEventStatistics.getBattingAtBats()));
                    case 1:
                        baseballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(baseballPlayerEventStatistics.getBattingStrikeOuts()));
                    case 2:
                        baseballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(baseballPlayerEventStatistics.getBattingAtBats()));
                    case 3:
                        baseballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    case 4:
                        baseballPlayerEventStatistics.getClass();
                        Double valueOf = Double.valueOf(yid.k(baseballPlayerEventStatistics.getBattingAverageToDate()));
                        yid.k(valueOf);
                        String format = new DecimalFormat(".000", new DecimalFormatSymbols(Locale.US)).format(yid.k(valueOf));
                        format.getClass();
                        return format;
                    case 5:
                        baseballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.k(baseballPlayerEventStatistics.getBattingAverageToDate()));
                    case 6:
                        baseballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    case 7:
                        baseballPlayerEventStatistics.getClass();
                        Double valueOf2 = Double.valueOf(yid.k(baseballPlayerEventStatistics.getBattingOnBasePercentageToDate()));
                        yid.k(valueOf2);
                        String format2 = new DecimalFormat(".000", new DecimalFormatSymbols(Locale.US)).format(yid.k(valueOf2));
                        format2.getClass();
                        return format2;
                    case 8:
                        baseballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.k(baseballPlayerEventStatistics.getBattingOnBasePercentageToDate()));
                    case 9:
                        baseballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    case 10:
                        baseballPlayerEventStatistics.getClass();
                        Double valueOf3 = Double.valueOf(yid.k(baseballPlayerEventStatistics.getBattingSluggingPercentageToDate()));
                        yid.k(valueOf3);
                        String format3 = new DecimalFormat(".000", new DecimalFormatSymbols(Locale.US)).format(yid.k(valueOf3));
                        format3.getClass();
                        return format3;
                    case 11:
                        baseballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(baseballPlayerEventStatistics.getBattingRbi()));
                    case 12:
                        baseballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.k(baseballPlayerEventStatistics.getBattingSluggingPercentageToDate()));
                    case 13:
                        baseballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    case 14:
                        baseballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    case 15:
                        baseballPlayerEventStatistics.getClass();
                        Double valueOf4 = Double.valueOf(yid.k(baseballPlayerEventStatistics.getBattingOpsToDate()));
                        yid.k(valueOf4);
                        String format4 = new DecimalFormat(".000", new DecimalFormatSymbols(Locale.US)).format(yid.k(valueOf4));
                        format4.getClass();
                        return format4;
                    case 16:
                        baseballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.k(baseballPlayerEventStatistics.getBattingOpsToDate()));
                    case 17:
                        baseballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    case 18:
                        baseballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(baseballPlayerEventStatistics.getBattingRuns()));
                    case 19:
                        baseballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(baseballPlayerEventStatistics.getBattingRuns()));
                    case 20:
                        baseballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    case 21:
                        baseballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(baseballPlayerEventStatistics.getBattingHits()));
                    case 22:
                        baseballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    case 23:
                        baseballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(baseballPlayerEventStatistics.getBattingHits()));
                    case 24:
                        baseballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    case 25:
                        baseballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(baseballPlayerEventStatistics.getBattingRbi()));
                    case 26:
                        baseballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(baseballPlayerEventStatistics.getBattingHomeRuns()));
                    case 27:
                        baseballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(baseballPlayerEventStatistics.getBattingHomeRuns()));
                    case 28:
                        baseballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    default:
                        baseballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(baseballPlayerEventStatistics.getBattingBaseOnBalls()));
                }
            }
        }, true);
        final int i19 = 4;
        Function1 function112 = new Function1() { // from class: v71
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                BaseballPlayerEventStatistics baseballPlayerEventStatistics = (BaseballPlayerEventStatistics) obj;
                switch (i19) {
                    case 0:
                        baseballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(baseballPlayerEventStatistics.getBattingAtBats()));
                    case 1:
                        baseballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(baseballPlayerEventStatistics.getBattingStrikeOuts()));
                    case 2:
                        baseballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(baseballPlayerEventStatistics.getBattingAtBats()));
                    case 3:
                        baseballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    case 4:
                        baseballPlayerEventStatistics.getClass();
                        Double valueOf = Double.valueOf(yid.k(baseballPlayerEventStatistics.getBattingAverageToDate()));
                        yid.k(valueOf);
                        String format = new DecimalFormat(".000", new DecimalFormatSymbols(Locale.US)).format(yid.k(valueOf));
                        format.getClass();
                        return format;
                    case 5:
                        baseballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.k(baseballPlayerEventStatistics.getBattingAverageToDate()));
                    case 6:
                        baseballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    case 7:
                        baseballPlayerEventStatistics.getClass();
                        Double valueOf2 = Double.valueOf(yid.k(baseballPlayerEventStatistics.getBattingOnBasePercentageToDate()));
                        yid.k(valueOf2);
                        String format2 = new DecimalFormat(".000", new DecimalFormatSymbols(Locale.US)).format(yid.k(valueOf2));
                        format2.getClass();
                        return format2;
                    case 8:
                        baseballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.k(baseballPlayerEventStatistics.getBattingOnBasePercentageToDate()));
                    case 9:
                        baseballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    case 10:
                        baseballPlayerEventStatistics.getClass();
                        Double valueOf3 = Double.valueOf(yid.k(baseballPlayerEventStatistics.getBattingSluggingPercentageToDate()));
                        yid.k(valueOf3);
                        String format3 = new DecimalFormat(".000", new DecimalFormatSymbols(Locale.US)).format(yid.k(valueOf3));
                        format3.getClass();
                        return format3;
                    case 11:
                        baseballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(baseballPlayerEventStatistics.getBattingRbi()));
                    case 12:
                        baseballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.k(baseballPlayerEventStatistics.getBattingSluggingPercentageToDate()));
                    case 13:
                        baseballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    case 14:
                        baseballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    case 15:
                        baseballPlayerEventStatistics.getClass();
                        Double valueOf4 = Double.valueOf(yid.k(baseballPlayerEventStatistics.getBattingOpsToDate()));
                        yid.k(valueOf4);
                        String format4 = new DecimalFormat(".000", new DecimalFormatSymbols(Locale.US)).format(yid.k(valueOf4));
                        format4.getClass();
                        return format4;
                    case 16:
                        baseballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.k(baseballPlayerEventStatistics.getBattingOpsToDate()));
                    case 17:
                        baseballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    case 18:
                        baseballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(baseballPlayerEventStatistics.getBattingRuns()));
                    case 19:
                        baseballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(baseballPlayerEventStatistics.getBattingRuns()));
                    case 20:
                        baseballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    case 21:
                        baseballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(baseballPlayerEventStatistics.getBattingHits()));
                    case 22:
                        baseballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    case 23:
                        baseballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(baseballPlayerEventStatistics.getBattingHits()));
                    case 24:
                        baseballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    case 25:
                        baseballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(baseballPlayerEventStatistics.getBattingRbi()));
                    case 26:
                        baseballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(baseballPlayerEventStatistics.getBattingHomeRuns()));
                    case 27:
                        baseballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(baseballPlayerEventStatistics.getBattingHomeRuns()));
                    case 28:
                        baseballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    default:
                        baseballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(baseballPlayerEventStatistics.getBattingBaseOnBalls()));
                }
            }
        };
        final int i20 = 5;
        Function1 function113 = new Function1() { // from class: v71
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                BaseballPlayerEventStatistics baseballPlayerEventStatistics = (BaseballPlayerEventStatistics) obj;
                switch (i20) {
                    case 0:
                        baseballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(baseballPlayerEventStatistics.getBattingAtBats()));
                    case 1:
                        baseballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(baseballPlayerEventStatistics.getBattingStrikeOuts()));
                    case 2:
                        baseballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(baseballPlayerEventStatistics.getBattingAtBats()));
                    case 3:
                        baseballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    case 4:
                        baseballPlayerEventStatistics.getClass();
                        Double valueOf = Double.valueOf(yid.k(baseballPlayerEventStatistics.getBattingAverageToDate()));
                        yid.k(valueOf);
                        String format = new DecimalFormat(".000", new DecimalFormatSymbols(Locale.US)).format(yid.k(valueOf));
                        format.getClass();
                        return format;
                    case 5:
                        baseballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.k(baseballPlayerEventStatistics.getBattingAverageToDate()));
                    case 6:
                        baseballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    case 7:
                        baseballPlayerEventStatistics.getClass();
                        Double valueOf2 = Double.valueOf(yid.k(baseballPlayerEventStatistics.getBattingOnBasePercentageToDate()));
                        yid.k(valueOf2);
                        String format2 = new DecimalFormat(".000", new DecimalFormatSymbols(Locale.US)).format(yid.k(valueOf2));
                        format2.getClass();
                        return format2;
                    case 8:
                        baseballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.k(baseballPlayerEventStatistics.getBattingOnBasePercentageToDate()));
                    case 9:
                        baseballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    case 10:
                        baseballPlayerEventStatistics.getClass();
                        Double valueOf3 = Double.valueOf(yid.k(baseballPlayerEventStatistics.getBattingSluggingPercentageToDate()));
                        yid.k(valueOf3);
                        String format3 = new DecimalFormat(".000", new DecimalFormatSymbols(Locale.US)).format(yid.k(valueOf3));
                        format3.getClass();
                        return format3;
                    case 11:
                        baseballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(baseballPlayerEventStatistics.getBattingRbi()));
                    case 12:
                        baseballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.k(baseballPlayerEventStatistics.getBattingSluggingPercentageToDate()));
                    case 13:
                        baseballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    case 14:
                        baseballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    case 15:
                        baseballPlayerEventStatistics.getClass();
                        Double valueOf4 = Double.valueOf(yid.k(baseballPlayerEventStatistics.getBattingOpsToDate()));
                        yid.k(valueOf4);
                        String format4 = new DecimalFormat(".000", new DecimalFormatSymbols(Locale.US)).format(yid.k(valueOf4));
                        format4.getClass();
                        return format4;
                    case 16:
                        baseballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.k(baseballPlayerEventStatistics.getBattingOpsToDate()));
                    case 17:
                        baseballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    case 18:
                        baseballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(baseballPlayerEventStatistics.getBattingRuns()));
                    case 19:
                        baseballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(baseballPlayerEventStatistics.getBattingRuns()));
                    case 20:
                        baseballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    case 21:
                        baseballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(baseballPlayerEventStatistics.getBattingHits()));
                    case 22:
                        baseballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    case 23:
                        baseballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(baseballPlayerEventStatistics.getBattingHits()));
                    case 24:
                        baseballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    case 25:
                        baseballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(baseballPlayerEventStatistics.getBattingRbi()));
                    case 26:
                        baseballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(baseballPlayerEventStatistics.getBattingHomeRuns()));
                    case 27:
                        baseballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(baseballPlayerEventStatistics.getBattingHomeRuns()));
                    case 28:
                        baseballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    default:
                        baseballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(baseballPlayerEventStatistics.getBattingBaseOnBalls()));
                }
            }
        };
        final int i21 = 6;
        x71 x71Var8 = new x71(7, R.string.baseball_batting_average_short, R.string.baseball_batting_average, "BATTING_AVERAGE", function112, function113, new Function1() { // from class: v71
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                BaseballPlayerEventStatistics baseballPlayerEventStatistics = (BaseballPlayerEventStatistics) obj;
                switch (i21) {
                    case 0:
                        baseballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(baseballPlayerEventStatistics.getBattingAtBats()));
                    case 1:
                        baseballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(baseballPlayerEventStatistics.getBattingStrikeOuts()));
                    case 2:
                        baseballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(baseballPlayerEventStatistics.getBattingAtBats()));
                    case 3:
                        baseballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    case 4:
                        baseballPlayerEventStatistics.getClass();
                        Double valueOf = Double.valueOf(yid.k(baseballPlayerEventStatistics.getBattingAverageToDate()));
                        yid.k(valueOf);
                        String format = new DecimalFormat(".000", new DecimalFormatSymbols(Locale.US)).format(yid.k(valueOf));
                        format.getClass();
                        return format;
                    case 5:
                        baseballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.k(baseballPlayerEventStatistics.getBattingAverageToDate()));
                    case 6:
                        baseballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    case 7:
                        baseballPlayerEventStatistics.getClass();
                        Double valueOf2 = Double.valueOf(yid.k(baseballPlayerEventStatistics.getBattingOnBasePercentageToDate()));
                        yid.k(valueOf2);
                        String format2 = new DecimalFormat(".000", new DecimalFormatSymbols(Locale.US)).format(yid.k(valueOf2));
                        format2.getClass();
                        return format2;
                    case 8:
                        baseballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.k(baseballPlayerEventStatistics.getBattingOnBasePercentageToDate()));
                    case 9:
                        baseballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    case 10:
                        baseballPlayerEventStatistics.getClass();
                        Double valueOf3 = Double.valueOf(yid.k(baseballPlayerEventStatistics.getBattingSluggingPercentageToDate()));
                        yid.k(valueOf3);
                        String format3 = new DecimalFormat(".000", new DecimalFormatSymbols(Locale.US)).format(yid.k(valueOf3));
                        format3.getClass();
                        return format3;
                    case 11:
                        baseballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(baseballPlayerEventStatistics.getBattingRbi()));
                    case 12:
                        baseballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.k(baseballPlayerEventStatistics.getBattingSluggingPercentageToDate()));
                    case 13:
                        baseballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    case 14:
                        baseballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    case 15:
                        baseballPlayerEventStatistics.getClass();
                        Double valueOf4 = Double.valueOf(yid.k(baseballPlayerEventStatistics.getBattingOpsToDate()));
                        yid.k(valueOf4);
                        String format4 = new DecimalFormat(".000", new DecimalFormatSymbols(Locale.US)).format(yid.k(valueOf4));
                        format4.getClass();
                        return format4;
                    case 16:
                        baseballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.k(baseballPlayerEventStatistics.getBattingOpsToDate()));
                    case 17:
                        baseballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    case 18:
                        baseballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(baseballPlayerEventStatistics.getBattingRuns()));
                    case 19:
                        baseballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(baseballPlayerEventStatistics.getBattingRuns()));
                    case 20:
                        baseballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    case 21:
                        baseballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(baseballPlayerEventStatistics.getBattingHits()));
                    case 22:
                        baseballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    case 23:
                        baseballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(baseballPlayerEventStatistics.getBattingHits()));
                    case 24:
                        baseballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    case 25:
                        baseballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(baseballPlayerEventStatistics.getBattingRbi()));
                    case 26:
                        baseballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(baseballPlayerEventStatistics.getBattingHomeRuns()));
                    case 27:
                        baseballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(baseballPlayerEventStatistics.getBattingHomeRuns()));
                    case 28:
                        baseballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    default:
                        baseballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(baseballPlayerEventStatistics.getBattingBaseOnBalls()));
                }
            }
        }, false);
        final int i22 = 7;
        Function1 function114 = new Function1() { // from class: v71
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                BaseballPlayerEventStatistics baseballPlayerEventStatistics = (BaseballPlayerEventStatistics) obj;
                switch (i22) {
                    case 0:
                        baseballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(baseballPlayerEventStatistics.getBattingAtBats()));
                    case 1:
                        baseballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(baseballPlayerEventStatistics.getBattingStrikeOuts()));
                    case 2:
                        baseballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(baseballPlayerEventStatistics.getBattingAtBats()));
                    case 3:
                        baseballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    case 4:
                        baseballPlayerEventStatistics.getClass();
                        Double valueOf = Double.valueOf(yid.k(baseballPlayerEventStatistics.getBattingAverageToDate()));
                        yid.k(valueOf);
                        String format = new DecimalFormat(".000", new DecimalFormatSymbols(Locale.US)).format(yid.k(valueOf));
                        format.getClass();
                        return format;
                    case 5:
                        baseballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.k(baseballPlayerEventStatistics.getBattingAverageToDate()));
                    case 6:
                        baseballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    case 7:
                        baseballPlayerEventStatistics.getClass();
                        Double valueOf2 = Double.valueOf(yid.k(baseballPlayerEventStatistics.getBattingOnBasePercentageToDate()));
                        yid.k(valueOf2);
                        String format2 = new DecimalFormat(".000", new DecimalFormatSymbols(Locale.US)).format(yid.k(valueOf2));
                        format2.getClass();
                        return format2;
                    case 8:
                        baseballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.k(baseballPlayerEventStatistics.getBattingOnBasePercentageToDate()));
                    case 9:
                        baseballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    case 10:
                        baseballPlayerEventStatistics.getClass();
                        Double valueOf3 = Double.valueOf(yid.k(baseballPlayerEventStatistics.getBattingSluggingPercentageToDate()));
                        yid.k(valueOf3);
                        String format3 = new DecimalFormat(".000", new DecimalFormatSymbols(Locale.US)).format(yid.k(valueOf3));
                        format3.getClass();
                        return format3;
                    case 11:
                        baseballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(baseballPlayerEventStatistics.getBattingRbi()));
                    case 12:
                        baseballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.k(baseballPlayerEventStatistics.getBattingSluggingPercentageToDate()));
                    case 13:
                        baseballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    case 14:
                        baseballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    case 15:
                        baseballPlayerEventStatistics.getClass();
                        Double valueOf4 = Double.valueOf(yid.k(baseballPlayerEventStatistics.getBattingOpsToDate()));
                        yid.k(valueOf4);
                        String format4 = new DecimalFormat(".000", new DecimalFormatSymbols(Locale.US)).format(yid.k(valueOf4));
                        format4.getClass();
                        return format4;
                    case 16:
                        baseballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.k(baseballPlayerEventStatistics.getBattingOpsToDate()));
                    case 17:
                        baseballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    case 18:
                        baseballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(baseballPlayerEventStatistics.getBattingRuns()));
                    case 19:
                        baseballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(baseballPlayerEventStatistics.getBattingRuns()));
                    case 20:
                        baseballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    case 21:
                        baseballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(baseballPlayerEventStatistics.getBattingHits()));
                    case 22:
                        baseballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    case 23:
                        baseballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(baseballPlayerEventStatistics.getBattingHits()));
                    case 24:
                        baseballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    case 25:
                        baseballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(baseballPlayerEventStatistics.getBattingRbi()));
                    case 26:
                        baseballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(baseballPlayerEventStatistics.getBattingHomeRuns()));
                    case 27:
                        baseballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(baseballPlayerEventStatistics.getBattingHomeRuns()));
                    case 28:
                        baseballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    default:
                        baseballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(baseballPlayerEventStatistics.getBattingBaseOnBalls()));
                }
            }
        };
        final int i23 = 8;
        Function1 function115 = new Function1() { // from class: v71
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                BaseballPlayerEventStatistics baseballPlayerEventStatistics = (BaseballPlayerEventStatistics) obj;
                switch (i23) {
                    case 0:
                        baseballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(baseballPlayerEventStatistics.getBattingAtBats()));
                    case 1:
                        baseballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(baseballPlayerEventStatistics.getBattingStrikeOuts()));
                    case 2:
                        baseballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(baseballPlayerEventStatistics.getBattingAtBats()));
                    case 3:
                        baseballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    case 4:
                        baseballPlayerEventStatistics.getClass();
                        Double valueOf = Double.valueOf(yid.k(baseballPlayerEventStatistics.getBattingAverageToDate()));
                        yid.k(valueOf);
                        String format = new DecimalFormat(".000", new DecimalFormatSymbols(Locale.US)).format(yid.k(valueOf));
                        format.getClass();
                        return format;
                    case 5:
                        baseballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.k(baseballPlayerEventStatistics.getBattingAverageToDate()));
                    case 6:
                        baseballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    case 7:
                        baseballPlayerEventStatistics.getClass();
                        Double valueOf2 = Double.valueOf(yid.k(baseballPlayerEventStatistics.getBattingOnBasePercentageToDate()));
                        yid.k(valueOf2);
                        String format2 = new DecimalFormat(".000", new DecimalFormatSymbols(Locale.US)).format(yid.k(valueOf2));
                        format2.getClass();
                        return format2;
                    case 8:
                        baseballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.k(baseballPlayerEventStatistics.getBattingOnBasePercentageToDate()));
                    case 9:
                        baseballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    case 10:
                        baseballPlayerEventStatistics.getClass();
                        Double valueOf3 = Double.valueOf(yid.k(baseballPlayerEventStatistics.getBattingSluggingPercentageToDate()));
                        yid.k(valueOf3);
                        String format3 = new DecimalFormat(".000", new DecimalFormatSymbols(Locale.US)).format(yid.k(valueOf3));
                        format3.getClass();
                        return format3;
                    case 11:
                        baseballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(baseballPlayerEventStatistics.getBattingRbi()));
                    case 12:
                        baseballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.k(baseballPlayerEventStatistics.getBattingSluggingPercentageToDate()));
                    case 13:
                        baseballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    case 14:
                        baseballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    case 15:
                        baseballPlayerEventStatistics.getClass();
                        Double valueOf4 = Double.valueOf(yid.k(baseballPlayerEventStatistics.getBattingOpsToDate()));
                        yid.k(valueOf4);
                        String format4 = new DecimalFormat(".000", new DecimalFormatSymbols(Locale.US)).format(yid.k(valueOf4));
                        format4.getClass();
                        return format4;
                    case 16:
                        baseballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.k(baseballPlayerEventStatistics.getBattingOpsToDate()));
                    case 17:
                        baseballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    case 18:
                        baseballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(baseballPlayerEventStatistics.getBattingRuns()));
                    case 19:
                        baseballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(baseballPlayerEventStatistics.getBattingRuns()));
                    case 20:
                        baseballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    case 21:
                        baseballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(baseballPlayerEventStatistics.getBattingHits()));
                    case 22:
                        baseballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    case 23:
                        baseballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(baseballPlayerEventStatistics.getBattingHits()));
                    case 24:
                        baseballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    case 25:
                        baseballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(baseballPlayerEventStatistics.getBattingRbi()));
                    case 26:
                        baseballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(baseballPlayerEventStatistics.getBattingHomeRuns()));
                    case 27:
                        baseballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(baseballPlayerEventStatistics.getBattingHomeRuns()));
                    case 28:
                        baseballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    default:
                        baseballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(baseballPlayerEventStatistics.getBattingBaseOnBalls()));
                }
            }
        };
        final int i24 = 9;
        x71 x71Var9 = new x71(8, R.string.baseball_on_base_percentage_short, R.string.baseball_on_base_percentage, "ON_BASE_PERCENTAGE", function114, function115, new Function1() { // from class: v71
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                BaseballPlayerEventStatistics baseballPlayerEventStatistics = (BaseballPlayerEventStatistics) obj;
                switch (i24) {
                    case 0:
                        baseballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(baseballPlayerEventStatistics.getBattingAtBats()));
                    case 1:
                        baseballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(baseballPlayerEventStatistics.getBattingStrikeOuts()));
                    case 2:
                        baseballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(baseballPlayerEventStatistics.getBattingAtBats()));
                    case 3:
                        baseballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    case 4:
                        baseballPlayerEventStatistics.getClass();
                        Double valueOf = Double.valueOf(yid.k(baseballPlayerEventStatistics.getBattingAverageToDate()));
                        yid.k(valueOf);
                        String format = new DecimalFormat(".000", new DecimalFormatSymbols(Locale.US)).format(yid.k(valueOf));
                        format.getClass();
                        return format;
                    case 5:
                        baseballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.k(baseballPlayerEventStatistics.getBattingAverageToDate()));
                    case 6:
                        baseballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    case 7:
                        baseballPlayerEventStatistics.getClass();
                        Double valueOf2 = Double.valueOf(yid.k(baseballPlayerEventStatistics.getBattingOnBasePercentageToDate()));
                        yid.k(valueOf2);
                        String format2 = new DecimalFormat(".000", new DecimalFormatSymbols(Locale.US)).format(yid.k(valueOf2));
                        format2.getClass();
                        return format2;
                    case 8:
                        baseballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.k(baseballPlayerEventStatistics.getBattingOnBasePercentageToDate()));
                    case 9:
                        baseballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    case 10:
                        baseballPlayerEventStatistics.getClass();
                        Double valueOf3 = Double.valueOf(yid.k(baseballPlayerEventStatistics.getBattingSluggingPercentageToDate()));
                        yid.k(valueOf3);
                        String format3 = new DecimalFormat(".000", new DecimalFormatSymbols(Locale.US)).format(yid.k(valueOf3));
                        format3.getClass();
                        return format3;
                    case 11:
                        baseballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(baseballPlayerEventStatistics.getBattingRbi()));
                    case 12:
                        baseballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.k(baseballPlayerEventStatistics.getBattingSluggingPercentageToDate()));
                    case 13:
                        baseballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    case 14:
                        baseballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    case 15:
                        baseballPlayerEventStatistics.getClass();
                        Double valueOf4 = Double.valueOf(yid.k(baseballPlayerEventStatistics.getBattingOpsToDate()));
                        yid.k(valueOf4);
                        String format4 = new DecimalFormat(".000", new DecimalFormatSymbols(Locale.US)).format(yid.k(valueOf4));
                        format4.getClass();
                        return format4;
                    case 16:
                        baseballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.k(baseballPlayerEventStatistics.getBattingOpsToDate()));
                    case 17:
                        baseballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    case 18:
                        baseballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(baseballPlayerEventStatistics.getBattingRuns()));
                    case 19:
                        baseballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(baseballPlayerEventStatistics.getBattingRuns()));
                    case 20:
                        baseballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    case 21:
                        baseballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(baseballPlayerEventStatistics.getBattingHits()));
                    case 22:
                        baseballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    case 23:
                        baseballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(baseballPlayerEventStatistics.getBattingHits()));
                    case 24:
                        baseballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    case 25:
                        baseballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(baseballPlayerEventStatistics.getBattingRbi()));
                    case 26:
                        baseballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(baseballPlayerEventStatistics.getBattingHomeRuns()));
                    case 27:
                        baseballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(baseballPlayerEventStatistics.getBattingHomeRuns()));
                    case 28:
                        baseballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    default:
                        baseballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(baseballPlayerEventStatistics.getBattingBaseOnBalls()));
                }
            }
        }, false);
        final int i25 = 10;
        Function1 function116 = new Function1() { // from class: v71
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                BaseballPlayerEventStatistics baseballPlayerEventStatistics = (BaseballPlayerEventStatistics) obj;
                switch (i25) {
                    case 0:
                        baseballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(baseballPlayerEventStatistics.getBattingAtBats()));
                    case 1:
                        baseballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(baseballPlayerEventStatistics.getBattingStrikeOuts()));
                    case 2:
                        baseballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(baseballPlayerEventStatistics.getBattingAtBats()));
                    case 3:
                        baseballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    case 4:
                        baseballPlayerEventStatistics.getClass();
                        Double valueOf = Double.valueOf(yid.k(baseballPlayerEventStatistics.getBattingAverageToDate()));
                        yid.k(valueOf);
                        String format = new DecimalFormat(".000", new DecimalFormatSymbols(Locale.US)).format(yid.k(valueOf));
                        format.getClass();
                        return format;
                    case 5:
                        baseballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.k(baseballPlayerEventStatistics.getBattingAverageToDate()));
                    case 6:
                        baseballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    case 7:
                        baseballPlayerEventStatistics.getClass();
                        Double valueOf2 = Double.valueOf(yid.k(baseballPlayerEventStatistics.getBattingOnBasePercentageToDate()));
                        yid.k(valueOf2);
                        String format2 = new DecimalFormat(".000", new DecimalFormatSymbols(Locale.US)).format(yid.k(valueOf2));
                        format2.getClass();
                        return format2;
                    case 8:
                        baseballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.k(baseballPlayerEventStatistics.getBattingOnBasePercentageToDate()));
                    case 9:
                        baseballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    case 10:
                        baseballPlayerEventStatistics.getClass();
                        Double valueOf3 = Double.valueOf(yid.k(baseballPlayerEventStatistics.getBattingSluggingPercentageToDate()));
                        yid.k(valueOf3);
                        String format3 = new DecimalFormat(".000", new DecimalFormatSymbols(Locale.US)).format(yid.k(valueOf3));
                        format3.getClass();
                        return format3;
                    case 11:
                        baseballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(baseballPlayerEventStatistics.getBattingRbi()));
                    case 12:
                        baseballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.k(baseballPlayerEventStatistics.getBattingSluggingPercentageToDate()));
                    case 13:
                        baseballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    case 14:
                        baseballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    case 15:
                        baseballPlayerEventStatistics.getClass();
                        Double valueOf4 = Double.valueOf(yid.k(baseballPlayerEventStatistics.getBattingOpsToDate()));
                        yid.k(valueOf4);
                        String format4 = new DecimalFormat(".000", new DecimalFormatSymbols(Locale.US)).format(yid.k(valueOf4));
                        format4.getClass();
                        return format4;
                    case 16:
                        baseballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.k(baseballPlayerEventStatistics.getBattingOpsToDate()));
                    case 17:
                        baseballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    case 18:
                        baseballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(baseballPlayerEventStatistics.getBattingRuns()));
                    case 19:
                        baseballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(baseballPlayerEventStatistics.getBattingRuns()));
                    case 20:
                        baseballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    case 21:
                        baseballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(baseballPlayerEventStatistics.getBattingHits()));
                    case 22:
                        baseballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    case 23:
                        baseballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(baseballPlayerEventStatistics.getBattingHits()));
                    case 24:
                        baseballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    case 25:
                        baseballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(baseballPlayerEventStatistics.getBattingRbi()));
                    case 26:
                        baseballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(baseballPlayerEventStatistics.getBattingHomeRuns()));
                    case 27:
                        baseballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(baseballPlayerEventStatistics.getBattingHomeRuns()));
                    case 28:
                        baseballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    default:
                        baseballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(baseballPlayerEventStatistics.getBattingBaseOnBalls()));
                }
            }
        };
        final int i26 = 12;
        final int i27 = 13;
        x71 x71Var10 = new x71(9, R.string.baseball_slugging_percentage_short, R.string.baseball_slugging_percentage, "SLUGGING_PERCENTAGE", function116, new Function1() { // from class: v71
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                BaseballPlayerEventStatistics baseballPlayerEventStatistics = (BaseballPlayerEventStatistics) obj;
                switch (i26) {
                    case 0:
                        baseballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(baseballPlayerEventStatistics.getBattingAtBats()));
                    case 1:
                        baseballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(baseballPlayerEventStatistics.getBattingStrikeOuts()));
                    case 2:
                        baseballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(baseballPlayerEventStatistics.getBattingAtBats()));
                    case 3:
                        baseballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    case 4:
                        baseballPlayerEventStatistics.getClass();
                        Double valueOf = Double.valueOf(yid.k(baseballPlayerEventStatistics.getBattingAverageToDate()));
                        yid.k(valueOf);
                        String format = new DecimalFormat(".000", new DecimalFormatSymbols(Locale.US)).format(yid.k(valueOf));
                        format.getClass();
                        return format;
                    case 5:
                        baseballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.k(baseballPlayerEventStatistics.getBattingAverageToDate()));
                    case 6:
                        baseballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    case 7:
                        baseballPlayerEventStatistics.getClass();
                        Double valueOf2 = Double.valueOf(yid.k(baseballPlayerEventStatistics.getBattingOnBasePercentageToDate()));
                        yid.k(valueOf2);
                        String format2 = new DecimalFormat(".000", new DecimalFormatSymbols(Locale.US)).format(yid.k(valueOf2));
                        format2.getClass();
                        return format2;
                    case 8:
                        baseballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.k(baseballPlayerEventStatistics.getBattingOnBasePercentageToDate()));
                    case 9:
                        baseballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    case 10:
                        baseballPlayerEventStatistics.getClass();
                        Double valueOf3 = Double.valueOf(yid.k(baseballPlayerEventStatistics.getBattingSluggingPercentageToDate()));
                        yid.k(valueOf3);
                        String format3 = new DecimalFormat(".000", new DecimalFormatSymbols(Locale.US)).format(yid.k(valueOf3));
                        format3.getClass();
                        return format3;
                    case 11:
                        baseballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(baseballPlayerEventStatistics.getBattingRbi()));
                    case 12:
                        baseballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.k(baseballPlayerEventStatistics.getBattingSluggingPercentageToDate()));
                    case 13:
                        baseballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    case 14:
                        baseballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    case 15:
                        baseballPlayerEventStatistics.getClass();
                        Double valueOf4 = Double.valueOf(yid.k(baseballPlayerEventStatistics.getBattingOpsToDate()));
                        yid.k(valueOf4);
                        String format4 = new DecimalFormat(".000", new DecimalFormatSymbols(Locale.US)).format(yid.k(valueOf4));
                        format4.getClass();
                        return format4;
                    case 16:
                        baseballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.k(baseballPlayerEventStatistics.getBattingOpsToDate()));
                    case 17:
                        baseballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    case 18:
                        baseballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(baseballPlayerEventStatistics.getBattingRuns()));
                    case 19:
                        baseballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(baseballPlayerEventStatistics.getBattingRuns()));
                    case 20:
                        baseballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    case 21:
                        baseballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(baseballPlayerEventStatistics.getBattingHits()));
                    case 22:
                        baseballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    case 23:
                        baseballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(baseballPlayerEventStatistics.getBattingHits()));
                    case 24:
                        baseballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    case 25:
                        baseballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(baseballPlayerEventStatistics.getBattingRbi()));
                    case 26:
                        baseballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(baseballPlayerEventStatistics.getBattingHomeRuns()));
                    case 27:
                        baseballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(baseballPlayerEventStatistics.getBattingHomeRuns()));
                    case 28:
                        baseballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    default:
                        baseballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(baseballPlayerEventStatistics.getBattingBaseOnBalls()));
                }
            }
        }, new Function1() { // from class: v71
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                BaseballPlayerEventStatistics baseballPlayerEventStatistics = (BaseballPlayerEventStatistics) obj;
                switch (i27) {
                    case 0:
                        baseballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(baseballPlayerEventStatistics.getBattingAtBats()));
                    case 1:
                        baseballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(baseballPlayerEventStatistics.getBattingStrikeOuts()));
                    case 2:
                        baseballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(baseballPlayerEventStatistics.getBattingAtBats()));
                    case 3:
                        baseballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    case 4:
                        baseballPlayerEventStatistics.getClass();
                        Double valueOf = Double.valueOf(yid.k(baseballPlayerEventStatistics.getBattingAverageToDate()));
                        yid.k(valueOf);
                        String format = new DecimalFormat(".000", new DecimalFormatSymbols(Locale.US)).format(yid.k(valueOf));
                        format.getClass();
                        return format;
                    case 5:
                        baseballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.k(baseballPlayerEventStatistics.getBattingAverageToDate()));
                    case 6:
                        baseballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    case 7:
                        baseballPlayerEventStatistics.getClass();
                        Double valueOf2 = Double.valueOf(yid.k(baseballPlayerEventStatistics.getBattingOnBasePercentageToDate()));
                        yid.k(valueOf2);
                        String format2 = new DecimalFormat(".000", new DecimalFormatSymbols(Locale.US)).format(yid.k(valueOf2));
                        format2.getClass();
                        return format2;
                    case 8:
                        baseballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.k(baseballPlayerEventStatistics.getBattingOnBasePercentageToDate()));
                    case 9:
                        baseballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    case 10:
                        baseballPlayerEventStatistics.getClass();
                        Double valueOf3 = Double.valueOf(yid.k(baseballPlayerEventStatistics.getBattingSluggingPercentageToDate()));
                        yid.k(valueOf3);
                        String format3 = new DecimalFormat(".000", new DecimalFormatSymbols(Locale.US)).format(yid.k(valueOf3));
                        format3.getClass();
                        return format3;
                    case 11:
                        baseballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(baseballPlayerEventStatistics.getBattingRbi()));
                    case 12:
                        baseballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.k(baseballPlayerEventStatistics.getBattingSluggingPercentageToDate()));
                    case 13:
                        baseballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    case 14:
                        baseballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    case 15:
                        baseballPlayerEventStatistics.getClass();
                        Double valueOf4 = Double.valueOf(yid.k(baseballPlayerEventStatistics.getBattingOpsToDate()));
                        yid.k(valueOf4);
                        String format4 = new DecimalFormat(".000", new DecimalFormatSymbols(Locale.US)).format(yid.k(valueOf4));
                        format4.getClass();
                        return format4;
                    case 16:
                        baseballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.k(baseballPlayerEventStatistics.getBattingOpsToDate()));
                    case 17:
                        baseballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    case 18:
                        baseballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(baseballPlayerEventStatistics.getBattingRuns()));
                    case 19:
                        baseballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(baseballPlayerEventStatistics.getBattingRuns()));
                    case 20:
                        baseballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    case 21:
                        baseballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(baseballPlayerEventStatistics.getBattingHits()));
                    case 22:
                        baseballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    case 23:
                        baseballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(baseballPlayerEventStatistics.getBattingHits()));
                    case 24:
                        baseballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    case 25:
                        baseballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(baseballPlayerEventStatistics.getBattingRbi()));
                    case 26:
                        baseballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(baseballPlayerEventStatistics.getBattingHomeRuns()));
                    case 27:
                        baseballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(baseballPlayerEventStatistics.getBattingHomeRuns()));
                    case 28:
                        baseballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    default:
                        baseballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(baseballPlayerEventStatistics.getBattingBaseOnBalls()));
                }
            }
        }, false);
        final int i28 = 15;
        final int i29 = 16;
        final int i30 = 17;
        x71[] x71VarArr = {x71Var, x71Var2, x71Var3, x71Var4, x71Var5, x71Var6, x71Var7, x71Var8, x71Var9, x71Var10, new x71(10, R.string.baseball_on_base_plus_slugging_short, R.string.baseball_on_base_plus_slugging, "OPS", new Function1() { // from class: v71
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                BaseballPlayerEventStatistics baseballPlayerEventStatistics = (BaseballPlayerEventStatistics) obj;
                switch (i28) {
                    case 0:
                        baseballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(baseballPlayerEventStatistics.getBattingAtBats()));
                    case 1:
                        baseballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(baseballPlayerEventStatistics.getBattingStrikeOuts()));
                    case 2:
                        baseballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(baseballPlayerEventStatistics.getBattingAtBats()));
                    case 3:
                        baseballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    case 4:
                        baseballPlayerEventStatistics.getClass();
                        Double valueOf = Double.valueOf(yid.k(baseballPlayerEventStatistics.getBattingAverageToDate()));
                        yid.k(valueOf);
                        String format = new DecimalFormat(".000", new DecimalFormatSymbols(Locale.US)).format(yid.k(valueOf));
                        format.getClass();
                        return format;
                    case 5:
                        baseballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.k(baseballPlayerEventStatistics.getBattingAverageToDate()));
                    case 6:
                        baseballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    case 7:
                        baseballPlayerEventStatistics.getClass();
                        Double valueOf2 = Double.valueOf(yid.k(baseballPlayerEventStatistics.getBattingOnBasePercentageToDate()));
                        yid.k(valueOf2);
                        String format2 = new DecimalFormat(".000", new DecimalFormatSymbols(Locale.US)).format(yid.k(valueOf2));
                        format2.getClass();
                        return format2;
                    case 8:
                        baseballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.k(baseballPlayerEventStatistics.getBattingOnBasePercentageToDate()));
                    case 9:
                        baseballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    case 10:
                        baseballPlayerEventStatistics.getClass();
                        Double valueOf3 = Double.valueOf(yid.k(baseballPlayerEventStatistics.getBattingSluggingPercentageToDate()));
                        yid.k(valueOf3);
                        String format3 = new DecimalFormat(".000", new DecimalFormatSymbols(Locale.US)).format(yid.k(valueOf3));
                        format3.getClass();
                        return format3;
                    case 11:
                        baseballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(baseballPlayerEventStatistics.getBattingRbi()));
                    case 12:
                        baseballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.k(baseballPlayerEventStatistics.getBattingSluggingPercentageToDate()));
                    case 13:
                        baseballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    case 14:
                        baseballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    case 15:
                        baseballPlayerEventStatistics.getClass();
                        Double valueOf4 = Double.valueOf(yid.k(baseballPlayerEventStatistics.getBattingOpsToDate()));
                        yid.k(valueOf4);
                        String format4 = new DecimalFormat(".000", new DecimalFormatSymbols(Locale.US)).format(yid.k(valueOf4));
                        format4.getClass();
                        return format4;
                    case 16:
                        baseballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.k(baseballPlayerEventStatistics.getBattingOpsToDate()));
                    case 17:
                        baseballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    case 18:
                        baseballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(baseballPlayerEventStatistics.getBattingRuns()));
                    case 19:
                        baseballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(baseballPlayerEventStatistics.getBattingRuns()));
                    case 20:
                        baseballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    case 21:
                        baseballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(baseballPlayerEventStatistics.getBattingHits()));
                    case 22:
                        baseballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    case 23:
                        baseballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(baseballPlayerEventStatistics.getBattingHits()));
                    case 24:
                        baseballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    case 25:
                        baseballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(baseballPlayerEventStatistics.getBattingRbi()));
                    case 26:
                        baseballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(baseballPlayerEventStatistics.getBattingHomeRuns()));
                    case 27:
                        baseballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(baseballPlayerEventStatistics.getBattingHomeRuns()));
                    case 28:
                        baseballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    default:
                        baseballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(baseballPlayerEventStatistics.getBattingBaseOnBalls()));
                }
            }
        }, new Function1() { // from class: v71
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                BaseballPlayerEventStatistics baseballPlayerEventStatistics = (BaseballPlayerEventStatistics) obj;
                switch (i29) {
                    case 0:
                        baseballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(baseballPlayerEventStatistics.getBattingAtBats()));
                    case 1:
                        baseballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(baseballPlayerEventStatistics.getBattingStrikeOuts()));
                    case 2:
                        baseballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(baseballPlayerEventStatistics.getBattingAtBats()));
                    case 3:
                        baseballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    case 4:
                        baseballPlayerEventStatistics.getClass();
                        Double valueOf = Double.valueOf(yid.k(baseballPlayerEventStatistics.getBattingAverageToDate()));
                        yid.k(valueOf);
                        String format = new DecimalFormat(".000", new DecimalFormatSymbols(Locale.US)).format(yid.k(valueOf));
                        format.getClass();
                        return format;
                    case 5:
                        baseballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.k(baseballPlayerEventStatistics.getBattingAverageToDate()));
                    case 6:
                        baseballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    case 7:
                        baseballPlayerEventStatistics.getClass();
                        Double valueOf2 = Double.valueOf(yid.k(baseballPlayerEventStatistics.getBattingOnBasePercentageToDate()));
                        yid.k(valueOf2);
                        String format2 = new DecimalFormat(".000", new DecimalFormatSymbols(Locale.US)).format(yid.k(valueOf2));
                        format2.getClass();
                        return format2;
                    case 8:
                        baseballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.k(baseballPlayerEventStatistics.getBattingOnBasePercentageToDate()));
                    case 9:
                        baseballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    case 10:
                        baseballPlayerEventStatistics.getClass();
                        Double valueOf3 = Double.valueOf(yid.k(baseballPlayerEventStatistics.getBattingSluggingPercentageToDate()));
                        yid.k(valueOf3);
                        String format3 = new DecimalFormat(".000", new DecimalFormatSymbols(Locale.US)).format(yid.k(valueOf3));
                        format3.getClass();
                        return format3;
                    case 11:
                        baseballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(baseballPlayerEventStatistics.getBattingRbi()));
                    case 12:
                        baseballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.k(baseballPlayerEventStatistics.getBattingSluggingPercentageToDate()));
                    case 13:
                        baseballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    case 14:
                        baseballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    case 15:
                        baseballPlayerEventStatistics.getClass();
                        Double valueOf4 = Double.valueOf(yid.k(baseballPlayerEventStatistics.getBattingOpsToDate()));
                        yid.k(valueOf4);
                        String format4 = new DecimalFormat(".000", new DecimalFormatSymbols(Locale.US)).format(yid.k(valueOf4));
                        format4.getClass();
                        return format4;
                    case 16:
                        baseballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.k(baseballPlayerEventStatistics.getBattingOpsToDate()));
                    case 17:
                        baseballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    case 18:
                        baseballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(baseballPlayerEventStatistics.getBattingRuns()));
                    case 19:
                        baseballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(baseballPlayerEventStatistics.getBattingRuns()));
                    case 20:
                        baseballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    case 21:
                        baseballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(baseballPlayerEventStatistics.getBattingHits()));
                    case 22:
                        baseballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    case 23:
                        baseballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(baseballPlayerEventStatistics.getBattingHits()));
                    case 24:
                        baseballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    case 25:
                        baseballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(baseballPlayerEventStatistics.getBattingRbi()));
                    case 26:
                        baseballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(baseballPlayerEventStatistics.getBattingHomeRuns()));
                    case 27:
                        baseballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(baseballPlayerEventStatistics.getBattingHomeRuns()));
                    case 28:
                        baseballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    default:
                        baseballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(baseballPlayerEventStatistics.getBattingBaseOnBalls()));
                }
            }
        }, new Function1() { // from class: v71
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                BaseballPlayerEventStatistics baseballPlayerEventStatistics = (BaseballPlayerEventStatistics) obj;
                switch (i30) {
                    case 0:
                        baseballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(baseballPlayerEventStatistics.getBattingAtBats()));
                    case 1:
                        baseballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(baseballPlayerEventStatistics.getBattingStrikeOuts()));
                    case 2:
                        baseballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(baseballPlayerEventStatistics.getBattingAtBats()));
                    case 3:
                        baseballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    case 4:
                        baseballPlayerEventStatistics.getClass();
                        Double valueOf = Double.valueOf(yid.k(baseballPlayerEventStatistics.getBattingAverageToDate()));
                        yid.k(valueOf);
                        String format = new DecimalFormat(".000", new DecimalFormatSymbols(Locale.US)).format(yid.k(valueOf));
                        format.getClass();
                        return format;
                    case 5:
                        baseballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.k(baseballPlayerEventStatistics.getBattingAverageToDate()));
                    case 6:
                        baseballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    case 7:
                        baseballPlayerEventStatistics.getClass();
                        Double valueOf2 = Double.valueOf(yid.k(baseballPlayerEventStatistics.getBattingOnBasePercentageToDate()));
                        yid.k(valueOf2);
                        String format2 = new DecimalFormat(".000", new DecimalFormatSymbols(Locale.US)).format(yid.k(valueOf2));
                        format2.getClass();
                        return format2;
                    case 8:
                        baseballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.k(baseballPlayerEventStatistics.getBattingOnBasePercentageToDate()));
                    case 9:
                        baseballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    case 10:
                        baseballPlayerEventStatistics.getClass();
                        Double valueOf3 = Double.valueOf(yid.k(baseballPlayerEventStatistics.getBattingSluggingPercentageToDate()));
                        yid.k(valueOf3);
                        String format3 = new DecimalFormat(".000", new DecimalFormatSymbols(Locale.US)).format(yid.k(valueOf3));
                        format3.getClass();
                        return format3;
                    case 11:
                        baseballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(baseballPlayerEventStatistics.getBattingRbi()));
                    case 12:
                        baseballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.k(baseballPlayerEventStatistics.getBattingSluggingPercentageToDate()));
                    case 13:
                        baseballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    case 14:
                        baseballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    case 15:
                        baseballPlayerEventStatistics.getClass();
                        Double valueOf4 = Double.valueOf(yid.k(baseballPlayerEventStatistics.getBattingOpsToDate()));
                        yid.k(valueOf4);
                        String format4 = new DecimalFormat(".000", new DecimalFormatSymbols(Locale.US)).format(yid.k(valueOf4));
                        format4.getClass();
                        return format4;
                    case 16:
                        baseballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.k(baseballPlayerEventStatistics.getBattingOpsToDate()));
                    case 17:
                        baseballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    case 18:
                        baseballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(baseballPlayerEventStatistics.getBattingRuns()));
                    case 19:
                        baseballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(baseballPlayerEventStatistics.getBattingRuns()));
                    case 20:
                        baseballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    case 21:
                        baseballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(baseballPlayerEventStatistics.getBattingHits()));
                    case 22:
                        baseballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    case 23:
                        baseballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(baseballPlayerEventStatistics.getBattingHits()));
                    case 24:
                        baseballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    case 25:
                        baseballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(baseballPlayerEventStatistics.getBattingRbi()));
                    case 26:
                        baseballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(baseballPlayerEventStatistics.getBattingHomeRuns()));
                    case 27:
                        baseballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(baseballPlayerEventStatistics.getBattingHomeRuns()));
                    case 28:
                        baseballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    default:
                        baseballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(baseballPlayerEventStatistics.getBattingBaseOnBalls()));
                }
            }
        }, false)};
        g = x71VarArr;
        h = new kp5(x71VarArr);
    }

    public x71(int i, int i2, int i3, String str, Function1 function1, Function1 function12, Function1 function13, boolean z) {
        this.a = i2;
        this.b = i3;
        this.c = function1;
        this.d = function12;
        this.e = function13;
        this.f = z;
    }

    public static x71 valueOf(String str) {
        return (x71) Enum.valueOf(x71.class, str);
    }

    public static x71[] values() {
        return (x71[]) g.clone();
    }

    @Override // defpackage.e1
    public final Function1 d() {
        return this.c;
    }

    @Override // defpackage.e1
    public final int g() {
        return this.a;
    }

    @Override // defpackage.e1
    public final Function1 h() {
        return this.d;
    }

    @Override // defpackage.e1
    public final boolean i() {
        return false;
    }

    @Override // defpackage.e1
    public final boolean j() {
        return false;
    }

    @Override // defpackage.e1
    public final int l() {
        return this.b;
    }

    @Override // defpackage.e1
    public final Function1 m() {
        return this.e;
    }

    @Override // defpackage.e1
    public final boolean n() {
        return this.f;
    }
}
