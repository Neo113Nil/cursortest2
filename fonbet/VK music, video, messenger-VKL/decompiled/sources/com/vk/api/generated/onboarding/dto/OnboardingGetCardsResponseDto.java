package com.vk.api.generated.onboarding.dto;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.ao;
import xsna.en;
import xsna.epx;
import xsna.pmi0;
import xsna.vu5;

/* compiled from: OnboardingGetCardsResponseDto.kt */
/* loaded from: classes15.dex */
public final class OnboardingGetCardsResponseDto implements Parcelable {
    public static final Parcelable.Creator<OnboardingGetCardsResponseDto> CREATOR = new a();

    @pmi0("count")
    private final int count;

    @pmi0("items")
    private final List<OnboardingCardsItemDto> items;

    /* compiled from: OnboardingGetCardsResponseDto.kt */
    public static final class a implements Parcelable.Creator<OnboardingGetCardsResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final OnboardingGetCardsResponseDto createFromParcel(Parcel parcel) {
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            int i = 0;
            while (i != readInt) {
                i = en.a(OnboardingCardsItemDto.CREATOR, parcel, arrayList, i, 1);
            }
            return new OnboardingGetCardsResponseDto(arrayList, parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final OnboardingGetCardsResponseDto[] newArray(int i) {
            return new OnboardingGetCardsResponseDto[i];
        }
    }

    public OnboardingGetCardsResponseDto(List<OnboardingCardsItemDto> list, int i) {
        this.items = list;
        this.count = i;
    }

    public final List<OnboardingCardsItemDto> d() {
        return this.items;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OnboardingGetCardsResponseDto)) {
            return false;
        }
        OnboardingGetCardsResponseDto onboardingGetCardsResponseDto = (OnboardingGetCardsResponseDto) obj;
        return epx.f(this.items, onboardingGetCardsResponseDto.items) && this.count == onboardingGetCardsResponseDto.count;
    }

    public final int hashCode() {
        return Integer.hashCode(this.count) + (this.items.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OnboardingGetCardsResponseDto(items=");
        sb.append(this.items);
        sb.append(", count=");
        return vu5.b(sb, this.count, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Iterator a2 = ao.a(parcel, this.items);
        while (a2.hasNext()) {
            ((OnboardingCardsItemDto) a2.next()).writeToParcel(parcel, i);
        }
        parcel.writeInt(this.count);
    }
}
