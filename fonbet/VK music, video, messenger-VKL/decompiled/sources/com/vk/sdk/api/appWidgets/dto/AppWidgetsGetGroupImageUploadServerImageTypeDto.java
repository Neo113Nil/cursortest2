package com.vk.sdk.api.appWidgets.dto;

import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: AppWidgetsGetGroupImageUploadServerImageTypeDto.kt */
/* loaded from: classes5.dex */
public final class AppWidgetsGetGroupImageUploadServerImageTypeDto {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ AppWidgetsGetGroupImageUploadServerImageTypeDto[] $VALUES;

    @pmi0("160x160")
    public static final AppWidgetsGetGroupImageUploadServerImageTypeDto TYPE_160X160;

    @pmi0("160x240")
    public static final AppWidgetsGetGroupImageUploadServerImageTypeDto TYPE_160X240;

    @pmi0("24x24")
    public static final AppWidgetsGetGroupImageUploadServerImageTypeDto TYPE_24X24;

    @pmi0("50x50")
    public static final AppWidgetsGetGroupImageUploadServerImageTypeDto TYPE_50X50;

    @pmi0("510x128")
    public static final AppWidgetsGetGroupImageUploadServerImageTypeDto TYPE_510X128;
    private final String value;

    static {
        AppWidgetsGetGroupImageUploadServerImageTypeDto appWidgetsGetGroupImageUploadServerImageTypeDto = new AppWidgetsGetGroupImageUploadServerImageTypeDto("TYPE_160X160", 0, "160x160");
        TYPE_160X160 = appWidgetsGetGroupImageUploadServerImageTypeDto;
        AppWidgetsGetGroupImageUploadServerImageTypeDto appWidgetsGetGroupImageUploadServerImageTypeDto2 = new AppWidgetsGetGroupImageUploadServerImageTypeDto("TYPE_160X240", 1, "160x240");
        TYPE_160X240 = appWidgetsGetGroupImageUploadServerImageTypeDto2;
        AppWidgetsGetGroupImageUploadServerImageTypeDto appWidgetsGetGroupImageUploadServerImageTypeDto3 = new AppWidgetsGetGroupImageUploadServerImageTypeDto("TYPE_24X24", 2, "24x24");
        TYPE_24X24 = appWidgetsGetGroupImageUploadServerImageTypeDto3;
        AppWidgetsGetGroupImageUploadServerImageTypeDto appWidgetsGetGroupImageUploadServerImageTypeDto4 = new AppWidgetsGetGroupImageUploadServerImageTypeDto("TYPE_50X50", 3, "50x50");
        TYPE_50X50 = appWidgetsGetGroupImageUploadServerImageTypeDto4;
        AppWidgetsGetGroupImageUploadServerImageTypeDto appWidgetsGetGroupImageUploadServerImageTypeDto5 = new AppWidgetsGetGroupImageUploadServerImageTypeDto("TYPE_510X128", 4, "510x128");
        TYPE_510X128 = appWidgetsGetGroupImageUploadServerImageTypeDto5;
        AppWidgetsGetGroupImageUploadServerImageTypeDto[] appWidgetsGetGroupImageUploadServerImageTypeDtoArr = {appWidgetsGetGroupImageUploadServerImageTypeDto, appWidgetsGetGroupImageUploadServerImageTypeDto2, appWidgetsGetGroupImageUploadServerImageTypeDto3, appWidgetsGetGroupImageUploadServerImageTypeDto4, appWidgetsGetGroupImageUploadServerImageTypeDto5};
        $VALUES = appWidgetsGetGroupImageUploadServerImageTypeDtoArr;
        $ENTRIES = new asp(appWidgetsGetGroupImageUploadServerImageTypeDtoArr);
    }

    private AppWidgetsGetGroupImageUploadServerImageTypeDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static AppWidgetsGetGroupImageUploadServerImageTypeDto valueOf(String str) {
        return (AppWidgetsGetGroupImageUploadServerImageTypeDto) Enum.valueOf(AppWidgetsGetGroupImageUploadServerImageTypeDto.class, str);
    }

    public static AppWidgetsGetGroupImageUploadServerImageTypeDto[] values() {
        return (AppWidgetsGetGroupImageUploadServerImageTypeDto[]) $VALUES.clone();
    }
}
