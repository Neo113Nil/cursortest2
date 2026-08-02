package defpackage;

import com.fyber.inneractive.sdk.external.NativeAdContent;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class rd7 {
    public static final uxf b;
    public static final rd7 c;
    public static final rd7 d;
    public static final rd7 e;
    public static final /* synthetic */ rd7[] f;
    public static final /* synthetic */ kp5 g;
    public final int a;

    static {
        rd7 rd7Var = new rd7(NativeAdContent.ViewTag.OTHER, 0, 0);
        c = rd7Var;
        rd7 rd7Var2 = new rd7("INJURED", 1, 1);
        d = rd7Var2;
        rd7 rd7Var3 = new rd7("ILL", 2, 2);
        rd7 rd7Var4 = new rd7("SUSPENDED", 3, 3);
        e = rd7Var4;
        rd7[] rd7VarArr = {rd7Var, rd7Var2, rd7Var3, rd7Var4, new rd7("ABSENT", 4, 4), new rd7("YELLOW_CARD", 5, 11), new rd7("YELLOW_RED_CARD", 6, 12), new rd7("RED_CARD", 7, 13), new rd7("LOAN", 8, 21)};
        f = rd7VarArr;
        g = new kp5(rd7VarArr);
        b = new uxf(23);
    }

    public rd7(String str, int i, int i2) {
        this.a = i2;
    }

    public static rd7 valueOf(String str) {
        return (rd7) Enum.valueOf(rd7.class, str);
    }

    public static rd7[] values() {
        return (rd7[]) f.clone();
    }
}
