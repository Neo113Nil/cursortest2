package com.detmir.recycli.adapters;

import B0.C2454a;
import android.content.Context;
import android.content.res.AssetManager;
import android.view.ViewGroup;
import androidx.annotation.Keep;
import androidx.recyclerview.widget.RecyclerView;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C7705l;
import kotlin.collections.K;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import org.jetbrains.annotations.NotNull;

@Keep
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010!\n\u0002\b\u000b\b\u0017\u0018\u0000 &2\u00020\u0001:\u0002'(B\u001b\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0012\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0012\u0010\u0013J\u001d\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0015\u0010\u001b\u001a\u00020\u00032\u0006\u0010\u001a\u001a\u00020\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ+\u0010 \u001a\u00020\u00112\u0006\u0010\u001d\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u00032\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00010\u001e¢\u0006\u0004\b \u0010!J\u001d\u0010 \u001a\u00020\u00112\u0006\u0010\u001d\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u0003¢\u0006\u0004\b \u0010\"R#\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010#\u001a\u0004\b$\u0010%¨\u0006)"}, d2 = {"Lcom/detmir/recycli/adapters/RecyclerBaseAdapter;", "", "Lkotlin/Function1;", "", "Lcom/detmir/recycli/adapters/RecyclerItem;", "getRecyclerItem", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "Landroid/content/Context;", "context", "", "", "listAssetFiles", "(Landroid/content/Context;)Ljava/util/List;", "recyclerItem", "provideStateWithView", "(Lcom/detmir/recycli/adapters/RecyclerItem;)Ljava/lang/String;", "", "warmUpBinders", "(Landroid/content/Context;)V", "Landroid/view/ViewGroup;", "parent", "viewType", "Landroidx/recyclerview/widget/RecyclerView$C;", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$C;", "position", "getItemViewType", "(I)I", "holder", "", "payloads", "onBindViewHolder", "(Landroidx/recyclerview/widget/RecyclerView$C;ILjava/util/List;)V", "(Landroidx/recyclerview/widget/RecyclerView$C;I)V", "Lkotlin/jvm/functions/Function1;", "getGetRecyclerItem", "()Lkotlin/jvm/functions/Function1;", "Companion", "a", "b", "recycli_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public class RecyclerBaseAdapter {

    @NotNull
    private static final String RECYCLI_ASSETS_PATH = "recycli";
    private static boolean warmedUp;

    @NotNull
    private final Function1<Integer, RecyclerItem> getRecyclerItem;

    @NotNull
    private static final HashMap<String, a> stateToBindersWrapped = new HashMap<>();

    @NotNull
    private static final HashMap<Integer, a> bindersToStateWrapped = new HashMap<>();

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final int f57708a;

        /* renamed from: b, reason: collision with root package name */
        private final int f57709b;

        /* renamed from: c, reason: collision with root package name */
        @NotNull
        private final RecyclerBinder f57710c;

        /* renamed from: d, reason: collision with root package name */
        private final int f57711d;

        public a(int i11, int i12, @NotNull RecyclerBinder binder, int i13) {
            Intrinsics.checkNotNullParameter(binder, "binder");
            this.f57708a = i11;
            this.f57709b = i12;
            this.f57710c = binder;
            this.f57711d = i13;
        }

        @NotNull
        public final RecyclerBinder a() {
            return this.f57710c;
        }

        public final int b() {
            return this.f57711d;
        }

        public final int c() {
            return this.f57708a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f57708a == aVar.f57708a && this.f57709b == aVar.f57709b && Intrinsics.d(this.f57710c, aVar.f57710c) && this.f57711d == aVar.f57711d;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f57711d) + ((this.f57710c.hashCode() + C2454a.a(this.f57709b, Integer.hashCode(this.f57708a) * 31, 31)) * 31);
        }

        @NotNull
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("BinderWrapped(wrappedBinderType=");
            sb2.append(this.f57708a);
            sb2.append(", bindersPosition=");
            sb2.append(this.f57709b);
            sb2.append(", binder=");
            sb2.append(this.f57710c);
            sb2.append(", type=");
            return Ek.a.d(sb2, this.f57711d, ')');
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public RecyclerBaseAdapter(@NotNull Function1<? super Integer, ? extends RecyclerItem> getRecyclerItem) {
        Intrinsics.checkNotNullParameter(getRecyclerItem, "getRecyclerItem");
        this.getRecyclerItem = getRecyclerItem;
    }

    private final List<String> listAssetFiles(Context context) {
        String[] list;
        List<String> f02;
        try {
            AssetManager assets = context.getAssets();
            if (assets != null && (list = assets.list(RECYCLI_ASSETS_PATH)) != null && (f02 = C7705l.f0(list)) != null) {
                return f02;
            }
            return K.f71697a;
        } catch (IOException unused) {
            return K.f71697a;
        }
    }

    private final String provideStateWithView(RecyclerItem recyclerItem) {
        String canonicalName = recyclerItem.getClass().getCanonicalName();
        Intrinsics.f(canonicalName);
        if (recyclerItem.withView() == null) {
            return canonicalName.concat("#default");
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(canonicalName);
        sb2.append('#');
        Class<? extends Object> withView = recyclerItem.withView();
        Intrinsics.f(withView);
        sb2.append(withView.getCanonicalName());
        return sb2.toString();
    }

    @NotNull
    public final Function1<Integer, RecyclerItem> getGetRecyclerItem() {
        return this.getRecyclerItem;
    }

    public final int getItemViewType(int position) {
        String provideStateWithView = provideStateWithView(this.getRecyclerItem.invoke(Integer.valueOf(position)));
        a aVar = stateToBindersWrapped.get(provideStateWithView);
        if (aVar != null) {
            return aVar.c();
        }
        throw new Exception(Nk.a.b("No view found for state=", provideStateWithView));
    }

    public final void onBindViewHolder(@NotNull RecyclerView.C holder, int position, @NotNull List<Object> payloads) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(payloads, "payloads");
        onBindViewHolder(holder, position);
    }

    @NotNull
    public final RecyclerView.C onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        a aVar = bindersToStateWrapped.get(Integer.valueOf(viewType));
        if (aVar != null) {
            return aVar.a().onCreateViewHolder(parent, aVar.b());
        }
        throw new Exception(Ej.b.a(viewType, "Cant find binder for a viewType="));
    }

    public final void warmUpBinders(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        if (warmedUp) {
            return;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        if (c.b()) {
            Iterator<String> it = listAssetFiles(context).iterator();
            while (it.hasNext()) {
                try {
                    Class<?> clazz = Class.forName(h.X(it.next(), "_", ".", false) + ".RecyclerBinderImpl");
                    Intrinsics.checkNotNullExpressionValue(clazz, "clazz");
                    linkedHashSet.add(clazz);
                } catch (Throwable unused) {
                }
            }
        }
        if (c.c()) {
            Iterator it2 = c.a().iterator();
            while (it2.hasNext()) {
                linkedHashSet.add((Class) it2.next());
            }
        }
        ArrayList arrayList = new ArrayList();
        Iterator it3 = linkedHashSet.iterator();
        while (it3.hasNext()) {
            Object newInstance = ((Class) it3.next()).newInstance();
            Intrinsics.g(newInstance, "null cannot be cast to non-null type com.detmir.recycli.adapters.RecyclerBinder");
            arrayList.add((RecyclerBinder) newInstance);
        }
        Iterator it4 = arrayList.iterator();
        int i11 = 1;
        while (it4.hasNext()) {
            RecyclerBinder recyclerBinder = (RecyclerBinder) it4.next();
            for (Map.Entry<String, Integer> entry : recyclerBinder.getStateToIndexMap().entrySet()) {
                a aVar = new a(entry.getValue().intValue() + (1000000 * i11), i11, recyclerBinder, entry.getValue().intValue());
                stateToBindersWrapped.put(entry.getKey(), aVar);
                bindersToStateWrapped.put(Integer.valueOf(aVar.c()), aVar);
            }
            i11++;
        }
        warmedUp = true;
    }

    public final void onBindViewHolder(@NotNull RecyclerView.C holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        RecyclerItem invoke = this.getRecyclerItem.invoke(Integer.valueOf(position));
        String provideStateWithView = provideStateWithView(invoke);
        a aVar = stateToBindersWrapped.get(provideStateWithView);
        Intrinsics.f(aVar);
        aVar.a().onBindViewHolder(holder, position, provideStateWithView, invoke);
    }
}
