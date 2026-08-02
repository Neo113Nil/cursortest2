package defpackage;

import com.sofascore.results.R;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class gz3 {
    public static final /* synthetic */ gz3[] c;
    public static final /* synthetic */ kp5 d;
    public final int a;
    public final int b;

    static {
        gz3[] gz3VarArr = {new gz3("BATTING", 0, R.string.cricket_batting, R.drawable.ic_cricket_bat), new gz3("BOWLING", 1, R.string.cricket_bowling, R.drawable.ic_cricket_ball)};
        c = gz3VarArr;
        d = new kp5(gz3VarArr);
    }

    public gz3(String str, int i, int i2, int i3) {
        this.a = i2;
        this.b = i3;
    }

    public static gz3 valueOf(String str) {
        return (gz3) Enum.valueOf(gz3.class, str);
    }

    public static gz3[] values() {
        return (gz3[]) c.clone();
    }
}
