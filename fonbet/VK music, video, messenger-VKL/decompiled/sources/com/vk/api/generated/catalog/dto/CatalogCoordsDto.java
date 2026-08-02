package com.vk.api.generated.catalog.dto;

import android.os.Parcel;
import android.os.Parcelable;
import io.reactivex.rxjava3.subjects.b;
import xsna.epx;
import xsna.pmi0;
import xsna.so;
import xsna.zcl;

/* compiled from: CatalogCoordsDto.kt */
/* loaded from: classes14.dex */
public final class CatalogCoordsDto implements Parcelable {
    public static final Parcelable.Creator<CatalogCoordsDto> CREATOR = new a();

    @pmi0("latitude")
    private final Float latitude;

    @pmi0("longitude")
    private final Float longitude;

    /* compiled from: CatalogCoordsDto.kt */
    public static final class a implements Parcelable.Creator<CatalogCoordsDto> {
        @Override // android.os.Parcelable.Creator
        public final CatalogCoordsDto createFromParcel(Parcel parcel) {
            return new CatalogCoordsDto(parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat()), parcel.readInt() != 0 ? Float.valueOf(parcel.readFloat()) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final CatalogCoordsDto[] newArray(int i) {
            return new CatalogCoordsDto[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public CatalogCoordsDto() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public final Float d() {
        return this.latitude;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final Float e() {
        return this.longitude;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CatalogCoordsDto)) {
            return false;
        }
        CatalogCoordsDto catalogCoordsDto = (CatalogCoordsDto) obj;
        return epx.f(this.latitude, catalogCoordsDto.latitude) && epx.f(this.longitude, catalogCoordsDto.longitude);
    }

    public final int hashCode() {
        Float f = this.latitude;
        int hashCode = (f == null ? 0 : f.hashCode()) * 31;
        Float f2 = this.longitude;
        return hashCode + (f2 != null ? f2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CatalogCoordsDto(latitude=");
        sb.append(this.latitude);
        sb.append(", longitude=");
        return so.b(sb, this.longitude, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Float f = this.latitude;
        if (f == null) {
            parcel.writeInt(0);
        } else {
            b.d(parcel, 1, f);
        }
        Float f2 = this.longitude;
        if (f2 == null) {
            parcel.writeInt(0);
        } else {
            b.d(parcel, 1, f2);
        }
    }

    public CatalogCoordsDto(Float f, Float f2) {
        this.latitude = f;
        this.longitude = f2;
    }

    public /* synthetic */ CatalogCoordsDto(Float f, Float f2, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : f, (i & 2) != 0 ? null : f2);
    }
}
