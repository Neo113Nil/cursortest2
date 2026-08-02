package com.vk.api.generated.video.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.ironsource.X3;
import xsna.asp;
import xsna.epx;
import xsna.nr;
import xsna.pmi0;
import xsna.sn;
import xsna.uqi;
import xsna.zcl;
import xsna.zrp;

/* compiled from: VideoVideoForEditAutoEpisodesDto.kt */
/* loaded from: classes15.dex */
public final class VideoVideoForEditAutoEpisodesDto implements Parcelable {
    public static final Parcelable.Creator<VideoVideoForEditAutoEpisodesDto> CREATOR = new a();

    @pmi0("can_generate")
    private final Boolean canGenerate;

    @pmi0("error_code")
    private final Integer errorCode;

    @pmi0("status")
    private final StatusDto status;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: VideoVideoForEditAutoEpisodesDto.kt */
    public static final class StatusDto implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ StatusDto[] $VALUES;
        public static final Parcelable.Creator<StatusDto> CREATOR;

        @pmi0("error")
        public static final StatusDto ERROR;

        @pmi0("processing")
        public static final StatusDto PROCESSING;

        @pmi0(X3.i.s)
        public static final StatusDto READY;
        private final String value;

        /* compiled from: VideoVideoForEditAutoEpisodesDto.kt */
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
            StatusDto statusDto = new StatusDto("PROCESSING", 0, "processing");
            PROCESSING = statusDto;
            StatusDto statusDto2 = new StatusDto("ERROR", 1, "error");
            ERROR = statusDto2;
            StatusDto statusDto3 = new StatusDto("READY", 2, X3.i.s);
            READY = statusDto3;
            StatusDto[] statusDtoArr = {statusDto, statusDto2, statusDto3};
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

    /* compiled from: VideoVideoForEditAutoEpisodesDto.kt */
    public static final class a implements Parcelable.Creator<VideoVideoForEditAutoEpisodesDto> {
        @Override // android.os.Parcelable.Creator
        public final VideoVideoForEditAutoEpisodesDto createFromParcel(Parcel parcel) {
            Boolean valueOf;
            if (parcel.readInt() == 0) {
                valueOf = null;
            } else {
                valueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new VideoVideoForEditAutoEpisodesDto(valueOf, parcel.readInt() == 0 ? null : StatusDto.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final VideoVideoForEditAutoEpisodesDto[] newArray(int i) {
            return new VideoVideoForEditAutoEpisodesDto[i];
        }
    }

    public VideoVideoForEditAutoEpisodesDto() {
        this(null, null, null, 7, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VideoVideoForEditAutoEpisodesDto)) {
            return false;
        }
        VideoVideoForEditAutoEpisodesDto videoVideoForEditAutoEpisodesDto = (VideoVideoForEditAutoEpisodesDto) obj;
        return epx.f(this.canGenerate, videoVideoForEditAutoEpisodesDto.canGenerate) && this.status == videoVideoForEditAutoEpisodesDto.status && epx.f(this.errorCode, videoVideoForEditAutoEpisodesDto.errorCode);
    }

    public final int hashCode() {
        Boolean bool = this.canGenerate;
        int hashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        StatusDto statusDto = this.status;
        int hashCode2 = (hashCode + (statusDto == null ? 0 : statusDto.hashCode())) * 31;
        Integer num = this.errorCode;
        return hashCode2 + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VideoVideoForEditAutoEpisodesDto(canGenerate=");
        sb.append(this.canGenerate);
        sb.append(", status=");
        sb.append(this.status);
        sb.append(", errorCode=");
        return uqi.b(sb, this.errorCode, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Boolean bool = this.canGenerate;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool);
        }
        StatusDto statusDto = this.status;
        if (statusDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            statusDto.writeToParcel(parcel, i);
        }
        Integer num = this.errorCode;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
    }

    public VideoVideoForEditAutoEpisodesDto(Boolean bool, StatusDto statusDto, Integer num) {
        this.canGenerate = bool;
        this.status = statusDto;
        this.errorCode = num;
    }

    public /* synthetic */ VideoVideoForEditAutoEpisodesDto(Boolean bool, StatusDto statusDto, Integer num, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : bool, (i & 2) != 0 ? null : statusDto, (i & 4) != 0 ? null : num);
    }
}
