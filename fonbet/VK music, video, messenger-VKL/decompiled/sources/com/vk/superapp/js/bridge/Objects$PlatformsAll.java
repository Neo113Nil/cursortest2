package com.vk.superapp.js.bridge;

import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: Objects.kt */
/* loaded from: classes6.dex */
public final class Objects$PlatformsAll {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ Objects$PlatformsAll[] $VALUES;

    @pmi0("desktop_web")
    public static final Objects$PlatformsAll DESKTOP_WEB;

    @pmi0("mobile_android")
    public static final Objects$PlatformsAll MOBILE_ANDROID;

    @pmi0("mobile_android_messenger")
    public static final Objects$PlatformsAll MOBILE_ANDROID_MESSENGER;

    @pmi0("mobile_iphone")
    public static final Objects$PlatformsAll MOBILE_IPHONE;

    @pmi0("mobile_iphone_messenger")
    public static final Objects$PlatformsAll MOBILE_IPHONE_MESSENGER;

    @pmi0("mobile_web")
    public static final Objects$PlatformsAll MOBILE_WEB;

    static {
        Objects$PlatformsAll objects$PlatformsAll = new Objects$PlatformsAll("MOBILE_IPHONE", 0);
        MOBILE_IPHONE = objects$PlatformsAll;
        Objects$PlatformsAll objects$PlatformsAll2 = new Objects$PlatformsAll("MOBILE_IPHONE_MESSENGER", 1);
        MOBILE_IPHONE_MESSENGER = objects$PlatformsAll2;
        Objects$PlatformsAll objects$PlatformsAll3 = new Objects$PlatformsAll("MOBILE_ANDROID", 2);
        MOBILE_ANDROID = objects$PlatformsAll3;
        Objects$PlatformsAll objects$PlatformsAll4 = new Objects$PlatformsAll("MOBILE_ANDROID_MESSENGER", 3);
        MOBILE_ANDROID_MESSENGER = objects$PlatformsAll4;
        Objects$PlatformsAll objects$PlatformsAll5 = new Objects$PlatformsAll("MOBILE_WEB", 4);
        MOBILE_WEB = objects$PlatformsAll5;
        Objects$PlatformsAll objects$PlatformsAll6 = new Objects$PlatformsAll("DESKTOP_WEB", 5);
        DESKTOP_WEB = objects$PlatformsAll6;
        Objects$PlatformsAll[] objects$PlatformsAllArr = {objects$PlatformsAll, objects$PlatformsAll2, objects$PlatformsAll3, objects$PlatformsAll4, objects$PlatformsAll5, objects$PlatformsAll6};
        $VALUES = objects$PlatformsAllArr;
        $ENTRIES = new asp(objects$PlatformsAllArr);
    }

    private Objects$PlatformsAll(String str, int i) {
    }

    public static Objects$PlatformsAll valueOf(String str) {
        return (Objects$PlatformsAll) Enum.valueOf(Objects$PlatformsAll.class, str);
    }

    public static Objects$PlatformsAll[] values() {
        return (Objects$PlatformsAll[]) $VALUES.clone();
    }
}
