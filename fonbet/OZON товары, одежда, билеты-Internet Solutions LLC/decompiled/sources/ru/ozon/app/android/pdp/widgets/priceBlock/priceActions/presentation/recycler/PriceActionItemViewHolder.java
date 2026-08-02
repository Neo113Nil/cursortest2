package ru.ozon.app.android.pdp.widgets.priceBlock.priceActions.presentation.recycler;

import Sc.InterfaceC4008j;
import WZ.t;
import android.content.Context;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import jk0.j;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.widgets.v2.onboarding.data.OnBoardingDTO;
import ru.ozon.app.android.pdp.databinding.PdpItemPriceActionsCellBinding;
import ru.ozon.app.android.pdp.utils.ContextExtKt;
import ru.ozon.app.android.pdp.utils.DelegatesKt;
import ru.ozon.app.android.pdp.utils.ViewExtKt;
import ru.ozon.app.android.pdp.widgets.priceBlock.priceActions.presentation.PriceActionsVO;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;

@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0001\u0018\u00002\u00060\u0001j\u0002`\u0002Bu\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0014\u0010\b\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0012\u0004\u0012\u00020\u00070\u0005\u0012 \u0010\f\u001a\u001c\u0012\u0004\u0012\u00020\n\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u000b\u0012\u0004\u0012\u00020\u00070\t\u0012\u0018\u0010\u000f\u001a\u0014\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00070\t\u0012\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00070\u0005¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u001a\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u001c\u0010\u0015J\u000f\u0010\u001d\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u001d\u0010\u0015J\u0017\u0010 \u001a\u0004\u0018\u00010\u00072\u0006\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b \u0010!R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\"R\"\u0010\b\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0012\u0004\u0012\u00020\u00070\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010#R.\u0010\f\u001a\u001c\u0012\u0004\u0012\u00020\n\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u000b\u0012\u0004\u0012\u00020\u00070\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010$R&\u0010\u000f\u001a\u0014\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00070\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010$R \u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00070\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010#R\u001b\u0010*\u001a\u00020%8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R\u001b\u0010.\u001a\u00020\u000e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b+\u0010'\u001a\u0004\b,\u0010-R\u0018\u0010/\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u00100R\u0018\u00101\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u00100R\u0016\u00102\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u00103¨\u00064"}, d2 = {"Lru/ozon/app/android/pdp/widgets/priceBlock/priceActions/presentation/recycler/PriceActionItemViewHolder;", "Ljk0/j;", "Lru/ozon/app/android/uikit/view/recycler/adapter/lifecycle/LifecycleViewHolder;", "Lru/ozon/app/android/pdp/databinding/PdpItemPriceActionsCellBinding;", "binding", "Lkotlin/Function1;", "LWZ/t;", "", "onBlockInVisibleBounds", "Lkotlin/Function2;", "", "Lkotlin/Function0;", "visibilityStateAlert", "Lru/ozon/app/android/composer/widgets/v2/onboarding/data/OnBoardingDTO;", "Landroid/view/View;", "onOnboardingShow", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "<init>", "(Lru/ozon/app/android/pdp/databinding/PdpItemPriceActionsCellBinding;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;)V", "launchAnimation", "()V", "Landroid/graphics/drawable/Drawable;", "drawable", "", "color", "tintBackgroundDrawable", "(Landroid/graphics/drawable/Drawable;Ljava/lang/String;)V", "onViewInVisibleBounds", "onViewOutOfVisibleBounds", "Lru/ozon/app/android/pdp/widgets/priceBlock/priceActions/presentation/PriceActionsVO$Action;", "action", "bind", "(Lru/ozon/app/android/pdp/widgets/priceBlock/priceActions/presentation/PriceActionsVO$Action;)Lkotlin/Unit;", "Lru/ozon/app/android/pdp/databinding/PdpItemPriceActionsCellBinding;", "Lkotlin/jvm/functions/Function1;", "Lkotlin/jvm/functions/Function2;", "Landroid/view/animation/Animation;", "animation$delegate", "LSc/j;", "getAnimation", "()Landroid/view/animation/Animation;", "animation", "viewGradient$delegate", "getViewGradient", "()Landroid/view/View;", "viewGradient", "tokenizedEvent", "LWZ/t;", "animationTokenizedEvent", "isPlayAnimation", "Z", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class PriceActionItemViewHolder extends j {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    /* renamed from: animation$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j animation;
    private t animationTokenizedEvent;

    @NotNull
    private final PdpItemPriceActionsCellBinding binding;
    private boolean isPlayAnimation;

    @NotNull
    private final Function1<t, Unit> onBlockInVisibleBounds;

    @NotNull
    private final Function2<OnBoardingDTO, View, Unit> onOnboardingShow;
    private t tokenizedEvent;

    /* renamed from: viewGradient$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j viewGradient;

    @NotNull
    private final Function2<Boolean, Function0<Unit>, Unit> visibilityStateAlert;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public PriceActionItemViewHolder(@NotNull PdpItemPriceActionsCellBinding binding, @NotNull Function1<? super t, Unit> onBlockInVisibleBounds, @NotNull Function2<? super Boolean, ? super Function0<Unit>, Unit> visibilityStateAlert, @NotNull Function2<? super OnBoardingDTO, ? super View, Unit> onOnboardingShow, @NotNull Function1<? super AtomAction, Unit> actionHandler) {
        super(r0);
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(onBlockInVisibleBounds, "onBlockInVisibleBounds");
        Intrinsics.checkNotNullParameter(visibilityStateAlert, "visibilityStateAlert");
        Intrinsics.checkNotNullParameter(onOnboardingShow, "onOnboardingShow");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        ConstraintLayout constraintLayout = binding.getConstraintLayout();
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "getRoot(...)");
        this.binding = binding;
        this.onBlockInVisibleBounds = onBlockInVisibleBounds;
        this.visibilityStateAlert = visibilityStateAlert;
        this.onOnboardingShow = onOnboardingShow;
        this.actionHandler = actionHandler;
        this.animation = DelegatesKt.lazyUnsafe(new PriceActionItemViewHolder$animation$2(this));
        this.viewGradient = DelegatesKt.lazyUnsafe(new PriceActionItemViewHolder$viewGradient$2(this));
        binding.getConstraintLayout().setClipToOutline(true);
        binding.priceActionItemTextTav.setTextIsSelectable(false);
    }

    private final Animation getAnimation() {
        Object value = this.animation.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (Animation) value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final View getViewGradient() {
        return (View) this.viewGradient.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void launchAnimation() {
        getViewGradient().startAnimation(getAnimation());
        getViewGradient().setVisibility(0);
        t tVar = this.animationTokenizedEvent;
        if (tVar != null) {
            this.onBlockInVisibleBounds.invoke(tVar);
        }
    }

    private final void tintBackgroundDrawable(Drawable drawable, String color) {
        ShapeDrawable shapeDrawable = drawable instanceof ShapeDrawable ? (ShapeDrawable) drawable : null;
        if (shapeDrawable == null) {
            return;
        }
        Paint paint = shapeDrawable.getPaint();
        Context context = this.itemView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        paint.setColor(ContextExtKt.parseColor(context, color));
    }

    public final Unit bind(@NotNull PriceActionsVO.Action action) {
        String tintColor;
        Intrinsics.checkNotNullParameter(action, "action");
        PdpItemPriceActionsCellBinding pdpItemPriceActionsCellBinding = this.binding;
        this.tokenizedEvent = action.getTokenizedEvent();
        this.animationTokenizedEvent = action.getAnimationTokenizedEvent();
        ImageView priceActionItemIconIv = pdpItemPriceActionsCellBinding.priceActionItemIconIv;
        Intrinsics.checkNotNullExpressionValue(priceActionItemIconIv, "priceActionItemIconIv");
        ViewExtKt.bindOrGone$default(priceActionItemIconIv, action.getIcon(), null, 2, null);
        TextAtomV2View priceActionItemTextTav = pdpItemPriceActionsCellBinding.priceActionItemTextTav;
        Intrinsics.checkNotNullExpressionValue(priceActionItemTextTav, "priceActionItemTextTav");
        TextHolderKt.bind(priceActionItemTextTav, action.getText(), this.actionHandler);
        Drawable background = pdpItemPriceActionsCellBinding.getConstraintLayout().getBackground();
        Intrinsics.checkNotNullExpressionValue(background, "getBackground(...)");
        tintBackgroundDrawable(background, action.getBackgroundColor());
        ImageView priceActionDisclosureIv = pdpItemPriceActionsCellBinding.priceActionDisclosureIv;
        Intrinsics.checkNotNullExpressionValue(priceActionDisclosureIv, "priceActionDisclosureIv");
        priceActionDisclosureIv.setVisibility(action.getDisclosure() == null ? 8 : 0);
        PriceActionsVO.Disclosure disclosure = action.getDisclosure();
        if (disclosure != null && (tintColor = disclosure.getTintColor()) != null) {
            ImageView priceActionDisclosureIv2 = pdpItemPriceActionsCellBinding.priceActionDisclosureIv;
            Intrinsics.checkNotNullExpressionValue(priceActionDisclosureIv2, "priceActionDisclosureIv");
            Context context = this.itemView.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            ThemeExtKt.tint(priceActionDisclosureIv2, Integer.valueOf(ContextExtKt.parseColor(context, tintColor)));
        }
        this.isPlayAnimation = action.getAnimationTimer() != null;
        if (action.getOnBoarding() != null) {
            Function2<OnBoardingDTO, View, Unit> function2 = this.onOnboardingShow;
            OnBoardingDTO onBoarding = action.getOnBoarding();
            ConstraintLayout constraintLayout = this.binding.getConstraintLayout();
            Intrinsics.checkNotNullExpressionValue(constraintLayout, "getRoot(...)");
            function2.invoke(onBoarding, constraintLayout);
        }
        Integer width = action.getWidth();
        if (width == null) {
            return null;
        }
        int intValue = width.intValue();
        ConstraintLayout constraintLayout2 = this.binding.getConstraintLayout();
        Intrinsics.checkNotNullExpressionValue(constraintLayout2, "getRoot(...)");
        ViewGroup.LayoutParams layoutParams = constraintLayout2.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        layoutParams.width = intValue;
        constraintLayout2.setLayoutParams(layoutParams);
        return Unit.f71690a;
    }

    @Override // jk0.j, lk0.b
    public void onViewInVisibleBounds() {
        super.onViewInVisibleBounds();
        if (this.isPlayAnimation) {
            this.visibilityStateAlert.invoke(Boolean.TRUE, new PriceActionItemViewHolder$onViewInVisibleBounds$1(this));
        }
        this.onBlockInVisibleBounds.invoke(this.tokenizedEvent);
    }

    @Override // jk0.j, lk0.b
    public void onViewOutOfVisibleBounds() {
        super.onViewOutOfVisibleBounds();
        if (this.isPlayAnimation) {
            this.visibilityStateAlert.invoke(Boolean.FALSE, null);
            ru.ozon.uni.android.uikit.extensions.view.ViewExtKt.gone(getViewGradient());
        }
    }
}
