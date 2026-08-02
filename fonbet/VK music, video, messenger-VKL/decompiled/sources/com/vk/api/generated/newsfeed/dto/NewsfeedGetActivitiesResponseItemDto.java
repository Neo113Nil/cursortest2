package com.vk.api.generated.newsfeed.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.api.generated.wall.dto.WallPostActivityDto;
import com.vk.dto.common.id.UserId;
import xsna.asp;
import xsna.bh10;
import xsna.epx;
import xsna.pmi0;
import xsna.shy;
import xsna.zrp;

/* compiled from: NewsfeedGetActivitiesResponseItemDto.kt */
/* loaded from: classes15.dex */
public final class NewsfeedGetActivitiesResponseItemDto implements Parcelable {
    public static final Parcelable.Creator<NewsfeedGetActivitiesResponseItemDto> CREATOR = new a();

    @pmi0("activity")
    private final WallPostActivityDto activity;

    @pmi0("id")
    private final int id;

    @pmi0("owner_id")
    private final UserId ownerId;

    @pmi0("type")
    private final TypeDto type;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: NewsfeedGetActivitiesResponseItemDto.kt */
    public static final class TypeDto implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ TypeDto[] $VALUES;

        @pmi0("clip")
        public static final TypeDto CLIP;
        public static final Parcelable.Creator<TypeDto> CREATOR;

        @pmi0("post")
        public static final TypeDto POST;
        private final String value;

        /* compiled from: NewsfeedGetActivitiesResponseItemDto.kt */
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
            TypeDto typeDto = new TypeDto("POST", 0, "post");
            POST = typeDto;
            TypeDto typeDto2 = new TypeDto("CLIP", 1, "clip");
            CLIP = typeDto2;
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

    /* compiled from: NewsfeedGetActivitiesResponseItemDto.kt */
    public static final class a implements Parcelable.Creator<NewsfeedGetActivitiesResponseItemDto> {
        @Override // android.os.Parcelable.Creator
        public final NewsfeedGetActivitiesResponseItemDto createFromParcel(Parcel parcel) {
            return new NewsfeedGetActivitiesResponseItemDto(TypeDto.CREATOR.createFromParcel(parcel), (UserId) parcel.readParcelable(NewsfeedGetActivitiesResponseItemDto.class.getClassLoader()), parcel.readInt(), (WallPostActivityDto) parcel.readParcelable(NewsfeedGetActivitiesResponseItemDto.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final NewsfeedGetActivitiesResponseItemDto[] newArray(int i) {
            return new NewsfeedGetActivitiesResponseItemDto[i];
        }
    }

    public NewsfeedGetActivitiesResponseItemDto(TypeDto typeDto, UserId userId, int i, WallPostActivityDto wallPostActivityDto) {
        this.type = typeDto;
        this.ownerId = userId;
        this.id = i;
        this.activity = wallPostActivityDto;
    }

    public final WallPostActivityDto d() {
        return this.activity;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NewsfeedGetActivitiesResponseItemDto)) {
            return false;
        }
        NewsfeedGetActivitiesResponseItemDto newsfeedGetActivitiesResponseItemDto = (NewsfeedGetActivitiesResponseItemDto) obj;
        return this.type == newsfeedGetActivitiesResponseItemDto.type && epx.f(this.ownerId, newsfeedGetActivitiesResponseItemDto.ownerId) && this.id == newsfeedGetActivitiesResponseItemDto.id && epx.f(this.activity, newsfeedGetActivitiesResponseItemDto.activity);
    }

    public final int getId() {
        return this.id;
    }

    public final int hashCode() {
        return this.activity.hashCode() + shy.a(this.id, bh10.a(this.type.hashCode() * 31, 31, this.ownerId.b), 31);
    }

    public final UserId q() {
        return this.ownerId;
    }

    public final String toString() {
        return "NewsfeedGetActivitiesResponseItemDto(type=" + this.type + ", ownerId=" + this.ownerId + ", id=" + this.id + ", activity=" + this.activity + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.type.writeToParcel(parcel, i);
        parcel.writeParcelable(this.ownerId, i);
        parcel.writeInt(this.id);
        parcel.writeParcelable(this.activity, i);
    }
}
