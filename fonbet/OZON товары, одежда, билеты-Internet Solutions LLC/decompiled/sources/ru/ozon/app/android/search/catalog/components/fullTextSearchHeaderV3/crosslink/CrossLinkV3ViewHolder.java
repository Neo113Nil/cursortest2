package ru.ozon.app.android.search.catalog.components.fullTextSearchHeaderV3.crosslink;

import Gt.a;
import WZ.l;
import WZ.t;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.cardview.widget.CardView;
import jk0.j;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.analytics.modules.tokenized.TokenizedAnalyticsExtensionsKt;
import ru.ozon.app.android.search.catalog.components.fullTextSearchHeaderV3.presentation.FullTextSearchHeaderV3VO;
import ru.ozon.app.android.search.databinding.WidgetFullTextSearchHeaderCrosslinkBinding;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\r\b\u0001\u0018\u00002\u00060\u0001j\u0002`\u0002B/\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\u0010\u0007\u001a\u00060\u0005j\u0002`\u0006\u0012\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\t¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0013R\u0018\u0010\u0007\u001a\u00060\u0005j\u0002`\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0014R\u0018\u0010\u0015\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/search/catalog/components/fullTextSearchHeaderV3/crosslink/CrossLinkV3ViewHolder;", "Ljk0/j;", "Lru/ozon/app/android/uikit/view/recycler/adapter/lifecycle/LifecycleViewHolder;", "Lru/ozon/app/android/search/databinding/WidgetFullTextSearchHeaderCrosslinkBinding;", "binding", "LWZ/l;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedAnalytics;", "tokenizedAnalytics", "Lkotlin/Function1;", "Lru/ozon/app/android/search/catalog/components/fullTextSearchHeaderV3/presentation/FullTextSearchHeaderV3VO$CrosslinksVO;", "", "crossLinkClick", "<init>", "(Lru/ozon/app/android/search/databinding/WidgetFullTextSearchHeaderCrosslinkBinding;LWZ/l;Lkotlin/jvm/functions/Function1;)V", "onViewInVisibleBounds", "()V", "item", "bind", "(Lru/ozon/app/android/search/catalog/components/fullTextSearchHeaderV3/presentation/FullTextSearchHeaderV3VO$CrosslinksVO;)V", "Lru/ozon/app/android/search/databinding/WidgetFullTextSearchHeaderCrosslinkBinding;", "LWZ/l;", "crossLink", "Lru/ozon/app/android/search/catalog/components/fullTextSearchHeaderV3/presentation/FullTextSearchHeaderV3VO$CrosslinksVO;", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class CrossLinkV3ViewHolder extends j {

    @NotNull
    private final WidgetFullTextSearchHeaderCrosslinkBinding binding;
    private FullTextSearchHeaderV3VO.CrosslinksVO crossLink;

    @NotNull
    private final l tokenizedAnalytics;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public CrossLinkV3ViewHolder(@NotNull WidgetFullTextSearchHeaderCrosslinkBinding binding, @NotNull l tokenizedAnalytics, @NotNull Function1<? super FullTextSearchHeaderV3VO.CrosslinksVO, Unit> crossLinkClick) {
        super(r0);
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(tokenizedAnalytics, "tokenizedAnalytics");
        Intrinsics.checkNotNullParameter(crossLinkClick, "crossLinkClick");
        CardView constraintLayout = binding.getConstraintLayout();
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "getRoot(...)");
        this.binding = binding;
        this.tokenizedAnalytics = tokenizedAnalytics;
        binding.getConstraintLayout().setOnClickListener(new a(1, this, crossLinkClick));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$0(CrossLinkV3ViewHolder crossLinkV3ViewHolder, Function1 function1, View view) {
        FullTextSearchHeaderV3VO.CrosslinksVO crosslinksVO = crossLinkV3ViewHolder.crossLink;
        if (crosslinksVO != null) {
            function1.invoke(crosslinksVO);
        }
    }

    public final void bind(@NotNull FullTextSearchHeaderV3VO.CrosslinksVO item) {
        Intrinsics.checkNotNullParameter(item, "item");
        WidgetFullTextSearchHeaderCrosslinkBinding widgetFullTextSearchHeaderCrosslinkBinding = this.binding;
        this.crossLink = item;
        AppCompatImageView crosslinkIconIv = widgetFullTextSearchHeaderCrosslinkBinding.crosslinkIconIv;
        Intrinsics.checkNotNullExpressionValue(crosslinkIconIv, "crosslinkIconIv");
        ViewExtKt.showOrGone(crosslinkIconIv, Boolean.valueOf(item.getIsShowIcon()));
        widgetFullTextSearchHeaderCrosslinkBinding.crosslinkTitleTv.setText(item.getText());
    }

    @Override // jk0.j, lk0.b
    public void onViewInVisibleBounds() {
        t tokenizedEvent;
        super.onViewInVisibleBounds();
        FullTextSearchHeaderV3VO.CrosslinksVO crosslinksVO = this.crossLink;
        if (crosslinksVO == null || (tokenizedEvent = crosslinksVO.getTokenizedEvent()) == null) {
            return;
        }
        TokenizedAnalyticsExtensionsKt.processViewEvents$default(this.tokenizedAnalytics, tokenizedEvent, null, 2, null);
    }
}
