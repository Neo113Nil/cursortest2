package com.vk.clips.playlists;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.dto.common.id.UserId;
import xsna.hqe;
import xsna.zcl;

/* compiled from: ClipsPlaylistNamingLaunchParams.kt */
/* loaded from: classes16.dex */
public final class ClipsPlaylistNamingLaunchParams implements Parcelable {
    public static final Parcelable.Creator<ClipsPlaylistNamingLaunchParams> CREATOR = new a();
    public final UserId b;
    public final String c;
    public final boolean d;
    public final String e;
    public final int f;
    public final hqe g;

    /* compiled from: ClipsPlaylistNamingLaunchParams.kt */
    public static final class a implements Parcelable.Creator<ClipsPlaylistNamingLaunchParams> {
        @Override // android.os.Parcelable.Creator
        public final ClipsPlaylistNamingLaunchParams createFromParcel(Parcel parcel) {
            return new ClipsPlaylistNamingLaunchParams((UserId) parcel.readParcelable(ClipsPlaylistNamingLaunchParams.class.getClassLoader()), parcel.readString(), parcel.readInt() != 0, parcel.readString(), parcel.readInt(), null, 32, null);
        }

        @Override // android.os.Parcelable.Creator
        public final ClipsPlaylistNamingLaunchParams[] newArray(int i) {
            return new ClipsPlaylistNamingLaunchParams[i];
        }
    }

    static {
        new ClipsPlaylistNamingLaunchParams(UserId.d, "", true, null, 0, null, 56, null);
    }

    public ClipsPlaylistNamingLaunchParams(UserId userId, String str, boolean z, String str2, int i, hqe hqeVar) {
        this.b = userId;
        this.c = str;
        this.d = z;
        this.e = str2;
        this.f = i;
        this.g = hqeVar;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.b, i);
        parcel.writeString(this.c);
        parcel.writeInt(this.d ? 1 : 0);
        parcel.writeString(this.e);
        parcel.writeInt(this.f);
    }

    public /* synthetic */ ClipsPlaylistNamingLaunchParams(UserId userId, String str, boolean z, String str2, int i, hqe hqeVar, int i2, zcl zclVar) {
        this(userId, str, z, (i2 & 8) != 0 ? null : str2, (i2 & 16) != 0 ? -1 : i, (i2 & 32) != 0 ? null : hqeVar);
    }
}
