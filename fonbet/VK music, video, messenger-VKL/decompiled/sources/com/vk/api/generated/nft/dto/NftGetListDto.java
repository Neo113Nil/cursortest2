package com.vk.api.generated.nft.dto;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.bo;
import xsna.dn;
import xsna.epx;
import xsna.nr;
import xsna.pmi0;
import xsna.sn;
import xsna.uqi;
import xsna.zcl;

/* compiled from: NftGetListDto.kt */
/* loaded from: classes15.dex */
public final class NftGetListDto implements Parcelable {
    public static final Parcelable.Creator<NftGetListDto> CREATOR = new a();

    @pmi0("count")
    private final Integer count;

    @pmi0("items")
    private final List<NftGetListItemDto> items;

    @pmi0("success")
    private final Boolean success;

    /* compiled from: NftGetListDto.kt */
    public static final class a implements Parcelable.Creator<NftGetListDto> {
        @Override // android.os.Parcelable.Creator
        public final NftGetListDto createFromParcel(Parcel parcel) {
            Boolean valueOf;
            ArrayList arrayList;
            int i = 0;
            if (parcel.readInt() == 0) {
                valueOf = null;
            } else {
                valueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt = parcel.readInt();
                arrayList = new ArrayList(readInt);
                while (i != readInt) {
                    i = bo.b(NftGetListDto.class, parcel, arrayList, i, 1);
                }
            }
            return new NftGetListDto(valueOf, arrayList, parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final NftGetListDto[] newArray(int i) {
            return new NftGetListDto[i];
        }
    }

    public NftGetListDto() {
        this(null, null, null, 7, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NftGetListDto)) {
            return false;
        }
        NftGetListDto nftGetListDto = (NftGetListDto) obj;
        return epx.f(this.success, nftGetListDto.success) && epx.f(this.items, nftGetListDto.items) && epx.f(this.count, nftGetListDto.count);
    }

    public final int hashCode() {
        Boolean bool = this.success;
        int hashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        List<NftGetListItemDto> list = this.items;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        Integer num = this.count;
        return hashCode2 + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NftGetListDto(success=");
        sb.append(this.success);
        sb.append(", items=");
        sb.append(this.items);
        sb.append(", count=");
        return uqi.b(sb, this.count, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Boolean bool = this.success;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool);
        }
        List<NftGetListItemDto> list = this.items;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator f = dn.f(parcel, list, 1);
            while (f.hasNext()) {
                parcel.writeParcelable((Parcelable) f.next(), i);
            }
        }
        Integer num = this.count;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
    }

    public NftGetListDto(Boolean bool, List<NftGetListItemDto> list, Integer num) {
        this.success = bool;
        this.items = list;
        this.count = num;
    }

    public /* synthetic */ NftGetListDto(Boolean bool, List list, Integer num, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : bool, (i & 2) != 0 ? null : list, (i & 4) != 0 ? null : num);
    }
}
