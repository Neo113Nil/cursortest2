package com.vk.api.generated.superAppShowcase.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.internal.bind.TreeTypeAdapter;
import com.vk.api.generated.superApp.dto.SuperAppUniversalWidgetImageBlockDto;
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
import xsna.fw3;
import xsna.go9;
import xsna.pmi0;
import xsna.up;
import xsna.urd0;
import xsna.z8y;
import xsna.zcl;
import xsna.zrp;

/* compiled from: SuperAppShowcaseHalfTileContentRegularIconDto.kt */
/* loaded from: classes.dex */
public abstract class SuperAppShowcaseHalfTileContentRegularIconDto implements Parcelable {

    /* compiled from: SuperAppShowcaseHalfTileContentRegularIconDto.kt */
    public static final class Deserializer implements a9y<SuperAppShowcaseHalfTileContentRegularIconDto> {
        @Override // xsna.a9y
        public final Object a(b9y b9yVar, z8y z8yVar) {
            String f = up.f(b9yVar, "type");
            if (f != null) {
                int hashCode = f.hashCode();
                if (hashCode != -442100005) {
                    if (hashCode != 503256624) {
                        if (hashCode == 1518284269 && f.equals("universal_icon")) {
                            return (SuperAppShowcaseHalfTileContentRegularIconDto) ((TreeTypeAdapter.a) z8yVar).a(b9yVar, SuperAppShowcaseHalfTileUniversalIconDto.class);
                        }
                    } else if (f.equals("raw_icon")) {
                        return (SuperAppShowcaseHalfTileContentRegularIconDto) ((TreeTypeAdapter.a) z8yVar).a(b9yVar, SuperAppShowcaseHalfTileRawIconDto.class);
                    }
                } else if (f.equals("rep_icon")) {
                    return (SuperAppShowcaseHalfTileContentRegularIconDto) ((TreeTypeAdapter.a) z8yVar).a(b9yVar, SuperAppShowcaseHalfTileRepIconDto.class);
                }
            }
            throw new IllegalStateException(go9.b("no mapping for the type:", f));
        }
    }

    /* compiled from: SuperAppShowcaseHalfTileContentRegularIconDto.kt */
    /* loaded from: classes15.dex */
    public static final class SuperAppShowcaseHalfTileRawIconDto extends SuperAppShowcaseHalfTileContentRegularIconDto implements Parcelable {
        public static final Parcelable.Creator<SuperAppShowcaseHalfTileRawIconDto> CREATOR = new a();

        @pmi0("icon")
        private final List<SuperAppUniversalWidgetImageItemDto> icon;

        @pmi0("size")
        private final SizeDto size;

        @pmi0("type")
        private final TypeDto type;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: SuperAppShowcaseHalfTileContentRegularIconDto.kt */
        public static final class SizeDto implements Parcelable {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ SizeDto[] $VALUES;
            public static final Parcelable.Creator<SizeDto> CREATOR;

            @pmi0("large")
            public static final SizeDto LARGE;

            @pmi0("regular")
            public static final SizeDto REGULAR;
            private final String value;

            /* compiled from: SuperAppShowcaseHalfTileContentRegularIconDto.kt */
            public static final class a implements Parcelable.Creator<SizeDto> {
                @Override // android.os.Parcelable.Creator
                public final SizeDto createFromParcel(Parcel parcel) {
                    return SizeDto.valueOf(parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final SizeDto[] newArray(int i) {
                    return new SizeDto[i];
                }
            }

            static {
                SizeDto sizeDto = new SizeDto("REGULAR", 0, "regular");
                REGULAR = sizeDto;
                SizeDto sizeDto2 = new SizeDto("LARGE", 1, "large");
                LARGE = sizeDto2;
                SizeDto[] sizeDtoArr = {sizeDto, sizeDto2};
                $VALUES = sizeDtoArr;
                $ENTRIES = new asp(sizeDtoArr);
                CREATOR = new a();
            }

            private SizeDto(String str, int i, String str2) {
                this.value = str2;
            }

            public static SizeDto valueOf(String str) {
                return (SizeDto) Enum.valueOf(SizeDto.class, str);
            }

            public static SizeDto[] values() {
                return (SizeDto[]) $VALUES.clone();
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

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: SuperAppShowcaseHalfTileContentRegularIconDto.kt */
        public static final class TypeDto implements Parcelable {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ TypeDto[] $VALUES;
            public static final Parcelable.Creator<TypeDto> CREATOR;

            @pmi0("raw_icon")
            public static final TypeDto RAW_ICON;
            private final String value;

            /* compiled from: SuperAppShowcaseHalfTileContentRegularIconDto.kt */
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
                TypeDto typeDto = new TypeDto("RAW_ICON", 0, "raw_icon");
                RAW_ICON = typeDto;
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

        /* compiled from: SuperAppShowcaseHalfTileContentRegularIconDto.kt */
        public static final class a implements Parcelable.Creator<SuperAppShowcaseHalfTileRawIconDto> {
            @Override // android.os.Parcelable.Creator
            public final SuperAppShowcaseHalfTileRawIconDto createFromParcel(Parcel parcel) {
                TypeDto createFromParcel = TypeDto.CREATOR.createFromParcel(parcel);
                int readInt = parcel.readInt();
                ArrayList arrayList = new ArrayList(readInt);
                int i = 0;
                while (i != readInt) {
                    i = en.a(SuperAppUniversalWidgetImageItemDto.CREATOR, parcel, arrayList, i, 1);
                }
                return new SuperAppShowcaseHalfTileRawIconDto(createFromParcel, arrayList, parcel.readInt() == 0 ? null : SizeDto.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final SuperAppShowcaseHalfTileRawIconDto[] newArray(int i) {
                return new SuperAppShowcaseHalfTileRawIconDto[i];
            }
        }

        public /* synthetic */ SuperAppShowcaseHalfTileRawIconDto(TypeDto typeDto, List list, SizeDto sizeDto, int i, zcl zclVar) {
            this(typeDto, list, (i & 4) != 0 ? null : sizeDto);
        }

        public final List<SuperAppUniversalWidgetImageItemDto> d() {
            return this.icon;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final SizeDto e() {
            return this.size;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SuperAppShowcaseHalfTileRawIconDto)) {
                return false;
            }
            SuperAppShowcaseHalfTileRawIconDto superAppShowcaseHalfTileRawIconDto = (SuperAppShowcaseHalfTileRawIconDto) obj;
            return this.type == superAppShowcaseHalfTileRawIconDto.type && epx.f(this.icon, superAppShowcaseHalfTileRawIconDto.icon) && this.size == superAppShowcaseHalfTileRawIconDto.size;
        }

        public final int hashCode() {
            int a2 = fw3.a(this.type.hashCode() * 31, 31, this.icon);
            SizeDto sizeDto = this.size;
            return a2 + (sizeDto == null ? 0 : sizeDto.hashCode());
        }

        public final String toString() {
            return "SuperAppShowcaseHalfTileRawIconDto(type=" + this.type + ", icon=" + this.icon + ", size=" + this.size + ')';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            this.type.writeToParcel(parcel, i);
            Iterator a2 = ao.a(parcel, this.icon);
            while (a2.hasNext()) {
                ((SuperAppUniversalWidgetImageItemDto) a2.next()).writeToParcel(parcel, i);
            }
            SizeDto sizeDto = this.size;
            if (sizeDto == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                sizeDto.writeToParcel(parcel, i);
            }
        }

        public SuperAppShowcaseHalfTileRawIconDto(TypeDto typeDto, List<SuperAppUniversalWidgetImageItemDto> list, SizeDto sizeDto) {
            super(null);
            this.type = typeDto;
            this.icon = list;
            this.size = sizeDto;
        }
    }

    /* compiled from: SuperAppShowcaseHalfTileContentRegularIconDto.kt */
    /* loaded from: classes15.dex */
    public static final class SuperAppShowcaseHalfTileRepIconDto extends SuperAppShowcaseHalfTileContentRegularIconDto implements Parcelable {
        public static final Parcelable.Creator<SuperAppShowcaseHalfTileRepIconDto> CREATOR = new a();

        @pmi0("align")
        private final SuperAppShowcaseHalfTileAlignDto align;

        @pmi0("icon_id")
        private final String iconId;

        @pmi0("type")
        private final TypeDto type;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: SuperAppShowcaseHalfTileContentRegularIconDto.kt */
        public static final class TypeDto implements Parcelable {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ TypeDto[] $VALUES;
            public static final Parcelable.Creator<TypeDto> CREATOR;

            @pmi0("rep_icon")
            public static final TypeDto REP_ICON;
            private final String value;

            /* compiled from: SuperAppShowcaseHalfTileContentRegularIconDto.kt */
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
                TypeDto typeDto = new TypeDto("REP_ICON", 0, "rep_icon");
                REP_ICON = typeDto;
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

        /* compiled from: SuperAppShowcaseHalfTileContentRegularIconDto.kt */
        public static final class a implements Parcelable.Creator<SuperAppShowcaseHalfTileRepIconDto> {
            @Override // android.os.Parcelable.Creator
            public final SuperAppShowcaseHalfTileRepIconDto createFromParcel(Parcel parcel) {
                return new SuperAppShowcaseHalfTileRepIconDto(TypeDto.CREATOR.createFromParcel(parcel), parcel.readString(), SuperAppShowcaseHalfTileAlignDto.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final SuperAppShowcaseHalfTileRepIconDto[] newArray(int i) {
                return new SuperAppShowcaseHalfTileRepIconDto[i];
            }
        }

        public SuperAppShowcaseHalfTileRepIconDto(TypeDto typeDto, String str, SuperAppShowcaseHalfTileAlignDto superAppShowcaseHalfTileAlignDto) {
            super(null);
            this.type = typeDto;
            this.iconId = str;
            this.align = superAppShowcaseHalfTileAlignDto;
        }

        public final SuperAppShowcaseHalfTileAlignDto d() {
            return this.align;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final String e() {
            return this.iconId;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SuperAppShowcaseHalfTileRepIconDto)) {
                return false;
            }
            SuperAppShowcaseHalfTileRepIconDto superAppShowcaseHalfTileRepIconDto = (SuperAppShowcaseHalfTileRepIconDto) obj;
            return this.type == superAppShowcaseHalfTileRepIconDto.type && epx.f(this.iconId, superAppShowcaseHalfTileRepIconDto.iconId) && this.align == superAppShowcaseHalfTileRepIconDto.align;
        }

        public final int hashCode() {
            return this.align.hashCode() + urd0.a(this.type.hashCode() * 31, 31, this.iconId);
        }

        public final String toString() {
            return "SuperAppShowcaseHalfTileRepIconDto(type=" + this.type + ", iconId=" + this.iconId + ", align=" + this.align + ')';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            this.type.writeToParcel(parcel, i);
            parcel.writeString(this.iconId);
            this.align.writeToParcel(parcel, i);
        }
    }

    /* compiled from: SuperAppShowcaseHalfTileContentRegularIconDto.kt */
    /* loaded from: classes15.dex */
    public static final class SuperAppShowcaseHalfTileUniversalIconDto extends SuperAppShowcaseHalfTileContentRegularIconDto implements Parcelable {
        public static final Parcelable.Creator<SuperAppShowcaseHalfTileUniversalIconDto> CREATOR = new a();

        @pmi0("icon")
        private final SuperAppUniversalWidgetImageBlockDto icon;

        @pmi0("type")
        private final TypeDto type;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: SuperAppShowcaseHalfTileContentRegularIconDto.kt */
        public static final class TypeDto implements Parcelable {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ TypeDto[] $VALUES;
            public static final Parcelable.Creator<TypeDto> CREATOR;

            @pmi0("universal_icon")
            public static final TypeDto UNIVERSAL_ICON;
            private final String value;

            /* compiled from: SuperAppShowcaseHalfTileContentRegularIconDto.kt */
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
                TypeDto typeDto = new TypeDto("UNIVERSAL_ICON", 0, "universal_icon");
                UNIVERSAL_ICON = typeDto;
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

        /* compiled from: SuperAppShowcaseHalfTileContentRegularIconDto.kt */
        public static final class a implements Parcelable.Creator<SuperAppShowcaseHalfTileUniversalIconDto> {
            @Override // android.os.Parcelable.Creator
            public final SuperAppShowcaseHalfTileUniversalIconDto createFromParcel(Parcel parcel) {
                return new SuperAppShowcaseHalfTileUniversalIconDto(TypeDto.CREATOR.createFromParcel(parcel), (SuperAppUniversalWidgetImageBlockDto) parcel.readParcelable(SuperAppShowcaseHalfTileUniversalIconDto.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final SuperAppShowcaseHalfTileUniversalIconDto[] newArray(int i) {
                return new SuperAppShowcaseHalfTileUniversalIconDto[i];
            }
        }

        public SuperAppShowcaseHalfTileUniversalIconDto(TypeDto typeDto, SuperAppUniversalWidgetImageBlockDto superAppUniversalWidgetImageBlockDto) {
            super(null);
            this.type = typeDto;
            this.icon = superAppUniversalWidgetImageBlockDto;
        }

        public final SuperAppUniversalWidgetImageBlockDto d() {
            return this.icon;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SuperAppShowcaseHalfTileUniversalIconDto)) {
                return false;
            }
            SuperAppShowcaseHalfTileUniversalIconDto superAppShowcaseHalfTileUniversalIconDto = (SuperAppShowcaseHalfTileUniversalIconDto) obj;
            return this.type == superAppShowcaseHalfTileUniversalIconDto.type && epx.f(this.icon, superAppShowcaseHalfTileUniversalIconDto.icon);
        }

        public final int hashCode() {
            return this.icon.hashCode() + (this.type.hashCode() * 31);
        }

        public final String toString() {
            return "SuperAppShowcaseHalfTileUniversalIconDto(type=" + this.type + ", icon=" + this.icon + ')';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            this.type.writeToParcel(parcel, i);
            parcel.writeParcelable(this.icon, i);
        }
    }

    public /* synthetic */ SuperAppShowcaseHalfTileContentRegularIconDto(zcl zclVar) {
        this();
    }

    private SuperAppShowcaseHalfTileContentRegularIconDto() {
    }
}
