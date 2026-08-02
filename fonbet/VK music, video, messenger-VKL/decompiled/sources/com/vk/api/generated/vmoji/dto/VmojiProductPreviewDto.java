package com.vk.api.generated.vmoji.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;

/* compiled from: VmojiProductPreviewDto.kt */
/* loaded from: classes15.dex */
public final class VmojiProductPreviewDto implements Parcelable {
    public static final Parcelable.Creator<VmojiProductPreviewDto> CREATOR = new a();

    @pmi0("caption")
    private final String caption;

    @pmi0("character_id")
    private final String characterId;

    /* compiled from: VmojiProductPreviewDto.kt */
    public static final class a implements Parcelable.Creator<VmojiProductPreviewDto> {
        @Override // android.os.Parcelable.Creator
        public final VmojiProductPreviewDto createFromParcel(Parcel parcel) {
            return new VmojiProductPreviewDto(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final VmojiProductPreviewDto[] newArray(int i) {
            return new VmojiProductPreviewDto[i];
        }
    }

    public VmojiProductPreviewDto(String str, String str2) {
        this.caption = str;
        this.characterId = str2;
    }

    public final String d() {
        return this.caption;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String e() {
        return this.characterId;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VmojiProductPreviewDto)) {
            return false;
        }
        VmojiProductPreviewDto vmojiProductPreviewDto = (VmojiProductPreviewDto) obj;
        return epx.f(this.caption, vmojiProductPreviewDto.caption) && epx.f(this.characterId, vmojiProductPreviewDto.characterId);
    }

    public final int hashCode() {
        return this.characterId.hashCode() + (this.caption.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VmojiProductPreviewDto(caption=");
        sb.append(this.caption);
        sb.append(", characterId=");
        return ho8.a(sb, this.characterId, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.caption);
        parcel.writeString(this.characterId);
    }
}
