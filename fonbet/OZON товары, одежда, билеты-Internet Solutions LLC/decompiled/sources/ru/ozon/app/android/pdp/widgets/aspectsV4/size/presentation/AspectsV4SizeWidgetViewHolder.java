package ru.ozon.app.android.pdp.widgets.aspectsV4.size.presentation;

import W10.c;
import WZ.l;
import androidx.core.content.a;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.pdp.ui.configurators.analitycs.TokenizedAnalyticsExtKt;
import ru.ozon.app.android.pdp.utils.Dimens;
import ru.ozon.app.android.pdp.widgets.aspectsV4.AspectsV4ScrollToSelectedDelegateImpl;
import ru.ozon.app.android.pdp.widgets.aspectsV4.size.presentation.AspectsV4SizeWidgetViewHolder;
import ru.ozon.app.android.pdp.widgets.priceBlock.priceActions.utils.PriceActionExtKt;
import ru.ozon.composer.ui.widget.f;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.core.UniColors;

@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u0000 '2\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u00032\u00020\u0004:\u0001'B3\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\n\u0010\r\u001a\u00060\u000bj\u0002`\f\u0012\u0006\u0010\u000e\u001a\u00020\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u0012H\u0014¢\u0006\u0004\b\u0015\u0010\u0016J)\u0010\u001b\u001a\u00020\u00142\u0006\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u00172\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ$\u0010 \u001a\u00020\u0014*\u00020\u00052\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u001dH\u0096\u0001¢\u0006\u0004\b \u0010!R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\"R\u0018\u0010\r\u001a\u00060\u000bj\u0002`\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010#R\u0014\u0010%\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&¨\u0006("}, d2 = {"Lru/ozon/app/android/pdp/widgets/aspectsV4/size/presentation/AspectsV4SizeWidgetViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/pdp/widgets/aspectsV4/size/presentation/AspectsV4SizeVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "", "Landroidx/recyclerview/widget/RecyclerView;", "view", "", "isMultiline", "Lru/ozon/app/android/composer/ComposerReferences;", "refs", "LWZ/l;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedAnalytics;", "tokenizedAnalytics", "isSelect", "<init>", "(Landroidx/recyclerview/widget/RecyclerView;ZLru/ozon/app/android/composer/ComposerReferences;LWZ/l;Z)V", "item", "Ll20/d;", "info", "", "bind", "(Lru/ozon/app/android/pdp/widgets/aspectsV4/size/presentation/AspectsV4SizeVO;Ll20/d;)V", "LW10/c;", "trackingData", "Lru/ozon/composer/ui/widget/f;", "viewedPond", "trackView", "(Lru/ozon/app/android/pdp/widgets/aspectsV4/size/presentation/AspectsV4SizeVO;LW10/c;Lru/ozon/composer/ui/widget/f;)V", "", "index", "itemWidth", "scrollToSelectedAspect", "(Landroidx/recyclerview/widget/RecyclerView;II)V", "Landroidx/recyclerview/widget/RecyclerView;", "LWZ/l;", "Lru/ozon/app/android/pdp/widgets/aspectsV4/size/presentation/AspectsV4SizeAdapter;", "adapter", "Lru/ozon/app/android/pdp/widgets/aspectsV4/size/presentation/AspectsV4SizeAdapter;", "Companion", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class AspectsV4SizeWidgetViewHolder extends k<AspectsV4SizeVO> {
    private final /* synthetic */ AspectsV4ScrollToSelectedDelegateImpl $$delegate_0;

    @NotNull
    private final AspectsV4SizeAdapter adapter;

    @NotNull
    private final l tokenizedAnalytics;

    @NotNull
    private final RecyclerView view;

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final int ITEM_PADDING = Dimens.INSTANCE.getDP_10();

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lru/ozon/app/android/pdp/widgets/aspectsV4/size/presentation/AspectsV4SizeWidgetViewHolder$Companion;", "", "<init>", "()V", "", "COUNT_ITERATION_LOAD_NEXT_PAGE_WITH_COMPOSER_SCROLL", "I", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AspectsV4SizeWidgetViewHolder(@NotNull RecyclerView view, boolean z11, @NotNull ComposerReferences refs, @NotNull l tokenizedAnalytics, boolean z12) {
        super(view);
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(refs, "refs");
        Intrinsics.checkNotNullParameter(tokenizedAnalytics, "tokenizedAnalytics");
        this.$$delegate_0 = new AspectsV4ScrollToSelectedDelegateImpl(0, null, 3, null);
        this.view = view;
        this.tokenizedAnalytics = tokenizedAnalytics;
        AspectsV4SizeAdapter aspectsV4SizeAdapter = new AspectsV4SizeAdapter(z11, tokenizedAnalytics, z12, new AspectsV4SizeWidgetViewHolder$adapter$1(this, refs));
        this.adapter = aspectsV4SizeAdapter;
        view.setAdapter(aspectsV4SizeAdapter);
        view.setBackgroundColor(a.getColor(getContext(), UniColors.LAYER_FLOOR_1.getResId()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bind$lambda$1$lambda$0(AspectsV4SizeWidgetViewHolder aspectsV4SizeWidgetViewHolder, AspectsV4SizeVO aspectsV4SizeVO) {
        aspectsV4SizeWidgetViewHolder.scrollToSelectedAspect(aspectsV4SizeWidgetViewHolder.view, aspectsV4SizeVO.getScrollPosition(), PriceActionExtKt.getMeasuredWidth(aspectsV4SizeVO.getVariants().get(aspectsV4SizeVO.getScrollPosition()).getText(), aspectsV4SizeWidgetViewHolder.getContext()) + ITEM_PADDING);
    }

    public void scrollToSelectedAspect(@NotNull RecyclerView recyclerView, int i11, int i12) {
        Intrinsics.checkNotNullParameter(recyclerView, "<this>");
        this.$$delegate_0.scrollToSelectedAspect(recyclerView, i11, i12);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull final AspectsV4SizeVO item, @NotNull d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        this.adapter.submitList(item.getVariants(), new Runnable() { // from class: ZC.a
            @Override // java.lang.Runnable
            public final void run() {
                AspectsV4SizeWidgetViewHolder.bind$lambda$1$lambda$0(AspectsV4SizeWidgetViewHolder.this, item);
            }
        });
    }

    @Override // ru.ozon.composer.ui.widget.k
    public void trackView(@NotNull AspectsV4SizeVO item, @NotNull c trackingData, f viewedPond) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(trackingData, "trackingData");
        TokenizedAnalyticsExtKt.processViewEvents(this.tokenizedAnalytics, item.getTokenizedEvent());
    }
}
