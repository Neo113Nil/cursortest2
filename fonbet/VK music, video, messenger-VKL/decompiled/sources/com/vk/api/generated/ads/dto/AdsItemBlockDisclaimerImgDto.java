package com.vk.api.generated.ads.dto;

import android.os.Parcel;
import android.os.Parcelable;
import io.reactivex.rxjava3.subjects.b;
import xsna.epx;
import xsna.nr;
import xsna.pmi0;
import xsna.uqi;
import xsna.zcl;

/* compiled from: AdsItemBlockDisclaimerImgDto.kt */
/* loaded from: classes14.dex */
public final class AdsItemBlockDisclaimerImgDto implements Parcelable {
    public static final Parcelable.Creator<AdsItemBlockDisclaimerImgDto> CREATOR = new a();

    @pmi0("id")
    private final String id;

    @pmi0("image_ratio")
    private final Float imageRatio;

    @pmi0("min_height")
    private final Integer minHeight;

    /* compiled from: AdsItemBlockDisclaimerImgDto.kt */
    public static final class a implements Parcelable.Creator<AdsItemBlockDisclaimerImgDto> {
        @Override // android.os.Parcelable.Creator
        public final AdsItemBlockDisclaimerImgDto createFromParcel(Parcel parcel) {
            return new AdsItemBlockDisclaimerImgDto(parcel.readString(), parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat()), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final AdsItemBlockDisclaimerImgDto[] newArray(int i) {
            return new AdsItemBlockDisclaimerImgDto[i];
        }
    }

    public AdsItemBlockDisclaimerImgDto() {
        this(null, null, null, 7, null);
    }

    public final Float d() {
        return this.imageRatio;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final Integer e() {
        return this.minHeight;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AdsItemBlockDisclaimerImgDto)) {
            return false;
        }
        AdsItemBlockDisclaimerImgDto adsItemBlockDisclaimerImgDto = (AdsItemBlockDisclaimerImgDto) obj;
        return epx.f(this.id, adsItemBlockDisclaimerImgDto.id) && epx.f(this.imageRatio, adsItemBlockDisclaimerImgDto.imageRatio) && epx.f(this.minHeight, adsItemBlockDisclaimerImgDto.minHeight);
    }

    public final String getId() {
        return this.id;
    }

    public final int hashCode() {
        String str = this.id;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Float f = this.imageRatio;
        int hashCode2 = (hashCode + (f == null ? 0 : f.hashCode())) * 31;
        Integer num = this.minHeight;
        return hashCode2 + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AdsItemBlockDisclaimerImgDto(id=");
        sb.append(this.id);
        sb.append(", imageRatio=");
        sb.append(this.imageRatio);
        sb.append(", minHeight=");
        return uqi.b(sb, this.minHeight, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.id);
        Float f = this.imageRatio;
        if (f == null) {
            parcel.writeInt(0);
        } else {
            b.d(parcel, 1, f);
        }
        Integer num = this.minHeight;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
    }

    public AdsItemBlockDisclaimerImgDto(String str, Float f, Integer num) {
        this.id = str;
        this.imageRatio = f;
        this.minHeight = num;
    }

    public /* synthetic */ AdsItemBlockDisclaimerImgDto(String str, Float f, Integer num, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : f, (i & 4) != 0 ? null : num);
    }
}
