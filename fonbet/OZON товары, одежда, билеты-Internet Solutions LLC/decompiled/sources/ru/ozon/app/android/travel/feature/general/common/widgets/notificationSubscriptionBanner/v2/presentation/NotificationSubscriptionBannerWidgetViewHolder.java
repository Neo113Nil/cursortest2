package ru.ozon.app.android.travel.feature.general.common.widgets.notificationSubscriptionBanner.v2.presentation;

import Ae.C2399j;
import Ae.C2406m0;
import Ae.C2408n0;
import FO.b;
import W10.c;
import WZ.l;
import WZ.t;
import android.annotation.SuppressLint;
import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import androidx.lifecycle.AbstractC5434v;
import androidx.lifecycle.C5427n;
import androidx.lifecycle.H;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.analytics.modules.tokenized.TokenizedAnalyticsExtensionsKt;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.travel.feature.general.common.databinding.WidgetNotificationSubscriptionBannerBinding;
import ru.ozon.app.android.travel.feature.general.common.widgets.notificationSubscriptionBanner.v2.presentation.NotificationSubscriptionBannerVO;
import ru.ozon.app.android.travel.feature.general.common.widgets.notificationSubscriptionBanner.v2.presentation.NotificationSubscriptionBannerViewModel;
import ru.ozon.app.android.travel.molecules.utils.ShapeDrawableWithBorder;
import ru.ozon.composer.ui.widget.f;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.android.atom.image.Image;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.controls.buttonV3.ButtonV3View;
import ru.ozon.uni.android.controls.buttonV3.IconButtonV3View;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.v3.holders.controls.buttonV3.ButtonV3HolderKt;
import ru.ozon.uni.atoms.v3.holders.controls.buttonV3.IconButtonV3HolderKt;
import ru.ozon.uni.atoms.v3.holders.image.ImageHolderKt;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;

@Metadata(d1 = {"\u0000\u0090\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u0000 ?2\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003:\u0001?B3\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\n\u0010\u000e\u001a\u00060\fj\u0002`\r¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u0014H\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0018\u0010\u0013J'\u0010\u001e\u001a\u00020\u00112\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u001bH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ#\u0010$\u001a\u00020\u00112\u0006\u0010 \u001a\u00020\u00022\n\u0010#\u001a\u00060!j\u0002`\"H\u0014¢\u0006\u0004\b$\u0010%J\u000f\u0010&\u001a\u00020\u0011H\u0016¢\u0006\u0004\b&\u0010\u0013J)\u0010+\u001a\u00020\u00112\u0006\u0010 \u001a\u00020\u00022\u0006\u0010(\u001a\u00020'2\b\u0010*\u001a\u0004\u0018\u00010)H\u0016¢\u0006\u0004\b+\u0010,R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010-R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010.R\u0018\u0010\u000e\u001a\u00060\fj\u0002`\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010/R\u0014\u00101\u001a\u0002008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R \u00105\u001a\u000e\u0012\u0004\u0012\u000204\u0012\u0004\u0012\u00020\u0011038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106R\u0014\u00108\u001a\u0002078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00109R\u0014\u0010:\u001a\u0002078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u00109R\u0014\u0010;\u001a\u0002078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u00109R\u0014\u0010=\u001a\u00020<8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010>¨\u0006@"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/notificationSubscriptionBanner/v2/presentation/NotificationSubscriptionBannerWidgetViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/travel/feature/general/common/widgets/notificationSubscriptionBanner/v2/presentation/NotificationSubscriptionBannerVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "Landroid/view/View;", "view", "Lru/ozon/app/android/composer/ComposerReferences;", "references", "Lru/ozon/app/android/travel/feature/general/common/widgets/notificationSubscriptionBanner/v2/presentation/NotificationSubscriptionBannerDecoration;", "decoration", "Lru/ozon/app/android/travel/feature/general/common/widgets/notificationSubscriptionBanner/v2/presentation/NotificationSubscriptionBannerViewModel;", "viewModel", "LWZ/l;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedAnalytics;", "tokenizedAnalytics", "<init>", "(Landroid/view/View;Lru/ozon/app/android/composer/ComposerReferences;Lru/ozon/app/android/travel/feature/general/common/widgets/notificationSubscriptionBanner/v2/presentation/NotificationSubscriptionBannerDecoration;Lru/ozon/app/android/travel/feature/general/common/widgets/notificationSubscriptionBanner/v2/presentation/NotificationSubscriptionBannerViewModel;LWZ/l;)V", "", "observeWidgetStates", "()V", "Lru/ozon/app/android/travel/feature/general/common/widgets/notificationSubscriptionBanner/v2/presentation/NotificationSubscriptionBannerViewModel$WidgetState;", "widgetState", "render", "(Lru/ozon/app/android/travel/feature/general/common/widgets/notificationSubscriptionBanner/v2/presentation/NotificationSubscriptionBannerViewModel$WidgetState;)V", "setupView", "Lru/ozon/app/android/travel/feature/general/common/widgets/notificationSubscriptionBanner/v2/presentation/NotificationSubscriptionBannerVO$Margins;", "margins", "", "backgroundColor", "borderColor", "bindLayout", "(Lru/ozon/app/android/travel/feature/general/common/widgets/notificationSubscriptionBanner/v2/presentation/NotificationSubscriptionBannerVO$Margins;Ljava/lang/String;Ljava/lang/String;)V", "item", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "info", "bind", "(Lru/ozon/app/android/travel/feature/general/common/widgets/notificationSubscriptionBanner/v2/presentation/NotificationSubscriptionBannerVO;Ll20/d;)V", "onAttach", "LW10/c;", "trackingData", "Lru/ozon/composer/ui/widget/f;", "viewedPond", "trackView", "(Lru/ozon/app/android/travel/feature/general/common/widgets/notificationSubscriptionBanner/v2/presentation/NotificationSubscriptionBannerVO;LW10/c;Lru/ozon/composer/ui/widget/f;)V", "Lru/ozon/app/android/travel/feature/general/common/widgets/notificationSubscriptionBanner/v2/presentation/NotificationSubscriptionBannerDecoration;", "Lru/ozon/app/android/travel/feature/general/common/widgets/notificationSubscriptionBanner/v2/presentation/NotificationSubscriptionBannerViewModel;", "LWZ/l;", "Lru/ozon/app/android/travel/feature/general/common/databinding/WidgetNotificationSubscriptionBannerBinding;", "binding", "Lru/ozon/app/android/travel/feature/general/common/databinding/WidgetNotificationSubscriptionBannerBinding;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "", "borderWidth", "F", "outerRadius", "innerRadius", "Lru/ozon/app/android/travel/molecules/utils/ShapeDrawableWithBorder;", "backgroundDrawable", "Lru/ozon/app/android/travel/molecules/utils/ShapeDrawableWithBorder;", "Companion", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class NotificationSubscriptionBannerWidgetViewHolder extends k<NotificationSubscriptionBannerVO> {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final ShapeDrawableWithBorder backgroundDrawable;

    @NotNull
    private final WidgetNotificationSubscriptionBannerBinding binding;
    private final float borderWidth;

    @NotNull
    private final NotificationSubscriptionBannerDecoration decoration;
    private final float innerRadius;
    private final float outerRadius;

    @NotNull
    private final l tokenizedAnalytics;

    @NotNull
    private final NotificationSubscriptionBannerViewModel viewModel;

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/notificationSubscriptionBanner/v2/presentation/NotificationSubscriptionBannerWidgetViewHolder$Companion;", "", "<init>", "()V", "HIDE_WIDGET", "", "SUBSCRIBE", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NotificationSubscriptionBannerWidgetViewHolder(@NotNull View view, @NotNull ComposerReferences references, @NotNull NotificationSubscriptionBannerDecoration decoration, @NotNull NotificationSubscriptionBannerViewModel viewModel, @NotNull l tokenizedAnalytics) {
        super(view);
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(references, "references");
        Intrinsics.checkNotNullParameter(decoration, "decoration");
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        Intrinsics.checkNotNullParameter(tokenizedAnalytics, "tokenizedAnalytics");
        this.decoration = decoration;
        this.viewModel = viewModel;
        this.tokenizedAnalytics = tokenizedAnalytics;
        WidgetNotificationSubscriptionBannerBinding bind = WidgetNotificationSubscriptionBannerBinding.bind(view);
        Intrinsics.checkNotNullExpressionValue(bind, "bind(...)");
        this.binding = bind;
        this.actionHandler = new ActionHandler.Builder(references, this).onClick(new NotificationSubscriptionBannerWidgetViewHolder$actionHandler$1(this)).buildHandler();
        float pxF = ResourceExtKt.toPxF(2, getContext());
        this.borderWidth = pxF;
        float pxF2 = ResourceExtKt.toPxF(24, getContext());
        this.outerRadius = pxF2;
        this.innerRadius = pxF2 - pxF;
        Context context = getContext();
        Float valueOf = Float.valueOf(pxF);
        float[] fArr = new float[8];
        for (int i11 = 0; i11 < 8; i11++) {
            fArr[i11] = this.outerRadius;
        }
        float[] fArr2 = new float[8];
        for (int i12 = 0; i12 < 8; i12++) {
            fArr2[i12] = this.innerRadius;
        }
        this.backgroundDrawable = new ShapeDrawableWithBorder(context, valueOf, fArr, fArr2);
        setupView();
    }

    private final void bindLayout(NotificationSubscriptionBannerVO.Margins margins, String backgroundColor, String borderColor) {
        this.decoration.setItemOffsets(margins.getHorizontal(), margins.getTop(), margins.getHorizontal(), margins.getHorizontal());
        ShapeDrawableWithBorder shapeDrawableWithBorder = this.backgroundDrawable;
        ShapeDrawableWithBorder.setFillColor$default(shapeDrawableWithBorder, backgroundColor, 0, 2, null);
        ShapeDrawableWithBorder.setBorderColor$default(shapeDrawableWithBorder, borderColor, 0, 2, null);
        shapeDrawableWithBorder.invalidateSelf();
    }

    private final void observeWidgetStates() {
        C2399j.C(new C2408n0(new C2406m0(C5427n.a(this.viewModel.getWidgetStateFlow(), getLifecycle(), AbstractC5434v.b.STARTED)), new NotificationSubscriptionBannerWidgetViewHolder$observeWidgetStates$1(this, null)), H.a(getLifecycle()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    @SuppressLint({"ClickableViewAccessibility"})
    public final void render(NotificationSubscriptionBannerViewModel.WidgetState widgetState) {
        ButtonV3View buttonV3View = this.binding.bannerButtonBv;
        Intrinsics.f(buttonV3View);
        ButtonV3HolderKt.bind(buttonV3View, widgetState.getButtonState(), this.actionHandler);
        if (widgetState.getIsLoading()) {
            buttonV3View.setOnTouchListener(new b(1));
            buttonV3View.showLoader();
        } else {
            buttonV3View.hideLoader();
            buttonV3View.setOnTouchListener(null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean render$lambda$2$lambda$1(View view, MotionEvent motionEvent) {
        return true;
    }

    private final void setupView() {
        this.binding.getConstraintLayout().setBackground(this.backgroundDrawable);
    }

    @Override // ru.ozon.composer.ui.widget.k, jk0.j
    public void onAttach() {
        super.onAttach();
        observeWidgetStates();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull NotificationSubscriptionBannerVO item, @NotNull d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        bindLayout(item.getLayoutMargins(), item.getBackgroundColor(), item.getBorderColor());
        WidgetNotificationSubscriptionBannerBinding widgetNotificationSubscriptionBannerBinding = this.binding;
        TextAtomV2View bannerTitleTav = widgetNotificationSubscriptionBannerBinding.bannerTitleTav;
        Intrinsics.checkNotNullExpressionValue(bannerTitleTav, "bannerTitleTav");
        TextHolderKt.bind$default(bannerTitleTav, item.getTitle(), null, 2, null);
        TextAtomV2View bannerSubtitleTav = widgetNotificationSubscriptionBannerBinding.bannerSubtitleTav;
        Intrinsics.checkNotNullExpressionValue(bannerSubtitleTav, "bannerSubtitleTav");
        TextHolderKt.bind$default(bannerSubtitleTav, item.getSubtitle(), null, 2, null);
        Image bannerImageIv = widgetNotificationSubscriptionBannerBinding.bannerImageIv;
        Intrinsics.checkNotNullExpressionValue(bannerImageIv, "bannerImageIv");
        ImageHolderKt.bind$default(bannerImageIv, item.getImage(), null, 2, null);
        IconButtonV3View bannerCloseButtonIbv = widgetNotificationSubscriptionBannerBinding.bannerCloseButtonIbv;
        Intrinsics.checkNotNullExpressionValue(bannerCloseButtonIbv, "bannerCloseButtonIbv");
        IconButtonV3HolderKt.bindOrGone(bannerCloseButtonIbv, item.getCloseButton(), this.actionHandler);
        this.viewModel.onViewIntent(new NotificationSubscriptionBannerViewModel.ViewIntent.OnNewState(item));
    }

    @Override // ru.ozon.composer.ui.widget.k
    public void trackView(@NotNull NotificationSubscriptionBannerVO item, @NotNull c trackingData, f viewedPond) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(trackingData, "trackingData");
        t viewEvent = item.getViewEvent();
        if (viewEvent != null) {
            TokenizedAnalyticsExtensionsKt.processViewEvents$default(this.tokenizedAnalytics, viewEvent, null, 2, null);
        }
    }
}
