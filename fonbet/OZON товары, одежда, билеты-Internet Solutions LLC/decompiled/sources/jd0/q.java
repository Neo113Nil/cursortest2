package jd0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class q {
    private static final /* synthetic */ Xc.a $ENTRIES;
    private static final /* synthetic */ q[] $VALUES;
    public static final q DEFAULT;
    public static final q NO_CACHE;

    static {
        q qVar = new q("DEFAULT", 0);
        DEFAULT = qVar;
        q qVar2 = new q("NO_CACHE", 1);
        NO_CACHE = qVar2;
        q[] qVarArr = {qVar, qVar2};
        $VALUES = qVarArr;
        $ENTRIES = Xc.b.a(qVarArr);
    }

    private q() {
        throw null;
    }

    public static q valueOf(String str) {
        return (q) Enum.valueOf(q.class, str);
    }

    public static q[] values() {
        return (q[]) $VALUES.clone();
    }
}
