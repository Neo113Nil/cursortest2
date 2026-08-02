package com.plaid.internal;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@DebugMetadata(c = "com.plaid.internal.workflow.di.PreCompletionResultStore", f = "PreCompletionResultStore.kt", i = {}, l = {24}, m = "readPreCompletionResult", n = {}, s = {})
/* renamed from: com.plaid.internal.b6, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3566b6 extends ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f39840a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C3576c6 f39841b;

    /* renamed from: c, reason: collision with root package name */
    public int f39842c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3566b6(C3576c6 c3576c6, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f39841b = c3576c6;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f39840a = obj;
        this.f39842c |= Integer.MIN_VALUE;
        return this.f39841b.a(this);
    }
}
