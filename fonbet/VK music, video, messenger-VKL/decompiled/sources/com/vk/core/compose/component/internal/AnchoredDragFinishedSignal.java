package com.vk.core.compose.component.internal;

import java.util.concurrent.CancellationException;

/* compiled from: AnchoredDraggable.kt */
/* loaded from: classes17.dex */
public final class AnchoredDragFinishedSignal extends CancellationException {
    public AnchoredDragFinishedSignal() {
        super("Anchored drag finished");
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }
}
