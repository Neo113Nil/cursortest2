package com.vk.api.generated.vkidmail.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* compiled from: VkidmailCheckPasswordResponseDto.kt */
/* loaded from: classes15.dex */
public final class VkidmailCheckPasswordResponseDto implements Parcelable {
    public static final Parcelable.Creator<VkidmailCheckPasswordResponseDto> CREATOR = new a();

    @pmi0("next_step")
    private final NextStepDto nextStep;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: VkidmailCheckPasswordResponseDto.kt */
    public static final class NextStepDto implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ NextStepDto[] $VALUES;

        @pmi0("callreset")
        public static final NextStepDto CALLRESET;
        public static final Parcelable.Creator<NextStepDto> CREATOR;

        @pmi0("on_success_validation")
        public static final NextStepDto ON_SUCCESS_VALIDATION;

        @pmi0("restore")
        public static final NextStepDto RESTORE;

        @pmi0("sms")
        public static final NextStepDto SMS;
        private final String value;

        /* compiled from: VkidmailCheckPasswordResponseDto.kt */
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
            NextStepDto nextStepDto = new NextStepDto("ON_SUCCESS_VALIDATION", 0, "on_success_validation");
            ON_SUCCESS_VALIDATION = nextStepDto;
            NextStepDto nextStepDto2 = new NextStepDto("SMS", 1, "sms");
            SMS = nextStepDto2;
            NextStepDto nextStepDto3 = new NextStepDto("CALLRESET", 2, "callreset");
            CALLRESET = nextStepDto3;
            NextStepDto nextStepDto4 = new NextStepDto("RESTORE", 3, "restore");
            RESTORE = nextStepDto4;
            NextStepDto[] nextStepDtoArr = {nextStepDto, nextStepDto2, nextStepDto3, nextStepDto4};
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

    /* compiled from: VkidmailCheckPasswordResponseDto.kt */
    public static final class a implements Parcelable.Creator<VkidmailCheckPasswordResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final VkidmailCheckPasswordResponseDto createFromParcel(Parcel parcel) {
            return new VkidmailCheckPasswordResponseDto(NextStepDto.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final VkidmailCheckPasswordResponseDto[] newArray(int i) {
            return new VkidmailCheckPasswordResponseDto[i];
        }
    }

    public VkidmailCheckPasswordResponseDto(NextStepDto nextStepDto) {
        this.nextStep = nextStepDto;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof VkidmailCheckPasswordResponseDto) && this.nextStep == ((VkidmailCheckPasswordResponseDto) obj).nextStep;
    }

    public final int hashCode() {
        return this.nextStep.hashCode();
    }

    public final String toString() {
        return "VkidmailCheckPasswordResponseDto(nextStep=" + this.nextStep + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.nextStep.writeToParcel(parcel, i);
    }
}
