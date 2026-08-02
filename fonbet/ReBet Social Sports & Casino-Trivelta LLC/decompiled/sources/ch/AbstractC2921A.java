package ch;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: ch.A, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC2921A implements x {

    /* renamed from: c, reason: collision with root package name */
    public final boolean f27817c;

    /* renamed from: d, reason: collision with root package name */
    public final Map f27818d;

    public AbstractC2921A(boolean z10, Map values) {
        Intrinsics.checkNotNullParameter(values, "values");
        this.f27817c = z10;
        Map a10 = z10 ? m.a() : new LinkedHashMap();
        for (Map.Entry entry : values.entrySet()) {
            String str = (String) entry.getKey();
            List list = (List) entry.getValue();
            int size = list.size();
            ArrayList arrayList = new ArrayList(size);
            for (int i10 = 0; i10 < size; i10++) {
                arrayList.add((String) list.get(i10));
            }
            a10.put(str, arrayList);
        }
        this.f27818d = a10;
    }

    @Override // ch.x
    public Set a() {
        return l.a(this.f27818d.entrySet());
    }

    @Override // ch.x
    public final boolean b() {
        return this.f27817c;
    }

    @Override // ch.x
    public List c(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return e(name);
    }

    @Override // ch.x
    public void d(Function2 body) {
        Intrinsics.checkNotNullParameter(body, "body");
        for (Map.Entry entry : this.f27818d.entrySet()) {
            body.invoke((String) entry.getKey(), (List) entry.getValue());
        }
    }

    public final List e(String str) {
        return (List) this.f27818d.get(str);
    }

    public boolean equals(Object obj) {
        boolean d10;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x)) {
            return false;
        }
        x xVar = (x) obj;
        if (this.f27817c != xVar.b()) {
            return false;
        }
        d10 = AbstractC2922B.d(a(), xVar.a());
        return d10;
    }

    @Override // ch.x
    public String get(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        List e10 = e(name);
        if (e10 != null) {
            return (String) CollectionsKt.firstOrNull(e10);
        }
        return null;
    }

    public int hashCode() {
        int e10;
        e10 = AbstractC2922B.e(a(), Boolean.hashCode(this.f27817c) * 31);
        return e10;
    }

    @Override // ch.x
    public boolean isEmpty() {
        return this.f27818d.isEmpty();
    }

    @Override // ch.x
    public Set names() {
        return l.a(this.f27818d.keySet());
    }
}
