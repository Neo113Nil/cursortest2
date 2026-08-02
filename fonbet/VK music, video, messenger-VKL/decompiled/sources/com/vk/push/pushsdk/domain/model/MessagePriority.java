package com.vk.push.pushsdk.domain.model;

/* compiled from: MessagePriority.kt */
/* loaded from: classes5.dex */
public enum MessagePriority {
    HIGH(1),
    NORMAL(2),
    UNKNOWN(0);

    public static final a Companion = new a();
    private final int value;

    /* compiled from: MessagePriority.kt */
    public static final class a {
    }

    MessagePriority(int i) {
        this.value = i;
    }

    public final int h() {
        return this.value;
    }
}
