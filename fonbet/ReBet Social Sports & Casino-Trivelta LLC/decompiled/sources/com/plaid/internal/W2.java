package com.plaid.internal;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@DebugMetadata(c = "com.plaid.internal.workflow.LinkStateReducer", f = "LinkStateReducer.kt", i = {1, 1}, l = {439, 456}, m = "resume", n = {"this", "currentState"}, s = {"L$0", "L$1"})
/* loaded from: classes3.dex */
public final class W2 extends ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public Y2 f39733a;

    /* renamed from: b, reason: collision with root package name */
    public N2 f39734b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f39735c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Y2 f39736d;

    /* renamed from: e, reason: collision with root package name */
    public int f39737e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public W2(Y2 y22, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f39736d = y22;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f39735c = obj;
        this.f39737e |= Integer.MIN_VALUE;
        return this.f39736d.a((N2) null, (D6) null, this);
    }
}
