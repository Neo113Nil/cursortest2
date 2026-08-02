package com.plaid.internal;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@DebugMetadata(c = "com.plaid.internal.sna.TwilioAuthController", f = "TwilioAuthController.kt", i = {0, 0}, l = {25, 42}, m = "asyncAuthentication", n = {"this", "twilioSnaRequest"}, s = {"L$0", "L$1"})
/* renamed from: com.plaid.internal.r7, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3737r7 extends ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public C3755t7 f41031a;

    /* renamed from: b, reason: collision with root package name */
    public C3764u7 f41032b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f41033c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C3755t7 f41034d;

    /* renamed from: e, reason: collision with root package name */
    public int f41035e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3737r7(C3755t7 c3755t7, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f41034d = c3755t7;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f41033c = obj;
        this.f41035e |= Integer.MIN_VALUE;
        return this.f41034d.a(null, this);
    }
}
