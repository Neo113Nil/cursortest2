package com.vk.api.generated.combo.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.epx;
import xsna.pmi0;
import xsna.zcl;
import xsna.zrp;

/* compiled from: ComboGetLastMusicSubscriptionResponseDto.kt */
/* loaded from: classes14.dex */
public final class ComboGetLastMusicSubscriptionResponseDto implements Parcelable {
    public static final Parcelable.Creator<ComboGetLastMusicSubscriptionResponseDto> CREATOR = new a();

    @pmi0("status")
    private final StatusDto status;

    @pmi0("subscription")
    private final ComboMusicSubscriptionInfoDto subscription;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ComboGetLastMusicSubscriptionResponseDto.kt */
    public static final class StatusDto implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ StatusDto[] $VALUES;
        public static final Parcelable.Creator<StatusDto> CREATOR;

        @pmi0("exists")
        public static final StatusDto EXISTS;

        @pmi0("not_exists")
        public static final StatusDto NOT_EXISTS;
        private final String value;

        /* compiled from: ComboGetLastMusicSubscriptionResponseDto.kt */
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
            StatusDto statusDto = new StatusDto("EXISTS", 0, "exists");
            EXISTS = statusDto;
            StatusDto statusDto2 = new StatusDto("NOT_EXISTS", 1, "not_exists");
            NOT_EXISTS = statusDto2;
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

    /* compiled from: ComboGetLastMusicSubscriptionResponseDto.kt */
    public static final class a implements Parcelable.Creator<ComboGetLastMusicSubscriptionResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final ComboGetLastMusicSubscriptionResponseDto createFromParcel(Parcel parcel) {
            return new ComboGetLastMusicSubscriptionResponseDto(StatusDto.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : ComboMusicSubscriptionInfoDto.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final ComboGetLastMusicSubscriptionResponseDto[] newArray(int i) {
            return new ComboGetLastMusicSubscriptionResponseDto[i];
        }
    }

    public ComboGetLastMusicSubscriptionResponseDto(StatusDto statusDto, ComboMusicSubscriptionInfoDto comboMusicSubscriptionInfoDto) {
        this.status = statusDto;
        this.subscription = comboMusicSubscriptionInfoDto;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ComboGetLastMusicSubscriptionResponseDto)) {
            return false;
        }
        ComboGetLastMusicSubscriptionResponseDto comboGetLastMusicSubscriptionResponseDto = (ComboGetLastMusicSubscriptionResponseDto) obj;
        return this.status == comboGetLastMusicSubscriptionResponseDto.status && epx.f(this.subscription, comboGetLastMusicSubscriptionResponseDto.subscription);
    }

    public final int hashCode() {
        int hashCode = this.status.hashCode() * 31;
        ComboMusicSubscriptionInfoDto comboMusicSubscriptionInfoDto = this.subscription;
        return hashCode + (comboMusicSubscriptionInfoDto == null ? 0 : comboMusicSubscriptionInfoDto.hashCode());
    }

    public final String toString() {
        return "ComboGetLastMusicSubscriptionResponseDto(status=" + this.status + ", subscription=" + this.subscription + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.status.writeToParcel(parcel, i);
        ComboMusicSubscriptionInfoDto comboMusicSubscriptionInfoDto = this.subscription;
        if (comboMusicSubscriptionInfoDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            comboMusicSubscriptionInfoDto.writeToParcel(parcel, i);
        }
    }

    public /* synthetic */ ComboGetLastMusicSubscriptionResponseDto(StatusDto statusDto, ComboMusicSubscriptionInfoDto comboMusicSubscriptionInfoDto, int i, zcl zclVar) {
        this(statusDto, (i & 2) != 0 ? null : comboMusicSubscriptionInfoDto);
    }
}
