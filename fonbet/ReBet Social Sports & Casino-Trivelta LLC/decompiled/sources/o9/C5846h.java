package o9;

import android.content.Context;
import i9.InterfaceC4537b;
import javax.inject.Provider;

/* renamed from: o9.h, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5846h implements InterfaceC4537b {

    /* renamed from: a, reason: collision with root package name */
    public final Provider f59539a;

    public C5846h(Provider provider) {
        this.f59539a = provider;
    }

    public static C5846h a(Provider provider) {
        return new C5846h(provider);
    }

    public static String c(Context context) {
        return (String) i9.d.c(AbstractC5844f.b(context), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // javax.inject.Provider
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public String get() {
        return c((Context) this.f59539a.get());
    }
}
