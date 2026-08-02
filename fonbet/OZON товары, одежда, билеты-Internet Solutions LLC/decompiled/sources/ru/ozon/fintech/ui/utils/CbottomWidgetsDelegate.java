package ru.ozon.fintech.ui.utils;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.detmir.recycli.adapters.RecyclerAdapter;
import com.detmir.recycli.adapters.RecyclerBaseAdapter;
import com.detmir.recycli.adapters.RecyclerItem;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0012B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J.\u0010\n\u001a\u00020\u000b2\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r2\u000e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r2\u0006\u0010\u0010\u001a\u00020\u0011R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lru/ozon/fintech/ui/utils/CbottomWidgetsDelegate;", "", "<init>", "()V", "recyclerAdapterRegular", "Lcom/detmir/recycli/adapters/RecyclerAdapter;", "curVHs", "", "", "Lru/ozon/fintech/ui/utils/CbottomWidgetsDelegate$ItemR;", "applyWidgets", "", "widgets", "", "Lcom/detmir/recycli/adapters/RecyclerItem;", "oldWidgets", "holder", "Landroid/view/ViewGroup;", "ItemR", "fintech-ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CbottomWidgetsDelegate {

    @NotNull
    private RecyclerAdapter recyclerAdapterRegular = new RecyclerAdapter();

    @NotNull
    private final Map<String, ItemR> curVHs = new LinkedHashMap();

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ.\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u000bJ\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\u000bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001c\u001a\u0004\b\u001d\u0010\rR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001e\u001a\u0004\b\u001f\u0010\u000f¨\u0006 "}, d2 = {"Lru/ozon/fintech/ui/utils/CbottomWidgetsDelegate$ItemR;", "", "", "id", "Lcom/detmir/recycli/adapters/RecyclerItem;", "recyclerItem", "Landroidx/recyclerview/widget/RecyclerView$C;", "viewHolder", "<init>", "(Ljava/lang/String;Lcom/detmir/recycli/adapters/RecyclerItem;Landroidx/recyclerview/widget/RecyclerView$C;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/detmir/recycli/adapters/RecyclerItem;", "component3", "()Landroidx/recyclerview/widget/RecyclerView$C;", "copy", "(Ljava/lang/String;Lcom/detmir/recycli/adapters/RecyclerItem;Landroidx/recyclerview/widget/RecyclerView$C;)Lru/ozon/fintech/ui/utils/CbottomWidgetsDelegate$ItemR;", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getId", "Lcom/detmir/recycli/adapters/RecyclerItem;", "getRecyclerItem", "Landroidx/recyclerview/widget/RecyclerView$C;", "getViewHolder", "fintech-ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ItemR {

        @NotNull
        private final String id;

        @NotNull
        private final RecyclerItem recyclerItem;

        @NotNull
        private final RecyclerView.C viewHolder;

        public ItemR(@NotNull String id2, @NotNull RecyclerItem recyclerItem, @NotNull RecyclerView.C viewHolder) {
            Intrinsics.checkNotNullParameter(id2, "id");
            Intrinsics.checkNotNullParameter(recyclerItem, "recyclerItem");
            Intrinsics.checkNotNullParameter(viewHolder, "viewHolder");
            this.id = id2;
            this.recyclerItem = recyclerItem;
            this.viewHolder = viewHolder;
        }

        public static /* synthetic */ ItemR copy$default(ItemR itemR, String str, RecyclerItem recyclerItem, RecyclerView.C c11, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = itemR.id;
            }
            if ((i11 & 2) != 0) {
                recyclerItem = itemR.recyclerItem;
            }
            if ((i11 & 4) != 0) {
                c11 = itemR.viewHolder;
            }
            return itemR.copy(str, recyclerItem, c11);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getId() {
            return this.id;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final RecyclerItem getRecyclerItem() {
            return this.recyclerItem;
        }

        @NotNull
        /* renamed from: component3, reason: from getter */
        public final RecyclerView.C getViewHolder() {
            return this.viewHolder;
        }

        @NotNull
        public final ItemR copy(@NotNull String id2, @NotNull RecyclerItem recyclerItem, @NotNull RecyclerView.C viewHolder) {
            Intrinsics.checkNotNullParameter(id2, "id");
            Intrinsics.checkNotNullParameter(recyclerItem, "recyclerItem");
            Intrinsics.checkNotNullParameter(viewHolder, "viewHolder");
            return new ItemR(id2, recyclerItem, viewHolder);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ItemR)) {
                return false;
            }
            ItemR itemR = (ItemR) other;
            return Intrinsics.d(this.id, itemR.id) && Intrinsics.d(this.recyclerItem, itemR.recyclerItem) && Intrinsics.d(this.viewHolder, itemR.viewHolder);
        }

        @NotNull
        public final String getId() {
            return this.id;
        }

        @NotNull
        public final RecyclerItem getRecyclerItem() {
            return this.recyclerItem;
        }

        @NotNull
        public final RecyclerView.C getViewHolder() {
            return this.viewHolder;
        }

        public int hashCode() {
            return this.viewHolder.hashCode() + ((this.recyclerItem.hashCode() + (this.id.hashCode() * 31)) * 31);
        }

        @NotNull
        public String toString() {
            return "ItemR(id=" + this.id + ", recyclerItem=" + this.recyclerItem + ", viewHolder=" + this.viewHolder + ")";
        }
    }

    public final void applyWidgets(List<? extends RecyclerItem> widgets, List<? extends RecyclerItem> oldWidgets, @NotNull ViewGroup holder) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        if (Intrinsics.d(widgets, oldWidgets)) {
            return;
        }
        if (widgets != null) {
            RecyclerAdapter recyclerAdapter = new RecyclerAdapter();
            this.recyclerAdapterRegular = recyclerAdapter;
            RecyclerBaseAdapter recyclerBaseAdapter = recyclerAdapter.getRecyclerBaseAdapter();
            Context context = holder.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            recyclerBaseAdapter.warmUpBinders(context);
            this.recyclerAdapterRegular.bindState(widgets);
            int i11 = 0;
            for (Object obj : widgets) {
                int i12 = i11 + 1;
                ViewGroup.LayoutParams layoutParams = null;
                if (i11 < 0) {
                    C7714v.O0();
                    throw null;
                }
                RecyclerItem recyclerItem = (RecyclerItem) obj;
                ItemR itemR = this.curVHs.get(recyclerItem.provideId());
                if (itemR != null) {
                    this.recyclerAdapterRegular.onBindViewHolder(itemR.getViewHolder(), i11);
                } else {
                    RecyclerView.C onCreateViewHolder = this.recyclerAdapterRegular.onCreateViewHolder(holder, this.recyclerAdapterRegular.getItemViewType(i11));
                    if (holder instanceof FrameLayout) {
                        layoutParams = new FrameLayout.LayoutParams(-1, -2);
                    } else if (holder instanceof LinearLayout) {
                        layoutParams = new LinearLayout.LayoutParams(-1, -2);
                    }
                    onCreateViewHolder.itemView.setLayoutParams(layoutParams);
                    holder.addView(onCreateViewHolder.itemView);
                    this.recyclerAdapterRegular.onBindViewHolder(onCreateViewHolder, i11);
                    this.curVHs.put(recyclerItem.provideId(), new ItemR(recyclerItem.provideId(), recyclerItem, onCreateViewHolder));
                }
                i11 = i12;
            }
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (Map.Entry<String, ItemR> entry : this.curVHs.entrySet()) {
            String key = entry.getKey();
            ItemR value = entry.getValue();
            if (widgets != null) {
                List<? extends RecyclerItem> list = widgets;
                if (!(list instanceof Collection) || !list.isEmpty()) {
                    Iterator<T> it = list.iterator();
                    while (it.hasNext()) {
                        if (Intrinsics.d(((RecyclerItem) it.next()).provideId(), key)) {
                            break;
                        }
                    }
                }
            }
            View itemView = value.getViewHolder().itemView;
            Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
            ViewGroup viewGroup = (ViewGroup) itemView.getParent();
            if (viewGroup != null) {
                viewGroup.removeView(itemView);
            }
            linkedHashSet.add(key);
        }
        Iterator it2 = linkedHashSet.iterator();
        while (it2.hasNext()) {
            this.curVHs.remove((String) it2.next());
        }
    }
}
