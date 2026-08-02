package com.vk.api.generated.audio.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: AudioOnboardingActionDto.kt */
/* loaded from: classes14.dex */
public final class AudioOnboardingActionDto implements Parcelable {
    public static final Parcelable.Creator<AudioOnboardingActionDto> CREATOR = new a();

    @pmi0("type")
    private final String type;

    /* compiled from: AudioOnboardingActionDto.kt */
    public static final class a implements Parcelable.Creator<AudioOnboardingActionDto> {
        @Override // android.os.Parcelable.Creator
        public final AudioOnboardingActionDto createFromParcel(Parcel parcel) {
            return new AudioOnboardingActionDto(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final AudioOnboardingActionDto[] newArray(int i) {
            return new AudioOnboardingActionDto[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AudioOnboardingActionDto() {
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
        return (obj instanceof AudioOnboardingActionDto) && epx.f(this.type, ((AudioOnboardingActionDto) obj).type);
    }

    public final int hashCode() {
        String str = this.type;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return ho8.a(new StringBuilder("AudioOnboardingActionDto(type="), this.type, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.type);
    }

    public AudioOnboardingActionDto(String str) {
        this.type = str;
    }

    public /* synthetic */ AudioOnboardingActionDto(String str, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : str);
    }
}
