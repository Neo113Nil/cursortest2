package com.plaid.internal;

import android.app.Application;
import com.plaid.internal.Z;
import com.plaid.internal.core.crashreporting.internal.models.SentryProject;
import com.plaid.link.Plaid;
import javax.inject.Provider;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.plaid.internal.s5, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3744s5 implements Gg.b {

    /* renamed from: a, reason: collision with root package name */
    public final Gg.b f41053a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<E5> f41054b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<C3691m5> f41055c;

    public C3744s5(C3727q5 c3727q5, Gg.b bVar, Provider provider, Provider provider2) {
        this.f41053a = bVar;
        this.f41054b = provider;
        this.f41055c = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        Application application = (Application) this.f41053a.get();
        E5 plaidRetrofit = this.f41054b.get();
        C3691m5 plaidGlobalValuesStore = this.f41055c.get();
        Intrinsics.checkNotNullParameter(application, "application");
        Intrinsics.checkNotNullParameter(plaidRetrofit, "plaidRetrofit");
        Intrinsics.checkNotNullParameter(plaidGlobalValuesStore, "plaidGlobalValuesStore");
        return (C3575c5) Gg.d.d(new C3575c5(application, SentryProject.LinkSdk.INSTANCE, Plaid.getVERSION_NAME(), Z.a.f39797a, plaidRetrofit, plaidGlobalValuesStore, new M2(application)));
    }
}
