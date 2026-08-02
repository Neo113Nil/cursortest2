package ee0;

import de0.C6193b;
import fe0.C6547a;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.mapsdk.common.clustercontroller.corecluster.clustering.algo.Algorithm;
import we0.k;

/* loaded from: classes3.dex */
public final class j implements de0.e {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final fe0.i f62214a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final HashMap<String, C6547a<?>> f62215b;

    public j(@NotNull fe0.i placemarkClusterizerFactory) {
        Intrinsics.checkNotNullParameter(placemarkClusterizerFactory, "placemarkClusterizerFactory");
        this.f62214a = placemarkClusterizerFactory;
        this.f62215b = new HashMap<>();
    }

    @Override // de0.e
    public final void a(@NotNull String id2) {
        Intrinsics.checkNotNullParameter(id2, "id");
        HashMap<String, C6547a<?>> hashMap = this.f62215b;
        C6547a<?> c6547a = hashMap.get(id2);
        if (c6547a != null) {
            c6547a.x();
        }
        hashMap.remove(id2);
    }

    @Override // de0.e
    @NotNull
    public final List<de0.d> b() {
        Collection<C6547a<?>> values = this.f62215b.values();
        Intrinsics.checkNotNullExpressionValue(values, "<get-values>(...)");
        return C7714v.U0(values);
    }

    @Override // de0.e
    @NotNull
    public final C6547a c(@NotNull Function2 clusterView, @NotNull k options, @NotNull Algorithm algorithm, @NotNull C6193b clusterizerMode) {
        Intrinsics.checkNotNullParameter(clusterView, "clusterView");
        Intrinsics.checkNotNullParameter(options, "options");
        Intrinsics.checkNotNullParameter(algorithm, "algorithm");
        Intrinsics.checkNotNullParameter(clusterizerMode, "clusterizerMode");
        C6547a<?> a11 = this.f62214a.a(clusterView, options, algorithm, clusterizerMode);
        this.f62215b.put(a11.getId(), a11);
        return a11;
    }

    public final void d() {
        HashMap<String, C6547a<?>> hashMap = this.f62215b;
        Set<Map.Entry<String, C6547a<?>>> entrySet = hashMap.entrySet();
        Intrinsics.checkNotNullExpressionValue(entrySet, "<get-entries>(...)");
        Iterator<T> it = entrySet.iterator();
        while (it.hasNext()) {
            ((C6547a) ((Map.Entry) it.next()).getValue()).x();
        }
        hashMap.clear();
    }
}
