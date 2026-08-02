package ru.ozon.app.android.travel.feature.general.common.widgets.totalPriceWithButton.v2.presentation.sticky;

import AP.b;
import Vg.d;
import android.view.View;
import android.widget.LinearLayout;
import androidx.lifecycle.K;
import d20.AbstractC6064a;
import d20.InterfaceC6068e;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import l10.i;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.composer.throttle.HandlersInhibitor;
import ru.ozon.app.android.travel.data.storage.page.TravelPageKeyValueStorage;
import ru.ozon.app.android.travel.feature.general.common.widgets.totalPriceWithButton.v2.presentation.TotalPriceWithButtonV2VO;
import ru.ozon.app.android.travel.feature.general.common.widgets.totalPriceWithButton.v2.presentation.TotalPriceWithButtonV2ViewModel;
import ru.ozon.app.android.travel.feature.general.common.widgets.totalPriceWithButton.v2.view.TotalPriceWithButtonV2StickyView;
import ru.ozon.app.android.travel.utils.animator.ListTotalStickyAnimator;
import ru.ozon.app.android.travel.utils.animator.StickyAnimator;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.text.TextDTO;
import ru.ozon.uni.atoms.utils.OzonSpannableString;
import xe.B0;
import xe.C10727i;

@Metadata(d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001BA\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\u0010\u0007\u001a\u00060\u0005j\u0002`\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u001a\u001a\u00020\u00152\u0006\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001d\u001a\u00020\u00152\u0006\u0010\u001c\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u001d\u0010\u0017J\u000f\u0010\u001e\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\u0015H\u0016¢\u0006\u0004\b \u0010\u001fJ\u0017\u0010\"\u001a\u00020\u00152\u0006\u0010!\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\"\u0010#R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010$R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010%R\u0018\u0010'\u001a\u0004\u0018\u00010&8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010(R\u0016\u0010)\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010*R\u0018\u0010,\u001a\u0004\u0018\u00010+8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010-R\u0014\u0010/\u001a\u00020.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R \u00103\u001a\u000e\u0012\u0004\u0012\u000202\u0012\u0004\u0012\u00020\u0015018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104R$\u00106\u001a\u0012\u0012\u0004\u0012\u000202\u0012\u0004\u0012\u00020\u001501j\u0002`58\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00104R\u0016\u0010:\u001a\u0004\u0018\u0001078BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b8\u00109¨\u0006;"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/totalPriceWithButton/v2/presentation/sticky/TotalPriceWithButtonV2StickyWidgetViewHolder;", "Ld20/a;", "Lru/ozon/app/android/travel/feature/general/common/widgets/totalPriceWithButton/v2/presentation/sticky/TotalPriceWithButtonV2StickyVO;", "Ll10/i;", "container", "LVg/d;", "Lru/ozon/app/android/action/custom/CustomActionHandlersStoreFactory;", "customActionHandlersStoreFactory", "Lru/ozon/app/android/composer/throttle/HandlersInhibitor;", "inhibitor", "Lru/ozon/app/android/travel/feature/general/common/widgets/totalPriceWithButton/v2/presentation/TotalPriceWithButtonV2ViewModel;", "widgetViewModel", "Lru/ozon/app/android/travel/data/storage/page/TravelPageKeyValueStorage;", "pageStorage", "Ld20/e;", "Landroid/widget/LinearLayout;", "viewFactory", "<init>", "(Ll10/i;LVg/d;Lru/ozon/app/android/composer/throttle/HandlersInhibitor;Lru/ozon/app/android/travel/feature/general/common/widgets/totalPriceWithButton/v2/presentation/TotalPriceWithButtonV2ViewModel;Lru/ozon/app/android/travel/data/storage/page/TravelPageKeyValueStorage;Ld20/e;)V", "", "isNonStickyWidgetVisible", "", "animateStickyWidget", "(Z)V", "", "text", "updateTimerText", "(Ljava/lang/CharSequence;)V", "shouldHide", "hideTimer", "onWidgetCreated", "()V", "onWidgetDestroyed", "item", "bind", "(Lru/ozon/app/android/travel/feature/general/common/widgets/totalPriceWithButton/v2/presentation/sticky/TotalPriceWithButtonV2StickyVO;)V", "Lru/ozon/app/android/travel/feature/general/common/widgets/totalPriceWithButton/v2/presentation/TotalPriceWithButtonV2ViewModel;", "Lru/ozon/app/android/travel/data/storage/page/TravelPageKeyValueStorage;", "Lru/ozon/app/android/travel/utils/animator/StickyAnimator;", "animator", "Lru/ozon/app/android/travel/utils/animator/StickyAnimator;", "isHiddenBeforeLayout", "Z", "Lxe/B0;", "job", "Lxe/B0;", "Landroid/view/View$OnLayoutChangeListener;", "layoutChangeListener", "Landroid/view/View$OnLayoutChangeListener;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "Lru/ozon/app/android/action/BuildedActionHandler;", "processedActionHandler", "Lru/ozon/app/android/travel/feature/general/common/widgets/totalPriceWithButton/v2/view/TotalPriceWithButtonV2StickyView;", "getContainerView", "()Lru/ozon/app/android/travel/feature/general/common/widgets/totalPriceWithButton/v2/view/TotalPriceWithButtonV2StickyView;", "containerView", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class TotalPriceWithButtonV2StickyWidgetViewHolder extends AbstractC6064a<TotalPriceWithButtonV2StickyVO> {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;
    private StickyAnimator animator;
    private boolean isHiddenBeforeLayout;
    private B0 job;

    @NotNull
    private final View.OnLayoutChangeListener layoutChangeListener;

    @NotNull
    private final TravelPageKeyValueStorage pageStorage;

    @NotNull
    private final Function1<AtomAction, Unit> processedActionHandler;

    @NotNull
    private final TotalPriceWithButtonV2ViewModel widgetViewModel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TotalPriceWithButtonV2StickyWidgetViewHolder(@NotNull i container, @NotNull d customActionHandlersStoreFactory, @NotNull HandlersInhibitor inhibitor, @NotNull TotalPriceWithButtonV2ViewModel widgetViewModel, @NotNull TravelPageKeyValueStorage pageStorage, @NotNull InterfaceC6068e<LinearLayout> viewFactory) {
        super(container, viewFactory);
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(customActionHandlersStoreFactory, "customActionHandlersStoreFactory");
        Intrinsics.checkNotNullParameter(inhibitor, "inhibitor");
        Intrinsics.checkNotNullParameter(widgetViewModel, "widgetViewModel");
        Intrinsics.checkNotNullParameter(pageStorage, "pageStorage");
        Intrinsics.checkNotNullParameter(viewFactory, "viewFactory");
        this.widgetViewModel = widgetViewModel;
        this.pageStorage = pageStorage;
        this.layoutChangeListener = new b(this, 0);
        this.actionHandler = new ActionHandler.Builder(container, this).customActionHandlers(new TotalPriceWithButtonV2StickyWidgetViewHolder$actionHandler$1(customActionHandlersStoreFactory)).enableClickThrottling(inhibitor).buildHandler();
        this.processedActionHandler = new TotalPriceWithButtonV2StickyWidgetViewHolder$processedActionHandler$1(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void animateStickyWidget(boolean isNonStickyWidgetVisible) {
        this.isHiddenBeforeLayout = isNonStickyWidgetVisible;
        if (isNonStickyWidgetVisible) {
            StickyAnimator stickyAnimator = this.animator;
            if (stickyAnimator != null) {
                stickyAnimator.hide();
                return;
            }
            return;
        }
        StickyAnimator stickyAnimator2 = this.animator;
        if (stickyAnimator2 != null) {
            stickyAnimator2.show();
        }
    }

    private final TotalPriceWithButtonV2StickyView getContainerView() {
        View view = getView();
        if (view instanceof TotalPriceWithButtonV2StickyView) {
            return (TotalPriceWithButtonV2StickyView) view;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void hideTimer(boolean shouldHide) {
        TotalPriceWithButtonV2StickyView containerView;
        if (!shouldHide || (containerView = getContainerView()) == null) {
            return;
        }
        containerView.hideTimer();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void layoutChangeListener$lambda$0(TotalPriceWithButtonV2StickyWidgetViewHolder totalPriceWithButtonV2StickyWidgetViewHolder, View view, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18) {
        StickyAnimator stickyAnimator;
        int i19 = i14 - i12;
        if (i18 - i16 != i19) {
            totalPriceWithButtonV2StickyWidgetViewHolder.animator = i19 != 0 ? new ListTotalStickyAnimator(totalPriceWithButtonV2StickyWidgetViewHolder.getView(), i19) : null;
        }
        if (!totalPriceWithButtonV2StickyWidgetViewHolder.isHiddenBeforeLayout || (stickyAnimator = totalPriceWithButtonV2StickyWidgetViewHolder.animator) == null) {
            return;
        }
        stickyAnimator.hide();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final void updateTimerText(CharSequence text) {
        TotalPriceWithButtonV2VO.TimerVO timer;
        TextDTO countdownTitle;
        TotalPriceWithButtonV2StickyView containerView;
        TotalPriceWithButtonV2StickyVO totalPriceWithButtonV2StickyVO = (TotalPriceWithButtonV2StickyVO) getBoundData();
        if (totalPriceWithButtonV2StickyVO == null || (timer = totalPriceWithButtonV2StickyVO.getTimer()) == null || (countdownTitle = timer.getCountdownTitle()) == null || (containerView = getContainerView()) == null) {
            return;
        }
        Intrinsics.g(text, "null cannot be cast to non-null type ru.ozon.uni.atoms.utils.OzonSpannableString");
        containerView.updateTimerText(TextDTO.copy$default(countdownTitle, (OzonSpannableString) text, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, 524286, null));
    }

    @Override // d20.AbstractC6065b
    public void onWidgetCreated() {
        super.onWidgetCreated();
        TotalPriceWithButtonV2StickyView containerView = getContainerView();
        if (containerView != null) {
            containerView.addOnLayoutChangeListener(this.layoutChangeListener);
        }
        this.job = C10727i.c(K.a(this), null, null, new TotalPriceWithButtonV2StickyWidgetViewHolder$onWidgetCreated$1(this, null), 3);
    }

    @Override // d20.AbstractC6065b
    public void onWidgetDestroyed() {
        B0 b02 = this.job;
        if (b02 != null) {
            b02.j(null);
        }
        this.job = null;
        TotalPriceWithButtonV2StickyView containerView = getContainerView();
        if (containerView != null) {
            containerView.removeOnLayoutChangeListener(this.layoutChangeListener);
        }
        super.onWidgetDestroyed();
    }

    @Override // d20.AbstractC6065b
    public void bind(@NotNull TotalPriceWithButtonV2StickyVO item) {
        Intrinsics.checkNotNullParameter(item, "item");
        TotalPriceWithButtonV2StickyView containerView = getContainerView();
        if (containerView != null) {
            containerView.bind(item, this.actionHandler, this.processedActionHandler);
        }
    }
}
