package a0;

import d0.AbstractC3983a;
import d0.C3984b;
import java.util.HashMap;
import java.util.LinkedHashSet;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.TypeIntrinsics;

/* renamed from: a0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1906b {

    /* renamed from: a, reason: collision with root package name */
    public final C3984b f14959a = AbstractC3983a.a();

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f14960b;

    /* renamed from: c, reason: collision with root package name */
    public final LinkedHashSet f14961c;

    /* renamed from: d, reason: collision with root package name */
    public int f14962d;

    /* renamed from: e, reason: collision with root package name */
    public int f14963e;

    /* renamed from: f, reason: collision with root package name */
    public int f14964f;

    /* renamed from: g, reason: collision with root package name */
    public int f14965g;

    /* renamed from: h, reason: collision with root package name */
    public int f14966h;

    /* renamed from: i, reason: collision with root package name */
    public int f14967i;

    /* renamed from: j, reason: collision with root package name */
    public int f14968j;

    public C1906b(int i10) {
        if (i10 <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
        this.f14963e = i10;
        this.f14960b = new HashMap(0, 0.75f);
        this.f14961c = new LinkedHashSet();
    }

    public Object b(Object obj) {
        return null;
    }

    public final Object d(Object obj) {
        synchronized (this.f14959a) {
            Object obj2 = this.f14960b.get(obj);
            if (obj2 != null) {
                this.f14961c.remove(obj);
                this.f14961c.add(obj);
                this.f14967i++;
                return obj2;
            }
            this.f14968j++;
            Object b10 = b(obj);
            if (b10 == null) {
                return null;
            }
            synchronized (this.f14959a) {
                try {
                    this.f14965g++;
                    Object put = this.f14960b.put(obj, b10);
                    this.f14961c.remove(obj);
                    this.f14961c.add(obj);
                    if (put != null) {
                        this.f14960b.put(obj, put);
                        obj2 = put;
                    } else {
                        this.f14962d = h() + g(obj, b10);
                    }
                    Unit unit = Unit.INSTANCE;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            if (obj2 != null) {
                c(false, obj, b10, obj2);
                return obj2;
            }
            j(this.f14963e);
            return b10;
        }
    }

    public final Object e(Object obj, Object obj2) {
        Object put;
        if (obj == null || obj2 == null) {
            throw null;
        }
        synchronized (this.f14959a) {
            try {
                this.f14964f++;
                this.f14962d = h() + g(obj, obj2);
                put = this.f14960b.put(obj, obj2);
                if (put != null) {
                    this.f14962d = h() - g(obj, put);
                }
                if (this.f14961c.contains(obj)) {
                    this.f14961c.remove(obj);
                }
                this.f14961c.add(obj);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (put != null) {
            c(false, obj, put, obj2);
        }
        j(this.f14963e);
        return put;
    }

    public final Object f(Object obj) {
        Object remove;
        obj.getClass();
        synchronized (this.f14959a) {
            try {
                remove = this.f14960b.remove(obj);
                this.f14961c.remove(obj);
                if (remove != null) {
                    this.f14962d = h() - g(obj, remove);
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (remove != null) {
            c(false, obj, remove, null);
        }
        return remove;
    }

    public final int g(Object obj, Object obj2) {
        int i10 = i(obj, obj2);
        if (i10 >= 0) {
            return i10;
        }
        throw new IllegalStateException(("Negative size: " + obj + '=' + obj2).toString());
    }

    public final int h() {
        int i10;
        synchronized (this.f14959a) {
            i10 = this.f14962d;
        }
        return i10;
    }

    public int i(Object obj, Object obj2) {
        return 1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0094, code lost:
    
        throw new java.lang.IllegalStateException("map/keySet size inconsistency");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void j(int i10) {
        Object obj;
        Object obj2;
        while (true) {
            synchronized (this.f14959a) {
                try {
                    if (h() >= 0) {
                        if (this.f14960b.isEmpty() && h() != 0) {
                            break;
                        }
                        if (this.f14960b.isEmpty() != this.f14961c.isEmpty()) {
                            break;
                        }
                        if (h() <= i10 || this.f14960b.isEmpty()) {
                            obj = null;
                            obj2 = null;
                        } else {
                            obj = CollectionsKt.first(this.f14961c);
                            obj2 = this.f14960b.get(obj);
                            if (obj2 == null) {
                                throw new IllegalStateException("inconsistent state");
                            }
                            TypeIntrinsics.asMutableMap(this.f14960b).remove(obj);
                            TypeIntrinsics.asMutableCollection(this.f14961c).remove(obj);
                            int h10 = h();
                            Intrinsics.checkNotNull(obj);
                            Intrinsics.checkNotNull(obj2);
                            this.f14962d = h10 - g(obj, obj2);
                            this.f14966h++;
                        }
                        Unit unit = Unit.INSTANCE;
                    } else {
                        break;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            if (obj == null && obj2 == null) {
                return;
            }
            Intrinsics.checkNotNull(obj);
            Intrinsics.checkNotNull(obj2);
            c(true, obj, obj2, null);
        }
    }

    public String toString() {
        String str;
        synchronized (this.f14959a) {
            try {
                int i10 = this.f14967i;
                int i11 = this.f14968j + i10;
                str = "LruCache[maxSize=" + this.f14963e + ",hits=" + this.f14967i + ",misses=" + this.f14968j + ",hitRate=" + (i11 != 0 ? (i10 * 100) / i11 : 0) + "%]";
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return str;
    }

    public void c(boolean z10, Object obj, Object obj2, Object obj3) {
    }
}
