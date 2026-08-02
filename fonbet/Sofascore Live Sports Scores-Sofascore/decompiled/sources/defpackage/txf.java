package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class txf {
    public static final txf a;
    public static final /* synthetic */ txf[] b;

    static {
        txf txfVar = new txf("LAUNCH_INITIAL_REFRESH", 0);
        a = txfVar;
        b = new txf[]{txfVar, new txf("SKIP_INITIAL_REFRESH", 1)};
    }

    public static txf valueOf(String str) {
        return (txf) Enum.valueOf(txf.class, str);
    }

    public static txf[] values() {
        return (txf[]) b.clone();
    }
}
