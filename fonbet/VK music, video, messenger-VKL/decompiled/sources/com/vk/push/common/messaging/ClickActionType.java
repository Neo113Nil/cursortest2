package com.vk.push.common.messaging;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ClickActionType.kt */
/* loaded from: classes5.dex */
public final class ClickActionType {
    private static final /* synthetic */ ClickActionType[] $VALUES;
    public static final ClickActionType DEEP_LINK;
    public static final ClickActionType DEFAULT;

    static {
        ClickActionType clickActionType = new ClickActionType("DEFAULT", 0);
        DEFAULT = clickActionType;
        ClickActionType clickActionType2 = new ClickActionType("DEEP_LINK", 1);
        DEEP_LINK = clickActionType2;
        $VALUES = new ClickActionType[]{clickActionType, clickActionType2};
    }

    public ClickActionType() {
        throw null;
    }

    public static ClickActionType valueOf(String str) {
        return (ClickActionType) Enum.valueOf(ClickActionType.class, str);
    }

    public static ClickActionType[] values() {
        return (ClickActionType[]) $VALUES.clone();
    }
}
