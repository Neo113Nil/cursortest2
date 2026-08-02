package com.vk.api.generated.nft.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.sn;
import xsna.zcl;

/* compiled from: NftSetAvatarDto.kt */
/* loaded from: classes15.dex */
public final class NftSetAvatarDto implements Parcelable {
    public static final Parcelable.Creator<NftSetAvatarDto> CREATOR = new a();

    @pmi0("photo_max")
    private final String photoMax;

    @pmi0("photo_medium_rec")
    private final String photoMediumRec;

    @pmi0("photo_rec")
    private final String photoRec;

    @pmi0("success")
    private final Boolean success;

    /* compiled from: NftSetAvatarDto.kt */
    public static final class a implements Parcelable.Creator<NftSetAvatarDto> {
        @Override // android.os.Parcelable.Creator
        public final NftSetAvatarDto createFromParcel(Parcel parcel) {
            Boolean valueOf;
            if (parcel.readInt() == 0) {
                valueOf = null;
            } else {
                valueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new NftSetAvatarDto(valueOf, parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final NftSetAvatarDto[] newArray(int i) {
            return new NftSetAvatarDto[i];
        }
    }

    public NftSetAvatarDto() {
        this(null, null, null, null, 15, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NftSetAvatarDto)) {
            return false;
        }
        NftSetAvatarDto nftSetAvatarDto = (NftSetAvatarDto) obj;
        return epx.f(this.success, nftSetAvatarDto.success) && epx.f(this.photoRec, nftSetAvatarDto.photoRec) && epx.f(this.photoMediumRec, nftSetAvatarDto.photoMediumRec) && epx.f(this.photoMax, nftSetAvatarDto.photoMax);
    }

    public final int hashCode() {
        Boolean bool = this.success;
        int hashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        String str = this.photoRec;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.photoMediumRec;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.photoMax;
        return hashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NftSetAvatarDto(success=");
        sb.append(this.success);
        sb.append(", photoRec=");
        sb.append(this.photoRec);
        sb.append(", photoMediumRec=");
        sb.append(this.photoMediumRec);
        sb.append(", photoMax=");
        return ho8.a(sb, this.photoMax, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Boolean bool = this.success;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool);
        }
        parcel.writeString(this.photoRec);
        parcel.writeString(this.photoMediumRec);
        parcel.writeString(this.photoMax);
    }

    public NftSetAvatarDto(Boolean bool, String str, String str2, String str3) {
        this.success = bool;
        this.photoRec = str;
        this.photoMediumRec = str2;
        this.photoMax = str3;
    }

    public /* synthetic */ NftSetAvatarDto(Boolean bool, String str, String str2, String str3, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : bool, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3);
    }
}
