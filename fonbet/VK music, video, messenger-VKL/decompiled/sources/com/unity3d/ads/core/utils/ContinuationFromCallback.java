package com.unity3d.ads.core.utils;

import com.unity3d.ads.core.data.model.exception.ExposureException;
import com.unity3d.services.core.webview.bridge.WebViewCallback;
import kotlin.Result;
import xsna.spj;

/* compiled from: ContinuationFromCallback.kt */
/* loaded from: classes14.dex */
public final class ContinuationFromCallback extends WebViewCallback {
    private final spj<Object> continuation;

    public ContinuationFromCallback(spj<Object> spjVar) {
        super("", 0);
        this.continuation = spjVar;
    }

    @Override // com.unity3d.services.core.webview.bridge.WebViewCallback
    public void error(Enum<?> r5, Object... objArr) {
        this.continuation.resumeWith(new Result.Failure(new ExposureException("Invocation failed with: " + r5, objArr)));
    }

    @Override // com.unity3d.services.core.webview.bridge.WebViewCallback
    public void invoke(Object... objArr) {
        this.continuation.resumeWith(objArr);
    }
}
