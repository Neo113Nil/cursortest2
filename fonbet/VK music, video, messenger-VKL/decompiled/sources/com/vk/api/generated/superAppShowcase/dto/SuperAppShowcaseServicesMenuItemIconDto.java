package com.vk.api.generated.superAppShowcase.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.internal.bind.TreeTypeAdapter;
import com.vk.api.generated.superApp.dto.SuperAppUniversalWidgetImageItemDto;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.a9y;
import xsna.ao;
import xsna.asp;
import xsna.b9y;
import xsna.en;
import xsna.epx;
import xsna.go9;
import xsna.ho8;
import xsna.ms9;
import xsna.pmi0;
import xsna.up;
import xsna.z8y;
import xsna.zcl;
import xsna.zrp;

/* compiled from: SuperAppShowcaseServicesMenuItemIconDto.kt */
/* loaded from: classes.dex */
public abstract class SuperAppShowcaseServicesMenuItemIconDto implements Parcelable {

    /* compiled from: SuperAppShowcaseServicesMenuItemIconDto.kt */
    public static final class Deserializer implements a9y<SuperAppShowcaseServicesMenuItemIconDto> {
        @Override // xsna.a9y
        public final Object a(b9y b9yVar, z8y z8yVar) {
            String f = up.f(b9yVar, "type");
            if (epx.f(f, "image")) {
                return (SuperAppShowcaseServicesMenuItemIconDto) ((TreeTypeAdapter.a) z8yVar).a(b9yVar, SuperAppShowcaseServicesMenuItemIconImageDto.class);
            }
            if (epx.f(f, "id")) {
                return (SuperAppShowcaseServicesMenuItemIconDto) ((TreeTypeAdapter.a) z8yVar).a(b9yVar, SuperAppShowcaseServicesMenuItemIconIdDto.class);
            }
            throw new IllegalStateException(go9.b("no mapping for the type:", f));
        }
    }

    /* compiled from: SuperAppShowcaseServicesMenuItemIconDto.kt */
    /* loaded from: classes15.dex */
    public static final class SuperAppShowcaseServicesMenuItemIconIdDto extends SuperAppShowcaseServicesMenuItemIconDto implements Parcelable {
        public static final Parcelable.Creator<SuperAppShowcaseServicesMenuItemIconIdDto> CREATOR = new a();

        @pmi0("icon_id")
        private final String iconId;

        @pmi0("type")
        private final TypeDto type;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: SuperAppShowcaseServicesMenuItemIconDto.kt */
        public static final class TypeDto implements Parcelable {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ TypeDto[] $VALUES;
            public static final Parcelable.Creator<TypeDto> CREATOR;

            @pmi0("id")
            public static final TypeDto ID;
            private final String value;

            /* compiled from: SuperAppShowcaseServicesMenuItemIconDto.kt */
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
                TypeDto typeDto = new TypeDto("ID", 0, "id");
                ID = typeDto;
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

        /* compiled from: SuperAppShowcaseServicesMenuItemIconDto.kt */
        public static final class a implements Parcelable.Creator<SuperAppShowcaseServicesMenuItemIconIdDto> {
            @Override // android.os.Parcelable.Creator
            public final SuperAppShowcaseServicesMenuItemIconIdDto createFromParcel(Parcel parcel) {
                return new SuperAppShowcaseServicesMenuItemIconIdDto(TypeDto.CREATOR.createFromParcel(parcel), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final SuperAppShowcaseServicesMenuItemIconIdDto[] newArray(int i) {
                return new SuperAppShowcaseServicesMenuItemIconIdDto[i];
            }
        }

        public SuperAppShowcaseServicesMenuItemIconIdDto(TypeDto typeDto, String str) {
            super(null);
            this.type = typeDto;
            this.iconId = str;
        }

        public final String d() {
            return this.iconId;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SuperAppShowcaseServicesMenuItemIconIdDto)) {
                return false;
            }
            SuperAppShowcaseServicesMenuItemIconIdDto superAppShowcaseServicesMenuItemIconIdDto = (SuperAppShowcaseServicesMenuItemIconIdDto) obj;
            return this.type == superAppShowcaseServicesMenuItemIconIdDto.type && epx.f(this.iconId, superAppShowcaseServicesMenuItemIconIdDto.iconId);
        }

        public final int hashCode() {
            return this.iconId.hashCode() + (this.type.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("SuperAppShowcaseServicesMenuItemIconIdDto(type=");
            sb.append(this.type);
            sb.append(", iconId=");
            return ho8.a(sb, this.iconId, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            this.type.writeToParcel(parcel, i);
            parcel.writeString(this.iconId);
        }
    }

    /* compiled from: SuperAppShowcaseServicesMenuItemIconDto.kt */
    /* loaded from: classes15.dex */
    public static final class SuperAppShowcaseServicesMenuItemIconImageDto extends SuperAppShowcaseServicesMenuItemIconDto implements Parcelable {
        public static final Parcelable.Creator<SuperAppShowcaseServicesMenuItemIconImageDto> CREATOR = new a();

        @pmi0("images")
        private final List<SuperAppUniversalWidgetImageItemDto> images;

        @pmi0("type")
        private final TypeDto type;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: SuperAppShowcaseServicesMenuItemIconDto.kt */
        public static final class TypeDto implements Parcelable {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ TypeDto[] $VALUES;
            public static final Parcelable.Creator<TypeDto> CREATOR;

            @pmi0("image")
            public static final TypeDto IMAGE;
            private final String value;

            /* compiled from: SuperAppShowcaseServicesMenuItemIconDto.kt */
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

        /* compiled from: SuperAppShowcaseServicesMenuItemIconDto.kt */
        public static final class a implements Parcelable.Creator<SuperAppShowcaseServicesMenuItemIconImageDto> {
            @Override // android.os.Parcelable.Creator
            public final SuperAppShowcaseServicesMenuItemIconImageDto createFromParcel(Parcel parcel) {
                TypeDto createFromParcel = TypeDto.CREATOR.createFromParcel(parcel);
                int readInt = parcel.readInt();
                ArrayList arrayList = new ArrayList(readInt);
                int i = 0;
                while (i != readInt) {
                    i = en.a(SuperAppUniversalWidgetImageItemDto.CREATOR, parcel, arrayList, i, 1);
                }
                return new SuperAppShowcaseServicesMenuItemIconImageDto(createFromParcel, arrayList);
            }

            @Override // android.os.Parcelable.Creator
            public final SuperAppShowcaseServicesMenuItemIconImageDto[] newArray(int i) {
                return new SuperAppShowcaseServicesMenuItemIconImageDto[i];
            }
        }

        public SuperAppShowcaseServicesMenuItemIconImageDto(TypeDto typeDto, List<SuperAppUniversalWidgetImageItemDto> list) {
            super(null);
            this.type = typeDto;
            this.images = list;
        }

        public final List<SuperAppUniversalWidgetImageItemDto> d() {
            return this.images;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SuperAppShowcaseServicesMenuItemIconImageDto)) {
                return false;
            }
            SuperAppShowcaseServicesMenuItemIconImageDto superAppShowcaseServicesMenuItemIconImageDto = (SuperAppShowcaseServicesMenuItemIconImageDto) obj;
            return this.type == superAppShowcaseServicesMenuItemIconImageDto.type && epx.f(this.images, superAppShowcaseServicesMenuItemIconImageDto.images);
        }

        public final int hashCode() {
            return this.images.hashCode() + (this.type.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("SuperAppShowcaseServicesMenuItemIconImageDto(type=");
            sb.append(this.type);
            sb.append(", images=");
            return ms9.a(')', sb, this.images);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            this.type.writeToParcel(parcel, i);
            Iterator a2 = ao.a(parcel, this.images);
            while (a2.hasNext()) {
                ((SuperAppUniversalWidgetImageItemDto) a2.next()).writeToParcel(parcel, i);
            }
        }
    }

    public /* synthetic */ SuperAppShowcaseServicesMenuItemIconDto(zcl zclVar) {
        this();
    }

    private SuperAppShowcaseServicesMenuItemIconDto() {
    }
}
