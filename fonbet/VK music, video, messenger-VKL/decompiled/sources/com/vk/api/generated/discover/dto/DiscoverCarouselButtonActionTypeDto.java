package com.vk.api.generated.discover.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: DiscoverCarouselButtonActionTypeDto.kt */
/* loaded from: classes14.dex */
public final class DiscoverCarouselButtonActionTypeDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ DiscoverCarouselButtonActionTypeDto[] $VALUES;
    public static final Parcelable.Creator<DiscoverCarouselButtonActionTypeDto> CREATOR;

    @pmi0("open_game")
    public static final DiscoverCarouselButtonActionTypeDto OPEN_GAME;

    @pmi0("open_url")
    public static final DiscoverCarouselButtonActionTypeDto OPEN_URL;

    @pmi0("open_vkapp")
    public static final DiscoverCarouselButtonActionTypeDto OPEN_VKAPP;
    private final String value;

    /* compiled from: DiscoverCarouselButtonActionTypeDto.kt */
    public static final class a implements Parcelable.Creator<DiscoverCarouselButtonActionTypeDto> {
        @Override // android.os.Parcelable.Creator
        public final DiscoverCarouselButtonActionTypeDto createFromParcel(Parcel parcel) {
            return DiscoverCarouselButtonActionTypeDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final DiscoverCarouselButtonActionTypeDto[] newArray(int i) {
            return new DiscoverCarouselButtonActionTypeDto[i];
        }
    }

    static {
        DiscoverCarouselButtonActionTypeDto discoverCarouselButtonActionTypeDto = new DiscoverCarouselButtonActionTypeDto("OPEN_URL", 0, "open_url");
        OPEN_URL = discoverCarouselButtonActionTypeDto;
        DiscoverCarouselButtonActionTypeDto discoverCarouselButtonActionTypeDto2 = new DiscoverCarouselButtonActionTypeDto("OPEN_VKAPP", 1, "open_vkapp");
        OPEN_VKAPP = discoverCarouselButtonActionTypeDto2;
        DiscoverCarouselButtonActionTypeDto discoverCarouselButtonActionTypeDto3 = new DiscoverCarouselButtonActionTypeDto("OPEN_GAME", 2, "open_game");
        OPEN_GAME = discoverCarouselButtonActionTypeDto3;
        DiscoverCarouselButtonActionTypeDto[] discoverCarouselButtonActionTypeDtoArr = {discoverCarouselButtonActionTypeDto, discoverCarouselButtonActionTypeDto2, discoverCarouselButtonActionTypeDto3};
        $VALUES = discoverCarouselButtonActionTypeDtoArr;
        $ENTRIES = new asp(discoverCarouselButtonActionTypeDtoArr);
        CREATOR = new a();
    }

    private DiscoverCarouselButtonActionTypeDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static DiscoverCarouselButtonActionTypeDto valueOf(String str) {
        return (DiscoverCarouselButtonActionTypeDto) Enum.valueOf(DiscoverCarouselButtonActionTypeDto.class, str);
    }

    public static DiscoverCarouselButtonActionTypeDto[] values() {
        return (DiscoverCarouselButtonActionTypeDto[]) $VALUES.clone();
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
