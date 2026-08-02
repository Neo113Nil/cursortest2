package com.vk.api.generated.stickers.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.pmi0;
import xsna.vu5;

/* compiled from: StickersStickersRecommendationBlockStickerDto.kt */
/* loaded from: classes15.dex */
public final class StickersStickersRecommendationBlockStickerDto implements Parcelable {
    public static final Parcelable.Creator<StickersStickersRecommendationBlockStickerDto> CREATOR = new a();

    @pmi0("id")
    private final int id;

    @pmi0("pack_id")
    private final int packId;

    /* compiled from: StickersStickersRecommendationBlockStickerDto.kt */
    public static final class a implements Parcelable.Creator<StickersStickersRecommendationBlockStickerDto> {
        @Override // android.os.Parcelable.Creator
        public final StickersStickersRecommendationBlockStickerDto createFromParcel(Parcel parcel) {
            return new StickersStickersRecommendationBlockStickerDto(parcel.readInt(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final StickersStickersRecommendationBlockStickerDto[] newArray(int i) {
            return new StickersStickersRecommendationBlockStickerDto[i];
        }
    }

    public StickersStickersRecommendationBlockStickerDto(int i, int i2) {
        this.id = i;
        this.packId = i2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StickersStickersRecommendationBlockStickerDto)) {
            return false;
        }
        StickersStickersRecommendationBlockStickerDto stickersStickersRecommendationBlockStickerDto = (StickersStickersRecommendationBlockStickerDto) obj;
        return this.id == stickersStickersRecommendationBlockStickerDto.id && this.packId == stickersStickersRecommendationBlockStickerDto.packId;
    }

    public final int hashCode() {
        return Integer.hashCode(this.packId) + (Integer.hashCode(this.id) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StickersStickersRecommendationBlockStickerDto(id=");
        sb.append(this.id);
        sb.append(", packId=");
        return vu5.b(sb, this.packId, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.id);
        parcel.writeInt(this.packId);
    }
}
