package com.vk.im.engine.internal.sync.longpoll;

import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: LongPollSyncManager.kt */
/* loaded from: classes2.dex */
public final class LongPollSyncManager$InitialSyncState {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ LongPollSyncManager$InitialSyncState[] $VALUES;
    public static final LongPollSyncManager$InitialSyncState INTERRUPTED;
    public static final LongPollSyncManager$InitialSyncState STARTED;
    public static final LongPollSyncManager$InitialSyncState STOPPED;
    public static final LongPollSyncManager$InitialSyncState SYNCED;
    private final int value;

    static {
        LongPollSyncManager$InitialSyncState longPollSyncManager$InitialSyncState = new LongPollSyncManager$InitialSyncState("STOPPED", 0, 0);
        STOPPED = longPollSyncManager$InitialSyncState;
        LongPollSyncManager$InitialSyncState longPollSyncManager$InitialSyncState2 = new LongPollSyncManager$InitialSyncState(SignalingProtocol.STATE_STARTED, 1, 1);
        STARTED = longPollSyncManager$InitialSyncState2;
        LongPollSyncManager$InitialSyncState longPollSyncManager$InitialSyncState3 = new LongPollSyncManager$InitialSyncState("INTERRUPTED", 2, 2);
        INTERRUPTED = longPollSyncManager$InitialSyncState3;
        LongPollSyncManager$InitialSyncState longPollSyncManager$InitialSyncState4 = new LongPollSyncManager$InitialSyncState("SYNCED", 3, 3);
        SYNCED = longPollSyncManager$InitialSyncState4;
        LongPollSyncManager$InitialSyncState[] longPollSyncManager$InitialSyncStateArr = {longPollSyncManager$InitialSyncState, longPollSyncManager$InitialSyncState2, longPollSyncManager$InitialSyncState3, longPollSyncManager$InitialSyncState4};
        $VALUES = longPollSyncManager$InitialSyncStateArr;
        $ENTRIES = new asp(longPollSyncManager$InitialSyncStateArr);
    }

    public LongPollSyncManager$InitialSyncState(String str, int i, int i2) {
        this.value = i2;
    }

    public static LongPollSyncManager$InitialSyncState valueOf(String str) {
        return (LongPollSyncManager$InitialSyncState) Enum.valueOf(LongPollSyncManager$InitialSyncState.class, str);
    }

    public static LongPollSyncManager$InitialSyncState[] values() {
        return (LongPollSyncManager$InitialSyncState[]) $VALUES.clone();
    }

    public final int h() {
        return this.value;
    }
}
