package ru.ozon.app.android.travel.feature.general.common.widgets.bonusExpirationRemainder.v1.presentation;

import Ae.C2399j;
import Ae.C2408n0;
import L3.p;
import Sc.o;
import WZ.l;
import WZ.m;
import WZ.t;
import android.view.View;
import android.widget.LinearLayout;
import androidx.lifecycle.K;
import d20.AbstractC6064a;
import d20.InterfaceC6068e;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import l10.InterfaceC7851b;
import l10.i;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.travel.feature.general.common.widgets.bonusExpirationRemainder.v1.presentation.BonusExpirationRemainderViewModel;
import ru.ozon.app.android.travel.feature.general.common.widgets.bonusExpirationRemainder.v1.presentation.BonusExpirationRemainderWidgetViewHolder;
import ru.ozon.app.android.travel.feature.general.common.widgets.bonusExpirationRemainder.v1.view.BonusExpirationRemainderView;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B%\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0014\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u001a\u001a\u00020\f2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001c\u001a\u00020\f2\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010 \u001a\u00020\f2\u0006\u0010\u001f\u001a\u00020\u001eH\u0002¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\fH\u0016¢\u0006\u0004\b\"\u0010\u000eJ\u0017\u0010#\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\u0002H\u0016¢\u0006\u0004\b#\u0010\u0015R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010$R\u0014\u0010&\u001a\u00020%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010)\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R \u0010-\u001a\u000e\u0012\u0004\u0012\u00020,\u0012\u0004\u0012\u00020\f0+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u0016\u0010/\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u00100¨\u00061"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/bonusExpirationRemainder/v1/presentation/BonusExpirationRemainderWidgetViewHolder;", "Ld20/a;", "Lru/ozon/app/android/travel/feature/general/common/widgets/bonusExpirationRemainder/v1/presentation/BonusExpirationRemainderVI;", "Ll10/i;", "container", "Ld20/e;", "Landroid/widget/LinearLayout;", "viewFactory", "Lru/ozon/app/android/travel/feature/general/common/widgets/bonusExpirationRemainder/v1/presentation/BonusExpirationRemainderViewModel;", "viewModel", "<init>", "(Ll10/i;Ld20/e;Lru/ozon/app/android/travel/feature/general/common/widgets/bonusExpirationRemainder/v1/presentation/BonusExpirationRemainderViewModel;)V", "", "observeFlow", "()V", "Lru/ozon/app/android/travel/feature/general/common/widgets/bonusExpirationRemainder/v1/presentation/BonusExpirationRemainderViewModel$BonusAction;", "result", "handleAction", "(Lru/ozon/app/android/travel/feature/general/common/widgets/bonusExpirationRemainder/v1/presentation/BonusExpirationRemainderViewModel$BonusAction;)V", "item", "showContent", "(Lru/ozon/app/android/travel/feature/general/common/widgets/bonusExpirationRemainder/v1/presentation/BonusExpirationRemainderVI;)V", "", "id", "", "withoutAnimation", "removeWidget", "(JZ)V", "hideWithAnimation", "(J)V", "Lru/ozon/uni/atoms/af/AtomAction$Click;", "action", "onCloseButtonClicked", "(Lru/ozon/uni/atoms/af/AtomAction$Click;)V", "onWidgetCreated", "bind", "Lru/ozon/app/android/travel/feature/general/common/widgets/bonusExpirationRemainder/v1/presentation/BonusExpirationRemainderViewModel;", "LWZ/l;", "tokenizedAnalytics", "LWZ/l;", "Ll10/b;", "controller", "Ll10/b;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "animationIsNotRunning", "Z", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class BonusExpirationRemainderWidgetViewHolder extends AbstractC6064a<BonusExpirationRemainderVI> {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;
    private boolean animationIsNotRunning;

    @NotNull
    private final InterfaceC7851b controller;

    @NotNull
    private final l tokenizedAnalytics;

    @NotNull
    private final BonusExpirationRemainderViewModel viewModel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BonusExpirationRemainderWidgetViewHolder(@NotNull i container, @NotNull InterfaceC6068e<LinearLayout> viewFactory, @NotNull BonusExpirationRemainderViewModel viewModel) {
        super(container, viewFactory);
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(viewFactory, "viewFactory");
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        this.viewModel = viewModel;
        this.tokenizedAnalytics = container.X();
        this.controller = container.M();
        this.actionHandler = new ActionHandler.Builder(container, this).onClick(new BonusExpirationRemainderWidgetViewHolder$actionHandler$1(this)).buildHandler();
        this.animationIsNotRunning = true;
    }

    private final void handleAction(BonusExpirationRemainderViewModel.BonusAction result) {
        if (result instanceof BonusExpirationRemainderViewModel.ShowItem) {
            showContent(((BonusExpirationRemainderViewModel.ShowItem) result).getItem());
        } else if (result instanceof BonusExpirationRemainderViewModel.RemoveWidget) {
            BonusExpirationRemainderViewModel.RemoveWidget removeWidget = (BonusExpirationRemainderViewModel.RemoveWidget) result;
            removeWidget(removeWidget.getId(), removeWidget.getWithoutAnimation());
        } else if (!(result instanceof BonusExpirationRemainderViewModel.Ignore)) {
            throw new o();
        }
    }

    private final void hideWithAnimation(final long id2) {
        getView().animate().withLayer().translationY(getView().getHeight()).withStartAction(new p(this, 5)).withEndAction(new Runnable() { // from class: oO.b
            @Override // java.lang.Runnable
            public final void run() {
                BonusExpirationRemainderWidgetViewHolder.hideWithAnimation$lambda$2(BonusExpirationRemainderWidgetViewHolder.this, id2);
            }
        }).start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void hideWithAnimation$lambda$2(BonusExpirationRemainderWidgetViewHolder bonusExpirationRemainderWidgetViewHolder, long j11) {
        bonusExpirationRemainderWidgetViewHolder.animationIsNotRunning = true;
        bonusExpirationRemainderWidgetViewHolder.controller.m(j11);
    }

    private final void observeFlow() {
        C2399j.C(new C2408n0(this.viewModel.getResultFlow(), new BonusExpirationRemainderWidgetViewHolder$observeFlow$1(this)), K.a(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ Object observeFlow$handleAction(BonusExpirationRemainderWidgetViewHolder bonusExpirationRemainderWidgetViewHolder, BonusExpirationRemainderViewModel.BonusAction bonusAction, d dVar) {
        bonusExpirationRemainderWidgetViewHolder.handleAction(bonusAction);
        return Unit.f71690a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final void onCloseButtonClicked(AtomAction.Click action) {
        BonusExpirationRemainderVI bonusExpirationRemainderVI = (BonusExpirationRemainderVI) getBoundData();
        if (bonusExpirationRemainderVI == null) {
            return;
        }
        this.viewModel.onCloseClicked(bonusExpirationRemainderVI.getId(), action.getParams());
    }

    private final void removeWidget(long id2, boolean withoutAnimation) {
        if (withoutAnimation) {
            this.controller.m(id2);
        } else if (this.animationIsNotRunning) {
            hideWithAnimation(id2);
        }
    }

    private final void showContent(BonusExpirationRemainderVI item) {
        View view = getView();
        BonusExpirationRemainderView bonusExpirationRemainderView = view instanceof BonusExpirationRemainderView ? (BonusExpirationRemainderView) view : null;
        if (bonusExpirationRemainderView != null) {
            bonusExpirationRemainderView.setVisibility(0);
            bonusExpirationRemainderView.bind(item, this.actionHandler);
            t trackingInfo = item.getTrackingInfo();
            if (trackingInfo != null) {
                m.c(this.tokenizedAnalytics, trackingInfo, null);
            }
        }
    }

    @Override // d20.AbstractC6065b
    public void onWidgetCreated() {
        observeFlow();
    }

    @Override // d20.AbstractC6065b
    public void bind(@NotNull BonusExpirationRemainderVI item) {
        Intrinsics.checkNotNullParameter(item, "item");
        this.viewModel.processItem(item);
    }
}
