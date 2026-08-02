package mb;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import tb.C6456a;
import tb.InterfaceC6458c;
import wb.InterfaceC6736b;

/* loaded from: classes3.dex */
public final class E implements InterfaceC5577d {

    /* renamed from: a, reason: collision with root package name */
    public final Set f56426a;

    /* renamed from: b, reason: collision with root package name */
    public final Set f56427b;

    /* renamed from: c, reason: collision with root package name */
    public final Set f56428c;

    /* renamed from: d, reason: collision with root package name */
    public final Set f56429d;

    /* renamed from: e, reason: collision with root package name */
    public final Set f56430e;

    /* renamed from: f, reason: collision with root package name */
    public final Set f56431f;

    /* renamed from: g, reason: collision with root package name */
    public final InterfaceC5577d f56432g;

    public static class a implements InterfaceC6458c {

        /* renamed from: a, reason: collision with root package name */
        public final Set f56433a;

        /* renamed from: b, reason: collision with root package name */
        public final InterfaceC6458c f56434b;

        public a(Set set, InterfaceC6458c interfaceC6458c) {
            this.f56433a = set;
            this.f56434b = interfaceC6458c;
        }

        @Override // tb.InterfaceC6458c
        public void b(C6456a c6456a) {
            if (!this.f56433a.contains(c6456a.b())) {
                throw new s(String.format("Attempting to publish an undeclared event %s.", c6456a));
            }
            this.f56434b.b(c6456a);
        }
    }

    public E(C5576c c5576c, InterfaceC5577d interfaceC5577d) {
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        HashSet hashSet4 = new HashSet();
        HashSet hashSet5 = new HashSet();
        for (q qVar : c5576c.g()) {
            if (qVar.d()) {
                if (qVar.f()) {
                    hashSet4.add(qVar.b());
                } else {
                    hashSet.add(qVar.b());
                }
            } else if (qVar.c()) {
                hashSet3.add(qVar.b());
            } else if (qVar.f()) {
                hashSet5.add(qVar.b());
            } else {
                hashSet2.add(qVar.b());
            }
        }
        if (!c5576c.k().isEmpty()) {
            hashSet.add(D.b(InterfaceC6458c.class));
        }
        this.f56426a = Collections.unmodifiableSet(hashSet);
        this.f56427b = Collections.unmodifiableSet(hashSet2);
        this.f56428c = Collections.unmodifiableSet(hashSet3);
        this.f56429d = Collections.unmodifiableSet(hashSet4);
        this.f56430e = Collections.unmodifiableSet(hashSet5);
        this.f56431f = c5576c.k();
        this.f56432g = interfaceC5577d;
    }

    @Override // mb.InterfaceC5577d
    public Object a(Class cls) {
        if (!this.f56426a.contains(D.b(cls))) {
            throw new s(String.format("Attempting to request an undeclared dependency %s.", cls));
        }
        Object a10 = this.f56432g.a(cls);
        return !cls.equals(InterfaceC6458c.class) ? a10 : new a(this.f56431f, (InterfaceC6458c) a10);
    }

    @Override // mb.InterfaceC5577d
    public InterfaceC6736b b(D d10) {
        if (this.f56430e.contains(d10)) {
            return this.f56432g.b(d10);
        }
        throw new s(String.format("Attempting to request an undeclared dependency Provider<Set<%s>>.", d10));
    }

    @Override // mb.InterfaceC5577d
    public Object c(D d10) {
        if (this.f56426a.contains(d10)) {
            return this.f56432g.c(d10);
        }
        throw new s(String.format("Attempting to request an undeclared dependency %s.", d10));
    }

    @Override // mb.InterfaceC5577d
    public Set e(D d10) {
        if (this.f56429d.contains(d10)) {
            return this.f56432g.e(d10);
        }
        throw new s(String.format("Attempting to request an undeclared dependency Set<%s>.", d10));
    }

    @Override // mb.InterfaceC5577d
    public InterfaceC6736b f(Class cls) {
        return g(D.b(cls));
    }

    @Override // mb.InterfaceC5577d
    public InterfaceC6736b g(D d10) {
        if (this.f56427b.contains(d10)) {
            return this.f56432g.g(d10);
        }
        throw new s(String.format("Attempting to request an undeclared dependency Provider<%s>.", d10));
    }
}
