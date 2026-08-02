package com.vk.api.generated.catalog.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;

/* compiled from: CatalogCompositeIdDto.kt */
/* loaded from: classes14.dex */
public final class CatalogCompositeIdDto implements Parcelable {
    public static final Parcelable.Creator<CatalogCompositeIdDto> CREATOR = new a();

    @pmi0("data_type")
    private final CatalogBlockDataTypeDto dataType;

    @pmi0("entity_id")
    private final String entityId;

    /* compiled from: CatalogCompositeIdDto.kt */
    public static final class a implements Parcelable.Creator<CatalogCompositeIdDto> {
        @Override // android.os.Parcelable.Creator
        public final CatalogCompositeIdDto createFromParcel(Parcel parcel) {
            return new CatalogCompositeIdDto(CatalogBlockDataTypeDto.CREATOR.createFromParcel(parcel), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final CatalogCompositeIdDto[] newArray(int i) {
            return new CatalogCompositeIdDto[i];
        }
    }

    public CatalogCompositeIdDto(CatalogBlockDataTypeDto catalogBlockDataTypeDto, String str) {
        this.dataType = catalogBlockDataTypeDto;
        this.entityId = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CatalogCompositeIdDto)) {
            return false;
        }
        CatalogCompositeIdDto catalogCompositeIdDto = (CatalogCompositeIdDto) obj;
        return this.dataType == catalogCompositeIdDto.dataType && epx.f(this.entityId, catalogCompositeIdDto.entityId);
    }

    public final int hashCode() {
        return this.entityId.hashCode() + (this.dataType.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CatalogCompositeIdDto(dataType=");
        sb.append(this.dataType);
        sb.append(", entityId=");
        return ho8.a(sb, this.entityId, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.dataType.writeToParcel(parcel, i);
        parcel.writeString(this.entityId);
    }
}
