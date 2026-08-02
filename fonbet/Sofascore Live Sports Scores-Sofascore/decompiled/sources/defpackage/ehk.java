package defpackage;

import com.sofascore.results.R;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class ehk {
    public static final x3f e;
    public static final ehk f;
    public static final /* synthetic */ ehk[] g;
    public static final /* synthetic */ kp5 h;
    public final int a;
    public final int b;
    public final int c;
    public final String d;

    static {
        ehk ehkVar = new ehk("QUICK_CHECK_CHAMP", "quickCheckChamp", 0, R.string.season_25_fan_type_quick_check_champ, R.string.season_25_fan_type_quick_check_champ_description, R.drawable.ic_quick_check_champ);
        ehk ehkVar2 = new ehk("MATCHDAY_MANIAC", "matchdayManiac", 1, R.string.season_25_fan_type_matchday_maniac, R.string.season_25_fan_type_matchday_maniac_description, R.drawable.ic_matchday_maniac);
        ehk ehkVar3 = new ehk("HIGHLIGHTS_HERO", "highlightsHero", 2, R.string.season_25_fan_type_highlights_hero, R.string.season_25_fan_type_highlights_hero_description, R.drawable.ic_highlights_hero);
        ehk ehkVar4 = new ehk("BIG_GAME_HUNTER", "bigGameHunter", 3, R.string.season_25_fan_type_big_game_hunter, R.string.season_25_fan_type_big_game_hunter_description, R.drawable.ic_big_game_hunter);
        ehk ehkVar5 = new ehk("CONSISTENCY_KING", "consistencyKing", 4, R.string.season_25_fan_type_consistency_king, R.string.season_25_fan_type_consistency_king_description, R.drawable.ic_consistency_king);
        f = ehkVar5;
        ehk[] ehkVarArr = {ehkVar, ehkVar2, ehkVar3, ehkVar4, ehkVar5, new ehk("FAITHFUL_FANATIC", "faithfulFanatic", 5, R.string.season_25_fan_type_faithful_fanatic, R.string.season_25_fan_type_faithful_fanatic_description, R.drawable.ic_faithful_fanatic), new ehk("HARDCORE_HOBBYIST", "hardcoreHobbyist", 6, R.string.season_25_fan_type_hardcore_hobbyist, R.string.season_25_fan_type_hardcore_hobbyist_description, R.drawable.ic_hardcore_hobbyist), new ehk("MASTER_OF_METRICS", "masterOfMetrics", 7, R.string.season_25_fan_type_master_of_metrics, R.string.season_25_fan_type_master_of_metrics_description, R.drawable.ic_master_of_metrics)};
        g = ehkVarArr;
        h = new kp5(ehkVarArr);
        e = new x3f(5);
    }

    public ehk(String str, String str2, int i, int i2, int i3, int i4) {
        this.a = i2;
        this.b = i3;
        this.c = i4;
        this.d = str2;
    }

    public static ehk valueOf(String str) {
        return (ehk) Enum.valueOf(ehk.class, str);
    }

    public static ehk[] values() {
        return (ehk[]) g.clone();
    }
}
