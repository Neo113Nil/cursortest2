package com.plaid.internal;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@DebugMetadata(c = "com.plaid.internal.workflow.panes.headlessoauth.HeadlessOAuthViewModel", f = "HeadlessOAuthViewModel.kt", i = {0, 0}, l = {91}, m = "openLoginUrl", n = {"this", "loginUri"}, s = {"L$0", "L$1"})
/* renamed from: com.plaid.internal.p1, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3714p1 extends ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public C3678l1 f40948a;

    /* renamed from: b, reason: collision with root package name */
    public String f40949b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f40950c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C3678l1 f40951d;

    /* renamed from: e, reason: collision with root package name */
    public int f40952e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3714p1(C3678l1 c3678l1, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f40951d = c3678l1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f40950c = obj;
        this.f40952e |= Integer.MIN_VALUE;
        return C3678l1.a(this.f40951d, (String) null, this);
    }
}
