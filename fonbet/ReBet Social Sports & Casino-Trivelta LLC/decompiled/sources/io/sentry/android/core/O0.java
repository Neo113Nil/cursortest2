package io.sentry.android.core;

/* loaded from: classes3.dex */
public enum O0 {
    SENTRY_HANDLER_STRATEGY_DEFAULT(0),
    SENTRY_HANDLER_STRATEGY_CHAIN_AT_START(1);

    private final int value;

    O0(int i10) {
        this.value = i10;
    }

    public int getValue() {
        return this.value;
    }
}
