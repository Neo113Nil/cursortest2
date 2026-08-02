package com.plaid.internal;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@DebugMetadata(c = "com.plaid.internal.workflow.persistence.LinkWorkflowAnalyticsDatabaseBackedStore", f = "LinkWorkflowAnalyticsDatabaseBackedStore.kt", i = {}, l = {25}, m = "retrieveAllEvents", n = {}, s = {})
/* renamed from: com.plaid.internal.y3, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3796y3 extends ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f41203a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C3805z3 f41204b;

    /* renamed from: c, reason: collision with root package name */
    public int f41205c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3796y3(C3805z3 c3805z3, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f41204b = c3805z3;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f41203a = obj;
        this.f41205c |= Integer.MIN_VALUE;
        return this.f41204b.a(this);
    }
}
