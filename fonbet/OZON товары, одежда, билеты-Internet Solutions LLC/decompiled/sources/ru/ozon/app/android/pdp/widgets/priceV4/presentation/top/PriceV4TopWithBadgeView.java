package ru.ozon.app.android.pdp.widgets.priceV4.presentation.top;

import EE.b;
import WZ.l;
import WZ.t;
import android.annotation.SuppressLint;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatImageView;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.analytics.modules.tokenized.TokenizedAnalyticsExtensionsKt;
import ru.ozon.app.android.composer.TrackingInfoMapperKt;
import ru.ozon.app.android.composer.widgets.v2.onboarding.presentation.OnBoardingCutConfig;
import ru.ozon.app.android.pdp.utils.Dimens;
import ru.ozon.app.android.pdp.widgets.priceV4.presentation.PriceV4BaseView;
import ru.ozon.app.android.pdp.widgets.priceV4.presentation.vo.PriceStarsBadgeVO;
import ru.ozon.app.android.pdp.widgets.priceV4.presentation.vo.PriceV4VoWrapper;
import ru.ozon.uni.android.atom.badge.BadgeView;
import ru.ozon.uni.android.atom.price.ui.PriceAtomView;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.atoms.data.price.PriceDTO;
import ru.ozon.uni.atoms.v3.holders.dsBadge.BadgeHolderKt;
import ru.ozon.uni.atoms.v3.holders.price.PriceAtomHolderKt;

@Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0011\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0011\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J+\u0010\u001d\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0019\u001a\u00020\u00182\u0012\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u00150\u001a¢\u0006\u0004\b\u001d\u0010\u001eJ!\u0010\u001f\u001a\u00020\u00152\u0012\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u00150\u001a¢\u0006\u0004\b\u001f\u0010 J!\u0010%\u001a\u00020\u00152\u0006\u0010!\u001a\u00020\u00182\n\u0010$\u001a\u00060\"j\u0002`#¢\u0006\u0004\b%\u0010&R\u0018\u0010'\u001a\u0004\u0018\u00010\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010(R(\u0010*\u001a\u0004\u0018\u00010\b2\b\u0010)\u001a\u0004\u0018\u00010\b8\u0002@BX\u0082\u000e¢\u0006\f\n\u0004\b*\u0010+\"\u0004\b,\u0010-R(\u0010.\u001a\u0004\u0018\u00010\u000b2\b\u0010)\u001a\u0004\u0018\u00010\u000b8\u0002@BX\u0082\u000e¢\u0006\f\n\u0004\b.\u0010/\"\u0004\b0\u00101R(\u00103\u001a\u0004\u0018\u0001022\b\u0010)\u001a\u0004\u0018\u0001028\u0002@BX\u0082\u000e¢\u0006\f\n\u0004\b3\u00104\"\u0004\b5\u00106R\u0014\u00108\u001a\u0002078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00109R\u0014\u0010;\u001a\u00020:8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010<¨\u0006="}, d2 = {"Lru/ozon/app/android/pdp/widgets/priceV4/presentation/top/PriceV4TopWithBadgeView;", "Lru/ozon/app/android/pdp/widgets/priceV4/presentation/PriceV4BaseView;", "Landroid/content/Context;", "context", "", "isStars", "<init>", "(Landroid/content/Context;Z)V", "Lru/ozon/uni/android/atom/badge/BadgeView;", "getOrCreateFinBadge", "()Lru/ozon/uni/android/atom/badge/BadgeView;", "Lru/ozon/app/android/pdp/widgets/priceV4/presentation/top/PriceStarsBadgeView;", "getOrCreateStarsBadge", "()Lru/ozon/app/android/pdp/widgets/priceV4/presentation/top/PriceStarsBadgeView;", "Lru/ozon/app/android/composer/widgets/v2/onboarding/presentation/OnBoardingCutConfig;", "onBoardingCutConfig", "()Lru/ozon/app/android/composer/widgets/v2/onboarding/presentation/OnBoardingCutConfig;", "", "rightContainerWidth", "()Ljava/lang/Integer;", "desiredWidth", "", "updateRightContainerWidth", "(I)V", "Lru/ozon/app/android/pdp/widgets/priceV4/presentation/vo/PriceV4VoWrapper$TopWithFinBadge;", "priceV4Vo", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "bind", "(Lru/ozon/app/android/pdp/widgets/priceV4/presentation/vo/PriceV4VoWrapper$TopWithFinBadge;Lkotlin/jvm/functions/Function1;)Lkotlin/Unit;", "setOnPriceClickListener", "(Lkotlin/jvm/functions/Function1;)V", "item", "LWZ/l;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedAnalytics;", "tokenizedAnalytics", "trackView", "(Lru/ozon/app/android/pdp/widgets/priceV4/presentation/vo/PriceV4VoWrapper$TopWithFinBadge;LWZ/l;)V", "boundData", "Lru/ozon/app/android/pdp/widgets/priceV4/presentation/vo/PriceV4VoWrapper$TopWithFinBadge;", AppMeasurementSdk.ConditionalUserProperty.VALUE, "topFinBadgeView", "Lru/ozon/uni/android/atom/badge/BadgeView;", "setTopFinBadgeView", "(Lru/ozon/uni/android/atom/badge/BadgeView;)V", "topStarsBadgeView", "Lru/ozon/app/android/pdp/widgets/priceV4/presentation/top/PriceStarsBadgeView;", "setTopStarsBadgeView", "(Lru/ozon/app/android/pdp/widgets/priceV4/presentation/top/PriceStarsBadgeView;)V", "Landroidx/appcompat/widget/AppCompatImageView;", "priceIconView", "Landroidx/appcompat/widget/AppCompatImageView;", "setPriceIconView", "(Landroidx/appcompat/widget/AppCompatImageView;)V", "Lru/ozon/uni/android/atom/price/ui/PriceAtomView;", "priceView", "Lru/ozon/uni/android/atom/price/ui/PriceAtomView;", "Landroid/widget/LinearLayout;", "priceViewRoot", "Landroid/widget/LinearLayout;", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SuppressLint({"ViewConstructor"})
/* loaded from: classes13.dex */
public final class PriceV4TopWithBadgeView extends PriceV4BaseView {
    private PriceV4VoWrapper.TopWithFinBadge boundData;
    private AppCompatImageView priceIconView;

    @NotNull
    private final PriceAtomView priceView;

    @NotNull
    private final LinearLayout priceViewRoot;
    private BadgeView topFinBadgeView;
    private PriceStarsBadgeView topStarsBadgeView;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PriceV4TopWithBadgeView(@NotNull Context context, boolean z11) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        PriceAtomView priceAtomView = new PriceAtomView(context, null, 0, 6, null);
        priceAtomView.setLayoutParams(new LinearLayout.LayoutParams(0, -2, 1.0f));
        this.priceView = priceAtomView;
        LinearLayout linearLayout = new LinearLayout(context);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(0, -2, 1.0f);
        layoutParams.setMarginEnd(Dimens.INSTANCE.getDP_8());
        linearLayout.setLayoutParams(layoutParams);
        linearLayout.addView(priceAtomView);
        this.priceViewRoot = linearLayout;
        setOrientation(0);
        setGravity(16);
        addView(linearLayout);
        if (z11) {
            getOrCreateStarsBadge();
        } else {
            getOrCreateFinBadge();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0058, code lost:
    
        if (r6 != (r3 != null ? r3.bottomMargin : 0)) goto L36;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final BadgeView getOrCreateFinBadge() {
        BadgeView badgeView = this.topFinBadgeView;
        if (badgeView == null) {
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            BadgeView badgeView2 = new BadgeView(context, null, 0, 0, 14, null);
            badgeView2.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
            setTopFinBadgeView(badgeView2);
            return badgeView2;
        }
        ViewGroup.LayoutParams layoutParams = badgeView.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        if (marginLayoutParams != null) {
            int i11 = marginLayoutParams.leftMargin;
            int i12 = marginLayoutParams.topMargin;
            int i13 = marginLayoutParams.rightMargin;
            int i14 = marginLayoutParams.bottomMargin;
            marginLayoutParams.leftMargin = 0;
            if (i11 == 0) {
                ViewGroup.LayoutParams layoutParams2 = badgeView.getLayoutParams();
                ViewGroup.MarginLayoutParams marginLayoutParams2 = layoutParams2 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams2 : null;
                if (i12 == (marginLayoutParams2 != null ? marginLayoutParams2.topMargin : 0)) {
                    ViewGroup.LayoutParams layoutParams3 = badgeView.getLayoutParams();
                    ViewGroup.MarginLayoutParams marginLayoutParams3 = layoutParams3 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams3 : null;
                    if (i13 == (marginLayoutParams3 != null ? marginLayoutParams3.rightMargin : 0)) {
                        ViewGroup.LayoutParams layoutParams4 = badgeView.getLayoutParams();
                        ViewGroup.MarginLayoutParams marginLayoutParams4 = layoutParams4 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams4 : null;
                    }
                }
            }
            badgeView.setLayoutParams(marginLayoutParams);
            return badgeView;
        }
        return badgeView;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0058, code lost:
    
        if (r6 != (r3 != null ? r3.bottomMargin : 0)) goto L36;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final PriceStarsBadgeView getOrCreateStarsBadge() {
        PriceStarsBadgeView priceStarsBadgeView = this.topStarsBadgeView;
        if (priceStarsBadgeView == null) {
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            PriceStarsBadgeView priceStarsBadgeView2 = new PriceStarsBadgeView(context);
            priceStarsBadgeView2.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
            setTopStarsBadgeView(priceStarsBadgeView2);
            return priceStarsBadgeView2;
        }
        ViewGroup.LayoutParams layoutParams = priceStarsBadgeView.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        if (marginLayoutParams != null) {
            int i11 = marginLayoutParams.leftMargin;
            int i12 = marginLayoutParams.topMargin;
            int i13 = marginLayoutParams.rightMargin;
            int i14 = marginLayoutParams.bottomMargin;
            marginLayoutParams.leftMargin = 0;
            if (i11 == 0) {
                ViewGroup.LayoutParams layoutParams2 = priceStarsBadgeView.getLayoutParams();
                ViewGroup.MarginLayoutParams marginLayoutParams2 = layoutParams2 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams2 : null;
                if (i12 == (marginLayoutParams2 != null ? marginLayoutParams2.topMargin : 0)) {
                    ViewGroup.LayoutParams layoutParams3 = priceStarsBadgeView.getLayoutParams();
                    ViewGroup.MarginLayoutParams marginLayoutParams3 = layoutParams3 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams3 : null;
                    if (i13 == (marginLayoutParams3 != null ? marginLayoutParams3.rightMargin : 0)) {
                        ViewGroup.LayoutParams layoutParams4 = priceStarsBadgeView.getLayoutParams();
                        ViewGroup.MarginLayoutParams marginLayoutParams4 = layoutParams4 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams4 : null;
                    }
                }
            }
            priceStarsBadgeView.setLayoutParams(marginLayoutParams);
            return priceStarsBadgeView;
        }
        return priceStarsBadgeView;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setOnPriceClickListener$lambda$16(PriceV4TopWithBadgeView priceV4TopWithBadgeView, Function1 function1, View view) {
        AtomActionDTO priceAction;
        PriceDTO price;
        PriceV4VoWrapper.TopWithFinBadge topWithFinBadge = priceV4TopWithBadgeView.boundData;
        if (topWithFinBadge == null || (priceAction = topWithFinBadge.getPriceAction()) == null) {
            return;
        }
        PriceV4VoWrapper.TopWithFinBadge topWithFinBadge2 = priceV4TopWithBadgeView.boundData;
        AtomAction atomAction = AtomActionMapperKt.toAtomAction(priceAction, (topWithFinBadge2 == null || (price = topWithFinBadge2.getPrice()) == null) ? null : price.getTrackingInfo());
        if (atomAction != null) {
            function1.invoke(atomAction);
        }
    }

    private final void setPriceIconView(AppCompatImageView appCompatImageView) {
        this.priceIconView = appCompatImageView;
        if (appCompatImageView != null) {
            this.priceViewRoot.addView(appCompatImageView);
        }
    }

    private final void setTopFinBadgeView(BadgeView badgeView) {
        this.topFinBadgeView = badgeView;
        if (badgeView != null) {
            addView(badgeView);
        }
    }

    private final void setTopStarsBadgeView(PriceStarsBadgeView priceStarsBadgeView) {
        this.topStarsBadgeView = priceStarsBadgeView;
        if (priceStarsBadgeView != null) {
            addView(priceStarsBadgeView);
        }
    }

    public final Unit bind(@NotNull PriceV4VoWrapper.TopWithFinBadge priceV4Vo, @NotNull Function1<? super AtomAction, Unit> actionHandler) {
        AppCompatImageView appCompatImageView;
        Intrinsics.checkNotNullParameter(priceV4Vo, "priceV4Vo");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        ViewExtKt.updatePadding$default(this, 0, 0, 0, 0, 11, null);
        this.boundData = priceV4Vo;
        PriceAtomHolderKt.bind$default(this.priceView, priceV4Vo.getPrice(), null, 2, null);
        if (this.priceIconView == null && priceV4Vo.getPriceIcon() != null) {
            AppCompatImageView appCompatImageView2 = new AppCompatImageView(getContext());
            Dimens dimens = Dimens.INSTANCE;
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(dimens.getDP_16(), dimens.getDP_16());
            layoutParams.gravity = 16;
            appCompatImageView2.setLayoutParams(layoutParams);
            ru.ozon.app.android.pdp.utils.ViewExtKt.bindOrGone$default(appCompatImageView2, priceV4Vo.getPriceIcon(), null, 2, null);
            setPriceIconView(appCompatImageView2);
        } else if (this.priceIconView != null && priceV4Vo.getPriceIcon() == null) {
            this.priceViewRoot.removeView(this.priceIconView);
            setPriceIconView(null);
        } else if (this.priceIconView != null && priceV4Vo.getPriceIcon() != null && (appCompatImageView = this.priceIconView) != null) {
            ru.ozon.app.android.pdp.utils.ViewExtKt.bindOrGone$default(appCompatImageView, priceV4Vo.getPriceIcon(), null, 2, null);
        }
        if (priceV4Vo.getTopFinBadge() != null) {
            BadgeHolderKt.bind(getOrCreateFinBadge(), priceV4Vo.getTopFinBadge(), actionHandler);
            View view = this.topStarsBadgeView;
            if (view == null) {
                return null;
            }
            removeView(view);
            setTopStarsBadgeView(null);
            return Unit.f71690a;
        }
        if (priceV4Vo.getTopStarBadge() != null) {
            getOrCreateStarsBadge().bindOrGone(priceV4Vo.getTopStarBadge(), actionHandler);
            View view2 = this.topFinBadgeView;
            if (view2 == null) {
                return null;
            }
            removeView(view2);
            setTopFinBadgeView(null);
            return Unit.f71690a;
        }
        BadgeView badgeView = this.topFinBadgeView;
        if (badgeView != null) {
            ru.ozon.uni.android.uikitsdk.ext.ViewExtKt.gone(badgeView);
        }
        PriceStarsBadgeView priceStarsBadgeView = this.topStarsBadgeView;
        if (priceStarsBadgeView == null) {
            return null;
        }
        ru.ozon.uni.android.uikitsdk.ext.ViewExtKt.gone(priceStarsBadgeView);
        return Unit.f71690a;
    }

    @Override // ru.ozon.app.android.pdp.widgets.priceV4.presentation.PriceV4BaseView
    public OnBoardingCutConfig onBoardingCutConfig() {
        View view = this.topFinBadgeView;
        if (view == null) {
            view = this.topStarsBadgeView;
        }
        if (view == null) {
            return null;
        }
        int width = getWidth() - view.getMeasuredWidth();
        Dimens dimens = Dimens.INSTANCE;
        int dp_8 = width - dimens.getDP_8();
        int i11 = -dimens.getDP_8();
        return new OnBoardingCutConfig(Integer.valueOf(dp_8), Integer.valueOf(-dimens.getDP_8()), Integer.valueOf(i11), Integer.valueOf(-dimens.getDP_4()), null, null, null, false, 240, null);
    }

    @Override // ru.ozon.app.android.pdp.widgets.priceV4.presentation.PriceV4BaseView
    public Integer rightContainerWidth() {
        PriceStarsBadgeView priceStarsBadgeView;
        BadgeView badgeView = this.topFinBadgeView;
        if (badgeView != null && badgeView.getVisibility() == 0) {
            BadgeView badgeView2 = this.topFinBadgeView;
            if (badgeView2 != null) {
                return Integer.valueOf(badgeView2.getWidth());
            }
            return null;
        }
        PriceStarsBadgeView priceStarsBadgeView2 = this.topStarsBadgeView;
        if (priceStarsBadgeView2 == null || priceStarsBadgeView2.getVisibility() != 0 || (priceStarsBadgeView = this.topStarsBadgeView) == null) {
            return null;
        }
        return Integer.valueOf(priceStarsBadgeView.getWidth());
    }

    public final void setOnPriceClickListener(@NotNull Function1<? super AtomAction, Unit> actionHandler) {
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        this.priceView.setOnClickListener(new b(0, this, actionHandler));
    }

    public final void trackView(@NotNull PriceV4VoWrapper.TopWithFinBadge item, @NotNull l tokenizedAnalytics) {
        t starsTrackingEvent;
        CommonControlSettings common;
        Map<String, TokenizedTrackingInfo> trackingInfo;
        t mapToTokenizedEvent$default;
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(tokenizedAnalytics, "tokenizedAnalytics");
        PriceStarsBadgeVO topStarBadge = item.getTopStarBadge();
        if (topStarBadge != null && (common = topStarBadge.getCommon()) != null && (trackingInfo = common.getTrackingInfo()) != null && (mapToTokenizedEvent$default = TrackingInfoMapperKt.mapToTokenizedEvent$default(trackingInfo, Long.valueOf(item.getId()), null, 2, null)) != null) {
            TokenizedAnalyticsExtensionsKt.processViewEvents$default(tokenizedAnalytics, mapToTokenizedEvent$default, null, 2, null);
        }
        PriceStarsBadgeVO topStarBadge2 = item.getTopStarBadge();
        if (topStarBadge2 == null || (starsTrackingEvent = topStarBadge2.getStarsTrackingEvent()) == null) {
            return;
        }
        TokenizedAnalyticsExtensionsKt.processViewEvents$default(tokenizedAnalytics, starsTrackingEvent, null, 2, null);
    }

    @Override // ru.ozon.app.android.pdp.widgets.priceV4.presentation.PriceV4BaseView
    public void updateRightContainerWidth(int desiredWidth) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        BadgeView badgeView = this.topFinBadgeView;
        if (badgeView != null) {
            if (badgeView.getVisibility() == 0) {
                ViewGroup.LayoutParams layoutParams = badgeView.getLayoutParams();
                ViewGroup.MarginLayoutParams marginLayoutParams2 = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
                if (marginLayoutParams2 == null) {
                    return;
                }
                int i11 = marginLayoutParams2.leftMargin;
                int i12 = marginLayoutParams2.topMargin;
                int i13 = marginLayoutParams2.rightMargin;
                int i14 = marginLayoutParams2.bottomMargin;
                int width = desiredWidth - badgeView.getWidth();
                marginLayoutParams2.leftMargin = width;
                if (i11 == width) {
                    ViewGroup.LayoutParams layoutParams2 = badgeView.getLayoutParams();
                    ViewGroup.MarginLayoutParams marginLayoutParams3 = layoutParams2 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams2 : null;
                    if (i12 == (marginLayoutParams3 != null ? marginLayoutParams3.topMargin : 0)) {
                        ViewGroup.LayoutParams layoutParams3 = badgeView.getLayoutParams();
                        ViewGroup.MarginLayoutParams marginLayoutParams4 = layoutParams3 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams3 : null;
                        if (i13 == (marginLayoutParams4 != null ? marginLayoutParams4.rightMargin : 0)) {
                            ViewGroup.LayoutParams layoutParams4 = badgeView.getLayoutParams();
                            marginLayoutParams = layoutParams4 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams4 : null;
                            if (i14 == (marginLayoutParams != null ? marginLayoutParams.bottomMargin : 0)) {
                                return;
                            }
                        }
                    }
                }
                badgeView.setLayoutParams(marginLayoutParams2);
                return;
            }
            return;
        }
        PriceStarsBadgeView priceStarsBadgeView = this.topStarsBadgeView;
        if (priceStarsBadgeView == null) {
            ViewExtKt.updatePadding$default(this, 0, 0, desiredWidth, 0, 11, null);
            return;
        }
        if (priceStarsBadgeView.getVisibility() == 0) {
            ViewGroup.LayoutParams layoutParams5 = priceStarsBadgeView.getLayoutParams();
            ViewGroup.MarginLayoutParams marginLayoutParams5 = layoutParams5 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams5 : null;
            if (marginLayoutParams5 == null) {
                return;
            }
            int i15 = marginLayoutParams5.leftMargin;
            int i16 = marginLayoutParams5.topMargin;
            int i17 = marginLayoutParams5.rightMargin;
            int i18 = marginLayoutParams5.bottomMargin;
            int width2 = desiredWidth - priceStarsBadgeView.getWidth();
            marginLayoutParams5.leftMargin = width2;
            if (i15 == width2) {
                ViewGroup.LayoutParams layoutParams6 = priceStarsBadgeView.getLayoutParams();
                ViewGroup.MarginLayoutParams marginLayoutParams6 = layoutParams6 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams6 : null;
                if (i16 == (marginLayoutParams6 != null ? marginLayoutParams6.topMargin : 0)) {
                    ViewGroup.LayoutParams layoutParams7 = priceStarsBadgeView.getLayoutParams();
                    ViewGroup.MarginLayoutParams marginLayoutParams7 = layoutParams7 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams7 : null;
                    if (i17 == (marginLayoutParams7 != null ? marginLayoutParams7.rightMargin : 0)) {
                        ViewGroup.LayoutParams layoutParams8 = priceStarsBadgeView.getLayoutParams();
                        marginLayoutParams = layoutParams8 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams8 : null;
                        if (i18 == (marginLayoutParams != null ? marginLayoutParams.bottomMargin : 0)) {
                            return;
                        }
                    }
                }
            }
            priceStarsBadgeView.setLayoutParams(marginLayoutParams5);
        }
    }
}
