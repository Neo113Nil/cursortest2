package defpackage;

import java.io.EOFException;
import java.io.IOException;
import java.io.StringReader;
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
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicLongArray;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class h9p {
    public static final c9p g = c9p.d;
    public final ThreadLocal a;
    public final ConcurrentHashMap b;
    public final gvo c;
    public final ydp d;
    public final List e;
    public final c9p f;

    public h9p(nbp nbpVar, Map map, c9p c9pVar, boolean z, List list, int i, int i2, List list2) {
        this.a = new ThreadLocal();
        this.b = new ConcurrentHashMap();
        this.c = new gvo(15, map, list2);
        this.f = c9pVar;
        ArrayList arrayList = new ArrayList();
        arrayList.add(a6n.B);
        int i3 = 0;
        int i4 = 1;
        arrayList.add(i == 1 ? rep.c : new pep(0));
        arrayList.add(nbpVar);
        arrayList.addAll(list);
        arrayList.add(a6n.r);
        arrayList.add(a6n.g);
        arrayList.add(a6n.d);
        arrayList.add(a6n.e);
        arrayList.add(a6n.f);
        nfp nfpVar = a6n.k;
        arrayList.add(new z4n(Long.TYPE, Long.class, nfpVar));
        arrayList.add(new z4n(Double.TYPE, Double.class, z ? a6n.m : new d9p(0)));
        arrayList.add(new z4n(Float.TYPE, Float.class, z ? a6n.l : new d9p(1)));
        arrayList.add(i2 == 2 ? nep.b : new a5n(new nep(i2), i4));
        arrayList.add(a6n.h);
        arrayList.add(a6n.i);
        arrayList.add(new w4n(AtomicLong.class, new f9p(nfpVar, i3).nullSafe(), i3));
        arrayList.add(new w4n(AtomicLongArray.class, new f9p(nfpVar, i4).nullSafe(), i3));
        arrayList.add(a6n.j);
        arrayList.add(a6n.n);
        arrayList.add(a6n.s);
        arrayList.add(a6n.t);
        arrayList.add(new w4n(BigDecimal.class, a6n.o, i3));
        arrayList.add(new w4n(BigInteger.class, a6n.p, i3));
        arrayList.add(new w4n(ybp.class, a6n.q, i3));
        arrayList.add(a6n.u);
        arrayList.add(a6n.v);
        arrayList.add(a6n.x);
        arrayList.add(a6n.y);
        arrayList.add(a6n.A);
        arrayList.add(a6n.w);
        arrayList.add(a6n.b);
        arrayList.add(qdp.c);
        arrayList.add(a6n.z);
        try {
            if (Class.forName("com.google.gson.internal.bind.JavaTimeTypeAdapters").getDeclaredConstructor(null).newInstance(null) == null) {
                throw null;
            }
            throw new ClassCastException();
        } catch (ReflectiveOperationException unused) {
            if (x6n.a) {
                arrayList.add(x6n.c);
                arrayList.add(x6n.b);
                arrayList.add(x6n.d);
            }
            arrayList.add(kdp.c);
            arrayList.add(a6n.a);
            arrayList.add(new ndp(this.c, i3));
            arrayList.add(new ndp(this.c, i4));
            ydp ydpVar = new ydp(this.c);
            this.d = ydpVar;
            arrayList.add(ydpVar);
            arrayList.add(a6n.C);
            arrayList.add(new cfp(this.c, nbpVar, ydpVar, list2));
            this.e = Collections.unmodifiableList(arrayList);
        }
    }

    public static void a(double d) {
        if (Double.isNaN(d) || Double.isInfinite(d)) {
            StringBuilder sb = new StringBuilder(String.valueOf(d).length() + 144);
            sb.append(d);
            sb.append(" is not a valid double value as per JSON specification. To override this behavior, use GsonBuilder.serializeSpecialFloatingPointValues() method.");
            throw new IllegalArgumentException(sb.toString());
        }
    }

    public final map b(z6n z6nVar) {
        boolean z;
        Objects.requireNonNull(z6nVar, "type must not be null");
        ConcurrentHashMap concurrentHashMap = this.b;
        map mapVar = (map) concurrentHashMap.get(z6nVar);
        if (mapVar != null) {
            return mapVar;
        }
        ThreadLocal threadLocal = this.a;
        Map map = (Map) threadLocal.get();
        boolean z2 = false;
        if (map == null) {
            map = new HashMap();
            threadLocal.set(map);
            z = true;
        } else {
            map mapVar2 = (map) map.get(z6nVar);
            if (mapVar2 != null) {
                return mapVar2;
            }
            z = false;
        }
        try {
            g9p g9pVar = new g9p();
            map.put(z6nVar, g9pVar);
            Iterator it = this.e.iterator();
            map mapVar3 = null;
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                mapVar3 = ((nap) it.next()).a(this, z6nVar);
                if (mapVar3 != null) {
                    if (g9pVar.a != null) {
                        throw new AssertionError("Delegate is already set");
                    }
                    g9pVar.a = mapVar3;
                    map.put(z6nVar, mapVar3);
                }
            }
            if (z) {
                threadLocal.remove();
                z2 = true;
            }
            if (mapVar3 == null) {
                a70.p("GSON (2.13.2) cannot handle ".concat(String.valueOf(z6nVar)));
                return null;
            }
            if (z2) {
                concurrentHashMap.putAll(map);
            }
            return mapVar3;
        } catch (Throwable th) {
            if (z) {
                threadLocal.remove();
            }
            throw th;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x005a, code lost:
    
        if (r4 == r8) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0023, code lost:
    
        if (r4 == r8) goto L19;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x006a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final map c(nap napVar, z6n z6nVar) {
        boolean z;
        Objects.requireNonNull(napVar, "skipPast must not be null");
        Objects.requireNonNull(z6nVar, "type must not be null");
        ydp ydpVar = this.d;
        ydpVar.getClass();
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) ydpVar.c;
        if (napVar != ydp.d) {
            Class cls = z6nVar.a;
            nap napVar2 = (nap) concurrentHashMap.get(cls);
            if (napVar2 == null) {
                oap oapVar = (oap) cls.getAnnotation(oap.class);
                if (oapVar != null) {
                    Class zza = oapVar.zza();
                    if (nap.class.isAssignableFrom(zza)) {
                        nap napVar3 = (nap) ((gvo) ydpVar.b).e(new z6n(zza), true).zza();
                        nap napVar4 = (nap) concurrentHashMap.putIfAbsent(cls, napVar3);
                        if (napVar4 != null) {
                            napVar3 = napVar4;
                        }
                    }
                }
            }
            z = false;
            for (nap napVar5 : this.e) {
                if (z) {
                    map a = napVar5.a(this, z6nVar);
                    if (a != null) {
                        return a;
                    }
                } else if (napVar5 == napVar) {
                    z = true;
                }
            }
            if (z) {
                return b(z6nVar);
            }
            a70.p("GSON cannot serialize or deserialize ".concat(String.valueOf(z6nVar)));
            return null;
        }
        napVar = ydpVar;
        z = false;
        while (r0.hasNext()) {
        }
        if (z) {
        }
    }

    public final String d(Object obj) {
        StringBuilder sb = new StringBuilder();
        Class<?> cls = obj.getClass();
        try {
            f7n f7nVar = new f7n(new ihi(2, sb));
            f7nVar.g0(this.f);
            f7nVar.i = true;
            f7nVar.h = 2;
            f7nVar.k = false;
            e(obj, cls, f7nVar);
            return sb.toString();
        } catch (IOException e) {
            throw new o9p(16, e);
        }
    }

    public final void e(Object obj, Class cls, f7n f7nVar) {
        map b = b(new z6n(cls));
        int i = f7nVar.h;
        if (i == 2) {
            f7nVar.h = 1;
        }
        boolean z = f7nVar.i;
        boolean z2 = f7nVar.k;
        f7nVar.i = true;
        f7nVar.k = false;
        try {
            try {
                b.write(f7nVar, obj);
                if (i == 0) {
                    throw null;
                }
                f7nVar.h = i;
                f7nVar.i = z;
                f7nVar.k = z2;
            } catch (IOException e) {
                throw new o9p(16, e);
            } catch (AssertionError e2) {
                String message = e2.getMessage();
                StringBuilder sb = new StringBuilder(String.valueOf(message).length() + 30);
                sb.append("AssertionError (GSON 2.13.2): ");
                sb.append(message);
                throw new AssertionError(sb.toString(), e2);
            }
        } catch (Throwable th) {
            if (i == 0) {
                throw null;
            }
            f7nVar.h = i;
            f7nVar.i = z;
            f7nVar.k = z2;
            throw th;
        }
    }

    public final Object f(String str, z6n z6nVar) {
        Object obj = null;
        if (str == null) {
            return null;
        }
        e7n e7nVar = new e7n(new StringReader(str));
        boolean z = true;
        e7nVar.b = 1;
        try {
            try {
                try {
                    try {
                        e7nVar.Q0();
                        z = false;
                        map b = b(z6nVar);
                        Class cls = z6nVar.a;
                        Object read = b.read(e7nVar);
                        Class cls2 = cls == Integer.TYPE ? Integer.class : cls == Float.TYPE ? Float.class : cls == Byte.TYPE ? Byte.class : cls == Double.TYPE ? Double.class : cls == Long.TYPE ? Long.class : cls == Character.TYPE ? Character.class : cls == Boolean.TYPE ? Boolean.class : cls == Short.TYPE ? Short.class : cls == Void.TYPE ? Void.class : cls;
                        if (read != null && !cls2.isInstance(read)) {
                            String obj2 = b.toString();
                            String valueOf = String.valueOf(cls);
                            String valueOf2 = String.valueOf(read.getClass());
                            StringBuilder sb = new StringBuilder(obj2.length() + 47 + valueOf.length() + 21 + valueOf2.length() + 61);
                            sb.append("Type adapter '");
                            sb.append(obj2);
                            sb.append("' returned wrong type; requested ");
                            sb.append(valueOf);
                            sb.append(" but got instance of ");
                            sb.append(valueOf2);
                            sb.append("\nVerify that the adapter was registered for the correct type.");
                            throw new ClassCastException(sb.toString());
                        }
                        obj = read;
                    } catch (AssertionError e) {
                        String message = e.getMessage();
                        StringBuilder sb2 = new StringBuilder(String.valueOf(message).length() + 30);
                        sb2.append("AssertionError (GSON 2.13.2): ");
                        sb2.append(message);
                        throw new AssertionError(sb2.toString(), e);
                    }
                } catch (IllegalStateException e2) {
                    throw new o9p(16, e2);
                }
            } catch (EOFException e3) {
                if (!z) {
                    throw new o9p(16, e3);
                }
            } catch (IOException e4) {
                throw new o9p(16, e4);
            }
            e7nVar.b = 2;
            if (obj != null) {
                try {
                    if (e7nVar.Q0() != 10) {
                        throw new o9p("JSON document was not fully consumed.", 16);
                    }
                } catch (g7n e5) {
                    throw new o9p(16, e5);
                } catch (IOException e6) {
                    throw new o9p(16, e6);
                }
            }
            return obj;
        } catch (Throwable th) {
            e7nVar.b = 2;
            throw th;
        }
    }

    public final String toString() {
        String valueOf = String.valueOf(this.e);
        String obj = ((Map) this.c.b).toString();
        StringBuilder sb = new StringBuilder(valueOf.length() + 50 + obj.length() + 1);
        bf3.v(sb, "{serializeNulls:false,factories:", valueOf, ",instanceCreators:", obj);
        sb.append("}");
        return sb.toString();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public h9p() {
        this(r1, r2, g, false, r5, 1, 2, r5);
        nbp nbpVar = nbp.c;
        Map map = Collections.EMPTY_MAP;
        List list = Collections.EMPTY_LIST;
    }
}
