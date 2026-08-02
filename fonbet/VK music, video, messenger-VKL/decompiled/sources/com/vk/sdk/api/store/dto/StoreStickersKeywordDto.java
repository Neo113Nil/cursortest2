package com.vk.sdk.api.store.dto;

import com.vk.movika.sdk.base.model.n;
import java.util.List;
import xsna.epx;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: StoreStickersKeywordDto.kt */
/* loaded from: classes5.dex */
public final class StoreStickersKeywordDto {

    @pmi0("promoted_stickers")
    private final List<Object> promotedStickers;

    @pmi0("stickers")
    private final List<StoreStickersKeywordStickerDto> stickers;

    @pmi0("user_stickers")
    private final List<Object> userStickers;

    @pmi0("words")
    private final List<String> words;

    public StoreStickersKeywordDto(List<String> list, List<? extends Object> list2, List<? extends Object> list3, List<StoreStickersKeywordStickerDto> list4) {
        this.words = list;
        this.userStickers = list2;
        this.promotedStickers = list3;
        this.stickers = list4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StoreStickersKeywordDto)) {
            return false;
        }
        StoreStickersKeywordDto storeStickersKeywordDto = (StoreStickersKeywordDto) obj;
        return epx.f(this.words, storeStickersKeywordDto.words) && epx.f(this.userStickers, storeStickersKeywordDto.userStickers) && epx.f(this.promotedStickers, storeStickersKeywordDto.promotedStickers) && epx.f(this.stickers, storeStickersKeywordDto.stickers);
    }

    public final int hashCode() {
        int hashCode = this.words.hashCode() * 31;
        List<Object> list = this.userStickers;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        List<Object> list2 = this.promotedStickers;
        int hashCode3 = (hashCode2 + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<StoreStickersKeywordStickerDto> list3 = this.stickers;
        return hashCode3 + (list3 != null ? list3.hashCode() : 0);
    }

    public final String toString() {
        List<String> list = this.words;
        List<Object> list2 = this.userStickers;
        List<Object> list3 = this.promotedStickers;
        List<StoreStickersKeywordStickerDto> list4 = this.stickers;
        StringBuilder sb = new StringBuilder("StoreStickersKeywordDto(words=");
        sb.append(list);
        sb.append(", userStickers=");
        sb.append(list2);
        sb.append(", promotedStickers=");
        return n.b(sb, list3, ", stickers=", list4, ")");
    }

    public /* synthetic */ StoreStickersKeywordDto(List list, List list2, List list3, List list4, int i, zcl zclVar) {
        this(list, (i & 2) != 0 ? null : list2, (i & 4) != 0 ? null : list3, (i & 8) != 0 ? null : list4);
    }
}
