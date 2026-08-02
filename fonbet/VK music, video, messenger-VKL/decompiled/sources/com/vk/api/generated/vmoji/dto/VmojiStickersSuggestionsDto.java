package com.vk.api.generated.vmoji.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;

/* compiled from: VmojiStickersSuggestionsDto.kt */
/* loaded from: classes15.dex */
public final class VmojiStickersSuggestionsDto implements Parcelable {
    public static final Parcelable.Creator<VmojiStickersSuggestionsDto> CREATOR = new a();

    @pmi0("character_id")
    private final String characterId;

    @pmi0("hash")
    private final String hash;

    /* compiled from: VmojiStickersSuggestionsDto.kt */
    public static final class a implements Parcelable.Creator<VmojiStickersSuggestionsDto> {
        @Override // android.os.Parcelable.Creator
        public final VmojiStickersSuggestionsDto createFromParcel(Parcel parcel) {
            return new VmojiStickersSuggestionsDto(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final VmojiStickersSuggestionsDto[] newArray(int i) {
            return new VmojiStickersSuggestionsDto[i];
        }
    }

    public VmojiStickersSuggestionsDto(String str, String str2) {
        this.characterId = str;
        this.hash = str2;
    }

    public final String d() {
        return this.characterId;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String e() {
        return this.hash;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VmojiStickersSuggestionsDto)) {
            return false;
        }
        VmojiStickersSuggestionsDto vmojiStickersSuggestionsDto = (VmojiStickersSuggestionsDto) obj;
        return epx.f(this.characterId, vmojiStickersSuggestionsDto.characterId) && epx.f(this.hash, vmojiStickersSuggestionsDto.hash);
    }

    public final int hashCode() {
        return this.hash.hashCode() + (this.characterId.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VmojiStickersSuggestionsDto(characterId=");
        sb.append(this.characterId);
        sb.append(", hash=");
        return ho8.a(sb, this.hash, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.characterId);
        parcel.writeString(this.hash);
    }
}
