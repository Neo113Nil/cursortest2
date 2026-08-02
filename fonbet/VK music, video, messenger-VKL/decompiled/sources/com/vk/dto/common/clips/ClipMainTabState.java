package com.vk.dto.common.clips;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ClipMainTabState.kt */
/* loaded from: classes18.dex */
public final class ClipMainTabState {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ ClipMainTabState[] $VALUES;
    public static final a Companion;
    public static final ClipMainTabState NOT_ON_TAB;
    public static final ClipMainTabState NO_ACCESS;
    public static final ClipMainTabState ON_TAB;
    private final int id;

    /* compiled from: ClipMainTabState.kt */
    public static final class a {
        public static ClipMainTabState a(Integer num) {
            ClipMainTabState clipMainTabState = ClipMainTabState.NO_ACCESS;
            int h = clipMainTabState.h();
            if (num != null && num.intValue() == h) {
                return clipMainTabState;
            }
            ClipMainTabState clipMainTabState2 = ClipMainTabState.ON_TAB;
            int h2 = clipMainTabState2.h();
            if (num != null && num.intValue() == h2) {
                return clipMainTabState2;
            }
            ClipMainTabState clipMainTabState3 = ClipMainTabState.NOT_ON_TAB;
            int h3 = clipMainTabState3.h();
            if (num != null && num.intValue() == h3) {
                return clipMainTabState3;
            }
            return null;
        }
    }

    static {
        ClipMainTabState clipMainTabState = new ClipMainTabState("NO_ACCESS", 0, 0);
        NO_ACCESS = clipMainTabState;
        ClipMainTabState clipMainTabState2 = new ClipMainTabState("ON_TAB", 1, 1);
        ON_TAB = clipMainTabState2;
        ClipMainTabState clipMainTabState3 = new ClipMainTabState("NOT_ON_TAB", 2, 2);
        NOT_ON_TAB = clipMainTabState3;
        ClipMainTabState[] clipMainTabStateArr = {clipMainTabState, clipMainTabState2, clipMainTabState3};
        $VALUES = clipMainTabStateArr;
        $ENTRIES = new asp(clipMainTabStateArr);
        Companion = new a();
    }

    public ClipMainTabState(String str, int i, int i2) {
        this.id = i2;
    }

    public static ClipMainTabState valueOf(String str) {
        return (ClipMainTabState) Enum.valueOf(ClipMainTabState.class, str);
    }

    public static ClipMainTabState[] values() {
        return (ClipMainTabState[]) $VALUES.clone();
    }

    public final int h() {
        return this.id;
    }
}
