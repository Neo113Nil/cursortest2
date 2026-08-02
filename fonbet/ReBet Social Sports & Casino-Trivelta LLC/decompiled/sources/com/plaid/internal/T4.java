package com.plaid.internal;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@DebugMetadata(c = "com.plaid.internal.globalvalues.PlaidClientSideOnlyConfigurationStore", f = "PlaidClientSideOnlyConfigurationStore.kt", i = {0}, l = {22}, m = "read", n = {"this"}, s = {"L$0"})
/* loaded from: classes3.dex */
public final class T4 extends ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public W4 f39638a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f39639b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ W4 f39640c;

    /* renamed from: d, reason: collision with root package name */
    public int f39641d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public T4(W4 w42, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f39640c = w42;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f39639b = obj;
        this.f39641d |= Integer.MIN_VALUE;
        return this.f39640c.a(this);
    }
}
