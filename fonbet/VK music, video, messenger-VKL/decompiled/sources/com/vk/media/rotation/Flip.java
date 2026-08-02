package com.vk.media.rotation;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class Flip {
    private static final /* synthetic */ Flip[] $VALUES;
    public static final Flip HORIZONTAL;
    public static final Flip NO_FLIP;
    public static final Flip VERTICAL;
    public static final Flip VERTICAL_HORIZONTAL;

    static {
        Flip flip = new Flip("NO_FLIP", 0);
        NO_FLIP = flip;
        Flip flip2 = new Flip("VERTICAL", 1);
        VERTICAL = flip2;
        Flip flip3 = new Flip("HORIZONTAL", 2);
        HORIZONTAL = flip3;
        Flip flip4 = new Flip("VERTICAL_HORIZONTAL", 3);
        VERTICAL_HORIZONTAL = flip4;
        $VALUES = new Flip[]{flip, flip2, flip3, flip4};
    }

    public Flip() {
        throw null;
    }

    public static Flip valueOf(String str) {
        return (Flip) Enum.valueOf(Flip.class, str);
    }

    public static Flip[] values() {
        return (Flip[]) $VALUES.clone();
    }
}
