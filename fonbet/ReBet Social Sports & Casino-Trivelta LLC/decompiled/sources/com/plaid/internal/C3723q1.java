package com.plaid.internal;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@DebugMetadata(c = "com.plaid.internal.workflow.panes.headlessoauth.HeadlessOAuthViewModel", f = "HeadlessOAuthViewModel.kt", i = {0, 0}, l = {97}, m = "pollOAuthResult", n = {"this", "oautStateId"}, s = {"L$0", "L$1"})
/* renamed from: com.plaid.internal.q1, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3723q1 extends ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public C3678l1 f40987a;

    /* renamed from: b, reason: collision with root package name */
    public String f40988b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f40989c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C3678l1 f40990d;

    /* renamed from: e, reason: collision with root package name */
    public int f40991e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3723q1(C3678l1 c3678l1, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f40990d = c3678l1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f40989c = obj;
        this.f40991e |= Integer.MIN_VALUE;
        return C3678l1.b(this.f40990d, null, this);
    }
}
