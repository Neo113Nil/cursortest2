package com.vk.voip.ui.watchmovie.selectsource.tabs.fragments;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.dto.common.id.UserId;
import xsna.epx;
import xsna.vu5;

/* compiled from: VoipPlaylistVideosConfig.kt */
/* loaded from: classes7.dex */
public final class VoipPlaylistVideosConfig implements Parcelable {
    public static final Parcelable.Creator<VoipPlaylistVideosConfig> CREATOR = new a();
    public final UserId b;
    public final int c;

    /* compiled from: VoipPlaylistVideosConfig.kt */
    public static final class a implements Parcelable.Creator<VoipPlaylistVideosConfig> {
        @Override // android.os.Parcelable.Creator
        public final VoipPlaylistVideosConfig createFromParcel(Parcel parcel) {
            return new VoipPlaylistVideosConfig((UserId) parcel.readParcelable(VoipPlaylistVideosConfig.class.getClassLoader()), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final VoipPlaylistVideosConfig[] newArray(int i) {
            return new VoipPlaylistVideosConfig[i];
        }
    }

    public VoipPlaylistVideosConfig(UserId userId, int i) {
        this.b = userId;
        this.c = i;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VoipPlaylistVideosConfig)) {
            return false;
        }
        VoipPlaylistVideosConfig voipPlaylistVideosConfig = (VoipPlaylistVideosConfig) obj;
        return epx.f(this.b, voipPlaylistVideosConfig.b) && this.c == voipPlaylistVideosConfig.c;
    }

    public final int hashCode() {
        UserId userId = this.b;
        return Integer.hashCode(this.c) + ((userId == null ? 0 : Long.hashCode(userId.b)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VoipPlaylistVideosConfig(ownerId=");
        sb.append(this.b);
        sb.append(", albumId=");
        return vu5.b(sb, this.c, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.b, i);
        parcel.writeInt(this.c);
    }
}
