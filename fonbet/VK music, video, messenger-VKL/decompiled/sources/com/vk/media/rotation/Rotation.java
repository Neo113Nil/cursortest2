package com.vk.media.rotation;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class Rotation {
    private static final /* synthetic */ Rotation[] $VALUES;
    public static final Rotation ROTATION_0;
    public static final Rotation ROTATION_180;
    public static final Rotation ROTATION_270;
    public static final Rotation ROTATION_90;

    static {
        Rotation rotation = new Rotation("ROTATION_0", 0);
        ROTATION_0 = rotation;
        Rotation rotation2 = new Rotation("ROTATION_90", 1);
        ROTATION_90 = rotation2;
        Rotation rotation3 = new Rotation("ROTATION_180", 2);
        ROTATION_180 = rotation3;
        Rotation rotation4 = new Rotation("ROTATION_270", 3);
        ROTATION_270 = rotation4;
        $VALUES = new Rotation[]{rotation, rotation2, rotation3, rotation4};
    }

    public Rotation() {
        throw null;
    }

    public static Rotation valueOf(String str) {
        return (Rotation) Enum.valueOf(Rotation.class, str);
    }

    public static Rotation[] values() {
        return (Rotation[]) $VALUES.clone();
    }
}
