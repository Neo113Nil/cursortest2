package com.vk.api.generated.tags.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.api.generated.base.dto.BaseLinkDto;
import com.vk.dto.common.id.UserId;
import io.reactivex.rxjava3.subjects.b;
import xsna.asp;
import xsna.bh10;
import xsna.epx;
import xsna.nr;
import xsna.pmi0;
import xsna.shy;
import xsna.sn;
import xsna.tn;
import xsna.zcl;
import xsna.zrp;

/* compiled from: TagsObjectTagDto.kt */
/* loaded from: classes15.dex */
public final class TagsObjectTagDto implements Parcelable {
    public static final Parcelable.Creator<TagsObjectTagDto> CREATOR = new a();

    @pmi0("end_time")
    private final Integer endTime;

    @pmi0("id")
    private final int id;

    @pmi0("is_adult")
    private final Boolean isAdult;

    @pmi0("is_owner")
    private final Boolean isOwner;

    @pmi0("item_id")
    private final int itemId;

    @pmi0("link")
    private final BaseLinkDto link;

    @pmi0("owner_id")
    private final UserId ownerId;

    @pmi0("product_id")
    private final int productId;

    @pmi0("start_time")
    private final Integer startTime;

    @pmi0("tag_type")
    private final TagTypeDto tagType;

    @pmi0("type")
    private final TypeDto type;

    @pmi0("x")
    private final Float x;

    @pmi0("y")
    private final Float y;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: TagsObjectTagDto.kt */
    public static final class TagTypeDto implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ TagTypeDto[] $VALUES;
        public static final Parcelable.Creator<TagTypeDto> CREATOR;

        @pmi0("link")
        public static final TagTypeDto LINK;

        @pmi0("market")
        public static final TagTypeDto MARKET;
        private final String value;

        /* compiled from: TagsObjectTagDto.kt */
        public static final class a implements Parcelable.Creator<TagTypeDto> {
            @Override // android.os.Parcelable.Creator
            public final TagTypeDto createFromParcel(Parcel parcel) {
                return TagTypeDto.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final TagTypeDto[] newArray(int i) {
                return new TagTypeDto[i];
            }
        }

        static {
            TagTypeDto tagTypeDto = new TagTypeDto("LINK", 0, "link");
            LINK = tagTypeDto;
            TagTypeDto tagTypeDto2 = new TagTypeDto("MARKET", 1, "market");
            MARKET = tagTypeDto2;
            TagTypeDto[] tagTypeDtoArr = {tagTypeDto, tagTypeDto2};
            $VALUES = tagTypeDtoArr;
            $ENTRIES = new asp(tagTypeDtoArr);
            CREATOR = new a();
        }

        private TagTypeDto(String str, int i, String str2) {
            this.value = str2;
        }

        public static TagTypeDto valueOf(String str) {
            return (TagTypeDto) Enum.valueOf(TagTypeDto.class, str);
        }

        public static TagTypeDto[] values() {
            return (TagTypeDto[]) $VALUES.clone();
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

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: TagsObjectTagDto.kt */
    public static final class TypeDto implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ TypeDto[] $VALUES;
        public static final Parcelable.Creator<TypeDto> CREATOR;

        @pmi0("photo")
        public static final TypeDto PHOTO;
        private final String value;

        /* compiled from: TagsObjectTagDto.kt */
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
            TypeDto typeDto = new TypeDto("PHOTO", 0, "photo");
            PHOTO = typeDto;
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

    /* compiled from: TagsObjectTagDto.kt */
    public static final class a implements Parcelable.Creator<TagsObjectTagDto> {
        @Override // android.os.Parcelable.Creator
        public final TagsObjectTagDto createFromParcel(Parcel parcel) {
            Boolean valueOf;
            int readInt = parcel.readInt();
            TypeDto createFromParcel = TypeDto.CREATOR.createFromParcel(parcel);
            UserId userId = (UserId) parcel.readParcelable(TagsObjectTagDto.class.getClassLoader());
            int readInt2 = parcel.readInt();
            int readInt3 = parcel.readInt();
            BaseLinkDto createFromParcel2 = BaseLinkDto.CREATOR.createFromParcel(parcel);
            Boolean bool = null;
            TagTypeDto createFromParcel3 = parcel.readInt() == 0 ? null : TagTypeDto.CREATOR.createFromParcel(parcel);
            Float valueOf2 = parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat());
            Float valueOf3 = parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat());
            Integer valueOf4 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Integer valueOf5 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            if (parcel.readInt() == 0) {
                valueOf = null;
            } else {
                valueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() != 0) {
                bool = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new TagsObjectTagDto(readInt, createFromParcel, userId, readInt2, readInt3, createFromParcel2, createFromParcel3, valueOf2, valueOf3, valueOf4, valueOf5, valueOf, bool);
        }

        @Override // android.os.Parcelable.Creator
        public final TagsObjectTagDto[] newArray(int i) {
            return new TagsObjectTagDto[i];
        }
    }

    public TagsObjectTagDto(int i, TypeDto typeDto, UserId userId, int i2, int i3, BaseLinkDto baseLinkDto, TagTypeDto tagTypeDto, Float f, Float f2, Integer num, Integer num2, Boolean bool, Boolean bool2) {
        this.id = i;
        this.type = typeDto;
        this.ownerId = userId;
        this.itemId = i2;
        this.productId = i3;
        this.link = baseLinkDto;
        this.tagType = tagTypeDto;
        this.x = f;
        this.y = f2;
        this.startTime = num;
        this.endTime = num2;
        this.isOwner = bool;
        this.isAdult = bool2;
    }

    public final Integer d() {
        return this.endTime;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final int e() {
        return this.itemId;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TagsObjectTagDto)) {
            return false;
        }
        TagsObjectTagDto tagsObjectTagDto = (TagsObjectTagDto) obj;
        return this.id == tagsObjectTagDto.id && this.type == tagsObjectTagDto.type && epx.f(this.ownerId, tagsObjectTagDto.ownerId) && this.itemId == tagsObjectTagDto.itemId && this.productId == tagsObjectTagDto.productId && epx.f(this.link, tagsObjectTagDto.link) && this.tagType == tagsObjectTagDto.tagType && epx.f(this.x, tagsObjectTagDto.x) && epx.f(this.y, tagsObjectTagDto.y) && epx.f(this.startTime, tagsObjectTagDto.startTime) && epx.f(this.endTime, tagsObjectTagDto.endTime) && epx.f(this.isOwner, tagsObjectTagDto.isOwner) && epx.f(this.isAdult, tagsObjectTagDto.isAdult);
    }

    public final BaseLinkDto f() {
        return this.link;
    }

    public final int g() {
        return this.productId;
    }

    public final int getId() {
        return this.id;
    }

    public final int hashCode() {
        int hashCode = (this.link.hashCode() + shy.a(this.productId, shy.a(this.itemId, bh10.a((this.type.hashCode() + (Integer.hashCode(this.id) * 31)) * 31, 31, this.ownerId.b), 31), 31)) * 31;
        TagTypeDto tagTypeDto = this.tagType;
        int hashCode2 = (hashCode + (tagTypeDto == null ? 0 : tagTypeDto.hashCode())) * 31;
        Float f = this.x;
        int hashCode3 = (hashCode2 + (f == null ? 0 : f.hashCode())) * 31;
        Float f2 = this.y;
        int hashCode4 = (hashCode3 + (f2 == null ? 0 : f2.hashCode())) * 31;
        Integer num = this.startTime;
        int hashCode5 = (hashCode4 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.endTime;
        int hashCode6 = (hashCode5 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Boolean bool = this.isOwner;
        int hashCode7 = (hashCode6 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.isAdult;
        return hashCode7 + (bool2 != null ? bool2.hashCode() : 0);
    }

    public final Integer i() {
        return this.startTime;
    }

    public final Float j() {
        return this.x;
    }

    public final Float k() {
        return this.y;
    }

    public final Boolean l() {
        return this.isAdult;
    }

    public final Boolean n() {
        return this.isOwner;
    }

    public final UserId q() {
        return this.ownerId;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TagsObjectTagDto(id=");
        sb.append(this.id);
        sb.append(", type=");
        sb.append(this.type);
        sb.append(", ownerId=");
        sb.append(this.ownerId);
        sb.append(", itemId=");
        sb.append(this.itemId);
        sb.append(", productId=");
        sb.append(this.productId);
        sb.append(", link=");
        sb.append(this.link);
        sb.append(", tagType=");
        sb.append(this.tagType);
        sb.append(", x=");
        sb.append(this.x);
        sb.append(", y=");
        sb.append(this.y);
        sb.append(", startTime=");
        sb.append(this.startTime);
        sb.append(", endTime=");
        sb.append(this.endTime);
        sb.append(", isOwner=");
        sb.append(this.isOwner);
        sb.append(", isAdult=");
        return tn.a(sb, this.isAdult, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.id);
        this.type.writeToParcel(parcel, i);
        parcel.writeParcelable(this.ownerId, i);
        parcel.writeInt(this.itemId);
        parcel.writeInt(this.productId);
        this.link.writeToParcel(parcel, i);
        TagTypeDto tagTypeDto = this.tagType;
        if (tagTypeDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            tagTypeDto.writeToParcel(parcel, i);
        }
        Float f = this.x;
        if (f == null) {
            parcel.writeInt(0);
        } else {
            b.d(parcel, 1, f);
        }
        Float f2 = this.y;
        if (f2 == null) {
            parcel.writeInt(0);
        } else {
            b.d(parcel, 1, f2);
        }
        Integer num = this.startTime;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
        Integer num2 = this.endTime;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num2);
        }
        Boolean bool = this.isOwner;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool);
        }
        Boolean bool2 = this.isAdult;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool2);
        }
    }

    public /* synthetic */ TagsObjectTagDto(int i, TypeDto typeDto, UserId userId, int i2, int i3, BaseLinkDto baseLinkDto, TagTypeDto tagTypeDto, Float f, Float f2, Integer num, Integer num2, Boolean bool, Boolean bool2, int i4, zcl zclVar) {
        this(i, typeDto, userId, i2, i3, baseLinkDto, (i4 & 64) != 0 ? null : tagTypeDto, (i4 & 128) != 0 ? null : f, (i4 & 256) != 0 ? null : f2, (i4 & 512) != 0 ? null : num, (i4 & 1024) != 0 ? null : num2, (i4 & 2048) != 0 ? null : bool, (i4 & 4096) != 0 ? null : bool2);
    }
}
