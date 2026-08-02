package bi;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: bi.a, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2425a {

    /* renamed from: a, reason: collision with root package name */
    public final String f25193a;

    /* renamed from: b, reason: collision with root package name */
    public List f25194b;

    /* renamed from: c, reason: collision with root package name */
    public final List f25195c;

    /* renamed from: d, reason: collision with root package name */
    public final Set f25196d;

    /* renamed from: e, reason: collision with root package name */
    public final List f25197e;

    /* renamed from: f, reason: collision with root package name */
    public final List f25198f;

    /* renamed from: g, reason: collision with root package name */
    public final List f25199g;

    public C2425a(String serialName) {
        Intrinsics.checkNotNullParameter(serialName, "serialName");
        this.f25193a = serialName;
        this.f25194b = CollectionsKt.emptyList();
        this.f25195c = new ArrayList();
        this.f25196d = new HashSet();
        this.f25197e = new ArrayList();
        this.f25198f = new ArrayList();
        this.f25199g = new ArrayList();
    }

    public static /* synthetic */ void b(C2425a c2425a, String str, f fVar, List list, boolean z10, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            list = CollectionsKt.emptyList();
        }
        if ((i10 & 8) != 0) {
            z10 = false;
        }
        c2425a.a(str, fVar, list, z10);
    }

    public final void a(String elementName, f descriptor, List annotations, boolean z10) {
        Intrinsics.checkNotNullParameter(elementName, "elementName");
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        Intrinsics.checkNotNullParameter(annotations, "annotations");
        if (this.f25196d.add(elementName)) {
            this.f25195c.add(elementName);
            this.f25197e.add(descriptor);
            this.f25198f.add(annotations);
            this.f25199g.add(Boolean.valueOf(z10));
            return;
        }
        throw new IllegalArgumentException(("Element with name '" + elementName + "' is already registered in " + this.f25193a).toString());
    }

    public final List c() {
        return this.f25194b;
    }

    public final List d() {
        return this.f25198f;
    }

    public final List e() {
        return this.f25197e;
    }

    public final List f() {
        return this.f25195c;
    }

    public final List g() {
        return this.f25199g;
    }

    public final void h(List list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.f25194b = list;
    }
}
