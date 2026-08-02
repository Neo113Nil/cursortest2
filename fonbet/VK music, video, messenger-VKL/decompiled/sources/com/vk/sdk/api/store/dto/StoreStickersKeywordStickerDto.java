package com.vk.sdk.api.store.dto;

import xsna.pmi0;
import xsna.sl9;

/* compiled from: StoreStickersKeywordStickerDto.kt */
/* loaded from: classes5.dex */
public final class StoreStickersKeywordStickerDto {

    @pmi0("pack_id")
    private final int packId;

    @pmi0("sticker_id")
    private final int stickerId;

    public StoreStickersKeywordStickerDto(int i, int i2) {
        this.packId = i;
        this.stickerId = i2;
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
        return sl9.c(this.packId, this.stickerId, "StoreStickersKeywordStickerDto(packId=", ", stickerId=", ")");
    }
}
