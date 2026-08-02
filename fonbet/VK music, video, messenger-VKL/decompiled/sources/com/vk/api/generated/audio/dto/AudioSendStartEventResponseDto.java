package com.vk.api.generated.audio.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.nr;
import xsna.pmi0;
import xsna.uqi;
import xsna.zcl;

/* compiled from: AudioSendStartEventResponseDto.kt */
/* loaded from: classes14.dex */
public final class AudioSendStartEventResponseDto implements Parcelable {
    public static final Parcelable.Creator<AudioSendStartEventResponseDto> CREATOR = new a();

    @pmi0("expires_date")
    private final Integer expiresDate;

    @pmi0("has_music_subscription")
    private final Integer hasMusicSubscription;

    /* compiled from: AudioSendStartEventResponseDto.kt */
    public static final class a implements Parcelable.Creator<AudioSendStartEventResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final AudioSendStartEventResponseDto createFromParcel(Parcel parcel) {
            return new AudioSendStartEventResponseDto(parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final AudioSendStartEventResponseDto[] newArray(int i) {
            return new AudioSendStartEventResponseDto[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AudioSendStartEventResponseDto() {
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
        if (!(obj instanceof AudioSendStartEventResponseDto)) {
            return false;
        }
        AudioSendStartEventResponseDto audioSendStartEventResponseDto = (AudioSendStartEventResponseDto) obj;
        return epx.f(this.hasMusicSubscription, audioSendStartEventResponseDto.hasMusicSubscription) && epx.f(this.expiresDate, audioSendStartEventResponseDto.expiresDate);
    }

    public final int hashCode() {
        Integer num = this.hasMusicSubscription;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.expiresDate;
        return hashCode + (num2 != null ? num2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AudioSendStartEventResponseDto(hasMusicSubscription=");
        sb.append(this.hasMusicSubscription);
        sb.append(", expiresDate=");
        return uqi.b(sb, this.expiresDate, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Integer num = this.hasMusicSubscription;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
        Integer num2 = this.expiresDate;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num2);
        }
    }

    public AudioSendStartEventResponseDto(Integer num, Integer num2) {
        this.hasMusicSubscription = num;
        this.expiresDate = num2;
    }

    public /* synthetic */ AudioSendStartEventResponseDto(Integer num, Integer num2, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : num2);
    }
}
