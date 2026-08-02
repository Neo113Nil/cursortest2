package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class gx2 {
    public static final gx2 a;
    public static final /* synthetic */ gx2[] b;

    static {
        gx2 gx2Var = new gx2("BLOCKING", 0);
        a = gx2Var;
        b = new gx2[]{gx2Var, new gx2("FUTURE", 1), new gx2("ASYNC", 2)};
    }

    public static gx2 valueOf(String str) {
        return (gx2) Enum.valueOf(gx2.class, str);
    }

    public static gx2[] values() {
        return (gx2[]) b.clone();
    }
}
