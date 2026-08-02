package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class yuc {
    public static final /* synthetic */ yuc[] a;
    public static final /* synthetic */ kp5 b;

    static {
        yuc[] yucVarArr = {new yuc("JANUARY", 0), new yuc("FEBRUARY", 1), new yuc("MARCH", 2), new yuc("APRIL", 3), new yuc("MAY", 4), new yuc("JUNE", 5), new yuc("JULY", 6), new yuc("AUGUST", 7), new yuc("SEPTEMBER", 8), new yuc("OCTOBER", 9), new yuc("NOVEMBER", 10), new yuc("DECEMBER", 11)};
        a = yucVarArr;
        b = new kp5(yucVarArr);
    }

    public static yuc valueOf(String str) {
        return (yuc) Enum.valueOf(yuc.class, str);
    }

    public static yuc[] values() {
        return (yuc[]) a.clone();
    }
}
