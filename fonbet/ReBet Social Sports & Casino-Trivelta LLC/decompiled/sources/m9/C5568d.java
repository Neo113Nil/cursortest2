package m9;

import i9.InterfaceC4537b;
import java.util.concurrent.Executor;
import javax.inject.Provider;
import n9.x;
import o9.InterfaceC5842d;
import p9.InterfaceC6058b;

/* renamed from: m9.d, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5568d implements InterfaceC4537b {

    /* renamed from: a, reason: collision with root package name */
    public final Provider f56403a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider f56404b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider f56405c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider f56406d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider f56407e;

    public C5568d(Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5) {
        this.f56403a = provider;
        this.f56404b = provider2;
        this.f56405c = provider3;
        this.f56406d = provider4;
        this.f56407e = provider5;
    }

    public static C5568d a(Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5) {
        return new C5568d(provider, provider2, provider3, provider4, provider5);
    }

    public static C5567c c(Executor executor, h9.e eVar, x xVar, InterfaceC5842d interfaceC5842d, InterfaceC6058b interfaceC6058b) {
        return new C5567c(executor, eVar, xVar, interfaceC5842d, interfaceC6058b);
    }

    @Override // javax.inject.Provider
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public C5567c get() {
        return c((Executor) this.f56403a.get(), (h9.e) this.f56404b.get(), (x) this.f56405c.get(), (InterfaceC5842d) this.f56406d.get(), (InterfaceC6058b) this.f56407e.get());
    }
}
