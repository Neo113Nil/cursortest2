package m9;

import i9.InterfaceC4537b;
import javax.inject.Provider;
import n9.AbstractC5681f;
import q9.InterfaceC6129a;

/* loaded from: classes2.dex */
public final class g implements InterfaceC4537b {

    /* renamed from: a, reason: collision with root package name */
    public final Provider f56408a;

    public g(Provider provider) {
        this.f56408a = provider;
    }

    public static AbstractC5681f a(InterfaceC6129a interfaceC6129a) {
        return (AbstractC5681f) i9.d.c(f.a(interfaceC6129a), "Cannot return null from a non-@Nullable @Provides method");
    }

    public static g b(Provider provider) {
        return new g(provider);
    }

    @Override // javax.inject.Provider
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public AbstractC5681f get() {
        return a((InterfaceC6129a) this.f56408a.get());
    }
}
