package ru.ozon.app.android.ugc.widgets.reviewFormMobile.reviewFormSubmitButton;

import Ae.C2399j;
import Ae.C2408n0;
import B90.C2612n;
import Sc.InterfaceC4008j;
import Sc.k;
import Tc.d;
import WZ.l;
import a00.C4911f;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.LinearLayout;
import androidx.activity.J;
import androidx.core.os.c;
import androidx.fragment.app.ComponentCallbacksC5392m;
import androidx.fragment.app.G;
import androidx.fragment.app.r;
import androidx.lifecycle.K;
import d20.AbstractC6064a;
import d20.InterfaceC6068e;
import java.io.Serializable;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import l10.i;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.ComposerNavigator;
import ru.ozon.app.android.composer.view.ComposerViewExtensionKt;
import ru.ozon.app.android.pdp.utils.Dimens;
import ru.ozon.app.android.ugc.widgets.common.mediaPicker.presentation.MediaPickerEvent;
import ru.ozon.app.android.ugc.widgets.common.mediaPicker.presentation.MediaPickerViewModel;
import ru.ozon.app.android.ugc.widgets.reviewFormMobile.presentation.ReviewFormViewModel;
import ru.ozon.app.android.ugc.widgets.reviewFormMobile.presentation.SubmitReason;
import ru.ozon.app.android.ugc.widgets.reviewFormMobile.presentation.ViewIntent;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.R$color;
import ru.ozon.uni.android.controls.buttonV3.ButtonV3View;
import ru.ozon.uni.android.haptic.HapticToken;
import ru.ozon.uni.android.haptic.HapticVibrator;
import ru.ozon.uni.android.notificationbar.CoordinatorLayoutManagerKt;
import ru.ozon.uni.android.notificationbar.NotificationBar;
import ru.ozon.uni.android.notificationbar.NotificationBarKt;
import ru.ozon.uni.android.notificationbar.NotificationLayoutManager;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.android.uikit.extensions.view.ContextExtKt;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.data.notification.NotificationDTO;
import ru.ozon.uni.atoms.v3.holders.controls.buttonV3.ButtonV3HolderKt;

@Metadata(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\t\b\u0001\u0018\u0000 G2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001GBE\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u001a\u0010\u0019J\u000f\u0010\u001b\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u001b\u0010\u0019J\u0019\u0010\u001e\u001a\u00020\u00152\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010!\u001a\u00020\u00152\u0006\u0010 \u001a\u00020\rH\u0002¢\u0006\u0004\b!\u0010\"J\u001b\u0010#\u001a\u00020\u0002*\u00020\u00022\u0006\u0010 \u001a\u00020\rH\u0002¢\u0006\u0004\b#\u0010$J+\u0010*\u001a\u00020\u00152\u0006\u0010&\u001a\u00020%2\b\u0010(\u001a\u0004\u0018\u00010'2\b\b\u0002\u0010)\u001a\u00020\rH\u0002¢\u0006\u0004\b*\u0010+J)\u0010/\u001a\u00020,*\u00020,2\u0014\u0010.\u001a\u0010\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u001c\u0018\u00010-H\u0002¢\u0006\u0004\b/\u00100J\u001f\u00104\u001a\u0002032\u0006\u00102\u001a\u0002012\u0006\u0010\u0014\u001a\u00020\u0002H\u0002¢\u0006\u0004\b4\u00105J\u0017\u00106\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u0002H\u0016¢\u0006\u0004\b6\u0010\u0017J\u000f\u00107\u001a\u00020\u0015H\u0016¢\u0006\u0004\b7\u0010\u0019J\u000f\u00108\u001a\u00020\u0015H\u0016¢\u0006\u0004\b8\u0010\u0019R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u00109R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010:R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010;R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010<R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010=R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010>R'\u0010D\u001a\u000e\u0012\u0004\u0012\u00020,\u0012\u0004\u0012\u00020\u00150?8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b@\u0010A\u001a\u0004\bB\u0010CR \u0010E\u001a\u000e\u0012\u0004\u0012\u00020,\u0012\u0004\u0012\u00020\u00150?8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bE\u0010F¨\u0006H"}, d2 = {"Lru/ozon/app/android/ugc/widgets/reviewFormMobile/reviewFormSubmitButton/ReviewSubmitButtonViewHolder;", "Ld20/a;", "Lru/ozon/app/android/ugc/widgets/reviewFormMobile/reviewFormSubmitButton/ReviewFormSubmitButtonVO;", "Ll10/i;", "container", "Lru/ozon/app/android/ugc/widgets/reviewFormMobile/presentation/ReviewFormViewModel;", "formViewModel", "Lru/ozon/app/android/ugc/widgets/common/mediaPicker/presentation/MediaPickerViewModel;", "mediaPickerViewModel", "LWZ/l;", "tokenizedAnalytics", "Lru/ozon/app/android/composer/ComposerNavigator;", "composerNavigator", "", "isSelect", "Ld20/e;", "Landroid/widget/LinearLayout;", "viewFactory", "<init>", "(Ll10/i;Lru/ozon/app/android/ugc/widgets/reviewFormMobile/presentation/ReviewFormViewModel;Lru/ozon/app/android/ugc/widgets/common/mediaPicker/presentation/MediaPickerViewModel;LWZ/l;Lru/ozon/app/android/composer/ComposerNavigator;ZLd20/e;)V", "item", "", "setBackground", "(Lru/ozon/app/android/ugc/widgets/reviewFormMobile/reviewFormSubmitButton/ReviewFormSubmitButtonVO;)V", "setupDismissAndSubmitListener", "()V", "observeSingleEvent", "observeAvailabilityState", "", "link", "onSubmitResult", "(Ljava/lang/String;)V", "isEnabled", "bindButton", "(Z)V", "applyAvailability", "(Lru/ozon/app/android/ugc/widgets/reviewFormMobile/reviewFormSubmitButton/ReviewFormSubmitButtonVO;Z)Lru/ozon/app/android/ugc/widgets/reviewFormMobile/reviewFormSubmitButton/ReviewFormSubmitButtonVO;", "Lru/ozon/uni/atoms/data/notification/NotificationDTO;", "notification", "Lru/ozon/uni/android/haptic/HapticToken;", "notificationHaptic", "isError", "showNotification", "(Lru/ozon/uni/atoms/data/notification/NotificationDTO;Lru/ozon/uni/android/haptic/HapticToken;Z)V", "Lru/ozon/uni/atoms/af/AtomAction;", "", "additionalParams", "addParams", "(Lru/ozon/uni/atoms/af/AtomAction;Ljava/util/Map;)Lru/ozon/uni/atoms/af/AtomAction;", "Landroid/content/Context;", "context", "Landroid/graphics/drawable/Drawable;", "buildSubmitButtonBackground", "(Landroid/content/Context;Lru/ozon/app/android/ugc/widgets/reviewFormMobile/reviewFormSubmitButton/ReviewFormSubmitButtonVO;)Landroid/graphics/drawable/Drawable;", "bind", "onWidgetCreated", "onWidgetDestroyed", "Ll10/i;", "Lru/ozon/app/android/ugc/widgets/reviewFormMobile/presentation/ReviewFormViewModel;", "Lru/ozon/app/android/ugc/widgets/common/mediaPicker/presentation/MediaPickerViewModel;", "LWZ/l;", "Lru/ozon/app/android/composer/ComposerNavigator;", "Z", "Lkotlin/Function1;", "actionHandler$delegate", "LSc/j;", "getActionHandler", "()Lkotlin/jvm/functions/Function1;", "actionHandler", "onAction", "Lkotlin/jvm/functions/Function1;", "Companion", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ReviewSubmitButtonViewHolder extends AbstractC6064a<ReviewFormSubmitButtonVO> {

    /* renamed from: actionHandler$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j actionHandler;

    @NotNull
    private final ComposerNavigator composerNavigator;

    @NotNull
    private final i container;

    @NotNull
    private final ReviewFormViewModel formViewModel;
    private final boolean isSelect;

    @NotNull
    private final MediaPickerViewModel mediaPickerViewModel;

    @NotNull
    private final Function1<AtomAction, Unit> onAction;

    @NotNull
    private final l tokenizedAnalytics;
    public static final int $stable = 8;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReviewSubmitButtonViewHolder(@NotNull i container, @NotNull ReviewFormViewModel formViewModel, @NotNull MediaPickerViewModel mediaPickerViewModel, @NotNull l tokenizedAnalytics, @NotNull ComposerNavigator composerNavigator, boolean z11, @NotNull InterfaceC6068e<LinearLayout> viewFactory) {
        super(container, viewFactory);
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(formViewModel, "formViewModel");
        Intrinsics.checkNotNullParameter(mediaPickerViewModel, "mediaPickerViewModel");
        Intrinsics.checkNotNullParameter(tokenizedAnalytics, "tokenizedAnalytics");
        Intrinsics.checkNotNullParameter(composerNavigator, "composerNavigator");
        Intrinsics.checkNotNullParameter(viewFactory, "viewFactory");
        this.container = container;
        this.formViewModel = formViewModel;
        this.mediaPickerViewModel = mediaPickerViewModel;
        this.tokenizedAnalytics = tokenizedAnalytics;
        this.composerNavigator = composerNavigator;
        this.isSelect = z11;
        this.actionHandler = k.b(new ReviewSubmitButtonViewHolder$actionHandler$2(this));
        this.onAction = new ReviewSubmitButtonViewHolder$onAction$1(this);
        setupDismissAndSubmitListener();
    }

    private final AtomAction addParams(AtomAction atomAction, Map<String, String> map) {
        if (!(atomAction instanceof AtomAction.ComposerAction)) {
            return atomAction;
        }
        d builder = new d();
        AtomAction.ComposerAction composerAction = (AtomAction.ComposerAction) atomAction;
        Map<String, String> params = composerAction.getParams();
        if (params != null) {
            builder.putAll(params);
        }
        if (map != null) {
            builder.putAll(map);
        }
        Intrinsics.checkNotNullParameter(builder, "builder");
        return AtomAction.ComposerAction.copy$default(composerAction, null, null, builder.u(), null, null, 27, null);
    }

    private final ReviewFormSubmitButtonVO applyAvailability(ReviewFormSubmitButtonVO reviewFormSubmitButtonVO, boolean z11) {
        return ReviewFormSubmitButtonVO.copy$default(reviewFormSubmitButtonVO, 0L, null, ButtonV3DTO.copy$default(reviewFormSubmitButtonVO.getSubmitButton(), null, null, null, null, null, null, Boolean.valueOf(!z11), null, null, null, null, null, null, null, null, null, null, 131007, null), false, false, null, 59, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void bindButton(boolean isEnabled) {
        ReviewFormSubmitButtonVO applyAvailability;
        ReviewFormSubmitButtonVO reviewFormSubmitButtonVO = (ReviewFormSubmitButtonVO) getBoundData();
        if (reviewFormSubmitButtonVO == null || (applyAvailability = applyAvailability(reviewFormSubmitButtonVO, isEnabled)) == null) {
            return;
        }
        View view = getView();
        ButtonV3View buttonV3View = view instanceof ButtonV3View ? (ButtonV3View) view : null;
        if (buttonV3View != null) {
            ButtonV3HolderKt.bind(buttonV3View, applyAvailability.getSubmitButton(), this.onAction);
        }
    }

    private final Drawable buildSubmitButtonBackground(Context context, ReviewFormSubmitButtonVO item) {
        int themeColor = ThemeExtKt.themeColor(context, R$attr.layerFloor1);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setColor(themeColor);
        Dimens dimens = Dimens.INSTANCE;
        gradientDrawable.setCornerRadius(dimens.getDPF_24());
        if (!item.getIsBorderHidden()) {
            gradientDrawable.setStroke(dimens.getDP_1(), androidx.core.content.a.getColor(context, R$color.graphic_stroke_sticky));
        }
        GradientDrawable gradientDrawable2 = new GradientDrawable();
        gradientDrawable2.setShape(0);
        gradientDrawable2.setColor(themeColor);
        LayerDrawable layerDrawable = new LayerDrawable(new GradientDrawable[]{gradientDrawable, gradientDrawable2});
        layerDrawable.setLayerInset(1, 0, dimens.getDP_24(), 0, 0);
        return layerDrawable;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Function1<AtomAction, Unit> getActionHandler() {
        return (Function1) this.actionHandler.getValue();
    }

    private final void observeAvailabilityState() {
        C2399j.C(new C2408n0(this.formViewModel.isSubmitButtonAvailable(), new ReviewSubmitButtonViewHolder$observeAvailabilityState$1(this)), K.a(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ Object observeAvailabilityState$bindButton(ReviewSubmitButtonViewHolder reviewSubmitButtonViewHolder, boolean z11, kotlin.coroutines.d dVar) {
        reviewSubmitButtonViewHolder.bindButton(z11);
        return Unit.f71690a;
    }

    private final void observeSingleEvent() {
        C2399j.C(new C2408n0(this.formViewModel.getSingleEvent(), new ReviewSubmitButtonViewHolder$observeSingleEvent$1(this, null)), K.a(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onSubmitResult(String link) {
        J onBackPressedDispatcher;
        if (link != null) {
            getActionHandler().invoke(new AtomAction.Move(link, null, null, null, 10, null));
            return;
        }
        r a11 = this.container.Q().a();
        if (a11 == null || (onBackPressedDispatcher = a11.getOnBackPressedDispatcher()) == null || !onBackPressedDispatcher.j()) {
            return;
        }
        onBackPressedDispatcher.l();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ Object onWidgetCreated$onMediaPickerEvent(ReviewFormViewModel reviewFormViewModel, MediaPickerEvent mediaPickerEvent, kotlin.coroutines.d dVar) {
        reviewFormViewModel.onMediaPickerEvent(mediaPickerEvent);
        return Unit.f71690a;
    }

    private final void setBackground(ReviewFormSubmitButtonVO item) {
        ViewParent parent = getView().getParent();
        LinearLayout linearLayout = parent instanceof LinearLayout ? (LinearLayout) parent : null;
        if (linearLayout == null) {
            return;
        }
        int dp_16 = item.getIsModal() ? Dimens.INSTANCE.getDP_16() : Dimens.INSTANCE.getDP_8();
        Context context = linearLayout.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        linearLayout.setBackground(buildSubmitButtonBackground(context, item));
        ViewExtKt.updatePadding$default(linearLayout, dp_16, 0, dp_16, 0, 10, null);
    }

    private final void setupDismissAndSubmitListener() {
        G supportFragmentManager;
        androidx.lifecycle.J f7 = this.container.Q().f();
        r a11 = this.container.Q().a();
        if (a11 == null || (supportFragmentManager = a11.getSupportFragmentManager()) == null) {
            return;
        }
        supportFragmentManager.n1("dismiss_and_submit_review_key", f7, new C2612n(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void setupDismissAndSubmitListener$lambda$0(ReviewSubmitButtonViewHolder reviewSubmitButtonViewHolder, String str, Bundle bundle) {
        ButtonV3DTO submitButton;
        CommonControlSettings common;
        AtomAction atomAction;
        Intrinsics.checkNotNullParameter(str, "<unused var>");
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        Serializable b11 = c.b(bundle);
        Map<String, String> map = b11 instanceof Map ? (Map) b11 : null;
        reviewSubmitButtonViewHolder.composerNavigator.popBackStack();
        ReviewFormSubmitButtonVO reviewFormSubmitButtonVO = (ReviewFormSubmitButtonVO) reviewSubmitButtonViewHolder.getBoundData();
        if (reviewFormSubmitButtonVO == null || (submitButton = reviewFormSubmitButtonVO.getSubmitButton()) == null || (common = submitButton.getCommon()) == null || (atomAction = common.toAtomAction()) == null) {
            return;
        }
        reviewSubmitButtonViewHolder.formViewModel.processCreateReviewAction(reviewSubmitButtonViewHolder.addParams(atomAction, map), SubmitReason.REVIEW_SHEET);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showNotification(NotificationDTO notification, HapticToken notificationHaptic, boolean isError) {
        ViewGroup rootView;
        C4911f Q11 = this.container.Q();
        r a11 = Q11.a();
        if (a11 == null) {
            return;
        }
        if (isError) {
            ComponentCallbacksC5392m c11 = Q11.c();
            View view = c11 != null ? c11.getView() : null;
            Intrinsics.g(view, "null cannot be cast to non-null type android.view.ViewGroup");
            rootView = (ViewGroup) view;
        } else {
            rootView = ContextExtKt.getRootView(a11);
            if (rootView == null) {
                return;
            }
        }
        View composerNotificationBottomAnchor = ComposerViewExtensionKt.composerNotificationBottomAnchor(rootView, NotificationBarKt.isAboveBottomWidgets(notification));
        NotificationLayoutManager asNotificationLayoutManager = CoordinatorLayoutManagerKt.asNotificationLayoutManager(rootView, composerNotificationBottomAnchor != null ? Integer.valueOf(composerNotificationBottomAnchor.getId()) : null);
        if (asNotificationLayoutManager == null) {
            return;
        }
        if (notificationHaptic != null) {
            HapticVibrator.INSTANCE.vibrate(rootView, notificationHaptic);
        }
        NotificationBar.Companion companion = NotificationBar.INSTANCE;
        r rVar = a11;
        if (isError) {
            rVar = Q11.e();
        }
        companion.make(asNotificationLayoutManager, notification, rVar, getActionHandler()).show();
    }

    static /* synthetic */ void showNotification$default(ReviewSubmitButtonViewHolder reviewSubmitButtonViewHolder, NotificationDTO notificationDTO, HapticToken hapticToken, boolean z11, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            z11 = true;
        }
        reviewSubmitButtonViewHolder.showNotification(notificationDTO, hapticToken, z11);
    }

    @Override // d20.AbstractC6065b
    public void onWidgetCreated() {
        super.onWidgetCreated();
        observeSingleEvent();
        observeAvailabilityState();
        C2399j.C(new C2408n0(this.mediaPickerViewModel.getMediaPickerEvents(), new ReviewSubmitButtonViewHolder$onWidgetCreated$1(this.formViewModel)), K.a(this));
    }

    @Override // d20.AbstractC6065b
    public void onWidgetDestroyed() {
        G supportFragmentManager;
        super.onWidgetDestroyed();
        r a11 = this.container.Q().a();
        if (a11 == null || (supportFragmentManager = a11.getSupportFragmentManager()) == null) {
            return;
        }
        supportFragmentManager.s("dismiss_and_submit_review_key");
    }

    @Override // d20.AbstractC6065b
    public void bind(@NotNull ReviewFormSubmitButtonVO item) {
        Intrinsics.checkNotNullParameter(item, "item");
        setBackground(item);
        this.formViewModel.onViewIntent(new ViewIntent.FormOpened(item.getProductId()));
        bindButton(this.formViewModel.isSubmitButtonAvailable().getValue().booleanValue());
    }
}
