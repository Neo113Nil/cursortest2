package defpackage;

import com.sofascore.results.R;
import kotlin.jvm.functions.Function1;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'e' uses external variables
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
public final class w9b {
    public static final w9b e;
    public static final w9b f;
    public static final w9b g;
    public static final w9b h;
    public static final w9b i;
    public static final w9b j;
    public static final w9b k;
    public static final w9b l;
    public static final w9b m;
    public static final w9b n;
    public static final w9b o;
    public static final /* synthetic */ w9b[] p;
    public final int a;
    public final int b;
    public final Function1 c;
    public final Function1 d;

    static {
        isa isaVar = new isa(26);
        cab cabVar = cab.a;
        w9b w9bVar = new w9b(0, R.string.football_expected_goals_short, R.string.football_expected_goals_short, "XG", isaVar, new v9b(1, cabVar, cab.class, "formatAsDouble", "formatAsDouble(Ljava/lang/Number;)Ljava/lang/String;", 0, 6));
        e = w9bVar;
        w9b w9bVar2 = new w9b(1, R.string.football_expected_goals_on_target_short, R.string.football_expected_goals_on_target_short, "XGOT", new isa(29), new v9b(1, cabVar, cab.class, "formatAsDouble", "formatAsDouble(Ljava/lang/Number;)Ljava/lang/String;", 0, 7));
        f = w9bVar2;
        w9b w9bVar3 = new w9b(2, R.string.football_total_shots, R.string.football_total_shots_short, "TotalShots", new u9b(0), new v9b(1, cabVar, cab.class, "formatAsInt", "formatAsInt(Ljava/lang/Number;)Ljava/lang/String;", 0, 8));
        g = w9bVar3;
        w9b w9bVar4 = new w9b(3, R.string.football_shots_on_goal, R.string.football_shots_on_target_short, "ShotsOnTarget", new u9b(1), new v9b(1, cabVar, cab.class, "formatAsInt", "formatAsInt(Ljava/lang/Number;)Ljava/lang/String;", 0, 9));
        h = w9bVar4;
        w9b w9bVar5 = new w9b(4, R.string.football_expected_assists_short, R.string.football_expected_assists_short, "XA", new u9b(2), new s26(1, cabVar, cab.class, "formatAsDouble", "formatAsDouble(Ljava/lang/Number;)Ljava/lang/String;", 0, 29));
        i = w9bVar5;
        w9b w9bVar6 = new w9b(5, R.string.football_accurate_passes, R.string.football_accurate_passes_short, "AccuratePasses", new u9b(3), new v9b(1, cabVar, cab.class, "formatAsInt", "formatAsInt(Ljava/lang/Number;)Ljava/lang/String;", 0, 0));
        j = w9bVar6;
        w9b w9bVar7 = new w9b(6, R.string.football_key_passes, R.string.football_key_passes_short, "KeyPasses", new u9b(4), new v9b(1, cabVar, cab.class, "formatAsInt", "formatAsInt(Ljava/lang/Number;)Ljava/lang/String;", 0, 1));
        k = w9bVar7;
        w9b w9bVar8 = new w9b(7, R.string.football_successful_dribbles, R.string.football_successful_dribbles_short, "Dribbles", new u9b(5), new v9b(1, cabVar, cab.class, "formatAsInt", "formatAsInt(Ljava/lang/Number;)Ljava/lang/String;", 0, 2));
        l = w9bVar8;
        w9b w9bVar9 = new w9b(8, R.string.football_touches, R.string.football_touches_short, "Touches", new u9b(6), new v9b(1, cabVar, cab.class, "formatAsInt", "formatAsInt(Ljava/lang/Number;)Ljava/lang/String;", 0, 3));
        m = w9bVar9;
        w9b w9bVar10 = new w9b(9, R.string.football_defensive_contributions, R.string.football_defensive_contributions_short, "DefensiveContributions", new isa(27), new v9b(1, cabVar, cab.class, "formatAsInt", "formatAsInt(Ljava/lang/Number;)Ljava/lang/String;", 0, 4));
        n = w9bVar10;
        w9b w9bVar11 = new w9b(10, R.string.football_duels_won, R.string.football_duels_won_short, "DuelsWon", new isa(28), new v9b(1, cabVar, cab.class, "formatAsInt", "formatAsInt(Ljava/lang/Number;)Ljava/lang/String;", 0, 5));
        o = w9bVar11;
        p = new w9b[]{w9bVar, w9bVar2, w9bVar3, w9bVar4, w9bVar5, w9bVar6, w9bVar7, w9bVar8, w9bVar9, w9bVar10, w9bVar11};
    }

    public w9b(int i2, int i3, int i4, String str, Function1 function1, Function1 function12) {
        this.a = i3;
        this.b = i4;
        this.c = function1;
        this.d = function12;
    }

    public static w9b valueOf(String str) {
        return (w9b) Enum.valueOf(w9b.class, str);
    }

    public static w9b[] values() {
        return (w9b[]) p.clone();
    }
}
