package com.vk.api.generated.superApp.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.fyber.inneractive.sdk.external.NativeAdContent;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: SuperAppEditWidgetSettingsSourceDto.kt */
/* loaded from: classes15.dex */
public final class SuperAppEditWidgetSettingsSourceDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ SuperAppEditWidgetSettingsSourceDto[] $VALUES;
    public static final Parcelable.Creator<SuperAppEditWidgetSettingsSourceDto> CREATOR;

    @pmi0("menu")
    public static final SuperAppEditWidgetSettingsSourceDto MENU;

    @pmi0("other")
    public static final SuperAppEditWidgetSettingsSourceDto OTHER;
    private final String value;

    /* compiled from: SuperAppEditWidgetSettingsSourceDto.kt */
    public static final class a implements Parcelable.Creator<SuperAppEditWidgetSettingsSourceDto> {
        @Override // android.os.Parcelable.Creator
        public final SuperAppEditWidgetSettingsSourceDto createFromParcel(Parcel parcel) {
            return SuperAppEditWidgetSettingsSourceDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final SuperAppEditWidgetSettingsSourceDto[] newArray(int i) {
            return new SuperAppEditWidgetSettingsSourceDto[i];
        }
    }

    static {
        SuperAppEditWidgetSettingsSourceDto superAppEditWidgetSettingsSourceDto = new SuperAppEditWidgetSettingsSourceDto("MENU", 0, "menu");
        MENU = superAppEditWidgetSettingsSourceDto;
        SuperAppEditWidgetSettingsSourceDto superAppEditWidgetSettingsSourceDto2 = new SuperAppEditWidgetSettingsSourceDto(NativeAdContent.ViewTag.OTHER, 1, "other");
        OTHER = superAppEditWidgetSettingsSourceDto2;
        SuperAppEditWidgetSettingsSourceDto[] superAppEditWidgetSettingsSourceDtoArr = {superAppEditWidgetSettingsSourceDto, superAppEditWidgetSettingsSourceDto2};
        $VALUES = superAppEditWidgetSettingsSourceDtoArr;
        $ENTRIES = new asp(superAppEditWidgetSettingsSourceDtoArr);
        CREATOR = new a();
    }

    private SuperAppEditWidgetSettingsSourceDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static SuperAppEditWidgetSettingsSourceDto valueOf(String str) {
        return (SuperAppEditWidgetSettingsSourceDto) Enum.valueOf(SuperAppEditWidgetSettingsSourceDto.class, str);
    }

    public static SuperAppEditWidgetSettingsSourceDto[] values() {
        return (SuperAppEditWidgetSettingsSourceDto[]) $VALUES.clone();
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
