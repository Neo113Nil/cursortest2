package com.vk.api.generated.apps.dto;

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

/* compiled from: AppsGetRecommendationsResponseDto.kt */
/* loaded from: classes14.dex */
public final class AppsGetRecommendationsResponseDto implements Parcelable {
    public static final Parcelable.Creator<AppsGetRecommendationsResponseDto> CREATOR = new a();

    @pmi0("count")
    private final int count;

    @pmi0("items")
    private final List<AppsHintAppItemDto> items;

    /* compiled from: AppsGetRecommendationsResponseDto.kt */
    public static final class a implements Parcelable.Creator<AppsGetRecommendationsResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final AppsGetRecommendationsResponseDto createFromParcel(Parcel parcel) {
            int readInt = parcel.readInt();
            int readInt2 = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt2);
            int i = 0;
            while (i != readInt2) {
                i = en.a(AppsHintAppItemDto.CREATOR, parcel, arrayList, i, 1);
            }
            return new AppsGetRecommendationsResponseDto(readInt, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final AppsGetRecommendationsResponseDto[] newArray(int i) {
            return new AppsGetRecommendationsResponseDto[i];
        }
    }

    public AppsGetRecommendationsResponseDto(int i, List<AppsHintAppItemDto> list) {
        this.count = i;
        this.items = list;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AppsGetRecommendationsResponseDto)) {
            return false;
        }
        AppsGetRecommendationsResponseDto appsGetRecommendationsResponseDto = (AppsGetRecommendationsResponseDto) obj;
        return this.count == appsGetRecommendationsResponseDto.count && epx.f(this.items, appsGetRecommendationsResponseDto.items);
    }

    public final int hashCode() {
        return this.items.hashCode() + (Integer.hashCode(this.count) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AppsGetRecommendationsResponseDto(count=");
        sb.append(this.count);
        sb.append(", items=");
        return ms9.a(')', sb, this.items);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.count);
        Iterator a2 = ao.a(parcel, this.items);
        while (a2.hasNext()) {
            ((AppsHintAppItemDto) a2.next()).writeToParcel(parcel, i);
        }
    }
}
