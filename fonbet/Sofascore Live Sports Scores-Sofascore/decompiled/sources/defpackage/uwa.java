package defpackage;

import com.sofascore.model.network.response.SearchResponseKt;
import com.sofascore.model.newNetwork.TeamOfTheWeekRoundsResponseKt;
import com.sofascore.results.R;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class uwa {
    public static final uwa c;
    public static final uwa d;
    public static final uwa e;
    public static final uwa f;
    public static final /* synthetic */ uwa[] g;
    public static final /* synthetic */ kp5 h;
    public final String a;
    public final int b;

    static {
        uwa uwaVar = new uwa("DATE", 0, "date", R.string.chip_by_date);
        c = uwaVar;
        uwa uwaVar2 = new uwa("ROUND", 1, TeamOfTheWeekRoundsResponseKt.TOTW_ROUND, R.string.chip_by_round);
        d = uwaVar2;
        uwa uwaVar3 = new uwa("GROUP", 2, "group", R.string.chip_by_group);
        e = uwaVar3;
        uwa uwaVar4 = new uwa("TEAM", 3, "team", R.string.chip_by_team);
        uwa uwaVar5 = new uwa("PLAYER", 4, SearchResponseKt.PLAYER_ENTITY, R.string.chip_by_player);
        uwa uwaVar6 = new uwa("COURT", 5, "court", R.string.chip_by_tennis_court);
        f = uwaVar6;
        uwa[] uwaVarArr = {uwaVar, uwaVar2, uwaVar3, uwaVar4, uwaVar5, uwaVar6};
        g = uwaVarArr;
        h = new kp5(uwaVarArr);
    }

    public uwa(String str, int i, String str2, int i2) {
        this.a = str2;
        this.b = i2;
    }

    public static uwa valueOf(String str) {
        return (uwa) Enum.valueOf(uwa.class, str);
    }

    public static uwa[] values() {
        return (uwa[]) g.clone();
    }
}
