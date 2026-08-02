package o9;

import i9.InterfaceC4537b;
import javax.inject.Provider;
import q9.InterfaceC6129a;

/* loaded from: classes2.dex */
public final class N implements InterfaceC4537b {

    /* renamed from: a, reason: collision with root package name */
    public final Provider f59506a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider f59507b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider f59508c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider f59509d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider f59510e;

    public N(Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5) {
        this.f59506a = provider;
        this.f59507b = provider2;
        this.f59508c = provider3;
        this.f59509d = provider4;
        this.f59510e = provider5;
    }

    public static N a(Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5) {
        return new N(provider, provider2, provider3, provider4, provider5);
    }

    public static M c(InterfaceC6129a interfaceC6129a, InterfaceC6129a interfaceC6129a2, Object obj, Object obj2, Provider provider) {
        return new M(interfaceC6129a, interfaceC6129a2, (AbstractC5843e) obj, (U) obj2, provider);
    }

    @Override // javax.inject.Provider
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public M get() {
        return c((InterfaceC6129a) this.f59506a.get(), (InterfaceC6129a) this.f59507b.get(), this.f59508c.get(), this.f59509d.get(), this.f59510e);
    }
}
