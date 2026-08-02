package com.vk.api.generated.serverEffects.dto;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.ao;
import xsna.asp;
import xsna.en;
import xsna.epx;
import xsna.pmi0;
import xsna.vu5;
import xsna.zrp;

/* compiled from: ServerEffectsGetVideoGenerationStatusesResponseDto.kt */
/* loaded from: classes15.dex */
public final class ServerEffectsGetVideoGenerationStatusesResponseDto implements Parcelable {
    public static final Parcelable.Creator<ServerEffectsGetVideoGenerationStatusesResponseDto> CREATOR = new a();

    @pmi0("original_video_status")
    private final OriginalVideoStatusDto originalVideoStatus;

    @pmi0("status_poll_interval")
    private final int statusPollInterval;

    @pmi0("videos")
    private final List<ServerEffectsGeneratedVideoInfoDto> videos;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ServerEffectsGetVideoGenerationStatusesResponseDto.kt */
    public static final class OriginalVideoStatusDto implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ OriginalVideoStatusDto[] $VALUES;

        @pmi0("10")
        public static final OriginalVideoStatusDto CENSORED;
        public static final Parcelable.Creator<OriginalVideoStatusDto> CREATOR;

        @pmi0("50")
        public static final OriginalVideoStatusDto ERROR;

        @pmi0("11")
        public static final OriginalVideoStatusDto NO_FACE_DETECTED;

        @pmi0("2")
        public static final OriginalVideoStatusDto OK;

        @pmi0("1")
        public static final OriginalVideoStatusDto VALIDATION_IN_PROGRESS;

        @pmi0("12")
        public static final OriginalVideoStatusDto VIDEO_IS_TOO_LONG;

        @pmi0("0")
        public static final OriginalVideoStatusDto WAITING_FOR_UPLOAD;
        private final int value;

        /* compiled from: ServerEffectsGetVideoGenerationStatusesResponseDto.kt */
        public static final class a implements Parcelable.Creator<OriginalVideoStatusDto> {
            @Override // android.os.Parcelable.Creator
            public final OriginalVideoStatusDto createFromParcel(Parcel parcel) {
                return OriginalVideoStatusDto.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final OriginalVideoStatusDto[] newArray(int i) {
                return new OriginalVideoStatusDto[i];
            }
        }

        static {
            OriginalVideoStatusDto originalVideoStatusDto = new OriginalVideoStatusDto("WAITING_FOR_UPLOAD", 0, 0);
            WAITING_FOR_UPLOAD = originalVideoStatusDto;
            OriginalVideoStatusDto originalVideoStatusDto2 = new OriginalVideoStatusDto("VALIDATION_IN_PROGRESS", 1, 1);
            VALIDATION_IN_PROGRESS = originalVideoStatusDto2;
            OriginalVideoStatusDto originalVideoStatusDto3 = new OriginalVideoStatusDto("OK", 2, 2);
            OK = originalVideoStatusDto3;
            OriginalVideoStatusDto originalVideoStatusDto4 = new OriginalVideoStatusDto("CENSORED", 3, 10);
            CENSORED = originalVideoStatusDto4;
            OriginalVideoStatusDto originalVideoStatusDto5 = new OriginalVideoStatusDto("NO_FACE_DETECTED", 4, 11);
            NO_FACE_DETECTED = originalVideoStatusDto5;
            OriginalVideoStatusDto originalVideoStatusDto6 = new OriginalVideoStatusDto("VIDEO_IS_TOO_LONG", 5, 12);
            VIDEO_IS_TOO_LONG = originalVideoStatusDto6;
            OriginalVideoStatusDto originalVideoStatusDto7 = new OriginalVideoStatusDto("ERROR", 6, 50);
            ERROR = originalVideoStatusDto7;
            OriginalVideoStatusDto[] originalVideoStatusDtoArr = {originalVideoStatusDto, originalVideoStatusDto2, originalVideoStatusDto3, originalVideoStatusDto4, originalVideoStatusDto5, originalVideoStatusDto6, originalVideoStatusDto7};
            $VALUES = originalVideoStatusDtoArr;
            $ENTRIES = new asp(originalVideoStatusDtoArr);
            CREATOR = new a();
        }

        private OriginalVideoStatusDto(String str, int i, int i2) {
            this.value = i2;
        }

        public static OriginalVideoStatusDto valueOf(String str) {
            return (OriginalVideoStatusDto) Enum.valueOf(OriginalVideoStatusDto.class, str);
        }

        public static OriginalVideoStatusDto[] values() {
            return (OriginalVideoStatusDto[]) $VALUES.clone();
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

    /* compiled from: ServerEffectsGetVideoGenerationStatusesResponseDto.kt */
    public static final class a implements Parcelable.Creator<ServerEffectsGetVideoGenerationStatusesResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final ServerEffectsGetVideoGenerationStatusesResponseDto createFromParcel(Parcel parcel) {
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            int i = 0;
            while (i != readInt) {
                i = en.a(ServerEffectsGeneratedVideoInfoDto.CREATOR, parcel, arrayList, i, 1);
            }
            return new ServerEffectsGetVideoGenerationStatusesResponseDto(arrayList, OriginalVideoStatusDto.CREATOR.createFromParcel(parcel), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final ServerEffectsGetVideoGenerationStatusesResponseDto[] newArray(int i) {
            return new ServerEffectsGetVideoGenerationStatusesResponseDto[i];
        }
    }

    public ServerEffectsGetVideoGenerationStatusesResponseDto(List<ServerEffectsGeneratedVideoInfoDto> list, OriginalVideoStatusDto originalVideoStatusDto, int i) {
        this.videos = list;
        this.originalVideoStatus = originalVideoStatusDto;
        this.statusPollInterval = i;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ServerEffectsGetVideoGenerationStatusesResponseDto)) {
            return false;
        }
        ServerEffectsGetVideoGenerationStatusesResponseDto serverEffectsGetVideoGenerationStatusesResponseDto = (ServerEffectsGetVideoGenerationStatusesResponseDto) obj;
        return epx.f(this.videos, serverEffectsGetVideoGenerationStatusesResponseDto.videos) && this.originalVideoStatus == serverEffectsGetVideoGenerationStatusesResponseDto.originalVideoStatus && this.statusPollInterval == serverEffectsGetVideoGenerationStatusesResponseDto.statusPollInterval;
    }

    public final int hashCode() {
        return Integer.hashCode(this.statusPollInterval) + ((this.originalVideoStatus.hashCode() + (this.videos.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ServerEffectsGetVideoGenerationStatusesResponseDto(videos=");
        sb.append(this.videos);
        sb.append(", originalVideoStatus=");
        sb.append(this.originalVideoStatus);
        sb.append(", statusPollInterval=");
        return vu5.b(sb, this.statusPollInterval, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Iterator a2 = ao.a(parcel, this.videos);
        while (a2.hasNext()) {
            ((ServerEffectsGeneratedVideoInfoDto) a2.next()).writeToParcel(parcel, i);
        }
        this.originalVideoStatus.writeToParcel(parcel, i);
        parcel.writeInt(this.statusPollInterval);
    }
}
