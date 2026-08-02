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

/* compiled from: CatalogHeaderDto.kt */
/* loaded from: classes14.dex */
public final class CatalogHeaderDto implements Parcelable {
    public static final Parcelable.Creator<CatalogHeaderDto> CREATOR = new a();

    @pmi0("blocks")
    private final List<CatalogBlockDto> blocks;

    /* compiled from: CatalogHeaderDto.kt */
    public static final class a implements Parcelable.Creator<CatalogHeaderDto> {
        @Override // android.os.Parcelable.Creator
        public final CatalogHeaderDto createFromParcel(Parcel parcel) {
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
            return new CatalogHeaderDto(arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final CatalogHeaderDto[] newArray(int i) {
            return new CatalogHeaderDto[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public CatalogHeaderDto() {
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
        return (obj instanceof CatalogHeaderDto) && epx.f(this.blocks, ((CatalogHeaderDto) obj).blocks);
    }

    public final int hashCode() {
        List<CatalogBlockDto> list = this.blocks;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    public final String toString() {
        return ms9.a(')', new StringBuilder("CatalogHeaderDto(blocks="), this.blocks);
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

    public CatalogHeaderDto(List<CatalogBlockDto> list) {
        this.blocks = list;
    }

    public /* synthetic */ CatalogHeaderDto(List list, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : list);
    }
}
