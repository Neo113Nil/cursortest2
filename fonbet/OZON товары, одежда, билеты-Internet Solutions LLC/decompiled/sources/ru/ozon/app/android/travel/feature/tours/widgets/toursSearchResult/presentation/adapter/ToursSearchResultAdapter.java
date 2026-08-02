package ru.ozon.app.android.travel.feature.tours.widgets.toursSearchResult.presentation.adapter;

import Ej.b;
import Sc.o;
import WZ.l;
import android.content.Context;
import android.view.ViewGroup;
import androidx.lifecycle.J;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.i;
import jk0.i;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.K;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.tours.R$id;
import ru.ozon.app.android.travel.feature.tours.R$layout;
import ru.ozon.app.android.travel.feature.tours.widgets.toursSearchResult.presentation.ToursSearchResultVO;
import ru.ozon.app.android.travel.feature.tours.widgets.toursSearchResult.view.ToursSearchResultHotelView;
import ru.ozon.app.android.travel.feature.tours.widgets.toursSearchResult.view.ToursSearchResultPlaceholderView;
import ru.ozon.app.android.travel.feature.tours.widgets.toursSearchResult.view.ToursSearchResultProgressBarView;
import ru.ozon.app.android.uikit.view.recycler.adapter.BaseViewHolder;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0001\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00030\u0001B7\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u0012\n\u0010\n\u001a\u00060\bj\u0002`\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J%\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00020\u00032\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J%\u0010\u001b\u001a\u00020\u00062\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u001b\u0010\u001cR \u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u001dR\u0018\u0010\n\u001a\u00060\bj\u0002`\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u001eR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u001f¨\u0006 "}, d2 = {"Lru/ozon/app/android/travel/feature/tours/widgets/toursSearchResult/presentation/adapter/ToursSearchResultAdapter;", "Ljk0/i;", "Lru/ozon/app/android/travel/feature/tours/widgets/toursSearchResult/presentation/ToursSearchResultVO$SearchResultItem;", "Lru/ozon/app/android/uikit/view/recycler/adapter/BaseViewHolder;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "actionHandler", "LWZ/l;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedAnalytics;", "tokenizedAnalytics", "Landroidx/recyclerview/widget/RecyclerView$u;", "sharedPool", "Landroidx/lifecycle/J;", "lifecycleOwner", "<init>", "(Lkotlin/jvm/functions/Function1;LWZ/l;Landroidx/recyclerview/widget/RecyclerView$u;Landroidx/lifecycle/J;)V", "", "position", "getItemViewType", "(I)I", "Landroid/view/ViewGroup;", "parent", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Lru/ozon/app/android/uikit/view/recycler/adapter/BaseViewHolder;", "holder", "onBindViewHolder", "(Lru/ozon/app/android/uikit/view/recycler/adapter/BaseViewHolder;I)V", "Lkotlin/jvm/functions/Function1;", "LWZ/l;", "Landroidx/recyclerview/widget/RecyclerView$u;", "tours_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ToursSearchResultAdapter extends i<ToursSearchResultVO.SearchResultItem, BaseViewHolder<? super ToursSearchResultVO.SearchResultItem>> {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final RecyclerView.u sharedPool;

    @NotNull
    private final l tokenizedAnalytics;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ToursSearchResultAdapter(@NotNull Function1<? super AtomAction, Unit> actionHandler, @NotNull l tokenizedAnalytics, @NotNull RecyclerView.u sharedPool, @NotNull J lifecycleOwner) {
        super(new i.d<ToursSearchResultVO.SearchResultItem>() { // from class: ru.ozon.app.android.travel.feature.tours.widgets.toursSearchResult.presentation.adapter.ToursSearchResultAdapter.1
            @Override // androidx.recyclerview.widget.i.d
            public boolean areContentsTheSame(ToursSearchResultVO.SearchResultItem oldItem, ToursSearchResultVO.SearchResultItem newItem) {
                Intrinsics.checkNotNullParameter(oldItem, "oldItem");
                Intrinsics.checkNotNullParameter(newItem, "newItem");
                return Intrinsics.d(oldItem, newItem);
            }

            @Override // androidx.recyclerview.widget.i.d
            public boolean areItemsTheSame(ToursSearchResultVO.SearchResultItem oldItem, ToursSearchResultVO.SearchResultItem newItem) {
                Intrinsics.checkNotNullParameter(oldItem, "oldItem");
                Intrinsics.checkNotNullParameter(newItem, "newItem");
                return oldItem.getId() == newItem.getId();
            }
        }, lifecycleOwner, null, 4, null);
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        Intrinsics.checkNotNullParameter(tokenizedAnalytics, "tokenizedAnalytics");
        Intrinsics.checkNotNullParameter(sharedPool, "sharedPool");
        Intrinsics.checkNotNullParameter(lifecycleOwner, "lifecycleOwner");
        this.actionHandler = actionHandler;
        this.tokenizedAnalytics = tokenizedAnalytics;
        this.sharedPool = sharedPool;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public int getItemViewType(int position) {
        ToursSearchResultVO.SearchResultItem item = getItem(position);
        if (item instanceof ToursSearchResultVO.HotelVO) {
            return R$layout.item_tours_search_result;
        }
        if (item instanceof ToursSearchResultVO.HotelPlaceholder) {
            return R$layout.item_tours_search_result_placeholder;
        }
        if (Intrinsics.d(item, ToursSearchResultVO.NextPageLoader.INSTANCE)) {
            return R$id.toursSearchResultProgressBarViewType;
        }
        throw new o();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public void onBindViewHolder(@NotNull BaseViewHolder<? super ToursSearchResultVO.SearchResultItem> holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        ToursSearchResultVO.SearchResultItem item = getItem(position);
        Intrinsics.checkNotNullExpressionValue(item, "getItem(...)");
        holder.bind(item, K.f71697a);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    @NotNull
    public BaseViewHolder<ToursSearchResultVO.SearchResultItem> onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        if (viewType == R$layout.item_tours_search_result) {
            Context context = parent.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            ToursSearchResultHotelView toursSearchResultHotelView = new ToursSearchResultHotelView(context);
            toursSearchResultHotelView.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
            return new TourSearchResultViewHolder(toursSearchResultHotelView, this.actionHandler, this.tokenizedAnalytics, this.sharedPool);
        }
        if (viewType == R$layout.item_tours_search_result_placeholder) {
            Context context2 = parent.getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            ToursSearchResultPlaceholderView toursSearchResultPlaceholderView = new ToursSearchResultPlaceholderView(context2);
            toursSearchResultPlaceholderView.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
            return new ToursSearchResultPlaceholderViewHolder(toursSearchResultPlaceholderView);
        }
        if (viewType != R$id.toursSearchResultProgressBarViewType) {
            throw new IllegalArgumentException(b.a(viewType, "Unknown viewType: "));
        }
        Context context3 = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
        ToursSearchResultProgressBarView toursSearchResultProgressBarView = new ToursSearchResultProgressBarView(context3, null, 0, 0, 14, null);
        toursSearchResultProgressBarView.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        Context context4 = toursSearchResultProgressBarView.getContext();
        Intrinsics.checkNotNullExpressionValue(context4, "getContext(...)");
        toursSearchResultProgressBarView.setPadding(0, 0, 0, ResourceExtKt.toPx(8, context4));
        return new ToursSearchResultProgressBarViewHolder(toursSearchResultProgressBarView);
    }
}
