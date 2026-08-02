package defpackage;

import com.sofascore.results.R;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class y3f {
    public static final x3f d;
    public static final y3f e;
    public static final y3f f;
    public static final y3f g;
    public static final /* synthetic */ y3f[] h;
    public static final /* synthetic */ kp5 i;
    public final String a;
    public final String b;
    public final int c;

    static {
        y3f y3fVar = new y3f(0, R.string.who_will_win, "WHO_WILL_WIN", "Full time", "who_will_win", 1);
        e = y3fVar;
        y3f y3fVar2 = new y3f(1, R.string.will_both_teams_score_title, "WILL_BOTH_TEAMS_SCORE", "Both teams to score", "will_both_teams_score", 2);
        f = y3fVar2;
        y3f y3fVar3 = new y3f(2, R.string.who_will_score_first_title, "FIRST_TEAM_TO_SCORE", "First team to score", "first_team_to_score", 3);
        g = y3fVar3;
        y3f[] y3fVarArr = {y3fVar, y3fVar2, y3fVar3};
        h = y3fVarArr;
        i = new kp5(y3fVarArr);
        d = new x3f(0);
    }

    public y3f(int i2, int i3, String str, String str2, String str3, int i4) {
        this.a = str2;
        this.b = str3;
        this.c = i4;
    }

    public static y3f valueOf(String str) {
        return (y3f) Enum.valueOf(y3f.class, str);
    }

    public static y3f[] values() {
        return (y3f[]) h.clone();
    }
}
