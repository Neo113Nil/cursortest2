package com.vk.api.generated.stickers.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.pmi0;
import xsna.vu5;

/* compiled from: StickersSuggestionsPredictiveSearchDelayDto.kt */
/* loaded from: classes15.dex */
public final class StickersSuggestionsPredictiveSearchDelayDto implements Parcelable {
    public static final Parcelable.Creator<StickersSuggestionsPredictiveSearchDelayDto> CREATOR = new a();

    @pmi0("delay")
    private final int delay;

    @pmi0("length")
    private final int length;

    /* compiled from: StickersSuggestionsPredictiveSearchDelayDto.kt */
    public static final class a implements Parcelable.Creator<StickersSuggestionsPredictiveSearchDelayDto> {
        @Override // android.os.Parcelable.Creator
        public final StickersSuggestionsPredictiveSearchDelayDto createFromParcel(Parcel parcel) {
            return new StickersSuggestionsPredictiveSearchDelayDto(parcel.readInt(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final StickersSuggestionsPredictiveSearchDelayDto[] newArray(int i) {
            return new StickersSuggestionsPredictiveSearchDelayDto[i];
        }
    }

    public StickersSuggestionsPredictiveSearchDelayDto(int i, int i2) {
        this.length = i;
        this.delay = i2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StickersSuggestionsPredictiveSearchDelayDto)) {
            return false;
        }
        StickersSuggestionsPredictiveSearchDelayDto stickersSuggestionsPredictiveSearchDelayDto = (StickersSuggestionsPredictiveSearchDelayDto) obj;
        return this.length == stickersSuggestionsPredictiveSearchDelayDto.length && this.delay == stickersSuggestionsPredictiveSearchDelayDto.delay;
    }

    public final int hashCode() {
        return Integer.hashCode(this.delay) + (Integer.hashCode(this.length) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StickersSuggestionsPredictiveSearchDelayDto(length=");
        sb.append(this.length);
        sb.append(", delay=");
        return vu5.b(sb, this.delay, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.length);
        parcel.writeInt(this.delay);
    }
}
