package com.vk.api.generated.store.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.nr;
import xsna.pmi0;
import xsna.shy;
import xsna.uqi;
import xsna.zcl;

/* compiled from: StoreSpecialEventAnimationDto.kt */
/* loaded from: classes15.dex */
public final class StoreSpecialEventAnimationDto implements Parcelable {
    public static final Parcelable.Creator<StoreSpecialEventAnimationDto> CREATOR = new a();

    @pmi0("delay")
    private final Integer delay;

    @pmi0("duration")
    private final int duration;

    @pmi0("height")
    private final Integer height;

    @pmi0("url")
    private final String url;

    @pmi0("width")
    private final Integer width;

    /* compiled from: StoreSpecialEventAnimationDto.kt */
    public static final class a implements Parcelable.Creator<StoreSpecialEventAnimationDto> {
        @Override // android.os.Parcelable.Creator
        public final StoreSpecialEventAnimationDto createFromParcel(Parcel parcel) {
            return new StoreSpecialEventAnimationDto(parcel.readString(), parcel.readInt(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final StoreSpecialEventAnimationDto[] newArray(int i) {
            return new StoreSpecialEventAnimationDto[i];
        }
    }

    public StoreSpecialEventAnimationDto(String str, int i, Integer num, Integer num2, Integer num3) {
        this.url = str;
        this.duration = i;
        this.delay = num;
        this.width = num2;
        this.height = num3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StoreSpecialEventAnimationDto)) {
            return false;
        }
        StoreSpecialEventAnimationDto storeSpecialEventAnimationDto = (StoreSpecialEventAnimationDto) obj;
        return epx.f(this.url, storeSpecialEventAnimationDto.url) && this.duration == storeSpecialEventAnimationDto.duration && epx.f(this.delay, storeSpecialEventAnimationDto.delay) && epx.f(this.width, storeSpecialEventAnimationDto.width) && epx.f(this.height, storeSpecialEventAnimationDto.height);
    }

    public final int hashCode() {
        int a2 = shy.a(this.duration, this.url.hashCode() * 31, 31);
        Integer num = this.delay;
        int hashCode = (a2 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.width;
        int hashCode2 = (hashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.height;
        return hashCode2 + (num3 != null ? num3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StoreSpecialEventAnimationDto(url=");
        sb.append(this.url);
        sb.append(", duration=");
        sb.append(this.duration);
        sb.append(", delay=");
        sb.append(this.delay);
        sb.append(", width=");
        sb.append(this.width);
        sb.append(", height=");
        return uqi.b(sb, this.height, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.url);
        parcel.writeInt(this.duration);
        Integer num = this.delay;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
        Integer num2 = this.width;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num2);
        }
        Integer num3 = this.height;
        if (num3 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num3);
        }
    }

    public /* synthetic */ StoreSpecialEventAnimationDto(String str, int i, Integer num, Integer num2, Integer num3, int i2, zcl zclVar) {
        this(str, i, (i2 & 4) != 0 ? null : num, (i2 & 8) != 0 ? null : num2, (i2 & 16) != 0 ? null : num3);
    }
}
