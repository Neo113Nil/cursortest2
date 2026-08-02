package com.vk.profile.user.impl.domain.edit.nickname.popup;

import com.vkontakte.android.R;
import xsna.aiq0;
import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: NicknamePopupChoice.kt */
/* loaded from: classes5.dex */
public final class NicknamePopupChoice {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ NicknamePopupChoice[] $VALUES;
    public static final NicknamePopupChoice Copy;
    public static final NicknamePopupChoice Edit;
    public static final NicknamePopupChoice Share;
    private final aiq0.j action;
    private final int icon;
    private final int title;

    static {
        NicknamePopupChoice nicknamePopupChoice = new NicknamePopupChoice("Copy", 0, R.string.user_profile_edit_actions_copy_nickname, R.drawable.vk_icon_copy_24, aiq0.j.a.b);
        Copy = nicknamePopupChoice;
        NicknamePopupChoice nicknamePopupChoice2 = new NicknamePopupChoice("Share", 1, R.string.user_profile_edit_actions_share_nickname, R.drawable.vk_icon_share_outline_24, aiq0.j.c.b);
        Share = nicknamePopupChoice2;
        NicknamePopupChoice nicknamePopupChoice3 = new NicknamePopupChoice("Edit", 2, R.string.user_profile_edit_actions_edit_nickname, R.drawable.vk_icon_pen_outline_24, aiq0.j.b.b);
        Edit = nicknamePopupChoice3;
        NicknamePopupChoice[] nicknamePopupChoiceArr = {nicknamePopupChoice, nicknamePopupChoice2, nicknamePopupChoice3};
        $VALUES = nicknamePopupChoiceArr;
        $ENTRIES = new asp(nicknamePopupChoiceArr);
    }

    public NicknamePopupChoice(String str, int i, int i2, int i3, aiq0.j jVar) {
        this.title = i2;
        this.icon = i3;
        this.action = jVar;
    }

    public static NicknamePopupChoice valueOf(String str) {
        return (NicknamePopupChoice) Enum.valueOf(NicknamePopupChoice.class, str);
    }

    public static NicknamePopupChoice[] values() {
        return (NicknamePopupChoice[]) $VALUES.clone();
    }

    public final aiq0.j h() {
        return this.action;
    }

    public final int i() {
        return this.icon;
    }

    public final int j() {
        return this.title;
    }
}
