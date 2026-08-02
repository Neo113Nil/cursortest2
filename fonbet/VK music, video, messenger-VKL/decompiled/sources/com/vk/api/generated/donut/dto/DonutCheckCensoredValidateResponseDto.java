package com.vk.api.generated.donut.dto;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;
import xsna.epx;
import xsna.ms9;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: DonutCheckCensoredValidateResponseDto.kt */
/* loaded from: classes14.dex */
public final class DonutCheckCensoredValidateResponseDto implements Parcelable {
    public static final Parcelable.Creator<DonutCheckCensoredValidateResponseDto> CREATOR = new a();

    @pmi0("results")
    private final List<String> results;

    /* compiled from: DonutCheckCensoredValidateResponseDto.kt */
    public static final class a implements Parcelable.Creator<DonutCheckCensoredValidateResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final DonutCheckCensoredValidateResponseDto createFromParcel(Parcel parcel) {
            return new DonutCheckCensoredValidateResponseDto(parcel.createStringArrayList());
        }

        @Override // android.os.Parcelable.Creator
        public final DonutCheckCensoredValidateResponseDto[] newArray(int i) {
            return new DonutCheckCensoredValidateResponseDto[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public DonutCheckCensoredValidateResponseDto() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public final List<String> d() {
        return this.results;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof DonutCheckCensoredValidateResponseDto) && epx.f(this.results, ((DonutCheckCensoredValidateResponseDto) obj).results);
    }

    public final int hashCode() {
        List<String> list = this.results;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    public final String toString() {
        return ms9.a(')', new StringBuilder("DonutCheckCensoredValidateResponseDto(results="), this.results);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeStringList(this.results);
    }

    public DonutCheckCensoredValidateResponseDto(List<String> list) {
        this.results = list;
    }

    public /* synthetic */ DonutCheckCensoredValidateResponseDto(List list, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : list);
    }
}
