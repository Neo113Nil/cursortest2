package com.vk.im.engine.models.reporters;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: CancelReason.kt */
/* loaded from: classes2.dex */
public final class CancelReason {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ CancelReason[] $VALUES;
    public static final CancelReason ATTACH_CANCEL;
    public static final CancelReason MSG_DELETE;

    static {
        CancelReason cancelReason = new CancelReason("ATTACH_CANCEL", 0);
        ATTACH_CANCEL = cancelReason;
        CancelReason cancelReason2 = new CancelReason("MSG_DELETE", 1);
        MSG_DELETE = cancelReason2;
        CancelReason[] cancelReasonArr = {cancelReason, cancelReason2};
        $VALUES = cancelReasonArr;
        $ENTRIES = new asp(cancelReasonArr);
    }

    public CancelReason() {
        throw null;
    }

    public static CancelReason valueOf(String str) {
        return (CancelReason) Enum.valueOf(CancelReason.class, str);
    }

    public static CancelReason[] values() {
        return (CancelReason[]) $VALUES.clone();
    }
}
