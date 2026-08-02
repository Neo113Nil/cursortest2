package com.vk.api.generated.wall.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.nr;
import xsna.pmi0;
import xsna.uqi;
import xsna.zcl;

/* compiled from: WallViewsDto.kt */
/* loaded from: classes15.dex */
public final class WallViewsDto implements Parcelable {
    public static final Parcelable.Creator<WallViewsDto> CREATOR = new a();

    @pmi0("count")
    private final Integer count;

    /* compiled from: WallViewsDto.kt */
    public static final class a implements Parcelable.Creator<WallViewsDto> {
        @Override // android.os.Parcelable.Creator
        public final WallViewsDto createFromParcel(Parcel parcel) {
            return new WallViewsDto(parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
        }

        @Override // android.os.Parcelable.Creator
        public final WallViewsDto[] newArray(int i) {
            return new WallViewsDto[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public WallViewsDto() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public final Integer d() {
        return this.count;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof WallViewsDto) && epx.f(this.count, ((WallViewsDto) obj).count);
    }

    public final int hashCode() {
        Integer num = this.count;
        if (num == null) {
            return 0;
        }
        return num.hashCode();
    }

    public final String toString() {
        return uqi.b(new StringBuilder("WallViewsDto(count="), this.count, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Integer num = this.count;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
    }

    public WallViewsDto(Integer num) {
        this.count = num;
    }

    public /* synthetic */ WallViewsDto(Integer num, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : num);
    }
}
