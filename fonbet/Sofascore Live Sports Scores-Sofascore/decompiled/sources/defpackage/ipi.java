package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class ipi {
    public static final ipi a;
    public static final ipi b;
    public static final ipi c;
    public static final /* synthetic */ ipi[] d;

    static {
        ipi ipiVar = new ipi("FORCE_NONE", 0);
        a = ipiVar;
        ipi ipiVar2 = new ipi("FORCE_SQUARE", 1);
        b = ipiVar2;
        ipi ipiVar3 = new ipi("FORCE_RECTANGLE", 2);
        c = ipiVar3;
        d = new ipi[]{ipiVar, ipiVar2, ipiVar3};
    }

    public static ipi valueOf(String str) {
        return (ipi) Enum.valueOf(ipi.class, str);
    }

    public static ipi[] values() {
        return (ipi[]) d.clone();
    }
}
