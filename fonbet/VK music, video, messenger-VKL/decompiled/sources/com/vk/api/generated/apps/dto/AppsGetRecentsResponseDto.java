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

/* compiled from: AppsGetRecentsResponseDto.kt */
/* loaded from: classes14.dex */
public final class AppsGetRecentsResponseDto implements Parcelable {
    public static final Parcelable.Creator<AppsGetRecentsResponseDto> CREATOR = new a();

    @pmi0("count")
    private final int count;

    @pmi0("items")
    private final List<AppsHintAppItemDto> items;

    /* compiled from: AppsGetRecentsResponseDto.kt */
    public static final class a implements Parcelable.Creator<AppsGetRecentsResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final AppsGetRecentsResponseDto createFromParcel(Parcel parcel) {
            int readInt = parcel.readInt();
            int readInt2 = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt2);
            int i = 0;
            while (i != readInt2) {
                i = en.a(AppsHintAppItemDto.CREATOR, parcel, arrayList, i, 1);
            }
            return new AppsGetRecentsResponseDto(readInt, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final AppsGetRecentsResponseDto[] newArray(int i) {
            return new AppsGetRecentsResponseDto[i];
        }
    }

    public AppsGetRecentsResponseDto(int i, List<AppsHintAppItemDto> list) {
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
        if (!(obj instanceof AppsGetRecentsResponseDto)) {
            return false;
        }
        AppsGetRecentsResponseDto appsGetRecentsResponseDto = (AppsGetRecentsResponseDto) obj;
        return this.count == appsGetRecentsResponseDto.count && epx.f(this.items, appsGetRecentsResponseDto.items);
    }

    public final int hashCode() {
        return this.items.hashCode() + (Integer.hashCode(this.count) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AppsGetRecentsResponseDto(count=");
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
