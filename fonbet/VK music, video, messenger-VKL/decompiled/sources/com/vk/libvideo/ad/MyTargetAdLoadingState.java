package com.vk.libvideo.ad;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: MyTargetAdLoadingState.kt */
/* loaded from: classes18.dex */
public final class MyTargetAdLoadingState {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ MyTargetAdLoadingState[] $VALUES;
    public static final MyTargetAdLoadingState ERROR;
    public static final MyTargetAdLoadingState INITIALIZING;
    public static final MyTargetAdLoadingState NOT_INITIALIZED;
    public static final MyTargetAdLoadingState NO_AD;
    public static final MyTargetAdLoadingState READY;

    static {
        MyTargetAdLoadingState myTargetAdLoadingState = new MyTargetAdLoadingState("NOT_INITIALIZED", 0);
        NOT_INITIALIZED = myTargetAdLoadingState;
        MyTargetAdLoadingState myTargetAdLoadingState2 = new MyTargetAdLoadingState("INITIALIZING", 1);
        INITIALIZING = myTargetAdLoadingState2;
        MyTargetAdLoadingState myTargetAdLoadingState3 = new MyTargetAdLoadingState("READY", 2);
        READY = myTargetAdLoadingState3;
        MyTargetAdLoadingState myTargetAdLoadingState4 = new MyTargetAdLoadingState("NO_AD", 3);
        NO_AD = myTargetAdLoadingState4;
        MyTargetAdLoadingState myTargetAdLoadingState5 = new MyTargetAdLoadingState("ERROR", 4);
        ERROR = myTargetAdLoadingState5;
        MyTargetAdLoadingState[] myTargetAdLoadingStateArr = {myTargetAdLoadingState, myTargetAdLoadingState2, myTargetAdLoadingState3, myTargetAdLoadingState4, myTargetAdLoadingState5};
        $VALUES = myTargetAdLoadingStateArr;
        $ENTRIES = new asp(myTargetAdLoadingStateArr);
    }

    public MyTargetAdLoadingState() {
        throw null;
    }

    public static MyTargetAdLoadingState valueOf(String str) {
        return (MyTargetAdLoadingState) Enum.valueOf(MyTargetAdLoadingState.class, str);
    }

    public static MyTargetAdLoadingState[] values() {
        return (MyTargetAdLoadingState[]) $VALUES.clone();
    }
}
