package ch;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes3.dex */
public abstract class z implements y {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f27853a;

    /* renamed from: b, reason: collision with root package name */
    public final Map f27854b;

    public static final class a extends Lambda implements Function2 {
        public a() {
            super(2);
        }

        public final void a(String name, List values) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(values, "values");
            z.this.e(name, values);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((String) obj, (List) obj2);
            return Unit.INSTANCE;
        }
    }

    public static final class b extends Lambda implements Function2 {
        public b() {
            super(2);
        }

        public final void a(String name, List values) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(values, "values");
            z.this.h(name, values);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((String) obj, (List) obj2);
            return Unit.INSTANCE;
        }
    }

    public z(boolean z10, int i10) {
        this.f27853a = z10;
        this.f27854b = z10 ? m.a() : new LinkedHashMap(i10);
    }

    @Override // ch.y
    public Set a() {
        return l.a(this.f27854b.entrySet());
    }

    @Override // ch.y
    public final boolean b() {
        return this.f27853a;
    }

    @Override // ch.y
    public List c(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return (List) this.f27854b.get(name);
    }

    @Override // ch.y
    public void clear() {
        this.f27854b.clear();
    }

    @Override // ch.y
    public boolean contains(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return this.f27854b.containsKey(name);
    }

    @Override // ch.y
    public void d(x stringValues) {
        Intrinsics.checkNotNullParameter(stringValues, "stringValues");
        stringValues.d(new a());
    }

    @Override // ch.y
    public void e(String name, Iterable values) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(values, "values");
        List i10 = i(name);
        Iterator it = values.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            o(str);
            i10.add(str);
        }
    }

    @Override // ch.y
    public void f(String name, String value) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(value, "value");
        o(value);
        i(name).add(value);
    }

    public void g(x stringValues) {
        Intrinsics.checkNotNullParameter(stringValues, "stringValues");
        stringValues.d(new b());
    }

    public void h(String name, Iterable values) {
        Set emptySet;
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(values, "values");
        List list = (List) this.f27854b.get(name);
        if (list == null || (emptySet = CollectionsKt.toSet(list)) == null) {
            emptySet = SetsKt.emptySet();
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : values) {
            if (!emptySet.contains((String) obj)) {
                arrayList.add(obj);
            }
        }
        e(name, arrayList);
    }

    public final List i(String str) {
        List list = (List) this.f27854b.get(str);
        if (list != null) {
            return list;
        }
        ArrayList arrayList = new ArrayList();
        n(str);
        this.f27854b.put(str, arrayList);
        return arrayList;
    }

    @Override // ch.y
    public boolean isEmpty() {
        return this.f27854b.isEmpty();
    }

    public String j(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        List c10 = c(name);
        if (c10 != null) {
            return (String) CollectionsKt.firstOrNull(c10);
        }
        return null;
    }

    public final Map k() {
        return this.f27854b;
    }

    public void l(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        this.f27854b.remove(name);
    }

    public void m(String name, String value) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(value, "value");
        o(value);
        List i10 = i(name);
        i10.clear();
        i10.add(value);
    }

    public void n(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
    }

    @Override // ch.y
    public Set names() {
        return this.f27854b.keySet();
    }

    public void o(String value) {
        Intrinsics.checkNotNullParameter(value, "value");
    }
}
