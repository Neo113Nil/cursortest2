package ce;

import Bd.InterfaceC2627a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Set;
import kotlin.collections.K;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import td.InterfaceC9839e;
import td.InterfaceC9842h;
import td.InterfaceC9843i;
import td.InterfaceC9845k;
import td.h0;

/* loaded from: classes.dex */
public final class h extends m {

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final l f57039b;

    public h(@NotNull l workerScope) {
        Intrinsics.checkNotNullParameter(workerScope, "workerScope");
        this.f57039b = workerScope;
    }

    @Override // ce.m, ce.l
    @NotNull
    public final Set<Sd.f> a() {
        return this.f57039b.a();
    }

    @Override // ce.m, ce.l
    @NotNull
    public final Set<Sd.f> c() {
        return this.f57039b.c();
    }

    @Override // ce.m, ce.o
    public final InterfaceC9842h d(@NotNull Sd.f name, @NotNull InterfaceC2627a location) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(location, "location");
        InterfaceC9842h d11 = this.f57039b.d(name, location);
        if (d11 != null) {
            InterfaceC9839e interfaceC9839e = d11 instanceof InterfaceC9839e ? (InterfaceC9839e) d11 : null;
            if (interfaceC9839e != null) {
                return interfaceC9839e;
            }
            if (d11 instanceof h0) {
                return (h0) d11;
            }
        }
        return null;
    }

    @Override // ce.m, ce.o
    public final Collection e(d kindFilter, Function1 nameFilter) {
        int i11;
        Collection collection;
        Intrinsics.checkNotNullParameter(kindFilter, "kindFilter");
        Intrinsics.checkNotNullParameter(nameFilter, "nameFilter");
        i11 = d.f57021k;
        d n11 = kindFilter.n(i11);
        if (n11 == null) {
            collection = K.f71697a;
        } else {
            Collection<InterfaceC9845k> e11 = this.f57039b.e(n11, nameFilter);
            ArrayList arrayList = new ArrayList();
            for (Object obj : e11) {
                if (obj instanceof InterfaceC9843i) {
                    arrayList.add(obj);
                }
            }
            collection = arrayList;
        }
        return collection;
    }

    @Override // ce.m, ce.l
    public final Set<Sd.f> f() {
        return this.f57039b.f();
    }

    @NotNull
    public final String toString() {
        return "Classes from " + this.f57039b;
    }
}
