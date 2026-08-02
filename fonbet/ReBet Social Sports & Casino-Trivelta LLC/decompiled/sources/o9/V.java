package o9;

import android.content.Context;
import i9.InterfaceC4537b;
import javax.inject.Provider;

/* loaded from: classes2.dex */
public final class V implements InterfaceC4537b {

    /* renamed from: a, reason: collision with root package name */
    public final Provider f59521a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider f59522b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider f59523c;

    public V(Provider provider, Provider provider2, Provider provider3) {
        this.f59521a = provider;
        this.f59522b = provider2;
        this.f59523c = provider3;
    }

    public static V a(Provider provider, Provider provider2, Provider provider3) {
        return new V(provider, provider2, provider3);
    }

    public static U c(Context context, String str, int i10) {
        return new U(context, str, i10);
    }

    @Override // javax.inject.Provider
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public U get() {
        return c((Context) this.f59521a.get(), (String) this.f59522b.get(), ((Integer) this.f59523c.get()).intValue());
    }
}
