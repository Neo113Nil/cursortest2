package com.vk.api.generated.shortVideo.dto;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.bo;
import xsna.dn;
import xsna.epx;
import xsna.ms9;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: ShortVideoGetCompilationsInfoResponseDto.kt */
/* loaded from: classes15.dex */
public final class ShortVideoGetCompilationsInfoResponseDto implements Parcelable {
    public static final Parcelable.Creator<ShortVideoGetCompilationsInfoResponseDto> CREATOR = new a();

    @pmi0("compilations")
    private final List<ShortVideoCompilationInfoDto> compilations;

    /* compiled from: ShortVideoGetCompilationsInfoResponseDto.kt */
    public static final class a implements Parcelable.Creator<ShortVideoGetCompilationsInfoResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final ShortVideoGetCompilationsInfoResponseDto createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(readInt);
                int i = 0;
                while (i != readInt) {
                    i = bo.b(ShortVideoGetCompilationsInfoResponseDto.class, parcel, arrayList2, i, 1);
                }
                arrayList = arrayList2;
            }
            return new ShortVideoGetCompilationsInfoResponseDto(arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final ShortVideoGetCompilationsInfoResponseDto[] newArray(int i) {
            return new ShortVideoGetCompilationsInfoResponseDto[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ShortVideoGetCompilationsInfoResponseDto() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ShortVideoGetCompilationsInfoResponseDto) && epx.f(this.compilations, ((ShortVideoGetCompilationsInfoResponseDto) obj).compilations);
    }

    public final int hashCode() {
        List<ShortVideoCompilationInfoDto> list = this.compilations;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    public final String toString() {
        return ms9.a(')', new StringBuilder("ShortVideoGetCompilationsInfoResponseDto(compilations="), this.compilations);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        List<ShortVideoCompilationInfoDto> list = this.compilations;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator f = dn.f(parcel, list, 1);
        while (f.hasNext()) {
            parcel.writeParcelable((Parcelable) f.next(), i);
        }
    }

    public ShortVideoGetCompilationsInfoResponseDto(List<ShortVideoCompilationInfoDto> list) {
        this.compilations = list;
    }

    public /* synthetic */ ShortVideoGetCompilationsInfoResponseDto(List list, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : list);
    }
}
