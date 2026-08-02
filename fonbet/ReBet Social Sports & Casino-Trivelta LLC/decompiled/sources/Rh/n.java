package Rh;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class n {

    /* renamed from: b, reason: collision with root package name */
    public static final b f10366b = new b(null);

    /* renamed from: c, reason: collision with root package name */
    public static final c f10367c = new c();

    /* renamed from: a, reason: collision with root package name */
    public final Object f10368a;

    public static final class a extends c {

        /* renamed from: a, reason: collision with root package name */
        public final Throwable f10369a;

        public a(Throwable th2) {
            this.f10369a = th2;
        }

        public boolean equals(Object obj) {
            return (obj instanceof a) && Intrinsics.areEqual(this.f10369a, ((a) obj).f10369a);
        }

        public int hashCode() {
            Throwable th2 = this.f10369a;
            if (th2 != null) {
                return th2.hashCode();
            }
            return 0;
        }

        @Override // Rh.n.c
        public String toString() {
            return "Closed(" + this.f10369a + ')';
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Object a(Throwable th2) {
            return n.c(new a(th2));
        }

        public final Object b() {
            return n.c(n.f10367c);
        }

        public final Object c(Object obj) {
            return n.c(obj);
        }

        public b() {
        }
    }

    public static class c {
        public String toString() {
            return "Failed";
        }
    }

    public /* synthetic */ n(Object obj) {
        this.f10368a = obj;
    }

    public static final /* synthetic */ n b(Object obj) {
        return new n(obj);
    }

    public static boolean d(Object obj, Object obj2) {
        return (obj2 instanceof n) && Intrinsics.areEqual(obj, ((n) obj2).k());
    }

    public static final Throwable e(Object obj) {
        a aVar = obj instanceof a ? (a) obj : null;
        if (aVar != null) {
            return aVar.f10369a;
        }
        return null;
    }

    public static final Object f(Object obj) {
        if (obj instanceof c) {
            return null;
        }
        return obj;
    }

    public static int g(Object obj) {
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public static final boolean h(Object obj) {
        return obj instanceof a;
    }

    public static final boolean i(Object obj) {
        return !(obj instanceof c);
    }

    public static String j(Object obj) {
        if (obj instanceof a) {
            return ((a) obj).toString();
        }
        return "Value(" + obj + ')';
    }

    public boolean equals(Object obj) {
        return d(this.f10368a, obj);
    }

    public int hashCode() {
        return g(this.f10368a);
    }

    public final /* synthetic */ Object k() {
        return this.f10368a;
    }

    public String toString() {
        return j(this.f10368a);
    }

    public static Object c(Object obj) {
        return obj;
    }
}
