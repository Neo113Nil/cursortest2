package com.vk.api.generated.stickers.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.nr;
import xsna.pmi0;
import xsna.uqi;
import xsna.zcl;

/* compiled from: StickersBonusDto.kt */
/* loaded from: classes15.dex */
public final class StickersBonusDto implements Parcelable {
    public static final Parcelable.Creator<StickersBonusDto> CREATOR = new a();

    @pmi0("expire_period")
    private final Integer expirePeriod;

    @pmi0("value")
    private final int value;

    /* compiled from: StickersBonusDto.kt */
    public static final class a implements Parcelable.Creator<StickersBonusDto> {
        @Override // android.os.Parcelable.Creator
        public final StickersBonusDto createFromParcel(Parcel parcel) {
            return new StickersBonusDto(parcel.readInt(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
        }

        @Override // android.os.Parcelable.Creator
        public final StickersBonusDto[] newArray(int i) {
            return new StickersBonusDto[i];
        }
    }

    public StickersBonusDto(int i, Integer num) {
        this.value = i;
        this.expirePeriod = num;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StickersBonusDto)) {
            return false;
        }
        StickersBonusDto stickersBonusDto = (StickersBonusDto) obj;
        return this.value == stickersBonusDto.value && epx.f(this.expirePeriod, stickersBonusDto.expirePeriod);
    }

    public final int hashCode() {
        int hashCode = Integer.hashCode(this.value) * 31;
        Integer num = this.expirePeriod;
        return hashCode + (num == null ? 0 : num.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StickersBonusDto(value=");
        sb.append(this.value);
        sb.append(", expirePeriod=");
        return uqi.b(sb, this.expirePeriod, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.value);
        Integer num = this.expirePeriod;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
    }

    public /* synthetic */ StickersBonusDto(int i, Integer num, int i2, zcl zclVar) {
        this(i, (i2 & 2) != 0 ? null : num);
    }
}
