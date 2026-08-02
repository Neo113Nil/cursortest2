package com.plaid.internal;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@DebugMetadata(c = "com.plaid.internal.link.LinkActivityViewModel", f = "LinkActivityViewModel.kt", i = {}, l = {105}, m = "onBackPressed", n = {}, s = {})
/* renamed from: com.plaid.internal.i2, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3652i2 extends ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f40668a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C3661j2 f40669b;

    /* renamed from: c, reason: collision with root package name */
    public int f40670c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3652i2(C3661j2 c3661j2, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f40669b = c3661j2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f40668a = obj;
        this.f40670c |= Integer.MIN_VALUE;
        return this.f40669b.a(this);
    }
}
