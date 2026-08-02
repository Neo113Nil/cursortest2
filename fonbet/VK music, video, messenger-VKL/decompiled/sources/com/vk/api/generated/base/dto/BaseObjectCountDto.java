package com.vk.api.generated.base.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.nr;
import xsna.pmi0;
import xsna.uqi;
import xsna.zcl;

/* compiled from: BaseObjectCountDto.kt */
/* loaded from: classes14.dex */
public final class BaseObjectCountDto implements Parcelable {
    public static final Parcelable.Creator<BaseObjectCountDto> CREATOR = new a();

    @pmi0("count")
    private final Integer count;

    /* compiled from: BaseObjectCountDto.kt */
    public static final class a implements Parcelable.Creator<BaseObjectCountDto> {
        @Override // android.os.Parcelable.Creator
        public final BaseObjectCountDto createFromParcel(Parcel parcel) {
            return new BaseObjectCountDto(parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
        }

        @Override // android.os.Parcelable.Creator
        public final BaseObjectCountDto[] newArray(int i) {
            return new BaseObjectCountDto[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public BaseObjectCountDto() {
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
        return (obj instanceof BaseObjectCountDto) && epx.f(this.count, ((BaseObjectCountDto) obj).count);
    }

    public final int hashCode() {
        Integer num = this.count;
        if (num == null) {
            return 0;
        }
        return num.hashCode();
    }

    public final String toString() {
        return uqi.b(new StringBuilder("BaseObjectCountDto(count="), this.count, ')');
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

    public BaseObjectCountDto(Integer num) {
        this.count = num;
    }

    public /* synthetic */ BaseObjectCountDto(Integer num, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : num);
    }
}
