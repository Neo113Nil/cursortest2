package com.vk.api.generated.catalog.dto;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.dn;
import xsna.en;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: CatalogGetCatalogSectionAllBlockItemsResponseDto.kt */
/* loaded from: classes14.dex */
public final class CatalogGetCatalogSectionAllBlockItemsResponseDto implements Parcelable {
    public static final Parcelable.Creator<CatalogGetCatalogSectionAllBlockItemsResponseDto> CREATOR = new a();

    @pmi0("blocks")
    private final List<CatalogBlockItemsDto> blocks;

    @pmi0("next_from")
    private final String nextFrom;

    /* compiled from: CatalogGetCatalogSectionAllBlockItemsResponseDto.kt */
    public static final class a implements Parcelable.Creator<CatalogGetCatalogSectionAllBlockItemsResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final CatalogGetCatalogSectionAllBlockItemsResponseDto createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(readInt);
                int i = 0;
                while (i != readInt) {
                    i = en.a(CatalogBlockItemsDto.CREATOR, parcel, arrayList2, i, 1);
                }
                arrayList = arrayList2;
            }
            return new CatalogGetCatalogSectionAllBlockItemsResponseDto(arrayList, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final CatalogGetCatalogSectionAllBlockItemsResponseDto[] newArray(int i) {
            return new CatalogGetCatalogSectionAllBlockItemsResponseDto[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public CatalogGetCatalogSectionAllBlockItemsResponseDto() {
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
        if (!(obj instanceof CatalogGetCatalogSectionAllBlockItemsResponseDto)) {
            return false;
        }
        CatalogGetCatalogSectionAllBlockItemsResponseDto catalogGetCatalogSectionAllBlockItemsResponseDto = (CatalogGetCatalogSectionAllBlockItemsResponseDto) obj;
        return epx.f(this.blocks, catalogGetCatalogSectionAllBlockItemsResponseDto.blocks) && epx.f(this.nextFrom, catalogGetCatalogSectionAllBlockItemsResponseDto.nextFrom);
    }

    public final int hashCode() {
        List<CatalogBlockItemsDto> list = this.blocks;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        String str = this.nextFrom;
        return hashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CatalogGetCatalogSectionAllBlockItemsResponseDto(blocks=");
        sb.append(this.blocks);
        sb.append(", nextFrom=");
        return ho8.a(sb, this.nextFrom, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        List<CatalogBlockItemsDto> list = this.blocks;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator f = dn.f(parcel, list, 1);
            while (f.hasNext()) {
                ((CatalogBlockItemsDto) f.next()).writeToParcel(parcel, i);
            }
        }
        parcel.writeString(this.nextFrom);
    }

    public CatalogGetCatalogSectionAllBlockItemsResponseDto(List<CatalogBlockItemsDto> list, String str) {
        this.blocks = list;
        this.nextFrom = str;
    }

    public /* synthetic */ CatalogGetCatalogSectionAllBlockItemsResponseDto(List list, String str, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : list, (i & 2) != 0 ? null : str);
    }
}
