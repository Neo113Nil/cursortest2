package ah;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class Q implements InterfaceC2006A {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC2006A f15997a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f15998b;

    public Q(InterfaceC2006A encodedParametersBuilder) {
        Intrinsics.checkNotNullParameter(encodedParametersBuilder, "encodedParametersBuilder");
        this.f15997a = encodedParametersBuilder;
        this.f15998b = encodedParametersBuilder.b();
    }

    @Override // ch.y
    public Set a() {
        return S.d(this.f15997a).a();
    }

    @Override // ch.y
    public boolean b() {
        return this.f15998b;
    }

    @Override // ah.InterfaceC2006A
    public z build() {
        return S.d(this.f15997a);
    }

    @Override // ch.y
    public List c(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        List c10 = this.f15997a.c(AbstractC2010b.m(name, false, 1, null));
        if (c10 == null) {
            return null;
        }
        List list = c10;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(AbstractC2010b.k((String) it.next(), 0, 0, true, null, 11, null));
        }
        return arrayList;
    }

    @Override // ch.y
    public void clear() {
        this.f15997a.clear();
    }

    @Override // ch.y
    public boolean contains(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return this.f15997a.contains(AbstractC2010b.m(name, false, 1, null));
    }

    @Override // ch.y
    public void d(ch.x stringValues) {
        Intrinsics.checkNotNullParameter(stringValues, "stringValues");
        S.c(this.f15997a, stringValues);
    }

    @Override // ch.y
    public void e(String name, Iterable values) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(values, "values");
        InterfaceC2006A interfaceC2006A = this.f15997a;
        String m10 = AbstractC2010b.m(name, false, 1, null);
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(values, 10));
        Iterator it = values.iterator();
        while (it.hasNext()) {
            arrayList.add(AbstractC2010b.n((String) it.next()));
        }
        interfaceC2006A.e(m10, arrayList);
    }

    @Override // ch.y
    public void f(String name, String value) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(value, "value");
        this.f15997a.f(AbstractC2010b.m(name, false, 1, null), AbstractC2010b.n(value));
    }

    @Override // ch.y
    public boolean isEmpty() {
        return this.f15997a.isEmpty();
    }

    @Override // ch.y
    public Set names() {
        Set names = this.f15997a.names();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(names, 10));
        Iterator it = names.iterator();
        while (it.hasNext()) {
            arrayList.add(AbstractC2010b.k((String) it.next(), 0, 0, false, null, 15, null));
        }
        return CollectionsKt.toSet(arrayList);
    }
}
