package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.AbstractC2147w;
import java.util.Collections;
import java.util.Map;

/* renamed from: androidx.datastore.preferences.protobuf.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C2140o {

    /* renamed from: b, reason: collision with root package name */
    public static volatile C2140o f19546b;

    /* renamed from: c, reason: collision with root package name */
    public static final C2140o f19547c = new C2140o(true);

    /* renamed from: a, reason: collision with root package name */
    public final Map f19548a = Collections.EMPTY_MAP;

    /* renamed from: androidx.datastore.preferences.protobuf.o$a */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final Object f19549a;

        /* renamed from: b, reason: collision with root package name */
        public final int f19550b;

        public a(Object obj, int i10) {
            this.f19549a = obj;
            this.f19550b = i10;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f19549a == aVar.f19549a && this.f19550b == aVar.f19550b;
        }

        public int hashCode() {
            return (System.identityHashCode(this.f19549a) * 65535) + this.f19550b;
        }
    }

    public C2140o(boolean z10) {
    }

    public static C2140o b() {
        C2140o c2140o;
        if (b0.f19462d) {
            return f19547c;
        }
        C2140o c2140o2 = f19546b;
        if (c2140o2 != null) {
            return c2140o2;
        }
        synchronized (C2140o.class) {
            try {
                c2140o = f19546b;
                if (c2140o == null) {
                    c2140o = AbstractC2139n.a();
                    f19546b = c2140o;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return c2140o;
    }

    public AbstractC2147w.c a(P p10, int i10) {
        android.support.v4.media.session.b.a(this.f19548a.get(new a(p10, i10)));
        return null;
    }
}
