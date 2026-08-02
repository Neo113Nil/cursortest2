package defpackage;

import com.sofascore.results.R;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class l04 {
    public static final /* synthetic */ l04[] c;
    public static final /* synthetic */ kp5 d;
    public final int a;
    public final int b;

    static {
        l04[] l04VarArr = {new l04("NO_RUNS", 0, R.string.cricket_no_runs, R.color.cricket_neutral), new l04("SINGLE_RUNS", 1, R.string.cricket_runs, R.color.cricket_single_runs), new l04("FOUR_RUNS", 2, R.string.cricket_fours_short, R.color.cricket_4s), new l04("SIX_RUNS", 3, R.string.cricket_sixes_short, R.color.cricket_6s), new l04("WICKET", 4, R.string.cricket_fall_of_wicket, R.color.cricket_wickets), new l04("ERRORS", 5, R.string.cricket_bowlers_errors, R.color.cricket_errors), new l04("DRS", 6, R.string.cricket_decision_review_system, R.color.cricket_drs)};
        c = l04VarArr;
        d = new kp5(l04VarArr);
    }

    public l04(String str, int i, int i2, int i3) {
        this.a = i2;
        this.b = i3;
    }

    public static l04 valueOf(String str) {
        return (l04) Enum.valueOf(l04.class, str);
    }

    public static l04[] values() {
        return (l04[]) c.clone();
    }
}
