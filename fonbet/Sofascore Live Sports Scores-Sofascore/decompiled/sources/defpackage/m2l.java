package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class m2l {
    public static final wkf a;
    public static final /* synthetic */ m2l[] b;
    public static final /* synthetic */ kp5 c;

    static {
        m2l[] m2lVarArr = {new m2l("MONDAY", 0), new m2l("TUESDAY", 1), new m2l("WEDNESDAY", 2), new m2l("THURSDAY", 3), new m2l("FRIDAY", 4), new m2l("SATURDAY", 5), new m2l("SUNDAY", 6)};
        b = m2lVarArr;
        c = new kp5(m2lVarArr);
        a = new wkf(5);
    }

    public static m2l valueOf(String str) {
        return (m2l) Enum.valueOf(m2l.class, str);
    }

    public static m2l[] values() {
        return (m2l[]) b.clone();
    }
}
