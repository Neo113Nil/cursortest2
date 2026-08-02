package h9;

import android.content.Context;
import i9.InterfaceC4537b;
import javax.inject.Provider;
import q9.InterfaceC6129a;

/* loaded from: classes2.dex */
public final class j implements InterfaceC4537b {

    /* renamed from: a, reason: collision with root package name */
    public final Provider f47842a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider f47843b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider f47844c;

    public j(Provider provider, Provider provider2, Provider provider3) {
        this.f47842a = provider;
        this.f47843b = provider2;
        this.f47844c = provider3;
    }

    public static j a(Provider provider, Provider provider2, Provider provider3) {
        return new j(provider, provider2, provider3);
    }

    public static i c(Context context, InterfaceC6129a interfaceC6129a, InterfaceC6129a interfaceC6129a2) {
        return new i(context, interfaceC6129a, interfaceC6129a2);
    }

    @Override // javax.inject.Provider
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public i get() {
        return c((Context) this.f47842a.get(), (InterfaceC6129a) this.f47843b.get(), (InterfaceC6129a) this.f47844c.get());
    }
}
