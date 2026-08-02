package com.vk.api.generated.masks.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.nr;
import xsna.pmi0;
import xsna.uqi;
import xsna.zcl;

/* compiled from: MasksCounterDto.kt */
/* loaded from: classes15.dex */
public final class MasksCounterDto implements Parcelable {
    public static final Parcelable.Creator<MasksCounterDto> CREATOR = new a();

    @pmi0("clips_count")
    private final Integer clipsCount;

    @pmi0("id")
    private final int id;

    /* compiled from: MasksCounterDto.kt */
    public static final class a implements Parcelable.Creator<MasksCounterDto> {
        @Override // android.os.Parcelable.Creator
        public final MasksCounterDto createFromParcel(Parcel parcel) {
            return new MasksCounterDto(parcel.readInt(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
        }

        @Override // android.os.Parcelable.Creator
        public final MasksCounterDto[] newArray(int i) {
            return new MasksCounterDto[i];
        }
    }

    public MasksCounterDto(int i, Integer num) {
        this.id = i;
        this.clipsCount = num;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MasksCounterDto)) {
            return false;
        }
        MasksCounterDto masksCounterDto = (MasksCounterDto) obj;
        return this.id == masksCounterDto.id && epx.f(this.clipsCount, masksCounterDto.clipsCount);
    }

    public final int hashCode() {
        int hashCode = Integer.hashCode(this.id) * 31;
        Integer num = this.clipsCount;
        return hashCode + (num == null ? 0 : num.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MasksCounterDto(id=");
        sb.append(this.id);
        sb.append(", clipsCount=");
        return uqi.b(sb, this.clipsCount, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.id);
        Integer num = this.clipsCount;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
    }

    public /* synthetic */ MasksCounterDto(int i, Integer num, int i2, zcl zclVar) {
        this(i, (i2 & 2) != 0 ? null : num);
    }
}
