package ce;

import Bd.InterfaceC2627a;
import Sc.InterfaceC4008j;
import ce.o;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import je.B0;
import je.F0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import td.InterfaceC9842h;
import td.InterfaceC9845k;
import td.c0;
import td.f0;

/* loaded from: classes.dex */
public final class u implements l {

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final l f57056b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j f57057c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final F0 f57058d;

    /* renamed from: e, reason: collision with root package name */
    private HashMap f57059e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j f57060f;

    public u(@NotNull l workerScope, @NotNull F0 givenSubstitutor) {
        Intrinsics.checkNotNullParameter(workerScope, "workerScope");
        Intrinsics.checkNotNullParameter(givenSubstitutor, "givenSubstitutor");
        this.f57056b = workerScope;
        this.f57057c = Sc.k.b(new s(givenSubstitutor));
        B0 h11 = givenSubstitutor.h();
        Intrinsics.checkNotNullExpressionValue(h11, "getSubstitution(...)");
        this.f57058d = Wd.f.c(h11).c();
        this.f57060f = Sc.k.b(new t(this));
    }

    static Collection h(u uVar) {
        return uVar.i(o.a.a(uVar.f57056b, null, 3));
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final <D extends InterfaceC9845k> Collection<D> i(Collection<? extends D> collection) {
        if (this.f57058d.i() || collection.isEmpty()) {
            return collection;
        }
        int size = collection.size();
        LinkedHashSet linkedHashSet = new LinkedHashSet(size >= 3 ? (size / 3) + size + 1 : 3);
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            linkedHashSet.add(j((InterfaceC9845k) it.next()));
        }
        return linkedHashSet;
    }

    private final <D extends InterfaceC9845k> D j(D d11) {
        F0 f02 = this.f57058d;
        if (f02.i()) {
            return d11;
        }
        if (this.f57059e == null) {
            this.f57059e = new HashMap();
        }
        HashMap hashMap = this.f57059e;
        Intrinsics.f(hashMap);
        Object obj = hashMap.get(d11);
        if (obj == null) {
            if (!(d11 instanceof f0)) {
                throw new IllegalStateException(("Unknown descriptor in scope: " + d11).toString());
            }
            obj = ((f0) d11).b2(f02);
            if (obj == null) {
                throw new AssertionError("We expect that no conflict should happen while substitution is guaranteed to generate invariant projection, but " + d11 + " substitution fails");
            }
            hashMap.put(d11, obj);
        }
        return (D) obj;
    }

    @Override // ce.l
    @NotNull
    public final Set<Sd.f> a() {
        return this.f57056b.a();
    }

    @Override // ce.l
    @NotNull
    public final Collection b(@NotNull Sd.f name, @NotNull Bd.c location) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(location, "location");
        return i(this.f57056b.b(name, location));
    }

    @Override // ce.l
    @NotNull
    public final Set<Sd.f> c() {
        return this.f57056b.c();
    }

    @Override // ce.o
    public final InterfaceC9842h d(@NotNull Sd.f name, @NotNull InterfaceC2627a location) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(location, "location");
        InterfaceC9842h d11 = this.f57056b.d(name, location);
        if (d11 != null) {
            return (InterfaceC9842h) j(d11);
        }
        return null;
    }

    @Override // ce.o
    @NotNull
    public final Collection<InterfaceC9845k> e(@NotNull d kindFilter, @NotNull Function1<? super Sd.f, Boolean> nameFilter) {
        Intrinsics.checkNotNullParameter(kindFilter, "kindFilter");
        Intrinsics.checkNotNullParameter(nameFilter, "nameFilter");
        return (Collection) this.f57060f.getValue();
    }

    @Override // ce.l
    public final Set<Sd.f> f() {
        return this.f57056b.f();
    }

    @Override // ce.l
    @NotNull
    public final Collection<? extends c0> g(@NotNull Sd.f name, @NotNull InterfaceC2627a location) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(location, "location");
        return i(this.f57056b.g(name, location));
    }
}
