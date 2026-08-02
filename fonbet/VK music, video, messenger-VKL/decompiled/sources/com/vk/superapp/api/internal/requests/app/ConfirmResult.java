package com.vk.superapp.api.internal.requests.app;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ConfirmResult.kt */
/* loaded from: classes6.dex */
public final class ConfirmResult {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ ConfirmResult[] $VALUES;
    public static final ConfirmResult FAILURE;
    public static final ConfirmResult OK;

    static {
        ConfirmResult confirmResult = new ConfirmResult("OK", 0);
        OK = confirmResult;
        ConfirmResult confirmResult2 = new ConfirmResult("FAILURE", 1);
        FAILURE = confirmResult2;
        ConfirmResult[] confirmResultArr = {confirmResult, confirmResult2};
        $VALUES = confirmResultArr;
        $ENTRIES = new asp(confirmResultArr);
    }

    public ConfirmResult() {
        throw null;
    }

    public static ConfirmResult valueOf(String str) {
        return (ConfirmResult) Enum.valueOf(ConfirmResult.class, str);
    }

    public static ConfirmResult[] values() {
        return (ConfirmResult[]) $VALUES.clone();
    }
}
