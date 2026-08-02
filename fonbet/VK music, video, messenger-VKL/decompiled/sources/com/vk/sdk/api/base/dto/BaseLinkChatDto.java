package com.vk.sdk.api.base.dto;

import com.vk.sdk.api.photos.dto.PhotosPhotoDto;
import xsna.asp;
import xsna.epx;
import xsna.pmi0;
import xsna.shy;
import xsna.urd0;
import xsna.xe9;
import xsna.zcl;
import xsna.zrp;

/* compiled from: BaseLinkChatDto.kt */
/* loaded from: classes5.dex */
public final class BaseLinkChatDto {

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
    public static final class TypeDto {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ TypeDto[] $VALUES;

        @pmi0("0")
        public static final TypeDto CHAT;

        @pmi0("17")
        public static final TypeDto GROUP;
        private final int value;

        static {
            TypeDto typeDto = new TypeDto("CHAT", 0, 0);
            CHAT = typeDto;
            TypeDto typeDto2 = new TypeDto("GROUP", 1, 17);
            GROUP = typeDto2;
            TypeDto[] typeDtoArr = {typeDto, typeDto2};
            $VALUES = typeDtoArr;
            $ENTRIES = new asp(typeDtoArr);
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
    }

    public BaseLinkChatDto(String str, String str2, TypeDto typeDto, int i, PhotosPhotoDto photosPhotoDto) {
        this.title = str;
        this.inviteLink = str2;
        this.type = typeDto;
        this.membersCount = i;
        this.photo = photosPhotoDto;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BaseLinkChatDto)) {
            return false;
        }
        BaseLinkChatDto baseLinkChatDto = (BaseLinkChatDto) obj;
        return epx.f(this.title, baseLinkChatDto.title) && epx.f(this.inviteLink, baseLinkChatDto.inviteLink) && this.type == baseLinkChatDto.type && this.membersCount == baseLinkChatDto.membersCount && epx.f(this.photo, baseLinkChatDto.photo);
    }

    public final int hashCode() {
        int a = shy.a(this.membersCount, (this.type.hashCode() + urd0.a(this.title.hashCode() * 31, 31, this.inviteLink)) * 31, 31);
        PhotosPhotoDto photosPhotoDto = this.photo;
        return a + (photosPhotoDto == null ? 0 : photosPhotoDto.hashCode());
    }

    public final String toString() {
        String str = this.title;
        String str2 = this.inviteLink;
        TypeDto typeDto = this.type;
        int i = this.membersCount;
        PhotosPhotoDto photosPhotoDto = this.photo;
        StringBuilder a = xe9.a("BaseLinkChatDto(title=", str, ", inviteLink=", str2, ", type=");
        a.append(typeDto);
        a.append(", membersCount=");
        a.append(i);
        a.append(", photo=");
        a.append(photosPhotoDto);
        a.append(")");
        return a.toString();
    }

    public /* synthetic */ BaseLinkChatDto(String str, String str2, TypeDto typeDto, int i, PhotosPhotoDto photosPhotoDto, int i2, zcl zclVar) {
        this(str, str2, typeDto, i, (i2 & 16) != 0 ? null : photosPhotoDto);
    }
}
