package com.plaid.internal;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@DebugMetadata(c = "com.plaid.internal.workflow.LinkController", f = "LinkController.kt", i = {0, 1}, l = {56, 56, 58}, m = "previous", n = {"this", "this"}, s = {"L$0", "L$0"})
/* renamed from: com.plaid.internal.p2, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3715p2 extends ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public C3750t2 f40953a;

    /* renamed from: b, reason: collision with root package name */
    public Y2 f40954b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f40955c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C3750t2 f40956d;

    /* renamed from: e, reason: collision with root package name */
    public int f40957e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3715p2(C3750t2 c3750t2, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f40956d = c3750t2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f40955c = obj;
        this.f40957e |= Integer.MIN_VALUE;
        return this.f40956d.a(this);
    }
}
