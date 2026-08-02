package com.vk.profile.user.impl.domain.edit.avatar;

import com.vkontakte.android.R;
import xsna.aiq0;
import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: AvatarPopupChoice.kt */
/* loaded from: classes5.dex */
public final class AvatarPopupChoice {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ AvatarPopupChoice[] $VALUES;
    public static final AvatarPopupChoice Edit;
    public static final AvatarPopupChoice Remove;
    private final aiq0.a action;
    private final int icon;
    private final int title;

    static {
        AvatarPopupChoice avatarPopupChoice = new AvatarPopupChoice("Edit", 0, R.string.user_profile_edit_change_photo, R.drawable.vk_icon_pen_outline_24, new aiq0.a.b(null));
        Edit = avatarPopupChoice;
        AvatarPopupChoice avatarPopupChoice2 = new AvatarPopupChoice("Remove", 1, R.string.user_profile_edit_delete_photo, R.drawable.vk_icon_delete_outline_24, aiq0.a.d.b);
        Remove = avatarPopupChoice2;
        AvatarPopupChoice[] avatarPopupChoiceArr = {avatarPopupChoice, avatarPopupChoice2};
        $VALUES = avatarPopupChoiceArr;
        $ENTRIES = new asp(avatarPopupChoiceArr);
    }

    public AvatarPopupChoice(String str, int i, int i2, int i3, aiq0.a aVar) {
        this.title = i2;
        this.icon = i3;
        this.action = aVar;
    }

    public static AvatarPopupChoice valueOf(String str) {
        return (AvatarPopupChoice) Enum.valueOf(AvatarPopupChoice.class, str);
    }

    public static AvatarPopupChoice[] values() {
        return (AvatarPopupChoice[]) $VALUES.clone();
    }

    public final aiq0.a h() {
        return this.action;
    }

    public final int i() {
        return this.icon;
    }

    public final int j() {
        return this.title;
    }
}
