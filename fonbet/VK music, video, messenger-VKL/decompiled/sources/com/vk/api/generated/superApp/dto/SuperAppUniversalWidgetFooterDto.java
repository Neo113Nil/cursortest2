package com.vk.api.generated.superApp.dto;

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
import xsna.z8y;
import xsna.zcl;
import xsna.zrp;

/* compiled from: SuperAppUniversalWidgetFooterDto.kt */
/* loaded from: classes.dex */
public abstract class SuperAppUniversalWidgetFooterDto implements Parcelable {

    /* compiled from: SuperAppUniversalWidgetFooterDto.kt */
    public static final class Deserializer implements a9y<SuperAppUniversalWidgetFooterDto> {
        @Override // xsna.a9y
        public final Object a(b9y b9yVar, z8y z8yVar) {
            String f = up.f(b9yVar, "type");
            if (f != null) {
                int hashCode = f.hashCode();
                if (hashCode != -2026357524) {
                    if (hashCode != 1703237703) {
                        if (hashCode == 1934806292 && f.equals("user_stack")) {
                            return (SuperAppUniversalWidgetFooterDto) ((TreeTypeAdapter.a) z8yVar).a(b9yVar, SuperAppUniversalWidgetFooterUserStackDto.class);
                        }
                    } else if (f.equals("accent_button")) {
                        return (SuperAppUniversalWidgetFooterDto) ((TreeTypeAdapter.a) z8yVar).a(b9yVar, SuperAppUniversalWidgetFooterAccentButtonDto.class);
                    }
                } else if (f.equals("text_and_button")) {
                    return (SuperAppUniversalWidgetFooterDto) ((TreeTypeAdapter.a) z8yVar).a(b9yVar, SuperAppUniversalWidgetFooterTextAndButtonDto.class);
                }
            }
            throw new IllegalStateException(go9.b("no mapping for the type:", f));
        }
    }

    /* compiled from: SuperAppUniversalWidgetFooterDto.kt */
    /* loaded from: classes15.dex */
    public static final class SuperAppUniversalWidgetFooterAccentButtonDto extends SuperAppUniversalWidgetFooterDto implements Parcelable {
        public static final Parcelable.Creator<SuperAppUniversalWidgetFooterAccentButtonDto> CREATOR = new a();

        @pmi0("payload")
        private final SuperAppUniversalWidgetFooterAccentButtonPayloadDto payload;

        @pmi0("type")
        private final TypeDto type;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: SuperAppUniversalWidgetFooterDto.kt */
        public static final class TypeDto implements Parcelable {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ TypeDto[] $VALUES;

            @pmi0("accent_button")
            public static final TypeDto ACCENT_BUTTON;
            public static final Parcelable.Creator<TypeDto> CREATOR;
            private final String value;

            /* compiled from: SuperAppUniversalWidgetFooterDto.kt */
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
                TypeDto typeDto = new TypeDto("ACCENT_BUTTON", 0, "accent_button");
                ACCENT_BUTTON = typeDto;
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

        /* compiled from: SuperAppUniversalWidgetFooterDto.kt */
        public static final class a implements Parcelable.Creator<SuperAppUniversalWidgetFooterAccentButtonDto> {
            @Override // android.os.Parcelable.Creator
            public final SuperAppUniversalWidgetFooterAccentButtonDto createFromParcel(Parcel parcel) {
                return new SuperAppUniversalWidgetFooterAccentButtonDto(parcel.readInt() == 0 ? null : TypeDto.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? SuperAppUniversalWidgetFooterAccentButtonPayloadDto.CREATOR.createFromParcel(parcel) : null);
            }

            @Override // android.os.Parcelable.Creator
            public final SuperAppUniversalWidgetFooterAccentButtonDto[] newArray(int i) {
                return new SuperAppUniversalWidgetFooterAccentButtonDto[i];
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public SuperAppUniversalWidgetFooterAccentButtonDto() {
            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SuperAppUniversalWidgetFooterAccentButtonDto)) {
                return false;
            }
            SuperAppUniversalWidgetFooterAccentButtonDto superAppUniversalWidgetFooterAccentButtonDto = (SuperAppUniversalWidgetFooterAccentButtonDto) obj;
            return this.type == superAppUniversalWidgetFooterAccentButtonDto.type && epx.f(this.payload, superAppUniversalWidgetFooterAccentButtonDto.payload);
        }

        public final int hashCode() {
            TypeDto typeDto = this.type;
            int hashCode = (typeDto == null ? 0 : typeDto.hashCode()) * 31;
            SuperAppUniversalWidgetFooterAccentButtonPayloadDto superAppUniversalWidgetFooterAccentButtonPayloadDto = this.payload;
            return hashCode + (superAppUniversalWidgetFooterAccentButtonPayloadDto != null ? superAppUniversalWidgetFooterAccentButtonPayloadDto.hashCode() : 0);
        }

        public final String toString() {
            return "SuperAppUniversalWidgetFooterAccentButtonDto(type=" + this.type + ", payload=" + this.payload + ')';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            TypeDto typeDto = this.type;
            if (typeDto == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                typeDto.writeToParcel(parcel, i);
            }
            SuperAppUniversalWidgetFooterAccentButtonPayloadDto superAppUniversalWidgetFooterAccentButtonPayloadDto = this.payload;
            if (superAppUniversalWidgetFooterAccentButtonPayloadDto == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                superAppUniversalWidgetFooterAccentButtonPayloadDto.writeToParcel(parcel, i);
            }
        }

        public /* synthetic */ SuperAppUniversalWidgetFooterAccentButtonDto(TypeDto typeDto, SuperAppUniversalWidgetFooterAccentButtonPayloadDto superAppUniversalWidgetFooterAccentButtonPayloadDto, int i, zcl zclVar) {
            this((i & 1) != 0 ? null : typeDto, (i & 2) != 0 ? null : superAppUniversalWidgetFooterAccentButtonPayloadDto);
        }

        public SuperAppUniversalWidgetFooterAccentButtonDto(TypeDto typeDto, SuperAppUniversalWidgetFooterAccentButtonPayloadDto superAppUniversalWidgetFooterAccentButtonPayloadDto) {
            super(null);
            this.type = typeDto;
            this.payload = superAppUniversalWidgetFooterAccentButtonPayloadDto;
        }
    }

    /* compiled from: SuperAppUniversalWidgetFooterDto.kt */
    /* loaded from: classes15.dex */
    public static final class SuperAppUniversalWidgetFooterTextAndButtonDto extends SuperAppUniversalWidgetFooterDto implements Parcelable {
        public static final Parcelable.Creator<SuperAppUniversalWidgetFooterTextAndButtonDto> CREATOR = new a();

        @pmi0("payload")
        private final SuperAppUniversalWidgetFooterTextAndButtonPayloadDto payload;

        @pmi0("type")
        private final TypeDto type;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: SuperAppUniversalWidgetFooterDto.kt */
        public static final class TypeDto implements Parcelable {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ TypeDto[] $VALUES;
            public static final Parcelable.Creator<TypeDto> CREATOR;

            @pmi0("text_and_button")
            public static final TypeDto TEXT_AND_BUTTON;
            private final String value;

            /* compiled from: SuperAppUniversalWidgetFooterDto.kt */
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
                TypeDto typeDto = new TypeDto("TEXT_AND_BUTTON", 0, "text_and_button");
                TEXT_AND_BUTTON = typeDto;
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

        /* compiled from: SuperAppUniversalWidgetFooterDto.kt */
        public static final class a implements Parcelable.Creator<SuperAppUniversalWidgetFooterTextAndButtonDto> {
            @Override // android.os.Parcelable.Creator
            public final SuperAppUniversalWidgetFooterTextAndButtonDto createFromParcel(Parcel parcel) {
                return new SuperAppUniversalWidgetFooterTextAndButtonDto(parcel.readInt() == 0 ? null : TypeDto.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? SuperAppUniversalWidgetFooterTextAndButtonPayloadDto.CREATOR.createFromParcel(parcel) : null);
            }

            @Override // android.os.Parcelable.Creator
            public final SuperAppUniversalWidgetFooterTextAndButtonDto[] newArray(int i) {
                return new SuperAppUniversalWidgetFooterTextAndButtonDto[i];
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public SuperAppUniversalWidgetFooterTextAndButtonDto() {
            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SuperAppUniversalWidgetFooterTextAndButtonDto)) {
                return false;
            }
            SuperAppUniversalWidgetFooterTextAndButtonDto superAppUniversalWidgetFooterTextAndButtonDto = (SuperAppUniversalWidgetFooterTextAndButtonDto) obj;
            return this.type == superAppUniversalWidgetFooterTextAndButtonDto.type && epx.f(this.payload, superAppUniversalWidgetFooterTextAndButtonDto.payload);
        }

        public final int hashCode() {
            TypeDto typeDto = this.type;
            int hashCode = (typeDto == null ? 0 : typeDto.hashCode()) * 31;
            SuperAppUniversalWidgetFooterTextAndButtonPayloadDto superAppUniversalWidgetFooterTextAndButtonPayloadDto = this.payload;
            return hashCode + (superAppUniversalWidgetFooterTextAndButtonPayloadDto != null ? superAppUniversalWidgetFooterTextAndButtonPayloadDto.hashCode() : 0);
        }

        public final String toString() {
            return "SuperAppUniversalWidgetFooterTextAndButtonDto(type=" + this.type + ", payload=" + this.payload + ')';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            TypeDto typeDto = this.type;
            if (typeDto == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                typeDto.writeToParcel(parcel, i);
            }
            SuperAppUniversalWidgetFooterTextAndButtonPayloadDto superAppUniversalWidgetFooterTextAndButtonPayloadDto = this.payload;
            if (superAppUniversalWidgetFooterTextAndButtonPayloadDto == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                superAppUniversalWidgetFooterTextAndButtonPayloadDto.writeToParcel(parcel, i);
            }
        }

        public /* synthetic */ SuperAppUniversalWidgetFooterTextAndButtonDto(TypeDto typeDto, SuperAppUniversalWidgetFooterTextAndButtonPayloadDto superAppUniversalWidgetFooterTextAndButtonPayloadDto, int i, zcl zclVar) {
            this((i & 1) != 0 ? null : typeDto, (i & 2) != 0 ? null : superAppUniversalWidgetFooterTextAndButtonPayloadDto);
        }

        public SuperAppUniversalWidgetFooterTextAndButtonDto(TypeDto typeDto, SuperAppUniversalWidgetFooterTextAndButtonPayloadDto superAppUniversalWidgetFooterTextAndButtonPayloadDto) {
            super(null);
            this.type = typeDto;
            this.payload = superAppUniversalWidgetFooterTextAndButtonPayloadDto;
        }
    }

    /* compiled from: SuperAppUniversalWidgetFooterDto.kt */
    /* loaded from: classes15.dex */
    public static final class SuperAppUniversalWidgetFooterUserStackDto extends SuperAppUniversalWidgetFooterDto implements Parcelable {
        public static final Parcelable.Creator<SuperAppUniversalWidgetFooterUserStackDto> CREATOR = new a();

        @pmi0("payload")
        private final SuperAppUniversalWidgetUserStackFooterPayloadDto payload;

        @pmi0("type")
        private final TypeDto type;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: SuperAppUniversalWidgetFooterDto.kt */
        public static final class TypeDto implements Parcelable {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ TypeDto[] $VALUES;
            public static final Parcelable.Creator<TypeDto> CREATOR;

            @pmi0("user_stack")
            public static final TypeDto USER_STACK;
            private final String value;

            /* compiled from: SuperAppUniversalWidgetFooterDto.kt */
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
                TypeDto typeDto = new TypeDto("USER_STACK", 0, "user_stack");
                USER_STACK = typeDto;
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

        /* compiled from: SuperAppUniversalWidgetFooterDto.kt */
        public static final class a implements Parcelable.Creator<SuperAppUniversalWidgetFooterUserStackDto> {
            @Override // android.os.Parcelable.Creator
            public final SuperAppUniversalWidgetFooterUserStackDto createFromParcel(Parcel parcel) {
                return new SuperAppUniversalWidgetFooterUserStackDto(parcel.readInt() == 0 ? null : TypeDto.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? SuperAppUniversalWidgetUserStackFooterPayloadDto.CREATOR.createFromParcel(parcel) : null);
            }

            @Override // android.os.Parcelable.Creator
            public final SuperAppUniversalWidgetFooterUserStackDto[] newArray(int i) {
                return new SuperAppUniversalWidgetFooterUserStackDto[i];
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public SuperAppUniversalWidgetFooterUserStackDto() {
            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SuperAppUniversalWidgetFooterUserStackDto)) {
                return false;
            }
            SuperAppUniversalWidgetFooterUserStackDto superAppUniversalWidgetFooterUserStackDto = (SuperAppUniversalWidgetFooterUserStackDto) obj;
            return this.type == superAppUniversalWidgetFooterUserStackDto.type && epx.f(this.payload, superAppUniversalWidgetFooterUserStackDto.payload);
        }

        public final int hashCode() {
            TypeDto typeDto = this.type;
            int hashCode = (typeDto == null ? 0 : typeDto.hashCode()) * 31;
            SuperAppUniversalWidgetUserStackFooterPayloadDto superAppUniversalWidgetUserStackFooterPayloadDto = this.payload;
            return hashCode + (superAppUniversalWidgetUserStackFooterPayloadDto != null ? superAppUniversalWidgetUserStackFooterPayloadDto.hashCode() : 0);
        }

        public final String toString() {
            return "SuperAppUniversalWidgetFooterUserStackDto(type=" + this.type + ", payload=" + this.payload + ')';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            TypeDto typeDto = this.type;
            if (typeDto == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                typeDto.writeToParcel(parcel, i);
            }
            SuperAppUniversalWidgetUserStackFooterPayloadDto superAppUniversalWidgetUserStackFooterPayloadDto = this.payload;
            if (superAppUniversalWidgetUserStackFooterPayloadDto == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                superAppUniversalWidgetUserStackFooterPayloadDto.writeToParcel(parcel, i);
            }
        }

        public /* synthetic */ SuperAppUniversalWidgetFooterUserStackDto(TypeDto typeDto, SuperAppUniversalWidgetUserStackFooterPayloadDto superAppUniversalWidgetUserStackFooterPayloadDto, int i, zcl zclVar) {
            this((i & 1) != 0 ? null : typeDto, (i & 2) != 0 ? null : superAppUniversalWidgetUserStackFooterPayloadDto);
        }

        public SuperAppUniversalWidgetFooterUserStackDto(TypeDto typeDto, SuperAppUniversalWidgetUserStackFooterPayloadDto superAppUniversalWidgetUserStackFooterPayloadDto) {
            super(null);
            this.type = typeDto;
            this.payload = superAppUniversalWidgetUserStackFooterPayloadDto;
        }
    }

    public /* synthetic */ SuperAppUniversalWidgetFooterDto(zcl zclVar) {
        this();
    }

    private SuperAppUniversalWidgetFooterDto() {
    }
}
