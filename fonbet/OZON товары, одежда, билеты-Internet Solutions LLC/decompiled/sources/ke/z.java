package ke;

import Xd.q;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import je.C7363H;
import je.C7372c;
import je.C7373c0;
import je.C7385i0;
import je.C7401v;
import je.K0;
import je.M;
import je.N;
import je.Y;
import je.o0;
import je.r0;
import ke.q;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import spay.sdk.domain.model.FraudMonInfo;

/* loaded from: classes10.dex */
public final class z {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public static final z f71515a = new z();

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    private static final class a {
        private static final /* synthetic */ Xc.a $ENTRIES;
        private static final /* synthetic */ a[] $VALUES;
        public static final a ACCEPT_NULL;
        public static final a NOT_NULL;
        public static final a START;
        public static final a UNKNOWN;

        /* renamed from: ke.z$a$a, reason: collision with other inner class name */
        static final class C1176a extends a {
            C1176a() {
                super("ACCEPT_NULL", 1);
            }

            @Override // ke.z.a
            @NotNull
            public final a a(@NotNull K0 nextType) {
                Intrinsics.checkNotNullParameter(nextType, "nextType");
                return a.b(nextType);
            }
        }

        static final class b extends a {
            b() {
                super("NOT_NULL", 3);
            }

            @Override // ke.z.a
            public final a a(K0 nextType) {
                Intrinsics.checkNotNullParameter(nextType, "nextType");
                return this;
            }
        }

        static final class c extends a {
            c() {
                super("START", 0);
            }

            @Override // ke.z.a
            @NotNull
            public final a a(@NotNull K0 nextType) {
                Intrinsics.checkNotNullParameter(nextType, "nextType");
                return a.b(nextType);
            }
        }

        static final class d extends a {
            d() {
                super(FraudMonInfo.UNKNOWN, 2);
            }

            @Override // ke.z.a
            @NotNull
            public final a a(@NotNull K0 nextType) {
                Intrinsics.checkNotNullParameter(nextType, "nextType");
                a b11 = a.b(nextType);
                return b11 == a.ACCEPT_NULL ? this : b11;
            }
        }

        static {
            c cVar = new c();
            START = cVar;
            C1176a c1176a = new C1176a();
            ACCEPT_NULL = c1176a;
            d dVar = new d();
            UNKNOWN = dVar;
            b bVar = new b();
            NOT_NULL = bVar;
            a[] aVarArr = {cVar, c1176a, dVar, bVar};
            $VALUES = aVarArr;
            $ENTRIES = Xc.b.a(aVarArr);
        }

        private a() {
            throw null;
        }

        @NotNull
        protected static a b(@NotNull K0 type) {
            Intrinsics.checkNotNullParameter(type, "<this>");
            if (type.I0()) {
                return ACCEPT_NULL;
            }
            if ((type instanceof C7401v) && (((C7401v) type).T0() instanceof C7385i0)) {
                return NOT_NULL;
            }
            if (type instanceof C7385i0) {
                return UNKNOWN;
            }
            Intrinsics.checkNotNullParameter(type, "type");
            return C7372c.a(C7669a.a(false, null, null, 24), C7363H.b(type), r0.c.b.f69924a) ? NOT_NULL : UNKNOWN;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) $VALUES.clone();
        }

        @NotNull
        public abstract a a(@NotNull K0 k02);
    }

    private z() {
    }

    private static ArrayList a(AbstractCollection abstractCollection, Function2 function2) {
        ArrayList arrayList = new ArrayList(abstractCollection);
        Iterator it = arrayList.iterator();
        Intrinsics.checkNotNullExpressionValue(it, "iterator(...)");
        while (it.hasNext()) {
            Y y11 = (Y) it.next();
            if (!arrayList.isEmpty()) {
                Iterator it2 = arrayList.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    Y y12 = (Y) it2.next();
                    if (y12 != y11) {
                        Intrinsics.f(y12);
                        Intrinsics.f(y11);
                        if (((Boolean) function2.invoke(y12, y11)).booleanValue()) {
                            it.remove();
                            break;
                        }
                    }
                }
            }
        }
        return arrayList;
    }

    @NotNull
    public final Y b(@NotNull ArrayList types) {
        Y c11;
        Intrinsics.checkNotNullParameter(types, "types");
        types.size();
        ArrayList arrayList = new ArrayList();
        Iterator it = types.iterator();
        while (it.hasNext()) {
            Y y11 = (Y) it.next();
            if (y11.H0() instanceof M) {
                Collection<N> o11 = y11.H0().o();
                Intrinsics.checkNotNullExpressionValue(o11, "getSupertypes(...)");
                Collection<N> collection = o11;
                ArrayList arrayList2 = new ArrayList(C7714v.z(collection, 10));
                for (N n11 : collection) {
                    Intrinsics.f(n11);
                    Y c12 = C7363H.c(n11);
                    if (y11.I0()) {
                        c12 = c12.L0(true);
                    }
                    arrayList2.add(c12);
                }
                arrayList.addAll(arrayList2);
            } else {
                arrayList.add(y11);
            }
        }
        a aVar = a.START;
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            aVar = aVar.a((K0) it2.next());
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            Y y12 = (Y) it3.next();
            if (aVar == a.NOT_NULL) {
                if (y12 instanceof j) {
                    j jVar = (j) y12;
                    Intrinsics.checkNotNullParameter(jVar, "<this>");
                    y12 = new j(jVar.Q0(), jVar.R0(), jVar.S0(), jVar.G0(), jVar.I0(), true);
                }
                y12 = C7373c0.c(y12);
            }
            linkedHashSet.add(y12);
        }
        ArrayList arrayList3 = new ArrayList(C7714v.z(types, 10));
        Iterator it4 = types.iterator();
        while (it4.hasNext()) {
            arrayList3.add(((Y) it4.next()).G0());
        }
        Iterator it5 = arrayList3.iterator();
        if (!it5.hasNext()) {
            throw new UnsupportedOperationException("Empty collection can't be reduced.");
        }
        Object next = it5.next();
        while (it5.hasNext()) {
            next = ((o0) next).k((o0) it5.next());
        }
        o0 o0Var = (o0) next;
        if (linkedHashSet.size() == 1) {
            c11 = (Y) C7714v.A0(linkedHashSet);
        } else {
            ArrayList a11 = a(linkedHashSet, new C7668A(2, this));
            a11.isEmpty();
            Y a12 = q.a.a(a11);
            if (a12 != null) {
                c11 = a12;
            } else {
                q.f71506b.getClass();
                ArrayList a13 = a(a11, new B(2, q.a.a()));
                a13.isEmpty();
                c11 = a13.size() < 2 ? (Y) C7714v.A0(a13) : new M(linkedHashSet).c();
            }
        }
        return c11.N0(o0Var);
    }
}
