package ru.ozon.app.android.travel.feature.tours.widgets.toursLoader.presentation;

import Vg.d;
import W10.c;
import WZ.l;
import WZ.t;
import a00.C4911f;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import jk0.q;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.K;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.analytics.modules.tokenized.TokenizedAnalyticsExtensionsKt;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.pikazon.extensions.ImageViewExtKt;
import ru.ozon.app.android.travel.feature.tours.databinding.WidgetToursLoaderBinding;
import ru.ozon.app.android.travel.molecules.view.emptyState.v1.EmptyStateVO;
import ru.ozon.app.android.travel.molecules.view.emptyState.v1.EmptyStateView;
import ru.ozon.app.android.travel.molecules.view.threeDotLoader.ThreeDotLoaderView;
import ru.ozon.app.android.travel.utils.extensions.ViewsExtensionsKt;
import ru.ozon.composer.ui.widget.f;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.android.flashbar.factory.FlashbarFactory;
import ru.ozon.uni.android.uikit.extensions.view.ContextExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import xe.B0;
import xe.C10727i;

@Metadata(d1 = {"\u0000\u0094\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0001\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003B7\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\u0010\b\u001a\u00060\u0006j\u0002`\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\n\u0010\u000f\u001a\u00060\rj\u0002`\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0019\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0019\u0010\u0017\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0002¢\u0006\u0004\b\u0017\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J#\u0010\u001e\u001a\u00020\u00142\u0006\u0010\u001a\u001a\u00020\u00022\n\u0010\u001d\u001a\u00060\u001bj\u0002`\u001cH\u0014¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\u0014H\u0016¢\u0006\u0004\b \u0010\u0019J3\u0010'\u001a\u00020\u00142\u0006\u0010\u001a\u001a\u00020\u00022\n\u0010#\u001a\u00060!j\u0002`\"2\u000e\u0010&\u001a\n\u0018\u00010$j\u0004\u0018\u0001`%H\u0016¢\u0006\u0004\b'\u0010(J\u0017\u0010*\u001a\u00020\u00142\u0006\u0010\u001d\u001a\u00020)H\u0016¢\u0006\u0004\b*\u0010+R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010,R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010-R\u0018\u0010\u000f\u001a\u00060\rj\u0002`\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010.R\u0014\u00100\u001a\u00020/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R \u00104\u001a\u000e\u0012\u0004\u0012\u000203\u0012\u0004\u0012\u00020\u0014028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105R\u0018\u00107\u001a\u0004\u0018\u0001068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b7\u00108R\u0016\u0010:\u001a\u0002098\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b:\u0010;¨\u0006<"}, d2 = {"Lru/ozon/app/android/travel/feature/tours/widgets/toursLoader/presentation/ToursLoaderWidgetViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/travel/feature/tours/widgets/toursLoader/presentation/ToursLoaderVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "Landroid/view/View;", "containerView", "LVg/d;", "Lru/ozon/app/android/action/custom/CustomActionHandlersStoreFactory;", "customActionHandlersStoreFactory", "Lru/ozon/app/android/composer/ComposerReferences;", "refs", "Lru/ozon/app/android/travel/feature/tours/widgets/toursLoader/presentation/ToursLoaderViewModel;", "viewModel", "LWZ/l;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedAnalytics;", "tokenizedAnalytics", "<init>", "(Landroid/view/View;LVg/d;Lru/ozon/app/android/composer/ComposerReferences;Lru/ozon/app/android/travel/feature/tours/widgets/toursLoader/presentation/ToursLoaderViewModel;LWZ/l;)V", "", "message", "", "showError", "(Ljava/lang/String;)V", "showDefaultError", "observeLiveData", "()V", "item", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "info", "bind", "(Lru/ozon/app/android/travel/feature/tours/widgets/toursLoader/presentation/ToursLoaderVO;Ll20/d;)V", "onAttach", "LW10/c;", "Lru/ozon/app/android/composer/widgets/base/TrackingData;", "trackingData", "Lru/ozon/composer/ui/widget/f;", "Lru/ozon/app/android/tools/ViewedPond;", "viewedPond", "trackView", "(Lru/ozon/app/android/travel/feature/tours/widgets/toursLoader/presentation/ToursLoaderVO;LW10/c;Lru/ozon/composer/ui/widget/f;)V", "Ljk0/q;", "onVisibleAreaChanged", "(Ljk0/q;)V", "Lru/ozon/app/android/composer/ComposerReferences;", "Lru/ozon/app/android/travel/feature/tours/widgets/toursLoader/presentation/ToursLoaderViewModel;", "LWZ/l;", "Lru/ozon/app/android/travel/feature/tours/databinding/WidgetToursLoaderBinding;", "binding", "Lru/ozon/app/android/travel/feature/tours/databinding/WidgetToursLoaderBinding;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "Lxe/B0;", "progressJob", "Lxe/B0;", "", "isErrorShowed", "Z", "tours_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class ToursLoaderWidgetViewHolder extends k<ToursLoaderVO> {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final WidgetToursLoaderBinding binding;
    private boolean isErrorShowed;
    private B0 progressJob;

    @NotNull
    private final ComposerReferences refs;

    @NotNull
    private final l tokenizedAnalytics;

    @NotNull
    private final ToursLoaderViewModel viewModel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ToursLoaderWidgetViewHolder(@NotNull View containerView, @NotNull d customActionHandlersStoreFactory, @NotNull ComposerReferences refs, @NotNull ToursLoaderViewModel viewModel, @NotNull l tokenizedAnalytics) {
        super(containerView);
        Intrinsics.checkNotNullParameter(containerView, "containerView");
        Intrinsics.checkNotNullParameter(customActionHandlersStoreFactory, "customActionHandlersStoreFactory");
        Intrinsics.checkNotNullParameter(refs, "refs");
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        Intrinsics.checkNotNullParameter(tokenizedAnalytics, "tokenizedAnalytics");
        this.refs = refs;
        this.viewModel = viewModel;
        this.tokenizedAnalytics = tokenizedAnalytics;
        WidgetToursLoaderBinding bind = WidgetToursLoaderBinding.bind(containerView);
        Intrinsics.checkNotNullExpressionValue(bind, "bind(...)");
        this.binding = bind;
        this.actionHandler = new ActionHandler.Builder(refs, this).customActionHandlers(new ToursLoaderWidgetViewHolder$actionHandler$1(customActionHandlersStoreFactory)).buildHandler();
    }

    private final void observeLiveData() {
        this.viewModel.resultLiveData().observe(this, new ToursLoaderWidgetViewHolderKt$sam$androidx_lifecycle_Observer$0(new ToursLoaderWidgetViewHolder$observeLiveData$1(this)));
    }

    private final void showDefaultError(String message) {
        C4911f container = this.refs.getContainer();
        ViewGroup rootView = ContextExtKt.getRootView(container.c());
        if (rootView == null) {
            return;
        }
        FlashbarFactory.createDefaultError$default(FlashbarFactory.INSTANCE, rootView, null, message, null, null, null, container.g(), 58, null).show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showError(String message) {
        ToursLoaderVO boundData = getBoundData();
        EmptyStateVO error = boundData != null ? boundData.getError() : null;
        if (error == null) {
            showDefaultError(message);
            return;
        }
        this.binding.toursLoaderErrorView.bind(error, this.actionHandler);
        EmptyStateView toursLoaderErrorView = this.binding.toursLoaderErrorView;
        Intrinsics.checkNotNullExpressionValue(toursLoaderErrorView, "toursLoaderErrorView");
        toursLoaderErrorView.setVisibility(0);
        Group toursLoaderContentGroup = this.binding.toursLoaderContentGroup;
        Intrinsics.checkNotNullExpressionValue(toursLoaderContentGroup, "toursLoaderContentGroup");
        toursLoaderContentGroup.setVisibility(8);
        this.isErrorShowed = true;
    }

    @Override // ru.ozon.composer.ui.widget.k, jk0.j
    public void onAttach() {
        super.onAttach();
        observeLiveData();
    }

    @Override // jk0.j, jk0.n
    public void onVisibleAreaChanged(@NotNull q info) {
        Intrinsics.checkNotNullParameter(info, "info");
        super.onVisibleAreaChanged(info);
        ConstraintLayout constraintLayout = this.binding.getConstraintLayout();
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "getRoot(...)");
        ViewsExtensionsKt.updateHeightRegardingOverlapContainers$default(constraintLayout, info, false, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull ToursLoaderVO item, @NotNull l20.d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        Group toursLoaderContentGroup = this.binding.toursLoaderContentGroup;
        Intrinsics.checkNotNullExpressionValue(toursLoaderContentGroup, "toursLoaderContentGroup");
        toursLoaderContentGroup.setVisibility(0);
        EmptyStateView toursLoaderErrorView = this.binding.toursLoaderErrorView;
        Intrinsics.checkNotNullExpressionValue(toursLoaderErrorView, "toursLoaderErrorView");
        toursLoaderErrorView.setVisibility(8);
        if (this.isErrorShowed) {
            ThreeDotLoaderView toursLoaderDotsView = this.binding.toursLoaderDotsView;
            Intrinsics.checkNotNullExpressionValue(toursLoaderDotsView, "toursLoaderDotsView");
            toursLoaderDotsView.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: ru.ozon.app.android.travel.feature.tours.widgets.toursLoader.presentation.ToursLoaderWidgetViewHolder$bind$$inlined$doOnNextLayout$1
                @Override // android.view.View.OnLayoutChangeListener
                public void onLayoutChange(@NotNull View view, int left, int top, int right, int bottom, int oldLeft, int oldTop, int oldRight, int oldBottom) {
                    WidgetToursLoaderBinding widgetToursLoaderBinding;
                    view.removeOnLayoutChangeListener(this);
                    widgetToursLoaderBinding = ToursLoaderWidgetViewHolder.this.binding;
                    widgetToursLoaderBinding.toursLoaderDotsView.resumeAnimation();
                }
            });
        }
        AppCompatImageView toursLoaderImageAPIV = this.binding.toursLoaderImageAPIV;
        Intrinsics.checkNotNullExpressionValue(toursLoaderImageAPIV, "toursLoaderImageAPIV");
        ImageViewExtKt.load$default(toursLoaderImageAPIV, item.getImageLink(), null, null, null, null, false, null, 126, null);
        B0 b02 = this.progressJob;
        if (b02 != null) {
            b02.j(null);
        }
        K k11 = new K();
        if (!item.getProgressContent().isEmpty()) {
            this.progressJob = C10727i.c(androidx.lifecycle.K.a(this), null, null, new ToursLoaderWidgetViewHolder$bind$2$1(item, k11, this, null), 3);
        }
        this.viewModel.performComposerAction(item.getIsAllDoneAction());
    }

    @Override // ru.ozon.composer.ui.widget.k
    public void trackView(@NotNull ToursLoaderVO item, @NotNull c trackingData, f viewedPond) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(trackingData, "trackingData");
        super.trackView((ToursLoaderWidgetViewHolder) item, trackingData, viewedPond);
        t tokenizedEvent = item.getTokenizedEvent();
        if (tokenizedEvent != null) {
            TokenizedAnalyticsExtensionsKt.processViewEvents$default(this.tokenizedAnalytics, tokenizedEvent, null, 2, null);
        }
    }
}
