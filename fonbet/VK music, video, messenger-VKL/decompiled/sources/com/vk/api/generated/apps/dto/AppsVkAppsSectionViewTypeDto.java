package com.vk.api.generated.apps.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: AppsVkAppsSectionViewTypeDto.kt */
/* loaded from: classes14.dex */
public final class AppsVkAppsSectionViewTypeDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ AppsVkAppsSectionViewTypeDto[] $VALUES;

    @pmi0("carousel")
    public static final AppsVkAppsSectionViewTypeDto CAROUSEL;

    @pmi0("carousel_banner_color")
    public static final AppsVkAppsSectionViewTypeDto CAROUSEL_BANNER_COLOR;

    @pmi0("carousel_banner_image")
    public static final AppsVkAppsSectionViewTypeDto CAROUSEL_BANNER_IMAGE;
    public static final Parcelable.Creator<AppsVkAppsSectionViewTypeDto> CREATOR;

    @pmi0("list_carousel")
    public static final AppsVkAppsSectionViewTypeDto LIST_CAROUSEL;

    @pmi0("list_simple")
    public static final AppsVkAppsSectionViewTypeDto LIST_SIMPLE;
    private final String value;

    /* compiled from: AppsVkAppsSectionViewTypeDto.kt */
    public static final class a implements Parcelable.Creator<AppsVkAppsSectionViewTypeDto> {
        @Override // android.os.Parcelable.Creator
        public final AppsVkAppsSectionViewTypeDto createFromParcel(Parcel parcel) {
            return AppsVkAppsSectionViewTypeDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final AppsVkAppsSectionViewTypeDto[] newArray(int i) {
            return new AppsVkAppsSectionViewTypeDto[i];
        }
    }

    static {
        AppsVkAppsSectionViewTypeDto appsVkAppsSectionViewTypeDto = new AppsVkAppsSectionViewTypeDto("LIST_SIMPLE", 0, "list_simple");
        LIST_SIMPLE = appsVkAppsSectionViewTypeDto;
        AppsVkAppsSectionViewTypeDto appsVkAppsSectionViewTypeDto2 = new AppsVkAppsSectionViewTypeDto("LIST_CAROUSEL", 1, "list_carousel");
        LIST_CAROUSEL = appsVkAppsSectionViewTypeDto2;
        AppsVkAppsSectionViewTypeDto appsVkAppsSectionViewTypeDto3 = new AppsVkAppsSectionViewTypeDto("CAROUSEL", 2, "carousel");
        CAROUSEL = appsVkAppsSectionViewTypeDto3;
        AppsVkAppsSectionViewTypeDto appsVkAppsSectionViewTypeDto4 = new AppsVkAppsSectionViewTypeDto("CAROUSEL_BANNER_COLOR", 3, "carousel_banner_color");
        CAROUSEL_BANNER_COLOR = appsVkAppsSectionViewTypeDto4;
        AppsVkAppsSectionViewTypeDto appsVkAppsSectionViewTypeDto5 = new AppsVkAppsSectionViewTypeDto("CAROUSEL_BANNER_IMAGE", 4, "carousel_banner_image");
        CAROUSEL_BANNER_IMAGE = appsVkAppsSectionViewTypeDto5;
        AppsVkAppsSectionViewTypeDto[] appsVkAppsSectionViewTypeDtoArr = {appsVkAppsSectionViewTypeDto, appsVkAppsSectionViewTypeDto2, appsVkAppsSectionViewTypeDto3, appsVkAppsSectionViewTypeDto4, appsVkAppsSectionViewTypeDto5};
        $VALUES = appsVkAppsSectionViewTypeDtoArr;
        $ENTRIES = new asp(appsVkAppsSectionViewTypeDtoArr);
        CREATOR = new a();
    }

    private AppsVkAppsSectionViewTypeDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static AppsVkAppsSectionViewTypeDto valueOf(String str) {
        return (AppsVkAppsSectionViewTypeDto) Enum.valueOf(AppsVkAppsSectionViewTypeDto.class, str);
    }

    public static AppsVkAppsSectionViewTypeDto[] values() {
        return (AppsVkAppsSectionViewTypeDto[]) $VALUES.clone();
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
