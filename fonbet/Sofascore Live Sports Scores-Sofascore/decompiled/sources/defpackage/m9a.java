package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class m9a {
    public static final m9a a;
    public static final m9a b;
    public static final /* synthetic */ m9a[] c;

    static {
        m9a m9aVar = new m9a("Min", 0);
        a = m9aVar;
        m9a m9aVar2 = new m9a("Max", 1);
        b = m9aVar2;
        c = new m9a[]{m9aVar, m9aVar2};
    }

    public static m9a valueOf(String str) {
        return (m9a) Enum.valueOf(m9a.class, str);
    }

    public static m9a[] values() {
        return (m9a[]) c.clone();
    }
}
