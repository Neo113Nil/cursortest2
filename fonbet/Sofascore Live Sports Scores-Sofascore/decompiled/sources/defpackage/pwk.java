package defpackage;

import com.sofascore.model.network.response.VolleyballPlayerEventStatistics;
import com.sofascore.results.R;
import kotlin.jvm.functions.Function1;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'g' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class pwk implements e1 {
    public static final pwk g;
    public static final pwk h;
    public static final pwk i;
    public static final pwk j;
    public static final pwk k;
    public static final pwk l;
    public static final pwk m;
    public static final pwk n;
    public static final pwk o;
    public static final pwk p;
    public static final pwk q;
    public static final pwk r;
    public static final pwk s;
    public static final pwk t;
    public static final pwk u;
    public static final pwk v;
    public static final pwk w;
    public static final pwk x;
    public static final pwk y;
    public static final /* synthetic */ pwk[] z;
    public final int a;
    public final int b;
    public final boolean c;
    public final Function1 d;
    public final Function1 e;
    public final Function1 f;

    static {
        final int i2 = 9;
        pwk pwkVar = new pwk(0, R.string.volleyball_points_short, R.string.volleyball_points, "Points", new wik(25), new wik(27), new Function1() { // from class: nwk
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                VolleyballPlayerEventStatistics volleyballPlayerEventStatistics = (VolleyballPlayerEventStatistics) obj;
                switch (i2) {
                    case 0:
                        volleyballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(volleyballPlayerEventStatistics.getBlockPoints()));
                    case 1:
                        volleyballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    case 2:
                        volleyballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(volleyballPlayerEventStatistics.getServes()));
                    case 3:
                        volleyballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(volleyballPlayerEventStatistics.getServes()));
                    case 4:
                        volleyballPlayerEventStatistics.getClass();
                        return Boolean.valueOf(volleyballPlayerEventStatistics.getServes() != null);
                    case 5:
                        volleyballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(volleyballPlayerEventStatistics.getServeErrors()));
                    case 6:
                        volleyballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(volleyballPlayerEventStatistics.getBlockPoints()));
                    case 7:
                        volleyballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(volleyballPlayerEventStatistics.getServeErrors()));
                    case 8:
                        volleyballPlayerEventStatistics.getClass();
                        return Boolean.valueOf(volleyballPlayerEventStatistics.getServeErrors() != null);
                    case 9:
                        volleyballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    case 10:
                        volleyballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(volleyballPlayerEventStatistics.getReceptionsTotal()));
                    case 11:
                        volleyballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(volleyballPlayerEventStatistics.getReceptionsTotal()));
                    case 12:
                        volleyballPlayerEventStatistics.getClass();
                        return Boolean.valueOf(volleyballPlayerEventStatistics.getReceptionsTotal() != null);
                    case 13:
                        volleyballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(volleyballPlayerEventStatistics.getReceptionErrors()));
                    case 14:
                        volleyballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(volleyballPlayerEventStatistics.getReceptionErrors()));
                    case 15:
                        volleyballPlayerEventStatistics.getClass();
                        return Boolean.valueOf(volleyballPlayerEventStatistics.getReceptionErrors() != null);
                    case 16:
                        volleyballPlayerEventStatistics.getClass();
                        String o2 = yid.o(volleyballPlayerEventStatistics.getReceptionPositivity(), 1);
                        return o2 == null ? "-" : o2;
                    case 17:
                        volleyballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    case 18:
                        volleyballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.k(volleyballPlayerEventStatistics.getReceptionPositivity()));
                    case 19:
                        volleyballPlayerEventStatistics.getClass();
                        return Boolean.valueOf(volleyballPlayerEventStatistics.getReceptionPositivity() != null);
                    case 20:
                        volleyballPlayerEventStatistics.getClass();
                        String o3 = yid.o(volleyballPlayerEventStatistics.getReceptionPerf(), 1);
                        return o3 == null ? "-" : o3;
                    case 21:
                        volleyballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(volleyballPlayerEventStatistics.getAttackPoints()));
                    case 22:
                        volleyballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.k(volleyballPlayerEventStatistics.getReceptionPerf()));
                    case 23:
                        volleyballPlayerEventStatistics.getClass();
                        return Boolean.valueOf(volleyballPlayerEventStatistics.getReceptionPerf() != null);
                    case 24:
                        volleyballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(volleyballPlayerEventStatistics.getAttacksTotal()));
                    case 25:
                        volleyballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(volleyballPlayerEventStatistics.getAttacksTotal()));
                    case 26:
                        volleyballPlayerEventStatistics.getClass();
                        return Boolean.valueOf(volleyballPlayerEventStatistics.getAttacksTotal() != null);
                    case 27:
                        volleyballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(volleyballPlayerEventStatistics.getAttackErrors()));
                    case 28:
                        volleyballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(volleyballPlayerEventStatistics.getPointsTotal()));
                    default:
                        volleyballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(volleyballPlayerEventStatistics.getAttackErrors()));
                }
            }
        }, false);
        g = pwkVar;
        final int i3 = 21;
        pwk pwkVar2 = new pwk(1, R.string.volleyball_attack_short, R.string.volleyball_attack, "Attacks", new Function1() { // from class: nwk
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                VolleyballPlayerEventStatistics volleyballPlayerEventStatistics = (VolleyballPlayerEventStatistics) obj;
                switch (i3) {
                    case 0:
                        volleyballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(volleyballPlayerEventStatistics.getBlockPoints()));
                    case 1:
                        volleyballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    case 2:
                        volleyballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(volleyballPlayerEventStatistics.getServes()));
                    case 3:
                        volleyballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(volleyballPlayerEventStatistics.getServes()));
                    case 4:
                        volleyballPlayerEventStatistics.getClass();
                        return Boolean.valueOf(volleyballPlayerEventStatistics.getServes() != null);
                    case 5:
                        volleyballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(volleyballPlayerEventStatistics.getServeErrors()));
                    case 6:
                        volleyballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(volleyballPlayerEventStatistics.getBlockPoints()));
                    case 7:
                        volleyballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(volleyballPlayerEventStatistics.getServeErrors()));
                    case 8:
                        volleyballPlayerEventStatistics.getClass();
                        return Boolean.valueOf(volleyballPlayerEventStatistics.getServeErrors() != null);
                    case 9:
                        volleyballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    case 10:
                        volleyballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(volleyballPlayerEventStatistics.getReceptionsTotal()));
                    case 11:
                        volleyballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(volleyballPlayerEventStatistics.getReceptionsTotal()));
                    case 12:
                        volleyballPlayerEventStatistics.getClass();
                        return Boolean.valueOf(volleyballPlayerEventStatistics.getReceptionsTotal() != null);
                    case 13:
                        volleyballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(volleyballPlayerEventStatistics.getReceptionErrors()));
                    case 14:
                        volleyballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(volleyballPlayerEventStatistics.getReceptionErrors()));
                    case 15:
                        volleyballPlayerEventStatistics.getClass();
                        return Boolean.valueOf(volleyballPlayerEventStatistics.getReceptionErrors() != null);
                    case 16:
                        volleyballPlayerEventStatistics.getClass();
                        String o2 = yid.o(volleyballPlayerEventStatistics.getReceptionPositivity(), 1);
                        return o2 == null ? "-" : o2;
                    case 17:
                        volleyballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    case 18:
                        volleyballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.k(volleyballPlayerEventStatistics.getReceptionPositivity()));
                    case 19:
                        volleyballPlayerEventStatistics.getClass();
                        return Boolean.valueOf(volleyballPlayerEventStatistics.getReceptionPositivity() != null);
                    case 20:
                        volleyballPlayerEventStatistics.getClass();
                        String o3 = yid.o(volleyballPlayerEventStatistics.getReceptionPerf(), 1);
                        return o3 == null ? "-" : o3;
                    case 21:
                        volleyballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(volleyballPlayerEventStatistics.getAttackPoints()));
                    case 22:
                        volleyballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.k(volleyballPlayerEventStatistics.getReceptionPerf()));
                    case 23:
                        volleyballPlayerEventStatistics.getClass();
                        return Boolean.valueOf(volleyballPlayerEventStatistics.getReceptionPerf() != null);
                    case 24:
                        volleyballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(volleyballPlayerEventStatistics.getAttacksTotal()));
                    case 25:
                        volleyballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(volleyballPlayerEventStatistics.getAttacksTotal()));
                    case 26:
                        volleyballPlayerEventStatistics.getClass();
                        return Boolean.valueOf(volleyballPlayerEventStatistics.getAttacksTotal() != null);
                    case 27:
                        volleyballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(volleyballPlayerEventStatistics.getAttackErrors()));
                    case 28:
                        volleyballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(volleyballPlayerEventStatistics.getPointsTotal()));
                    default:
                        volleyballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(volleyballPlayerEventStatistics.getAttackErrors()));
                }
            }
        }, new owk(3), new owk(12), false);
        h = pwkVar2;
        pwk pwkVar3 = new pwk(2, R.string.volleyball_aces_short, R.string.volleyball_aces, "Aces", new owk(13), new owk(14), new owk(15), false);
        i = pwkVar3;
        owk owkVar = new owk(16);
        final int i4 = 6;
        Function1 function1 = new Function1() { // from class: nwk
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                VolleyballPlayerEventStatistics volleyballPlayerEventStatistics = (VolleyballPlayerEventStatistics) obj;
                switch (i4) {
                    case 0:
                        volleyballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(volleyballPlayerEventStatistics.getBlockPoints()));
                    case 1:
                        volleyballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    case 2:
                        volleyballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(volleyballPlayerEventStatistics.getServes()));
                    case 3:
                        volleyballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(volleyballPlayerEventStatistics.getServes()));
                    case 4:
                        volleyballPlayerEventStatistics.getClass();
                        return Boolean.valueOf(volleyballPlayerEventStatistics.getServes() != null);
                    case 5:
                        volleyballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(volleyballPlayerEventStatistics.getServeErrors()));
                    case 6:
                        volleyballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(volleyballPlayerEventStatistics.getBlockPoints()));
                    case 7:
                        volleyballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(volleyballPlayerEventStatistics.getServeErrors()));
                    case 8:
                        volleyballPlayerEventStatistics.getClass();
                        return Boolean.valueOf(volleyballPlayerEventStatistics.getServeErrors() != null);
                    case 9:
                        volleyballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    case 10:
                        volleyballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(volleyballPlayerEventStatistics.getReceptionsTotal()));
                    case 11:
                        volleyballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(volleyballPlayerEventStatistics.getReceptionsTotal()));
                    case 12:
                        volleyballPlayerEventStatistics.getClass();
                        return Boolean.valueOf(volleyballPlayerEventStatistics.getReceptionsTotal() != null);
                    case 13:
                        volleyballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(volleyballPlayerEventStatistics.getReceptionErrors()));
                    case 14:
                        volleyballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(volleyballPlayerEventStatistics.getReceptionErrors()));
                    case 15:
                        volleyballPlayerEventStatistics.getClass();
                        return Boolean.valueOf(volleyballPlayerEventStatistics.getReceptionErrors() != null);
                    case 16:
                        volleyballPlayerEventStatistics.getClass();
                        String o2 = yid.o(volleyballPlayerEventStatistics.getReceptionPositivity(), 1);
                        return o2 == null ? "-" : o2;
                    case 17:
                        volleyballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    case 18:
                        volleyballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.k(volleyballPlayerEventStatistics.getReceptionPositivity()));
                    case 19:
                        volleyballPlayerEventStatistics.getClass();
                        return Boolean.valueOf(volleyballPlayerEventStatistics.getReceptionPositivity() != null);
                    case 20:
                        volleyballPlayerEventStatistics.getClass();
                        String o3 = yid.o(volleyballPlayerEventStatistics.getReceptionPerf(), 1);
                        return o3 == null ? "-" : o3;
                    case 21:
                        volleyballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(volleyballPlayerEventStatistics.getAttackPoints()));
                    case 22:
                        volleyballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.k(volleyballPlayerEventStatistics.getReceptionPerf()));
                    case 23:
                        volleyballPlayerEventStatistics.getClass();
                        return Boolean.valueOf(volleyballPlayerEventStatistics.getReceptionPerf() != null);
                    case 24:
                        volleyballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(volleyballPlayerEventStatistics.getAttacksTotal()));
                    case 25:
                        volleyballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(volleyballPlayerEventStatistics.getAttacksTotal()));
                    case 26:
                        volleyballPlayerEventStatistics.getClass();
                        return Boolean.valueOf(volleyballPlayerEventStatistics.getAttacksTotal() != null);
                    case 27:
                        volleyballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(volleyballPlayerEventStatistics.getAttackErrors()));
                    case 28:
                        volleyballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(volleyballPlayerEventStatistics.getPointsTotal()));
                    default:
                        volleyballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(volleyballPlayerEventStatistics.getAttackErrors()));
                }
            }
        };
        final int i5 = 17;
        pwk pwkVar4 = new pwk(3, R.string.volleyball_blocks_short, R.string.volleyball_blocks, "Blocks", owkVar, function1, new Function1() { // from class: nwk
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                VolleyballPlayerEventStatistics volleyballPlayerEventStatistics = (VolleyballPlayerEventStatistics) obj;
                switch (i5) {
                    case 0:
                        volleyballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(volleyballPlayerEventStatistics.getBlockPoints()));
                    case 1:
                        volleyballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    case 2:
                        volleyballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(volleyballPlayerEventStatistics.getServes()));
                    case 3:
                        volleyballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(volleyballPlayerEventStatistics.getServes()));
                    case 4:
                        volleyballPlayerEventStatistics.getClass();
                        return Boolean.valueOf(volleyballPlayerEventStatistics.getServes() != null);
                    case 5:
                        volleyballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(volleyballPlayerEventStatistics.getServeErrors()));
                    case 6:
                        volleyballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(volleyballPlayerEventStatistics.getBlockPoints()));
                    case 7:
                        volleyballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(volleyballPlayerEventStatistics.getServeErrors()));
                    case 8:
                        volleyballPlayerEventStatistics.getClass();
                        return Boolean.valueOf(volleyballPlayerEventStatistics.getServeErrors() != null);
                    case 9:
                        volleyballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    case 10:
                        volleyballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(volleyballPlayerEventStatistics.getReceptionsTotal()));
                    case 11:
                        volleyballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(volleyballPlayerEventStatistics.getReceptionsTotal()));
                    case 12:
                        volleyballPlayerEventStatistics.getClass();
                        return Boolean.valueOf(volleyballPlayerEventStatistics.getReceptionsTotal() != null);
                    case 13:
                        volleyballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(volleyballPlayerEventStatistics.getReceptionErrors()));
                    case 14:
                        volleyballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(volleyballPlayerEventStatistics.getReceptionErrors()));
                    case 15:
                        volleyballPlayerEventStatistics.getClass();
                        return Boolean.valueOf(volleyballPlayerEventStatistics.getReceptionErrors() != null);
                    case 16:
                        volleyballPlayerEventStatistics.getClass();
                        String o2 = yid.o(volleyballPlayerEventStatistics.getReceptionPositivity(), 1);
                        return o2 == null ? "-" : o2;
                    case 17:
                        volleyballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    case 18:
                        volleyballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.k(volleyballPlayerEventStatistics.getReceptionPositivity()));
                    case 19:
                        volleyballPlayerEventStatistics.getClass();
                        return Boolean.valueOf(volleyballPlayerEventStatistics.getReceptionPositivity() != null);
                    case 20:
                        volleyballPlayerEventStatistics.getClass();
                        String o3 = yid.o(volleyballPlayerEventStatistics.getReceptionPerf(), 1);
                        return o3 == null ? "-" : o3;
                    case 21:
                        volleyballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(volleyballPlayerEventStatistics.getAttackPoints()));
                    case 22:
                        volleyballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.k(volleyballPlayerEventStatistics.getReceptionPerf()));
                    case 23:
                        volleyballPlayerEventStatistics.getClass();
                        return Boolean.valueOf(volleyballPlayerEventStatistics.getReceptionPerf() != null);
                    case 24:
                        volleyballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(volleyballPlayerEventStatistics.getAttacksTotal()));
                    case 25:
                        volleyballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(volleyballPlayerEventStatistics.getAttacksTotal()));
                    case 26:
                        volleyballPlayerEventStatistics.getClass();
                        return Boolean.valueOf(volleyballPlayerEventStatistics.getAttacksTotal() != null);
                    case 27:
                        volleyballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(volleyballPlayerEventStatistics.getAttackErrors()));
                    case 28:
                        volleyballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(volleyballPlayerEventStatistics.getPointsTotal()));
                    default:
                        volleyballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(volleyballPlayerEventStatistics.getAttackErrors()));
                }
            }
        }, false);
        j = pwkVar4;
        final int i6 = 28;
        pwk pwkVar5 = new pwk(4, R.string.total_stats_short, R.string.total, "TotalPoints", new Function1() { // from class: nwk
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                VolleyballPlayerEventStatistics volleyballPlayerEventStatistics = (VolleyballPlayerEventStatistics) obj;
                switch (i6) {
                    case 0:
                        volleyballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(volleyballPlayerEventStatistics.getBlockPoints()));
                    case 1:
                        volleyballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    case 2:
                        volleyballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(volleyballPlayerEventStatistics.getServes()));
                    case 3:
                        volleyballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(volleyballPlayerEventStatistics.getServes()));
                    case 4:
                        volleyballPlayerEventStatistics.getClass();
                        return Boolean.valueOf(volleyballPlayerEventStatistics.getServes() != null);
                    case 5:
                        volleyballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(volleyballPlayerEventStatistics.getServeErrors()));
                    case 6:
                        volleyballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(volleyballPlayerEventStatistics.getBlockPoints()));
                    case 7:
                        volleyballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(volleyballPlayerEventStatistics.getServeErrors()));
                    case 8:
                        volleyballPlayerEventStatistics.getClass();
                        return Boolean.valueOf(volleyballPlayerEventStatistics.getServeErrors() != null);
                    case 9:
                        volleyballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    case 10:
                        volleyballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(volleyballPlayerEventStatistics.getReceptionsTotal()));
                    case 11:
                        volleyballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(volleyballPlayerEventStatistics.getReceptionsTotal()));
                    case 12:
                        volleyballPlayerEventStatistics.getClass();
                        return Boolean.valueOf(volleyballPlayerEventStatistics.getReceptionsTotal() != null);
                    case 13:
                        volleyballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(volleyballPlayerEventStatistics.getReceptionErrors()));
                    case 14:
                        volleyballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(volleyballPlayerEventStatistics.getReceptionErrors()));
                    case 15:
                        volleyballPlayerEventStatistics.getClass();
                        return Boolean.valueOf(volleyballPlayerEventStatistics.getReceptionErrors() != null);
                    case 16:
                        volleyballPlayerEventStatistics.getClass();
                        String o2 = yid.o(volleyballPlayerEventStatistics.getReceptionPositivity(), 1);
                        return o2 == null ? "-" : o2;
                    case 17:
                        volleyballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    case 18:
                        volleyballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.k(volleyballPlayerEventStatistics.getReceptionPositivity()));
                    case 19:
                        volleyballPlayerEventStatistics.getClass();
                        return Boolean.valueOf(volleyballPlayerEventStatistics.getReceptionPositivity() != null);
                    case 20:
                        volleyballPlayerEventStatistics.getClass();
                        String o3 = yid.o(volleyballPlayerEventStatistics.getReceptionPerf(), 1);
                        return o3 == null ? "-" : o3;
                    case 21:
                        volleyballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(volleyballPlayerEventStatistics.getAttackPoints()));
                    case 22:
                        volleyballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.k(volleyballPlayerEventStatistics.getReceptionPerf()));
                    case 23:
                        volleyballPlayerEventStatistics.getClass();
                        return Boolean.valueOf(volleyballPlayerEventStatistics.getReceptionPerf() != null);
                    case 24:
                        volleyballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(volleyballPlayerEventStatistics.getAttacksTotal()));
                    case 25:
                        volleyballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(volleyballPlayerEventStatistics.getAttacksTotal()));
                    case 26:
                        volleyballPlayerEventStatistics.getClass();
                        return Boolean.valueOf(volleyballPlayerEventStatistics.getAttacksTotal() != null);
                    case 27:
                        volleyballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(volleyballPlayerEventStatistics.getAttackErrors()));
                    case 28:
                        volleyballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(volleyballPlayerEventStatistics.getPointsTotal()));
                    default:
                        volleyballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(volleyballPlayerEventStatistics.getAttackErrors()));
                }
            }
        }, new owk(9), new owk(17), true);
        k = pwkVar5;
        pwk pwkVar6 = new pwk(5, R.string.volleyball_break_points_short, R.string.volleyball_break_points, "BreakPoints", new owk(18), new owk(19), new owk(20), true);
        l = pwkVar6;
        pwk pwkVar7 = new pwk(6, R.string.volleyball_won_lost_points_ratio_short, R.string.volleyball_won_lost_points_ratio, "WinLoss", new owk(21), new wik(26), new wik(28), true);
        m = pwkVar7;
        wik wikVar = new wik(29);
        final int i7 = 0;
        Function1 function12 = new Function1() { // from class: nwk
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                VolleyballPlayerEventStatistics volleyballPlayerEventStatistics = (VolleyballPlayerEventStatistics) obj;
                switch (i7) {
                    case 0:
                        volleyballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(volleyballPlayerEventStatistics.getBlockPoints()));
                    case 1:
                        volleyballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    case 2:
                        volleyballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(volleyballPlayerEventStatistics.getServes()));
                    case 3:
                        volleyballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(volleyballPlayerEventStatistics.getServes()));
                    case 4:
                        volleyballPlayerEventStatistics.getClass();
                        return Boolean.valueOf(volleyballPlayerEventStatistics.getServes() != null);
                    case 5:
                        volleyballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(volleyballPlayerEventStatistics.getServeErrors()));
                    case 6:
                        volleyballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(volleyballPlayerEventStatistics.getBlockPoints()));
                    case 7:
                        volleyballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(volleyballPlayerEventStatistics.getServeErrors()));
                    case 8:
                        volleyballPlayerEventStatistics.getClass();
                        return Boolean.valueOf(volleyballPlayerEventStatistics.getServeErrors() != null);
                    case 9:
                        volleyballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    case 10:
                        volleyballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(volleyballPlayerEventStatistics.getReceptionsTotal()));
                    case 11:
                        volleyballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(volleyballPlayerEventStatistics.getReceptionsTotal()));
                    case 12:
                        volleyballPlayerEventStatistics.getClass();
                        return Boolean.valueOf(volleyballPlayerEventStatistics.getReceptionsTotal() != null);
                    case 13:
                        volleyballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(volleyballPlayerEventStatistics.getReceptionErrors()));
                    case 14:
                        volleyballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(volleyballPlayerEventStatistics.getReceptionErrors()));
                    case 15:
                        volleyballPlayerEventStatistics.getClass();
                        return Boolean.valueOf(volleyballPlayerEventStatistics.getReceptionErrors() != null);
                    case 16:
                        volleyballPlayerEventStatistics.getClass();
                        String o2 = yid.o(volleyballPlayerEventStatistics.getReceptionPositivity(), 1);
                        return o2 == null ? "-" : o2;
                    case 17:
                        volleyballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    case 18:
                        volleyballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.k(volleyballPlayerEventStatistics.getReceptionPositivity()));
                    case 19:
                        volleyballPlayerEventStatistics.getClass();
                        return Boolean.valueOf(volleyballPlayerEventStatistics.getReceptionPositivity() != null);
                    case 20:
                        volleyballPlayerEventStatistics.getClass();
                        String o3 = yid.o(volleyballPlayerEventStatistics.getReceptionPerf(), 1);
                        return o3 == null ? "-" : o3;
                    case 21:
                        volleyballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(volleyballPlayerEventStatistics.getAttackPoints()));
                    case 22:
                        volleyballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.k(volleyballPlayerEventStatistics.getReceptionPerf()));
                    case 23:
                        volleyballPlayerEventStatistics.getClass();
                        return Boolean.valueOf(volleyballPlayerEventStatistics.getReceptionPerf() != null);
                    case 24:
                        volleyballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(volleyballPlayerEventStatistics.getAttacksTotal()));
                    case 25:
                        volleyballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(volleyballPlayerEventStatistics.getAttacksTotal()));
                    case 26:
                        volleyballPlayerEventStatistics.getClass();
                        return Boolean.valueOf(volleyballPlayerEventStatistics.getAttacksTotal() != null);
                    case 27:
                        volleyballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(volleyballPlayerEventStatistics.getAttackErrors()));
                    case 28:
                        volleyballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(volleyballPlayerEventStatistics.getPointsTotal()));
                    default:
                        volleyballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(volleyballPlayerEventStatistics.getAttackErrors()));
                }
            }
        };
        final int i8 = 1;
        pwk pwkVar8 = new pwk(7, R.string.volleyball_blocks_short, R.string.volleyball_block_points, "BlockPoints", wikVar, function12, new Function1() { // from class: nwk
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                VolleyballPlayerEventStatistics volleyballPlayerEventStatistics = (VolleyballPlayerEventStatistics) obj;
                switch (i8) {
                    case 0:
                        volleyballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(volleyballPlayerEventStatistics.getBlockPoints()));
                    case 1:
                        volleyballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    case 2:
                        volleyballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(volleyballPlayerEventStatistics.getServes()));
                    case 3:
                        volleyballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(volleyballPlayerEventStatistics.getServes()));
                    case 4:
                        volleyballPlayerEventStatistics.getClass();
                        return Boolean.valueOf(volleyballPlayerEventStatistics.getServes() != null);
                    case 5:
                        volleyballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(volleyballPlayerEventStatistics.getServeErrors()));
                    case 6:
                        volleyballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(volleyballPlayerEventStatistics.getBlockPoints()));
                    case 7:
                        volleyballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(volleyballPlayerEventStatistics.getServeErrors()));
                    case 8:
                        volleyballPlayerEventStatistics.getClass();
                        return Boolean.valueOf(volleyballPlayerEventStatistics.getServeErrors() != null);
                    case 9:
                        volleyballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    case 10:
                        volleyballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(volleyballPlayerEventStatistics.getReceptionsTotal()));
                    case 11:
                        volleyballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(volleyballPlayerEventStatistics.getReceptionsTotal()));
                    case 12:
                        volleyballPlayerEventStatistics.getClass();
                        return Boolean.valueOf(volleyballPlayerEventStatistics.getReceptionsTotal() != null);
                    case 13:
                        volleyballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(volleyballPlayerEventStatistics.getReceptionErrors()));
                    case 14:
                        volleyballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(volleyballPlayerEventStatistics.getReceptionErrors()));
                    case 15:
                        volleyballPlayerEventStatistics.getClass();
                        return Boolean.valueOf(volleyballPlayerEventStatistics.getReceptionErrors() != null);
                    case 16:
                        volleyballPlayerEventStatistics.getClass();
                        String o2 = yid.o(volleyballPlayerEventStatistics.getReceptionPositivity(), 1);
                        return o2 == null ? "-" : o2;
                    case 17:
                        volleyballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    case 18:
                        volleyballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.k(volleyballPlayerEventStatistics.getReceptionPositivity()));
                    case 19:
                        volleyballPlayerEventStatistics.getClass();
                        return Boolean.valueOf(volleyballPlayerEventStatistics.getReceptionPositivity() != null);
                    case 20:
                        volleyballPlayerEventStatistics.getClass();
                        String o3 = yid.o(volleyballPlayerEventStatistics.getReceptionPerf(), 1);
                        return o3 == null ? "-" : o3;
                    case 21:
                        volleyballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(volleyballPlayerEventStatistics.getAttackPoints()));
                    case 22:
                        volleyballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.k(volleyballPlayerEventStatistics.getReceptionPerf()));
                    case 23:
                        volleyballPlayerEventStatistics.getClass();
                        return Boolean.valueOf(volleyballPlayerEventStatistics.getReceptionPerf() != null);
                    case 24:
                        volleyballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(volleyballPlayerEventStatistics.getAttacksTotal()));
                    case 25:
                        volleyballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(volleyballPlayerEventStatistics.getAttacksTotal()));
                    case 26:
                        volleyballPlayerEventStatistics.getClass();
                        return Boolean.valueOf(volleyballPlayerEventStatistics.getAttacksTotal() != null);
                    case 27:
                        volleyballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(volleyballPlayerEventStatistics.getAttackErrors()));
                    case 28:
                        volleyballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(volleyballPlayerEventStatistics.getPointsTotal()));
                    default:
                        volleyballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(volleyballPlayerEventStatistics.getAttackErrors()));
                }
            }
        }, true);
        n = pwkVar8;
        final int i9 = 2;
        Function1 function13 = new Function1() { // from class: nwk
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                VolleyballPlayerEventStatistics volleyballPlayerEventStatistics = (VolleyballPlayerEventStatistics) obj;
                switch (i9) {
                    case 0:
                        volleyballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(volleyballPlayerEventStatistics.getBlockPoints()));
                    case 1:
                        volleyballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    case 2:
                        volleyballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(volleyballPlayerEventStatistics.getServes()));
                    case 3:
                        volleyballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(volleyballPlayerEventStatistics.getServes()));
                    case 4:
                        volleyballPlayerEventStatistics.getClass();
                        return Boolean.valueOf(volleyballPlayerEventStatistics.getServes() != null);
                    case 5:
                        volleyballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(volleyballPlayerEventStatistics.getServeErrors()));
                    case 6:
                        volleyballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(volleyballPlayerEventStatistics.getBlockPoints()));
                    case 7:
                        volleyballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(volleyballPlayerEventStatistics.getServeErrors()));
                    case 8:
                        volleyballPlayerEventStatistics.getClass();
                        return Boolean.valueOf(volleyballPlayerEventStatistics.getServeErrors() != null);
                    case 9:
                        volleyballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    case 10:
                        volleyballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(volleyballPlayerEventStatistics.getReceptionsTotal()));
                    case 11:
                        volleyballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(volleyballPlayerEventStatistics.getReceptionsTotal()));
                    case 12:
                        volleyballPlayerEventStatistics.getClass();
                        return Boolean.valueOf(volleyballPlayerEventStatistics.getReceptionsTotal() != null);
                    case 13:
                        volleyballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(volleyballPlayerEventStatistics.getReceptionErrors()));
                    case 14:
                        volleyballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(volleyballPlayerEventStatistics.getReceptionErrors()));
                    case 15:
                        volleyballPlayerEventStatistics.getClass();
                        return Boolean.valueOf(volleyballPlayerEventStatistics.getReceptionErrors() != null);
                    case 16:
                        volleyballPlayerEventStatistics.getClass();
                        String o2 = yid.o(volleyballPlayerEventStatistics.getReceptionPositivity(), 1);
                        return o2 == null ? "-" : o2;
                    case 17:
                        volleyballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    case 18:
                        volleyballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.k(volleyballPlayerEventStatistics.getReceptionPositivity()));
                    case 19:
                        volleyballPlayerEventStatistics.getClass();
                        return Boolean.valueOf(volleyballPlayerEventStatistics.getReceptionPositivity() != null);
                    case 20:
                        volleyballPlayerEventStatistics.getClass();
                        String o3 = yid.o(volleyballPlayerEventStatistics.getReceptionPerf(), 1);
                        return o3 == null ? "-" : o3;
                    case 21:
                        volleyballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(volleyballPlayerEventStatistics.getAttackPoints()));
                    case 22:
                        volleyballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.k(volleyballPlayerEventStatistics.getReceptionPerf()));
                    case 23:
                        volleyballPlayerEventStatistics.getClass();
                        return Boolean.valueOf(volleyballPlayerEventStatistics.getReceptionPerf() != null);
                    case 24:
                        volleyballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(volleyballPlayerEventStatistics.getAttacksTotal()));
                    case 25:
                        volleyballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(volleyballPlayerEventStatistics.getAttacksTotal()));
                    case 26:
                        volleyballPlayerEventStatistics.getClass();
                        return Boolean.valueOf(volleyballPlayerEventStatistics.getAttacksTotal() != null);
                    case 27:
                        volleyballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(volleyballPlayerEventStatistics.getAttackErrors()));
                    case 28:
                        volleyballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(volleyballPlayerEventStatistics.getPointsTotal()));
                    default:
                        volleyballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(volleyballPlayerEventStatistics.getAttackErrors()));
                }
            }
        };
        final int i10 = 3;
        Function1 function14 = new Function1() { // from class: nwk
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                VolleyballPlayerEventStatistics volleyballPlayerEventStatistics = (VolleyballPlayerEventStatistics) obj;
                switch (i10) {
                    case 0:
                        volleyballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(volleyballPlayerEventStatistics.getBlockPoints()));
                    case 1:
                        volleyballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    case 2:
                        volleyballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(volleyballPlayerEventStatistics.getServes()));
                    case 3:
                        volleyballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(volleyballPlayerEventStatistics.getServes()));
                    case 4:
                        volleyballPlayerEventStatistics.getClass();
                        return Boolean.valueOf(volleyballPlayerEventStatistics.getServes() != null);
                    case 5:
                        volleyballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(volleyballPlayerEventStatistics.getServeErrors()));
                    case 6:
                        volleyballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(volleyballPlayerEventStatistics.getBlockPoints()));
                    case 7:
                        volleyballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(volleyballPlayerEventStatistics.getServeErrors()));
                    case 8:
                        volleyballPlayerEventStatistics.getClass();
                        return Boolean.valueOf(volleyballPlayerEventStatistics.getServeErrors() != null);
                    case 9:
                        volleyballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    case 10:
                        volleyballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(volleyballPlayerEventStatistics.getReceptionsTotal()));
                    case 11:
                        volleyballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(volleyballPlayerEventStatistics.getReceptionsTotal()));
                    case 12:
                        volleyballPlayerEventStatistics.getClass();
                        return Boolean.valueOf(volleyballPlayerEventStatistics.getReceptionsTotal() != null);
                    case 13:
                        volleyballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(volleyballPlayerEventStatistics.getReceptionErrors()));
                    case 14:
                        volleyballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(volleyballPlayerEventStatistics.getReceptionErrors()));
                    case 15:
                        volleyballPlayerEventStatistics.getClass();
                        return Boolean.valueOf(volleyballPlayerEventStatistics.getReceptionErrors() != null);
                    case 16:
                        volleyballPlayerEventStatistics.getClass();
                        String o2 = yid.o(volleyballPlayerEventStatistics.getReceptionPositivity(), 1);
                        return o2 == null ? "-" : o2;
                    case 17:
                        volleyballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    case 18:
                        volleyballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.k(volleyballPlayerEventStatistics.getReceptionPositivity()));
                    case 19:
                        volleyballPlayerEventStatistics.getClass();
                        return Boolean.valueOf(volleyballPlayerEventStatistics.getReceptionPositivity() != null);
                    case 20:
                        volleyballPlayerEventStatistics.getClass();
                        String o3 = yid.o(volleyballPlayerEventStatistics.getReceptionPerf(), 1);
                        return o3 == null ? "-" : o3;
                    case 21:
                        volleyballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(volleyballPlayerEventStatistics.getAttackPoints()));
                    case 22:
                        volleyballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.k(volleyballPlayerEventStatistics.getReceptionPerf()));
                    case 23:
                        volleyballPlayerEventStatistics.getClass();
                        return Boolean.valueOf(volleyballPlayerEventStatistics.getReceptionPerf() != null);
                    case 24:
                        volleyballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(volleyballPlayerEventStatistics.getAttacksTotal()));
                    case 25:
                        volleyballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(volleyballPlayerEventStatistics.getAttacksTotal()));
                    case 26:
                        volleyballPlayerEventStatistics.getClass();
                        return Boolean.valueOf(volleyballPlayerEventStatistics.getAttacksTotal() != null);
                    case 27:
                        volleyballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(volleyballPlayerEventStatistics.getAttackErrors()));
                    case 28:
                        volleyballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(volleyballPlayerEventStatistics.getPointsTotal()));
                    default:
                        volleyballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(volleyballPlayerEventStatistics.getAttackErrors()));
                }
            }
        };
        final int i11 = 4;
        pwk pwkVar9 = new pwk(8, R.string.total_stats_short, R.string.total, "Serves", function13, function14, new Function1() { // from class: nwk
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                VolleyballPlayerEventStatistics volleyballPlayerEventStatistics = (VolleyballPlayerEventStatistics) obj;
                switch (i11) {
                    case 0:
                        volleyballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(volleyballPlayerEventStatistics.getBlockPoints()));
                    case 1:
                        volleyballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    case 2:
                        volleyballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(volleyballPlayerEventStatistics.getServes()));
                    case 3:
                        volleyballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(volleyballPlayerEventStatistics.getServes()));
                    case 4:
                        volleyballPlayerEventStatistics.getClass();
                        return Boolean.valueOf(volleyballPlayerEventStatistics.getServes() != null);
                    case 5:
                        volleyballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(volleyballPlayerEventStatistics.getServeErrors()));
                    case 6:
                        volleyballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(volleyballPlayerEventStatistics.getBlockPoints()));
                    case 7:
                        volleyballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(volleyballPlayerEventStatistics.getServeErrors()));
                    case 8:
                        volleyballPlayerEventStatistics.getClass();
                        return Boolean.valueOf(volleyballPlayerEventStatistics.getServeErrors() != null);
                    case 9:
                        volleyballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    case 10:
                        volleyballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(volleyballPlayerEventStatistics.getReceptionsTotal()));
                    case 11:
                        volleyballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(volleyballPlayerEventStatistics.getReceptionsTotal()));
                    case 12:
                        volleyballPlayerEventStatistics.getClass();
                        return Boolean.valueOf(volleyballPlayerEventStatistics.getReceptionsTotal() != null);
                    case 13:
                        volleyballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(volleyballPlayerEventStatistics.getReceptionErrors()));
                    case 14:
                        volleyballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(volleyballPlayerEventStatistics.getReceptionErrors()));
                    case 15:
                        volleyballPlayerEventStatistics.getClass();
                        return Boolean.valueOf(volleyballPlayerEventStatistics.getReceptionErrors() != null);
                    case 16:
                        volleyballPlayerEventStatistics.getClass();
                        String o2 = yid.o(volleyballPlayerEventStatistics.getReceptionPositivity(), 1);
                        return o2 == null ? "-" : o2;
                    case 17:
                        volleyballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    case 18:
                        volleyballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.k(volleyballPlayerEventStatistics.getReceptionPositivity()));
                    case 19:
                        volleyballPlayerEventStatistics.getClass();
                        return Boolean.valueOf(volleyballPlayerEventStatistics.getReceptionPositivity() != null);
                    case 20:
                        volleyballPlayerEventStatistics.getClass();
                        String o3 = yid.o(volleyballPlayerEventStatistics.getReceptionPerf(), 1);
                        return o3 == null ? "-" : o3;
                    case 21:
                        volleyballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(volleyballPlayerEventStatistics.getAttackPoints()));
                    case 22:
                        volleyballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.k(volleyballPlayerEventStatistics.getReceptionPerf()));
                    case 23:
                        volleyballPlayerEventStatistics.getClass();
                        return Boolean.valueOf(volleyballPlayerEventStatistics.getReceptionPerf() != null);
                    case 24:
                        volleyballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(volleyballPlayerEventStatistics.getAttacksTotal()));
                    case 25:
                        volleyballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(volleyballPlayerEventStatistics.getAttacksTotal()));
                    case 26:
                        volleyballPlayerEventStatistics.getClass();
                        return Boolean.valueOf(volleyballPlayerEventStatistics.getAttacksTotal() != null);
                    case 27:
                        volleyballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(volleyballPlayerEventStatistics.getAttackErrors()));
                    case 28:
                        volleyballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(volleyballPlayerEventStatistics.getPointsTotal()));
                    default:
                        volleyballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(volleyballPlayerEventStatistics.getAttackErrors()));
                }
            }
        }, true);
        o = pwkVar9;
        final int i12 = 5;
        Function1 function15 = new Function1() { // from class: nwk
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                VolleyballPlayerEventStatistics volleyballPlayerEventStatistics = (VolleyballPlayerEventStatistics) obj;
                switch (i12) {
                    case 0:
                        volleyballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(volleyballPlayerEventStatistics.getBlockPoints()));
                    case 1:
                        volleyballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    case 2:
                        volleyballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(volleyballPlayerEventStatistics.getServes()));
                    case 3:
                        volleyballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(volleyballPlayerEventStatistics.getServes()));
                    case 4:
                        volleyballPlayerEventStatistics.getClass();
                        return Boolean.valueOf(volleyballPlayerEventStatistics.getServes() != null);
                    case 5:
                        volleyballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(volleyballPlayerEventStatistics.getServeErrors()));
                    case 6:
                        volleyballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(volleyballPlayerEventStatistics.getBlockPoints()));
                    case 7:
                        volleyballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(volleyballPlayerEventStatistics.getServeErrors()));
                    case 8:
                        volleyballPlayerEventStatistics.getClass();
                        return Boolean.valueOf(volleyballPlayerEventStatistics.getServeErrors() != null);
                    case 9:
                        volleyballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    case 10:
                        volleyballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(volleyballPlayerEventStatistics.getReceptionsTotal()));
                    case 11:
                        volleyballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(volleyballPlayerEventStatistics.getReceptionsTotal()));
                    case 12:
                        volleyballPlayerEventStatistics.getClass();
                        return Boolean.valueOf(volleyballPlayerEventStatistics.getReceptionsTotal() != null);
                    case 13:
                        volleyballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(volleyballPlayerEventStatistics.getReceptionErrors()));
                    case 14:
                        volleyballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(volleyballPlayerEventStatistics.getReceptionErrors()));
                    case 15:
                        volleyballPlayerEventStatistics.getClass();
                        return Boolean.valueOf(volleyballPlayerEventStatistics.getReceptionErrors() != null);
                    case 16:
                        volleyballPlayerEventStatistics.getClass();
                        String o2 = yid.o(volleyballPlayerEventStatistics.getReceptionPositivity(), 1);
                        return o2 == null ? "-" : o2;
                    case 17:
                        volleyballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    case 18:
                        volleyballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.k(volleyballPlayerEventStatistics.getReceptionPositivity()));
                    case 19:
                        volleyballPlayerEventStatistics.getClass();
                        return Boolean.valueOf(volleyballPlayerEventStatistics.getReceptionPositivity() != null);
                    case 20:
                        volleyballPlayerEventStatistics.getClass();
                        String o3 = yid.o(volleyballPlayerEventStatistics.getReceptionPerf(), 1);
                        return o3 == null ? "-" : o3;
                    case 21:
                        volleyballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(volleyballPlayerEventStatistics.getAttackPoints()));
                    case 22:
                        volleyballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.k(volleyballPlayerEventStatistics.getReceptionPerf()));
                    case 23:
                        volleyballPlayerEventStatistics.getClass();
                        return Boolean.valueOf(volleyballPlayerEventStatistics.getReceptionPerf() != null);
                    case 24:
                        volleyballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(volleyballPlayerEventStatistics.getAttacksTotal()));
                    case 25:
                        volleyballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(volleyballPlayerEventStatistics.getAttacksTotal()));
                    case 26:
                        volleyballPlayerEventStatistics.getClass();
                        return Boolean.valueOf(volleyballPlayerEventStatistics.getAttacksTotal() != null);
                    case 27:
                        volleyballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(volleyballPlayerEventStatistics.getAttackErrors()));
                    case 28:
                        volleyballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(volleyballPlayerEventStatistics.getPointsTotal()));
                    default:
                        volleyballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(volleyballPlayerEventStatistics.getAttackErrors()));
                }
            }
        };
        final int i13 = 7;
        final int i14 = 8;
        pwk pwkVar10 = new pwk(9, R.string.volleyball_errors_short, R.string.volleyball_errors, "ServeErrors", function15, new Function1() { // from class: nwk
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                VolleyballPlayerEventStatistics volleyballPlayerEventStatistics = (VolleyballPlayerEventStatistics) obj;
                switch (i13) {
                    case 0:
                        volleyballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(volleyballPlayerEventStatistics.getBlockPoints()));
                    case 1:
                        volleyballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    case 2:
                        volleyballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(volleyballPlayerEventStatistics.getServes()));
                    case 3:
                        volleyballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(volleyballPlayerEventStatistics.getServes()));
                    case 4:
                        volleyballPlayerEventStatistics.getClass();
                        return Boolean.valueOf(volleyballPlayerEventStatistics.getServes() != null);
                    case 5:
                        volleyballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(volleyballPlayerEventStatistics.getServeErrors()));
                    case 6:
                        volleyballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(volleyballPlayerEventStatistics.getBlockPoints()));
                    case 7:
                        volleyballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(volleyballPlayerEventStatistics.getServeErrors()));
                    case 8:
                        volleyballPlayerEventStatistics.getClass();
                        return Boolean.valueOf(volleyballPlayerEventStatistics.getServeErrors() != null);
                    case 9:
                        volleyballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    case 10:
                        volleyballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(volleyballPlayerEventStatistics.getReceptionsTotal()));
                    case 11:
                        volleyballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(volleyballPlayerEventStatistics.getReceptionsTotal()));
                    case 12:
                        volleyballPlayerEventStatistics.getClass();
                        return Boolean.valueOf(volleyballPlayerEventStatistics.getReceptionsTotal() != null);
                    case 13:
                        volleyballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(volleyballPlayerEventStatistics.getReceptionErrors()));
                    case 14:
                        volleyballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(volleyballPlayerEventStatistics.getReceptionErrors()));
                    case 15:
                        volleyballPlayerEventStatistics.getClass();
                        return Boolean.valueOf(volleyballPlayerEventStatistics.getReceptionErrors() != null);
                    case 16:
                        volleyballPlayerEventStatistics.getClass();
                        String o2 = yid.o(volleyballPlayerEventStatistics.getReceptionPositivity(), 1);
                        return o2 == null ? "-" : o2;
                    case 17:
                        volleyballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    case 18:
                        volleyballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.k(volleyballPlayerEventStatistics.getReceptionPositivity()));
                    case 19:
                        volleyballPlayerEventStatistics.getClass();
                        return Boolean.valueOf(volleyballPlayerEventStatistics.getReceptionPositivity() != null);
                    case 20:
                        volleyballPlayerEventStatistics.getClass();
                        String o3 = yid.o(volleyballPlayerEventStatistics.getReceptionPerf(), 1);
                        return o3 == null ? "-" : o3;
                    case 21:
                        volleyballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(volleyballPlayerEventStatistics.getAttackPoints()));
                    case 22:
                        volleyballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.k(volleyballPlayerEventStatistics.getReceptionPerf()));
                    case 23:
                        volleyballPlayerEventStatistics.getClass();
                        return Boolean.valueOf(volleyballPlayerEventStatistics.getReceptionPerf() != null);
                    case 24:
                        volleyballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(volleyballPlayerEventStatistics.getAttacksTotal()));
                    case 25:
                        volleyballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(volleyballPlayerEventStatistics.getAttacksTotal()));
                    case 26:
                        volleyballPlayerEventStatistics.getClass();
                        return Boolean.valueOf(volleyballPlayerEventStatistics.getAttacksTotal() != null);
                    case 27:
                        volleyballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(volleyballPlayerEventStatistics.getAttackErrors()));
                    case 28:
                        volleyballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(volleyballPlayerEventStatistics.getPointsTotal()));
                    default:
                        volleyballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(volleyballPlayerEventStatistics.getAttackErrors()));
                }
            }
        }, new Function1() { // from class: nwk
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                VolleyballPlayerEventStatistics volleyballPlayerEventStatistics = (VolleyballPlayerEventStatistics) obj;
                switch (i14) {
                    case 0:
                        volleyballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(volleyballPlayerEventStatistics.getBlockPoints()));
                    case 1:
                        volleyballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    case 2:
                        volleyballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(volleyballPlayerEventStatistics.getServes()));
                    case 3:
                        volleyballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(volleyballPlayerEventStatistics.getServes()));
                    case 4:
                        volleyballPlayerEventStatistics.getClass();
                        return Boolean.valueOf(volleyballPlayerEventStatistics.getServes() != null);
                    case 5:
                        volleyballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(volleyballPlayerEventStatistics.getServeErrors()));
                    case 6:
                        volleyballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(volleyballPlayerEventStatistics.getBlockPoints()));
                    case 7:
                        volleyballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(volleyballPlayerEventStatistics.getServeErrors()));
                    case 8:
                        volleyballPlayerEventStatistics.getClass();
                        return Boolean.valueOf(volleyballPlayerEventStatistics.getServeErrors() != null);
                    case 9:
                        volleyballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    case 10:
                        volleyballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(volleyballPlayerEventStatistics.getReceptionsTotal()));
                    case 11:
                        volleyballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(volleyballPlayerEventStatistics.getReceptionsTotal()));
                    case 12:
                        volleyballPlayerEventStatistics.getClass();
                        return Boolean.valueOf(volleyballPlayerEventStatistics.getReceptionsTotal() != null);
                    case 13:
                        volleyballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(volleyballPlayerEventStatistics.getReceptionErrors()));
                    case 14:
                        volleyballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(volleyballPlayerEventStatistics.getReceptionErrors()));
                    case 15:
                        volleyballPlayerEventStatistics.getClass();
                        return Boolean.valueOf(volleyballPlayerEventStatistics.getReceptionErrors() != null);
                    case 16:
                        volleyballPlayerEventStatistics.getClass();
                        String o2 = yid.o(volleyballPlayerEventStatistics.getReceptionPositivity(), 1);
                        return o2 == null ? "-" : o2;
                    case 17:
                        volleyballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    case 18:
                        volleyballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.k(volleyballPlayerEventStatistics.getReceptionPositivity()));
                    case 19:
                        volleyballPlayerEventStatistics.getClass();
                        return Boolean.valueOf(volleyballPlayerEventStatistics.getReceptionPositivity() != null);
                    case 20:
                        volleyballPlayerEventStatistics.getClass();
                        String o3 = yid.o(volleyballPlayerEventStatistics.getReceptionPerf(), 1);
                        return o3 == null ? "-" : o3;
                    case 21:
                        volleyballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(volleyballPlayerEventStatistics.getAttackPoints()));
                    case 22:
                        volleyballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.k(volleyballPlayerEventStatistics.getReceptionPerf()));
                    case 23:
                        volleyballPlayerEventStatistics.getClass();
                        return Boolean.valueOf(volleyballPlayerEventStatistics.getReceptionPerf() != null);
                    case 24:
                        volleyballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(volleyballPlayerEventStatistics.getAttacksTotal()));
                    case 25:
                        volleyballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(volleyballPlayerEventStatistics.getAttacksTotal()));
                    case 26:
                        volleyballPlayerEventStatistics.getClass();
                        return Boolean.valueOf(volleyballPlayerEventStatistics.getAttacksTotal() != null);
                    case 27:
                        volleyballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(volleyballPlayerEventStatistics.getAttackErrors()));
                    case 28:
                        volleyballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(volleyballPlayerEventStatistics.getPointsTotal()));
                    default:
                        volleyballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(volleyballPlayerEventStatistics.getAttackErrors()));
                }
            }
        }, true);
        p = pwkVar10;
        final int i15 = 10;
        final int i16 = 11;
        final int i17 = 12;
        pwk pwkVar11 = new pwk(10, R.string.total_stats_short, R.string.total, "TotalReceptions", new Function1() { // from class: nwk
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                VolleyballPlayerEventStatistics volleyballPlayerEventStatistics = (VolleyballPlayerEventStatistics) obj;
                switch (i15) {
                    case 0:
                        volleyballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(volleyballPlayerEventStatistics.getBlockPoints()));
                    case 1:
                        volleyballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    case 2:
                        volleyballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(volleyballPlayerEventStatistics.getServes()));
                    case 3:
                        volleyballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(volleyballPlayerEventStatistics.getServes()));
                    case 4:
                        volleyballPlayerEventStatistics.getClass();
                        return Boolean.valueOf(volleyballPlayerEventStatistics.getServes() != null);
                    case 5:
                        volleyballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(volleyballPlayerEventStatistics.getServeErrors()));
                    case 6:
                        volleyballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(volleyballPlayerEventStatistics.getBlockPoints()));
                    case 7:
                        volleyballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(volleyballPlayerEventStatistics.getServeErrors()));
                    case 8:
                        volleyballPlayerEventStatistics.getClass();
                        return Boolean.valueOf(volleyballPlayerEventStatistics.getServeErrors() != null);
                    case 9:
                        volleyballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    case 10:
                        volleyballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(volleyballPlayerEventStatistics.getReceptionsTotal()));
                    case 11:
                        volleyballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(volleyballPlayerEventStatistics.getReceptionsTotal()));
                    case 12:
                        volleyballPlayerEventStatistics.getClass();
                        return Boolean.valueOf(volleyballPlayerEventStatistics.getReceptionsTotal() != null);
                    case 13:
                        volleyballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(volleyballPlayerEventStatistics.getReceptionErrors()));
                    case 14:
                        volleyballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(volleyballPlayerEventStatistics.getReceptionErrors()));
                    case 15:
                        volleyballPlayerEventStatistics.getClass();
                        return Boolean.valueOf(volleyballPlayerEventStatistics.getReceptionErrors() != null);
                    case 16:
                        volleyballPlayerEventStatistics.getClass();
                        String o2 = yid.o(volleyballPlayerEventStatistics.getReceptionPositivity(), 1);
                        return o2 == null ? "-" : o2;
                    case 17:
                        volleyballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    case 18:
                        volleyballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.k(volleyballPlayerEventStatistics.getReceptionPositivity()));
                    case 19:
                        volleyballPlayerEventStatistics.getClass();
                        return Boolean.valueOf(volleyballPlayerEventStatistics.getReceptionPositivity() != null);
                    case 20:
                        volleyballPlayerEventStatistics.getClass();
                        String o3 = yid.o(volleyballPlayerEventStatistics.getReceptionPerf(), 1);
                        return o3 == null ? "-" : o3;
                    case 21:
                        volleyballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(volleyballPlayerEventStatistics.getAttackPoints()));
                    case 22:
                        volleyballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.k(volleyballPlayerEventStatistics.getReceptionPerf()));
                    case 23:
                        volleyballPlayerEventStatistics.getClass();
                        return Boolean.valueOf(volleyballPlayerEventStatistics.getReceptionPerf() != null);
                    case 24:
                        volleyballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(volleyballPlayerEventStatistics.getAttacksTotal()));
                    case 25:
                        volleyballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(volleyballPlayerEventStatistics.getAttacksTotal()));
                    case 26:
                        volleyballPlayerEventStatistics.getClass();
                        return Boolean.valueOf(volleyballPlayerEventStatistics.getAttacksTotal() != null);
                    case 27:
                        volleyballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(volleyballPlayerEventStatistics.getAttackErrors()));
                    case 28:
                        volleyballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(volleyballPlayerEventStatistics.getPointsTotal()));
                    default:
                        volleyballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(volleyballPlayerEventStatistics.getAttackErrors()));
                }
            }
        }, new Function1() { // from class: nwk
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                VolleyballPlayerEventStatistics volleyballPlayerEventStatistics = (VolleyballPlayerEventStatistics) obj;
                switch (i16) {
                    case 0:
                        volleyballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(volleyballPlayerEventStatistics.getBlockPoints()));
                    case 1:
                        volleyballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    case 2:
                        volleyballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(volleyballPlayerEventStatistics.getServes()));
                    case 3:
                        volleyballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(volleyballPlayerEventStatistics.getServes()));
                    case 4:
                        volleyballPlayerEventStatistics.getClass();
                        return Boolean.valueOf(volleyballPlayerEventStatistics.getServes() != null);
                    case 5:
                        volleyballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(volleyballPlayerEventStatistics.getServeErrors()));
                    case 6:
                        volleyballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(volleyballPlayerEventStatistics.getBlockPoints()));
                    case 7:
                        volleyballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(volleyballPlayerEventStatistics.getServeErrors()));
                    case 8:
                        volleyballPlayerEventStatistics.getClass();
                        return Boolean.valueOf(volleyballPlayerEventStatistics.getServeErrors() != null);
                    case 9:
                        volleyballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    case 10:
                        volleyballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(volleyballPlayerEventStatistics.getReceptionsTotal()));
                    case 11:
                        volleyballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(volleyballPlayerEventStatistics.getReceptionsTotal()));
                    case 12:
                        volleyballPlayerEventStatistics.getClass();
                        return Boolean.valueOf(volleyballPlayerEventStatistics.getReceptionsTotal() != null);
                    case 13:
                        volleyballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(volleyballPlayerEventStatistics.getReceptionErrors()));
                    case 14:
                        volleyballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(volleyballPlayerEventStatistics.getReceptionErrors()));
                    case 15:
                        volleyballPlayerEventStatistics.getClass();
                        return Boolean.valueOf(volleyballPlayerEventStatistics.getReceptionErrors() != null);
                    case 16:
                        volleyballPlayerEventStatistics.getClass();
                        String o2 = yid.o(volleyballPlayerEventStatistics.getReceptionPositivity(), 1);
                        return o2 == null ? "-" : o2;
                    case 17:
                        volleyballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    case 18:
                        volleyballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.k(volleyballPlayerEventStatistics.getReceptionPositivity()));
                    case 19:
                        volleyballPlayerEventStatistics.getClass();
                        return Boolean.valueOf(volleyballPlayerEventStatistics.getReceptionPositivity() != null);
                    case 20:
                        volleyballPlayerEventStatistics.getClass();
                        String o3 = yid.o(volleyballPlayerEventStatistics.getReceptionPerf(), 1);
                        return o3 == null ? "-" : o3;
                    case 21:
                        volleyballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(volleyballPlayerEventStatistics.getAttackPoints()));
                    case 22:
                        volleyballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.k(volleyballPlayerEventStatistics.getReceptionPerf()));
                    case 23:
                        volleyballPlayerEventStatistics.getClass();
                        return Boolean.valueOf(volleyballPlayerEventStatistics.getReceptionPerf() != null);
                    case 24:
                        volleyballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(volleyballPlayerEventStatistics.getAttacksTotal()));
                    case 25:
                        volleyballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(volleyballPlayerEventStatistics.getAttacksTotal()));
                    case 26:
                        volleyballPlayerEventStatistics.getClass();
                        return Boolean.valueOf(volleyballPlayerEventStatistics.getAttacksTotal() != null);
                    case 27:
                        volleyballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(volleyballPlayerEventStatistics.getAttackErrors()));
                    case 28:
                        volleyballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(volleyballPlayerEventStatistics.getPointsTotal()));
                    default:
                        volleyballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(volleyballPlayerEventStatistics.getAttackErrors()));
                }
            }
        }, new Function1() { // from class: nwk
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                VolleyballPlayerEventStatistics volleyballPlayerEventStatistics = (VolleyballPlayerEventStatistics) obj;
                switch (i17) {
                    case 0:
                        volleyballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(volleyballPlayerEventStatistics.getBlockPoints()));
                    case 1:
                        volleyballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    case 2:
                        volleyballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(volleyballPlayerEventStatistics.getServes()));
                    case 3:
                        volleyballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(volleyballPlayerEventStatistics.getServes()));
                    case 4:
                        volleyballPlayerEventStatistics.getClass();
                        return Boolean.valueOf(volleyballPlayerEventStatistics.getServes() != null);
                    case 5:
                        volleyballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(volleyballPlayerEventStatistics.getServeErrors()));
                    case 6:
                        volleyballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(volleyballPlayerEventStatistics.getBlockPoints()));
                    case 7:
                        volleyballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(volleyballPlayerEventStatistics.getServeErrors()));
                    case 8:
                        volleyballPlayerEventStatistics.getClass();
                        return Boolean.valueOf(volleyballPlayerEventStatistics.getServeErrors() != null);
                    case 9:
                        volleyballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    case 10:
                        volleyballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(volleyballPlayerEventStatistics.getReceptionsTotal()));
                    case 11:
                        volleyballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(volleyballPlayerEventStatistics.getReceptionsTotal()));
                    case 12:
                        volleyballPlayerEventStatistics.getClass();
                        return Boolean.valueOf(volleyballPlayerEventStatistics.getReceptionsTotal() != null);
                    case 13:
                        volleyballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(volleyballPlayerEventStatistics.getReceptionErrors()));
                    case 14:
                        volleyballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(volleyballPlayerEventStatistics.getReceptionErrors()));
                    case 15:
                        volleyballPlayerEventStatistics.getClass();
                        return Boolean.valueOf(volleyballPlayerEventStatistics.getReceptionErrors() != null);
                    case 16:
                        volleyballPlayerEventStatistics.getClass();
                        String o2 = yid.o(volleyballPlayerEventStatistics.getReceptionPositivity(), 1);
                        return o2 == null ? "-" : o2;
                    case 17:
                        volleyballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    case 18:
                        volleyballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.k(volleyballPlayerEventStatistics.getReceptionPositivity()));
                    case 19:
                        volleyballPlayerEventStatistics.getClass();
                        return Boolean.valueOf(volleyballPlayerEventStatistics.getReceptionPositivity() != null);
                    case 20:
                        volleyballPlayerEventStatistics.getClass();
                        String o3 = yid.o(volleyballPlayerEventStatistics.getReceptionPerf(), 1);
                        return o3 == null ? "-" : o3;
                    case 21:
                        volleyballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(volleyballPlayerEventStatistics.getAttackPoints()));
                    case 22:
                        volleyballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.k(volleyballPlayerEventStatistics.getReceptionPerf()));
                    case 23:
                        volleyballPlayerEventStatistics.getClass();
                        return Boolean.valueOf(volleyballPlayerEventStatistics.getReceptionPerf() != null);
                    case 24:
                        volleyballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(volleyballPlayerEventStatistics.getAttacksTotal()));
                    case 25:
                        volleyballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(volleyballPlayerEventStatistics.getAttacksTotal()));
                    case 26:
                        volleyballPlayerEventStatistics.getClass();
                        return Boolean.valueOf(volleyballPlayerEventStatistics.getAttacksTotal() != null);
                    case 27:
                        volleyballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(volleyballPlayerEventStatistics.getAttackErrors()));
                    case 28:
                        volleyballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(volleyballPlayerEventStatistics.getPointsTotal()));
                    default:
                        volleyballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(volleyballPlayerEventStatistics.getAttackErrors()));
                }
            }
        }, true);
        q = pwkVar11;
        final int i18 = 13;
        final int i19 = 14;
        final int i20 = 15;
        pwk pwkVar12 = new pwk(11, R.string.volleyball_errors_short, R.string.volleyball_errors, "ReceptionErrors", new Function1() { // from class: nwk
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                VolleyballPlayerEventStatistics volleyballPlayerEventStatistics = (VolleyballPlayerEventStatistics) obj;
                switch (i18) {
                    case 0:
                        volleyballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(volleyballPlayerEventStatistics.getBlockPoints()));
                    case 1:
                        volleyballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    case 2:
                        volleyballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(volleyballPlayerEventStatistics.getServes()));
                    case 3:
                        volleyballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(volleyballPlayerEventStatistics.getServes()));
                    case 4:
                        volleyballPlayerEventStatistics.getClass();
                        return Boolean.valueOf(volleyballPlayerEventStatistics.getServes() != null);
                    case 5:
                        volleyballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(volleyballPlayerEventStatistics.getServeErrors()));
                    case 6:
                        volleyballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(volleyballPlayerEventStatistics.getBlockPoints()));
                    case 7:
                        volleyballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(volleyballPlayerEventStatistics.getServeErrors()));
                    case 8:
                        volleyballPlayerEventStatistics.getClass();
                        return Boolean.valueOf(volleyballPlayerEventStatistics.getServeErrors() != null);
                    case 9:
                        volleyballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    case 10:
                        volleyballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(volleyballPlayerEventStatistics.getReceptionsTotal()));
                    case 11:
                        volleyballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(volleyballPlayerEventStatistics.getReceptionsTotal()));
                    case 12:
                        volleyballPlayerEventStatistics.getClass();
                        return Boolean.valueOf(volleyballPlayerEventStatistics.getReceptionsTotal() != null);
                    case 13:
                        volleyballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(volleyballPlayerEventStatistics.getReceptionErrors()));
                    case 14:
                        volleyballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(volleyballPlayerEventStatistics.getReceptionErrors()));
                    case 15:
                        volleyballPlayerEventStatistics.getClass();
                        return Boolean.valueOf(volleyballPlayerEventStatistics.getReceptionErrors() != null);
                    case 16:
                        volleyballPlayerEventStatistics.getClass();
                        String o2 = yid.o(volleyballPlayerEventStatistics.getReceptionPositivity(), 1);
                        return o2 == null ? "-" : o2;
                    case 17:
                        volleyballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    case 18:
                        volleyballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.k(volleyballPlayerEventStatistics.getReceptionPositivity()));
                    case 19:
                        volleyballPlayerEventStatistics.getClass();
                        return Boolean.valueOf(volleyballPlayerEventStatistics.getReceptionPositivity() != null);
                    case 20:
                        volleyballPlayerEventStatistics.getClass();
                        String o3 = yid.o(volleyballPlayerEventStatistics.getReceptionPerf(), 1);
                        return o3 == null ? "-" : o3;
                    case 21:
                        volleyballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(volleyballPlayerEventStatistics.getAttackPoints()));
                    case 22:
                        volleyballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.k(volleyballPlayerEventStatistics.getReceptionPerf()));
                    case 23:
                        volleyballPlayerEventStatistics.getClass();
                        return Boolean.valueOf(volleyballPlayerEventStatistics.getReceptionPerf() != null);
                    case 24:
                        volleyballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(volleyballPlayerEventStatistics.getAttacksTotal()));
                    case 25:
                        volleyballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(volleyballPlayerEventStatistics.getAttacksTotal()));
                    case 26:
                        volleyballPlayerEventStatistics.getClass();
                        return Boolean.valueOf(volleyballPlayerEventStatistics.getAttacksTotal() != null);
                    case 27:
                        volleyballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(volleyballPlayerEventStatistics.getAttackErrors()));
                    case 28:
                        volleyballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(volleyballPlayerEventStatistics.getPointsTotal()));
                    default:
                        volleyballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(volleyballPlayerEventStatistics.getAttackErrors()));
                }
            }
        }, new Function1() { // from class: nwk
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                VolleyballPlayerEventStatistics volleyballPlayerEventStatistics = (VolleyballPlayerEventStatistics) obj;
                switch (i19) {
                    case 0:
                        volleyballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(volleyballPlayerEventStatistics.getBlockPoints()));
                    case 1:
                        volleyballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    case 2:
                        volleyballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(volleyballPlayerEventStatistics.getServes()));
                    case 3:
                        volleyballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(volleyballPlayerEventStatistics.getServes()));
                    case 4:
                        volleyballPlayerEventStatistics.getClass();
                        return Boolean.valueOf(volleyballPlayerEventStatistics.getServes() != null);
                    case 5:
                        volleyballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(volleyballPlayerEventStatistics.getServeErrors()));
                    case 6:
                        volleyballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(volleyballPlayerEventStatistics.getBlockPoints()));
                    case 7:
                        volleyballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(volleyballPlayerEventStatistics.getServeErrors()));
                    case 8:
                        volleyballPlayerEventStatistics.getClass();
                        return Boolean.valueOf(volleyballPlayerEventStatistics.getServeErrors() != null);
                    case 9:
                        volleyballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    case 10:
                        volleyballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(volleyballPlayerEventStatistics.getReceptionsTotal()));
                    case 11:
                        volleyballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(volleyballPlayerEventStatistics.getReceptionsTotal()));
                    case 12:
                        volleyballPlayerEventStatistics.getClass();
                        return Boolean.valueOf(volleyballPlayerEventStatistics.getReceptionsTotal() != null);
                    case 13:
                        volleyballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(volleyballPlayerEventStatistics.getReceptionErrors()));
                    case 14:
                        volleyballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(volleyballPlayerEventStatistics.getReceptionErrors()));
                    case 15:
                        volleyballPlayerEventStatistics.getClass();
                        return Boolean.valueOf(volleyballPlayerEventStatistics.getReceptionErrors() != null);
                    case 16:
                        volleyballPlayerEventStatistics.getClass();
                        String o2 = yid.o(volleyballPlayerEventStatistics.getReceptionPositivity(), 1);
                        return o2 == null ? "-" : o2;
                    case 17:
                        volleyballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    case 18:
                        volleyballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.k(volleyballPlayerEventStatistics.getReceptionPositivity()));
                    case 19:
                        volleyballPlayerEventStatistics.getClass();
                        return Boolean.valueOf(volleyballPlayerEventStatistics.getReceptionPositivity() != null);
                    case 20:
                        volleyballPlayerEventStatistics.getClass();
                        String o3 = yid.o(volleyballPlayerEventStatistics.getReceptionPerf(), 1);
                        return o3 == null ? "-" : o3;
                    case 21:
                        volleyballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(volleyballPlayerEventStatistics.getAttackPoints()));
                    case 22:
                        volleyballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.k(volleyballPlayerEventStatistics.getReceptionPerf()));
                    case 23:
                        volleyballPlayerEventStatistics.getClass();
                        return Boolean.valueOf(volleyballPlayerEventStatistics.getReceptionPerf() != null);
                    case 24:
                        volleyballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(volleyballPlayerEventStatistics.getAttacksTotal()));
                    case 25:
                        volleyballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(volleyballPlayerEventStatistics.getAttacksTotal()));
                    case 26:
                        volleyballPlayerEventStatistics.getClass();
                        return Boolean.valueOf(volleyballPlayerEventStatistics.getAttacksTotal() != null);
                    case 27:
                        volleyballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(volleyballPlayerEventStatistics.getAttackErrors()));
                    case 28:
                        volleyballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(volleyballPlayerEventStatistics.getPointsTotal()));
                    default:
                        volleyballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(volleyballPlayerEventStatistics.getAttackErrors()));
                }
            }
        }, new Function1() { // from class: nwk
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                VolleyballPlayerEventStatistics volleyballPlayerEventStatistics = (VolleyballPlayerEventStatistics) obj;
                switch (i20) {
                    case 0:
                        volleyballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(volleyballPlayerEventStatistics.getBlockPoints()));
                    case 1:
                        volleyballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    case 2:
                        volleyballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(volleyballPlayerEventStatistics.getServes()));
                    case 3:
                        volleyballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(volleyballPlayerEventStatistics.getServes()));
                    case 4:
                        volleyballPlayerEventStatistics.getClass();
                        return Boolean.valueOf(volleyballPlayerEventStatistics.getServes() != null);
                    case 5:
                        volleyballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(volleyballPlayerEventStatistics.getServeErrors()));
                    case 6:
                        volleyballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(volleyballPlayerEventStatistics.getBlockPoints()));
                    case 7:
                        volleyballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(volleyballPlayerEventStatistics.getServeErrors()));
                    case 8:
                        volleyballPlayerEventStatistics.getClass();
                        return Boolean.valueOf(volleyballPlayerEventStatistics.getServeErrors() != null);
                    case 9:
                        volleyballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    case 10:
                        volleyballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(volleyballPlayerEventStatistics.getReceptionsTotal()));
                    case 11:
                        volleyballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(volleyballPlayerEventStatistics.getReceptionsTotal()));
                    case 12:
                        volleyballPlayerEventStatistics.getClass();
                        return Boolean.valueOf(volleyballPlayerEventStatistics.getReceptionsTotal() != null);
                    case 13:
                        volleyballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(volleyballPlayerEventStatistics.getReceptionErrors()));
                    case 14:
                        volleyballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(volleyballPlayerEventStatistics.getReceptionErrors()));
                    case 15:
                        volleyballPlayerEventStatistics.getClass();
                        return Boolean.valueOf(volleyballPlayerEventStatistics.getReceptionErrors() != null);
                    case 16:
                        volleyballPlayerEventStatistics.getClass();
                        String o2 = yid.o(volleyballPlayerEventStatistics.getReceptionPositivity(), 1);
                        return o2 == null ? "-" : o2;
                    case 17:
                        volleyballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    case 18:
                        volleyballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.k(volleyballPlayerEventStatistics.getReceptionPositivity()));
                    case 19:
                        volleyballPlayerEventStatistics.getClass();
                        return Boolean.valueOf(volleyballPlayerEventStatistics.getReceptionPositivity() != null);
                    case 20:
                        volleyballPlayerEventStatistics.getClass();
                        String o3 = yid.o(volleyballPlayerEventStatistics.getReceptionPerf(), 1);
                        return o3 == null ? "-" : o3;
                    case 21:
                        volleyballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(volleyballPlayerEventStatistics.getAttackPoints()));
                    case 22:
                        volleyballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.k(volleyballPlayerEventStatistics.getReceptionPerf()));
                    case 23:
                        volleyballPlayerEventStatistics.getClass();
                        return Boolean.valueOf(volleyballPlayerEventStatistics.getReceptionPerf() != null);
                    case 24:
                        volleyballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(volleyballPlayerEventStatistics.getAttacksTotal()));
                    case 25:
                        volleyballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(volleyballPlayerEventStatistics.getAttacksTotal()));
                    case 26:
                        volleyballPlayerEventStatistics.getClass();
                        return Boolean.valueOf(volleyballPlayerEventStatistics.getAttacksTotal() != null);
                    case 27:
                        volleyballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(volleyballPlayerEventStatistics.getAttackErrors()));
                    case 28:
                        volleyballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(volleyballPlayerEventStatistics.getPointsTotal()));
                    default:
                        volleyballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(volleyballPlayerEventStatistics.getAttackErrors()));
                }
            }
        }, true);
        r = pwkVar12;
        final int i21 = 16;
        final int i22 = 18;
        final int i23 = 19;
        pwk pwkVar13 = new pwk(12, R.string.volleyball_positive_reception_percentage_short, R.string.volleyball_positive_reception_percentage, "PositiveReceptions", new Function1() { // from class: nwk
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                VolleyballPlayerEventStatistics volleyballPlayerEventStatistics = (VolleyballPlayerEventStatistics) obj;
                switch (i21) {
                    case 0:
                        volleyballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(volleyballPlayerEventStatistics.getBlockPoints()));
                    case 1:
                        volleyballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    case 2:
                        volleyballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(volleyballPlayerEventStatistics.getServes()));
                    case 3:
                        volleyballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(volleyballPlayerEventStatistics.getServes()));
                    case 4:
                        volleyballPlayerEventStatistics.getClass();
                        return Boolean.valueOf(volleyballPlayerEventStatistics.getServes() != null);
                    case 5:
                        volleyballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(volleyballPlayerEventStatistics.getServeErrors()));
                    case 6:
                        volleyballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(volleyballPlayerEventStatistics.getBlockPoints()));
                    case 7:
                        volleyballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(volleyballPlayerEventStatistics.getServeErrors()));
                    case 8:
                        volleyballPlayerEventStatistics.getClass();
                        return Boolean.valueOf(volleyballPlayerEventStatistics.getServeErrors() != null);
                    case 9:
                        volleyballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    case 10:
                        volleyballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(volleyballPlayerEventStatistics.getReceptionsTotal()));
                    case 11:
                        volleyballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(volleyballPlayerEventStatistics.getReceptionsTotal()));
                    case 12:
                        volleyballPlayerEventStatistics.getClass();
                        return Boolean.valueOf(volleyballPlayerEventStatistics.getReceptionsTotal() != null);
                    case 13:
                        volleyballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(volleyballPlayerEventStatistics.getReceptionErrors()));
                    case 14:
                        volleyballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(volleyballPlayerEventStatistics.getReceptionErrors()));
                    case 15:
                        volleyballPlayerEventStatistics.getClass();
                        return Boolean.valueOf(volleyballPlayerEventStatistics.getReceptionErrors() != null);
                    case 16:
                        volleyballPlayerEventStatistics.getClass();
                        String o2 = yid.o(volleyballPlayerEventStatistics.getReceptionPositivity(), 1);
                        return o2 == null ? "-" : o2;
                    case 17:
                        volleyballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    case 18:
                        volleyballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.k(volleyballPlayerEventStatistics.getReceptionPositivity()));
                    case 19:
                        volleyballPlayerEventStatistics.getClass();
                        return Boolean.valueOf(volleyballPlayerEventStatistics.getReceptionPositivity() != null);
                    case 20:
                        volleyballPlayerEventStatistics.getClass();
                        String o3 = yid.o(volleyballPlayerEventStatistics.getReceptionPerf(), 1);
                        return o3 == null ? "-" : o3;
                    case 21:
                        volleyballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(volleyballPlayerEventStatistics.getAttackPoints()));
                    case 22:
                        volleyballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.k(volleyballPlayerEventStatistics.getReceptionPerf()));
                    case 23:
                        volleyballPlayerEventStatistics.getClass();
                        return Boolean.valueOf(volleyballPlayerEventStatistics.getReceptionPerf() != null);
                    case 24:
                        volleyballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(volleyballPlayerEventStatistics.getAttacksTotal()));
                    case 25:
                        volleyballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(volleyballPlayerEventStatistics.getAttacksTotal()));
                    case 26:
                        volleyballPlayerEventStatistics.getClass();
                        return Boolean.valueOf(volleyballPlayerEventStatistics.getAttacksTotal() != null);
                    case 27:
                        volleyballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(volleyballPlayerEventStatistics.getAttackErrors()));
                    case 28:
                        volleyballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(volleyballPlayerEventStatistics.getPointsTotal()));
                    default:
                        volleyballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(volleyballPlayerEventStatistics.getAttackErrors()));
                }
            }
        }, new Function1() { // from class: nwk
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                VolleyballPlayerEventStatistics volleyballPlayerEventStatistics = (VolleyballPlayerEventStatistics) obj;
                switch (i22) {
                    case 0:
                        volleyballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(volleyballPlayerEventStatistics.getBlockPoints()));
                    case 1:
                        volleyballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    case 2:
                        volleyballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(volleyballPlayerEventStatistics.getServes()));
                    case 3:
                        volleyballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(volleyballPlayerEventStatistics.getServes()));
                    case 4:
                        volleyballPlayerEventStatistics.getClass();
                        return Boolean.valueOf(volleyballPlayerEventStatistics.getServes() != null);
                    case 5:
                        volleyballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(volleyballPlayerEventStatistics.getServeErrors()));
                    case 6:
                        volleyballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(volleyballPlayerEventStatistics.getBlockPoints()));
                    case 7:
                        volleyballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(volleyballPlayerEventStatistics.getServeErrors()));
                    case 8:
                        volleyballPlayerEventStatistics.getClass();
                        return Boolean.valueOf(volleyballPlayerEventStatistics.getServeErrors() != null);
                    case 9:
                        volleyballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    case 10:
                        volleyballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(volleyballPlayerEventStatistics.getReceptionsTotal()));
                    case 11:
                        volleyballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(volleyballPlayerEventStatistics.getReceptionsTotal()));
                    case 12:
                        volleyballPlayerEventStatistics.getClass();
                        return Boolean.valueOf(volleyballPlayerEventStatistics.getReceptionsTotal() != null);
                    case 13:
                        volleyballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(volleyballPlayerEventStatistics.getReceptionErrors()));
                    case 14:
                        volleyballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(volleyballPlayerEventStatistics.getReceptionErrors()));
                    case 15:
                        volleyballPlayerEventStatistics.getClass();
                        return Boolean.valueOf(volleyballPlayerEventStatistics.getReceptionErrors() != null);
                    case 16:
                        volleyballPlayerEventStatistics.getClass();
                        String o2 = yid.o(volleyballPlayerEventStatistics.getReceptionPositivity(), 1);
                        return o2 == null ? "-" : o2;
                    case 17:
                        volleyballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    case 18:
                        volleyballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.k(volleyballPlayerEventStatistics.getReceptionPositivity()));
                    case 19:
                        volleyballPlayerEventStatistics.getClass();
                        return Boolean.valueOf(volleyballPlayerEventStatistics.getReceptionPositivity() != null);
                    case 20:
                        volleyballPlayerEventStatistics.getClass();
                        String o3 = yid.o(volleyballPlayerEventStatistics.getReceptionPerf(), 1);
                        return o3 == null ? "-" : o3;
                    case 21:
                        volleyballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(volleyballPlayerEventStatistics.getAttackPoints()));
                    case 22:
                        volleyballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.k(volleyballPlayerEventStatistics.getReceptionPerf()));
                    case 23:
                        volleyballPlayerEventStatistics.getClass();
                        return Boolean.valueOf(volleyballPlayerEventStatistics.getReceptionPerf() != null);
                    case 24:
                        volleyballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(volleyballPlayerEventStatistics.getAttacksTotal()));
                    case 25:
                        volleyballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(volleyballPlayerEventStatistics.getAttacksTotal()));
                    case 26:
                        volleyballPlayerEventStatistics.getClass();
                        return Boolean.valueOf(volleyballPlayerEventStatistics.getAttacksTotal() != null);
                    case 27:
                        volleyballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(volleyballPlayerEventStatistics.getAttackErrors()));
                    case 28:
                        volleyballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(volleyballPlayerEventStatistics.getPointsTotal()));
                    default:
                        volleyballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(volleyballPlayerEventStatistics.getAttackErrors()));
                }
            }
        }, new Function1() { // from class: nwk
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                VolleyballPlayerEventStatistics volleyballPlayerEventStatistics = (VolleyballPlayerEventStatistics) obj;
                switch (i23) {
                    case 0:
                        volleyballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(volleyballPlayerEventStatistics.getBlockPoints()));
                    case 1:
                        volleyballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    case 2:
                        volleyballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(volleyballPlayerEventStatistics.getServes()));
                    case 3:
                        volleyballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(volleyballPlayerEventStatistics.getServes()));
                    case 4:
                        volleyballPlayerEventStatistics.getClass();
                        return Boolean.valueOf(volleyballPlayerEventStatistics.getServes() != null);
                    case 5:
                        volleyballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(volleyballPlayerEventStatistics.getServeErrors()));
                    case 6:
                        volleyballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(volleyballPlayerEventStatistics.getBlockPoints()));
                    case 7:
                        volleyballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(volleyballPlayerEventStatistics.getServeErrors()));
                    case 8:
                        volleyballPlayerEventStatistics.getClass();
                        return Boolean.valueOf(volleyballPlayerEventStatistics.getServeErrors() != null);
                    case 9:
                        volleyballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    case 10:
                        volleyballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(volleyballPlayerEventStatistics.getReceptionsTotal()));
                    case 11:
                        volleyballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(volleyballPlayerEventStatistics.getReceptionsTotal()));
                    case 12:
                        volleyballPlayerEventStatistics.getClass();
                        return Boolean.valueOf(volleyballPlayerEventStatistics.getReceptionsTotal() != null);
                    case 13:
                        volleyballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(volleyballPlayerEventStatistics.getReceptionErrors()));
                    case 14:
                        volleyballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(volleyballPlayerEventStatistics.getReceptionErrors()));
                    case 15:
                        volleyballPlayerEventStatistics.getClass();
                        return Boolean.valueOf(volleyballPlayerEventStatistics.getReceptionErrors() != null);
                    case 16:
                        volleyballPlayerEventStatistics.getClass();
                        String o2 = yid.o(volleyballPlayerEventStatistics.getReceptionPositivity(), 1);
                        return o2 == null ? "-" : o2;
                    case 17:
                        volleyballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    case 18:
                        volleyballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.k(volleyballPlayerEventStatistics.getReceptionPositivity()));
                    case 19:
                        volleyballPlayerEventStatistics.getClass();
                        return Boolean.valueOf(volleyballPlayerEventStatistics.getReceptionPositivity() != null);
                    case 20:
                        volleyballPlayerEventStatistics.getClass();
                        String o3 = yid.o(volleyballPlayerEventStatistics.getReceptionPerf(), 1);
                        return o3 == null ? "-" : o3;
                    case 21:
                        volleyballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(volleyballPlayerEventStatistics.getAttackPoints()));
                    case 22:
                        volleyballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.k(volleyballPlayerEventStatistics.getReceptionPerf()));
                    case 23:
                        volleyballPlayerEventStatistics.getClass();
                        return Boolean.valueOf(volleyballPlayerEventStatistics.getReceptionPerf() != null);
                    case 24:
                        volleyballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(volleyballPlayerEventStatistics.getAttacksTotal()));
                    case 25:
                        volleyballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(volleyballPlayerEventStatistics.getAttacksTotal()));
                    case 26:
                        volleyballPlayerEventStatistics.getClass();
                        return Boolean.valueOf(volleyballPlayerEventStatistics.getAttacksTotal() != null);
                    case 27:
                        volleyballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(volleyballPlayerEventStatistics.getAttackErrors()));
                    case 28:
                        volleyballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(volleyballPlayerEventStatistics.getPointsTotal()));
                    default:
                        volleyballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(volleyballPlayerEventStatistics.getAttackErrors()));
                }
            }
        }, true);
        s = pwkVar13;
        final int i24 = 20;
        final int i25 = 22;
        final int i26 = 23;
        pwk pwkVar14 = new pwk(13, R.string.volleyball_excellent_reception_percentage_short, R.string.volleyball_excellent_reception_percentage, "PerfectReceptions", new Function1() { // from class: nwk
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                VolleyballPlayerEventStatistics volleyballPlayerEventStatistics = (VolleyballPlayerEventStatistics) obj;
                switch (i24) {
                    case 0:
                        volleyballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(volleyballPlayerEventStatistics.getBlockPoints()));
                    case 1:
                        volleyballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    case 2:
                        volleyballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(volleyballPlayerEventStatistics.getServes()));
                    case 3:
                        volleyballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(volleyballPlayerEventStatistics.getServes()));
                    case 4:
                        volleyballPlayerEventStatistics.getClass();
                        return Boolean.valueOf(volleyballPlayerEventStatistics.getServes() != null);
                    case 5:
                        volleyballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(volleyballPlayerEventStatistics.getServeErrors()));
                    case 6:
                        volleyballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(volleyballPlayerEventStatistics.getBlockPoints()));
                    case 7:
                        volleyballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(volleyballPlayerEventStatistics.getServeErrors()));
                    case 8:
                        volleyballPlayerEventStatistics.getClass();
                        return Boolean.valueOf(volleyballPlayerEventStatistics.getServeErrors() != null);
                    case 9:
                        volleyballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    case 10:
                        volleyballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(volleyballPlayerEventStatistics.getReceptionsTotal()));
                    case 11:
                        volleyballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(volleyballPlayerEventStatistics.getReceptionsTotal()));
                    case 12:
                        volleyballPlayerEventStatistics.getClass();
                        return Boolean.valueOf(volleyballPlayerEventStatistics.getReceptionsTotal() != null);
                    case 13:
                        volleyballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(volleyballPlayerEventStatistics.getReceptionErrors()));
                    case 14:
                        volleyballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(volleyballPlayerEventStatistics.getReceptionErrors()));
                    case 15:
                        volleyballPlayerEventStatistics.getClass();
                        return Boolean.valueOf(volleyballPlayerEventStatistics.getReceptionErrors() != null);
                    case 16:
                        volleyballPlayerEventStatistics.getClass();
                        String o2 = yid.o(volleyballPlayerEventStatistics.getReceptionPositivity(), 1);
                        return o2 == null ? "-" : o2;
                    case 17:
                        volleyballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    case 18:
                        volleyballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.k(volleyballPlayerEventStatistics.getReceptionPositivity()));
                    case 19:
                        volleyballPlayerEventStatistics.getClass();
                        return Boolean.valueOf(volleyballPlayerEventStatistics.getReceptionPositivity() != null);
                    case 20:
                        volleyballPlayerEventStatistics.getClass();
                        String o3 = yid.o(volleyballPlayerEventStatistics.getReceptionPerf(), 1);
                        return o3 == null ? "-" : o3;
                    case 21:
                        volleyballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(volleyballPlayerEventStatistics.getAttackPoints()));
                    case 22:
                        volleyballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.k(volleyballPlayerEventStatistics.getReceptionPerf()));
                    case 23:
                        volleyballPlayerEventStatistics.getClass();
                        return Boolean.valueOf(volleyballPlayerEventStatistics.getReceptionPerf() != null);
                    case 24:
                        volleyballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(volleyballPlayerEventStatistics.getAttacksTotal()));
                    case 25:
                        volleyballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(volleyballPlayerEventStatistics.getAttacksTotal()));
                    case 26:
                        volleyballPlayerEventStatistics.getClass();
                        return Boolean.valueOf(volleyballPlayerEventStatistics.getAttacksTotal() != null);
                    case 27:
                        volleyballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(volleyballPlayerEventStatistics.getAttackErrors()));
                    case 28:
                        volleyballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(volleyballPlayerEventStatistics.getPointsTotal()));
                    default:
                        volleyballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(volleyballPlayerEventStatistics.getAttackErrors()));
                }
            }
        }, new Function1() { // from class: nwk
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                VolleyballPlayerEventStatistics volleyballPlayerEventStatistics = (VolleyballPlayerEventStatistics) obj;
                switch (i25) {
                    case 0:
                        volleyballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(volleyballPlayerEventStatistics.getBlockPoints()));
                    case 1:
                        volleyballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    case 2:
                        volleyballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(volleyballPlayerEventStatistics.getServes()));
                    case 3:
                        volleyballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(volleyballPlayerEventStatistics.getServes()));
                    case 4:
                        volleyballPlayerEventStatistics.getClass();
                        return Boolean.valueOf(volleyballPlayerEventStatistics.getServes() != null);
                    case 5:
                        volleyballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(volleyballPlayerEventStatistics.getServeErrors()));
                    case 6:
                        volleyballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(volleyballPlayerEventStatistics.getBlockPoints()));
                    case 7:
                        volleyballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(volleyballPlayerEventStatistics.getServeErrors()));
                    case 8:
                        volleyballPlayerEventStatistics.getClass();
                        return Boolean.valueOf(volleyballPlayerEventStatistics.getServeErrors() != null);
                    case 9:
                        volleyballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    case 10:
                        volleyballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(volleyballPlayerEventStatistics.getReceptionsTotal()));
                    case 11:
                        volleyballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(volleyballPlayerEventStatistics.getReceptionsTotal()));
                    case 12:
                        volleyballPlayerEventStatistics.getClass();
                        return Boolean.valueOf(volleyballPlayerEventStatistics.getReceptionsTotal() != null);
                    case 13:
                        volleyballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(volleyballPlayerEventStatistics.getReceptionErrors()));
                    case 14:
                        volleyballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(volleyballPlayerEventStatistics.getReceptionErrors()));
                    case 15:
                        volleyballPlayerEventStatistics.getClass();
                        return Boolean.valueOf(volleyballPlayerEventStatistics.getReceptionErrors() != null);
                    case 16:
                        volleyballPlayerEventStatistics.getClass();
                        String o2 = yid.o(volleyballPlayerEventStatistics.getReceptionPositivity(), 1);
                        return o2 == null ? "-" : o2;
                    case 17:
                        volleyballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    case 18:
                        volleyballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.k(volleyballPlayerEventStatistics.getReceptionPositivity()));
                    case 19:
                        volleyballPlayerEventStatistics.getClass();
                        return Boolean.valueOf(volleyballPlayerEventStatistics.getReceptionPositivity() != null);
                    case 20:
                        volleyballPlayerEventStatistics.getClass();
                        String o3 = yid.o(volleyballPlayerEventStatistics.getReceptionPerf(), 1);
                        return o3 == null ? "-" : o3;
                    case 21:
                        volleyballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(volleyballPlayerEventStatistics.getAttackPoints()));
                    case 22:
                        volleyballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.k(volleyballPlayerEventStatistics.getReceptionPerf()));
                    case 23:
                        volleyballPlayerEventStatistics.getClass();
                        return Boolean.valueOf(volleyballPlayerEventStatistics.getReceptionPerf() != null);
                    case 24:
                        volleyballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(volleyballPlayerEventStatistics.getAttacksTotal()));
                    case 25:
                        volleyballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(volleyballPlayerEventStatistics.getAttacksTotal()));
                    case 26:
                        volleyballPlayerEventStatistics.getClass();
                        return Boolean.valueOf(volleyballPlayerEventStatistics.getAttacksTotal() != null);
                    case 27:
                        volleyballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(volleyballPlayerEventStatistics.getAttackErrors()));
                    case 28:
                        volleyballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(volleyballPlayerEventStatistics.getPointsTotal()));
                    default:
                        volleyballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(volleyballPlayerEventStatistics.getAttackErrors()));
                }
            }
        }, new Function1() { // from class: nwk
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                VolleyballPlayerEventStatistics volleyballPlayerEventStatistics = (VolleyballPlayerEventStatistics) obj;
                switch (i26) {
                    case 0:
                        volleyballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(volleyballPlayerEventStatistics.getBlockPoints()));
                    case 1:
                        volleyballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    case 2:
                        volleyballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(volleyballPlayerEventStatistics.getServes()));
                    case 3:
                        volleyballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(volleyballPlayerEventStatistics.getServes()));
                    case 4:
                        volleyballPlayerEventStatistics.getClass();
                        return Boolean.valueOf(volleyballPlayerEventStatistics.getServes() != null);
                    case 5:
                        volleyballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(volleyballPlayerEventStatistics.getServeErrors()));
                    case 6:
                        volleyballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(volleyballPlayerEventStatistics.getBlockPoints()));
                    case 7:
                        volleyballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(volleyballPlayerEventStatistics.getServeErrors()));
                    case 8:
                        volleyballPlayerEventStatistics.getClass();
                        return Boolean.valueOf(volleyballPlayerEventStatistics.getServeErrors() != null);
                    case 9:
                        volleyballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    case 10:
                        volleyballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(volleyballPlayerEventStatistics.getReceptionsTotal()));
                    case 11:
                        volleyballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(volleyballPlayerEventStatistics.getReceptionsTotal()));
                    case 12:
                        volleyballPlayerEventStatistics.getClass();
                        return Boolean.valueOf(volleyballPlayerEventStatistics.getReceptionsTotal() != null);
                    case 13:
                        volleyballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(volleyballPlayerEventStatistics.getReceptionErrors()));
                    case 14:
                        volleyballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(volleyballPlayerEventStatistics.getReceptionErrors()));
                    case 15:
                        volleyballPlayerEventStatistics.getClass();
                        return Boolean.valueOf(volleyballPlayerEventStatistics.getReceptionErrors() != null);
                    case 16:
                        volleyballPlayerEventStatistics.getClass();
                        String o2 = yid.o(volleyballPlayerEventStatistics.getReceptionPositivity(), 1);
                        return o2 == null ? "-" : o2;
                    case 17:
                        volleyballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    case 18:
                        volleyballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.k(volleyballPlayerEventStatistics.getReceptionPositivity()));
                    case 19:
                        volleyballPlayerEventStatistics.getClass();
                        return Boolean.valueOf(volleyballPlayerEventStatistics.getReceptionPositivity() != null);
                    case 20:
                        volleyballPlayerEventStatistics.getClass();
                        String o3 = yid.o(volleyballPlayerEventStatistics.getReceptionPerf(), 1);
                        return o3 == null ? "-" : o3;
                    case 21:
                        volleyballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(volleyballPlayerEventStatistics.getAttackPoints()));
                    case 22:
                        volleyballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.k(volleyballPlayerEventStatistics.getReceptionPerf()));
                    case 23:
                        volleyballPlayerEventStatistics.getClass();
                        return Boolean.valueOf(volleyballPlayerEventStatistics.getReceptionPerf() != null);
                    case 24:
                        volleyballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(volleyballPlayerEventStatistics.getAttacksTotal()));
                    case 25:
                        volleyballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(volleyballPlayerEventStatistics.getAttacksTotal()));
                    case 26:
                        volleyballPlayerEventStatistics.getClass();
                        return Boolean.valueOf(volleyballPlayerEventStatistics.getAttacksTotal() != null);
                    case 27:
                        volleyballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(volleyballPlayerEventStatistics.getAttackErrors()));
                    case 28:
                        volleyballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(volleyballPlayerEventStatistics.getPointsTotal()));
                    default:
                        volleyballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(volleyballPlayerEventStatistics.getAttackErrors()));
                }
            }
        }, true);
        t = pwkVar14;
        final int i27 = 24;
        final int i28 = 25;
        final int i29 = 26;
        pwk pwkVar15 = new pwk(14, R.string.total_stats_short, R.string.total, "TotalAttacks", new Function1() { // from class: nwk
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                VolleyballPlayerEventStatistics volleyballPlayerEventStatistics = (VolleyballPlayerEventStatistics) obj;
                switch (i27) {
                    case 0:
                        volleyballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(volleyballPlayerEventStatistics.getBlockPoints()));
                    case 1:
                        volleyballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    case 2:
                        volleyballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(volleyballPlayerEventStatistics.getServes()));
                    case 3:
                        volleyballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(volleyballPlayerEventStatistics.getServes()));
                    case 4:
                        volleyballPlayerEventStatistics.getClass();
                        return Boolean.valueOf(volleyballPlayerEventStatistics.getServes() != null);
                    case 5:
                        volleyballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(volleyballPlayerEventStatistics.getServeErrors()));
                    case 6:
                        volleyballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(volleyballPlayerEventStatistics.getBlockPoints()));
                    case 7:
                        volleyballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(volleyballPlayerEventStatistics.getServeErrors()));
                    case 8:
                        volleyballPlayerEventStatistics.getClass();
                        return Boolean.valueOf(volleyballPlayerEventStatistics.getServeErrors() != null);
                    case 9:
                        volleyballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    case 10:
                        volleyballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(volleyballPlayerEventStatistics.getReceptionsTotal()));
                    case 11:
                        volleyballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(volleyballPlayerEventStatistics.getReceptionsTotal()));
                    case 12:
                        volleyballPlayerEventStatistics.getClass();
                        return Boolean.valueOf(volleyballPlayerEventStatistics.getReceptionsTotal() != null);
                    case 13:
                        volleyballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(volleyballPlayerEventStatistics.getReceptionErrors()));
                    case 14:
                        volleyballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(volleyballPlayerEventStatistics.getReceptionErrors()));
                    case 15:
                        volleyballPlayerEventStatistics.getClass();
                        return Boolean.valueOf(volleyballPlayerEventStatistics.getReceptionErrors() != null);
                    case 16:
                        volleyballPlayerEventStatistics.getClass();
                        String o2 = yid.o(volleyballPlayerEventStatistics.getReceptionPositivity(), 1);
                        return o2 == null ? "-" : o2;
                    case 17:
                        volleyballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    case 18:
                        volleyballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.k(volleyballPlayerEventStatistics.getReceptionPositivity()));
                    case 19:
                        volleyballPlayerEventStatistics.getClass();
                        return Boolean.valueOf(volleyballPlayerEventStatistics.getReceptionPositivity() != null);
                    case 20:
                        volleyballPlayerEventStatistics.getClass();
                        String o3 = yid.o(volleyballPlayerEventStatistics.getReceptionPerf(), 1);
                        return o3 == null ? "-" : o3;
                    case 21:
                        volleyballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(volleyballPlayerEventStatistics.getAttackPoints()));
                    case 22:
                        volleyballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.k(volleyballPlayerEventStatistics.getReceptionPerf()));
                    case 23:
                        volleyballPlayerEventStatistics.getClass();
                        return Boolean.valueOf(volleyballPlayerEventStatistics.getReceptionPerf() != null);
                    case 24:
                        volleyballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(volleyballPlayerEventStatistics.getAttacksTotal()));
                    case 25:
                        volleyballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(volleyballPlayerEventStatistics.getAttacksTotal()));
                    case 26:
                        volleyballPlayerEventStatistics.getClass();
                        return Boolean.valueOf(volleyballPlayerEventStatistics.getAttacksTotal() != null);
                    case 27:
                        volleyballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(volleyballPlayerEventStatistics.getAttackErrors()));
                    case 28:
                        volleyballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(volleyballPlayerEventStatistics.getPointsTotal()));
                    default:
                        volleyballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(volleyballPlayerEventStatistics.getAttackErrors()));
                }
            }
        }, new Function1() { // from class: nwk
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                VolleyballPlayerEventStatistics volleyballPlayerEventStatistics = (VolleyballPlayerEventStatistics) obj;
                switch (i28) {
                    case 0:
                        volleyballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(volleyballPlayerEventStatistics.getBlockPoints()));
                    case 1:
                        volleyballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    case 2:
                        volleyballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(volleyballPlayerEventStatistics.getServes()));
                    case 3:
                        volleyballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(volleyballPlayerEventStatistics.getServes()));
                    case 4:
                        volleyballPlayerEventStatistics.getClass();
                        return Boolean.valueOf(volleyballPlayerEventStatistics.getServes() != null);
                    case 5:
                        volleyballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(volleyballPlayerEventStatistics.getServeErrors()));
                    case 6:
                        volleyballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(volleyballPlayerEventStatistics.getBlockPoints()));
                    case 7:
                        volleyballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(volleyballPlayerEventStatistics.getServeErrors()));
                    case 8:
                        volleyballPlayerEventStatistics.getClass();
                        return Boolean.valueOf(volleyballPlayerEventStatistics.getServeErrors() != null);
                    case 9:
                        volleyballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    case 10:
                        volleyballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(volleyballPlayerEventStatistics.getReceptionsTotal()));
                    case 11:
                        volleyballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(volleyballPlayerEventStatistics.getReceptionsTotal()));
                    case 12:
                        volleyballPlayerEventStatistics.getClass();
                        return Boolean.valueOf(volleyballPlayerEventStatistics.getReceptionsTotal() != null);
                    case 13:
                        volleyballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(volleyballPlayerEventStatistics.getReceptionErrors()));
                    case 14:
                        volleyballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(volleyballPlayerEventStatistics.getReceptionErrors()));
                    case 15:
                        volleyballPlayerEventStatistics.getClass();
                        return Boolean.valueOf(volleyballPlayerEventStatistics.getReceptionErrors() != null);
                    case 16:
                        volleyballPlayerEventStatistics.getClass();
                        String o2 = yid.o(volleyballPlayerEventStatistics.getReceptionPositivity(), 1);
                        return o2 == null ? "-" : o2;
                    case 17:
                        volleyballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    case 18:
                        volleyballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.k(volleyballPlayerEventStatistics.getReceptionPositivity()));
                    case 19:
                        volleyballPlayerEventStatistics.getClass();
                        return Boolean.valueOf(volleyballPlayerEventStatistics.getReceptionPositivity() != null);
                    case 20:
                        volleyballPlayerEventStatistics.getClass();
                        String o3 = yid.o(volleyballPlayerEventStatistics.getReceptionPerf(), 1);
                        return o3 == null ? "-" : o3;
                    case 21:
                        volleyballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(volleyballPlayerEventStatistics.getAttackPoints()));
                    case 22:
                        volleyballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.k(volleyballPlayerEventStatistics.getReceptionPerf()));
                    case 23:
                        volleyballPlayerEventStatistics.getClass();
                        return Boolean.valueOf(volleyballPlayerEventStatistics.getReceptionPerf() != null);
                    case 24:
                        volleyballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(volleyballPlayerEventStatistics.getAttacksTotal()));
                    case 25:
                        volleyballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(volleyballPlayerEventStatistics.getAttacksTotal()));
                    case 26:
                        volleyballPlayerEventStatistics.getClass();
                        return Boolean.valueOf(volleyballPlayerEventStatistics.getAttacksTotal() != null);
                    case 27:
                        volleyballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(volleyballPlayerEventStatistics.getAttackErrors()));
                    case 28:
                        volleyballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(volleyballPlayerEventStatistics.getPointsTotal()));
                    default:
                        volleyballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(volleyballPlayerEventStatistics.getAttackErrors()));
                }
            }
        }, new Function1() { // from class: nwk
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                VolleyballPlayerEventStatistics volleyballPlayerEventStatistics = (VolleyballPlayerEventStatistics) obj;
                switch (i29) {
                    case 0:
                        volleyballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(volleyballPlayerEventStatistics.getBlockPoints()));
                    case 1:
                        volleyballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    case 2:
                        volleyballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(volleyballPlayerEventStatistics.getServes()));
                    case 3:
                        volleyballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(volleyballPlayerEventStatistics.getServes()));
                    case 4:
                        volleyballPlayerEventStatistics.getClass();
                        return Boolean.valueOf(volleyballPlayerEventStatistics.getServes() != null);
                    case 5:
                        volleyballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(volleyballPlayerEventStatistics.getServeErrors()));
                    case 6:
                        volleyballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(volleyballPlayerEventStatistics.getBlockPoints()));
                    case 7:
                        volleyballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(volleyballPlayerEventStatistics.getServeErrors()));
                    case 8:
                        volleyballPlayerEventStatistics.getClass();
                        return Boolean.valueOf(volleyballPlayerEventStatistics.getServeErrors() != null);
                    case 9:
                        volleyballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    case 10:
                        volleyballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(volleyballPlayerEventStatistics.getReceptionsTotal()));
                    case 11:
                        volleyballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(volleyballPlayerEventStatistics.getReceptionsTotal()));
                    case 12:
                        volleyballPlayerEventStatistics.getClass();
                        return Boolean.valueOf(volleyballPlayerEventStatistics.getReceptionsTotal() != null);
                    case 13:
                        volleyballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(volleyballPlayerEventStatistics.getReceptionErrors()));
                    case 14:
                        volleyballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(volleyballPlayerEventStatistics.getReceptionErrors()));
                    case 15:
                        volleyballPlayerEventStatistics.getClass();
                        return Boolean.valueOf(volleyballPlayerEventStatistics.getReceptionErrors() != null);
                    case 16:
                        volleyballPlayerEventStatistics.getClass();
                        String o2 = yid.o(volleyballPlayerEventStatistics.getReceptionPositivity(), 1);
                        return o2 == null ? "-" : o2;
                    case 17:
                        volleyballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    case 18:
                        volleyballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.k(volleyballPlayerEventStatistics.getReceptionPositivity()));
                    case 19:
                        volleyballPlayerEventStatistics.getClass();
                        return Boolean.valueOf(volleyballPlayerEventStatistics.getReceptionPositivity() != null);
                    case 20:
                        volleyballPlayerEventStatistics.getClass();
                        String o3 = yid.o(volleyballPlayerEventStatistics.getReceptionPerf(), 1);
                        return o3 == null ? "-" : o3;
                    case 21:
                        volleyballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(volleyballPlayerEventStatistics.getAttackPoints()));
                    case 22:
                        volleyballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.k(volleyballPlayerEventStatistics.getReceptionPerf()));
                    case 23:
                        volleyballPlayerEventStatistics.getClass();
                        return Boolean.valueOf(volleyballPlayerEventStatistics.getReceptionPerf() != null);
                    case 24:
                        volleyballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(volleyballPlayerEventStatistics.getAttacksTotal()));
                    case 25:
                        volleyballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(volleyballPlayerEventStatistics.getAttacksTotal()));
                    case 26:
                        volleyballPlayerEventStatistics.getClass();
                        return Boolean.valueOf(volleyballPlayerEventStatistics.getAttacksTotal() != null);
                    case 27:
                        volleyballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(volleyballPlayerEventStatistics.getAttackErrors()));
                    case 28:
                        volleyballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(volleyballPlayerEventStatistics.getPointsTotal()));
                    default:
                        volleyballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(volleyballPlayerEventStatistics.getAttackErrors()));
                }
            }
        }, true);
        u = pwkVar15;
        final int i30 = 27;
        final int i31 = 29;
        pwk pwkVar16 = new pwk(15, R.string.volleyball_errors_short, R.string.volleyball_errors, "AttackErrors", new Function1() { // from class: nwk
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                VolleyballPlayerEventStatistics volleyballPlayerEventStatistics = (VolleyballPlayerEventStatistics) obj;
                switch (i30) {
                    case 0:
                        volleyballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(volleyballPlayerEventStatistics.getBlockPoints()));
                    case 1:
                        volleyballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    case 2:
                        volleyballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(volleyballPlayerEventStatistics.getServes()));
                    case 3:
                        volleyballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(volleyballPlayerEventStatistics.getServes()));
                    case 4:
                        volleyballPlayerEventStatistics.getClass();
                        return Boolean.valueOf(volleyballPlayerEventStatistics.getServes() != null);
                    case 5:
                        volleyballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(volleyballPlayerEventStatistics.getServeErrors()));
                    case 6:
                        volleyballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(volleyballPlayerEventStatistics.getBlockPoints()));
                    case 7:
                        volleyballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(volleyballPlayerEventStatistics.getServeErrors()));
                    case 8:
                        volleyballPlayerEventStatistics.getClass();
                        return Boolean.valueOf(volleyballPlayerEventStatistics.getServeErrors() != null);
                    case 9:
                        volleyballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    case 10:
                        volleyballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(volleyballPlayerEventStatistics.getReceptionsTotal()));
                    case 11:
                        volleyballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(volleyballPlayerEventStatistics.getReceptionsTotal()));
                    case 12:
                        volleyballPlayerEventStatistics.getClass();
                        return Boolean.valueOf(volleyballPlayerEventStatistics.getReceptionsTotal() != null);
                    case 13:
                        volleyballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(volleyballPlayerEventStatistics.getReceptionErrors()));
                    case 14:
                        volleyballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(volleyballPlayerEventStatistics.getReceptionErrors()));
                    case 15:
                        volleyballPlayerEventStatistics.getClass();
                        return Boolean.valueOf(volleyballPlayerEventStatistics.getReceptionErrors() != null);
                    case 16:
                        volleyballPlayerEventStatistics.getClass();
                        String o2 = yid.o(volleyballPlayerEventStatistics.getReceptionPositivity(), 1);
                        return o2 == null ? "-" : o2;
                    case 17:
                        volleyballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    case 18:
                        volleyballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.k(volleyballPlayerEventStatistics.getReceptionPositivity()));
                    case 19:
                        volleyballPlayerEventStatistics.getClass();
                        return Boolean.valueOf(volleyballPlayerEventStatistics.getReceptionPositivity() != null);
                    case 20:
                        volleyballPlayerEventStatistics.getClass();
                        String o3 = yid.o(volleyballPlayerEventStatistics.getReceptionPerf(), 1);
                        return o3 == null ? "-" : o3;
                    case 21:
                        volleyballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(volleyballPlayerEventStatistics.getAttackPoints()));
                    case 22:
                        volleyballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.k(volleyballPlayerEventStatistics.getReceptionPerf()));
                    case 23:
                        volleyballPlayerEventStatistics.getClass();
                        return Boolean.valueOf(volleyballPlayerEventStatistics.getReceptionPerf() != null);
                    case 24:
                        volleyballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(volleyballPlayerEventStatistics.getAttacksTotal()));
                    case 25:
                        volleyballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(volleyballPlayerEventStatistics.getAttacksTotal()));
                    case 26:
                        volleyballPlayerEventStatistics.getClass();
                        return Boolean.valueOf(volleyballPlayerEventStatistics.getAttacksTotal() != null);
                    case 27:
                        volleyballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(volleyballPlayerEventStatistics.getAttackErrors()));
                    case 28:
                        volleyballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(volleyballPlayerEventStatistics.getPointsTotal()));
                    default:
                        volleyballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(volleyballPlayerEventStatistics.getAttackErrors()));
                }
            }
        }, new Function1() { // from class: nwk
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                VolleyballPlayerEventStatistics volleyballPlayerEventStatistics = (VolleyballPlayerEventStatistics) obj;
                switch (i31) {
                    case 0:
                        volleyballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(volleyballPlayerEventStatistics.getBlockPoints()));
                    case 1:
                        volleyballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    case 2:
                        volleyballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(volleyballPlayerEventStatistics.getServes()));
                    case 3:
                        volleyballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(volleyballPlayerEventStatistics.getServes()));
                    case 4:
                        volleyballPlayerEventStatistics.getClass();
                        return Boolean.valueOf(volleyballPlayerEventStatistics.getServes() != null);
                    case 5:
                        volleyballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(volleyballPlayerEventStatistics.getServeErrors()));
                    case 6:
                        volleyballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(volleyballPlayerEventStatistics.getBlockPoints()));
                    case 7:
                        volleyballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(volleyballPlayerEventStatistics.getServeErrors()));
                    case 8:
                        volleyballPlayerEventStatistics.getClass();
                        return Boolean.valueOf(volleyballPlayerEventStatistics.getServeErrors() != null);
                    case 9:
                        volleyballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    case 10:
                        volleyballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(volleyballPlayerEventStatistics.getReceptionsTotal()));
                    case 11:
                        volleyballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(volleyballPlayerEventStatistics.getReceptionsTotal()));
                    case 12:
                        volleyballPlayerEventStatistics.getClass();
                        return Boolean.valueOf(volleyballPlayerEventStatistics.getReceptionsTotal() != null);
                    case 13:
                        volleyballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(volleyballPlayerEventStatistics.getReceptionErrors()));
                    case 14:
                        volleyballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(volleyballPlayerEventStatistics.getReceptionErrors()));
                    case 15:
                        volleyballPlayerEventStatistics.getClass();
                        return Boolean.valueOf(volleyballPlayerEventStatistics.getReceptionErrors() != null);
                    case 16:
                        volleyballPlayerEventStatistics.getClass();
                        String o2 = yid.o(volleyballPlayerEventStatistics.getReceptionPositivity(), 1);
                        return o2 == null ? "-" : o2;
                    case 17:
                        volleyballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    case 18:
                        volleyballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.k(volleyballPlayerEventStatistics.getReceptionPositivity()));
                    case 19:
                        volleyballPlayerEventStatistics.getClass();
                        return Boolean.valueOf(volleyballPlayerEventStatistics.getReceptionPositivity() != null);
                    case 20:
                        volleyballPlayerEventStatistics.getClass();
                        String o3 = yid.o(volleyballPlayerEventStatistics.getReceptionPerf(), 1);
                        return o3 == null ? "-" : o3;
                    case 21:
                        volleyballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(volleyballPlayerEventStatistics.getAttackPoints()));
                    case 22:
                        volleyballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.k(volleyballPlayerEventStatistics.getReceptionPerf()));
                    case 23:
                        volleyballPlayerEventStatistics.getClass();
                        return Boolean.valueOf(volleyballPlayerEventStatistics.getReceptionPerf() != null);
                    case 24:
                        volleyballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(volleyballPlayerEventStatistics.getAttacksTotal()));
                    case 25:
                        volleyballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(volleyballPlayerEventStatistics.getAttacksTotal()));
                    case 26:
                        volleyballPlayerEventStatistics.getClass();
                        return Boolean.valueOf(volleyballPlayerEventStatistics.getAttacksTotal() != null);
                    case 27:
                        volleyballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(volleyballPlayerEventStatistics.getAttackErrors()));
                    case 28:
                        volleyballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(volleyballPlayerEventStatistics.getPointsTotal()));
                    default:
                        volleyballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(volleyballPlayerEventStatistics.getAttackErrors()));
                }
            }
        }, new owk(0), true);
        v = pwkVar16;
        pwk pwkVar17 = new pwk(16, R.string.volleyball_blocked_attacks_short, R.string.volleyball_blocked_attacks, "BlockedAttacks", new owk(1), new owk(2), new owk(4), true);
        w = pwkVar17;
        pwk pwkVar18 = new pwk(17, R.string.volleyball_points_short, R.string.volleyball_points, "AttackPoints", new owk(5), new owk(6), new owk(7), true);
        x = pwkVar18;
        pwk pwkVar19 = new pwk(18, R.string.volleyball_points_percentage_short, R.string.volleyball_points_percentage, "AttackPercentage", new owk(8), new owk(10), new owk(11), true);
        y = pwkVar19;
        z = new pwk[]{pwkVar, pwkVar2, pwkVar3, pwkVar4, pwkVar5, pwkVar6, pwkVar7, pwkVar8, pwkVar9, pwkVar10, pwkVar11, pwkVar12, pwkVar13, pwkVar14, pwkVar15, pwkVar16, pwkVar17, pwkVar18, pwkVar19};
    }

    public pwk(int i2, int i3, int i4, String str, Function1 function1, Function1 function12, Function1 function13, boolean z2) {
        this.a = i3;
        this.b = i4;
        this.c = z2;
        this.d = function1;
        this.e = function12;
        this.f = function13;
    }

    public static pwk valueOf(String str) {
        return (pwk) Enum.valueOf(pwk.class, str);
    }

    public static pwk[] values() {
        return (pwk[]) z.clone();
    }

    @Override // defpackage.e1
    public final Function1 d() {
        return this.d;
    }

    @Override // defpackage.e1
    public final int g() {
        return this.a;
    }

    @Override // defpackage.e1
    public final Function1 h() {
        return this.e;
    }

    @Override // defpackage.e1
    public final boolean i() {
        return false;
    }

    @Override // defpackage.e1
    public final boolean j() {
        return this.c;
    }

    @Override // defpackage.e1
    public final boolean k() {
        return false;
    }

    @Override // defpackage.e1
    public final int l() {
        return this.b;
    }

    @Override // defpackage.e1
    public final Function1 m() {
        return this.f;
    }
}
