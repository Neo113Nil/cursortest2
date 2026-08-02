package com.plaid.internal;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@DebugMetadata(c = "com.plaid.internal.workflow.LinkController", f = "LinkController.kt", i = {0, 0, 1, 1, 1, 2}, l = {65, 68, 70, 72}, m = "resume", n = {"this", "result", "this", "result", "currentState", "this"}, s = {"L$0", "L$1", "L$0", "L$1", "L$2", "L$0"})
/* renamed from: com.plaid.internal.q2, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3724q2 extends ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public C3750t2 f40992a;

    /* renamed from: b, reason: collision with root package name */
    public D6 f40993b;

    /* renamed from: c, reason: collision with root package name */
    public N2 f40994c;

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f40995d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C3750t2 f40996e;

    /* renamed from: f, reason: collision with root package name */
    public int f40997f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3724q2(C3750t2 c3750t2, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f40996e = c3750t2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f40995d = obj;
        this.f40997f |= Integer.MIN_VALUE;
        return this.f40996e.a((D6) null, this);
    }
}
