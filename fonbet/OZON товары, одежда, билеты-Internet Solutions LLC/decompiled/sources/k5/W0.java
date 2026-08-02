package k5;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes8.dex */
public final class W0 {

    /* renamed from: default, reason: not valid java name */
    private static final /* synthetic */ W0[] f20default;

    /* renamed from: final, reason: not valid java name */
    public static final W0 f21final;

    /* renamed from: transient, reason: not valid java name */
    public static final W0 f22transient;

    static {
        W0 w02 = new W0("GLOBAL_RAM", 0);
        f22transient = w02;
        W0 w03 = new W0("GLOBAL_SHARED_PREFERENCES", 1);
        f21final = w03;
        f20default = new W0[]{w02, w03};
    }

    private W0() {
        throw null;
    }

    public static W0 valueOf(String str) {
        return (W0) Enum.valueOf(W0.class, str);
    }

    public static W0[] values() {
        return (W0[]) f20default.clone();
    }
}
