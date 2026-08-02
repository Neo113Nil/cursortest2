package com.vk.superapp.js.bridge;

import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: Objects.kt */
/* loaded from: classes6.dex */
public final class Objects$PlatformsWebAndAndroid {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ Objects$PlatformsWebAndAndroid[] $VALUES;

    @pmi0("desktop_web")
    public static final Objects$PlatformsWebAndAndroid DESKTOP_WEB;

    @pmi0("mobile_iphone")
    public static final Objects$PlatformsWebAndAndroid MOBILE_IPHONE;

    @pmi0("mobile_iphone_messenger")
    public static final Objects$PlatformsWebAndAndroid MOBILE_IPHONE_MESSENGER;

    @pmi0("mobile_web")
    public static final Objects$PlatformsWebAndAndroid MOBILE_WEB;

    static {
        Objects$PlatformsWebAndAndroid objects$PlatformsWebAndAndroid = new Objects$PlatformsWebAndAndroid("MOBILE_WEB", 0);
        MOBILE_WEB = objects$PlatformsWebAndAndroid;
        Objects$PlatformsWebAndAndroid objects$PlatformsWebAndAndroid2 = new Objects$PlatformsWebAndAndroid("DESKTOP_WEB", 1);
        DESKTOP_WEB = objects$PlatformsWebAndAndroid2;
        Objects$PlatformsWebAndAndroid objects$PlatformsWebAndAndroid3 = new Objects$PlatformsWebAndAndroid("MOBILE_IPHONE", 2);
        MOBILE_IPHONE = objects$PlatformsWebAndAndroid3;
        Objects$PlatformsWebAndAndroid objects$PlatformsWebAndAndroid4 = new Objects$PlatformsWebAndAndroid("MOBILE_IPHONE_MESSENGER", 3);
        MOBILE_IPHONE_MESSENGER = objects$PlatformsWebAndAndroid4;
        Objects$PlatformsWebAndAndroid[] objects$PlatformsWebAndAndroidArr = {objects$PlatformsWebAndAndroid, objects$PlatformsWebAndAndroid2, objects$PlatformsWebAndAndroid3, objects$PlatformsWebAndAndroid4};
        $VALUES = objects$PlatformsWebAndAndroidArr;
        $ENTRIES = new asp(objects$PlatformsWebAndAndroidArr);
    }

    private Objects$PlatformsWebAndAndroid(String str, int i) {
    }

    public static Objects$PlatformsWebAndAndroid valueOf(String str) {
        return (Objects$PlatformsWebAndAndroid) Enum.valueOf(Objects$PlatformsWebAndAndroid.class, str);
    }

    public static Objects$PlatformsWebAndAndroid[] values() {
        return (Objects$PlatformsWebAndAndroid[]) $VALUES.clone();
    }
}
