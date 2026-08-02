package com.vk.api.generated.recomSettings.dto;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.ao;
import xsna.en;
import xsna.epx;
import xsna.ms9;
import xsna.pmi0;

/* compiled from: RecomSettingsGetAvailableRecomThemesResponseDto.kt */
/* loaded from: classes15.dex */
public final class RecomSettingsGetAvailableRecomThemesResponseDto implements Parcelable {
    public static final Parcelable.Creator<RecomSettingsGetAvailableRecomThemesResponseDto> CREATOR = new a();

    @pmi0("items")
    private final List<RecomSettingsRecomThemeDto> items;

    /* compiled from: RecomSettingsGetAvailableRecomThemesResponseDto.kt */
    public static final class a implements Parcelable.Creator<RecomSettingsGetAvailableRecomThemesResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final RecomSettingsGetAvailableRecomThemesResponseDto createFromParcel(Parcel parcel) {
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            int i = 0;
            while (i != readInt) {
                i = en.a(RecomSettingsRecomThemeDto.CREATOR, parcel, arrayList, i, 1);
            }
            return new RecomSettingsGetAvailableRecomThemesResponseDto(arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final RecomSettingsGetAvailableRecomThemesResponseDto[] newArray(int i) {
            return new RecomSettingsGetAvailableRecomThemesResponseDto[i];
        }
    }

    public RecomSettingsGetAvailableRecomThemesResponseDto(List<RecomSettingsRecomThemeDto> list) {
        this.items = list;
    }

    public final List<RecomSettingsRecomThemeDto> d() {
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
        return (obj instanceof RecomSettingsGetAvailableRecomThemesResponseDto) && epx.f(this.items, ((RecomSettingsGetAvailableRecomThemesResponseDto) obj).items);
    }

    public final int hashCode() {
        return this.items.hashCode();
    }

    public final String toString() {
        return ms9.a(')', new StringBuilder("RecomSettingsGetAvailableRecomThemesResponseDto(items="), this.items);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Iterator a2 = ao.a(parcel, this.items);
        while (a2.hasNext()) {
            ((RecomSettingsRecomThemeDto) a2.next()).writeToParcel(parcel, i);
        }
    }
}
