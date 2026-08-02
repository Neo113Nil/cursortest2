package com.vk.api.generated.catalog.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: CatalogBlockAnchorInfoDto.kt */
/* loaded from: classes14.dex */
public final class CatalogBlockAnchorInfoDto implements Parcelable {
    public static final Parcelable.Creator<CatalogBlockAnchorInfoDto> CREATOR = new a();

    @pmi0("product_data")
    private final String productData;

    @pmi0("ref")
    private final String ref;

    @pmi0("tag")
    private final String tag;

    @pmi0("token")
    private final String token;

    /* compiled from: CatalogBlockAnchorInfoDto.kt */
    public static final class a implements Parcelable.Creator<CatalogBlockAnchorInfoDto> {
        @Override // android.os.Parcelable.Creator
        public final CatalogBlockAnchorInfoDto createFromParcel(Parcel parcel) {
            return new CatalogBlockAnchorInfoDto(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final CatalogBlockAnchorInfoDto[] newArray(int i) {
            return new CatalogBlockAnchorInfoDto[i];
        }
    }

    public CatalogBlockAnchorInfoDto() {
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
        if (!(obj instanceof CatalogBlockAnchorInfoDto)) {
            return false;
        }
        CatalogBlockAnchorInfoDto catalogBlockAnchorInfoDto = (CatalogBlockAnchorInfoDto) obj;
        return epx.f(this.tag, catalogBlockAnchorInfoDto.tag) && epx.f(this.token, catalogBlockAnchorInfoDto.token) && epx.f(this.ref, catalogBlockAnchorInfoDto.ref) && epx.f(this.productData, catalogBlockAnchorInfoDto.productData);
    }

    public final int hashCode() {
        String str = this.tag;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.token;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.ref;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.productData;
        return hashCode3 + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CatalogBlockAnchorInfoDto(tag=");
        sb.append(this.tag);
        sb.append(", token=");
        sb.append(this.token);
        sb.append(", ref=");
        sb.append(this.ref);
        sb.append(", productData=");
        return ho8.a(sb, this.productData, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.tag);
        parcel.writeString(this.token);
        parcel.writeString(this.ref);
        parcel.writeString(this.productData);
    }

    public CatalogBlockAnchorInfoDto(String str, String str2, String str3, String str4) {
        this.tag = str;
        this.token = str2;
        this.ref = str3;
        this.productData = str4;
    }

    public /* synthetic */ CatalogBlockAnchorInfoDto(String str, String str2, String str3, String str4, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4);
    }
}
