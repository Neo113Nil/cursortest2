package com.unity3d.services.core.network.model;

import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: BodyType.kt */
/* loaded from: classes14.dex */
public final class BodyType {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ BodyType[] $VALUES;
    public static final BodyType UNKNOWN = new BodyType(GrsBaseInfo.CountryCodeSource.UNKNOWN, 0);
    public static final BodyType STRING = new BodyType("STRING", 1);

    private static final /* synthetic */ BodyType[] $values() {
        return new BodyType[]{UNKNOWN, STRING};
    }

    static {
        BodyType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = new asp($values);
    }

    private BodyType(String str, int i) {
    }

    public static zrp<BodyType> getEntries() {
        return $ENTRIES;
    }

    public static BodyType valueOf(String str) {
        return (BodyType) Enum.valueOf(BodyType.class, str);
    }

    public static BodyType[] values() {
        return (BodyType[]) $VALUES.clone();
    }
}
