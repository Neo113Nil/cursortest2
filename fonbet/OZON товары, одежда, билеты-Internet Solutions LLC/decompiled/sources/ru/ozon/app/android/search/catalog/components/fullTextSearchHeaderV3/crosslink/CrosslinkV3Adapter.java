package ru.ozon.app.android.search.catalog.components.fullTextSearchHeaderV3.crosslink;

import WZ.l;
import android.view.ViewGroup;
import androidx.lifecycle.J;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.search.R$layout;
import ru.ozon.app.android.search.catalog.components.fullTextSearchHeaderV3.presentation.FullTextSearchHeaderV3VO;
import ru.ozon.app.android.search.databinding.WidgetFullTextSearchHeaderCrosslinkBinding;
import ru.ozon.app.android.uikit.view.recycler.adapter.lifecycle.LifecycleListAdapter;
import ru.ozon.uni.android.uikit.extensions.view.ViewGroupExtKt;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\n\b\u0001\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B/\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\u0010\b\u001a\u00060\u0006j\u0002`\u0007\u0012\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0016\u0010\u0017R\u0018\u0010\b\u001a\u00060\u0006j\u0002`\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0018R \u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\n0\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0019¨\u0006\u001a"}, d2 = {"Lru/ozon/app/android/search/catalog/components/fullTextSearchHeaderV3/crosslink/CrosslinkV3Adapter;", "Lru/ozon/app/android/uikit/view/recycler/adapter/lifecycle/LifecycleListAdapter;", "Lru/ozon/app/android/search/catalog/components/fullTextSearchHeaderV3/presentation/FullTextSearchHeaderV3VO$CrosslinksVO;", "Lru/ozon/app/android/search/catalog/components/fullTextSearchHeaderV3/crosslink/CrossLinkV3ViewHolder;", "Landroidx/lifecycle/J;", "lifecycleOwner", "LWZ/l;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedAnalytics;", "tokenizedAnalytics", "Lkotlin/Function1;", "", "crossLinkClickListener", "<init>", "(Landroidx/lifecycle/J;LWZ/l;Lkotlin/jvm/functions/Function1;)V", "Landroid/view/ViewGroup;", "parent", "", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Lru/ozon/app/android/search/catalog/components/fullTextSearchHeaderV3/crosslink/CrossLinkV3ViewHolder;", "holder", "position", "onBindViewHolder", "(Lru/ozon/app/android/search/catalog/components/fullTextSearchHeaderV3/crosslink/CrossLinkV3ViewHolder;I)V", "LWZ/l;", "Lkotlin/jvm/functions/Function1;", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class CrosslinkV3Adapter extends LifecycleListAdapter<FullTextSearchHeaderV3VO.CrosslinksVO, CrossLinkV3ViewHolder> {

    @NotNull
    private final Function1<FullTextSearchHeaderV3VO.CrosslinksVO, Unit> crossLinkClickListener;

    @NotNull
    private final l tokenizedAnalytics;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public CrosslinkV3Adapter(@NotNull J lifecycleOwner, @NotNull l tokenizedAnalytics, @NotNull Function1<? super FullTextSearchHeaderV3VO.CrosslinksVO, Unit> crossLinkClickListener) {
        super(new CrossLinkDiff(), lifecycleOwner, null, 4, null);
        Intrinsics.checkNotNullParameter(lifecycleOwner, "lifecycleOwner");
        Intrinsics.checkNotNullParameter(tokenizedAnalytics, "tokenizedAnalytics");
        Intrinsics.checkNotNullParameter(crossLinkClickListener, "crossLinkClickListener");
        this.tokenizedAnalytics = tokenizedAnalytics;
        this.crossLinkClickListener = crossLinkClickListener;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public void onBindViewHolder(@NotNull CrossLinkV3ViewHolder holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        FullTextSearchHeaderV3VO.CrosslinksVO item = getItem(position);
        Intrinsics.checkNotNullExpressionValue(item, "getItem(...)");
        holder.bind(item);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    @NotNull
    public CrossLinkV3ViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        WidgetFullTextSearchHeaderCrosslinkBinding bind = WidgetFullTextSearchHeaderCrosslinkBinding.bind(ViewGroupExtKt.inflate(parent, R$layout.widget_full_text_search_header_crosslink));
        Intrinsics.checkNotNullExpressionValue(bind, "bind(...)");
        return new CrossLinkV3ViewHolder(bind, this.tokenizedAnalytics, this.crossLinkClickListener);
    }
}
