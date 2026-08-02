package com.vk.api.generated.moderationTools.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* compiled from: ModerationToolsAPlusStatusResponseDto.kt */
/* loaded from: classes15.dex */
public final class ModerationToolsAPlusStatusResponseDto implements Parcelable {
    public static final Parcelable.Creator<ModerationToolsAPlusStatusResponseDto> CREATOR = new a();

    @pmi0("status")
    private final StatusDto status;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ModerationToolsAPlusStatusResponseDto.kt */
    public static final class StatusDto implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ StatusDto[] $VALUES;
        public static final Parcelable.Creator<StatusDto> CREATOR;

        @pmi0("2")
        public static final StatusDto HAS_MARK;

        @pmi0(CampaignEx.CLICKMODE_ON)
        public static final StatusDto NOT_ALLOWED_TO_REGISTER;

        @pmi0("4")
        public static final StatusDto NOT_CONFIRMED;

        @pmi0("1")
        public static final StatusDto NOT_REGISTERED;

        @pmi0("3")
        public static final StatusDto ON_CHECK;

        @pmi0("0")
        public static final StatusDto UNKNOWN;
        private final int value;

        /* compiled from: ModerationToolsAPlusStatusResponseDto.kt */
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
            StatusDto statusDto = new StatusDto(GrsBaseInfo.CountryCodeSource.UNKNOWN, 0, 0);
            UNKNOWN = statusDto;
            StatusDto statusDto2 = new StatusDto("NOT_REGISTERED", 1, 1);
            NOT_REGISTERED = statusDto2;
            StatusDto statusDto3 = new StatusDto("HAS_MARK", 2, 2);
            HAS_MARK = statusDto3;
            StatusDto statusDto4 = new StatusDto("ON_CHECK", 3, 3);
            ON_CHECK = statusDto4;
            StatusDto statusDto5 = new StatusDto("NOT_CONFIRMED", 4, 4);
            NOT_CONFIRMED = statusDto5;
            StatusDto statusDto6 = new StatusDto("NOT_ALLOWED_TO_REGISTER", 5, 5);
            NOT_ALLOWED_TO_REGISTER = statusDto6;
            StatusDto[] statusDtoArr = {statusDto, statusDto2, statusDto3, statusDto4, statusDto5, statusDto6};
            $VALUES = statusDtoArr;
            $ENTRIES = new asp(statusDtoArr);
            CREATOR = new a();
        }

        private StatusDto(String str, int i, int i2) {
            this.value = i2;
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

    /* compiled from: ModerationToolsAPlusStatusResponseDto.kt */
    public static final class a implements Parcelable.Creator<ModerationToolsAPlusStatusResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final ModerationToolsAPlusStatusResponseDto createFromParcel(Parcel parcel) {
            return new ModerationToolsAPlusStatusResponseDto(StatusDto.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final ModerationToolsAPlusStatusResponseDto[] newArray(int i) {
            return new ModerationToolsAPlusStatusResponseDto[i];
        }
    }

    public ModerationToolsAPlusStatusResponseDto(StatusDto statusDto) {
        this.status = statusDto;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ModerationToolsAPlusStatusResponseDto) && this.status == ((ModerationToolsAPlusStatusResponseDto) obj).status;
    }

    public final int hashCode() {
        return this.status.hashCode();
    }

    public final String toString() {
        return "ModerationToolsAPlusStatusResponseDto(status=" + this.status + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.status.writeToParcel(parcel, i);
    }
}
