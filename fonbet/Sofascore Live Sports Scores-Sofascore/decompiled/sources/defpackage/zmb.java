package defpackage;

import com.ironsource.C4427z5;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public class zmb {
    public final int a;
    public final l3a b;
    public final uic c;
    public int d;
    public int e;
    public int f;

    public zmb(int i) {
        this.a = i;
        if (i <= 0) {
            a70.p("maxSize <= 0");
            throw null;
        }
        this.b = new l3a(1);
        this.c = new uic(27);
    }

    public Object a(Object obj) {
        obj.getClass();
        return null;
    }

    public void b(Object obj, Object obj2, Object obj3) {
        obj.getClass();
        obj2.getClass();
    }

    public final Object c(Object obj) {
        Object put;
        obj.getClass();
        synchronized (this.c) {
            Object obj2 = this.b.a.get(obj);
            if (obj2 != null) {
                this.e++;
                return obj2;
            }
            this.f++;
            Object a = a(obj);
            if (a == null) {
                return null;
            }
            synchronized (this.c) {
                try {
                    put = this.b.a.put(obj, a);
                    if (put != null) {
                        this.b.a.put(obj, put);
                    } else {
                        this.d += f(obj, a);
                        Unit unit = Unit.a;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (put != null) {
                b(obj, a, put);
                return put;
            }
            h(this.a);
            return a;
        }
    }

    public final Object d(Object obj, Object obj2) {
        Object put;
        obj.getClass();
        obj2.getClass();
        synchronized (this.c) {
            try {
                this.d += f(obj, obj2);
                put = this.b.a.put(obj, obj2);
                if (put != null) {
                    this.d -= f(obj, put);
                }
                Unit unit = Unit.a;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (put != null) {
            b(obj, put, obj2);
        }
        h(this.a);
        return put;
    }

    public final Object e(Object obj) {
        Object remove;
        obj.getClass();
        synchronized (this.c) {
            try {
                remove = this.b.a.remove(obj);
                if (remove != null) {
                    this.d -= f(obj, remove);
                }
                Unit unit = Unit.a;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (remove != null) {
            b(obj, remove, null);
        }
        return remove;
    }

    public final int f(Object obj, Object obj2) {
        int g = g(obj, obj2);
        if (g >= 0) {
            return g;
        }
        throw new IllegalStateException("Negative size: " + obj + C4427z5.U + obj2);
    }

    public int g(Object obj, Object obj2) {
        obj.getClass();
        obj2.getClass();
        return 1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0068, code lost:
    
        throw new java.lang.IllegalStateException("LruCache.sizeOf() is reporting inconsistent results!");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void h(int i) {
        Object key;
        Object value;
        while (true) {
            synchronized (this.c) {
                try {
                    if (this.d < 0 || (this.b.a.isEmpty() && this.d != 0)) {
                        break;
                    }
                    if (this.d <= i || this.b.a.isEmpty()) {
                        break;
                    }
                    Set entrySet = this.b.a.entrySet();
                    entrySet.getClass();
                    Map.Entry entry = (Map.Entry) CollectionsKt.Z(entrySet);
                    if (entry == null) {
                        return;
                    }
                    key = entry.getKey();
                    value = entry.getValue();
                    l3a l3aVar = this.b;
                    key.getClass();
                    l3aVar.a.remove(key);
                    this.d -= f(key, value);
                } catch (Throwable th) {
                    throw th;
                }
            }
            b(key, value, null);
        }
    }

    public final String toString() {
        String str;
        synchronized (this.c) {
            try {
                int i = this.e;
                int i2 = this.f + i;
                str = "LruCache[maxSize=" + this.a + ",hits=" + this.e + ",misses=" + this.f + ",hitRate=" + (i2 != 0 ? (i * 100) / i2 : 0) + "%]";
            } catch (Throwable th) {
                throw th;
            }
        }
        return str;
    }
}
