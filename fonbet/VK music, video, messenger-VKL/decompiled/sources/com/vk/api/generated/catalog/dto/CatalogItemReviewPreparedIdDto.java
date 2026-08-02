package com.vk.api.generated.catalog.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.dto.common.id.UserId;
import xsna.epx;
import xsna.gp;
import xsna.pmi0;

/* compiled from: CatalogItemReviewPreparedIdDto.kt */
/* loaded from: classes14.dex */
public final class CatalogItemReviewPreparedIdDto implements Parcelable {
    public static final Parcelable.Creator<CatalogItemReviewPreparedIdDto> CREATOR = new a();

    @pmi0("item_id")
    private final UserId itemId;

    @pmi0("owner_id")
    private final UserId ownerId;

    /* compiled from: CatalogItemReviewPreparedIdDto.kt */
    public static final class a implements Parcelable.Creator<CatalogItemReviewPreparedIdDto> {
        @Override // android.os.Parcelable.Creator
        public final CatalogItemReviewPreparedIdDto createFromParcel(Parcel parcel) {
            return new CatalogItemReviewPreparedIdDto((UserId) parcel.readParcelable(CatalogItemReviewPreparedIdDto.class.getClassLoader()), (UserId) parcel.readParcelable(CatalogItemReviewPreparedIdDto.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final CatalogItemReviewPreparedIdDto[] newArray(int i) {
            return new CatalogItemReviewPreparedIdDto[i];
        }
    }

    public CatalogItemReviewPreparedIdDto(UserId userId, UserId userId2) {
        this.itemId = userId;
        this.ownerId = userId2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CatalogItemReviewPreparedIdDto)) {
            return false;
        }
        CatalogItemReviewPreparedIdDto catalogItemReviewPreparedIdDto = (CatalogItemReviewPreparedIdDto) obj;
        return epx.f(this.itemId, catalogItemReviewPreparedIdDto.itemId) && epx.f(this.ownerId, catalogItemReviewPreparedIdDto.ownerId);
    }

    public final int hashCode() {
        return Long.hashCode(this.ownerId.b) + (Long.hashCode(this.itemId.b) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CatalogItemReviewPreparedIdDto(itemId=");
        sb.append(this.itemId);
        sb.append(", ownerId=");
        return gp.b(sb, this.ownerId, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.itemId, i);
        parcel.writeParcelable(this.ownerId, i);
    }
}
