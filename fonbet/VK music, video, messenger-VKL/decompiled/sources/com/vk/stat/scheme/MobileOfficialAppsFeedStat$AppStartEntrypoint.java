package com.vk.stat.scheme;

import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: MobileOfficialAppsFeedStat.kt */
/* loaded from: classes11.dex */
public final class MobileOfficialAppsFeedStat$AppStartEntrypoint {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ MobileOfficialAppsFeedStat$AppStartEntrypoint[] $VALUES;

    @pmi0("companion")
    public static final MobileOfficialAppsFeedStat$AppStartEntrypoint COMPANION;

    @pmi0("deeplink")
    public static final MobileOfficialAppsFeedStat$AppStartEntrypoint DEEPLINK;

    @pmi0("push")
    public static final MobileOfficialAppsFeedStat$AppStartEntrypoint PUSH;

    @pmi0("springboard")
    public static final MobileOfficialAppsFeedStat$AppStartEntrypoint SPRINGBOARD;

    static {
        MobileOfficialAppsFeedStat$AppStartEntrypoint mobileOfficialAppsFeedStat$AppStartEntrypoint = new MobileOfficialAppsFeedStat$AppStartEntrypoint("SPRINGBOARD", 0);
        SPRINGBOARD = mobileOfficialAppsFeedStat$AppStartEntrypoint;
        MobileOfficialAppsFeedStat$AppStartEntrypoint mobileOfficialAppsFeedStat$AppStartEntrypoint2 = new MobileOfficialAppsFeedStat$AppStartEntrypoint("PUSH", 1);
        PUSH = mobileOfficialAppsFeedStat$AppStartEntrypoint2;
        MobileOfficialAppsFeedStat$AppStartEntrypoint mobileOfficialAppsFeedStat$AppStartEntrypoint3 = new MobileOfficialAppsFeedStat$AppStartEntrypoint("COMPANION", 2);
        COMPANION = mobileOfficialAppsFeedStat$AppStartEntrypoint3;
        MobileOfficialAppsFeedStat$AppStartEntrypoint mobileOfficialAppsFeedStat$AppStartEntrypoint4 = new MobileOfficialAppsFeedStat$AppStartEntrypoint("DEEPLINK", 3);
        DEEPLINK = mobileOfficialAppsFeedStat$AppStartEntrypoint4;
        MobileOfficialAppsFeedStat$AppStartEntrypoint[] mobileOfficialAppsFeedStat$AppStartEntrypointArr = {mobileOfficialAppsFeedStat$AppStartEntrypoint, mobileOfficialAppsFeedStat$AppStartEntrypoint2, mobileOfficialAppsFeedStat$AppStartEntrypoint3, mobileOfficialAppsFeedStat$AppStartEntrypoint4};
        $VALUES = mobileOfficialAppsFeedStat$AppStartEntrypointArr;
        $ENTRIES = new asp(mobileOfficialAppsFeedStat$AppStartEntrypointArr);
    }

    private MobileOfficialAppsFeedStat$AppStartEntrypoint(String str, int i) {
    }

    public static MobileOfficialAppsFeedStat$AppStartEntrypoint valueOf(String str) {
        return (MobileOfficialAppsFeedStat$AppStartEntrypoint) Enum.valueOf(MobileOfficialAppsFeedStat$AppStartEntrypoint.class, str);
    }

    public static MobileOfficialAppsFeedStat$AppStartEntrypoint[] values() {
        return (MobileOfficialAppsFeedStat$AppStartEntrypoint[]) $VALUES.clone();
    }
}
