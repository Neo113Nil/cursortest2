package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class a0p {
    public static final a0p a;
    public static final a0p b;
    public static final /* synthetic */ a0p[] c;

    static {
        a0p a0pVar = new a0p("CONSENT", 0);
        a = a0pVar;
        a0p a0pVar2 = new a0p("LEGITIMATE_INTEREST", 1);
        a0p a0pVar3 = new a0p("FLEXIBLE_CONSENT", 2);
        a0p a0pVar4 = new a0p("FLEXIBLE_LEGITIMATE_INTEREST", 3);
        b = a0pVar4;
        c = new a0p[]{a0pVar, a0pVar2, a0pVar3, a0pVar4};
    }

    public static a0p[] values() {
        return (a0p[]) c.clone();
    }
}
