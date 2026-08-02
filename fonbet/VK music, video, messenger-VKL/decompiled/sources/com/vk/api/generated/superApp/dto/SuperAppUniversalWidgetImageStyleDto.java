package com.vk.api.generated.superApp.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.mbridge.msdk.MBridgeConstans;
import xsna.asp;
import xsna.epx;
import xsna.pmi0;
import xsna.sn;
import xsna.zcl;
import xsna.zrp;

/* compiled from: SuperAppUniversalWidgetImageStyleDto.kt */
/* loaded from: classes15.dex */
public final class SuperAppUniversalWidgetImageStyleDto implements Parcelable {
    public static final Parcelable.Creator<SuperAppUniversalWidgetImageStyleDto> CREATOR = new a();

    @pmi0("is_verified")
    private final Boolean isVerified;

    @pmi0("type")
    private final TypeDto type;

    @pmi0("vertical_align")
    private final SuperAppUniversalWidgetVerticalAlignDto verticalAlign;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: SuperAppUniversalWidgetImageStyleDto.kt */
    public static final class TypeDto implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ TypeDto[] $VALUES;

        @pmi0(MBridgeConstans.DYNAMIC_VIEW_WX_APP)
        public static final TypeDto APP;

        @pmi0("circle")
        public static final TypeDto CIRCLE;
        public static final Parcelable.Creator<TypeDto> CREATOR;

        @pmi0("poster")
        public static final TypeDto POSTER;

        @pmi0("raw")
        public static final TypeDto RAW;

        @pmi0("square")
        public static final TypeDto SQUARE;

        @pmi0("tv")
        public static final TypeDto TV;
        private final String value;

        /* compiled from: SuperAppUniversalWidgetImageStyleDto.kt */
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
            TypeDto typeDto = new TypeDto("APP", 0, MBridgeConstans.DYNAMIC_VIEW_WX_APP);
            APP = typeDto;
            TypeDto typeDto2 = new TypeDto("SQUARE", 1, "square");
            SQUARE = typeDto2;
            TypeDto typeDto3 = new TypeDto("CIRCLE", 2, "circle");
            CIRCLE = typeDto3;
            TypeDto typeDto4 = new TypeDto("POSTER", 3, "poster");
            POSTER = typeDto4;
            TypeDto typeDto5 = new TypeDto("TV", 4, "tv");
            TV = typeDto5;
            TypeDto typeDto6 = new TypeDto("RAW", 5, "raw");
            RAW = typeDto6;
            TypeDto[] typeDtoArr = {typeDto, typeDto2, typeDto3, typeDto4, typeDto5, typeDto6};
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

    /* compiled from: SuperAppUniversalWidgetImageStyleDto.kt */
    public static final class a implements Parcelable.Creator<SuperAppUniversalWidgetImageStyleDto> {
        @Override // android.os.Parcelable.Creator
        public final SuperAppUniversalWidgetImageStyleDto createFromParcel(Parcel parcel) {
            Boolean valueOf;
            TypeDto createFromParcel = TypeDto.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                valueOf = null;
            } else {
                valueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new SuperAppUniversalWidgetImageStyleDto(createFromParcel, valueOf, parcel.readInt() != 0 ? SuperAppUniversalWidgetVerticalAlignDto.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final SuperAppUniversalWidgetImageStyleDto[] newArray(int i) {
            return new SuperAppUniversalWidgetImageStyleDto[i];
        }
    }

    public SuperAppUniversalWidgetImageStyleDto(TypeDto typeDto, Boolean bool, SuperAppUniversalWidgetVerticalAlignDto superAppUniversalWidgetVerticalAlignDto) {
        this.type = typeDto;
        this.isVerified = bool;
        this.verticalAlign = superAppUniversalWidgetVerticalAlignDto;
    }

    public final TypeDto d() {
        return this.type;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final SuperAppUniversalWidgetVerticalAlignDto e() {
        return this.verticalAlign;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SuperAppUniversalWidgetImageStyleDto)) {
            return false;
        }
        SuperAppUniversalWidgetImageStyleDto superAppUniversalWidgetImageStyleDto = (SuperAppUniversalWidgetImageStyleDto) obj;
        return this.type == superAppUniversalWidgetImageStyleDto.type && epx.f(this.isVerified, superAppUniversalWidgetImageStyleDto.isVerified) && this.verticalAlign == superAppUniversalWidgetImageStyleDto.verticalAlign;
    }

    public final Boolean f() {
        return this.isVerified;
    }

    public final int hashCode() {
        int hashCode = this.type.hashCode() * 31;
        Boolean bool = this.isVerified;
        int hashCode2 = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        SuperAppUniversalWidgetVerticalAlignDto superAppUniversalWidgetVerticalAlignDto = this.verticalAlign;
        return hashCode2 + (superAppUniversalWidgetVerticalAlignDto != null ? superAppUniversalWidgetVerticalAlignDto.hashCode() : 0);
    }

    public final String toString() {
        return "SuperAppUniversalWidgetImageStyleDto(type=" + this.type + ", isVerified=" + this.isVerified + ", verticalAlign=" + this.verticalAlign + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.type.writeToParcel(parcel, i);
        Boolean bool = this.isVerified;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool);
        }
        SuperAppUniversalWidgetVerticalAlignDto superAppUniversalWidgetVerticalAlignDto = this.verticalAlign;
        if (superAppUniversalWidgetVerticalAlignDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            superAppUniversalWidgetVerticalAlignDto.writeToParcel(parcel, i);
        }
    }

    public /* synthetic */ SuperAppUniversalWidgetImageStyleDto(TypeDto typeDto, Boolean bool, SuperAppUniversalWidgetVerticalAlignDto superAppUniversalWidgetVerticalAlignDto, int i, zcl zclVar) {
        this(typeDto, (i & 2) != 0 ? null : bool, (i & 4) != 0 ? null : superAppUniversalWidgetVerticalAlignDto);
    }
}
