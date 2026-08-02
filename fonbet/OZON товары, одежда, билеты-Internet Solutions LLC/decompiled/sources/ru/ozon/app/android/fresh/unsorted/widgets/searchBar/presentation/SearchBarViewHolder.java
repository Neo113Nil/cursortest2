package ru.ozon.app.android.fresh.unsorted.widgets.searchBar.presentation;

import B3.D;
import Sx.a;
import WZ.l;
import WZ.t;
import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.analytics.modules.tokenized.TokenizedAnalyticsExtensionsKt;
import ru.ozon.app.android.fresh.unsorted.databinding.WidgetSearchBarBinding;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u001e2\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003:\u0001\u001eB\u001f\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ!\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J#\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00022\n\u0010\u0015\u001a\u00060\u0013j\u0002`\u0014H\u0014¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0018R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0019R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u001aR\u0014\u0010\u001c\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d¨\u0006\u001f"}, d2 = {"Lru/ozon/app/android/fresh/unsorted/widgets/searchBar/presentation/SearchBarViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/fresh/unsorted/widgets/searchBar/presentation/SearchBarVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "Landroid/view/View;", "containerView", "Lru/ozon/app/android/fresh/unsorted/widgets/searchBar/presentation/SearchBarRouter;", "searchBarRouter", "LWZ/l;", "tokenizedAnalytics", "<init>", "(Landroid/view/View;Lru/ozon/app/android/fresh/unsorted/widgets/searchBar/presentation/SearchBarRouter;LWZ/l;)V", "view", "", "backgroundColor", "", "setBackgroundDrawable", "(Landroid/view/View;Ljava/lang/String;)V", "item", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "info", "bind", "(Lru/ozon/app/android/fresh/unsorted/widgets/searchBar/presentation/SearchBarVO;Ll20/d;)V", "Landroid/view/View;", "Lru/ozon/app/android/fresh/unsorted/widgets/searchBar/presentation/SearchBarRouter;", "LWZ/l;", "Lru/ozon/app/android/fresh/unsorted/databinding/WidgetSearchBarBinding;", "binding", "Lru/ozon/app/android/fresh/unsorted/databinding/WidgetSearchBarBinding;", "Companion", "widgets-unsorted_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class SearchBarViewHolder extends k<SearchBarVO> {

    @NotNull
    private final WidgetSearchBarBinding binding;

    @NotNull
    private final View containerView;

    @NotNull
    private final SearchBarRouter searchBarRouter;

    @NotNull
    private final l tokenizedAnalytics;
    public static final int $stable = 8;
    private static final int HORIZONTAL_MARGINS = ResourceExtKt.toPx(16);
    private static final int VERTICAL_MARGINS = ResourceExtKt.toPx(8);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SearchBarViewHolder(@NotNull View containerView, @NotNull SearchBarRouter searchBarRouter, @NotNull l tokenizedAnalytics) {
        super(containerView);
        Intrinsics.checkNotNullParameter(containerView, "containerView");
        Intrinsics.checkNotNullParameter(searchBarRouter, "searchBarRouter");
        Intrinsics.checkNotNullParameter(tokenizedAnalytics, "tokenizedAnalytics");
        this.containerView = containerView;
        this.searchBarRouter = searchBarRouter;
        this.tokenizedAnalytics = tokenizedAnalytics;
        WidgetSearchBarBinding bind = WidgetSearchBarBinding.bind(containerView);
        Intrinsics.checkNotNullExpressionValue(bind, "bind(...)");
        this.binding = bind;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bind$lambda$2(SearchBarVO searchBarVO, SearchBarViewHolder searchBarViewHolder, View view) {
        if (h.e0(searchBarVO.getDeeplink(), "ozon://searchSuggestions", false)) {
            searchBarViewHolder.searchBarRouter.routeToSearch(searchBarVO);
        } else {
            searchBarViewHolder.searchBarRouter.routeToDeeplink(searchBarVO.getDeeplink());
        }
        t tokenizedEvent = searchBarVO.getTokenizedEvent();
        if (tokenizedEvent != null) {
            TokenizedAnalyticsExtensionsKt.processClickEvents$default(searchBarViewHolder.tokenizedAnalytics, tokenizedEvent, null, 2, null);
        }
    }

    private final void setBackgroundDrawable(View view, String backgroundColor) {
        GradientDrawable b11 = D.b(0);
        b11.setCornerRadius(ResourceExtKt.toPxF(18));
        b11.setColor(StyleParser.INSTANCE.parseColor(getContext(), backgroundColor, StyleParser.OzColor.OZ_SEMANTIC_COLOR_BG_PRIMARY));
        view.setBackground(b11);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull SearchBarVO item, @NotNull d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        t tokenizedEvent = item.getTokenizedEvent();
        if (tokenizedEvent != null) {
            TokenizedAnalyticsExtensionsKt.processViewEvents$default(this.tokenizedAnalytics, tokenizedEvent, null, 2, null);
        }
        this.containerView.setOnClickListener(new a(0, item, this));
        LinearLayout searchBarLayout = this.binding.searchBarLayout;
        Intrinsics.checkNotNullExpressionValue(searchBarLayout, "searchBarLayout");
        setBackgroundDrawable(searchBarLayout, item.getBackgroundTintColor());
        if (item.getIsCellable()) {
            LinearLayout linearLayout = this.binding.searchBarLayout;
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
            int i11 = HORIZONTAL_MARGINS;
            int i12 = VERTICAL_MARGINS;
            layoutParams.setMargins(i11, i12, i11, i12);
            linearLayout.setLayoutParams(layoutParams);
        } else {
            LinearLayout linearLayout2 = this.binding.searchBarLayout;
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, -2);
            layoutParams2.setMargins(0, 0, 0, 0);
            linearLayout2.setLayoutParams(layoutParams2);
        }
        TextView textView = this.binding.textTv;
        if (item.getText() != null) {
            textView.setText(item.getText());
            StyleParser styleParser = StyleParser.INSTANCE;
            Context context = textView.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            textView.setTextColor(styleParser.parseColor(context, item.getTextColor(), StyleParser.OzColor.OZ_SEMANTIC_COLOR_TEXT_PRIMARY));
            return;
        }
        textView.setText(item.getPlaceholder());
        StyleParser styleParser2 = StyleParser.INSTANCE;
        Context context2 = textView.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        textView.setTextColor(styleParser2.parseColor(context2, item.getPlaceholderColor(), StyleParser.OzColor.OZ_SEMANTIC_COLOR_TEXT_SECONDARY));
    }
}
