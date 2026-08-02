package com.vk.api.generated.adsint.dto;

import android.os.Parcel;
import android.os.Parcelable;
import io.reactivex.rxjava3.subjects.b;
import xsna.epx;
import xsna.pmi0;
import xsna.so;
import xsna.zcl;

/* compiled from: AdsintExtraDataDto.kt */
/* loaded from: classes14.dex */
public final class AdsintExtraDataDto implements Parcelable {
    public static final Parcelable.Creator<AdsintExtraDataDto> CREATOR = new a();

    @pmi0("artist_id")
    private final Float artistId;

    @pmi0("duration")
    private final Float duration;

    /* compiled from: AdsintExtraDataDto.kt */
    public static final class a implements Parcelable.Creator<AdsintExtraDataDto> {
        @Override // android.os.Parcelable.Creator
        public final AdsintExtraDataDto createFromParcel(Parcel parcel) {
            return new AdsintExtraDataDto(parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat()), parcel.readInt() != 0 ? Float.valueOf(parcel.readFloat()) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final AdsintExtraDataDto[] newArray(int i) {
            return new AdsintExtraDataDto[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AdsintExtraDataDto() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AdsintExtraDataDto)) {
            return false;
        }
        AdsintExtraDataDto adsintExtraDataDto = (AdsintExtraDataDto) obj;
        return epx.f(this.artistId, adsintExtraDataDto.artistId) && epx.f(this.duration, adsintExtraDataDto.duration);
    }

    public final int hashCode() {
        Float f = this.artistId;
        int hashCode = (f == null ? 0 : f.hashCode()) * 31;
        Float f2 = this.duration;
        return hashCode + (f2 != null ? f2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AdsintExtraDataDto(artistId=");
        sb.append(this.artistId);
        sb.append(", duration=");
        return so.b(sb, this.duration, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Float f = this.artistId;
        if (f == null) {
            parcel.writeInt(0);
        } else {
            b.d(parcel, 1, f);
        }
        Float f2 = this.duration;
        if (f2 == null) {
            parcel.writeInt(0);
        } else {
            b.d(parcel, 1, f2);
        }
    }

    public AdsintExtraDataDto(Float f, Float f2) {
        this.artistId = f;
        this.duration = f2;
    }

    public /* synthetic */ AdsintExtraDataDto(Float f, Float f2, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : f, (i & 2) != 0 ? null : f2);
    }
}
