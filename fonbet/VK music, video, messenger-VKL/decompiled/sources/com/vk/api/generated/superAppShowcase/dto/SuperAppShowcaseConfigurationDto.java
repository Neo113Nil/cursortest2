package com.vk.api.generated.superAppShowcase.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.internal.bind.TreeTypeAdapter;
import defpackage.q0;
import xsna.a9y;
import xsna.asp;
import xsna.b9y;
import xsna.epx;
import xsna.go9;
import xsna.ho8;
import xsna.pmi0;
import xsna.qoy;
import xsna.shy;
import xsna.up;
import xsna.vu5;
import xsna.z8y;
import xsna.zcl;
import xsna.zrp;

/* compiled from: SuperAppShowcaseConfigurationDto.kt */
/* loaded from: classes.dex */
public abstract class SuperAppShowcaseConfigurationDto implements Parcelable {

    /* compiled from: SuperAppShowcaseConfigurationDto.kt */
    public static final class Deserializer implements a9y<SuperAppShowcaseConfigurationDto> {
        @Override // xsna.a9y
        public final Object a(b9y b9yVar, z8y z8yVar) {
            String f = up.f(b9yVar, "type");
            if (f != null) {
                int hashCode = f.hashCode();
                if (hashCode != 96965648) {
                    if (hashCode != 1434631203) {
                        if (hashCode == 1795749522 && f.equals("mini_widget_menu")) {
                            return (SuperAppShowcaseConfigurationDto) ((TreeTypeAdapter.a) z8yVar).a(b9yVar, SuperAppShowcaseConfigurationMenuDto.class);
                        }
                    } else if (f.equals("settings")) {
                        return (SuperAppShowcaseConfigurationDto) ((TreeTypeAdapter.a) z8yVar).a(b9yVar, SuperAppShowcaseConfigurationSettingsDto.class);
                    }
                } else if (f.equals("extra")) {
                    return (SuperAppShowcaseConfigurationDto) ((TreeTypeAdapter.a) z8yVar).a(b9yVar, SuperAppShowcaseConfigurationExtraDto.class);
                }
            }
            throw new IllegalStateException(go9.b("no mapping for the type:", f));
        }
    }

    /* compiled from: SuperAppShowcaseConfigurationDto.kt */
    /* loaded from: classes15.dex */
    public static final class SuperAppShowcaseConfigurationExtraDto extends SuperAppShowcaseConfigurationDto implements Parcelable {
        public static final Parcelable.Creator<SuperAppShowcaseConfigurationExtraDto> CREATOR = new a();

        @pmi0("type")
        private final TypeDto type;

        @pmi0("value")
        private final String value;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: SuperAppShowcaseConfigurationDto.kt */
        public static final class TypeDto implements Parcelable {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ TypeDto[] $VALUES;
            public static final Parcelable.Creator<TypeDto> CREATOR;

            @pmi0("extra")
            public static final TypeDto EXTRA;
            private final String value;

            /* compiled from: SuperAppShowcaseConfigurationDto.kt */
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
                TypeDto typeDto = new TypeDto("EXTRA", 0, "extra");
                EXTRA = typeDto;
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

        /* compiled from: SuperAppShowcaseConfigurationDto.kt */
        public static final class a implements Parcelable.Creator<SuperAppShowcaseConfigurationExtraDto> {
            @Override // android.os.Parcelable.Creator
            public final SuperAppShowcaseConfigurationExtraDto createFromParcel(Parcel parcel) {
                return new SuperAppShowcaseConfigurationExtraDto(TypeDto.CREATOR.createFromParcel(parcel), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final SuperAppShowcaseConfigurationExtraDto[] newArray(int i) {
                return new SuperAppShowcaseConfigurationExtraDto[i];
            }
        }

        public SuperAppShowcaseConfigurationExtraDto(TypeDto typeDto, String str) {
            super(null);
            this.type = typeDto;
            this.value = str;
        }

        public final String d() {
            return this.value;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SuperAppShowcaseConfigurationExtraDto)) {
                return false;
            }
            SuperAppShowcaseConfigurationExtraDto superAppShowcaseConfigurationExtraDto = (SuperAppShowcaseConfigurationExtraDto) obj;
            return this.type == superAppShowcaseConfigurationExtraDto.type && epx.f(this.value, superAppShowcaseConfigurationExtraDto.value);
        }

        public final int hashCode() {
            return this.value.hashCode() + (this.type.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("SuperAppShowcaseConfigurationExtraDto(type=");
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

    /* compiled from: SuperAppShowcaseConfigurationDto.kt */
    /* loaded from: classes15.dex */
    public static final class SuperAppShowcaseConfigurationMenuDto extends SuperAppShowcaseConfigurationDto implements Parcelable {
        public static final Parcelable.Creator<SuperAppShowcaseConfigurationMenuDto> CREATOR = new a();

        @pmi0("columns_per_page")
        private final int columnsPerPage;

        @pmi0("has_search")
        private final boolean hasSearch;

        @pmi0("rows_per_page")
        private final int rowsPerPage;

        @pmi0("type")
        private final TypeDto type;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: SuperAppShowcaseConfigurationDto.kt */
        public static final class TypeDto implements Parcelable {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ TypeDto[] $VALUES;
            public static final Parcelable.Creator<TypeDto> CREATOR;

            @pmi0("mini_widget_menu")
            public static final TypeDto MINI_WIDGET_MENU;
            private final String value;

            /* compiled from: SuperAppShowcaseConfigurationDto.kt */
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
                TypeDto typeDto = new TypeDto("MINI_WIDGET_MENU", 0, "mini_widget_menu");
                MINI_WIDGET_MENU = typeDto;
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

        /* compiled from: SuperAppShowcaseConfigurationDto.kt */
        public static final class a implements Parcelable.Creator<SuperAppShowcaseConfigurationMenuDto> {
            @Override // android.os.Parcelable.Creator
            public final SuperAppShowcaseConfigurationMenuDto createFromParcel(Parcel parcel) {
                return new SuperAppShowcaseConfigurationMenuDto(TypeDto.CREATOR.createFromParcel(parcel), parcel.readInt() != 0, parcel.readInt(), parcel.readInt());
            }

            @Override // android.os.Parcelable.Creator
            public final SuperAppShowcaseConfigurationMenuDto[] newArray(int i) {
                return new SuperAppShowcaseConfigurationMenuDto[i];
            }
        }

        public SuperAppShowcaseConfigurationMenuDto(TypeDto typeDto, boolean z, int i, int i2) {
            super(null);
            this.type = typeDto;
            this.hasSearch = z;
            this.rowsPerPage = i;
            this.columnsPerPage = i2;
        }

        public final int d() {
            return this.columnsPerPage;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean e() {
            return this.hasSearch;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SuperAppShowcaseConfigurationMenuDto)) {
                return false;
            }
            SuperAppShowcaseConfigurationMenuDto superAppShowcaseConfigurationMenuDto = (SuperAppShowcaseConfigurationMenuDto) obj;
            return this.type == superAppShowcaseConfigurationMenuDto.type && this.hasSearch == superAppShowcaseConfigurationMenuDto.hasSearch && this.rowsPerPage == superAppShowcaseConfigurationMenuDto.rowsPerPage && this.columnsPerPage == superAppShowcaseConfigurationMenuDto.columnsPerPage;
        }

        public final int f() {
            return this.rowsPerPage;
        }

        public final int hashCode() {
            return Integer.hashCode(this.columnsPerPage) + shy.a(this.rowsPerPage, qoy.b(this.type.hashCode() * 31, 31, this.hasSearch), 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("SuperAppShowcaseConfigurationMenuDto(type=");
            sb.append(this.type);
            sb.append(", hasSearch=");
            sb.append(this.hasSearch);
            sb.append(", rowsPerPage=");
            sb.append(this.rowsPerPage);
            sb.append(", columnsPerPage=");
            return vu5.b(sb, this.columnsPerPage, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            this.type.writeToParcel(parcel, i);
            parcel.writeInt(this.hasSearch ? 1 : 0);
            parcel.writeInt(this.rowsPerPage);
            parcel.writeInt(this.columnsPerPage);
        }
    }

    /* compiled from: SuperAppShowcaseConfigurationDto.kt */
    /* loaded from: classes15.dex */
    public static final class SuperAppShowcaseConfigurationSettingsDto extends SuperAppShowcaseConfigurationDto implements Parcelable {
        public static final Parcelable.Creator<SuperAppShowcaseConfigurationSettingsDto> CREATOR = new a();

        @pmi0("has_settings")
        private final boolean hasSettings;

        @pmi0("type")
        private final TypeDto type;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: SuperAppShowcaseConfigurationDto.kt */
        public static final class TypeDto implements Parcelable {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ TypeDto[] $VALUES;
            public static final Parcelable.Creator<TypeDto> CREATOR;

            @pmi0("settings")
            public static final TypeDto SETTINGS;
            private final String value;

            /* compiled from: SuperAppShowcaseConfigurationDto.kt */
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
                TypeDto typeDto = new TypeDto("SETTINGS", 0, "settings");
                SETTINGS = typeDto;
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

        /* compiled from: SuperAppShowcaseConfigurationDto.kt */
        public static final class a implements Parcelable.Creator<SuperAppShowcaseConfigurationSettingsDto> {
            @Override // android.os.Parcelable.Creator
            public final SuperAppShowcaseConfigurationSettingsDto createFromParcel(Parcel parcel) {
                return new SuperAppShowcaseConfigurationSettingsDto(TypeDto.CREATOR.createFromParcel(parcel), parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final SuperAppShowcaseConfigurationSettingsDto[] newArray(int i) {
                return new SuperAppShowcaseConfigurationSettingsDto[i];
            }
        }

        public SuperAppShowcaseConfigurationSettingsDto(TypeDto typeDto, boolean z) {
            super(null);
            this.type = typeDto;
            this.hasSettings = z;
        }

        public final boolean d() {
            return this.hasSettings;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SuperAppShowcaseConfigurationSettingsDto)) {
                return false;
            }
            SuperAppShowcaseConfigurationSettingsDto superAppShowcaseConfigurationSettingsDto = (SuperAppShowcaseConfigurationSettingsDto) obj;
            return this.type == superAppShowcaseConfigurationSettingsDto.type && this.hasSettings == superAppShowcaseConfigurationSettingsDto.hasSettings;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.hasSettings) + (this.type.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("SuperAppShowcaseConfigurationSettingsDto(type=");
            sb.append(this.type);
            sb.append(", hasSettings=");
            return q0.a(sb, this.hasSettings, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            this.type.writeToParcel(parcel, i);
            parcel.writeInt(this.hasSettings ? 1 : 0);
        }
    }

    public /* synthetic */ SuperAppShowcaseConfigurationDto(zcl zclVar) {
        this();
    }

    private SuperAppShowcaseConfigurationDto() {
    }
}
