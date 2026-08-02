package kotlin.reflect;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class s {
    private static final /* synthetic */ Xc.a $ENTRIES;
    private static final /* synthetic */ s[] $VALUES;
    public static final s IN;
    public static final s INVARIANT;
    public static final s OUT;

    static {
        s sVar = new s("INVARIANT", 0);
        INVARIANT = sVar;
        s sVar2 = new s("IN", 1);
        IN = sVar2;
        s sVar3 = new s("OUT", 2);
        OUT = sVar3;
        s[] sVarArr = {sVar, sVar2, sVar3};
        $VALUES = sVarArr;
        $ENTRIES = Xc.b.a(sVarArr);
    }

    private s() {
        throw null;
    }

    public static s valueOf(String str) {
        return (s) Enum.valueOf(s.class, str);
    }

    public static s[] values() {
        return (s[]) $VALUES.clone();
    }
}
