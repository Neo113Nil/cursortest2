package k5;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes8.dex */
public final class L0 {

    /* renamed from: default, reason: not valid java name */
    @J8.b("None")
    public static final L0 f16default;

    /* renamed from: do, reason: not valid java name */
    private static final /* synthetic */ L0[] f17do;

    /* renamed from: final, reason: not valid java name */
    @J8.b("Secondary")
    public static final L0 f18final;

    /* renamed from: transient, reason: not valid java name */
    @J8.b("Primary")
    public static final L0 f19transient;

    static {
        L0 l02 = new L0("Primary", 0);
        f19transient = l02;
        L0 l03 = new L0("Secondary", 1);
        f18final = l03;
        L0 l04 = new L0("None", 2);
        f16default = l04;
        f17do = new L0[]{l02, l03, l04};
    }

    private L0() {
        throw null;
    }

    public static L0 valueOf(String str) {
        return (L0) Enum.valueOf(L0.class, str);
    }

    public static L0[] values() {
        return (L0[]) f17do.clone();
    }
}
