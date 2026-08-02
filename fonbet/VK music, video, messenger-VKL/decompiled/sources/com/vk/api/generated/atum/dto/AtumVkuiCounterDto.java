package com.vk.api.generated.atum.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.epx;
import xsna.pmi0;
import xsna.zrp;

/* compiled from: AtumVkuiCounterDto.kt */
/* loaded from: classes14.dex */
public final class AtumVkuiCounterDto implements Parcelable {
    public static final Parcelable.Creator<AtumVkuiCounterDto> CREATOR = new a();

    @pmi0("props")
    private final AtumVkuiCounterPropsDto props;

    @pmi0("type")
    private final TypeDto type;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: AtumVkuiCounterDto.kt */
    public static final class TypeDto implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ TypeDto[] $VALUES;

        @pmi0("counter")
        public static final TypeDto COUNTER;
        public static final Parcelable.Creator<TypeDto> CREATOR;
        private final String value;

        /* compiled from: AtumVkuiCounterDto.kt */
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
            TypeDto typeDto = new TypeDto("COUNTER", 0, "counter");
            COUNTER = typeDto;
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

    /* compiled from: AtumVkuiCounterDto.kt */
    public static final class a implements Parcelable.Creator<AtumVkuiCounterDto> {
        @Override // android.os.Parcelable.Creator
        public final AtumVkuiCounterDto createFromParcel(Parcel parcel) {
            return new AtumVkuiCounterDto(TypeDto.CREATOR.createFromParcel(parcel), AtumVkuiCounterPropsDto.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final AtumVkuiCounterDto[] newArray(int i) {
            return new AtumVkuiCounterDto[i];
        }
    }

    public AtumVkuiCounterDto(TypeDto typeDto, AtumVkuiCounterPropsDto atumVkuiCounterPropsDto) {
        this.type = typeDto;
        this.props = atumVkuiCounterPropsDto;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AtumVkuiCounterDto)) {
            return false;
        }
        AtumVkuiCounterDto atumVkuiCounterDto = (AtumVkuiCounterDto) obj;
        return this.type == atumVkuiCounterDto.type && epx.f(this.props, atumVkuiCounterDto.props);
    }

    public final int hashCode() {
        return this.props.hashCode() + (this.type.hashCode() * 31);
    }

    public final String toString() {
        return "AtumVkuiCounterDto(type=" + this.type + ", props=" + this.props + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.type.writeToParcel(parcel, i);
        this.props.writeToParcel(parcel, i);
    }
}
