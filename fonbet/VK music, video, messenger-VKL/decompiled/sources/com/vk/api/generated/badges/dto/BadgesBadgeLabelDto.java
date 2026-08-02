package com.vk.api.generated.badges.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.zcl;
import xsna.zrp;

/* compiled from: BadgesBadgeLabelDto.kt */
/* loaded from: classes14.dex */
public final class BadgesBadgeLabelDto implements Parcelable {
    public static final Parcelable.Creator<BadgesBadgeLabelDto> CREATOR = new a();

    @pmi0("text")
    private final String text;

    @pmi0("type")
    private final TypeDto type;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: BadgesBadgeLabelDto.kt */
    public static final class TypeDto implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ TypeDto[] $VALUES;
        public static final Parcelable.Creator<TypeDto> CREATOR;

        @pmi0("discount")
        public static final TypeDto DISCOUNT;

        @pmi0("new")
        public static final TypeDto NEW;
        private final String value;

        /* compiled from: BadgesBadgeLabelDto.kt */
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
            TypeDto typeDto = new TypeDto("NEW", 0, "new");
            NEW = typeDto;
            TypeDto typeDto2 = new TypeDto("DISCOUNT", 1, "discount");
            DISCOUNT = typeDto2;
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

    /* compiled from: BadgesBadgeLabelDto.kt */
    public static final class a implements Parcelable.Creator<BadgesBadgeLabelDto> {
        @Override // android.os.Parcelable.Creator
        public final BadgesBadgeLabelDto createFromParcel(Parcel parcel) {
            return new BadgesBadgeLabelDto(TypeDto.CREATOR.createFromParcel(parcel), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final BadgesBadgeLabelDto[] newArray(int i) {
            return new BadgesBadgeLabelDto[i];
        }
    }

    public BadgesBadgeLabelDto(TypeDto typeDto, String str) {
        this.type = typeDto;
        this.text = str;
    }

    public final String d() {
        return this.text;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BadgesBadgeLabelDto)) {
            return false;
        }
        BadgesBadgeLabelDto badgesBadgeLabelDto = (BadgesBadgeLabelDto) obj;
        return this.type == badgesBadgeLabelDto.type && epx.f(this.text, badgesBadgeLabelDto.text);
    }

    public final int hashCode() {
        int hashCode = this.type.hashCode() * 31;
        String str = this.text;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BadgesBadgeLabelDto(type=");
        sb.append(this.type);
        sb.append(", text=");
        return ho8.a(sb, this.text, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.type.writeToParcel(parcel, i);
        parcel.writeString(this.text);
    }

    public /* synthetic */ BadgesBadgeLabelDto(TypeDto typeDto, String str, int i, zcl zclVar) {
        this(typeDto, (i & 2) != 0 ? null : str);
    }
}
