package com.plaid.internal;

import android.app.Application;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.plaid.internal.l3, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3680l3 implements Gg.b {

    /* renamed from: a, reason: collision with root package name */
    public final Gg.b f40755a;

    public C3680l3(C3608d3 c3608d3, Gg.b bVar) {
        this.f40755a = bVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        Application application = (Application) this.f40755a.get();
        Intrinsics.checkNotNullParameter(application, "application");
        String a10 = N4.f39455a.a(application);
        if (a10 == null) {
            a10 = "";
        }
        return (String) Gg.d.d(a10);
    }
}
