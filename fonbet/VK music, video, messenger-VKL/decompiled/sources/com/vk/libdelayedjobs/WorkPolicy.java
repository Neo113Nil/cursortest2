package com.vk.libdelayedjobs;

import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: WorkPolicy.kt */
/* loaded from: classes.dex */
public final class WorkPolicy {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ WorkPolicy[] $VALUES;
    public static final WorkPolicy KEEP;
    public static final WorkPolicy REPLACE;
    public static final WorkPolicy UPDATE;

    static {
        WorkPolicy workPolicy = new WorkPolicy("REPLACE", 0);
        REPLACE = workPolicy;
        WorkPolicy workPolicy2 = new WorkPolicy(SignalingProtocol.KEY_ROOMS_EVENT_TYPE_UPDATE, 1);
        UPDATE = workPolicy2;
        WorkPolicy workPolicy3 = new WorkPolicy("KEEP", 2);
        KEEP = workPolicy3;
        WorkPolicy[] workPolicyArr = {workPolicy, workPolicy2, workPolicy3};
        $VALUES = workPolicyArr;
        $ENTRIES = new asp(workPolicyArr);
    }

    public WorkPolicy() {
        throw null;
    }

    public static WorkPolicy valueOf(String str) {
        return (WorkPolicy) Enum.valueOf(WorkPolicy.class, str);
    }

    public static WorkPolicy[] values() {
        return (WorkPolicy[]) $VALUES.clone();
    }
}
