package com.vk.design.demo.presentation.screens.authorheader;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: AuthorHeaderState.kt */
/* loaded from: classes18.dex */
public final class AvatarType {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ AvatarType[] $VALUES;
    public static final AvatarType DefaultAvatar;
    public static final AvatarType Empty;

    static {
        AvatarType avatarType = new AvatarType("Empty", 0);
        Empty = avatarType;
        AvatarType avatarType2 = new AvatarType("DefaultAvatar", 1);
        DefaultAvatar = avatarType2;
        AvatarType[] avatarTypeArr = {avatarType, avatarType2};
        $VALUES = avatarTypeArr;
        $ENTRIES = new asp(avatarTypeArr);
    }

    public AvatarType() {
        throw null;
    }

    public static AvatarType valueOf(String str) {
        return (AvatarType) Enum.valueOf(AvatarType.class, str);
    }

    public static AvatarType[] values() {
        return (AvatarType[]) $VALUES.clone();
    }
}
