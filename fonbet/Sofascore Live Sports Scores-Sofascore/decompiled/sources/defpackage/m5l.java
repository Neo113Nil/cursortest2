package defpackage;

import com.sofascore.results.R;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class m5l {
    public static final m5l c;
    public static final /* synthetic */ m5l[] d;
    public static final /* synthetic */ kp5 e;
    public final int a;
    public final String b;

    static {
        m5l m5lVar = new m5l("UPCOMING", 0, R.string.weekly_challenge_list_active, "MyActivePredictionsTab");
        m5l m5lVar2 = new m5l("FINISHED", 1, R.string.weekly_challenge_list_finished, "MyFinishedPredictionsTab");
        c = m5lVar2;
        m5l[] m5lVarArr = {m5lVar, m5lVar2};
        d = m5lVarArr;
        e = new kp5(m5lVarArr);
    }

    public m5l(String str, int i, int i2, String str2) {
        this.a = i2;
        this.b = str2;
    }

    public static m5l valueOf(String str) {
        return (m5l) Enum.valueOf(m5l.class, str);
    }

    public static m5l[] values() {
        return (m5l[]) d.clone();
    }
}
