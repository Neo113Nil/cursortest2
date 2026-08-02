package com.vk.clips.sdk.shared.api.utils.performance;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: StartScreenType.kt */
/* loaded from: classes17.dex */
public final class StartScreenType {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ StartScreenType[] $VALUES;
    public static final StartScreenType StartedTabCache;
    public static final StartScreenType StartedTabNetwork;
    public static final StartScreenType StartedWithArguments;
    private final String tag;

    static {
        StartScreenType startScreenType = new StartScreenType("StartedWithArguments", 0, "loaded_from_arguments");
        StartedWithArguments = startScreenType;
        StartScreenType startScreenType2 = new StartScreenType("StartedTabCache", 1, "loaded_from_cache");
        StartedTabCache = startScreenType2;
        StartScreenType startScreenType3 = new StartScreenType("StartedTabNetwork", 2, "loaded_from_network");
        StartedTabNetwork = startScreenType3;
        StartScreenType[] startScreenTypeArr = {startScreenType, startScreenType2, startScreenType3};
        $VALUES = startScreenTypeArr;
        $ENTRIES = new asp(startScreenTypeArr);
    }

    public StartScreenType(String str, int i, String str2) {
        this.tag = str2;
    }

    public static StartScreenType valueOf(String str) {
        return (StartScreenType) Enum.valueOf(StartScreenType.class, str);
    }

    public static StartScreenType[] values() {
        return (StartScreenType[]) $VALUES.clone();
    }

    public final String h() {
        return this.tag;
    }
}
