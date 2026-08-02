package org.chromium.net.telemetry;

/* loaded from: classes10.dex */
public enum OptionalBoolean {
    UNSET(0),
    TRUE(1),
    FALSE(2);

    private final int mValue;

    OptionalBoolean(int value) {
        this.mValue = value;
    }

    public int getValue() {
        return this.mValue;
    }

    public static OptionalBoolean fromBoolean(Boolean value) {
        if (value == null) {
            return UNSET;
        }
        return value.booleanValue() ? TRUE : FALSE;
    }
}
