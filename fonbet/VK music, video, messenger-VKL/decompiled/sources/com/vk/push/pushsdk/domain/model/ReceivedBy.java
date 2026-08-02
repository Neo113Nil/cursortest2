package com.vk.push.pushsdk.domain.model;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PushMessageResult.kt */
/* loaded from: classes5.dex */
public final class ReceivedBy {
    private static final /* synthetic */ ReceivedBy[] $VALUES;
    public static final ReceivedBy HTTP;
    public static final ReceivedBy TEST;
    public static final ReceivedBy WEB_SOCKET;

    static {
        ReceivedBy receivedBy = new ReceivedBy("TEST", 0);
        TEST = receivedBy;
        ReceivedBy receivedBy2 = new ReceivedBy("WEB_SOCKET", 1);
        WEB_SOCKET = receivedBy2;
        ReceivedBy receivedBy3 = new ReceivedBy("HTTP", 2);
        HTTP = receivedBy3;
        $VALUES = new ReceivedBy[]{receivedBy, receivedBy2, receivedBy3};
    }

    public ReceivedBy() {
        throw null;
    }

    public static ReceivedBy valueOf(String str) {
        return (ReceivedBy) Enum.valueOf(ReceivedBy.class, str);
    }

    public static ReceivedBy[] values() {
        return (ReceivedBy[]) $VALUES.clone();
    }
}
