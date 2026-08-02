package Gg;

import javax.inject.Provider;

/* loaded from: classes4.dex */
public abstract class f {

    public class a implements e {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Provider f3955a;

        public a(Provider provider) {
            this.f3955a = provider;
        }

        @Override // javax.inject.Provider
        public Object get() {
            return this.f3955a.get();
        }
    }

    public static e a(Provider provider) {
        d.b(provider);
        return provider instanceof e ? (e) provider : new a(provider);
    }
}
