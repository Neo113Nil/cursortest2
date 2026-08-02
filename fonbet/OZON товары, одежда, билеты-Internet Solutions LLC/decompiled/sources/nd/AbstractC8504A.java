package nd;

import ed.C6345a;
import java.lang.annotation.Annotation;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.l;
import ld.C7920a;
import md.C8129b;
import md.C8130c;
import nd.X0;
import org.jetbrains.annotations.NotNull;
import td.AbstractC9853s;
import td.C9852r;
import td.EnumC9812C;
import td.InterfaceC9836b;

/* renamed from: nd.A, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC8504A<R> implements kotlin.reflect.c<R>, U0 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final X0.a<List<Annotation>> f76844a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final X0.a<ArrayList<kotlin.reflect.l>> f76845b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final X0.a<R0> f76846c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final X0.a<List<T0>> f76847d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final X0.a<Object[]> f76848e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final Object f76849f;

    /* renamed from: nd.A$a */
    /* loaded from: classes10.dex */
    public static final class a<T> implements Comparator {
        @Override // java.util.Comparator
        public final int compare(T t2, T t11) {
            return Vc.a.b(((kotlin.reflect.l) t2).getName(), ((kotlin.reflect.l) t11).getName());
        }
    }

    public AbstractC8504A() {
        X0.a<List<Annotation>> a11 = X0.a(null, new C8558q(this, 0));
        Intrinsics.checkNotNullExpressionValue(a11, "lazySoft(...)");
        this.f76844a = a11;
        X0.a<ArrayList<kotlin.reflect.l>> a12 = X0.a(null, new C8560r(this, 0));
        Intrinsics.checkNotNullExpressionValue(a12, "lazySoft(...)");
        this.f76845b = a12;
        X0.a<R0> a13 = X0.a(null, new C8562s(this, 0));
        Intrinsics.checkNotNullExpressionValue(a13, "lazySoft(...)");
        this.f76846c = a13;
        X0.a<List<T0>> a14 = X0.a(null, new C8564t(this, 0));
        Intrinsics.checkNotNullExpressionValue(a14, "lazySoft(...)");
        this.f76847d = a14;
        X0.a<Object[]> a15 = X0.a(null, new C8566u(this));
        Intrinsics.checkNotNullExpressionValue(a15, "lazySoft(...)");
        this.f76848e = a15;
        this.f76849f = Sc.k.a(Sc.n.PUBLICATION, new C8568v(this));
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [Sc.j, java.lang.Object] */
    static Object[] c(AbstractC8504A abstractC8504A) {
        int i11;
        List<kotlin.reflect.l> parameters = abstractC8504A.getParameters();
        int size = (abstractC8504A.isSuspend() ? 1 : 0) + parameters.size();
        if (((Boolean) abstractC8504A.f76849f.getValue()).booleanValue()) {
            i11 = 0;
            for (kotlin.reflect.l lVar : parameters) {
                i11 += lVar.getKind() == l.a.VALUE ? abstractC8504A.w(lVar) : 0;
            }
        } else {
            List<kotlin.reflect.l> list = parameters;
            if ((list instanceof Collection) && list.isEmpty()) {
                i11 = 0;
            } else {
                Iterator<T> it = list.iterator();
                i11 = 0;
                while (it.hasNext()) {
                    if (((kotlin.reflect.l) it.next()).getKind() == l.a.VALUE && (i11 = i11 + 1) < 0) {
                        C7714v.N0();
                        throw null;
                    }
                }
            }
        }
        int i12 = (i11 + 31) / 32;
        Object[] objArr = new Object[size + i12 + 1];
        for (kotlin.reflect.l lVar2 : parameters) {
            if (lVar2.j()) {
                R0 type = lVar2.getType();
                int i13 = g1.f76975b;
                Intrinsics.checkNotNullParameter(type, "<this>");
                je.N i14 = type.i();
                if (i14 == null || !Vd.k.c(i14)) {
                    objArr[lVar2.getIndex()] = g1.e(C8130c.c(lVar2.getType()));
                }
            }
            if (lVar2.a()) {
                objArr[lVar2.getIndex()] = k(lVar2.getType());
            }
        }
        for (int i15 = 0; i15 < i12; i15++) {
            objArr[size + i15] = 0;
        }
        return objArr;
    }

    private static Object k(kotlin.reflect.q qVar) {
        Class b11 = C6345a.b(C8129b.b(qVar));
        if (b11.isArray()) {
            Object newInstance = Array.newInstance(b11.getComponentType(), 0);
            Intrinsics.checkNotNullExpressionValue(newInstance, "run(...)");
            return newInstance;
        }
        throw new V0("Cannot instantiate the default empty array of type " + b11.getSimpleName() + ", because it is not an array type");
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [Sc.j, java.lang.Object] */
    private final int w(kotlin.reflect.l lVar) {
        if (!((Boolean) this.f76849f.getValue()).booleanValue()) {
            throw new IllegalArgumentException("Check if parametersNeedMFVCFlattening is true before");
        }
        if (!g1.i(lVar.getType())) {
            return 1;
        }
        ArrayList g10 = od.n.g(je.D0.a(lVar.getType().i()));
        Intrinsics.f(g10);
        return g10.size();
    }

    @Override // kotlin.reflect.c
    public final R call(@NotNull Object... args) {
        Intrinsics.checkNotNullParameter(args, "args");
        try {
            return (R) o().call(args);
        } catch (IllegalAccessException e11) {
            throw new C7920a(e11);
        }
    }

    /* JADX WARN: Type inference failed for: r7v1, types: [Sc.j, java.lang.Object] */
    @Override // kotlin.reflect.c
    public final R callBy(@NotNull Map<kotlin.reflect.l, ? extends Object> args) {
        boolean z11;
        Object k11;
        Intrinsics.checkNotNullParameter(args, "args");
        boolean z12 = false;
        if (x()) {
            List<kotlin.reflect.l> parameters = getParameters();
            ArrayList arrayList = new ArrayList(C7714v.z(parameters, 10));
            for (kotlin.reflect.l lVar : parameters) {
                if (args.containsKey(lVar)) {
                    k11 = args.get(lVar);
                    if (k11 == null) {
                        throw new IllegalArgumentException("Annotation argument value cannot be null (" + lVar + ')');
                    }
                } else if (lVar.j()) {
                    k11 = null;
                } else {
                    if (!lVar.a()) {
                        throw new IllegalArgumentException("No argument provided for a required parameter: " + lVar);
                    }
                    k11 = k(lVar.getType());
                }
                arrayList.add(k11);
            }
            od.h<?> r11 = r();
            if (r11 != null) {
                try {
                    return (R) r11.call(arrayList.toArray(new Object[0]));
                } catch (IllegalAccessException e11) {
                    throw new C7920a(e11);
                }
            }
            throw new V0("This callable does not support a default call: " + t());
        }
        Intrinsics.checkNotNullParameter(args, "args");
        List<kotlin.reflect.l> parameters2 = getParameters();
        if (parameters2.isEmpty()) {
            try {
                return (R) o().call(isSuspend() ? new kotlin.coroutines.d[]{null} : new kotlin.coroutines.d[0]);
            } catch (IllegalAccessException e12) {
                throw new C7920a(e12);
            }
        }
        int size = (isSuspend() ? 1 : 0) + parameters2.size();
        Object[] objArr = (Object[]) this.f76848e.invoke().clone();
        if (isSuspend()) {
            objArr[parameters2.size()] = null;
        }
        boolean booleanValue = ((Boolean) this.f76849f.getValue()).booleanValue();
        int i11 = 0;
        for (kotlin.reflect.l lVar2 : parameters2) {
            int w11 = booleanValue ? w(lVar2) : 1;
            if (args.containsKey(lVar2)) {
                objArr[lVar2.getIndex()] = args.get(lVar2);
            } else if (lVar2.j()) {
                if (booleanValue) {
                    int i12 = i11 + w11;
                    for (int i13 = i11; i13 < i12; i13++) {
                        int i14 = (i13 / 32) + size;
                        Object obj = objArr[i14];
                        Intrinsics.g(obj, "null cannot be cast to non-null type kotlin.Int");
                        objArr[i14] = Integer.valueOf(((Integer) obj).intValue() | (1 << (i13 % 32)));
                    }
                    z11 = true;
                } else {
                    z11 = true;
                    int i15 = (i11 / 32) + size;
                    Object obj2 = objArr[i15];
                    Intrinsics.g(obj2, "null cannot be cast to non-null type kotlin.Int");
                    objArr[i15] = Integer.valueOf(((Integer) obj2).intValue() | (1 << (i11 % 32)));
                }
                z12 = z11;
            } else if (!lVar2.a()) {
                throw new IllegalArgumentException("No argument provided for a required parameter: " + lVar2);
            }
            if (lVar2.getKind() == l.a.VALUE) {
                i11 += w11;
            }
        }
        if (!z12) {
            try {
                od.h<?> o11 = o();
                Object[] copyOf = Arrays.copyOf(objArr, size);
                Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(...)");
                return (R) o11.call(copyOf);
            } catch (IllegalAccessException e13) {
                throw new C7920a(e13);
            }
        }
        od.h<?> r12 = r();
        if (r12 != null) {
            try {
                return (R) r12.call(objArr);
            } catch (IllegalAccessException e14) {
                throw new C7920a(e14);
            }
        }
        throw new V0("This callable does not support a default call: " + t());
    }

    @Override // kotlin.reflect.b
    @NotNull
    public final List<Annotation> getAnnotations() {
        List<Annotation> invoke = this.f76844a.invoke();
        Intrinsics.checkNotNullExpressionValue(invoke, "invoke(...)");
        return invoke;
    }

    @Override // kotlin.reflect.c
    @NotNull
    public final List<kotlin.reflect.l> getParameters() {
        ArrayList<kotlin.reflect.l> invoke = this.f76845b.invoke();
        Intrinsics.checkNotNullExpressionValue(invoke, "invoke(...)");
        return invoke;
    }

    @Override // kotlin.reflect.c
    @NotNull
    public final kotlin.reflect.q getReturnType() {
        R0 invoke = this.f76846c.invoke();
        Intrinsics.checkNotNullExpressionValue(invoke, "invoke(...)");
        return invoke;
    }

    @Override // kotlin.reflect.c
    @NotNull
    public final List<kotlin.reflect.r> getTypeParameters() {
        List<T0> invoke = this.f76847d.invoke();
        Intrinsics.checkNotNullExpressionValue(invoke, "invoke(...)");
        return invoke;
    }

    @Override // kotlin.reflect.c
    public final kotlin.reflect.t getVisibility() {
        AbstractC9853s visibility = t().getVisibility();
        Intrinsics.checkNotNullExpressionValue(visibility, "getVisibility(...)");
        int i11 = g1.f76975b;
        Intrinsics.checkNotNullParameter(visibility, "<this>");
        if (Intrinsics.d(visibility, C9852r.f99403e)) {
            return kotlin.reflect.t.PUBLIC;
        }
        if (Intrinsics.d(visibility, C9852r.f99401c)) {
            return kotlin.reflect.t.PROTECTED;
        }
        if (Intrinsics.d(visibility, C9852r.f99402d)) {
            return kotlin.reflect.t.INTERNAL;
        }
        if (Intrinsics.d(visibility, C9852r.f99399a) || Intrinsics.d(visibility, C9852r.f99400b)) {
            return kotlin.reflect.t.PRIVATE;
        }
        return null;
    }

    @Override // kotlin.reflect.c
    public final boolean isAbstract() {
        return t().h() == EnumC9812C.ABSTRACT;
    }

    @Override // kotlin.reflect.c
    public final boolean isFinal() {
        return t().h() == EnumC9812C.FINAL;
    }

    @Override // kotlin.reflect.c
    public final boolean isOpen() {
        return t().h() == EnumC9812C.OPEN;
    }

    @NotNull
    public abstract od.h<?> o();

    @NotNull
    public abstract AbstractC8537f0 q();

    public abstract od.h<?> r();

    @NotNull
    public abstract InterfaceC9836b t();

    protected final boolean x() {
        return Intrinsics.d(getName(), "<init>") && q().c().isAnnotation();
    }

    public abstract boolean z();
}
