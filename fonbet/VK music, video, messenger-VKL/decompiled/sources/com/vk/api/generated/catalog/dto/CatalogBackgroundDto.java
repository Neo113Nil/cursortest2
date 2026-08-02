package com.vk.api.generated.catalog.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.unity3d.ads.BuildConfig;
import io.reactivex.rxjava3.subjects.b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.asp;
import xsna.dn;
import xsna.en;
import xsna.epx;
import xsna.ms9;
import xsna.pmi0;
import xsna.zcl;
import xsna.zrp;

/* compiled from: CatalogBackgroundDto.kt */
/* loaded from: classes14.dex */
public final class CatalogBackgroundDto implements Parcelable {
    public static final Parcelable.Creator<CatalogBackgroundDto> CREATOR = new a();

    @pmi0("angle")
    private final Float angle;

    @pmi0("colors")
    private final List<CatalogBackgroundColorDto> colors;

    @pmi0("positions")
    private final List<Float> positions;

    @pmi0("sub_type")
    private final SubTypeDto subType;

    @pmi0("type")
    private final TypeDto type;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: CatalogBackgroundDto.kt */
    public static final class SubTypeDto implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ SubTypeDto[] $VALUES;
        public static final Parcelable.Creator<SubTypeDto> CREATOR;

        @pmi0("linear")
        public static final SubTypeDto LINEAR;

        @pmi0("solid")
        public static final SubTypeDto SOLID;
        private final String value;

        /* compiled from: CatalogBackgroundDto.kt */
        public static final class a implements Parcelable.Creator<SubTypeDto> {
            @Override // android.os.Parcelable.Creator
            public final SubTypeDto createFromParcel(Parcel parcel) {
                return SubTypeDto.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final SubTypeDto[] newArray(int i) {
                return new SubTypeDto[i];
            }
        }

        static {
            SubTypeDto subTypeDto = new SubTypeDto("LINEAR", 0, "linear");
            LINEAR = subTypeDto;
            SubTypeDto subTypeDto2 = new SubTypeDto("SOLID", 1, "solid");
            SOLID = subTypeDto2;
            SubTypeDto[] subTypeDtoArr = {subTypeDto, subTypeDto2};
            $VALUES = subTypeDtoArr;
            $ENTRIES = new asp(subTypeDtoArr);
            CREATOR = new a();
        }

        private SubTypeDto(String str, int i, String str2) {
            this.value = str2;
        }

        public static SubTypeDto valueOf(String str) {
            return (SubTypeDto) Enum.valueOf(SubTypeDto.class, str);
        }

        public static SubTypeDto[] values() {
            return (SubTypeDto[]) $VALUES.clone();
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
    /* compiled from: CatalogBackgroundDto.kt */
    public static final class TypeDto implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ TypeDto[] $VALUES;
        public static final Parcelable.Creator<TypeDto> CREATOR;

        @pmi0(BuildConfig.FLAVOR)
        public static final TypeDto DEFAULT;

        @pmi0("gradient")
        public static final TypeDto GRADIENT;
        private final String value;

        /* compiled from: CatalogBackgroundDto.kt */
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
            TypeDto typeDto = new TypeDto("DEFAULT", 0, BuildConfig.FLAVOR);
            DEFAULT = typeDto;
            TypeDto typeDto2 = new TypeDto("GRADIENT", 1, "gradient");
            GRADIENT = typeDto2;
            TypeDto[] typeDtoArr = {typeDto, typeDto2};
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

    /* compiled from: CatalogBackgroundDto.kt */
    public static final class a implements Parcelable.Creator<CatalogBackgroundDto> {
        @Override // android.os.Parcelable.Creator
        public final CatalogBackgroundDto createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            TypeDto createFromParcel = TypeDto.CREATOR.createFromParcel(parcel);
            ArrayList arrayList2 = null;
            SubTypeDto createFromParcel2 = parcel.readInt() == 0 ? null : SubTypeDto.CREATOR.createFromParcel(parcel);
            Float valueOf = parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat());
            int i = 0;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt = parcel.readInt();
                arrayList = new ArrayList(readInt);
                for (int i2 = 0; i2 != readInt; i2++) {
                    arrayList.add(Float.valueOf(parcel.readFloat()));
                }
            }
            if (parcel.readInt() != 0) {
                int readInt2 = parcel.readInt();
                arrayList2 = new ArrayList(readInt2);
                while (i != readInt2) {
                    i = en.a(CatalogBackgroundColorDto.CREATOR, parcel, arrayList2, i, 1);
                }
            }
            return new CatalogBackgroundDto(createFromParcel, createFromParcel2, valueOf, arrayList, arrayList2);
        }

        @Override // android.os.Parcelable.Creator
        public final CatalogBackgroundDto[] newArray(int i) {
            return new CatalogBackgroundDto[i];
        }
    }

    public CatalogBackgroundDto(TypeDto typeDto, SubTypeDto subTypeDto, Float f, List<Float> list, List<CatalogBackgroundColorDto> list2) {
        this.type = typeDto;
        this.subType = subTypeDto;
        this.angle = f;
        this.positions = list;
        this.colors = list2;
    }

    public final Float d() {
        return this.angle;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final List<CatalogBackgroundColorDto> e() {
        return this.colors;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CatalogBackgroundDto)) {
            return false;
        }
        CatalogBackgroundDto catalogBackgroundDto = (CatalogBackgroundDto) obj;
        return this.type == catalogBackgroundDto.type && this.subType == catalogBackgroundDto.subType && epx.f(this.angle, catalogBackgroundDto.angle) && epx.f(this.positions, catalogBackgroundDto.positions) && epx.f(this.colors, catalogBackgroundDto.colors);
    }

    public final List<Float> f() {
        return this.positions;
    }

    public final SubTypeDto g() {
        return this.subType;
    }

    public final int hashCode() {
        int hashCode = this.type.hashCode() * 31;
        SubTypeDto subTypeDto = this.subType;
        int hashCode2 = (hashCode + (subTypeDto == null ? 0 : subTypeDto.hashCode())) * 31;
        Float f = this.angle;
        int hashCode3 = (hashCode2 + (f == null ? 0 : f.hashCode())) * 31;
        List<Float> list = this.positions;
        int hashCode4 = (hashCode3 + (list == null ? 0 : list.hashCode())) * 31;
        List<CatalogBackgroundColorDto> list2 = this.colors;
        return hashCode4 + (list2 != null ? list2.hashCode() : 0);
    }

    public final TypeDto i() {
        return this.type;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CatalogBackgroundDto(type=");
        sb.append(this.type);
        sb.append(", subType=");
        sb.append(this.subType);
        sb.append(", angle=");
        sb.append(this.angle);
        sb.append(", positions=");
        sb.append(this.positions);
        sb.append(", colors=");
        return ms9.a(')', sb, this.colors);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.type.writeToParcel(parcel, i);
        SubTypeDto subTypeDto = this.subType;
        if (subTypeDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            subTypeDto.writeToParcel(parcel, i);
        }
        Float f = this.angle;
        if (f == null) {
            parcel.writeInt(0);
        } else {
            b.d(parcel, 1, f);
        }
        List<Float> list = this.positions;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator f2 = dn.f(parcel, list, 1);
            while (f2.hasNext()) {
                parcel.writeFloat(((Number) f2.next()).floatValue());
            }
        }
        List<CatalogBackgroundColorDto> list2 = this.colors;
        if (list2 == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator f3 = dn.f(parcel, list2, 1);
        while (f3.hasNext()) {
            ((CatalogBackgroundColorDto) f3.next()).writeToParcel(parcel, i);
        }
    }

    public /* synthetic */ CatalogBackgroundDto(TypeDto typeDto, SubTypeDto subTypeDto, Float f, List list, List list2, int i, zcl zclVar) {
        this(typeDto, (i & 2) != 0 ? null : subTypeDto, (i & 4) != 0 ? null : f, (i & 8) != 0 ? null : list, (i & 16) != 0 ? null : list2);
    }
}
