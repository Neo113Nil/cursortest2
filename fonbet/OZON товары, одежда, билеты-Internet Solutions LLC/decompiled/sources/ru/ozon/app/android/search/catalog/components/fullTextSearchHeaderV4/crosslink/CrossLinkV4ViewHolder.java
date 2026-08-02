package ru.ozon.app.android.search.catalog.components.fullTextSearchHeaderV4.crosslink;

import GD.b;
import WZ.l;
import WZ.t;
import android.content.Context;
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
import ru.ozon.app.android.search.catalog.components.fullTextSearchHeaderV4.presentation.FullTextSearchHeaderV4VO;
import ru.ozon.app.android.search.catalog.components.fullTextSearchHeaderV4.utils.FullTextUtils;
import ru.ozon.app.android.search.databinding.WidgetFullTextSearchHeaderCrosslinkBinding;
import ru.ozon.app.android.storefrontcommonwidgets.core.appType.AppTypeResolver;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;
import ru.ozon.uni.core.R$color;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u000e\b\u0001\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005\u0012\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\tH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0010\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\b¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0012R\u0018\u0010\u0006\u001a\u00060\u0004j\u0002`\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0013R\u0018\u0010\u0014\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/search/catalog/components/fullTextSearchHeaderV4/crosslink/CrossLinkV4ViewHolder;", "Ljk0/j;", "Lru/ozon/app/android/search/databinding/WidgetFullTextSearchHeaderCrosslinkBinding;", "binding", "LWZ/l;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedAnalytics;", "tokenizedAnalytics", "Lkotlin/Function1;", "Lru/ozon/app/android/search/catalog/components/fullTextSearchHeaderV4/presentation/FullTextSearchHeaderV4VO$CrosslinksVO;", "", "crossLinkClick", "<init>", "(Lru/ozon/app/android/search/databinding/WidgetFullTextSearchHeaderCrosslinkBinding;LWZ/l;Lkotlin/jvm/functions/Function1;)V", "onViewInVisibleBounds", "()V", "item", "bind", "(Lru/ozon/app/android/search/catalog/components/fullTextSearchHeaderV4/presentation/FullTextSearchHeaderV4VO$CrosslinksVO;)V", "Lru/ozon/app/android/search/databinding/WidgetFullTextSearchHeaderCrosslinkBinding;", "LWZ/l;", "crossLink", "Lru/ozon/app/android/search/catalog/components/fullTextSearchHeaderV4/presentation/FullTextSearchHeaderV4VO$CrosslinksVO;", "Companion", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class CrossLinkV4ViewHolder extends j {

    @NotNull
    private final WidgetFullTextSearchHeaderCrosslinkBinding binding;
    private FullTextSearchHeaderV4VO.CrosslinksVO crossLink;

    @NotNull
    private final l tokenizedAnalytics;
    public static final int $stable = 8;
    private static final float CARD_CORNER_RADIUS = UiExtKt.toPxF(8.0f);

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public CrossLinkV4ViewHolder(@NotNull WidgetFullTextSearchHeaderCrosslinkBinding binding, @NotNull l tokenizedAnalytics, @NotNull Function1<? super FullTextSearchHeaderV4VO.CrosslinksVO, Unit> crossLinkClick) {
        super(r0);
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(tokenizedAnalytics, "tokenizedAnalytics");
        Intrinsics.checkNotNullParameter(crossLinkClick, "crossLinkClick");
        CardView constraintLayout = binding.getConstraintLayout();
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "getRoot(...)");
        this.binding = binding;
        this.tokenizedAnalytics = tokenizedAnalytics;
        binding.getConstraintLayout().setOnClickListener(new b(1, this, crossLinkClick));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$0(CrossLinkV4ViewHolder crossLinkV4ViewHolder, Function1 function1, View view) {
        FullTextSearchHeaderV4VO.CrosslinksVO crosslinksVO = crossLinkV4ViewHolder.crossLink;
        if (crosslinksVO != null) {
            function1.invoke(crosslinksVO);
        }
    }

    public final void bind(@NotNull FullTextSearchHeaderV4VO.CrosslinksVO item) {
        Intrinsics.checkNotNullParameter(item, "item");
        WidgetFullTextSearchHeaderCrosslinkBinding widgetFullTextSearchHeaderCrosslinkBinding = this.binding;
        Context context = widgetFullTextSearchHeaderCrosslinkBinding.getConstraintLayout().getContext();
        AppTypeResolver appTypeResolver = AppTypeResolver.INSTANCE;
        Intrinsics.f(context);
        if (appTypeResolver.isSelect(context)) {
            this.binding.getConstraintLayout().setRadius(0.0f);
            widgetFullTextSearchHeaderCrosslinkBinding.crosslinkTitleTv.setTextColor(ResourceExtKt.color(context, R$color.text_secondary_on_dark));
        } else {
            this.binding.getConstraintLayout().setRadius(CARD_CORNER_RADIUS);
            widgetFullTextSearchHeaderCrosslinkBinding.crosslinkTitleTv.setTextColor(ResourceExtKt.color(context, ru.ozon.uni.R$color.text_primary));
        }
        this.binding.getConstraintLayout().setCardBackgroundColor(ThemeExtKt.themeColor(context, R$attr.layerFloor0));
        this.crossLink = item;
        AppCompatImageView crosslinkIconIv = widgetFullTextSearchHeaderCrosslinkBinding.crosslinkIconIv;
        Intrinsics.checkNotNullExpressionValue(crosslinkIconIv, "crosslinkIconIv");
        ViewExtKt.showOrGone(crosslinkIconIv, Boolean.valueOf(item.getIsShowIcon()));
        widgetFullTextSearchHeaderCrosslinkBinding.crosslinkTitleTv.setText(FullTextUtils.INSTANCE.colorizeBoldParts(item.getText(), ResourceExtKt.color(context, appTypeResolver.isSelect(context) ? R$color.text_action_on_dark_select : ru.ozon.uni.R$color.text_primary)));
    }

    @Override // jk0.j, lk0.b
    public void onViewInVisibleBounds() {
        t tokenizedEvent;
        super.onViewInVisibleBounds();
        FullTextSearchHeaderV4VO.CrosslinksVO crosslinksVO = this.crossLink;
        if (crosslinksVO == null || (tokenizedEvent = crosslinksVO.getTokenizedEvent()) == null) {
            return;
        }
        TokenizedAnalyticsExtensionsKt.processViewEvents$default(this.tokenizedAnalytics, tokenizedEvent, null, 2, null);
    }
}
