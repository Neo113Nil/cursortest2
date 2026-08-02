package com.vk.im.engine.exceptions;

import com.vk.api.sdk.exceptions.VKApiExecutionException;

/* compiled from: ApiAccessDeniedException.kt */
/* loaded from: classes2.dex */
public class ApiAccessDeniedException extends ImEngineException {
    private final Throwable cause;

    public ApiAccessDeniedException() {
        this((VKApiExecutionException) null);
    }

    @Override // java.lang.Throwable
    public final Throwable getCause() {
        return this.cause;
    }

    public /* synthetic */ ApiAccessDeniedException(int i) {
        this((VKApiExecutionException) null);
    }

    public ApiAccessDeniedException(VKApiExecutionException vKApiExecutionException) {
        super(vKApiExecutionException);
        this.cause = vKApiExecutionException;
    }
}
