package com.vk.clips.viewer.impl.grid.lists;

import com.vkontakte.android.R;
import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ClipsGridTabData.kt */
/* loaded from: classes17.dex */
public final class ClipsGridTabData {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ ClipsGridTabData[] $VALUES;
    public static final ClipsGridTabData CommonClips;
    public static final ClipsGridTabData DelayedPublications;
    public static final ClipsGridTabData Drafts;
    public static final ClipsGridTabData Favorites;
    public static final ClipsGridTabData LikedClips;
    public static final ClipsGridTabData OwnerClips;
    private final int iconResId;
    private final int smallIconResId;
    private final int titleResId;

    static {
        ClipsGridTabData clipsGridTabData = new ClipsGridTabData("OwnerClips", 0, R.drawable.vk_icon_play_rectangle_stack_outline_28, R.drawable.vk_icon_play_rectangle_stack_outline_20, R.string.clips_grid_uploaded_clips_title);
        OwnerClips = clipsGridTabData;
        ClipsGridTabData clipsGridTabData2 = new ClipsGridTabData("CommonClips", 1, R.drawable.vk_icon_play_rectangle_stack_outline_28, R.drawable.vk_icon_play_rectangle_stack_outline_20, R.string.clips_grid_uploaded_clips_title);
        CommonClips = clipsGridTabData2;
        ClipsGridTabData clipsGridTabData3 = new ClipsGridTabData("DelayedPublications", 2, R.drawable.vk_icon_history_forward_lock_outline_28, R.drawable.vk_icon_history_forward_lock_outline_20, R.string.clips_grid_delayed_publications_title);
        DelayedPublications = clipsGridTabData3;
        ClipsGridTabData clipsGridTabData4 = new ClipsGridTabData("Drafts", 3, R.drawable.vk_icon_pen_stack_lock_outline_28, R.drawable.vk_icon_pen_stack_lock_outline_20, R.string.clips_drafts_title);
        Drafts = clipsGridTabData4;
        ClipsGridTabData clipsGridTabData5 = new ClipsGridTabData("Favorites", 4, R.drawable.vk_icon_bookmark_outline_28, R.drawable.vk_icon_bookmark_outline_20, R.string.clips_grid_favorites_title);
        Favorites = clipsGridTabData5;
        ClipsGridTabData clipsGridTabData6 = new ClipsGridTabData("LikedClips", 5, R.drawable.vk_icon_like_lock_outline_28, R.drawable.vk_icon_like_lock_outline_20, R.string.clips_grid_likes_title);
        LikedClips = clipsGridTabData6;
        ClipsGridTabData[] clipsGridTabDataArr = {clipsGridTabData, clipsGridTabData2, clipsGridTabData3, clipsGridTabData4, clipsGridTabData5, clipsGridTabData6};
        $VALUES = clipsGridTabDataArr;
        $ENTRIES = new asp(clipsGridTabDataArr);
    }

    public ClipsGridTabData(String str, int i, int i2, int i3, int i4) {
        this.iconResId = i2;
        this.smallIconResId = i3;
        this.titleResId = i4;
    }

    public static ClipsGridTabData valueOf(String str) {
        return (ClipsGridTabData) Enum.valueOf(ClipsGridTabData.class, str);
    }

    public static ClipsGridTabData[] values() {
        return (ClipsGridTabData[]) $VALUES.clone();
    }

    public final int h() {
        return this.smallIconResId;
    }

    public final int i() {
        return this.titleResId;
    }
}
