package com.plaid.internal;

import com.facebook.react.uimanager.ViewProps;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@DebugMetadata(c = "com.plaid.internal.workflow.LinkStateReducer", f = "LinkStateReducer.kt", i = {0, 0, 2, 2, 2, 4, 4}, l = {56, 66, 74, 85, 93}, m = ViewProps.START, n = {"this", "state", "this", "state", "isEagerStart", "this", "state"}, s = {"L$0", "L$1", "L$0", "L$1", "Z$0", "L$0", "L$1"})
/* loaded from: classes3.dex */
public final class X2 extends ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public Y2 f39764a;

    /* renamed from: b, reason: collision with root package name */
    public N2 f39765b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f39766c;

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f39767d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Y2 f39768e;

    /* renamed from: f, reason: collision with root package name */
    public int f39769f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public X2(Y2 y22, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f39768e = y22;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f39767d = obj;
        this.f39769f |= Integer.MIN_VALUE;
        return this.f39768e.a((N2) null, false, (ContinuationImpl) this);
    }
}
