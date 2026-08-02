package com.vk.api.generated.exploreStyles.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ExploreStylesStyleBaseButtonTypeDto.kt */
/* loaded from: classes14.dex */
public final class ExploreStylesStyleBaseButtonTypeDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ ExploreStylesStyleBaseButtonTypeDto[] $VALUES;
    public static final Parcelable.Creator<ExploreStylesStyleBaseButtonTypeDto> CREATOR;

    @pmi0("outline_icon")
    public static final ExploreStylesStyleBaseButtonTypeDto OUTLINE_ICON;

    @pmi0("outline_text")
    public static final ExploreStylesStyleBaseButtonTypeDto OUTLINE_TEXT;

    @pmi0("outline_with_icon")
    public static final ExploreStylesStyleBaseButtonTypeDto OUTLINE_WITH_ICON;

    @pmi0("tertiary_icon")
    public static final ExploreStylesStyleBaseButtonTypeDto TERTIARY_ICON;

    @pmi0("tertiary_text")
    public static final ExploreStylesStyleBaseButtonTypeDto TERTIARY_TEXT;

    @pmi0("tertiary_with_icon")
    public static final ExploreStylesStyleBaseButtonTypeDto TERTIARY_WITH_ICON;
    private final String value;

    /* compiled from: ExploreStylesStyleBaseButtonTypeDto.kt */
    public static final class a implements Parcelable.Creator<ExploreStylesStyleBaseButtonTypeDto> {
        @Override // android.os.Parcelable.Creator
        public final ExploreStylesStyleBaseButtonTypeDto createFromParcel(Parcel parcel) {
            return ExploreStylesStyleBaseButtonTypeDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final ExploreStylesStyleBaseButtonTypeDto[] newArray(int i) {
            return new ExploreStylesStyleBaseButtonTypeDto[i];
        }
    }

    static {
        ExploreStylesStyleBaseButtonTypeDto exploreStylesStyleBaseButtonTypeDto = new ExploreStylesStyleBaseButtonTypeDto("OUTLINE_WITH_ICON", 0, "outline_with_icon");
        OUTLINE_WITH_ICON = exploreStylesStyleBaseButtonTypeDto;
        ExploreStylesStyleBaseButtonTypeDto exploreStylesStyleBaseButtonTypeDto2 = new ExploreStylesStyleBaseButtonTypeDto("OUTLINE_TEXT", 1, "outline_text");
        OUTLINE_TEXT = exploreStylesStyleBaseButtonTypeDto2;
        ExploreStylesStyleBaseButtonTypeDto exploreStylesStyleBaseButtonTypeDto3 = new ExploreStylesStyleBaseButtonTypeDto("OUTLINE_ICON", 2, "outline_icon");
        OUTLINE_ICON = exploreStylesStyleBaseButtonTypeDto3;
        ExploreStylesStyleBaseButtonTypeDto exploreStylesStyleBaseButtonTypeDto4 = new ExploreStylesStyleBaseButtonTypeDto("TERTIARY_WITH_ICON", 3, "tertiary_with_icon");
        TERTIARY_WITH_ICON = exploreStylesStyleBaseButtonTypeDto4;
        ExploreStylesStyleBaseButtonTypeDto exploreStylesStyleBaseButtonTypeDto5 = new ExploreStylesStyleBaseButtonTypeDto("TERTIARY_TEXT", 4, "tertiary_text");
        TERTIARY_TEXT = exploreStylesStyleBaseButtonTypeDto5;
        ExploreStylesStyleBaseButtonTypeDto exploreStylesStyleBaseButtonTypeDto6 = new ExploreStylesStyleBaseButtonTypeDto("TERTIARY_ICON", 5, "tertiary_icon");
        TERTIARY_ICON = exploreStylesStyleBaseButtonTypeDto6;
        ExploreStylesStyleBaseButtonTypeDto[] exploreStylesStyleBaseButtonTypeDtoArr = {exploreStylesStyleBaseButtonTypeDto, exploreStylesStyleBaseButtonTypeDto2, exploreStylesStyleBaseButtonTypeDto3, exploreStylesStyleBaseButtonTypeDto4, exploreStylesStyleBaseButtonTypeDto5, exploreStylesStyleBaseButtonTypeDto6};
        $VALUES = exploreStylesStyleBaseButtonTypeDtoArr;
        $ENTRIES = new asp(exploreStylesStyleBaseButtonTypeDtoArr);
        CREATOR = new a();
    }

    private ExploreStylesStyleBaseButtonTypeDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static ExploreStylesStyleBaseButtonTypeDto valueOf(String str) {
        return (ExploreStylesStyleBaseButtonTypeDto) Enum.valueOf(ExploreStylesStyleBaseButtonTypeDto.class, str);
    }

    public static ExploreStylesStyleBaseButtonTypeDto[] values() {
        return (ExploreStylesStyleBaseButtonTypeDto[]) $VALUES.clone();
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
