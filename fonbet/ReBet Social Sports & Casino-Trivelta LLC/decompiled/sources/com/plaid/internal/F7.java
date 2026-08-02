package com.plaid.internal;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@DebugMetadata(c = "com.plaid.internal.workflow.webview.WebviewFallbackAnalytics", f = "WebviewFallbackAnalytics.kt", i = {0}, l = {31}, m = "trackWebviewFallbackCancel$link_sdk_release", n = {"this"}, s = {"L$0"})
/* loaded from: classes3.dex */
public final class F7 extends ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public I7 f39251a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f39252b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ I7 f39253c;

    /* renamed from: d, reason: collision with root package name */
    public int f39254d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public F7(I7 i72, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f39253c = i72;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f39252b = obj;
        this.f39254d |= Integer.MIN_VALUE;
        return this.f39253c.a(this);
    }
}
