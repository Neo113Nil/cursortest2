package com.vk.net.stat.metric;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: NetStatSource.kt */
/* loaded from: classes.dex */
public final class NetStatSource {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ NetStatSource[] $VALUES;
    public static final NetStatSource CRONET;
    public static final NetStatSource OKHTTP;
    public static final NetStatSource OKHTTP_EXECUTOR;

    static {
        NetStatSource netStatSource = new NetStatSource("OKHTTP", 0);
        OKHTTP = netStatSource;
        NetStatSource netStatSource2 = new NetStatSource("CRONET", 1);
        CRONET = netStatSource2;
        NetStatSource netStatSource3 = new NetStatSource("OKHTTP_EXECUTOR", 2);
        OKHTTP_EXECUTOR = netStatSource3;
        NetStatSource[] netStatSourceArr = {netStatSource, netStatSource2, netStatSource3};
        $VALUES = netStatSourceArr;
        $ENTRIES = new asp(netStatSourceArr);
    }

    public NetStatSource() {
        throw null;
    }

    public static NetStatSource valueOf(String str) {
        return (NetStatSource) Enum.valueOf(NetStatSource.class, str);
    }

    public static NetStatSource[] values() {
        return (NetStatSource[]) $VALUES.clone();
    }
}
