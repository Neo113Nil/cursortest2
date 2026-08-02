package ru.ozon.app.android.ugc.widgets.reviewFormMobile.reviewFormNoUiWidget;

import Ae.C2399j;
import Ae.C2408n0;
import Sc.InterfaceC4008j;
import Sc.k;
import Vg.c;
import Vg.d;
import Vg.f;
import WZ.l;
import android.view.View;
import androidx.activity.J;
import androidx.fragment.app.r;
import androidx.lifecycle.K;
import d20.AbstractC6065b;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import l10.i;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.ComposerNavigator;
import ru.ozon.app.android.ugc.widgets.reviewFormMobile.actionHandler.BaseSendReviewActionHandler;
import ru.ozon.app.android.ugc.widgets.reviewFormMobile.presentation.ReviewFormViewModel;
import ru.ozon.app.android.ugc.widgets.reviewFormMobile.reviewFormHeader.ReviewFormHeaderVO;
import ru.ozon.app.android.ugc.widgets.reviewFormMobile.reviewFormNoUiWidget.ReviewFormNoUiWidgetViewHolder$onBackPressedCallback$2;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\b\u0006*\u00014\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B3\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\n\u0010\r\u001a\u00060\u000bj\u0002`\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0013\u0010\u0012J-\u0010\u0019\u001a\u00020\u0010*\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0006\u001a\u00020\u00052\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001c\u001a\u00020\u00102\u0006\u0010\u001b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u001e\u0010\u0012R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u001fR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010 R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010!R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\"R\u0018\u0010\r\u001a\u00060\u000bj\u0002`\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010#R\u001c\u0010%\u001a\u0004\u0018\u00010$8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\u001b\u0010-\u001a\u00020\u00148BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R'\u00103\u001a\u000e\u0012\u0004\u0012\u00020/\u0012\u0004\u0012\u00020\u00100.8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b0\u0010*\u001a\u0004\b1\u00102R\u001b\u00108\u001a\u0002048BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b5\u0010*\u001a\u0004\b6\u00107¨\u00069"}, d2 = {"Lru/ozon/app/android/ugc/widgets/reviewFormMobile/reviewFormNoUiWidget/ReviewFormNoUiWidgetViewHolder;", "Ld20/b;", "Lru/ozon/app/android/ugc/widgets/reviewFormMobile/reviewFormNoUiWidget/ReviewFormNoUiParamsVO;", "Lru/ozon/app/android/ugc/widgets/reviewFormMobile/presentation/ReviewFormViewModel;", "formViewModel", "LWZ/l;", "tokenizedAnalytics", "Lru/ozon/app/android/composer/ComposerNavigator;", "composerNavigator", "Ll10/i;", "container", "LVg/d;", "Lru/ozon/app/android/action/custom/CustomActionHandlersStoreFactory;", "customActionHandlersStoreFactory", "<init>", "(Lru/ozon/app/android/ugc/widgets/reviewFormMobile/presentation/ReviewFormViewModel;LWZ/l;Lru/ozon/app/android/composer/ComposerNavigator;Ll10/i;LVg/d;)V", "", "observeSingleEvent", "()V", "addBackPressedCallback", "LVg/c;", "", "actionId", "Lru/ozon/app/android/ugc/widgets/reviewFormMobile/reviewFormHeader/ReviewFormHeaderVO$SubmitOnBackConfigVO;", "submitOnBackConfig", "configureHandlers", "(LVg/c;Ljava/lang/String;LWZ/l;Lru/ozon/app/android/ugc/widgets/reviewFormMobile/reviewFormHeader/ReviewFormHeaderVO$SubmitOnBackConfigVO;)V", "item", "bind", "(Lru/ozon/app/android/ugc/widgets/reviewFormMobile/reviewFormNoUiWidget/ReviewFormNoUiParamsVO;)V", "onWidgetCreated", "Lru/ozon/app/android/ugc/widgets/reviewFormMobile/presentation/ReviewFormViewModel;", "LWZ/l;", "Lru/ozon/app/android/composer/ComposerNavigator;", "Ll10/i;", "LVg/d;", "Landroid/view/View;", "metricView", "Landroid/view/View;", "getMetricView", "()Landroid/view/View;", "customActionHandlersStore$delegate", "LSc/j;", "getCustomActionHandlersStore", "()LVg/c;", "customActionHandlersStore", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler$delegate", "getActionHandler", "()Lkotlin/jvm/functions/Function1;", "actionHandler", "ru/ozon/app/android/ugc/widgets/reviewFormMobile/reviewFormNoUiWidget/ReviewFormNoUiWidgetViewHolder$onBackPressedCallback$2$1", "onBackPressedCallback$delegate", "getOnBackPressedCallback", "()Lru/ozon/app/android/ugc/widgets/reviewFormMobile/reviewFormNoUiWidget/ReviewFormNoUiWidgetViewHolder$onBackPressedCallback$2$1;", "onBackPressedCallback", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ReviewFormNoUiWidgetViewHolder extends AbstractC6065b<ReviewFormNoUiParamsVO> {

    /* renamed from: actionHandler$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j actionHandler;

    @NotNull
    private final ComposerNavigator composerNavigator;

    @NotNull
    private final i container;

    /* renamed from: customActionHandlersStore$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j customActionHandlersStore;

    @NotNull
    private final d customActionHandlersStoreFactory;

    @NotNull
    private final ReviewFormViewModel formViewModel;
    private final View metricView;

    /* renamed from: onBackPressedCallback$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j onBackPressedCallback;

    @NotNull
    private final l tokenizedAnalytics;

    public ReviewFormNoUiWidgetViewHolder(@NotNull ReviewFormViewModel formViewModel, @NotNull l tokenizedAnalytics, @NotNull ComposerNavigator composerNavigator, @NotNull i container, @NotNull d customActionHandlersStoreFactory) {
        Intrinsics.checkNotNullParameter(formViewModel, "formViewModel");
        Intrinsics.checkNotNullParameter(tokenizedAnalytics, "tokenizedAnalytics");
        Intrinsics.checkNotNullParameter(composerNavigator, "composerNavigator");
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(customActionHandlersStoreFactory, "customActionHandlersStoreFactory");
        this.formViewModel = formViewModel;
        this.tokenizedAnalytics = tokenizedAnalytics;
        this.composerNavigator = composerNavigator;
        this.container = container;
        this.customActionHandlersStoreFactory = customActionHandlersStoreFactory;
        this.customActionHandlersStore = k.b(new ReviewFormNoUiWidgetViewHolder$customActionHandlersStore$2(this));
        this.actionHandler = k.b(new ReviewFormNoUiWidgetViewHolder$actionHandler$2(this));
        this.onBackPressedCallback = k.b(new ReviewFormNoUiWidgetViewHolder$onBackPressedCallback$2(this));
    }

    private final void addBackPressedCallback() {
        J onBackPressedDispatcher;
        r a11 = this.container.Q().a();
        if (a11 == null || (onBackPressedDispatcher = a11.getOnBackPressedDispatcher()) == null) {
            return;
        }
        onBackPressedDispatcher.h(this, getOnBackPressedCallback());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void configureHandlers(c cVar, String str, l lVar, ReviewFormHeaderVO.SubmitOnBackConfigVO submitOnBackConfigVO) {
        f handler = cVar.getHandler(str);
        BaseSendReviewActionHandler baseSendReviewActionHandler = handler instanceof BaseSendReviewActionHandler ? (BaseSendReviewActionHandler) handler : null;
        if (baseSendReviewActionHandler != null) {
            baseSendReviewActionHandler.setTokenizedAnalytics(lVar);
            baseSendReviewActionHandler.setSubmitOnBackConfig(submitOnBackConfigVO);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Function1<AtomAction, Unit> getActionHandler() {
        return (Function1) this.actionHandler.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final c getCustomActionHandlersStore() {
        return (c) this.customActionHandlersStore.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ReviewFormNoUiWidgetViewHolder$onBackPressedCallback$2.AnonymousClass1 getOnBackPressedCallback() {
        return (ReviewFormNoUiWidgetViewHolder$onBackPressedCallback$2.AnonymousClass1) this.onBackPressedCallback.getValue();
    }

    private final void observeSingleEvent() {
        C2399j.C(new C2408n0(this.formViewModel.getSingleEvent(), new ReviewFormNoUiWidgetViewHolder$observeSingleEvent$1(this, null)), K.a(this));
    }

    @Override // d20.AbstractC6065b
    public View getMetricView() {
        return this.metricView;
    }

    @Override // d20.AbstractC6065b
    public void onWidgetCreated() {
        observeSingleEvent();
    }

    @Override // d20.AbstractC6065b
    public void bind(@NotNull ReviewFormNoUiParamsVO item) {
        Intrinsics.checkNotNullParameter(item, "item");
        addBackPressedCallback();
    }
}
