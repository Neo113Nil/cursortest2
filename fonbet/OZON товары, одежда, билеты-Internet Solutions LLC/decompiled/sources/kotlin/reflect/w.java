package kotlin.reflect;

import ed.C6345a;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.InterfaceC7736s;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes10.dex */
public final class w {

    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f71862a;

        static {
            int[] iArr = new int[s.values().length];
            try {
                iArr[s.IN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[s.INVARIANT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[s.OUT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f71862a = iArr;
        }
    }

    public static final String b(Type type) {
        String name;
        if (!(type instanceof Class)) {
            return type.toString();
        }
        Class cls = (Class) type;
        if (cls.isArray()) {
            Sequence q11 = kotlin.sequences.l.q(type, x.f71863a);
            name = ((Class) kotlin.sequences.l.u(q11)).getName() + kotlin.text.h.W(kotlin.sequences.l.d(q11), "[]");
        } else {
            name = cls.getName();
        }
        Intrinsics.f(name);
        return name;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Type c(q qVar, boolean z11) {
        f d11 = qVar.d();
        if (d11 instanceof r) {
            return new v((r) d11);
        }
        if (!(d11 instanceof d)) {
            throw new UnsupportedOperationException("Unsupported type classifier: " + qVar);
        }
        d dVar = (d) d11;
        Class c11 = z11 ? C6345a.c(dVar) : C6345a.b(dVar);
        List<KTypeProjection> e11 = qVar.e();
        if (e11.isEmpty()) {
            return c11;
        }
        if (!c11.isArray()) {
            return d(c11, e11);
        }
        if (c11.getComponentType().isPrimitive()) {
            return c11;
        }
        KTypeProjection kTypeProjection = (KTypeProjection) C7714v.D0(e11);
        if (kTypeProjection == null) {
            throw new IllegalArgumentException("kotlin.Array must have exactly one type argument: " + qVar);
        }
        s f71853a = kTypeProjection.getF71853a();
        q f71854b = kTypeProjection.getF71854b();
        int i11 = f71853a == null ? -1 : a.f71862a[f71853a.ordinal()];
        if (i11 == -1 || i11 == 1) {
            return c11;
        }
        if (i11 != 2 && i11 != 3) {
            throw new Sc.o();
        }
        Intrinsics.f(f71854b);
        Type c12 = c(f71854b, false);
        return c12 instanceof Class ? c11 : new kotlin.reflect.a(c12);
    }

    private static final Type d(Class<?> cls, List<KTypeProjection> list) {
        Class<?> declaringClass = cls.getDeclaringClass();
        if (declaringClass == null) {
            List<KTypeProjection> list2 = list;
            ArrayList arrayList = new ArrayList(C7714v.z(list2, 10));
            Iterator<T> it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(f((KTypeProjection) it.next()));
            }
            return new u(cls, null, arrayList);
        }
        if (Modifier.isStatic(cls.getModifiers())) {
            List<KTypeProjection> list3 = list;
            ArrayList arrayList2 = new ArrayList(C7714v.z(list3, 10));
            Iterator<T> it2 = list3.iterator();
            while (it2.hasNext()) {
                arrayList2.add(f((KTypeProjection) it2.next()));
            }
            return new u(cls, declaringClass, arrayList2);
        }
        int length = cls.getTypeParameters().length;
        Type d11 = d(declaringClass, list.subList(length, list.size()));
        List<KTypeProjection> subList = list.subList(0, length);
        ArrayList arrayList3 = new ArrayList(C7714v.z(subList, 10));
        Iterator<T> it3 = subList.iterator();
        while (it3.hasNext()) {
            arrayList3.add(f((KTypeProjection) it3.next()));
        }
        return new u(cls, d11, arrayList3);
    }

    @NotNull
    public static final Type e(@NotNull q qVar) {
        Type f7;
        Intrinsics.checkNotNullParameter(qVar, "<this>");
        return (!(qVar instanceof InterfaceC7736s) || (f7 = ((InterfaceC7736s) qVar).f()) == null) ? c(qVar, false) : f7;
    }

    private static final Type f(KTypeProjection kTypeProjection) {
        y yVar;
        s d11 = kTypeProjection.d();
        if (d11 == null) {
            y.INSTANCE.getClass();
            yVar = y.f71865d;
            return yVar;
        }
        q c11 = kTypeProjection.c();
        Intrinsics.f(c11);
        int i11 = a.f71862a[d11.ordinal()];
        if (i11 == 1) {
            return new y(null, c(c11, true));
        }
        if (i11 == 2) {
            return c(c11, true);
        }
        if (i11 == 3) {
            return new y(c(c11, true), null);
        }
        throw new Sc.o();
    }
}
