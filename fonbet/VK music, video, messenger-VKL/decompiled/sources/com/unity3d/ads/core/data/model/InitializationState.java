package com.unity3d.ads.core.data.model;

import java.util.Locale;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: InitializationState.kt */
/* loaded from: classes14.dex */
public final class InitializationState {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ InitializationState[] $VALUES;
    public static final InitializationState NOT_INITIALIZED = new InitializationState("NOT_INITIALIZED", 0);
    public static final InitializationState INITIALIZING = new InitializationState("INITIALIZING", 1);
    public static final InitializationState INITIALIZED = new InitializationState("INITIALIZED", 2);
    public static final InitializationState FAILED = new InitializationState(SignalingProtocol.HUNGUP_REASON_FAILED, 3);

    private static final /* synthetic */ InitializationState[] $values() {
        return new InitializationState[]{NOT_INITIALIZED, INITIALIZING, INITIALIZED, FAILED};
    }

    static {
        InitializationState[] $values = $values();
        $VALUES = $values;
        $ENTRIES = new asp($values);
    }

    private InitializationState(String str, int i) {
    }

    public static zrp<InitializationState> getEntries() {
        return $ENTRIES;
    }

    public static InitializationState valueOf(String str) {
        return (InitializationState) Enum.valueOf(InitializationState.class, str);
    }

    public static InitializationState[] values() {
        return (InitializationState[]) $VALUES.clone();
    }

    @Override // java.lang.Enum
    public String toString() {
        return super.toString().toLowerCase(Locale.getDefault());
    }
}
