package com.vk.api.generated.shortVideo.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.pmi0;
import xsna.sn;
import xsna.tn;
import xsna.zcl;

/* compiled from: ShortVideoGetDeviceBlacklistsResponseDto.kt */
/* loaded from: classes15.dex */
public final class ShortVideoGetDeviceBlacklistsResponseDto implements Parcelable {
    public static final Parcelable.Creator<ShortVideoGetDeviceBlacklistsResponseDto> CREATOR = new a();

    @pmi0("codec_blacklist")
    private final Boolean codecBlacklist;

    @pmi0("morphing_blacklist")
    private final Boolean morphingBlacklist;

    @pmi0("tf_blacklist")
    private final Boolean tfBlacklist;

    /* compiled from: ShortVideoGetDeviceBlacklistsResponseDto.kt */
    public static final class a implements Parcelable.Creator<ShortVideoGetDeviceBlacklistsResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final ShortVideoGetDeviceBlacklistsResponseDto createFromParcel(Parcel parcel) {
            Boolean valueOf;
            Boolean valueOf2;
            Boolean bool = null;
            if (parcel.readInt() == 0) {
                valueOf = null;
            } else {
                valueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                valueOf2 = null;
            } else {
                valueOf2 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() != 0) {
                bool = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new ShortVideoGetDeviceBlacklistsResponseDto(valueOf, valueOf2, bool);
        }

        @Override // android.os.Parcelable.Creator
        public final ShortVideoGetDeviceBlacklistsResponseDto[] newArray(int i) {
            return new ShortVideoGetDeviceBlacklistsResponseDto[i];
        }
    }

    public ShortVideoGetDeviceBlacklistsResponseDto() {
        this(null, null, null, 7, null);
    }

    public final Boolean d() {
        return this.codecBlacklist;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final Boolean e() {
        return this.morphingBlacklist;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ShortVideoGetDeviceBlacklistsResponseDto)) {
            return false;
        }
        ShortVideoGetDeviceBlacklistsResponseDto shortVideoGetDeviceBlacklistsResponseDto = (ShortVideoGetDeviceBlacklistsResponseDto) obj;
        return epx.f(this.tfBlacklist, shortVideoGetDeviceBlacklistsResponseDto.tfBlacklist) && epx.f(this.morphingBlacklist, shortVideoGetDeviceBlacklistsResponseDto.morphingBlacklist) && epx.f(this.codecBlacklist, shortVideoGetDeviceBlacklistsResponseDto.codecBlacklist);
    }

    public final Boolean f() {
        return this.tfBlacklist;
    }

    public final int hashCode() {
        Boolean bool = this.tfBlacklist;
        int hashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Boolean bool2 = this.morphingBlacklist;
        int hashCode2 = (hashCode + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.codecBlacklist;
        return hashCode2 + (bool3 != null ? bool3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ShortVideoGetDeviceBlacklistsResponseDto(tfBlacklist=");
        sb.append(this.tfBlacklist);
        sb.append(", morphingBlacklist=");
        sb.append(this.morphingBlacklist);
        sb.append(", codecBlacklist=");
        return tn.a(sb, this.codecBlacklist, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Boolean bool = this.tfBlacklist;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool);
        }
        Boolean bool2 = this.morphingBlacklist;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool2);
        }
        Boolean bool3 = this.codecBlacklist;
        if (bool3 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool3);
        }
    }

    public ShortVideoGetDeviceBlacklistsResponseDto(Boolean bool, Boolean bool2, Boolean bool3) {
        this.tfBlacklist = bool;
        this.morphingBlacklist = bool2;
        this.codecBlacklist = bool3;
    }

    public /* synthetic */ ShortVideoGetDeviceBlacklistsResponseDto(Boolean bool, Boolean bool2, Boolean bool3, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : bool, (i & 2) != 0 ? null : bool2, (i & 4) != 0 ? null : bool3);
    }
}
