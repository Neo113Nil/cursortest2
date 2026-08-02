package com.plaid.internal;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@DebugMetadata(c = "com.plaid.internal.workflow.ChannelPolling", f = "ChannelPolling.kt", i = {0, 0, 0, 0, 0, 1, 1, 1, 1, 1}, l = {51, 52}, m = "pollOnChannel", n = {"this", "channelInfo", "pollingCallback", "fetchId", "shouldExitAfterThisPoll", "this", "channelInfo", "pollingCallback", "fetchId", "shouldExitAfterThisPoll"}, s = {"L$0", "L$1", "L$2", "L$3", "Z$0", "L$0", "L$1", "L$2", "L$3", "Z$0"})
/* loaded from: classes3.dex */
public final class E extends ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public F f39212a;

    /* renamed from: b, reason: collision with root package name */
    public A f39213b;

    /* renamed from: c, reason: collision with root package name */
    public G f39214c;

    /* renamed from: d, reason: collision with root package name */
    public String f39215d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f39216e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ Object f39217f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ F f39218g;

    /* renamed from: h, reason: collision with root package name */
    public int f39219h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public E(F f10, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f39218g = f10;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f39217f = obj;
        this.f39219h |= Integer.MIN_VALUE;
        return F.a(this.f39218g, null, null, this);
    }
}
