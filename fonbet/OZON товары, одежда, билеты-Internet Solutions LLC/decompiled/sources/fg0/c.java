package fg0;

import We.L;
import retrofit2.Response;
import uf0.InterfaceC10056a;

/* loaded from: classes7.dex */
public final class c implements InterfaceC10056a<Object> {

    /* renamed from: a, reason: collision with root package name */
    private final Object f63419a;

    /* renamed from: b, reason: collision with root package name */
    private final L f63420b;

    /* renamed from: c, reason: collision with root package name */
    private final uf0.b f63421c;

    c(Response<Object> response, L l11, uf0.b bVar) {
        this.f63419a = response.body();
        this.f63420b = l11;
        this.f63421c = bVar;
    }

    @Override // uf0.InterfaceC10056a
    public final L a() {
        return this.f63420b;
    }

    @Override // uf0.InterfaceC10056a
    public final uf0.b b() {
        return this.f63421c;
    }
}
