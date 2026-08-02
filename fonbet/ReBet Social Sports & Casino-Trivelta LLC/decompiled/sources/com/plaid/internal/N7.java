package com.plaid.internal;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@DebugMetadata(c = "com.plaid.internal.workflow.di.WebviewFallbackUriStore", f = "WebviewFallbackUriStore.kt", i = {0, 1}, l = {20, 24}, m = "readWebviewFallbackUri", n = {"this", "uri"}, s = {"L$0", "L$0"})
/* loaded from: classes3.dex */
public final class N7 extends ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public Object f39465a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f39466b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ O7 f39467c;

    /* renamed from: d, reason: collision with root package name */
    public int f39468d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public N7(O7 o72, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f39467c = o72;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f39466b = obj;
        this.f39468d |= Integer.MIN_VALUE;
        return this.f39467c.a(this);
    }
}
