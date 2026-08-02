package defpackage;

import com.sofascore.model.mvvm.model.Season;
import com.sofascore.results.R;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class hwg {
    public static final hwg c;
    public static final hwg d;
    public static final hwg e;
    public static final hwg f;
    public static final /* synthetic */ hwg[] g;
    public static final /* synthetic */ kp5 h;
    public final String a;
    public final int b;

    static {
        hwg hwgVar = new hwg("ALL", 0, Season.YEAR_ALL_TIME, R.string.all);
        c = hwgVar;
        hwg hwgVar2 = new hwg("TEAM", 1, "teams", R.string.search_filter_team);
        d = hwgVar2;
        hwg hwgVar3 = new hwg("PLAYER", 2, "player-team-persons", R.string.search_filter_player);
        e = hwgVar3;
        hwg hwgVar4 = new hwg("MATCH", 3, "events", R.string.search_filter_match);
        hwg hwgVar5 = new hwg("TOURNAMENT", 4, "unique-tournaments", R.string.search_filter_competition);
        f = hwgVar5;
        hwg[] hwgVarArr = {hwgVar, hwgVar2, hwgVar3, hwgVar4, hwgVar5};
        g = hwgVarArr;
        h = new kp5(hwgVarArr);
    }

    public hwg(String str, int i, String str2, int i2) {
        this.a = str2;
        this.b = i2;
    }

    public static hwg valueOf(String str) {
        return (hwg) Enum.valueOf(hwg.class, str);
    }

    public static hwg[] values() {
        return (hwg[]) g.clone();
    }
}
