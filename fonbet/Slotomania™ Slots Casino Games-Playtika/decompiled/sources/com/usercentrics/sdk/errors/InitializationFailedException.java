package com.usercentrics.sdk.errors;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: InitializationFailedException.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/usercentrics/sdk/errors/InitializationFailedException;", "Lcom/usercentrics/sdk/errors/UsercentricsException;", "initializeOnlineError", "(Lcom/usercentrics/sdk/errors/UsercentricsException;)V", "usercentrics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class InitializationFailedException extends UsercentricsException {
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public InitializationFailedException(UsercentricsException initializeOnlineError) {
        super("Usercentrics initialization failed: " + (r0 == null ? "Unknown error" : r0), initializeOnlineError);
        Intrinsics.checkNotNullParameter(initializeOnlineError, "initializeOnlineError");
        String message = initializeOnlineError.getMessage();
    }
}
