package com.google.gson;

import com.google.gson.internal.Excluder;
import com.google.gson.internal.bind.ArrayTypeAdapter;
import com.google.gson.internal.bind.CollectionTypeAdapterFactory;
import com.google.gson.internal.bind.DefaultDateTypeAdapter;
import com.google.gson.internal.bind.JsonAdapterAnnotationTypeAdapterFactory;
import com.google.gson.internal.bind.MapTypeAdapterFactory;
import com.google.gson.internal.bind.NumberTypeAdapter;
import com.google.gson.internal.bind.ObjectTypeAdapter;
import com.google.gson.internal.bind.ReflectiveTypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import j$.util.DesugarCollections;
import j$.util.Objects;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.EOFException;
import java.io.IOException;
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
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicLongArray;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class j {

    /* renamed from: h, reason: collision with root package name */
    public static final i f6361h = i.f6209d;

    /* renamed from: i, reason: collision with root package name */
    public static final a f6362i = h.f6207a;
    public static final s j = w.f6375a;

    /* renamed from: k, reason: collision with root package name */
    public static final t f6363k = w.f6376b;

    /* renamed from: a, reason: collision with root package name */
    public final ThreadLocal f6364a;

    /* renamed from: b, reason: collision with root package name */
    public final ConcurrentHashMap f6365b;

    /* renamed from: c, reason: collision with root package name */
    public final m3.f f6366c;

    /* renamed from: d, reason: collision with root package name */
    public final JsonAdapterAnnotationTypeAdapterFactory f6367d;

    /* renamed from: e, reason: collision with root package name */
    public final List f6368e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f6369f;

    /* renamed from: g, reason: collision with root package name */
    public final i f6370g;

    public j() {
        Excluder excluder = Excluder.f6213c;
        Map map = Collections.EMPTY_MAP;
        List list = Collections.EMPTY_LIST;
        this.f6364a = new ThreadLocal();
        this.f6365b = new ConcurrentHashMap();
        m3.f fVar = new m3.f(9);
        this.f6366c = fVar;
        this.f6369f = true;
        this.f6370g = f6361h;
        ArrayList arrayList = new ArrayList();
        arrayList.add(com.google.gson.internal.bind.e.A);
        arrayList.add(ObjectTypeAdapter.d(j));
        arrayList.add(excluder);
        arrayList.addAll(list);
        arrayList.add(com.google.gson.internal.bind.e.f6302p);
        arrayList.add(com.google.gson.internal.bind.e.f6294g);
        arrayList.add(com.google.gson.internal.bind.e.f6291d);
        arrayList.add(com.google.gson.internal.bind.e.f6292e);
        arrayList.add(com.google.gson.internal.bind.e.f6293f);
        final x xVar = com.google.gson.internal.bind.e.f6297k;
        arrayList.add(com.google.gson.internal.bind.e.b(Long.TYPE, Long.class, xVar));
        arrayList.add(com.google.gson.internal.bind.e.b(Double.TYPE, Double.class, new Gson$1()));
        arrayList.add(com.google.gson.internal.bind.e.b(Float.TYPE, Float.class, new Gson$2()));
        t tVar = w.f6376b;
        t tVar2 = f6363k;
        arrayList.add(tVar2 == tVar ? NumberTypeAdapter.f6246b : NumberTypeAdapter.d(tVar2));
        arrayList.add(com.google.gson.internal.bind.e.f6295h);
        arrayList.add(com.google.gson.internal.bind.e.f6296i);
        arrayList.add(com.google.gson.internal.bind.e.a(AtomicLong.class, new x() { // from class: com.google.gson.Gson$4
            @Override // com.google.gson.x
            public final Object b(r9.a aVar) {
                return new AtomicLong(((Number) x.this.b(aVar)).longValue());
            }

            @Override // com.google.gson.x
            public final void c(r9.b bVar, Object obj) {
                x.this.c(bVar, Long.valueOf(((AtomicLong) obj).get()));
            }
        }.a()));
        arrayList.add(com.google.gson.internal.bind.e.a(AtomicLongArray.class, new x() { // from class: com.google.gson.Gson$5
            @Override // com.google.gson.x
            public final Object b(r9.a aVar) {
                ArrayList arrayList2 = new ArrayList();
                aVar.c();
                while (aVar.C()) {
                    arrayList2.add(Long.valueOf(((Number) x.this.b(aVar)).longValue()));
                }
                aVar.t();
                int size = arrayList2.size();
                AtomicLongArray atomicLongArray = new AtomicLongArray(size);
                for (int i5 = 0; i5 < size; i5++) {
                    atomicLongArray.set(i5, ((Long) arrayList2.get(i5)).longValue());
                }
                return atomicLongArray;
            }

            @Override // com.google.gson.x
            public final void c(r9.b bVar, Object obj) {
                AtomicLongArray atomicLongArray = (AtomicLongArray) obj;
                bVar.k();
                int length = atomicLongArray.length();
                for (int i5 = 0; i5 < length; i5++) {
                    x.this.c(bVar, Long.valueOf(atomicLongArray.get(i5)));
                }
                bVar.t();
            }
        }.a()));
        arrayList.add(com.google.gson.internal.bind.e.j);
        arrayList.add(com.google.gson.internal.bind.e.f6298l);
        arrayList.add(com.google.gson.internal.bind.e.q);
        arrayList.add(com.google.gson.internal.bind.e.f6303r);
        arrayList.add(com.google.gson.internal.bind.e.a(BigDecimal.class, com.google.gson.internal.bind.e.f6299m));
        arrayList.add(com.google.gson.internal.bind.e.a(BigInteger.class, com.google.gson.internal.bind.e.f6300n));
        arrayList.add(com.google.gson.internal.bind.e.a(com.google.gson.internal.g.class, com.google.gson.internal.bind.e.f6301o));
        arrayList.add(com.google.gson.internal.bind.e.f6304s);
        arrayList.add(com.google.gson.internal.bind.e.f6305t);
        arrayList.add(com.google.gson.internal.bind.e.f6307v);
        arrayList.add(com.google.gson.internal.bind.e.f6308w);
        arrayList.add(com.google.gson.internal.bind.e.f6310y);
        arrayList.add(com.google.gson.internal.bind.e.f6306u);
        arrayList.add(com.google.gson.internal.bind.e.f6289b);
        arrayList.add(DefaultDateTypeAdapter.f6231c);
        arrayList.add(com.google.gson.internal.bind.e.f6309x);
        if (com.google.gson.internal.sql.b.f6357a) {
            arrayList.add(com.google.gson.internal.sql.b.f6359c);
            arrayList.add(com.google.gson.internal.sql.b.f6358b);
            arrayList.add(com.google.gson.internal.sql.b.f6360d);
        }
        arrayList.add(ArrayTypeAdapter.f6225c);
        arrayList.add(com.google.gson.internal.bind.e.f6288a);
        arrayList.add(new CollectionTypeAdapterFactory(fVar));
        arrayList.add(new MapTypeAdapterFactory(fVar));
        JsonAdapterAnnotationTypeAdapterFactory jsonAdapterAnnotationTypeAdapterFactory = new JsonAdapterAnnotationTypeAdapterFactory(fVar);
        this.f6367d = jsonAdapterAnnotationTypeAdapterFactory;
        arrayList.add(jsonAdapterAnnotationTypeAdapterFactory);
        arrayList.add(com.google.gson.internal.bind.e.B);
        arrayList.add(new ReflectiveTypeAdapterFactory(fVar, f6362i, excluder, jsonAdapterAnnotationTypeAdapterFactory));
        this.f6368e = DesugarCollections.unmodifiableList(arrayList);
    }

    public static void a(double d10) {
        if (Double.isNaN(d10) || Double.isInfinite(d10)) {
            throw new IllegalArgumentException(d10 + " is not a valid double value as per JSON specification. To override this behavior, use GsonBuilder.serializeSpecialFloatingPointValues() method.");
        }
    }

    public final Object b(Class cls, String str) {
        TypeToken typeToken = TypeToken.get(cls);
        Object obj = null;
        if (str == null) {
            return null;
        }
        r9.a aVar = new r9.a(new StringReader(str));
        aVar.f22332o = 2;
        boolean z5 = true;
        aVar.f22332o = 1;
        try {
            try {
                try {
                    aVar.i0();
                    z5 = false;
                    x c2 = c(typeToken);
                    Object b10 = c2.b(aVar);
                    Class l6 = com.google.gson.internal.e.l(typeToken.getRawType());
                    if (b10 != null && !l6.isInstance(b10)) {
                        throw new ClassCastException("Type adapter '" + c2 + "' returned wrong type; requested " + typeToken.getRawType() + " but got instance of " + b10.getClass() + "\nVerify that the adapter was registered for the correct type.");
                    }
                    aVar.f22332o = 2;
                    obj = b10;
                } catch (AssertionError e7) {
                    throw new AssertionError("AssertionError (GSON 2.13.1): " + e7.getMessage(), e7);
                } catch (IllegalStateException e9) {
                    throw new r(e9);
                }
            } catch (EOFException e10) {
                if (!z5) {
                    throw new r(e10);
                }
                aVar.f22332o = 2;
            } catch (IOException e11) {
                throw new r(e11);
            }
            if (obj != null) {
                try {
                    if (aVar.i0() != 10) {
                        throw new r("JSON document was not fully consumed.");
                    }
                } catch (r9.c e12) {
                    throw new r(e12);
                } catch (IOException e13) {
                    throw new m(e13);
                }
            }
            return obj;
        } catch (Throwable th2) {
            aVar.f22332o = 2;
            throw th2;
        }
    }

    public final x c(TypeToken typeToken) {
        boolean z5;
        Objects.requireNonNull(typeToken, "type must not be null");
        ConcurrentHashMap concurrentHashMap = this.f6365b;
        x xVar = (x) concurrentHashMap.get(typeToken);
        if (xVar != null) {
            return xVar;
        }
        ThreadLocal threadLocal = this.f6364a;
        Map map = (Map) threadLocal.get();
        if (map == null) {
            map = new HashMap();
            threadLocal.set(map);
            z5 = true;
        } else {
            x xVar2 = (x) map.get(typeToken);
            if (xVar2 != null) {
                return xVar2;
            }
            z5 = false;
        }
        try {
            Gson$FutureTypeAdapter gson$FutureTypeAdapter = new Gson$FutureTypeAdapter();
            map.put(typeToken, gson$FutureTypeAdapter);
            Iterator it = this.f6368e.iterator();
            x xVar3 = null;
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                xVar3 = ((y) it.next()).a(this, typeToken);
                if (xVar3 != null) {
                    if (gson$FutureTypeAdapter.f6205a != null) {
                        throw new AssertionError("Delegate is already set");
                    }
                    gson$FutureTypeAdapter.f6205a = xVar3;
                    map.put(typeToken, xVar3);
                }
            }
            if (z5) {
                threadLocal.remove();
            }
            if (xVar3 != null) {
                if (z5) {
                    concurrentHashMap.putAll(map);
                }
                return xVar3;
            }
            throw new IllegalArgumentException("GSON (2.13.1) cannot handle " + typeToken);
        } catch (Throwable th2) {
            if (z5) {
                threadLocal.remove();
            }
            throw th2;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x0057, code lost:
    
        if (r4 == r7) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0023, code lost:
    
        if (r4 == r7) goto L19;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0067  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final x d(y yVar, TypeToken typeToken) {
        boolean z5;
        Objects.requireNonNull(yVar, "skipPast must not be null");
        Objects.requireNonNull(typeToken, "type must not be null");
        JsonAdapterAnnotationTypeAdapterFactory jsonAdapterAnnotationTypeAdapterFactory = this.f6367d;
        jsonAdapterAnnotationTypeAdapterFactory.getClass();
        ConcurrentHashMap concurrentHashMap = jsonAdapterAnnotationTypeAdapterFactory.f6240b;
        if (yVar != JsonAdapterAnnotationTypeAdapterFactory.f6238c) {
            Class rawType = typeToken.getRawType();
            y yVar2 = (y) concurrentHashMap.get(rawType);
            if (yVar2 == null) {
                o9.a aVar = (o9.a) rawType.getAnnotation(o9.a.class);
                if (aVar != null) {
                    Class value = aVar.value();
                    if (y.class.isAssignableFrom(value)) {
                        y yVar3 = (y) jsonAdapterAnnotationTypeAdapterFactory.f6239a.j(TypeToken.get(value), true).d();
                        y yVar4 = (y) concurrentHashMap.putIfAbsent(rawType, yVar3);
                        if (yVar4 != null) {
                            yVar3 = yVar4;
                        }
                    }
                }
            }
            z5 = false;
            for (y yVar5 : this.f6368e) {
                if (z5) {
                    x a7 = yVar5.a(this, typeToken);
                    if (a7 != null) {
                        return a7;
                    }
                } else if (yVar5 == yVar) {
                    z5 = true;
                }
            }
            if (z5) {
                return c(typeToken);
            }
            throw new IllegalArgumentException("GSON cannot serialize or deserialize " + typeToken);
        }
        yVar = jsonAdapterAnnotationTypeAdapterFactory;
        z5 = false;
        while (r0.hasNext()) {
        }
        if (z5) {
        }
    }

    public final r9.b e(Writer writer) {
        r9.b bVar = new r9.b(writer);
        bVar.K(this.f6370g);
        bVar.f22344i = this.f6369f;
        bVar.f22343h = 2;
        bVar.f22345k = false;
        return bVar;
    }

    public final String f(Object obj, Type type) {
        StringWriter stringWriter = new StringWriter();
        try {
            g(obj, type, e(stringWriter));
            return stringWriter.toString();
        } catch (IOException e7) {
            throw new m(e7);
        }
    }

    public final void g(Object obj, Type type, r9.b bVar) {
        x c2 = c(TypeToken.get(type));
        int i5 = bVar.f22343h;
        if (i5 == 2) {
            bVar.f22343h = 1;
        }
        boolean z5 = bVar.f22344i;
        boolean z7 = bVar.f22345k;
        bVar.f22344i = this.f6369f;
        bVar.f22345k = false;
        try {
            try {
                c2.c(bVar, obj);
                if (i5 == 0) {
                    throw null;
                }
                bVar.f22343h = i5;
                bVar.f22344i = z5;
                bVar.f22345k = z7;
            } catch (IOException e7) {
                throw new m(e7);
            } catch (AssertionError e9) {
                throw new AssertionError("AssertionError (GSON 2.13.1): " + e9.getMessage(), e9);
            }
        } catch (Throwable th2) {
            if (i5 == 0) {
                throw null;
            }
            bVar.f22343h = i5;
            bVar.f22344i = z5;
            bVar.f22345k = z7;
            throw th2;
        }
    }

    public final String toString() {
        return "{serializeNulls:false,factories:" + this.f6368e + ",instanceCreators:" + this.f6366c + "}";
    }
}
