package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class bzf {
    public static final bzf a;
    public static final bzf b;
    public static final /* synthetic */ bzf[] c;

    static {
        bzf bzfVar = new bzf("Restart", 0);
        a = bzfVar;
        bzf bzfVar2 = new bzf("Reverse", 1);
        b = bzfVar2;
        c = new bzf[]{bzfVar, bzfVar2};
    }

    public static bzf valueOf(String str) {
        return (bzf) Enum.valueOf(bzf.class, str);
    }

    public static bzf[] values() {
        return (bzf[]) c.clone();
    }
}
