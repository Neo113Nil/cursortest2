package com.vk.video.ui.discovery.minimizable;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.vk.video.ui.discovery.minimizable.player.VideoMiniPlayerAction;
import com.vk.video.ui.discovery.minimizable.player.VideoPlayerState;
import defpackage.q0;
import xsna.epx;
import xsna.qoy;
import xsna.zcl;

/* compiled from: VideoMiniPlayerState.kt */
/* loaded from: classes7.dex */
public final class VideoMiniPlayerState implements Parcelable {
    public static final Parcelable.Creator<VideoMiniPlayerState> CREATOR = new a();
    public final CharSequence b;
    public final CharSequence c;
    public final VideoPlayerState d;
    public final VideoMiniPlayerAction e;
    public final boolean f;
    public final boolean g;

    /* compiled from: VideoMiniPlayerState.kt */
    public static final class a implements Parcelable.Creator<VideoMiniPlayerState> {
        @Override // android.os.Parcelable.Creator
        public final VideoMiniPlayerState createFromParcel(Parcel parcel) {
            CharSequence charSequence;
            CharSequence charSequence2;
            Parcelable.Creator creator = TextUtils.CHAR_SEQUENCE_CREATOR;
            CharSequence charSequence3 = (CharSequence) creator.createFromParcel(parcel);
            CharSequence charSequence4 = (CharSequence) creator.createFromParcel(parcel);
            VideoPlayerState createFromParcel = VideoPlayerState.CREATOR.createFromParcel(parcel);
            VideoMiniPlayerAction createFromParcel2 = VideoMiniPlayerAction.CREATOR.createFromParcel(parcel);
            boolean z = false;
            boolean z2 = parcel.readInt() != 0;
            if (parcel.readInt() != 0) {
                charSequence = charSequence4;
                charSequence2 = charSequence3;
                z = true;
            } else {
                charSequence = charSequence4;
                charSequence2 = charSequence3;
            }
            return new VideoMiniPlayerState(charSequence2, charSequence, createFromParcel, createFromParcel2, z2, z);
        }

        @Override // android.os.Parcelable.Creator
        public final VideoMiniPlayerState[] newArray(int i) {
            return new VideoMiniPlayerState[i];
        }
    }

    public VideoMiniPlayerState(CharSequence charSequence, CharSequence charSequence2, VideoPlayerState videoPlayerState, VideoMiniPlayerAction videoMiniPlayerAction, boolean z, boolean z2) {
        this.b = charSequence;
        this.c = charSequence2;
        this.d = videoPlayerState;
        this.e = videoMiniPlayerAction;
        this.f = z;
        this.g = z2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v7, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r9v2, types: [java.lang.CharSequence] */
    public static VideoMiniPlayerState a(VideoMiniPlayerState videoMiniPlayerState, String str, String str2, VideoPlayerState videoPlayerState, VideoMiniPlayerAction videoMiniPlayerAction, boolean z, boolean z2, int i) {
        String str3 = str;
        if ((i & 1) != 0) {
            str3 = videoMiniPlayerState.b;
        }
        String str4 = str3;
        String str5 = str2;
        if ((i & 2) != 0) {
            str5 = videoMiniPlayerState.c;
        }
        String str6 = str5;
        if ((i & 4) != 0) {
            videoPlayerState = videoMiniPlayerState.d;
        }
        VideoPlayerState videoPlayerState2 = videoPlayerState;
        if ((i & 8) != 0) {
            videoMiniPlayerAction = videoMiniPlayerState.e;
        }
        VideoMiniPlayerAction videoMiniPlayerAction2 = videoMiniPlayerAction;
        if ((i & 16) != 0) {
            z = videoMiniPlayerState.f;
        }
        boolean z3 = z;
        if ((i & 32) != 0) {
            z2 = videoMiniPlayerState.g;
        }
        videoMiniPlayerState.getClass();
        return new VideoMiniPlayerState(str4, str6, videoPlayerState2, videoMiniPlayerAction2, z3, z2);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VideoMiniPlayerState)) {
            return false;
        }
        VideoMiniPlayerState videoMiniPlayerState = (VideoMiniPlayerState) obj;
        return epx.f(this.b, videoMiniPlayerState.b) && epx.f(this.c, videoMiniPlayerState.c) && epx.f(this.d, videoMiniPlayerState.d) && this.e == videoMiniPlayerState.e && this.f == videoMiniPlayerState.f && this.g == videoMiniPlayerState.g;
    }

    public final int hashCode() {
        CharSequence charSequence = this.b;
        int hashCode = (charSequence == null ? 0 : charSequence.hashCode()) * 31;
        CharSequence charSequence2 = this.c;
        return Boolean.hashCode(this.g) + qoy.b((this.e.hashCode() + ((this.d.hashCode() + ((hashCode + (charSequence2 != null ? charSequence2.hashCode() : 0)) * 31)) * 31)) * 31, 31, this.f);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VideoMiniPlayerState(titleText=");
        sb.append((Object) this.b);
        sb.append(", subtitleText=");
        sb.append((Object) this.c);
        sb.append(", playerState=");
        sb.append(this.d);
        sb.append(", miniPlayerAction=");
        sb.append(this.e);
        sb.append(", isPlayerControlsVisible=");
        sb.append(this.f);
        sb.append(", isAdActive=");
        return q0.a(sb, this.g, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        TextUtils.writeToParcel(this.b, parcel, i);
        TextUtils.writeToParcel(this.c, parcel, i);
        this.d.writeToParcel(parcel, i);
        this.e.writeToParcel(parcel, i);
        parcel.writeInt(this.f ? 1 : 0);
        parcel.writeInt(this.g ? 1 : 0);
    }

    public /* synthetic */ VideoMiniPlayerState(CharSequence charSequence, CharSequence charSequence2, VideoPlayerState videoPlayerState, VideoMiniPlayerAction videoMiniPlayerAction, boolean z, boolean z2, int i, zcl zclVar) {
        this(charSequence, charSequence2, videoPlayerState, videoMiniPlayerAction, z, (i & 32) != 0 ? false : z2);
    }
}
