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

/* compiled from: CatalogSectionHeaderDto.kt */
/* loaded from: classes14.dex */
public final class CatalogSectionHeaderDto implements Parcelable {
    public static final Parcelable.Creator<CatalogSectionHeaderDto> CREATOR = new a();

    @pmi0("blocks")
    private final List<CatalogBlockDto> blocks;

    /* compiled from: CatalogSectionHeaderDto.kt */
    public static final class a implements Parcelable.Creator<CatalogSectionHeaderDto> {
        @Override // android.os.Parcelable.Creator
        public final CatalogSectionHeaderDto createFromParcel(Parcel parcel) {
            ArrayList arrayList;
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
            return new CatalogSectionHeaderDto(arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final CatalogSectionHeaderDto[] newArray(int i) {
            return new CatalogSectionHeaderDto[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public CatalogSectionHeaderDto() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof CatalogSectionHeaderDto) && epx.f(this.blocks, ((CatalogSectionHeaderDto) obj).blocks);
    }

    public final int hashCode() {
        List<CatalogBlockDto> list = this.blocks;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    public final String toString() {
        return ms9.a(')', new StringBuilder("CatalogSectionHeaderDto(blocks="), this.blocks);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        List<CatalogBlockDto> list = this.blocks;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator f = dn.f(parcel, list, 1);
        while (f.hasNext()) {
            ((CatalogBlockDto) f.next()).writeToParcel(parcel, i);
        }
    }

    public CatalogSectionHeaderDto(List<CatalogBlockDto> list) {
        this.blocks = list;
    }

    public /* synthetic */ CatalogSectionHeaderDto(List list, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : list);
    }
}
