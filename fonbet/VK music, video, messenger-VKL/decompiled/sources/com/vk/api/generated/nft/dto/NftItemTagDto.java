package com.vk.api.generated.nft.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: NftItemTagDto.kt */
/* loaded from: classes15.dex */
public final class NftItemTagDto implements Parcelable {
    public static final Parcelable.Creator<NftItemTagDto> CREATOR = new a();

    @pmi0("name")
    private final String name;

    @pmi0("rarity")
    private final String rarity;

    @pmi0("value")
    private final String value;

    /* compiled from: NftItemTagDto.kt */
    public static final class a implements Parcelable.Creator<NftItemTagDto> {
        @Override // android.os.Parcelable.Creator
        public final NftItemTagDto createFromParcel(Parcel parcel) {
            return new NftItemTagDto(parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final NftItemTagDto[] newArray(int i) {
            return new NftItemTagDto[i];
        }
    }

    public NftItemTagDto() {
        this(null, null, null, 7, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NftItemTagDto)) {
            return false;
        }
        NftItemTagDto nftItemTagDto = (NftItemTagDto) obj;
        return epx.f(this.name, nftItemTagDto.name) && epx.f(this.value, nftItemTagDto.value) && epx.f(this.rarity, nftItemTagDto.rarity);
    }

    public final int hashCode() {
        String str = this.name;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.value;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.rarity;
        return hashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NftItemTagDto(name=");
        sb.append(this.name);
        sb.append(", value=");
        sb.append(this.value);
        sb.append(", rarity=");
        return ho8.a(sb, this.rarity, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.name);
        parcel.writeString(this.value);
        parcel.writeString(this.rarity);
    }

    public NftItemTagDto(String str, String str2, String str3) {
        this.name = str;
        this.value = str2;
        this.rarity = str3;
    }

    public /* synthetic */ NftItemTagDto(String str, String str2, String str3, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3);
    }
}
