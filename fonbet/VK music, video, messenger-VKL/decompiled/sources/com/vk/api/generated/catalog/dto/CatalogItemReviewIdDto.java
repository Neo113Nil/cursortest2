package com.vk.api.generated.catalog.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.dto.common.id.UserId;
import xsna.bh10;
import xsna.epx;
import xsna.gp;
import xsna.pmi0;

/* compiled from: CatalogItemReviewIdDto.kt */
/* loaded from: classes14.dex */
public final class CatalogItemReviewIdDto implements Parcelable {
    public static final Parcelable.Creator<CatalogItemReviewIdDto> CREATOR = new a();

    @pmi0("item_id")
    private final long itemId;

    @pmi0("item_review_id")
    private final long itemReviewId;

    @pmi0("owner_id")
    private final UserId ownerId;

    /* compiled from: CatalogItemReviewIdDto.kt */
    public static final class a implements Parcelable.Creator<CatalogItemReviewIdDto> {
        @Override // android.os.Parcelable.Creator
        public final CatalogItemReviewIdDto createFromParcel(Parcel parcel) {
            return new CatalogItemReviewIdDto(parcel.readLong(), parcel.readLong(), (UserId) parcel.readParcelable(CatalogItemReviewIdDto.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final CatalogItemReviewIdDto[] newArray(int i) {
            return new CatalogItemReviewIdDto[i];
        }
    }

    public CatalogItemReviewIdDto(long j, long j2, UserId userId) {
        this.itemReviewId = j;
        this.itemId = j2;
        this.ownerId = userId;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CatalogItemReviewIdDto)) {
            return false;
        }
        CatalogItemReviewIdDto catalogItemReviewIdDto = (CatalogItemReviewIdDto) obj;
        return this.itemReviewId == catalogItemReviewIdDto.itemReviewId && this.itemId == catalogItemReviewIdDto.itemId && epx.f(this.ownerId, catalogItemReviewIdDto.ownerId);
    }

    public final int hashCode() {
        return Long.hashCode(this.ownerId.b) + bh10.a(Long.hashCode(this.itemReviewId) * 31, 31, this.itemId);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CatalogItemReviewIdDto(itemReviewId=");
        sb.append(this.itemReviewId);
        sb.append(", itemId=");
        sb.append(this.itemId);
        sb.append(", ownerId=");
        return gp.b(sb, this.ownerId, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.itemReviewId);
        parcel.writeLong(this.itemId);
        parcel.writeParcelable(this.ownerId, i);
    }
}
