package com.plaid.internal;

import java.util.List;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@DebugMetadata(c = "com.plaid.internal.workflow.LinkStateReducer", f = "LinkStateReducer.kt", i = {0, 0, 0, 2, 2, 2, 2, 2}, l = {346, 351, 358, 385}, m = "previous", n = {"this", "state", "currentPaneId", "this", "state", "currentPaneId", "backstack", "lastPaneId"}, s = {"L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$3", "L$4"})
/* loaded from: classes3.dex */
public final class V2 extends ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public Y2 f39704a;

    /* renamed from: b, reason: collision with root package name */
    public N2 f39705b;

    /* renamed from: c, reason: collision with root package name */
    public r8 f39706c;

    /* renamed from: d, reason: collision with root package name */
    public List f39707d;

    /* renamed from: e, reason: collision with root package name */
    public r8 f39708e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ Object f39709f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Y2 f39710g;

    /* renamed from: h, reason: collision with root package name */
    public int f39711h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public V2(Y2 y22, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f39710g = y22;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f39709f = obj;
        this.f39711h |= Integer.MIN_VALUE;
        return this.f39710g.b(null, this);
    }
}
