package com.vk.api.generated.shortVideo.dto;

import android.os.Parcel;
import android.os.Parcelable;
import io.reactivex.rxjava3.subjects.b;
import java.util.List;
import xsna.epx;
import xsna.nr;
import xsna.pmi0;
import xsna.uqi;
import xsna.zcl;

/* compiled from: ShortVideoShortVideoTimelineThumbsDto.kt */
/* loaded from: classes15.dex */
public final class ShortVideoShortVideoTimelineThumbsDto implements Parcelable {
    public static final Parcelable.Creator<ShortVideoShortVideoTimelineThumbsDto> CREATOR = new a();

    @pmi0("count_per_image")
    private final Integer countPerImage;

    @pmi0("count_per_row")
    private final Integer countPerRow;

    @pmi0("count_total")
    private final Integer countTotal;

    @pmi0("frame_height")
    private final Integer frameHeight;

    @pmi0("frame_width")
    private final Float frameWidth;

    @pmi0("frequency")
    private final Integer frequency;

    @pmi0("links")
    private final List<String> links;

    /* compiled from: ShortVideoShortVideoTimelineThumbsDto.kt */
    public static final class a implements Parcelable.Creator<ShortVideoShortVideoTimelineThumbsDto> {
        @Override // android.os.Parcelable.Creator
        public final ShortVideoShortVideoTimelineThumbsDto createFromParcel(Parcel parcel) {
            return new ShortVideoShortVideoTimelineThumbsDto(parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat()), parcel.createStringArrayList(), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final ShortVideoShortVideoTimelineThumbsDto[] newArray(int i) {
            return new ShortVideoShortVideoTimelineThumbsDto[i];
        }
    }

    public ShortVideoShortVideoTimelineThumbsDto() {
        this(null, null, null, null, null, null, null, 127, null);
    }

    public final Integer d() {
        return this.countPerImage;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final Integer e() {
        return this.countPerRow;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ShortVideoShortVideoTimelineThumbsDto)) {
            return false;
        }
        ShortVideoShortVideoTimelineThumbsDto shortVideoShortVideoTimelineThumbsDto = (ShortVideoShortVideoTimelineThumbsDto) obj;
        return epx.f(this.countPerImage, shortVideoShortVideoTimelineThumbsDto.countPerImage) && epx.f(this.countPerRow, shortVideoShortVideoTimelineThumbsDto.countPerRow) && epx.f(this.countTotal, shortVideoShortVideoTimelineThumbsDto.countTotal) && epx.f(this.frameHeight, shortVideoShortVideoTimelineThumbsDto.frameHeight) && epx.f(this.frameWidth, shortVideoShortVideoTimelineThumbsDto.frameWidth) && epx.f(this.links, shortVideoShortVideoTimelineThumbsDto.links) && epx.f(this.frequency, shortVideoShortVideoTimelineThumbsDto.frequency);
    }

    public final Integer f() {
        return this.countTotal;
    }

    public final Integer g() {
        return this.frameHeight;
    }

    public final int hashCode() {
        Integer num = this.countPerImage;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.countPerRow;
        int hashCode2 = (hashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.countTotal;
        int hashCode3 = (hashCode2 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.frameHeight;
        int hashCode4 = (hashCode3 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Float f = this.frameWidth;
        int hashCode5 = (hashCode4 + (f == null ? 0 : f.hashCode())) * 31;
        List<String> list = this.links;
        int hashCode6 = (hashCode5 + (list == null ? 0 : list.hashCode())) * 31;
        Integer num5 = this.frequency;
        return hashCode6 + (num5 != null ? num5.hashCode() : 0);
    }

    public final Float i() {
        return this.frameWidth;
    }

    public final Integer j() {
        return this.frequency;
    }

    public final List<String> k() {
        return this.links;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ShortVideoShortVideoTimelineThumbsDto(countPerImage=");
        sb.append(this.countPerImage);
        sb.append(", countPerRow=");
        sb.append(this.countPerRow);
        sb.append(", countTotal=");
        sb.append(this.countTotal);
        sb.append(", frameHeight=");
        sb.append(this.frameHeight);
        sb.append(", frameWidth=");
        sb.append(this.frameWidth);
        sb.append(", links=");
        sb.append(this.links);
        sb.append(", frequency=");
        return uqi.b(sb, this.frequency, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Integer num = this.countPerImage;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
        Integer num2 = this.countPerRow;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num2);
        }
        Integer num3 = this.countTotal;
        if (num3 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num3);
        }
        Integer num4 = this.frameHeight;
        if (num4 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num4);
        }
        Float f = this.frameWidth;
        if (f == null) {
            parcel.writeInt(0);
        } else {
            b.d(parcel, 1, f);
        }
        parcel.writeStringList(this.links);
        Integer num5 = this.frequency;
        if (num5 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num5);
        }
    }

    public ShortVideoShortVideoTimelineThumbsDto(Integer num, Integer num2, Integer num3, Integer num4, Float f, List<String> list, Integer num5) {
        this.countPerImage = num;
        this.countPerRow = num2;
        this.countTotal = num3;
        this.frameHeight = num4;
        this.frameWidth = f;
        this.links = list;
        this.frequency = num5;
    }

    public /* synthetic */ ShortVideoShortVideoTimelineThumbsDto(Integer num, Integer num2, Integer num3, Integer num4, Float f, List list, Integer num5, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : num2, (i & 4) != 0 ? null : num3, (i & 8) != 0 ? null : num4, (i & 16) != 0 ? null : f, (i & 32) != 0 ? null : list, (i & 64) != 0 ? null : num5);
    }
}
