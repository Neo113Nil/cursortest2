package com.vk.api.generated.superApp.dto;

import android.os.Parcel;
import android.os.Parcelable;
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

/* compiled from: SuperAppUniversalWidgetBaseBadgeDto.kt */
/* loaded from: classes15.dex */
public final class SuperAppUniversalWidgetBaseBadgeDto implements Parcelable {
    public static final Parcelable.Creator<SuperAppUniversalWidgetBaseBadgeDto> CREATOR = new a();

    @pmi0("images")
    private final List<SuperAppUniversalWidgetImageItemDto> images;

    @pmi0("type")
    private final TypeDto type;

    @pmi0("value")
    private final String value;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: SuperAppUniversalWidgetBaseBadgeDto.kt */
    public static final class TypeDto implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ TypeDto[] $VALUES;
        public static final Parcelable.Creator<TypeDto> CREATOR;

        @pmi0("discount")
        public static final TypeDto DISCOUNT;

        @pmi0("image")
        public static final TypeDto IMAGE;

        @pmi0("new")
        public static final TypeDto NEW;
        private final String value;

        /* compiled from: SuperAppUniversalWidgetBaseBadgeDto.kt */
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
            TypeDto typeDto3 = new TypeDto("IMAGE", 2, "image");
            IMAGE = typeDto3;
            TypeDto[] typeDtoArr = {typeDto, typeDto2, typeDto3};
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

    /* compiled from: SuperAppUniversalWidgetBaseBadgeDto.kt */
    public static final class a implements Parcelable.Creator<SuperAppUniversalWidgetBaseBadgeDto> {
        @Override // android.os.Parcelable.Creator
        public final SuperAppUniversalWidgetBaseBadgeDto createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            TypeDto createFromParcel = TypeDto.CREATOR.createFromParcel(parcel);
            String readString = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(readInt);
                int i = 0;
                while (i != readInt) {
                    i = en.a(SuperAppUniversalWidgetImageItemDto.CREATOR, parcel, arrayList2, i, 1);
                }
                arrayList = arrayList2;
            }
            return new SuperAppUniversalWidgetBaseBadgeDto(createFromParcel, readString, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final SuperAppUniversalWidgetBaseBadgeDto[] newArray(int i) {
            return new SuperAppUniversalWidgetBaseBadgeDto[i];
        }
    }

    public SuperAppUniversalWidgetBaseBadgeDto(TypeDto typeDto, String str, List<SuperAppUniversalWidgetImageItemDto> list) {
        this.type = typeDto;
        this.value = str;
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
        if (!(obj instanceof SuperAppUniversalWidgetBaseBadgeDto)) {
            return false;
        }
        SuperAppUniversalWidgetBaseBadgeDto superAppUniversalWidgetBaseBadgeDto = (SuperAppUniversalWidgetBaseBadgeDto) obj;
        return this.type == superAppUniversalWidgetBaseBadgeDto.type && epx.f(this.value, superAppUniversalWidgetBaseBadgeDto.value) && epx.f(this.images, superAppUniversalWidgetBaseBadgeDto.images);
    }

    public final int hashCode() {
        int hashCode = this.type.hashCode() * 31;
        String str = this.value;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        List<SuperAppUniversalWidgetImageItemDto> list = this.images;
        return hashCode2 + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SuperAppUniversalWidgetBaseBadgeDto(type=");
        sb.append(this.type);
        sb.append(", value=");
        sb.append(this.value);
        sb.append(", images=");
        return ms9.a(')', sb, this.images);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.type.writeToParcel(parcel, i);
        parcel.writeString(this.value);
        List<SuperAppUniversalWidgetImageItemDto> list = this.images;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator f = dn.f(parcel, list, 1);
        while (f.hasNext()) {
            ((SuperAppUniversalWidgetImageItemDto) f.next()).writeToParcel(parcel, i);
        }
    }

    public /* synthetic */ SuperAppUniversalWidgetBaseBadgeDto(TypeDto typeDto, String str, List list, int i, zcl zclVar) {
        this(typeDto, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : list);
    }
}
