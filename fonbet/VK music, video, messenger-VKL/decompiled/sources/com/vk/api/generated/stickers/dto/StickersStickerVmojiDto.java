package com.vk.api.generated.stickers.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;

/* compiled from: StickersStickerVmojiDto.kt */
/* loaded from: classes15.dex */
public final class StickersStickerVmojiDto implements Parcelable {
    public static final Parcelable.Creator<StickersStickerVmojiDto> CREATOR = new a();

    @pmi0("character_id")
    private final String characterId;

    /* compiled from: StickersStickerVmojiDto.kt */
    public static final class a implements Parcelable.Creator<StickersStickerVmojiDto> {
        @Override // android.os.Parcelable.Creator
        public final StickersStickerVmojiDto createFromParcel(Parcel parcel) {
            return new StickersStickerVmojiDto(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final StickersStickerVmojiDto[] newArray(int i) {
            return new StickersStickerVmojiDto[i];
        }
    }

    public StickersStickerVmojiDto(String str) {
        this.characterId = str;
    }

    public final String d() {
        return this.characterId;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof StickersStickerVmojiDto) && epx.f(this.characterId, ((StickersStickerVmojiDto) obj).characterId);
    }

    public final int hashCode() {
        return this.characterId.hashCode();
    }

    public final String toString() {
        return ho8.a(new StringBuilder("StickersStickerVmojiDto(characterId="), this.characterId, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.characterId);
    }
}
