package com.vk.superapp.bridges.dto.analytics;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: MiniAppPolicyScreenEvent.kt */
/* loaded from: classes6.dex */
public final class MiniAppPolicyScreenEventType {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ MiniAppPolicyScreenEventType[] $VALUES;
    public static final MiniAppPolicyScreenEventType LAUNCH_SCREEN_VIEW_CONNECT_POLICY;
    public static final MiniAppPolicyScreenEventType LAUNCH_SCREEN_VIEW_CONNECT_TERMS;
    public static final MiniAppPolicyScreenEventType LAUNCH_SCREEN_VIEW_PERMISSIONS;
    public static final MiniAppPolicyScreenEventType LAUNCH_SCREEN_VIEW_SERVICE_POLICY;
    public static final MiniAppPolicyScreenEventType LAUNCH_SCREEN_VIEW_SERVICE_TERMS;
    public static final MiniAppPolicyScreenEventType START_SCREEN_APP_CLOSE;
    public static final MiniAppPolicyScreenEventType VK_CONNECT_EVENT;
    public static final MiniAppPolicyScreenEventType VK_CONNECT_LAUNCH_SCREEN_PERMISSIONS_ACCEPTED;

    static {
        MiniAppPolicyScreenEventType miniAppPolicyScreenEventType = new MiniAppPolicyScreenEventType("VK_CONNECT_EVENT", 0);
        VK_CONNECT_EVENT = miniAppPolicyScreenEventType;
        MiniAppPolicyScreenEventType miniAppPolicyScreenEventType2 = new MiniAppPolicyScreenEventType("VK_CONNECT_LAUNCH_SCREEN_PERMISSIONS_ACCEPTED", 1);
        VK_CONNECT_LAUNCH_SCREEN_PERMISSIONS_ACCEPTED = miniAppPolicyScreenEventType2;
        MiniAppPolicyScreenEventType miniAppPolicyScreenEventType3 = new MiniAppPolicyScreenEventType("START_SCREEN_APP_CLOSE", 2);
        START_SCREEN_APP_CLOSE = miniAppPolicyScreenEventType3;
        MiniAppPolicyScreenEventType miniAppPolicyScreenEventType4 = new MiniAppPolicyScreenEventType("LAUNCH_SCREEN_VIEW_PERMISSIONS", 3);
        LAUNCH_SCREEN_VIEW_PERMISSIONS = miniAppPolicyScreenEventType4;
        MiniAppPolicyScreenEventType miniAppPolicyScreenEventType5 = new MiniAppPolicyScreenEventType("LAUNCH_SCREEN_VIEW_CONNECT_POLICY", 4);
        LAUNCH_SCREEN_VIEW_CONNECT_POLICY = miniAppPolicyScreenEventType5;
        MiniAppPolicyScreenEventType miniAppPolicyScreenEventType6 = new MiniAppPolicyScreenEventType("LAUNCH_SCREEN_VIEW_CONNECT_TERMS", 5);
        LAUNCH_SCREEN_VIEW_CONNECT_TERMS = miniAppPolicyScreenEventType6;
        MiniAppPolicyScreenEventType miniAppPolicyScreenEventType7 = new MiniAppPolicyScreenEventType("LAUNCH_SCREEN_VIEW_SERVICE_POLICY", 6);
        LAUNCH_SCREEN_VIEW_SERVICE_POLICY = miniAppPolicyScreenEventType7;
        MiniAppPolicyScreenEventType miniAppPolicyScreenEventType8 = new MiniAppPolicyScreenEventType("LAUNCH_SCREEN_VIEW_SERVICE_TERMS", 7);
        LAUNCH_SCREEN_VIEW_SERVICE_TERMS = miniAppPolicyScreenEventType8;
        MiniAppPolicyScreenEventType[] miniAppPolicyScreenEventTypeArr = {miniAppPolicyScreenEventType, miniAppPolicyScreenEventType2, miniAppPolicyScreenEventType3, miniAppPolicyScreenEventType4, miniAppPolicyScreenEventType5, miniAppPolicyScreenEventType6, miniAppPolicyScreenEventType7, miniAppPolicyScreenEventType8};
        $VALUES = miniAppPolicyScreenEventTypeArr;
        $ENTRIES = new asp(miniAppPolicyScreenEventTypeArr);
    }

    public MiniAppPolicyScreenEventType() {
        throw null;
    }

    public static MiniAppPolicyScreenEventType valueOf(String str) {
        return (MiniAppPolicyScreenEventType) Enum.valueOf(MiniAppPolicyScreenEventType.class, str);
    }

    public static MiniAppPolicyScreenEventType[] values() {
        return (MiniAppPolicyScreenEventType[]) $VALUES.clone();
    }
}
