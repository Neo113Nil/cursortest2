package com.plaid.internal;

import com.plaid.internal.core.crashreporting.internal.models.Crash;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@DebugMetadata(c = "com.plaid.internal.core.crashreporting.internal.implementation.api.SentryCrashApi", f = "SentryCrashApi.kt", i = {}, l = {41}, m = "sendCrash", n = {}, s = {})
/* loaded from: classes3.dex */
public final class U6 extends ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f39669a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ X6 f39670b;

    /* renamed from: c, reason: collision with root package name */
    public int f39671c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public U6(X6 x62, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f39670b = x62;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f39669a = obj;
        this.f39671c |= Integer.MIN_VALUE;
        return this.f39670b.a((Crash) null, this);
    }
}
