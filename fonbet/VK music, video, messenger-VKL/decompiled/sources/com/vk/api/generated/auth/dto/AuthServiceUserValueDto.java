package com.vk.api.generated.auth.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.zrp;

/* compiled from: AuthServiceUserValueDto.kt */
/* loaded from: classes14.dex */
public final class AuthServiceUserValueDto implements Parcelable {
    public static final Parcelable.Creator<AuthServiceUserValueDto> CREATOR = new a();

    @pmi0("type")
    private final TypeDto type;

    @pmi0("value")
    private final String value;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: AuthServiceUserValueDto.kt */
    public static final class TypeDto implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ TypeDto[] $VALUES;
        public static final Parcelable.Creator<TypeDto> CREATOR;

        @pmi0("first_name")
        public static final TypeDto FIRST_NAME;

        @pmi0("last_name")
        public static final TypeDto LAST_NAME;
        private final String value;

        /* compiled from: AuthServiceUserValueDto.kt */
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
            TypeDto typeDto = new TypeDto("FIRST_NAME", 0, "first_name");
            FIRST_NAME = typeDto;
            TypeDto typeDto2 = new TypeDto("LAST_NAME", 1, "last_name");
            LAST_NAME = typeDto2;
            TypeDto[] typeDtoArr = {typeDto, typeDto2};
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

    /* compiled from: AuthServiceUserValueDto.kt */
    public static final class a implements Parcelable.Creator<AuthServiceUserValueDto> {
        @Override // android.os.Parcelable.Creator
        public final AuthServiceUserValueDto createFromParcel(Parcel parcel) {
            return new AuthServiceUserValueDto(TypeDto.CREATOR.createFromParcel(parcel), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final AuthServiceUserValueDto[] newArray(int i) {
            return new AuthServiceUserValueDto[i];
        }
    }

    public AuthServiceUserValueDto(TypeDto typeDto, String str) {
        this.type = typeDto;
        this.value = str;
    }

    public final TypeDto d() {
        return this.type;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String e() {
        return this.value;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AuthServiceUserValueDto)) {
            return false;
        }
        AuthServiceUserValueDto authServiceUserValueDto = (AuthServiceUserValueDto) obj;
        return this.type == authServiceUserValueDto.type && epx.f(this.value, authServiceUserValueDto.value);
    }

    public final int hashCode() {
        return this.value.hashCode() + (this.type.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AuthServiceUserValueDto(type=");
        sb.append(this.type);
        sb.append(", value=");
        return ho8.a(sb, this.value, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.type.writeToParcel(parcel, i);
        parcel.writeString(this.value);
    }
}
