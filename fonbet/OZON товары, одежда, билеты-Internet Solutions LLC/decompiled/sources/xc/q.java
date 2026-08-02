package xc;

import hg.InterfaceC6948a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class q implements qc.o<io.reactivex.n<Object>, InterfaceC6948a<Object>> {
    private static final /* synthetic */ q[] $VALUES;
    public static final q INSTANCE;

    static {
        q qVar = new q("INSTANCE", 0);
        INSTANCE = qVar;
        $VALUES = new q[]{qVar};
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

    @Override // qc.o
    public final InterfaceC6948a<Object> apply(io.reactivex.n<Object> nVar) throws Exception {
        return new o(nVar);
    }
}
