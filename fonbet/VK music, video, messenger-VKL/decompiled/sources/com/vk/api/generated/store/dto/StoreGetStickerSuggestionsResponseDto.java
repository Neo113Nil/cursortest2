package com.vk.api.generated.store.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.api.generated.stickers.dto.StickersStickerSuggestionDto;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.ao;
import xsna.en;
import xsna.epx;
import xsna.ms9;
import xsna.pmi0;

/* compiled from: StoreGetStickerSuggestionsResponseDto.kt */
/* loaded from: classes15.dex */
public final class StoreGetStickerSuggestionsResponseDto implements Parcelable {
    public static final Parcelable.Creator<StoreGetStickerSuggestionsResponseDto> CREATOR = new a();

    @pmi0("sticker_id")
    private final int stickerId;

    @pmi0("suggestions")
    private final List<StickersStickerSuggestionDto> suggestions;

    /* compiled from: StoreGetStickerSuggestionsResponseDto.kt */
    public static final class a implements Parcelable.Creator<StoreGetStickerSuggestionsResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final StoreGetStickerSuggestionsResponseDto createFromParcel(Parcel parcel) {
            int readInt = parcel.readInt();
            int readInt2 = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt2);
            int i = 0;
            while (i != readInt2) {
                i = en.a(StickersStickerSuggestionDto.CREATOR, parcel, arrayList, i, 1);
            }
            return new StoreGetStickerSuggestionsResponseDto(readInt, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final StoreGetStickerSuggestionsResponseDto[] newArray(int i) {
            return new StoreGetStickerSuggestionsResponseDto[i];
        }
    }

    public StoreGetStickerSuggestionsResponseDto(int i, List<StickersStickerSuggestionDto> list) {
        this.stickerId = i;
        this.suggestions = list;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StoreGetStickerSuggestionsResponseDto)) {
            return false;
        }
        StoreGetStickerSuggestionsResponseDto storeGetStickerSuggestionsResponseDto = (StoreGetStickerSuggestionsResponseDto) obj;
        return this.stickerId == storeGetStickerSuggestionsResponseDto.stickerId && epx.f(this.suggestions, storeGetStickerSuggestionsResponseDto.suggestions);
    }

    public final int hashCode() {
        return this.suggestions.hashCode() + (Integer.hashCode(this.stickerId) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StoreGetStickerSuggestionsResponseDto(stickerId=");
        sb.append(this.stickerId);
        sb.append(", suggestions=");
        return ms9.a(')', sb, this.suggestions);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.stickerId);
        Iterator a2 = ao.a(parcel, this.suggestions);
        while (a2.hasNext()) {
            ((StickersStickerSuggestionDto) a2.next()).writeToParcel(parcel, i);
        }
    }
}
