package com.plaid.internal;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@DebugMetadata(c = "com.plaid.internal.workflow.panes.headlessoauth.HeadlessOAuthViewModel", f = "HeadlessOAuthViewModel.kt", i = {}, l = {67}, m = "doOnStart", n = {}, s = {})
/* renamed from: com.plaid.internal.m1, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3687m1 extends ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f40789a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C3678l1 f40790b;

    /* renamed from: c, reason: collision with root package name */
    public int f40791c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3687m1(C3678l1 c3678l1, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f40790b = c3678l1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f40789a = obj;
        this.f40791c |= Integer.MIN_VALUE;
        return this.f40790b.a(this);
    }
}
