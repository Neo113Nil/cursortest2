package com.vk.api.generated.catalog.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.pmi0;
import xsna.xq;

/* compiled from: CatalogBackgroundColorDto.kt */
/* loaded from: classes14.dex */
public final class CatalogBackgroundColorDto implements Parcelable {
    public static final Parcelable.Creator<CatalogBackgroundColorDto> CREATOR = new a();

    @pmi0("alpha")
    private final float alpha;

    @pmi0("hex")
    private final String hex;

    /* compiled from: CatalogBackgroundColorDto.kt */
    public static final class a implements Parcelable.Creator<CatalogBackgroundColorDto> {
        @Override // android.os.Parcelable.Creator
        public final CatalogBackgroundColorDto createFromParcel(Parcel parcel) {
            return new CatalogBackgroundColorDto(parcel.readString(), parcel.readFloat());
        }

        @Override // android.os.Parcelable.Creator
        public final CatalogBackgroundColorDto[] newArray(int i) {
            return new CatalogBackgroundColorDto[i];
        }
    }

    public CatalogBackgroundColorDto(String str, float f) {
        this.hex = str;
        this.alpha = f;
    }

    public final float d() {
        return this.alpha;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String e() {
        return this.hex;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CatalogBackgroundColorDto)) {
            return false;
        }
        CatalogBackgroundColorDto catalogBackgroundColorDto = (CatalogBackgroundColorDto) obj;
        return epx.f(this.hex, catalogBackgroundColorDto.hex) && Float.compare(this.alpha, catalogBackgroundColorDto.alpha) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.alpha) + (this.hex.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CatalogBackgroundColorDto(hex=");
        sb.append(this.hex);
        sb.append(", alpha=");
        return xq.c(')', this.alpha, sb);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.hex);
        parcel.writeFloat(this.alpha);
    }
}
