package ru.ozon.app.android.travel.feature.general.main.widgets.topTravelModal.presentation;

import Vg.d;
import W10.c;
import WZ.l;
import WZ.m;
import WZ.t;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.composer.ui.widget.f;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003B?\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\n\u0010\n\u001a\u00060\bj\u0002`\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\n\u0010\u0011\u001a\u00060\u000fj\u0002`\u0010¢\u0006\u0004\b\u0012\u0010\u0013J#\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0014\u001a\u00020\u00022\n\u0010\u0017\u001a\u00060\u0015j\u0002`\u0016H\u0014¢\u0006\u0004\b\u0019\u0010\u001aJ/\u0010 \u001a\u00020\u00182\u0006\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\u001b2\u000e\u0010\u001f\u001a\n\u0018\u00010\u001dj\u0004\u0018\u0001`\u001eH\u0016¢\u0006\u0004\b \u0010!R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\"R\u0018\u0010\n\u001a\u00060\bj\u0002`\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010#R\u0018\u0010\u0011\u001a\u00060\u000fj\u0002`\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010$R \u0010'\u001a\u000e\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020\u00180%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(¨\u0006)"}, d2 = {"Lru/ozon/app/android/travel/feature/general/main/widgets/topTravelModal/presentation/TopTravelModalWidgetViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/travel/feature/general/main/widgets/topTravelModal/presentation/TopTravelModalVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "Lru/ozon/app/android/composer/ComposerReferences;", "references", "Lru/ozon/app/android/travel/feature/general/main/widgets/topTravelModal/presentation/TopTravelModalView;", "containerView", "LVg/d;", "Lru/ozon/app/android/action/custom/CustomActionHandlersStoreFactory;", "customActionHandlersStoreFactory", "", "bottomInset", "Lru/ozon/app/android/travel/feature/general/main/widgets/topTravelModal/presentation/TopTravelModalViewModel;", "viewModel", "LWZ/l;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedAnalytics;", "tokenizedAnalytics", "<init>", "(Lru/ozon/app/android/composer/ComposerReferences;Lru/ozon/app/android/travel/feature/general/main/widgets/topTravelModal/presentation/TopTravelModalView;LVg/d;ILru/ozon/app/android/travel/feature/general/main/widgets/topTravelModal/presentation/TopTravelModalViewModel;LWZ/l;)V", "item", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "info", "", "bind", "(Lru/ozon/app/android/travel/feature/general/main/widgets/topTravelModal/presentation/TopTravelModalVO;Ll20/d;)V", "LW10/c;", "trackingData", "Lru/ozon/composer/ui/widget/f;", "Lru/ozon/app/android/tools/ViewedPond;", "viewedPond", "trackView", "(Lru/ozon/app/android/travel/feature/general/main/widgets/topTravelModal/presentation/TopTravelModalVO;LW10/c;Lru/ozon/composer/ui/widget/f;)V", "Lru/ozon/app/android/travel/feature/general/main/widgets/topTravelModal/presentation/TopTravelModalView;", "LVg/d;", "LWZ/l;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class TopTravelModalWidgetViewHolder extends k<TopTravelModalVO> {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final TopTravelModalView containerView;

    @NotNull
    private final d customActionHandlersStoreFactory;

    @NotNull
    private final l tokenizedAnalytics;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TopTravelModalWidgetViewHolder(@NotNull ComposerReferences references, @NotNull TopTravelModalView containerView, @NotNull d customActionHandlersStoreFactory, int i11, @NotNull TopTravelModalViewModel viewModel, @NotNull l tokenizedAnalytics) {
        super(containerView);
        Intrinsics.checkNotNullParameter(references, "references");
        Intrinsics.checkNotNullParameter(containerView, "containerView");
        Intrinsics.checkNotNullParameter(customActionHandlersStoreFactory, "customActionHandlersStoreFactory");
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        Intrinsics.checkNotNullParameter(tokenizedAnalytics, "tokenizedAnalytics");
        this.containerView = containerView;
        this.customActionHandlersStoreFactory = customActionHandlersStoreFactory;
        this.tokenizedAnalytics = tokenizedAnalytics;
        this.actionHandler = new ActionHandler.Builder(references, this).customActionHandlers(new TopTravelModalWidgetViewHolder$actionHandler$1(this)).onComposerAction(new TopTravelModalWidgetViewHolder$actionHandler$2(viewModel)).buildHandler();
        containerView.setBottomPadding(i11 / 2);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull TopTravelModalVO item, @NotNull l20.d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        AtomAction action = item.getAction();
        if (action != null) {
            this.actionHandler.invoke(action);
        }
        this.containerView.bind(item, this.actionHandler);
    }

    @Override // ru.ozon.composer.ui.widget.k
    public void trackView(@NotNull TopTravelModalVO item, @NotNull c trackingData, f viewedPond) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(trackingData, "trackingData");
        super.trackView((TopTravelModalWidgetViewHolder) item, trackingData, viewedPond);
        t viewEvent = item.getViewEvent();
        if (viewEvent != null) {
            m.c(this.tokenizedAnalytics, viewEvent, null);
        }
    }
}
