package com.vk.core.compose.component.defaults;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: VkUserStackDefaults.kt */
/* loaded from: classes17.dex */
public final class UserStackSize {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ UserStackSize[] $VALUES;
    public static final UserStackSize Large;
    public static final UserStackSize Medium;
    public static final UserStackSize Small;

    static {
        UserStackSize userStackSize = new UserStackSize("Small", 0);
        Small = userStackSize;
        UserStackSize userStackSize2 = new UserStackSize("Medium", 1);
        Medium = userStackSize2;
        UserStackSize userStackSize3 = new UserStackSize("Large", 2);
        Large = userStackSize3;
        UserStackSize[] userStackSizeArr = {userStackSize, userStackSize2, userStackSize3};
        $VALUES = userStackSizeArr;
        $ENTRIES = new asp(userStackSizeArr);
    }

    public UserStackSize() {
        throw null;
    }

    public static zrp<UserStackSize> h() {
        return $ENTRIES;
    }

    public static UserStackSize valueOf(String str) {
        return (UserStackSize) Enum.valueOf(UserStackSize.class, str);
    }

    public static UserStackSize[] values() {
        return (UserStackSize[]) $VALUES.clone();
    }
}
