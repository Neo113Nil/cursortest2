package io.sentry.android.core;

/* loaded from: classes.dex */
public enum c0 {
    SENTRY_HANDLER_STRATEGY_DEFAULT(0),
    SENTRY_HANDLER_STRATEGY_CHAIN_AT_START(1);

    private final int value;

    c0(int i11) {
        this.value = i11;
    }

    public int getValue() {
        return this.value;
    }
}
