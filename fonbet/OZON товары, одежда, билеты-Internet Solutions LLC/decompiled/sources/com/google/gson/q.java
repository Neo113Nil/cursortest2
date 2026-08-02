package com.google.gson;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class q {
    private static final /* synthetic */ q[] $VALUES;
    public static final q LEGACY_STRICT;
    public static final q LENIENT;
    public static final q STRICT;

    static {
        q qVar = new q("LENIENT", 0);
        LENIENT = qVar;
        q qVar2 = new q("LEGACY_STRICT", 1);
        LEGACY_STRICT = qVar2;
        q qVar3 = new q("STRICT", 2);
        STRICT = qVar3;
        $VALUES = new q[]{qVar, qVar2, qVar3};
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
