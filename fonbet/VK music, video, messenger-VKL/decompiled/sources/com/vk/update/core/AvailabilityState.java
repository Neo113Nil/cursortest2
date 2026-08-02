package com.vk.update.core;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: AvailabilityState.kt */
/* loaded from: classes6.dex */
public final class AvailabilityState {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ AvailabilityState[] $VALUES;
    public static final AvailabilityState UPDATE_AVAILABLE;
    public static final AvailabilityState UPDATE_NOT_AVAILABLE;

    static {
        AvailabilityState availabilityState = new AvailabilityState("UPDATE_AVAILABLE", 0);
        UPDATE_AVAILABLE = availabilityState;
        AvailabilityState availabilityState2 = new AvailabilityState("UPDATE_NOT_AVAILABLE", 1);
        UPDATE_NOT_AVAILABLE = availabilityState2;
        AvailabilityState[] availabilityStateArr = {availabilityState, availabilityState2};
        $VALUES = availabilityStateArr;
        $ENTRIES = new asp(availabilityStateArr);
    }

    public AvailabilityState() {
        throw null;
    }

    public static AvailabilityState valueOf(String str) {
        return (AvailabilityState) Enum.valueOf(AvailabilityState.class, str);
    }

    public static AvailabilityState[] values() {
        return (AvailabilityState[]) $VALUES.clone();
    }
}
