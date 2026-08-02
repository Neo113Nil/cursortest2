package ru.ozon.android.messenger.framework.presentation.common.view.recycler;

import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kd.C7665d;
import kotlin.collections.C7714v;
import kotlin.collections.F;
import kotlin.collections.U;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import kotlin.ranges.IntRange;
import kotlin.sequences.C7743c;
import kotlin.sequences.C7748h;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes10.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final ru.ozon.android.messenger.framework.data.b f91223a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final Context f91224b;

    public static final class a extends AbstractC7737t implements Function1<Object, Boolean> {

        /* renamed from: b, reason: collision with root package name */
        public static final a f91225b = new a(1);

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(Object obj) {
            return Boolean.valueOf(obj instanceof ru.ozon.android.messenger.framework.core.viewmapper.a);
        }
    }

    static final class b extends AbstractC7737t implements Function1<ru.ozon.android.messenger.framework.presentation.models.e, Integer> {

        /* renamed from: b, reason: collision with root package name */
        public static final b f91226b = new b(1);

        @Override // kotlin.jvm.functions.Function1
        public final Integer invoke(ru.ozon.android.messenger.framework.presentation.models.e eVar) {
            ru.ozon.android.messenger.framework.presentation.models.e it = eVar;
            Intrinsics.checkNotNullParameter(it, "it");
            return Integer.valueOf(it.d());
        }
    }

    static final class c extends AbstractC7737t implements Function1<ru.ozon.android.messenger.framework.presentation.models.e, List<? extends ru.ozon.android.messenger.framework.core.viewmapper.d<?, ? extends ru.ozon.android.messenger.framework.presentation.models.g>>> {
        c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final List<? extends ru.ozon.android.messenger.framework.core.viewmapper.d<?, ? extends ru.ozon.android.messenger.framework.presentation.models.g>> invoke(ru.ozon.android.messenger.framework.presentation.models.e eVar) {
            ru.ozon.android.messenger.framework.presentation.models.e it = eVar;
            Intrinsics.checkNotNullParameter(it, "it");
            return g.this.f91223a.b(it.d());
        }
    }

    static final class d extends AbstractC7737t implements Function1<ru.ozon.android.messenger.framework.core.viewmapper.a<?, ?, ?>, List<? extends RecyclerView.n>> {
        d() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final List<? extends RecyclerView.n> invoke(ru.ozon.android.messenger.framework.core.viewmapper.a<?, ?, ?> aVar) {
            ru.ozon.android.messenger.framework.core.viewmapper.a<?, ?, ?> it = aVar;
            Intrinsics.checkNotNullParameter(it, "it");
            return it.getDecorators(g.this.f91224b);
        }
    }

    static final class e extends AbstractC7737t implements Function1<RecyclerView.n, String> {

        /* renamed from: b, reason: collision with root package name */
        public static final e f91229b = new e(1);

        @Override // kotlin.jvm.functions.Function1
        public final String invoke(RecyclerView.n nVar) {
            RecyclerView.n decorator = nVar;
            Intrinsics.checkNotNullParameter(decorator, "decorator");
            return N.b(decorator.getClass()).B();
        }
    }

    public g(@NotNull Context context, @NotNull ru.ozon.android.messenger.framework.data.b blockStore) {
        Intrinsics.checkNotNullParameter(blockStore, "blockStore");
        Intrinsics.checkNotNullParameter(context, "context");
        this.f91223a = blockStore;
        this.f91224b = context;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void c(@NotNull RecyclerView recyclerView, @NotNull List blocks) {
        e eVar;
        Intrinsics.checkNotNullParameter(blocks, "blocks");
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        F w11 = C7714v.w(blocks);
        Intrinsics.checkNotNullParameter(w11, "<this>");
        b selector = b.f91226b;
        Intrinsics.checkNotNullParameter(selector, "selector");
        C7748h o11 = kotlin.sequences.l.o(kotlin.sequences.l.v(kotlin.sequences.l.h(kotlin.sequences.l.v(new C7743c(w11, selector), new c()), a.f91225b), new d()));
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it = o11.iterator();
        while (true) {
            C7748h.a aVar = (C7748h.a) it;
            boolean hasNext = aVar.hasNext();
            eVar = e.f91229b;
            if (!hasNext) {
                break;
            }
            Object next = aVar.next();
            linkedHashMap.put(eVar.invoke(next), next);
        }
        IntRange o12 = kotlin.ranges.h.o(0, recyclerView.getItemDecorationCount());
        ArrayList arrayList = new ArrayList(C7714v.z(o12, 10));
        C7665d it2 = o12.iterator();
        while (it2.hasNext()) {
            arrayList.add(recyclerView.getItemDecorationAt(it2.b()));
        }
        int h11 = U.h(C7714v.z(arrayList, 10));
        if (h11 < 16) {
            h11 = 16;
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(h11);
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            Object next2 = it3.next();
            linkedHashMap2.put(eVar.invoke(next2), next2);
        }
        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            if (!linkedHashMap2.keySet().contains((String) entry.getKey())) {
                linkedHashMap3.put(entry.getKey(), entry.getValue());
            }
        }
        Iterator it4 = linkedHashMap3.values().iterator();
        while (it4.hasNext()) {
            recyclerView.addItemDecoration((RecyclerView.n) it4.next());
        }
    }
}
