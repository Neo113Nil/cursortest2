package com.vk.music.offline.api.model.storage;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: StorageEvent.kt */
/* loaded from: classes3.dex */
public final class StorageEvent {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ StorageEvent[] $VALUES;
    public static final StorageEvent LOW_MEMORY;
    public static final StorageEvent NO_MEMORY;
    public static final StorageEvent SD_CARD_REMOVED;
    public static final StorageEvent SD_CARD_RE_MOUNTED;

    static {
        StorageEvent storageEvent = new StorageEvent("SD_CARD_REMOVED", 0);
        SD_CARD_REMOVED = storageEvent;
        StorageEvent storageEvent2 = new StorageEvent("SD_CARD_RE_MOUNTED", 1);
        SD_CARD_RE_MOUNTED = storageEvent2;
        StorageEvent storageEvent3 = new StorageEvent("LOW_MEMORY", 2);
        LOW_MEMORY = storageEvent3;
        StorageEvent storageEvent4 = new StorageEvent("NO_MEMORY", 3);
        NO_MEMORY = storageEvent4;
        StorageEvent[] storageEventArr = {storageEvent, storageEvent2, storageEvent3, storageEvent4};
        $VALUES = storageEventArr;
        $ENTRIES = new asp(storageEventArr);
    }

    public StorageEvent() {
        throw null;
    }

    public static StorageEvent valueOf(String str) {
        return (StorageEvent) Enum.valueOf(StorageEvent.class, str);
    }

    public static StorageEvent[] values() {
        return (StorageEvent[]) $VALUES.clone();
    }
}
