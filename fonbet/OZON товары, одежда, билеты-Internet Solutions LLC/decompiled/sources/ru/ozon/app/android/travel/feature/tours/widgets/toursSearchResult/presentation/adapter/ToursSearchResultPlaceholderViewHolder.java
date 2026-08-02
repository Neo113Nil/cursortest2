package ru.ozon.app.android.travel.feature.tours.widgets.toursSearchResult.presentation.adapter;

import android.view.View;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.tours.widgets.toursSearchResult.presentation.ToursSearchResultVO;
import ru.ozon.app.android.uikit.view.recycler.adapter.BaseViewHolder;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0000\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u001e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00022\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0016¨\u0006\r"}, d2 = {"Lru/ozon/app/android/travel/feature/tours/widgets/toursSearchResult/presentation/adapter/ToursSearchResultPlaceholderViewHolder;", "Lru/ozon/app/android/uikit/view/recycler/adapter/BaseViewHolder;", "Lru/ozon/app/android/travel/feature/tours/widgets/toursSearchResult/presentation/ToursSearchResultVO$SearchResultItem;", "view", "Landroid/view/View;", "<init>", "(Landroid/view/View;)V", "bind", "", "item", "payloads", "", "", "tours_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ToursSearchResultPlaceholderViewHolder extends BaseViewHolder<ToursSearchResultVO.SearchResultItem> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ToursSearchResultPlaceholderViewHolder(@NotNull View view) {
        super(view);
        Intrinsics.checkNotNullParameter(view, "view");
    }

    /* renamed from: bind, reason: avoid collision after fix types in other method */
    public void bind2(@NotNull ToursSearchResultVO.SearchResultItem item, @NotNull List<? extends Object> payloads) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(payloads, "payloads");
    }

    @Override // ru.ozon.app.android.uikit.view.recycler.adapter.BaseViewHolder
    public /* bridge */ /* synthetic */ void bind(ToursSearchResultVO.SearchResultItem searchResultItem, List list) {
        bind2(searchResultItem, (List<? extends Object>) list);
    }
}
