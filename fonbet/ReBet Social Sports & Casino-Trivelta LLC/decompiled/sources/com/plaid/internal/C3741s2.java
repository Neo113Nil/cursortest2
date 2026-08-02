package com.plaid.internal;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@DebugMetadata(c = "com.plaid.internal.workflow.LinkController", f = "LinkController.kt", i = {0, 0, 1, 1, 2, 2, 3, 3, 4, 4, 5, 5}, l = {108, 112, 115, 116, 119, EnumC3631g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE, 125}, m = "storeStateAndNavigate", n = {"this", "nextState", "this", "nextState", "this", "nextState", "this", "nextState", "this", "nextState", "this", "nextState"}, s = {"L$0", "L$1", "L$0", "L$1", "L$0", "L$1", "L$0", "L$1", "L$0", "L$1", "L$0", "L$1"})
/* renamed from: com.plaid.internal.s2, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3741s2 extends ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public Object f41045a;

    /* renamed from: b, reason: collision with root package name */
    public N2 f41046b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f41047c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C3750t2 f41048d;

    /* renamed from: e, reason: collision with root package name */
    public int f41049e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3741s2(C3750t2 c3750t2, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f41048d = c3750t2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f41047c = obj;
        this.f41049e |= Integer.MIN_VALUE;
        return this.f41048d.a((N2) null, this);
    }
}
