package com.vk.api.generated.ecosystem.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.coremedia.iso.boxes.AuthorBox;
import com.ironsource.O6;
import xsna.asp;
import xsna.epx;
import xsna.pmi0;
import xsna.zrp;

/* compiled from: EcosystemCheckPasskeyResponseDto.kt */
/* loaded from: classes14.dex */
public final class EcosystemCheckPasskeyResponseDto implements Parcelable {
    public static final Parcelable.Creator<EcosystemCheckPasskeyResponseDto> CREATOR = new a();

    @pmi0("next_step")
    private final NextStepDto nextStep;

    @pmi0(O6.e1)
    private final String sid;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: EcosystemCheckPasskeyResponseDto.kt */
    public static final class NextStepDto implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ NextStepDto[] $VALUES;

        @pmi0(AuthorBox.TYPE)
        public static final NextStepDto AUTH;
        public static final Parcelable.Creator<NextStepDto> CREATOR;

        @pmi0("sms")
        public static final NextStepDto SMS;
        private final String value;

        /* compiled from: EcosystemCheckPasskeyResponseDto.kt */
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
            NextStepDto nextStepDto = new NextStepDto("AUTH", 0, AuthorBox.TYPE);
            AUTH = nextStepDto;
            NextStepDto nextStepDto2 = new NextStepDto("SMS", 1, "sms");
            SMS = nextStepDto2;
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

    /* compiled from: EcosystemCheckPasskeyResponseDto.kt */
    public static final class a implements Parcelable.Creator<EcosystemCheckPasskeyResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final EcosystemCheckPasskeyResponseDto createFromParcel(Parcel parcel) {
            return new EcosystemCheckPasskeyResponseDto(parcel.readString(), NextStepDto.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final EcosystemCheckPasskeyResponseDto[] newArray(int i) {
            return new EcosystemCheckPasskeyResponseDto[i];
        }
    }

    public EcosystemCheckPasskeyResponseDto(String str, NextStepDto nextStepDto) {
        this.sid = str;
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
        if (!(obj instanceof EcosystemCheckPasskeyResponseDto)) {
            return false;
        }
        EcosystemCheckPasskeyResponseDto ecosystemCheckPasskeyResponseDto = (EcosystemCheckPasskeyResponseDto) obj;
        return epx.f(this.sid, ecosystemCheckPasskeyResponseDto.sid) && this.nextStep == ecosystemCheckPasskeyResponseDto.nextStep;
    }

    public final int hashCode() {
        return this.nextStep.hashCode() + (this.sid.hashCode() * 31);
    }

    public final String toString() {
        return "EcosystemCheckPasskeyResponseDto(sid=" + this.sid + ", nextStep=" + this.nextStep + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.sid);
        this.nextStep.writeToParcel(parcel, i);
    }
}
