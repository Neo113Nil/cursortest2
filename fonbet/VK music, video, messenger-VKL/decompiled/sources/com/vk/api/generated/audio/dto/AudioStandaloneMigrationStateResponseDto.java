package com.vk.api.generated.audio.dto;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.core.app.NotificationCompat;
import com.huawei.hms.hihealth.HiHealthActivities;
import com.ironsource.X3;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.asp;
import xsna.epx;
import xsna.nr;
import xsna.pmi0;
import xsna.uqi;
import xsna.zcl;
import xsna.zrp;

/* compiled from: AudioStandaloneMigrationStateResponseDto.kt */
/* loaded from: classes14.dex */
public final class AudioStandaloneMigrationStateResponseDto implements Parcelable {
    public static final Parcelable.Creator<AudioStandaloneMigrationStateResponseDto> CREATOR = new a();

    @pmi0(NotificationCompat.CATEGORY_PROGRESS)
    private final Integer progress;

    @pmi0("result_code")
    private final Integer resultCode;

    @pmi0("status")
    private final StatusDto status;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: AudioStandaloneMigrationStateResponseDto.kt */
    public static final class StatusDto implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ StatusDto[] $VALUES;
        public static final Parcelable.Creator<StatusDto> CREATOR;

        @pmi0("done")
        public static final StatusDto DONE;

        @pmi0("error")
        public static final StatusDto ERROR;

        @pmi0(HiHealthActivities.RUNNING)
        public static final StatusDto RUNNING;

        @pmi0(X3.i.d0)
        public static final StatusDto STARTED;
        private final String value;

        /* compiled from: AudioStandaloneMigrationStateResponseDto.kt */
        public static final class a implements Parcelable.Creator<StatusDto> {
            @Override // android.os.Parcelable.Creator
            public final StatusDto createFromParcel(Parcel parcel) {
                return StatusDto.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final StatusDto[] newArray(int i) {
                return new StatusDto[i];
            }
        }

        static {
            StatusDto statusDto = new StatusDto("ERROR", 0, "error");
            ERROR = statusDto;
            StatusDto statusDto2 = new StatusDto(SignalingProtocol.STATE_STARTED, 1, X3.i.d0);
            STARTED = statusDto2;
            StatusDto statusDto3 = new StatusDto("RUNNING", 2, HiHealthActivities.RUNNING);
            RUNNING = statusDto3;
            StatusDto statusDto4 = new StatusDto("DONE", 3, "done");
            DONE = statusDto4;
            StatusDto[] statusDtoArr = {statusDto, statusDto2, statusDto3, statusDto4};
            $VALUES = statusDtoArr;
            $ENTRIES = new asp(statusDtoArr);
            CREATOR = new a();
        }

        private StatusDto(String str, int i, String str2) {
            this.value = str2;
        }

        public static StatusDto valueOf(String str) {
            return (StatusDto) Enum.valueOf(StatusDto.class, str);
        }

        public static StatusDto[] values() {
            return (StatusDto[]) $VALUES.clone();
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(name());
        }
    }

    /* compiled from: AudioStandaloneMigrationStateResponseDto.kt */
    public static final class a implements Parcelable.Creator<AudioStandaloneMigrationStateResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final AudioStandaloneMigrationStateResponseDto createFromParcel(Parcel parcel) {
            return new AudioStandaloneMigrationStateResponseDto(StatusDto.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final AudioStandaloneMigrationStateResponseDto[] newArray(int i) {
            return new AudioStandaloneMigrationStateResponseDto[i];
        }
    }

    public AudioStandaloneMigrationStateResponseDto(StatusDto statusDto, Integer num, Integer num2) {
        this.status = statusDto;
        this.progress = num;
        this.resultCode = num2;
    }

    public final StatusDto d() {
        return this.status;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AudioStandaloneMigrationStateResponseDto)) {
            return false;
        }
        AudioStandaloneMigrationStateResponseDto audioStandaloneMigrationStateResponseDto = (AudioStandaloneMigrationStateResponseDto) obj;
        return this.status == audioStandaloneMigrationStateResponseDto.status && epx.f(this.progress, audioStandaloneMigrationStateResponseDto.progress) && epx.f(this.resultCode, audioStandaloneMigrationStateResponseDto.resultCode);
    }

    public final int hashCode() {
        int hashCode = this.status.hashCode() * 31;
        Integer num = this.progress;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.resultCode;
        return hashCode2 + (num2 != null ? num2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AudioStandaloneMigrationStateResponseDto(status=");
        sb.append(this.status);
        sb.append(", progress=");
        sb.append(this.progress);
        sb.append(", resultCode=");
        return uqi.b(sb, this.resultCode, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.status.writeToParcel(parcel, i);
        Integer num = this.progress;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
        Integer num2 = this.resultCode;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num2);
        }
    }

    public /* synthetic */ AudioStandaloneMigrationStateResponseDto(StatusDto statusDto, Integer num, Integer num2, int i, zcl zclVar) {
        this(statusDto, (i & 2) != 0 ? null : num, (i & 4) != 0 ? null : num2);
    }
}
