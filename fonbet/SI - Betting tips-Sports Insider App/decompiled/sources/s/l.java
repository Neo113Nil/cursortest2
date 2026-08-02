package s;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import s7.u;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public class l {

    /* renamed from: a, reason: collision with root package name */
    public final int f22567a;

    /* renamed from: b, reason: collision with root package name */
    public final e3.i f22568b;

    /* renamed from: c, reason: collision with root package name */
    public final u f22569c;

    /* renamed from: d, reason: collision with root package name */
    public int f22570d;

    /* renamed from: e, reason: collision with root package name */
    public int f22571e;

    /* renamed from: f, reason: collision with root package name */
    public int f22572f;

    public l(int i5) {
        this.f22567a = i5;
        if (i5 <= 0) {
            t.a.c("maxSize <= 0");
            throw null;
        }
        this.f22568b = new e3.i(4);
        this.f22569c = new u(16);
    }

    public static void e(Object key, Object value) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
    }

    public Object a(Object key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return null;
    }

    public void b(boolean z5, Object key, Object oldValue, Object obj) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(oldValue, "oldValue");
    }

    public final Object c(Object key) {
        Object value;
        Intrinsics.checkNotNullParameter(key, "key");
        synchronized (this.f22569c) {
            e3.i iVar = this.f22568b;
            iVar.getClass();
            Intrinsics.checkNotNullParameter(key, "key");
            Object obj = iVar.f8523a.get(key);
            if (obj != null) {
                this.f22571e++;
                return obj;
            }
            this.f22572f++;
            Object value2 = a(key);
            if (value2 == null) {
                return null;
            }
            synchronized (this.f22569c) {
                try {
                    e3.i iVar2 = this.f22568b;
                    iVar2.getClass();
                    Intrinsics.checkNotNullParameter(key, "key");
                    Intrinsics.checkNotNullParameter(value2, "value");
                    value = iVar2.f8523a.put(key, value2);
                    if (value != null) {
                        e3.i iVar3 = this.f22568b;
                        iVar3.getClass();
                        Intrinsics.checkNotNullParameter(key, "key");
                        Intrinsics.checkNotNullParameter(value, "value");
                        iVar3.f8523a.put(key, value);
                    } else {
                        int i5 = this.f22570d;
                        e(key, value2);
                        this.f22570d = i5 + 1;
                        Unit unit = Unit.f19194a;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            if (value != null) {
                b(false, key, value2, value);
                return value;
            }
            f(this.f22567a);
            return value2;
        }
    }

    public final Object d(Object key, Object value) {
        Object put;
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        synchronized (this.f22569c) {
            try {
                int i5 = this.f22570d;
                e(key, value);
                this.f22570d = i5 + 1;
                e3.i iVar = this.f22568b;
                iVar.getClass();
                Intrinsics.checkNotNullParameter(key, "key");
                Intrinsics.checkNotNullParameter(value, "value");
                put = iVar.f8523a.put(key, value);
                if (put != null) {
                    int i10 = this.f22570d;
                    e(key, put);
                    this.f22570d = i10 - 1;
                }
                Unit unit = Unit.f19194a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (put != null) {
            b(false, key, put, value);
        }
        f(this.f22567a);
        return put;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x008c, code lost:
    
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter("LruCache.sizeOf() is reporting inconsistent results!", com.sports.insider.data.repository.room.live.LiveTable.messageColumn);
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0098, code lost:
    
        throw new java.lang.IllegalStateException("LruCache.sizeOf() is reporting inconsistent results!");
     */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0064 A[Catch: all -> 0x0016, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x0016, blocks: (B:4:0x0003, B:6:0x0007, B:8:0x0011, B:16:0x0019, B:18:0x001d, B:20:0x0028, B:22:0x003f, B:26:0x005e, B:28:0x0064, B:34:0x0048, B:35:0x004e, B:37:0x005a, B:12:0x008c, B:13:0x0098), top: B:3:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0062 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void f(int i5) {
        Object next;
        Map.Entry entry;
        Object key;
        Object value;
        while (true) {
            synchronized (this.f22569c) {
                try {
                    if (this.f22570d < 0 || (this.f22568b.f8523a.isEmpty() && this.f22570d != 0)) {
                        break;
                    }
                    if (this.f22570d <= i5 || this.f22568b.f8523a.isEmpty()) {
                        break;
                    }
                    Set entrySet = this.f22568b.f8523a.entrySet();
                    Intrinsics.checkNotNullExpressionValue(entrySet, "<get-entries>(...)");
                    Intrinsics.checkNotNullParameter(entrySet, "<this>");
                    if (entrySet instanceof List) {
                        List list = (List) entrySet;
                        if (list.isEmpty()) {
                            next = null;
                            entry = (Map.Entry) next;
                            if (entry != null) {
                                return;
                            }
                            key = entry.getKey();
                            value = entry.getValue();
                            e3.i iVar = this.f22568b;
                            iVar.getClass();
                            Intrinsics.checkNotNullParameter(key, "key");
                            iVar.f8523a.remove(key);
                            int i10 = this.f22570d;
                            e(key, value);
                            this.f22570d = i10 - 1;
                        } else {
                            next = list.get(0);
                            entry = (Map.Entry) next;
                            if (entry != null) {
                            }
                        }
                    } else {
                        Iterator it = entrySet.iterator();
                        if (it.hasNext()) {
                            next = it.next();
                            entry = (Map.Entry) next;
                            if (entry != null) {
                            }
                        }
                        next = null;
                        entry = (Map.Entry) next;
                        if (entry != null) {
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            b(true, key, value, null);
        }
    }

    public final String toString() {
        String str;
        synchronized (this.f22569c) {
            try {
                int i5 = this.f22571e;
                int i10 = this.f22572f + i5;
                str = "LruCache[maxSize=" + this.f22567a + ",hits=" + this.f22571e + ",misses=" + this.f22572f + ",hitRate=" + (i10 != 0 ? (i5 * 100) / i10 : 0) + "%]";
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return str;
    }
}
