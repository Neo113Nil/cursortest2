package com.plaid.internal;

import Ph.AbstractC1455i;
import Ph.C1452g0;
import Q2.w;
import android.content.Context;
import androidx.work.b;
import com.google.gson.Gson;
import com.plaid.internal.core.crashreporting.internal.CrashUploadWorker;
import com.plaid.internal.core.crashreporting.internal.models.Crash;
import com.plaid.internal.core.crashreporting.internal.models.CrashApiOptions;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.plaid.internal.k0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3668k0 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public final Context f40713a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    public final C3641h0 f40714b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    public final V<?> f40715c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    public final CrashApiOptions f40716d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    public final Gson f40717e;

    public C3668k0(@NotNull Context application, @NotNull C3641h0 crashStorage, @NotNull V<?> crashApiClass, @NotNull CrashApiOptions crashApiOptions) {
        Intrinsics.checkNotNullParameter(application, "application");
        Intrinsics.checkNotNullParameter(crashStorage, "crashStorage");
        Intrinsics.checkNotNullParameter(crashApiClass, "crashApiClass");
        Intrinsics.checkNotNullParameter(crashApiOptions, "crashApiOptions");
        this.f40713a = application;
        this.f40714b = crashStorage;
        this.f40715c = crashApiClass;
        this.f40716d = crashApiOptions;
        this.f40717e = new Gson();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(@NotNull Crash crash, @NotNull ContinuationImpl continuationImpl) {
        C3659j0 c3659j0;
        int i10;
        C3668k0 c3668k0;
        if (continuationImpl instanceof C3659j0) {
            c3659j0 = (C3659j0) continuationImpl;
            int i11 = c3659j0.f40690d;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c3659j0.f40690d = i11 - Integer.MIN_VALUE;
                Object obj = c3659j0.f40688b;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i10 = c3659j0.f40690d;
                if (i10 != 0) {
                    ResultKt.throwOnFailure(obj);
                    c3659j0.f40687a = this;
                    c3659j0.f40690d = 1;
                    Object g10 = AbstractC1455i.g(C1452g0.b(), new C3632g0(this.f40714b, new Crash[]{crash}, null), c3659j0);
                    if (g10 != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                        g10 = Unit.INSTANCE;
                    }
                    if (g10 == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    c3668k0 = this;
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    c3668k0 = c3659j0.f40687a;
                    ResultKt.throwOnFailure(obj);
                }
                c3668k0.getClass();
                androidx.work.b a10 = new b.a().f("crashesApiClass", c3668k0.f40715c.f39696a).f("crashOptions", c3668k0.f40717e.v(c3668k0.f40716d)).a();
                Intrinsics.checkNotNullExpressionValue(a10, "build(...)");
                Q2.L.h(c3668k0.f40713a).b((Q2.w) ((w.a) new w.a(CrashUploadWorker.class).i(a10)).a());
                return Unit.INSTANCE;
            }
        }
        c3659j0 = new C3659j0(this, continuationImpl);
        Object obj2 = c3659j0.f40688b;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i10 = c3659j0.f40690d;
        if (i10 != 0) {
        }
        c3668k0.getClass();
        androidx.work.b a102 = new b.a().f("crashesApiClass", c3668k0.f40715c.f39696a).f("crashOptions", c3668k0.f40717e.v(c3668k0.f40716d)).a();
        Intrinsics.checkNotNullExpressionValue(a102, "build(...)");
        Q2.L.h(c3668k0.f40713a).b((Q2.w) ((w.a) new w.a(CrashUploadWorker.class).i(a102)).a());
        return Unit.INSTANCE;
    }
}
