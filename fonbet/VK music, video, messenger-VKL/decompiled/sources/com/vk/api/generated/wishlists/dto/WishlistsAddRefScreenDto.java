package com.vk.api.generated.wishlists.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: WishlistsAddRefScreenDto.kt */
/* loaded from: classes15.dex */
public final class WishlistsAddRefScreenDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ WishlistsAddRefScreenDto[] $VALUES;
    public static final Parcelable.Creator<WishlistsAddRefScreenDto> CREATOR;

    @pmi0("market_item")
    public static final WishlistsAddRefScreenDto MARKET_ITEM;
    private final String value;

    /* compiled from: WishlistsAddRefScreenDto.kt */
    public static final class a implements Parcelable.Creator<WishlistsAddRefScreenDto> {
        @Override // android.os.Parcelable.Creator
        public final WishlistsAddRefScreenDto createFromParcel(Parcel parcel) {
            return WishlistsAddRefScreenDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final WishlistsAddRefScreenDto[] newArray(int i) {
            return new WishlistsAddRefScreenDto[i];
        }
    }

    static {
        WishlistsAddRefScreenDto wishlistsAddRefScreenDto = new WishlistsAddRefScreenDto("MARKET_ITEM", 0, "market_item");
        MARKET_ITEM = wishlistsAddRefScreenDto;
        WishlistsAddRefScreenDto[] wishlistsAddRefScreenDtoArr = {wishlistsAddRefScreenDto};
        $VALUES = wishlistsAddRefScreenDtoArr;
        $ENTRIES = new asp(wishlistsAddRefScreenDtoArr);
        CREATOR = new a();
    }

    private WishlistsAddRefScreenDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static WishlistsAddRefScreenDto valueOf(String str) {
        return (WishlistsAddRefScreenDto) Enum.valueOf(WishlistsAddRefScreenDto.class, str);
    }

    public static WishlistsAddRefScreenDto[] values() {
        return (WishlistsAddRefScreenDto[]) $VALUES.clone();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(name());
    }
}
