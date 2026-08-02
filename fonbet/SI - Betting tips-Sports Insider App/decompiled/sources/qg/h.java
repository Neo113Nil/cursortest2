package qg;

import a2.q;
import bg.p;
import gf.t;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IndexedValue;
import kotlin.collections.n0;
import kotlin.collections.v;
import kotlin.jvm.internal.Intrinsics;
import sg.s0;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes3.dex */
public final class h implements g, sg.k {

    /* renamed from: a, reason: collision with root package name */
    public final String f22165a;

    /* renamed from: b, reason: collision with root package name */
    public final a.a f22166b;

    /* renamed from: c, reason: collision with root package name */
    public final int f22167c;

    /* renamed from: d, reason: collision with root package name */
    public final List f22168d;

    /* renamed from: e, reason: collision with root package name */
    public final HashSet f22169e;

    /* renamed from: f, reason: collision with root package name */
    public final String[] f22170f;

    /* renamed from: g, reason: collision with root package name */
    public final g[] f22171g;

    /* renamed from: h, reason: collision with root package name */
    public final List[] f22172h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean[] f22173i;
    public final Map j;

    /* renamed from: k, reason: collision with root package name */
    public final g[] f22174k;

    /* renamed from: l, reason: collision with root package name */
    public final t f22175l;

    public h(String serialName, a.a kind, int i5, List typeParameters, a builder) {
        Intrinsics.checkNotNullParameter(serialName, "serialName");
        Intrinsics.checkNotNullParameter(kind, "kind");
        Intrinsics.checkNotNullParameter(typeParameters, "typeParameters");
        Intrinsics.checkNotNullParameter(builder, "builder");
        this.f22165a = serialName;
        this.f22166b = kind;
        this.f22167c = i5;
        this.f22168d = builder.f22146b;
        ArrayList arrayList = builder.f22147c;
        this.f22169e = CollectionsKt.U(arrayList);
        String[] strArr = (String[]) arrayList.toArray(new String[0]);
        this.f22170f = strArr;
        this.f22171g = s0.c(builder.f22149e);
        this.f22172h = (List[]) builder.f22150f.toArray(new List[0]);
        this.f22173i = CollectionsKt.T(builder.f22151g);
        Intrinsics.checkNotNullParameter(strArr, "<this>");
        p pVar = new p(new q(24, strArr));
        ArrayList arrayList2 = new ArrayList(v.k(pVar, 10));
        Iterator it = pVar.iterator();
        while (true) {
            bg.b bVar = (bg.b) it;
            if (!bVar.f3199b.hasNext()) {
                this.j = n0.h(arrayList2);
                this.f22174k = s0.c(typeParameters);
                this.f22175l = gf.k.b(new me.a(13, this));
                return;
            }
            IndexedValue indexedValue = (IndexedValue) bVar.next();
            arrayList2.add(new Pair(indexedValue.f19196b, Integer.valueOf(indexedValue.f19195a)));
        }
    }

    @Override // qg.g
    public final String a() {
        return this.f22165a;
    }

    @Override // sg.k
    public final Set b() {
        return this.f22169e;
    }

    @Override // qg.g
    public final boolean c() {
        return false;
    }

    @Override // qg.g
    public final int d(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        Integer num = (Integer) this.j.get(name);
        if (num != null) {
            return num.intValue();
        }
        return -3;
    }

    @Override // qg.g
    public final a.a e() {
        return this.f22166b;
    }

    public final boolean equals(Object obj) {
        int i5;
        if (this == obj) {
            return true;
        }
        if (obj instanceof h) {
            g gVar = (g) obj;
            if (Intrinsics.areEqual(this.f22165a, gVar.a()) && Arrays.equals(this.f22174k, ((h) obj).f22174k)) {
                int f6 = gVar.f();
                int i10 = this.f22167c;
                if (i10 == f6) {
                    for (0; i5 < i10; i5 + 1) {
                        g[] gVarArr = this.f22171g;
                        i5 = (Intrinsics.areEqual(gVarArr[i5].a(), gVar.i(i5).a()) && Intrinsics.areEqual(gVarArr[i5].e(), gVar.i(i5).e())) ? i5 + 1 : 0;
                    }
                    return true;
                }
            }
        }
        return false;
    }

    @Override // qg.g
    public final int f() {
        return this.f22167c;
    }

    @Override // qg.g
    public final String g(int i5) {
        return this.f22170f[i5];
    }

    @Override // qg.g
    public final List getAnnotations() {
        return this.f22168d;
    }

    @Override // qg.g
    public final List h(int i5) {
        return this.f22172h[i5];
    }

    public final int hashCode() {
        return ((Number) this.f22175l.getValue()).intValue();
    }

    @Override // qg.g
    public final g i(int i5) {
        return this.f22171g[i5];
    }

    @Override // qg.g
    public final boolean isInline() {
        return false;
    }

    @Override // qg.g
    public final boolean j(int i5) {
        return this.f22173i[i5];
    }

    public final String toString() {
        return s0.h(this);
    }
}
