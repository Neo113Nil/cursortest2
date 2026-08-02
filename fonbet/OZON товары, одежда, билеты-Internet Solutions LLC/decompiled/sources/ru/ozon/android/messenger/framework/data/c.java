package ru.ozon.android.messenger.framework.data;

import Lm0.a;
import android.util.SparseArray;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes10.dex */
public final class c implements b {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final HashMap<String, ru.ozon.android.messenger.framework.core.a> f87378a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final SparseArray<List<ru.ozon.android.messenger.framework.core.viewmapper.d<? extends Object, ? extends ru.ozon.android.messenger.framework.presentation.models.g>>> f87379b;

    public c(@NotNull Set<ru.ozon.android.messenger.framework.core.a> blocks) {
        Intrinsics.checkNotNullParameter(blocks, "blocks");
        this.f87378a = new HashMap<>();
        this.f87379b = new SparseArray<>();
        d(blocks);
        Lm0.a.f17149a.d("append blocks to blockStore " + this, new Object[0]);
    }

    @Override // ru.ozon.android.messenger.framework.data.b
    public final int a(List<? extends ru.ozon.android.messenger.framework.core.viewmapper.d<? extends Object, ? extends ru.ozon.android.messenger.framework.presentation.models.g>> list) {
        SparseArray<List<ru.ozon.android.messenger.framework.core.viewmapper.d<? extends Object, ? extends ru.ozon.android.messenger.framework.presentation.models.g>>> sparseArray = this.f87379b;
        return sparseArray.keyAt(sparseArray.indexOfValue(list));
    }

    @Override // ru.ozon.android.messenger.framework.data.b
    public final List<ru.ozon.android.messenger.framework.core.viewmapper.d<?, ? extends ru.ozon.android.messenger.framework.presentation.models.g>> b(int i11) {
        a.b bVar = Lm0.a.f17149a;
        SparseArray<List<ru.ozon.android.messenger.framework.core.viewmapper.d<? extends Object, ? extends ru.ozon.android.messenger.framework.presentation.models.g>>> sparseArray = this.f87379b;
        bVar.d("viewMappersHashes " + sparseArray, new Object[0]);
        return sparseArray.get(i11);
    }

    @Override // ru.ozon.android.messenger.framework.data.b
    public final List<ru.ozon.android.messenger.framework.core.viewmapper.d<? extends Object, ? extends ru.ozon.android.messenger.framework.presentation.models.g>> c(@NotNull String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        ru.ozon.android.messenger.framework.core.a aVar = this.f87378a.get(key);
        if (aVar != null) {
            return aVar.c();
        }
        return null;
    }

    public final void d(@NotNull Set<ru.ozon.android.messenger.framework.core.a> blocks) {
        Intrinsics.checkNotNullParameter(blocks, "blocks");
        for (ru.ozon.android.messenger.framework.core.a aVar : blocks) {
            String vertical = aVar.b();
            String name = aVar.a();
            Intrinsics.checkNotNullParameter(vertical, "vertical");
            Intrinsics.checkNotNullParameter(name, "name");
            String c11 = G.g.c(vertical, ".", name);
            this.f87378a.put(c11, aVar);
            this.f87379b.put((c11 + "." + aVar.c().getClass().getCanonicalName()).hashCode(), aVar.c());
        }
    }
}
