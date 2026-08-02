package com.vk.network.proxy.verifier;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: VkProxyPoll.kt */
/* loaded from: classes.dex */
public final class VkProxyPoll {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ VkProxyPoll[] $VALUES;
    public static final VkProxyPoll CANCEL;
    public static final VkProxyPoll ERROR;
    public static final VkProxyPoll NEXT;
    public static final VkProxyPoll SUCCESS;

    static {
        VkProxyPoll vkProxyPoll = new VkProxyPoll("NEXT", 0);
        NEXT = vkProxyPoll;
        VkProxyPoll vkProxyPoll2 = new VkProxyPoll("SUCCESS", 1);
        SUCCESS = vkProxyPoll2;
        VkProxyPoll vkProxyPoll3 = new VkProxyPoll("ERROR", 2);
        ERROR = vkProxyPoll3;
        VkProxyPoll vkProxyPoll4 = new VkProxyPoll("CANCEL", 3);
        CANCEL = vkProxyPoll4;
        VkProxyPoll[] vkProxyPollArr = {vkProxyPoll, vkProxyPoll2, vkProxyPoll3, vkProxyPoll4};
        $VALUES = vkProxyPollArr;
        $ENTRIES = new asp(vkProxyPollArr);
    }

    public VkProxyPoll() {
        throw null;
    }

    public static VkProxyPoll valueOf(String str) {
        return (VkProxyPoll) Enum.valueOf(VkProxyPoll.class, str);
    }

    public static VkProxyPoll[] values() {
        return (VkProxyPoll[]) $VALUES.clone();
    }
}
