package di;

import Zh.InterfaceC1901b;
import bi.n;
import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public class J0 implements bi.f, InterfaceC4103n {

    /* renamed from: a, reason: collision with root package name */
    public final String f45303a;

    /* renamed from: b, reason: collision with root package name */
    public final N f45304b;

    /* renamed from: c, reason: collision with root package name */
    public final int f45305c;

    /* renamed from: d, reason: collision with root package name */
    public int f45306d;

    /* renamed from: e, reason: collision with root package name */
    public List f45307e;

    @NotNull
    private final boolean[] elementsOptionality;

    /* renamed from: f, reason: collision with root package name */
    public Map f45308f;

    /* renamed from: g, reason: collision with root package name */
    public final Lazy f45309g;

    /* renamed from: h, reason: collision with root package name */
    public final Lazy f45310h;

    /* renamed from: i, reason: collision with root package name */
    public final Lazy f45311i;

    @NotNull
    private final String[] names;

    @NotNull
    private final List<Annotation>[] propertiesAnnotations;

    public J0(String serialName, N n10, int i10) {
        Intrinsics.checkNotNullParameter(serialName, "serialName");
        this.f45303a = serialName;
        this.f45304b = n10;
        this.f45305c = i10;
        this.f45306d = -1;
        String[] strArr = new String[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            strArr[i11] = "[UNINITIALIZED]";
        }
        this.names = strArr;
        int i12 = this.f45305c;
        this.propertiesAnnotations = new List[i12];
        this.elementsOptionality = new boolean[i12];
        this.f45308f = MapsKt.emptyMap();
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        this.f45309g = LazyKt.lazy(lazyThreadSafetyMode, new Function0() { // from class: di.G0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                InterfaceC1901b[] q10;
                q10 = J0.q(J0.this);
                return q10;
            }
        });
        this.f45310h = LazyKt.lazy(lazyThreadSafetyMode, new Function0() { // from class: di.H0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                bi.f[] v10;
                v10 = J0.v(J0.this);
                return v10;
            }
        });
        this.f45311i = LazyKt.lazy(lazyThreadSafetyMode, new Function0() { // from class: di.I0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int m10;
                m10 = J0.m(J0.this);
                return Integer.valueOf(m10);
            }
        });
    }

    public static final int m(J0 j02) {
        return L0.b(j02, j02.s());
    }

    public static /* synthetic */ void o(J0 j02, String str, boolean z10, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: addElement");
        }
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        j02.n(str, z10);
    }

    public static final InterfaceC1901b[] q(J0 j02) {
        InterfaceC1901b[] childSerializers;
        N n10 = j02.f45304b;
        return (n10 == null || (childSerializers = n10.childSerializers()) == null) ? M0.EMPTY_SERIALIZER_ARRAY : childSerializers;
    }

    private final int t() {
        return ((Number) this.f45311i.getValue()).intValue();
    }

    public static final bi.f[] v(J0 j02) {
        ArrayList arrayList;
        InterfaceC1901b[] typeParametersSerializers;
        N n10 = j02.f45304b;
        if (n10 == null || (typeParametersSerializers = n10.typeParametersSerializers()) == null) {
            arrayList = null;
        } else {
            arrayList = new ArrayList(typeParametersSerializers.length);
            for (InterfaceC1901b interfaceC1901b : typeParametersSerializers) {
                arrayList.add(interfaceC1901b.getDescriptor());
            }
        }
        return E0.b(arrayList);
    }

    @Override // di.InterfaceC4103n
    public Set a() {
        return this.f45308f.keySet();
    }

    @Override // bi.f
    public boolean b() {
        return super.b();
    }

    @Override // bi.f
    public int c(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        Integer num = (Integer) this.f45308f.get(name);
        if (num != null) {
            return num.intValue();
        }
        return -3;
    }

    @Override // bi.f
    public final int d() {
        return this.f45305c;
    }

    @Override // bi.f
    public String e(int i10) {
        return this.names[i10];
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof J0)) {
            return false;
        }
        bi.f fVar = (bi.f) obj;
        if (!Intrinsics.areEqual(h(), fVar.h()) || !Arrays.equals(s(), ((J0) obj).s()) || d() != fVar.d()) {
            return false;
        }
        int d10 = d();
        for (int i10 = 0; i10 < d10; i10++) {
            if (!Intrinsics.areEqual(g(i10).h(), fVar.g(i10).h()) || !Intrinsics.areEqual(g(i10).getKind(), fVar.g(i10).getKind())) {
                return false;
            }
        }
        return true;
    }

    @Override // bi.f
    public List f(int i10) {
        List<Annotation> list = this.propertiesAnnotations[i10];
        return list == null ? CollectionsKt.emptyList() : list;
    }

    @Override // bi.f
    public bi.f g(int i10) {
        return r()[i10].getDescriptor();
    }

    @Override // bi.f
    public List getAnnotations() {
        List list = this.f45307e;
        return list == null ? CollectionsKt.emptyList() : list;
    }

    @Override // bi.f
    public bi.m getKind() {
        return n.a.f25230a;
    }

    @Override // bi.f
    public String h() {
        return this.f45303a;
    }

    public int hashCode() {
        return t();
    }

    @Override // bi.f
    public boolean i(int i10) {
        return this.elementsOptionality[i10];
    }

    @Override // bi.f
    public boolean isInline() {
        return super.isInline();
    }

    public final void n(String name, boolean z10) {
        Intrinsics.checkNotNullParameter(name, "name");
        String[] strArr = this.names;
        int i10 = this.f45306d + 1;
        this.f45306d = i10;
        strArr[i10] = name;
        this.elementsOptionality[i10] = z10;
        this.propertiesAnnotations[i10] = null;
        if (i10 == this.f45305c - 1) {
            this.f45308f = p();
        }
    }

    public final Map p() {
        HashMap hashMap = new HashMap();
        int length = this.names.length;
        for (int i10 = 0; i10 < length; i10++) {
            hashMap.put(this.names[i10], Integer.valueOf(i10));
        }
        return hashMap;
    }

    public final InterfaceC1901b[] r() {
        return (InterfaceC1901b[]) this.f45309g.getValue();
    }

    public final bi.f[] s() {
        return (bi.f[]) this.f45310h.getValue();
    }

    public String toString() {
        return L0.c(this);
    }

    public final void u(Annotation annotation) {
        Intrinsics.checkNotNullParameter(annotation, "annotation");
        List<Annotation> list = this.propertiesAnnotations[this.f45306d];
        if (list == null) {
            list = new ArrayList<>(1);
            this.propertiesAnnotations[this.f45306d] = list;
        }
        list.add(annotation);
    }

    public /* synthetic */ J0(String str, N n10, int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i11 & 2) != 0 ? null : n10, i10);
    }
}
