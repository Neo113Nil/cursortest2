package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class fmc {
    public static final fmc a;
    public static final fmc b;
    public static final /* synthetic */ fmc[] c;

    static {
        fmc fmcVar = new fmc("EVENT_CARD", 0);
        a = fmcVar;
        fmc fmcVar2 = new fmc("EVENT_SMALL", 1);
        b = fmcVar2;
        c = new fmc[]{fmcVar, fmcVar2};
    }

    public static fmc valueOf(String str) {
        return (fmc) Enum.valueOf(fmc.class, str);
    }

    public static fmc[] values() {
        return (fmc[]) c.clone();
    }
}
