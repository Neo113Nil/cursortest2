package defpackage;

import com.sofascore.model.mvvm.model.Incident;
import com.sofascore.model.mvvm.model.Season;
import com.sofascore.results.R;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class he9 {
    public static final p4h f;
    public static final he9 g;
    public static final /* synthetic */ he9[] h;
    public static final /* synthetic */ kp5 i;
    public final int a;
    public final String b;
    public final int c;
    public final int d;
    public final Integer e;

    static {
        he9 he9Var = new he9(0, -1, R.string.hockey_all_shots, R.string.hockey_all_shots, null, "ALL", Season.YEAR_ALL_TIME);
        g = he9Var;
        he9[] he9VarArr = {he9Var, new he9(1, 1, R.string.goals, R.string.goals, Integer.valueOf(R.drawable.ic_shotmap_goal), "GOAL", "goal"), new he9(2, 2, R.string.hockey_saved_shots, R.string.hockey_shotmap_saved, Integer.valueOf(R.drawable.ic_shotmap_saved), "SAVED", "saved"), new he9(3, 3, R.string.hockey_blocked_shots, R.string.blocked, Integer.valueOf(R.drawable.ic_shotmap_blocked), "BLOCKED", "block"), new he9(4, 0, R.string.hockey_missed_shots, R.string.shotmap_missed, Integer.valueOf(R.drawable.ic_shotmap_missed), "MISSED", Incident.PenaltyShotIncident.PENALTY_SHOT_MISSED)};
        h = he9VarArr;
        i = new kp5(he9VarArr);
        f = new p4h(25);
    }

    public he9(int i2, int i3, int i4, int i5, Integer num, String str, String str2) {
        this.a = i3;
        this.b = str2;
        this.c = i4;
        this.d = i5;
        this.e = num;
    }

    public static he9 valueOf(String str) {
        return (he9) Enum.valueOf(he9.class, str);
    }

    public static he9[] values() {
        return (he9[]) h.clone();
    }
}
