package com.vk.newsfeed.posting.impl.domain.model;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: WaitingActionTrigger.kt */
/* loaded from: classes4.dex */
public final class WaitingActionTrigger {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ WaitingActionTrigger[] $VALUES;
    public static final WaitingActionTrigger APPLY_CROP;
    public static final WaitingActionTrigger FINISH_LOADING;

    static {
        WaitingActionTrigger waitingActionTrigger = new WaitingActionTrigger("FINISH_LOADING", 0);
        FINISH_LOADING = waitingActionTrigger;
        WaitingActionTrigger waitingActionTrigger2 = new WaitingActionTrigger("APPLY_CROP", 1);
        APPLY_CROP = waitingActionTrigger2;
        WaitingActionTrigger[] waitingActionTriggerArr = {waitingActionTrigger, waitingActionTrigger2};
        $VALUES = waitingActionTriggerArr;
        $ENTRIES = new asp(waitingActionTriggerArr);
    }

    public WaitingActionTrigger() {
        throw null;
    }

    public static WaitingActionTrigger valueOf(String str) {
        return (WaitingActionTrigger) Enum.valueOf(WaitingActionTrigger.class, str);
    }

    public static WaitingActionTrigger[] values() {
        return (WaitingActionTrigger[]) $VALUES.clone();
    }
}
