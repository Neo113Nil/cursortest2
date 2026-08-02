package com.vk.api.generated.vmoji.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: VmojiCharacterPreviewBackgroundColorDto.kt */
/* loaded from: classes15.dex */
public final class VmojiCharacterPreviewBackgroundColorDto implements Parcelable {
    public static final Parcelable.Creator<VmojiCharacterPreviewBackgroundColorDto> CREATOR = new a();

    @pmi0("dark")
    private final String dark;

    @pmi0("light")
    private final String light;

    /* compiled from: VmojiCharacterPreviewBackgroundColorDto.kt */
    public static final class a implements Parcelable.Creator<VmojiCharacterPreviewBackgroundColorDto> {
        @Override // android.os.Parcelable.Creator
        public final VmojiCharacterPreviewBackgroundColorDto createFromParcel(Parcel parcel) {
            return new VmojiCharacterPreviewBackgroundColorDto(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final VmojiCharacterPreviewBackgroundColorDto[] newArray(int i) {
            return new VmojiCharacterPreviewBackgroundColorDto[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public VmojiCharacterPreviewBackgroundColorDto() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public final String d() {
        return this.dark;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String e() {
        return this.light;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VmojiCharacterPreviewBackgroundColorDto)) {
            return false;
        }
        VmojiCharacterPreviewBackgroundColorDto vmojiCharacterPreviewBackgroundColorDto = (VmojiCharacterPreviewBackgroundColorDto) obj;
        return epx.f(this.light, vmojiCharacterPreviewBackgroundColorDto.light) && epx.f(this.dark, vmojiCharacterPreviewBackgroundColorDto.dark);
    }

    public final int hashCode() {
        String str = this.light;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.dark;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VmojiCharacterPreviewBackgroundColorDto(light=");
        sb.append(this.light);
        sb.append(", dark=");
        return ho8.a(sb, this.dark, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.light);
        parcel.writeString(this.dark);
    }

    public VmojiCharacterPreviewBackgroundColorDto(String str, String str2) {
        this.light = str;
        this.dark = str2;
    }

    public /* synthetic */ VmojiCharacterPreviewBackgroundColorDto(String str, String str2, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2);
    }
}
