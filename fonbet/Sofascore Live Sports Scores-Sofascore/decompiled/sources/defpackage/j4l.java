package defpackage;

import com.sofascore.results.R;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class j4l {
    public static final j4l b;
    public static final /* synthetic */ j4l[] c;
    public static final /* synthetic */ kp5 d;
    public final int a;

    static {
        j4l j4lVar = new j4l("PREVIOUS_WEEK", 0, R.string.weekly_challenge_previous_week);
        j4l j4lVar2 = new j4l("CURRENT_WEEK", 1, R.string.weekly_challenge_current_week_tab);
        b = j4lVar2;
        j4l[] j4lVarArr = {j4lVar, j4lVar2, new j4l("STATISTICS", 2, R.string.statistics)};
        c = j4lVarArr;
        d = new kp5(j4lVarArr);
    }

    public j4l(String str, int i, int i2) {
        this.a = i2;
    }

    public static j4l valueOf(String str) {
        return (j4l) Enum.valueOf(j4l.class, str);
    }

    public static j4l[] values() {
        return (j4l[]) c.clone();
    }
}
