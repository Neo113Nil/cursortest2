package Eb;

import java.util.Iterator;
import java.util.Set;
import mb.C5576c;
import mb.InterfaceC5577d;
import mb.q;

/* loaded from: classes3.dex */
public class c implements i {

    /* renamed from: a, reason: collision with root package name */
    public final String f3029a;

    /* renamed from: b, reason: collision with root package name */
    public final d f3030b;

    public c(Set set, d dVar) {
        this.f3029a = d(set);
        this.f3030b = dVar;
    }

    public static /* synthetic */ i b(InterfaceC5577d interfaceC5577d) {
        return new c(interfaceC5577d.d(f.class), d.a());
    }

    public static C5576c c() {
        return C5576c.c(i.class).b(q.m(f.class)).f(new mb.g() { // from class: Eb.b
            @Override // mb.g
            public final Object a(InterfaceC5577d interfaceC5577d) {
                return c.b(interfaceC5577d);
            }
        }).d();
    }

    public static String d(Set set) {
        StringBuilder sb2 = new StringBuilder();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            f fVar = (f) it.next();
            sb2.append(fVar.b());
            sb2.append('/');
            sb2.append(fVar.c());
            if (it.hasNext()) {
                sb2.append(' ');
            }
        }
        return sb2.toString();
    }

    @Override // Eb.i
    public String a() {
        if (this.f3030b.b().isEmpty()) {
            return this.f3029a;
        }
        return this.f3029a + ' ' + d(this.f3030b.b());
    }
}
