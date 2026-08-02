package z30;

import We.E;
import kotlin.jvm.internal.Intrinsics;
import retrofit2.Retrofit;
import retrofit2.converter.moshi.MoshiConverterFactory;
import z30.j;

/* loaded from: classes3.dex */
public final class h implements Jb.e<Retrofit> {

    /* renamed from: a, reason: collision with root package name */
    private final Pc.a<ru.ozon.fintech.settings.domain.a> f107218a;

    /* renamed from: b, reason: collision with root package name */
    private final Pc.a<E> f107219b;

    public h(Pc.a<ru.ozon.fintech.settings.domain.a> aVar, Pc.a<E> aVar2) {
        this.f107218a = aVar;
        this.f107219b = aVar2;
    }

    @Override // Pc.a
    public final Object get() {
        ru.ozon.fintech.settings.domain.a fintechSettings = (ru.ozon.fintech.settings.domain.a) ((j.c) this.f107218a).get();
        E okHttpClient = (E) ((j.d) this.f107219b).get();
        Intrinsics.checkNotNullParameter(fintechSettings, "fintechSettings");
        Intrinsics.checkNotNullParameter(okHttpClient, "okHttpClient");
        Retrofit build = new Retrofit.Builder().baseUrl(fintechSettings.e() + "/").client(okHttpClient).addConverterFactory(MoshiConverterFactory.create()).build();
        Intrinsics.checkNotNullExpressionValue(build, "build(...)");
        Jb.j.d(build);
        return build;
    }
}
