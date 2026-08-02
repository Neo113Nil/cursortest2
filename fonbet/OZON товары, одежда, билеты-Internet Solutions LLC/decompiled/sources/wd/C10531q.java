package wd;

import Sc.InterfaceC3999a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import td.C9825P;
import td.InterfaceC9820K;
import td.InterfaceC9821L;
import td.InterfaceC9826Q;

/* renamed from: wd.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10531q implements InterfaceC9826Q {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final List<InterfaceC9821L> f104323a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final String f104324b;

    /* JADX WARN: Multi-variable type inference failed */
    public C10531q(@NotNull List<? extends InterfaceC9821L> providers, @NotNull String debugName) {
        Intrinsics.checkNotNullParameter(providers, "providers");
        Intrinsics.checkNotNullParameter(debugName, "debugName");
        this.f104323a = providers;
        this.f104324b = debugName;
        providers.size();
        C7714v.Y0(providers).size();
    }

    @Override // td.InterfaceC9826Q
    public final void a(@NotNull Sd.c fqName, @NotNull ArrayList packageFragments) {
        Intrinsics.checkNotNullParameter(fqName, "fqName");
        Intrinsics.checkNotNullParameter(packageFragments, "packageFragments");
        Iterator<InterfaceC9821L> it = this.f104323a.iterator();
        while (it.hasNext()) {
            C9825P.a(it.next(), fqName, packageFragments);
        }
    }

    @Override // td.InterfaceC9821L
    @InterfaceC3999a
    @NotNull
    public final List<InterfaceC9820K> b(@NotNull Sd.c fqName) {
        Intrinsics.checkNotNullParameter(fqName, "fqName");
        ArrayList arrayList = new ArrayList();
        Iterator<InterfaceC9821L> it = this.f104323a.iterator();
        while (it.hasNext()) {
            C9825P.a(it.next(), fqName, arrayList);
        }
        return C7714v.U0(arrayList);
    }

    @Override // td.InterfaceC9826Q
    public final boolean c(@NotNull Sd.c fqName) {
        Intrinsics.checkNotNullParameter(fqName, "fqName");
        List<InterfaceC9821L> list = this.f104323a;
        if ((list instanceof Collection) && list.isEmpty()) {
            return true;
        }
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            if (!C9825P.b((InterfaceC9821L) it.next(), fqName)) {
                return false;
            }
        }
        return true;
    }

    @Override // td.InterfaceC9821L
    @NotNull
    public final Collection<Sd.c> j(@NotNull Sd.c fqName, @NotNull Function1<? super Sd.f, Boolean> nameFilter) {
        Intrinsics.checkNotNullParameter(fqName, "fqName");
        Intrinsics.checkNotNullParameter(nameFilter, "nameFilter");
        HashSet hashSet = new HashSet();
        Iterator<InterfaceC9821L> it = this.f104323a.iterator();
        while (it.hasNext()) {
            hashSet.addAll(it.next().j(fqName, nameFilter));
        }
        return hashSet;
    }

    @NotNull
    public final String toString() {
        return this.f104324b;
    }
}
