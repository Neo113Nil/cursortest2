package com.unity3d.services.store.gpbl.bridges.billingclient;

/* compiled from: FallbackException.kt */
/* loaded from: classes14.dex */
public final class FallbackException extends Exception {
    private final int detectedVersion;

    public FallbackException(int i) {
        this.detectedVersion = i;
    }

    public final int getDetectedVersion() {
        return this.detectedVersion;
    }
}
