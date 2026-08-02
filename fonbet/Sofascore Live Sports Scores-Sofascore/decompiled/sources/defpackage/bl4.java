package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class bl4 {
    public static final /* synthetic */ bl4[] a;
    public static final /* synthetic */ kp5 b;

    static {
        bl4[] bl4VarArr = {new bl4("MONDAY", 0), new bl4("TUESDAY", 1), new bl4("WEDNESDAY", 2), new bl4("THURSDAY", 3), new bl4("FRIDAY", 4), new bl4("SATURDAY", 5), new bl4("SUNDAY", 6)};
        a = bl4VarArr;
        b = new kp5(bl4VarArr);
    }

    public static bl4 valueOf(String str) {
        return (bl4) Enum.valueOf(bl4.class, str);
    }

    public static bl4[] values() {
        return (bl4[]) a.clone();
    }
}
