package com.plaid.internal;

import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@DebugMetadata(c = "com.plaid.internal.core.crashreporting.internal.implementation.api.SentryCrashApi", f = "SentryCrashApi.kt", i = {0}, l = {55}, m = "sendCrashes", n = {"results"}, s = {"L$0"})
/* loaded from: classes3.dex */
public final class V6 extends ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public ArrayList f39721a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f39722b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ X6 f39723c;

    /* renamed from: d, reason: collision with root package name */
    public int f39724d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public V6(X6 x62, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f39723c = x62;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f39722b = obj;
        this.f39724d |= Integer.MIN_VALUE;
        return this.f39723c.a((List) null, this);
    }
}
