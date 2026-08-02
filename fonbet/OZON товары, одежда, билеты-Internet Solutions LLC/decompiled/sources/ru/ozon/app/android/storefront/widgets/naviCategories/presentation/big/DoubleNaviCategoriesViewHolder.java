package ru.ozon.app.android.storefront.widgets.naviCategories.presentation.big;

import BQ.b;
import W10.c;
import WZ.t;
import android.view.View;
import android.widget.FrameLayout;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.analytics.modules.tokenized.TokenizedAnalyticsExtensionsKt;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.storefront.R$id;
import ru.ozon.app.android.storefront.widgets.naviCategories.presentation.PaddingsVO;
import ru.ozon.app.android.storefront.widgets.naviCategories.presentation.RoundedBackgroundDelegate;
import ru.ozon.app.android.storefront.widgets.naviCategories.presentation.RoundedCornerVO;
import ru.ozon.composer.ui.widget.f;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u00032\u00020\u0004B\u0017\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ#\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\u00022\n\u0010\u000e\u001a\u00060\fj\u0002`\rH\u0014¢\u0006\u0004\b\u0010\u0010\u0011J3\u0010\u0018\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\u00022\n\u0010\u0014\u001a\u00060\u0012j\u0002`\u00132\u000e\u0010\u0017\u001a\n\u0018\u00010\u0015j\u0004\u0018\u0001`\u0016H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J&\u0010\u001f\u001a\u00020\u000f2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a2\u0006\u0010\u001e\u001a\u00020\u001dH\u0096\u0001¢\u0006\u0004\b\u001f\u0010 R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010!R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\"R \u0010%\u001a\u000e\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020\u000f0#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010(\u001a\u00020'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)¨\u0006*"}, d2 = {"Lru/ozon/app/android/storefront/widgets/naviCategories/presentation/big/DoubleNaviCategoriesViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/storefront/widgets/naviCategories/presentation/big/DoubleNaviCategoriesVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "", "Landroid/widget/FrameLayout;", "containerView", "Lru/ozon/app/android/composer/ComposerReferences;", "references", "<init>", "(Landroid/widget/FrameLayout;Lru/ozon/app/android/composer/ComposerReferences;)V", "item", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "info", "", "bind", "(Lru/ozon/app/android/storefront/widgets/naviCategories/presentation/big/DoubleNaviCategoriesVO;Ll20/d;)V", "LW10/c;", "Lru/ozon/app/android/composer/widgets/base/TrackingData;", "trackingData", "Lru/ozon/composer/ui/widget/f;", "Lru/ozon/app/android/tools/ViewedPond;", "viewedPond", "trackView", "(Lru/ozon/app/android/storefront/widgets/naviCategories/presentation/big/DoubleNaviCategoriesVO;LW10/c;Lru/ozon/composer/ui/widget/f;)V", "", "Lru/ozon/app/android/storefront/widgets/naviCategories/presentation/RoundedCornerVO;", "roundedCorners", "Lru/ozon/app/android/storefront/widgets/naviCategories/presentation/PaddingsVO;", "paddingsVO", "bindOuterBackground", "(Ljava/util/List;Lru/ozon/app/android/storefront/widgets/naviCategories/presentation/PaddingsVO;)V", "Landroid/widget/FrameLayout;", "Lru/ozon/app/android/composer/ComposerReferences;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "onAction", "Lkotlin/jvm/functions/Function1;", "Lru/ozon/app/android/storefront/widgets/naviCategories/presentation/big/DoubleNaviCategoriesView;", "doubleNaviCategoriesView", "Lru/ozon/app/android/storefront/widgets/naviCategories/presentation/big/DoubleNaviCategoriesView;", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class DoubleNaviCategoriesViewHolder extends k<DoubleNaviCategoriesVO> {
    private final /* synthetic */ RoundedBackgroundDelegate $$delegate_0;

    @NotNull
    private final FrameLayout containerView;

    @NotNull
    private final DoubleNaviCategoriesView doubleNaviCategoriesView;

    @NotNull
    private final Function1<AtomAction, Unit> onAction;

    @NotNull
    private final ComposerReferences references;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DoubleNaviCategoriesViewHolder(@NotNull FrameLayout containerView, @NotNull ComposerReferences references) {
        super(containerView);
        Intrinsics.checkNotNullParameter(containerView, "containerView");
        Intrinsics.checkNotNullParameter(references, "references");
        this.$$delegate_0 = new RoundedBackgroundDelegate(containerView);
        this.containerView = containerView;
        this.references = references;
        this.onAction = new ActionHandler.Builder(references, this).buildHandler();
        DoubleNaviCategoriesView doubleNaviCategoriesView = new DoubleNaviCategoriesView(getContext(), null, 0, 6, null);
        doubleNaviCategoriesView.setId(R$id.doubleNaviCategories);
        this.doubleNaviCategoriesView = doubleNaviCategoriesView;
        containerView.addView(doubleNaviCategoriesView);
        doubleNaviCategoriesView.setOnClickListener(new b(this, 9));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$1(DoubleNaviCategoriesViewHolder doubleNaviCategoriesViewHolder, View view) {
        AtomAction action;
        DoubleNaviCategoriesVO boundedData = doubleNaviCategoriesViewHolder.getBoundedData();
        if (boundedData == null || (action = boundedData.getAction()) == null) {
            return;
        }
        doubleNaviCategoriesViewHolder.onAction.invoke(action);
    }

    public void bindOuterBackground(@NotNull List<? extends RoundedCornerVO> roundedCorners, @NotNull PaddingsVO paddingsVO) {
        Intrinsics.checkNotNullParameter(roundedCorners, "roundedCorners");
        Intrinsics.checkNotNullParameter(paddingsVO, "paddingsVO");
        this.$$delegate_0.bindOuterBackground(roundedCorners, paddingsVO);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull DoubleNaviCategoriesVO item, @NotNull d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        bindOuterBackground(item.getRoundedCorners(), item.getPaddings());
        DoubleNaviCategoriesView doubleNaviCategoriesView = this.doubleNaviCategoriesView;
        doubleNaviCategoriesView.bindImage(item.getImage());
        doubleNaviCategoriesView.bindTitle(item.getTitle());
        doubleNaviCategoriesView.bindSubtitle(item.getSubtitle());
    }

    @Override // ru.ozon.composer.ui.widget.k
    public void trackView(@NotNull DoubleNaviCategoriesVO item, @NotNull c trackingData, f viewedPond) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(trackingData, "trackingData");
        t tokenizedEvent = item.getTokenizedEvent();
        if (tokenizedEvent != null) {
            TokenizedAnalyticsExtensionsKt.processViewEvents$default(this.references.getTokenizedAnalytics(), tokenizedEvent, null, 2, null);
        }
    }
}
