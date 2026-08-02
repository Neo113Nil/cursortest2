package com.vk.superapp.js.bridge;

import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: Objects.kt */
/* loaded from: classes6.dex */
public final class Objects$PlatformsMobileAndroidOnly {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ Objects$PlatformsMobileAndroidOnly[] $VALUES;

    @pmi0("mobile_android")
    public static final Objects$PlatformsMobileAndroidOnly MOBILE_ANDROID;

    @pmi0("mobile_android_messenger")
    public static final Objects$PlatformsMobileAndroidOnly MOBILE_ANDROID_MESSENGER;

    static {
        Objects$PlatformsMobileAndroidOnly objects$PlatformsMobileAndroidOnly = new Objects$PlatformsMobileAndroidOnly("MOBILE_ANDROID", 0);
        MOBILE_ANDROID = objects$PlatformsMobileAndroidOnly;
        Objects$PlatformsMobileAndroidOnly objects$PlatformsMobileAndroidOnly2 = new Objects$PlatformsMobileAndroidOnly("MOBILE_ANDROID_MESSENGER", 1);
        MOBILE_ANDROID_MESSENGER = objects$PlatformsMobileAndroidOnly2;
        Objects$PlatformsMobileAndroidOnly[] objects$PlatformsMobileAndroidOnlyArr = {objects$PlatformsMobileAndroidOnly, objects$PlatformsMobileAndroidOnly2};
        $VALUES = objects$PlatformsMobileAndroidOnlyArr;
        $ENTRIES = new asp(objects$PlatformsMobileAndroidOnlyArr);
    }

    private Objects$PlatformsMobileAndroidOnly(String str, int i) {
    }

    public static Objects$PlatformsMobileAndroidOnly valueOf(String str) {
        return (Objects$PlatformsMobileAndroidOnly) Enum.valueOf(Objects$PlatformsMobileAndroidOnly.class, str);
    }

    public static Objects$PlatformsMobileAndroidOnly[] values() {
        return (Objects$PlatformsMobileAndroidOnly[]) $VALUES.clone();
    }
}
