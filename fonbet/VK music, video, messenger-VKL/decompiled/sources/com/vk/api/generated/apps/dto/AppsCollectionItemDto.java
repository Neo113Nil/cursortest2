package com.vk.api.generated.apps.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.api.generated.base.dto.BaseImageDto;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.asp;
import xsna.bo;
import xsna.dn;
import xsna.epx;
import xsna.ms9;
import xsna.pmi0;
import xsna.shy;
import xsna.urd0;
import xsna.zcl;
import xsna.zrp;

/* compiled from: AppsCollectionItemDto.kt */
/* loaded from: classes14.dex */
public final class AppsCollectionItemDto implements Parcelable {
    public static final Parcelable.Creator<AppsCollectionItemDto> CREATOR = new a();

    @pmi0("apps_count")
    private final int appsCount;

    @pmi0("id")
    private final int id;

    @pmi0("images")
    private final List<BaseImageDto> images;

    @pmi0("name")
    private final String name;

    @pmi0("type")
    private final TypeDto type;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: AppsCollectionItemDto.kt */
    public static final class TypeDto implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ TypeDto[] $VALUES;

        @pmi0("collection")
        public static final TypeDto COLLECTION;
        public static final Parcelable.Creator<TypeDto> CREATOR;

        @pmi0("dg_selection")
        public static final TypeDto DG_SELECTION;

        @pmi0("ios_selection")
        public static final TypeDto IOS_SELECTION;

        @pmi0("mvk_selection")
        public static final TypeDto MVK_SELECTION;

        @pmi0("selection")
        public static final TypeDto SELECTION;
        private final String value;

        /* compiled from: AppsCollectionItemDto.kt */
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
            TypeDto typeDto = new TypeDto("COLLECTION", 0, "collection");
            COLLECTION = typeDto;
            TypeDto typeDto2 = new TypeDto("DG_SELECTION", 1, "dg_selection");
            DG_SELECTION = typeDto2;
            TypeDto typeDto3 = new TypeDto("IOS_SELECTION", 2, "ios_selection");
            IOS_SELECTION = typeDto3;
            TypeDto typeDto4 = new TypeDto("MVK_SELECTION", 3, "mvk_selection");
            MVK_SELECTION = typeDto4;
            TypeDto typeDto5 = new TypeDto("SELECTION", 4, "selection");
            SELECTION = typeDto5;
            TypeDto[] typeDtoArr = {typeDto, typeDto2, typeDto3, typeDto4, typeDto5};
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

    /* compiled from: AppsCollectionItemDto.kt */
    public static final class a implements Parcelable.Creator<AppsCollectionItemDto> {
        @Override // android.os.Parcelable.Creator
        public final AppsCollectionItemDto createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            int readInt = parcel.readInt();
            String readString = parcel.readString();
            TypeDto createFromParcel = TypeDto.CREATOR.createFromParcel(parcel);
            int readInt2 = parcel.readInt();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt3 = parcel.readInt();
                arrayList = new ArrayList(readInt3);
                int i = 0;
                while (i != readInt3) {
                    i = bo.b(AppsCollectionItemDto.class, parcel, arrayList, i, 1);
                }
            }
            return new AppsCollectionItemDto(readInt, readString, createFromParcel, readInt2, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final AppsCollectionItemDto[] newArray(int i) {
            return new AppsCollectionItemDto[i];
        }
    }

    public AppsCollectionItemDto(int i, String str, TypeDto typeDto, int i2, List<BaseImageDto> list) {
        this.id = i;
        this.name = str;
        this.type = typeDto;
        this.appsCount = i2;
        this.images = list;
    }

    public final String d() {
        return this.name;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AppsCollectionItemDto)) {
            return false;
        }
        AppsCollectionItemDto appsCollectionItemDto = (AppsCollectionItemDto) obj;
        return this.id == appsCollectionItemDto.id && epx.f(this.name, appsCollectionItemDto.name) && this.type == appsCollectionItemDto.type && this.appsCount == appsCollectionItemDto.appsCount && epx.f(this.images, appsCollectionItemDto.images);
    }

    public final int hashCode() {
        int a2 = shy.a(this.appsCount, (this.type.hashCode() + urd0.a(Integer.hashCode(this.id) * 31, 31, this.name)) * 31, 31);
        List<BaseImageDto> list = this.images;
        return a2 + (list == null ? 0 : list.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AppsCollectionItemDto(id=");
        sb.append(this.id);
        sb.append(", name=");
        sb.append(this.name);
        sb.append(", type=");
        sb.append(this.type);
        sb.append(", appsCount=");
        sb.append(this.appsCount);
        sb.append(", images=");
        return ms9.a(')', sb, this.images);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.id);
        parcel.writeString(this.name);
        this.type.writeToParcel(parcel, i);
        parcel.writeInt(this.appsCount);
        List<BaseImageDto> list = this.images;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator f = dn.f(parcel, list, 1);
        while (f.hasNext()) {
            parcel.writeParcelable((Parcelable) f.next(), i);
        }
    }

    public /* synthetic */ AppsCollectionItemDto(int i, String str, TypeDto typeDto, int i2, List list, int i3, zcl zclVar) {
        this(i, str, typeDto, i2, (i3 & 16) != 0 ? null : list);
    }
}
