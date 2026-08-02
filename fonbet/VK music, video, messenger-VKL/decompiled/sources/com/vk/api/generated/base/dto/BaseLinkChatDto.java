package com.vk.api.generated.base.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.api.generated.photos.dto.PhotosPhotoDto;
import xsna.asp;
import xsna.epx;
import xsna.pmi0;
import xsna.shy;
import xsna.urd0;
import xsna.zcl;
import xsna.zrp;

/* compiled from: BaseLinkChatDto.kt */
/* loaded from: classes14.dex */
public final class BaseLinkChatDto implements Parcelable {
    public static final Parcelable.Creator<BaseLinkChatDto> CREATOR = new a();

    @pmi0("description")
    private final String description;

    @pmi0("group")
    private final BaseLinkChatGroupDto group;

    @pmi0("invite_link")
    private final String inviteLink;

    @pmi0("members_count")
    private final int membersCount;

    @pmi0("photo")
    private final PhotosPhotoDto photo;

    @pmi0("title")
    private final String title;

    @pmi0("type")
    private final TypeDto type;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: BaseLinkChatDto.kt */
    public static final class TypeDto implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ TypeDto[] $VALUES;

        @pmi0("0")
        public static final TypeDto CHAT;
        public static final Parcelable.Creator<TypeDto> CREATOR;

        @pmi0("17")
        public static final TypeDto GROUP;
        private final int value;

        /* compiled from: BaseLinkChatDto.kt */
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
            TypeDto typeDto = new TypeDto("CHAT", 0, 0);
            CHAT = typeDto;
            TypeDto typeDto2 = new TypeDto("GROUP", 1, 17);
            GROUP = typeDto2;
            TypeDto[] typeDtoArr = {typeDto, typeDto2};
            $VALUES = typeDtoArr;
            $ENTRIES = new asp(typeDtoArr);
            CREATOR = new a();
        }

        private TypeDto(String str, int i, int i2) {
            this.value = i2;
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

    /* compiled from: BaseLinkChatDto.kt */
    public static final class a implements Parcelable.Creator<BaseLinkChatDto> {
        @Override // android.os.Parcelable.Creator
        public final BaseLinkChatDto createFromParcel(Parcel parcel) {
            return new BaseLinkChatDto(parcel.readString(), parcel.readString(), TypeDto.CREATOR.createFromParcel(parcel), parcel.readInt(), parcel.readInt() == 0 ? null : PhotosPhotoDto.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readInt() == 0 ? null : BaseLinkChatGroupDto.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final BaseLinkChatDto[] newArray(int i) {
            return new BaseLinkChatDto[i];
        }
    }

    public BaseLinkChatDto(String str, String str2, TypeDto typeDto, int i, PhotosPhotoDto photosPhotoDto, String str3, BaseLinkChatGroupDto baseLinkChatGroupDto) {
        this.title = str;
        this.inviteLink = str2;
        this.type = typeDto;
        this.membersCount = i;
        this.photo = photosPhotoDto;
        this.description = str3;
        this.group = baseLinkChatGroupDto;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BaseLinkChatDto)) {
            return false;
        }
        BaseLinkChatDto baseLinkChatDto = (BaseLinkChatDto) obj;
        return epx.f(this.title, baseLinkChatDto.title) && epx.f(this.inviteLink, baseLinkChatDto.inviteLink) && this.type == baseLinkChatDto.type && this.membersCount == baseLinkChatDto.membersCount && epx.f(this.photo, baseLinkChatDto.photo) && epx.f(this.description, baseLinkChatDto.description) && epx.f(this.group, baseLinkChatDto.group);
    }

    public final int hashCode() {
        int a2 = shy.a(this.membersCount, (this.type.hashCode() + urd0.a(this.title.hashCode() * 31, 31, this.inviteLink)) * 31, 31);
        PhotosPhotoDto photosPhotoDto = this.photo;
        int hashCode = (a2 + (photosPhotoDto == null ? 0 : photosPhotoDto.hashCode())) * 31;
        String str = this.description;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        BaseLinkChatGroupDto baseLinkChatGroupDto = this.group;
        return hashCode2 + (baseLinkChatGroupDto != null ? baseLinkChatGroupDto.hashCode() : 0);
    }

    public final String toString() {
        return "BaseLinkChatDto(title=" + this.title + ", inviteLink=" + this.inviteLink + ", type=" + this.type + ", membersCount=" + this.membersCount + ", photo=" + this.photo + ", description=" + this.description + ", group=" + this.group + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.title);
        parcel.writeString(this.inviteLink);
        this.type.writeToParcel(parcel, i);
        parcel.writeInt(this.membersCount);
        PhotosPhotoDto photosPhotoDto = this.photo;
        if (photosPhotoDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            photosPhotoDto.writeToParcel(parcel, i);
        }
        parcel.writeString(this.description);
        BaseLinkChatGroupDto baseLinkChatGroupDto = this.group;
        if (baseLinkChatGroupDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            baseLinkChatGroupDto.writeToParcel(parcel, i);
        }
    }

    public /* synthetic */ BaseLinkChatDto(String str, String str2, TypeDto typeDto, int i, PhotosPhotoDto photosPhotoDto, String str3, BaseLinkChatGroupDto baseLinkChatGroupDto, int i2, zcl zclVar) {
        this(str, str2, typeDto, i, (i2 & 16) != 0 ? null : photosPhotoDto, (i2 & 32) != 0 ? null : str3, (i2 & 64) != 0 ? null : baseLinkChatGroupDto);
    }
}
