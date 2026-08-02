package ng;

import ig.q;
import java.io.Serializable;
import java.util.Collections;
import java.util.List;

/* loaded from: classes10.dex */
public abstract class f {

    static final class a extends f implements Serializable {

        /* renamed from: a, reason: collision with root package name */
        private final q f77134a;

        a(q qVar) {
            this.f77134a = qVar;
        }

        @Override // ng.f
        public final q a(ig.e eVar) {
            return this.f77134a;
        }

        @Override // ng.f
        public final d b(ig.g gVar) {
            return null;
        }

        @Override // ng.f
        public final List<q> d(ig.g gVar) {
            return Collections.singletonList(this.f77134a);
        }

        @Override // ng.f
        public final boolean e(ig.e eVar) {
            return false;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            boolean z11 = obj instanceof a;
            q qVar = this.f77134a;
            if (z11) {
                return qVar.equals(((a) obj).f77134a);
            }
            if (obj instanceof b) {
                b bVar = (b) obj;
                if (bVar.f() && qVar.equals(bVar.a(ig.e.f66405d))) {
                    return true;
                }
            }
            return false;
        }

        @Override // ng.f
        public final boolean f() {
            return true;
        }

        @Override // ng.f
        public final boolean g(ig.g gVar, q qVar) {
            return this.f77134a.equals(qVar);
        }

        public final int hashCode() {
            q qVar = this.f77134a;
            return ((qVar.hashCode() + 31) ^ (qVar.hashCode() + 31)) ^ 1;
        }

        public final String toString() {
            return "FixedRules:" + this.f77134a;
        }
    }

    f() {
    }

    public static f h(q qVar) {
        lg.c.e(qVar, "offset");
        return new a(qVar);
    }

    public abstract q a(ig.e eVar);

    public abstract d b(ig.g gVar);

    public abstract List<q> d(ig.g gVar);

    public abstract boolean e(ig.e eVar);

    public abstract boolean f();

    public abstract boolean g(ig.g gVar, q qVar);
}
