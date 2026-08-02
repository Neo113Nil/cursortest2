package com.vk.stories.analytics.session.storage.permissions;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: CallReason.kt */
/* loaded from: classes6.dex */
public final class CallReason {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ CallReason[] $VALUES;
    public static final CallReason INIT;
    public static final CallReason SET_ACCESS;

    static {
        CallReason callReason = new CallReason("INIT", 0);
        INIT = callReason;
        CallReason callReason2 = new CallReason("SET_ACCESS", 1);
        SET_ACCESS = callReason2;
        CallReason[] callReasonArr = {callReason, callReason2};
        $VALUES = callReasonArr;
        $ENTRIES = new asp(callReasonArr);
    }

    public CallReason() {
        throw null;
    }

    public static CallReason valueOf(String str) {
        return (CallReason) Enum.valueOf(CallReason.class, str);
    }

    public static CallReason[] values() {
        return (CallReason[]) $VALUES.clone();
    }
}
