package com.vk.camera.editor.stories.impl.share.content;

import com.vkontakte.android.R;
import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: StoryShareContentType.kt */
/* loaded from: classes16.dex */
public final class StoryShareContentType {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ StoryShareContentType[] $VALUES;
    public static final StoryShareContentType BOTTOM_SHEET;
    public static final StoryShareContentType LONG_TAP;
    private final int avatarSizeId;
    private final int checkBackgroundId;
    private final int checkSizeId;
    private final int contentWidthId;

    static {
        StoryShareContentType storyShareContentType = new StoryShareContentType("BOTTOM_SHEET", 0, R.dimen.story_editor_avatar_size_big, R.dimen.story_editor_check_view_size_big, R.drawable.bg_check_box_background_content_24, R.dimen.story_editor_content_item_width_big);
        BOTTOM_SHEET = storyShareContentType;
        StoryShareContentType storyShareContentType2 = new StoryShareContentType("LONG_TAP", 1, R.dimen.story_editor_avatar_size_small, R.dimen.story_editor_check_view_size_small, R.drawable.vk_icon_check_circle_fill_dark_16, R.dimen.story_editor_content_item_width_small);
        LONG_TAP = storyShareContentType2;
        StoryShareContentType[] storyShareContentTypeArr = {storyShareContentType, storyShareContentType2};
        $VALUES = storyShareContentTypeArr;
        $ENTRIES = new asp(storyShareContentTypeArr);
    }

    public StoryShareContentType(String str, int i, int i2, int i3, int i4, int i5) {
        this.avatarSizeId = i2;
        this.checkSizeId = i3;
        this.checkBackgroundId = i4;
        this.contentWidthId = i5;
    }

    public static StoryShareContentType valueOf(String str) {
        return (StoryShareContentType) Enum.valueOf(StoryShareContentType.class, str);
    }

    public static StoryShareContentType[] values() {
        return (StoryShareContentType[]) $VALUES.clone();
    }

    public final int h() {
        return this.avatarSizeId;
    }

    public final int i() {
        return this.checkBackgroundId;
    }

    public final int j() {
        return this.checkSizeId;
    }

    public final int k() {
        return this.contentWidthId;
    }
}
