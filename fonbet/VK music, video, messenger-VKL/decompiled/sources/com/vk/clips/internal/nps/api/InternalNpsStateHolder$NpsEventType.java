package com.vk.clips.internal.nps.api;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: InternalNpsStateHolder.kt */
/* loaded from: classes16.dex */
public final class InternalNpsStateHolder$NpsEventType {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ InternalNpsStateHolder$NpsEventType[] $VALUES;
    public static final InternalNpsStateHolder$NpsEventType CLOSED;
    public static final InternalNpsStateHolder$NpsEventType FINISHED;

    static {
        InternalNpsStateHolder$NpsEventType internalNpsStateHolder$NpsEventType = new InternalNpsStateHolder$NpsEventType("CLOSED", 0);
        CLOSED = internalNpsStateHolder$NpsEventType;
        InternalNpsStateHolder$NpsEventType internalNpsStateHolder$NpsEventType2 = new InternalNpsStateHolder$NpsEventType("FINISHED", 1);
        FINISHED = internalNpsStateHolder$NpsEventType2;
        InternalNpsStateHolder$NpsEventType[] internalNpsStateHolder$NpsEventTypeArr = {internalNpsStateHolder$NpsEventType, internalNpsStateHolder$NpsEventType2};
        $VALUES = internalNpsStateHolder$NpsEventTypeArr;
        $ENTRIES = new asp(internalNpsStateHolder$NpsEventTypeArr);
    }

    public InternalNpsStateHolder$NpsEventType() {
        throw null;
    }

    public static InternalNpsStateHolder$NpsEventType valueOf(String str) {
        return (InternalNpsStateHolder$NpsEventType) Enum.valueOf(InternalNpsStateHolder$NpsEventType.class, str);
    }

    public static InternalNpsStateHolder$NpsEventType[] values() {
        return (InternalNpsStateHolder$NpsEventType[]) $VALUES.clone();
    }
}
