package com.vk.video.ui.upload.impl.videoviewer.presentation.feature.entity;

import android.os.Parcel;
import android.os.Parcelable;
import one.video.player.OneVideoPlayer;
import xsna.bh10;
import xsna.epx;
import xsna.lm50;
import xsna.qoy;
import xsna.vu5;
import xsna.xk80;
import xsna.zcl;

/* compiled from: VideoViewerState.kt */
/* loaded from: classes7.dex */
public final class VideoViewerState implements lm50, Parcelable {
    public static final Parcelable.Creator<VideoViewerState> CREATOR = new a();
    public final xk80 b;
    public final OneVideoPlayer.d c;
    public final boolean d;
    public final long e;
    public final long f;

    /* compiled from: VideoViewerState.kt */
    public static final class a implements Parcelable.Creator<VideoViewerState> {
        @Override // android.os.Parcelable.Creator
        public final VideoViewerState createFromParcel(Parcel parcel) {
            return new VideoViewerState(null, null, parcel.readInt() != 0, parcel.readLong(), parcel.readLong(), 3, null);
        }

        @Override // android.os.Parcelable.Creator
        public final VideoViewerState[] newArray(int i) {
            return new VideoViewerState[i];
        }
    }

    public VideoViewerState() {
        this(null, null, false, 0L, 0L, 31, null);
    }

    public static VideoViewerState a(VideoViewerState videoViewerState, xk80 xk80Var, OneVideoPlayer.d dVar, boolean z, long j, long j2, int i) {
        if ((i & 1) != 0) {
            xk80Var = videoViewerState.b;
        }
        xk80 xk80Var2 = xk80Var;
        if ((i & 2) != 0) {
            dVar = videoViewerState.c;
        }
        OneVideoPlayer.d dVar2 = dVar;
        if ((i & 4) != 0) {
            z = videoViewerState.d;
        }
        boolean z2 = z;
        if ((i & 8) != 0) {
            j = videoViewerState.e;
        }
        long j3 = j;
        if ((i & 16) != 0) {
            j2 = videoViewerState.f;
        }
        videoViewerState.getClass();
        return new VideoViewerState(xk80Var2, dVar2, z2, j3, j2);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VideoViewerState)) {
            return false;
        }
        VideoViewerState videoViewerState = (VideoViewerState) obj;
        return epx.f(this.b, videoViewerState.b) && epx.f(this.c, videoViewerState.c) && this.d == videoViewerState.d && this.e == videoViewerState.e && this.f == videoViewerState.f;
    }

    public final int hashCode() {
        xk80 xk80Var = this.b;
        int hashCode = (xk80Var == null ? 0 : xk80Var.hashCode()) * 31;
        OneVideoPlayer.d dVar = this.c;
        return Long.hashCode(this.f) + bh10.a(qoy.b((hashCode + (dVar != null ? dVar.hashCode() : 0)) * 31, 31, this.d), 31, this.e);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VideoViewerState(player=");
        sb.append(this.b);
        sb.append(", listener=");
        sb.append(this.c);
        sb.append(", shouldPlay=");
        sb.append(this.d);
        sb.append(", durationMs=");
        sb.append(this.e);
        sb.append(", currentPos=");
        return vu5.a(')', this.f, sb);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.d ? 1 : 0);
        parcel.writeLong(this.e);
        parcel.writeLong(this.f);
    }

    public VideoViewerState(xk80 xk80Var, OneVideoPlayer.d dVar, boolean z, long j, long j2) {
        this.b = xk80Var;
        this.c = dVar;
        this.d = z;
        this.e = j;
        this.f = j2;
    }

    public /* synthetic */ VideoViewerState(xk80 xk80Var, OneVideoPlayer.d dVar, boolean z, long j, long j2, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : xk80Var, (i & 2) != 0 ? null : dVar, (i & 4) != 0 ? true : z, (i & 8) != 0 ? 0L : j, (i & 16) != 0 ? 0L : j2);
    }
}
