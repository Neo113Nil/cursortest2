package com.plaid.internal;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@DebugMetadata(c = "com.plaid.internal.workflow.di.WebviewBackgroundTransparencyStore", f = "WebviewBackgroundTransparencyStore.kt", i = {}, l = {27}, m = "readWebviewBackgroundTransparencyState", n = {}, s = {})
/* loaded from: classes3.dex */
public final class D7 extends ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f39209a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ E7 f39210b;

    /* renamed from: c, reason: collision with root package name */
    public int f39211c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public D7(E7 e72, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f39210b = e72;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f39209a = obj;
        this.f39211c |= Integer.MIN_VALUE;
        return this.f39210b.a(this);
    }
}
