package com.vk.api.generated.audio.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.pmi0;
import xsna.sn;
import xsna.tn;
import xsna.zcl;

/* compiled from: AudioGetKidsModeResponseDto.kt */
/* loaded from: classes14.dex */
public final class AudioGetKidsModeResponseDto implements Parcelable {
    public static final Parcelable.Creator<AudioGetKidsModeResponseDto> CREATOR = new a();

    @pmi0("state")
    private final Boolean state;

    /* compiled from: AudioGetKidsModeResponseDto.kt */
    public static final class a implements Parcelable.Creator<AudioGetKidsModeResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final AudioGetKidsModeResponseDto createFromParcel(Parcel parcel) {
            Boolean valueOf;
            if (parcel.readInt() == 0) {
                valueOf = null;
            } else {
                valueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new AudioGetKidsModeResponseDto(valueOf);
        }

        @Override // android.os.Parcelable.Creator
        public final AudioGetKidsModeResponseDto[] newArray(int i) {
            return new AudioGetKidsModeResponseDto[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AudioGetKidsModeResponseDto() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AudioGetKidsModeResponseDto) && epx.f(this.state, ((AudioGetKidsModeResponseDto) obj).state);
    }

    public final int hashCode() {
        Boolean bool = this.state;
        if (bool == null) {
            return 0;
        }
        return bool.hashCode();
    }

    public final String toString() {
        return tn.a(new StringBuilder("AudioGetKidsModeResponseDto(state="), this.state, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Boolean bool = this.state;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool);
        }
    }

    public AudioGetKidsModeResponseDto(Boolean bool) {
        this.state = bool;
    }

    public /* synthetic */ AudioGetKidsModeResponseDto(Boolean bool, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : bool);
    }
}
