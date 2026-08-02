package com.vk.appredirects.resolver;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: AppRedirectResolver.kt */
/* loaded from: classes15.dex */
public final class AppRedirectResult {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ AppRedirectResult[] $VALUES;
    public static final AppRedirectResult BROWSER;
    public static final AppRedirectResult ERROR;
    public static final AppRedirectResult PROCEED;
    public static final AppRedirectResult REDIRECTED;

    static {
        AppRedirectResult appRedirectResult = new AppRedirectResult("REDIRECTED", 0);
        REDIRECTED = appRedirectResult;
        AppRedirectResult appRedirectResult2 = new AppRedirectResult("PROCEED", 1);
        PROCEED = appRedirectResult2;
        AppRedirectResult appRedirectResult3 = new AppRedirectResult("BROWSER", 2);
        BROWSER = appRedirectResult3;
        AppRedirectResult appRedirectResult4 = new AppRedirectResult("ERROR", 3);
        ERROR = appRedirectResult4;
        AppRedirectResult[] appRedirectResultArr = {appRedirectResult, appRedirectResult2, appRedirectResult3, appRedirectResult4};
        $VALUES = appRedirectResultArr;
        $ENTRIES = new asp(appRedirectResultArr);
    }

    public AppRedirectResult() {
        throw null;
    }

    public static AppRedirectResult valueOf(String str) {
        return (AppRedirectResult) Enum.valueOf(AppRedirectResult.class, str);
    }

    public static AppRedirectResult[] values() {
        return (AppRedirectResult[]) $VALUES.clone();
    }
}
