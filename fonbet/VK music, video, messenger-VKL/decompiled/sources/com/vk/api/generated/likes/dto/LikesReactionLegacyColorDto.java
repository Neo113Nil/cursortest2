package com.vk.api.generated.likes.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: LikesReactionLegacyColorDto.kt */
/* loaded from: classes14.dex */
public final class LikesReactionLegacyColorDto implements Parcelable {
    public static final Parcelable.Creator<LikesReactionLegacyColorDto> CREATOR = new a();

    @pmi0("dark")
    private final String dark;

    @pmi0("light")
    private final String light;

    /* compiled from: LikesReactionLegacyColorDto.kt */
    public static final class a implements Parcelable.Creator<LikesReactionLegacyColorDto> {
        @Override // android.os.Parcelable.Creator
        public final LikesReactionLegacyColorDto createFromParcel(Parcel parcel) {
            return new LikesReactionLegacyColorDto(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final LikesReactionLegacyColorDto[] newArray(int i) {
            return new LikesReactionLegacyColorDto[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public LikesReactionLegacyColorDto() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LikesReactionLegacyColorDto)) {
            return false;
        }
        LikesReactionLegacyColorDto likesReactionLegacyColorDto = (LikesReactionLegacyColorDto) obj;
        return epx.f(this.light, likesReactionLegacyColorDto.light) && epx.f(this.dark, likesReactionLegacyColorDto.dark);
    }

    public final int hashCode() {
        String str = this.light;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.dark;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LikesReactionLegacyColorDto(light=");
        sb.append(this.light);
        sb.append(", dark=");
        return ho8.a(sb, this.dark, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.light);
        parcel.writeString(this.dark);
    }

    public LikesReactionLegacyColorDto(String str, String str2) {
        this.light = str;
        this.dark = str2;
    }

    public /* synthetic */ LikesReactionLegacyColorDto(String str, String str2, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2);
    }
}
