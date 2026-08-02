package com.vk.api.generated.search.dto;

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
import xsna.sn;
import xsna.zcl;
import xsna.zrp;

/* compiled from: SearchFilterItemDto.kt */
/* loaded from: classes15.dex */
public final class SearchFilterItemDto implements Parcelable {
    public static final Parcelable.Creator<SearchFilterItemDto> CREATOR = new a();

    @pmi0("filter_binary_item")
    private final SearchFilterItemBinaryDto filterBinaryItem;

    @pmi0("filter_selection_items")
    private final List<SearchFilterItemSelectionDto> filterSelectionItems;

    @pmi0("hide_title")
    private final Boolean hideTitle;

    @pmi0("icon")
    private final String icon;

    @pmi0("id")
    private final String id;

    @pmi0("is_enabled")
    private final Boolean isEnabled;

    @pmi0("title")
    private final String title;

    @pmi0("track_code")
    private final String trackCode;

    @pmi0("type")
    private final TypeDto type;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: SearchFilterItemDto.kt */
    public static final class TypeDto implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ TypeDto[] $VALUES;
        public static final Parcelable.Creator<TypeDto> CREATOR;

        @pmi0("filter_binary")
        public static final TypeDto FILTER_BINARY;

        @pmi0("filter_selection")
        public static final TypeDto FILTER_SELECTION;
        private final String value;

        /* compiled from: SearchFilterItemDto.kt */
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
            TypeDto typeDto = new TypeDto("FILTER_BINARY", 0, "filter_binary");
            FILTER_BINARY = typeDto;
            TypeDto typeDto2 = new TypeDto("FILTER_SELECTION", 1, "filter_selection");
            FILTER_SELECTION = typeDto2;
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

        public final String i() {
            return this.value;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(name());
        }
    }

    /* compiled from: SearchFilterItemDto.kt */
    public static final class a implements Parcelable.Creator<SearchFilterItemDto> {
        @Override // android.os.Parcelable.Creator
        public final SearchFilterItemDto createFromParcel(Parcel parcel) {
            Boolean valueOf;
            Boolean valueOf2;
            ArrayList arrayList;
            String readString = parcel.readString();
            TypeDto createFromParcel = TypeDto.CREATOR.createFromParcel(parcel);
            String readString2 = parcel.readString();
            int i = 0;
            if (parcel.readInt() == 0) {
                valueOf = null;
            } else {
                valueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            String readString3 = parcel.readString();
            if (parcel.readInt() == 0) {
                valueOf2 = null;
            } else {
                valueOf2 = Boolean.valueOf(parcel.readInt() != 0);
            }
            String readString4 = parcel.readString();
            SearchFilterItemBinaryDto createFromParcel2 = parcel.readInt() == 0 ? null : SearchFilterItemBinaryDto.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(readInt);
                while (i != readInt) {
                    i = en.a(SearchFilterItemSelectionDto.CREATOR, parcel, arrayList2, i, 1);
                }
                arrayList = arrayList2;
            }
            return new SearchFilterItemDto(readString, createFromParcel, readString2, valueOf, readString3, valueOf2, readString4, createFromParcel2, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final SearchFilterItemDto[] newArray(int i) {
            return new SearchFilterItemDto[i];
        }
    }

    public SearchFilterItemDto(String str, TypeDto typeDto, String str2, Boolean bool, String str3, Boolean bool2, String str4, SearchFilterItemBinaryDto searchFilterItemBinaryDto, List<SearchFilterItemSelectionDto> list) {
        this.id = str;
        this.type = typeDto;
        this.title = str2;
        this.hideTitle = bool;
        this.trackCode = str3;
        this.isEnabled = bool2;
        this.icon = str4;
        this.filterBinaryItem = searchFilterItemBinaryDto;
        this.filterSelectionItems = list;
    }

    public final SearchFilterItemBinaryDto d() {
        return this.filterBinaryItem;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final List<SearchFilterItemSelectionDto> e() {
        return this.filterSelectionItems;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SearchFilterItemDto)) {
            return false;
        }
        SearchFilterItemDto searchFilterItemDto = (SearchFilterItemDto) obj;
        return epx.f(this.id, searchFilterItemDto.id) && this.type == searchFilterItemDto.type && epx.f(this.title, searchFilterItemDto.title) && epx.f(this.hideTitle, searchFilterItemDto.hideTitle) && epx.f(this.trackCode, searchFilterItemDto.trackCode) && epx.f(this.isEnabled, searchFilterItemDto.isEnabled) && epx.f(this.icon, searchFilterItemDto.icon) && epx.f(this.filterBinaryItem, searchFilterItemDto.filterBinaryItem) && epx.f(this.filterSelectionItems, searchFilterItemDto.filterSelectionItems);
    }

    public final Boolean f() {
        return this.hideTitle;
    }

    public final String g() {
        return this.icon;
    }

    public final String getId() {
        return this.id;
    }

    public final String getTitle() {
        return this.title;
    }

    public final int hashCode() {
        int hashCode = (this.type.hashCode() + (this.id.hashCode() * 31)) * 31;
        String str = this.title;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool = this.hideTitle;
        int hashCode3 = (hashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str2 = this.trackCode;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Boolean bool2 = this.isEnabled;
        int hashCode5 = (hashCode4 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        String str3 = this.icon;
        int hashCode6 = (hashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
        SearchFilterItemBinaryDto searchFilterItemBinaryDto = this.filterBinaryItem;
        int hashCode7 = (hashCode6 + (searchFilterItemBinaryDto == null ? 0 : searchFilterItemBinaryDto.hashCode())) * 31;
        List<SearchFilterItemSelectionDto> list = this.filterSelectionItems;
        return hashCode7 + (list != null ? list.hashCode() : 0);
    }

    public final TypeDto i() {
        return this.type;
    }

    public final Boolean j() {
        return this.isEnabled;
    }

    public final String r() {
        return this.trackCode;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SearchFilterItemDto(id=");
        sb.append(this.id);
        sb.append(", type=");
        sb.append(this.type);
        sb.append(", title=");
        sb.append(this.title);
        sb.append(", hideTitle=");
        sb.append(this.hideTitle);
        sb.append(", trackCode=");
        sb.append(this.trackCode);
        sb.append(", isEnabled=");
        sb.append(this.isEnabled);
        sb.append(", icon=");
        sb.append(this.icon);
        sb.append(", filterBinaryItem=");
        sb.append(this.filterBinaryItem);
        sb.append(", filterSelectionItems=");
        return ms9.a(')', sb, this.filterSelectionItems);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.id);
        this.type.writeToParcel(parcel, i);
        parcel.writeString(this.title);
        Boolean bool = this.hideTitle;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool);
        }
        parcel.writeString(this.trackCode);
        Boolean bool2 = this.isEnabled;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool2);
        }
        parcel.writeString(this.icon);
        SearchFilterItemBinaryDto searchFilterItemBinaryDto = this.filterBinaryItem;
        if (searchFilterItemBinaryDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            searchFilterItemBinaryDto.writeToParcel(parcel, i);
        }
        List<SearchFilterItemSelectionDto> list = this.filterSelectionItems;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator f = dn.f(parcel, list, 1);
        while (f.hasNext()) {
            ((SearchFilterItemSelectionDto) f.next()).writeToParcel(parcel, i);
        }
    }

    public /* synthetic */ SearchFilterItemDto(String str, TypeDto typeDto, String str2, Boolean bool, String str3, Boolean bool2, String str4, SearchFilterItemBinaryDto searchFilterItemBinaryDto, List list, int i, zcl zclVar) {
        this(str, typeDto, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : bool, (i & 16) != 0 ? null : str3, (i & 32) != 0 ? null : bool2, (i & 64) != 0 ? null : str4, (i & 128) != 0 ? null : searchFilterItemBinaryDto, (i & 256) != 0 ? null : list);
    }
}
