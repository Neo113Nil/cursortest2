package com.vk.api.generated.money.dto;

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

/* compiled from: MoneyGetVKPayUserBindingsResponseDto.kt */
/* loaded from: classes15.dex */
public final class MoneyGetVKPayUserBindingsResponseDto implements Parcelable {
    public static final Parcelable.Creator<MoneyGetVKPayUserBindingsResponseDto> CREATOR = new a();

    @pmi0("items")
    private final List<MoneyUserBindingsItemDto> items;

    /* compiled from: MoneyGetVKPayUserBindingsResponseDto.kt */
    public static final class a implements Parcelable.Creator<MoneyGetVKPayUserBindingsResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final MoneyGetVKPayUserBindingsResponseDto createFromParcel(Parcel parcel) {
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            int i = 0;
            while (i != readInt) {
                i = en.a(MoneyUserBindingsItemDto.CREATOR, parcel, arrayList, i, 1);
            }
            return new MoneyGetVKPayUserBindingsResponseDto(arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final MoneyGetVKPayUserBindingsResponseDto[] newArray(int i) {
            return new MoneyGetVKPayUserBindingsResponseDto[i];
        }
    }

    public MoneyGetVKPayUserBindingsResponseDto(List<MoneyUserBindingsItemDto> list) {
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
        return (obj instanceof MoneyGetVKPayUserBindingsResponseDto) && epx.f(this.items, ((MoneyGetVKPayUserBindingsResponseDto) obj).items);
    }

    public final int hashCode() {
        return this.items.hashCode();
    }

    public final String toString() {
        return ms9.a(')', new StringBuilder("MoneyGetVKPayUserBindingsResponseDto(items="), this.items);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Iterator a2 = ao.a(parcel, this.items);
        while (a2.hasNext()) {
            ((MoneyUserBindingsItemDto) a2.next()).writeToParcel(parcel, i);
        }
    }
}
