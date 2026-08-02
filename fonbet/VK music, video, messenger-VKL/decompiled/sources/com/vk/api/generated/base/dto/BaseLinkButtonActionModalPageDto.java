package com.vk.api.generated.base.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.zcl;
import xsna.zrp;

/* compiled from: BaseLinkButtonActionModalPageDto.kt */
/* loaded from: classes14.dex */
public final class BaseLinkButtonActionModalPageDto implements Parcelable {
    public static final Parcelable.Creator<BaseLinkButtonActionModalPageDto> CREATOR = new a();

    @pmi0("track_code")
    private final String trackCode;

    @pmi0("type")
    private final TypeDto type;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: BaseLinkButtonActionModalPageDto.kt */
    public static final class TypeDto implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ TypeDto[] $VALUES;
        public static final Parcelable.Creator<TypeDto> CREATOR;

        @pmi0("worki_contact")
        public static final TypeDto WORKI_CONTACT;
        private final String value;

        /* compiled from: BaseLinkButtonActionModalPageDto.kt */
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
            TypeDto typeDto = new TypeDto("WORKI_CONTACT", 0, "worki_contact");
            WORKI_CONTACT = typeDto;
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

    /* compiled from: BaseLinkButtonActionModalPageDto.kt */
    public static final class a implements Parcelable.Creator<BaseLinkButtonActionModalPageDto> {
        @Override // android.os.Parcelable.Creator
        public final BaseLinkButtonActionModalPageDto createFromParcel(Parcel parcel) {
            return new BaseLinkButtonActionModalPageDto(TypeDto.CREATOR.createFromParcel(parcel), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final BaseLinkButtonActionModalPageDto[] newArray(int i) {
            return new BaseLinkButtonActionModalPageDto[i];
        }
    }

    public BaseLinkButtonActionModalPageDto(TypeDto typeDto, String str) {
        this.type = typeDto;
        this.trackCode = str;
    }

    public final TypeDto d() {
        return this.type;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BaseLinkButtonActionModalPageDto)) {
            return false;
        }
        BaseLinkButtonActionModalPageDto baseLinkButtonActionModalPageDto = (BaseLinkButtonActionModalPageDto) obj;
        return this.type == baseLinkButtonActionModalPageDto.type && epx.f(this.trackCode, baseLinkButtonActionModalPageDto.trackCode);
    }

    public final int hashCode() {
        int hashCode = this.type.hashCode() * 31;
        String str = this.trackCode;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String r() {
        return this.trackCode;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BaseLinkButtonActionModalPageDto(type=");
        sb.append(this.type);
        sb.append(", trackCode=");
        return ho8.a(sb, this.trackCode, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.type.writeToParcel(parcel, i);
        parcel.writeString(this.trackCode);
    }

    public /* synthetic */ BaseLinkButtonActionModalPageDto(TypeDto typeDto, String str, int i, zcl zclVar) {
        this(typeDto, (i & 2) != 0 ? null : str);
    }
}
