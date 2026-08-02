package com.google.gson;

import com.google.gson.internal.Excluder;
import com.google.gson.internal.bind.ArrayTypeAdapter;
import com.google.gson.internal.bind.CollectionTypeAdapterFactory;
import com.google.gson.internal.bind.DateTypeAdapter;
import com.google.gson.internal.bind.JsonAdapterAnnotationTypeAdapterFactory;
import com.google.gson.internal.bind.MapTypeAdapterFactory;
import com.google.gson.internal.bind.NumberTypeAdapter;
import com.google.gson.internal.bind.ObjectTypeAdapter;
import com.google.gson.internal.bind.ReflectiveTypeAdapterFactory;
import com.google.gson.internal.bind.SerializationDelegatingTypeAdapter;
import com.google.gson.internal.bind.TypeAdapters;
import com.google.gson.reflect.TypeToken;
import java.io.EOFException;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.io.StringWriter;
import java.io.Writer;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicLongArray;

/* loaded from: classes3.dex */
public final class Gson {

    /* renamed from: A, reason: collision with root package name */
    public static final c f38034A = b.f38070a;

    /* renamed from: B, reason: collision with root package name */
    public static final u f38035B = t.f38337a;

    /* renamed from: C, reason: collision with root package name */
    public static final u f38036C = t.f38338b;

    /* renamed from: z, reason: collision with root package name */
    public static final String f38037z = null;

    /* renamed from: a, reason: collision with root package name */
    public final ThreadLocal f38038a;

    /* renamed from: b, reason: collision with root package name */
    public final ConcurrentMap f38039b;

    /* renamed from: c, reason: collision with root package name */
    public final com.google.gson.internal.c f38040c;

    /* renamed from: d, reason: collision with root package name */
    public final JsonAdapterAnnotationTypeAdapterFactory f38041d;

    /* renamed from: e, reason: collision with root package name */
    public final List f38042e;

    /* renamed from: f, reason: collision with root package name */
    public final Excluder f38043f;

    /* renamed from: g, reason: collision with root package name */
    public final c f38044g;

    /* renamed from: h, reason: collision with root package name */
    public final Map f38045h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f38046i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f38047j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f38048k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f38049l;

    /* renamed from: m, reason: collision with root package name */
    public final boolean f38050m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean f38051n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f38052o;

    /* renamed from: p, reason: collision with root package name */
    public final boolean f38053p;

    /* renamed from: q, reason: collision with root package name */
    public final String f38054q;

    /* renamed from: r, reason: collision with root package name */
    public final int f38055r;

    /* renamed from: s, reason: collision with root package name */
    public final int f38056s;

    /* renamed from: t, reason: collision with root package name */
    public final r f38057t;

    /* renamed from: u, reason: collision with root package name */
    public final List f38058u;

    /* renamed from: v, reason: collision with root package name */
    public final List f38059v;

    /* renamed from: w, reason: collision with root package name */
    public final u f38060w;

    /* renamed from: x, reason: collision with root package name */
    public final u f38061x;

    /* renamed from: y, reason: collision with root package name */
    public final List f38062y;

    public static class FutureTypeAdapter<T> extends SerializationDelegatingTypeAdapter<T> {

        /* renamed from: a, reason: collision with root package name */
        public TypeAdapter f38067a = null;

        private TypeAdapter b() {
            TypeAdapter typeAdapter = this.f38067a;
            if (typeAdapter != null) {
                return typeAdapter;
            }
            throw new IllegalStateException("Adapter for type with cyclic dependency has been used before dependency has been resolved");
        }

        @Override // com.google.gson.internal.bind.SerializationDelegatingTypeAdapter
        public TypeAdapter a() {
            return b();
        }

        public void c(TypeAdapter typeAdapter) {
            if (this.f38067a != null) {
                throw new AssertionError("Delegate is already set");
            }
            this.f38067a = typeAdapter;
        }

        @Override // com.google.gson.TypeAdapter
        public Object read(Jb.a aVar) {
            return b().read(aVar);
        }

        @Override // com.google.gson.TypeAdapter
        public void write(Jb.c cVar, Object obj) {
            b().write(cVar, obj);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Gson() {
        this(r1, r2, r3, false, false, false, true, false, false, false, true, r12, r13, 2, 2, r16, r16, r16, f38035B, f38036C, r16);
        Excluder excluder = Excluder.f38098g;
        c cVar = f38034A;
        Map map = Collections.EMPTY_MAP;
        r rVar = r.f38331a;
        String str = f38037z;
        List list = Collections.EMPTY_LIST;
    }

    public static void a(Object obj, Jb.a aVar) {
        if (obj != null) {
            try {
                if (aVar.Y1() == Jb.b.END_DOCUMENT) {
                } else {
                    throw new q("JSON document was not fully consumed.");
                }
            } catch (Jb.d e10) {
                throw new q(e10);
            } catch (IOException e11) {
                throw new i(e11);
            }
        }
    }

    public static TypeAdapter b(final TypeAdapter typeAdapter) {
        return new TypeAdapter() { // from class: com.google.gson.Gson.4
            @Override // com.google.gson.TypeAdapter
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public AtomicLong read(Jb.a aVar) {
                return new AtomicLong(((Number) TypeAdapter.this.read(aVar)).longValue());
            }

            @Override // com.google.gson.TypeAdapter
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public void write(Jb.c cVar, AtomicLong atomicLong) {
                TypeAdapter.this.write(cVar, Long.valueOf(atomicLong.get()));
            }
        }.nullSafe();
    }

    public static TypeAdapter c(final TypeAdapter typeAdapter) {
        return new TypeAdapter() { // from class: com.google.gson.Gson.5
            @Override // com.google.gson.TypeAdapter
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public AtomicLongArray read(Jb.a aVar) {
                ArrayList arrayList = new ArrayList();
                aVar.p();
                while (aVar.hasNext()) {
                    arrayList.add(Long.valueOf(((Number) TypeAdapter.this.read(aVar)).longValue()));
                }
                aVar.n();
                int size = arrayList.size();
                AtomicLongArray atomicLongArray = new AtomicLongArray(size);
                for (int i10 = 0; i10 < size; i10++) {
                    atomicLongArray.set(i10, ((Long) arrayList.get(i10)).longValue());
                }
                return atomicLongArray;
            }

            @Override // com.google.gson.TypeAdapter
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public void write(Jb.c cVar, AtomicLongArray atomicLongArray) {
                cVar.r();
                int length = atomicLongArray.length();
                for (int i10 = 0; i10 < length; i10++) {
                    TypeAdapter.this.write(cVar, Long.valueOf(atomicLongArray.get(i10)));
                }
                cVar.U();
            }
        }.nullSafe();
    }

    public static void d(double d10) {
        if (Double.isNaN(d10) || Double.isInfinite(d10)) {
            throw new IllegalArgumentException(d10 + " is not a valid double value as per JSON specification. To override this behavior, use GsonBuilder.serializeSpecialFloatingPointValues() method.");
        }
    }

    public static TypeAdapter r(r rVar) {
        return rVar == r.f38331a ? TypeAdapters.f38226t : new TypeAdapter() { // from class: com.google.gson.Gson.3
            @Override // com.google.gson.TypeAdapter
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public Number read(Jb.a aVar) {
                if (aVar.Y1() != Jb.b.NULL) {
                    return Long.valueOf(aVar.nextLong());
                }
                aVar.n1();
                return null;
            }

            @Override // com.google.gson.TypeAdapter
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public void write(Jb.c cVar, Number number) {
                if (number == null) {
                    cVar.T1();
                } else {
                    cVar.k2(number.toString());
                }
            }
        };
    }

    public void A(Object obj, Type type, Appendable appendable) {
        try {
            z(obj, type, t(com.google.gson.internal.l.c(appendable)));
        } catch (IOException e10) {
            throw new i(e10);
        }
    }

    public h B(Object obj) {
        return obj == null ? j.f38328a : C(obj, obj.getClass());
    }

    public h C(Object obj, Type type) {
        com.google.gson.internal.bind.b bVar = new com.google.gson.internal.bind.b();
        z(obj, type, bVar);
        return bVar.n2();
    }

    public final TypeAdapter e(boolean z10) {
        return z10 ? TypeAdapters.f38228v : new TypeAdapter() { // from class: com.google.gson.Gson.1
            @Override // com.google.gson.TypeAdapter
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public Double read(Jb.a aVar) {
                if (aVar.Y1() != Jb.b.NULL) {
                    return Double.valueOf(aVar.nextDouble());
                }
                aVar.n1();
                return null;
            }

            @Override // com.google.gson.TypeAdapter
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public void write(Jb.c cVar, Number number) {
                if (number == null) {
                    cVar.T1();
                    return;
                }
                double doubleValue = number.doubleValue();
                Gson.d(doubleValue);
                cVar.g2(doubleValue);
            }
        };
    }

    public final TypeAdapter f(boolean z10) {
        return z10 ? TypeAdapters.f38227u : new TypeAdapter() { // from class: com.google.gson.Gson.2
            @Override // com.google.gson.TypeAdapter
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public Float read(Jb.a aVar) {
                if (aVar.Y1() != Jb.b.NULL) {
                    return Float.valueOf((float) aVar.nextDouble());
                }
                aVar.n1();
                return null;
            }

            @Override // com.google.gson.TypeAdapter
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public void write(Jb.c cVar, Number number) {
                if (number == null) {
                    cVar.T1();
                    return;
                }
                float floatValue = number.floatValue();
                Gson.d(floatValue);
                if (!(number instanceof Float)) {
                    number = Float.valueOf(floatValue);
                }
                cVar.j2(number);
            }
        };
    }

    public Object g(Jb.a aVar, TypeToken typeToken) {
        boolean w02 = aVar.w0();
        boolean z10 = true;
        aVar.q(true);
        try {
            try {
                try {
                    aVar.Y1();
                    z10 = false;
                    return o(typeToken).read(aVar);
                } catch (AssertionError e10) {
                    throw new AssertionError("AssertionError (GSON 2.10.1): " + e10.getMessage(), e10);
                } catch (IllegalStateException e11) {
                    throw new q(e11);
                }
            } catch (EOFException e12) {
                if (!z10) {
                    throw new q(e12);
                }
                aVar.q(w02);
                return null;
            } catch (IOException e13) {
                throw new q(e13);
            }
        } finally {
            aVar.q(w02);
        }
    }

    public Object h(h hVar, TypeToken typeToken) {
        if (hVar == null) {
            return null;
        }
        return g(new com.google.gson.internal.bind.a(hVar), typeToken);
    }

    public Object i(h hVar, Class cls) {
        return com.google.gson.internal.j.b(cls).cast(h(hVar, TypeToken.get(cls)));
    }

    public Object j(h hVar, Type type) {
        return h(hVar, TypeToken.get(type));
    }

    public Object k(Reader reader, TypeToken typeToken) {
        Jb.a s10 = s(reader);
        Object g10 = g(s10, typeToken);
        a(g10, s10);
        return g10;
    }

    public Object l(String str, TypeToken typeToken) {
        if (str == null) {
            return null;
        }
        return k(new StringReader(str), typeToken);
    }

    public Object m(String str, Class cls) {
        return com.google.gson.internal.j.b(cls).cast(l(str, TypeToken.get(cls)));
    }

    public Object n(String str, Type type) {
        return l(str, TypeToken.get(type));
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0051, code lost:
    
        r2.c(r4);
        r0.put(r7, r4);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public TypeAdapter o(TypeToken typeToken) {
        boolean z10;
        Objects.requireNonNull(typeToken, "type must not be null");
        TypeAdapter typeAdapter = (TypeAdapter) this.f38039b.get(typeToken);
        if (typeAdapter != null) {
            return typeAdapter;
        }
        Map map = (Map) this.f38038a.get();
        if (map == null) {
            map = new HashMap();
            this.f38038a.set(map);
            z10 = true;
        } else {
            TypeAdapter typeAdapter2 = (TypeAdapter) map.get(typeToken);
            if (typeAdapter2 != null) {
                return typeAdapter2;
            }
            z10 = false;
        }
        try {
            FutureTypeAdapter futureTypeAdapter = new FutureTypeAdapter();
            map.put(typeToken, futureTypeAdapter);
            Iterator it = this.f38042e.iterator();
            TypeAdapter typeAdapter3 = null;
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                typeAdapter3 = ((v) it.next()).create(this, typeToken);
                if (typeAdapter3 != null) {
                    break;
                }
            }
            if (typeAdapter3 != null) {
                if (z10) {
                    this.f38039b.putAll(map);
                }
                return typeAdapter3;
            }
            throw new IllegalArgumentException("GSON (2.10.1) cannot handle " + typeToken);
        } finally {
            if (z10) {
                this.f38038a.remove();
            }
        }
    }

    public TypeAdapter p(Class cls) {
        return o(TypeToken.get(cls));
    }

    public TypeAdapter q(v vVar, TypeToken typeToken) {
        if (!this.f38042e.contains(vVar)) {
            vVar = this.f38041d;
        }
        boolean z10 = false;
        for (v vVar2 : this.f38042e) {
            if (z10) {
                TypeAdapter create = vVar2.create(this, typeToken);
                if (create != null) {
                    return create;
                }
            } else if (vVar2 == vVar) {
                z10 = true;
            }
        }
        throw new IllegalArgumentException("GSON cannot serialize " + typeToken);
    }

    public Jb.a s(Reader reader) {
        Jb.a aVar = new Jb.a(reader);
        aVar.q(this.f38051n);
        return aVar;
    }

    public Jb.c t(Writer writer) {
        if (this.f38048k) {
            writer.write(")]}'\n");
        }
        Jb.c cVar = new Jb.c(writer);
        if (this.f38050m) {
            cVar.d2("  ");
        }
        cVar.c2(this.f38049l);
        cVar.q(this.f38051n);
        cVar.e2(this.f38046i);
        return cVar;
    }

    public String toString() {
        return "{serializeNulls:" + this.f38046i + ",factories:" + this.f38042e + ",instanceCreators:" + this.f38040c + "}";
    }

    public String u(h hVar) {
        StringWriter stringWriter = new StringWriter();
        y(hVar, stringWriter);
        return stringWriter.toString();
    }

    public String v(Object obj) {
        return obj == null ? u(j.f38328a) : w(obj, obj.getClass());
    }

    public String w(Object obj, Type type) {
        StringWriter stringWriter = new StringWriter();
        A(obj, type, stringWriter);
        return stringWriter.toString();
    }

    public void x(h hVar, Jb.c cVar) {
        boolean D02 = cVar.D0();
        cVar.q(true);
        boolean A02 = cVar.A0();
        cVar.c2(this.f38049l);
        boolean z02 = cVar.z0();
        cVar.e2(this.f38046i);
        try {
            try {
                com.google.gson.internal.l.b(hVar, cVar);
            } catch (IOException e10) {
                throw new i(e10);
            } catch (AssertionError e11) {
                throw new AssertionError("AssertionError (GSON 2.10.1): " + e11.getMessage(), e11);
            }
        } finally {
            cVar.q(D02);
            cVar.c2(A02);
            cVar.e2(z02);
        }
    }

    public void y(h hVar, Appendable appendable) {
        try {
            x(hVar, t(com.google.gson.internal.l.c(appendable)));
        } catch (IOException e10) {
            throw new i(e10);
        }
    }

    public void z(Object obj, Type type, Jb.c cVar) {
        TypeAdapter o10 = o(TypeToken.get(type));
        boolean D02 = cVar.D0();
        cVar.q(true);
        boolean A02 = cVar.A0();
        cVar.c2(this.f38049l);
        boolean z02 = cVar.z0();
        cVar.e2(this.f38046i);
        try {
            try {
                o10.write(cVar, obj);
            } catch (IOException e10) {
                throw new i(e10);
            } catch (AssertionError e11) {
                throw new AssertionError("AssertionError (GSON 2.10.1): " + e11.getMessage(), e11);
            }
        } finally {
            cVar.q(D02);
            cVar.c2(A02);
            cVar.e2(z02);
        }
    }

    public Gson(Excluder excluder, c cVar, Map map, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, boolean z17, r rVar, String str, int i10, int i11, List list, List list2, List list3, u uVar, u uVar2, List list4) {
        this.f38038a = new ThreadLocal();
        this.f38039b = new ConcurrentHashMap();
        this.f38043f = excluder;
        this.f38044g = cVar;
        this.f38045h = map;
        com.google.gson.internal.c cVar2 = new com.google.gson.internal.c(map, z17, list4);
        this.f38040c = cVar2;
        this.f38046i = z10;
        this.f38047j = z11;
        this.f38048k = z12;
        this.f38049l = z13;
        this.f38050m = z14;
        this.f38051n = z15;
        this.f38052o = z16;
        this.f38053p = z17;
        this.f38057t = rVar;
        this.f38054q = str;
        this.f38055r = i10;
        this.f38056s = i11;
        this.f38058u = list;
        this.f38059v = list2;
        this.f38060w = uVar;
        this.f38061x = uVar2;
        this.f38062y = list4;
        ArrayList arrayList = new ArrayList();
        arrayList.add(TypeAdapters.f38205W);
        arrayList.add(ObjectTypeAdapter.a(uVar));
        arrayList.add(excluder);
        arrayList.addAll(list3);
        arrayList.add(TypeAdapters.f38185C);
        arrayList.add(TypeAdapters.f38219m);
        arrayList.add(TypeAdapters.f38213g);
        arrayList.add(TypeAdapters.f38215i);
        arrayList.add(TypeAdapters.f38217k);
        TypeAdapter r10 = r(rVar);
        arrayList.add(TypeAdapters.c(Long.TYPE, Long.class, r10));
        arrayList.add(TypeAdapters.c(Double.TYPE, Double.class, e(z16)));
        arrayList.add(TypeAdapters.c(Float.TYPE, Float.class, f(z16)));
        arrayList.add(NumberTypeAdapter.a(uVar2));
        arrayList.add(TypeAdapters.f38221o);
        arrayList.add(TypeAdapters.f38223q);
        arrayList.add(TypeAdapters.b(AtomicLong.class, b(r10)));
        arrayList.add(TypeAdapters.b(AtomicLongArray.class, c(r10)));
        arrayList.add(TypeAdapters.f38225s);
        arrayList.add(TypeAdapters.f38230x);
        arrayList.add(TypeAdapters.f38187E);
        arrayList.add(TypeAdapters.f38189G);
        arrayList.add(TypeAdapters.b(BigDecimal.class, TypeAdapters.f38232z));
        arrayList.add(TypeAdapters.b(BigInteger.class, TypeAdapters.f38183A));
        arrayList.add(TypeAdapters.b(com.google.gson.internal.f.class, TypeAdapters.f38184B));
        arrayList.add(TypeAdapters.f38191I);
        arrayList.add(TypeAdapters.f38193K);
        arrayList.add(TypeAdapters.f38197O);
        arrayList.add(TypeAdapters.f38199Q);
        arrayList.add(TypeAdapters.f38203U);
        arrayList.add(TypeAdapters.f38195M);
        arrayList.add(TypeAdapters.f38210d);
        arrayList.add(DateTypeAdapter.f38122b);
        arrayList.add(TypeAdapters.f38201S);
        if (com.google.gson.internal.sql.a.f38322a) {
            arrayList.add(com.google.gson.internal.sql.a.f38326e);
            arrayList.add(com.google.gson.internal.sql.a.f38325d);
            arrayList.add(com.google.gson.internal.sql.a.f38327f);
        }
        arrayList.add(ArrayTypeAdapter.f38116c);
        arrayList.add(TypeAdapters.f38208b);
        arrayList.add(new CollectionTypeAdapterFactory(cVar2));
        arrayList.add(new MapTypeAdapterFactory(cVar2, z11));
        JsonAdapterAnnotationTypeAdapterFactory jsonAdapterAnnotationTypeAdapterFactory = new JsonAdapterAnnotationTypeAdapterFactory(cVar2);
        this.f38041d = jsonAdapterAnnotationTypeAdapterFactory;
        arrayList.add(jsonAdapterAnnotationTypeAdapterFactory);
        arrayList.add(TypeAdapters.f38206X);
        arrayList.add(new ReflectiveTypeAdapterFactory(cVar2, cVar, excluder, jsonAdapterAnnotationTypeAdapterFactory, list4));
        this.f38042e = Collections.unmodifiableList(arrayList);
    }
}
