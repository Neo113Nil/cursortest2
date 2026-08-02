package com.vk.superapp.js.bridge;

import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: Objects.kt */
/* loaded from: classes6.dex */
public final class Objects$PlatformsWebOnly {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ Objects$PlatformsWebOnly[] $VALUES;

    @pmi0("desktop_web")
    public static final Objects$PlatformsWebOnly DESKTOP_WEB;

    @pmi0("mobile_web")
    public static final Objects$PlatformsWebOnly MOBILE_WEB;

    static {
        Objects$PlatformsWebOnly objects$PlatformsWebOnly = new Objects$PlatformsWebOnly("MOBILE_WEB", 0);
        MOBILE_WEB = objects$PlatformsWebOnly;
        Objects$PlatformsWebOnly objects$PlatformsWebOnly2 = new Objects$PlatformsWebOnly("DESKTOP_WEB", 1);
        DESKTOP_WEB = objects$PlatformsWebOnly2;
        Objects$PlatformsWebOnly[] objects$PlatformsWebOnlyArr = {objects$PlatformsWebOnly, objects$PlatformsWebOnly2};
        $VALUES = objects$PlatformsWebOnlyArr;
        $ENTRIES = new asp(objects$PlatformsWebOnlyArr);
    }

    private Objects$PlatformsWebOnly(String str, int i) {
    }

    public static Objects$PlatformsWebOnly valueOf(String str) {
        return (Objects$PlatformsWebOnly) Enum.valueOf(Objects$PlatformsWebOnly.class, str);
    }

    public static Objects$PlatformsWebOnly[] values() {
        return (Objects$PlatformsWebOnly[]) $VALUES.clone();
    }
}
