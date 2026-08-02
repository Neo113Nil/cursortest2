package n8;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import y8.InterfaceC10861a;

/* loaded from: classes.dex */
final class x implements InterfaceC8452b {

    /* renamed from: a, reason: collision with root package name */
    private final Set<w<?>> f76620a;

    /* renamed from: b, reason: collision with root package name */
    private final Set<w<?>> f76621b;

    /* renamed from: c, reason: collision with root package name */
    private final Set<w<?>> f76622c;

    /* renamed from: d, reason: collision with root package name */
    private final Set<w<?>> f76623d;

    /* renamed from: e, reason: collision with root package name */
    private final Set<w<?>> f76624e;

    /* renamed from: f, reason: collision with root package name */
    private final Set<Class<?>> f76625f;

    /* renamed from: g, reason: collision with root package name */
    private final InterfaceC8452b f76626g;

    /* loaded from: classes9.dex */
    private static class a implements v8.c {

        /* renamed from: a, reason: collision with root package name */
        private final Set<Class<?>> f76627a;

        /* renamed from: b, reason: collision with root package name */
        private final v8.c f76628b;

        public a(Set<Class<?>> set, v8.c cVar) {
            this.f76627a = set;
            this.f76628b = cVar;
        }
    }

    x(C8451a<?> c8451a, InterfaceC8452b interfaceC8452b) {
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        HashSet hashSet4 = new HashSet();
        HashSet hashSet5 = new HashSet();
        for (n nVar : c8451a.e()) {
            if (nVar.c()) {
                if (nVar.e()) {
                    hashSet4.add(nVar.a());
                } else {
                    hashSet.add(nVar.a());
                }
            } else if (nVar.b()) {
                hashSet3.add(nVar.a());
            } else if (nVar.e()) {
                hashSet5.add(nVar.a());
            } else {
                hashSet2.add(nVar.a());
            }
        }
        if (!c8451a.i().isEmpty()) {
            hashSet.add(w.a(v8.c.class));
        }
        this.f76620a = Collections.unmodifiableSet(hashSet);
        this.f76621b = Collections.unmodifiableSet(hashSet2);
        this.f76622c = Collections.unmodifiableSet(hashSet3);
        this.f76623d = Collections.unmodifiableSet(hashSet4);
        this.f76624e = Collections.unmodifiableSet(hashSet5);
        this.f76625f = c8451a.i();
        this.f76626g = interfaceC8452b;
    }

    @Override // n8.InterfaceC8452b
    public final <T> T a(Class<T> cls) {
        if (this.f76620a.contains(w.a(cls))) {
            T t2 = (T) this.f76626g.a(cls);
            return !cls.equals(v8.c.class) ? t2 : (T) new a(this.f76625f, (v8.c) t2);
        }
        throw new Wf.a("Attempting to request an undeclared dependency " + cls + ".");
    }

    @Override // n8.InterfaceC8452b
    public final <T> InterfaceC10861a<T> b(w<T> wVar) {
        if (this.f76621b.contains(wVar)) {
            return this.f76626g.b(wVar);
        }
        throw new Wf.a("Attempting to request an undeclared dependency Provider<" + wVar + ">.");
    }

    @Override // n8.InterfaceC8452b
    public final <T> Set<T> c(w<T> wVar) {
        if (this.f76623d.contains(wVar)) {
            return this.f76626g.c(wVar);
        }
        throw new Wf.a("Attempting to request an undeclared dependency Set<" + wVar + ">.");
    }

    @Override // n8.InterfaceC8452b
    public final <T> InterfaceC10861a<T> d(Class<T> cls) {
        return b(w.a(cls));
    }

    @Override // n8.InterfaceC8452b
    public final <T> T e(w<T> wVar) {
        if (this.f76620a.contains(wVar)) {
            return (T) this.f76626g.e(wVar);
        }
        throw new Wf.a("Attempting to request an undeclared dependency " + wVar + ".");
    }

    @Override // n8.InterfaceC8452b
    public final <T> InterfaceC10861a<Set<T>> f(w<T> wVar) {
        if (this.f76624e.contains(wVar)) {
            return this.f76626g.f(wVar);
        }
        throw new Wf.a("Attempting to request an undeclared dependency Provider<Set<" + wVar + ">>.");
    }
}
