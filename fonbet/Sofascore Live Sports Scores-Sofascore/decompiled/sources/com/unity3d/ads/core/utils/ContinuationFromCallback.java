package com.unity3d.ads.core.utils;

import com.unity3d.ads.core.data.model.exception.ExposureException;
import com.unity3d.services.core.webview.bridge.WebViewCallback;
import defpackage.p2g;
import defpackage.rq3;
import defpackage.u2g;
import defpackage.w2g;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J(\u0010\n\u001a\u00020\t2\u0016\u0010\b\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00030\u0007\"\u0004\u0018\u00010\u0003H\u0096\u0002¢\u0006\u0004\b\n\u0010\u000bJ5\u0010\r\u001a\u00020\t2\f\u0010\r\u001a\b\u0012\u0002\b\u0003\u0018\u00010\f2\u0016\u0010\b\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00030\u0007\"\u0004\u0018\u00010\u0003H\u0016¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u000f¨\u0006\u0010"}, d2 = {"Lcom/unity3d/ads/core/utils/ContinuationFromCallback;", "Lcom/unity3d/services/core/webview/bridge/WebViewCallback;", "Lrq3;", "", "continuation", "<init>", "(Lrq3;)V", "", "params", "", "invoke", "([Ljava/lang/Object;)V", "", "error", "(Ljava/lang/Enum;[Ljava/lang/Object;)V", "Lrq3;", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ContinuationFromCallback extends WebViewCallback {

    @NotNull
    private final rq3<Object> continuation;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ContinuationFromCallback(@NotNull rq3<Object> rq3Var) {
        super("", 0);
        rq3Var.getClass();
        this.continuation = rq3Var;
    }

    @Override // com.unity3d.services.core.webview.bridge.WebViewCallback
    public void error(@Nullable Enum<?> error, @NotNull Object... params) {
        params.getClass();
        rq3<Object> rq3Var = this.continuation;
        p2g p2gVar = w2g.b;
        rq3Var.resumeWith(new u2g(new ExposureException("Invocation failed with: " + error, params)));
    }

    @Override // com.unity3d.services.core.webview.bridge.WebViewCallback
    public void invoke(@NotNull Object... params) {
        params.getClass();
        rq3<Object> rq3Var = this.continuation;
        p2g p2gVar = w2g.b;
        rq3Var.resumeWith(params);
    }
}
