package com.vk.superapp.bridges.dto.analytics;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: MiniAppSessionEvent.kt */
/* loaded from: classes6.dex */
public final class MiniAppSessionType {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ MiniAppSessionType[] $VALUES;
    public static final MiniAppSessionType SESSION;

    static {
        MiniAppSessionType miniAppSessionType = new MiniAppSessionType("SESSION", 0);
        SESSION = miniAppSessionType;
        MiniAppSessionType[] miniAppSessionTypeArr = {miniAppSessionType};
        $VALUES = miniAppSessionTypeArr;
        $ENTRIES = new asp(miniAppSessionTypeArr);
    }

    public MiniAppSessionType() {
        throw null;
    }

    public static MiniAppSessionType valueOf(String str) {
        return (MiniAppSessionType) Enum.valueOf(MiniAppSessionType.class, str);
    }

    public static MiniAppSessionType[] values() {
        return (MiniAppSessionType[]) $VALUES.clone();
    }
}
