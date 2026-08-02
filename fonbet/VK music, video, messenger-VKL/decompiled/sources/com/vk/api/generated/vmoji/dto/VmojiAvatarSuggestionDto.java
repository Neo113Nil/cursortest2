package com.vk.api.generated.vmoji.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;

/* compiled from: VmojiAvatarSuggestionDto.kt */
/* loaded from: classes15.dex */
public final class VmojiAvatarSuggestionDto implements Parcelable {
    public static final Parcelable.Creator<VmojiAvatarSuggestionDto> CREATOR = new a();

    @pmi0("character_id")
    private final String characterId;

    /* compiled from: VmojiAvatarSuggestionDto.kt */
    public static final class a implements Parcelable.Creator<VmojiAvatarSuggestionDto> {
        @Override // android.os.Parcelable.Creator
        public final VmojiAvatarSuggestionDto createFromParcel(Parcel parcel) {
            return new VmojiAvatarSuggestionDto(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final VmojiAvatarSuggestionDto[] newArray(int i) {
            return new VmojiAvatarSuggestionDto[i];
        }
    }

    public VmojiAvatarSuggestionDto(String str) {
        this.characterId = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof VmojiAvatarSuggestionDto) && epx.f(this.characterId, ((VmojiAvatarSuggestionDto) obj).characterId);
    }

    public final int hashCode() {
        return this.characterId.hashCode();
    }

    public final String toString() {
        return ho8.a(new StringBuilder("VmojiAvatarSuggestionDto(characterId="), this.characterId, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.characterId);
    }
}
