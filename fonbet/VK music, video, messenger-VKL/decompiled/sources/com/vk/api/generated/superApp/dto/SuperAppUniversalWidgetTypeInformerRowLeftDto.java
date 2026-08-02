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

/* compiled from: SuperAppUniversalWidgetTypeInformerRowLeftDto.kt */
/* loaded from: classes.dex */
public abstract class SuperAppUniversalWidgetTypeInformerRowLeftDto implements Parcelable {

    /* compiled from: SuperAppUniversalWidgetTypeInformerRowLeftDto.kt */
    public static final class Deserializer implements a9y<SuperAppUniversalWidgetTypeInformerRowLeftDto> {
        @Override // xsna.a9y
        public final Object a(b9y b9yVar, z8y z8yVar) {
            String f = up.f(b9yVar, "type");
            if (epx.f(f, "image")) {
                return (SuperAppUniversalWidgetTypeInformerRowLeftDto) ((TreeTypeAdapter.a) z8yVar).a(b9yVar, SuperAppUniversalWidgetTypeInformerRowImageDto.class);
            }
            if (epx.f(f, "icon")) {
                return (SuperAppUniversalWidgetTypeInformerRowLeftDto) ((TreeTypeAdapter.a) z8yVar).a(b9yVar, SuperAppUniversalWidgetTypeInformerRowIconDto.class);
            }
            throw new IllegalStateException(go9.b("no mapping for the type:", f));
        }
    }

    /* compiled from: SuperAppUniversalWidgetTypeInformerRowLeftDto.kt */
    /* loaded from: classes15.dex */
    public static final class SuperAppUniversalWidgetTypeInformerRowIconDto extends SuperAppUniversalWidgetTypeInformerRowLeftDto implements Parcelable {
        public static final Parcelable.Creator<SuperAppUniversalWidgetTypeInformerRowIconDto> CREATOR = new a();

        @pmi0("badge")
        private final SuperAppUniversalWidgetBaseBadgeDto badge;

        @pmi0("payload")
        private final SuperAppUniversalWidgetIconDto payload;

        @pmi0("type")
        private final TypeDto type;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: SuperAppUniversalWidgetTypeInformerRowLeftDto.kt */
        public static final class TypeDto implements Parcelable {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ TypeDto[] $VALUES;
            public static final Parcelable.Creator<TypeDto> CREATOR;

            @pmi0("icon")
            public static final TypeDto ICON;
            private final String value;

            /* compiled from: SuperAppUniversalWidgetTypeInformerRowLeftDto.kt */
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

        /* compiled from: SuperAppUniversalWidgetTypeInformerRowLeftDto.kt */
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

    /* compiled from: SuperAppUniversalWidgetTypeInformerRowLeftDto.kt */
    /* loaded from: classes15.dex */
    public static final class SuperAppUniversalWidgetTypeInformerRowImageDto extends SuperAppUniversalWidgetTypeInformerRowLeftDto implements Parcelable {
        public static final Parcelable.Creator<SuperAppUniversalWidgetTypeInformerRowImageDto> CREATOR = new a();

        @pmi0("badge")
        private final SuperAppUniversalWidgetBaseBadgeDto badge;

        @pmi0("payload")
        private final SuperAppUniversalWidgetImageBlockDto payload;

        @pmi0("type")
        private final TypeDto type;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: SuperAppUniversalWidgetTypeInformerRowLeftDto.kt */
        public static final class TypeDto implements Parcelable {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ TypeDto[] $VALUES;
            public static final Parcelable.Creator<TypeDto> CREATOR;

            @pmi0("image")
            public static final TypeDto IMAGE;
            private final String value;

            /* compiled from: SuperAppUniversalWidgetTypeInformerRowLeftDto.kt */
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
                TypeDto typeDto = new TypeDto("IMAGE", 0, "image");
                IMAGE = typeDto;
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

        /* compiled from: SuperAppUniversalWidgetTypeInformerRowLeftDto.kt */
        public static final class a implements Parcelable.Creator<SuperAppUniversalWidgetTypeInformerRowImageDto> {
            @Override // android.os.Parcelable.Creator
            public final SuperAppUniversalWidgetTypeInformerRowImageDto createFromParcel(Parcel parcel) {
                return new SuperAppUniversalWidgetTypeInformerRowImageDto(TypeDto.CREATOR.createFromParcel(parcel), (SuperAppUniversalWidgetImageBlockDto) parcel.readParcelable(SuperAppUniversalWidgetTypeInformerRowImageDto.class.getClassLoader()), parcel.readInt() == 0 ? null : SuperAppUniversalWidgetBaseBadgeDto.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final SuperAppUniversalWidgetTypeInformerRowImageDto[] newArray(int i) {
                return new SuperAppUniversalWidgetTypeInformerRowImageDto[i];
            }
        }

        public /* synthetic */ SuperAppUniversalWidgetTypeInformerRowImageDto(TypeDto typeDto, SuperAppUniversalWidgetImageBlockDto superAppUniversalWidgetImageBlockDto, SuperAppUniversalWidgetBaseBadgeDto superAppUniversalWidgetBaseBadgeDto, int i, zcl zclVar) {
            this(typeDto, (i & 2) != 0 ? null : superAppUniversalWidgetImageBlockDto, (i & 4) != 0 ? null : superAppUniversalWidgetBaseBadgeDto);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SuperAppUniversalWidgetTypeInformerRowImageDto)) {
                return false;
            }
            SuperAppUniversalWidgetTypeInformerRowImageDto superAppUniversalWidgetTypeInformerRowImageDto = (SuperAppUniversalWidgetTypeInformerRowImageDto) obj;
            return this.type == superAppUniversalWidgetTypeInformerRowImageDto.type && epx.f(this.payload, superAppUniversalWidgetTypeInformerRowImageDto.payload) && epx.f(this.badge, superAppUniversalWidgetTypeInformerRowImageDto.badge);
        }

        public final int hashCode() {
            int hashCode = this.type.hashCode() * 31;
            SuperAppUniversalWidgetImageBlockDto superAppUniversalWidgetImageBlockDto = this.payload;
            int hashCode2 = (hashCode + (superAppUniversalWidgetImageBlockDto == null ? 0 : superAppUniversalWidgetImageBlockDto.hashCode())) * 31;
            SuperAppUniversalWidgetBaseBadgeDto superAppUniversalWidgetBaseBadgeDto = this.badge;
            return hashCode2 + (superAppUniversalWidgetBaseBadgeDto != null ? superAppUniversalWidgetBaseBadgeDto.hashCode() : 0);
        }

        public final String toString() {
            return "SuperAppUniversalWidgetTypeInformerRowImageDto(type=" + this.type + ", payload=" + this.payload + ", badge=" + this.badge + ')';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            this.type.writeToParcel(parcel, i);
            parcel.writeParcelable(this.payload, i);
            SuperAppUniversalWidgetBaseBadgeDto superAppUniversalWidgetBaseBadgeDto = this.badge;
            if (superAppUniversalWidgetBaseBadgeDto == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                superAppUniversalWidgetBaseBadgeDto.writeToParcel(parcel, i);
            }
        }

        public SuperAppUniversalWidgetTypeInformerRowImageDto(TypeDto typeDto, SuperAppUniversalWidgetImageBlockDto superAppUniversalWidgetImageBlockDto, SuperAppUniversalWidgetBaseBadgeDto superAppUniversalWidgetBaseBadgeDto) {
            super(null);
            this.type = typeDto;
            this.payload = superAppUniversalWidgetImageBlockDto;
            this.badge = superAppUniversalWidgetBaseBadgeDto;
        }
    }

    public /* synthetic */ SuperAppUniversalWidgetTypeInformerRowLeftDto(zcl zclVar) {
        this();
    }

    private SuperAppUniversalWidgetTypeInformerRowLeftDto() {
    }
}
