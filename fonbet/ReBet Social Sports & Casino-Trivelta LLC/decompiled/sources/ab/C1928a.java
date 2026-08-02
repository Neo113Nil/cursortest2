package ab;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: ab.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1928a {

    /* renamed from: b, reason: collision with root package name */
    public static final C1928a f15108b = a().a();

    /* renamed from: a, reason: collision with root package name */
    public final Map f15109a;

    /* renamed from: ab.a$b */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public HashMap f15110a = new HashMap();

        public C1928a a() {
            if (this.f15110a == null) {
                throw new IllegalStateException("cannot call build() twice");
            }
            C1928a c1928a = new C1928a(Collections.unmodifiableMap(this.f15110a));
            this.f15110a = null;
            return c1928a;
        }
    }

    public static b a() {
        return new b();
    }

    public Map b() {
        return this.f15109a;
    }

    public boolean equals(Object obj) {
        if (obj instanceof C1928a) {
            return this.f15109a.equals(((C1928a) obj).f15109a);
        }
        return false;
    }

    public int hashCode() {
        return this.f15109a.hashCode();
    }

    public String toString() {
        return this.f15109a.toString();
    }

    public C1928a(Map map) {
        this.f15109a = map;
    }
}
