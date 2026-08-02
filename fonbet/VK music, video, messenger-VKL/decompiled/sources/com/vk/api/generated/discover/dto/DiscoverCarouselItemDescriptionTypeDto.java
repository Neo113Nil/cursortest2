package com.vk.api.generated.discover.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: DiscoverCarouselItemDescriptionTypeDto.kt */
/* loaded from: classes14.dex */
public final class DiscoverCarouselItemDescriptionTypeDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ DiscoverCarouselItemDescriptionTypeDto[] $VALUES;
    public static final Parcelable.Creator<DiscoverCarouselItemDescriptionTypeDto> CREATOR;

    @pmi0("plain")
    public static final DiscoverCarouselItemDescriptionTypeDto PLAIN;
    private final String value;

    /* compiled from: DiscoverCarouselItemDescriptionTypeDto.kt */
    public static final class a implements Parcelable.Creator<DiscoverCarouselItemDescriptionTypeDto> {
        @Override // android.os.Parcelable.Creator
        public final DiscoverCarouselItemDescriptionTypeDto createFromParcel(Parcel parcel) {
            return DiscoverCarouselItemDescriptionTypeDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final DiscoverCarouselItemDescriptionTypeDto[] newArray(int i) {
            return new DiscoverCarouselItemDescriptionTypeDto[i];
        }
    }

    static {
        DiscoverCarouselItemDescriptionTypeDto discoverCarouselItemDescriptionTypeDto = new DiscoverCarouselItemDescriptionTypeDto("PLAIN", 0, "plain");
        PLAIN = discoverCarouselItemDescriptionTypeDto;
        DiscoverCarouselItemDescriptionTypeDto[] discoverCarouselItemDescriptionTypeDtoArr = {discoverCarouselItemDescriptionTypeDto};
        $VALUES = discoverCarouselItemDescriptionTypeDtoArr;
        $ENTRIES = new asp(discoverCarouselItemDescriptionTypeDtoArr);
        CREATOR = new a();
    }

    private DiscoverCarouselItemDescriptionTypeDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static DiscoverCarouselItemDescriptionTypeDto valueOf(String str) {
        return (DiscoverCarouselItemDescriptionTypeDto) Enum.valueOf(DiscoverCarouselItemDescriptionTypeDto.class, str);
    }

    public static DiscoverCarouselItemDescriptionTypeDto[] values() {
        return (DiscoverCarouselItemDescriptionTypeDto[]) $VALUES.clone();
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
