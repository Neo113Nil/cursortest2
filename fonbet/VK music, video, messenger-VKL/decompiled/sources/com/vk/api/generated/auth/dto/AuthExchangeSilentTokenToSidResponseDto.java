package com.vk.api.generated.auth.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.ironsource.O6;
import xsna.asp;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.zcl;
import xsna.zrp;

/* compiled from: AuthExchangeSilentTokenToSidResponseDto.kt */
/* loaded from: classes14.dex */
public final class AuthExchangeSilentTokenToSidResponseDto implements Parcelable {
    public static final Parcelable.Creator<AuthExchangeSilentTokenToSidResponseDto> CREATOR = new a();

    @pmi0("next_step")
    private final NextStepDto nextStep;

    @pmi0(O6.e1)
    private final String sid;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: AuthExchangeSilentTokenToSidResponseDto.kt */
    public static final class NextStepDto implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ NextStepDto[] $VALUES;
        public static final Parcelable.Creator<NextStepDto> CREATOR;

        @pmi0("ok_mimicry_need_validation")
        public static final NextStepDto OK_MIMICRY_NEED_VALIDATION;

        @pmi0("on_success_validation")
        public static final NextStepDto ON_SUCCESS_VALIDATION;
        private final String value;

        /* compiled from: AuthExchangeSilentTokenToSidResponseDto.kt */
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
            NextStepDto nextStepDto2 = new NextStepDto("OK_MIMICRY_NEED_VALIDATION", 1, "ok_mimicry_need_validation");
            OK_MIMICRY_NEED_VALIDATION = nextStepDto2;
            NextStepDto[] nextStepDtoArr = {nextStepDto, nextStepDto2};
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

    /* compiled from: AuthExchangeSilentTokenToSidResponseDto.kt */
    public static final class a implements Parcelable.Creator<AuthExchangeSilentTokenToSidResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final AuthExchangeSilentTokenToSidResponseDto createFromParcel(Parcel parcel) {
            return new AuthExchangeSilentTokenToSidResponseDto(NextStepDto.CREATOR.createFromParcel(parcel), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final AuthExchangeSilentTokenToSidResponseDto[] newArray(int i) {
            return new AuthExchangeSilentTokenToSidResponseDto[i];
        }
    }

    public AuthExchangeSilentTokenToSidResponseDto(NextStepDto nextStepDto, String str) {
        this.nextStep = nextStepDto;
        this.sid = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AuthExchangeSilentTokenToSidResponseDto)) {
            return false;
        }
        AuthExchangeSilentTokenToSidResponseDto authExchangeSilentTokenToSidResponseDto = (AuthExchangeSilentTokenToSidResponseDto) obj;
        return this.nextStep == authExchangeSilentTokenToSidResponseDto.nextStep && epx.f(this.sid, authExchangeSilentTokenToSidResponseDto.sid);
    }

    public final int hashCode() {
        int hashCode = this.nextStep.hashCode() * 31;
        String str = this.sid;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AuthExchangeSilentTokenToSidResponseDto(nextStep=");
        sb.append(this.nextStep);
        sb.append(", sid=");
        return ho8.a(sb, this.sid, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.nextStep.writeToParcel(parcel, i);
        parcel.writeString(this.sid);
    }

    public /* synthetic */ AuthExchangeSilentTokenToSidResponseDto(NextStepDto nextStepDto, String str, int i, zcl zclVar) {
        this(nextStepDto, (i & 2) != 0 ? null : str);
    }
}
