package com.vk.api.generated.vkidok.dto;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.ao;
import xsna.en;
import xsna.epx;
import xsna.fw3;
import xsna.ho8;
import xsna.pmi0;

/* compiled from: VkidokGetInitialDataResponseDto.kt */
/* loaded from: classes15.dex */
public final class VkidokGetInitialDataResponseDto implements Parcelable {
    public static final Parcelable.Creator<VkidokGetInitialDataResponseDto> CREATOR = new a();

    @pmi0("anonym_token")
    private final String anonymToken;

    @pmi0("feature_toggles")
    private final List<VkidokGetInitialDataFeatureToggleDto> featureToggles;

    @pmi0("langs")
    private final List<VkidokGetInitialDataLangDto> langs;

    /* compiled from: VkidokGetInitialDataResponseDto.kt */
    public static final class a implements Parcelable.Creator<VkidokGetInitialDataResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final VkidokGetInitialDataResponseDto createFromParcel(Parcel parcel) {
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            int i = 0;
            int i2 = 0;
            while (i2 != readInt) {
                i2 = en.a(VkidokGetInitialDataFeatureToggleDto.CREATOR, parcel, arrayList, i2, 1);
            }
            int readInt2 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(readInt2);
            while (i != readInt2) {
                i = en.a(VkidokGetInitialDataLangDto.CREATOR, parcel, arrayList2, i, 1);
            }
            return new VkidokGetInitialDataResponseDto(arrayList, arrayList2, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final VkidokGetInitialDataResponseDto[] newArray(int i) {
            return new VkidokGetInitialDataResponseDto[i];
        }
    }

    public VkidokGetInitialDataResponseDto(List<VkidokGetInitialDataFeatureToggleDto> list, List<VkidokGetInitialDataLangDto> list2, String str) {
        this.featureToggles = list;
        this.langs = list2;
        this.anonymToken = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VkidokGetInitialDataResponseDto)) {
            return false;
        }
        VkidokGetInitialDataResponseDto vkidokGetInitialDataResponseDto = (VkidokGetInitialDataResponseDto) obj;
        return epx.f(this.featureToggles, vkidokGetInitialDataResponseDto.featureToggles) && epx.f(this.langs, vkidokGetInitialDataResponseDto.langs) && epx.f(this.anonymToken, vkidokGetInitialDataResponseDto.anonymToken);
    }

    public final int hashCode() {
        return this.anonymToken.hashCode() + fw3.a(this.featureToggles.hashCode() * 31, 31, this.langs);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VkidokGetInitialDataResponseDto(featureToggles=");
        sb.append(this.featureToggles);
        sb.append(", langs=");
        sb.append(this.langs);
        sb.append(", anonymToken=");
        return ho8.a(sb, this.anonymToken, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Iterator a2 = ao.a(parcel, this.featureToggles);
        while (a2.hasNext()) {
            ((VkidokGetInitialDataFeatureToggleDto) a2.next()).writeToParcel(parcel, i);
        }
        Iterator a3 = ao.a(parcel, this.langs);
        while (a3.hasNext()) {
            ((VkidokGetInitialDataLangDto) a3.next()).writeToParcel(parcel, i);
        }
        parcel.writeString(this.anonymToken);
    }
}
