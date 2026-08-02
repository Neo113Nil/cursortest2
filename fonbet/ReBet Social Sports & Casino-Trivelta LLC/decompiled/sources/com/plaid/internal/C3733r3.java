package com.plaid.internal;

import javax.inject.Provider;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.plaid.internal.r3, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3733r3 implements Gg.b {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<E5> f41023a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<C3691m5> f41024b;

    public C3733r3(C3608d3 c3608d3, Provider<E5> provider, Provider<C3691m5> provider2) {
        this.f41023a = provider;
        this.f41024b = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        E5 retrofitFactory = this.f41023a.get();
        C3691m5 plaidEnvironmentStore = this.f41024b.get();
        Intrinsics.checkNotNullParameter(retrofitFactory, "retrofitFactory");
        Intrinsics.checkNotNullParameter(plaidEnvironmentStore, "plaidEnvironmentStore");
        EnumC3664j5 env = plaidEnvironmentStore.b();
        Intrinsics.checkNotNullParameter(env, "env");
        int i10 = C3673k5.f40731a[env.ordinal()];
        String str = "https://production.plaid.com/";
        if (i10 != 1) {
            if (i10 == 2) {
                str = "https://development.plaid.com/";
            } else if (i10 == 3) {
                str = "https://sandbox.plaid.com/";
            }
        }
        Object create = retrofitFactory.a(str, new G5(null, 3)).create(i8.class);
        Intrinsics.checkNotNullExpressionValue(create, "create(...)");
        return (i8) Gg.d.d((i8) create);
    }
}
