package com.vk.sdk.api.store.dto;

import java.util.List;
import xsna.epx;
import xsna.fw3;
import xsna.pmi0;
import xsna.zcl;
import xsna.zn;

/* compiled from: StoreGetStickersKeywordsResponseDto.kt */
/* loaded from: classes5.dex */
public final class StoreGetStickersKeywordsResponseDto {

    @pmi0("chunks_count")
    private final Integer chunksCount;

    @pmi0("chunks_hash")
    private final String chunksHash;

    @pmi0("count")
    private final int count;

    @pmi0("dictionary")
    private final List<StoreStickersKeywordDto> dictionary;

    public StoreGetStickersKeywordsResponseDto(int i, List<StoreStickersKeywordDto> list, Integer num, String str) {
        this.count = i;
        this.dictionary = list;
        this.chunksCount = num;
        this.chunksHash = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StoreGetStickersKeywordsResponseDto)) {
            return false;
        }
        StoreGetStickersKeywordsResponseDto storeGetStickersKeywordsResponseDto = (StoreGetStickersKeywordsResponseDto) obj;
        return this.count == storeGetStickersKeywordsResponseDto.count && epx.f(this.dictionary, storeGetStickersKeywordsResponseDto.dictionary) && epx.f(this.chunksCount, storeGetStickersKeywordsResponseDto.chunksCount) && epx.f(this.chunksHash, storeGetStickersKeywordsResponseDto.chunksHash);
    }

    public final int hashCode() {
        int a = fw3.a(Integer.hashCode(this.count) * 31, 31, this.dictionary);
        Integer num = this.chunksCount;
        int hashCode = (a + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.chunksHash;
        return hashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        int i = this.count;
        List<StoreStickersKeywordDto> list = this.dictionary;
        Integer num = this.chunksCount;
        String str = this.chunksHash;
        StringBuilder c = zn.c(i, "StoreGetStickersKeywordsResponseDto(count=", ", dictionary=", ", chunksCount=", list);
        c.append(num);
        c.append(", chunksHash=");
        c.append(str);
        c.append(")");
        return c.toString();
    }

    public /* synthetic */ StoreGetStickersKeywordsResponseDto(int i, List list, Integer num, String str, int i2, zcl zclVar) {
        this(i, list, (i2 & 4) != 0 ? null : num, (i2 & 8) != 0 ? null : str);
    }
}
