package com.vk.stat.scheme;

import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: MobileOfficialAppsCoreSettingsStat.kt */
/* loaded from: classes5.dex */
public final class MobileOfficialAppsCoreSettingsStat$SettingNetworkType {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ MobileOfficialAppsCoreSettingsStat$SettingNetworkType[] $VALUES;

    @pmi0("mobile")
    public static final MobileOfficialAppsCoreSettingsStat$SettingNetworkType MOBILE;

    @pmi0("wifi")
    public static final MobileOfficialAppsCoreSettingsStat$SettingNetworkType WIFI;

    static {
        MobileOfficialAppsCoreSettingsStat$SettingNetworkType mobileOfficialAppsCoreSettingsStat$SettingNetworkType = new MobileOfficialAppsCoreSettingsStat$SettingNetworkType("WIFI", 0);
        WIFI = mobileOfficialAppsCoreSettingsStat$SettingNetworkType;
        MobileOfficialAppsCoreSettingsStat$SettingNetworkType mobileOfficialAppsCoreSettingsStat$SettingNetworkType2 = new MobileOfficialAppsCoreSettingsStat$SettingNetworkType("MOBILE", 1);
        MOBILE = mobileOfficialAppsCoreSettingsStat$SettingNetworkType2;
        MobileOfficialAppsCoreSettingsStat$SettingNetworkType[] mobileOfficialAppsCoreSettingsStat$SettingNetworkTypeArr = {mobileOfficialAppsCoreSettingsStat$SettingNetworkType, mobileOfficialAppsCoreSettingsStat$SettingNetworkType2};
        $VALUES = mobileOfficialAppsCoreSettingsStat$SettingNetworkTypeArr;
        $ENTRIES = new asp(mobileOfficialAppsCoreSettingsStat$SettingNetworkTypeArr);
    }

    private MobileOfficialAppsCoreSettingsStat$SettingNetworkType(String str, int i) {
    }

    public static MobileOfficialAppsCoreSettingsStat$SettingNetworkType valueOf(String str) {
        return (MobileOfficialAppsCoreSettingsStat$SettingNetworkType) Enum.valueOf(MobileOfficialAppsCoreSettingsStat$SettingNetworkType.class, str);
    }

    public static MobileOfficialAppsCoreSettingsStat$SettingNetworkType[] values() {
        return (MobileOfficialAppsCoreSettingsStat$SettingNetworkType[]) $VALUES.clone();
    }
}
