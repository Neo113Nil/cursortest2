package com.vk.api.generated.audio.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: AudioOnboardingFinalDto.kt */
/* loaded from: classes14.dex */
public final class AudioOnboardingFinalDto implements Parcelable {
    public static final Parcelable.Creator<AudioOnboardingFinalDto> CREATOR = new a();

    @pmi0("action")
    private final AudioOnboardingActionDto action;

    @pmi0("section_id")
    private final String sectionId;

    /* compiled from: AudioOnboardingFinalDto.kt */
    public static final class a implements Parcelable.Creator<AudioOnboardingFinalDto> {
        @Override // android.os.Parcelable.Creator
        public final AudioOnboardingFinalDto createFromParcel(Parcel parcel) {
            return new AudioOnboardingFinalDto(parcel.readInt() == 0 ? null : AudioOnboardingActionDto.CREATOR.createFromParcel(parcel), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final AudioOnboardingFinalDto[] newArray(int i) {
            return new AudioOnboardingFinalDto[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AudioOnboardingFinalDto() {
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
        if (!(obj instanceof AudioOnboardingFinalDto)) {
            return false;
        }
        AudioOnboardingFinalDto audioOnboardingFinalDto = (AudioOnboardingFinalDto) obj;
        return epx.f(this.action, audioOnboardingFinalDto.action) && epx.f(this.sectionId, audioOnboardingFinalDto.sectionId);
    }

    public final int hashCode() {
        AudioOnboardingActionDto audioOnboardingActionDto = this.action;
        int hashCode = (audioOnboardingActionDto == null ? 0 : audioOnboardingActionDto.hashCode()) * 31;
        String str = this.sectionId;
        return hashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AudioOnboardingFinalDto(action=");
        sb.append(this.action);
        sb.append(", sectionId=");
        return ho8.a(sb, this.sectionId, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AudioOnboardingActionDto audioOnboardingActionDto = this.action;
        if (audioOnboardingActionDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            audioOnboardingActionDto.writeToParcel(parcel, i);
        }
        parcel.writeString(this.sectionId);
    }

    public AudioOnboardingFinalDto(AudioOnboardingActionDto audioOnboardingActionDto, String str) {
        this.action = audioOnboardingActionDto;
        this.sectionId = str;
    }

    public /* synthetic */ AudioOnboardingFinalDto(AudioOnboardingActionDto audioOnboardingActionDto, String str, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : audioOnboardingActionDto, (i & 2) != 0 ? null : str);
    }
}
