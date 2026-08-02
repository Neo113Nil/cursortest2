package com.plaid.internal;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@DebugMetadata(c = "com.plaid.internal.workflow.persistence.DatabaseBackedPaneStore", f = "DatabaseBackedPaneStore.kt", i = {0, 0}, l = {19}, m = "getPane", n = {"this", "pane"}, s = {"L$0", "L$1"})
/* renamed from: com.plaid.internal.q0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3722q0 extends ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public C3730r0 f40982a;

    /* renamed from: b, reason: collision with root package name */
    public r8 f40983b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f40984c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C3730r0 f40985d;

    /* renamed from: e, reason: collision with root package name */
    public int f40986e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3722q0(C3730r0 c3730r0, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f40985d = c3730r0;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f40984c = obj;
        this.f40986e |= Integer.MIN_VALUE;
        return this.f40985d.a(null, this);
    }
}
