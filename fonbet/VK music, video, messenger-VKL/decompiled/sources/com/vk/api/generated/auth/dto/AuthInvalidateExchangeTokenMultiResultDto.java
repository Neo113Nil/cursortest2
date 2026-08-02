package com.vk.api.generated.auth.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.internal.bind.TreeTypeAdapter;
import xsna.a9y;
import xsna.asp;
import xsna.b9y;
import xsna.epx;
import xsna.go9;
import xsna.pmi0;
import xsna.up;
import xsna.urd0;
import xsna.z8y;
import xsna.zcl;
import xsna.zrp;

/* compiled from: AuthInvalidateExchangeTokenMultiResultDto.kt */
/* loaded from: classes.dex */
public abstract class AuthInvalidateExchangeTokenMultiResultDto implements Parcelable {

    /* compiled from: AuthInvalidateExchangeTokenMultiResultDto.kt */
    /* loaded from: classes14.dex */
    public static final class AuthInvalidateExchangeTokenMultiResultErrorDto extends AuthInvalidateExchangeTokenMultiResultDto implements Parcelable {
        public static final Parcelable.Creator<AuthInvalidateExchangeTokenMultiResultErrorDto> CREATOR = new a();

        @pmi0("error")
        private final String error;

        @pmi0("error_code")
        private final ErrorCodeDto errorCode;

        @pmi0("type")
        private final TypeDto type;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: AuthInvalidateExchangeTokenMultiResultDto.kt */
        public static final class ErrorCodeDto implements Parcelable {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ ErrorCodeDto[] $VALUES;
            public static final Parcelable.Creator<ErrorCodeDto> CREATOR;

            @pmi0("internal_error")
            public static final ErrorCodeDto INTERNAL_ERROR;

            @pmi0("invalid_token")
            public static final ErrorCodeDto INVALID_TOKEN;
            private final String value;

            /* compiled from: AuthInvalidateExchangeTokenMultiResultDto.kt */
            public static final class a implements Parcelable.Creator<ErrorCodeDto> {
                @Override // android.os.Parcelable.Creator
                public final ErrorCodeDto createFromParcel(Parcel parcel) {
                    return ErrorCodeDto.valueOf(parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final ErrorCodeDto[] newArray(int i) {
                    return new ErrorCodeDto[i];
                }
            }

            static {
                ErrorCodeDto errorCodeDto = new ErrorCodeDto("INTERNAL_ERROR", 0, "internal_error");
                INTERNAL_ERROR = errorCodeDto;
                ErrorCodeDto errorCodeDto2 = new ErrorCodeDto("INVALID_TOKEN", 1, "invalid_token");
                INVALID_TOKEN = errorCodeDto2;
                ErrorCodeDto[] errorCodeDtoArr = {errorCodeDto, errorCodeDto2};
                $VALUES = errorCodeDtoArr;
                $ENTRIES = new asp(errorCodeDtoArr);
                CREATOR = new a();
            }

            private ErrorCodeDto(String str, int i, String str2) {
                this.value = str2;
            }

            public static ErrorCodeDto valueOf(String str) {
                return (ErrorCodeDto) Enum.valueOf(ErrorCodeDto.class, str);
            }

            public static ErrorCodeDto[] values() {
                return (ErrorCodeDto[]) $VALUES.clone();
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
        /* compiled from: AuthInvalidateExchangeTokenMultiResultDto.kt */
        public static final class TypeDto implements Parcelable {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ TypeDto[] $VALUES;
            public static final Parcelable.Creator<TypeDto> CREATOR;

            @pmi0("error")
            public static final TypeDto ERROR;
            private final String value;

            /* compiled from: AuthInvalidateExchangeTokenMultiResultDto.kt */
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
                TypeDto typeDto = new TypeDto("ERROR", 0, "error");
                ERROR = typeDto;
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

        /* compiled from: AuthInvalidateExchangeTokenMultiResultDto.kt */
        public static final class a implements Parcelable.Creator<AuthInvalidateExchangeTokenMultiResultErrorDto> {
            @Override // android.os.Parcelable.Creator
            public final AuthInvalidateExchangeTokenMultiResultErrorDto createFromParcel(Parcel parcel) {
                return new AuthInvalidateExchangeTokenMultiResultErrorDto(TypeDto.CREATOR.createFromParcel(parcel), parcel.readString(), ErrorCodeDto.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final AuthInvalidateExchangeTokenMultiResultErrorDto[] newArray(int i) {
                return new AuthInvalidateExchangeTokenMultiResultErrorDto[i];
            }
        }

        public AuthInvalidateExchangeTokenMultiResultErrorDto(TypeDto typeDto, String str, ErrorCodeDto errorCodeDto) {
            super(null);
            this.type = typeDto;
            this.error = str;
            this.errorCode = errorCodeDto;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AuthInvalidateExchangeTokenMultiResultErrorDto)) {
                return false;
            }
            AuthInvalidateExchangeTokenMultiResultErrorDto authInvalidateExchangeTokenMultiResultErrorDto = (AuthInvalidateExchangeTokenMultiResultErrorDto) obj;
            return this.type == authInvalidateExchangeTokenMultiResultErrorDto.type && epx.f(this.error, authInvalidateExchangeTokenMultiResultErrorDto.error) && this.errorCode == authInvalidateExchangeTokenMultiResultErrorDto.errorCode;
        }

        public final int hashCode() {
            return this.errorCode.hashCode() + urd0.a(this.type.hashCode() * 31, 31, this.error);
        }

        public final String toString() {
            return "AuthInvalidateExchangeTokenMultiResultErrorDto(type=" + this.type + ", error=" + this.error + ", errorCode=" + this.errorCode + ')';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            this.type.writeToParcel(parcel, i);
            parcel.writeString(this.error);
            this.errorCode.writeToParcel(parcel, i);
        }
    }

    /* compiled from: AuthInvalidateExchangeTokenMultiResultDto.kt */
    /* loaded from: classes14.dex */
    public static final class AuthInvalidateExchangeTokenMultiResultSuccessDto extends AuthInvalidateExchangeTokenMultiResultDto implements Parcelable {
        public static final Parcelable.Creator<AuthInvalidateExchangeTokenMultiResultSuccessDto> CREATOR = new a();

        @pmi0("type")
        private final TypeDto type;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: AuthInvalidateExchangeTokenMultiResultDto.kt */
        public static final class TypeDto implements Parcelable {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ TypeDto[] $VALUES;
            public static final Parcelable.Creator<TypeDto> CREATOR;

            @pmi0("success")
            public static final TypeDto SUCCESS;
            private final String value;

            /* compiled from: AuthInvalidateExchangeTokenMultiResultDto.kt */
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
                TypeDto typeDto = new TypeDto("SUCCESS", 0, "success");
                SUCCESS = typeDto;
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

        /* compiled from: AuthInvalidateExchangeTokenMultiResultDto.kt */
        public static final class a implements Parcelable.Creator<AuthInvalidateExchangeTokenMultiResultSuccessDto> {
            @Override // android.os.Parcelable.Creator
            public final AuthInvalidateExchangeTokenMultiResultSuccessDto createFromParcel(Parcel parcel) {
                return new AuthInvalidateExchangeTokenMultiResultSuccessDto(TypeDto.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final AuthInvalidateExchangeTokenMultiResultSuccessDto[] newArray(int i) {
                return new AuthInvalidateExchangeTokenMultiResultSuccessDto[i];
            }
        }

        public AuthInvalidateExchangeTokenMultiResultSuccessDto(TypeDto typeDto) {
            super(null);
            this.type = typeDto;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof AuthInvalidateExchangeTokenMultiResultSuccessDto) && this.type == ((AuthInvalidateExchangeTokenMultiResultSuccessDto) obj).type;
        }

        public final int hashCode() {
            return this.type.hashCode();
        }

        public final String toString() {
            return "AuthInvalidateExchangeTokenMultiResultSuccessDto(type=" + this.type + ')';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            this.type.writeToParcel(parcel, i);
        }
    }

    /* compiled from: AuthInvalidateExchangeTokenMultiResultDto.kt */
    public static final class Deserializer implements a9y<AuthInvalidateExchangeTokenMultiResultDto> {
        @Override // xsna.a9y
        public final Object a(b9y b9yVar, z8y z8yVar) {
            String f = up.f(b9yVar, "type");
            if (epx.f(f, "success")) {
                return (AuthInvalidateExchangeTokenMultiResultDto) ((TreeTypeAdapter.a) z8yVar).a(b9yVar, AuthInvalidateExchangeTokenMultiResultSuccessDto.class);
            }
            if (epx.f(f, "error")) {
                return (AuthInvalidateExchangeTokenMultiResultDto) ((TreeTypeAdapter.a) z8yVar).a(b9yVar, AuthInvalidateExchangeTokenMultiResultErrorDto.class);
            }
            throw new IllegalStateException(go9.b("no mapping for the type:", f));
        }
    }

    public /* synthetic */ AuthInvalidateExchangeTokenMultiResultDto(zcl zclVar) {
        this();
    }

    private AuthInvalidateExchangeTokenMultiResultDto() {
    }
}
