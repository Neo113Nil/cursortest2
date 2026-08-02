package com.plaid.internal;

import com.facebook.react.uimanager.ViewProps;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@DebugMetadata(c = "com.plaid.internal.workflow.LinkController", f = "LinkController.kt", i = {0, 1}, l = {42, 44, 46}, m = ViewProps.START, n = {"this", "this"}, s = {"L$0", "L$0"})
/* renamed from: com.plaid.internal.r2, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3732r2 extends ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public C3750t2 f41019a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f41020b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C3750t2 f41021c;

    /* renamed from: d, reason: collision with root package name */
    public int f41022d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3732r2(C3750t2 c3750t2, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f41021c = c3750t2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f41020b = obj;
        this.f41022d |= Integer.MIN_VALUE;
        return this.f41021c.b(this);
    }
}
