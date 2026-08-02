package com.vk.api.generated.superApp.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.fyber.inneractive.sdk.external.NativeAdContent;
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

/* compiled from: SuperAppUniversalWidgetTypeInformerRowRightDto.kt */
/* loaded from: classes.dex */
public abstract class SuperAppUniversalWidgetTypeInformerRowRightDto implements Parcelable {

    /* compiled from: SuperAppUniversalWidgetTypeInformerRowRightDto.kt */
    public static final class Deserializer implements a9y<SuperAppUniversalWidgetTypeInformerRowRightDto> {
        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
        java.lang.NullPointerException
         */
        @Override // xsna.a9y
        public final Object a(b9y b9yVar, z8y z8yVar) {
            String f = up.f(b9yVar, "type");
            if (f != null) {
                switch (f.hashCode()) {
                    case -1776935260:
                        if (f.equals("image_stack")) {
                            return (SuperAppUniversalWidgetTypeInformerRowRightDto) ((TreeTypeAdapter.a) z8yVar).a(b9yVar, SuperAppUniversalWidgetImageStackDto.class);
                        }
                        break;
                    case -1377687758:
                        if (f.equals("button")) {
                            return (SuperAppUniversalWidgetTypeInformerRowRightDto) ((TreeTypeAdapter.a) z8yVar).a(b9yVar, SuperAppUniversalWidgetTypeInformerRowButtonDto.class);
                        }
                        break;
                    case 3226745:
                        if (f.equals("icon")) {
                            return (SuperAppUniversalWidgetTypeInformerRowRightDto) ((TreeTypeAdapter.a) z8yVar).a(b9yVar, SuperAppUniversalWidgetTypeInformerRowIconDto.class);
                        }
                        break;
                    case 957830652:
                        if (f.equals("counter")) {
                            return (SuperAppUniversalWidgetTypeInformerRowRightDto) ((TreeTypeAdapter.a) z8yVar).a(b9yVar, SuperAppUniversalWidgetTypeInformerRowCounterDto.class);
                        }
                        break;
                    case 1934806292:
                        if (f.equals("user_stack")) {
                            return (SuperAppUniversalWidgetTypeInformerRowRightDto) ((TreeTypeAdapter.a) z8yVar).a(b9yVar, SuperAppUniversalWidgetUserStackDto.class);
                        }
                        break;
                }
            }
            throw new IllegalStateException(go9.b("no mapping for the type:", f));
        }
    }

    /* compiled from: SuperAppUniversalWidgetTypeInformerRowRightDto.kt */
    /* loaded from: classes15.dex */
    public static final class SuperAppUniversalWidgetImageStackDto extends SuperAppUniversalWidgetTypeInformerRowRightDto implements Parcelable {
        public static final Parcelable.Creator<SuperAppUniversalWidgetImageStackDto> CREATOR = new a();

        @pmi0("payload")
        private final SuperAppUniversalWidgetImageStackBasePayloadDto payload;

        @pmi0("type")
        private final TypeDto type;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: SuperAppUniversalWidgetTypeInformerRowRightDto.kt */
        public static final class TypeDto implements Parcelable {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ TypeDto[] $VALUES;
            public static final Parcelable.Creator<TypeDto> CREATOR;

            @pmi0("image_stack")
            public static final TypeDto IMAGE_STACK;
            private final String value;

            /* compiled from: SuperAppUniversalWidgetTypeInformerRowRightDto.kt */
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
                TypeDto typeDto = new TypeDto("IMAGE_STACK", 0, "image_stack");
                IMAGE_STACK = typeDto;
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

        /* compiled from: SuperAppUniversalWidgetTypeInformerRowRightDto.kt */
        public static final class a implements Parcelable.Creator<SuperAppUniversalWidgetImageStackDto> {
            @Override // android.os.Parcelable.Creator
            public final SuperAppUniversalWidgetImageStackDto createFromParcel(Parcel parcel) {
                return new SuperAppUniversalWidgetImageStackDto(parcel.readInt() == 0 ? null : TypeDto.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? SuperAppUniversalWidgetImageStackBasePayloadDto.CREATOR.createFromParcel(parcel) : null);
            }

            @Override // android.os.Parcelable.Creator
            public final SuperAppUniversalWidgetImageStackDto[] newArray(int i) {
                return new SuperAppUniversalWidgetImageStackDto[i];
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public SuperAppUniversalWidgetImageStackDto() {
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
            if (!(obj instanceof SuperAppUniversalWidgetImageStackDto)) {
                return false;
            }
            SuperAppUniversalWidgetImageStackDto superAppUniversalWidgetImageStackDto = (SuperAppUniversalWidgetImageStackDto) obj;
            return this.type == superAppUniversalWidgetImageStackDto.type && epx.f(this.payload, superAppUniversalWidgetImageStackDto.payload);
        }

        public final int hashCode() {
            TypeDto typeDto = this.type;
            int hashCode = (typeDto == null ? 0 : typeDto.hashCode()) * 31;
            SuperAppUniversalWidgetImageStackBasePayloadDto superAppUniversalWidgetImageStackBasePayloadDto = this.payload;
            return hashCode + (superAppUniversalWidgetImageStackBasePayloadDto != null ? superAppUniversalWidgetImageStackBasePayloadDto.hashCode() : 0);
        }

        public final String toString() {
            return "SuperAppUniversalWidgetImageStackDto(type=" + this.type + ", payload=" + this.payload + ')';
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
            SuperAppUniversalWidgetImageStackBasePayloadDto superAppUniversalWidgetImageStackBasePayloadDto = this.payload;
            if (superAppUniversalWidgetImageStackBasePayloadDto == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                superAppUniversalWidgetImageStackBasePayloadDto.writeToParcel(parcel, i);
            }
        }

        public /* synthetic */ SuperAppUniversalWidgetImageStackDto(TypeDto typeDto, SuperAppUniversalWidgetImageStackBasePayloadDto superAppUniversalWidgetImageStackBasePayloadDto, int i, zcl zclVar) {
            this((i & 1) != 0 ? null : typeDto, (i & 2) != 0 ? null : superAppUniversalWidgetImageStackBasePayloadDto);
        }

        public SuperAppUniversalWidgetImageStackDto(TypeDto typeDto, SuperAppUniversalWidgetImageStackBasePayloadDto superAppUniversalWidgetImageStackBasePayloadDto) {
            super(null);
            this.type = typeDto;
            this.payload = superAppUniversalWidgetImageStackBasePayloadDto;
        }
    }

    /* compiled from: SuperAppUniversalWidgetTypeInformerRowRightDto.kt */
    /* loaded from: classes15.dex */
    public static final class SuperAppUniversalWidgetTypeInformerRowButtonDto extends SuperAppUniversalWidgetTypeInformerRowRightDto implements Parcelable {
        public static final Parcelable.Creator<SuperAppUniversalWidgetTypeInformerRowButtonDto> CREATOR = new a();

        @pmi0("payload")
        private final SuperAppUniversalWidgetButtonDto payload;

        @pmi0("type")
        private final TypeDto type;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: SuperAppUniversalWidgetTypeInformerRowRightDto.kt */
        public static final class TypeDto implements Parcelable {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ TypeDto[] $VALUES;

            @pmi0("button")
            public static final TypeDto BUTTON;
            public static final Parcelable.Creator<TypeDto> CREATOR;
            private final String value;

            /* compiled from: SuperAppUniversalWidgetTypeInformerRowRightDto.kt */
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
                TypeDto typeDto = new TypeDto("BUTTON", 0, "button");
                BUTTON = typeDto;
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

        /* compiled from: SuperAppUniversalWidgetTypeInformerRowRightDto.kt */
        public static final class a implements Parcelable.Creator<SuperAppUniversalWidgetTypeInformerRowButtonDto> {
            @Override // android.os.Parcelable.Creator
            public final SuperAppUniversalWidgetTypeInformerRowButtonDto createFromParcel(Parcel parcel) {
                return new SuperAppUniversalWidgetTypeInformerRowButtonDto(TypeDto.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : SuperAppUniversalWidgetButtonDto.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final SuperAppUniversalWidgetTypeInformerRowButtonDto[] newArray(int i) {
                return new SuperAppUniversalWidgetTypeInformerRowButtonDto[i];
            }
        }

        public /* synthetic */ SuperAppUniversalWidgetTypeInformerRowButtonDto(TypeDto typeDto, SuperAppUniversalWidgetButtonDto superAppUniversalWidgetButtonDto, int i, zcl zclVar) {
            this(typeDto, (i & 2) != 0 ? null : superAppUniversalWidgetButtonDto);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SuperAppUniversalWidgetTypeInformerRowButtonDto)) {
                return false;
            }
            SuperAppUniversalWidgetTypeInformerRowButtonDto superAppUniversalWidgetTypeInformerRowButtonDto = (SuperAppUniversalWidgetTypeInformerRowButtonDto) obj;
            return this.type == superAppUniversalWidgetTypeInformerRowButtonDto.type && epx.f(this.payload, superAppUniversalWidgetTypeInformerRowButtonDto.payload);
        }

        public final int hashCode() {
            int hashCode = this.type.hashCode() * 31;
            SuperAppUniversalWidgetButtonDto superAppUniversalWidgetButtonDto = this.payload;
            return hashCode + (superAppUniversalWidgetButtonDto == null ? 0 : superAppUniversalWidgetButtonDto.hashCode());
        }

        public final String toString() {
            return "SuperAppUniversalWidgetTypeInformerRowButtonDto(type=" + this.type + ", payload=" + this.payload + ')';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            this.type.writeToParcel(parcel, i);
            SuperAppUniversalWidgetButtonDto superAppUniversalWidgetButtonDto = this.payload;
            if (superAppUniversalWidgetButtonDto == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                superAppUniversalWidgetButtonDto.writeToParcel(parcel, i);
            }
        }

        public SuperAppUniversalWidgetTypeInformerRowButtonDto(TypeDto typeDto, SuperAppUniversalWidgetButtonDto superAppUniversalWidgetButtonDto) {
            super(null);
            this.type = typeDto;
            this.payload = superAppUniversalWidgetButtonDto;
        }
    }

    /* compiled from: SuperAppUniversalWidgetTypeInformerRowRightDto.kt */
    /* loaded from: classes15.dex */
    public static final class SuperAppUniversalWidgetTypeInformerRowCounterDto extends SuperAppUniversalWidgetTypeInformerRowRightDto implements Parcelable {
        public static final Parcelable.Creator<SuperAppUniversalWidgetTypeInformerRowCounterDto> CREATOR = new a();

        @pmi0("payload")
        private final SuperAppUniversalWidgetTextBlockDto payload;

        @pmi0("type")
        private final TypeDto type;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: SuperAppUniversalWidgetTypeInformerRowRightDto.kt */
        public static final class TypeDto implements Parcelable {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ TypeDto[] $VALUES;

            @pmi0("counter")
            public static final TypeDto COUNTER;
            public static final Parcelable.Creator<TypeDto> CREATOR;
            private final String value;

            /* compiled from: SuperAppUniversalWidgetTypeInformerRowRightDto.kt */
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
                TypeDto typeDto = new TypeDto("COUNTER", 0, "counter");
                COUNTER = typeDto;
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

        /* compiled from: SuperAppUniversalWidgetTypeInformerRowRightDto.kt */
        public static final class a implements Parcelable.Creator<SuperAppUniversalWidgetTypeInformerRowCounterDto> {
            @Override // android.os.Parcelable.Creator
            public final SuperAppUniversalWidgetTypeInformerRowCounterDto createFromParcel(Parcel parcel) {
                return new SuperAppUniversalWidgetTypeInformerRowCounterDto(TypeDto.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : SuperAppUniversalWidgetTextBlockDto.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final SuperAppUniversalWidgetTypeInformerRowCounterDto[] newArray(int i) {
                return new SuperAppUniversalWidgetTypeInformerRowCounterDto[i];
            }
        }

        public /* synthetic */ SuperAppUniversalWidgetTypeInformerRowCounterDto(TypeDto typeDto, SuperAppUniversalWidgetTextBlockDto superAppUniversalWidgetTextBlockDto, int i, zcl zclVar) {
            this(typeDto, (i & 2) != 0 ? null : superAppUniversalWidgetTextBlockDto);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SuperAppUniversalWidgetTypeInformerRowCounterDto)) {
                return false;
            }
            SuperAppUniversalWidgetTypeInformerRowCounterDto superAppUniversalWidgetTypeInformerRowCounterDto = (SuperAppUniversalWidgetTypeInformerRowCounterDto) obj;
            return this.type == superAppUniversalWidgetTypeInformerRowCounterDto.type && epx.f(this.payload, superAppUniversalWidgetTypeInformerRowCounterDto.payload);
        }

        public final int hashCode() {
            int hashCode = this.type.hashCode() * 31;
            SuperAppUniversalWidgetTextBlockDto superAppUniversalWidgetTextBlockDto = this.payload;
            return hashCode + (superAppUniversalWidgetTextBlockDto == null ? 0 : superAppUniversalWidgetTextBlockDto.hashCode());
        }

        public final String toString() {
            return "SuperAppUniversalWidgetTypeInformerRowCounterDto(type=" + this.type + ", payload=" + this.payload + ')';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            this.type.writeToParcel(parcel, i);
            SuperAppUniversalWidgetTextBlockDto superAppUniversalWidgetTextBlockDto = this.payload;
            if (superAppUniversalWidgetTextBlockDto == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                superAppUniversalWidgetTextBlockDto.writeToParcel(parcel, i);
            }
        }

        public SuperAppUniversalWidgetTypeInformerRowCounterDto(TypeDto typeDto, SuperAppUniversalWidgetTextBlockDto superAppUniversalWidgetTextBlockDto) {
            super(null);
            this.type = typeDto;
            this.payload = superAppUniversalWidgetTextBlockDto;
        }
    }

    /* compiled from: SuperAppUniversalWidgetTypeInformerRowRightDto.kt */
    /* loaded from: classes15.dex */
    public static final class SuperAppUniversalWidgetTypeInformerRowIconDto extends SuperAppUniversalWidgetTypeInformerRowRightDto implements Parcelable {
        public static final Parcelable.Creator<SuperAppUniversalWidgetTypeInformerRowIconDto> CREATOR = new a();

        @pmi0("badge")
        private final SuperAppUniversalWidgetBaseBadgeDto badge;

        @pmi0("payload")
        private final SuperAppUniversalWidgetIconDto payload;

        @pmi0("type")
        private final TypeDto type;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: SuperAppUniversalWidgetTypeInformerRowRightDto.kt */
        public static final class TypeDto implements Parcelable {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ TypeDto[] $VALUES;
            public static final Parcelable.Creator<TypeDto> CREATOR;

            @pmi0("icon")
            public static final TypeDto ICON;
            private final String value;

            /* compiled from: SuperAppUniversalWidgetTypeInformerRowRightDto.kt */
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
                TypeDto typeDto = new TypeDto(NativeAdContent.ViewTag.AD_ICON, 0, "icon");
                ICON = typeDto;
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

        /* compiled from: SuperAppUniversalWidgetTypeInformerRowRightDto.kt */
        public static final class a implements Parcelable.Creator<SuperAppUniversalWidgetTypeInformerRowIconDto> {
            @Override // android.os.Parcelable.Creator
            public final SuperAppUniversalWidgetTypeInformerRowIconDto createFromParcel(Parcel parcel) {
                return new SuperAppUniversalWidgetTypeInformerRowIconDto(TypeDto.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : SuperAppUniversalWidgetIconDto.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? SuperAppUniversalWidgetBaseBadgeDto.CREATOR.createFromParcel(parcel) : null);
            }

            @Override // android.os.Parcelable.Creator
            public final SuperAppUniversalWidgetTypeInformerRowIconDto[] newArray(int i) {
                return new SuperAppUniversalWidgetTypeInformerRowIconDto[i];
            }
        }

        public /* synthetic */ SuperAppUniversalWidgetTypeInformerRowIconDto(TypeDto typeDto, SuperAppUniversalWidgetIconDto superAppUniversalWidgetIconDto, SuperAppUniversalWidgetBaseBadgeDto superAppUniversalWidgetBaseBadgeDto, int i, zcl zclVar) {
            this(typeDto, (i & 2) != 0 ? null : superAppUniversalWidgetIconDto, (i & 4) != 0 ? null : superAppUniversalWidgetBaseBadgeDto);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SuperAppUniversalWidgetTypeInformerRowIconDto)) {
                return false;
            }
            SuperAppUniversalWidgetTypeInformerRowIconDto superAppUniversalWidgetTypeInformerRowIconDto = (SuperAppUniversalWidgetTypeInformerRowIconDto) obj;
            return this.type == superAppUniversalWidgetTypeInformerRowIconDto.type && epx.f(this.payload, superAppUniversalWidgetTypeInformerRowIconDto.payload) && epx.f(this.badge, superAppUniversalWidgetTypeInformerRowIconDto.badge);
        }

        public final int hashCode() {
            int hashCode = this.type.hashCode() * 31;
            SuperAppUniversalWidgetIconDto superAppUniversalWidgetIconDto = this.payload;
            int hashCode2 = (hashCode + (superAppUniversalWidgetIconDto == null ? 0 : superAppUniversalWidgetIconDto.hashCode())) * 31;
            SuperAppUniversalWidgetBaseBadgeDto superAppUniversalWidgetBaseBadgeDto = this.badge;
            return hashCode2 + (superAppUniversalWidgetBaseBadgeDto != null ? superAppUniversalWidgetBaseBadgeDto.hashCode() : 0);
        }

        public final String toString() {
            return "SuperAppUniversalWidgetTypeInformerRowIconDto(type=" + this.type + ", payload=" + this.payload + ", badge=" + this.badge + ')';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            this.type.writeToParcel(parcel, i);
            SuperAppUniversalWidgetIconDto superAppUniversalWidgetIconDto = this.payload;
            if (superAppUniversalWidgetIconDto == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                superAppUniversalWidgetIconDto.writeToParcel(parcel, i);
            }
            SuperAppUniversalWidgetBaseBadgeDto superAppUniversalWidgetBaseBadgeDto = this.badge;
            if (superAppUniversalWidgetBaseBadgeDto == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                superAppUniversalWidgetBaseBadgeDto.writeToParcel(parcel, i);
            }
        }

        public SuperAppUniversalWidgetTypeInformerRowIconDto(TypeDto typeDto, SuperAppUniversalWidgetIconDto superAppUniversalWidgetIconDto, SuperAppUniversalWidgetBaseBadgeDto superAppUniversalWidgetBaseBadgeDto) {
            super(null);
            this.type = typeDto;
            this.payload = superAppUniversalWidgetIconDto;
            this.badge = superAppUniversalWidgetBaseBadgeDto;
        }
    }

    /* compiled from: SuperAppUniversalWidgetTypeInformerRowRightDto.kt */
    /* loaded from: classes15.dex */
    public static final class SuperAppUniversalWidgetUserStackDto extends SuperAppUniversalWidgetTypeInformerRowRightDto implements Parcelable {
        public static final Parcelable.Creator<SuperAppUniversalWidgetUserStackDto> CREATOR = new a();

        @pmi0("payload")
        private final SuperAppUniversalWidgetUserStackBasePayloadDto payload;

        @pmi0("type")
        private final TypeDto type;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: SuperAppUniversalWidgetTypeInformerRowRightDto.kt */
        public static final class TypeDto implements Parcelable {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ TypeDto[] $VALUES;
            public static final Parcelable.Creator<TypeDto> CREATOR;

            @pmi0("user_stack")
            public static final TypeDto USER_STACK;
            private final String value;

            /* compiled from: SuperAppUniversalWidgetTypeInformerRowRightDto.kt */
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

        /* compiled from: SuperAppUniversalWidgetTypeInformerRowRightDto.kt */
        public static final class a implements Parcelable.Creator<SuperAppUniversalWidgetUserStackDto> {
            @Override // android.os.Parcelable.Creator
            public final SuperAppUniversalWidgetUserStackDto createFromParcel(Parcel parcel) {
                return new SuperAppUniversalWidgetUserStackDto(parcel.readInt() == 0 ? null : TypeDto.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? SuperAppUniversalWidgetUserStackBasePayloadDto.CREATOR.createFromParcel(parcel) : null);
            }

            @Override // android.os.Parcelable.Creator
            public final SuperAppUniversalWidgetUserStackDto[] newArray(int i) {
                return new SuperAppUniversalWidgetUserStackDto[i];
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public SuperAppUniversalWidgetUserStackDto() {
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
            if (!(obj instanceof SuperAppUniversalWidgetUserStackDto)) {
                return false;
            }
            SuperAppUniversalWidgetUserStackDto superAppUniversalWidgetUserStackDto = (SuperAppUniversalWidgetUserStackDto) obj;
            return this.type == superAppUniversalWidgetUserStackDto.type && epx.f(this.payload, superAppUniversalWidgetUserStackDto.payload);
        }

        public final int hashCode() {
            TypeDto typeDto = this.type;
            int hashCode = (typeDto == null ? 0 : typeDto.hashCode()) * 31;
            SuperAppUniversalWidgetUserStackBasePayloadDto superAppUniversalWidgetUserStackBasePayloadDto = this.payload;
            return hashCode + (superAppUniversalWidgetUserStackBasePayloadDto != null ? superAppUniversalWidgetUserStackBasePayloadDto.hashCode() : 0);
        }

        public final String toString() {
            return "SuperAppUniversalWidgetUserStackDto(type=" + this.type + ", payload=" + this.payload + ')';
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
            SuperAppUniversalWidgetUserStackBasePayloadDto superAppUniversalWidgetUserStackBasePayloadDto = this.payload;
            if (superAppUniversalWidgetUserStackBasePayloadDto == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                superAppUniversalWidgetUserStackBasePayloadDto.writeToParcel(parcel, i);
            }
        }

        public /* synthetic */ SuperAppUniversalWidgetUserStackDto(TypeDto typeDto, SuperAppUniversalWidgetUserStackBasePayloadDto superAppUniversalWidgetUserStackBasePayloadDto, int i, zcl zclVar) {
            this((i & 1) != 0 ? null : typeDto, (i & 2) != 0 ? null : superAppUniversalWidgetUserStackBasePayloadDto);
        }

        public SuperAppUniversalWidgetUserStackDto(TypeDto typeDto, SuperAppUniversalWidgetUserStackBasePayloadDto superAppUniversalWidgetUserStackBasePayloadDto) {
            super(null);
            this.type = typeDto;
            this.payload = superAppUniversalWidgetUserStackBasePayloadDto;
        }
    }

    public /* synthetic */ SuperAppUniversalWidgetTypeInformerRowRightDto(zcl zclVar) {
        this();
    }

    private SuperAppUniversalWidgetTypeInformerRowRightDto() {
    }
}
