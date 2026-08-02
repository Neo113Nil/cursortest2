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

/* compiled from: CatalogFooterDto.kt */
/* loaded from: classes14.dex */
public final class CatalogFooterDto implements Parcelable {
    public static final Parcelable.Creator<CatalogFooterDto> CREATOR = new a();

    @pmi0("blocks")
    private final List<CatalogBlockDto> blocks;

    /* compiled from: CatalogFooterDto.kt */
    public static final class a implements Parcelable.Creator<CatalogFooterDto> {
        @Override // android.os.Parcelable.Creator
        public final CatalogFooterDto createFromParcel(Parcel parcel) {
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
            return new CatalogFooterDto(arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final CatalogFooterDto[] newArray(int i) {
            return new CatalogFooterDto[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public CatalogFooterDto() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public final List<CatalogBlockDto> d() {
        return this.blocks;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof CatalogFooterDto) && epx.f(this.blocks, ((CatalogFooterDto) obj).blocks);
    }

    public final int hashCode() {
        List<CatalogBlockDto> list = this.blocks;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    public final String toString() {
        return ms9.a(')', new StringBuilder("CatalogFooterDto(blocks="), this.blocks);
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

    public CatalogFooterDto(List<CatalogBlockDto> list) {
        this.blocks = list;
    }

    public /* synthetic */ CatalogFooterDto(List list, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : list);
    }
}
