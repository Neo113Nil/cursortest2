package com.vk.api.generated.wall.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.fyber.inneractive.sdk.external.InneractiveMediationNameConsts;
import io.reactivex.rxjava3.subjects.b;
import ru.ok.tracer.base.ucum.UcumUtils;
import xsna.epx;
import xsna.pmi0;
import xsna.so;
import xsna.zcl;

/* compiled from: WallAttachmentsConfigCarouselRatioDto.kt */
/* loaded from: classes15.dex */
public final class WallAttachmentsConfigCarouselRatioDto implements Parcelable {
    public static final Parcelable.Creator<WallAttachmentsConfigCarouselRatioDto> CREATOR = new a();

    @pmi0(InneractiveMediationNameConsts.MAX)
    private final Float max;

    @pmi0(UcumUtils.UCUM_MINUTES)
    private final Float min;

    /* compiled from: WallAttachmentsConfigCarouselRatioDto.kt */
    public static final class a implements Parcelable.Creator<WallAttachmentsConfigCarouselRatioDto> {
        @Override // android.os.Parcelable.Creator
        public final WallAttachmentsConfigCarouselRatioDto createFromParcel(Parcel parcel) {
            return new WallAttachmentsConfigCarouselRatioDto(parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat()), parcel.readInt() != 0 ? Float.valueOf(parcel.readFloat()) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final WallAttachmentsConfigCarouselRatioDto[] newArray(int i) {
            return new WallAttachmentsConfigCarouselRatioDto[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public WallAttachmentsConfigCarouselRatioDto() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public final Float d() {
        return this.max;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final Float e() {
        return this.min;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WallAttachmentsConfigCarouselRatioDto)) {
            return false;
        }
        WallAttachmentsConfigCarouselRatioDto wallAttachmentsConfigCarouselRatioDto = (WallAttachmentsConfigCarouselRatioDto) obj;
        return epx.f(this.min, wallAttachmentsConfigCarouselRatioDto.min) && epx.f(this.max, wallAttachmentsConfigCarouselRatioDto.max);
    }

    public final int hashCode() {
        Float f = this.min;
        int hashCode = (f == null ? 0 : f.hashCode()) * 31;
        Float f2 = this.max;
        return hashCode + (f2 != null ? f2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("WallAttachmentsConfigCarouselRatioDto(min=");
        sb.append(this.min);
        sb.append(", max=");
        return so.b(sb, this.max, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Float f = this.min;
        if (f == null) {
            parcel.writeInt(0);
        } else {
            b.d(parcel, 1, f);
        }
        Float f2 = this.max;
        if (f2 == null) {
            parcel.writeInt(0);
        } else {
            b.d(parcel, 1, f2);
        }
    }

    public WallAttachmentsConfigCarouselRatioDto(Float f, Float f2) {
        this.min = f;
        this.max = f2;
    }

    public /* synthetic */ WallAttachmentsConfigCarouselRatioDto(Float f, Float f2, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : f, (i & 2) != 0 ? null : f2);
    }
}
