package com.google.gson.internal.bind;

import com.google.gson.internal.k;
import com.google.gson.j;
import com.google.gson.reflect.TypeToken;
import com.google.gson.w;
import com.google.gson.x;
import com.google.gson.y;
import java.io.Serializable;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import v.f;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class ObjectTypeAdapter extends x {

    /* renamed from: c, reason: collision with root package name */
    public static final y f6249c = new AnonymousClass1(w.f6375a);

    /* renamed from: a, reason: collision with root package name */
    public final j f6250a;

    /* renamed from: b, reason: collision with root package name */
    public final w f6251b;

    /* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
    /* renamed from: com.google.gson.internal.bind.ObjectTypeAdapter$1, reason: invalid class name */
    class AnonymousClass1 implements y {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ w f6252a;

        public AnonymousClass1(w wVar) {
            this.f6252a = wVar;
        }

        @Override // com.google.gson.y
        public final x a(j jVar, TypeToken typeToken) {
            if (typeToken.getRawType() == Object.class) {
                return new ObjectTypeAdapter(jVar, this.f6252a);
            }
            return null;
        }
    }

    public ObjectTypeAdapter(j jVar, w wVar) {
        this.f6250a = jVar;
        this.f6251b = wVar;
    }

    public static y d(w wVar) {
        return wVar == w.f6375a ? f6249c : new AnonymousClass1(wVar);
    }

    @Override // com.google.gson.x
    public final Object b(r9.a aVar) {
        Object arrayList;
        Serializable arrayList2;
        int i02 = aVar.i0();
        int d10 = f.d(i02);
        if (d10 == 0) {
            aVar.c();
            arrayList = new ArrayList();
        } else if (d10 != 2) {
            arrayList = null;
        } else {
            aVar.k();
            arrayList = new k(true);
        }
        if (arrayList == null) {
            return e(aVar, i02);
        }
        ArrayDeque arrayDeque = new ArrayDeque();
        while (true) {
            if (aVar.C()) {
                String W = arrayList instanceof Map ? aVar.W() : null;
                int i03 = aVar.i0();
                int d11 = f.d(i03);
                if (d11 == 0) {
                    aVar.c();
                    arrayList2 = new ArrayList();
                } else if (d11 != 2) {
                    arrayList2 = null;
                } else {
                    aVar.k();
                    arrayList2 = new k(true);
                }
                boolean z5 = arrayList2 != null;
                if (arrayList2 == null) {
                    arrayList2 = e(aVar, i03);
                }
                if (arrayList instanceof List) {
                    ((List) arrayList).add(arrayList2);
                } else {
                    ((Map) arrayList).put(W, arrayList2);
                }
                if (z5) {
                    arrayDeque.addLast(arrayList);
                    arrayList = arrayList2;
                }
            } else {
                if (arrayList instanceof List) {
                    aVar.t();
                } else {
                    aVar.w();
                }
                if (arrayDeque.isEmpty()) {
                    return arrayList;
                }
                arrayList = arrayDeque.removeLast();
            }
        }
    }

    @Override // com.google.gson.x
    public final void c(r9.b bVar, Object obj) {
        if (obj == null) {
            bVar.C();
            return;
        }
        Class<?> cls = obj.getClass();
        j jVar = this.f6250a;
        jVar.getClass();
        x c2 = jVar.c(TypeToken.get((Class) cls));
        if (!(c2 instanceof ObjectTypeAdapter)) {
            c2.c(bVar, obj);
        } else {
            bVar.n();
            bVar.w();
        }
    }

    public final Serializable e(r9.a aVar, int i5) {
        int d10 = f.d(i5);
        if (d10 == 5) {
            return aVar.f0();
        }
        if (d10 == 6) {
            return this.f6251b.a(aVar);
        }
        if (d10 == 7) {
            return Boolean.valueOf(aVar.N());
        }
        if (d10 != 8) {
            throw new IllegalStateException("Unexpected token: ".concat(r4.k.u(i5)));
        }
        aVar.c0();
        return null;
    }
}
