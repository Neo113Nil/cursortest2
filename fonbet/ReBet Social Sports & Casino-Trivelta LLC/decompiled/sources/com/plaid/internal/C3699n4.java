package com.plaid.internal;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@DebugMetadata(c = "com.plaid.internal.workflow.OAuthPolling", f = "OAuthPolling.kt", i = {0, 0, 1, 1}, l = {43, 45}, m = "waitForOAuthComplete", n = {"this", "startTime", "this", "startTime"}, s = {"L$0", "J$0", "L$0", "J$0"})
/* renamed from: com.plaid.internal.n4, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3699n4 extends ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public C3708o4 f40848a;

    /* renamed from: b, reason: collision with root package name */
    public long f40849b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f40850c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C3708o4 f40851d;

    /* renamed from: e, reason: collision with root package name */
    public int f40852e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3699n4(C3708o4 c3708o4, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f40851d = c3708o4;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f40850c = obj;
        this.f40852e |= Integer.MIN_VALUE;
        return this.f40851d.a(this);
    }
}
