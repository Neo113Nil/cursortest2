package com.vk.api.generated.masks.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.unity3d.ads.BuildConfig;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.asp;
import xsna.dn;
import xsna.en;
import xsna.epx;
import xsna.pmi0;
import xsna.zcl;
import xsna.zrp;

/* compiled from: MasksCameraCatalogBlockDto.kt */
/* loaded from: classes15.dex */
public final class MasksCameraCatalogBlockDto implements Parcelable {
    public static final Parcelable.Creator<MasksCameraCatalogBlockDto> CREATOR = new a();

    @pmi0("items")
    private final List<MasksCameraCatalogItemDto> items;

    @pmi0("type")
    private final TypeDto type;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MasksCameraCatalogBlockDto.kt */
    public static final class TypeDto implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ TypeDto[] $VALUES;
        public static final Parcelable.Creator<TypeDto> CREATOR;

        @pmi0(BuildConfig.FLAVOR)
        public static final TypeDto DEFAULT;

        @pmi0("favorite")
        public static final TypeDto FAVORITE;
        private final String value;

        /* compiled from: MasksCameraCatalogBlockDto.kt */
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
            TypeDto typeDto2 = new TypeDto("FAVORITE", 1, "favorite");
            FAVORITE = typeDto2;
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

    /* compiled from: MasksCameraCatalogBlockDto.kt */
    public static final class a implements Parcelable.Creator<MasksCameraCatalogBlockDto> {
        @Override // android.os.Parcelable.Creator
        public final MasksCameraCatalogBlockDto createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt = parcel.readInt();
                arrayList = new ArrayList(readInt);
                int i = 0;
                while (i != readInt) {
                    i = en.a(MasksCameraCatalogItemDto.CREATOR, parcel, arrayList, i, 1);
                }
            }
            return new MasksCameraCatalogBlockDto(arrayList, parcel.readInt() != 0 ? TypeDto.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final MasksCameraCatalogBlockDto[] newArray(int i) {
            return new MasksCameraCatalogBlockDto[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public MasksCameraCatalogBlockDto() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MasksCameraCatalogBlockDto)) {
            return false;
        }
        MasksCameraCatalogBlockDto masksCameraCatalogBlockDto = (MasksCameraCatalogBlockDto) obj;
        return epx.f(this.items, masksCameraCatalogBlockDto.items) && this.type == masksCameraCatalogBlockDto.type;
    }

    public final int hashCode() {
        List<MasksCameraCatalogItemDto> list = this.items;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        TypeDto typeDto = this.type;
        return hashCode + (typeDto != null ? typeDto.hashCode() : 0);
    }

    public final String toString() {
        return "MasksCameraCatalogBlockDto(items=" + this.items + ", type=" + this.type + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        List<MasksCameraCatalogItemDto> list = this.items;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator f = dn.f(parcel, list, 1);
            while (f.hasNext()) {
                ((MasksCameraCatalogItemDto) f.next()).writeToParcel(parcel, i);
            }
        }
        TypeDto typeDto = this.type;
        if (typeDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            typeDto.writeToParcel(parcel, i);
        }
    }

    public MasksCameraCatalogBlockDto(List<MasksCameraCatalogItemDto> list, TypeDto typeDto) {
        this.items = list;
        this.type = typeDto;
    }

    public /* synthetic */ MasksCameraCatalogBlockDto(List list, TypeDto typeDto, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : list, (i & 2) != 0 ? null : typeDto);
    }
}
