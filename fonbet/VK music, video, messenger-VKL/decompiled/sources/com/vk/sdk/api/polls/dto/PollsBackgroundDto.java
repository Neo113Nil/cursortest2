package com.vk.sdk.api.polls.dto;

import com.vk.movika.sdk.base.model.history.b;
import com.vk.sdk.api.base.dto.BaseGradientPointDto;
import com.vk.sdk.api.base.dto.BaseImageDto;
import java.util.List;
import ru.ok.android.api.core.ApiInvocationException;
import xsna.asp;
import xsna.epx;
import xsna.oq;
import xsna.pmi0;
import xsna.sq;
import xsna.zcl;
import xsna.zrp;

/* compiled from: PollsBackgroundDto.kt */
/* loaded from: classes5.dex */
public final class PollsBackgroundDto {

    @pmi0("angle")
    private final Integer angle;

    @pmi0("color")
    private final String color;

    @pmi0("height")
    private final Integer height;

    @pmi0("id")
    private final Integer id;

    @pmi0("images")
    private final List<BaseImageDto> images;

    @pmi0("name")
    private final String name;

    @pmi0("points")
    private final List<BaseGradientPointDto> points;

    @pmi0("type")
    private final TypeDto type;

    @pmi0("width")
    private final Integer width;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: PollsBackgroundDto.kt */
    public static final class TypeDto {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ TypeDto[] $VALUES;

        @pmi0("gradient")
        public static final TypeDto GRADIENT;

        @pmi0("tile")
        public static final TypeDto TILE;
        private final String value;

        static {
            TypeDto typeDto = new TypeDto("GRADIENT", 0, "gradient");
            GRADIENT = typeDto;
            TypeDto typeDto2 = new TypeDto("TILE", 1, "tile");
            TILE = typeDto2;
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

    public PollsBackgroundDto() {
        this(null, null, null, null, null, null, null, null, null, ApiInvocationException.ErrorCodes.IDS_BLOCKED, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PollsBackgroundDto)) {
            return false;
        }
        PollsBackgroundDto pollsBackgroundDto = (PollsBackgroundDto) obj;
        return epx.f(this.angle, pollsBackgroundDto.angle) && epx.f(this.color, pollsBackgroundDto.color) && epx.f(this.height, pollsBackgroundDto.height) && epx.f(this.id, pollsBackgroundDto.id) && epx.f(this.name, pollsBackgroundDto.name) && epx.f(this.images, pollsBackgroundDto.images) && epx.f(this.points, pollsBackgroundDto.points) && this.type == pollsBackgroundDto.type && epx.f(this.width, pollsBackgroundDto.width);
    }

    public final int hashCode() {
        Integer num = this.angle;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.color;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Integer num2 = this.height;
        int hashCode3 = (hashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.id;
        int hashCode4 = (hashCode3 + (num3 == null ? 0 : num3.hashCode())) * 31;
        String str2 = this.name;
        int hashCode5 = (hashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        List<BaseImageDto> list = this.images;
        int hashCode6 = (hashCode5 + (list == null ? 0 : list.hashCode())) * 31;
        List<BaseGradientPointDto> list2 = this.points;
        int hashCode7 = (hashCode6 + (list2 == null ? 0 : list2.hashCode())) * 31;
        TypeDto typeDto = this.type;
        int hashCode8 = (hashCode7 + (typeDto == null ? 0 : typeDto.hashCode())) * 31;
        Integer num4 = this.width;
        return hashCode8 + (num4 != null ? num4.hashCode() : 0);
    }

    public final String toString() {
        Integer num = this.angle;
        String str = this.color;
        Integer num2 = this.height;
        Integer num3 = this.id;
        String str2 = this.name;
        List<BaseImageDto> list = this.images;
        List<BaseGradientPointDto> list2 = this.points;
        TypeDto typeDto = this.type;
        Integer num4 = this.width;
        StringBuilder sb = new StringBuilder("PollsBackgroundDto(angle=");
        sb.append(num);
        sb.append(", color=");
        sb.append(str);
        sb.append(", height=");
        sq.b(sb, num2, ", id=", num3, ", name=");
        b.c(str2, ", images=", ", points=", sb, list);
        sb.append(list2);
        sb.append(", type=");
        sb.append(typeDto);
        sb.append(", width=");
        return oq.b(sb, num4, ")");
    }

    public PollsBackgroundDto(Integer num, String str, Integer num2, Integer num3, String str2, List<BaseImageDto> list, List<BaseGradientPointDto> list2, TypeDto typeDto, Integer num4) {
        this.angle = num;
        this.color = str;
        this.height = num2;
        this.id = num3;
        this.name = str2;
        this.images = list;
        this.points = list2;
        this.type = typeDto;
        this.width = num4;
    }

    public /* synthetic */ PollsBackgroundDto(Integer num, String str, Integer num2, Integer num3, String str2, List list, List list2, TypeDto typeDto, Integer num4, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : num2, (i & 8) != 0 ? null : num3, (i & 16) != 0 ? null : str2, (i & 32) != 0 ? null : list, (i & 64) != 0 ? null : list2, (i & 128) != 0 ? null : typeDto, (i & 256) != 0 ? null : num4);
    }
}
