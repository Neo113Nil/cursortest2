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

/* compiled from: CatalogEntityGroupsItemDto.kt */
/* loaded from: classes14.dex */
public final class CatalogEntityGroupsItemDto implements Parcelable {
    public static final Parcelable.Creator<CatalogEntityGroupsItemDto> CREATOR = new a();

    @pmi0("group_items")
    private final List<CatalogGroupsItemDto> groupItems;

    @pmi0("id")
    private final String id;

    /* compiled from: CatalogEntityGroupsItemDto.kt */
    public static final class a implements Parcelable.Creator<CatalogEntityGroupsItemDto> {
        @Override // android.os.Parcelable.Creator
        public final CatalogEntityGroupsItemDto createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            String readString = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(readInt);
                int i = 0;
                while (i != readInt) {
                    i = en.a(CatalogGroupsItemDto.CREATOR, parcel, arrayList2, i, 1);
                }
                arrayList = arrayList2;
            }
            return new CatalogEntityGroupsItemDto(readString, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final CatalogEntityGroupsItemDto[] newArray(int i) {
            return new CatalogEntityGroupsItemDto[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public CatalogEntityGroupsItemDto() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public final List<CatalogGroupsItemDto> d() {
        return this.groupItems;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CatalogEntityGroupsItemDto)) {
            return false;
        }
        CatalogEntityGroupsItemDto catalogEntityGroupsItemDto = (CatalogEntityGroupsItemDto) obj;
        return epx.f(this.id, catalogEntityGroupsItemDto.id) && epx.f(this.groupItems, catalogEntityGroupsItemDto.groupItems);
    }

    public final String getId() {
        return this.id;
    }

    public final int hashCode() {
        String str = this.id;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        List<CatalogGroupsItemDto> list = this.groupItems;
        return hashCode + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CatalogEntityGroupsItemDto(id=");
        sb.append(this.id);
        sb.append(", groupItems=");
        return ms9.a(')', sb, this.groupItems);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.id);
        List<CatalogGroupsItemDto> list = this.groupItems;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator f = dn.f(parcel, list, 1);
        while (f.hasNext()) {
            ((CatalogGroupsItemDto) f.next()).writeToParcel(parcel, i);
        }
    }

    public CatalogEntityGroupsItemDto(String str, List<CatalogGroupsItemDto> list) {
        this.id = str;
        this.groupItems = list;
    }

    public /* synthetic */ CatalogEntityGroupsItemDto(String str, List list, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : list);
    }
}
