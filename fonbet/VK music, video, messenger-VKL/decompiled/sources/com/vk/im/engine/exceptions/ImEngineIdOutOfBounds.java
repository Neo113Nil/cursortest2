package com.vk.im.engine.exceptions;

/* compiled from: ImEngineIdOutOfBounds.kt */
/* loaded from: classes2.dex */
public final class ImEngineIdOutOfBounds extends ImEngineDbUnrecoverableException {
    @Override // java.lang.Throwable
    public final String toString() {
        return "ImEngineLocalIdOutOfBounds(" + getMessage() + ')';
    }
}
