package c90;

import android.content.Context;
import android.content.SharedPreferences;
import ru.ozon.fintech.network.domain.ExternalNetworkSettings;

/* loaded from: classes3.dex */
public final class g implements Jb.e<f> {

    /* renamed from: a, reason: collision with root package name */
    private final Pc.a<SharedPreferences> f56847a;

    /* renamed from: b, reason: collision with root package name */
    private final Jb.f f56848b;

    /* renamed from: c, reason: collision with root package name */
    private final Pc.a<Context> f56849c;

    public g(Jb.f fVar, Pc.a aVar, Pc.a aVar2) {
        this.f56847a = aVar;
        this.f56848b = fVar;
        this.f56849c = aVar2;
    }

    @Override // Pc.a
    public final Object get() {
        return new f(this.f56847a.get(), (ExternalNetworkSettings) this.f56848b.get(), this.f56849c.get());
    }
}
