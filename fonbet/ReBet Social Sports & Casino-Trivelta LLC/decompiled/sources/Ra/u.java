package Ra;

import Ra.u;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* loaded from: classes3.dex */
public abstract class u {

    public static class a implements t, Serializable {
        private static final long serialVersionUID = 0;

        /* renamed from: a, reason: collision with root package name */
        public transient Object f10159a = new Object();

        /* renamed from: b, reason: collision with root package name */
        public final t f10160b;

        /* renamed from: c, reason: collision with root package name */
        public volatile transient boolean f10161c;

        /* renamed from: d, reason: collision with root package name */
        public transient Object f10162d;

        public a(t tVar) {
            this.f10160b = (t) n.k(tVar);
        }

        private void readObject(ObjectInputStream objectInputStream) {
            objectInputStream.defaultReadObject();
            this.f10159a = new Object();
        }

        @Override // Ra.t
        public Object get() {
            if (!this.f10161c) {
                synchronized (this.f10159a) {
                    try {
                        if (!this.f10161c) {
                            Object obj = this.f10160b.get();
                            this.f10162d = obj;
                            this.f10161c = true;
                            return obj;
                        }
                    } finally {
                    }
                }
            }
            return i.a(this.f10162d);
        }

        public String toString() {
            Object obj;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Suppliers.memoize(");
            if (this.f10161c) {
                obj = "<supplier that returned " + this.f10162d + ">";
            } else {
                obj = this.f10160b;
            }
            sb2.append(obj);
            sb2.append(")");
            return sb2.toString();
        }
    }

    public static class b implements t {

        /* renamed from: d, reason: collision with root package name */
        public static final t f10163d = new t() { // from class: Ra.v
            @Override // Ra.t
            public final Object get() {
                return u.b.a();
            }
        };

        /* renamed from: a, reason: collision with root package name */
        public final Object f10164a = new Object();

        /* renamed from: b, reason: collision with root package name */
        public volatile t f10165b;

        /* renamed from: c, reason: collision with root package name */
        public Object f10166c;

        public b(t tVar) {
            this.f10165b = (t) n.k(tVar);
        }

        public static /* synthetic */ Void a() {
            throw new IllegalStateException();
        }

        @Override // Ra.t
        public Object get() {
            t tVar = this.f10165b;
            t tVar2 = f10163d;
            if (tVar != tVar2) {
                synchronized (this.f10164a) {
                    try {
                        if (this.f10165b != tVar2) {
                            Object obj = this.f10165b.get();
                            this.f10166c = obj;
                            this.f10165b = tVar2;
                            return obj;
                        }
                    } finally {
                    }
                }
            }
            return i.a(this.f10166c);
        }

        public String toString() {
            Object obj = this.f10165b;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Suppliers.memoize(");
            if (obj == f10163d) {
                obj = "<supplier that returned " + this.f10166c + ">";
            }
            sb2.append(obj);
            sb2.append(")");
            return sb2.toString();
        }
    }

    public static class c implements t, Serializable {
        private static final long serialVersionUID = 0;

        /* renamed from: a, reason: collision with root package name */
        public final Object f10167a;

        public c(Object obj) {
            this.f10167a = obj;
        }

        public boolean equals(Object obj) {
            if (obj instanceof c) {
                return j.a(this.f10167a, ((c) obj).f10167a);
            }
            return false;
        }

        @Override // Ra.t
        public Object get() {
            return this.f10167a;
        }

        public int hashCode() {
            return j.b(this.f10167a);
        }

        public String toString() {
            return "Suppliers.ofInstance(" + this.f10167a + ")";
        }
    }

    public static t a(t tVar) {
        return !(tVar instanceof b) ? tVar instanceof a ? tVar : tVar instanceof Serializable ? new a(tVar) : new b(tVar) : tVar;
    }

    public static t b(Object obj) {
        return new c(obj);
    }
}
