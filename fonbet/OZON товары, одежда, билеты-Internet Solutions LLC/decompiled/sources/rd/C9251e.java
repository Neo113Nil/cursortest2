package rd;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import je.F0;
import je.L0;
import je.N;
import je.Y;
import kotlin.Pair;
import kotlin.collections.C7714v;
import kotlin.collections.IndexedValue;
import kotlin.collections.K;
import kotlin.collections.O;
import kotlin.collections.P;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qd.i;
import qe.w;
import td.C9852r;
import td.EnumC9812C;
import td.InterfaceC9834Z;
import td.InterfaceC9836b;
import td.InterfaceC9845k;
import td.InterfaceC9857w;
import td.d0;
import td.i0;
import td.p0;
import ud.InterfaceC10030h;
import wd.AbstractC10539z;
import wd.V;
import wd.c0;

/* renamed from: rd.e, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C9251e extends V {

    /* renamed from: rd.e$a */
    public static final class a {
        @NotNull
        public static C9251e a(@NotNull C9248b functionClass, boolean z11) {
            String lowerCase;
            Intrinsics.checkNotNullParameter(functionClass, "functionClass");
            List<i0> r11 = functionClass.r();
            C9251e c9251e = new C9251e(functionClass, InterfaceC9836b.a.DECLARATION, z11);
            InterfaceC9834Z W11 = functionClass.W();
            K k11 = K.f71697a;
            ArrayList arrayList = new ArrayList();
            for (Object obj : r11) {
                if (((i0) obj).x() != L0.IN_VARIANCE) {
                    break;
                }
                arrayList.add(obj);
            }
            O a12 = C7714v.a1(arrayList);
            ArrayList arrayList2 = new ArrayList(C7714v.z(a12, 10));
            Iterator it = a12.iterator();
            while (true) {
                P p11 = (P) it;
                if (!p11.hasNext()) {
                    c9251e.L0(null, W11, k11, k11, arrayList2, ((i0) C7714v.X(r11)).q(), EnumC9812C.ABSTRACT, C9852r.f99403e);
                    C9251e c9251e2 = c9251e;
                    c9251e2.S0(true);
                    return c9251e2;
                }
                IndexedValue indexedValue = (IndexedValue) p11.next();
                int c11 = indexedValue.c();
                i0 i0Var = (i0) indexedValue.d();
                String b11 = i0Var.getName().b();
                Intrinsics.checkNotNullExpressionValue(b11, "asString(...)");
                if (Intrinsics.d(b11, "T")) {
                    lowerCase = "instance";
                } else if (Intrinsics.d(b11, "E")) {
                    lowerCase = "receiver";
                } else {
                    lowerCase = b11.toLowerCase(Locale.ROOT);
                    Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
                }
                C9251e c9251e3 = c9251e;
                InterfaceC10030h.a.C2208a b12 = InterfaceC10030h.a.b();
                Sd.f f7 = Sd.f.f(lowerCase);
                Intrinsics.checkNotNullExpressionValue(f7, "identifier(...)");
                Y q11 = i0Var.q();
                Intrinsics.checkNotNullExpressionValue(q11, "getDefaultType(...)");
                d0 NO_SOURCE = d0.f99392a;
                Intrinsics.checkNotNullExpressionValue(NO_SOURCE, "NO_SOURCE");
                arrayList2.add(new c0(c9251e3, null, c11, b12, f7, q11, false, false, false, null, NO_SOURCE));
                c9251e = c9251e3;
            }
        }
    }

    public /* synthetic */ C9251e(C9248b c9248b, InterfaceC9836b.a aVar, boolean z11) {
        this(c9248b, null, aVar, z11);
    }

    @Override // wd.V, wd.AbstractC10539z
    @NotNull
    protected final AbstractC10539z G0(Sd.f fVar, @NotNull InterfaceC9836b.a kind, @NotNull InterfaceC9845k newOwner, InterfaceC9857w interfaceC9857w, @NotNull d0 source, @NotNull InterfaceC10030h annotations) {
        Intrinsics.checkNotNullParameter(newOwner, "newOwner");
        Intrinsics.checkNotNullParameter(kind, "kind");
        Intrinsics.checkNotNullParameter(annotations, "annotations");
        Intrinsics.checkNotNullParameter(source, "source");
        return new C9251e(newOwner, (C9251e) interfaceC9857w, kind, isSuspend());
    }

    @Override // wd.AbstractC10539z
    protected final AbstractC10539z H0(@NotNull AbstractC10539z.a configuration) {
        Sd.f fVar;
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        C9251e c9251e = (C9251e) super.H0(configuration);
        if (c9251e == null) {
            return null;
        }
        List<p0> f7 = c9251e.f();
        Intrinsics.checkNotNullExpressionValue(f7, "getValueParameters(...)");
        List<p0> list = f7;
        if ((list instanceof Collection) && list.isEmpty()) {
            return c9251e;
        }
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            N type = ((p0) it.next()).getType();
            Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
            if (i.c(type) != null) {
                List<p0> f11 = c9251e.f();
                Intrinsics.checkNotNullExpressionValue(f11, "getValueParameters(...)");
                List<p0> list2 = f11;
                ArrayList arrayList = new ArrayList(C7714v.z(list2, 10));
                Iterator<T> it2 = list2.iterator();
                while (it2.hasNext()) {
                    N type2 = ((p0) it2.next()).getType();
                    Intrinsics.checkNotNullExpressionValue(type2, "getType(...)");
                    arrayList.add(i.c(type2));
                }
                int size = c9251e.f().size() - arrayList.size();
                boolean z11 = true;
                if (size == 0) {
                    List<p0> f12 = c9251e.f();
                    Intrinsics.checkNotNullExpressionValue(f12, "getValueParameters(...)");
                    ArrayList b12 = C7714v.b1(arrayList, f12);
                    if (b12.isEmpty()) {
                        return c9251e;
                    }
                    Iterator it3 = b12.iterator();
                    while (it3.hasNext()) {
                        Pair pair = (Pair) it3.next();
                        if (!Intrinsics.d((Sd.f) pair.a(), ((p0) pair.b()).getName())) {
                        }
                    }
                    return c9251e;
                }
                List<p0> f13 = c9251e.f();
                Intrinsics.checkNotNullExpressionValue(f13, "getValueParameters(...)");
                List<p0> list3 = f13;
                ArrayList arrayList2 = new ArrayList(C7714v.z(list3, 10));
                for (p0 p0Var : list3) {
                    Sd.f name = p0Var.getName();
                    Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
                    int index = p0Var.getIndex();
                    int i11 = index - size;
                    if (i11 >= 0 && (fVar = (Sd.f) arrayList.get(i11)) != null) {
                        name = fVar;
                    }
                    arrayList2.add(p0Var.o0(c9251e, name, index));
                }
                AbstractC10539z.a M02 = c9251e.M0(F0.f69829b);
                if (!arrayList.isEmpty()) {
                    Iterator it4 = arrayList.iterator();
                    while (it4.hasNext()) {
                        if (((Sd.f) it4.next()) == null) {
                            break;
                        }
                    }
                }
                z11 = false;
                M02.B(z11);
                M02.F(arrayList2);
                M02.D(c9251e.n0());
                Intrinsics.checkNotNullExpressionValue(M02, "setOriginal(...)");
                AbstractC10539z H02 = super.H0(M02);
                Intrinsics.f(H02);
                return H02;
            }
        }
        return c9251e;
    }

    @Override // wd.AbstractC10539z, td.InterfaceC9811B
    public final boolean isExternal() {
        return false;
    }

    @Override // wd.AbstractC10539z, td.InterfaceC9857w
    public final boolean isInline() {
        return false;
    }

    @Override // wd.AbstractC10539z, td.InterfaceC9857w
    public final boolean y() {
        return false;
    }

    private C9251e(InterfaceC9845k interfaceC9845k, C9251e c9251e, InterfaceC9836b.a aVar, boolean z11) {
        super(interfaceC9845k, c9251e, InterfaceC10030h.a.b(), w.f81986g, aVar, d0.f99392a);
        V0(true);
        X0(z11);
        R0(false);
    }
}
