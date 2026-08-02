package com.vk.api.generated.ecosystem.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.zcl;
import xsna.zrp;

/* compiled from: EcosystemValidationInfoSmsinboxDto.kt */
/* loaded from: classes14.dex */
public final class EcosystemValidationInfoSmsinboxDto implements Parcelable {
    public static final Parcelable.Creator<EcosystemValidationInfoSmsinboxDto> CREATOR = new a();

    @pmi0("code")
    private final String code;

    @pmi0("message")
    private final String message;

    @pmi0("status")
    private final StatusDto status;

    @pmi0("type")
    private final TypeDto type;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: EcosystemValidationInfoSmsinboxDto.kt */
    public static final class StatusDto implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ StatusDto[] $VALUES;
        public static final Parcelable.Creator<StatusDto> CREATOR;

        @pmi0("4")
        public static final StatusDto ERROR;

        @pmi0("1")
        public static final StatusDto OK;

        @pmi0("0")
        public static final StatusDto WAITING;

        @pmi0("3")
        public static final StatusDto WRONG_PHONE;

        @pmi0("2")
        public static final StatusDto WRONG_TEXT;
        private final int value;

        /* compiled from: EcosystemValidationInfoSmsinboxDto.kt */
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
            StatusDto statusDto = new StatusDto("WAITING", 0, 0);
            WAITING = statusDto;
            StatusDto statusDto2 = new StatusDto("OK", 1, 1);
            OK = statusDto2;
            StatusDto statusDto3 = new StatusDto("WRONG_TEXT", 2, 2);
            WRONG_TEXT = statusDto3;
            StatusDto statusDto4 = new StatusDto("WRONG_PHONE", 3, 3);
            WRONG_PHONE = statusDto4;
            StatusDto statusDto5 = new StatusDto("ERROR", 4, 4);
            ERROR = statusDto5;
            StatusDto[] statusDtoArr = {statusDto, statusDto2, statusDto3, statusDto4, statusDto5};
            $VALUES = statusDtoArr;
            $ENTRIES = new asp(statusDtoArr);
            CREATOR = new a();
        }

        private StatusDto(String str, int i, int i2) {
            this.value = i2;
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

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: EcosystemValidationInfoSmsinboxDto.kt */
    public static final class TypeDto implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ TypeDto[] $VALUES;
        public static final Parcelable.Creator<TypeDto> CREATOR;

        @pmi0("smsinbox")
        public static final TypeDto SMSINBOX;
        private final String value;

        /* compiled from: EcosystemValidationInfoSmsinboxDto.kt */
        public static final class a implements Parcelable.Creator<TypeDto> {
            @Override // android.os.Parcelable.Creator
            public final TypeDto createFromParcel(Parcel parcel) {
                return TypeDto.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final TypeDto[] newArray(int i) {
                return new TypeDto[i];
            }
        }

        static {
            TypeDto typeDto = new TypeDto("SMSINBOX", 0, "smsinbox");
            SMSINBOX = typeDto;
            TypeDto[] typeDtoArr = {typeDto};
            $VALUES = typeDtoArr;
            $ENTRIES = new asp(typeDtoArr);
            CREATOR = new a();
        }

        private TypeDto(String str, int i, String str2) {
            this.value = str2;
        }

        public static TypeDto valueOf(String str) {
            return (TypeDto) Enum.valueOf(TypeDto.class, str);
        }

        public static TypeDto[] values() {
            return (TypeDto[]) $VALUES.clone();
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

    /* compiled from: EcosystemValidationInfoSmsinboxDto.kt */
    public static final class a implements Parcelable.Creator<EcosystemValidationInfoSmsinboxDto> {
        @Override // android.os.Parcelable.Creator
        public final EcosystemValidationInfoSmsinboxDto createFromParcel(Parcel parcel) {
            return new EcosystemValidationInfoSmsinboxDto(TypeDto.CREATOR.createFromParcel(parcel), StatusDto.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final EcosystemValidationInfoSmsinboxDto[] newArray(int i) {
            return new EcosystemValidationInfoSmsinboxDto[i];
        }
    }

    public EcosystemValidationInfoSmsinboxDto(TypeDto typeDto, StatusDto statusDto, String str, String str2) {
        this.type = typeDto;
        this.status = statusDto;
        this.message = str;
        this.code = str2;
    }

    public final String d() {
        return this.code;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final StatusDto e() {
        return this.status;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EcosystemValidationInfoSmsinboxDto)) {
            return false;
        }
        EcosystemValidationInfoSmsinboxDto ecosystemValidationInfoSmsinboxDto = (EcosystemValidationInfoSmsinboxDto) obj;
        return this.type == ecosystemValidationInfoSmsinboxDto.type && this.status == ecosystemValidationInfoSmsinboxDto.status && epx.f(this.message, ecosystemValidationInfoSmsinboxDto.message) && epx.f(this.code, ecosystemValidationInfoSmsinboxDto.code);
    }

    public final TypeDto f() {
        return this.type;
    }

    public final String getMessage() {
        return this.message;
    }

    public final int hashCode() {
        int hashCode = (this.status.hashCode() + (this.type.hashCode() * 31)) * 31;
        String str = this.message;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.code;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("EcosystemValidationInfoSmsinboxDto(type=");
        sb.append(this.type);
        sb.append(", status=");
        sb.append(this.status);
        sb.append(", message=");
        sb.append(this.message);
        sb.append(", code=");
        return ho8.a(sb, this.code, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.type.writeToParcel(parcel, i);
        this.status.writeToParcel(parcel, i);
        parcel.writeString(this.message);
        parcel.writeString(this.code);
    }

    public /* synthetic */ EcosystemValidationInfoSmsinboxDto(TypeDto typeDto, StatusDto statusDto, String str, String str2, int i, zcl zclVar) {
        this(typeDto, statusDto, (i & 4) != 0 ? null : str, (i & 8) != 0 ? null : str2);
    }
}
