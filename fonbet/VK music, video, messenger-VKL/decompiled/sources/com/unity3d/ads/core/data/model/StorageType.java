package com.unity3d.ads.core.data.model;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: StorageType.kt */
/* loaded from: classes14.dex */
public final class StorageType {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ StorageType[] $VALUES;
    public static final StorageType EXTERNAL = new StorageType("EXTERNAL", 0);
    public static final StorageType INTERNAL = new StorageType("INTERNAL", 1);

    private static final /* synthetic */ StorageType[] $values() {
        return new StorageType[]{EXTERNAL, INTERNAL};
    }

    static {
        StorageType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = new asp($values);
    }

    private StorageType(String str, int i) {
    }

    public static zrp<StorageType> getEntries() {
        return $ENTRIES;
    }

    public static StorageType valueOf(String str) {
        return (StorageType) Enum.valueOf(StorageType.class, str);
    }

    public static StorageType[] values() {
        return (StorageType[]) $VALUES.clone();
    }
}
