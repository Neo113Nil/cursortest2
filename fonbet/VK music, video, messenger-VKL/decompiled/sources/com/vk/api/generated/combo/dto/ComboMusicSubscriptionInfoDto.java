package com.vk.api.generated.combo.dto;

import android.os.Parcel;
import android.os.Parcelable;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.asp;
import xsna.pmi0;
import xsna.vu5;
import xsna.zrp;

/* compiled from: ComboMusicSubscriptionInfoDto.kt */
/* loaded from: classes14.dex */
public final class ComboMusicSubscriptionInfoDto implements Parcelable {
    public static final Parcelable.Creator<ComboMusicSubscriptionInfoDto> CREATOR = new a();

    @pmi0("expires_date")
    private final int expiresDate;

    @pmi0("status")
    private final StatusDto status;

    @pmi0("vk_subscription_id")
    private final int vkSubscriptionId;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ComboMusicSubscriptionInfoDto.kt */
    public static final class StatusDto implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ StatusDto[] $VALUES;

        @pmi0(SignalingProtocol.KEY_ACTIVE)
        public static final StatusDto ACTIVE;

        @pmi0("cancelled")
        public static final StatusDto CANCELLED;
        public static final Parcelable.Creator<StatusDto> CREATOR;

        @pmi0("suspended")
        public static final StatusDto SUSPENDED;
        private final String value;

        /* compiled from: ComboMusicSubscriptionInfoDto.kt */
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
            StatusDto statusDto = new StatusDto(SignalingProtocol.STATE_ACTIVE, 0, SignalingProtocol.KEY_ACTIVE);
            ACTIVE = statusDto;
            StatusDto statusDto2 = new StatusDto("SUSPENDED", 1, "suspended");
            SUSPENDED = statusDto2;
            StatusDto statusDto3 = new StatusDto("CANCELLED", 2, "cancelled");
            CANCELLED = statusDto3;
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

    /* compiled from: ComboMusicSubscriptionInfoDto.kt */
    public static final class a implements Parcelable.Creator<ComboMusicSubscriptionInfoDto> {
        @Override // android.os.Parcelable.Creator
        public final ComboMusicSubscriptionInfoDto createFromParcel(Parcel parcel) {
            return new ComboMusicSubscriptionInfoDto(parcel.readInt(), StatusDto.CREATOR.createFromParcel(parcel), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final ComboMusicSubscriptionInfoDto[] newArray(int i) {
            return new ComboMusicSubscriptionInfoDto[i];
        }
    }

    public ComboMusicSubscriptionInfoDto(int i, StatusDto statusDto, int i2) {
        this.vkSubscriptionId = i;
        this.status = statusDto;
        this.expiresDate = i2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ComboMusicSubscriptionInfoDto)) {
            return false;
        }
        ComboMusicSubscriptionInfoDto comboMusicSubscriptionInfoDto = (ComboMusicSubscriptionInfoDto) obj;
        return this.vkSubscriptionId == comboMusicSubscriptionInfoDto.vkSubscriptionId && this.status == comboMusicSubscriptionInfoDto.status && this.expiresDate == comboMusicSubscriptionInfoDto.expiresDate;
    }

    public final int hashCode() {
        return Integer.hashCode(this.expiresDate) + ((this.status.hashCode() + (Integer.hashCode(this.vkSubscriptionId) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ComboMusicSubscriptionInfoDto(vkSubscriptionId=");
        sb.append(this.vkSubscriptionId);
        sb.append(", status=");
        sb.append(this.status);
        sb.append(", expiresDate=");
        return vu5.b(sb, this.expiresDate, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.vkSubscriptionId);
        this.status.writeToParcel(parcel, i);
        parcel.writeInt(this.expiresDate);
    }
}
