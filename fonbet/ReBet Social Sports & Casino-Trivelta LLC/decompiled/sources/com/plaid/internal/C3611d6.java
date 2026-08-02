package com.plaid.internal;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@DebugMetadata(c = "com.plaid.internal.workflow.preload.PreloadLinkController", f = "PreloadLinkController.kt", i = {0}, l = {113}, m = "getResult", n = {"this"}, s = {"L$0"})
/* renamed from: com.plaid.internal.d6, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3611d6 extends ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public C3674k6 f40558a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f40559b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C3674k6 f40560c;

    /* renamed from: d, reason: collision with root package name */
    public int f40561d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3611d6(C3674k6 c3674k6, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f40560c = c3674k6;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f40559b = obj;
        this.f40561d |= Integer.MIN_VALUE;
        return this.f40560c.a(this);
    }
}
