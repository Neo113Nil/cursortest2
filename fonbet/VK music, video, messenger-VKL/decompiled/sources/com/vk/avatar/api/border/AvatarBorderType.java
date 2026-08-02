package com.vk.avatar.api.border;

import xsna.asp;
import xsna.ozl;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: AvatarBorderType.kt */
/* loaded from: classes15.dex */
public final class AvatarBorderType {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ AvatarBorderType[] $VALUES;
    public static final AvatarBorderType CIRCLE;

    @ozl
    public static final AvatarBorderType HEXAGON;
    public static final AvatarBorderType SQUARE;

    static {
        AvatarBorderType avatarBorderType = new AvatarBorderType("CIRCLE", 0);
        CIRCLE = avatarBorderType;
        AvatarBorderType avatarBorderType2 = new AvatarBorderType("SQUARE", 1);
        SQUARE = avatarBorderType2;
        AvatarBorderType avatarBorderType3 = new AvatarBorderType("HEXAGON", 2);
        HEXAGON = avatarBorderType3;
        AvatarBorderType[] avatarBorderTypeArr = {avatarBorderType, avatarBorderType2, avatarBorderType3};
        $VALUES = avatarBorderTypeArr;
        $ENTRIES = new asp(avatarBorderTypeArr);
    }

    public AvatarBorderType() {
        throw null;
    }

    public static AvatarBorderType valueOf(String str) {
        return (AvatarBorderType) Enum.valueOf(AvatarBorderType.class, str);
    }

    public static AvatarBorderType[] values() {
        return (AvatarBorderType[]) $VALUES.clone();
    }
}
