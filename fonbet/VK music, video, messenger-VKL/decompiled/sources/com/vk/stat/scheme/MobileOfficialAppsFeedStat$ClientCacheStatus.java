package com.vk.stat.scheme;

import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: MobileOfficialAppsFeedStat.kt */
/* loaded from: classes11.dex */
public final class MobileOfficialAppsFeedStat$ClientCacheStatus {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ MobileOfficialAppsFeedStat$ClientCacheStatus[] $VALUES;

    @pmi0("expired")
    public static final MobileOfficialAppsFeedStat$ClientCacheStatus EXPIRED;

    @pmi0("none")
    public static final MobileOfficialAppsFeedStat$ClientCacheStatus NONE;

    @pmi0("watched")
    public static final MobileOfficialAppsFeedStat$ClientCacheStatus WATCHED;

    static {
        MobileOfficialAppsFeedStat$ClientCacheStatus mobileOfficialAppsFeedStat$ClientCacheStatus = new MobileOfficialAppsFeedStat$ClientCacheStatus("EXPIRED", 0);
        EXPIRED = mobileOfficialAppsFeedStat$ClientCacheStatus;
        MobileOfficialAppsFeedStat$ClientCacheStatus mobileOfficialAppsFeedStat$ClientCacheStatus2 = new MobileOfficialAppsFeedStat$ClientCacheStatus("WATCHED", 1);
        WATCHED = mobileOfficialAppsFeedStat$ClientCacheStatus2;
        MobileOfficialAppsFeedStat$ClientCacheStatus mobileOfficialAppsFeedStat$ClientCacheStatus3 = new MobileOfficialAppsFeedStat$ClientCacheStatus("NONE", 2);
        NONE = mobileOfficialAppsFeedStat$ClientCacheStatus3;
        MobileOfficialAppsFeedStat$ClientCacheStatus[] mobileOfficialAppsFeedStat$ClientCacheStatusArr = {mobileOfficialAppsFeedStat$ClientCacheStatus, mobileOfficialAppsFeedStat$ClientCacheStatus2, mobileOfficialAppsFeedStat$ClientCacheStatus3};
        $VALUES = mobileOfficialAppsFeedStat$ClientCacheStatusArr;
        $ENTRIES = new asp(mobileOfficialAppsFeedStat$ClientCacheStatusArr);
    }

    private MobileOfficialAppsFeedStat$ClientCacheStatus(String str, int i) {
    }

    public static MobileOfficialAppsFeedStat$ClientCacheStatus valueOf(String str) {
        return (MobileOfficialAppsFeedStat$ClientCacheStatus) Enum.valueOf(MobileOfficialAppsFeedStat$ClientCacheStatus.class, str);
    }

    public static MobileOfficialAppsFeedStat$ClientCacheStatus[] values() {
        return (MobileOfficialAppsFeedStat$ClientCacheStatus[]) $VALUES.clone();
    }
}
