package com.vk.superapp.js.bridge;

import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: Objects.kt */
/* loaded from: classes6.dex */
public final class Objects$PlatformsMobileOnly {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ Objects$PlatformsMobileOnly[] $VALUES;

    @pmi0("mobile_android")
    public static final Objects$PlatformsMobileOnly MOBILE_ANDROID;

    @pmi0("mobile_android_messenger")
    public static final Objects$PlatformsMobileOnly MOBILE_ANDROID_MESSENGER;

    @pmi0("mobile_iphone")
    public static final Objects$PlatformsMobileOnly MOBILE_IPHONE;

    @pmi0("mobile_iphone_messenger")
    public static final Objects$PlatformsMobileOnly MOBILE_IPHONE_MESSENGER;

    static {
        Objects$PlatformsMobileOnly objects$PlatformsMobileOnly = new Objects$PlatformsMobileOnly("MOBILE_IPHONE", 0);
        MOBILE_IPHONE = objects$PlatformsMobileOnly;
        Objects$PlatformsMobileOnly objects$PlatformsMobileOnly2 = new Objects$PlatformsMobileOnly("MOBILE_IPHONE_MESSENGER", 1);
        MOBILE_IPHONE_MESSENGER = objects$PlatformsMobileOnly2;
        Objects$PlatformsMobileOnly objects$PlatformsMobileOnly3 = new Objects$PlatformsMobileOnly("MOBILE_ANDROID", 2);
        MOBILE_ANDROID = objects$PlatformsMobileOnly3;
        Objects$PlatformsMobileOnly objects$PlatformsMobileOnly4 = new Objects$PlatformsMobileOnly("MOBILE_ANDROID_MESSENGER", 3);
        MOBILE_ANDROID_MESSENGER = objects$PlatformsMobileOnly4;
        Objects$PlatformsMobileOnly[] objects$PlatformsMobileOnlyArr = {objects$PlatformsMobileOnly, objects$PlatformsMobileOnly2, objects$PlatformsMobileOnly3, objects$PlatformsMobileOnly4};
        $VALUES = objects$PlatformsMobileOnlyArr;
        $ENTRIES = new asp(objects$PlatformsMobileOnlyArr);
    }

    private Objects$PlatformsMobileOnly(String str, int i) {
    }

    public static Objects$PlatformsMobileOnly valueOf(String str) {
        return (Objects$PlatformsMobileOnly) Enum.valueOf(Objects$PlatformsMobileOnly.class, str);
    }

    public static Objects$PlatformsMobileOnly[] values() {
        return (Objects$PlatformsMobileOnly[]) $VALUES.clone();
    }
}
