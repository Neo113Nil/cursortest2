package com.vk.profile.user.api.domain;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: UserProfileMode.kt */
/* loaded from: classes5.dex */
public final class UserProfileMode {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ UserProfileMode[] $VALUES;
    public static final UserProfileMode Modal;
    public static final UserProfileMode Profile;

    static {
        UserProfileMode userProfileMode = new UserProfileMode("Profile", 0);
        Profile = userProfileMode;
        UserProfileMode userProfileMode2 = new UserProfileMode("Modal", 1);
        Modal = userProfileMode2;
        UserProfileMode[] userProfileModeArr = {userProfileMode, userProfileMode2};
        $VALUES = userProfileModeArr;
        $ENTRIES = new asp(userProfileModeArr);
    }

    public UserProfileMode() {
        throw null;
    }

    public static UserProfileMode valueOf(String str) {
        return (UserProfileMode) Enum.valueOf(UserProfileMode.class, str);
    }

    public static UserProfileMode[] values() {
        return (UserProfileMode[]) $VALUES.clone();
    }
}
