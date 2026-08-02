package ce;

import Bd.InterfaceC2627a;
import ce.l;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import je.N;
import kotlin.Pair;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import se.C9671a;
import td.InterfaceC9835a;
import td.InterfaceC9845k;
import td.c0;

/* loaded from: classes10.dex */
public final class y extends AbstractC5814a {

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final l f57064b;

    public static final class a {
        @NotNull
        public static l a(@NotNull String debugName, @NotNull Collection types) {
            Intrinsics.checkNotNullParameter(debugName, "message");
            Intrinsics.checkNotNullParameter(types, "types");
            Collection collection = types;
            ArrayList arrayList = new ArrayList(C7714v.z(collection, 10));
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                arrayList.add(((N) it.next()).p());
            }
            te.h scopes = C9671a.b(arrayList);
            Intrinsics.checkNotNullParameter(debugName, "debugName");
            Intrinsics.checkNotNullParameter(scopes, "scopes");
            int size = scopes.size();
            l c5815b = size != 0 ? size != 1 ? new C5815b(debugName, (l[]) scopes.toArray(new l[0])) : (l) scopes.get(0) : l.b.f57046b;
            return scopes.size() <= 1 ? c5815b : new y(c5815b);
        }
    }

    public y(l lVar) {
        this.f57064b = lVar;
    }

    @Override // ce.AbstractC5814a, ce.l
    @NotNull
    public final Collection b(@NotNull Sd.f name, @NotNull Bd.c location) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(location, "location");
        return Vd.w.a(super.b(name, location), w.f57062a);
    }

    @Override // ce.AbstractC5814a, ce.o
    @NotNull
    public final Collection<InterfaceC9845k> e(@NotNull d kindFilter, @NotNull Function1<? super Sd.f, Boolean> nameFilter) {
        Intrinsics.checkNotNullParameter(kindFilter, "kindFilter");
        Intrinsics.checkNotNullParameter(nameFilter, "nameFilter");
        Collection<InterfaceC9845k> e11 = super.e(kindFilter, nameFilter);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : e11) {
            if (((InterfaceC9845k) obj) instanceof InterfaceC9835a) {
                arrayList.add(obj);
            } else {
                arrayList2.add(obj);
            }
        }
        Pair pair = new Pair(arrayList, arrayList2);
        List list = (List) pair.a();
        List list2 = (List) pair.b();
        Intrinsics.g(list, "null cannot be cast to non-null type kotlin.collections.Collection<org.jetbrains.kotlin.descriptors.CallableDescriptor>");
        return C7714v.p0(list2, Vd.w.a(list, x.f57063a));
    }

    @Override // ce.AbstractC5814a, ce.l
    @NotNull
    public final Collection<c0> g(@NotNull Sd.f name, @NotNull InterfaceC2627a location) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(location, "location");
        return Vd.w.a(super.g(name, location), v.f57061a);
    }

    @Override // ce.AbstractC5814a
    @NotNull
    protected final l i() {
        return this.f57064b;
    }
}
