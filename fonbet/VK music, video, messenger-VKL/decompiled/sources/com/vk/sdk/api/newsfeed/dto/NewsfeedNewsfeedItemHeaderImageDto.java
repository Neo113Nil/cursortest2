package com.vk.sdk.api.newsfeed.dto;

import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.vk.dto.common.id.UserId;
import com.vk.movika.sdk.base.model.history.b;
import com.vk.sdk.api.photos.dto.PhotosPhotoSizesDto;
import java.util.List;
import xsna.asp;
import xsna.epx;
import xsna.pmi0;
import xsna.zcl;
import xsna.zrp;

/* compiled from: NewsfeedNewsfeedItemHeaderImageDto.kt */
/* loaded from: classes5.dex */
public final class NewsfeedNewsfeedItemHeaderImageDto {

    @pmi0(CampaignEx.JSON_KEY_IMAGE_URL)
    private final String imageUrl;

    @pmi0("name")
    private final String name;

    @pmi0("sizes")
    private final List<PhotosPhotoSizesDto> sizes;

    @pmi0("source_id")
    private final UserId sourceId;

    @pmi0(TtmlNode.TAG_STYLE)
    private final StyleDto style;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: NewsfeedNewsfeedItemHeaderImageDto.kt */
    public static final class StyleDto {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ StyleDto[] $VALUES;

        @pmi0("circle")
        public static final StyleDto CIRCLE;

        @pmi0("square")
        public static final StyleDto SQUARE;

        @pmi0("squircle")
        public static final StyleDto SQUIRCLE;
        private final String value;

        static {
            StyleDto styleDto = new StyleDto("CIRCLE", 0, "circle");
            CIRCLE = styleDto;
            StyleDto styleDto2 = new StyleDto("SQUARE", 1, "square");
            SQUARE = styleDto2;
            StyleDto styleDto3 = new StyleDto("SQUIRCLE", 2, "squircle");
            SQUIRCLE = styleDto3;
            StyleDto[] styleDtoArr = {styleDto, styleDto2, styleDto3};
            $VALUES = styleDtoArr;
            $ENTRIES = new asp(styleDtoArr);
        }

        private StyleDto(String str, int i, String str2) {
            this.value = str2;
        }

        public static StyleDto valueOf(String str) {
            return (StyleDto) Enum.valueOf(StyleDto.class, str);
        }

        public static StyleDto[] values() {
            return (StyleDto[]) $VALUES.clone();
        }
    }

    public NewsfeedNewsfeedItemHeaderImageDto() {
        this(null, null, null, null, null, 31, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NewsfeedNewsfeedItemHeaderImageDto)) {
            return false;
        }
        NewsfeedNewsfeedItemHeaderImageDto newsfeedNewsfeedItemHeaderImageDto = (NewsfeedNewsfeedItemHeaderImageDto) obj;
        return epx.f(this.sourceId, newsfeedNewsfeedItemHeaderImageDto.sourceId) && epx.f(this.imageUrl, newsfeedNewsfeedItemHeaderImageDto.imageUrl) && epx.f(this.name, newsfeedNewsfeedItemHeaderImageDto.name) && epx.f(this.sizes, newsfeedNewsfeedItemHeaderImageDto.sizes) && this.style == newsfeedNewsfeedItemHeaderImageDto.style;
    }

    public final int hashCode() {
        UserId userId = this.sourceId;
        int hashCode = (userId == null ? 0 : Long.hashCode(userId.b)) * 31;
        String str = this.imageUrl;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.name;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        List<PhotosPhotoSizesDto> list = this.sizes;
        int hashCode4 = (hashCode3 + (list == null ? 0 : list.hashCode())) * 31;
        StyleDto styleDto = this.style;
        return hashCode4 + (styleDto != null ? styleDto.hashCode() : 0);
    }

    public final String toString() {
        UserId userId = this.sourceId;
        String str = this.imageUrl;
        String str2 = this.name;
        List<PhotosPhotoSizesDto> list = this.sizes;
        StyleDto styleDto = this.style;
        StringBuilder sb = new StringBuilder("NewsfeedNewsfeedItemHeaderImageDto(sourceId=");
        sb.append(userId);
        sb.append(", imageUrl=");
        sb.append(str);
        sb.append(", name=");
        b.c(str2, ", sizes=", ", style=", sb, list);
        sb.append(styleDto);
        sb.append(")");
        return sb.toString();
    }

    public NewsfeedNewsfeedItemHeaderImageDto(UserId userId, String str, String str2, List<PhotosPhotoSizesDto> list, StyleDto styleDto) {
        this.sourceId = userId;
        this.imageUrl = str;
        this.name = str2;
        this.sizes = list;
        this.style = styleDto;
    }

    public /* synthetic */ NewsfeedNewsfeedItemHeaderImageDto(UserId userId, String str, String str2, List list, StyleDto styleDto, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : userId, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : list, (i & 16) != 0 ? null : styleDto);
    }
}
