package n9;

import android.content.Context;
import i9.InterfaceC4537b;
import java.util.concurrent.Executor;
import javax.inject.Provider;
import o9.InterfaceC5841c;
import o9.InterfaceC5842d;
import p9.InterfaceC6058b;
import q9.InterfaceC6129a;

/* loaded from: classes2.dex */
public final class s implements InterfaceC4537b {

    /* renamed from: a, reason: collision with root package name */
    public final Provider f57134a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider f57135b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider f57136c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider f57137d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider f57138e;

    /* renamed from: f, reason: collision with root package name */
    public final Provider f57139f;

    /* renamed from: g, reason: collision with root package name */
    public final Provider f57140g;

    /* renamed from: h, reason: collision with root package name */
    public final Provider f57141h;

    /* renamed from: i, reason: collision with root package name */
    public final Provider f57142i;

    public s(Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6, Provider provider7, Provider provider8, Provider provider9) {
        this.f57134a = provider;
        this.f57135b = provider2;
        this.f57136c = provider3;
        this.f57137d = provider4;
        this.f57138e = provider5;
        this.f57139f = provider6;
        this.f57140g = provider7;
        this.f57141h = provider8;
        this.f57142i = provider9;
    }

    public static s a(Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6, Provider provider7, Provider provider8, Provider provider9) {
        return new s(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9);
    }

    public static r c(Context context, h9.e eVar, InterfaceC5842d interfaceC5842d, x xVar, Executor executor, InterfaceC6058b interfaceC6058b, InterfaceC6129a interfaceC6129a, InterfaceC6129a interfaceC6129a2, InterfaceC5841c interfaceC5841c) {
        return new r(context, eVar, interfaceC5842d, xVar, executor, interfaceC6058b, interfaceC6129a, interfaceC6129a2, interfaceC5841c);
    }

    @Override // javax.inject.Provider
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public r get() {
        return c((Context) this.f57134a.get(), (h9.e) this.f57135b.get(), (InterfaceC5842d) this.f57136c.get(), (x) this.f57137d.get(), (Executor) this.f57138e.get(), (InterfaceC6058b) this.f57139f.get(), (InterfaceC6129a) this.f57140g.get(), (InterfaceC6129a) this.f57141h.get(), (InterfaceC5841c) this.f57142i.get());
    }
}
