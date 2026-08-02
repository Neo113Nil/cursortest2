package com.plaid.internal;

import java.util.List;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@DebugMetadata(c = "com.plaid.internal.workflow.LinkStateReducer", f = "LinkStateReducer.kt", i = {0, 0, 0, 0}, l = {EnumC3631g.SDK_ASSET_ILLUSTRATION_INSTITUTION_BRUSHSTROKE_VALUE, EnumC3631g.SDK_ASSET_ILLUSTRATION_CURSOR_POINTER_VALUE}, m = "next", n = {"this", "state", "backstack", "continuationToken"}, s = {"L$0", "L$1", "L$2", "L$3"})
/* loaded from: classes3.dex */
public final class T2 extends ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public Y2 f39631a;

    /* renamed from: b, reason: collision with root package name */
    public N2 f39632b;

    /* renamed from: c, reason: collision with root package name */
    public List f39633c;

    /* renamed from: d, reason: collision with root package name */
    public String f39634d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f39635e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Y2 f39636f;

    /* renamed from: g, reason: collision with root package name */
    public int f39637g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public T2(Y2 y22, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f39636f = y22;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f39635e = obj;
        this.f39637g |= Integer.MIN_VALUE;
        return this.f39636f.a((N2) null, (List) null, this);
    }
}
