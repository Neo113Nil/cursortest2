package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class fle {
    public static final fle a;
    public static final fle b;
    public static final /* synthetic */ fle[] c;

    static {
        fle fleVar = new fle("Injury", 0);
        a = fleVar;
        fle fleVar2 = new fle("Suspension", 1);
        b = fleVar2;
        c = new fle[]{fleVar, fleVar2};
    }

    public static fle valueOf(String str) {
        return (fle) Enum.valueOf(fle.class, str);
    }

    public static fle[] values() {
        return (fle[]) c.clone();
    }
}
