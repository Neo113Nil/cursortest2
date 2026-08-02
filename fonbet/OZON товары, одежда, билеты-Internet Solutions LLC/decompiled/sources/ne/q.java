package ne;

import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class q {
    private static final /* synthetic */ Xc.a $ENTRIES;
    private static final /* synthetic */ q[] $VALUES;
    public static final q IN;
    public static final q INV;
    public static final q OUT;

    @NotNull
    private final String presentation;

    static {
        q qVar = new q("IN", 0, "in");
        IN = qVar;
        q qVar2 = new q("OUT", 1, "out");
        OUT = qVar2;
        q qVar3 = new q("INV", 2, "");
        INV = qVar3;
        q[] qVarArr = {qVar, qVar2, qVar3};
        $VALUES = qVarArr;
        $ENTRIES = Xc.b.a(qVarArr);
    }

    private q(String str, int i11, String str2) {
        this.presentation = str2;
    }

    public static q valueOf(String str) {
        return (q) Enum.valueOf(q.class, str);
    }

    public static q[] values() {
        return (q[]) $VALUES.clone();
    }

    @Override // java.lang.Enum
    @NotNull
    public final String toString() {
        return this.presentation;
    }
}
