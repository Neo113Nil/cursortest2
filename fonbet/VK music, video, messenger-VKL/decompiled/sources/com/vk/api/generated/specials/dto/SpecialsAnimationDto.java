package com.vk.api.generated.specials.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.nr;
import xsna.pmi0;
import xsna.shy;
import xsna.uqi;
import xsna.zcl;

/* compiled from: SpecialsAnimationDto.kt */
/* loaded from: classes15.dex */
public final class SpecialsAnimationDto implements Parcelable {
    public static final Parcelable.Creator<SpecialsAnimationDto> CREATOR = new a();

    @pmi0("delay")
    private final Integer delay;

    @pmi0("duration")
    private final int duration;

    @pmi0("height")
    private final int height;

    @pmi0("url")
    private final String url;

    @pmi0("width")
    private final int width;

    /* compiled from: SpecialsAnimationDto.kt */
    public static final class a implements Parcelable.Creator<SpecialsAnimationDto> {
        @Override // android.os.Parcelable.Creator
        public final SpecialsAnimationDto createFromParcel(Parcel parcel) {
            return new SpecialsAnimationDto(parcel.readString(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
        }

        @Override // android.os.Parcelable.Creator
        public final SpecialsAnimationDto[] newArray(int i) {
            return new SpecialsAnimationDto[i];
        }
    }

    public SpecialsAnimationDto(String str, int i, int i2, int i3, Integer num) {
        this.url = str;
        this.duration = i;
        this.width = i2;
        this.height = i3;
        this.delay = num;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SpecialsAnimationDto)) {
            return false;
        }
        SpecialsAnimationDto specialsAnimationDto = (SpecialsAnimationDto) obj;
        return epx.f(this.url, specialsAnimationDto.url) && this.duration == specialsAnimationDto.duration && this.width == specialsAnimationDto.width && this.height == specialsAnimationDto.height && epx.f(this.delay, specialsAnimationDto.delay);
    }

    public final int getDuration() {
        return this.duration;
    }

    public final int getHeight() {
        return this.height;
    }

    public final String getUrl() {
        return this.url;
    }

    public final int getWidth() {
        return this.width;
    }

    public final int hashCode() {
        int a2 = shy.a(this.height, shy.a(this.width, shy.a(this.duration, this.url.hashCode() * 31, 31), 31), 31);
        Integer num = this.delay;
        return a2 + (num == null ? 0 : num.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SpecialsAnimationDto(url=");
        sb.append(this.url);
        sb.append(", duration=");
        sb.append(this.duration);
        sb.append(", width=");
        sb.append(this.width);
        sb.append(", height=");
        sb.append(this.height);
        sb.append(", delay=");
        return uqi.b(sb, this.delay, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.url);
        parcel.writeInt(this.duration);
        parcel.writeInt(this.width);
        parcel.writeInt(this.height);
        Integer num = this.delay;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
    }

    public /* synthetic */ SpecialsAnimationDto(String str, int i, int i2, int i3, Integer num, int i4, zcl zclVar) {
        this(str, i, i2, i3, (i4 & 16) != 0 ? null : num);
    }
}
