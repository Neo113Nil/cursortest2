package com.vk.sdk.api.appWidgets.dto;

import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: AppWidgetsGetAppImagesImageTypeDto.kt */
/* loaded from: classes5.dex */
public final class AppWidgetsGetAppImagesImageTypeDto {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ AppWidgetsGetAppImagesImageTypeDto[] $VALUES;

    @pmi0("160x160")
    public static final AppWidgetsGetAppImagesImageTypeDto TYPE_160X160;

    @pmi0("160x240")
    public static final AppWidgetsGetAppImagesImageTypeDto TYPE_160X240;

    @pmi0("24x24")
    public static final AppWidgetsGetAppImagesImageTypeDto TYPE_24X24;

    @pmi0("50x50")
    public static final AppWidgetsGetAppImagesImageTypeDto TYPE_50X50;

    @pmi0("510x128")
    public static final AppWidgetsGetAppImagesImageTypeDto TYPE_510X128;
    private final String value;

    static {
        AppWidgetsGetAppImagesImageTypeDto appWidgetsGetAppImagesImageTypeDto = new AppWidgetsGetAppImagesImageTypeDto("TYPE_160X160", 0, "160x160");
        TYPE_160X160 = appWidgetsGetAppImagesImageTypeDto;
        AppWidgetsGetAppImagesImageTypeDto appWidgetsGetAppImagesImageTypeDto2 = new AppWidgetsGetAppImagesImageTypeDto("TYPE_160X240", 1, "160x240");
        TYPE_160X240 = appWidgetsGetAppImagesImageTypeDto2;
        AppWidgetsGetAppImagesImageTypeDto appWidgetsGetAppImagesImageTypeDto3 = new AppWidgetsGetAppImagesImageTypeDto("TYPE_24X24", 2, "24x24");
        TYPE_24X24 = appWidgetsGetAppImagesImageTypeDto3;
        AppWidgetsGetAppImagesImageTypeDto appWidgetsGetAppImagesImageTypeDto4 = new AppWidgetsGetAppImagesImageTypeDto("TYPE_50X50", 3, "50x50");
        TYPE_50X50 = appWidgetsGetAppImagesImageTypeDto4;
        AppWidgetsGetAppImagesImageTypeDto appWidgetsGetAppImagesImageTypeDto5 = new AppWidgetsGetAppImagesImageTypeDto("TYPE_510X128", 4, "510x128");
        TYPE_510X128 = appWidgetsGetAppImagesImageTypeDto5;
        AppWidgetsGetAppImagesImageTypeDto[] appWidgetsGetAppImagesImageTypeDtoArr = {appWidgetsGetAppImagesImageTypeDto, appWidgetsGetAppImagesImageTypeDto2, appWidgetsGetAppImagesImageTypeDto3, appWidgetsGetAppImagesImageTypeDto4, appWidgetsGetAppImagesImageTypeDto5};
        $VALUES = appWidgetsGetAppImagesImageTypeDtoArr;
        $ENTRIES = new asp(appWidgetsGetAppImagesImageTypeDtoArr);
    }

    private AppWidgetsGetAppImagesImageTypeDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static AppWidgetsGetAppImagesImageTypeDto valueOf(String str) {
        return (AppWidgetsGetAppImagesImageTypeDto) Enum.valueOf(AppWidgetsGetAppImagesImageTypeDto.class, str);
    }

    public static AppWidgetsGetAppImagesImageTypeDto[] values() {
        return (AppWidgetsGetAppImagesImageTypeDto[]) $VALUES.clone();
    }
}
