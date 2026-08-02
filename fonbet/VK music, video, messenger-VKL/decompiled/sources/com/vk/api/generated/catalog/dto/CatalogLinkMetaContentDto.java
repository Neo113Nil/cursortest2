package com.vk.api.generated.catalog.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: CatalogLinkMetaContentDto.kt */
/* loaded from: classes14.dex */
public final class CatalogLinkMetaContentDto implements Parcelable {
    public static final Parcelable.Creator<CatalogLinkMetaContentDto> CREATOR = new a();

    @pmi0("content_id")
    private final String contentId;

    @pmi0("data_type")
    private final CatalogBlockDataTypeDto dataType;

    /* compiled from: CatalogLinkMetaContentDto.kt */
    public static final class a implements Parcelable.Creator<CatalogLinkMetaContentDto> {
        @Override // android.os.Parcelable.Creator
        public final CatalogLinkMetaContentDto createFromParcel(Parcel parcel) {
            return new CatalogLinkMetaContentDto(parcel.readInt() == 0 ? null : CatalogBlockDataTypeDto.CREATOR.createFromParcel(parcel), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final CatalogLinkMetaContentDto[] newArray(int i) {
            return new CatalogLinkMetaContentDto[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public CatalogLinkMetaContentDto() {
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
        if (!(obj instanceof CatalogLinkMetaContentDto)) {
            return false;
        }
        CatalogLinkMetaContentDto catalogLinkMetaContentDto = (CatalogLinkMetaContentDto) obj;
        return this.dataType == catalogLinkMetaContentDto.dataType && epx.f(this.contentId, catalogLinkMetaContentDto.contentId);
    }

    public final int hashCode() {
        CatalogBlockDataTypeDto catalogBlockDataTypeDto = this.dataType;
        int hashCode = (catalogBlockDataTypeDto == null ? 0 : catalogBlockDataTypeDto.hashCode()) * 31;
        String str = this.contentId;
        return hashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CatalogLinkMetaContentDto(dataType=");
        sb.append(this.dataType);
        sb.append(", contentId=");
        return ho8.a(sb, this.contentId, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        CatalogBlockDataTypeDto catalogBlockDataTypeDto = this.dataType;
        if (catalogBlockDataTypeDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            catalogBlockDataTypeDto.writeToParcel(parcel, i);
        }
        parcel.writeString(this.contentId);
    }

    public CatalogLinkMetaContentDto(CatalogBlockDataTypeDto catalogBlockDataTypeDto, String str) {
        this.dataType = catalogBlockDataTypeDto;
        this.contentId = str;
    }

    public /* synthetic */ CatalogLinkMetaContentDto(CatalogBlockDataTypeDto catalogBlockDataTypeDto, String str, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : catalogBlockDataTypeDto, (i & 2) != 0 ? null : str);
    }
}
