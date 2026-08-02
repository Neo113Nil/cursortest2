package n9;

import i9.InterfaceC4537b;
import java.util.concurrent.Executor;
import javax.inject.Provider;
import o9.InterfaceC5842d;
import p9.InterfaceC6058b;

/* loaded from: classes2.dex */
public final class w implements InterfaceC4537b {

    /* renamed from: a, reason: collision with root package name */
    public final Provider f57149a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider f57150b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider f57151c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider f57152d;

    public w(Provider provider, Provider provider2, Provider provider3, Provider provider4) {
        this.f57149a = provider;
        this.f57150b = provider2;
        this.f57151c = provider3;
        this.f57152d = provider4;
    }

    public static w a(Provider provider, Provider provider2, Provider provider3, Provider provider4) {
        return new w(provider, provider2, provider3, provider4);
    }

    public static v c(Executor executor, InterfaceC5842d interfaceC5842d, x xVar, InterfaceC6058b interfaceC6058b) {
        return new v(executor, interfaceC5842d, xVar, interfaceC6058b);
    }

    @Override // javax.inject.Provider
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public v get() {
        return c((Executor) this.f57149a.get(), (InterfaceC5842d) this.f57150b.get(), (x) this.f57151c.get(), (InterfaceC6058b) this.f57152d.get());
    }
}
