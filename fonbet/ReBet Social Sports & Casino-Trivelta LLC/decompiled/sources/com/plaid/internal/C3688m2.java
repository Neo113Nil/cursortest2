package com.plaid.internal;

import java.util.LinkedHashMap;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@DebugMetadata(c = "com.plaid.internal.workflow.LinkController", f = "LinkController.kt", i = {}, l = {98}, m = "handleSessionHandoff", n = {}, s = {})
/* renamed from: com.plaid.internal.m2, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3688m2 extends ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f40792a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C3750t2 f40793b;

    /* renamed from: c, reason: collision with root package name */
    public int f40794c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3688m2(C3750t2 c3750t2, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f40793b = c3750t2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f40792a = obj;
        this.f40794c |= Integer.MIN_VALUE;
        return this.f40793b.a((LinkedHashMap) null, this);
    }
}
