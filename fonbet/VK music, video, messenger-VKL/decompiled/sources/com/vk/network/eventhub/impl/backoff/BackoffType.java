package com.vk.network.eventhub.impl.backoff;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: BackoffType.kt */
/* loaded from: classes3.dex */
public final class BackoffType {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ BackoffType[] $VALUES;
    public static final BackoffType DEFAULT;
    public static final BackoffType FLOOD_CONTROL;
    public static final BackoffType NONE;

    static {
        BackoffType backoffType = new BackoffType("NONE", 0);
        NONE = backoffType;
        BackoffType backoffType2 = new BackoffType("DEFAULT", 1);
        DEFAULT = backoffType2;
        BackoffType backoffType3 = new BackoffType("FLOOD_CONTROL", 2);
        FLOOD_CONTROL = backoffType3;
        BackoffType[] backoffTypeArr = {backoffType, backoffType2, backoffType3};
        $VALUES = backoffTypeArr;
        $ENTRIES = new asp(backoffTypeArr);
    }

    public BackoffType() {
        throw null;
    }

    public static BackoffType valueOf(String str) {
        return (BackoffType) Enum.valueOf(BackoffType.class, str);
    }

    public static BackoffType[] values() {
        return (BackoffType[]) $VALUES.clone();
    }
}
