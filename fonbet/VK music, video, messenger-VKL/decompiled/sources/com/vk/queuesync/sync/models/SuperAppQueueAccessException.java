package com.vk.queuesync.sync.models;

import xsna.pan0;

/* compiled from: SuperAppQueueAccessException.kt */
/* loaded from: classes5.dex */
public final class SuperAppQueueAccessException extends Exception {
    private final pan0 error;

    public SuperAppQueueAccessException(pan0 pan0Var) {
        super("Failed to request queue event: " + pan0Var);
        this.error = pan0Var;
    }

    public final pan0 d() {
        return this.error;
    }
}
