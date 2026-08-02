package com.vk.video.ui.discovery.minimizable.player;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: VideoMiniPlayerAction.kt */
/* loaded from: classes7.dex */
public final class VideoMiniPlayerAction implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ VideoMiniPlayerAction[] $VALUES;
    public static final Parcelable.Creator<VideoMiniPlayerAction> CREATOR;
    public static final VideoMiniPlayerAction Error;
    public static final VideoMiniPlayerAction Loading;
    public static final VideoMiniPlayerAction Next;
    public static final VideoMiniPlayerAction Pause;
    public static final VideoMiniPlayerAction Play;
    public static final VideoMiniPlayerAction Replay;

    /* compiled from: VideoMiniPlayerAction.kt */
    public static final class a implements Parcelable.Creator<VideoMiniPlayerAction> {
        @Override // android.os.Parcelable.Creator
        public final VideoMiniPlayerAction createFromParcel(Parcel parcel) {
            return VideoMiniPlayerAction.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final VideoMiniPlayerAction[] newArray(int i) {
            return new VideoMiniPlayerAction[i];
        }
    }

    static {
        VideoMiniPlayerAction videoMiniPlayerAction = new VideoMiniPlayerAction("Play", 0);
        Play = videoMiniPlayerAction;
        VideoMiniPlayerAction videoMiniPlayerAction2 = new VideoMiniPlayerAction("Pause", 1);
        Pause = videoMiniPlayerAction2;
        VideoMiniPlayerAction videoMiniPlayerAction3 = new VideoMiniPlayerAction("Loading", 2);
        Loading = videoMiniPlayerAction3;
        VideoMiniPlayerAction videoMiniPlayerAction4 = new VideoMiniPlayerAction("Error", 3);
        Error = videoMiniPlayerAction4;
        VideoMiniPlayerAction videoMiniPlayerAction5 = new VideoMiniPlayerAction("Next", 4);
        Next = videoMiniPlayerAction5;
        VideoMiniPlayerAction videoMiniPlayerAction6 = new VideoMiniPlayerAction("Replay", 5);
        Replay = videoMiniPlayerAction6;
        VideoMiniPlayerAction[] videoMiniPlayerActionArr = {videoMiniPlayerAction, videoMiniPlayerAction2, videoMiniPlayerAction3, videoMiniPlayerAction4, videoMiniPlayerAction5, videoMiniPlayerAction6};
        $VALUES = videoMiniPlayerActionArr;
        $ENTRIES = new asp(videoMiniPlayerActionArr);
        CREATOR = new a();
    }

    public VideoMiniPlayerAction() {
        throw null;
    }

    public static VideoMiniPlayerAction valueOf(String str) {
        return (VideoMiniPlayerAction) Enum.valueOf(VideoMiniPlayerAction.class, str);
    }

    public static VideoMiniPlayerAction[] values() {
        return (VideoMiniPlayerAction[]) $VALUES.clone();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(name());
    }
}
