package Uc;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public final List f12171a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    public final List f12172b = new ArrayList();

    public static final class a implements Comparator {
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return ComparisonsKt.compareValues((Integer) ((Pair) obj).getFirst(), (Integer) ((Pair) obj2).getFirst());
        }
    }

    public static final class b implements Comparator {
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return ComparisonsKt.compareValues((Integer) ((Pair) obj).getFirst(), (Integer) ((Pair) obj2).getFirst());
        }
    }

    public final void a(com.swmansion.rnscreens.gamma.stack.screen.b stackScreen) {
        Intrinsics.checkNotNullParameter(stackScreen, "stackScreen");
        this.f12172b.add(new f(stackScreen));
    }

    public final void b(com.swmansion.rnscreens.gamma.stack.screen.b stackScreen) {
        Intrinsics.checkNotNullParameter(stackScreen, "stackScreen");
        this.f12171a.add(new g(stackScreen));
    }

    public final void c(i container, List renderedScreens) {
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(renderedScreens, "renderedScreens");
        if (d()) {
            List<f> list = this.f12172b;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
            for (f fVar : list) {
                arrayList.add(new Pair(Integer.valueOf(renderedScreens.indexOf(fVar.a())), fVar));
            }
            Iterator it = CollectionsKt.asReversed(CollectionsKt.sortedWith(arrayList, new a())).iterator();
            while (it.hasNext()) {
                container.k(((f) ((Pair) it.next()).component2()).a());
            }
            List<g> list2 = this.f12171a;
            ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
            for (g gVar : list2) {
                arrayList2.add(new Pair(Integer.valueOf(renderedScreens.indexOf(gVar.a())), gVar));
            }
            Iterator it2 = CollectionsKt.sortedWith(arrayList2, new b()).iterator();
            while (it2.hasNext()) {
                container.l(((g) ((Pair) it2.next()).component2()).a());
            }
            container.n();
            this.f12172b.clear();
            this.f12171a.clear();
        }
    }

    public final boolean d() {
        return (this.f12171a.isEmpty() && this.f12172b.isEmpty()) ? false : true;
    }
}
