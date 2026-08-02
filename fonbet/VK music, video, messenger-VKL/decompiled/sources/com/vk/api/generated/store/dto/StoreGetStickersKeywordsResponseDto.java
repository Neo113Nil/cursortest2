package com.vk.api.generated.store.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.api.generated.stickers.dto.StickersSuggestionsPredictiveSearchConfigDto;
import com.vk.api.generated.stickers.dto.StickersSuggestionsSpecialItemsConfigDto;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.ao;
import xsna.en;
import xsna.epx;
import xsna.fw3;
import xsna.nr;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: StoreGetStickersKeywordsResponseDto.kt */
/* loaded from: classes15.dex */
public final class StoreGetStickersKeywordsResponseDto implements Parcelable {
    public static final Parcelable.Creator<StoreGetStickersKeywordsResponseDto> CREATOR = new a();

    @pmi0("chunks_count")
    private final Integer chunksCount;

    @pmi0("chunks_hash")
    private final String chunksHash;

    @pmi0("count")
    private final int count;

    @pmi0("dictionary")
    private final List<StoreStickersKeywordDto> dictionary;

    @pmi0("predictive_search_config")
    private final StickersSuggestionsPredictiveSearchConfigDto predictiveSearchConfig;

    @pmi0("special_items_config")
    private final StickersSuggestionsSpecialItemsConfigDto specialItemsConfig;

    /* compiled from: StoreGetStickersKeywordsResponseDto.kt */
    public static final class a implements Parcelable.Creator<StoreGetStickersKeywordsResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final StoreGetStickersKeywordsResponseDto createFromParcel(Parcel parcel) {
            int readInt = parcel.readInt();
            int readInt2 = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt2);
            int i = 0;
            while (i != readInt2) {
                i = en.a(StoreStickersKeywordDto.CREATOR, parcel, arrayList, i, 1);
            }
            return new StoreGetStickersKeywordsResponseDto(readInt, arrayList, parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString(), parcel.readInt() == 0 ? null : StickersSuggestionsPredictiveSearchConfigDto.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? StickersSuggestionsSpecialItemsConfigDto.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final StoreGetStickersKeywordsResponseDto[] newArray(int i) {
            return new StoreGetStickersKeywordsResponseDto[i];
        }
    }

    public StoreGetStickersKeywordsResponseDto(int i, List<StoreStickersKeywordDto> list, Integer num, String str, StickersSuggestionsPredictiveSearchConfigDto stickersSuggestionsPredictiveSearchConfigDto, StickersSuggestionsSpecialItemsConfigDto stickersSuggestionsSpecialItemsConfigDto) {
        this.count = i;
        this.dictionary = list;
        this.chunksCount = num;
        this.chunksHash = str;
        this.predictiveSearchConfig = stickersSuggestionsPredictiveSearchConfigDto;
        this.specialItemsConfig = stickersSuggestionsSpecialItemsConfigDto;
    }

    public final Integer d() {
        return this.chunksCount;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String e() {
        return this.chunksHash;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StoreGetStickersKeywordsResponseDto)) {
            return false;
        }
        StoreGetStickersKeywordsResponseDto storeGetStickersKeywordsResponseDto = (StoreGetStickersKeywordsResponseDto) obj;
        return this.count == storeGetStickersKeywordsResponseDto.count && epx.f(this.dictionary, storeGetStickersKeywordsResponseDto.dictionary) && epx.f(this.chunksCount, storeGetStickersKeywordsResponseDto.chunksCount) && epx.f(this.chunksHash, storeGetStickersKeywordsResponseDto.chunksHash) && epx.f(this.predictiveSearchConfig, storeGetStickersKeywordsResponseDto.predictiveSearchConfig) && epx.f(this.specialItemsConfig, storeGetStickersKeywordsResponseDto.specialItemsConfig);
    }

    public final List<StoreStickersKeywordDto> f() {
        return this.dictionary;
    }

    public final StickersSuggestionsPredictiveSearchConfigDto g() {
        return this.predictiveSearchConfig;
    }

    public final int hashCode() {
        int a2 = fw3.a(Integer.hashCode(this.count) * 31, 31, this.dictionary);
        Integer num = this.chunksCount;
        int hashCode = (a2 + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.chunksHash;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        StickersSuggestionsPredictiveSearchConfigDto stickersSuggestionsPredictiveSearchConfigDto = this.predictiveSearchConfig;
        int hashCode3 = (hashCode2 + (stickersSuggestionsPredictiveSearchConfigDto == null ? 0 : stickersSuggestionsPredictiveSearchConfigDto.hashCode())) * 31;
        StickersSuggestionsSpecialItemsConfigDto stickersSuggestionsSpecialItemsConfigDto = this.specialItemsConfig;
        return hashCode3 + (stickersSuggestionsSpecialItemsConfigDto != null ? stickersSuggestionsSpecialItemsConfigDto.hashCode() : 0);
    }

    public final StickersSuggestionsSpecialItemsConfigDto i() {
        return this.specialItemsConfig;
    }

    public final String toString() {
        return "StoreGetStickersKeywordsResponseDto(count=" + this.count + ", dictionary=" + this.dictionary + ", chunksCount=" + this.chunksCount + ", chunksHash=" + this.chunksHash + ", predictiveSearchConfig=" + this.predictiveSearchConfig + ", specialItemsConfig=" + this.specialItemsConfig + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.count);
        Iterator a2 = ao.a(parcel, this.dictionary);
        while (a2.hasNext()) {
            ((StoreStickersKeywordDto) a2.next()).writeToParcel(parcel, i);
        }
        Integer num = this.chunksCount;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
        parcel.writeString(this.chunksHash);
        StickersSuggestionsPredictiveSearchConfigDto stickersSuggestionsPredictiveSearchConfigDto = this.predictiveSearchConfig;
        if (stickersSuggestionsPredictiveSearchConfigDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            stickersSuggestionsPredictiveSearchConfigDto.writeToParcel(parcel, i);
        }
        StickersSuggestionsSpecialItemsConfigDto stickersSuggestionsSpecialItemsConfigDto = this.specialItemsConfig;
        if (stickersSuggestionsSpecialItemsConfigDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            stickersSuggestionsSpecialItemsConfigDto.writeToParcel(parcel, i);
        }
    }

    public /* synthetic */ StoreGetStickersKeywordsResponseDto(int i, List list, Integer num, String str, StickersSuggestionsPredictiveSearchConfigDto stickersSuggestionsPredictiveSearchConfigDto, StickersSuggestionsSpecialItemsConfigDto stickersSuggestionsSpecialItemsConfigDto, int i2, zcl zclVar) {
        this(i, list, (i2 & 4) != 0 ? null : num, (i2 & 8) != 0 ? null : str, (i2 & 16) != 0 ? null : stickersSuggestionsPredictiveSearchConfigDto, (i2 & 32) != 0 ? null : stickersSuggestionsSpecialItemsConfigDto);
    }
}
