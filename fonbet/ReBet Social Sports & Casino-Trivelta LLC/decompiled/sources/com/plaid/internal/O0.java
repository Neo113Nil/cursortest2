package com.plaid.internal;

import kotlin.Result;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@DebugMetadata(c = "com.plaid.internal.views.EmbeddedUrlService", f = "EmbeddedUrlService.kt", i = {}, l = {35}, m = "fetchEmbeddedUrlFromWorkflowStart-gIAlu-s$link_sdk_release", n = {}, s = {})
/* loaded from: classes3.dex */
public final class O0 extends ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f39470a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ P0 f39471b;

    /* renamed from: c, reason: collision with root package name */
    public int f39472c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public O0(P0 p02, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f39471b = p02;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f39470a = obj;
        this.f39472c |= Integer.MIN_VALUE;
        Object a10 = this.f39471b.a(null, this);
        return a10 == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? a10 : Result.m146boximpl(a10);
    }
}
