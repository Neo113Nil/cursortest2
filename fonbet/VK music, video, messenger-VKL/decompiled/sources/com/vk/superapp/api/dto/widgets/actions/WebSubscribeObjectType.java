package com.vk.superapp.api.dto.widgets.actions;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: WebSubscribeObjectType.kt */
/* loaded from: classes6.dex */
public final class WebSubscribeObjectType {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ WebSubscribeObjectType[] $VALUES;
    public static final WebSubscribeObjectType GROUP;

    static {
        WebSubscribeObjectType webSubscribeObjectType = new WebSubscribeObjectType("GROUP", 0);
        GROUP = webSubscribeObjectType;
        WebSubscribeObjectType[] webSubscribeObjectTypeArr = {webSubscribeObjectType};
        $VALUES = webSubscribeObjectTypeArr;
        $ENTRIES = new asp(webSubscribeObjectTypeArr);
    }

    public WebSubscribeObjectType() {
        throw null;
    }

    public static WebSubscribeObjectType valueOf(String str) {
        return (WebSubscribeObjectType) Enum.valueOf(WebSubscribeObjectType.class, str);
    }

    public static WebSubscribeObjectType[] values() {
        return (WebSubscribeObjectType[]) $VALUES.clone();
    }
}
