package com.vk.im.ui.views.avatars;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: AvatarView.kt */
/* loaded from: classes2.dex */
public final class AvatarShape {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ AvatarShape[] $VALUES;
    public static final AvatarShape CIRCLE;
    public static final AvatarShape SQUARED;

    static {
        AvatarShape avatarShape = new AvatarShape("CIRCLE", 0);
        CIRCLE = avatarShape;
        AvatarShape avatarShape2 = new AvatarShape("SQUARED", 1);
        SQUARED = avatarShape2;
        AvatarShape[] avatarShapeArr = {avatarShape, avatarShape2};
        $VALUES = avatarShapeArr;
        $ENTRIES = new asp(avatarShapeArr);
    }

    public AvatarShape() {
        throw null;
    }

    public static AvatarShape valueOf(String str) {
        return (AvatarShape) Enum.valueOf(AvatarShape.class, str);
    }

    public static AvatarShape[] values() {
        return (AvatarShape[]) $VALUES.clone();
    }
}
