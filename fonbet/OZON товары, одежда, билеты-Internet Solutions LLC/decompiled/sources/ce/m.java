package ce;

import Bd.InterfaceC2627a;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.collections.K;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import td.InterfaceC9842h;
import td.InterfaceC9845k;
import td.c0;

/* loaded from: classes.dex */
public abstract class m implements l {
    @Override // ce.l
    @NotNull
    public Set<Sd.f> a() {
        Collection<InterfaceC9845k> e11 = e(d.f57025o, te.g.a());
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (Object obj : e11) {
            if (obj instanceof c0) {
                Sd.f name = ((c0) obj).getName();
                Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
                linkedHashSet.add(name);
            }
        }
        return linkedHashSet;
    }

    @Override // ce.l
    @NotNull
    public Collection b(@NotNull Sd.f name, @NotNull Bd.c location) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(location, "location");
        return K.f71697a;
    }

    @Override // ce.l
    @NotNull
    public Set<Sd.f> c() {
        Collection<InterfaceC9845k> e11 = e(d.f57026p, te.g.a());
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (Object obj : e11) {
            if (obj instanceof c0) {
                Sd.f name = ((c0) obj).getName();
                Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
                linkedHashSet.add(name);
            }
        }
        return linkedHashSet;
    }

    @Override // ce.o
    public InterfaceC9842h d(@NotNull Sd.f name, @NotNull InterfaceC2627a location) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(location, "location");
        return null;
    }

    @Override // ce.o
    @NotNull
    public Collection<InterfaceC9845k> e(@NotNull d kindFilter, @NotNull Function1<? super Sd.f, Boolean> nameFilter) {
        Intrinsics.checkNotNullParameter(kindFilter, "kindFilter");
        Intrinsics.checkNotNullParameter(nameFilter, "nameFilter");
        return K.f71697a;
    }

    @Override // ce.l
    public Set<Sd.f> f() {
        return null;
    }

    @Override // ce.l
    @NotNull
    public Collection<? extends c0> g(@NotNull Sd.f name, @NotNull InterfaceC2627a location) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(location, "location");
        return K.f71697a;
    }
}
