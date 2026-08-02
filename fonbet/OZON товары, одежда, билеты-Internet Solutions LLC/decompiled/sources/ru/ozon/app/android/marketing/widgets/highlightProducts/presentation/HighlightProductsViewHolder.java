package ru.ozon.app.android.marketing.widgets.highlightProducts.presentation;

import Ae.C2399j;
import Ae.C2408n0;
import W10.c;
import WZ.t;
import android.view.View;
import androidx.lifecycle.K;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.analytics.modules.tokenized.TokenizedAnalyticsExtensionsKt;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.marketing.databinding.WidgetHighlightProductsBinding;
import ru.ozon.app.android.marketing.widgets.highlightsWrapper.core.HighlightsWrapperStateManager;
import ru.ozon.composer.ui.widget.f;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.atoms.af.AtomAction;
import xe.B0;

@Metadata(d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u00032\u00020\u0004B\u001f\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J#\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0012\u001a\u00020\u00022\n\u0010\u0015\u001a\u00060\u0013j\u0002`\u0014H\u0014¢\u0006\u0004\b\u0017\u0010\u0018J3\u0010\u001f\u001a\u00020\u00162\u0006\u0010\u0012\u001a\u00020\u00022\n\u0010\u001b\u001a\u00060\u0019j\u0002`\u001a2\u000e\u0010\u001e\u001a\n\u0018\u00010\u001cj\u0004\u0018\u0001`\u001dH\u0016¢\u0006\u0004\b\u001f\u0010 R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010!\u001a\u0004\b\"\u0010#R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010$R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010%R\u0014\u0010'\u001a\u00020&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R \u0010+\u001a\u000e\u0012\u0004\u0012\u00020*\u0012\u0004\u0012\u00020\u00160)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0014\u0010.\u001a\u00020-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u0018\u00100\u001a\u0004\u0018\u00010\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u00101¨\u00062"}, d2 = {"Lru/ozon/app/android/marketing/widgets/highlightProducts/presentation/HighlightProductsViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/marketing/widgets/highlightProducts/presentation/HighlightProductsVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "", "Landroid/view/View;", "containerView", "Lru/ozon/app/android/composer/ComposerReferences;", "refs", "Lru/ozon/app/android/marketing/widgets/highlightsWrapper/core/HighlightsWrapperStateManager;", "stateManager", "<init>", "(Landroid/view/View;Lru/ozon/app/android/composer/ComposerReferences;Lru/ozon/app/android/marketing/widgets/highlightsWrapper/core/HighlightsWrapperStateManager;)V", "", "widgetAsyncData", "Lxe/B0;", "observeMiniWidgetState", "(Ljava/lang/String;)Lxe/B0;", "item", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "info", "", "bind", "(Lru/ozon/app/android/marketing/widgets/highlightProducts/presentation/HighlightProductsVO;Ll20/d;)V", "LW10/c;", "Lru/ozon/app/android/composer/widgets/base/TrackingData;", "trackingData", "Lru/ozon/composer/ui/widget/f;", "Lru/ozon/app/android/tools/ViewedPond;", "viewedPond", "trackView", "(Lru/ozon/app/android/marketing/widgets/highlightProducts/presentation/HighlightProductsVO;LW10/c;Lru/ozon/composer/ui/widget/f;)V", "Landroid/view/View;", "getContainerView", "()Landroid/view/View;", "Lru/ozon/app/android/composer/ComposerReferences;", "Lru/ozon/app/android/marketing/widgets/highlightsWrapper/core/HighlightsWrapperStateManager;", "Lru/ozon/app/android/marketing/databinding/WidgetHighlightProductsBinding;", "binding", "Lru/ozon/app/android/marketing/databinding/WidgetHighlightProductsBinding;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "Lru/ozon/app/android/marketing/widgets/highlightProducts/presentation/HighlightProductsBinder;", "highlightProductsBinder", "Lru/ozon/app/android/marketing/widgets/highlightProducts/presentation/HighlightProductsBinder;", "observeAsyncStateJob", "Lxe/B0;", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class HighlightProductsViewHolder extends k<HighlightProductsVO> {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final WidgetHighlightProductsBinding binding;

    @NotNull
    private final View containerView;

    @NotNull
    private final HighlightProductsBinder highlightProductsBinder;
    private B0 observeAsyncStateJob;

    @NotNull
    private final ComposerReferences refs;

    @NotNull
    private final HighlightsWrapperStateManager stateManager;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HighlightProductsViewHolder(@NotNull View containerView, @NotNull ComposerReferences refs, @NotNull HighlightsWrapperStateManager stateManager) {
        super(containerView);
        Intrinsics.checkNotNullParameter(containerView, "containerView");
        Intrinsics.checkNotNullParameter(refs, "refs");
        Intrinsics.checkNotNullParameter(stateManager, "stateManager");
        this.containerView = containerView;
        this.refs = refs;
        this.stateManager = stateManager;
        WidgetHighlightProductsBinding bind = WidgetHighlightProductsBinding.bind(containerView);
        Intrinsics.checkNotNullExpressionValue(bind, "bind(...)");
        this.binding = bind;
        Function1<AtomAction, Unit> buildHandler = new ActionHandler.Builder(refs, this).buildHandler();
        this.actionHandler = buildHandler;
        this.highlightProductsBinder = new HighlightProductsBinder(containerView, bind, buildHandler);
    }

    private final B0 observeMiniWidgetState(String widgetAsyncData) {
        return C2399j.C(new C2408n0(C2399j.o(this.stateManager.listenState(widgetAsyncData)), new HighlightProductsViewHolder$observeMiniWidgetState$1(this, null)), K.a(this));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull HighlightProductsVO item, @NotNull d info) {
        B0 b02;
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        this.highlightProductsBinder.bind(item);
        B0 b03 = this.observeAsyncStateJob;
        if (b03 == null || ((b03 != null && b03.isCancelled()) || ((b02 = this.observeAsyncStateJob) != null && b02.l0()))) {
            this.observeAsyncStateJob = observeMiniWidgetState(info.c().a());
        }
    }

    @Override // ru.ozon.composer.ui.widget.k
    public void trackView(@NotNull HighlightProductsVO item, @NotNull c trackingData, f viewedPond) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(trackingData, "trackingData");
        t trackingInfo = item.getTrackingInfo();
        if (trackingInfo != null) {
            TokenizedAnalyticsExtensionsKt.processViewEvents$default(this.refs.getTokenizedAnalytics(), trackingInfo, null, 2, null);
        }
    }
}
