package com.vk.libvideo.offline;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: VideoDownloadNotifierReceiver.kt */
/* loaded from: classes3.dex */
public final class VideoDownloadNotifierReceiver$Companion$Actions {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ VideoDownloadNotifierReceiver$Companion$Actions[] $VALUES;
    public static final VideoDownloadNotifierReceiver$Companion$Actions ACTION_CANCEL;
    public static final VideoDownloadNotifierReceiver$Companion$Actions ACTION_CLICK;
    public static final VideoDownloadNotifierReceiver$Companion$Actions ACTION_PAUSE;
    public static final VideoDownloadNotifierReceiver$Companion$Actions ACTION_RESUME;
    private final String title;

    static {
        VideoDownloadNotifierReceiver$Companion$Actions videoDownloadNotifierReceiver$Companion$Actions = new VideoDownloadNotifierReceiver$Companion$Actions("ACTION_CLICK", 0, "com.vk.libvideo.offline.VideoDownloadNotifierReceiver.ACTION_CLICK");
        ACTION_CLICK = videoDownloadNotifierReceiver$Companion$Actions;
        VideoDownloadNotifierReceiver$Companion$Actions videoDownloadNotifierReceiver$Companion$Actions2 = new VideoDownloadNotifierReceiver$Companion$Actions("ACTION_PAUSE", 1, "com.vk.libvideo.offline.VideoDownloadNotifierReceiver.ACTION_PAUSE");
        ACTION_PAUSE = videoDownloadNotifierReceiver$Companion$Actions2;
        VideoDownloadNotifierReceiver$Companion$Actions videoDownloadNotifierReceiver$Companion$Actions3 = new VideoDownloadNotifierReceiver$Companion$Actions("ACTION_RESUME", 2, "com.vk.libvideo.offline.VideoDownloadNotifierReceiver.ACTION_RESUME");
        ACTION_RESUME = videoDownloadNotifierReceiver$Companion$Actions3;
        VideoDownloadNotifierReceiver$Companion$Actions videoDownloadNotifierReceiver$Companion$Actions4 = new VideoDownloadNotifierReceiver$Companion$Actions("ACTION_CANCEL", 3, "com.vk.libvideo.offline.VideoDownloadNotifierReceiver.ACTION_CANCEL");
        ACTION_CANCEL = videoDownloadNotifierReceiver$Companion$Actions4;
        VideoDownloadNotifierReceiver$Companion$Actions[] videoDownloadNotifierReceiver$Companion$ActionsArr = {videoDownloadNotifierReceiver$Companion$Actions, videoDownloadNotifierReceiver$Companion$Actions2, videoDownloadNotifierReceiver$Companion$Actions3, videoDownloadNotifierReceiver$Companion$Actions4};
        $VALUES = videoDownloadNotifierReceiver$Companion$ActionsArr;
        $ENTRIES = new asp(videoDownloadNotifierReceiver$Companion$ActionsArr);
    }

    public VideoDownloadNotifierReceiver$Companion$Actions(String str, int i, String str2) {
        this.title = str2;
    }

    public static VideoDownloadNotifierReceiver$Companion$Actions valueOf(String str) {
        return (VideoDownloadNotifierReceiver$Companion$Actions) Enum.valueOf(VideoDownloadNotifierReceiver$Companion$Actions.class, str);
    }

    public static VideoDownloadNotifierReceiver$Companion$Actions[] values() {
        return (VideoDownloadNotifierReceiver$Companion$Actions[]) $VALUES.clone();
    }

    public final String getTitle() {
        return this.title;
    }
}
