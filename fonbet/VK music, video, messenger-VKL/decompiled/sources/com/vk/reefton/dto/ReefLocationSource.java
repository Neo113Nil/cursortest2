package com.vk.reefton.dto;

import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ReefLocationSource.kt */
/* loaded from: classes5.dex */
public final class ReefLocationSource {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ ReefLocationSource[] $VALUES;
    public static final ReefLocationSource GPS;
    public static final ReefLocationSource NETWORK;
    public static final ReefLocationSource PASSIVE;
    public static final ReefLocationSource UNKNOWN;

    static {
        ReefLocationSource reefLocationSource = new ReefLocationSource("GPS", 0);
        GPS = reefLocationSource;
        ReefLocationSource reefLocationSource2 = new ReefLocationSource("NETWORK", 1);
        NETWORK = reefLocationSource2;
        ReefLocationSource reefLocationSource3 = new ReefLocationSource("PASSIVE", 2);
        PASSIVE = reefLocationSource3;
        ReefLocationSource reefLocationSource4 = new ReefLocationSource(GrsBaseInfo.CountryCodeSource.UNKNOWN, 3);
        UNKNOWN = reefLocationSource4;
        ReefLocationSource[] reefLocationSourceArr = {reefLocationSource, reefLocationSource2, reefLocationSource3, reefLocationSource4};
        $VALUES = reefLocationSourceArr;
        $ENTRIES = new asp(reefLocationSourceArr);
    }

    public ReefLocationSource() {
        throw null;
    }

    public static ReefLocationSource valueOf(String str) {
        return (ReefLocationSource) Enum.valueOf(ReefLocationSource.class, str);
    }

    public static ReefLocationSource[] values() {
        return (ReefLocationSource[]) $VALUES.clone();
    }
}
