package com.plaid.internal;

import android.content.Context;
import android.content.IntentFilter;
import kotlin.jvm.internal.Intrinsics;
import l0.AbstractC5338c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.plaid.internal.f7, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3630f7 extends C3765v {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public final R6 f40610a;

    public C3630f7(@NotNull InterfaceC3621e7 listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f40610a = new R6(EnumC3612d7.SMS_RECEIVER, listener);
    }

    @Override // com.plaid.internal.C3765v
    public final void a(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        A9.b a10 = A9.a.a(context);
        Intrinsics.checkNotNullExpressionValue(a10, "getClient(...)");
        a10.startSmsRetriever();
        AbstractC5338c.registerReceiver(context, this.f40610a, new IntentFilter("com.google.android.gms.auth.api.phone.SMS_RETRIEVED"), 2);
    }

    @Override // com.plaid.internal.C3765v
    public final void b(@Nullable Context context) {
        if (context != null) {
            context.unregisterReceiver(this.f40610a);
        }
    }
}
