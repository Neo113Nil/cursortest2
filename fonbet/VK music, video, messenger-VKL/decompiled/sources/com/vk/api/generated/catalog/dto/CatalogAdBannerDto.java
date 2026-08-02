package com.vk.api.generated.catalog.dto;

import android.os.Parcel;
import android.os.Parcelable;
import io.reactivex.rxjava3.subjects.b;
import xsna.epx;
import xsna.iq;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: CatalogAdBannerDto.kt */
/* loaded from: classes14.dex */
public final class CatalogAdBannerDto implements Parcelable {
    public static final Parcelable.Creator<CatalogAdBannerDto> CREATOR = new a();

    @pmi0("slot_id")
    private final Long slotId;

    /* compiled from: CatalogAdBannerDto.kt */
    public static final class a implements Parcelable.Creator<CatalogAdBannerDto> {
        @Override // android.os.Parcelable.Creator
        public final CatalogAdBannerDto createFromParcel(Parcel parcel) {
            return new CatalogAdBannerDto(parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()));
        }

        @Override // android.os.Parcelable.Creator
        public final CatalogAdBannerDto[] newArray(int i) {
            return new CatalogAdBannerDto[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public CatalogAdBannerDto() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public final Long d() {
        return this.slotId;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof CatalogAdBannerDto) && epx.f(this.slotId, ((CatalogAdBannerDto) obj).slotId);
    }

    public final int hashCode() {
        Long l = this.slotId;
        if (l == null) {
            return 0;
        }
        return l.hashCode();
    }

    public final String toString() {
        return iq.b(new StringBuilder("CatalogAdBannerDto(slotId="), this.slotId, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Long l = this.slotId;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            b.f(parcel, 1, l);
        }
    }

    public CatalogAdBannerDto(Long l) {
        this.slotId = l;
    }

    public /* synthetic */ CatalogAdBannerDto(Long l, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : l);
    }
}
