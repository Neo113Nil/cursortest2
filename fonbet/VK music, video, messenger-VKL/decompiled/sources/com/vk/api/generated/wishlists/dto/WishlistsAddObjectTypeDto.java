package com.vk.api.generated.wishlists.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: WishlistsAddObjectTypeDto.kt */
/* loaded from: classes15.dex */
public final class WishlistsAddObjectTypeDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ WishlistsAddObjectTypeDto[] $VALUES;

    @pmi0("collection")
    public static final WishlistsAddObjectTypeDto COLLECTION;
    public static final Parcelable.Creator<WishlistsAddObjectTypeDto> CREATOR;

    @pmi0("custom")
    public static final WishlistsAddObjectTypeDto CUSTOM;

    @pmi0("link")
    public static final WishlistsAddObjectTypeDto LINK;

    @pmi0("market")
    public static final WishlistsAddObjectTypeDto MARKET;

    @pmi0("stickers_pack")
    public static final WishlistsAddObjectTypeDto STICKERS_PACK;
    private final String value;

    /* compiled from: WishlistsAddObjectTypeDto.kt */
    public static final class a implements Parcelable.Creator<WishlistsAddObjectTypeDto> {
        @Override // android.os.Parcelable.Creator
        public final WishlistsAddObjectTypeDto createFromParcel(Parcel parcel) {
            return WishlistsAddObjectTypeDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final WishlistsAddObjectTypeDto[] newArray(int i) {
            return new WishlistsAddObjectTypeDto[i];
        }
    }

    static {
        WishlistsAddObjectTypeDto wishlistsAddObjectTypeDto = new WishlistsAddObjectTypeDto("COLLECTION", 0, "collection");
        COLLECTION = wishlistsAddObjectTypeDto;
        WishlistsAddObjectTypeDto wishlistsAddObjectTypeDto2 = new WishlistsAddObjectTypeDto("CUSTOM", 1, "custom");
        CUSTOM = wishlistsAddObjectTypeDto2;
        WishlistsAddObjectTypeDto wishlistsAddObjectTypeDto3 = new WishlistsAddObjectTypeDto("LINK", 2, "link");
        LINK = wishlistsAddObjectTypeDto3;
        WishlistsAddObjectTypeDto wishlistsAddObjectTypeDto4 = new WishlistsAddObjectTypeDto("MARKET", 3, "market");
        MARKET = wishlistsAddObjectTypeDto4;
        WishlistsAddObjectTypeDto wishlistsAddObjectTypeDto5 = new WishlistsAddObjectTypeDto("STICKERS_PACK", 4, "stickers_pack");
        STICKERS_PACK = wishlistsAddObjectTypeDto5;
        WishlistsAddObjectTypeDto[] wishlistsAddObjectTypeDtoArr = {wishlistsAddObjectTypeDto, wishlistsAddObjectTypeDto2, wishlistsAddObjectTypeDto3, wishlistsAddObjectTypeDto4, wishlistsAddObjectTypeDto5};
        $VALUES = wishlistsAddObjectTypeDtoArr;
        $ENTRIES = new asp(wishlistsAddObjectTypeDtoArr);
        CREATOR = new a();
    }

    private WishlistsAddObjectTypeDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static WishlistsAddObjectTypeDto valueOf(String str) {
        return (WishlistsAddObjectTypeDto) Enum.valueOf(WishlistsAddObjectTypeDto.class, str);
    }

    public static WishlistsAddObjectTypeDto[] values() {
        return (WishlistsAddObjectTypeDto[]) $VALUES.clone();
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
