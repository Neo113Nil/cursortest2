package com.vk.api.generated.shortVideo.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;

/* compiled from: ShortVideoAudioTemplateInfoDto.kt */
/* loaded from: classes15.dex */
public final class ShortVideoAudioTemplateInfoDto implements Parcelable {
    public static final Parcelable.Creator<ShortVideoAudioTemplateInfoDto> CREATOR = new a();

    @pmi0("raw_id")
    private final String rawId;

    /* compiled from: ShortVideoAudioTemplateInfoDto.kt */
    public static final class a implements Parcelable.Creator<ShortVideoAudioTemplateInfoDto> {
        @Override // android.os.Parcelable.Creator
        public final ShortVideoAudioTemplateInfoDto createFromParcel(Parcel parcel) {
            return new ShortVideoAudioTemplateInfoDto(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final ShortVideoAudioTemplateInfoDto[] newArray(int i) {
            return new ShortVideoAudioTemplateInfoDto[i];
        }
    }

    public ShortVideoAudioTemplateInfoDto(String str) {
        this.rawId = str;
    }

    public final String d() {
        return this.rawId;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ShortVideoAudioTemplateInfoDto) && epx.f(this.rawId, ((ShortVideoAudioTemplateInfoDto) obj).rawId);
    }

    public final int hashCode() {
        return this.rawId.hashCode();
    }

    public final String toString() {
        return ho8.a(new StringBuilder("ShortVideoAudioTemplateInfoDto(rawId="), this.rawId, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.rawId);
    }
}
