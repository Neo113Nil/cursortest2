package wd;

import ce.C5815b;
import ce.l;
import ie.C7056e;
import ie.InterfaceC7061j;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import td.C9825P;
import td.InterfaceC9820K;
import td.InterfaceC9827S;
import td.InterfaceC9845k;
import td.InterfaceC9847m;
import ud.InterfaceC10030h;

/* renamed from: wd.E, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10513E extends r implements InterfaceC9827S {

    /* renamed from: h, reason: collision with root package name */
    static final /* synthetic */ kotlin.reflect.m<Object>[] f104175h = {kotlin.jvm.internal.N.h(new kotlin.jvm.internal.E(kotlin.jvm.internal.N.b(C10513E.class), "fragments", "getFragments()Ljava/util/List;")), kotlin.jvm.internal.N.h(new kotlin.jvm.internal.E(kotlin.jvm.internal.N.b(C10513E.class), "empty", "getEmpty()Z"))};

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final L f104176c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final Sd.c f104177d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final InterfaceC7061j f104178e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final InterfaceC7061j f104179f;

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private final ce.j f104180g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10513E(@NotNull L module, @NotNull Sd.c fqName, @NotNull C7056e storageManager) {
        super(InterfaceC10030h.a.b(), fqName.h());
        Intrinsics.checkNotNullParameter(module, "module");
        Intrinsics.checkNotNullParameter(fqName, "fqName");
        Intrinsics.checkNotNullParameter(storageManager, "storageManager");
        this.f104176c = module;
        this.f104177d = fqName;
        this.f104178e = storageManager.a(new C10510B(this));
        this.f104179f = storageManager.a(new C10511C(this));
        this.f104180g = new ce.j(storageManager, new C10512D(this));
    }

    static boolean C0(C10513E c10513e) {
        return C9825P.b(c10513e.f104176c.F0(), c10513e.f104177d);
    }

    static ce.l F0(C10513E c10513e) {
        if (c10513e.isEmpty()) {
            return l.b.f57046b;
        }
        List<InterfaceC9820K> M11 = c10513e.M();
        ArrayList arrayList = new ArrayList(C7714v.z(M11, 10));
        Iterator<T> it = M11.iterator();
        while (it.hasNext()) {
            arrayList.add(((InterfaceC9820K) it.next()).p());
        }
        L l11 = c10513e.f104176c;
        Sd.c cVar = c10513e.f104177d;
        return C5815b.a.a(C7714v.q0(new W(l11, cVar), arrayList), "package view scope for " + cVar + " in " + l11.getName());
    }

    static ArrayList n0(C10513E c10513e) {
        return C9825P.c(c10513e.f104176c.F0(), c10513e.f104177d);
    }

    @Override // td.InterfaceC9827S
    public final L A0() {
        return this.f104176c;
    }

    @Override // td.InterfaceC9827S
    @NotNull
    public final List<InterfaceC9820K> M() {
        return (List) ie.n.a(this.f104178e, f104175h[0]);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // td.InterfaceC9845k
    public final <R, D> R X(@NotNull InterfaceC9847m<R, D> visitor, D d11) {
        Intrinsics.checkNotNullParameter(visitor, "visitor");
        return (R) visitor.h(this, (StringBuilder) d11);
    }

    @Override // td.InterfaceC9827S
    @NotNull
    public final Sd.c c() {
        return this.f104177d;
    }

    @Override // td.InterfaceC9845k
    public final InterfaceC9845k d() {
        Sd.c cVar = this.f104177d;
        if (cVar.d()) {
            return null;
        }
        Sd.c e11 = cVar.e();
        Intrinsics.checkNotNullExpressionValue(e11, "parent(...)");
        return this.f104176c.v(e11);
    }

    public final boolean equals(Object obj) {
        InterfaceC9827S interfaceC9827S = obj instanceof InterfaceC9827S ? (InterfaceC9827S) obj : null;
        if (interfaceC9827S == null) {
            return false;
        }
        if (Intrinsics.d(this.f104177d, interfaceC9827S.c())) {
            return Intrinsics.d(this.f104176c, interfaceC9827S.A0());
        }
        return false;
    }

    public final int hashCode() {
        return this.f104177d.hashCode() + (this.f104176c.hashCode() * 31);
    }

    @Override // td.InterfaceC9827S
    public final boolean isEmpty() {
        return ((Boolean) ie.n.a(this.f104179f, f104175h[1])).booleanValue();
    }

    @Override // td.InterfaceC9827S
    @NotNull
    public final ce.l p() {
        return this.f104180g;
    }
}
