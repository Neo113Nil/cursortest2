package com.vk.api.generated.docs.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.pmi0;
import xsna.urd0;
import xsna.vu5;

/* compiled from: DocsDocTypesDto.kt */
/* loaded from: classes14.dex */
public final class DocsDocTypesDto implements Parcelable {
    public static final Parcelable.Creator<DocsDocTypesDto> CREATOR = new a();

    @pmi0("count")
    private final int count;

    @pmi0("id")
    private final int id;

    @pmi0("name")
    private final String name;

    /* compiled from: DocsDocTypesDto.kt */
    public static final class a implements Parcelable.Creator<DocsDocTypesDto> {
        @Override // android.os.Parcelable.Creator
        public final DocsDocTypesDto createFromParcel(Parcel parcel) {
            return new DocsDocTypesDto(parcel.readInt(), parcel.readString(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final DocsDocTypesDto[] newArray(int i) {
            return new DocsDocTypesDto[i];
        }
    }

    public DocsDocTypesDto(int i, String str, int i2) {
        this.id = i;
        this.name = str;
        this.count = i2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DocsDocTypesDto)) {
            return false;
        }
        DocsDocTypesDto docsDocTypesDto = (DocsDocTypesDto) obj;
        return this.id == docsDocTypesDto.id && epx.f(this.name, docsDocTypesDto.name) && this.count == docsDocTypesDto.count;
    }

    public final int getCount() {
        return this.count;
    }

    public final int getId() {
        return this.id;
    }

    public final int hashCode() {
        return Integer.hashCode(this.count) + urd0.a(Integer.hashCode(this.id) * 31, 31, this.name);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DocsDocTypesDto(id=");
        sb.append(this.id);
        sb.append(", name=");
        sb.append(this.name);
        sb.append(", count=");
        return vu5.b(sb, this.count, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.id);
        parcel.writeString(this.name);
        parcel.writeInt(this.count);
    }
}
