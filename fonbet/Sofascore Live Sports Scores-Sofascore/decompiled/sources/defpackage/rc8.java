package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class rc8 implements xn3 {
    public static final rc8 a;
    public static final /* synthetic */ rc8[] b;

    static {
        rc8 rc8Var = new rc8("INSTANCE", 0);
        a = rc8Var;
        b = new rc8[]{rc8Var};
    }

    public static rc8 valueOf(String str) {
        return (rc8) Enum.valueOf(rc8.class, str);
    }

    public static rc8[] values() {
        return (rc8[]) b.clone();
    }

    @Override // defpackage.xn3
    public final void accept(Object obj) {
        ((iki) obj).request(Long.MAX_VALUE);
    }
}
