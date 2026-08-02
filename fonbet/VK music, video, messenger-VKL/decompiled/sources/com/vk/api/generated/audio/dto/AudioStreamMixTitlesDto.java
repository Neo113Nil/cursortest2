package com.vk.api.generated.audio.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: AudioStreamMixTitlesDto.kt */
/* loaded from: classes14.dex */
public final class AudioStreamMixTitlesDto implements Parcelable {
    public static final Parcelable.Creator<AudioStreamMixTitlesDto> CREATOR = new a();

    @pmi0("common_state")
    private final String commonState;

    @pmi0("play_state")
    private final String playState;

    /* compiled from: AudioStreamMixTitlesDto.kt */
    public static final class a implements Parcelable.Creator<AudioStreamMixTitlesDto> {
        @Override // android.os.Parcelable.Creator
        public final AudioStreamMixTitlesDto createFromParcel(Parcel parcel) {
            return new AudioStreamMixTitlesDto(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final AudioStreamMixTitlesDto[] newArray(int i) {
            return new AudioStreamMixTitlesDto[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AudioStreamMixTitlesDto() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public final String d() {
        return this.commonState;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String e() {
        return this.playState;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AudioStreamMixTitlesDto)) {
            return false;
        }
        AudioStreamMixTitlesDto audioStreamMixTitlesDto = (AudioStreamMixTitlesDto) obj;
        return epx.f(this.commonState, audioStreamMixTitlesDto.commonState) && epx.f(this.playState, audioStreamMixTitlesDto.playState);
    }

    public final int hashCode() {
        String str = this.commonState;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.playState;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AudioStreamMixTitlesDto(commonState=");
        sb.append(this.commonState);
        sb.append(", playState=");
        return ho8.a(sb, this.playState, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.commonState);
        parcel.writeString(this.playState);
    }

    public AudioStreamMixTitlesDto(String str, String str2) {
        this.commonState = str;
        this.playState = str2;
    }

    public /* synthetic */ AudioStreamMixTitlesDto(String str, String str2, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2);
    }
}
