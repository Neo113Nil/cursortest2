package ru.ozon.app.android.marketing.widgets.couponPromo.presentation;

import AW.b;
import Ez.ViewOnClickListenerC2978b;
import GZ.g;
import Sc.o;
import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.content.a;
import androidx.fragment.app.r;
import androidx.lifecycle.J;
import io.reactivex.p;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import mc.C8125a;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.marketing.common.coupon.CouponResult;
import ru.ozon.app.android.marketing.common.coupon.CouponViewModel;
import ru.ozon.app.android.marketing.databinding.StepsPromosWidgetBinding;
import ru.ozon.app.android.marketing.widgets.couponPromo.presentation.CouponPromoVO;
import ru.ozon.app.android.marketing.widgets.couponPromo.presentation.dialog.CouponPromoBottomSheetDialog;
import ru.ozon.app.android.marketing.widgets.couponPromo.presentation.dialog.UpdateAction;
import ru.ozon.app.android.uikit.R$drawable;
import ru.ozon.app.android.utils.rx.RxExtKt;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.android.uikit.extensions.view.ContextExtKt;
import ru.ozon.uni.android.uikit.extensions.view.TextViewExtKt;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;

@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003B7\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0016\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001b\u001a\u00020\u00132\u0006\u0010\u001a\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u001d\u0010\u0018J#\u0010!\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u00022\n\u0010 \u001a\u00060\u001ej\u0002`\u001fH\u0014¢\u0006\u0004\b!\u0010\"R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010#R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010$R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010%R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010&R\u0014\u0010(\u001a\u00020'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0018\u0010*\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010+R\u001e\u0010 \u001a\n\u0018\u00010\u001ej\u0004\u0018\u0001`\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010,R\u0014\u0010.\u001a\u00020-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/¨\u00060"}, d2 = {"Lru/ozon/app/android/marketing/widgets/couponPromo/presentation/CouponPromoViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/marketing/widgets/couponPromo/presentation/CouponPromoVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "Landroid/view/View;", "containerView", "Lru/ozon/app/android/marketing/widgets/couponPromo/presentation/CouponPromoRouter;", "couponPromoRouter", "Lru/ozon/app/android/composer/ComposerReferences;", "composerReferences", "Landroidx/fragment/app/r;", "activity", "Lru/ozon/app/android/marketing/common/coupon/CouponViewModel;", "viewModel", "Landroidx/lifecycle/J;", "viewOwner", "<init>", "(Landroid/view/View;Lru/ozon/app/android/marketing/widgets/couponPromo/presentation/CouponPromoRouter;Lru/ozon/app/android/composer/ComposerReferences;Landroidx/fragment/app/r;Lru/ozon/app/android/marketing/common/coupon/CouponViewModel;Landroidx/lifecycle/J;)V", "item", "", "bindActiveButton", "(Lru/ozon/app/android/marketing/widgets/couponPromo/presentation/CouponPromoVO;)V", "bindInactiveStateButton", "observeActivateResult", "()V", "Lru/ozon/app/android/marketing/common/coupon/CouponResult;", "result", "applyResult", "(Lru/ozon/app/android/marketing/common/coupon/CouponResult;)V", "onAttach", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "info", "bind", "(Lru/ozon/app/android/marketing/widgets/couponPromo/presentation/CouponPromoVO;Ll20/d;)V", "Lru/ozon/app/android/marketing/widgets/couponPromo/presentation/CouponPromoRouter;", "Landroidx/fragment/app/r;", "Lru/ozon/app/android/marketing/common/coupon/CouponViewModel;", "Landroidx/lifecycle/J;", "Lru/ozon/app/android/marketing/widgets/couponPromo/presentation/dialog/CouponPromoBottomSheetDialog$UpdateListener;", "updateListener", "Lru/ozon/app/android/marketing/widgets/couponPromo/presentation/dialog/CouponPromoBottomSheetDialog$UpdateListener;", "couponPromoVO", "Lru/ozon/app/android/marketing/widgets/couponPromo/presentation/CouponPromoVO;", "Ll20/d;", "Lru/ozon/app/android/marketing/databinding/StepsPromosWidgetBinding;", "binding", "Lru/ozon/app/android/marketing/databinding/StepsPromosWidgetBinding;", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class CouponPromoViewHolder extends k<CouponPromoVO> {

    @NotNull
    private final r activity;

    @NotNull
    private final StepsPromosWidgetBinding binding;

    @NotNull
    private final CouponPromoRouter couponPromoRouter;
    private CouponPromoVO couponPromoVO;
    private d info;

    @NotNull
    private final CouponPromoBottomSheetDialog.UpdateListener updateListener;

    @NotNull
    private final CouponViewModel viewModel;

    @NotNull
    private final J viewOwner;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CouponPromoViewHolder(@NotNull View containerView, @NotNull CouponPromoRouter couponPromoRouter, @NotNull ComposerReferences composerReferences, @NotNull r activity, @NotNull CouponViewModel viewModel, @NotNull J viewOwner) {
        super(containerView);
        Intrinsics.checkNotNullParameter(containerView, "containerView");
        Intrinsics.checkNotNullParameter(couponPromoRouter, "couponPromoRouter");
        Intrinsics.checkNotNullParameter(composerReferences, "composerReferences");
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        Intrinsics.checkNotNullParameter(viewOwner, "viewOwner");
        this.couponPromoRouter = couponPromoRouter;
        this.activity = activity;
        this.viewModel = viewModel;
        this.viewOwner = viewOwner;
        StepsPromosWidgetBinding bind = StepsPromosWidgetBinding.bind(containerView);
        Intrinsics.checkNotNullExpressionValue(bind, "bind(...)");
        this.binding = bind;
        this.updateListener = new UpdateAction(composerReferences.getController());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void applyResult(CouponResult result) {
        Resources resources = this.activity.getResources();
        ViewGroup rootView = ContextExtKt.getRootView(this.activity);
        if (result instanceof CouponResult.Auth) {
            this.couponPromoRouter.showNeedAuthTooltip(this.viewOwner, this.activity);
            return;
        }
        if (!(result instanceof CouponResult.Success)) {
            if (!(result instanceof CouponResult.Fail)) {
                throw new o();
            }
            CouponPromoRouter couponPromoRouter = this.couponPromoRouter;
            Intrinsics.f(resources);
            CouponPromoRouter.showErrorToolTip$default(couponPromoRouter, this.viewOwner, resources, rootView, ((CouponResult.Fail) result).getMessage(), null, 16, null);
            return;
        }
        CouponPromoRouter couponPromoRouter2 = this.couponPromoRouter;
        Intrinsics.f(resources);
        CouponPromoRouter.showSuccessToolTip$default(couponPromoRouter2, this.viewOwner, resources, rootView, null, null, 24, null);
        CouponPromoVO couponPromoVO = this.couponPromoVO;
        if (couponPromoVO != null) {
            couponPromoVO.getPromoCode().setActivated(true);
            bindActiveButton(couponPromoVO);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bind$lambda$5$lambda$2(CouponPromoViewHolder couponPromoViewHolder, String str, View view) {
        couponPromoViewHolder.couponPromoRouter.sharePromoCode(couponPromoViewHolder.getContext(), str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bind$lambda$5$lambda$4(CouponPromoViewHolder couponPromoViewHolder, View view) {
        CouponPromoVO couponPromoVO = couponPromoViewHolder.couponPromoVO;
        if (couponPromoVO != null) {
            CouponPromoRouter couponPromoRouter = couponPromoViewHolder.couponPromoRouter;
            Context context = couponPromoViewHolder.itemView.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            CouponPromoRouter.openPopupWithExtendedInfo$default(couponPromoRouter, context, couponPromoVO.getStepsState(), couponPromoVO.getPromoCode(), couponPromoViewHolder.updateListener, false, 16, null);
        }
    }

    private final void bindActiveButton(CouponPromoVO item) {
        StepsPromosWidgetBinding stepsPromosWidgetBinding = this.binding;
        Button activationActionButton = stepsPromosWidgetBinding.activationActionButton;
        Intrinsics.checkNotNullExpressionValue(activationActionButton, "activationActionButton");
        CouponPromoVO.BaseStateVO.ActivateActionVO activateAction = item.getBaseState().getActivateAction();
        TextViewExtKt.setTextOrGone(activationActionButton, activateAction != null ? activateAction.getActiveStateTitle() : null);
        CouponPromoVO.BaseStateVO.ActivateActionVO activateAction2 = item.getBaseState().getActivateAction();
        if ((activateAction2 != null ? activateAction2.getDeeplink() : null) == null) {
            stepsPromosWidgetBinding.activationActionButton.setOnClickListener(null);
            stepsPromosWidgetBinding.activationActionButton.setClickable(false);
        } else {
            stepsPromosWidgetBinding.activationActionButton.setOnClickListener(new b(5, this, item));
            stepsPromosWidgetBinding.activationActionButton.setClickable(true);
        }
        stepsPromosWidgetBinding.activationActionButton.setBackground(a.getDrawable(getContext(), R$drawable.mobilization_bg_button_green_rounded));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bindActiveButton$lambda$7$lambda$6(CouponPromoViewHolder couponPromoViewHolder, CouponPromoVO couponPromoVO, View view) {
        g.a.a(couponPromoViewHolder.couponPromoRouter.getScreenRouter(), couponPromoVO.getBaseState().getActivateAction().getDeeplink(), null, null, 6);
    }

    private final void bindInactiveStateButton(CouponPromoVO item) {
        Button button = this.binding.activationActionButton;
        Intrinsics.f(button);
        CouponPromoVO.BaseStateVO.ActivateActionVO activateAction = item.getBaseState().getActivateAction();
        TextViewExtKt.setTextOrGone(button, activateAction != null ? activateAction.getInactiveStateTitle() : null);
        button.setOnClickListener(new ED.a(5, this, item));
        button.setBackground(a.getDrawable(button.getContext(), R$drawable.mobilization_bg_button_blue_rounded));
        button.setClickable(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bindInactiveStateButton$lambda$9$lambda$8(CouponPromoViewHolder couponPromoViewHolder, CouponPromoVO couponPromoVO, View view) {
        couponPromoViewHolder.viewModel.activateCode(couponPromoVO.getPromoCode().getPromoCode());
    }

    private final void observeActivateResult() {
        p<CouponResult> observeOn = this.viewModel.observeActivateResult().filter(new Fw.b(new CouponPromoViewHolder$observeActivateResult$1(this), 13)).observeOn(C8125a.a());
        Intrinsics.checkNotNullExpressionValue(observeOn, "observeOn(...)");
        RxExtKt.observe$default(observeOn, this, new CouponPromoViewHolder$observeActivateResult$2(this), CouponPromoViewHolder$observeActivateResult$3.INSTANCE, null, 8, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean observeActivateResult$lambda$10(Function1 function1, Object p02) {
        Intrinsics.checkNotNullParameter(p02, "p0");
        return ((Boolean) function1.invoke(p02)).booleanValue();
    }

    @Override // ru.ozon.composer.ui.widget.k, jk0.j
    public void onAttach() {
        super.onAttach();
        observeActivateResult();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull CouponPromoVO item, @NotNull d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        StepsPromosWidgetBinding stepsPromosWidgetBinding = this.binding;
        this.couponPromoVO = item;
        this.info = info;
        Integer backgroundColor = item.getBaseState().getBackgroundColor();
        if (backgroundColor != null) {
            this.itemView.setBackgroundColor(backgroundColor.intValue());
        }
        stepsPromosWidgetBinding.titleTv.setText(item.getBaseState().getTitle());
        Integer titleColor = item.getBaseState().getTitleColor();
        if (titleColor != null) {
            int intValue = titleColor.intValue();
            stepsPromosWidgetBinding.titleTv.setTextColor(intValue);
            ImageView shareIv = stepsPromosWidgetBinding.shareIv;
            Intrinsics.checkNotNullExpressionValue(shareIv, "shareIv");
            ThemeExtKt.tint(shareIv, Integer.valueOf(intValue));
        }
        TextView subTitleTv = stepsPromosWidgetBinding.subTitleTv;
        Intrinsics.checkNotNullExpressionValue(subTitleTv, "subTitleTv");
        TextViewExtKt.setTextOrGone(subTitleTv, item.getBaseState().getSubTitle());
        CouponPromoVO.BaseStateVO.SharedDataVO sharedData = item.getBaseState().getSharedData();
        String text = sharedData != null ? sharedData.getText() : null;
        if (text != null) {
            ImageView shareIv2 = stepsPromosWidgetBinding.shareIv;
            Intrinsics.checkNotNullExpressionValue(shareIv2, "shareIv");
            ViewExtKt.show(shareIv2);
            stepsPromosWidgetBinding.shareIv.setOnClickListener(new Hx.b(6, this, text));
        } else {
            ImageView shareIv3 = stepsPromosWidgetBinding.shareIv;
            Intrinsics.checkNotNullExpressionValue(shareIv3, "shareIv");
            ViewExtKt.gone(shareIv3);
        }
        if (item.getPromoCode().getIsActivated()) {
            bindActiveButton(item);
        } else {
            bindInactiveStateButton(item);
        }
        TextView showStepsActionTv = stepsPromosWidgetBinding.showStepsActionTv;
        Intrinsics.checkNotNullExpressionValue(showStepsActionTv, "showStepsActionTv");
        CouponPromoVO.BaseStateVO.ShowStepsActionVO showStepsAction = item.getBaseState().getShowStepsAction();
        TextViewExtKt.setTextOrGone(showStepsActionTv, showStepsAction != null ? showStepsAction.getTitle() : null);
        stepsPromosWidgetBinding.showStepsActionTv.setOnClickListener(new ViewOnClickListenerC2978b(this, 16));
    }
}
