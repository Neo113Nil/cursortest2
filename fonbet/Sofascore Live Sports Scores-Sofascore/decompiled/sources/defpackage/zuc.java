package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class zuc {
    public static final uxf a;
    public static final /* synthetic */ zuc[] b;
    public static final /* synthetic */ kp5 c;

    static {
        zuc[] zucVarArr = {new zuc("JANUARY", 0), new zuc("FEBRUARY", 1), new zuc("MARCH", 2), new zuc("APRIL", 3), new zuc("MAY", 4), new zuc("JUNE", 5), new zuc("JULY", 6), new zuc("AUGUST", 7), new zuc("SEPTEMBER", 8), new zuc("OCTOBER", 9), new zuc("NOVEMBER", 10), new zuc("DECEMBER", 11)};
        b = zucVarArr;
        c = new kp5(zucVarArr);
        a = new uxf(28);
    }

    public static zuc valueOf(String str) {
        return (zuc) Enum.valueOf(zuc.class, str);
    }

    public static zuc[] values() {
        return (zuc[]) b.clone();
    }
}
