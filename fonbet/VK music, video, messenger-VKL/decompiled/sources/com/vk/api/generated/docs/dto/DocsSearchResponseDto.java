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

/* compiled from: DocsSearchResponseDto.kt */
/* loaded from: classes14.dex */
public final class DocsSearchResponseDto implements Parcelable {
    public static final Parcelable.Creator<DocsSearchResponseDto> CREATOR = new a();

    @pmi0("count")
    private final int count;

    @pmi0("items")
    private final List<DocsDocDto> items;

    @pmi0("total_count")
    private final int totalCount;

    /* compiled from: DocsSearchResponseDto.kt */
    public static final class a implements Parcelable.Creator<DocsSearchResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final DocsSearchResponseDto createFromParcel(Parcel parcel) {
            int readInt = parcel.readInt();
            int readInt2 = parcel.readInt();
            int readInt3 = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt3);
            int i = 0;
            while (i != readInt3) {
                i = bo.b(DocsSearchResponseDto.class, parcel, arrayList, i, 1);
            }
            return new DocsSearchResponseDto(readInt, readInt2, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final DocsSearchResponseDto[] newArray(int i) {
            return new DocsSearchResponseDto[i];
        }
    }

    public DocsSearchResponseDto(int i, int i2, List<DocsDocDto> list) {
        this.count = i;
        this.totalCount = i2;
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
        if (!(obj instanceof DocsSearchResponseDto)) {
            return false;
        }
        DocsSearchResponseDto docsSearchResponseDto = (DocsSearchResponseDto) obj;
        return this.count == docsSearchResponseDto.count && this.totalCount == docsSearchResponseDto.totalCount && epx.f(this.items, docsSearchResponseDto.items);
    }

    public final int hashCode() {
        return this.items.hashCode() + shy.a(this.totalCount, Integer.hashCode(this.count) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DocsSearchResponseDto(count=");
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
