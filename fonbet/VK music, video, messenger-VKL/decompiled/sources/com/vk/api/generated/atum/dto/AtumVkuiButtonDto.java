package com.vk.api.generated.atum.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.epx;
import xsna.pmi0;
import xsna.zrp;

/* compiled from: AtumVkuiButtonDto.kt */
/* loaded from: classes14.dex */
public final class AtumVkuiButtonDto implements Parcelable {
    public static final Parcelable.Creator<AtumVkuiButtonDto> CREATOR = new a();

    @pmi0("props")
    private final AtumVkuiButtonPropsDto props;

    @pmi0("type")
    private final TypeDto type;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: AtumVkuiButtonDto.kt */
    public static final class TypeDto implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ TypeDto[] $VALUES;

        @pmi0("button")
        public static final TypeDto BUTTON;
        public static final Parcelable.Creator<TypeDto> CREATOR;
        private final String value;

        /* compiled from: AtumVkuiButtonDto.kt */
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
            TypeDto typeDto = new TypeDto("BUTTON", 0, "button");
            BUTTON = typeDto;
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

    /* compiled from: AtumVkuiButtonDto.kt */
    public static final class a implements Parcelable.Creator<AtumVkuiButtonDto> {
        @Override // android.os.Parcelable.Creator
        public final AtumVkuiButtonDto createFromParcel(Parcel parcel) {
            return new AtumVkuiButtonDto(TypeDto.CREATOR.createFromParcel(parcel), AtumVkuiButtonPropsDto.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final AtumVkuiButtonDto[] newArray(int i) {
            return new AtumVkuiButtonDto[i];
        }
    }

    public AtumVkuiButtonDto(TypeDto typeDto, AtumVkuiButtonPropsDto atumVkuiButtonPropsDto) {
        this.type = typeDto;
        this.props = atumVkuiButtonPropsDto;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AtumVkuiButtonDto)) {
            return false;
        }
        AtumVkuiButtonDto atumVkuiButtonDto = (AtumVkuiButtonDto) obj;
        return this.type == atumVkuiButtonDto.type && epx.f(this.props, atumVkuiButtonDto.props);
    }

    public final int hashCode() {
        return this.props.hashCode() + (this.type.hashCode() * 31);
    }

    public final String toString() {
        return "AtumVkuiButtonDto(type=" + this.type + ", props=" + this.props + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.type.writeToParcel(parcel, i);
        this.props.writeToParcel(parcel, i);
    }
}
