package com.vk.api.generated.store.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.zcl;
import xsna.zrp;

/* compiled from: StoreStockItemBadgeDto.kt */
/* loaded from: classes15.dex */
public final class StoreStockItemBadgeDto implements Parcelable {
    public static final Parcelable.Creator<StoreStockItemBadgeDto> CREATOR = new a();

    @pmi0("subtype")
    private final SubtypeDto subtype;

    @pmi0("text")
    private final String text;

    @pmi0("type")
    private final TypeDto type;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: StoreStockItemBadgeDto.kt */
    public static final class SubtypeDto implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ SubtypeDto[] $VALUES;
        public static final Parcelable.Creator<SubtypeDto> CREATOR;

        @pmi0("discount")
        public static final SubtypeDto DISCOUNT;

        @pmi0("new")
        public static final SubtypeDto NEW;
        private final String value;

        /* compiled from: StoreStockItemBadgeDto.kt */
        public static final class a implements Parcelable.Creator<SubtypeDto> {
            @Override // android.os.Parcelable.Creator
            public final SubtypeDto createFromParcel(Parcel parcel) {
                return SubtypeDto.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final SubtypeDto[] newArray(int i) {
                return new SubtypeDto[i];
            }
        }

        static {
            SubtypeDto subtypeDto = new SubtypeDto("NEW", 0, "new");
            NEW = subtypeDto;
            SubtypeDto subtypeDto2 = new SubtypeDto("DISCOUNT", 1, "discount");
            DISCOUNT = subtypeDto2;
            SubtypeDto[] subtypeDtoArr = {subtypeDto, subtypeDto2};
            $VALUES = subtypeDtoArr;
            $ENTRIES = new asp(subtypeDtoArr);
            CREATOR = new a();
        }

        private SubtypeDto(String str, int i, String str2) {
            this.value = str2;
        }

        public static SubtypeDto valueOf(String str) {
            return (SubtypeDto) Enum.valueOf(SubtypeDto.class, str);
        }

        public static SubtypeDto[] values() {
            return (SubtypeDto[]) $VALUES.clone();
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final String i() {
            return this.value;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(name());
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: StoreStockItemBadgeDto.kt */
    public static final class TypeDto implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ TypeDto[] $VALUES;
        public static final Parcelable.Creator<TypeDto> CREATOR;

        @pmi0("text")
        public static final TypeDto TEXT;
        private final String value;

        /* compiled from: StoreStockItemBadgeDto.kt */
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
            TypeDto typeDto = new TypeDto("TEXT", 0, "text");
            TEXT = typeDto;
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

        public final String i() {
            return this.value;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(name());
        }
    }

    /* compiled from: StoreStockItemBadgeDto.kt */
    public static final class a implements Parcelable.Creator<StoreStockItemBadgeDto> {
        @Override // android.os.Parcelable.Creator
        public final StoreStockItemBadgeDto createFromParcel(Parcel parcel) {
            return new StoreStockItemBadgeDto(TypeDto.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : SubtypeDto.CREATOR.createFromParcel(parcel), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final StoreStockItemBadgeDto[] newArray(int i) {
            return new StoreStockItemBadgeDto[i];
        }
    }

    public StoreStockItemBadgeDto(TypeDto typeDto, SubtypeDto subtypeDto, String str) {
        this.type = typeDto;
        this.subtype = subtypeDto;
        this.text = str;
    }

    public final SubtypeDto d() {
        return this.subtype;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String e() {
        return this.text;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StoreStockItemBadgeDto)) {
            return false;
        }
        StoreStockItemBadgeDto storeStockItemBadgeDto = (StoreStockItemBadgeDto) obj;
        return this.type == storeStockItemBadgeDto.type && this.subtype == storeStockItemBadgeDto.subtype && epx.f(this.text, storeStockItemBadgeDto.text);
    }

    public final TypeDto f() {
        return this.type;
    }

    public final int hashCode() {
        int hashCode = this.type.hashCode() * 31;
        SubtypeDto subtypeDto = this.subtype;
        int hashCode2 = (hashCode + (subtypeDto == null ? 0 : subtypeDto.hashCode())) * 31;
        String str = this.text;
        return hashCode2 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StoreStockItemBadgeDto(type=");
        sb.append(this.type);
        sb.append(", subtype=");
        sb.append(this.subtype);
        sb.append(", text=");
        return ho8.a(sb, this.text, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.type.writeToParcel(parcel, i);
        SubtypeDto subtypeDto = this.subtype;
        if (subtypeDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            subtypeDto.writeToParcel(parcel, i);
        }
        parcel.writeString(this.text);
    }

    public /* synthetic */ StoreStockItemBadgeDto(TypeDto typeDto, SubtypeDto subtypeDto, String str, int i, zcl zclVar) {
        this(typeDto, (i & 2) != 0 ? null : subtypeDto, (i & 4) != 0 ? null : str);
    }
}
