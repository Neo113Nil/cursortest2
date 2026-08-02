package ce;

import Bd.InterfaceC2627a;
import ie.InterfaceC7061j;
import java.util.Collection;
import java.util.List;
import kotlin.collections.C7714v;
import kotlin.collections.K;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.E;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import org.jetbrains.annotations.NotNull;
import td.EnumC9840f;
import td.InterfaceC9831W;
import td.InterfaceC9842h;
import td.c0;

/* loaded from: classes10.dex */
public final class r extends m {

    /* renamed from: f, reason: collision with root package name */
    static final /* synthetic */ kotlin.reflect.m<Object>[] f57049f = {N.h(new E(N.b(r.class), "functions", "getFunctions()Ljava/util/List;")), N.h(new E(N.b(r.class), "properties", "getProperties()Ljava/util/List;"))};

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final he.n f57050b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f57051c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final InterfaceC7061j f57052d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final InterfaceC7061j f57053e;

    public r(@NotNull ie.o storageManager, @NotNull he.n containingClass, boolean z11) {
        Intrinsics.checkNotNullParameter(storageManager, "storageManager");
        Intrinsics.checkNotNullParameter(containingClass, "containingClass");
        this.f57050b = containingClass;
        this.f57051c = z11;
        EnumC9840f enumC9840f = EnumC9840f.CLASS;
        this.f57052d = storageManager.a(new p(this));
        this.f57053e = storageManager.a(new q(this));
    }

    static List h(r rVar) {
        return C7714v.b0(Vd.h.f(rVar.f57050b), Vd.h.g(rVar.f57050b));
    }

    static List i(r rVar) {
        return rVar.f57051c ? C7714v.c0(Vd.h.e(rVar.f57050b)) : K.f71697a;
    }

    @Override // ce.m, ce.l
    @NotNull
    public final Collection b(@NotNull Sd.f name, @NotNull Bd.c location) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(location, "location");
        List list = (List) ie.n.a(this.f57053e, f57049f[1]);
        te.h hVar = new te.h();
        for (Object obj : list) {
            if (Intrinsics.d(((InterfaceC9831W) obj).getName(), name)) {
                hVar.add(obj);
            }
        }
        return hVar;
    }

    @Override // ce.m, ce.o
    public final InterfaceC9842h d(Sd.f name, InterfaceC2627a location) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(location, "location");
        return null;
    }

    @Override // ce.m, ce.o
    public final Collection e(d kindFilter, Function1 nameFilter) {
        Intrinsics.checkNotNullParameter(kindFilter, "kindFilter");
        Intrinsics.checkNotNullParameter(nameFilter, "nameFilter");
        kotlin.reflect.m<Object>[] mVarArr = f57049f;
        return C7714v.p0((List) ie.n.a(this.f57053e, mVarArr[1]), (List) ie.n.a(this.f57052d, mVarArr[0]));
    }

    @Override // ce.m, ce.l
    public final Collection g(Sd.f name, InterfaceC2627a location) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(location, "location");
        List list = (List) ie.n.a(this.f57052d, f57049f[0]);
        te.h hVar = new te.h();
        for (Object obj : list) {
            if (Intrinsics.d(((c0) obj).getName(), name)) {
                hVar.add(obj);
            }
        }
        return hVar;
    }
}
