package ru.ozon.app.android.travel.feature.general.order.widgets.stepListWithScale.presentation;

import W10.c;
import WZ.l;
import WZ.t;
import android.view.View;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.analytics.modules.tokenized.TokenizedAnalyticsExtensionsKt;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.travel.molecules.view.stepListWithScaleMolecule.StepListWithScaleMoleculeView;
import ru.ozon.composer.ui.widget.f;
import ru.ozon.composer.ui.widget.k;

@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003B#\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\n\u0010\n\u001a\u00060\bj\u0002`\t¢\u0006\u0004\b\u000b\u0010\fJ#\u0010\u0012\u001a\u00020\u00112\u0006\u0010\r\u001a\u00020\u00022\n\u0010\u0010\u001a\u00060\u000ej\u0002`\u000fH\u0014¢\u0006\u0004\b\u0012\u0010\u0013J3\u0010\u001a\u001a\u00020\u00112\u0006\u0010\r\u001a\u00020\u00022\n\u0010\u0016\u001a\u00060\u0014j\u0002`\u00152\u000e\u0010\u0019\u001a\n\u0018\u00010\u0017j\u0004\u0018\u0001`\u0018H\u0016¢\u0006\u0004\b\u001a\u0010\u001bR\u0018\u0010\n\u001a\u00060\bj\u0002`\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u001cR\u0016\u0010\u001e\u001a\u0004\u0018\u00010\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f¨\u0006 "}, d2 = {"Lru/ozon/app/android/travel/feature/general/order/widgets/stepListWithScale/presentation/StepListWithScaleWidgetViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/travel/feature/general/order/widgets/stepListWithScale/presentation/StepListWithScaleVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "Landroid/view/View;", "view", "Lru/ozon/app/android/composer/ComposerReferences;", "references", "LWZ/l;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedAnalytics;", "tokenizedAnalytics", "<init>", "(Landroid/view/View;Lru/ozon/app/android/composer/ComposerReferences;LWZ/l;)V", "item", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "info", "", "bind", "(Lru/ozon/app/android/travel/feature/general/order/widgets/stepListWithScale/presentation/StepListWithScaleVO;Ll20/d;)V", "LW10/c;", "Lru/ozon/app/android/composer/widgets/base/TrackingData;", "trackingData", "Lru/ozon/composer/ui/widget/f;", "Lru/ozon/app/android/tools/ViewedPond;", "viewedPond", "trackView", "(Lru/ozon/app/android/travel/feature/general/order/widgets/stepListWithScale/presentation/StepListWithScaleVO;LW10/c;Lru/ozon/composer/ui/widget/f;)V", "LWZ/l;", "Lru/ozon/app/android/travel/molecules/view/stepListWithScaleMolecule/StepListWithScaleMoleculeView;", "stepListMoleculeView", "Lru/ozon/app/android/travel/molecules/view/stepListWithScaleMolecule/StepListWithScaleMoleculeView;", "order_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class StepListWithScaleWidgetViewHolder extends k<StepListWithScaleVO> {
    private final StepListWithScaleMoleculeView stepListMoleculeView;

    @NotNull
    private final l tokenizedAnalytics;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StepListWithScaleWidgetViewHolder(@NotNull View view, @NotNull ComposerReferences references, @NotNull l tokenizedAnalytics) {
        super(view);
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(references, "references");
        Intrinsics.checkNotNullParameter(tokenizedAnalytics, "tokenizedAnalytics");
        this.tokenizedAnalytics = tokenizedAnalytics;
        StepListWithScaleMoleculeView stepListWithScaleMoleculeView = view instanceof StepListWithScaleMoleculeView ? (StepListWithScaleMoleculeView) view : null;
        this.stepListMoleculeView = stepListWithScaleMoleculeView;
        if (stepListWithScaleMoleculeView != null) {
            stepListWithScaleMoleculeView.setRecycledViewPool(references.getComposerViewPoolProvider().getViewPool());
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull StepListWithScaleVO item, @NotNull d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        StepListWithScaleMoleculeView stepListWithScaleMoleculeView = this.stepListMoleculeView;
        if (stepListWithScaleMoleculeView != null) {
            stepListWithScaleMoleculeView.bind(item.getSteps());
        }
    }

    @Override // ru.ozon.composer.ui.widget.k
    public void trackView(@NotNull StepListWithScaleVO item, @NotNull c trackingData, f viewedPond) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(trackingData, "trackingData");
        super.trackView((StepListWithScaleWidgetViewHolder) item, trackingData, viewedPond);
        t viewEvent = item.getViewEvent();
        if (viewEvent != null) {
            TokenizedAnalyticsExtensionsKt.processViewEvents$default(this.tokenizedAnalytics, viewEvent, null, 2, null);
        }
    }
}
