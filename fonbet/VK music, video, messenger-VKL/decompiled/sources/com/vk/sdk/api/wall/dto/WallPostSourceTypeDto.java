package com.vk.sdk.api.wall.dto;

import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: WallPostSourceTypeDto.kt */
/* loaded from: classes5.dex */
public final class WallPostSourceTypeDto {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ WallPostSourceTypeDto[] $VALUES;

    @pmi0("api")
    public static final WallPostSourceTypeDto API;

    @pmi0("mvk")
    public static final WallPostSourceTypeDto MVK;

    @pmi0("rss")
    public static final WallPostSourceTypeDto RSS;

    @pmi0("sms")
    public static final WallPostSourceTypeDto SMS;

    @pmi0("vk")
    public static final WallPostSourceTypeDto VK;

    @pmi0("widget")
    public static final WallPostSourceTypeDto WIDGET;
    private final String value;

    static {
        WallPostSourceTypeDto wallPostSourceTypeDto = new WallPostSourceTypeDto("VK", 0, "vk");
        VK = wallPostSourceTypeDto;
        WallPostSourceTypeDto wallPostSourceTypeDto2 = new WallPostSourceTypeDto("WIDGET", 1, "widget");
        WIDGET = wallPostSourceTypeDto2;
        WallPostSourceTypeDto wallPostSourceTypeDto3 = new WallPostSourceTypeDto("API", 2, "api");
        API = wallPostSourceTypeDto3;
        WallPostSourceTypeDto wallPostSourceTypeDto4 = new WallPostSourceTypeDto("RSS", 3, "rss");
        RSS = wallPostSourceTypeDto4;
        WallPostSourceTypeDto wallPostSourceTypeDto5 = new WallPostSourceTypeDto("SMS", 4, "sms");
        SMS = wallPostSourceTypeDto5;
        WallPostSourceTypeDto wallPostSourceTypeDto6 = new WallPostSourceTypeDto("MVK", 5, "mvk");
        MVK = wallPostSourceTypeDto6;
        WallPostSourceTypeDto[] wallPostSourceTypeDtoArr = {wallPostSourceTypeDto, wallPostSourceTypeDto2, wallPostSourceTypeDto3, wallPostSourceTypeDto4, wallPostSourceTypeDto5, wallPostSourceTypeDto6};
        $VALUES = wallPostSourceTypeDtoArr;
        $ENTRIES = new asp(wallPostSourceTypeDtoArr);
    }

    private WallPostSourceTypeDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static WallPostSourceTypeDto valueOf(String str) {
        return (WallPostSourceTypeDto) Enum.valueOf(WallPostSourceTypeDto.class, str);
    }

    public static WallPostSourceTypeDto[] values() {
        return (WallPostSourceTypeDto[]) $VALUES.clone();
    }
}
