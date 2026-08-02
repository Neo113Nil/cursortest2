package com.vk.push.pushsdk.data.source;

import com.huawei.hms.framework.network.grs.GrsBaseInfo;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: LastLaunchedPushServiceDataSource.kt */
/* loaded from: classes5.dex */
public final class PushServiceType {
    private static final /* synthetic */ PushServiceType[] $VALUES;
    public static final PushServiceType BACKGROUND;
    public static final PushServiceType FOREGROUND;
    public static final PushServiceType UNKNOWN;

    static {
        PushServiceType pushServiceType = new PushServiceType("BACKGROUND", 0);
        BACKGROUND = pushServiceType;
        PushServiceType pushServiceType2 = new PushServiceType("FOREGROUND", 1);
        FOREGROUND = pushServiceType2;
        PushServiceType pushServiceType3 = new PushServiceType(GrsBaseInfo.CountryCodeSource.UNKNOWN, 2);
        UNKNOWN = pushServiceType3;
        $VALUES = new PushServiceType[]{pushServiceType, pushServiceType2, pushServiceType3};
    }

    public PushServiceType() {
        throw null;
    }

    public static PushServiceType valueOf(String str) {
        return (PushServiceType) Enum.valueOf(PushServiceType.class, str);
    }

    public static PushServiceType[] values() {
        return (PushServiceType[]) $VALUES.clone();
    }
}
