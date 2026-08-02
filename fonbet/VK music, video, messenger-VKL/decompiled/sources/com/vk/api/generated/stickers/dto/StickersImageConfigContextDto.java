package com.vk.api.generated.stickers.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.nr;
import xsna.pmi0;
import xsna.uqi;
import xsna.zcl;

/* compiled from: StickersImageConfigContextDto.kt */
/* loaded from: classes15.dex */
public final class StickersImageConfigContextDto implements Parcelable {
    public static final Parcelable.Creator<StickersImageConfigContextDto> CREATOR = new a();

    @pmi0("config_id")
    private final Integer configId;

    @pmi0("version")
    private final Integer version;

    /* compiled from: StickersImageConfigContextDto.kt */
    public static final class a implements Parcelable.Creator<StickersImageConfigContextDto> {
        @Override // android.os.Parcelable.Creator
        public final StickersImageConfigContextDto createFromParcel(Parcel parcel) {
            return new StickersImageConfigContextDto(parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final StickersImageConfigContextDto[] newArray(int i) {
            return new StickersImageConfigContextDto[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public StickersImageConfigContextDto() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public final Integer d() {
        return this.configId;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final Integer e() {
        return this.version;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StickersImageConfigContextDto)) {
            return false;
        }
        StickersImageConfigContextDto stickersImageConfigContextDto = (StickersImageConfigContextDto) obj;
        return epx.f(this.configId, stickersImageConfigContextDto.configId) && epx.f(this.version, stickersImageConfigContextDto.version);
    }

    public final int hashCode() {
        Integer num = this.configId;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.version;
        return hashCode + (num2 != null ? num2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StickersImageConfigContextDto(configId=");
        sb.append(this.configId);
        sb.append(", version=");
        return uqi.b(sb, this.version, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Integer num = this.configId;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
        Integer num2 = this.version;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num2);
        }
    }

    public StickersImageConfigContextDto(Integer num, Integer num2) {
        this.configId = num;
        this.version = num2;
    }

    public /* synthetic */ StickersImageConfigContextDto(Integer num, Integer num2, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : num2);
    }
}
