package com.vk.api.generated.wall.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.pmi0;
import xsna.sn;
import xsna.tn;
import xsna.zcl;

/* compiled from: WallPostingSettingsPostDto.kt */
/* loaded from: classes15.dex */
public final class WallPostingSettingsPostDto implements Parcelable {
    public static final Parcelable.Creator<WallPostingSettingsPostDto> CREATOR = new a();

    @pmi0("is_ads")
    private final Boolean isAds;

    @pmi0("max_length")
    private final int maxLength;

    @pmi0("mute_notifications")
    private final Boolean muteNotifications;

    /* compiled from: WallPostingSettingsPostDto.kt */
    public static final class a implements Parcelable.Creator<WallPostingSettingsPostDto> {
        @Override // android.os.Parcelable.Creator
        public final WallPostingSettingsPostDto createFromParcel(Parcel parcel) {
            Boolean valueOf;
            int readInt = parcel.readInt();
            Boolean bool = null;
            if (parcel.readInt() == 0) {
                valueOf = null;
            } else {
                valueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() != 0) {
                bool = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new WallPostingSettingsPostDto(readInt, valueOf, bool);
        }

        @Override // android.os.Parcelable.Creator
        public final WallPostingSettingsPostDto[] newArray(int i) {
            return new WallPostingSettingsPostDto[i];
        }
    }

    public WallPostingSettingsPostDto(int i, Boolean bool, Boolean bool2) {
        this.maxLength = i;
        this.isAds = bool;
        this.muteNotifications = bool2;
    }

    public final int d() {
        return this.maxLength;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final Boolean e() {
        return this.muteNotifications;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WallPostingSettingsPostDto)) {
            return false;
        }
        WallPostingSettingsPostDto wallPostingSettingsPostDto = (WallPostingSettingsPostDto) obj;
        return this.maxLength == wallPostingSettingsPostDto.maxLength && epx.f(this.isAds, wallPostingSettingsPostDto.isAds) && epx.f(this.muteNotifications, wallPostingSettingsPostDto.muteNotifications);
    }

    public final int hashCode() {
        int hashCode = Integer.hashCode(this.maxLength) * 31;
        Boolean bool = this.isAds;
        int hashCode2 = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.muteNotifications;
        return hashCode2 + (bool2 != null ? bool2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("WallPostingSettingsPostDto(maxLength=");
        sb.append(this.maxLength);
        sb.append(", isAds=");
        sb.append(this.isAds);
        sb.append(", muteNotifications=");
        return tn.a(sb, this.muteNotifications, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.maxLength);
        Boolean bool = this.isAds;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool);
        }
        Boolean bool2 = this.muteNotifications;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool2);
        }
    }

    public /* synthetic */ WallPostingSettingsPostDto(int i, Boolean bool, Boolean bool2, int i2, zcl zclVar) {
        this(i, (i2 & 2) != 0 ? null : bool, (i2 & 4) != 0 ? null : bool2);
    }
}
