package com.vk.api.generated.catalog.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;

/* compiled from: CatalogCacheGroupDto.kt */
/* loaded from: classes14.dex */
public final class CatalogCacheGroupDto implements Parcelable {
    public static final Parcelable.Creator<CatalogCacheGroupDto> CREATOR = new a();

    @pmi0("id")
    private final String id;

    /* compiled from: CatalogCacheGroupDto.kt */
    public static final class a implements Parcelable.Creator<CatalogCacheGroupDto> {
        @Override // android.os.Parcelable.Creator
        public final CatalogCacheGroupDto createFromParcel(Parcel parcel) {
            return new CatalogCacheGroupDto(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final CatalogCacheGroupDto[] newArray(int i) {
            return new CatalogCacheGroupDto[i];
        }
    }

    public CatalogCacheGroupDto(String str) {
        this.id = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof CatalogCacheGroupDto) && epx.f(this.id, ((CatalogCacheGroupDto) obj).id);
    }

    public final int hashCode() {
        return this.id.hashCode();
    }

    public final String toString() {
        return ho8.a(new StringBuilder("CatalogCacheGroupDto(id="), this.id, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.id);
    }
}
