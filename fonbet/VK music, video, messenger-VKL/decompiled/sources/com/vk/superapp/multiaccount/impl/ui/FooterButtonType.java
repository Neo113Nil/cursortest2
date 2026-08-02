package com.vk.superapp.multiaccount.impl.ui;

import com.vkontakte.android.R;
import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: AdapterData.kt */
/* loaded from: classes6.dex */
public final class FooterButtonType {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ FooterButtonType[] $VALUES;
    public static final FooterButtonType ADD;
    public static final FooterButtonType LOGOUT;
    private final int icon;
    private final int text;

    static {
        FooterButtonType footerButtonType = new FooterButtonType("ADD", 0, R.drawable.vk_icon_add_outline_28, R.string.vk_multiaccount_add_account);
        ADD = footerButtonType;
        FooterButtonType footerButtonType2 = new FooterButtonType("LOGOUT", 1, R.drawable.vk_icon_door_arrow_right_outline_28, R.string.vk_multiaccount_logout);
        LOGOUT = footerButtonType2;
        FooterButtonType[] footerButtonTypeArr = {footerButtonType, footerButtonType2};
        $VALUES = footerButtonTypeArr;
        $ENTRIES = new asp(footerButtonTypeArr);
    }

    public FooterButtonType(String str, int i, int i2, int i3) {
        this.icon = i2;
        this.text = i3;
    }

    public static FooterButtonType valueOf(String str) {
        return (FooterButtonType) Enum.valueOf(FooterButtonType.class, str);
    }

    public static FooterButtonType[] values() {
        return (FooterButtonType[]) $VALUES.clone();
    }

    public final int h() {
        return this.icon;
    }

    public final int i() {
        return this.text;
    }
}
