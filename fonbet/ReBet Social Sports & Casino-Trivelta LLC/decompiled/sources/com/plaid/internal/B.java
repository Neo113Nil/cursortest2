package com.plaid.internal;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@DebugMetadata(c = "com.plaid.internal.workflow.di.ChannelInfoStore", f = "ChannelInfoStore.kt", i = {0}, l = {25}, m = "readChannelInfo", n = {"this"}, s = {"L$0"})
/* loaded from: classes3.dex */
public final class B extends ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public C f39163a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f39164b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C f39165c;

    /* renamed from: d, reason: collision with root package name */
    public int f39166d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public B(C c10, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f39165c = c10;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f39164b = obj;
        this.f39166d |= Integer.MIN_VALUE;
        return this.f39165c.b(this);
    }
}
