package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class x2k {
    public static final x2k a;
    public static final /* synthetic */ x2k[] b;

    static {
        x2k x2kVar = new x2k("WITHOUT_ACTION", 0);
        a = x2kVar;
        b = new x2k[]{x2kVar};
    }

    public static x2k valueOf(String str) {
        return (x2k) Enum.valueOf(x2k.class, str);
    }

    public static x2k[] values() {
        return (x2k[]) b.clone();
    }
}
