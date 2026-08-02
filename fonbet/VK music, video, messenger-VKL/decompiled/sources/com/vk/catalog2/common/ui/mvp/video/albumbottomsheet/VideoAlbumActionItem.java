package com.vk.catalog2.common.ui.mvp.video.albumbottomsheet;

import com.vkontakte.android.R;
import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: VideoAlbumActionItem.kt */
/* loaded from: classes16.dex */
public final class VideoAlbumActionItem {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ VideoAlbumActionItem[] $VALUES;
    public static final VideoAlbumActionItem COPY_LINK;
    public static final VideoAlbumActionItem COPY_PLAYLIST_LINK;
    public static final VideoAlbumActionItem EDIT_PLAYLIST;
    public static final VideoAlbumActionItem GO_TO_AUTHOR;
    public static final VideoAlbumActionItem PLAYLIST_ADD_VIDEO;
    public static final VideoAlbumActionItem REMOVE_PLAYLIST;
    public static final VideoAlbumActionItem SHARE;
    public static final VideoAlbumActionItem SHARE_PLAYLIST;
    public static final VideoAlbumActionItem SUBSCRIBE;
    public static final VideoAlbumActionItem UNSUBSCRIBE;
    private final int nameResId;

    static {
        VideoAlbumActionItem videoAlbumActionItem = new VideoAlbumActionItem("PLAYLIST_ADD_VIDEO", 0, R.string.video_playlist_bottom_menu_playlist_add_video);
        PLAYLIST_ADD_VIDEO = videoAlbumActionItem;
        VideoAlbumActionItem videoAlbumActionItem2 = new VideoAlbumActionItem("EDIT_PLAYLIST", 1, R.string.video_playlist_bottom_menu_edit_playlist);
        EDIT_PLAYLIST = videoAlbumActionItem2;
        VideoAlbumActionItem videoAlbumActionItem3 = new VideoAlbumActionItem("REMOVE_PLAYLIST", 2, R.string.video_playlist_bottom_menu_delete_playlist);
        REMOVE_PLAYLIST = videoAlbumActionItem3;
        VideoAlbumActionItem videoAlbumActionItem4 = new VideoAlbumActionItem("COPY_LINK", 3, R.string.copy_link);
        COPY_LINK = videoAlbumActionItem4;
        VideoAlbumActionItem videoAlbumActionItem5 = new VideoAlbumActionItem("COPY_PLAYLIST_LINK", 4, R.string.copy_link);
        COPY_PLAYLIST_LINK = videoAlbumActionItem5;
        VideoAlbumActionItem videoAlbumActionItem6 = new VideoAlbumActionItem("SHARE", 5, R.string.video_share);
        SHARE = videoAlbumActionItem6;
        VideoAlbumActionItem videoAlbumActionItem7 = new VideoAlbumActionItem("SHARE_PLAYLIST", 6, R.string.video_share_playlist);
        SHARE_PLAYLIST = videoAlbumActionItem7;
        VideoAlbumActionItem videoAlbumActionItem8 = new VideoAlbumActionItem("UNSUBSCRIBE", 7, R.string.video_album_unsubscribe);
        UNSUBSCRIBE = videoAlbumActionItem8;
        VideoAlbumActionItem videoAlbumActionItem9 = new VideoAlbumActionItem("SUBSCRIBE", 8, R.string.video_album_subscribe);
        SUBSCRIBE = videoAlbumActionItem9;
        VideoAlbumActionItem videoAlbumActionItem10 = new VideoAlbumActionItem("GO_TO_AUTHOR", 9, R.string.video_playlist_go_to_owner);
        GO_TO_AUTHOR = videoAlbumActionItem10;
        VideoAlbumActionItem[] videoAlbumActionItemArr = {videoAlbumActionItem, videoAlbumActionItem2, videoAlbumActionItem3, videoAlbumActionItem4, videoAlbumActionItem5, videoAlbumActionItem6, videoAlbumActionItem7, videoAlbumActionItem8, videoAlbumActionItem9, videoAlbumActionItem10};
        $VALUES = videoAlbumActionItemArr;
        $ENTRIES = new asp(videoAlbumActionItemArr);
    }

    public VideoAlbumActionItem(String str, int i, int i2) {
        this.nameResId = i2;
    }

    public static VideoAlbumActionItem valueOf(String str) {
        return (VideoAlbumActionItem) Enum.valueOf(VideoAlbumActionItem.class, str);
    }

    public static VideoAlbumActionItem[] values() {
        return (VideoAlbumActionItem[]) $VALUES.clone();
    }

    public final int h() {
        return this.nameResId;
    }
}
