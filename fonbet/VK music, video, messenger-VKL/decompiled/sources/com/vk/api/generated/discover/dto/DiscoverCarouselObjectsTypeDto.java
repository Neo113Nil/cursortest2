package com.vk.api.generated.discover.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: DiscoverCarouselObjectsTypeDto.kt */
/* loaded from: classes14.dex */
public final class DiscoverCarouselObjectsTypeDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ DiscoverCarouselObjectsTypeDto[] $VALUES;
    public static final Parcelable.Creator<DiscoverCarouselObjectsTypeDto> CREATOR;

    @pmi0("direct_game")
    public static final DiscoverCarouselObjectsTypeDto DIRECT_GAME;

    @pmi0("vk_app")
    public static final DiscoverCarouselObjectsTypeDto VK_APP;
    private final String value;

    /* compiled from: DiscoverCarouselObjectsTypeDto.kt */
    public static final class a implements Parcelable.Creator<DiscoverCarouselObjectsTypeDto> {
        @Override // android.os.Parcelable.Creator
        public final DiscoverCarouselObjectsTypeDto createFromParcel(Parcel parcel) {
            return DiscoverCarouselObjectsTypeDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final DiscoverCarouselObjectsTypeDto[] newArray(int i) {
            return new DiscoverCarouselObjectsTypeDto[i];
        }
    }

    static {
        DiscoverCarouselObjectsTypeDto discoverCarouselObjectsTypeDto = new DiscoverCarouselObjectsTypeDto("VK_APP", 0, "vk_app");
        VK_APP = discoverCarouselObjectsTypeDto;
        DiscoverCarouselObjectsTypeDto discoverCarouselObjectsTypeDto2 = new DiscoverCarouselObjectsTypeDto("DIRECT_GAME", 1, "direct_game");
        DIRECT_GAME = discoverCarouselObjectsTypeDto2;
        DiscoverCarouselObjectsTypeDto[] discoverCarouselObjectsTypeDtoArr = {discoverCarouselObjectsTypeDto, discoverCarouselObjectsTypeDto2};
        $VALUES = discoverCarouselObjectsTypeDtoArr;
        $ENTRIES = new asp(discoverCarouselObjectsTypeDtoArr);
        CREATOR = new a();
    }

    private DiscoverCarouselObjectsTypeDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static DiscoverCarouselObjectsTypeDto valueOf(String str) {
        return (DiscoverCarouselObjectsTypeDto) Enum.valueOf(DiscoverCarouselObjectsTypeDto.class, str);
    }

    public static DiscoverCarouselObjectsTypeDto[] values() {
        return (DiscoverCarouselObjectsTypeDto[]) $VALUES.clone();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String i() {
        return this.value;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(name());
    }
}
