package com.vk.libvideo.autoplay.background.notification;

import com.vkontakte.android.R;
import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: VideoNotificationAction.kt */
/* loaded from: classes2.dex */
public final class VideoNotificationAction {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ VideoNotificationAction[] $VALUES;
    public static final VideoNotificationAction CLOSE;
    public static final VideoNotificationAction PAUSE;
    public static final VideoNotificationAction PLAY;
    public static final VideoNotificationAction REPLAY;
    public static final VideoNotificationAction SEEK_BACKWARD;
    public static final VideoNotificationAction SEEK_BACKWARD_DISABLED;
    public static final VideoNotificationAction SEEK_FORWARD;
    public static final VideoNotificationAction SEEK_FORWARD_DISABLED;
    private final int description;
    private final boolean enabled;
    private final int icon;

    static {
        VideoNotificationAction videoNotificationAction = new VideoNotificationAction(0, R.drawable.vk_icon_play_28, "PLAY", R.string.video_accessibility_play, true);
        PLAY = videoNotificationAction;
        VideoNotificationAction videoNotificationAction2 = new VideoNotificationAction(1, R.drawable.vk_icon_pause_28, "PAUSE", R.string.video_accessibility_pause, true);
        PAUSE = videoNotificationAction2;
        VideoNotificationAction videoNotificationAction3 = new VideoNotificationAction(2, R.drawable.vk_icon_replay_28, "REPLAY", R.string.video_accessibility_replay, true);
        REPLAY = videoNotificationAction3;
        VideoNotificationAction videoNotificationAction4 = new VideoNotificationAction(3, R.drawable.vk_icon_forward_10_28, "SEEK_FORWARD", R.string.video_accessibility_seek_forward, true);
        SEEK_FORWARD = videoNotificationAction4;
        VideoNotificationAction videoNotificationAction5 = new VideoNotificationAction(4, R.drawable.vk_icon_forward_10_28, "SEEK_FORWARD_DISABLED", R.string.video_accessibility_seek_forward, false);
        SEEK_FORWARD_DISABLED = videoNotificationAction5;
        VideoNotificationAction videoNotificationAction6 = new VideoNotificationAction(5, R.drawable.vk_icon_replay_10_28, "SEEK_BACKWARD", R.string.video_accessibility_seek_backward, true);
        SEEK_BACKWARD = videoNotificationAction6;
        VideoNotificationAction videoNotificationAction7 = new VideoNotificationAction(6, R.drawable.vk_icon_replay_10_28, "SEEK_BACKWARD_DISABLED", R.string.video_accessibility_seek_backward, false);
        SEEK_BACKWARD_DISABLED = videoNotificationAction7;
        VideoNotificationAction videoNotificationAction8 = new VideoNotificationAction(7, R.drawable.vk_icon_cancel_24, "CLOSE", R.string.video_accessibility_close, true);
        CLOSE = videoNotificationAction8;
        VideoNotificationAction[] videoNotificationActionArr = {videoNotificationAction, videoNotificationAction2, videoNotificationAction3, videoNotificationAction4, videoNotificationAction5, videoNotificationAction6, videoNotificationAction7, videoNotificationAction8};
        $VALUES = videoNotificationActionArr;
        $ENTRIES = new asp(videoNotificationActionArr);
    }

    public VideoNotificationAction(int i, int i2, String str, int i3, boolean z) {
        this.icon = i2;
        this.description = i3;
        this.enabled = z;
    }

    public static VideoNotificationAction valueOf(String str) {
        return (VideoNotificationAction) Enum.valueOf(VideoNotificationAction.class, str);
    }

    public static VideoNotificationAction[] values() {
        return (VideoNotificationAction[]) $VALUES.clone();
    }

    public final int h() {
        return this.description;
    }

    public final boolean i() {
        return this.enabled;
    }

    public final int j() {
        return this.icon;
    }
}
