package ru.ozon.app.android.pdp.widgets.galleryV5.presentation.buttons;

import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pdp.utils.DPS;
import ru.ozon.app.android.pdp.widgets.galleryV5.presentation.GalleryV5Resources;
import ru.ozon.app.android.pdp.widgets.galleryV5.presentation.GalleryV5VO;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import ru.ozon.uni.atoms.data.text.TextDTO;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;

@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002B\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0014¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\u000b2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\r\u0010\u0016\u001a\u00020\u000b¢\u0006\u0004\b\u0016\u0010\rJ\r\u0010\u0017\u001a\u00020\u000b¢\u0006\u0004\b\u0017\u0010\rR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0018R*\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u00198\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u0014\u0010!\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0018\u0010$\u001a\u0004\u0018\u00010#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010%R\u0016\u0010&\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010\u0018R\u0018\u0010(\u001a\u0004\u0018\u00010'8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010)R\u0018\u0010*\u001a\u0004\u0018\u00010'8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010)R\u0018\u0010+\u001a\u0004\u0018\u00010\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010,¨\u0006-"}, d2 = {"Lru/ozon/app/android/pdp/widgets/galleryV5/presentation/buttons/GalleryV5OnBoardingButtonView;", "Landroid/widget/LinearLayout;", "Lru/ozon/app/android/pdp/utils/DPS;", "Landroid/content/Context;", "context", "Lru/ozon/app/android/pdp/widgets/galleryV5/presentation/GalleryV5Resources;", "galleryResources", "", "isSingleText", "<init>", "(Landroid/content/Context;Lru/ozon/app/android/pdp/widgets/galleryV5/presentation/GalleryV5Resources;Z)V", "", "onAttachedToWindow", "()V", "Lru/ozon/app/android/pdp/widgets/galleryV5/presentation/GalleryV5VO$Button;", "item", "bind", "(Lru/ozon/app/android/pdp/widgets/galleryV5/presentation/GalleryV5VO$Button;)V", "", "textWidth", "showOnBoarding", "(Ljava/lang/Integer;)V", "hideOnBoarding", "stopOnBoarding", "Z", "Lkotlin/Function0;", "onAttach", "Lkotlin/jvm/functions/Function0;", "getOnAttach", "()Lkotlin/jvm/functions/Function0;", "setOnAttach", "(Lkotlin/jvm/functions/Function0;)V", "Lru/ozon/uni/android/atom/text/TextAtomV2View;", "onBoardingTextView", "Lru/ozon/uni/android/atom/text/TextAtomV2View;", "Lru/ozon/app/android/pdp/widgets/galleryV5/presentation/buttons/GalleryV5ImageButtonView;", "iconView", "Lru/ozon/app/android/pdp/widgets/galleryV5/presentation/buttons/GalleryV5ImageButtonView;", "isOnBoardingActive", "Landroid/animation/ValueAnimator;", "showAnimation", "Landroid/animation/ValueAnimator;", "hideAnimation", "lastData", "Lru/ozon/app/android/pdp/widgets/galleryV5/presentation/GalleryV5VO$Button;", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SuppressLint({"ViewConstructor"})
/* loaded from: classes13.dex */
public final class GalleryV5OnBoardingButtonView extends LinearLayout implements DPS {
    private ValueAnimator hideAnimation;
    private GalleryV5ImageButtonView iconView;
    private boolean isOnBoardingActive;
    private final boolean isSingleText;
    private GalleryV5VO.Button lastData;
    private Function0<Unit> onAttach;

    @NotNull
    private final TextAtomV2View onBoardingTextView;
    private ValueAnimator showAnimation;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GalleryV5OnBoardingButtonView(@NotNull Context context, @NotNull GalleryV5Resources galleryResources, boolean z11) {
        super(context, null, 0);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(galleryResources, "galleryResources");
        this.isSingleText = z11;
        setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        setBackground(galleryResources.getBgOnboardingButtons());
        if (z11) {
            setPadding(getDp8(), getDp6(), getDp8(), getDp6());
        } else {
            setPadding(getDp6(), getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
        TextAtomV2View textAtomV2View = new TextAtomV2View(context, null, 0, 6, null);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        textAtomV2View.setVisibility(8);
        if (!z11) {
            layoutParams.setMargins(((ViewGroup.MarginLayoutParams) layoutParams).leftMargin, ((ViewGroup.MarginLayoutParams) layoutParams).topMargin, getDp4(), ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin);
        }
        textAtomV2View.setLayoutParams(layoutParams);
        this.onBoardingTextView = textAtomV2View;
        addViewInLayout(textAtomV2View, 0, textAtomV2View.getLayoutParams());
        if (!z11) {
            GalleryV5ImageButtonView galleryV5ImageButtonView = new GalleryV5ImageButtonView(context, true);
            addViewInLayout(galleryV5ImageButtonView, 1, galleryV5ImageButtonView.getLayoutParams());
            this.iconView = galleryV5ImageButtonView;
        }
        requestLayout();
    }

    public final void bind(@NotNull GalleryV5VO.Button item) {
        TextDTO text;
        Intrinsics.checkNotNullParameter(item, "item");
        this.lastData = item;
        GalleryV5ImageButtonView galleryV5ImageButtonView = this.iconView;
        if (galleryV5ImageButtonView != null) {
            galleryV5ImageButtonView.bind(item.getIcon());
        }
        GalleryV5VO.Button.OnBoarding onBoarding = item.getOnBoarding();
        if (onBoarding == null || (text = onBoarding.getText()) == null) {
            new GalleryV5OnBoardingButtonView$bind$2(this);
            return;
        }
        if (item.getOnBoarding().getNotHidableOnboarding()) {
            ViewExtKt.show(this.onBoardingTextView);
            if (!this.isSingleText) {
                setPadding(getDp10(), getPaddingTop(), getPaddingRight(), getPaddingBottom());
            }
        }
        TextHolderKt.bind$default(this.onBoardingTextView, text, null, 2, null);
        this.onBoardingTextView.setTextIsSelectable(false);
        Unit unit = Unit.f71690a;
    }

    public int getDp10() {
        return DPS.DefaultImpls.getDp10(this);
    }

    public int getDp4() {
        return DPS.DefaultImpls.getDp4(this);
    }

    public int getDp6() {
        return DPS.DefaultImpls.getDp6(this);
    }

    public int getDp8() {
        return DPS.DefaultImpls.getDp8(this);
    }

    public final void hideOnBoarding() {
        setPadding(getDp6(), getPaddingTop(), getPaddingRight(), getPaddingBottom());
        this.hideAnimation = ru.ozon.app.android.pdp.view.ViewExtKt.animateWidthAndFade$default(this.onBoardingTextView, 0, 0L, new GalleryV5OnBoardingButtonView$hideOnBoarding$1(this), 3, null);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        Function0<Unit> function0 = this.onAttach;
        if (function0 != null) {
            function0.invoke();
        }
        super.onAttachedToWindow();
    }

    public final void setOnAttach(Function0<Unit> function0) {
        this.onAttach = function0;
    }

    public final void showOnBoarding(Integer textWidth) {
        this.isOnBoardingActive = true;
        setPadding(getDp10(), getPaddingTop(), getPaddingRight(), getPaddingBottom());
        ViewExtKt.show(this.onBoardingTextView);
        if (textWidth != null) {
            this.showAnimation = ru.ozon.app.android.pdp.view.ViewExtKt.animateWidthAndFade$default(this.onBoardingTextView, textWidth.intValue(), 0L, new GalleryV5OnBoardingButtonView$showOnBoarding$1$1(this), 2, null);
        }
    }

    public final void stopOnBoarding() {
        if (this.isOnBoardingActive) {
            setPadding(getDp6(), getPaddingTop(), getPaddingRight(), getPaddingBottom());
            ValueAnimator valueAnimator = this.showAnimation;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            ValueAnimator valueAnimator2 = this.hideAnimation;
            if (valueAnimator2 != null) {
                valueAnimator2.cancel();
            }
            TextAtomV2View textAtomV2View = this.onBoardingTextView;
            ViewGroup.LayoutParams layoutParams = textAtomV2View.getLayoutParams();
            int i11 = layoutParams.height;
            int i12 = layoutParams.width;
            layoutParams.width = 0;
            if (i12 != 0) {
                textAtomV2View.setLayoutParams(layoutParams);
            }
            ViewExtKt.gone(this.onBoardingTextView);
        }
    }
}
