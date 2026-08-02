package com.vk.api.generated.nft.dto;

import android.os.Parcel;
import android.os.Parcelable;
import ru.ok.android.api.core.ApiInvocationException;
import xsna.epx;
import xsna.nr;
import xsna.pmi0;
import xsna.sn;
import xsna.tn;
import xsna.zcl;

/* compiled from: NftOriginMetadataDto.kt */
/* loaded from: classes15.dex */
public final class NftOriginMetadataDto implements Parcelable {
    public static final Parcelable.Creator<NftOriginMetadataDto> CREATOR = new a();

    @pmi0("confirmed")
    private final Boolean confirmed;

    @pmi0("image")
    private final String image;

    @pmi0("is_internal")
    private final Boolean isInternal;

    @pmi0("is_nft_avatar")
    private final Boolean isNftAvatar;

    @pmi0("link")
    private final String link;

    @pmi0("name")
    private final String name;

    @pmi0("origin_type")
    private final String originType;

    @pmi0("type_name")
    private final String typeName;

    @pmi0("vk_user_id")
    private final Integer vkUserId;

    /* compiled from: NftOriginMetadataDto.kt */
    public static final class a implements Parcelable.Creator<NftOriginMetadataDto> {
        @Override // android.os.Parcelable.Creator
        public final NftOriginMetadataDto createFromParcel(Parcel parcel) {
            Boolean valueOf;
            Boolean valueOf2;
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            String readString4 = parcel.readString();
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
            String readString5 = parcel.readString();
            Integer valueOf3 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            if (parcel.readInt() != 0) {
                bool = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new NftOriginMetadataDto(readString, readString2, readString3, readString4, valueOf, valueOf2, readString5, valueOf3, bool);
        }

        @Override // android.os.Parcelable.Creator
        public final NftOriginMetadataDto[] newArray(int i) {
            return new NftOriginMetadataDto[i];
        }
    }

    public NftOriginMetadataDto() {
        this(null, null, null, null, null, null, null, null, null, ApiInvocationException.ErrorCodes.IDS_BLOCKED, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NftOriginMetadataDto)) {
            return false;
        }
        NftOriginMetadataDto nftOriginMetadataDto = (NftOriginMetadataDto) obj;
        return epx.f(this.name, nftOriginMetadataDto.name) && epx.f(this.typeName, nftOriginMetadataDto.typeName) && epx.f(this.image, nftOriginMetadataDto.image) && epx.f(this.link, nftOriginMetadataDto.link) && epx.f(this.confirmed, nftOriginMetadataDto.confirmed) && epx.f(this.isInternal, nftOriginMetadataDto.isInternal) && epx.f(this.originType, nftOriginMetadataDto.originType) && epx.f(this.vkUserId, nftOriginMetadataDto.vkUserId) && epx.f(this.isNftAvatar, nftOriginMetadataDto.isNftAvatar);
    }

    public final int hashCode() {
        String str = this.name;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.typeName;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.image;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.link;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Boolean bool = this.confirmed;
        int hashCode5 = (hashCode4 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.isInternal;
        int hashCode6 = (hashCode5 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        String str5 = this.originType;
        int hashCode7 = (hashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Integer num = this.vkUserId;
        int hashCode8 = (hashCode7 + (num == null ? 0 : num.hashCode())) * 31;
        Boolean bool3 = this.isNftAvatar;
        return hashCode8 + (bool3 != null ? bool3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NftOriginMetadataDto(name=");
        sb.append(this.name);
        sb.append(", typeName=");
        sb.append(this.typeName);
        sb.append(", image=");
        sb.append(this.image);
        sb.append(", link=");
        sb.append(this.link);
        sb.append(", confirmed=");
        sb.append(this.confirmed);
        sb.append(", isInternal=");
        sb.append(this.isInternal);
        sb.append(", originType=");
        sb.append(this.originType);
        sb.append(", vkUserId=");
        sb.append(this.vkUserId);
        sb.append(", isNftAvatar=");
        return tn.a(sb, this.isNftAvatar, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.name);
        parcel.writeString(this.typeName);
        parcel.writeString(this.image);
        parcel.writeString(this.link);
        Boolean bool = this.confirmed;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool);
        }
        Boolean bool2 = this.isInternal;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool2);
        }
        parcel.writeString(this.originType);
        Integer num = this.vkUserId;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
        Boolean bool3 = this.isNftAvatar;
        if (bool3 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool3);
        }
    }

    public NftOriginMetadataDto(String str, String str2, String str3, String str4, Boolean bool, Boolean bool2, String str5, Integer num, Boolean bool3) {
        this.name = str;
        this.typeName = str2;
        this.image = str3;
        this.link = str4;
        this.confirmed = bool;
        this.isInternal = bool2;
        this.originType = str5;
        this.vkUserId = num;
        this.isNftAvatar = bool3;
    }

    public /* synthetic */ NftOriginMetadataDto(String str, String str2, String str3, String str4, Boolean bool, Boolean bool2, String str5, Integer num, Boolean bool3, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : bool, (i & 32) != 0 ? null : bool2, (i & 64) != 0 ? null : str5, (i & 128) != 0 ? null : num, (i & 256) != 0 ? null : bool3);
    }
}
