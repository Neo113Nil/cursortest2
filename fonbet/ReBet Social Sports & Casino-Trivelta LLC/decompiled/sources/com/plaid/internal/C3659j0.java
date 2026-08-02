package com.plaid.internal;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@DebugMetadata(c = "com.plaid.internal.core.crashreporting.internal.CrashWorkManager", f = "CrashWorkManager.kt", i = {0}, l = {30}, m = "storeCrashAndScheduleUpload", n = {"this"}, s = {"L$0"})
/* renamed from: com.plaid.internal.j0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3659j0 extends ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public C3668k0 f40687a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f40688b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C3668k0 f40689c;

    /* renamed from: d, reason: collision with root package name */
    public int f40690d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3659j0(C3668k0 c3668k0, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f40689c = c3668k0;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f40688b = obj;
        this.f40690d |= Integer.MIN_VALUE;
        return this.f40689c.a(null, this);
    }
}
