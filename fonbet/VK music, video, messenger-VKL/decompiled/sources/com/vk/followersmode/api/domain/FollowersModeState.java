package com.vk.followersmode.api.domain;

import java.util.NoSuchElementException;
import xsna.asp;
import xsna.epx;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: FollowersModeState.kt */
/* loaded from: classes18.dex */
public final class FollowersModeState {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ FollowersModeState[] $VALUES;
    public static final a Companion;
    public static final FollowersModeState DISABLED;
    public static final FollowersModeState ENABLED;
    public static final FollowersModeState UNAVAILABLE;
    private final Boolean value;

    /* compiled from: FollowersModeState.kt */
    public static final class a {
        public static FollowersModeState a(Boolean bool) {
            for (FollowersModeState followersModeState : FollowersModeState.values()) {
                if (epx.f(followersModeState.h(), bool)) {
                    return followersModeState;
                }
            }
            throw new NoSuchElementException("Array contains no element matching the predicate.");
        }
    }

    static {
        FollowersModeState followersModeState = new FollowersModeState("ENABLED", 0, Boolean.TRUE);
        ENABLED = followersModeState;
        FollowersModeState followersModeState2 = new FollowersModeState("DISABLED", 1, Boolean.FALSE);
        DISABLED = followersModeState2;
        FollowersModeState followersModeState3 = new FollowersModeState("UNAVAILABLE", 2, null);
        UNAVAILABLE = followersModeState3;
        FollowersModeState[] followersModeStateArr = {followersModeState, followersModeState2, followersModeState3};
        $VALUES = followersModeStateArr;
        $ENTRIES = new asp(followersModeStateArr);
        Companion = new a();
    }

    public FollowersModeState(String str, int i, Boolean bool) {
        this.value = bool;
    }

    public static FollowersModeState valueOf(String str) {
        return (FollowersModeState) Enum.valueOf(FollowersModeState.class, str);
    }

    public static FollowersModeState[] values() {
        return (FollowersModeState[]) $VALUES.clone();
    }

    public final Boolean h() {
        return this.value;
    }
}
