package com.vk.dto.user;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: OnlineInfo.kt */
/* loaded from: classes18.dex */
public final class Platform {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ Platform[] $VALUES;
    public static final a Companion;
    public static final Platform MOBILE;
    public static final Platform NONE;
    public static final Platform WEB;
    private final int id;

    /* compiled from: OnlineInfo.kt */
    public static final class a {
    }

    static {
        Platform platform = new Platform("NONE", 0, -1);
        NONE = platform;
        Platform platform2 = new Platform("WEB", 1, 0);
        WEB = platform2;
        Platform platform3 = new Platform("MOBILE", 2, 1);
        MOBILE = platform3;
        Platform[] platformArr = {platform, platform2, platform3};
        $VALUES = platformArr;
        $ENTRIES = new asp(platformArr);
        Companion = new a();
    }

    public Platform(String str, int i, int i2) {
        this.id = i2;
    }

    public static Platform valueOf(String str) {
        return (Platform) Enum.valueOf(Platform.class, str);
    }

    public static Platform[] values() {
        return (Platform[]) $VALUES.clone();
    }

    public final int h() {
        return this.id;
    }
}
