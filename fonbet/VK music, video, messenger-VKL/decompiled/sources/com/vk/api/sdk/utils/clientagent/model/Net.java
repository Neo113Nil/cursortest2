package com.vk.api.sdk.utils.clientagent.model;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: Net.kt */
/* loaded from: classes.dex */
public final class Net {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ Net[] $VALUES;
    public static final Net CFNETWORK;
    public static final Net CRONET;
    public static final Net OKHTTP;
    private final String serializedName;

    static {
        Net net = new Net("OKHTTP", 0, "okhttp");
        OKHTTP = net;
        Net net2 = new Net("CRONET", 1, "cronet");
        CRONET = net2;
        Net net3 = new Net("CFNETWORK", 2, "cfnetwork");
        CFNETWORK = net3;
        Net[] netArr = {net, net2, net3};
        $VALUES = netArr;
        $ENTRIES = new asp(netArr);
    }

    public Net(String str, int i, String str2) {
        this.serializedName = str2;
    }

    public static Net valueOf(String str) {
        return (Net) Enum.valueOf(Net.class, str);
    }

    public static Net[] values() {
        return (Net[]) $VALUES.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.serializedName;
    }
}
