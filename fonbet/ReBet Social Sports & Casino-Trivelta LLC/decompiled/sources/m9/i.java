package m9;

import android.content.Context;
import i9.InterfaceC4537b;
import javax.inject.Provider;
import n9.AbstractC5681f;
import n9.x;
import o9.InterfaceC5842d;
import q9.InterfaceC6129a;

/* loaded from: classes2.dex */
public final class i implements InterfaceC4537b {

    /* renamed from: a, reason: collision with root package name */
    public final Provider f56409a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider f56410b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider f56411c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider f56412d;

    public i(Provider provider, Provider provider2, Provider provider3, Provider provider4) {
        this.f56409a = provider;
        this.f56410b = provider2;
        this.f56411c = provider3;
        this.f56412d = provider4;
    }

    public static i a(Provider provider, Provider provider2, Provider provider3, Provider provider4) {
        return new i(provider, provider2, provider3, provider4);
    }

    public static x c(Context context, InterfaceC5842d interfaceC5842d, AbstractC5681f abstractC5681f, InterfaceC6129a interfaceC6129a) {
        return (x) i9.d.c(h.a(context, interfaceC5842d, abstractC5681f, interfaceC6129a), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // javax.inject.Provider
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public x get() {
        return c((Context) this.f56409a.get(), (InterfaceC5842d) this.f56410b.get(), (AbstractC5681f) this.f56411c.get(), (InterfaceC6129a) this.f56412d.get());
    }
}
