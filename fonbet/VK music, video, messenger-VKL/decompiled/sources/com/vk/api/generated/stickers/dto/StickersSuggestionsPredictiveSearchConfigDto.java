package com.vk.api.generated.stickers.dto;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.ao;
import xsna.en;
import xsna.epx;
import xsna.ms9;
import xsna.pmi0;
import xsna.shy;

/* compiled from: StickersSuggestionsPredictiveSearchConfigDto.kt */
/* loaded from: classes15.dex */
public final class StickersSuggestionsPredictiveSearchConfigDto implements Parcelable {
    public static final Parcelable.Creator<StickersSuggestionsPredictiveSearchConfigDto> CREATOR = new a();

    @pmi0("delays")
    private final List<StickersSuggestionsPredictiveSearchDelayDto> delays;

    @pmi0("fuzzy_search_max_length")
    private final int fuzzySearchMaxLength;

    @pmi0("fuzzy_search_min_length")
    private final int fuzzySearchMinLength;

    @pmi0("search_max_length")
    private final int searchMaxLength;

    @pmi0("search_min_length")
    private final int searchMinLength;

    @pmi0("word_hashes")
    private final List<String> wordHashes;

    /* compiled from: StickersSuggestionsPredictiveSearchConfigDto.kt */
    public static final class a implements Parcelable.Creator<StickersSuggestionsPredictiveSearchConfigDto> {
        @Override // android.os.Parcelable.Creator
        public final StickersSuggestionsPredictiveSearchConfigDto createFromParcel(Parcel parcel) {
            ArrayList<String> createStringArrayList = parcel.createStringArrayList();
            int readInt = parcel.readInt();
            int readInt2 = parcel.readInt();
            int readInt3 = parcel.readInt();
            int readInt4 = parcel.readInt();
            int readInt5 = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt5);
            int i = 0;
            while (i != readInt5) {
                i = en.a(StickersSuggestionsPredictiveSearchDelayDto.CREATOR, parcel, arrayList, i, 1);
            }
            return new StickersSuggestionsPredictiveSearchConfigDto(createStringArrayList, readInt, readInt2, readInt3, readInt4, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final StickersSuggestionsPredictiveSearchConfigDto[] newArray(int i) {
            return new StickersSuggestionsPredictiveSearchConfigDto[i];
        }
    }

    public StickersSuggestionsPredictiveSearchConfigDto(List<String> list, int i, int i2, int i3, int i4, List<StickersSuggestionsPredictiveSearchDelayDto> list2) {
        this.wordHashes = list;
        this.searchMinLength = i;
        this.searchMaxLength = i2;
        this.fuzzySearchMinLength = i3;
        this.fuzzySearchMaxLength = i4;
        this.delays = list2;
    }

    public final int d() {
        return this.fuzzySearchMaxLength;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final int e() {
        return this.fuzzySearchMinLength;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StickersSuggestionsPredictiveSearchConfigDto)) {
            return false;
        }
        StickersSuggestionsPredictiveSearchConfigDto stickersSuggestionsPredictiveSearchConfigDto = (StickersSuggestionsPredictiveSearchConfigDto) obj;
        return epx.f(this.wordHashes, stickersSuggestionsPredictiveSearchConfigDto.wordHashes) && this.searchMinLength == stickersSuggestionsPredictiveSearchConfigDto.searchMinLength && this.searchMaxLength == stickersSuggestionsPredictiveSearchConfigDto.searchMaxLength && this.fuzzySearchMinLength == stickersSuggestionsPredictiveSearchConfigDto.fuzzySearchMinLength && this.fuzzySearchMaxLength == stickersSuggestionsPredictiveSearchConfigDto.fuzzySearchMaxLength && epx.f(this.delays, stickersSuggestionsPredictiveSearchConfigDto.delays);
    }

    public final int f() {
        return this.searchMaxLength;
    }

    public final int g() {
        return this.searchMinLength;
    }

    public final int hashCode() {
        return this.delays.hashCode() + shy.a(this.fuzzySearchMaxLength, shy.a(this.fuzzySearchMinLength, shy.a(this.searchMaxLength, shy.a(this.searchMinLength, this.wordHashes.hashCode() * 31, 31), 31), 31), 31);
    }

    public final List<String> i() {
        return this.wordHashes;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StickersSuggestionsPredictiveSearchConfigDto(wordHashes=");
        sb.append(this.wordHashes);
        sb.append(", searchMinLength=");
        sb.append(this.searchMinLength);
        sb.append(", searchMaxLength=");
        sb.append(this.searchMaxLength);
        sb.append(", fuzzySearchMinLength=");
        sb.append(this.fuzzySearchMinLength);
        sb.append(", fuzzySearchMaxLength=");
        sb.append(this.fuzzySearchMaxLength);
        sb.append(", delays=");
        return ms9.a(')', sb, this.delays);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeStringList(this.wordHashes);
        parcel.writeInt(this.searchMinLength);
        parcel.writeInt(this.searchMaxLength);
        parcel.writeInt(this.fuzzySearchMinLength);
        parcel.writeInt(this.fuzzySearchMaxLength);
        Iterator a2 = ao.a(parcel, this.delays);
        while (a2.hasNext()) {
            ((StickersSuggestionsPredictiveSearchDelayDto) a2.next()).writeToParcel(parcel, i);
        }
    }
}
