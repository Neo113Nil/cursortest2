package com.vk.api.generated.wishlists.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.pmi0;
import xsna.vu5;

/* compiled from: WishlistsAddResponseDto.kt */
/* loaded from: classes15.dex */
public final class WishlistsAddResponseDto implements Parcelable {
    public static final Parcelable.Creator<WishlistsAddResponseDto> CREATOR = new a();

    @pmi0("item_id")
    private final int itemId;

    /* compiled from: WishlistsAddResponseDto.kt */
    public static final class a implements Parcelable.Creator<WishlistsAddResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final WishlistsAddResponseDto createFromParcel(Parcel parcel) {
            return new WishlistsAddResponseDto(parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final WishlistsAddResponseDto[] newArray(int i) {
            return new WishlistsAddResponseDto[i];
        }
    }

    public WishlistsAddResponseDto(int i) {
        this.itemId = i;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof WishlistsAddResponseDto) && this.itemId == ((WishlistsAddResponseDto) obj).itemId;
    }

    public final int hashCode() {
        return Integer.hashCode(this.itemId);
    }

    public final String toString() {
        return vu5.b(new StringBuilder("WishlistsAddResponseDto(itemId="), this.itemId, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.itemId);
    }
}
