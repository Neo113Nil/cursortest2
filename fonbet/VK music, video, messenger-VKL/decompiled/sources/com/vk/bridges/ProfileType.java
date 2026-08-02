package com.vk.bridges;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: AuthBridge.kt */
/* loaded from: classes.dex */
public final class ProfileType {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ ProfileType[] $VALUES;
    public static final ProfileType EDU;
    public static final ProfileType NORMAL;
    public static final ProfileType PROMO;
    public static final ProfileType RELATED;

    static {
        ProfileType profileType = new ProfileType("NORMAL", 0);
        NORMAL = profileType;
        ProfileType profileType2 = new ProfileType("PROMO", 1);
        PROMO = profileType2;
        ProfileType profileType3 = new ProfileType("EDU", 2);
        EDU = profileType3;
        ProfileType profileType4 = new ProfileType("RELATED", 3);
        RELATED = profileType4;
        ProfileType[] profileTypeArr = {profileType, profileType2, profileType3, profileType4};
        $VALUES = profileTypeArr;
        $ENTRIES = new asp(profileTypeArr);
    }

    public ProfileType() {
        throw null;
    }

    public static ProfileType valueOf(String str) {
        return (ProfileType) Enum.valueOf(ProfileType.class, str);
    }

    public static ProfileType[] values() {
        return (ProfileType[]) $VALUES.clone();
    }
}
