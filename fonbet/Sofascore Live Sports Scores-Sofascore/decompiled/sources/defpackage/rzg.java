package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class rzg {
    public static final rzg a;
    public static final rzg b;
    public static final /* synthetic */ rzg[] c;

    static {
        rzg rzgVar = new rzg("Inherit", 0);
        a = rzgVar;
        rzg rzgVar2 = new rzg("SecureOn", 1);
        b = rzgVar2;
        c = new rzg[]{rzgVar, rzgVar2, new rzg("SecureOff", 2)};
    }

    public static rzg valueOf(String str) {
        return (rzg) Enum.valueOf(rzg.class, str);
    }

    public static rzg[] values() {
        return (rzg[]) c.clone();
    }
}
