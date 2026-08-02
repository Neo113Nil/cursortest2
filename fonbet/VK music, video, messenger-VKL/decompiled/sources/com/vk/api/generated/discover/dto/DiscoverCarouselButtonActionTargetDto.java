package com.vk.api.generated.discover.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: DiscoverCarouselButtonActionTargetDto.kt */
/* loaded from: classes14.dex */
public final class DiscoverCarouselButtonActionTargetDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ DiscoverCarouselButtonActionTargetDto[] $VALUES;
    public static final Parcelable.Creator<DiscoverCarouselButtonActionTargetDto> CREATOR;

    @pmi0("internal")
    public static final DiscoverCarouselButtonActionTargetDto INTERNAL;
    private final String value;

    /* compiled from: DiscoverCarouselButtonActionTargetDto.kt */
    public static final class a implements Parcelable.Creator<DiscoverCarouselButtonActionTargetDto> {
        @Override // android.os.Parcelable.Creator
        public final DiscoverCarouselButtonActionTargetDto createFromParcel(Parcel parcel) {
            return DiscoverCarouselButtonActionTargetDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final DiscoverCarouselButtonActionTargetDto[] newArray(int i) {
            return new DiscoverCarouselButtonActionTargetDto[i];
        }
    }

    static {
        DiscoverCarouselButtonActionTargetDto discoverCarouselButtonActionTargetDto = new DiscoverCarouselButtonActionTargetDto("INTERNAL", 0, "internal");
        INTERNAL = discoverCarouselButtonActionTargetDto;
        DiscoverCarouselButtonActionTargetDto[] discoverCarouselButtonActionTargetDtoArr = {discoverCarouselButtonActionTargetDto};
        $VALUES = discoverCarouselButtonActionTargetDtoArr;
        $ENTRIES = new asp(discoverCarouselButtonActionTargetDtoArr);
        CREATOR = new a();
    }

    private DiscoverCarouselButtonActionTargetDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static DiscoverCarouselButtonActionTargetDto valueOf(String str) {
        return (DiscoverCarouselButtonActionTargetDto) Enum.valueOf(DiscoverCarouselButtonActionTargetDto.class, str);
    }

    public static DiscoverCarouselButtonActionTargetDto[] values() {
        return (DiscoverCarouselButtonActionTargetDto[]) $VALUES.clone();
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
