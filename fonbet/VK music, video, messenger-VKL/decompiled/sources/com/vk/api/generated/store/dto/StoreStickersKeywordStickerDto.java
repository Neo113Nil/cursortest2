package com.vk.api.generated.store.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.pmi0;
import xsna.vu5;

/* compiled from: StoreStickersKeywordStickerDto.kt */
/* loaded from: classes15.dex */
public final class StoreStickersKeywordStickerDto implements Parcelable {
    public static final Parcelable.Creator<StoreStickersKeywordStickerDto> CREATOR = new a();

    @pmi0("pack_id")
    private final int packId;

    @pmi0("sticker_id")
    private final int stickerId;

    /* compiled from: StoreStickersKeywordStickerDto.kt */
    public static final class a implements Parcelable.Creator<StoreStickersKeywordStickerDto> {
        @Override // android.os.Parcelable.Creator
        public final StoreStickersKeywordStickerDto createFromParcel(Parcel parcel) {
            return new StoreStickersKeywordStickerDto(parcel.readInt(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final StoreStickersKeywordStickerDto[] newArray(int i) {
            return new StoreStickersKeywordStickerDto[i];
        }
    }

    public StoreStickersKeywordStickerDto(int i, int i2) {
        this.packId = i;
        this.stickerId = i2;
    }

    public final int d() {
        return this.packId;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final int e() {
        return this.stickerId;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StoreStickersKeywordStickerDto)) {
            return false;
        }
        StoreStickersKeywordStickerDto storeStickersKeywordStickerDto = (StoreStickersKeywordStickerDto) obj;
        return this.packId == storeStickersKeywordStickerDto.packId && this.stickerId == storeStickersKeywordStickerDto.stickerId;
    }

    public final int hashCode() {
        return Integer.hashCode(this.stickerId) + (Integer.hashCode(this.packId) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StoreStickersKeywordStickerDto(packId=");
        sb.append(this.packId);
        sb.append(", stickerId=");
        return vu5.b(sb, this.stickerId, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.packId);
        parcel.writeInt(this.stickerId);
    }
}
