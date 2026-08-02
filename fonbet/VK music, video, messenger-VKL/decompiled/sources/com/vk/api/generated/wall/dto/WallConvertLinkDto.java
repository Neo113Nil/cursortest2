package com.vk.api.generated.wall.dto;

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

/* compiled from: WallConvertLinkDto.kt */
/* loaded from: classes15.dex */
public final class WallConvertLinkDto implements Parcelable {
    public static final Parcelable.Creator<WallConvertLinkDto> CREATOR = new a();

    @pmi0("data")
    private final List<WallWallpostAttachmentDto> data;

    /* compiled from: WallConvertLinkDto.kt */
    public static final class a implements Parcelable.Creator<WallConvertLinkDto> {
        @Override // android.os.Parcelable.Creator
        public final WallConvertLinkDto createFromParcel(Parcel parcel) {
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            int i = 0;
            while (i != readInt) {
                i = bo.b(WallConvertLinkDto.class, parcel, arrayList, i, 1);
            }
            return new WallConvertLinkDto(arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final WallConvertLinkDto[] newArray(int i) {
            return new WallConvertLinkDto[i];
        }
    }

    public WallConvertLinkDto(List<WallWallpostAttachmentDto> list) {
        this.data = list;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof WallConvertLinkDto) && epx.f(this.data, ((WallConvertLinkDto) obj).data);
    }

    public final int hashCode() {
        return this.data.hashCode();
    }

    public final String toString() {
        return ms9.a(')', new StringBuilder("WallConvertLinkDto(data="), this.data);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Iterator a2 = ao.a(parcel, this.data);
        while (a2.hasNext()) {
            parcel.writeParcelable((Parcelable) a2.next(), i);
        }
    }
}
