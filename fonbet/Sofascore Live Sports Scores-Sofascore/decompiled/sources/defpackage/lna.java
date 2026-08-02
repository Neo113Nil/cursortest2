package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class lna {
    public static final lna a;
    public static final lna b;
    public static final /* synthetic */ lna[] c;

    static {
        lna lnaVar = new lna("Horizontal", 0);
        a = lnaVar;
        lna lnaVar2 = new lna("Vertical", 1);
        b = lnaVar2;
        c = new lna[]{lnaVar, lnaVar2};
    }

    public static lna valueOf(String str) {
        return (lna) Enum.valueOf(lna.class, str);
    }

    public static lna[] values() {
        return (lna[]) c.clone();
    }
}
