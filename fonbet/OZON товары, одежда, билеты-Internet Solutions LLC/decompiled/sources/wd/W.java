package wd;

import ce.AbstractC5816c;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import td.InterfaceC9815F;
import td.InterfaceC9827S;
import td.InterfaceC9845k;
import te.C9865a;

/* loaded from: classes.dex */
public final class W extends ce.m {

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final InterfaceC9815F f104259b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final Sd.c f104260c;

    public W(@NotNull InterfaceC9815F moduleDescriptor, @NotNull Sd.c fqName) {
        Intrinsics.checkNotNullParameter(moduleDescriptor, "moduleDescriptor");
        Intrinsics.checkNotNullParameter(fqName, "fqName");
        this.f104259b = moduleDescriptor;
        this.f104260c = fqName;
    }

    @Override // ce.m, ce.o
    @NotNull
    public final Collection<InterfaceC9845k> e(@NotNull ce.d kindFilter, @NotNull Function1<? super Sd.f, Boolean> nameFilter) {
        int i11;
        Intrinsics.checkNotNullParameter(kindFilter, "kindFilter");
        Intrinsics.checkNotNullParameter(nameFilter, "nameFilter");
        i11 = ce.d.f57017g;
        if (!kindFilter.a(i11)) {
            return kotlin.collections.K.f71697a;
        }
        Sd.c cVar = this.f104260c;
        if (cVar.d() && kindFilter.l().contains(AbstractC5816c.b.f57012a)) {
            return kotlin.collections.K.f71697a;
        }
        InterfaceC9815F interfaceC9815F = this.f104259b;
        Collection<Sd.c> j11 = interfaceC9815F.j(cVar, nameFilter);
        ArrayList arrayList = new ArrayList(j11.size());
        Iterator<Sd.c> it = j11.iterator();
        while (it.hasNext()) {
            Sd.f name = it.next().g();
            Intrinsics.checkNotNullExpressionValue(name, "shortName(...)");
            if (nameFilter.invoke(name).booleanValue()) {
                Intrinsics.checkNotNullParameter(name, "name");
                InterfaceC9827S interfaceC9827S = null;
                if (!name.g()) {
                    Sd.c c11 = cVar.c(name);
                    Intrinsics.checkNotNullExpressionValue(c11, "child(...)");
                    InterfaceC9827S v11 = interfaceC9815F.v(c11);
                    if (!v11.isEmpty()) {
                        interfaceC9827S = v11;
                    }
                }
                C9865a.a(arrayList, interfaceC9827S);
            }
        }
        return arrayList;
    }

    @Override // ce.m, ce.l
    @NotNull
    public final Set<Sd.f> f() {
        return kotlin.collections.M.f71699a;
    }

    @NotNull
    public final String toString() {
        return "subpackages of " + this.f104260c + " from " + this.f104259b;
    }
}
