package com.vk.api.generated.discover.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: DiscoverCarouselButtonTypeDto.kt */
/* loaded from: classes14.dex */
public final class DiscoverCarouselButtonTypeDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ DiscoverCarouselButtonTypeDto[] $VALUES;
    public static final Parcelable.Creator<DiscoverCarouselButtonTypeDto> CREATOR;

    @pmi0("outline")
    public static final DiscoverCarouselButtonTypeDto OUTLINE;

    @pmi0("tertiary")
    public static final DiscoverCarouselButtonTypeDto TERTIARY;
    private final String value;

    /* compiled from: DiscoverCarouselButtonTypeDto.kt */
    public static final class a implements Parcelable.Creator<DiscoverCarouselButtonTypeDto> {
        @Override // android.os.Parcelable.Creator
        public final DiscoverCarouselButtonTypeDto createFromParcel(Parcel parcel) {
            return DiscoverCarouselButtonTypeDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final DiscoverCarouselButtonTypeDto[] newArray(int i) {
            return new DiscoverCarouselButtonTypeDto[i];
        }
    }

    static {
        DiscoverCarouselButtonTypeDto discoverCarouselButtonTypeDto = new DiscoverCarouselButtonTypeDto("OUTLINE", 0, "outline");
        OUTLINE = discoverCarouselButtonTypeDto;
        DiscoverCarouselButtonTypeDto discoverCarouselButtonTypeDto2 = new DiscoverCarouselButtonTypeDto("TERTIARY", 1, "tertiary");
        TERTIARY = discoverCarouselButtonTypeDto2;
        DiscoverCarouselButtonTypeDto[] discoverCarouselButtonTypeDtoArr = {discoverCarouselButtonTypeDto, discoverCarouselButtonTypeDto2};
        $VALUES = discoverCarouselButtonTypeDtoArr;
        $ENTRIES = new asp(discoverCarouselButtonTypeDtoArr);
        CREATOR = new a();
    }

    private DiscoverCarouselButtonTypeDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static DiscoverCarouselButtonTypeDto valueOf(String str) {
        return (DiscoverCarouselButtonTypeDto) Enum.valueOf(DiscoverCarouselButtonTypeDto.class, str);
    }

    public static DiscoverCarouselButtonTypeDto[] values() {
        return (DiscoverCarouselButtonTypeDto[]) $VALUES.clone();
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
