package com.vk.api.generated.stickers.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: StickersBonusRewardTermsDto.kt */
/* loaded from: classes15.dex */
public final class StickersBonusRewardTermsDto implements Parcelable {
    public static final Parcelable.Creator<StickersBonusRewardTermsDto> CREATOR = new a();

    @pmi0("text")
    private final String text;

    @pmi0("title")
    private final String title;

    /* compiled from: StickersBonusRewardTermsDto.kt */
    public static final class a implements Parcelable.Creator<StickersBonusRewardTermsDto> {
        @Override // android.os.Parcelable.Creator
        public final StickersBonusRewardTermsDto createFromParcel(Parcel parcel) {
            return new StickersBonusRewardTermsDto(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final StickersBonusRewardTermsDto[] newArray(int i) {
            return new StickersBonusRewardTermsDto[i];
        }
    }

    public StickersBonusRewardTermsDto(String str, String str2) {
        this.text = str;
        this.title = str2;
    }

    public final String d() {
        return this.text;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StickersBonusRewardTermsDto)) {
            return false;
        }
        StickersBonusRewardTermsDto stickersBonusRewardTermsDto = (StickersBonusRewardTermsDto) obj;
        return epx.f(this.text, stickersBonusRewardTermsDto.text) && epx.f(this.title, stickersBonusRewardTermsDto.title);
    }

    public final String getTitle() {
        return this.title;
    }

    public final int hashCode() {
        int hashCode = this.text.hashCode() * 31;
        String str = this.title;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StickersBonusRewardTermsDto(text=");
        sb.append(this.text);
        sb.append(", title=");
        return ho8.a(sb, this.title, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.text);
        parcel.writeString(this.title);
    }

    public /* synthetic */ StickersBonusRewardTermsDto(String str, String str2, int i, zcl zclVar) {
        this(str, (i & 2) != 0 ? null : str2);
    }
}
