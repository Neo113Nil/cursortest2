package com.vk.sdk.api.appWidgets.dto;

import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: AppWidgetsGetAppImageUploadServerImageTypeDto.kt */
/* loaded from: classes5.dex */
public final class AppWidgetsGetAppImageUploadServerImageTypeDto {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ AppWidgetsGetAppImageUploadServerImageTypeDto[] $VALUES;

    @pmi0("160x160")
    public static final AppWidgetsGetAppImageUploadServerImageTypeDto TYPE_160X160;

    @pmi0("160x240")
    public static final AppWidgetsGetAppImageUploadServerImageTypeDto TYPE_160X240;

    @pmi0("24x24")
    public static final AppWidgetsGetAppImageUploadServerImageTypeDto TYPE_24X24;

    @pmi0("50x50")
    public static final AppWidgetsGetAppImageUploadServerImageTypeDto TYPE_50X50;

    @pmi0("510x128")
    public static final AppWidgetsGetAppImageUploadServerImageTypeDto TYPE_510X128;
    private final String value;

    static {
        AppWidgetsGetAppImageUploadServerImageTypeDto appWidgetsGetAppImageUploadServerImageTypeDto = new AppWidgetsGetAppImageUploadServerImageTypeDto("TYPE_160X160", 0, "160x160");
        TYPE_160X160 = appWidgetsGetAppImageUploadServerImageTypeDto;
        AppWidgetsGetAppImageUploadServerImageTypeDto appWidgetsGetAppImageUploadServerImageTypeDto2 = new AppWidgetsGetAppImageUploadServerImageTypeDto("TYPE_160X240", 1, "160x240");
        TYPE_160X240 = appWidgetsGetAppImageUploadServerImageTypeDto2;
        AppWidgetsGetAppImageUploadServerImageTypeDto appWidgetsGetAppImageUploadServerImageTypeDto3 = new AppWidgetsGetAppImageUploadServerImageTypeDto("TYPE_24X24", 2, "24x24");
        TYPE_24X24 = appWidgetsGetAppImageUploadServerImageTypeDto3;
        AppWidgetsGetAppImageUploadServerImageTypeDto appWidgetsGetAppImageUploadServerImageTypeDto4 = new AppWidgetsGetAppImageUploadServerImageTypeDto("TYPE_50X50", 3, "50x50");
        TYPE_50X50 = appWidgetsGetAppImageUploadServerImageTypeDto4;
        AppWidgetsGetAppImageUploadServerImageTypeDto appWidgetsGetAppImageUploadServerImageTypeDto5 = new AppWidgetsGetAppImageUploadServerImageTypeDto("TYPE_510X128", 4, "510x128");
        TYPE_510X128 = appWidgetsGetAppImageUploadServerImageTypeDto5;
        AppWidgetsGetAppImageUploadServerImageTypeDto[] appWidgetsGetAppImageUploadServerImageTypeDtoArr = {appWidgetsGetAppImageUploadServerImageTypeDto, appWidgetsGetAppImageUploadServerImageTypeDto2, appWidgetsGetAppImageUploadServerImageTypeDto3, appWidgetsGetAppImageUploadServerImageTypeDto4, appWidgetsGetAppImageUploadServerImageTypeDto5};
        $VALUES = appWidgetsGetAppImageUploadServerImageTypeDtoArr;
        $ENTRIES = new asp(appWidgetsGetAppImageUploadServerImageTypeDtoArr);
    }

    private AppWidgetsGetAppImageUploadServerImageTypeDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static AppWidgetsGetAppImageUploadServerImageTypeDto valueOf(String str) {
        return (AppWidgetsGetAppImageUploadServerImageTypeDto) Enum.valueOf(AppWidgetsGetAppImageUploadServerImageTypeDto.class, str);
    }

    public static AppWidgetsGetAppImageUploadServerImageTypeDto[] values() {
        return (AppWidgetsGetAppImageUploadServerImageTypeDto[]) $VALUES.clone();
    }
}
