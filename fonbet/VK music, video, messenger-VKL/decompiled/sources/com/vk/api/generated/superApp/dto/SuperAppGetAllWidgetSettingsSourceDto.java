package com.vk.api.generated.superApp.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.ironsource.Gc;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: SuperAppGetAllWidgetSettingsSourceDto.kt */
/* loaded from: classes15.dex */
public final class SuperAppGetAllWidgetSettingsSourceDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ SuperAppGetAllWidgetSettingsSourceDto[] $VALUES;

    @pmi0("3")
    public static final SuperAppGetAllWidgetSettingsSourceDto CONTEXT_MENU_IN_THREE_DOTS;
    public static final Parcelable.Creator<SuperAppGetAllWidgetSettingsSourceDto> CREATOR;

    @pmi0(CampaignEx.CLICKMODE_ON)
    public static final SuperAppGetAllWidgetSettingsSourceDto FROM_ONBOARDING_POPUP;

    @pmi0("6")
    public static final SuperAppGetAllWidgetSettingsSourceDto FROM_RETENTION_WIDGET_POPUP;

    @pmi0("1")
    public static final SuperAppGetAllWidgetSettingsSourceDto GEAR_BUTTON_IN_MINI_WIDGETS_BLOCK;

    @pmi0("2")
    public static final SuperAppGetAllWidgetSettingsSourceDto LONG_TAP_ON_MINI_WIDGET;

    @pmi0(Gc.e)
    public static final SuperAppGetAllWidgetSettingsSourceDto RETRY_BUTTON_FROM_NACKBAR;

    @pmi0("4")
    public static final SuperAppGetAllWidgetSettingsSourceDto SETTINGS_BUTTON_AT_THE_BOTTOM_OF_THE_SERVICES_SCREEN;
    private final int value;

    /* compiled from: SuperAppGetAllWidgetSettingsSourceDto.kt */
    public static final class a implements Parcelable.Creator<SuperAppGetAllWidgetSettingsSourceDto> {
        @Override // android.os.Parcelable.Creator
        public final SuperAppGetAllWidgetSettingsSourceDto createFromParcel(Parcel parcel) {
            return SuperAppGetAllWidgetSettingsSourceDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final SuperAppGetAllWidgetSettingsSourceDto[] newArray(int i) {
            return new SuperAppGetAllWidgetSettingsSourceDto[i];
        }
    }

    static {
        SuperAppGetAllWidgetSettingsSourceDto superAppGetAllWidgetSettingsSourceDto = new SuperAppGetAllWidgetSettingsSourceDto("GEAR_BUTTON_IN_MINI_WIDGETS_BLOCK", 0, 1);
        GEAR_BUTTON_IN_MINI_WIDGETS_BLOCK = superAppGetAllWidgetSettingsSourceDto;
        SuperAppGetAllWidgetSettingsSourceDto superAppGetAllWidgetSettingsSourceDto2 = new SuperAppGetAllWidgetSettingsSourceDto("LONG_TAP_ON_MINI_WIDGET", 1, 2);
        LONG_TAP_ON_MINI_WIDGET = superAppGetAllWidgetSettingsSourceDto2;
        SuperAppGetAllWidgetSettingsSourceDto superAppGetAllWidgetSettingsSourceDto3 = new SuperAppGetAllWidgetSettingsSourceDto("CONTEXT_MENU_IN_THREE_DOTS", 2, 3);
        CONTEXT_MENU_IN_THREE_DOTS = superAppGetAllWidgetSettingsSourceDto3;
        SuperAppGetAllWidgetSettingsSourceDto superAppGetAllWidgetSettingsSourceDto4 = new SuperAppGetAllWidgetSettingsSourceDto("SETTINGS_BUTTON_AT_THE_BOTTOM_OF_THE_SERVICES_SCREEN", 3, 4);
        SETTINGS_BUTTON_AT_THE_BOTTOM_OF_THE_SERVICES_SCREEN = superAppGetAllWidgetSettingsSourceDto4;
        SuperAppGetAllWidgetSettingsSourceDto superAppGetAllWidgetSettingsSourceDto5 = new SuperAppGetAllWidgetSettingsSourceDto("FROM_ONBOARDING_POPUP", 4, 5);
        FROM_ONBOARDING_POPUP = superAppGetAllWidgetSettingsSourceDto5;
        SuperAppGetAllWidgetSettingsSourceDto superAppGetAllWidgetSettingsSourceDto6 = new SuperAppGetAllWidgetSettingsSourceDto("FROM_RETENTION_WIDGET_POPUP", 5, 6);
        FROM_RETENTION_WIDGET_POPUP = superAppGetAllWidgetSettingsSourceDto6;
        SuperAppGetAllWidgetSettingsSourceDto superAppGetAllWidgetSettingsSourceDto7 = new SuperAppGetAllWidgetSettingsSourceDto("RETRY_BUTTON_FROM_NACKBAR", 6, 7);
        RETRY_BUTTON_FROM_NACKBAR = superAppGetAllWidgetSettingsSourceDto7;
        SuperAppGetAllWidgetSettingsSourceDto[] superAppGetAllWidgetSettingsSourceDtoArr = {superAppGetAllWidgetSettingsSourceDto, superAppGetAllWidgetSettingsSourceDto2, superAppGetAllWidgetSettingsSourceDto3, superAppGetAllWidgetSettingsSourceDto4, superAppGetAllWidgetSettingsSourceDto5, superAppGetAllWidgetSettingsSourceDto6, superAppGetAllWidgetSettingsSourceDto7};
        $VALUES = superAppGetAllWidgetSettingsSourceDtoArr;
        $ENTRIES = new asp(superAppGetAllWidgetSettingsSourceDtoArr);
        CREATOR = new a();
    }

    private SuperAppGetAllWidgetSettingsSourceDto(String str, int i, int i2) {
        this.value = i2;
    }

    public static SuperAppGetAllWidgetSettingsSourceDto valueOf(String str) {
        return (SuperAppGetAllWidgetSettingsSourceDto) Enum.valueOf(SuperAppGetAllWidgetSettingsSourceDto.class, str);
    }

    public static SuperAppGetAllWidgetSettingsSourceDto[] values() {
        return (SuperAppGetAllWidgetSettingsSourceDto[]) $VALUES.clone();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final int i() {
        return this.value;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(name());
    }
}
