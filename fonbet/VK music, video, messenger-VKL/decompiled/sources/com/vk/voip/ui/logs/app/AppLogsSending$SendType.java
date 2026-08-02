package com.vk.voip.ui.logs.app;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: AppLogsSending.kt */
/* loaded from: classes7.dex */
public final class AppLogsSending$SendType {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ AppLogsSending$SendType[] $VALUES;
    public static final AppLogsSending$SendType DISABLED;
    public static final AppLogsSending$SendType DOCS_UPLOAD;
    public static final AppLogsSending$SendType SHARE_MENU;

    static {
        AppLogsSending$SendType appLogsSending$SendType = new AppLogsSending$SendType("SHARE_MENU", 0);
        SHARE_MENU = appLogsSending$SendType;
        AppLogsSending$SendType appLogsSending$SendType2 = new AppLogsSending$SendType("DOCS_UPLOAD", 1);
        DOCS_UPLOAD = appLogsSending$SendType2;
        AppLogsSending$SendType appLogsSending$SendType3 = new AppLogsSending$SendType("DISABLED", 2);
        DISABLED = appLogsSending$SendType3;
        AppLogsSending$SendType[] appLogsSending$SendTypeArr = {appLogsSending$SendType, appLogsSending$SendType2, appLogsSending$SendType3};
        $VALUES = appLogsSending$SendTypeArr;
        $ENTRIES = new asp(appLogsSending$SendTypeArr);
    }

    public AppLogsSending$SendType() {
        throw null;
    }

    public static AppLogsSending$SendType valueOf(String str) {
        return (AppLogsSending$SendType) Enum.valueOf(AppLogsSending$SendType.class, str);
    }

    public static AppLogsSending$SendType[] values() {
        return (AppLogsSending$SendType[]) $VALUES.clone();
    }
}
