package com.vk.newsfeed.impl.posting.viewpresenter.bottom.attachment;

import com.vkontakte.android.R;
import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: BottomAttachItem.kt */
/* loaded from: classes4.dex */
public final class ButtonPanelPosting {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ ButtonPanelPosting[] $VALUES;
    public static final ButtonPanelPosting IMAGE_BUTTON_TYPE;
    public static final ButtonPanelPosting MORE_ATTACHMENT_BUTTON_TYPE;
    public static final ButtonPanelPosting MORE_BUTTON_TYPE;
    public static final ButtonPanelPosting MUSIC_BUTTON_TYPE;
    public static final ButtonPanelPosting VIDEO_BUTTON_TYPE;
    private final int accessibilityActionId;
    private final int contentDescriptionId;
    private final int iconId;

    static {
        ButtonPanelPosting buttonPanelPosting = new ButtonPanelPosting("IMAGE_BUTTON_TYPE", 0, R.drawable.vk_icon_picture_outline_28, R.string.posting_attachments_button_gallery, R.string.posting_attachments_action_select_from_gallery);
        IMAGE_BUTTON_TYPE = buttonPanelPosting;
        ButtonPanelPosting buttonPanelPosting2 = new ButtonPanelPosting("MUSIC_BUTTON_TYPE", 1, R.drawable.vk_icon_music_outline_28, R.string.posting_attachments_button_music, R.string.posting_attachments_action_select_from_music);
        MUSIC_BUTTON_TYPE = buttonPanelPosting2;
        ButtonPanelPosting buttonPanelPosting3 = new ButtonPanelPosting("VIDEO_BUTTON_TYPE", 2, R.drawable.vk_icon_video_outline_28, R.string.posting_attachments_button_video, R.string.posting_attachments_action_select_from_video);
        VIDEO_BUTTON_TYPE = buttonPanelPosting3;
        ButtonPanelPosting buttonPanelPosting4 = new ButtonPanelPosting("MORE_BUTTON_TYPE", 3, R.drawable.vk_icon_more_horizontal_28, R.string.posting_attachments_button_more, R.string.posting_attachments_action_select_from_more);
        MORE_BUTTON_TYPE = buttonPanelPosting4;
        ButtonPanelPosting buttonPanelPosting5 = new ButtonPanelPosting("MORE_ATTACHMENT_BUTTON_TYPE", 4, R.drawable.vk_icon_picture_outline_28, R.string.posting_attachments_button_gallery, R.string.posting_attachments_action_select_from_gallery);
        MORE_ATTACHMENT_BUTTON_TYPE = buttonPanelPosting5;
        ButtonPanelPosting[] buttonPanelPostingArr = {buttonPanelPosting, buttonPanelPosting2, buttonPanelPosting3, buttonPanelPosting4, buttonPanelPosting5};
        $VALUES = buttonPanelPostingArr;
        $ENTRIES = new asp(buttonPanelPostingArr);
    }

    public ButtonPanelPosting(String str, int i, int i2, int i3, int i4) {
        this.iconId = i2;
        this.contentDescriptionId = i3;
        this.accessibilityActionId = i4;
    }

    public static ButtonPanelPosting valueOf(String str) {
        return (ButtonPanelPosting) Enum.valueOf(ButtonPanelPosting.class, str);
    }

    public static ButtonPanelPosting[] values() {
        return (ButtonPanelPosting[]) $VALUES.clone();
    }

    public final int h() {
        return this.accessibilityActionId;
    }

    public final int i() {
        return this.contentDescriptionId;
    }

    public final int j() {
        return this.iconId;
    }
}
