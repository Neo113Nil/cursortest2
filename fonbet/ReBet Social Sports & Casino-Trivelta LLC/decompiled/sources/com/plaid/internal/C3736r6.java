package com.plaid.internal;

import android.content.Context;
import com.plaid.internal.C3556a6;
import com.plaid.internal.C3736r6;
import com.plaid.internal.F6;
import com.plaid.internal.Y6;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.plaid.internal.r6, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3736r6 {

    /* renamed from: a, reason: collision with root package name */
    public final ExecutorService f41027a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    public final C3720p7 f41028b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    public final C3763u6 f41029c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    public final C3745s6 f41030d;

    public C3736r6(@Nullable Context context, @NotNull InterfaceC3639g7 snaApi) {
        Intrinsics.checkNotNullParameter(snaApi, "snaApi");
        this.f41027a = Executors.newSingleThreadExecutor();
        C3763u6 c3763u6 = new C3763u6(snaApi);
        this.f41029c = c3763u6;
        C3745s6 c3745s6 = new C3745s6(snaApi);
        this.f41030d = c3745s6;
        C3681l4 c3681l4 = new C3681l4(context);
        E0 e02 = new E0(context);
        C3775w0 c3775w0 = new C3775w0(new C3766v0(c3681l4, EnumC3663j4.CELLULAR, new C3711o7(), new C3748t0()));
        C3739s0 c3739s0 = new C3739s0();
        C3720p7 c3720p7 = new C3720p7(new C3703o(new A7(), c3775w0, new C3757u0(), c3763u6, c3739s0, c3745s6), e02);
        Intrinsics.checkNotNullExpressionValue(c3720p7, "build(...)");
        this.f41028b = c3720p7;
    }

    public final void a(@NotNull final C3754t6 proveSnaSessionInfo) {
        Intrinsics.checkNotNullParameter(proveSnaSessionInfo, "proveSnaSessionInfo");
        this.f41027a.submit(new Runnable() { // from class: hc.n
            @Override // java.lang.Runnable
            public final void run() {
                C3736r6.a(C3736r6.this, proveSnaSessionInfo);
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v5, types: [com.plaid.internal.s6] */
    public static final void a(C3736r6 this$0, C3754t6 proveSnaSessionInfo) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(proveSnaSessionInfo, "$proveSnaSessionInfo");
        try {
            F6.a.b(MapsKt.emptyMap(), "ProveSNA - start isAuthenticationPossible");
            this$0.f41028b.b();
            F6.a.b(MapsKt.emptyMap(), "ProveSNA - isAuthenticationPossible success");
            String a10 = proveSnaSessionInfo.a();
            this$0.f41029c.f41122b = a10;
            this$0.f41030d.f41057b = a10;
            try {
                try {
                    F6.a.b(MapsKt.emptyMap(), "ProveSNA - start authenticate");
                    this$0.f41028b.a();
                    C3556a6.a.a(C3556a6.f39823a, "Prove SNA success");
                    F6.a.b(MapsKt.emptyMap(), "ProveSNA - authenticate success");
                    this$0.f41029c.f41122b = null;
                } catch (Throwable th2) {
                    this$0.f41029c.f41122b = null;
                    this$0.f41030d.f41057b = null;
                    throw th2;
                }
            } catch (Exception e10) {
                F6.a.a(MapsKt.mapOf(TuplesKt.to("Exception", e10.toString())), "ProveSNA - authenticate failure");
                Y6.a.a("Prove SNA failure - exception: " + e10);
                this$0.f41029c.f41122b = null;
            }
            this$0 = this$0.f41030d;
            this$0.f41057b = null;
        } catch (Exception e11) {
            F6.a.a(MapsKt.mapOf(TuplesKt.to("Exception", e11.toString())), "ProveSNA - isAuthenticationPossible failure");
            Y6.a.a("Prove SNA authentication is not possible- exception: " + e11);
        }
    }
}
