package com.vk.api.generated.catalog.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;

/* compiled from: CatalogStubBlockDto.kt */
/* loaded from: classes14.dex */
public final class CatalogStubBlockDto implements Parcelable {
    public static final Parcelable.Creator<CatalogStubBlockDto> CREATOR = new a();

    @pmi0("block_id")
    private final String blockId;

    @pmi0("data_type")
    private final CatalogBlockDataTypeDto dataType;

    @pmi0(TtmlNode.TAG_LAYOUT)
    private final CatalogLayoutDto layout;

    @pmi0("title")
    private final String title;

    /* compiled from: CatalogStubBlockDto.kt */
    public static final class a implements Parcelable.Creator<CatalogStubBlockDto> {
        @Override // android.os.Parcelable.Creator
        public final CatalogStubBlockDto createFromParcel(Parcel parcel) {
            return new CatalogStubBlockDto(parcel.readString(), CatalogBlockDataTypeDto.CREATOR.createFromParcel(parcel), CatalogLayoutDto.CREATOR.createFromParcel(parcel), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final CatalogStubBlockDto[] newArray(int i) {
            return new CatalogStubBlockDto[i];
        }
    }

    public CatalogStubBlockDto(String str, CatalogBlockDataTypeDto catalogBlockDataTypeDto, CatalogLayoutDto catalogLayoutDto, String str2) {
        this.blockId = str;
        this.dataType = catalogBlockDataTypeDto;
        this.layout = catalogLayoutDto;
        this.title = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CatalogStubBlockDto)) {
            return false;
        }
        CatalogStubBlockDto catalogStubBlockDto = (CatalogStubBlockDto) obj;
        return epx.f(this.blockId, catalogStubBlockDto.blockId) && this.dataType == catalogStubBlockDto.dataType && epx.f(this.layout, catalogStubBlockDto.layout) && epx.f(this.title, catalogStubBlockDto.title);
    }

    public final int hashCode() {
        return this.title.hashCode() + ((this.layout.hashCode() + ((this.dataType.hashCode() + (this.blockId.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CatalogStubBlockDto(blockId=");
        sb.append(this.blockId);
        sb.append(", dataType=");
        sb.append(this.dataType);
        sb.append(", layout=");
        sb.append(this.layout);
        sb.append(", title=");
        return ho8.a(sb, this.title, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.blockId);
        this.dataType.writeToParcel(parcel, i);
        this.layout.writeToParcel(parcel, i);
        parcel.writeString(this.title);
    }
}
