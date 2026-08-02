package com.vk.superapp.multiaccount.impl.ecosystemswitcher.view.utils;

import android.content.Context;
import com.vkontakte.android.R;
import kotlin.NoWhenBranchMatchedException;
import xsna.asp;
import xsna.e3m;
import xsna.krv0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: UserNameIconType.kt */
/* loaded from: classes6.dex */
public final class UserNameIconType {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ UserNameIconType[] $VALUES;
    public static final UserNameIconType CELEBRITY;
    public static final UserNameIconType LOCKED;
    public static final UserNameIconType VERIFIED;
    private final int icon;
    private final int iconBackground;

    /* compiled from: UserNameIconType.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[UserNameIconType.values().length];
            try {
                iArr[UserNameIconType.VERIFIED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[UserNameIconType.CELEBRITY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[UserNameIconType.LOCKED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    static {
        UserNameIconType userNameIconType = new UserNameIconType("VERIFIED", 0, R.drawable.vk_icon_verified_16, R.attr.vk_ui_icon_secondary);
        VERIFIED = userNameIconType;
        UserNameIconType userNameIconType2 = new UserNameIconType("CELEBRITY", 1, R.drawable.vk_icon_verified_16, R.color.vk_blue_200);
        CELEBRITY = userNameIconType2;
        UserNameIconType userNameIconType3 = new UserNameIconType("LOCKED", 2, R.drawable.vk_icon_lock_16, R.attr.vk_ui_icon_tertiary);
        LOCKED = userNameIconType3;
        UserNameIconType[] userNameIconTypeArr = {userNameIconType, userNameIconType2, userNameIconType3};
        $VALUES = userNameIconTypeArr;
        $ENTRIES = new asp(userNameIconTypeArr);
    }

    public UserNameIconType(String str, int i, int i2, int i3) {
        this.icon = i2;
        this.iconBackground = i3;
    }

    public static UserNameIconType valueOf(String str) {
        return (UserNameIconType) Enum.valueOf(UserNameIconType.class, str);
    }

    public static UserNameIconType[] values() {
        return (UserNameIconType[]) $VALUES.clone();
    }

    public final int h() {
        return this.icon;
    }

    public final int i(Context context) {
        int i = a.$EnumSwitchMapping$0[ordinal()];
        if (i == 1) {
            return krv0.m(this.iconBackground, context);
        }
        if (i != 2) {
            if (i == 3) {
                return krv0.m(this.iconBackground, context);
            }
            throw new NoWhenBranchMatchedException();
        }
        int i2 = this.iconBackground;
        e3m.a aVar = e3m.a;
        return context.getColor(i2);
    }
}
