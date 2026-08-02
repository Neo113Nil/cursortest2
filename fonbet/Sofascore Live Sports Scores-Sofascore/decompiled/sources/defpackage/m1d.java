package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class m1d {
    public static final m1d a;
    public static final m1d b;
    public static final m1d c;
    public static final /* synthetic */ m1d[] d;

    static {
        m1d m1dVar = new m1d("Default", 0);
        a = m1dVar;
        m1d m1dVar2 = new m1d("UserInput", 1);
        b = m1dVar2;
        m1d m1dVar3 = new m1d("PreventUserInput", 2);
        c = m1dVar3;
        d = new m1d[]{m1dVar, m1dVar2, m1dVar3};
    }

    public static m1d valueOf(String str) {
        return (m1d) Enum.valueOf(m1d.class, str);
    }

    public static m1d[] values() {
        return (m1d[]) d.clone();
    }
}
