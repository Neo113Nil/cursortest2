package com.google.crypto.tink.shaded.protobuf;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class b0 {
    private static final /* synthetic */ b0[] $VALUES;
    public static final b0 EDITIONS;
    public static final b0 PROTO2;
    public static final b0 PROTO3;

    static {
        b0 b0Var = new b0("PROTO2", 0);
        PROTO2 = b0Var;
        b0 b0Var2 = new b0("PROTO3", 1);
        PROTO3 = b0Var2;
        b0 b0Var3 = new b0("EDITIONS", 2);
        EDITIONS = b0Var3;
        $VALUES = new b0[]{b0Var, b0Var2, b0Var3};
    }

    private b0() {
        throw null;
    }

    public static b0 valueOf(String str) {
        return (b0) Enum.valueOf(b0.class, str);
    }

    public static b0[] values() {
        return (b0[]) $VALUES.clone();
    }
}
