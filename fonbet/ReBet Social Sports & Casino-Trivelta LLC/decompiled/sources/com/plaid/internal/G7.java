package com.plaid.internal;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@DebugMetadata(c = "com.plaid.internal.workflow.webview.WebviewFallbackAnalytics", f = "WebviewFallbackAnalytics.kt", i = {0}, l = {41}, m = "trackWebviewFallbackEmitPreCompletionResult$link_sdk_release", n = {"this"}, s = {"L$0"})
/* loaded from: classes3.dex */
public final class G7 extends ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public I7 f39263a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f39264b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ I7 f39265c;

    /* renamed from: d, reason: collision with root package name */
    public int f39266d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public G7(I7 i72, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f39265c = i72;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f39264b = obj;
        this.f39266d |= Integer.MIN_VALUE;
        return this.f39265c.b(this);
    }
}
