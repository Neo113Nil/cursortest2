package com.vk.api.generated.store.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.nr;
import xsna.pmi0;
import xsna.uqi;
import xsna.zcl;

/* compiled from: StoreSpecialEventPopupShortDto.kt */
/* loaded from: classes15.dex */
public final class StoreSpecialEventPopupShortDto implements Parcelable {
    public static final Parcelable.Creator<StoreSpecialEventPopupShortDto> CREATOR = new a();

    @pmi0("delay")
    private final Integer delay;

    /* compiled from: StoreSpecialEventPopupShortDto.kt */
    public static final class a implements Parcelable.Creator<StoreSpecialEventPopupShortDto> {
        @Override // android.os.Parcelable.Creator
        public final StoreSpecialEventPopupShortDto createFromParcel(Parcel parcel) {
            return new StoreSpecialEventPopupShortDto(parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
        }

        @Override // android.os.Parcelable.Creator
        public final StoreSpecialEventPopupShortDto[] newArray(int i) {
            return new StoreSpecialEventPopupShortDto[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public StoreSpecialEventPopupShortDto() {
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
        return (obj instanceof StoreSpecialEventPopupShortDto) && epx.f(this.delay, ((StoreSpecialEventPopupShortDto) obj).delay);
    }

    public final int hashCode() {
        Integer num = this.delay;
        if (num == null) {
            return 0;
        }
        return num.hashCode();
    }

    public final String toString() {
        return uqi.b(new StringBuilder("StoreSpecialEventPopupShortDto(delay="), this.delay, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Integer num = this.delay;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
    }

    public StoreSpecialEventPopupShortDto(Integer num) {
        this.delay = num;
    }

    public /* synthetic */ StoreSpecialEventPopupShortDto(Integer num, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : num);
    }
}
