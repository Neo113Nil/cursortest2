package ru.ozon.app.android.travel.feature.general.common.widgets.totalPriceWithButton.v2.presentation;

import Vg.d;
import W10.c;
import WZ.t;
import android.view.View;
import androidx.lifecycle.K;
import jk0.o;
import jk0.q;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import l10.i;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.analytics.modules.tokenized.TokenizedAnalyticsExtensionsKt;
import ru.ozon.app.android.travel.data.storage.page.TravelPageKeyValueStorage;
import ru.ozon.app.android.travel.feature.general.common.widgets.totalPriceWithButton.v2.presentation.TotalPriceWithButtonV2VO;
import ru.ozon.app.android.travel.feature.general.common.widgets.totalPriceWithButton.v2.view.TotalPriceWithButtonV2View;
import ru.ozon.composer.ui.widget.f;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.text.TextDTO;
import ru.ozon.uni.atoms.utils.OzonSpannableString;
import xe.B0;
import xe.C10727i;

@Metadata(d1 = {"\u0000\u008e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003B3\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\n\u0010\u000e\u001a\u00060\fj\u0002`\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001d\u001a\u00020\u00182\u0006\u0010\u001c\u001a\u00020\u001bH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\u0018H\u0016¢\u0006\u0004\b!\u0010 J#\u0010%\u001a\u00020\u00182\u0006\u0010\"\u001a\u00020\u00022\n\u0010\u0012\u001a\u00060#j\u0002`$H\u0014¢\u0006\u0004\b%\u0010&J)\u0010+\u001a\u00020\u00182\u0006\u0010\"\u001a\u00020\u00022\u0006\u0010(\u001a\u00020'2\b\u0010*\u001a\u0004\u0018\u00010)H\u0016¢\u0006\u0004\b+\u0010,J\u0017\u0010-\u001a\u00020\u00182\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b-\u0010.J\u000f\u0010/\u001a\u00020\u0018H\u0016¢\u0006\u0004\b/\u0010 R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u00100R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u00101R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u00102R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u00103R\u0018\u0010\u000e\u001a\u00060\fj\u0002`\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u00104R\u0018\u00106\u001a\u0004\u0018\u0001058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b6\u00107R \u0010:\u001a\u000e\u0012\u0004\u0012\u000209\u0012\u0004\u0012\u00020\u0018088\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010;R$\u0010=\u001a\u0012\u0012\u0004\u0012\u000209\u0012\u0004\u0012\u00020\u001808j\u0002`<8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010;¨\u0006>"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/totalPriceWithButton/v2/presentation/TotalPriceWithButtonV2WidgetViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/travel/feature/general/common/widgets/totalPriceWithButton/v2/presentation/TotalPriceWithButtonV2VO;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "Lru/ozon/app/android/travel/feature/general/common/widgets/totalPriceWithButton/v2/view/TotalPriceWithButtonV2View;", "containerView", "Ll10/i;", "container", "Lru/ozon/app/android/travel/data/storage/page/TravelPageKeyValueStorage;", "pageStorage", "Lru/ozon/app/android/travel/feature/general/common/widgets/totalPriceWithButton/v2/presentation/TotalPriceWithButtonV2ViewModel;", "widgetViewModel", "LVg/d;", "Lru/ozon/app/android/action/custom/CustomActionHandlersStoreFactory;", "customActionHandlersStoreFactory", "<init>", "(Lru/ozon/app/android/travel/feature/general/common/widgets/totalPriceWithButton/v2/view/TotalPriceWithButtonV2View;Ll10/i;Lru/ozon/app/android/travel/data/storage/page/TravelPageKeyValueStorage;Lru/ozon/app/android/travel/feature/general/common/widgets/totalPriceWithButton/v2/presentation/TotalPriceWithButtonV2ViewModel;LVg/d;)V", "Ljk0/q;", "info", "", "calculateWidgetVisibilityPercent", "(Ljk0/q;)F", "", "text", "", "updateTimerText", "(Ljava/lang/CharSequence;)V", "", "shouldHide", "hideTimer", "(Z)V", "onAttach", "()V", "onDetach", "item", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "bind", "(Lru/ozon/app/android/travel/feature/general/common/widgets/totalPriceWithButton/v2/presentation/TotalPriceWithButtonV2VO;Ll20/d;)V", "LW10/c;", "trackingData", "Lru/ozon/composer/ui/widget/f;", "viewedPond", "trackView", "(Lru/ozon/app/android/travel/feature/general/common/widgets/totalPriceWithButton/v2/presentation/TotalPriceWithButtonV2VO;LW10/c;Lru/ozon/composer/ui/widget/f;)V", "onVisibleAreaChanged", "(Ljk0/q;)V", "onViewOutOfVisibleBounds", "Lru/ozon/app/android/travel/feature/general/common/widgets/totalPriceWithButton/v2/view/TotalPriceWithButtonV2View;", "Ll10/i;", "Lru/ozon/app/android/travel/data/storage/page/TravelPageKeyValueStorage;", "Lru/ozon/app/android/travel/feature/general/common/widgets/totalPriceWithButton/v2/presentation/TotalPriceWithButtonV2ViewModel;", "LVg/d;", "Lxe/B0;", "job", "Lxe/B0;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "Lru/ozon/app/android/action/BuildedActionHandler;", "processedActionHandler", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class TotalPriceWithButtonV2WidgetViewHolder extends k<TotalPriceWithButtonV2VO> {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final i container;

    @NotNull
    private final TotalPriceWithButtonV2View containerView;

    @NotNull
    private final d customActionHandlersStoreFactory;
    private B0 job;

    @NotNull
    private final TravelPageKeyValueStorage pageStorage;

    @NotNull
    private final Function1<AtomAction, Unit> processedActionHandler;

    @NotNull
    private final TotalPriceWithButtonV2ViewModel widgetViewModel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TotalPriceWithButtonV2WidgetViewHolder(@NotNull TotalPriceWithButtonV2View containerView, @NotNull i container, @NotNull TravelPageKeyValueStorage pageStorage, @NotNull TotalPriceWithButtonV2ViewModel widgetViewModel, @NotNull d customActionHandlersStoreFactory) {
        super(containerView);
        Intrinsics.checkNotNullParameter(containerView, "containerView");
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(pageStorage, "pageStorage");
        Intrinsics.checkNotNullParameter(widgetViewModel, "widgetViewModel");
        Intrinsics.checkNotNullParameter(customActionHandlersStoreFactory, "customActionHandlersStoreFactory");
        this.containerView = containerView;
        this.container = container;
        this.pageStorage = pageStorage;
        this.widgetViewModel = widgetViewModel;
        this.customActionHandlersStoreFactory = customActionHandlersStoreFactory;
        this.actionHandler = new ActionHandler.Builder(container, this).customActionHandlers(new TotalPriceWithButtonV2WidgetViewHolder$actionHandler$1(this)).buildHandler();
        this.processedActionHandler = new TotalPriceWithButtonV2WidgetViewHolder$processedActionHandler$1(this);
    }

    private final float calculateWidgetVisibilityPercent(q info) {
        return (((this.containerView.getHeightOfButton() / 2.0f) + this.containerView.getTopOfButton()) - info.a().d().height()) / this.itemView.getHeight();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void hideTimer(boolean shouldHide) {
        if (shouldHide) {
            this.containerView.hideTimer();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateTimerText(CharSequence text) {
        TotalPriceWithButtonV2VO.TimerVO timer;
        TextDTO countdownTitle;
        TotalPriceWithButtonV2VO boundData = getBoundData();
        if (boundData == null || (timer = boundData.getTimer()) == null || (countdownTitle = timer.getCountdownTitle()) == null) {
            return;
        }
        TotalPriceWithButtonV2View totalPriceWithButtonV2View = this.containerView;
        Intrinsics.g(text, "null cannot be cast to non-null type ru.ozon.uni.atoms.utils.OzonSpannableString");
        totalPriceWithButtonV2View.updateTimerText(TextDTO.copy$default(countdownTitle, (OzonSpannableString) text, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, 524286, null));
    }

    @Override // ru.ozon.composer.ui.widget.k, jk0.j
    public void onAttach() {
        super.onAttach();
        this.job = C10727i.c(K.a(this), null, null, new TotalPriceWithButtonV2WidgetViewHolder$onAttach$1(this, null), 3);
    }

    @Override // ru.ozon.composer.ui.widget.k, jk0.j
    public void onDetach() {
        B0 b02 = this.job;
        if (b02 != null) {
            b02.j(null);
        }
        this.job = null;
        super.onDetach();
    }

    @Override // jk0.j, lk0.b
    public void onViewOutOfVisibleBounds() {
        this.widgetViewModel.onVisibilityChanged(false);
        super.onViewOutOfVisibleBounds();
    }

    @Override // jk0.j, jk0.n
    public void onVisibleAreaChanged(@NotNull q info) {
        Intrinsics.checkNotNullParameter(info, "info");
        super.onVisibleAreaChanged(info);
        float calculateWidgetVisibilityPercent = calculateWidgetVisibilityPercent(info);
        View itemView = this.itemView;
        Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
        this.widgetViewModel.onVisibilityChanged(o.a(itemView, info, true) > calculateWidgetVisibilityPercent);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull TotalPriceWithButtonV2VO item, @NotNull l20.d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        this.containerView.bind(item, this.actionHandler, this.processedActionHandler);
    }

    @Override // ru.ozon.composer.ui.widget.k
    public void trackView(@NotNull TotalPriceWithButtonV2VO item, @NotNull c trackingData, f viewedPond) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(trackingData, "trackingData");
        t viewEvent = item.getViewEvent();
        if (viewEvent != null) {
            TokenizedAnalyticsExtensionsKt.processViewEvents$default(this.container.X(), viewEvent, null, 2, null);
        }
    }
}
