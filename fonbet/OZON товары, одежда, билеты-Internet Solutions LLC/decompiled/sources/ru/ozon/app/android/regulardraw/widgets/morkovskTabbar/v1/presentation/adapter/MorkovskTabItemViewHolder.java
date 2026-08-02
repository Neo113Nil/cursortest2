package ru.ozon.app.android.regulardraw.widgets.morkovskTabbar.v1.presentation.adapter;

import GW.a;
import WZ.l;
import WZ.m;
import WZ.t;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pikazon.callback.PikazonLoaderCallback;
import ru.ozon.app.android.pikazon.extensions.ImageViewExtKt;
import ru.ozon.app.android.pikazon.image.ImageSize;
import ru.ozon.app.android.regulardraw.R$color;
import ru.ozon.app.android.regulardraw.databinding.MorkovskTabItemLayoutBinding;
import ru.ozon.app.android.regulardraw.onboarding.MorkovskOnboardingDelegate;
import ru.ozon.app.android.regulardraw.onboarding.OnboardingModel;
import ru.ozon.app.android.regulardraw.ui.OutlinedTextView;
import ru.ozon.app.android.regulardraw.ui.indicator.IndicatorAtomDTO;
import ru.ozon.app.android.regulardraw.ui.indicator.IndicatorView;
import ru.ozon.app.android.regulardraw.utils.UtilKt;
import ru.ozon.app.android.regulardraw.widgets.morkovskTabbar.v1.presentation.MorkovskTabbarVO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;
import ru.ozon.uni.android.uikitsdk.ext.ViewExtKt;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u0000 62\u00020\u0001:\u00016B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t¢\u0006\u0004\b\r\u0010\u000eJ\u001b\u0010\u0012\u001a\u00020\u0011*\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u001b\u0010\u0017\u001a\u00020\u0016*\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0013\u0010\u0019\u001a\u00020\u0016*\u00020\u0002H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u001b\u0010\u001d\u001a\u00020\u000b*\u00020\u00162\u0006\u0010\u001c\u001a\u00020\u001bH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u001d\u0010!\u001a\u00020\u000b2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b!\u0010\"J!\u0010%\u001a\u00020\u000b*\u00020#2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010$\u001a\u00020\u0014¢\u0006\u0004\b%\u0010&J\u0015\u0010)\u001a\u00020\u000b2\u0006\u0010(\u001a\u00020'¢\u0006\u0004\b)\u0010*J\u0015\u0010,\u001a\u00020\u000b2\u0006\u0010+\u001a\u00020\u0014¢\u0006\u0004\b,\u0010-R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010.R\u0018\u0010\u0006\u001a\u00060\u0004j\u0002`\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010/R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u00100R \u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u00101R\u0018\u0010 \u001a\u0004\u0018\u00010\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u00102R\u0018\u00104\u001a\u0004\u0018\u0001038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u00105¨\u00067"}, d2 = {"Lru/ozon/app/android/regulardraw/widgets/morkovskTabbar/v1/presentation/adapter/MorkovskTabItemViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$C;", "Lru/ozon/app/android/regulardraw/databinding/MorkovskTabItemLayoutBinding;", "binding", "LWZ/l;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedAnalytics;", "tokenizedAnalytics", "Lru/ozon/app/android/regulardraw/onboarding/MorkovskOnboardingDelegate;", "onboardingDelegate", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "onAction", "<init>", "(Lru/ozon/app/android/regulardraw/databinding/MorkovskTabItemLayoutBinding;LWZ/l;Lru/ozon/app/android/regulardraw/onboarding/MorkovskOnboardingDelegate;Lkotlin/jvm/functions/Function1;)V", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/app/android/regulardraw/ui/OutlinedTextView;", "bindTitle", "(Lru/ozon/app/android/regulardraw/databinding/MorkovskTabItemLayoutBinding;Ljava/lang/String;)Lru/ozon/app/android/regulardraw/ui/OutlinedTextView;", "", "shouldAnimate", "Landroidx/appcompat/widget/AppCompatImageView;", "bindImage", "(Lru/ozon/app/android/regulardraw/databinding/MorkovskTabItemLayoutBinding;Z)Landroidx/appcompat/widget/AppCompatImageView;", "bindBackgroundImage", "(Lru/ozon/app/android/regulardraw/databinding/MorkovskTabItemLayoutBinding;)Landroidx/appcompat/widget/AppCompatImageView;", "Lru/ozon/app/android/pikazon/image/ImageSize;", "imageSize", "updateLayoutParamsWithImageSize", "(Landroidx/appcompat/widget/AppCompatImageView;Lru/ozon/app/android/pikazon/image/ImageSize;)V", "Lru/ozon/app/android/regulardraw/widgets/morkovskTabbar/v1/presentation/MorkovskTabbarVO$MorkovskTabItemVO;", "item", "bind", "(Lru/ozon/app/android/regulardraw/widgets/morkovskTabbar/v1/presentation/MorkovskTabbarVO$MorkovskTabItemVO;Z)V", "Lru/ozon/app/android/regulardraw/ui/indicator/IndicatorView;", "shouldAnimateShow", "bindIndicatorOrGone", "(Lru/ozon/app/android/regulardraw/ui/indicator/IndicatorView;Lru/ozon/app/android/regulardraw/widgets/morkovskTabbar/v1/presentation/MorkovskTabbarVO$MorkovskTabItemVO;Z)V", "", "triggerDelayTime", "startTriggerAnimation", "(J)V", "isRefresh", "cancelAnimations", "(Z)V", "Lru/ozon/app/android/regulardraw/databinding/MorkovskTabItemLayoutBinding;", "LWZ/l;", "Lru/ozon/app/android/regulardraw/onboarding/MorkovskOnboardingDelegate;", "Lkotlin/jvm/functions/Function1;", "Lru/ozon/app/android/regulardraw/widgets/morkovskTabbar/v1/presentation/MorkovskTabbarVO$MorkovskTabItemVO;", "Lru/ozon/app/android/regulardraw/widgets/morkovskTabbar/v1/presentation/adapter/IndicatorAnimationController;", "animationController", "Lru/ozon/app/android/regulardraw/widgets/morkovskTabbar/v1/presentation/adapter/IndicatorAnimationController;", "Companion", "regulardraw_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class MorkovskTabItemViewHolder extends RecyclerView.C {
    private IndicatorAnimationController animationController;

    @NotNull
    private final MorkovskTabItemLayoutBinding binding;
    private MorkovskTabbarVO.MorkovskTabItemVO item;

    @NotNull
    private final Function1<AtomAction, Unit> onAction;

    @NotNull
    private final MorkovskOnboardingDelegate onboardingDelegate;

    @NotNull
    private final l tokenizedAnalytics;

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final float dp2 = UiExtKt.toPxF(2);

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/regulardraw/widgets/morkovskTabbar/v1/presentation/adapter/MorkovskTabItemViewHolder$Companion;", "", "<init>", "()V", "dp2", "", "regulardraw_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public MorkovskTabItemViewHolder(@NotNull MorkovskTabItemLayoutBinding binding, @NotNull l tokenizedAnalytics, @NotNull MorkovskOnboardingDelegate onboardingDelegate, @NotNull Function1<? super AtomAction, Unit> onAction) {
        super(binding.getConstraintLayout());
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(tokenizedAnalytics, "tokenizedAnalytics");
        Intrinsics.checkNotNullParameter(onboardingDelegate, "onboardingDelegate");
        Intrinsics.checkNotNullParameter(onAction, "onAction");
        this.binding = binding;
        this.tokenizedAnalytics = tokenizedAnalytics;
        this.onboardingDelegate = onboardingDelegate;
        this.onAction = onAction;
        IndicatorView tabIndicatorView = binding.tabIndicatorView;
        Intrinsics.checkNotNullExpressionValue(tabIndicatorView, "tabIndicatorView");
        this.animationController = new IndicatorAnimationController(tabIndicatorView);
        binding.getConstraintLayout().setOnClickListener(new a(this, 6));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$0(MorkovskTabItemViewHolder morkovskTabItemViewHolder, View view) {
        AtomAction action;
        MorkovskTabbarVO.MorkovskTabItemVO morkovskTabItemVO = morkovskTabItemViewHolder.item;
        if (morkovskTabItemVO == null || (action = morkovskTabItemVO.getAction()) == null) {
            return;
        }
        morkovskTabItemViewHolder.onAction.invoke(action);
    }

    private final AppCompatImageView bindBackgroundImage(MorkovskTabItemLayoutBinding morkovskTabItemLayoutBinding) {
        AppCompatImageView appCompatImageView = morkovskTabItemLayoutBinding.tabBgImageView;
        MorkovskTabbarVO.MorkovskTabItemVO morkovskTabItemVO = this.item;
        if (morkovskTabItemVO != null) {
            ImageSize imageSize = new ImageSize(morkovskTabItemVO.getBlockWidth(), morkovskTabItemVO.getBlockHeight());
            Intrinsics.f(appCompatImageView);
            updateLayoutParamsWithImageSize(appCompatImageView, imageSize);
            ImageViewExtKt.load$default(appCompatImageView, morkovskTabItemVO.getBackgroundImage(), null, null, null, imageSize, false, null, 110, null);
        }
        Intrinsics.checkNotNullExpressionValue(appCompatImageView, "apply(...)");
        return appCompatImageView;
    }

    private final AppCompatImageView bindImage(final MorkovskTabItemLayoutBinding morkovskTabItemLayoutBinding, final boolean z11) {
        AppCompatImageView appCompatImageView = morkovskTabItemLayoutBinding.tabImageView;
        final MorkovskTabbarVO.MorkovskTabItemVO morkovskTabItemVO = this.item;
        if (morkovskTabItemVO != null) {
            ImageSize imageSize = new ImageSize(morkovskTabItemVO.getBlockWidth(), morkovskTabItemVO.getImageHeight());
            Intrinsics.f(appCompatImageView);
            updateLayoutParamsWithImageSize(appCompatImageView, imageSize);
            ImageViewExtKt.load$default(appCompatImageView, morkovskTabItemVO.getImageUrl(), null, new PikazonLoaderCallback<Drawable>() { // from class: ru.ozon.app.android.regulardraw.widgets.morkovskTabbar.v1.presentation.adapter.MorkovskTabItemViewHolder$bindImage$1$1$1
                @Override // ru.ozon.app.android.pikazon.callback.PikazonLoaderCallback
                public void onLoadFailed(Exception exc) {
                    PikazonLoaderCallback.DefaultImpls.onLoadFailed(this, exc);
                }

                @Override // ru.ozon.app.android.pikazon.callback.PikazonLoaderCallback
                public void onLoadSuccessful(Drawable resource) {
                    MorkovskOnboardingDelegate morkovskOnboardingDelegate;
                    MorkovskTabItemLayoutBinding morkovskTabItemLayoutBinding2;
                    MorkovskTabItemLayoutBinding morkovskTabItemLayoutBinding3;
                    MorkovskTabItemViewHolder morkovskTabItemViewHolder = MorkovskTabItemViewHolder.this;
                    IndicatorView tabIndicatorView = morkovskTabItemLayoutBinding.tabIndicatorView;
                    Intrinsics.checkNotNullExpressionValue(tabIndicatorView, "tabIndicatorView");
                    morkovskTabItemViewHolder.bindIndicatorOrGone(tabIndicatorView, morkovskTabItemVO, z11);
                    morkovskOnboardingDelegate = MorkovskTabItemViewHolder.this.onboardingDelegate;
                    MorkovskOnboardingDelegate.MorkovskOnboarding provideMorokvskOnboarding = morkovskOnboardingDelegate.provideMorokvskOnboarding();
                    MorkovskTabItemViewHolder morkovskTabItemViewHolder2 = MorkovskTabItemViewHolder.this;
                    int adapterPosition = morkovskTabItemViewHolder2.getAdapterPosition();
                    if (adapterPosition == 0) {
                        OnboardingModel.Companion companion = OnboardingModel.INSTANCE;
                        morkovskTabItemLayoutBinding2 = morkovskTabItemViewHolder2.binding;
                        ConstraintLayout tabCL = morkovskTabItemLayoutBinding2.tabCL;
                        Intrinsics.checkNotNullExpressionValue(tabCL, "tabCL");
                        provideMorokvskOnboarding.putOnboardingModel(new OnboardingModel.FourthNavbarTooltipModel.FirstNavbarItemModel(companion.createGetViewReferenceCallback(tabCL), new MorkovskTabItemViewHolder$bindImage$1$1$1$onLoadSuccessful$1$1(morkovskTabItemViewHolder2)));
                        return;
                    }
                    if (adapterPosition != 1) {
                        return;
                    }
                    OnboardingModel.Companion companion2 = OnboardingModel.INSTANCE;
                    morkovskTabItemLayoutBinding3 = morkovskTabItemViewHolder2.binding;
                    ConstraintLayout tabCL2 = morkovskTabItemLayoutBinding3.tabCL;
                    Intrinsics.checkNotNullExpressionValue(tabCL2, "tabCL");
                    provideMorokvskOnboarding.putOnboardingModel(new OnboardingModel.FourthNavbarTooltipModel.SecondNavbarItemModel(companion2.createGetViewReferenceCallback(tabCL2), new MorkovskTabItemViewHolder$bindImage$1$1$1$onLoadSuccessful$1$2(morkovskTabItemViewHolder2)));
                }
            }, null, imageSize, false, null, 106, null);
        }
        Intrinsics.checkNotNullExpressionValue(appCompatImageView, "apply(...)");
        return appCompatImageView;
    }

    private final OutlinedTextView bindTitle(MorkovskTabItemLayoutBinding morkovskTabItemLayoutBinding, String str) {
        OutlinedTextView outlinedTextView = morkovskTabItemLayoutBinding.tabTitleTv;
        outlinedTextView.setText(str);
        int i11 = R$color.tabbar_text_light_yellow;
        Context context = outlinedTextView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        int parseColor = UtilKt.parseColor(i11, context);
        int i12 = R$color.tabbar_very_dark_blue_stroke;
        Context context2 = outlinedTextView.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        outlinedTextView.setTextConfig(parseColor, UtilKt.parseColor(i12, context2), dp2);
        Intrinsics.checkNotNullExpressionValue(outlinedTextView, "apply(...)");
        return outlinedTextView;
    }

    private final void updateLayoutParamsWithImageSize(AppCompatImageView appCompatImageView, ImageSize imageSize) {
        ViewGroup.LayoutParams layoutParams = appCompatImageView.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        }
        ConstraintLayout.b bVar = (ConstraintLayout.b) layoutParams;
        ((ViewGroup.MarginLayoutParams) bVar).width = imageSize.getWidth();
        ((ViewGroup.MarginLayoutParams) bVar).height = imageSize.getHeight();
        appCompatImageView.setLayoutParams(bVar);
    }

    public final void bind(@NotNull MorkovskTabbarVO.MorkovskTabItemVO item, boolean shouldAnimate) {
        Intrinsics.checkNotNullParameter(item, "item");
        this.item = item;
        MorkovskTabItemLayoutBinding morkovskTabItemLayoutBinding = this.binding;
        bindTitle(morkovskTabItemLayoutBinding, item.getTitle());
        bindImage(morkovskTabItemLayoutBinding, shouldAnimate);
        bindBackgroundImage(morkovskTabItemLayoutBinding);
        t tokenizedEvent = item.getTokenizedEvent();
        if (tokenizedEvent != null) {
            m.c(this.tokenizedAnalytics, tokenizedEvent, null);
        }
    }

    public final void bindIndicatorOrGone(@NotNull IndicatorView indicatorView, @NotNull MorkovskTabbarVO.MorkovskTabItemVO item, boolean z11) {
        Intrinsics.checkNotNullParameter(indicatorView, "<this>");
        Intrinsics.checkNotNullParameter(item, "item");
        IndicatorAtomDTO indicator = item.getIndicator();
        Long animationTime = item.getAnimationTime();
        if (indicator == null) {
            ViewExtKt.gone(indicatorView);
            return;
        }
        if (animationTime != null && z11) {
            IndicatorAnimationController indicatorAnimationController = this.animationController;
            if (indicatorAnimationController != null) {
                indicatorAnimationController.bindAnimatedIndicator(item);
                return;
            }
            return;
        }
        if (animationTime == null || z11) {
            indicatorView.bind(indicator);
        } else {
            indicatorView.bind(indicator);
            startTriggerAnimation(animationTime.longValue());
        }
    }

    public final void cancelAnimations(boolean isRefresh) {
        IndicatorAnimationController indicatorAnimationController;
        IndicatorAnimationController indicatorAnimationController2 = this.animationController;
        if (indicatorAnimationController2 != null) {
            indicatorAnimationController2.cancelAnimations();
        }
        if (!isRefresh) {
            this.animationController = null;
            return;
        }
        MorkovskTabbarVO.MorkovskTabItemVO morkovskTabItemVO = this.item;
        if (morkovskTabItemVO == null || (indicatorAnimationController = this.animationController) == null) {
            return;
        }
        indicatorAnimationController.bindAnimatedIndicator(morkovskTabItemVO);
    }

    public final void startTriggerAnimation(long triggerDelayTime) {
        IndicatorAnimationController indicatorAnimationController = this.animationController;
        if (indicatorAnimationController != null) {
            indicatorAnimationController.startTriggerAnimation(triggerDelayTime);
        }
    }
}
