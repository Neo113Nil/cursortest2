package com.vk.libvideo.bottomsheet.videoplaylist;

import com.vkontakte.android.R;
import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: VideoPlaylistActionItem.kt */
/* loaded from: classes2.dex */
public final class VideoPlaylistActionItem {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ VideoPlaylistActionItem[] $VALUES;
    public static final VideoPlaylistActionItem ADD_VIDEO_BY_LINK;
    public static final VideoPlaylistActionItem COPY_LINK;
    public static final VideoPlaylistActionItem COPY_PLAYLIST_LINK;
    public static final VideoPlaylistActionItem EDIT_PLAYLIST;
    public static final VideoPlaylistActionItem GO_TO_AUTHOR;
    public static final VideoPlaylistActionItem REMOVE_PLAYLIST;
    public static final VideoPlaylistActionItem SHARE;
    public static final VideoPlaylistActionItem SHARE_PLAYLIST;
    public static final VideoPlaylistActionItem UPLOAD;
    private final int nameResId;

    static {
        VideoPlaylistActionItem videoPlaylistActionItem = new VideoPlaylistActionItem("UPLOAD", 0, R.string.video_playlist_bottom_menu_upload_video);
        UPLOAD = videoPlaylistActionItem;
        VideoPlaylistActionItem videoPlaylistActionItem2 = new VideoPlaylistActionItem("EDIT_PLAYLIST", 1, R.string.video_playlist_bottom_menu_edit_playlist);
        EDIT_PLAYLIST = videoPlaylistActionItem2;
        VideoPlaylistActionItem videoPlaylistActionItem3 = new VideoPlaylistActionItem("REMOVE_PLAYLIST", 2, R.string.video_playlist_bottom_menu_delete_playlist);
        REMOVE_PLAYLIST = videoPlaylistActionItem3;
        VideoPlaylistActionItem videoPlaylistActionItem4 = new VideoPlaylistActionItem("COPY_LINK", 3, R.string.copy_link);
        COPY_LINK = videoPlaylistActionItem4;
        VideoPlaylistActionItem videoPlaylistActionItem5 = new VideoPlaylistActionItem("COPY_PLAYLIST_LINK", 4, R.string.copy_link);
        COPY_PLAYLIST_LINK = videoPlaylistActionItem5;
        VideoPlaylistActionItem videoPlaylistActionItem6 = new VideoPlaylistActionItem("SHARE", 5, R.string.video_share);
        SHARE = videoPlaylistActionItem6;
        VideoPlaylistActionItem videoPlaylistActionItem7 = new VideoPlaylistActionItem("SHARE_PLAYLIST", 6, R.string.video_share_playlist);
        SHARE_PLAYLIST = videoPlaylistActionItem7;
        VideoPlaylistActionItem videoPlaylistActionItem8 = new VideoPlaylistActionItem("GO_TO_AUTHOR", 7, R.string.video_playlist_go_to_owner);
        GO_TO_AUTHOR = videoPlaylistActionItem8;
        VideoPlaylistActionItem videoPlaylistActionItem9 = new VideoPlaylistActionItem("ADD_VIDEO_BY_LINK", 8, R.string.video_playlist_bottom_menu_add_by_link);
        ADD_VIDEO_BY_LINK = videoPlaylistActionItem9;
        VideoPlaylistActionItem[] videoPlaylistActionItemArr = {videoPlaylistActionItem, videoPlaylistActionItem2, videoPlaylistActionItem3, videoPlaylistActionItem4, videoPlaylistActionItem5, videoPlaylistActionItem6, videoPlaylistActionItem7, videoPlaylistActionItem8, videoPlaylistActionItem9};
        $VALUES = videoPlaylistActionItemArr;
        $ENTRIES = new asp(videoPlaylistActionItemArr);
    }

    public VideoPlaylistActionItem(String str, int i, int i2) {
        this.nameResId = i2;
    }

    public static VideoPlaylistActionItem valueOf(String str) {
        return (VideoPlaylistActionItem) Enum.valueOf(VideoPlaylistActionItem.class, str);
    }

    public static VideoPlaylistActionItem[] values() {
        return (VideoPlaylistActionItem[]) $VALUES.clone();
    }

    public final int h() {
        return this.nameResId;
    }
}
