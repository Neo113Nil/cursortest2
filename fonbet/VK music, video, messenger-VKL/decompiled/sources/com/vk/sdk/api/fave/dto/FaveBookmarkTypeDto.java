package com.vk.sdk.api.fave.dto;

import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: FaveBookmarkTypeDto.kt */
/* loaded from: classes5.dex */
public final class FaveBookmarkTypeDto {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ FaveBookmarkTypeDto[] $VALUES;

    @pmi0("article")
    public static final FaveBookmarkTypeDto ARTICLE;

    @pmi0("clip")
    public static final FaveBookmarkTypeDto CLIP;

    @pmi0("link")
    public static final FaveBookmarkTypeDto LINK;

    @pmi0("narrative")
    public static final FaveBookmarkTypeDto NARRATIVE;

    @pmi0("podcast")
    public static final FaveBookmarkTypeDto PODCAST;

    @pmi0("post")
    public static final FaveBookmarkTypeDto POST;

    @pmi0("product")
    public static final FaveBookmarkTypeDto PRODUCT;

    @pmi0("video")
    public static final FaveBookmarkTypeDto VIDEO;

    @pmi0("youla_product")
    public static final FaveBookmarkTypeDto YOULA_PRODUCT;
    private final String value;

    static {
        FaveBookmarkTypeDto faveBookmarkTypeDto = new FaveBookmarkTypeDto("POST", 0, "post");
        POST = faveBookmarkTypeDto;
        FaveBookmarkTypeDto faveBookmarkTypeDto2 = new FaveBookmarkTypeDto(SignalingProtocol.MEDIA_OPTION_VIDEO, 1, "video");
        VIDEO = faveBookmarkTypeDto2;
        FaveBookmarkTypeDto faveBookmarkTypeDto3 = new FaveBookmarkTypeDto("PRODUCT", 2, "product");
        PRODUCT = faveBookmarkTypeDto3;
        FaveBookmarkTypeDto faveBookmarkTypeDto4 = new FaveBookmarkTypeDto("ARTICLE", 3, "article");
        ARTICLE = faveBookmarkTypeDto4;
        FaveBookmarkTypeDto faveBookmarkTypeDto5 = new FaveBookmarkTypeDto("LINK", 4, "link");
        LINK = faveBookmarkTypeDto5;
        FaveBookmarkTypeDto faveBookmarkTypeDto6 = new FaveBookmarkTypeDto("PODCAST", 5, "podcast");
        PODCAST = faveBookmarkTypeDto6;
        FaveBookmarkTypeDto faveBookmarkTypeDto7 = new FaveBookmarkTypeDto("NARRATIVE", 6, "narrative");
        NARRATIVE = faveBookmarkTypeDto7;
        FaveBookmarkTypeDto faveBookmarkTypeDto8 = new FaveBookmarkTypeDto("YOULA_PRODUCT", 7, "youla_product");
        YOULA_PRODUCT = faveBookmarkTypeDto8;
        FaveBookmarkTypeDto faveBookmarkTypeDto9 = new FaveBookmarkTypeDto("CLIP", 8, "clip");
        CLIP = faveBookmarkTypeDto9;
        FaveBookmarkTypeDto[] faveBookmarkTypeDtoArr = {faveBookmarkTypeDto, faveBookmarkTypeDto2, faveBookmarkTypeDto3, faveBookmarkTypeDto4, faveBookmarkTypeDto5, faveBookmarkTypeDto6, faveBookmarkTypeDto7, faveBookmarkTypeDto8, faveBookmarkTypeDto9};
        $VALUES = faveBookmarkTypeDtoArr;
        $ENTRIES = new asp(faveBookmarkTypeDtoArr);
    }

    private FaveBookmarkTypeDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static FaveBookmarkTypeDto valueOf(String str) {
        return (FaveBookmarkTypeDto) Enum.valueOf(FaveBookmarkTypeDto.class, str);
    }

    public static FaveBookmarkTypeDto[] values() {
        return (FaveBookmarkTypeDto[]) $VALUES.clone();
    }
}
