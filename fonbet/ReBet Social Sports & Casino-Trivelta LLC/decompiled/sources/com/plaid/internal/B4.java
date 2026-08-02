package com.plaid.internal;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@DebugMetadata(c = "com.plaid.internal.workflow.webview.OutOfProcessWebviewViewModel", f = "OutOfProcessWebviewViewModel.kt", i = {0, 1}, l = {125, 127}, m = "readPendingResult", n = {"this", "linkResult"}, s = {"L$0", "L$0"})
/* loaded from: classes3.dex */
public final class B4 extends ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public Object f39175a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f39176b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C3806z4 f39177c;

    /* renamed from: d, reason: collision with root package name */
    public int f39178d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public B4(C3806z4 c3806z4, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f39177c = c3806z4;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f39176b = obj;
        this.f39178d |= Integer.MIN_VALUE;
        return C3806z4.b(this.f39177c, this);
    }
}
