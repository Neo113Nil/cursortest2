package com.vk.api.generated.exploreWidgets.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ExploreWidgetsBaseFooterTypesDto.kt */
/* loaded from: classes14.dex */
public final class ExploreWidgetsBaseFooterTypesDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ ExploreWidgetsBaseFooterTypesDto[] $VALUES;

    @pmi0("accent_button")
    public static final ExploreWidgetsBaseFooterTypesDto ACCENT_BUTTON;
    public static final Parcelable.Creator<ExploreWidgetsBaseFooterTypesDto> CREATOR;

    @pmi0("user_stack")
    public static final ExploreWidgetsBaseFooterTypesDto USER_STACK;
    private final String value;

    /* compiled from: ExploreWidgetsBaseFooterTypesDto.kt */
    public static final class a implements Parcelable.Creator<ExploreWidgetsBaseFooterTypesDto> {
        @Override // android.os.Parcelable.Creator
        public final ExploreWidgetsBaseFooterTypesDto createFromParcel(Parcel parcel) {
            return ExploreWidgetsBaseFooterTypesDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final ExploreWidgetsBaseFooterTypesDto[] newArray(int i) {
            return new ExploreWidgetsBaseFooterTypesDto[i];
        }
    }

    static {
        ExploreWidgetsBaseFooterTypesDto exploreWidgetsBaseFooterTypesDto = new ExploreWidgetsBaseFooterTypesDto("ACCENT_BUTTON", 0, "accent_button");
        ACCENT_BUTTON = exploreWidgetsBaseFooterTypesDto;
        ExploreWidgetsBaseFooterTypesDto exploreWidgetsBaseFooterTypesDto2 = new ExploreWidgetsBaseFooterTypesDto("USER_STACK", 1, "user_stack");
        USER_STACK = exploreWidgetsBaseFooterTypesDto2;
        ExploreWidgetsBaseFooterTypesDto[] exploreWidgetsBaseFooterTypesDtoArr = {exploreWidgetsBaseFooterTypesDto, exploreWidgetsBaseFooterTypesDto2};
        $VALUES = exploreWidgetsBaseFooterTypesDtoArr;
        $ENTRIES = new asp(exploreWidgetsBaseFooterTypesDtoArr);
        CREATOR = new a();
    }

    private ExploreWidgetsBaseFooterTypesDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static ExploreWidgetsBaseFooterTypesDto valueOf(String str) {
        return (ExploreWidgetsBaseFooterTypesDto) Enum.valueOf(ExploreWidgetsBaseFooterTypesDto.class, str);
    }

    public static ExploreWidgetsBaseFooterTypesDto[] values() {
        return (ExploreWidgetsBaseFooterTypesDto[]) $VALUES.clone();
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
