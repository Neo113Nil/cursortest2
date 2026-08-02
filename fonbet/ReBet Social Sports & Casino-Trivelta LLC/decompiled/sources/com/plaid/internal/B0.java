package com.plaid.internal;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@DebugMetadata(c = "com.plaid.internal.workflow.DestinationFactory", f = "DestinationFactory.kt", i = {0, 0, 0}, l = {63}, m = "create", n = {"this", "state", "paneId"}, s = {"L$0", "L$1", "L$2"})
/* loaded from: classes3.dex */
public final class B0 extends ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public A0 f39167a;

    /* renamed from: b, reason: collision with root package name */
    public N2 f39168b;

    /* renamed from: c, reason: collision with root package name */
    public r8 f39169c;

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f39170d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ A0 f39171e;

    /* renamed from: f, reason: collision with root package name */
    public int f39172f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public B0(A0 a02, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f39171e = a02;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f39170d = obj;
        this.f39172f |= Integer.MIN_VALUE;
        return this.f39171e.a((N2) null, this);
    }
}
