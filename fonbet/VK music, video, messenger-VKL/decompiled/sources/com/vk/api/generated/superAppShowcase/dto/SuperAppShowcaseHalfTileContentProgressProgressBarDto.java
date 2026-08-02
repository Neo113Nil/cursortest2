package com.vk.api.generated.superAppShowcase.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.ironsource.X3;
import xsna.asp;
import xsna.epx;
import xsna.pmi0;
import xsna.shy;
import xsna.urd0;
import xsna.vu5;
import xsna.zrp;

/* compiled from: SuperAppShowcaseHalfTileContentProgressProgressBarDto.kt */
/* loaded from: classes15.dex */
public final class SuperAppShowcaseHalfTileContentProgressProgressBarDto implements Parcelable {
    public static final Parcelable.Creator<SuperAppShowcaseHalfTileContentProgressProgressBarDto> CREATOR = new a();

    @pmi0("current")
    private final int current;

    @pmi0("text")
    private final String text;

    @pmi0(X3.i.l)
    private final int total;

    @pmi0("type")
    private final TypeDto type;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: SuperAppShowcaseHalfTileContentProgressProgressBarDto.kt */
    public static final class TypeDto implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ TypeDto[] $VALUES;
        public static final Parcelable.Creator<TypeDto> CREATOR;

        @pmi0("number")
        public static final TypeDto NUMBER;

        @pmi0("percent")
        public static final TypeDto PERCENT;
        private final String value;

        /* compiled from: SuperAppShowcaseHalfTileContentProgressProgressBarDto.kt */
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
            TypeDto typeDto = new TypeDto("PERCENT", 0, "percent");
            PERCENT = typeDto;
            TypeDto typeDto2 = new TypeDto("NUMBER", 1, "number");
            NUMBER = typeDto2;
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

    /* compiled from: SuperAppShowcaseHalfTileContentProgressProgressBarDto.kt */
    public static final class a implements Parcelable.Creator<SuperAppShowcaseHalfTileContentProgressProgressBarDto> {
        @Override // android.os.Parcelable.Creator
        public final SuperAppShowcaseHalfTileContentProgressProgressBarDto createFromParcel(Parcel parcel) {
            return new SuperAppShowcaseHalfTileContentProgressProgressBarDto(TypeDto.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readInt(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final SuperAppShowcaseHalfTileContentProgressProgressBarDto[] newArray(int i) {
            return new SuperAppShowcaseHalfTileContentProgressProgressBarDto[i];
        }
    }

    public SuperAppShowcaseHalfTileContentProgressProgressBarDto(TypeDto typeDto, String str, int i, int i2) {
        this.type = typeDto;
        this.text = str;
        this.current = i;
        this.total = i2;
    }

    public final int d() {
        return this.current;
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
        if (!(obj instanceof SuperAppShowcaseHalfTileContentProgressProgressBarDto)) {
            return false;
        }
        SuperAppShowcaseHalfTileContentProgressProgressBarDto superAppShowcaseHalfTileContentProgressProgressBarDto = (SuperAppShowcaseHalfTileContentProgressProgressBarDto) obj;
        return this.type == superAppShowcaseHalfTileContentProgressProgressBarDto.type && epx.f(this.text, superAppShowcaseHalfTileContentProgressProgressBarDto.text) && this.current == superAppShowcaseHalfTileContentProgressProgressBarDto.current && this.total == superAppShowcaseHalfTileContentProgressProgressBarDto.total;
    }

    public final int f() {
        return this.total;
    }

    public final TypeDto g() {
        return this.type;
    }

    public final int hashCode() {
        return Integer.hashCode(this.total) + shy.a(this.current, urd0.a(this.type.hashCode() * 31, 31, this.text), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SuperAppShowcaseHalfTileContentProgressProgressBarDto(type=");
        sb.append(this.type);
        sb.append(", text=");
        sb.append(this.text);
        sb.append(", current=");
        sb.append(this.current);
        sb.append(", total=");
        return vu5.b(sb, this.total, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.type.writeToParcel(parcel, i);
        parcel.writeString(this.text);
        parcel.writeInt(this.current);
        parcel.writeInt(this.total);
    }
}
