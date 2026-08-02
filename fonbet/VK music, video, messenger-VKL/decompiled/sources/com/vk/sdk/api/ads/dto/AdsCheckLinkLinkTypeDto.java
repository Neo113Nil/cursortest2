package com.vk.sdk.api.ads.dto;

import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: AdsCheckLinkLinkTypeDto.kt */
/* loaded from: classes5.dex */
public final class AdsCheckLinkLinkTypeDto {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ AdsCheckLinkLinkTypeDto[] $VALUES;

    @pmi0("application")
    public static final AdsCheckLinkLinkTypeDto APPLICATION;

    @pmi0("community")
    public static final AdsCheckLinkLinkTypeDto COMMUNITY;

    @pmi0("mobile_app")
    public static final AdsCheckLinkLinkTypeDto MOBILE_APP;

    @pmi0("post")
    public static final AdsCheckLinkLinkTypeDto POST;

    @pmi0("site")
    public static final AdsCheckLinkLinkTypeDto SITE;

    @pmi0("user")
    public static final AdsCheckLinkLinkTypeDto USER;

    @pmi0("user_post")
    public static final AdsCheckLinkLinkTypeDto USER_POST;

    @pmi0("video")
    public static final AdsCheckLinkLinkTypeDto VIDEO;
    private final String value;

    static {
        AdsCheckLinkLinkTypeDto adsCheckLinkLinkTypeDto = new AdsCheckLinkLinkTypeDto("APPLICATION", 0, "application");
        APPLICATION = adsCheckLinkLinkTypeDto;
        AdsCheckLinkLinkTypeDto adsCheckLinkLinkTypeDto2 = new AdsCheckLinkLinkTypeDto("COMMUNITY", 1, "community");
        COMMUNITY = adsCheckLinkLinkTypeDto2;
        AdsCheckLinkLinkTypeDto adsCheckLinkLinkTypeDto3 = new AdsCheckLinkLinkTypeDto("MOBILE_APP", 2, "mobile_app");
        MOBILE_APP = adsCheckLinkLinkTypeDto3;
        AdsCheckLinkLinkTypeDto adsCheckLinkLinkTypeDto4 = new AdsCheckLinkLinkTypeDto("POST", 3, "post");
        POST = adsCheckLinkLinkTypeDto4;
        AdsCheckLinkLinkTypeDto adsCheckLinkLinkTypeDto5 = new AdsCheckLinkLinkTypeDto("SITE", 4, "site");
        SITE = adsCheckLinkLinkTypeDto5;
        AdsCheckLinkLinkTypeDto adsCheckLinkLinkTypeDto6 = new AdsCheckLinkLinkTypeDto("USER", 5, "user");
        USER = adsCheckLinkLinkTypeDto6;
        AdsCheckLinkLinkTypeDto adsCheckLinkLinkTypeDto7 = new AdsCheckLinkLinkTypeDto("USER_POST", 6, "user_post");
        USER_POST = adsCheckLinkLinkTypeDto7;
        AdsCheckLinkLinkTypeDto adsCheckLinkLinkTypeDto8 = new AdsCheckLinkLinkTypeDto(SignalingProtocol.MEDIA_OPTION_VIDEO, 7, "video");
        VIDEO = adsCheckLinkLinkTypeDto8;
        AdsCheckLinkLinkTypeDto[] adsCheckLinkLinkTypeDtoArr = {adsCheckLinkLinkTypeDto, adsCheckLinkLinkTypeDto2, adsCheckLinkLinkTypeDto3, adsCheckLinkLinkTypeDto4, adsCheckLinkLinkTypeDto5, adsCheckLinkLinkTypeDto6, adsCheckLinkLinkTypeDto7, adsCheckLinkLinkTypeDto8};
        $VALUES = adsCheckLinkLinkTypeDtoArr;
        $ENTRIES = new asp(adsCheckLinkLinkTypeDtoArr);
    }

    private AdsCheckLinkLinkTypeDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static AdsCheckLinkLinkTypeDto valueOf(String str) {
        return (AdsCheckLinkLinkTypeDto) Enum.valueOf(AdsCheckLinkLinkTypeDto.class, str);
    }

    public static AdsCheckLinkLinkTypeDto[] values() {
        return (AdsCheckLinkLinkTypeDto[]) $VALUES.clone();
    }
}
