package com.plaid.internal;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@DebugMetadata(c = "com.plaid.internal.workflow.webview.OutOfProcessWebviewViewModel", f = "OutOfProcessWebviewViewModel.kt", i = {0}, l = {115}, m = "readChannelAndStartPolling", n = {"this"}, s = {"L$0"})
/* loaded from: classes3.dex */
public final class A4 extends ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public C3806z4 f39150a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f39151b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C3806z4 f39152c;

    /* renamed from: d, reason: collision with root package name */
    public int f39153d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public A4(C3806z4 c3806z4, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f39152c = c3806z4;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f39151b = obj;
        this.f39153d |= Integer.MIN_VALUE;
        return C3806z4.a(this.f39152c, this);
    }
}
