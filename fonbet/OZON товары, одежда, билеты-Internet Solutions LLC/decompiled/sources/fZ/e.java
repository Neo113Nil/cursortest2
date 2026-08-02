package fZ;

import Jb.j;
import We.E;
import com.squareup.moshi.Moshi;
import kotlin.jvm.internal.Intrinsics;
import pf0.i;
import pf0.l;
import retrofit2.Retrofit;
import retrofit2.converter.moshi.MoshiConverterFactory;

/* loaded from: classes7.dex */
public final class e implements Jb.e<Retrofit> {

    /* renamed from: a, reason: collision with root package name */
    private final Jb.f f63042a;

    /* renamed from: b, reason: collision with root package name */
    private final Pc.a<Moshi> f63043b;

    /* renamed from: c, reason: collision with root package name */
    private final Pc.a<E> f63044c;

    /* renamed from: d, reason: collision with root package name */
    private final Pc.a<i> f63045d;

    /* renamed from: e, reason: collision with root package name */
    private final Pc.a<Boolean> f63046e;

    public e(b bVar, Jb.f fVar, Pc.a aVar, Pc.a aVar2, Pc.a aVar3, Pc.a aVar4) {
        this.f63042a = fVar;
        this.f63043b = aVar;
        this.f63044c = aVar2;
        this.f63045d = aVar3;
        this.f63046e = aVar4;
    }

    @Override // Pc.a
    public final Object get() {
        Retrofit.Builder client;
        Retrofit H11;
        XY.d config = (XY.d) this.f63042a.get();
        Moshi moshi = this.f63043b.get();
        E okHttpClient = this.f63044c.get();
        i ozonNetworkConfig = this.f63045d.get();
        boolean booleanValue = this.f63046e.get().booleanValue();
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        Intrinsics.checkNotNullParameter(okHttpClient, "okHttpClient");
        Intrinsics.checkNotNullParameter(ozonNetworkConfig, "ozonNetworkConfig");
        if (booleanValue) {
            l b11 = aZ.e.b();
            client = (b11 == null || (H11 = b11.H(ozonNetworkConfig)) == null) ? null : H11.newBuilder();
            if (client == null) {
                throw new IllegalStateException("Required value was null.");
            }
        } else {
            client = new Retrofit.Builder().baseUrl(config.a().e()).client(okHttpClient);
        }
        Retrofit build = client.addConverterFactory(MoshiConverterFactory.create(moshi)).build();
        Intrinsics.checkNotNullExpressionValue(build, "build(...)");
        j.d(build);
        return build;
    }
}
