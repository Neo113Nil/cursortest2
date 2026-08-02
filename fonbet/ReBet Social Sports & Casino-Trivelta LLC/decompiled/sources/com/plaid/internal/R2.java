package com.plaid.internal;

import java.util.List;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@DebugMetadata(c = "com.plaid.internal.workflow.LinkStateReducer", f = "LinkStateReducer.kt", i = {0, 0, 0, 0}, l = {395, 410}, m = "exitFromCurrentState", n = {"this", "state", "continuationToken", "backstack"}, s = {"L$0", "L$1", "L$2", "L$3"})
/* loaded from: classes3.dex */
public final class R2 extends ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public Y2 f39576a;

    /* renamed from: b, reason: collision with root package name */
    public N2 f39577b;

    /* renamed from: c, reason: collision with root package name */
    public String f39578c;

    /* renamed from: d, reason: collision with root package name */
    public List f39579d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f39580e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Y2 f39581f;

    /* renamed from: g, reason: collision with root package name */
    public int f39582g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public R2(Y2 y22, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f39581f = y22;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f39580e = obj;
        this.f39582g |= Integer.MIN_VALUE;
        return this.f39581f.a(null, this);
    }
}
