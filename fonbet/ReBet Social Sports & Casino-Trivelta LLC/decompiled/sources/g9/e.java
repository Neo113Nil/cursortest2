package g9;

import android.content.Context;
import g9.u;
import i9.C4536a;
import i9.C4538c;
import i9.InterfaceC4537b;
import javax.inject.Provider;
import m9.C5568d;
import n9.w;
import o9.C5845g;
import o9.C5846h;
import o9.C5847i;
import o9.C5848j;
import o9.InterfaceC5842d;
import o9.N;
import o9.V;
import q9.C6131c;

/* loaded from: classes2.dex */
public final class e extends u {

    /* renamed from: a, reason: collision with root package name */
    public Provider f47189a;

    /* renamed from: b, reason: collision with root package name */
    public Provider f47190b;

    /* renamed from: c, reason: collision with root package name */
    public Provider f47191c;

    /* renamed from: d, reason: collision with root package name */
    public Provider f47192d;

    /* renamed from: e, reason: collision with root package name */
    public Provider f47193e;

    /* renamed from: f, reason: collision with root package name */
    public Provider f47194f;

    /* renamed from: g, reason: collision with root package name */
    public Provider f47195g;

    /* renamed from: h, reason: collision with root package name */
    public Provider f47196h;

    /* renamed from: i, reason: collision with root package name */
    public Provider f47197i;

    /* renamed from: j, reason: collision with root package name */
    public Provider f47198j;

    /* renamed from: k, reason: collision with root package name */
    public Provider f47199k;

    /* renamed from: l, reason: collision with root package name */
    public Provider f47200l;

    /* renamed from: m, reason: collision with root package name */
    public Provider f47201m;

    public static final class b implements u.a {

        /* renamed from: a, reason: collision with root package name */
        public Context f47202a;

        public b() {
        }

        @Override // g9.u.a
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public b a(Context context) {
            this.f47202a = (Context) i9.d.b(context);
            return this;
        }

        @Override // g9.u.a
        public u build() {
            i9.d.a(this.f47202a, Context.class);
            return new e(this.f47202a);
        }
    }

    public static u.a r() {
        return new b();
    }

    public final void B(Context context) {
        this.f47189a = C4536a.a(k.a());
        InterfaceC4537b a10 = C4538c.a(context);
        this.f47190b = a10;
        h9.j a11 = h9.j.a(a10, C6131c.a(), q9.d.a());
        this.f47191c = a11;
        this.f47192d = C4536a.a(h9.l.a(this.f47190b, a11));
        this.f47193e = V.a(this.f47190b, C5845g.a(), C5847i.a());
        this.f47194f = C4536a.a(C5846h.a(this.f47190b));
        this.f47195g = C4536a.a(N.a(C6131c.a(), q9.d.a(), C5848j.a(), this.f47193e, this.f47194f));
        m9.g b10 = m9.g.b(C6131c.a());
        this.f47196h = b10;
        m9.i a12 = m9.i.a(this.f47190b, this.f47195g, b10, q9.d.a());
        this.f47197i = a12;
        Provider provider = this.f47189a;
        Provider provider2 = this.f47192d;
        Provider provider3 = this.f47195g;
        this.f47198j = C5568d.a(provider, provider2, a12, provider3, provider3);
        Provider provider4 = this.f47190b;
        Provider provider5 = this.f47192d;
        Provider provider6 = this.f47195g;
        this.f47199k = n9.s.a(provider4, provider5, provider6, this.f47197i, this.f47189a, provider6, C6131c.a(), q9.d.a(), this.f47195g);
        Provider provider7 = this.f47189a;
        Provider provider8 = this.f47195g;
        this.f47200l = w.a(provider7, provider8, this.f47197i, provider8);
        this.f47201m = C4536a.a(v.a(C6131c.a(), q9.d.a(), this.f47198j, this.f47199k, this.f47200l));
    }

    @Override // g9.u
    public InterfaceC5842d d() {
        return (InterfaceC5842d) this.f47195g.get();
    }

    @Override // g9.u
    public t k() {
        return (t) this.f47201m.get();
    }

    public e(Context context) {
        B(context);
    }
}
