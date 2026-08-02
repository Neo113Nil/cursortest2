package com.google.protobuf;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes9.dex */
final class S {
    private static final /* synthetic */ S[] $VALUES;
    public static final S LAZY;
    public static final S LOOSE;
    public static final S STRICT;

    static {
        S s11 = new S("LOOSE", 0);
        LOOSE = s11;
        S s12 = new S("STRICT", 1);
        STRICT = s12;
        S s13 = new S("LAZY", 2);
        LAZY = s13;
        $VALUES = new S[]{s11, s12, s13};
    }

    private S() {
        throw null;
    }

    public static S valueOf(String str) {
        return (S) java.lang.Enum.valueOf(S.class, str);
    }

    public static S[] values() {
        return (S[]) $VALUES.clone();
    }
}
