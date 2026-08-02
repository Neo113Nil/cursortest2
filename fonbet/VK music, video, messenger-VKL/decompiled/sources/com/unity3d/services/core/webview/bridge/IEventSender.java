package com.unity3d.services.core.webview.bridge;

/* compiled from: IEventSender.kt */
/* loaded from: classes14.dex */
public interface IEventSender {
    boolean canSend();

    boolean sendEvent(Enum<?> r1, Enum<?> r2, Object... objArr);
}
