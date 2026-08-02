package com.vk.api.generated.vkidok.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.dto.common.id.UserId;
import xsna.asp;
import xsna.epx;
import xsna.gp;
import xsna.nr;
import xsna.pmi0;
import xsna.urd0;
import xsna.zcl;
import xsna.zrp;

/* compiled from: VkidokCheckPersonalInfoResponseDto.kt */
/* loaded from: classes15.dex */
public final class VkidokCheckPersonalInfoResponseDto implements Parcelable {
    public static final Parcelable.Creator<VkidokCheckPersonalInfoResponseDto> CREATOR = new a();

    @pmi0("next_step")
    private final NextStepDto nextStep;

    @pmi0("ok_state")
    private final String okState;

    @pmi0("silent_token")
    private final String silentToken;

    @pmi0("ttl")
    private final Integer ttl;

    @pmi0("user_id")
    private final UserId userId;

    @pmi0("uuid")
    private final String uuid;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: VkidokCheckPersonalInfoResponseDto.kt */
    public static final class NextStepDto implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ NextStepDto[] $VALUES;
        public static final Parcelable.Creator<NextStepDto> CREATOR;

        @pmi0("ok_mimicry_registration_success")
        public static final NextStepDto OK_MIMICRY_REGISTRATION_SUCCESS;
        private final String value;

        /* compiled from: VkidokCheckPersonalInfoResponseDto.kt */
        public static final class a implements Parcelable.Creator<NextStepDto> {
            @Override // android.os.Parcelable.Creator
            public final NextStepDto createFromParcel(Parcel parcel) {
                return NextStepDto.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final NextStepDto[] newArray(int i) {
                return new NextStepDto[i];
            }
        }

        static {
            NextStepDto nextStepDto = new NextStepDto("OK_MIMICRY_REGISTRATION_SUCCESS", 0, "ok_mimicry_registration_success");
            OK_MIMICRY_REGISTRATION_SUCCESS = nextStepDto;
            NextStepDto[] nextStepDtoArr = {nextStepDto};
            $VALUES = nextStepDtoArr;
            $ENTRIES = new asp(nextStepDtoArr);
            CREATOR = new a();
        }

        private NextStepDto(String str, int i, String str2) {
            this.value = str2;
        }

        public static NextStepDto valueOf(String str) {
            return (NextStepDto) Enum.valueOf(NextStepDto.class, str);
        }

        public static NextStepDto[] values() {
            return (NextStepDto[]) $VALUES.clone();
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

    /* compiled from: VkidokCheckPersonalInfoResponseDto.kt */
    public static final class a implements Parcelable.Creator<VkidokCheckPersonalInfoResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final VkidokCheckPersonalInfoResponseDto createFromParcel(Parcel parcel) {
            return new VkidokCheckPersonalInfoResponseDto(NextStepDto.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString(), (UserId) parcel.readParcelable(VkidokCheckPersonalInfoResponseDto.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final VkidokCheckPersonalInfoResponseDto[] newArray(int i) {
            return new VkidokCheckPersonalInfoResponseDto[i];
        }
    }

    public VkidokCheckPersonalInfoResponseDto(NextStepDto nextStepDto, String str, String str2, Integer num, String str3, UserId userId) {
        this.nextStep = nextStepDto;
        this.silentToken = str;
        this.uuid = str2;
        this.ttl = num;
        this.okState = str3;
        this.userId = userId;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VkidokCheckPersonalInfoResponseDto)) {
            return false;
        }
        VkidokCheckPersonalInfoResponseDto vkidokCheckPersonalInfoResponseDto = (VkidokCheckPersonalInfoResponseDto) obj;
        return this.nextStep == vkidokCheckPersonalInfoResponseDto.nextStep && epx.f(this.silentToken, vkidokCheckPersonalInfoResponseDto.silentToken) && epx.f(this.uuid, vkidokCheckPersonalInfoResponseDto.uuid) && epx.f(this.ttl, vkidokCheckPersonalInfoResponseDto.ttl) && epx.f(this.okState, vkidokCheckPersonalInfoResponseDto.okState) && epx.f(this.userId, vkidokCheckPersonalInfoResponseDto.userId);
    }

    public final int hashCode() {
        int a2 = urd0.a(this.nextStep.hashCode() * 31, 31, this.silentToken);
        String str = this.uuid;
        int hashCode = (a2 + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.ttl;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str2 = this.okState;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        UserId userId = this.userId;
        return hashCode3 + (userId != null ? Long.hashCode(userId.b) : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VkidokCheckPersonalInfoResponseDto(nextStep=");
        sb.append(this.nextStep);
        sb.append(", silentToken=");
        sb.append(this.silentToken);
        sb.append(", uuid=");
        sb.append(this.uuid);
        sb.append(", ttl=");
        sb.append(this.ttl);
        sb.append(", okState=");
        sb.append(this.okState);
        sb.append(", userId=");
        return gp.b(sb, this.userId, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.nextStep.writeToParcel(parcel, i);
        parcel.writeString(this.silentToken);
        parcel.writeString(this.uuid);
        Integer num = this.ttl;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
        parcel.writeString(this.okState);
        parcel.writeParcelable(this.userId, i);
    }

    public /* synthetic */ VkidokCheckPersonalInfoResponseDto(NextStepDto nextStepDto, String str, String str2, Integer num, String str3, UserId userId, int i, zcl zclVar) {
        this(nextStepDto, str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : num, (i & 16) != 0 ? null : str3, (i & 32) != 0 ? null : userId);
    }
}
