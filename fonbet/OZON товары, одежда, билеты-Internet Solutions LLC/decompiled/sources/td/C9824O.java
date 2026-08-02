package td;

import Sc.InterfaceC3999a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: td.O, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C9824O implements InterfaceC9826Q {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final ArrayList f99378a;

    public C9824O(@NotNull ArrayList packageFragments) {
        Intrinsics.checkNotNullParameter(packageFragments, "packageFragments");
        this.f99378a = packageFragments;
    }

    @Override // td.InterfaceC9826Q
    public final void a(@NotNull Sd.c fqName, @NotNull ArrayList packageFragments) {
        Intrinsics.checkNotNullParameter(fqName, "fqName");
        Intrinsics.checkNotNullParameter(packageFragments, "packageFragments");
        for (Object obj : this.f99378a) {
            if (Intrinsics.d(((InterfaceC9820K) obj).c(), fqName)) {
                packageFragments.add(obj);
            }
        }
    }

    @Override // td.InterfaceC9821L
    @InterfaceC3999a
    @NotNull
    public final List<InterfaceC9820K> b(@NotNull Sd.c fqName) {
        Intrinsics.checkNotNullParameter(fqName, "fqName");
        ArrayList arrayList = this.f99378a;
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (Intrinsics.d(((InterfaceC9820K) obj).c(), fqName)) {
                arrayList2.add(obj);
            }
        }
        return arrayList2;
    }

    @Override // td.InterfaceC9826Q
    public final boolean c(@NotNull Sd.c fqName) {
        Intrinsics.checkNotNullParameter(fqName, "fqName");
        ArrayList arrayList = this.f99378a;
        if (arrayList.isEmpty()) {
            return true;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (Intrinsics.d(((InterfaceC9820K) it.next()).c(), fqName)) {
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
        return kotlin.sequences.l.C(kotlin.sequences.l.h(kotlin.sequences.l.v(C7714v.w(this.f99378a), C9822M.f99376a), new C9823N(fqName)));
    }
}
