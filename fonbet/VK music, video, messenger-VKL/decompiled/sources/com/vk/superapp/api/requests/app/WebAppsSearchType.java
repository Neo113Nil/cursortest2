package com.vk.superapp.api.requests.app;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: WebAppsSearchType.kt */
/* loaded from: classes6.dex */
public final class WebAppsSearchType {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ WebAppsSearchType[] $VALUES;
    public static final WebAppsSearchType TYPE_DIRECT_GAMES;
    public static final WebAppsSearchType TYPE_VK_APPS;
    private final String type;

    static {
        WebAppsSearchType webAppsSearchType = new WebAppsSearchType("TYPE_VK_APPS", 0, "vk_apps");
        TYPE_VK_APPS = webAppsSearchType;
        WebAppsSearchType webAppsSearchType2 = new WebAppsSearchType("TYPE_DIRECT_GAMES", 1, "direct_games");
        TYPE_DIRECT_GAMES = webAppsSearchType2;
        WebAppsSearchType[] webAppsSearchTypeArr = {webAppsSearchType, webAppsSearchType2};
        $VALUES = webAppsSearchTypeArr;
        $ENTRIES = new asp(webAppsSearchTypeArr);
    }

    public WebAppsSearchType(String str, int i, String str2) {
        this.type = str2;
    }

    public static WebAppsSearchType valueOf(String str) {
        return (WebAppsSearchType) Enum.valueOf(WebAppsSearchType.class, str);
    }

    public static WebAppsSearchType[] values() {
        return (WebAppsSearchType[]) $VALUES.clone();
    }

    public final String h() {
        return this.type;
    }
}
