package kg;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes10.dex */
public final class h {
    private static final /* synthetic */ h[] $VALUES;
    public static final h LENIENT;
    public static final h SMART;
    public static final h STRICT;

    static {
        h hVar = new h("STRICT", 0);
        STRICT = hVar;
        h hVar2 = new h("SMART", 1);
        SMART = hVar2;
        h hVar3 = new h("LENIENT", 2);
        LENIENT = hVar3;
        $VALUES = new h[]{hVar, hVar2, hVar3};
    }

    private h() {
        throw null;
    }

    public static h valueOf(String str) {
        return (h) Enum.valueOf(h.class, str);
    }

    public static h[] values() {
        return (h[]) $VALUES.clone();
    }
}
