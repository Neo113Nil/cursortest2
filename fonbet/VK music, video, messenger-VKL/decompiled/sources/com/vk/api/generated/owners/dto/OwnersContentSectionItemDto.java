package com.vk.api.generated.owners.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.api.generated.base.dto.BaseImageDto;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.bo;
import xsna.dn;
import xsna.epx;
import xsna.ms9;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: OwnersContentSectionItemDto.kt */
/* loaded from: classes15.dex */
public final class OwnersContentSectionItemDto implements Parcelable {
    public static final Parcelable.Creator<OwnersContentSectionItemDto> CREATOR = new a();

    @pmi0("images")
    private final List<BaseImageDto> images;

    @pmi0("name")
    private final OwnersContentSectionItemNameDto name;

    /* compiled from: OwnersContentSectionItemDto.kt */
    public static final class a implements Parcelable.Creator<OwnersContentSectionItemDto> {
        @Override // android.os.Parcelable.Creator
        public final OwnersContentSectionItemDto createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            OwnersContentSectionItemNameDto createFromParcel = OwnersContentSectionItemNameDto.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(readInt);
                int i = 0;
                while (i != readInt) {
                    i = bo.b(OwnersContentSectionItemDto.class, parcel, arrayList2, i, 1);
                }
                arrayList = arrayList2;
            }
            return new OwnersContentSectionItemDto(createFromParcel, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final OwnersContentSectionItemDto[] newArray(int i) {
            return new OwnersContentSectionItemDto[i];
        }
    }

    public OwnersContentSectionItemDto(OwnersContentSectionItemNameDto ownersContentSectionItemNameDto, List<BaseImageDto> list) {
        this.name = ownersContentSectionItemNameDto;
        this.images = list;
    }

    public final List<BaseImageDto> d() {
        return this.images;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final OwnersContentSectionItemNameDto e() {
        return this.name;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OwnersContentSectionItemDto)) {
            return false;
        }
        OwnersContentSectionItemDto ownersContentSectionItemDto = (OwnersContentSectionItemDto) obj;
        return this.name == ownersContentSectionItemDto.name && epx.f(this.images, ownersContentSectionItemDto.images);
    }

    public final int hashCode() {
        int hashCode = this.name.hashCode() * 31;
        List<BaseImageDto> list = this.images;
        return hashCode + (list == null ? 0 : list.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OwnersContentSectionItemDto(name=");
        sb.append(this.name);
        sb.append(", images=");
        return ms9.a(')', sb, this.images);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.name.writeToParcel(parcel, i);
        List<BaseImageDto> list = this.images;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator f = dn.f(parcel, list, 1);
        while (f.hasNext()) {
            parcel.writeParcelable((Parcelable) f.next(), i);
        }
    }

    public /* synthetic */ OwnersContentSectionItemDto(OwnersContentSectionItemNameDto ownersContentSectionItemNameDto, List list, int i, zcl zclVar) {
        this(ownersContentSectionItemNameDto, (i & 2) != 0 ? null : list);
    }
}
