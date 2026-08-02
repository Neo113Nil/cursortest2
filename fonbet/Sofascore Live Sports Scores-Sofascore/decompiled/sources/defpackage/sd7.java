package defpackage;

import com.sofascore.results.R;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class sd7 {
    public static final wxf c;
    public static final sd7 d;
    public static final sd7 e;
    public static final /* synthetic */ sd7[] f;
    public static final /* synthetic */ kp5 g;
    public final String a;
    public final int b;

    static {
        sd7 sd7Var = new sd7("DOUBTFUL", 0, "doubtful", R.color.alert);
        d = sd7Var;
        sd7 sd7Var2 = new sd7("MISSING", 1, "missing", R.color.error);
        e = sd7Var2;
        sd7[] sd7VarArr = {sd7Var, sd7Var2};
        f = sd7VarArr;
        g = new kp5(sd7VarArr);
        c = new wxf(23);
    }

    public sd7(String str, int i, String str2, int i2) {
        this.a = str2;
        this.b = i2;
    }

    public static sd7 valueOf(String str) {
        return (sd7) Enum.valueOf(sd7.class, str);
    }

    public static sd7[] values() {
        return (sd7[]) f.clone();
    }
}
