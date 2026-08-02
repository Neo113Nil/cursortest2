package com.vk.api.generated.catalog.dto;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.dn;
import xsna.en;
import xsna.epx;
import xsna.ms9;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: CatalogBlockReplacementDto.kt */
/* loaded from: classes14.dex */
public final class CatalogBlockReplacementDto implements Parcelable {
    public static final Parcelable.Creator<CatalogBlockReplacementDto> CREATOR = new a();

    @pmi0("from_block_ids")
    private final List<String> fromBlockIds;

    @pmi0("to_blocks")
    private final List<CatalogBlockDto> toBlocks;

    /* compiled from: CatalogBlockReplacementDto.kt */
    public static final class a implements Parcelable.Creator<CatalogBlockReplacementDto> {
        @Override // android.os.Parcelable.Creator
        public final CatalogBlockReplacementDto createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            ArrayList<String> createStringArrayList = parcel.createStringArrayList();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(readInt);
                int i = 0;
                while (i != readInt) {
                    i = en.a(CatalogBlockDto.CREATOR, parcel, arrayList2, i, 1);
                }
                arrayList = arrayList2;
            }
            return new CatalogBlockReplacementDto(createStringArrayList, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final CatalogBlockReplacementDto[] newArray(int i) {
            return new CatalogBlockReplacementDto[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public CatalogBlockReplacementDto() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public final List<String> d() {
        return this.fromBlockIds;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final List<CatalogBlockDto> e() {
        return this.toBlocks;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CatalogBlockReplacementDto)) {
            return false;
        }
        CatalogBlockReplacementDto catalogBlockReplacementDto = (CatalogBlockReplacementDto) obj;
        return epx.f(this.fromBlockIds, catalogBlockReplacementDto.fromBlockIds) && epx.f(this.toBlocks, catalogBlockReplacementDto.toBlocks);
    }

    public final int hashCode() {
        List<String> list = this.fromBlockIds;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        List<CatalogBlockDto> list2 = this.toBlocks;
        return hashCode + (list2 != null ? list2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CatalogBlockReplacementDto(fromBlockIds=");
        sb.append(this.fromBlockIds);
        sb.append(", toBlocks=");
        return ms9.a(')', sb, this.toBlocks);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeStringList(this.fromBlockIds);
        List<CatalogBlockDto> list = this.toBlocks;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator f = dn.f(parcel, list, 1);
        while (f.hasNext()) {
            ((CatalogBlockDto) f.next()).writeToParcel(parcel, i);
        }
    }

    public CatalogBlockReplacementDto(List<String> list, List<CatalogBlockDto> list2) {
        this.fromBlockIds = list;
        this.toBlocks = list2;
    }

    public /* synthetic */ CatalogBlockReplacementDto(List list, List list2, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : list, (i & 2) != 0 ? null : list2);
    }
}
