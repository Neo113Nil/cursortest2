package com.vk.api.generated.wishlists.dto;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.ao;
import xsna.en;
import xsna.epx;
import xsna.ms9;
import xsna.pmi0;

/* compiled from: WishlistsGetResponseDto.kt */
/* loaded from: classes15.dex */
public final class WishlistsGetResponseDto implements Parcelable {
    public static final Parcelable.Creator<WishlistsGetResponseDto> CREATOR = new a();

    @pmi0("count")
    private final int count;

    @pmi0("items")
    private final List<WishlistsItemDto> items;

    /* compiled from: WishlistsGetResponseDto.kt */
    public static final class a implements Parcelable.Creator<WishlistsGetResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final WishlistsGetResponseDto createFromParcel(Parcel parcel) {
            int readInt = parcel.readInt();
            int readInt2 = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt2);
            int i = 0;
            while (i != readInt2) {
                i = en.a(WishlistsItemDto.CREATOR, parcel, arrayList, i, 1);
            }
            return new WishlistsGetResponseDto(readInt, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final WishlistsGetResponseDto[] newArray(int i) {
            return new WishlistsGetResponseDto[i];
        }
    }

    public WishlistsGetResponseDto(int i, List<WishlistsItemDto> list) {
        this.count = i;
        this.items = list;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WishlistsGetResponseDto)) {
            return false;
        }
        WishlistsGetResponseDto wishlistsGetResponseDto = (WishlistsGetResponseDto) obj;
        return this.count == wishlistsGetResponseDto.count && epx.f(this.items, wishlistsGetResponseDto.items);
    }

    public final int hashCode() {
        return this.items.hashCode() + (Integer.hashCode(this.count) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("WishlistsGetResponseDto(count=");
        sb.append(this.count);
        sb.append(", items=");
        return ms9.a(')', sb, this.items);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.count);
        Iterator a2 = ao.a(parcel, this.items);
        while (a2.hasNext()) {
            ((WishlistsItemDto) a2.next()).writeToParcel(parcel, i);
        }
    }
}
