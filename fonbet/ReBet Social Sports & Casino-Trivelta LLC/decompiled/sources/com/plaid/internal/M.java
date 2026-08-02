package com.plaid.internal;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@DebugMetadata(c = "com.twilio.verify_sna.domain.twilioverifysna.ConcreteTwilioVerifySna", f = "ConcreteTwilioVerifySna.kt", i = {0}, l = {43}, m = "processUrl", n = {"this"}, s = {"L$0"})
/* loaded from: classes3.dex */
public final class M extends ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public N f39353a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f39354b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ N f39355c;

    /* renamed from: d, reason: collision with root package name */
    public int f39356d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public M(N n10, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f39355c = n10;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f39354b = obj;
        this.f39356d |= Integer.MIN_VALUE;
        return this.f39355c.a(null, this);
    }
}
