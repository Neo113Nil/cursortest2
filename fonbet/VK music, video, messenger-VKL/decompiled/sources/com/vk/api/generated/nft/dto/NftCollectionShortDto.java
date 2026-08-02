package com.vk.api.generated.nft.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.pmi0;
import xsna.sn;
import xsna.tn;
import xsna.zcl;

/* compiled from: NftCollectionShortDto.kt */
/* loaded from: classes15.dex */
public final class NftCollectionShortDto implements Parcelable {
    public static final Parcelable.Creator<NftCollectionShortDto> CREATOR = new a();

    @pmi0("name")
    private final String name;

    @pmi0("verified")
    private final Boolean verified;

    /* compiled from: NftCollectionShortDto.kt */
    public static final class a implements Parcelable.Creator<NftCollectionShortDto> {
        @Override // android.os.Parcelable.Creator
        public final NftCollectionShortDto createFromParcel(Parcel parcel) {
            Boolean valueOf;
            String readString = parcel.readString();
            if (parcel.readInt() == 0) {
                valueOf = null;
            } else {
                valueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new NftCollectionShortDto(readString, valueOf);
        }

        @Override // android.os.Parcelable.Creator
        public final NftCollectionShortDto[] newArray(int i) {
            return new NftCollectionShortDto[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public NftCollectionShortDto() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NftCollectionShortDto)) {
            return false;
        }
        NftCollectionShortDto nftCollectionShortDto = (NftCollectionShortDto) obj;
        return epx.f(this.name, nftCollectionShortDto.name) && epx.f(this.verified, nftCollectionShortDto.verified);
    }

    public final int hashCode() {
        String str = this.name;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Boolean bool = this.verified;
        return hashCode + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NftCollectionShortDto(name=");
        sb.append(this.name);
        sb.append(", verified=");
        return tn.a(sb, this.verified, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.name);
        Boolean bool = this.verified;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool);
        }
    }

    public NftCollectionShortDto(String str, Boolean bool) {
        this.name = str;
        this.verified = bool;
    }

    public /* synthetic */ NftCollectionShortDto(String str, Boolean bool, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : bool);
    }
}
