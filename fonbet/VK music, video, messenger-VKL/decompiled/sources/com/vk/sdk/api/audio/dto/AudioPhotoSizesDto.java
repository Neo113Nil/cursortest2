package com.vk.sdk.api.audio.dto;

import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import ru.ok.android.utils.Logger;
import ru.ok.tracer.base.ucum.UcumUtils;
import xsna.asp;
import xsna.epx;
import xsna.pmi0;
import xsna.shy;
import xsna.xy6;
import xsna.zrp;

/* compiled from: AudioPhotoSizesDto.kt */
/* loaded from: classes5.dex */
public final class AudioPhotoSizesDto {

    @pmi0("height")
    private final int height;

    @pmi0("src")
    private final String src;

    @pmi0("type")
    private final TypeDto type;

    @pmi0("width")
    private final int width;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: AudioPhotoSizesDto.kt */
    public static final class TypeDto {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ TypeDto[] $VALUES;

        @pmi0("base")
        public static final TypeDto BASE;

        @pmi0(InneractiveMediationDefs.GENDER_MALE)
        public static final TypeDto M;

        @pmi0("o")
        public static final TypeDto O;

        @pmi0(TtmlNode.TAG_P)
        public static final TypeDto P;

        @pmi0(CampaignEx.JSON_KEY_AD_Q)
        public static final TypeDto Q;

        @pmi0("r")
        public static final TypeDto R;

        @pmi0(UcumUtils.UCUM_SECONDS)
        public static final TypeDto S;

        @pmi0(Logger.METHOD_W)
        public static final TypeDto W;

        @pmi0("x")
        public static final TypeDto X;

        @pmi0("y")
        public static final TypeDto Y;

        @pmi0("z")
        public static final TypeDto Z;
        private final String value;

        static {
            TypeDto typeDto = new TypeDto("S", 0, UcumUtils.UCUM_SECONDS);
            S = typeDto;
            TypeDto typeDto2 = new TypeDto("M", 1, InneractiveMediationDefs.GENDER_MALE);
            M = typeDto2;
            TypeDto typeDto3 = new TypeDto("X", 2, "x");
            X = typeDto3;
            TypeDto typeDto4 = new TypeDto("Y", 3, "y");
            Y = typeDto4;
            TypeDto typeDto5 = new TypeDto("Z", 4, "z");
            Z = typeDto5;
            TypeDto typeDto6 = new TypeDto("W", 5, Logger.METHOD_W);
            W = typeDto6;
            TypeDto typeDto7 = new TypeDto("O", 6, "o");
            O = typeDto7;
            TypeDto typeDto8 = new TypeDto("P", 7, TtmlNode.TAG_P);
            P = typeDto8;
            TypeDto typeDto9 = new TypeDto("Q", 8, CampaignEx.JSON_KEY_AD_Q);
            Q = typeDto9;
            TypeDto typeDto10 = new TypeDto("R", 9, "r");
            R = typeDto10;
            TypeDto typeDto11 = new TypeDto("BASE", 10, "base");
            BASE = typeDto11;
            TypeDto[] typeDtoArr = {typeDto, typeDto2, typeDto3, typeDto4, typeDto5, typeDto6, typeDto7, typeDto8, typeDto9, typeDto10, typeDto11};
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

    public AudioPhotoSizesDto(String str, int i, int i2, TypeDto typeDto) {
        this.src = str;
        this.width = i;
        this.height = i2;
        this.type = typeDto;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AudioPhotoSizesDto)) {
            return false;
        }
        AudioPhotoSizesDto audioPhotoSizesDto = (AudioPhotoSizesDto) obj;
        return epx.f(this.src, audioPhotoSizesDto.src) && this.width == audioPhotoSizesDto.width && this.height == audioPhotoSizesDto.height && this.type == audioPhotoSizesDto.type;
    }

    public final int hashCode() {
        return this.type.hashCode() + shy.a(this.height, shy.a(this.width, this.src.hashCode() * 31, 31), 31);
    }

    public final String toString() {
        String str = this.src;
        int i = this.width;
        int i2 = this.height;
        TypeDto typeDto = this.type;
        StringBuilder b = xy6.b(i, "AudioPhotoSizesDto(src=", str, ", width=", ", height=");
        b.append(i2);
        b.append(", type=");
        b.append(typeDto);
        b.append(")");
        return b.toString();
    }
}
