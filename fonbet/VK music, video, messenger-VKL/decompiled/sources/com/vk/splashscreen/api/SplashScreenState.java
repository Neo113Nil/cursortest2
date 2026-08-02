package com.vk.splashscreen.api;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: SplashScreenState.kt */
/* loaded from: classes5.dex */
public final class SplashScreenState {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ SplashScreenState[] $VALUES;
    public static final SplashScreenState DISPLAYED;
    public static final SplashScreenState HIDDEN;
    public static final SplashScreenState IDLE;
    public static final SplashScreenState INITIALIZING;
    public static final SplashScreenState READY_TO_HIDE;
    public static final SplashScreenState READY_TO_SHOW;

    static {
        SplashScreenState splashScreenState = new SplashScreenState("IDLE", 0);
        IDLE = splashScreenState;
        SplashScreenState splashScreenState2 = new SplashScreenState("INITIALIZING", 1);
        INITIALIZING = splashScreenState2;
        SplashScreenState splashScreenState3 = new SplashScreenState("READY_TO_SHOW", 2);
        READY_TO_SHOW = splashScreenState3;
        SplashScreenState splashScreenState4 = new SplashScreenState("DISPLAYED", 3);
        DISPLAYED = splashScreenState4;
        SplashScreenState splashScreenState5 = new SplashScreenState("READY_TO_HIDE", 4);
        READY_TO_HIDE = splashScreenState5;
        SplashScreenState splashScreenState6 = new SplashScreenState("HIDDEN", 5);
        HIDDEN = splashScreenState6;
        SplashScreenState[] splashScreenStateArr = {splashScreenState, splashScreenState2, splashScreenState3, splashScreenState4, splashScreenState5, splashScreenState6};
        $VALUES = splashScreenStateArr;
        $ENTRIES = new asp(splashScreenStateArr);
    }

    public SplashScreenState() {
        throw null;
    }

    public static SplashScreenState valueOf(String str) {
        return (SplashScreenState) Enum.valueOf(SplashScreenState.class, str);
    }

    public static SplashScreenState[] values() {
        return (SplashScreenState[]) $VALUES.clone();
    }
}
