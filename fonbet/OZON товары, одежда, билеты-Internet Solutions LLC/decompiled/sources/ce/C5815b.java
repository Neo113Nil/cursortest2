package ce;

import Bd.InterfaceC2627a;
import ce.l;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.collections.C7705l;
import kotlin.collections.C7714v;
import kotlin.collections.K;
import kotlin.collections.M;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import se.C9671a;
import td.InterfaceC9811B;
import td.InterfaceC9842h;
import td.InterfaceC9843i;
import td.InterfaceC9845k;
import td.c0;

/* renamed from: ce.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5815b implements l {

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final String f57008b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final l[] f57009c;

    /* renamed from: ce.b$a */
    public static final class a {
        @NotNull
        public static l a(@NotNull Iterable scopes, @NotNull String debugName) {
            Intrinsics.checkNotNullParameter(debugName, "debugName");
            Intrinsics.checkNotNullParameter(scopes, "scopes");
            te.h scopes2 = new te.h();
            Iterator it = scopes.iterator();
            while (it.hasNext()) {
                l lVar = (l) it.next();
                if (lVar != l.b.f57046b) {
                    if (lVar instanceof C5815b) {
                        C7714v.r(scopes2, ((C5815b) lVar).f57009c);
                    } else {
                        scopes2.add(lVar);
                    }
                }
            }
            Intrinsics.checkNotNullParameter(debugName, "debugName");
            Intrinsics.checkNotNullParameter(scopes2, "scopes");
            int size = scopes2.size();
            return size != 0 ? size != 1 ? new C5815b(debugName, (l[]) scopes2.toArray(new l[0])) : (l) scopes2.get(0) : l.b.f57046b;
        }
    }

    public C5815b(String str, l[] lVarArr) {
        this.f57008b = str;
        this.f57009c = lVarArr;
    }

    @Override // ce.l
    @NotNull
    public final Set<Sd.f> a() {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (l lVar : this.f57009c) {
            C7714v.p(lVar.a(), linkedHashSet);
        }
        return linkedHashSet;
    }

    @Override // ce.l
    @NotNull
    public final Collection b(@NotNull Sd.f name, @NotNull Bd.c location) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(location, "location");
        l[] lVarArr = this.f57009c;
        int length = lVarArr.length;
        if (length == 0) {
            return K.f71697a;
        }
        if (length == 1) {
            return lVarArr[0].b(name, location);
        }
        Collection collection = null;
        for (l lVar : lVarArr) {
            collection = C9671a.a(collection, lVar.b(name, location));
        }
        return collection == null ? M.f71699a : collection;
    }

    @Override // ce.l
    @NotNull
    public final Set<Sd.f> c() {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (l lVar : this.f57009c) {
            C7714v.p(lVar.c(), linkedHashSet);
        }
        return linkedHashSet;
    }

    @Override // ce.o
    public final InterfaceC9842h d(@NotNull Sd.f name, @NotNull InterfaceC2627a location) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(location, "location");
        InterfaceC9842h interfaceC9842h = null;
        for (l lVar : this.f57009c) {
            InterfaceC9842h d11 = lVar.d(name, location);
            if (d11 != null) {
                if (!(d11 instanceof InterfaceC9843i) || !((InterfaceC9811B) d11).p0()) {
                    return d11;
                }
                if (interfaceC9842h == null) {
                    interfaceC9842h = d11;
                }
            }
        }
        return interfaceC9842h;
    }

    @Override // ce.o
    @NotNull
    public final Collection<InterfaceC9845k> e(@NotNull d kindFilter, @NotNull Function1<? super Sd.f, Boolean> nameFilter) {
        Intrinsics.checkNotNullParameter(kindFilter, "kindFilter");
        Intrinsics.checkNotNullParameter(nameFilter, "nameFilter");
        l[] lVarArr = this.f57009c;
        int length = lVarArr.length;
        if (length == 0) {
            return K.f71697a;
        }
        if (length == 1) {
            return lVarArr[0].e(kindFilter, nameFilter);
        }
        Collection<InterfaceC9845k> collection = null;
        for (l lVar : lVarArr) {
            collection = C9671a.a(collection, lVar.e(kindFilter, nameFilter));
        }
        return collection == null ? M.f71699a : collection;
    }

    @Override // ce.l
    public final Set<Sd.f> f() {
        return n.a(C7705l.d(this.f57009c));
    }

    @Override // ce.l
    @NotNull
    public final Collection<c0> g(@NotNull Sd.f name, @NotNull InterfaceC2627a location) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(location, "location");
        l[] lVarArr = this.f57009c;
        int length = lVarArr.length;
        if (length == 0) {
            return K.f71697a;
        }
        if (length == 1) {
            return lVarArr[0].g(name, location);
        }
        Collection<c0> collection = null;
        for (l lVar : lVarArr) {
            collection = C9671a.a(collection, lVar.g(name, location));
        }
        return collection == null ? M.f71699a : collection;
    }

    @NotNull
    public final String toString() {
        return this.f57008b;
    }
}
