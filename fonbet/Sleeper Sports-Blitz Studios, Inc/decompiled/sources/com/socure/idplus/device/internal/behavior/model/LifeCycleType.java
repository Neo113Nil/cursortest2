package com.socure.idplus.device.internal.behavior.model;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\t\b\u0081\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/socure/idplus/device/internal/behavior/model/LifeCycleType;", "", "(Ljava/lang/String;I)V", "UNKNOWN", "INITIALIZED", "FOREGROUNDED", "BACKGROUNDED", "PAUSED", "RESUMED", "DESTROYED", "device-risk-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class LifeCycleType {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ LifeCycleType[] $VALUES;
    public static final LifeCycleType UNKNOWN = new LifeCycleType("UNKNOWN", 0);
    public static final LifeCycleType INITIALIZED = new LifeCycleType("INITIALIZED", 1);
    public static final LifeCycleType FOREGROUNDED = new LifeCycleType("FOREGROUNDED", 2);
    public static final LifeCycleType BACKGROUNDED = new LifeCycleType("BACKGROUNDED", 3);
    public static final LifeCycleType PAUSED = new LifeCycleType("PAUSED", 4);
    public static final LifeCycleType RESUMED = new LifeCycleType("RESUMED", 5);
    public static final LifeCycleType DESTROYED = new LifeCycleType("DESTROYED", 6);

    private static final /* synthetic */ LifeCycleType[] $values() {
        return new LifeCycleType[]{UNKNOWN, INITIALIZED, FOREGROUNDED, BACKGROUNDED, PAUSED, RESUMED, DESTROYED};
    }

    static {
        LifeCycleType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }

    private LifeCycleType(String str, int i) {
    }

    public static EnumEntries<LifeCycleType> getEntries() {
        return $ENTRIES;
    }

    public static LifeCycleType valueOf(String str) {
        return (LifeCycleType) Enum.valueOf(LifeCycleType.class, str);
    }

    public static LifeCycleType[] values() {
        return (LifeCycleType[]) $VALUES.clone();
    }
}
