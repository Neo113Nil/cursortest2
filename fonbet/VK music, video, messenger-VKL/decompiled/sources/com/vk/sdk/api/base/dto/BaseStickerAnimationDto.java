package com.vk.sdk.api.base.dto;

import xsna.asp;
import xsna.epx;
import xsna.pmi0;
import xsna.zcl;
import xsna.zrp;

/* compiled from: BaseStickerAnimationDto.kt */
/* loaded from: classes5.dex */
public final class BaseStickerAnimationDto {

    @pmi0("type")
    private final TypeDto type;

    @pmi0("url")
    private final String url;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: BaseStickerAnimationDto.kt */
    public static final class TypeDto {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ TypeDto[] $VALUES;

        @pmi0("dark")
        public static final TypeDto DARK;

        @pmi0("light")
        public static final TypeDto LIGHT;
        private final String value;

        static {
            TypeDto typeDto = new TypeDto("LIGHT", 0, "light");
            LIGHT = typeDto;
            TypeDto typeDto2 = new TypeDto("DARK", 1, "dark");
            DARK = typeDto2;
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

    /* JADX WARN: Multi-variable type inference failed */
    public BaseStickerAnimationDto() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BaseStickerAnimationDto)) {
            return false;
        }
        BaseStickerAnimationDto baseStickerAnimationDto = (BaseStickerAnimationDto) obj;
        return this.type == baseStickerAnimationDto.type && epx.f(this.url, baseStickerAnimationDto.url);
    }

    public final int hashCode() {
        TypeDto typeDto = this.type;
        int hashCode = (typeDto == null ? 0 : typeDto.hashCode()) * 31;
        String str = this.url;
        return hashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        return "BaseStickerAnimationDto(type=" + this.type + ", url=" + this.url + ")";
    }

    public BaseStickerAnimationDto(TypeDto typeDto, String str) {
        this.type = typeDto;
        this.url = str;
    }

    public /* synthetic */ BaseStickerAnimationDto(TypeDto typeDto, String str, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : typeDto, (i & 2) != 0 ? null : str);
    }
}
