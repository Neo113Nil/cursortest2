package com.vk.superapp.vkhealth.permissions.api.type;

import com.huawei.hms.android.SystemUtils;
import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: MobileServicesType.kt */
/* loaded from: classes11.dex */
public final class MobileServicesType {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ MobileServicesType[] $VALUES;
    public static final MobileServicesType GOOGLE_PLAY;
    public static final MobileServicesType HUAWEI;
    public static final MobileServicesType NONE;
    private final String serverName;

    static {
        MobileServicesType mobileServicesType = new MobileServicesType("GOOGLE_PLAY", 0, "google_play_services");
        GOOGLE_PLAY = mobileServicesType;
        MobileServicesType mobileServicesType2 = new MobileServicesType(SystemUtils.PRODUCT_HUAWEI, 1, "huawei_mobile_services");
        HUAWEI = mobileServicesType2;
        MobileServicesType mobileServicesType3 = new MobileServicesType("NONE", 2, "none");
        NONE = mobileServicesType3;
        MobileServicesType[] mobileServicesTypeArr = {mobileServicesType, mobileServicesType2, mobileServicesType3};
        $VALUES = mobileServicesTypeArr;
        $ENTRIES = new asp(mobileServicesTypeArr);
    }

    public MobileServicesType(String str, int i, String str2) {
        this.serverName = str2;
    }

    public static MobileServicesType valueOf(String str) {
        return (MobileServicesType) Enum.valueOf(MobileServicesType.class, str);
    }

    public static MobileServicesType[] values() {
        return (MobileServicesType[]) $VALUES.clone();
    }

    public final String h() {
        return this.serverName;
    }
}
