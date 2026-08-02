package he;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class u {
    private static final /* synthetic */ Xc.a $ENTRIES;
    private static final /* synthetic */ u[] $VALUES;
    public static final u STABLE;
    public static final u UNSTABLE;

    static {
        u uVar = new u("STABLE", 0);
        STABLE = uVar;
        u uVar2 = new u("UNSTABLE", 1);
        UNSTABLE = uVar2;
        u[] uVarArr = {uVar, uVar2};
        $VALUES = uVarArr;
        $ENTRIES = Xc.b.a(uVarArr);
    }

    private u() {
        throw null;
    }

    public static u valueOf(String str) {
        return (u) Enum.valueOf(u.class, str);
    }

    public static u[] values() {
        return (u[]) $VALUES.clone();
    }
}
