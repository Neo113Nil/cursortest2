package com.vk.superapp.js.bridge;

import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: Objects.kt */
/* loaded from: classes6.dex */
public final class Objects$PlatformsWebDesktopOnly {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ Objects$PlatformsWebDesktopOnly[] $VALUES;

    @pmi0("desktop_web")
    public static final Objects$PlatformsWebDesktopOnly DESKTOP_WEB;

    static {
        Objects$PlatformsWebDesktopOnly objects$PlatformsWebDesktopOnly = new Objects$PlatformsWebDesktopOnly("DESKTOP_WEB", 0);
        DESKTOP_WEB = objects$PlatformsWebDesktopOnly;
        Objects$PlatformsWebDesktopOnly[] objects$PlatformsWebDesktopOnlyArr = {objects$PlatformsWebDesktopOnly};
        $VALUES = objects$PlatformsWebDesktopOnlyArr;
        $ENTRIES = new asp(objects$PlatformsWebDesktopOnlyArr);
    }

    private Objects$PlatformsWebDesktopOnly(String str, int i) {
    }

    public static Objects$PlatformsWebDesktopOnly valueOf(String str) {
        return (Objects$PlatformsWebDesktopOnly) Enum.valueOf(Objects$PlatformsWebDesktopOnly.class, str);
    }

    public static Objects$PlatformsWebDesktopOnly[] values() {
        return (Objects$PlatformsWebDesktopOnly[]) $VALUES.clone();
    }
}
