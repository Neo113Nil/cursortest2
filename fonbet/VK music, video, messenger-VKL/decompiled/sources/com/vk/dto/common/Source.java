package com.vk.dto.common;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class Source {
    private static final /* synthetic */ Source[] $VALUES;
    public static final Source ACTUAL;
    public static final Source CACHE;
    public static final Source NETWORK;

    static {
        Source source = new Source("CACHE", 0);
        CACHE = source;
        Source source2 = new Source("ACTUAL", 1);
        ACTUAL = source2;
        Source source3 = new Source("NETWORK", 2);
        NETWORK = source3;
        $VALUES = new Source[]{source, source2, source3};
    }

    public Source() {
        throw null;
    }

    public static Source valueOf(String str) {
        return (Source) Enum.valueOf(Source.class, str);
    }

    public static Source[] values() {
        return (Source[]) $VALUES.clone();
    }
}
