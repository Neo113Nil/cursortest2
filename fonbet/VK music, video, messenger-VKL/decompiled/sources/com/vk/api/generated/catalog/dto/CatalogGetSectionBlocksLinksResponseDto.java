package com.vk.api.generated.catalog.dto;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.ao;
import xsna.en;
import xsna.epx;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: CatalogGetSectionBlocksLinksResponseDto.kt */
/* loaded from: classes14.dex */
public final class CatalogGetSectionBlocksLinksResponseDto implements Parcelable {
    public static final Parcelable.Creator<CatalogGetSectionBlocksLinksResponseDto> CREATOR = new a();

    @pmi0("blocks")
    private final List<CatalogSectionBlockLinkDto> blocks;

    @pmi0("first_block_data")
    private final CatalogBlockItemsDto firstBlockData;

    /* compiled from: CatalogGetSectionBlocksLinksResponseDto.kt */
    public static final class a implements Parcelable.Creator<CatalogGetSectionBlocksLinksResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final CatalogGetSectionBlocksLinksResponseDto createFromParcel(Parcel parcel) {
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            int i = 0;
            while (i != readInt) {
                i = en.a(CatalogSectionBlockLinkDto.CREATOR, parcel, arrayList, i, 1);
            }
            return new CatalogGetSectionBlocksLinksResponseDto(arrayList, parcel.readInt() == 0 ? null : CatalogBlockItemsDto.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final CatalogGetSectionBlocksLinksResponseDto[] newArray(int i) {
            return new CatalogGetSectionBlocksLinksResponseDto[i];
        }
    }

    public CatalogGetSectionBlocksLinksResponseDto(List<CatalogSectionBlockLinkDto> list, CatalogBlockItemsDto catalogBlockItemsDto) {
        this.blocks = list;
        this.firstBlockData = catalogBlockItemsDto;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CatalogGetSectionBlocksLinksResponseDto)) {
            return false;
        }
        CatalogGetSectionBlocksLinksResponseDto catalogGetSectionBlocksLinksResponseDto = (CatalogGetSectionBlocksLinksResponseDto) obj;
        return epx.f(this.blocks, catalogGetSectionBlocksLinksResponseDto.blocks) && epx.f(this.firstBlockData, catalogGetSectionBlocksLinksResponseDto.firstBlockData);
    }

    public final int hashCode() {
        int hashCode = this.blocks.hashCode() * 31;
        CatalogBlockItemsDto catalogBlockItemsDto = this.firstBlockData;
        return hashCode + (catalogBlockItemsDto == null ? 0 : catalogBlockItemsDto.hashCode());
    }

    public final String toString() {
        return "CatalogGetSectionBlocksLinksResponseDto(blocks=" + this.blocks + ", firstBlockData=" + this.firstBlockData + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Iterator a2 = ao.a(parcel, this.blocks);
        while (a2.hasNext()) {
            ((CatalogSectionBlockLinkDto) a2.next()).writeToParcel(parcel, i);
        }
        CatalogBlockItemsDto catalogBlockItemsDto = this.firstBlockData;
        if (catalogBlockItemsDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            catalogBlockItemsDto.writeToParcel(parcel, i);
        }
    }

    public /* synthetic */ CatalogGetSectionBlocksLinksResponseDto(List list, CatalogBlockItemsDto catalogBlockItemsDto, int i, zcl zclVar) {
        this(list, (i & 2) != 0 ? null : catalogBlockItemsDto);
    }
}
