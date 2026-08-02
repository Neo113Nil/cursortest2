package com.vk.superapp.vksteps.utils.enums;

import ru.ok.android.api.methods.batch.execute.BatchApiRequest;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: VkStepsStoreSyncReason.kt */
/* loaded from: classes11.dex */
public final class VkStepsStoreSyncReason {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ VkStepsStoreSyncReason[] $VALUES;
    public static final a Companion;
    public static final VkStepsStoreSyncReason SAVE;
    public static final VkStepsStoreSyncReason SKIP;
    public static final VkStepsStoreSyncReason UPDATE;

    /* compiled from: VkStepsStoreSyncReason.kt */
    public static final class a {
    }

    static {
        VkStepsStoreSyncReason vkStepsStoreSyncReason = new VkStepsStoreSyncReason(SignalingProtocol.KEY_ROOMS_EVENT_TYPE_UPDATE, 0);
        UPDATE = vkStepsStoreSyncReason;
        VkStepsStoreSyncReason vkStepsStoreSyncReason2 = new VkStepsStoreSyncReason("SAVE", 1);
        SAVE = vkStepsStoreSyncReason2;
        VkStepsStoreSyncReason vkStepsStoreSyncReason3 = new VkStepsStoreSyncReason(BatchApiRequest.FIELD_VALUE_ON_ERROR_SKIP, 2);
        SKIP = vkStepsStoreSyncReason3;
        VkStepsStoreSyncReason[] vkStepsStoreSyncReasonArr = {vkStepsStoreSyncReason, vkStepsStoreSyncReason2, vkStepsStoreSyncReason3};
        $VALUES = vkStepsStoreSyncReasonArr;
        $ENTRIES = new asp(vkStepsStoreSyncReasonArr);
        Companion = new a();
    }

    public VkStepsStoreSyncReason() {
        throw null;
    }

    public static VkStepsStoreSyncReason valueOf(String str) {
        return (VkStepsStoreSyncReason) Enum.valueOf(VkStepsStoreSyncReason.class, str);
    }

    public static VkStepsStoreSyncReason[] values() {
        return (VkStepsStoreSyncReason[]) $VALUES.clone();
    }
}
