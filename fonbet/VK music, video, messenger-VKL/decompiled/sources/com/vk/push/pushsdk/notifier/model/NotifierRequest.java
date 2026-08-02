package com.vk.push.pushsdk.notifier.model;

/* compiled from: NotifierRequest.kt */
/* loaded from: classes5.dex */
public enum NotifierRequest {
    SUBSCRIBE("subscribe"),
    UNSUBSCRIBE("unsubscribe"),
    CHECK_ALIVE("keepalive");

    private final String method;

    NotifierRequest(String str) {
        this.method = str;
    }

    public final String h() {
        return this.method;
    }
}
