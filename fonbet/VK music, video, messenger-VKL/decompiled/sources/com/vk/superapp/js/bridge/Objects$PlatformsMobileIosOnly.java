package com.vk.superapp.js.bridge;

import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: Objects.kt */
/* loaded from: classes6.dex */
public final class Objects$PlatformsMobileIosOnly {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ Objects$PlatformsMobileIosOnly[] $VALUES;

    @pmi0("mobile_iphone")
    public static final Objects$PlatformsMobileIosOnly MOBILE_IPHONE;

    @pmi0("mobile_iphone_messenger")
    public static final Objects$PlatformsMobileIosOnly MOBILE_IPHONE_MESSENGER;

    static {
        Objects$PlatformsMobileIosOnly objects$PlatformsMobileIosOnly = new Objects$PlatformsMobileIosOnly("MOBILE_IPHONE", 0);
        MOBILE_IPHONE = objects$PlatformsMobileIosOnly;
        Objects$PlatformsMobileIosOnly objects$PlatformsMobileIosOnly2 = new Objects$PlatformsMobileIosOnly("MOBILE_IPHONE_MESSENGER", 1);
        MOBILE_IPHONE_MESSENGER = objects$PlatformsMobileIosOnly2;
        Objects$PlatformsMobileIosOnly[] objects$PlatformsMobileIosOnlyArr = {objects$PlatformsMobileIosOnly, objects$PlatformsMobileIosOnly2};
        $VALUES = objects$PlatformsMobileIosOnlyArr;
        $ENTRIES = new asp(objects$PlatformsMobileIosOnlyArr);
    }

    private Objects$PlatformsMobileIosOnly(String str, int i) {
    }

    public static Objects$PlatformsMobileIosOnly valueOf(String str) {
        return (Objects$PlatformsMobileIosOnly) Enum.valueOf(Objects$PlatformsMobileIosOnly.class, str);
    }

    public static Objects$PlatformsMobileIosOnly[] values() {
        return (Objects$PlatformsMobileIosOnly[]) $VALUES.clone();
    }
}
