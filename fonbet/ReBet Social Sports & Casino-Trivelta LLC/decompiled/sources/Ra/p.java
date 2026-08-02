package Ra;

import java.io.Serializable;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes3.dex */
public abstract class p {

    public static class b implements o, Serializable {
        private static final long serialVersionUID = 0;

        /* renamed from: a, reason: collision with root package name */
        public final List f10146a;

        @Override // Ra.o
        public boolean apply(Object obj) {
            for (int i10 = 0; i10 < this.f10146a.size(); i10++) {
                if (!((o) this.f10146a.get(i10)).apply(obj)) {
                    return false;
                }
            }
            return true;
        }

        public boolean equals(Object obj) {
            if (obj instanceof b) {
                return this.f10146a.equals(((b) obj).f10146a);
            }
            return false;
        }

        public int hashCode() {
            return this.f10146a.hashCode() + 306654252;
        }

        public String toString() {
            return p.d("and", this.f10146a);
        }

        public b(List list) {
            this.f10146a = list;
        }
    }

    public static o b(o oVar, o oVar2) {
        return new b(c((o) n.k(oVar), (o) n.k(oVar2)));
    }

    public static List c(o oVar, o oVar2) {
        return Arrays.asList(oVar, oVar2);
    }

    public static String d(String str, Iterable iterable) {
        StringBuilder sb2 = new StringBuilder("Predicates.");
        sb2.append(str);
        sb2.append('(');
        boolean z10 = true;
        for (Object obj : iterable) {
            if (!z10) {
                sb2.append(',');
            }
            sb2.append(obj);
            z10 = false;
        }
        sb2.append(')');
        return sb2.toString();
    }
}
