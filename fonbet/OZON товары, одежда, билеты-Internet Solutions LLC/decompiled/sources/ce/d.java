package ce;

import g.C6594f;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.C7714v;
import kotlin.collections.K;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: c, reason: collision with root package name */
    private static int f57013c = 1;

    /* renamed from: d, reason: collision with root package name */
    private static final int f57014d;

    /* renamed from: e, reason: collision with root package name */
    private static final int f57015e;

    /* renamed from: f, reason: collision with root package name */
    private static final int f57016f;

    /* renamed from: g, reason: collision with root package name */
    private static final int f57017g;

    /* renamed from: h, reason: collision with root package name */
    private static final int f57018h;

    /* renamed from: i, reason: collision with root package name */
    private static final int f57019i;

    /* renamed from: j, reason: collision with root package name */
    private static final int f57020j;

    /* renamed from: k, reason: collision with root package name */
    private static final int f57021k;

    /* renamed from: l, reason: collision with root package name */
    @NotNull
    public static final d f57022l;

    /* renamed from: m, reason: collision with root package name */
    @NotNull
    public static final d f57023m;

    /* renamed from: n, reason: collision with root package name */
    @NotNull
    public static final d f57024n;

    /* renamed from: o, reason: collision with root package name */
    @NotNull
    public static final d f57025o;

    /* renamed from: p, reason: collision with root package name */
    @NotNull
    public static final d f57026p;

    /* renamed from: q, reason: collision with root package name */
    @NotNull
    private static final ArrayList f57027q;

    /* renamed from: r, reason: collision with root package name */
    @NotNull
    private static final ArrayList f57028r;

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final List<AbstractC5816c> f57029a;

    /* renamed from: b, reason: collision with root package name */
    private final int f57030b;

    public static final class a {

        /* renamed from: ce.d$a$a, reason: collision with other inner class name */
        private static final class C0863a {

            /* renamed from: a, reason: collision with root package name */
            private final int f57031a;

            /* renamed from: b, reason: collision with root package name */
            @NotNull
            private final String f57032b;

            public C0863a(int i11, @NotNull String name) {
                Intrinsics.checkNotNullParameter(name, "name");
                this.f57031a = i11;
                this.f57032b = name;
            }

            public final int a() {
                return this.f57031a;
            }

            @NotNull
            public final String b() {
                return this.f57032b;
            }
        }

        public static final int a(a aVar) {
            int i11 = d.f57013c;
            d.f57013c <<= 1;
            return i11;
        }
    }

    static {
        a.C0863a c0863a;
        a aVar = new a();
        int a11 = a.a(aVar);
        f57014d = a11;
        int a12 = a.a(aVar);
        f57015e = a12;
        int a13 = a.a(aVar);
        f57016f = a13;
        int a14 = a.a(aVar);
        f57017g = a14;
        int a15 = a.a(aVar);
        f57018h = a15;
        int a16 = a.a(aVar);
        f57019i = a16;
        int a17 = a.a(aVar) - 1;
        f57020j = a17;
        int i11 = a11 | a12 | a13;
        f57021k = i11;
        f57022l = new d(a17);
        f57023m = new d(a15 | a16);
        new d(a11);
        new d(a12);
        new d(a13);
        f57024n = new d(i11);
        new d(a14);
        f57025o = new d(a15);
        f57026p = new d(a16);
        new d(a12 | a15 | a16);
        Field[] fields = d.class.getFields();
        Intrinsics.checkNotNullExpressionValue(fields, "getFields(...)");
        ArrayList arrayList = new ArrayList();
        for (Field field : fields) {
            if (Modifier.isStatic(field.getModifiers())) {
                arrayList.add(field);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (true) {
            a.C0863a c0863a2 = null;
            if (!it.hasNext()) {
                break;
            }
            Field field2 = (Field) it.next();
            Object obj = field2.get(null);
            d dVar = obj instanceof d ? (d) obj : null;
            if (dVar != null) {
                String name = field2.getName();
                Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
                c0863a2 = new a.C0863a(dVar.f57030b, name);
            }
            if (c0863a2 != null) {
                arrayList2.add(c0863a2);
            }
        }
        f57027q = arrayList2;
        Field[] fields2 = d.class.getFields();
        Intrinsics.checkNotNullExpressionValue(fields2, "getFields(...)");
        ArrayList arrayList3 = new ArrayList();
        for (Field field3 : fields2) {
            if (Modifier.isStatic(field3.getModifiers())) {
                arrayList3.add(field3);
            }
        }
        ArrayList arrayList4 = new ArrayList();
        Iterator it2 = arrayList3.iterator();
        while (it2.hasNext()) {
            Object next = it2.next();
            if (Intrinsics.d(((Field) next).getType(), Integer.TYPE)) {
                arrayList4.add(next);
            }
        }
        ArrayList arrayList5 = new ArrayList();
        Iterator it3 = arrayList4.iterator();
        while (it3.hasNext()) {
            Field field4 = (Field) it3.next();
            Object obj2 = field4.get(null);
            Intrinsics.g(obj2, "null cannot be cast to non-null type kotlin.Int");
            int intValue = ((Integer) obj2).intValue();
            if (intValue == ((-intValue) & intValue)) {
                String name2 = field4.getName();
                Intrinsics.checkNotNullExpressionValue(name2, "getName(...)");
                c0863a = new a.C0863a(intValue, name2);
            } else {
                c0863a = null;
            }
            if (c0863a != null) {
                arrayList5.add(c0863a);
            }
        }
        f57028r = arrayList5;
    }

    public d(int i11) {
        this(i11, K.f71697a);
    }

    public final boolean a(int i11) {
        return (i11 & this.f57030b) != 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!d.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        Intrinsics.g(obj, "null cannot be cast to non-null type org.jetbrains.kotlin.resolve.scopes.DescriptorKindFilter");
        d dVar = (d) obj;
        return Intrinsics.d(this.f57029a, dVar.f57029a) && this.f57030b == dVar.f57030b;
    }

    public final int hashCode() {
        return (this.f57029a.hashCode() * 31) + this.f57030b;
    }

    @NotNull
    public final List<AbstractC5816c> l() {
        return this.f57029a;
    }

    public final int m() {
        return this.f57030b;
    }

    public final d n(int i11) {
        int i12 = i11 & this.f57030b;
        if (i12 == 0) {
            return null;
        }
        return new d(i12, this.f57029a);
    }

    @NotNull
    public final String toString() {
        Object obj;
        Iterator it = f57027q.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((a.C0863a) obj).a() == this.f57030b) {
                break;
            }
        }
        a.C0863a c0863a = (a.C0863a) obj;
        String b11 = c0863a != null ? c0863a.b() : null;
        if (b11 == null) {
            ArrayList arrayList = f57028r;
            ArrayList arrayList2 = new ArrayList();
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                a.C0863a c0863a2 = (a.C0863a) it2.next();
                String b12 = a(c0863a2.a()) ? c0863a2.b() : null;
                if (b12 != null) {
                    arrayList2.add(b12);
                }
            }
            b11 = C7714v.V(arrayList2, " | ", null, null, null, 62);
        }
        StringBuilder b13 = C6594f.b("DescriptorKindFilter(", b11, ", ");
        b13.append(this.f57029a);
        b13.append(')');
        return b13.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public d(int i11, @NotNull List<? extends AbstractC5816c> excludes) {
        Intrinsics.checkNotNullParameter(excludes, "excludes");
        this.f57029a = excludes;
        Iterator it = excludes.iterator();
        while (it.hasNext()) {
            i11 &= ~((AbstractC5816c) it.next()).a();
        }
        this.f57030b = i11;
    }
}
