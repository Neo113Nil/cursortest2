package g9;

import i9.InterfaceC4537b;
import javax.inject.Provider;
import m9.InterfaceC5569e;
import q9.InterfaceC6129a;

/* loaded from: classes2.dex */
public final class v implements InterfaceC4537b {

    /* renamed from: a, reason: collision with root package name */
    public final Provider f47221a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider f47222b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider f47223c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider f47224d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider f47225e;

    public v(Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5) {
        this.f47221a = provider;
        this.f47222b = provider2;
        this.f47223c = provider3;
        this.f47224d = provider4;
        this.f47225e = provider5;
    }

    public static v a(Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5) {
        return new v(provider, provider2, provider3, provider4, provider5);
    }

    public static t c(InterfaceC6129a interfaceC6129a, InterfaceC6129a interfaceC6129a2, InterfaceC5569e interfaceC5569e, n9.r rVar, n9.v vVar) {
        return new t(interfaceC6129a, interfaceC6129a2, interfaceC5569e, rVar, vVar);
    }

    @Override // javax.inject.Provider
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public t get() {
        return c((InterfaceC6129a) this.f47221a.get(), (InterfaceC6129a) this.f47222b.get(), (InterfaceC5569e) this.f47223c.get(), (n9.r) this.f47224d.get(), (n9.v) this.f47225e.get());
    }
}
