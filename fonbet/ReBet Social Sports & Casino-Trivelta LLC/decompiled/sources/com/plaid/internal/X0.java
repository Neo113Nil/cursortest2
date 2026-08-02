package com.plaid.internal;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Ref;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@DebugMetadata(c = "com.plaid.internal.workflow.network.ExponentialBackoffRetry", f = "ExponentialBackoffRetry.kt", i = {0, 0, 1}, l = {22, 24}, m = "doNetworkCallWithRetries$link_sdk_release", n = {"apiCall", "networkResponse", "networkResponse"}, s = {"L$0", "L$1", "L$0"})
/* loaded from: classes3.dex */
public final class X0<T> extends ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public Object f39756a;

    /* renamed from: b, reason: collision with root package name */
    public Ref.ObjectRef f39757b;

    /* renamed from: c, reason: collision with root package name */
    public Ref.ObjectRef f39758c;

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f39759d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Z0 f39760e;

    /* renamed from: f, reason: collision with root package name */
    public int f39761f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public X0(Z0 z02, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f39760e = z02;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f39759d = obj;
        this.f39761f |= Integer.MIN_VALUE;
        return this.f39760e.a(null, this);
    }
}
