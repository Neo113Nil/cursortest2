package bi;

import di.E0;
import di.InterfaceC4103n;
import di.L0;
import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.TuplesKt;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IndexedValue;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public final class h implements f, InterfaceC4103n {

    /* renamed from: a, reason: collision with root package name */
    public final String f25215a;

    /* renamed from: b, reason: collision with root package name */
    public final m f25216b;

    /* renamed from: c, reason: collision with root package name */
    public final int f25217c;

    /* renamed from: d, reason: collision with root package name */
    public final List f25218d;

    /* renamed from: e, reason: collision with root package name */
    public final Set f25219e;

    @NotNull
    private final List<Annotation>[] elementAnnotations;

    @NotNull
    private final f[] elementDescriptors;

    @NotNull
    private final String[] elementNames;

    @NotNull
    private final boolean[] elementOptionality;

    /* renamed from: f, reason: collision with root package name */
    public final Map f25220f;

    /* renamed from: g, reason: collision with root package name */
    public final Lazy f25221g;

    @NotNull
    private final f[] typeParametersDescriptors;

    public h(String serialName, m kind, int i10, List typeParameters, C2425a builder) {
        Intrinsics.checkNotNullParameter(serialName, "serialName");
        Intrinsics.checkNotNullParameter(kind, "kind");
        Intrinsics.checkNotNullParameter(typeParameters, "typeParameters");
        Intrinsics.checkNotNullParameter(builder, "builder");
        this.f25215a = serialName;
        this.f25216b = kind;
        this.f25217c = i10;
        this.f25218d = builder.c();
        this.f25219e = CollectionsKt.toHashSet(builder.f());
        String[] strArr = (String[]) builder.f().toArray(new String[0]);
        this.elementNames = strArr;
        this.elementDescriptors = E0.b(builder.e());
        this.elementAnnotations = (List[]) builder.d().toArray(new List[0]);
        this.elementOptionality = CollectionsKt.toBooleanArray(builder.g());
        Iterable<IndexedValue> withIndex = ArraysKt.withIndex(strArr);
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(withIndex, 10));
        for (IndexedValue indexedValue : withIndex) {
            arrayList.add(TuplesKt.to(indexedValue.getValue(), Integer.valueOf(indexedValue.getIndex())));
        }
        this.f25220f = MapsKt.toMap(arrayList);
        this.typeParametersDescriptors = E0.b(typeParameters);
        this.f25221g = LazyKt.lazy(new Function0() { // from class: bi.g
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int k10;
                k10 = h.k(h.this);
                return Integer.valueOf(k10);
            }
        });
    }

    public static final int k(h hVar) {
        return L0.b(hVar, hVar.typeParametersDescriptors);
    }

    @Override // di.InterfaceC4103n
    public Set a() {
        return this.f25219e;
    }

    @Override // bi.f
    public boolean b() {
        return super.b();
    }

    @Override // bi.f
    public int c(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        Integer num = (Integer) this.f25220f.get(name);
        if (num != null) {
            return num.intValue();
        }
        return -3;
    }

    @Override // bi.f
    public int d() {
        return this.f25217c;
    }

    @Override // bi.f
    public String e(int i10) {
        return this.elementNames[i10];
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        f fVar = (f) obj;
        if (!Intrinsics.areEqual(h(), fVar.h()) || !Arrays.equals(this.typeParametersDescriptors, ((h) obj).typeParametersDescriptors) || d() != fVar.d()) {
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
        return this.elementAnnotations[i10];
    }

    @Override // bi.f
    public f g(int i10) {
        return this.elementDescriptors[i10];
    }

    @Override // bi.f
    public List getAnnotations() {
        return this.f25218d;
    }

    @Override // bi.f
    public m getKind() {
        return this.f25216b;
    }

    @Override // bi.f
    public String h() {
        return this.f25215a;
    }

    public int hashCode() {
        return l();
    }

    @Override // bi.f
    public boolean i(int i10) {
        return this.elementOptionality[i10];
    }

    @Override // bi.f
    public boolean isInline() {
        return super.isInline();
    }

    public final int l() {
        return ((Number) this.f25221g.getValue()).intValue();
    }

    public String toString() {
        return L0.c(this);
    }
}
