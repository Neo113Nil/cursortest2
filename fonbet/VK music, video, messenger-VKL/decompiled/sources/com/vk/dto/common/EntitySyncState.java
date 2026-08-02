package com.vk.dto.common;

import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: EntitySyncState.kt */
/* loaded from: classes18.dex */
public final class EntitySyncState {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ EntitySyncState[] $VALUES;
    public static final EntitySyncState ACTUAL;
    public static final EntitySyncState EXPIRED;
    public static final EntitySyncState MISSED;

    static {
        EntitySyncState entitySyncState = new EntitySyncState(SignalingProtocol.HUNGUP_REASON_MISSED, 0);
        MISSED = entitySyncState;
        EntitySyncState entitySyncState2 = new EntitySyncState("EXPIRED", 1);
        EXPIRED = entitySyncState2;
        EntitySyncState entitySyncState3 = new EntitySyncState("ACTUAL", 2);
        ACTUAL = entitySyncState3;
        EntitySyncState[] entitySyncStateArr = {entitySyncState, entitySyncState2, entitySyncState3};
        $VALUES = entitySyncStateArr;
        $ENTRIES = new asp(entitySyncStateArr);
    }

    public EntitySyncState() {
        throw null;
    }

    public static EntitySyncState valueOf(String str) {
        return (EntitySyncState) Enum.valueOf(EntitySyncState.class, str);
    }

    public static EntitySyncState[] values() {
        return (EntitySyncState[]) $VALUES.clone();
    }
}
