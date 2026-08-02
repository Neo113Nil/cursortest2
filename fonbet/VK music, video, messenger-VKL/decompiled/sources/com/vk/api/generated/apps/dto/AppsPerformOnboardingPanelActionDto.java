package com.vk.api.generated.apps.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: AppsPerformOnboardingPanelActionDto.kt */
/* loaded from: classes14.dex */
public final class AppsPerformOnboardingPanelActionDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ AppsPerformOnboardingPanelActionDto[] $VALUES;
    public static final Parcelable.Creator<AppsPerformOnboardingPanelActionDto> CREATOR;

    @pmi0("hide")
    public static final AppsPerformOnboardingPanelActionDto HIDE;

    @pmi0("show")
    public static final AppsPerformOnboardingPanelActionDto SHOW;
    private final String value;

    /* compiled from: AppsPerformOnboardingPanelActionDto.kt */
    public static final class a implements Parcelable.Creator<AppsPerformOnboardingPanelActionDto> {
        @Override // android.os.Parcelable.Creator
        public final AppsPerformOnboardingPanelActionDto createFromParcel(Parcel parcel) {
            return AppsPerformOnboardingPanelActionDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final AppsPerformOnboardingPanelActionDto[] newArray(int i) {
            return new AppsPerformOnboardingPanelActionDto[i];
        }
    }

    static {
        AppsPerformOnboardingPanelActionDto appsPerformOnboardingPanelActionDto = new AppsPerformOnboardingPanelActionDto("HIDE", 0, "hide");
        HIDE = appsPerformOnboardingPanelActionDto;
        AppsPerformOnboardingPanelActionDto appsPerformOnboardingPanelActionDto2 = new AppsPerformOnboardingPanelActionDto("SHOW", 1, "show");
        SHOW = appsPerformOnboardingPanelActionDto2;
        AppsPerformOnboardingPanelActionDto[] appsPerformOnboardingPanelActionDtoArr = {appsPerformOnboardingPanelActionDto, appsPerformOnboardingPanelActionDto2};
        $VALUES = appsPerformOnboardingPanelActionDtoArr;
        $ENTRIES = new asp(appsPerformOnboardingPanelActionDtoArr);
        CREATOR = new a();
    }

    private AppsPerformOnboardingPanelActionDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static AppsPerformOnboardingPanelActionDto valueOf(String str) {
        return (AppsPerformOnboardingPanelActionDto) Enum.valueOf(AppsPerformOnboardingPanelActionDto.class, str);
    }

    public static AppsPerformOnboardingPanelActionDto[] values() {
        return (AppsPerformOnboardingPanelActionDto[]) $VALUES.clone();
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
