package com.vk.api.generated.groups.dto;

import android.os.Parcel;
import android.os.Parcelable;
import ru.ok.android.api.core.ApiUris;
import xsna.asp;
import xsna.epx;
import xsna.nr;
import xsna.pmi0;
import xsna.uqi;
import xsna.zcl;
import xsna.zrp;

/* compiled from: GroupsEditManagerResponseDto.kt */
/* loaded from: classes14.dex */
public final class GroupsEditManagerResponseDto implements Parcelable {
    public static final Parcelable.Creator<GroupsEditManagerResponseDto> CREATOR = new a();

    @pmi0("status")
    private final StatusDto status;

    @pmi0("take_effect_after")
    private final Integer takeEffectAfter;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: GroupsEditManagerResponseDto.kt */
    public static final class StatusDto implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ StatusDto[] $VALUES;
        public static final Parcelable.Creator<StatusDto> CREATOR;

        @pmi0(ApiUris.SCHEME_OK)
        public static final StatusDto OK;

        @pmi0("ok_awaiting")
        public static final StatusDto OK_AWAITING;
        private final String value;

        /* compiled from: GroupsEditManagerResponseDto.kt */
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
            StatusDto statusDto = new StatusDto("OK", 0, ApiUris.SCHEME_OK);
            OK = statusDto;
            StatusDto statusDto2 = new StatusDto("OK_AWAITING", 1, "ok_awaiting");
            OK_AWAITING = statusDto2;
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

    /* compiled from: GroupsEditManagerResponseDto.kt */
    public static final class a implements Parcelable.Creator<GroupsEditManagerResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final GroupsEditManagerResponseDto createFromParcel(Parcel parcel) {
            return new GroupsEditManagerResponseDto(StatusDto.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
        }

        @Override // android.os.Parcelable.Creator
        public final GroupsEditManagerResponseDto[] newArray(int i) {
            return new GroupsEditManagerResponseDto[i];
        }
    }

    public GroupsEditManagerResponseDto(StatusDto statusDto, Integer num) {
        this.status = statusDto;
        this.takeEffectAfter = num;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GroupsEditManagerResponseDto)) {
            return false;
        }
        GroupsEditManagerResponseDto groupsEditManagerResponseDto = (GroupsEditManagerResponseDto) obj;
        return this.status == groupsEditManagerResponseDto.status && epx.f(this.takeEffectAfter, groupsEditManagerResponseDto.takeEffectAfter);
    }

    public final int hashCode() {
        int hashCode = this.status.hashCode() * 31;
        Integer num = this.takeEffectAfter;
        return hashCode + (num == null ? 0 : num.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GroupsEditManagerResponseDto(status=");
        sb.append(this.status);
        sb.append(", takeEffectAfter=");
        return uqi.b(sb, this.takeEffectAfter, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.status.writeToParcel(parcel, i);
        Integer num = this.takeEffectAfter;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
    }

    public /* synthetic */ GroupsEditManagerResponseDto(StatusDto statusDto, Integer num, int i, zcl zclVar) {
        this(statusDto, (i & 2) != 0 ? null : num);
    }
}
