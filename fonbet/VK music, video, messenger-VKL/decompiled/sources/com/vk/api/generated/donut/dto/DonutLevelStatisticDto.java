package com.vk.api.generated.donut.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.epx;
import xsna.pmi0;
import xsna.urd0;
import xsna.vu5;
import xsna.zrp;

/* compiled from: DonutLevelStatisticDto.kt */
/* loaded from: classes14.dex */
public final class DonutLevelStatisticDto implements Parcelable {
    public static final Parcelable.Creator<DonutLevelStatisticDto> CREATOR = new a();

    @pmi0("count")
    private final int count;

    @pmi0("description")
    private final String description;

    @pmi0("type")
    private final TypeDto type;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: DonutLevelStatisticDto.kt */
    public static final class TypeDto implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ TypeDto[] $VALUES;

        @pmi0("articles")
        public static final TypeDto ARTICLES;

        @pmi0("chats")
        public static final TypeDto CHATS;

        @pmi0("comment")
        public static final TypeDto COMMENT;
        public static final Parcelable.Creator<TypeDto> CREATOR;

        @pmi0("videos")
        public static final TypeDto VIDEOS;

        @pmi0("wall")
        public static final TypeDto WALL;
        private final String value;

        /* compiled from: DonutLevelStatisticDto.kt */
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
            TypeDto typeDto = new TypeDto("WALL", 0, "wall");
            WALL = typeDto;
            TypeDto typeDto2 = new TypeDto("VIDEOS", 1, "videos");
            VIDEOS = typeDto2;
            TypeDto typeDto3 = new TypeDto("ARTICLES", 2, "articles");
            ARTICLES = typeDto3;
            TypeDto typeDto4 = new TypeDto("CHATS", 3, "chats");
            CHATS = typeDto4;
            TypeDto typeDto5 = new TypeDto("COMMENT", 4, "comment");
            COMMENT = typeDto5;
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

    /* compiled from: DonutLevelStatisticDto.kt */
    public static final class a implements Parcelable.Creator<DonutLevelStatisticDto> {
        @Override // android.os.Parcelable.Creator
        public final DonutLevelStatisticDto createFromParcel(Parcel parcel) {
            return new DonutLevelStatisticDto(TypeDto.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final DonutLevelStatisticDto[] newArray(int i) {
            return new DonutLevelStatisticDto[i];
        }
    }

    public DonutLevelStatisticDto(TypeDto typeDto, String str, int i) {
        this.type = typeDto;
        this.description = str;
        this.count = i;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DonutLevelStatisticDto)) {
            return false;
        }
        DonutLevelStatisticDto donutLevelStatisticDto = (DonutLevelStatisticDto) obj;
        return this.type == donutLevelStatisticDto.type && epx.f(this.description, donutLevelStatisticDto.description) && this.count == donutLevelStatisticDto.count;
    }

    public final int hashCode() {
        return Integer.hashCode(this.count) + urd0.a(this.type.hashCode() * 31, 31, this.description);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DonutLevelStatisticDto(type=");
        sb.append(this.type);
        sb.append(", description=");
        sb.append(this.description);
        sb.append(", count=");
        return vu5.b(sb, this.count, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.type.writeToParcel(parcel, i);
        parcel.writeString(this.description);
        parcel.writeInt(this.count);
    }
}
