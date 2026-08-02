package com.vk.clips.upload.ui.api.entities;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: SharingPlatform.kt */
/* loaded from: classes17.dex */
public final class SharingPlatform {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ SharingPlatform[] $VALUES;
    public static final SharingPlatform VK;

    static {
        SharingPlatform sharingPlatform = new SharingPlatform("VK", 0);
        VK = sharingPlatform;
        SharingPlatform[] sharingPlatformArr = {sharingPlatform};
        $VALUES = sharingPlatformArr;
        $ENTRIES = new asp(sharingPlatformArr);
    }

    public SharingPlatform() {
        throw null;
    }

    public static SharingPlatform valueOf(String str) {
        return (SharingPlatform) Enum.valueOf(SharingPlatform.class, str);
    }

    public static SharingPlatform[] values() {
        return (SharingPlatform[]) $VALUES.clone();
    }
}
