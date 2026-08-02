package ru.ozon.app.android.ugc.widgets.reviewFormMobile.reviewFormHeader;

import Sc.InterfaceC4008j;
import Sc.k;
import W10.c;
import WZ.l;
import WZ.m;
import WZ.t;
import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import androidx.fragment.app.ComponentCallbacksC5392m;
import d20.AbstractC6067d;
import d20.InterfaceC6068e;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import l10.i;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pdp.utils.ViewExtKt;
import ru.ozon.app.android.ugc.widgets.reviewFormMobile.presentation.ReviewFormViewModel;
import ru.ozon.app.android.ugc.widgets.reviewFormMobile.presentation.ViewIntent;
import ru.ozon.app.android.ugc.widgets.reviewFormMobile.reviewFormHeader.ReviewFormHeaderVO;
import ru.ozon.app.android.uikit.utils.StatusBarController;
import ru.ozon.composer.ui.widget.f;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.core.UniColors;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B-\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0004\b\f\u0010\rJ\u0013\u0010\u000f\u001a\u00020\u000e*\u00020\u0002H\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0014\u0010\u0010J'\u0010\u0019\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u001bR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u001cR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u001dR'\u0010$\u001a\u000e\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020\u000e0\u001e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#¨\u0006%"}, d2 = {"Lru/ozon/app/android/ugc/widgets/reviewFormMobile/reviewFormHeader/ReviewFormHeaderVH;", "Ld20/d;", "Lru/ozon/app/android/ugc/widgets/reviewFormMobile/reviewFormHeader/ReviewFormHeaderVO;", "Lru/ozon/app/android/ugc/widgets/reviewFormMobile/presentation/ReviewFormViewModel;", "formViewModel", "LWZ/l;", "tokenizedAnalytics", "Ll10/i;", "container", "Ld20/e;", "Landroid/widget/LinearLayout;", "viewFactory", "<init>", "(Lru/ozon/app/android/ugc/widgets/reviewFormMobile/presentation/ReviewFormViewModel;LWZ/l;Ll10/i;Ld20/e;)V", "", "setupBackground", "(Lru/ozon/app/android/ugc/widgets/reviewFormMobile/reviewFormHeader/ReviewFormHeaderVO;)V", "onWidgetCreated", "()V", "item", "bind", "LW10/c;", "trackingData", "Lru/ozon/composer/ui/widget/f;", "viewedPond", "trackView", "(Lru/ozon/app/android/ugc/widgets/reviewFormMobile/reviewFormHeader/ReviewFormHeaderVO;LW10/c;Lru/ozon/composer/ui/widget/f;)V", "Lru/ozon/app/android/ugc/widgets/reviewFormMobile/presentation/ReviewFormViewModel;", "LWZ/l;", "Ll10/i;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler$delegate", "LSc/j;", "getActionHandler", "()Lkotlin/jvm/functions/Function1;", "actionHandler", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ReviewFormHeaderVH extends AbstractC6067d<ReviewFormHeaderVO> {

    /* renamed from: actionHandler$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j actionHandler;

    @NotNull
    private final i container;

    @NotNull
    private final ReviewFormViewModel formViewModel;

    @NotNull
    private final l tokenizedAnalytics;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReviewFormHeaderVH(@NotNull ReviewFormViewModel formViewModel, @NotNull l tokenizedAnalytics, @NotNull i container, @NotNull InterfaceC6068e<LinearLayout> viewFactory) {
        super(container, viewFactory);
        Intrinsics.checkNotNullParameter(formViewModel, "formViewModel");
        Intrinsics.checkNotNullParameter(tokenizedAnalytics, "tokenizedAnalytics");
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(viewFactory, "viewFactory");
        this.formViewModel = formViewModel;
        this.tokenizedAnalytics = tokenizedAnalytics;
        this.container = container;
        this.actionHandler = k.b(new ReviewFormHeaderVH$actionHandler$2(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Function1<AtomAction, Unit> getActionHandler() {
        return (Function1) this.actionHandler.getValue();
    }

    private final void setupBackground(ReviewFormHeaderVO reviewFormHeaderVO) {
        String backgroundColor;
        ComponentCallbacksC5392m c11 = this.container.Q().c();
        if (c11 == null || (backgroundColor = reviewFormHeaderVO.getBackgroundColor()) == null) {
            return;
        }
        StyleParser styleParser = StyleParser.INSTANCE;
        Context context = getView().getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        int parseColor = styleParser.parseColor(context, backgroundColor, UniColors.LAYER_FLOOR_1.getResId());
        getView().setBackgroundColor(parseColor);
        StatusBarController statusBarController = StatusBarController.INSTANCE;
        StatusBarController.UpdateReason.NewState newState = StatusBarController.UpdateReason.NewState.INSTANCE;
        statusBarController.setStatusBarBackgroundColor(c11, newState, parseColor);
        statusBarController.setStatusBarContentColor(c11, newState, ViewExtKt.isColorDark$default(parseColor, 0.0d, 1, null), true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // d20.AbstractC6065b
    public void onWidgetCreated() {
        ReviewFormHeaderVO.SubmitOnBackConfigVO submitOnBackConfig;
        ReviewFormHeaderVO reviewFormHeaderVO = (ReviewFormHeaderVO) getBoundData();
        if (reviewFormHeaderVO == null || (submitOnBackConfig = reviewFormHeaderVO.getSubmitOnBackConfig()) == null) {
            return;
        }
        ReviewFormViewModel reviewFormViewModel = this.formViewModel;
        AtomAction submitAction = submitOnBackConfig.getSubmitAction();
        int minRating = submitOnBackConfig.getMinRating();
        ReviewFormHeaderVO reviewFormHeaderVO2 = (ReviewFormHeaderVO) getBoundData();
        reviewFormViewModel.onViewIntent(new ViewIntent.ReviewHeaderInitialized(submitAction, minRating, reviewFormHeaderVO2 != null ? Long.valueOf(reviewFormHeaderVO2.getId()) : null, getTrackingData().d(), getTrackingData().b(), submitOnBackConfig.getSubmitActionTrackingInfo()));
    }

    @Override // d20.AbstractC6065b
    public void bind(@NotNull ReviewFormHeaderVO item) {
        Intrinsics.checkNotNullParameter(item, "item");
        View view = getView();
        Intrinsics.g(view, "null cannot be cast to non-null type ru.ozon.app.android.ugc.widgets.reviewFormMobile.reviewFormHeader.ReviewFormHeaderView");
        ReviewFormHeaderView reviewFormHeaderView = (ReviewFormHeaderView) view;
        setupBackground(item);
        reviewFormHeaderView.setCell(item.getProductCell(), getActionHandler());
        reviewFormHeaderView.setBackButton(item.getBackButton(), new ReviewFormHeaderVH$bind$1$1(this, item));
    }

    @Override // d20.AbstractC6065b
    public void trackView(@NotNull ReviewFormHeaderVO item, @NotNull c trackingData, @NotNull f viewedPond) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(trackingData, "trackingData");
        Intrinsics.checkNotNullParameter(viewedPond, "viewedPond");
        t viewEvent = item.getViewEvent();
        if (viewEvent != null) {
            m.c(this.tokenizedAnalytics, viewEvent, null);
        }
    }
}
