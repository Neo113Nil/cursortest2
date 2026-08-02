package com.vk.api.generated.vkidok.dto;

import android.os.Parcel;
import android.os.Parcelable;
import ru.ok.android.api.core.ApiLoginException;
import xsna.asp;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.zcl;
import xsna.zrp;

/* compiled from: VkidokExternalItsMeResponseDto.kt */
/* loaded from: classes15.dex */
public final class VkidokExternalItsMeResponseDto implements Parcelable {
    public static final Parcelable.Creator<VkidokExternalItsMeResponseDto> CREATOR = new a();

    @pmi0("next_step")
    private final NextStepDto nextStep;

    @pmi0(ApiLoginException.FIELD_REGISTRATION_TOKEN)
    private final String registrationToken;

    @pmi0("sat")
    private final String sat;

    @pmi0("silent_token")
    private final String silentToken;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: VkidokExternalItsMeResponseDto.kt */
    public static final class NextStepDto implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ NextStepDto[] $VALUES;
        public static final Parcelable.Creator<NextStepDto> CREATOR;

        @pmi0("ok_mimicry_restore")
        public static final NextStepDto OK_MIMICRY_RESTORE;
        private final String value;

        /* compiled from: VkidokExternalItsMeResponseDto.kt */
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
            NextStepDto nextStepDto = new NextStepDto("OK_MIMICRY_RESTORE", 0, "ok_mimicry_restore");
            OK_MIMICRY_RESTORE = nextStepDto;
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

    /* compiled from: VkidokExternalItsMeResponseDto.kt */
    public static final class a implements Parcelable.Creator<VkidokExternalItsMeResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final VkidokExternalItsMeResponseDto createFromParcel(Parcel parcel) {
            return new VkidokExternalItsMeResponseDto(NextStepDto.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final VkidokExternalItsMeResponseDto[] newArray(int i) {
            return new VkidokExternalItsMeResponseDto[i];
        }
    }

    public VkidokExternalItsMeResponseDto(NextStepDto nextStepDto, String str, String str2, String str3) {
        this.nextStep = nextStepDto;
        this.sat = str;
        this.silentToken = str2;
        this.registrationToken = str3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VkidokExternalItsMeResponseDto)) {
            return false;
        }
        VkidokExternalItsMeResponseDto vkidokExternalItsMeResponseDto = (VkidokExternalItsMeResponseDto) obj;
        return this.nextStep == vkidokExternalItsMeResponseDto.nextStep && epx.f(this.sat, vkidokExternalItsMeResponseDto.sat) && epx.f(this.silentToken, vkidokExternalItsMeResponseDto.silentToken) && epx.f(this.registrationToken, vkidokExternalItsMeResponseDto.registrationToken);
    }

    public final int hashCode() {
        int hashCode = this.nextStep.hashCode() * 31;
        String str = this.sat;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.silentToken;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.registrationToken;
        return hashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VkidokExternalItsMeResponseDto(nextStep=");
        sb.append(this.nextStep);
        sb.append(", sat=");
        sb.append(this.sat);
        sb.append(", silentToken=");
        sb.append(this.silentToken);
        sb.append(", registrationToken=");
        return ho8.a(sb, this.registrationToken, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.nextStep.writeToParcel(parcel, i);
        parcel.writeString(this.sat);
        parcel.writeString(this.silentToken);
        parcel.writeString(this.registrationToken);
    }

    public /* synthetic */ VkidokExternalItsMeResponseDto(NextStepDto nextStepDto, String str, String str2, String str3, int i, zcl zclVar) {
        this(nextStepDto, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3);
    }
}
