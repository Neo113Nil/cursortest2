package com.vk.api.generated.onboarding.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: OnboardingInteractElementTypeDto.kt */
/* loaded from: classes15.dex */
public final class OnboardingInteractElementTypeDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ OnboardingInteractElementTypeDto[] $VALUES;

    @pmi0("animation")
    public static final OnboardingInteractElementTypeDto ANIMATION;

    @pmi0("banner")
    public static final OnboardingInteractElementTypeDto BANNER;
    public static final Parcelable.Creator<OnboardingInteractElementTypeDto> CREATOR;

    @pmi0("fullscreen")
    public static final OnboardingInteractElementTypeDto FULLSCREEN;

    @pmi0("highlighter")
    public static final OnboardingInteractElementTypeDto HIGHLIGHTER;

    @pmi0("toast")
    public static final OnboardingInteractElementTypeDto TOAST;

    @pmi0("tooltip")
    public static final OnboardingInteractElementTypeDto TOOLTIP;
    private final String value;

    /* compiled from: OnboardingInteractElementTypeDto.kt */
    public static final class a implements Parcelable.Creator<OnboardingInteractElementTypeDto> {
        @Override // android.os.Parcelable.Creator
        public final OnboardingInteractElementTypeDto createFromParcel(Parcel parcel) {
            return OnboardingInteractElementTypeDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final OnboardingInteractElementTypeDto[] newArray(int i) {
            return new OnboardingInteractElementTypeDto[i];
        }
    }

    static {
        OnboardingInteractElementTypeDto onboardingInteractElementTypeDto = new OnboardingInteractElementTypeDto("BANNER", 0, "banner");
        BANNER = onboardingInteractElementTypeDto;
        OnboardingInteractElementTypeDto onboardingInteractElementTypeDto2 = new OnboardingInteractElementTypeDto("HIGHLIGHTER", 1, "highlighter");
        HIGHLIGHTER = onboardingInteractElementTypeDto2;
        OnboardingInteractElementTypeDto onboardingInteractElementTypeDto3 = new OnboardingInteractElementTypeDto("TOOLTIP", 2, "tooltip");
        TOOLTIP = onboardingInteractElementTypeDto3;
        OnboardingInteractElementTypeDto onboardingInteractElementTypeDto4 = new OnboardingInteractElementTypeDto("FULLSCREEN", 3, "fullscreen");
        FULLSCREEN = onboardingInteractElementTypeDto4;
        OnboardingInteractElementTypeDto onboardingInteractElementTypeDto5 = new OnboardingInteractElementTypeDto("TOAST", 4, "toast");
        TOAST = onboardingInteractElementTypeDto5;
        OnboardingInteractElementTypeDto onboardingInteractElementTypeDto6 = new OnboardingInteractElementTypeDto("ANIMATION", 5, "animation");
        ANIMATION = onboardingInteractElementTypeDto6;
        OnboardingInteractElementTypeDto[] onboardingInteractElementTypeDtoArr = {onboardingInteractElementTypeDto, onboardingInteractElementTypeDto2, onboardingInteractElementTypeDto3, onboardingInteractElementTypeDto4, onboardingInteractElementTypeDto5, onboardingInteractElementTypeDto6};
        $VALUES = onboardingInteractElementTypeDtoArr;
        $ENTRIES = new asp(onboardingInteractElementTypeDtoArr);
        CREATOR = new a();
    }

    private OnboardingInteractElementTypeDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static OnboardingInteractElementTypeDto valueOf(String str) {
        return (OnboardingInteractElementTypeDto) Enum.valueOf(OnboardingInteractElementTypeDto.class, str);
    }

    public static OnboardingInteractElementTypeDto[] values() {
        return (OnboardingInteractElementTypeDto[]) $VALUES.clone();
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
