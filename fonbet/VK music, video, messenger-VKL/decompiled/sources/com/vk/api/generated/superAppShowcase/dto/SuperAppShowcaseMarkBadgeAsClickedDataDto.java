package com.vk.api.generated.superAppShowcase.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.internal.bind.TreeTypeAdapter;
import com.vk.api.generated.superApp.dto.SuperAppBadgeInfoDto;
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

/* compiled from: SuperAppShowcaseMarkBadgeAsClickedDataDto.kt */
/* loaded from: classes.dex */
public abstract class SuperAppShowcaseMarkBadgeAsClickedDataDto implements Parcelable {

    /* compiled from: SuperAppShowcaseMarkBadgeAsClickedDataDto.kt */
    public static final class Deserializer implements a9y<SuperAppShowcaseMarkBadgeAsClickedDataDto> {
        @Override // xsna.a9y
        public final Object a(b9y b9yVar, z8y z8yVar) {
            String f = up.f(b9yVar, "type");
            if (epx.f(f, "showcase_menu")) {
                return (SuperAppShowcaseMarkBadgeAsClickedDataDto) ((TreeTypeAdapter.a) z8yVar).a(b9yVar, SuperAppShowcaseMarkBadgeAsClickedShowcaseMenuDataDto.class);
            }
            if (epx.f(f, "services_menu")) {
                return (SuperAppShowcaseMarkBadgeAsClickedDataDto) ((TreeTypeAdapter.a) z8yVar).a(b9yVar, SuperAppShowcaseMarkBadgeAsClickedServicesMenuDataDto.class);
            }
            throw new IllegalStateException(go9.b("no mapping for the type:", f));
        }
    }

    /* compiled from: SuperAppShowcaseMarkBadgeAsClickedDataDto.kt */
    /* loaded from: classes15.dex */
    public static final class SuperAppShowcaseMarkBadgeAsClickedServicesMenuDataDto extends SuperAppShowcaseMarkBadgeAsClickedDataDto implements Parcelable {
        public static final Parcelable.Creator<SuperAppShowcaseMarkBadgeAsClickedServicesMenuDataDto> CREATOR = new a();

        @pmi0("badge")
        private final SuperAppShowcaseServicesMenuBadgeDto badge;

        @pmi0("type")
        private final TypeDto type;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: SuperAppShowcaseMarkBadgeAsClickedDataDto.kt */
        public static final class TypeDto implements Parcelable {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ TypeDto[] $VALUES;
            public static final Parcelable.Creator<TypeDto> CREATOR;

            @pmi0("services_menu")
            public static final TypeDto SERVICES_MENU;
            private final String value;

            /* compiled from: SuperAppShowcaseMarkBadgeAsClickedDataDto.kt */
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
                TypeDto typeDto = new TypeDto("SERVICES_MENU", 0, "services_menu");
                SERVICES_MENU = typeDto;
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

        /* compiled from: SuperAppShowcaseMarkBadgeAsClickedDataDto.kt */
        public static final class a implements Parcelable.Creator<SuperAppShowcaseMarkBadgeAsClickedServicesMenuDataDto> {
            @Override // android.os.Parcelable.Creator
            public final SuperAppShowcaseMarkBadgeAsClickedServicesMenuDataDto createFromParcel(Parcel parcel) {
                return new SuperAppShowcaseMarkBadgeAsClickedServicesMenuDataDto(TypeDto.CREATOR.createFromParcel(parcel), (SuperAppShowcaseServicesMenuBadgeDto) parcel.readParcelable(SuperAppShowcaseMarkBadgeAsClickedServicesMenuDataDto.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final SuperAppShowcaseMarkBadgeAsClickedServicesMenuDataDto[] newArray(int i) {
                return new SuperAppShowcaseMarkBadgeAsClickedServicesMenuDataDto[i];
            }
        }

        public /* synthetic */ SuperAppShowcaseMarkBadgeAsClickedServicesMenuDataDto(TypeDto typeDto, SuperAppShowcaseServicesMenuBadgeDto superAppShowcaseServicesMenuBadgeDto, int i, zcl zclVar) {
            this(typeDto, (i & 2) != 0 ? null : superAppShowcaseServicesMenuBadgeDto);
        }

        public final SuperAppShowcaseServicesMenuBadgeDto d() {
            return this.badge;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SuperAppShowcaseMarkBadgeAsClickedServicesMenuDataDto)) {
                return false;
            }
            SuperAppShowcaseMarkBadgeAsClickedServicesMenuDataDto superAppShowcaseMarkBadgeAsClickedServicesMenuDataDto = (SuperAppShowcaseMarkBadgeAsClickedServicesMenuDataDto) obj;
            return this.type == superAppShowcaseMarkBadgeAsClickedServicesMenuDataDto.type && epx.f(this.badge, superAppShowcaseMarkBadgeAsClickedServicesMenuDataDto.badge);
        }

        public final int hashCode() {
            int hashCode = this.type.hashCode() * 31;
            SuperAppShowcaseServicesMenuBadgeDto superAppShowcaseServicesMenuBadgeDto = this.badge;
            return hashCode + (superAppShowcaseServicesMenuBadgeDto == null ? 0 : superAppShowcaseServicesMenuBadgeDto.hashCode());
        }

        public final String toString() {
            return "SuperAppShowcaseMarkBadgeAsClickedServicesMenuDataDto(type=" + this.type + ", badge=" + this.badge + ')';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            this.type.writeToParcel(parcel, i);
            parcel.writeParcelable(this.badge, i);
        }

        public SuperAppShowcaseMarkBadgeAsClickedServicesMenuDataDto(TypeDto typeDto, SuperAppShowcaseServicesMenuBadgeDto superAppShowcaseServicesMenuBadgeDto) {
            super(null);
            this.type = typeDto;
            this.badge = superAppShowcaseServicesMenuBadgeDto;
        }
    }

    /* compiled from: SuperAppShowcaseMarkBadgeAsClickedDataDto.kt */
    /* loaded from: classes15.dex */
    public static final class SuperAppShowcaseMarkBadgeAsClickedShowcaseMenuDataDto extends SuperAppShowcaseMarkBadgeAsClickedDataDto implements Parcelable {
        public static final Parcelable.Creator<SuperAppShowcaseMarkBadgeAsClickedShowcaseMenuDataDto> CREATOR = new a();

        @pmi0("badge_info")
        private final SuperAppBadgeInfoDto badgeInfo;

        @pmi0("type")
        private final TypeDto type;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: SuperAppShowcaseMarkBadgeAsClickedDataDto.kt */
        public static final class TypeDto implements Parcelable {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ TypeDto[] $VALUES;
            public static final Parcelable.Creator<TypeDto> CREATOR;

            @pmi0("showcase_menu")
            public static final TypeDto SHOWCASE_MENU;
            private final String value;

            /* compiled from: SuperAppShowcaseMarkBadgeAsClickedDataDto.kt */
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
                TypeDto typeDto = new TypeDto("SHOWCASE_MENU", 0, "showcase_menu");
                SHOWCASE_MENU = typeDto;
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

        /* compiled from: SuperAppShowcaseMarkBadgeAsClickedDataDto.kt */
        public static final class a implements Parcelable.Creator<SuperAppShowcaseMarkBadgeAsClickedShowcaseMenuDataDto> {
            @Override // android.os.Parcelable.Creator
            public final SuperAppShowcaseMarkBadgeAsClickedShowcaseMenuDataDto createFromParcel(Parcel parcel) {
                return new SuperAppShowcaseMarkBadgeAsClickedShowcaseMenuDataDto(TypeDto.CREATOR.createFromParcel(parcel), (SuperAppBadgeInfoDto) parcel.readParcelable(SuperAppShowcaseMarkBadgeAsClickedShowcaseMenuDataDto.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final SuperAppShowcaseMarkBadgeAsClickedShowcaseMenuDataDto[] newArray(int i) {
                return new SuperAppShowcaseMarkBadgeAsClickedShowcaseMenuDataDto[i];
            }
        }

        public /* synthetic */ SuperAppShowcaseMarkBadgeAsClickedShowcaseMenuDataDto(TypeDto typeDto, SuperAppBadgeInfoDto superAppBadgeInfoDto, int i, zcl zclVar) {
            this(typeDto, (i & 2) != 0 ? null : superAppBadgeInfoDto);
        }

        public final SuperAppBadgeInfoDto d() {
            return this.badgeInfo;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SuperAppShowcaseMarkBadgeAsClickedShowcaseMenuDataDto)) {
                return false;
            }
            SuperAppShowcaseMarkBadgeAsClickedShowcaseMenuDataDto superAppShowcaseMarkBadgeAsClickedShowcaseMenuDataDto = (SuperAppShowcaseMarkBadgeAsClickedShowcaseMenuDataDto) obj;
            return this.type == superAppShowcaseMarkBadgeAsClickedShowcaseMenuDataDto.type && epx.f(this.badgeInfo, superAppShowcaseMarkBadgeAsClickedShowcaseMenuDataDto.badgeInfo);
        }

        public final int hashCode() {
            int hashCode = this.type.hashCode() * 31;
            SuperAppBadgeInfoDto superAppBadgeInfoDto = this.badgeInfo;
            return hashCode + (superAppBadgeInfoDto == null ? 0 : superAppBadgeInfoDto.hashCode());
        }

        public final String toString() {
            return "SuperAppShowcaseMarkBadgeAsClickedShowcaseMenuDataDto(type=" + this.type + ", badgeInfo=" + this.badgeInfo + ')';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            this.type.writeToParcel(parcel, i);
            parcel.writeParcelable(this.badgeInfo, i);
        }

        public SuperAppShowcaseMarkBadgeAsClickedShowcaseMenuDataDto(TypeDto typeDto, SuperAppBadgeInfoDto superAppBadgeInfoDto) {
            super(null);
            this.type = typeDto;
            this.badgeInfo = superAppBadgeInfoDto;
        }
    }

    public /* synthetic */ SuperAppShowcaseMarkBadgeAsClickedDataDto(zcl zclVar) {
        this();
    }

    private SuperAppShowcaseMarkBadgeAsClickedDataDto() {
    }
}
