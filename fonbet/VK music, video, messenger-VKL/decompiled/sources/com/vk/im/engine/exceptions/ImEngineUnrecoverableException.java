package com.vk.im.engine.exceptions;

/* compiled from: ImEngineUnrecoverableException.kt */
/* loaded from: classes2.dex */
public final class ImEngineUnrecoverableException extends ImEngineException {
    private static final long serialVersionUID = -5294565624661964163L;

    public ImEngineUnrecoverableException(Exception exc) {
        super("#doStartEnvironment failed", exc);
    }
}
