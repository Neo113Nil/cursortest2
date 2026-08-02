package com.plaid.internal;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@DebugMetadata(c = "com.plaid.internal.workflow.preload.PreloadLinkController", f = "PreloadLinkController.kt", i = {0, 1}, l = {45, 49, 53}, m = "preloadWorkflow", n = {"this", "this"}, s = {"L$0", "L$0"})
/* renamed from: com.plaid.internal.i6, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3656i6 extends ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public C3674k6 f40679a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f40680b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C3674k6 f40681c;

    /* renamed from: d, reason: collision with root package name */
    public int f40682d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3656i6(C3674k6 c3674k6, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f40681c = c3674k6;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f40680b = obj;
        this.f40682d |= Integer.MIN_VALUE;
        return this.f40681c.b(this);
    }
}
