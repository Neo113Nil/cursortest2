package com.vk.sdk.api.bugtracker.dto;

import com.vk.sdk.api.docs.dto.DocsDocDto;
import com.vk.sdk.api.photos.dto.PhotosPhotoDto;
import xsna.asp;
import xsna.epx;
import xsna.pmi0;
import xsna.zcl;
import xsna.zrp;

/* compiled from: BugtrackerAttachmentDto.kt */
/* loaded from: classes5.dex */
public final class BugtrackerAttachmentDto {

    @pmi0("doc")
    private final DocsDocDto doc;

    @pmi0("photo")
    private final PhotosPhotoDto photo;

    @pmi0("type")
    private final TypeDto type;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: BugtrackerAttachmentDto.kt */
    public static final class TypeDto {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ TypeDto[] $VALUES;

        @pmi0("doc")
        public static final TypeDto DOC;

        @pmi0("photo")
        public static final TypeDto PHOTO;
        private final String value;

        static {
            TypeDto typeDto = new TypeDto("PHOTO", 0, "photo");
            PHOTO = typeDto;
            TypeDto typeDto2 = new TypeDto("DOC", 1, "doc");
            DOC = typeDto2;
            TypeDto[] typeDtoArr = {typeDto, typeDto2};
            $VALUES = typeDtoArr;
            $ENTRIES = new asp(typeDtoArr);
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
    }

    public BugtrackerAttachmentDto(TypeDto typeDto, DocsDocDto docsDocDto, PhotosPhotoDto photosPhotoDto) {
        this.type = typeDto;
        this.doc = docsDocDto;
        this.photo = photosPhotoDto;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BugtrackerAttachmentDto)) {
            return false;
        }
        BugtrackerAttachmentDto bugtrackerAttachmentDto = (BugtrackerAttachmentDto) obj;
        return this.type == bugtrackerAttachmentDto.type && epx.f(this.doc, bugtrackerAttachmentDto.doc) && epx.f(this.photo, bugtrackerAttachmentDto.photo);
    }

    public final int hashCode() {
        int hashCode = this.type.hashCode() * 31;
        DocsDocDto docsDocDto = this.doc;
        int hashCode2 = (hashCode + (docsDocDto == null ? 0 : docsDocDto.hashCode())) * 31;
        PhotosPhotoDto photosPhotoDto = this.photo;
        return hashCode2 + (photosPhotoDto != null ? photosPhotoDto.hashCode() : 0);
    }

    public final String toString() {
        return "BugtrackerAttachmentDto(type=" + this.type + ", doc=" + this.doc + ", photo=" + this.photo + ")";
    }

    public /* synthetic */ BugtrackerAttachmentDto(TypeDto typeDto, DocsDocDto docsDocDto, PhotosPhotoDto photosPhotoDto, int i, zcl zclVar) {
        this(typeDto, (i & 2) != 0 ? null : docsDocDto, (i & 4) != 0 ? null : photosPhotoDto);
    }
}
