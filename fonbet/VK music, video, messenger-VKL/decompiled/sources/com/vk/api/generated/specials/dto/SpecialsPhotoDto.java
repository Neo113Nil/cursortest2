package com.vk.api.generated.specials.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.api.generated.base.dto.BaseImageDto;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.ao;
import xsna.asp;
import xsna.bo;
import xsna.epx;
import xsna.ms9;
import xsna.pmi0;
import xsna.zrp;

/* compiled from: SpecialsPhotoDto.kt */
/* loaded from: classes15.dex */
public final class SpecialsPhotoDto implements Parcelable {
    public static final Parcelable.Creator<SpecialsPhotoDto> CREATOR = new a();

    @pmi0("images")
    private final List<BaseImageDto> images;

    @pmi0("type")
    private final TypeDto type;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: SpecialsPhotoDto.kt */
    public static final class TypeDto implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ TypeDto[] $VALUES;

        @pmi0("avatar")
        public static final TypeDto AVATAR;
        public static final Parcelable.Creator<TypeDto> CREATOR;

        @pmi0("custom")
        public static final TypeDto CUSTOM;
        private final String value;

        /* compiled from: SpecialsPhotoDto.kt */
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
            TypeDto typeDto = new TypeDto("AVATAR", 0, "avatar");
            AVATAR = typeDto;
            TypeDto typeDto2 = new TypeDto("CUSTOM", 1, "custom");
            CUSTOM = typeDto2;
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

    /* compiled from: SpecialsPhotoDto.kt */
    public static final class a implements Parcelable.Creator<SpecialsPhotoDto> {
        @Override // android.os.Parcelable.Creator
        public final SpecialsPhotoDto createFromParcel(Parcel parcel) {
            TypeDto createFromParcel = TypeDto.CREATOR.createFromParcel(parcel);
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            int i = 0;
            while (i != readInt) {
                i = bo.b(SpecialsPhotoDto.class, parcel, arrayList, i, 1);
            }
            return new SpecialsPhotoDto(createFromParcel, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final SpecialsPhotoDto[] newArray(int i) {
            return new SpecialsPhotoDto[i];
        }
    }

    public SpecialsPhotoDto(TypeDto typeDto, List<BaseImageDto> list) {
        this.type = typeDto;
        this.images = list;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SpecialsPhotoDto)) {
            return false;
        }
        SpecialsPhotoDto specialsPhotoDto = (SpecialsPhotoDto) obj;
        return this.type == specialsPhotoDto.type && epx.f(this.images, specialsPhotoDto.images);
    }

    public final int hashCode() {
        return this.images.hashCode() + (this.type.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SpecialsPhotoDto(type=");
        sb.append(this.type);
        sb.append(", images=");
        return ms9.a(')', sb, this.images);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.type.writeToParcel(parcel, i);
        Iterator a2 = ao.a(parcel, this.images);
        while (a2.hasNext()) {
            parcel.writeParcelable((Parcelable) a2.next(), i);
        }
    }
}
