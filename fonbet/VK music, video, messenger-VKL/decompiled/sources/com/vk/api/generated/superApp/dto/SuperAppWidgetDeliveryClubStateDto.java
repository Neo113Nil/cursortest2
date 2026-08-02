package com.vk.api.generated.superApp.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.internal.bind.TreeTypeAdapter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.a9y;
import xsna.ao;
import xsna.asp;
import xsna.b9y;
import xsna.en;
import xsna.epx;
import xsna.fw3;
import xsna.go9;
import xsna.ho8;
import xsna.pmi0;
import xsna.qoy;
import xsna.sn;
import xsna.tn;
import xsna.up;
import xsna.urd0;
import xsna.z8y;
import xsna.zcl;
import xsna.zrp;

/* compiled from: SuperAppWidgetDeliveryClubStateDto.kt */
/* loaded from: classes.dex */
public abstract class SuperAppWidgetDeliveryClubStateDto implements Parcelable {

    /* compiled from: SuperAppWidgetDeliveryClubStateDto.kt */
    public static final class Deserializer implements a9y<SuperAppWidgetDeliveryClubStateDto> {
        @Override // xsna.a9y
        public final Object a(b9y b9yVar, z8y z8yVar) {
            String f = up.f(b9yVar, "type");
            if (epx.f(f, "restaurants")) {
                return (SuperAppWidgetDeliveryClubStateDto) ((TreeTypeAdapter.a) z8yVar).a(b9yVar, SuperAppWidgetDeliveryClubStateRestaurantsDto.class);
            }
            if (epx.f(f, "request_geo")) {
                return (SuperAppWidgetDeliveryClubStateDto) ((TreeTypeAdapter.a) z8yVar).a(b9yVar, SuperAppWidgetDeliveryClubStateRequestGeoDto.class);
            }
            throw new IllegalStateException(go9.b("no mapping for the type:", f));
        }
    }

    /* compiled from: SuperAppWidgetDeliveryClubStateDto.kt */
    /* loaded from: classes15.dex */
    public static final class SuperAppWidgetDeliveryClubStateRequestGeoDto extends SuperAppWidgetDeliveryClubStateDto implements Parcelable {
        public static final Parcelable.Creator<SuperAppWidgetDeliveryClubStateRequestGeoDto> CREATOR = new a();

        @pmi0("button_label")
        private final String buttonLabel;

        @pmi0("label")
        private final String label;

        @pmi0("type")
        private final TypeDto type;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: SuperAppWidgetDeliveryClubStateDto.kt */
        public static final class TypeDto implements Parcelable {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ TypeDto[] $VALUES;
            public static final Parcelable.Creator<TypeDto> CREATOR;

            @pmi0("request_geo")
            public static final TypeDto REQUEST_GEO;
            private final String value;

            /* compiled from: SuperAppWidgetDeliveryClubStateDto.kt */
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
                TypeDto typeDto = new TypeDto("REQUEST_GEO", 0, "request_geo");
                REQUEST_GEO = typeDto;
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

        /* compiled from: SuperAppWidgetDeliveryClubStateDto.kt */
        public static final class a implements Parcelable.Creator<SuperAppWidgetDeliveryClubStateRequestGeoDto> {
            @Override // android.os.Parcelable.Creator
            public final SuperAppWidgetDeliveryClubStateRequestGeoDto createFromParcel(Parcel parcel) {
                return new SuperAppWidgetDeliveryClubStateRequestGeoDto(TypeDto.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final SuperAppWidgetDeliveryClubStateRequestGeoDto[] newArray(int i) {
                return new SuperAppWidgetDeliveryClubStateRequestGeoDto[i];
            }
        }

        public SuperAppWidgetDeliveryClubStateRequestGeoDto(TypeDto typeDto, String str, String str2) {
            super(null);
            this.type = typeDto;
            this.label = str;
            this.buttonLabel = str2;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SuperAppWidgetDeliveryClubStateRequestGeoDto)) {
                return false;
            }
            SuperAppWidgetDeliveryClubStateRequestGeoDto superAppWidgetDeliveryClubStateRequestGeoDto = (SuperAppWidgetDeliveryClubStateRequestGeoDto) obj;
            return this.type == superAppWidgetDeliveryClubStateRequestGeoDto.type && epx.f(this.label, superAppWidgetDeliveryClubStateRequestGeoDto.label) && epx.f(this.buttonLabel, superAppWidgetDeliveryClubStateRequestGeoDto.buttonLabel);
        }

        public final int hashCode() {
            return this.buttonLabel.hashCode() + urd0.a(this.type.hashCode() * 31, 31, this.label);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("SuperAppWidgetDeliveryClubStateRequestGeoDto(type=");
            sb.append(this.type);
            sb.append(", label=");
            sb.append(this.label);
            sb.append(", buttonLabel=");
            return ho8.a(sb, this.buttonLabel, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            this.type.writeToParcel(parcel, i);
            parcel.writeString(this.label);
            parcel.writeString(this.buttonLabel);
        }
    }

    /* compiled from: SuperAppWidgetDeliveryClubStateDto.kt */
    /* loaded from: classes15.dex */
    public static final class SuperAppWidgetDeliveryClubStateRestaurantsDto extends SuperAppWidgetDeliveryClubStateDto implements Parcelable {
        public static final Parcelable.Creator<SuperAppWidgetDeliveryClubStateRestaurantsDto> CREATOR = new a();

        @pmi0("is_full_image")
        private final Boolean isFullImage;

        @pmi0("items")
        private final List<SuperAppWidgetDeliveryClubRestaurantDto> items;

        @pmi0("skeleton")
        private final boolean skeleton;

        @pmi0("type")
        private final TypeDto type;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: SuperAppWidgetDeliveryClubStateDto.kt */
        public static final class TypeDto implements Parcelable {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ TypeDto[] $VALUES;
            public static final Parcelable.Creator<TypeDto> CREATOR;

            @pmi0("restaurants")
            public static final TypeDto RESTAURANTS;
            private final String value;

            /* compiled from: SuperAppWidgetDeliveryClubStateDto.kt */
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
                TypeDto typeDto = new TypeDto("RESTAURANTS", 0, "restaurants");
                RESTAURANTS = typeDto;
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

        /* compiled from: SuperAppWidgetDeliveryClubStateDto.kt */
        public static final class a implements Parcelable.Creator<SuperAppWidgetDeliveryClubStateRestaurantsDto> {
            @Override // android.os.Parcelable.Creator
            public final SuperAppWidgetDeliveryClubStateRestaurantsDto createFromParcel(Parcel parcel) {
                Boolean valueOf;
                TypeDto createFromParcel = TypeDto.CREATOR.createFromParcel(parcel);
                int readInt = parcel.readInt();
                ArrayList arrayList = new ArrayList(readInt);
                int i = 0;
                while (i != readInt) {
                    i = en.a(SuperAppWidgetDeliveryClubRestaurantDto.CREATOR, parcel, arrayList, i, 1);
                }
                boolean z = parcel.readInt() != 0;
                if (parcel.readInt() == 0) {
                    valueOf = null;
                } else {
                    valueOf = Boolean.valueOf(parcel.readInt() != 0);
                }
                return new SuperAppWidgetDeliveryClubStateRestaurantsDto(createFromParcel, arrayList, z, valueOf);
            }

            @Override // android.os.Parcelable.Creator
            public final SuperAppWidgetDeliveryClubStateRestaurantsDto[] newArray(int i) {
                return new SuperAppWidgetDeliveryClubStateRestaurantsDto[i];
            }
        }

        public /* synthetic */ SuperAppWidgetDeliveryClubStateRestaurantsDto(TypeDto typeDto, List list, boolean z, Boolean bool, int i, zcl zclVar) {
            this(typeDto, list, z, (i & 8) != 0 ? null : bool);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SuperAppWidgetDeliveryClubStateRestaurantsDto)) {
                return false;
            }
            SuperAppWidgetDeliveryClubStateRestaurantsDto superAppWidgetDeliveryClubStateRestaurantsDto = (SuperAppWidgetDeliveryClubStateRestaurantsDto) obj;
            return this.type == superAppWidgetDeliveryClubStateRestaurantsDto.type && epx.f(this.items, superAppWidgetDeliveryClubStateRestaurantsDto.items) && this.skeleton == superAppWidgetDeliveryClubStateRestaurantsDto.skeleton && epx.f(this.isFullImage, superAppWidgetDeliveryClubStateRestaurantsDto.isFullImage);
        }

        public final int hashCode() {
            int b = qoy.b(fw3.a(this.type.hashCode() * 31, 31, this.items), 31, this.skeleton);
            Boolean bool = this.isFullImage;
            return b + (bool == null ? 0 : bool.hashCode());
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("SuperAppWidgetDeliveryClubStateRestaurantsDto(type=");
            sb.append(this.type);
            sb.append(", items=");
            sb.append(this.items);
            sb.append(", skeleton=");
            sb.append(this.skeleton);
            sb.append(", isFullImage=");
            return tn.a(sb, this.isFullImage, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            this.type.writeToParcel(parcel, i);
            Iterator a2 = ao.a(parcel, this.items);
            while (a2.hasNext()) {
                ((SuperAppWidgetDeliveryClubRestaurantDto) a2.next()).writeToParcel(parcel, i);
            }
            parcel.writeInt(this.skeleton ? 1 : 0);
            Boolean bool = this.isFullImage;
            if (bool == null) {
                parcel.writeInt(0);
            } else {
                sn.f(parcel, 1, bool);
            }
        }

        public SuperAppWidgetDeliveryClubStateRestaurantsDto(TypeDto typeDto, List<SuperAppWidgetDeliveryClubRestaurantDto> list, boolean z, Boolean bool) {
            super(null);
            this.type = typeDto;
            this.items = list;
            this.skeleton = z;
            this.isFullImage = bool;
        }
    }

    public /* synthetic */ SuperAppWidgetDeliveryClubStateDto(zcl zclVar) {
        this();
    }

    private SuperAppWidgetDeliveryClubStateDto() {
    }
}
