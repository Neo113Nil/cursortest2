package com.vk.eduauth;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: RequireSwitchAccountDialogContent.kt */
/* loaded from: classes18.dex */
public final class RequireSwitchAccountDialogContent {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ RequireSwitchAccountDialogContent[] $VALUES;
    public static final RequireSwitchAccountDialogContent SFERUM_CALL;
    public static final RequireSwitchAccountDialogContent SFERUM_CHANNEL;
    public static final RequireSwitchAccountDialogContent SFERUM_CHANNEL_POST;
    public static final RequireSwitchAccountDialogContent SFERUM_CHAT;
    public static final RequireSwitchAccountDialogContent SFERUM_CHAT_LIST;
    public static final RequireSwitchAccountDialogContent SFERUM_MINIAPP;
    public static final RequireSwitchAccountDialogContent VK_CALL;
    public static final RequireSwitchAccountDialogContent VK_CHANNEL;
    public static final RequireSwitchAccountDialogContent VK_CHANNEL_POST;
    public static final RequireSwitchAccountDialogContent VK_CHAT;
    public static final RequireSwitchAccountDialogContent VK_IM;

    static {
        RequireSwitchAccountDialogContent requireSwitchAccountDialogContent = new RequireSwitchAccountDialogContent("SFERUM_CHAT", 0);
        SFERUM_CHAT = requireSwitchAccountDialogContent;
        RequireSwitchAccountDialogContent requireSwitchAccountDialogContent2 = new RequireSwitchAccountDialogContent("SFERUM_CALL", 1);
        SFERUM_CALL = requireSwitchAccountDialogContent2;
        RequireSwitchAccountDialogContent requireSwitchAccountDialogContent3 = new RequireSwitchAccountDialogContent("SFERUM_CHAT_LIST", 2);
        SFERUM_CHAT_LIST = requireSwitchAccountDialogContent3;
        RequireSwitchAccountDialogContent requireSwitchAccountDialogContent4 = new RequireSwitchAccountDialogContent("SFERUM_CHANNEL", 3);
        SFERUM_CHANNEL = requireSwitchAccountDialogContent4;
        RequireSwitchAccountDialogContent requireSwitchAccountDialogContent5 = new RequireSwitchAccountDialogContent("SFERUM_CHANNEL_POST", 4);
        SFERUM_CHANNEL_POST = requireSwitchAccountDialogContent5;
        RequireSwitchAccountDialogContent requireSwitchAccountDialogContent6 = new RequireSwitchAccountDialogContent("SFERUM_MINIAPP", 5);
        SFERUM_MINIAPP = requireSwitchAccountDialogContent6;
        RequireSwitchAccountDialogContent requireSwitchAccountDialogContent7 = new RequireSwitchAccountDialogContent("VK_CHAT", 6);
        VK_CHAT = requireSwitchAccountDialogContent7;
        RequireSwitchAccountDialogContent requireSwitchAccountDialogContent8 = new RequireSwitchAccountDialogContent("VK_CALL", 7);
        VK_CALL = requireSwitchAccountDialogContent8;
        RequireSwitchAccountDialogContent requireSwitchAccountDialogContent9 = new RequireSwitchAccountDialogContent("VK_IM", 8);
        VK_IM = requireSwitchAccountDialogContent9;
        RequireSwitchAccountDialogContent requireSwitchAccountDialogContent10 = new RequireSwitchAccountDialogContent("VK_CHANNEL", 9);
        VK_CHANNEL = requireSwitchAccountDialogContent10;
        RequireSwitchAccountDialogContent requireSwitchAccountDialogContent11 = new RequireSwitchAccountDialogContent("VK_CHANNEL_POST", 10);
        VK_CHANNEL_POST = requireSwitchAccountDialogContent11;
        RequireSwitchAccountDialogContent[] requireSwitchAccountDialogContentArr = {requireSwitchAccountDialogContent, requireSwitchAccountDialogContent2, requireSwitchAccountDialogContent3, requireSwitchAccountDialogContent4, requireSwitchAccountDialogContent5, requireSwitchAccountDialogContent6, requireSwitchAccountDialogContent7, requireSwitchAccountDialogContent8, requireSwitchAccountDialogContent9, requireSwitchAccountDialogContent10, requireSwitchAccountDialogContent11};
        $VALUES = requireSwitchAccountDialogContentArr;
        $ENTRIES = new asp(requireSwitchAccountDialogContentArr);
    }

    public RequireSwitchAccountDialogContent() {
        throw null;
    }

    public static RequireSwitchAccountDialogContent valueOf(String str) {
        return (RequireSwitchAccountDialogContent) Enum.valueOf(RequireSwitchAccountDialogContent.class, str);
    }

    public static RequireSwitchAccountDialogContent[] values() {
        return (RequireSwitchAccountDialogContent[]) $VALUES.clone();
    }
}
