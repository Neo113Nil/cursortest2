package com.vk.superapp.browser.internal.utils.analytics;

import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: MiniAppEntryPoint.kt */
/* loaded from: classes6.dex */
public final class MiniAppEntryPoint {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ MiniAppEntryPoint[] $VALUES;
    public static final MiniAppEntryPoint IM_CHAT;
    public static final MiniAppEntryPoint UNKNOWN;

    static {
        MiniAppEntryPoint miniAppEntryPoint = new MiniAppEntryPoint(GrsBaseInfo.CountryCodeSource.UNKNOWN, 0);
        UNKNOWN = miniAppEntryPoint;
        MiniAppEntryPoint miniAppEntryPoint2 = new MiniAppEntryPoint("IM_CHAT", 1);
        IM_CHAT = miniAppEntryPoint2;
        MiniAppEntryPoint[] miniAppEntryPointArr = {miniAppEntryPoint, miniAppEntryPoint2};
        $VALUES = miniAppEntryPointArr;
        $ENTRIES = new asp(miniAppEntryPointArr);
    }

    public MiniAppEntryPoint() {
        throw null;
    }

    public static MiniAppEntryPoint valueOf(String str) {
        return (MiniAppEntryPoint) Enum.valueOf(MiniAppEntryPoint.class, str);
    }

    public static MiniAppEntryPoint[] values() {
        return (MiniAppEntryPoint[]) $VALUES.clone();
    }
}
