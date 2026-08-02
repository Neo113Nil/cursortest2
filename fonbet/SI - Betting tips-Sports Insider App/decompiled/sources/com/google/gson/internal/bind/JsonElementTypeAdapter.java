package com.google.gson.internal.bind;

import com.google.gson.internal.g;
import com.google.gson.internal.h;
import com.google.gson.internal.i;
import com.google.gson.internal.j;
import com.google.gson.l;
import com.google.gson.n;
import com.google.gson.o;
import com.google.gson.q;
import com.google.gson.x;
import java.io.Serializable;
import java.util.ArrayDeque;
import java.util.Iterator;
import r4.k;
import v.f;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
class JsonElementTypeAdapter extends x {

    /* renamed from: a, reason: collision with root package name */
    public static final JsonElementTypeAdapter f6241a = new JsonElementTypeAdapter();

    private JsonElementTypeAdapter() {
    }

    public static l d(r9.a aVar, int i5) {
        int d10 = f.d(i5);
        if (d10 == 5) {
            return new q(aVar.f0());
        }
        if (d10 == 6) {
            return new q(new g(aVar.f0()));
        }
        if (d10 == 7) {
            return new q(Boolean.valueOf(aVar.N()));
        }
        if (d10 != 8) {
            throw new IllegalStateException("Unexpected token: ".concat(k.u(i5)));
        }
        aVar.c0();
        return n.f6372a;
    }

    public static void e(r9.b bVar, l lVar) {
        if (lVar == null || (lVar instanceof n)) {
            bVar.C();
            return;
        }
        boolean z5 = lVar instanceof q;
        if (z5) {
            if (!z5) {
                throw new IllegalStateException("Not a JSON Primitive: " + lVar);
            }
            q qVar = (q) lVar;
            Serializable serializable = qVar.f6374a;
            if (serializable instanceof Number) {
                bVar.U(qVar.b());
                return;
            } else if (serializable instanceof Boolean) {
                bVar.Y(serializable instanceof Boolean ? ((Boolean) serializable).booleanValue() : Boolean.parseBoolean(qVar.c()));
                return;
            } else {
                bVar.W(qVar.c());
                return;
            }
        }
        boolean z7 = lVar instanceof com.google.gson.k;
        if (z7) {
            bVar.k();
            if (!z7) {
                throw new IllegalStateException("Not a JSON Array: " + lVar);
            }
            Iterator it = ((com.google.gson.k) lVar).f6371a.iterator();
            while (it.hasNext()) {
                e(bVar, (l) it.next());
            }
            bVar.t();
            return;
        }
        boolean z10 = lVar instanceof o;
        if (!z10) {
            throw new IllegalArgumentException("Couldn't write " + lVar.getClass());
        }
        bVar.n();
        if (!z10) {
            throw new IllegalStateException("Not a JSON Object: " + lVar);
        }
        Iterator it2 = ((i) ((o) lVar).f6373a.entrySet()).iterator();
        while (((h) it2).hasNext()) {
            j b10 = ((h) it2).b();
            bVar.y((String) b10.getKey());
            e(bVar, (l) b10.getValue());
        }
        bVar.w();
    }

    @Override // com.google.gson.x
    public final Object b(r9.a aVar) {
        l kVar;
        l kVar2;
        int i02 = aVar.i0();
        int d10 = f.d(i02);
        if (d10 == 0) {
            aVar.c();
            kVar = new com.google.gson.k();
        } else if (d10 != 2) {
            kVar = null;
        } else {
            aVar.k();
            kVar = new o();
        }
        if (kVar == null) {
            return d(aVar, i02);
        }
        ArrayDeque arrayDeque = new ArrayDeque();
        while (true) {
            if (aVar.C()) {
                String W = kVar instanceof o ? aVar.W() : null;
                int i03 = aVar.i0();
                int d11 = f.d(i03);
                if (d11 == 0) {
                    aVar.c();
                    kVar2 = new com.google.gson.k();
                } else if (d11 != 2) {
                    kVar2 = null;
                } else {
                    aVar.k();
                    kVar2 = new o();
                }
                boolean z5 = kVar2 != null;
                if (kVar2 == null) {
                    kVar2 = d(aVar, i03);
                }
                if (kVar instanceof com.google.gson.k) {
                    ((com.google.gson.k) kVar).f6371a.add(kVar2);
                } else {
                    ((o) kVar).f6373a.put(W, kVar2);
                }
                if (z5) {
                    arrayDeque.addLast(kVar);
                    kVar = kVar2;
                }
            } else {
                if (kVar instanceof com.google.gson.k) {
                    aVar.t();
                } else {
                    aVar.w();
                }
                if (arrayDeque.isEmpty()) {
                    return kVar;
                }
                kVar = (l) arrayDeque.removeLast();
            }
        }
    }

    @Override // com.google.gson.x
    public final /* bridge */ /* synthetic */ void c(r9.b bVar, Object obj) {
        e(bVar, (l) obj);
    }
}
