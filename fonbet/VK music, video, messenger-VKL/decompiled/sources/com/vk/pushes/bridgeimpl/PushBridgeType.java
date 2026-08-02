package com.vk.pushes.bridgeimpl;

import com.huawei.hms.android.SystemUtils;
import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PushBridgeType.kt */
/* loaded from: classes.dex */
public final class PushBridgeType {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ PushBridgeType[] $VALUES;
    public static final PushBridgeType EMPTY;
    public static final PushBridgeType GOOGLE;
    public static final PushBridgeType HUAWEI;
    public static final PushBridgeType RUSTORE;
    private final int id;

    static {
        PushBridgeType pushBridgeType = new PushBridgeType("GOOGLE", 0, 1);
        GOOGLE = pushBridgeType;
        PushBridgeType pushBridgeType2 = new PushBridgeType(SystemUtils.PRODUCT_HUAWEI, 1, 2);
        HUAWEI = pushBridgeType2;
        PushBridgeType pushBridgeType3 = new PushBridgeType("RUSTORE", 2, 3);
        RUSTORE = pushBridgeType3;
        PushBridgeType pushBridgeType4 = new PushBridgeType("EMPTY", 3, 4);
        EMPTY = pushBridgeType4;
        PushBridgeType[] pushBridgeTypeArr = {pushBridgeType, pushBridgeType2, pushBridgeType3, pushBridgeType4};
        $VALUES = pushBridgeTypeArr;
        $ENTRIES = new asp(pushBridgeTypeArr);
    }

    public PushBridgeType(String str, int i, int i2) {
        this.id = i2;
    }

    public static PushBridgeType valueOf(String str) {
        return (PushBridgeType) Enum.valueOf(PushBridgeType.class, str);
    }

    public static PushBridgeType[] values() {
        return (PushBridgeType[]) $VALUES.clone();
    }

    public final int h() {
        return this.id;
    }
}
