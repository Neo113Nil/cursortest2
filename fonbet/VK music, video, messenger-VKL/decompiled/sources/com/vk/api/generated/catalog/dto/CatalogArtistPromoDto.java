package com.vk.api.generated.catalog.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.pmi0;
import xsna.sn;
import xsna.tn;
import xsna.zcl;

/* compiled from: CatalogArtistPromoDto.kt */
/* loaded from: classes14.dex */
public final class CatalogArtistPromoDto implements Parcelable {
    public static final Parcelable.Creator<CatalogArtistPromoDto> CREATOR = new a();

    @pmi0("is_artist_promo_allowed")
    private final Boolean isArtistPromoAllowed;

    /* compiled from: CatalogArtistPromoDto.kt */
    public static final class a implements Parcelable.Creator<CatalogArtistPromoDto> {
        @Override // android.os.Parcelable.Creator
        public final CatalogArtistPromoDto createFromParcel(Parcel parcel) {
            Boolean valueOf;
            if (parcel.readInt() == 0) {
                valueOf = null;
            } else {
                valueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new CatalogArtistPromoDto(valueOf);
        }

        @Override // android.os.Parcelable.Creator
        public final CatalogArtistPromoDto[] newArray(int i) {
            return new CatalogArtistPromoDto[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public CatalogArtistPromoDto() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof CatalogArtistPromoDto) && epx.f(this.isArtistPromoAllowed, ((CatalogArtistPromoDto) obj).isArtistPromoAllowed);
    }

    public final int hashCode() {
        Boolean bool = this.isArtistPromoAllowed;
        if (bool == null) {
            return 0;
        }
        return bool.hashCode();
    }

    public final String toString() {
        return tn.a(new StringBuilder("CatalogArtistPromoDto(isArtistPromoAllowed="), this.isArtistPromoAllowed, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Boolean bool = this.isArtistPromoAllowed;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool);
        }
    }

    public CatalogArtistPromoDto(Boolean bool) {
        this.isArtistPromoAllowed = bool;
    }

    public /* synthetic */ CatalogArtistPromoDto(Boolean bool, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : bool);
    }
}
