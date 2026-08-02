package com.vk.clips.playlists;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.dto.common.id.UserId;
import xsna.zcl;

/* compiled from: ClipsPlaylistsSmallFoldersLaunchParams.kt */
/* loaded from: classes16.dex */
public final class ClipsPlaylistsSmallFoldersLaunchParams implements Parcelable {
    public static final Parcelable.Creator<ClipsPlaylistsSmallFoldersLaunchParams> CREATOR = new a();
    public final UserId b;
    public final boolean c;
    public final boolean d;
    public final String e;
    public final int f;

    /* compiled from: ClipsPlaylistsSmallFoldersLaunchParams.kt */
    public static final class a implements Parcelable.Creator<ClipsPlaylistsSmallFoldersLaunchParams> {
        @Override // android.os.Parcelable.Creator
        public final ClipsPlaylistsSmallFoldersLaunchParams createFromParcel(Parcel parcel) {
            return new ClipsPlaylistsSmallFoldersLaunchParams((UserId) parcel.readParcelable(ClipsPlaylistsSmallFoldersLaunchParams.class.getClassLoader()), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readString(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final ClipsPlaylistsSmallFoldersLaunchParams[] newArray(int i) {
            return new ClipsPlaylistsSmallFoldersLaunchParams[i];
        }
    }

    public ClipsPlaylistsSmallFoldersLaunchParams(UserId userId, boolean z, boolean z2, String str, int i) {
        this.b = userId;
        this.c = z;
        this.d = z2;
        this.e = str;
        this.f = i;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.b, i);
        parcel.writeInt(this.c ? 1 : 0);
        parcel.writeInt(this.d ? 1 : 0);
        parcel.writeString(this.e);
        parcel.writeInt(this.f);
    }

    public /* synthetic */ ClipsPlaylistsSmallFoldersLaunchParams(UserId userId, boolean z, boolean z2, String str, int i, int i2, zcl zclVar) {
        this(userId, z, z2, (i2 & 8) != 0 ? "" : str, (i2 & 16) != 0 ? -1 : i);
    }
}
