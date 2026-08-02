package com.vk.api.generated.vkRun.dto;

import android.os.Parcel;
import android.os.Parcelable;
import io.reactivex.rxjava3.subjects.b;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.asp;
import xsna.epx;
import xsna.nr;
import xsna.pmi0;
import xsna.shy;
import xsna.uqi;
import xsna.zcl;
import xsna.zrp;

/* compiled from: VkRunUserSeasonProgressInfoDto.kt */
/* loaded from: classes15.dex */
public final class VkRunUserSeasonProgressInfoDto implements Parcelable {
    public static final Parcelable.Creator<VkRunUserSeasonProgressInfoDto> CREATOR = new a();

    @pmi0("joined_at")
    private final String joinedAt;

    @pmi0("level")
    private final float level;

    @pmi0("status")
    private final StatusDto status;

    @pmi0("total_coins")
    private final Integer totalCoins;

    @pmi0("total_steps")
    private final int totalSteps;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: VkRunUserSeasonProgressInfoDto.kt */
    public static final class StatusDto implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ StatusDto[] $VALUES;

        @pmi0(SignalingProtocol.KEY_ACTIVE)
        public static final StatusDto ACTIVE;
        public static final Parcelable.Creator<StatusDto> CREATOR;

        @pmi0("finished")
        public static final StatusDto FINISHED;

        @pmi0("not_member")
        public static final StatusDto NOT_MEMBER;

        @pmi0("waiting_for_results")
        public static final StatusDto WAITING_FOR_RESULTS;
        private final String value;

        /* compiled from: VkRunUserSeasonProgressInfoDto.kt */
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
            StatusDto statusDto = new StatusDto("NOT_MEMBER", 0, "not_member");
            NOT_MEMBER = statusDto;
            StatusDto statusDto2 = new StatusDto(SignalingProtocol.STATE_ACTIVE, 1, SignalingProtocol.KEY_ACTIVE);
            ACTIVE = statusDto2;
            StatusDto statusDto3 = new StatusDto("WAITING_FOR_RESULTS", 2, "waiting_for_results");
            WAITING_FOR_RESULTS = statusDto3;
            StatusDto statusDto4 = new StatusDto("FINISHED", 3, "finished");
            FINISHED = statusDto4;
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

    /* compiled from: VkRunUserSeasonProgressInfoDto.kt */
    public static final class a implements Parcelable.Creator<VkRunUserSeasonProgressInfoDto> {
        @Override // android.os.Parcelable.Creator
        public final VkRunUserSeasonProgressInfoDto createFromParcel(Parcel parcel) {
            return new VkRunUserSeasonProgressInfoDto(StatusDto.CREATOR.createFromParcel(parcel), parcel.readInt(), parcel.readFloat(), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
        }

        @Override // android.os.Parcelable.Creator
        public final VkRunUserSeasonProgressInfoDto[] newArray(int i) {
            return new VkRunUserSeasonProgressInfoDto[i];
        }
    }

    public VkRunUserSeasonProgressInfoDto(StatusDto statusDto, int i, float f, String str, Integer num) {
        this.status = statusDto;
        this.totalSteps = i;
        this.level = f;
        this.joinedAt = str;
        this.totalCoins = num;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VkRunUserSeasonProgressInfoDto)) {
            return false;
        }
        VkRunUserSeasonProgressInfoDto vkRunUserSeasonProgressInfoDto = (VkRunUserSeasonProgressInfoDto) obj;
        return this.status == vkRunUserSeasonProgressInfoDto.status && this.totalSteps == vkRunUserSeasonProgressInfoDto.totalSteps && Float.compare(this.level, vkRunUserSeasonProgressInfoDto.level) == 0 && epx.f(this.joinedAt, vkRunUserSeasonProgressInfoDto.joinedAt) && epx.f(this.totalCoins, vkRunUserSeasonProgressInfoDto.totalCoins);
    }

    public final int hashCode() {
        int a2 = b.a(this.level, shy.a(this.totalSteps, this.status.hashCode() * 31, 31), 31);
        String str = this.joinedAt;
        int hashCode = (a2 + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.totalCoins;
        return hashCode + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VkRunUserSeasonProgressInfoDto(status=");
        sb.append(this.status);
        sb.append(", totalSteps=");
        sb.append(this.totalSteps);
        sb.append(", level=");
        sb.append(this.level);
        sb.append(", joinedAt=");
        sb.append(this.joinedAt);
        sb.append(", totalCoins=");
        return uqi.b(sb, this.totalCoins, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.status.writeToParcel(parcel, i);
        parcel.writeInt(this.totalSteps);
        parcel.writeFloat(this.level);
        parcel.writeString(this.joinedAt);
        Integer num = this.totalCoins;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
    }

    public /* synthetic */ VkRunUserSeasonProgressInfoDto(StatusDto statusDto, int i, float f, String str, Integer num, int i2, zcl zclVar) {
        this(statusDto, i, f, (i2 & 8) != 0 ? null : str, (i2 & 16) != 0 ? null : num);
    }
}
