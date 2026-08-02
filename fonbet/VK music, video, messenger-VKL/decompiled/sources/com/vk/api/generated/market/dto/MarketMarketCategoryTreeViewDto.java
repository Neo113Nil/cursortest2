package com.vk.api.generated.market.dto;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;
import xsna.asp;
import xsna.epx;
import xsna.ms9;
import xsna.pmi0;
import xsna.sn;
import xsna.zcl;
import xsna.zrp;

/* compiled from: MarketMarketCategoryTreeViewDto.kt */
/* loaded from: classes15.dex */
public final class MarketMarketCategoryTreeViewDto implements Parcelable {
    public static final Parcelable.Creator<MarketMarketCategoryTreeViewDto> CREATOR = new a();

    @pmi0("root_path")
    private final List<String> rootPath;

    @pmi0("selected")
    private final Boolean selected;

    @pmi0("type")
    private final TypeDto type;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MarketMarketCategoryTreeViewDto.kt */
    public static final class TypeDto implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ TypeDto[] $VALUES;
        public static final Parcelable.Creator<TypeDto> CREATOR;

        @pmi0("tab_root")
        public static final TypeDto TAB_ROOT;
        private final String value;

        /* compiled from: MarketMarketCategoryTreeViewDto.kt */
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
            TypeDto typeDto = new TypeDto("TAB_ROOT", 0, "tab_root");
            TAB_ROOT = typeDto;
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

    /* compiled from: MarketMarketCategoryTreeViewDto.kt */
    public static final class a implements Parcelable.Creator<MarketMarketCategoryTreeViewDto> {
        @Override // android.os.Parcelable.Creator
        public final MarketMarketCategoryTreeViewDto createFromParcel(Parcel parcel) {
            Boolean bool = null;
            TypeDto createFromParcel = parcel.readInt() == 0 ? null : TypeDto.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() != 0) {
                bool = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new MarketMarketCategoryTreeViewDto(createFromParcel, bool, parcel.createStringArrayList());
        }

        @Override // android.os.Parcelable.Creator
        public final MarketMarketCategoryTreeViewDto[] newArray(int i) {
            return new MarketMarketCategoryTreeViewDto[i];
        }
    }

    public MarketMarketCategoryTreeViewDto() {
        this(null, null, null, 7, null);
    }

    public final Boolean d() {
        return this.selected;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final TypeDto e() {
        return this.type;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MarketMarketCategoryTreeViewDto)) {
            return false;
        }
        MarketMarketCategoryTreeViewDto marketMarketCategoryTreeViewDto = (MarketMarketCategoryTreeViewDto) obj;
        return this.type == marketMarketCategoryTreeViewDto.type && epx.f(this.selected, marketMarketCategoryTreeViewDto.selected) && epx.f(this.rootPath, marketMarketCategoryTreeViewDto.rootPath);
    }

    public final int hashCode() {
        TypeDto typeDto = this.type;
        int hashCode = (typeDto == null ? 0 : typeDto.hashCode()) * 31;
        Boolean bool = this.selected;
        int hashCode2 = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        List<String> list = this.rootPath;
        return hashCode2 + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MarketMarketCategoryTreeViewDto(type=");
        sb.append(this.type);
        sb.append(", selected=");
        sb.append(this.selected);
        sb.append(", rootPath=");
        return ms9.a(')', sb, this.rootPath);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        TypeDto typeDto = this.type;
        if (typeDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            typeDto.writeToParcel(parcel, i);
        }
        Boolean bool = this.selected;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool);
        }
        parcel.writeStringList(this.rootPath);
    }

    public MarketMarketCategoryTreeViewDto(TypeDto typeDto, Boolean bool, List<String> list) {
        this.type = typeDto;
        this.selected = bool;
        this.rootPath = list;
    }

    public /* synthetic */ MarketMarketCategoryTreeViewDto(TypeDto typeDto, Boolean bool, List list, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : typeDto, (i & 2) != 0 ? null : bool, (i & 4) != 0 ? null : list);
    }
}
