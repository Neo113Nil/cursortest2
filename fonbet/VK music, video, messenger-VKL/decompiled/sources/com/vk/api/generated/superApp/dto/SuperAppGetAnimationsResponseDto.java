package com.vk.api.generated.superApp.dto;

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

/* compiled from: SuperAppGetAnimationsResponseDto.kt */
/* loaded from: classes15.dex */
public final class SuperAppGetAnimationsResponseDto implements Parcelable {
    public static final Parcelable.Creator<SuperAppGetAnimationsResponseDto> CREATOR = new a();

    @pmi0("items")
    private final List<SuperAppAnimationDto> items;

    @pmi0("ttl")
    private final int ttl;

    /* compiled from: SuperAppGetAnimationsResponseDto.kt */
    public static final class a implements Parcelable.Creator<SuperAppGetAnimationsResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final SuperAppGetAnimationsResponseDto createFromParcel(Parcel parcel) {
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            int i = 0;
            while (i != readInt) {
                i = en.a(SuperAppAnimationDto.CREATOR, parcel, arrayList, i, 1);
            }
            return new SuperAppGetAnimationsResponseDto(arrayList, parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final SuperAppGetAnimationsResponseDto[] newArray(int i) {
            return new SuperAppGetAnimationsResponseDto[i];
        }
    }

    public SuperAppGetAnimationsResponseDto(List<SuperAppAnimationDto> list, int i) {
        this.items = list;
        this.ttl = i;
    }

    public final List<SuperAppAnimationDto> d() {
        return this.items;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final int e() {
        return this.ttl;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SuperAppGetAnimationsResponseDto)) {
            return false;
        }
        SuperAppGetAnimationsResponseDto superAppGetAnimationsResponseDto = (SuperAppGetAnimationsResponseDto) obj;
        return epx.f(this.items, superAppGetAnimationsResponseDto.items) && this.ttl == superAppGetAnimationsResponseDto.ttl;
    }

    public final int hashCode() {
        return Integer.hashCode(this.ttl) + (this.items.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SuperAppGetAnimationsResponseDto(items=");
        sb.append(this.items);
        sb.append(", ttl=");
        return vu5.b(sb, this.ttl, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Iterator a2 = ao.a(parcel, this.items);
        while (a2.hasNext()) {
            ((SuperAppAnimationDto) a2.next()).writeToParcel(parcel, i);
        }
        parcel.writeInt(this.ttl);
    }
}
