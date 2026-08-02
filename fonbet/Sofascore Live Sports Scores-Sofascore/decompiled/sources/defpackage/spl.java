package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class spl {
    public static final spl a;
    public static final /* synthetic */ spl[] b;

    static {
        spl splVar = new spl();
        a = splVar;
        b = new spl[]{splVar};
    }

    public static spl valueOf(String str) {
        return (spl) Enum.valueOf(spl.class, str);
    }

    public static spl[] values() {
        return (spl[]) b.clone();
    }
}
