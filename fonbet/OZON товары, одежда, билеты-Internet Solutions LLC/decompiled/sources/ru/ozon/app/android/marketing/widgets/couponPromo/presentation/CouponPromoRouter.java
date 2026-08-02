package ru.ozon.app.android.marketing.widgets.couponPromo.presentation;

import GZ.g;
import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.view.ViewGroup;
import androidx.core.app.t;
import androidx.fragment.app.ComponentCallbacksC5392m;
import androidx.fragment.app.G;
import androidx.fragment.app.r;
import androidx.lifecycle.J;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.R$string;
import ru.ozon.app.android.marketing.widgets.couponPromo.presentation.CouponPromoVO;
import ru.ozon.app.android.marketing.widgets.couponPromo.presentation.dialog.CouponPromoBottomSheetDialog;
import ru.ozon.app.android.uikit.text.StringProvider;
import ru.ozon.uni.android.flashbar.factory.FlashbarFactory;
import ru.ozon.uni.android.flashbar.model.Action;
import ru.ozon.uni.android.uikit.extensions.view.ContextExtKt;
import ru.ozon.uni.atoms.utils.OzonSpannableString;
import ru.ozon.uni.atoms.utils.OzonSpannableStringKt;
import ru.ozon.uni.core.R$drawable;

@Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u0000 62\u00020\u0001:\u00016B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J)\u0010\r\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ7\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\f0\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u001d\u0010\u0015\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016J7\u0010\u001f\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001b2\b\b\u0002\u0010\u001e\u001a\u00020\u001d¢\u0006\u0004\b\u001f\u0010 J'\u0010#\u001a\u00020\f2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u00192\b\u0010\"\u001a\u0004\u0018\u00010!¢\u0006\u0004\b#\u0010$J?\u0010)\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010&\u001a\u00020%2\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010(\u001a\u0004\u0018\u00010'¢\u0006\u0004\b)\u0010*J?\u0010+\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010&\u001a\u00020%2\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010(\u001a\u0004\u0018\u00010'¢\u0006\u0004\b+\u0010*J\u001d\u0010\r\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\"\u001a\u00020,¢\u0006\u0004\b\r\u0010-J\u0015\u0010\r\u001a\u00020\f2\u0006\u0010/\u001a\u00020.¢\u0006\u0004\b\r\u00100R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00101\u001a\u0004\b2\u00103R\u0016\u00104\u001a\u00020\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u00105¨\u00067"}, d2 = {"Lru/ozon/app/android/marketing/widgets/couponPromo/presentation/CouponPromoRouter;", "", "LGZ/g;", "screenRouter", "<init>", "(LGZ/g;)V", "Landroidx/lifecycle/J;", "viewOwner", "Landroid/content/Context;", "context", "Landroid/view/ViewGroup;", "rootView", "", "showNeedAuthTooltip", "(Landroidx/lifecycle/J;Landroid/content/Context;Landroid/view/ViewGroup;)V", "Lkotlin/Function0;", "action", "showFlashBarWithAction", "(Landroidx/lifecycle/J;Landroid/content/Context;Landroid/view/ViewGroup;Lkotlin/jvm/functions/Function0;)V", "", "message", "sharePromoCode", "(Landroid/content/Context;Ljava/lang/String;)V", "Lru/ozon/app/android/marketing/widgets/couponPromo/presentation/CouponPromoVO$StepsStateVO;", "stepsState", "Lru/ozon/app/android/marketing/widgets/couponPromo/presentation/CouponPromoVO$PromoCodeVO;", "promoCode", "Lru/ozon/app/android/marketing/widgets/couponPromo/presentation/dialog/CouponPromoBottomSheetDialog$UpdateListener;", "updateListener", "", "withShowSuccess", "openPopupWithExtendedInfo", "(Landroid/content/Context;Lru/ozon/app/android/marketing/widgets/couponPromo/presentation/CouponPromoVO$StepsStateVO;Lru/ozon/app/android/marketing/widgets/couponPromo/presentation/CouponPromoVO$PromoCodeVO;Lru/ozon/app/android/marketing/widgets/couponPromo/presentation/dialog/CouponPromoBottomSheetDialog$UpdateListener;Z)V", "Landroid/app/Activity;", "activity", "updatePopupWithExtendedInfo", "(Lru/ozon/app/android/marketing/widgets/couponPromo/presentation/CouponPromoVO$StepsStateVO;Lru/ozon/app/android/marketing/widgets/couponPromo/presentation/CouponPromoVO$PromoCodeVO;Landroid/app/Activity;)V", "Landroid/content/res/Resources;", "resources", "", "duration", "showErrorToolTip", "(Landroidx/lifecycle/J;Landroid/content/res/Resources;Landroid/view/ViewGroup;Ljava/lang/String;Ljava/lang/Long;)V", "showSuccessToolTip", "Landroidx/fragment/app/r;", "(Landroidx/lifecycle/J;Landroidx/fragment/app/r;)V", "Landroidx/fragment/app/m;", "fragment", "(Landroidx/fragment/app/m;)V", "LGZ/g;", "getScreenRouter", "()LGZ/g;", "isEnterButtonTappedBefore", "Z", "Companion", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class CouponPromoRouter {
    private boolean isEnterButtonTappedBefore;

    @NotNull
    private final g screenRouter;
    public static final int $stable = 8;

    public CouponPromoRouter(@NotNull g screenRouter) {
        Intrinsics.checkNotNullParameter(screenRouter, "screenRouter");
        this.screenRouter = screenRouter;
    }

    public static /* synthetic */ void openPopupWithExtendedInfo$default(CouponPromoRouter couponPromoRouter, Context context, CouponPromoVO.StepsStateVO stepsStateVO, CouponPromoVO.PromoCodeVO promoCodeVO, CouponPromoBottomSheetDialog.UpdateListener updateListener, boolean z11, int i11, Object obj) {
        if ((i11 & 16) != 0) {
            z11 = false;
        }
        couponPromoRouter.openPopupWithExtendedInfo(context, stepsStateVO, promoCodeVO, updateListener, z11);
    }

    public static /* synthetic */ void showErrorToolTip$default(CouponPromoRouter couponPromoRouter, J j11, Resources resources, ViewGroup viewGroup, String str, Long l11, int i11, Object obj) {
        if ((i11 & 8) != 0) {
            str = null;
        }
        String str2 = str;
        if ((i11 & 16) != 0) {
            l11 = 3000L;
        }
        couponPromoRouter.showErrorToolTip(j11, resources, viewGroup, str2, l11);
    }

    private final void showFlashBarWithAction(J viewOwner, Context context, ViewGroup rootView, Function0<Unit> action) {
        context.getResources();
        if (rootView != null) {
            FlashbarFactory.create$default(FlashbarFactory.INSTANCE, rootView, null, OzonSpannableStringKt.toOzonSpannableString(StringProvider.getString(R$string.marketing_promo_code_need_auth_android)), null, null, Integer.valueOf(R$drawable.ic_m_danger_filled), null, null, null, new Action(StringProvider.getString(R$string.marketing_promo_code_enter_android), false, action, 2, null), null, null, null, 6000L, null, null, viewOwner, 56794, null).show();
        }
    }

    public static /* synthetic */ void showSuccessToolTip$default(CouponPromoRouter couponPromoRouter, J j11, Resources resources, ViewGroup viewGroup, String str, Long l11, int i11, Object obj) {
        if ((i11 & 8) != 0) {
            str = null;
        }
        String str2 = str;
        if ((i11 & 16) != 0) {
            l11 = 3000L;
        }
        couponPromoRouter.showSuccessToolTip(j11, resources, viewGroup, str2, l11);
    }

    @NotNull
    public final g getScreenRouter() {
        return this.screenRouter;
    }

    public final void openPopupWithExtendedInfo(@NotNull Context context, @NotNull CouponPromoVO.StepsStateVO stepsState, @NotNull CouponPromoVO.PromoCodeVO promoCode, @NotNull CouponPromoBottomSheetDialog.UpdateListener updateListener, boolean withShowSuccess) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(stepsState, "stepsState");
        Intrinsics.checkNotNullParameter(promoCode, "promoCode");
        Intrinsics.checkNotNullParameter(updateListener, "updateListener");
        r rVar = context instanceof r ? (r) context : null;
        if (rVar != null) {
            G supportFragmentManager = rVar.getSupportFragmentManager();
            Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
            CouponPromoBottomSheetDialog.Companion companion = CouponPromoBottomSheetDialog.INSTANCE;
            OzonSpannableString text = stepsState.getStepsText().getText();
            Integer textColor = stepsState.getStepsText().getTextColor();
            CouponPromoVO.StepsStateVO.StepsActionVO stepsAction = stepsState.getStepsAction();
            String activeStateTitle = stepsAction != null ? stepsAction.getActiveStateTitle() : null;
            CouponPromoVO.StepsStateVO.StepsActionVO stepsAction2 = stepsState.getStepsAction();
            String inactiveStateTitle = stepsAction2 != null ? stepsAction2.getInactiveStateTitle() : null;
            boolean isActivated = promoCode.getIsActivated();
            String promoCode2 = promoCode.getPromoCode();
            CouponPromoVO.StepsStateVO.StepsActionVO stepsAction3 = stepsState.getStepsAction();
            companion.newInstance(text, textColor, activeStateTitle, inactiveStateTitle, isActivated, promoCode2, stepsAction3 != null ? stepsAction3.getDeeplink() : null, updateListener, withShowSuccess).show(supportFragmentManager, "COUPON_PROMO_INFO_TAG");
        }
    }

    public final void sharePromoCode(@NotNull Context context, @NotNull String message) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(message, "message");
        Activity activity = context instanceof Activity ? (Activity) context : null;
        if (activity != null) {
            t.a b11 = t.a.b(activity);
            b11.g("text/plain");
            b11.f(message);
            b11.d("Поделиться");
            b11.h();
        }
    }

    public final void showErrorToolTip(@NotNull J viewOwner, @NotNull Resources resources, ViewGroup rootView, String message, Long duration) {
        OzonSpannableString ozonSpannableString;
        Intrinsics.checkNotNullParameter(viewOwner, "viewOwner");
        Intrinsics.checkNotNullParameter(resources, "resources");
        if (rootView != null) {
            FlashbarFactory flashbarFactory = FlashbarFactory.INSTANCE;
            if (message == null || (ozonSpannableString = OzonSpannableStringKt.toOzonSpannableString(message)) == null) {
                ozonSpannableString = OzonSpannableStringKt.toOzonSpannableString(StringProvider.getString(R$string.error_marketing_promo_code_error_android));
            }
            FlashbarFactory.create$default(flashbarFactory, rootView, null, ozonSpannableString, null, null, Integer.valueOf(R$drawable.ic_m_danger_filled), null, null, null, null, null, null, null, duration, null, null, viewOwner, 57306, null).show();
        }
    }

    public final void showNeedAuthTooltip(@NotNull J viewOwner, @NotNull r activity) {
        Intrinsics.checkNotNullParameter(viewOwner, "viewOwner");
        Intrinsics.checkNotNullParameter(activity, "activity");
        showNeedAuthTooltip(viewOwner, activity, ContextExtKt.getRootView(activity));
    }

    public final void showSuccessToolTip(@NotNull J viewOwner, @NotNull Resources resources, ViewGroup rootView, String message, Long duration) {
        Intrinsics.checkNotNullParameter(viewOwner, "viewOwner");
        Intrinsics.checkNotNullParameter(resources, "resources");
        if (rootView != null) {
            FlashbarFactory.create$default(FlashbarFactory.INSTANCE, rootView, null, OzonSpannableStringKt.toOzonSpannableString(message == null ? StringProvider.getString(R$string.marketing_promo_code_success_android) : message), null, null, Integer.valueOf(ru.ozon.app.android.composer.R$drawable.ic_check_mark_green), null, null, null, null, null, null, null, duration, null, null, viewOwner, 57306, null).show();
        }
    }

    public final void updatePopupWithExtendedInfo(@NotNull CouponPromoVO.StepsStateVO stepsState, @NotNull CouponPromoVO.PromoCodeVO promoCode, Activity activity) {
        Intrinsics.checkNotNullParameter(stepsState, "stepsState");
        Intrinsics.checkNotNullParameter(promoCode, "promoCode");
        r rVar = activity instanceof r ? (r) activity : null;
        if (rVar != null) {
            G supportFragmentManager = rVar.getSupportFragmentManager();
            Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
            ComponentCallbacksC5392m g02 = supportFragmentManager.g0("COUPON_PROMO_INFO_TAG");
            CouponPromoBottomSheetDialog couponPromoBottomSheetDialog = g02 instanceof CouponPromoBottomSheetDialog ? (CouponPromoBottomSheetDialog) g02 : null;
            if (couponPromoBottomSheetDialog != null) {
                couponPromoBottomSheetDialog.updateData(stepsState, promoCode);
            }
        }
    }

    public final void showNeedAuthTooltip(@NotNull ComponentCallbacksC5392m fragment) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        J viewLifecycleOwner = fragment.getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        Context requireContext = fragment.requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
        showNeedAuthTooltip(viewLifecycleOwner, requireContext, ContextExtKt.getRootView(fragment));
    }

    private final void showNeedAuthTooltip(J viewOwner, Context context, ViewGroup rootView) {
        showFlashBarWithAction(viewOwner, context, rootView, new CouponPromoRouter$showNeedAuthTooltip$1(this));
    }
}
