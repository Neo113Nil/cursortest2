package ke;

import a10.AbstractC4920h;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import je.AbstractC7360E;
import je.J0;
import je.K0;
import je.L0;
import je.M;
import je.N;
import je.Q;
import je.Y;
import je.s0;
import je.y0;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import ne.EnumC8580b;
import oe.C8701c;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public abstract class f extends AbstractC4920h {

    public static final class a extends f {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        public static final a f71487a = new a();
    }

    private static Y d(Y y11) {
        N type;
        s0 H02 = y11.H0();
        M m11 = null;
        r3 = null;
        K0 k02 = null;
        if (H02 instanceof Wd.c) {
            Wd.c cVar = (Wd.c) H02;
            y0 projection = cVar.getProjection();
            if (projection.b() != L0.IN_VARIANCE) {
                projection = null;
            }
            if (projection != null && (type = projection.getType()) != null) {
                k02 = type.K0();
            }
            K0 k03 = k02;
            if (cVar.b() == null) {
                y0 projection2 = cVar.getProjection();
                Collection<N> o11 = cVar.o();
                ArrayList arrayList = new ArrayList(C7714v.z(o11, 10));
                Iterator<T> it = o11.iterator();
                while (it.hasNext()) {
                    arrayList.add(((N) it.next()).K0());
                }
                cVar.c(new o(projection2, arrayList));
            }
            EnumC8580b enumC8580b = EnumC8580b.FOR_SUBTYPING;
            o b11 = cVar.b();
            Intrinsics.f(b11);
            return new j(enumC8580b, b11, k03, y11.G0(), y11.I0(), 32);
        }
        if (H02 instanceof Xd.s) {
            ((Xd.s) H02).getClass();
            C7714v.z(null, 10);
            throw null;
        }
        if (!(H02 instanceof M) || !y11.I0()) {
            return y11;
        }
        M m12 = (M) H02;
        Collection<N> o12 = m12.o();
        ArrayList arrayList2 = new ArrayList(C7714v.z(o12, 10));
        Iterator<T> it2 = o12.iterator();
        boolean z11 = false;
        while (it2.hasNext()) {
            arrayList2.add(C8701c.p((N) it2.next()));
            z11 = true;
        }
        if (z11) {
            N d11 = m12.d();
            m11 = new M(arrayList2).g(d11 != null ? C8701c.p(d11) : null);
        }
        if (m11 != null) {
            m12 = m11;
        }
        return m12.c();
    }

    @NotNull
    public final K0 c(@NotNull ne.g type) {
        K0 c11;
        Intrinsics.checkNotNullParameter(type, "type");
        if (!(type instanceof N)) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        K0 origin = ((N) type).K0();
        if (origin instanceof Y) {
            c11 = d((Y) origin);
        } else {
            if (!(origin instanceof AbstractC7360E)) {
                throw new Sc.o();
            }
            AbstractC7360E abstractC7360E = (AbstractC7360E) origin;
            Y d11 = d(abstractC7360E.P0());
            Y d12 = d(abstractC7360E.Q0());
            c11 = (d11 == abstractC7360E.P0() && d12 == abstractC7360E.Q0()) ? origin : Q.c(d11, d12);
        }
        g transform = new g(1, this);
        Intrinsics.checkNotNullParameter(c11, "<this>");
        Intrinsics.checkNotNullParameter(origin, "origin");
        Intrinsics.checkNotNullParameter(transform, "transform");
        N a11 = J0.a(origin);
        return J0.c(c11, a11 != null ? (N) transform.invoke(a11) : null);
    }
}
