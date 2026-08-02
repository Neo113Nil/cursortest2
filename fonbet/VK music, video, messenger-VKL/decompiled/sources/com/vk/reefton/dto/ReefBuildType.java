package com.vk.reefton.dto;

import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ReefBuildType.kt */
/* loaded from: classes5.dex */
public final class ReefBuildType {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ ReefBuildType[] $VALUES;
    public static final ReefBuildType BETA;
    public static final ReefBuildType DEBUG;
    public static final ReefBuildType RELEASE;
    public static final ReefBuildType UNKNOWN;

    static {
        ReefBuildType reefBuildType = new ReefBuildType("DEBUG", 0);
        DEBUG = reefBuildType;
        ReefBuildType reefBuildType2 = new ReefBuildType("BETA", 1);
        BETA = reefBuildType2;
        ReefBuildType reefBuildType3 = new ReefBuildType("RELEASE", 2);
        RELEASE = reefBuildType3;
        ReefBuildType reefBuildType4 = new ReefBuildType(GrsBaseInfo.CountryCodeSource.UNKNOWN, 3);
        UNKNOWN = reefBuildType4;
        ReefBuildType[] reefBuildTypeArr = {reefBuildType, reefBuildType2, reefBuildType3, reefBuildType4};
        $VALUES = reefBuildTypeArr;
        $ENTRIES = new asp(reefBuildTypeArr);
    }

    public ReefBuildType() {
        throw null;
    }

    public static ReefBuildType valueOf(String str) {
        return (ReefBuildType) Enum.valueOf(ReefBuildType.class, str);
    }

    public static ReefBuildType[] values() {
        return (ReefBuildType[]) $VALUES.clone();
    }
}
