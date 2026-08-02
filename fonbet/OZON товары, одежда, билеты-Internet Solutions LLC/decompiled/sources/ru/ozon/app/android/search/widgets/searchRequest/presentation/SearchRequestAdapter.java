package ru.ozon.app.android.search.widgets.searchRequest.presentation;

import Az.ViewOnClickListenerC2453a;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.lifecycle.J;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.List;
import jk0.j;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.K;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.search.R$layout;
import ru.ozon.app.android.search.widgets.searchRequest.presentation.SearchRequestVO;
import ru.ozon.app.android.uikit.view.recycler.adapter.lifecycle.LifecycleAdapter;
import ru.ozon.uni.android.uikit.extensions.view.ViewGroupExtKt;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010 \n\u0002\b\t\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001!B7\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u0010\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0016\u0010\u0017R \u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0018R \u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0018R6\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00060\u00192\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00060\u00198\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 ¨\u0006\""}, d2 = {"Lru/ozon/app/android/search/widgets/searchRequest/presentation/SearchRequestAdapter;", "Lru/ozon/app/android/uikit/view/recycler/adapter/lifecycle/LifecycleAdapter;", "Lru/ozon/app/android/search/widgets/searchRequest/presentation/SearchRequestAdapter$SearchRequestWidgetVH;", "Landroidx/lifecycle/J;", "containerViewLifecycleOwner", "Lkotlin/Function1;", "Lru/ozon/app/android/search/widgets/searchRequest/presentation/SearchRequestVO$Item;", "", "clickAction", "trackViewEventAction", "<init>", "(Landroidx/lifecycle/J;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "Landroid/view/ViewGroup;", "parent", "", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Lru/ozon/app/android/search/widgets/searchRequest/presentation/SearchRequestAdapter$SearchRequestWidgetVH;", "holder", "position", "onBindViewHolder", "(Lru/ozon/app/android/search/widgets/searchRequest/presentation/SearchRequestAdapter$SearchRequestWidgetVH;I)V", "getItemCount", "()I", "Lkotlin/jvm/functions/Function1;", "", AppMeasurementSdk.ConditionalUserProperty.VALUE, "items", "Ljava/util/List;", "getItems", "()Ljava/util/List;", "setItems", "(Ljava/util/List;)V", "SearchRequestWidgetVH", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class SearchRequestAdapter extends LifecycleAdapter<SearchRequestWidgetVH> {

    @NotNull
    private final Function1<SearchRequestVO.Item, Unit> clickAction;

    @NotNull
    private List<SearchRequestVO.Item> items;

    @NotNull
    private final Function1<SearchRequestVO.Item, Unit> trackViewEventAction;

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\f\b\u0007\u0018\u00002\u00060\u0001j\u0002`\u0002B7\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u0006¢\u0006\u0004\b\u000f\u0010\u0010R \u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0011R\u0018\u0010\u000e\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u0012¨\u0006\u0013"}, d2 = {"Lru/ozon/app/android/search/widgets/searchRequest/presentation/SearchRequestAdapter$SearchRequestWidgetVH;", "Ljk0/j;", "Lru/ozon/app/android/uikit/view/recycler/adapter/lifecycle/LifecycleViewHolder;", "Landroid/view/View;", "itemView", "Lkotlin/Function1;", "Lru/ozon/app/android/search/widgets/searchRequest/presentation/SearchRequestVO$Item;", "", "clickListener", "trackViewEvent", "<init>", "(Landroid/view/View;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "onViewInVisibleBounds", "()V", "item", "bind", "(Lru/ozon/app/android/search/widgets/searchRequest/presentation/SearchRequestVO$Item;)V", "Lkotlin/jvm/functions/Function1;", "Lru/ozon/app/android/search/widgets/searchRequest/presentation/SearchRequestVO$Item;", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class SearchRequestWidgetVH extends j {
        private SearchRequestVO.Item item;

        @NotNull
        private final Function1<SearchRequestVO.Item, Unit> trackViewEvent;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public SearchRequestWidgetVH(@NotNull View itemView, @NotNull Function1<? super SearchRequestVO.Item, Unit> clickListener, @NotNull Function1<? super SearchRequestVO.Item, Unit> trackViewEvent) {
            super(itemView);
            Intrinsics.checkNotNullParameter(itemView, "itemView");
            Intrinsics.checkNotNullParameter(clickListener, "clickListener");
            Intrinsics.checkNotNullParameter(trackViewEvent, "trackViewEvent");
            this.trackViewEvent = trackViewEvent;
            itemView.setOnClickListener(new ViewOnClickListenerC2453a(3, this, clickListener));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void _init_$lambda$0(SearchRequestWidgetVH searchRequestWidgetVH, Function1 function1, View view) {
            SearchRequestVO.Item item = searchRequestWidgetVH.item;
            if (item != null) {
                function1.invoke(item);
            }
        }

        public final void bind(@NotNull SearchRequestVO.Item item) {
            Intrinsics.checkNotNullParameter(item, "item");
            this.item = item;
            View view = this.itemView;
            Intrinsics.g(view, "null cannot be cast to non-null type android.widget.TextView");
            ((TextView) view).setText(item.getText());
        }

        @Override // jk0.j, lk0.b
        public void onViewInVisibleBounds() {
            super.onViewInVisibleBounds();
            SearchRequestVO.Item item = this.item;
            if (item != null) {
                this.trackViewEvent.invoke(item);
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public SearchRequestAdapter(@NotNull J containerViewLifecycleOwner, @NotNull Function1<? super SearchRequestVO.Item, Unit> clickAction, @NotNull Function1<? super SearchRequestVO.Item, Unit> trackViewEventAction) {
        super(containerViewLifecycleOwner, null, 2, null);
        Intrinsics.checkNotNullParameter(containerViewLifecycleOwner, "containerViewLifecycleOwner");
        Intrinsics.checkNotNullParameter(clickAction, "clickAction");
        Intrinsics.checkNotNullParameter(trackViewEventAction, "trackViewEventAction");
        this.clickAction = clickAction;
        this.trackViewEventAction = trackViewEventAction;
        this.items = K.f71697a;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    /* renamed from: getItemCount */
    public int getCardsCount() {
        return this.items.size();
    }

    public final void setItems(@NotNull List<SearchRequestVO.Item> value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.items = value;
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public void onBindViewHolder(@NotNull SearchRequestWidgetVH holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        holder.bind(this.items.get(position));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    @NotNull
    public SearchRequestWidgetVH onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        return new SearchRequestWidgetVH(ViewGroupExtKt.inflate(parent, R$layout.item_search_request, false), this.clickAction, this.trackViewEventAction);
    }
}
