package com.vk.api.generated.stickers.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.pmi0;
import xsna.sn;
import xsna.tn;
import xsna.zcl;

/* compiled from: StickersStickerSuggestionDto.kt */
/* loaded from: classes15.dex */
public final class StickersStickerSuggestionDto implements Parcelable {
    public static final Parcelable.Creator<StickersStickerSuggestionDto> CREATOR = new a();

    @pmi0("is_primary")
    private final Boolean isPrimary;

    @pmi0("is_user")
    private final Boolean isUser;

    @pmi0("word")
    private final String word;

    /* compiled from: StickersStickerSuggestionDto.kt */
    public static final class a implements Parcelable.Creator<StickersStickerSuggestionDto> {
        @Override // android.os.Parcelable.Creator
        public final StickersStickerSuggestionDto createFromParcel(Parcel parcel) {
            Boolean valueOf;
            String readString = parcel.readString();
            Boolean bool = null;
            if (parcel.readInt() == 0) {
                valueOf = null;
            } else {
                valueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() != 0) {
                bool = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new StickersStickerSuggestionDto(readString, valueOf, bool);
        }

        @Override // android.os.Parcelable.Creator
        public final StickersStickerSuggestionDto[] newArray(int i) {
            return new StickersStickerSuggestionDto[i];
        }
    }

    public StickersStickerSuggestionDto(String str, Boolean bool, Boolean bool2) {
        this.word = str;
        this.isPrimary = bool;
        this.isUser = bool2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StickersStickerSuggestionDto)) {
            return false;
        }
        StickersStickerSuggestionDto stickersStickerSuggestionDto = (StickersStickerSuggestionDto) obj;
        return epx.f(this.word, stickersStickerSuggestionDto.word) && epx.f(this.isPrimary, stickersStickerSuggestionDto.isPrimary) && epx.f(this.isUser, stickersStickerSuggestionDto.isUser);
    }

    public final int hashCode() {
        int hashCode = this.word.hashCode() * 31;
        Boolean bool = this.isPrimary;
        int hashCode2 = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.isUser;
        return hashCode2 + (bool2 != null ? bool2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StickersStickerSuggestionDto(word=");
        sb.append(this.word);
        sb.append(", isPrimary=");
        sb.append(this.isPrimary);
        sb.append(", isUser=");
        return tn.a(sb, this.isUser, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.word);
        Boolean bool = this.isPrimary;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool);
        }
        Boolean bool2 = this.isUser;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool2);
        }
    }

    public /* synthetic */ StickersStickerSuggestionDto(String str, Boolean bool, Boolean bool2, int i, zcl zclVar) {
        this(str, (i & 2) != 0 ? null : bool, (i & 4) != 0 ? null : bool2);
    }
}
