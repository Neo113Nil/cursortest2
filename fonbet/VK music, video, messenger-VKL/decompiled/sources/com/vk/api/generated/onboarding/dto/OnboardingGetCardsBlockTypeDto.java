package com.vk.api.generated.onboarding.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.ironsource.Ad;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: OnboardingGetCardsBlockTypeDto.kt */
/* loaded from: classes15.dex */
public final class OnboardingGetCardsBlockTypeDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ OnboardingGetCardsBlockTypeDto[] $VALUES;
    public static final Parcelable.Creator<OnboardingGetCardsBlockTypeDto> CREATOR;

    @pmi0("multi")
    public static final OnboardingGetCardsBlockTypeDto MULTI;

    @pmi0(Ad.d)
    public static final OnboardingGetCardsBlockTypeDto SINGLE;
    private final String value;

    /* compiled from: OnboardingGetCardsBlockTypeDto.kt */
    public static final class a implements Parcelable.Creator<OnboardingGetCardsBlockTypeDto> {
        @Override // android.os.Parcelable.Creator
        public final OnboardingGetCardsBlockTypeDto createFromParcel(Parcel parcel) {
            return OnboardingGetCardsBlockTypeDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final OnboardingGetCardsBlockTypeDto[] newArray(int i) {
            return new OnboardingGetCardsBlockTypeDto[i];
        }
    }

    static {
        OnboardingGetCardsBlockTypeDto onboardingGetCardsBlockTypeDto = new OnboardingGetCardsBlockTypeDto("MULTI", 0, "multi");
        MULTI = onboardingGetCardsBlockTypeDto;
        OnboardingGetCardsBlockTypeDto onboardingGetCardsBlockTypeDto2 = new OnboardingGetCardsBlockTypeDto("SINGLE", 1, Ad.d);
        SINGLE = onboardingGetCardsBlockTypeDto2;
        OnboardingGetCardsBlockTypeDto[] onboardingGetCardsBlockTypeDtoArr = {onboardingGetCardsBlockTypeDto, onboardingGetCardsBlockTypeDto2};
        $VALUES = onboardingGetCardsBlockTypeDtoArr;
        $ENTRIES = new asp(onboardingGetCardsBlockTypeDtoArr);
        CREATOR = new a();
    }

    private OnboardingGetCardsBlockTypeDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static OnboardingGetCardsBlockTypeDto valueOf(String str) {
        return (OnboardingGetCardsBlockTypeDto) Enum.valueOf(OnboardingGetCardsBlockTypeDto.class, str);
    }

    public static OnboardingGetCardsBlockTypeDto[] values() {
        return (OnboardingGetCardsBlockTypeDto[]) $VALUES.clone();
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
