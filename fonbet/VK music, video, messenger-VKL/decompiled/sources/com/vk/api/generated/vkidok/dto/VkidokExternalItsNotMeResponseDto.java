package com.vk.api.generated.vkidok.dto;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;
import xsna.asp;
import xsna.epx;
import xsna.ms9;
import xsna.pmi0;
import xsna.zcl;
import xsna.zrp;

/* compiled from: VkidokExternalItsNotMeResponseDto.kt */
/* loaded from: classes15.dex */
public final class VkidokExternalItsNotMeResponseDto implements Parcelable {
    public static final Parcelable.Creator<VkidokExternalItsNotMeResponseDto> CREATOR = new a();

    @pmi0("next_step")
    private final NextStepDto nextStep;

    @pmi0("password_validation_rules")
    private final List<String> passwordValidationRules;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: VkidokExternalItsNotMeResponseDto.kt */
    public static final class NextStepDto implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ NextStepDto[] $VALUES;
        public static final Parcelable.Creator<NextStepDto> CREATOR;

        @pmi0("ok_mimicry_password")
        public static final NextStepDto OK_MIMICRY_PASSWORD;
        private final String value;

        /* compiled from: VkidokExternalItsNotMeResponseDto.kt */
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
            NextStepDto nextStepDto = new NextStepDto("OK_MIMICRY_PASSWORD", 0, "ok_mimicry_password");
            OK_MIMICRY_PASSWORD = nextStepDto;
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

    /* compiled from: VkidokExternalItsNotMeResponseDto.kt */
    public static final class a implements Parcelable.Creator<VkidokExternalItsNotMeResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final VkidokExternalItsNotMeResponseDto createFromParcel(Parcel parcel) {
            return new VkidokExternalItsNotMeResponseDto(NextStepDto.CREATOR.createFromParcel(parcel), parcel.createStringArrayList());
        }

        @Override // android.os.Parcelable.Creator
        public final VkidokExternalItsNotMeResponseDto[] newArray(int i) {
            return new VkidokExternalItsNotMeResponseDto[i];
        }
    }

    public VkidokExternalItsNotMeResponseDto(NextStepDto nextStepDto, List<String> list) {
        this.nextStep = nextStepDto;
        this.passwordValidationRules = list;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VkidokExternalItsNotMeResponseDto)) {
            return false;
        }
        VkidokExternalItsNotMeResponseDto vkidokExternalItsNotMeResponseDto = (VkidokExternalItsNotMeResponseDto) obj;
        return this.nextStep == vkidokExternalItsNotMeResponseDto.nextStep && epx.f(this.passwordValidationRules, vkidokExternalItsNotMeResponseDto.passwordValidationRules);
    }

    public final int hashCode() {
        int hashCode = this.nextStep.hashCode() * 31;
        List<String> list = this.passwordValidationRules;
        return hashCode + (list == null ? 0 : list.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VkidokExternalItsNotMeResponseDto(nextStep=");
        sb.append(this.nextStep);
        sb.append(", passwordValidationRules=");
        return ms9.a(')', sb, this.passwordValidationRules);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.nextStep.writeToParcel(parcel, i);
        parcel.writeStringList(this.passwordValidationRules);
    }

    public /* synthetic */ VkidokExternalItsNotMeResponseDto(NextStepDto nextStepDto, List list, int i, zcl zclVar) {
        this(nextStepDto, (i & 2) != 0 ? null : list);
    }
}
