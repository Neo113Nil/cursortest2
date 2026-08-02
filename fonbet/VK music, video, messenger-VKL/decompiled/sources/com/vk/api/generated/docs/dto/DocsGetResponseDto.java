package com.vk.api.generated.docs.dto;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.ao;
import xsna.bo;
import xsna.epx;
import xsna.ms9;
import xsna.pmi0;
import xsna.shy;

/* compiled from: DocsGetResponseDto.kt */
/* loaded from: classes14.dex */
public final class DocsGetResponseDto implements Parcelable {
    public static final Parcelable.Creator<DocsGetResponseDto> CREATOR = new a();

    @pmi0("count")
    private final int count;

    @pmi0("items")
    private final List<DocsDocDto> items;

    @pmi0("total_count")
    private final int totalCount;

    /* compiled from: DocsGetResponseDto.kt */
    public static final class a implements Parcelable.Creator<DocsGetResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final DocsGetResponseDto createFromParcel(Parcel parcel) {
            int readInt = parcel.readInt();
            int readInt2 = parcel.readInt();
            int readInt3 = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt3);
            int i = 0;
            while (i != readInt3) {
                i = bo.b(DocsGetResponseDto.class, parcel, arrayList, i, 1);
            }
            return new DocsGetResponseDto(readInt, readInt2, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final DocsGetResponseDto[] newArray(int i) {
            return new DocsGetResponseDto[i];
        }
    }

    public DocsGetResponseDto(int i, int i2, List<DocsDocDto> list) {
        this.count = i;
        this.totalCount = i2;
        this.items = list;
    }

    public final List<DocsDocDto> d() {
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
        if (!(obj instanceof DocsGetResponseDto)) {
            return false;
        }
        DocsGetResponseDto docsGetResponseDto = (DocsGetResponseDto) obj;
        return this.count == docsGetResponseDto.count && this.totalCount == docsGetResponseDto.totalCount && epx.f(this.items, docsGetResponseDto.items);
    }

    public final int getCount() {
        return this.count;
    }

    public final int hashCode() {
        return this.items.hashCode() + shy.a(this.totalCount, Integer.hashCode(this.count) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DocsGetResponseDto(count=");
        sb.append(this.count);
        sb.append(", totalCount=");
        sb.append(this.totalCount);
        sb.append(", items=");
        return ms9.a(')', sb, this.items);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.count);
        parcel.writeInt(this.totalCount);
        Iterator a2 = ao.a(parcel, this.items);
        while (a2.hasNext()) {
            parcel.writeParcelable((Parcelable) a2.next(), i);
        }
    }
}
