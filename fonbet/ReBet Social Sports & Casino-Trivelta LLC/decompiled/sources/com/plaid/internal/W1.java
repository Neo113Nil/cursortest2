package com.plaid.internal;

import javax.inject.Provider;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class W1 implements Gg.b {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<E5> f39731a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<C3691m5> f39732b;

    public W1(I1 i12, Provider<E5> provider, Provider<C3691m5> provider2) {
        this.f39731a = provider;
        this.f39732b = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        E5 retrofitFactory = this.f39731a.get();
        C3691m5 plaidEnvironmentStore = this.f39732b.get();
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
        Object create = retrofitFactory.a(str, new G5(null, 3)).create(InterfaceC3639g7.class);
        Intrinsics.checkNotNullExpressionValue(create, "create(...)");
        return (InterfaceC3639g7) Gg.d.d((InterfaceC3639g7) create);
    }
}
