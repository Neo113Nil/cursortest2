package com.vk.api.generated.groups.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.unity3d.ads.BuildConfig;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.ao;
import xsna.asp;
import xsna.en;
import xsna.epx;
import xsna.fw3;
import xsna.ho8;
import xsna.pmi0;
import xsna.shy;
import xsna.urd0;
import xsna.zcl;
import xsna.zrp;

/* compiled from: GroupsSuggestionsDto.kt */
/* loaded from: classes14.dex */
public final class GroupsSuggestionsDto implements Parcelable {
    public static final Parcelable.Creator<GroupsSuggestionsDto> CREATOR = new a();

    @pmi0("count")
    private final int count;

    @pmi0("items")
    private final List<GroupsSuggestionDto> items;

    @pmi0("next_from")
    private final String nextFrom;

    @pmi0("title")
    private final String title;

    @pmi0("track_code")
    private final String trackCode;

    @pmi0("type")
    private final TypeDto type;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: GroupsSuggestionsDto.kt */
    public static final class TypeDto implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ TypeDto[] $VALUES;
        public static final Parcelable.Creator<TypeDto> CREATOR;

        @pmi0(BuildConfig.FLAVOR)
        public static final TypeDto DEFAULT;

        @pmi0("inline")
        public static final TypeDto INLINE;
        private final String value;

        /* compiled from: GroupsSuggestionsDto.kt */
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
            TypeDto typeDto2 = new TypeDto("INLINE", 1, "inline");
            INLINE = typeDto2;
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

    /* compiled from: GroupsSuggestionsDto.kt */
    public static final class a implements Parcelable.Creator<GroupsSuggestionsDto> {
        @Override // android.os.Parcelable.Creator
        public final GroupsSuggestionsDto createFromParcel(Parcel parcel) {
            TypeDto createFromParcel = TypeDto.CREATOR.createFromParcel(parcel);
            int readInt = parcel.readInt();
            String readString = parcel.readString();
            int readInt2 = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt2);
            int i = 0;
            while (i != readInt2) {
                i = en.a(GroupsSuggestionDto.CREATOR, parcel, arrayList, i, 1);
            }
            return new GroupsSuggestionsDto(createFromParcel, readInt, readString, arrayList, parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final GroupsSuggestionsDto[] newArray(int i) {
            return new GroupsSuggestionsDto[i];
        }
    }

    public GroupsSuggestionsDto(TypeDto typeDto, int i, String str, List<GroupsSuggestionDto> list, String str2, String str3) {
        this.type = typeDto;
        this.count = i;
        this.title = str;
        this.items = list;
        this.trackCode = str2;
        this.nextFrom = str3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GroupsSuggestionsDto)) {
            return false;
        }
        GroupsSuggestionsDto groupsSuggestionsDto = (GroupsSuggestionsDto) obj;
        return this.type == groupsSuggestionsDto.type && this.count == groupsSuggestionsDto.count && epx.f(this.title, groupsSuggestionsDto.title) && epx.f(this.items, groupsSuggestionsDto.items) && epx.f(this.trackCode, groupsSuggestionsDto.trackCode) && epx.f(this.nextFrom, groupsSuggestionsDto.nextFrom);
    }

    public final int hashCode() {
        int a2 = urd0.a(fw3.a(urd0.a(shy.a(this.count, this.type.hashCode() * 31, 31), 31, this.title), 31, this.items), 31, this.trackCode);
        String str = this.nextFrom;
        return a2 + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GroupsSuggestionsDto(type=");
        sb.append(this.type);
        sb.append(", count=");
        sb.append(this.count);
        sb.append(", title=");
        sb.append(this.title);
        sb.append(", items=");
        sb.append(this.items);
        sb.append(", trackCode=");
        sb.append(this.trackCode);
        sb.append(", nextFrom=");
        return ho8.a(sb, this.nextFrom, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.type.writeToParcel(parcel, i);
        parcel.writeInt(this.count);
        parcel.writeString(this.title);
        Iterator a2 = ao.a(parcel, this.items);
        while (a2.hasNext()) {
            ((GroupsSuggestionDto) a2.next()).writeToParcel(parcel, i);
        }
        parcel.writeString(this.trackCode);
        parcel.writeString(this.nextFrom);
    }

    public /* synthetic */ GroupsSuggestionsDto(TypeDto typeDto, int i, String str, List list, String str2, String str3, int i2, zcl zclVar) {
        this(typeDto, i, str, list, str2, (i2 & 32) != 0 ? null : str3);
    }
}
