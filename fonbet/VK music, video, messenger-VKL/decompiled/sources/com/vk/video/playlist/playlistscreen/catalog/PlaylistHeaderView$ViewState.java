package com.vk.video.playlist.playlistscreen.catalog;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.catalog.mvi.block.BlockId;
import xsna.r2a;
import xsna.zcl;

/* compiled from: PlaylistHeaderView.kt */
/* loaded from: classes6.dex */
final class PlaylistHeaderView$ViewState implements r2a, Parcelable {
    public static final Parcelable.Creator<PlaylistHeaderView$ViewState> CREATOR = new a();
    public final String b;
    public final String c;
    public final String d;
    public final boolean e;
    public final boolean f;

    /* compiled from: PlaylistHeaderView.kt */
    public static final class a implements Parcelable.Creator<PlaylistHeaderView$ViewState> {
        @Override // android.os.Parcelable.Creator
        public final PlaylistHeaderView$ViewState createFromParcel(Parcel parcel) {
            return new PlaylistHeaderView$ViewState(((BlockId.Simple) parcel.readParcelable(PlaylistHeaderView$ViewState.class.getClassLoader())).b, parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readInt() != 0, null);
        }

        @Override // android.os.Parcelable.Creator
        public final PlaylistHeaderView$ViewState[] newArray(int i) {
            return new PlaylistHeaderView$ViewState[i];
        }
    }

    public PlaylistHeaderView$ViewState(String str, String str2, String str3, boolean z, boolean z2, zcl zclVar) {
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = z;
        this.f = z2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // xsna.r2a
    public final BlockId w() {
        return new BlockId.Simple(this.b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(new BlockId.Simple(this.b), i);
        parcel.writeString(this.c);
        parcel.writeString(this.d);
        parcel.writeInt(this.e ? 1 : 0);
        parcel.writeInt(this.f ? 1 : 0);
    }
}
