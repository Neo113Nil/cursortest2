package h9;

import android.content.Context;
import i9.InterfaceC4537b;
import javax.inject.Provider;

/* loaded from: classes2.dex */
public final class l implements InterfaceC4537b {

    /* renamed from: a, reason: collision with root package name */
    public final Provider f47850a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider f47851b;

    public l(Provider provider, Provider provider2) {
        this.f47850a = provider;
        this.f47851b = provider2;
    }

    public static l a(Provider provider, Provider provider2) {
        return new l(provider, provider2);
    }

    public static k c(Context context, Object obj) {
        return new k(context, (i) obj);
    }

    @Override // javax.inject.Provider
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public k get() {
        return c((Context) this.f47850a.get(), this.f47851b.get());
    }
}
