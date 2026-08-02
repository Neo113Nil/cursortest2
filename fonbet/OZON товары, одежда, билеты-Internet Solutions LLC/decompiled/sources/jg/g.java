package jg;

import ig.C7073b;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInput;
import java.io.ObjectStreamException;
import java.util.Arrays;
import java.util.Locale;
import java.util.ServiceConfigurationError;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes10.dex */
public abstract class g implements Comparable<g> {

    /* renamed from: a, reason: collision with root package name */
    private static final ConcurrentHashMap<String, g> f70011a = new ConcurrentHashMap<>();

    /* renamed from: b, reason: collision with root package name */
    private static final ConcurrentHashMap<String, g> f70012b = new ConcurrentHashMap<>();

    static {
        try {
            Locale.class.getMethod("getUnicodeLocaleType", String.class);
        } catch (Throwable unused) {
        }
    }

    protected g() {
    }

    public static g g(mg.e eVar) {
        lg.c.e(eVar, "temporal");
        g gVar = (g) eVar.d(mg.i.a());
        return gVar != null ? gVar : l.f70047c;
    }

    static g l(ObjectInput objectInput) throws IOException {
        String readUTF = objectInput.readUTF();
        ConcurrentHashMap<String, g> concurrentHashMap = f70011a;
        boolean isEmpty = concurrentHashMap.isEmpty();
        ConcurrentHashMap<String, g> concurrentHashMap2 = f70012b;
        if (isEmpty) {
            m(l.f70047c);
            m(u.f70068c);
            m(q.f70062c);
            m(n.f70050d);
            i iVar = i.f70013c;
            m(iVar);
            concurrentHashMap.putIfAbsent("Hijrah", iVar);
            concurrentHashMap2.putIfAbsent("islamic", iVar);
            try {
                for (g gVar : Arrays.asList(new g[0])) {
                    concurrentHashMap.putIfAbsent(gVar.i(), gVar);
                    concurrentHashMap2.putIfAbsent(gVar.h(), gVar);
                }
            } catch (Throwable th2) {
                throw new ServiceConfigurationError(th2.getMessage(), th2);
            }
        }
        g gVar2 = concurrentHashMap.get(readUTF);
        if (gVar2 != null) {
            return gVar2;
        }
        g gVar3 = concurrentHashMap2.get(readUTF);
        if (gVar3 != null) {
            return gVar3;
        }
        throw new C7073b(Nk.a.b("Unknown chronology: ", readUTF));
    }

    private static void m(g gVar) {
        f70011a.putIfAbsent(gVar.i(), gVar);
        f70012b.putIfAbsent(gVar.h(), gVar);
    }

    private Object readResolve() throws ObjectStreamException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new t((byte) 11, this);
    }

    public abstract AbstractC7423b a(mg.e eVar);

    final <D extends AbstractC7423b> D b(mg.d dVar) {
        D d11 = (D) dVar;
        if (equals(d11.L0())) {
            return d11;
        }
        throw new ClassCastException("Chrono mismatch, expected: " + i() + ", actual: " + d11.L0().i());
    }

    @Override // java.lang.Comparable
    public final int compareTo(g gVar) {
        return i().compareTo(gVar.i());
    }

    final <D extends AbstractC7423b> d<D> d(mg.d dVar) {
        d<D> dVar2 = (d) dVar;
        if (equals(dVar2.W0().L0())) {
            return dVar2;
        }
        throw new ClassCastException("Chrono mismatch, required: " + i() + ", supplied: " + dVar2.W0().L0().i());
    }

    final <D extends AbstractC7423b> f<D> e(mg.d dVar) {
        f<D> fVar = (f) dVar;
        if (equals(fVar.a1().L0())) {
            return fVar;
        }
        throw new ClassCastException("Chrono mismatch, required: " + i() + ", supplied: " + fVar.a1().L0().i());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g) && i().compareTo(((g) obj).i()) == 0;
    }

    public abstract h f(int i11);

    public abstract String h();

    public final int hashCode() {
        return getClass().hashCode() ^ i().hashCode();
    }

    public abstract String i();

    public c j(ig.g gVar) {
        try {
            return a(gVar).E0(ig.h.L0(gVar));
        } catch (C7073b e11) {
            throw new C7073b(U7.m.a(ig.g.class, "Unable to obtain ChronoLocalDateTime from TemporalAccessor: "), e11);
        }
    }

    public final String toString() {
        return i();
    }
}
