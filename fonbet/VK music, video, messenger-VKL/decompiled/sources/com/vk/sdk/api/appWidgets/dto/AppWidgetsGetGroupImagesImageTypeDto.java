package com.vk.sdk.api.appWidgets.dto;

import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: AppWidgetsGetGroupImagesImageTypeDto.kt */
/* loaded from: classes5.dex */
public final class AppWidgetsGetGroupImagesImageTypeDto {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ AppWidgetsGetGroupImagesImageTypeDto[] $VALUES;

    @pmi0("160x160")
    public static final AppWidgetsGetGroupImagesImageTypeDto TYPE_160X160;

    @pmi0("160x240")
    public static final AppWidgetsGetGroupImagesImageTypeDto TYPE_160X240;

    @pmi0("24x24")
    public static final AppWidgetsGetGroupImagesImageTypeDto TYPE_24X24;

    @pmi0("50x50")
    public static final AppWidgetsGetGroupImagesImageTypeDto TYPE_50X50;

    @pmi0("510x128")
    public static final AppWidgetsGetGroupImagesImageTypeDto TYPE_510X128;
    private final String value;

    static {
        AppWidgetsGetGroupImagesImageTypeDto appWidgetsGetGroupImagesImageTypeDto = new AppWidgetsGetGroupImagesImageTypeDto("TYPE_160X160", 0, "160x160");
        TYPE_160X160 = appWidgetsGetGroupImagesImageTypeDto;
        AppWidgetsGetGroupImagesImageTypeDto appWidgetsGetGroupImagesImageTypeDto2 = new AppWidgetsGetGroupImagesImageTypeDto("TYPE_160X240", 1, "160x240");
        TYPE_160X240 = appWidgetsGetGroupImagesImageTypeDto2;
        AppWidgetsGetGroupImagesImageTypeDto appWidgetsGetGroupImagesImageTypeDto3 = new AppWidgetsGetGroupImagesImageTypeDto("TYPE_24X24", 2, "24x24");
        TYPE_24X24 = appWidgetsGetGroupImagesImageTypeDto3;
        AppWidgetsGetGroupImagesImageTypeDto appWidgetsGetGroupImagesImageTypeDto4 = new AppWidgetsGetGroupImagesImageTypeDto("TYPE_50X50", 3, "50x50");
        TYPE_50X50 = appWidgetsGetGroupImagesImageTypeDto4;
        AppWidgetsGetGroupImagesImageTypeDto appWidgetsGetGroupImagesImageTypeDto5 = new AppWidgetsGetGroupImagesImageTypeDto("TYPE_510X128", 4, "510x128");
        TYPE_510X128 = appWidgetsGetGroupImagesImageTypeDto5;
        AppWidgetsGetGroupImagesImageTypeDto[] appWidgetsGetGroupImagesImageTypeDtoArr = {appWidgetsGetGroupImagesImageTypeDto, appWidgetsGetGroupImagesImageTypeDto2, appWidgetsGetGroupImagesImageTypeDto3, appWidgetsGetGroupImagesImageTypeDto4, appWidgetsGetGroupImagesImageTypeDto5};
        $VALUES = appWidgetsGetGroupImagesImageTypeDtoArr;
        $ENTRIES = new asp(appWidgetsGetGroupImagesImageTypeDtoArr);
    }

    private AppWidgetsGetGroupImagesImageTypeDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static AppWidgetsGetGroupImagesImageTypeDto valueOf(String str) {
        return (AppWidgetsGetGroupImagesImageTypeDto) Enum.valueOf(AppWidgetsGetGroupImagesImageTypeDto.class, str);
    }

    public static AppWidgetsGetGroupImagesImageTypeDto[] values() {
        return (AppWidgetsGetGroupImagesImageTypeDto[]) $VALUES.clone();
    }
}
