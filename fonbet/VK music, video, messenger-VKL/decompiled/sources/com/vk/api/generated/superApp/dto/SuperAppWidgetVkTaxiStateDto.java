package com.vk.api.generated.superApp.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.internal.bind.TreeTypeAdapter;
import defpackage.q0;
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
import xsna.up;
import xsna.urd0;
import xsna.z8y;
import xsna.zcl;
import xsna.zrp;

/* compiled from: SuperAppWidgetVkTaxiStateDto.kt */
/* loaded from: classes.dex */
public abstract class SuperAppWidgetVkTaxiStateDto implements Parcelable {

    /* compiled from: SuperAppWidgetVkTaxiStateDto.kt */
    public static final class Deserializer implements a9y<SuperAppWidgetVkTaxiStateDto> {
        @Override // xsna.a9y
        public final Object a(b9y b9yVar, z8y z8yVar) {
            String f = up.f(b9yVar, "type");
            if (f != null) {
                int hashCode = f.hashCode();
                if (hashCode != -1621680568) {
                    if (hashCode != 1041371651) {
                        if (hashCode == 1150407073 && f.equals("request_geo")) {
                            return (SuperAppWidgetVkTaxiStateDto) ((TreeTypeAdapter.a) z8yVar).a(b9yVar, SuperAppWidgetVkTaxiStateRequestGeoDto.class);
                        }
                    } else if (f.equals("order_status")) {
                        return (SuperAppWidgetVkTaxiStateDto) ((TreeTypeAdapter.a) z8yVar).a(b9yVar, SuperAppWidgetVkTaxiStateOrderStatusDto.class);
                    }
                } else if (f.equals("rides_suggestion")) {
                    return (SuperAppWidgetVkTaxiStateDto) ((TreeTypeAdapter.a) z8yVar).a(b9yVar, SuperAppWidgetVkTaxiStateRidesSuggestionDto.class);
                }
            }
            throw new IllegalStateException(go9.b("no mapping for the type:", f));
        }
    }

    /* compiled from: SuperAppWidgetVkTaxiStateDto.kt */
    /* loaded from: classes15.dex */
    public static final class SuperAppWidgetVkTaxiStateOrderStatusDto extends SuperAppWidgetVkTaxiStateDto implements Parcelable {
        public static final Parcelable.Creator<SuperAppWidgetVkTaxiStateOrderStatusDto> CREATOR = new a();

        @pmi0("action_button")
        private final SuperAppWidgetActionButtonDto actionButton;

        @pmi0("car_info")
        private final String carInfo;

        @pmi0("car_number")
        private final String carNumber;

        @pmi0("ride_status")
        private final String rideStatus;

        @pmi0("subtitle")
        private final String subtitle;

        @pmi0("type")
        private final TypeDto type;

        @pmi0("warning_text")
        private final String warningText;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: SuperAppWidgetVkTaxiStateDto.kt */
        public static final class TypeDto implements Parcelable {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ TypeDto[] $VALUES;
            public static final Parcelable.Creator<TypeDto> CREATOR;

            @pmi0("order_status")
            public static final TypeDto ORDER_STATUS;
            private final String value;

            /* compiled from: SuperAppWidgetVkTaxiStateDto.kt */
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
                TypeDto typeDto = new TypeDto("ORDER_STATUS", 0, "order_status");
                ORDER_STATUS = typeDto;
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

        /* compiled from: SuperAppWidgetVkTaxiStateDto.kt */
        public static final class a implements Parcelable.Creator<SuperAppWidgetVkTaxiStateOrderStatusDto> {
            @Override // android.os.Parcelable.Creator
            public final SuperAppWidgetVkTaxiStateOrderStatusDto createFromParcel(Parcel parcel) {
                return new SuperAppWidgetVkTaxiStateOrderStatusDto(TypeDto.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : SuperAppWidgetActionButtonDto.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final SuperAppWidgetVkTaxiStateOrderStatusDto[] newArray(int i) {
                return new SuperAppWidgetVkTaxiStateOrderStatusDto[i];
            }
        }

        public /* synthetic */ SuperAppWidgetVkTaxiStateOrderStatusDto(TypeDto typeDto, String str, String str2, String str3, String str4, String str5, SuperAppWidgetActionButtonDto superAppWidgetActionButtonDto, int i, zcl zclVar) {
            this(typeDto, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : str4, (i & 32) != 0 ? null : str5, (i & 64) != 0 ? null : superAppWidgetActionButtonDto);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SuperAppWidgetVkTaxiStateOrderStatusDto)) {
                return false;
            }
            SuperAppWidgetVkTaxiStateOrderStatusDto superAppWidgetVkTaxiStateOrderStatusDto = (SuperAppWidgetVkTaxiStateOrderStatusDto) obj;
            return this.type == superAppWidgetVkTaxiStateOrderStatusDto.type && epx.f(this.rideStatus, superAppWidgetVkTaxiStateOrderStatusDto.rideStatus) && epx.f(this.subtitle, superAppWidgetVkTaxiStateOrderStatusDto.subtitle) && epx.f(this.warningText, superAppWidgetVkTaxiStateOrderStatusDto.warningText) && epx.f(this.carNumber, superAppWidgetVkTaxiStateOrderStatusDto.carNumber) && epx.f(this.carInfo, superAppWidgetVkTaxiStateOrderStatusDto.carInfo) && epx.f(this.actionButton, superAppWidgetVkTaxiStateOrderStatusDto.actionButton);
        }

        public final int hashCode() {
            int hashCode = this.type.hashCode() * 31;
            String str = this.rideStatus;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.subtitle;
            int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.warningText;
            int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.carNumber;
            int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.carInfo;
            int hashCode6 = (hashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
            SuperAppWidgetActionButtonDto superAppWidgetActionButtonDto = this.actionButton;
            return hashCode6 + (superAppWidgetActionButtonDto != null ? superAppWidgetActionButtonDto.hashCode() : 0);
        }

        public final String toString() {
            return "SuperAppWidgetVkTaxiStateOrderStatusDto(type=" + this.type + ", rideStatus=" + this.rideStatus + ", subtitle=" + this.subtitle + ", warningText=" + this.warningText + ", carNumber=" + this.carNumber + ", carInfo=" + this.carInfo + ", actionButton=" + this.actionButton + ')';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            this.type.writeToParcel(parcel, i);
            parcel.writeString(this.rideStatus);
            parcel.writeString(this.subtitle);
            parcel.writeString(this.warningText);
            parcel.writeString(this.carNumber);
            parcel.writeString(this.carInfo);
            SuperAppWidgetActionButtonDto superAppWidgetActionButtonDto = this.actionButton;
            if (superAppWidgetActionButtonDto == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                superAppWidgetActionButtonDto.writeToParcel(parcel, i);
            }
        }

        public SuperAppWidgetVkTaxiStateOrderStatusDto(TypeDto typeDto, String str, String str2, String str3, String str4, String str5, SuperAppWidgetActionButtonDto superAppWidgetActionButtonDto) {
            super(null);
            this.type = typeDto;
            this.rideStatus = str;
            this.subtitle = str2;
            this.warningText = str3;
            this.carNumber = str4;
            this.carInfo = str5;
            this.actionButton = superAppWidgetActionButtonDto;
        }
    }

    /* compiled from: SuperAppWidgetVkTaxiStateDto.kt */
    /* loaded from: classes15.dex */
    public static final class SuperAppWidgetVkTaxiStateRequestGeoDto extends SuperAppWidgetVkTaxiStateDto implements Parcelable {
        public static final Parcelable.Creator<SuperAppWidgetVkTaxiStateRequestGeoDto> CREATOR = new a();

        @pmi0("button_label")
        private final String buttonLabel;

        @pmi0("label")
        private final String label;

        @pmi0("type")
        private final TypeDto type;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: SuperAppWidgetVkTaxiStateDto.kt */
        public static final class TypeDto implements Parcelable {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ TypeDto[] $VALUES;
            public static final Parcelable.Creator<TypeDto> CREATOR;

            @pmi0("request_geo")
            public static final TypeDto REQUEST_GEO;
            private final String value;

            /* compiled from: SuperAppWidgetVkTaxiStateDto.kt */
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

        /* compiled from: SuperAppWidgetVkTaxiStateDto.kt */
        public static final class a implements Parcelable.Creator<SuperAppWidgetVkTaxiStateRequestGeoDto> {
            @Override // android.os.Parcelable.Creator
            public final SuperAppWidgetVkTaxiStateRequestGeoDto createFromParcel(Parcel parcel) {
                return new SuperAppWidgetVkTaxiStateRequestGeoDto(TypeDto.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final SuperAppWidgetVkTaxiStateRequestGeoDto[] newArray(int i) {
                return new SuperAppWidgetVkTaxiStateRequestGeoDto[i];
            }
        }

        public SuperAppWidgetVkTaxiStateRequestGeoDto(TypeDto typeDto, String str, String str2) {
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
            if (!(obj instanceof SuperAppWidgetVkTaxiStateRequestGeoDto)) {
                return false;
            }
            SuperAppWidgetVkTaxiStateRequestGeoDto superAppWidgetVkTaxiStateRequestGeoDto = (SuperAppWidgetVkTaxiStateRequestGeoDto) obj;
            return this.type == superAppWidgetVkTaxiStateRequestGeoDto.type && epx.f(this.label, superAppWidgetVkTaxiStateRequestGeoDto.label) && epx.f(this.buttonLabel, superAppWidgetVkTaxiStateRequestGeoDto.buttonLabel);
        }

        public final int hashCode() {
            return this.buttonLabel.hashCode() + urd0.a(this.type.hashCode() * 31, 31, this.label);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("SuperAppWidgetVkTaxiStateRequestGeoDto(type=");
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

    /* compiled from: SuperAppWidgetVkTaxiStateDto.kt */
    /* loaded from: classes15.dex */
    public static final class SuperAppWidgetVkTaxiStateRidesSuggestionDto extends SuperAppWidgetVkTaxiStateDto implements Parcelable {
        public static final Parcelable.Creator<SuperAppWidgetVkTaxiStateRidesSuggestionDto> CREATOR = new a();

        @pmi0("items")
        private final List<SuperAppWidgetVkTaxiRideSuggestionDto> items;

        @pmi0("skeleton")
        private final boolean skeleton;

        @pmi0("type")
        private final TypeDto type;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: SuperAppWidgetVkTaxiStateDto.kt */
        public static final class TypeDto implements Parcelable {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ TypeDto[] $VALUES;
            public static final Parcelable.Creator<TypeDto> CREATOR;

            @pmi0("rides_suggestion")
            public static final TypeDto RIDES_SUGGESTION;
            private final String value;

            /* compiled from: SuperAppWidgetVkTaxiStateDto.kt */
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
                TypeDto typeDto = new TypeDto("RIDES_SUGGESTION", 0, "rides_suggestion");
                RIDES_SUGGESTION = typeDto;
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

        /* compiled from: SuperAppWidgetVkTaxiStateDto.kt */
        public static final class a implements Parcelable.Creator<SuperAppWidgetVkTaxiStateRidesSuggestionDto> {
            @Override // android.os.Parcelable.Creator
            public final SuperAppWidgetVkTaxiStateRidesSuggestionDto createFromParcel(Parcel parcel) {
                TypeDto createFromParcel = TypeDto.CREATOR.createFromParcel(parcel);
                int readInt = parcel.readInt();
                ArrayList arrayList = new ArrayList(readInt);
                int i = 0;
                while (i != readInt) {
                    i = en.a(SuperAppWidgetVkTaxiRideSuggestionDto.CREATOR, parcel, arrayList, i, 1);
                }
                return new SuperAppWidgetVkTaxiStateRidesSuggestionDto(createFromParcel, arrayList, parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final SuperAppWidgetVkTaxiStateRidesSuggestionDto[] newArray(int i) {
                return new SuperAppWidgetVkTaxiStateRidesSuggestionDto[i];
            }
        }

        public SuperAppWidgetVkTaxiStateRidesSuggestionDto(TypeDto typeDto, List<SuperAppWidgetVkTaxiRideSuggestionDto> list, boolean z) {
            super(null);
            this.type = typeDto;
            this.items = list;
            this.skeleton = z;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SuperAppWidgetVkTaxiStateRidesSuggestionDto)) {
                return false;
            }
            SuperAppWidgetVkTaxiStateRidesSuggestionDto superAppWidgetVkTaxiStateRidesSuggestionDto = (SuperAppWidgetVkTaxiStateRidesSuggestionDto) obj;
            return this.type == superAppWidgetVkTaxiStateRidesSuggestionDto.type && epx.f(this.items, superAppWidgetVkTaxiStateRidesSuggestionDto.items) && this.skeleton == superAppWidgetVkTaxiStateRidesSuggestionDto.skeleton;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.skeleton) + fw3.a(this.type.hashCode() * 31, 31, this.items);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("SuperAppWidgetVkTaxiStateRidesSuggestionDto(type=");
            sb.append(this.type);
            sb.append(", items=");
            sb.append(this.items);
            sb.append(", skeleton=");
            return q0.a(sb, this.skeleton, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            this.type.writeToParcel(parcel, i);
            Iterator a2 = ao.a(parcel, this.items);
            while (a2.hasNext()) {
                ((SuperAppWidgetVkTaxiRideSuggestionDto) a2.next()).writeToParcel(parcel, i);
            }
            parcel.writeInt(this.skeleton ? 1 : 0);
        }
    }

    public /* synthetic */ SuperAppWidgetVkTaxiStateDto(zcl zclVar) {
        this();
    }

    private SuperAppWidgetVkTaxiStateDto() {
    }
}
