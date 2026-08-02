package defpackage;

import com.sofascore.results.R;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class oue {
    public static final oue d;
    public static final oue e;
    public static final oue f;
    public static final /* synthetic */ oue[] g;
    public static final /* synthetic */ kp5 h;
    public final String a;
    public final int b;
    public final int c;

    static {
        oue oueVar = new oue("ALL", 0, "All", R.string.all, R.string.all);
        d = oueVar;
        oue oueVar2 = new oue("GOAL", 1, "Goal", R.string.football_goal, R.string.football_goals_conceded);
        e = oueVar2;
        oue oueVar3 = new oue("MISS", 2, "Missed", R.string.football_outcome_missed, R.string.football_outcome_missed);
        oue oueVar4 = new oue("ATTEMPT_SAVED", 3, "Attempt saved", R.string.football_outcome_saved, R.string.football_outcome_saved);
        f = oueVar4;
        oue[] oueVarArr = {oueVar, oueVar2, oueVar3, oueVar4};
        g = oueVarArr;
        h = new kp5(oueVarArr);
    }

    public oue(String str, int i, String str2, int i2, int i3) {
        this.a = str2;
        this.b = i2;
        this.c = i3;
    }

    public static oue valueOf(String str) {
        return (oue) Enum.valueOf(oue.class, str);
    }

    public static oue[] values() {
        return (oue[]) g.clone();
    }
}
