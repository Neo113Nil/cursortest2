package com.vk.sdk.api.fave.dto;

import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: FaveSetTagsItemTypeDto.kt */
/* loaded from: classes5.dex */
public final class FaveSetTagsItemTypeDto {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ FaveSetTagsItemTypeDto[] $VALUES;

    @pmi0("article")
    public static final FaveSetTagsItemTypeDto ARTICLE;

    @pmi0("clip")
    public static final FaveSetTagsItemTypeDto CLIP;

    @pmi0("game")
    public static final FaveSetTagsItemTypeDto GAME;

    @pmi0("link")
    public static final FaveSetTagsItemTypeDto LINK;

    @pmi0("mini_app")
    public static final FaveSetTagsItemTypeDto MINI_APP;

    @pmi0("narrative")
    public static final FaveSetTagsItemTypeDto NARRATIVE;

    @pmi0("page")
    public static final FaveSetTagsItemTypeDto PAGE;

    @pmi0("podcast")
    public static final FaveSetTagsItemTypeDto PODCAST;

    @pmi0("post")
    public static final FaveSetTagsItemTypeDto POST;

    @pmi0("product")
    public static final FaveSetTagsItemTypeDto PRODUCT;

    @pmi0("video")
    public static final FaveSetTagsItemTypeDto VIDEO;

    @pmi0("youla_product")
    public static final FaveSetTagsItemTypeDto YOULA_PRODUCT;
    private final String value;

    static {
        FaveSetTagsItemTypeDto faveSetTagsItemTypeDto = new FaveSetTagsItemTypeDto("ARTICLE", 0, "article");
        ARTICLE = faveSetTagsItemTypeDto;
        FaveSetTagsItemTypeDto faveSetTagsItemTypeDto2 = new FaveSetTagsItemTypeDto("CLIP", 1, "clip");
        CLIP = faveSetTagsItemTypeDto2;
        FaveSetTagsItemTypeDto faveSetTagsItemTypeDto3 = new FaveSetTagsItemTypeDto("GAME", 2, "game");
        GAME = faveSetTagsItemTypeDto3;
        FaveSetTagsItemTypeDto faveSetTagsItemTypeDto4 = new FaveSetTagsItemTypeDto("LINK", 3, "link");
        LINK = faveSetTagsItemTypeDto4;
        FaveSetTagsItemTypeDto faveSetTagsItemTypeDto5 = new FaveSetTagsItemTypeDto("MINI_APP", 4, "mini_app");
        MINI_APP = faveSetTagsItemTypeDto5;
        FaveSetTagsItemTypeDto faveSetTagsItemTypeDto6 = new FaveSetTagsItemTypeDto("NARRATIVE", 5, "narrative");
        NARRATIVE = faveSetTagsItemTypeDto6;
        FaveSetTagsItemTypeDto faveSetTagsItemTypeDto7 = new FaveSetTagsItemTypeDto("PAGE", 6, "page");
        PAGE = faveSetTagsItemTypeDto7;
        FaveSetTagsItemTypeDto faveSetTagsItemTypeDto8 = new FaveSetTagsItemTypeDto("PODCAST", 7, "podcast");
        PODCAST = faveSetTagsItemTypeDto8;
        FaveSetTagsItemTypeDto faveSetTagsItemTypeDto9 = new FaveSetTagsItemTypeDto("POST", 8, "post");
        POST = faveSetTagsItemTypeDto9;
        FaveSetTagsItemTypeDto faveSetTagsItemTypeDto10 = new FaveSetTagsItemTypeDto("PRODUCT", 9, "product");
        PRODUCT = faveSetTagsItemTypeDto10;
        FaveSetTagsItemTypeDto faveSetTagsItemTypeDto11 = new FaveSetTagsItemTypeDto(SignalingProtocol.MEDIA_OPTION_VIDEO, 10, "video");
        VIDEO = faveSetTagsItemTypeDto11;
        FaveSetTagsItemTypeDto faveSetTagsItemTypeDto12 = new FaveSetTagsItemTypeDto("YOULA_PRODUCT", 11, "youla_product");
        YOULA_PRODUCT = faveSetTagsItemTypeDto12;
        FaveSetTagsItemTypeDto[] faveSetTagsItemTypeDtoArr = {faveSetTagsItemTypeDto, faveSetTagsItemTypeDto2, faveSetTagsItemTypeDto3, faveSetTagsItemTypeDto4, faveSetTagsItemTypeDto5, faveSetTagsItemTypeDto6, faveSetTagsItemTypeDto7, faveSetTagsItemTypeDto8, faveSetTagsItemTypeDto9, faveSetTagsItemTypeDto10, faveSetTagsItemTypeDto11, faveSetTagsItemTypeDto12};
        $VALUES = faveSetTagsItemTypeDtoArr;
        $ENTRIES = new asp(faveSetTagsItemTypeDtoArr);
    }

    private FaveSetTagsItemTypeDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static FaveSetTagsItemTypeDto valueOf(String str) {
        return (FaveSetTagsItemTypeDto) Enum.valueOf(FaveSetTagsItemTypeDto.class, str);
    }

    public static FaveSetTagsItemTypeDto[] values() {
        return (FaveSetTagsItemTypeDto[]) $VALUES.clone();
    }
}
