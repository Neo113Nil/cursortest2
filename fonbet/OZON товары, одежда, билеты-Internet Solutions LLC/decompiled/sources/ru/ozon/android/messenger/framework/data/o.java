package ru.ozon.android.messenger.framework.data;

import We.E;
import kotlin.jvm.internal.Intrinsics;
import retrofit2.Retrofit;
import retrofit2.converter.moshi.MoshiConverterFactory;
import ru.ozon.android.messenger.framework.core.initialization.d;

/* loaded from: classes10.dex */
public final class o implements Jb.e<Retrofit> {

    /* renamed from: a, reason: collision with root package name */
    private final Jb.f f87647a;

    /* renamed from: b, reason: collision with root package name */
    private final Pa0.b f87648b;

    /* renamed from: c, reason: collision with root package name */
    private final Jb.f f87649c;

    public o(Jb.f fVar, Pa0.b bVar, Jb.f fVar2) {
        this.f87647a = fVar;
        this.f87648b = bVar;
        this.f87649c = fVar2;
    }

    public static Retrofit a(E okHttpClient, MoshiConverterFactory moshiConverterFactory, d.f networkConfig) {
        Intrinsics.checkNotNullParameter(okHttpClient, "okHttpClient");
        Intrinsics.checkNotNullParameter(moshiConverterFactory, "moshiConverterFactory");
        Intrinsics.checkNotNullParameter(networkConfig, "networkConfig");
        Retrofit build = new Retrofit.Builder().addConverterFactory(moshiConverterFactory).client(okHttpClient).baseUrl(networkConfig.b()).build();
        Intrinsics.checkNotNullExpressionValue(build, "build(...)");
        Jb.j.d(build);
        return build;
    }

    @Override // Pc.a
    public final Object get() {
        return a((E) this.f87647a.get(), (MoshiConverterFactory) this.f87648b.get(), (d.f) this.f87649c.get());
    }
}
