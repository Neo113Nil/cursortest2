package com.vk.clips.playlists;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.clips.sdk.shared.api.playlist.ClipsPlaylist;
import xsna.epx;
import xsna.hqe;
import xsna.qoy;
import xsna.zcl;

/* compiled from: ClipsPlaylistContentLaunchParams.kt */
/* loaded from: classes16.dex */
public final class ClipsPlaylistContentLaunchParams implements Parcelable {
    public static final Parcelable.Creator<ClipsPlaylistContentLaunchParams> CREATOR = new a();
    public final ClipsPlaylist b;
    public final String c;
    public final boolean d;
    public final boolean e;
    public final hqe f;

    /* compiled from: ClipsPlaylistContentLaunchParams.kt */
    public static final class a implements Parcelable.Creator<ClipsPlaylistContentLaunchParams> {
        @Override // android.os.Parcelable.Creator
        public final ClipsPlaylistContentLaunchParams createFromParcel(Parcel parcel) {
            return new ClipsPlaylistContentLaunchParams((ClipsPlaylist) parcel.readParcelable(ClipsPlaylistContentLaunchParams.class.getClassLoader()), parcel.readString(), parcel.readInt() != 0, parcel.readInt() != 0, null, 16, null);
        }

        @Override // android.os.Parcelable.Creator
        public final ClipsPlaylistContentLaunchParams[] newArray(int i) {
            return new ClipsPlaylistContentLaunchParams[i];
        }
    }

    public ClipsPlaylistContentLaunchParams(ClipsPlaylist clipsPlaylist, String str, boolean z, boolean z2, hqe hqeVar) {
        this.b = clipsPlaylist;
        this.c = str;
        this.d = z;
        this.e = z2;
        this.f = hqeVar;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ClipsPlaylistContentLaunchParams)) {
            return false;
        }
        ClipsPlaylistContentLaunchParams clipsPlaylistContentLaunchParams = (ClipsPlaylistContentLaunchParams) obj;
        return epx.f(this.b, clipsPlaylistContentLaunchParams.b) && epx.f(this.c, clipsPlaylistContentLaunchParams.c) && this.d == clipsPlaylistContentLaunchParams.d && this.e == clipsPlaylistContentLaunchParams.e && epx.f(this.f, clipsPlaylistContentLaunchParams.f);
    }

    public final int hashCode() {
        int hashCode = this.b.hashCode() * 31;
        String str = this.c;
        int b = qoy.b(qoy.b((hashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.d), 31, this.e);
        hqe hqeVar = this.f;
        return b + (hqeVar != null ? hqeVar.hashCode() : 0);
    }

    public final String toString() {
        return "ClipsPlaylistContentLaunchParams(playlist=" + this.b + ", targetClipId=" + this.c + ", isForceDarkTheme=" + this.d + ", requestPlaylistSize=" + this.e + ", eventsConsumer=" + this.f + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.b, i);
        parcel.writeString(this.c);
        parcel.writeInt(this.d ? 1 : 0);
        parcel.writeInt(this.e ? 1 : 0);
    }

    public /* synthetic */ ClipsPlaylistContentLaunchParams(ClipsPlaylist clipsPlaylist, String str, boolean z, boolean z2, hqe hqeVar, int i, zcl zclVar) {
        this(clipsPlaylist, (i & 2) != 0 ? null : str, (i & 4) != 0 ? false : z, (i & 8) != 0 ? false : z2, (i & 16) != 0 ? null : hqeVar);
    }
}
