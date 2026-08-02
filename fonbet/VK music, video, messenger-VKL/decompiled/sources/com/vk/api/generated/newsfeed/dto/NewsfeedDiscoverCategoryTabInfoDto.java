package com.vk.api.generated.newsfeed.dto;

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
import xsna.fw3;
import xsna.nr;
import xsna.pmi0;
import xsna.uqi;
import xsna.urd0;
import xsna.zcl;
import xsna.zrp;

/* compiled from: NewsfeedDiscoverCategoryTabInfoDto.kt */
/* loaded from: classes15.dex */
public final class NewsfeedDiscoverCategoryTabInfoDto implements Parcelable {
    public static final Parcelable.Creator<NewsfeedDiscoverCategoryTabInfoDto> CREATOR = new a();

    @pmi0("cache_ttl")
    private final Integer cacheTtl;

    @pmi0("id")
    private final String id;

    @pmi0("image")
    private final List<BaseImageDto> image;

    @pmi0("name")
    private final String name;

    @pmi0("ref")
    private final NewsfeedDiscoverCategoryRefDto ref;

    @pmi0("seen_cache_ttl")
    private final Integer seenCacheTtl;

    @pmi0("track_code")
    private final String trackCode;

    @pmi0("type")
    private final TypeDto type;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: NewsfeedDiscoverCategoryTabInfoDto.kt */
    public static final class TypeDto implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ TypeDto[] $VALUES;
        public static final Parcelable.Creator<TypeDto> CREATOR;

        @pmi0("discover")
        public static final TypeDto DISCOVER;

        @pmi0("discover_full")
        public static final TypeDto DISCOVER_FULL;
        private final String value;

        /* compiled from: NewsfeedDiscoverCategoryTabInfoDto.kt */
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
            TypeDto typeDto = new TypeDto("DISCOVER_FULL", 0, "discover_full");
            DISCOVER_FULL = typeDto;
            TypeDto typeDto2 = new TypeDto("DISCOVER", 1, "discover");
            DISCOVER = typeDto2;
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

    /* compiled from: NewsfeedDiscoverCategoryTabInfoDto.kt */
    public static final class a implements Parcelable.Creator<NewsfeedDiscoverCategoryTabInfoDto> {
        @Override // android.os.Parcelable.Creator
        public final NewsfeedDiscoverCategoryTabInfoDto createFromParcel(Parcel parcel) {
            String readString = parcel.readString();
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            int i = 0;
            while (i != readInt) {
                i = bo.b(NewsfeedDiscoverCategoryTabInfoDto.class, parcel, arrayList, i, 1);
            }
            return new NewsfeedDiscoverCategoryTabInfoDto(readString, arrayList, parcel.readString(), TypeDto.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : NewsfeedDiscoverCategoryRefDto.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final NewsfeedDiscoverCategoryTabInfoDto[] newArray(int i) {
            return new NewsfeedDiscoverCategoryTabInfoDto[i];
        }
    }

    public NewsfeedDiscoverCategoryTabInfoDto(String str, List<BaseImageDto> list, String str2, TypeDto typeDto, NewsfeedDiscoverCategoryRefDto newsfeedDiscoverCategoryRefDto, String str3, Integer num, Integer num2) {
        this.id = str;
        this.image = list;
        this.name = str2;
        this.type = typeDto;
        this.ref = newsfeedDiscoverCategoryRefDto;
        this.trackCode = str3;
        this.cacheTtl = num;
        this.seenCacheTtl = num2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NewsfeedDiscoverCategoryTabInfoDto)) {
            return false;
        }
        NewsfeedDiscoverCategoryTabInfoDto newsfeedDiscoverCategoryTabInfoDto = (NewsfeedDiscoverCategoryTabInfoDto) obj;
        return epx.f(this.id, newsfeedDiscoverCategoryTabInfoDto.id) && epx.f(this.image, newsfeedDiscoverCategoryTabInfoDto.image) && epx.f(this.name, newsfeedDiscoverCategoryTabInfoDto.name) && this.type == newsfeedDiscoverCategoryTabInfoDto.type && epx.f(this.ref, newsfeedDiscoverCategoryTabInfoDto.ref) && epx.f(this.trackCode, newsfeedDiscoverCategoryTabInfoDto.trackCode) && epx.f(this.cacheTtl, newsfeedDiscoverCategoryTabInfoDto.cacheTtl) && epx.f(this.seenCacheTtl, newsfeedDiscoverCategoryTabInfoDto.seenCacheTtl);
    }

    public final int hashCode() {
        int hashCode = (this.type.hashCode() + urd0.a(fw3.a(this.id.hashCode() * 31, 31, this.image), 31, this.name)) * 31;
        NewsfeedDiscoverCategoryRefDto newsfeedDiscoverCategoryRefDto = this.ref;
        int hashCode2 = (hashCode + (newsfeedDiscoverCategoryRefDto == null ? 0 : newsfeedDiscoverCategoryRefDto.hashCode())) * 31;
        String str = this.trackCode;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.cacheTtl;
        int hashCode4 = (hashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.seenCacheTtl;
        return hashCode4 + (num2 != null ? num2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NewsfeedDiscoverCategoryTabInfoDto(id=");
        sb.append(this.id);
        sb.append(", image=");
        sb.append(this.image);
        sb.append(", name=");
        sb.append(this.name);
        sb.append(", type=");
        sb.append(this.type);
        sb.append(", ref=");
        sb.append(this.ref);
        sb.append(", trackCode=");
        sb.append(this.trackCode);
        sb.append(", cacheTtl=");
        sb.append(this.cacheTtl);
        sb.append(", seenCacheTtl=");
        return uqi.b(sb, this.seenCacheTtl, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.id);
        Iterator a2 = ao.a(parcel, this.image);
        while (a2.hasNext()) {
            parcel.writeParcelable((Parcelable) a2.next(), i);
        }
        parcel.writeString(this.name);
        this.type.writeToParcel(parcel, i);
        NewsfeedDiscoverCategoryRefDto newsfeedDiscoverCategoryRefDto = this.ref;
        if (newsfeedDiscoverCategoryRefDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            newsfeedDiscoverCategoryRefDto.writeToParcel(parcel, i);
        }
        parcel.writeString(this.trackCode);
        Integer num = this.cacheTtl;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
        Integer num2 = this.seenCacheTtl;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num2);
        }
    }

    public /* synthetic */ NewsfeedDiscoverCategoryTabInfoDto(String str, List list, String str2, TypeDto typeDto, NewsfeedDiscoverCategoryRefDto newsfeedDiscoverCategoryRefDto, String str3, Integer num, Integer num2, int i, zcl zclVar) {
        this(str, list, str2, typeDto, (i & 16) != 0 ? null : newsfeedDiscoverCategoryRefDto, (i & 32) != 0 ? null : str3, (i & 64) != 0 ? null : num, (i & 128) != 0 ? null : num2);
    }
}
