package com.vk.im.mvicomponent.viewsetup;

import com.vk.metrics.trackers.CriticalException;

/* compiled from: ViewSetupStubReplacementException.kt */
/* loaded from: classes2.dex */
public final class ViewSetupStubReplacementException extends CriticalException {
    private final String message;

    public ViewSetupStubReplacementException(String str) {
        super(str);
        this.message = str;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return this.message;
    }
}
