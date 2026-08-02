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
import xsna.nr;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: OwnersContentTabCollectionDto.kt */
/* loaded from: classes15.dex */
public final class OwnersContentTabCollectionDto implements Parcelable {
    public static final Parcelable.Creator<OwnersContentTabCollectionDto> CREATOR = new a();

    @pmi0("collection_type")
    private final String collectionType;

    @pmi0("count")
    private final Integer count;

    @pmi0("images")
    private final List<BaseImageDto> images;

    /* compiled from: OwnersContentTabCollectionDto.kt */
    public static final class a implements Parcelable.Creator<OwnersContentTabCollectionDto> {
        @Override // android.os.Parcelable.Creator
        public final OwnersContentTabCollectionDto createFromParcel(Parcel parcel) {
            String readString = parcel.readString();
            ArrayList arrayList = null;
            Integer valueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            if (parcel.readInt() != 0) {
                int readInt = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(readInt);
                int i = 0;
                while (i != readInt) {
                    i = bo.b(OwnersContentTabCollectionDto.class, parcel, arrayList2, i, 1);
                }
                arrayList = arrayList2;
            }
            return new OwnersContentTabCollectionDto(readString, valueOf, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final OwnersContentTabCollectionDto[] newArray(int i) {
            return new OwnersContentTabCollectionDto[i];
        }
    }

    public OwnersContentTabCollectionDto() {
        this(null, null, null, 7, null);
    }

    public final String d() {
        return this.collectionType;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final Integer e() {
        return this.count;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OwnersContentTabCollectionDto)) {
            return false;
        }
        OwnersContentTabCollectionDto ownersContentTabCollectionDto = (OwnersContentTabCollectionDto) obj;
        return epx.f(this.collectionType, ownersContentTabCollectionDto.collectionType) && epx.f(this.count, ownersContentTabCollectionDto.count) && epx.f(this.images, ownersContentTabCollectionDto.images);
    }

    public final List<BaseImageDto> f() {
        return this.images;
    }

    public final int hashCode() {
        String str = this.collectionType;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.count;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        List<BaseImageDto> list = this.images;
        return hashCode2 + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OwnersContentTabCollectionDto(collectionType=");
        sb.append(this.collectionType);
        sb.append(", count=");
        sb.append(this.count);
        sb.append(", images=");
        return ms9.a(')', sb, this.images);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.collectionType);
        Integer num = this.count;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
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

    public OwnersContentTabCollectionDto(String str, Integer num, List<BaseImageDto> list) {
        this.collectionType = str;
        this.count = num;
        this.images = list;
    }

    public /* synthetic */ OwnersContentTabCollectionDto(String str, Integer num, List list, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : num, (i & 4) != 0 ? null : list);
    }
}
