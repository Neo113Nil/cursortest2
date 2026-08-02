package com.vk.api.generated.groups.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.zrp;

/* compiled from: GroupsGetGptResultResponseDto.kt */
/* loaded from: classes14.dex */
public final class GroupsGetGptResultResponseDto implements Parcelable {
    public static final Parcelable.Creator<GroupsGetGptResultResponseDto> CREATOR = new a();

    @pmi0("answer")
    private final String answer;

    @pmi0("status")
    private final StatusDto status;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: GroupsGetGptResultResponseDto.kt */
    public static final class StatusDto implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ StatusDto[] $VALUES;

        @pmi0("awaiting_response")
        public static final StatusDto AWAITING_RESPONSE;
        public static final Parcelable.Creator<StatusDto> CREATOR;

        @pmi0("received_response")
        public static final StatusDto RECEIVED_RESPONSE;
        private final String value;

        /* compiled from: GroupsGetGptResultResponseDto.kt */
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
            StatusDto statusDto = new StatusDto("AWAITING_RESPONSE", 0, "awaiting_response");
            AWAITING_RESPONSE = statusDto;
            StatusDto statusDto2 = new StatusDto("RECEIVED_RESPONSE", 1, "received_response");
            RECEIVED_RESPONSE = statusDto2;
            StatusDto[] statusDtoArr = {statusDto, statusDto2};
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

    /* compiled from: GroupsGetGptResultResponseDto.kt */
    public static final class a implements Parcelable.Creator<GroupsGetGptResultResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final GroupsGetGptResultResponseDto createFromParcel(Parcel parcel) {
            return new GroupsGetGptResultResponseDto(StatusDto.CREATOR.createFromParcel(parcel), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final GroupsGetGptResultResponseDto[] newArray(int i) {
            return new GroupsGetGptResultResponseDto[i];
        }
    }

    public GroupsGetGptResultResponseDto(StatusDto statusDto, String str) {
        this.status = statusDto;
        this.answer = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GroupsGetGptResultResponseDto)) {
            return false;
        }
        GroupsGetGptResultResponseDto groupsGetGptResultResponseDto = (GroupsGetGptResultResponseDto) obj;
        return this.status == groupsGetGptResultResponseDto.status && epx.f(this.answer, groupsGetGptResultResponseDto.answer);
    }

    public final int hashCode() {
        return this.answer.hashCode() + (this.status.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GroupsGetGptResultResponseDto(status=");
        sb.append(this.status);
        sb.append(", answer=");
        return ho8.a(sb, this.answer, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.status.writeToParcel(parcel, i);
        parcel.writeString(this.answer);
    }
}
