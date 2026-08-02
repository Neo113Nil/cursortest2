package com.vk.api.generated.superAppShowcase.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.internal.bind.TreeTypeAdapter;
import xsna.a9y;
import xsna.asp;
import xsna.b9y;
import xsna.epx;
import xsna.go9;
import xsna.ho8;
import xsna.pmi0;
import xsna.up;
import xsna.urd0;
import xsna.vu5;
import xsna.z8y;
import xsna.zcl;
import xsna.zrp;

/* compiled from: SuperAppShowcaseBadgeDto.kt */
/* loaded from: classes.dex */
public abstract class SuperAppShowcaseBadgeDto implements Parcelable {

    /* compiled from: SuperAppShowcaseBadgeDto.kt */
    public static final class Deserializer implements a9y<SuperAppShowcaseBadgeDto> {
        @Override // xsna.a9y
        public final Object a(b9y b9yVar, z8y z8yVar) {
            String f = up.f(b9yVar, "type");
            if (f != null) {
                int hashCode = f.hashCode();
                if (hashCode != 108960) {
                    if (hashCode != 3556653) {
                        if (hashCode == 273184065 && f.equals("discount")) {
                            return (SuperAppShowcaseBadgeDto) ((TreeTypeAdapter.a) z8yVar).a(b9yVar, SuperAppShowcaseBadgeDiscountDto.class);
                        }
                    } else if (f.equals("text")) {
                        return (SuperAppShowcaseBadgeDto) ((TreeTypeAdapter.a) z8yVar).a(b9yVar, SuperAppShowcaseBadgeTextDto.class);
                    }
                } else if (f.equals("new")) {
                    return (SuperAppShowcaseBadgeDto) ((TreeTypeAdapter.a) z8yVar).a(b9yVar, SuperAppShowcaseBadgeNewDto.class);
                }
            }
            throw new IllegalStateException(go9.b("no mapping for the type:", f));
        }
    }

    /* compiled from: SuperAppShowcaseBadgeDto.kt */
    /* loaded from: classes15.dex */
    public static final class SuperAppShowcaseBadgeDiscountDto extends SuperAppShowcaseBadgeDto implements Parcelable {
        public static final Parcelable.Creator<SuperAppShowcaseBadgeDiscountDto> CREATOR = new a();

        @pmi0("discount")
        private final int discount;

        @pmi0("type")
        private final TypeDto type;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: SuperAppShowcaseBadgeDto.kt */
        public static final class TypeDto implements Parcelable {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ TypeDto[] $VALUES;
            public static final Parcelable.Creator<TypeDto> CREATOR;

            @pmi0("discount")
            public static final TypeDto DISCOUNT;
            private final String value;

            /* compiled from: SuperAppShowcaseBadgeDto.kt */
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
                TypeDto typeDto = new TypeDto("DISCOUNT", 0, "discount");
                DISCOUNT = typeDto;
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

        /* compiled from: SuperAppShowcaseBadgeDto.kt */
        public static final class a implements Parcelable.Creator<SuperAppShowcaseBadgeDiscountDto> {
            @Override // android.os.Parcelable.Creator
            public final SuperAppShowcaseBadgeDiscountDto createFromParcel(Parcel parcel) {
                return new SuperAppShowcaseBadgeDiscountDto(TypeDto.CREATOR.createFromParcel(parcel), parcel.readInt());
            }

            @Override // android.os.Parcelable.Creator
            public final SuperAppShowcaseBadgeDiscountDto[] newArray(int i) {
                return new SuperAppShowcaseBadgeDiscountDto[i];
            }
        }

        public SuperAppShowcaseBadgeDiscountDto(TypeDto typeDto, int i) {
            super(null);
            this.type = typeDto;
            this.discount = i;
        }

        public final int d() {
            return this.discount;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SuperAppShowcaseBadgeDiscountDto)) {
                return false;
            }
            SuperAppShowcaseBadgeDiscountDto superAppShowcaseBadgeDiscountDto = (SuperAppShowcaseBadgeDiscountDto) obj;
            return this.type == superAppShowcaseBadgeDiscountDto.type && this.discount == superAppShowcaseBadgeDiscountDto.discount;
        }

        public final int hashCode() {
            return Integer.hashCode(this.discount) + (this.type.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("SuperAppShowcaseBadgeDiscountDto(type=");
            sb.append(this.type);
            sb.append(", discount=");
            return vu5.b(sb, this.discount, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            this.type.writeToParcel(parcel, i);
            parcel.writeInt(this.discount);
        }
    }

    /* compiled from: SuperAppShowcaseBadgeDto.kt */
    /* loaded from: classes15.dex */
    public static final class SuperAppShowcaseBadgeNewDto extends SuperAppShowcaseBadgeDto implements Parcelable {
        public static final Parcelable.Creator<SuperAppShowcaseBadgeNewDto> CREATOR = new a();

        @pmi0("type")
        private final TypeDto type;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: SuperAppShowcaseBadgeDto.kt */
        public static final class TypeDto implements Parcelable {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ TypeDto[] $VALUES;
            public static final Parcelable.Creator<TypeDto> CREATOR;

            @pmi0("new")
            public static final TypeDto NEW;
            private final String value;

            /* compiled from: SuperAppShowcaseBadgeDto.kt */
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
                TypeDto typeDto = new TypeDto("NEW", 0, "new");
                NEW = typeDto;
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

        /* compiled from: SuperAppShowcaseBadgeDto.kt */
        public static final class a implements Parcelable.Creator<SuperAppShowcaseBadgeNewDto> {
            @Override // android.os.Parcelable.Creator
            public final SuperAppShowcaseBadgeNewDto createFromParcel(Parcel parcel) {
                return new SuperAppShowcaseBadgeNewDto(TypeDto.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final SuperAppShowcaseBadgeNewDto[] newArray(int i) {
                return new SuperAppShowcaseBadgeNewDto[i];
            }
        }

        public SuperAppShowcaseBadgeNewDto(TypeDto typeDto) {
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
            return (obj instanceof SuperAppShowcaseBadgeNewDto) && this.type == ((SuperAppShowcaseBadgeNewDto) obj).type;
        }

        public final int hashCode() {
            return this.type.hashCode();
        }

        public final String toString() {
            return "SuperAppShowcaseBadgeNewDto(type=" + this.type + ')';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            this.type.writeToParcel(parcel, i);
        }
    }

    /* compiled from: SuperAppShowcaseBadgeDto.kt */
    /* loaded from: classes15.dex */
    public static final class SuperAppShowcaseBadgeTextDto extends SuperAppShowcaseBadgeDto implements Parcelable {
        public static final Parcelable.Creator<SuperAppShowcaseBadgeTextDto> CREATOR = new a();

        @pmi0("background_color")
        private final String backgroundColor;

        @pmi0("text")
        private final String text;

        @pmi0("text_color")
        private final String textColor;

        @pmi0("type")
        private final TypeDto type;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: SuperAppShowcaseBadgeDto.kt */
        public static final class TypeDto implements Parcelable {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ TypeDto[] $VALUES;
            public static final Parcelable.Creator<TypeDto> CREATOR;

            @pmi0("text")
            public static final TypeDto TEXT;
            private final String value;

            /* compiled from: SuperAppShowcaseBadgeDto.kt */
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
                TypeDto typeDto = new TypeDto("TEXT", 0, "text");
                TEXT = typeDto;
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

        /* compiled from: SuperAppShowcaseBadgeDto.kt */
        public static final class a implements Parcelable.Creator<SuperAppShowcaseBadgeTextDto> {
            @Override // android.os.Parcelable.Creator
            public final SuperAppShowcaseBadgeTextDto createFromParcel(Parcel parcel) {
                return new SuperAppShowcaseBadgeTextDto(TypeDto.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final SuperAppShowcaseBadgeTextDto[] newArray(int i) {
                return new SuperAppShowcaseBadgeTextDto[i];
            }
        }

        public SuperAppShowcaseBadgeTextDto(TypeDto typeDto, String str, String str2, String str3) {
            super(null);
            this.type = typeDto;
            this.text = str;
            this.textColor = str2;
            this.backgroundColor = str3;
        }

        public final String d() {
            return this.backgroundColor;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final String e() {
            return this.text;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SuperAppShowcaseBadgeTextDto)) {
                return false;
            }
            SuperAppShowcaseBadgeTextDto superAppShowcaseBadgeTextDto = (SuperAppShowcaseBadgeTextDto) obj;
            return this.type == superAppShowcaseBadgeTextDto.type && epx.f(this.text, superAppShowcaseBadgeTextDto.text) && epx.f(this.textColor, superAppShowcaseBadgeTextDto.textColor) && epx.f(this.backgroundColor, superAppShowcaseBadgeTextDto.backgroundColor);
        }

        public final String f() {
            return this.textColor;
        }

        public final int hashCode() {
            return this.backgroundColor.hashCode() + urd0.a(urd0.a(this.type.hashCode() * 31, 31, this.text), 31, this.textColor);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("SuperAppShowcaseBadgeTextDto(type=");
            sb.append(this.type);
            sb.append(", text=");
            sb.append(this.text);
            sb.append(", textColor=");
            sb.append(this.textColor);
            sb.append(", backgroundColor=");
            return ho8.a(sb, this.backgroundColor, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            this.type.writeToParcel(parcel, i);
            parcel.writeString(this.text);
            parcel.writeString(this.textColor);
            parcel.writeString(this.backgroundColor);
        }
    }

    public /* synthetic */ SuperAppShowcaseBadgeDto(zcl zclVar) {
        this();
    }

    private SuperAppShowcaseBadgeDto() {
    }
}
