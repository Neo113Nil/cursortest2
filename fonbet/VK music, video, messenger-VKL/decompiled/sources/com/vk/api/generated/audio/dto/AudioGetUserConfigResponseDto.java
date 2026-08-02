package com.vk.api.generated.audio.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.nr;
import xsna.pmi0;
import xsna.sn;
import xsna.tn;
import xsna.zcl;

/* compiled from: AudioGetUserConfigResponseDto.kt */
/* loaded from: classes14.dex */
public final class AudioGetUserConfigResponseDto implements Parcelable {
    public static final Parcelable.Creator<AudioGetUserConfigResponseDto> CREATOR = new a();

    @pmi0("is_rate_app_enabled")
    private final Boolean isRateAppEnabled;

    @pmi0("is_resident")
    private final Boolean isResident;

    @pmi0("is_unnecessary_feedback")
    private final Boolean isUnnecessaryFeedback;

    @pmi0("moosic_user_id")
    private final Integer moosicUserId;

    /* compiled from: AudioGetUserConfigResponseDto.kt */
    public static final class a implements Parcelable.Creator<AudioGetUserConfigResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final AudioGetUserConfigResponseDto createFromParcel(Parcel parcel) {
            Boolean valueOf;
            Boolean valueOf2;
            Boolean bool = null;
            if (parcel.readInt() == 0) {
                valueOf = null;
            } else {
                valueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                valueOf2 = null;
            } else {
                valueOf2 = Boolean.valueOf(parcel.readInt() != 0);
            }
            Integer valueOf3 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            if (parcel.readInt() != 0) {
                bool = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new AudioGetUserConfigResponseDto(valueOf, valueOf2, valueOf3, bool);
        }

        @Override // android.os.Parcelable.Creator
        public final AudioGetUserConfigResponseDto[] newArray(int i) {
            return new AudioGetUserConfigResponseDto[i];
        }
    }

    public AudioGetUserConfigResponseDto() {
        this(null, null, null, null, 15, null);
    }

    public final Integer d() {
        return this.moosicUserId;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AudioGetUserConfigResponseDto)) {
            return false;
        }
        AudioGetUserConfigResponseDto audioGetUserConfigResponseDto = (AudioGetUserConfigResponseDto) obj;
        return epx.f(this.isResident, audioGetUserConfigResponseDto.isResident) && epx.f(this.isRateAppEnabled, audioGetUserConfigResponseDto.isRateAppEnabled) && epx.f(this.moosicUserId, audioGetUserConfigResponseDto.moosicUserId) && epx.f(this.isUnnecessaryFeedback, audioGetUserConfigResponseDto.isUnnecessaryFeedback);
    }

    public final int hashCode() {
        Boolean bool = this.isResident;
        int hashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Boolean bool2 = this.isRateAppEnabled;
        int hashCode2 = (hashCode + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Integer num = this.moosicUserId;
        int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Boolean bool3 = this.isUnnecessaryFeedback;
        return hashCode3 + (bool3 != null ? bool3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AudioGetUserConfigResponseDto(isResident=");
        sb.append(this.isResident);
        sb.append(", isRateAppEnabled=");
        sb.append(this.isRateAppEnabled);
        sb.append(", moosicUserId=");
        sb.append(this.moosicUserId);
        sb.append(", isUnnecessaryFeedback=");
        return tn.a(sb, this.isUnnecessaryFeedback, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Boolean bool = this.isResident;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool);
        }
        Boolean bool2 = this.isRateAppEnabled;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool2);
        }
        Integer num = this.moosicUserId;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
        Boolean bool3 = this.isUnnecessaryFeedback;
        if (bool3 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool3);
        }
    }

    public AudioGetUserConfigResponseDto(Boolean bool, Boolean bool2, Integer num, Boolean bool3) {
        this.isResident = bool;
        this.isRateAppEnabled = bool2;
        this.moosicUserId = num;
        this.isUnnecessaryFeedback = bool3;
    }

    public /* synthetic */ AudioGetUserConfigResponseDto(Boolean bool, Boolean bool2, Integer num, Boolean bool3, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : bool, (i & 2) != 0 ? null : bool2, (i & 4) != 0 ? null : num, (i & 8) != 0 ? null : bool3);
    }
}
