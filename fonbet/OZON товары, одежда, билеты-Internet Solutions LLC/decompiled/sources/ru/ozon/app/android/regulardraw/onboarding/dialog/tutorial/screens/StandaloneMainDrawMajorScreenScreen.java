package ru.ozon.app.android.regulardraw.onboarding.dialog.tutorial.screens;

import Sc.InterfaceC4008j;
import WZ.l;
import WZ.m;
import WZ.t;
import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pikazon.extensions.ImageViewExtKt;
import ru.ozon.app.android.regulardraw.R$color;
import ru.ozon.app.android.regulardraw.R$drawable;
import ru.ozon.app.android.regulardraw.R$style;
import ru.ozon.app.android.regulardraw.onboarding.dialog.tutorial.data.TutorialScreenModel;
import ru.ozon.app.android.regulardraw.onboarding.dialog.tutorial.screens.StandaloneMainDrawMajorScreenScreen;
import ru.ozon.app.android.regulardraw.onboarding.dialog.tutorial.utils.AnimationsKt;
import ru.ozon.app.android.regulardraw.ui.OutlinedTextView;
import ru.ozon.app.android.regulardraw.ui.button.MorkovskShadowButton;
import ru.ozon.app.android.regulardraw.ui.tooltip.ToolTipConfig;
import ru.ozon.app.android.regulardraw.ui.tooltip.TooltipView;
import ru.ozon.app.android.regulardraw.utils.Dimens;
import ru.ozon.app.android.utils.LazyUtilsKt;
import ru.ozon.uni.android.uikitsdk.ext.TextViewExtKt;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004JI\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\b2 \u0010\u000e\u001a\u001c\u0012\u0004\u0012\u00020\u000b\u0012\f\u0012\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f\u0012\u0004\u0012\u00020\r0\nH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001b\u0010\u0016\u001a\u00020\u00118BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/regulardraw/onboarding/dialog/tutorial/screens/StandaloneMainDrawMajorScreenScreen;", "Lru/ozon/app/android/regulardraw/onboarding/dialog/tutorial/screens/BaseTutorialScreen;", "Lru/ozon/app/android/regulardraw/onboarding/dialog/tutorial/data/TutorialScreenModel$MainDrawMajorScreenTutorialScreenModel;", "<init>", "()V", "Landroid/widget/FrameLayout;", "rootView", "tutorialScreenModel", "LWZ/l;", "tokenizedAnalytics", "Lkotlin/Function2;", "", "Lkotlin/Function0;", "", "onNext", "show", "(Landroid/widget/FrameLayout;Lru/ozon/app/android/regulardraw/onboarding/dialog/tutorial/data/TutorialScreenModel$MainDrawMajorScreenTutorialScreenModel;LWZ/l;Lkotlin/jvm/functions/Function2;)V", "", "howToGetPrizeTopMargin$delegate", "LSc/j;", "getHowToGetPrizeTopMargin", "()I", "howToGetPrizeTopMargin", "regulardraw_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class StandaloneMainDrawMajorScreenScreen extends BaseTutorialScreen<TutorialScreenModel.MainDrawMajorScreenTutorialScreenModel> {

    /* renamed from: howToGetPrizeTopMargin$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j howToGetPrizeTopMargin = LazyUtilsKt.unsafeLazy(StandaloneMainDrawMajorScreenScreen$howToGetPrizeTopMargin$2.INSTANCE);

    private final int getHowToGetPrizeTopMargin() {
        return ((Number) this.howToGetPrizeTopMargin.getValue()).intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void show$lambda$8(TooltipView tooltipView, MorkovskShadowButton morkovskShadowButton, ConstraintLayout constraintLayout, OutlinedTextView outlinedTextView, ImageView imageView, View view, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18) {
        int bottom = tooltipView.getBottom();
        Dimens dimens = Dimens.INSTANCE;
        if (dimens.getDP_20() + bottom > morkovskShadowButton.getTop()) {
            androidx.constraintlayout.widget.d b11 = Cm.e.b(constraintLayout);
            b11.o(outlinedTextView.getId(), 3);
            b11.o(imageView.getId(), 3);
            b11.o(tooltipView.getId(), 3);
            b11.t(tooltipView.getId(), 4, morkovskShadowButton.getId(), 3, dimens.getDP_20());
            b11.t(imageView.getId(), 4, tooltipView.getId(), 3, -dimens.getDP_38());
            b11.s(outlinedTextView.getId(), 4, imageView.getId(), 3);
            b11.f(constraintLayout);
        }
    }

    public void show(@NotNull FrameLayout rootView, @NotNull TutorialScreenModel.MainDrawMajorScreenTutorialScreenModel tutorialScreenModel, @NotNull l tokenizedAnalytics, @NotNull Function2<? super Boolean, ? super Function0<Unit>, Unit> onNext) {
        Intrinsics.checkNotNullParameter(rootView, "rootView");
        Intrinsics.checkNotNullParameter(tutorialScreenModel, "tutorialScreenModel");
        Intrinsics.checkNotNullParameter(tokenizedAnalytics, "tokenizedAnalytics");
        Intrinsics.checkNotNullParameter(onNext, "onNext");
        final ConstraintLayout constraintLayout = new ConstraintLayout(rootView.getContext());
        constraintLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        constraintLayout.setClipChildren(false);
        Context context = rootView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        final OutlinedTextView outlinedTextView = new OutlinedTextView(context, null, 0, 6, null);
        outlinedTextView.setId(View.generateViewId());
        outlinedTextView.setLayoutParams(new ConstraintLayout.b(0, -2));
        Context context2 = outlinedTextView.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        TextViewExtKt.applyStyle(outlinedTextView, context2, R$style.Text_Bold);
        outlinedTextView.setTextColor(androidx.core.content.a.getColor(outlinedTextView.getContext(), R$color.outline_text_content_color));
        outlinedTextView.setTextConfig(androidx.core.content.a.getColor(outlinedTextView.getContext(), R$color.outline_text_content_color), androidx.core.content.a.getColor(outlinedTextView.getContext(), R$color.outline_text_border_color), UiExtKt.toPxF(1.3f));
        outlinedTextView.setTextSize(2, 24.0f);
        outlinedTextView.setLineSpacing(0.0f, 1.02f);
        outlinedTextView.setLetterSpacing(0.0f);
        outlinedTextView.setTextAlignment(4);
        outlinedTextView.setText(tutorialScreenModel.getMainDrawMajorScreenModel().getPrizeText());
        final ImageView imageView = new ImageView(rootView.getContext());
        imageView.setId(View.generateViewId());
        ImageViewExtKt.load$default(imageView, tutorialScreenModel.getMainDrawMajorScreenModel().getPrizeImage(), null, null, null, null, false, null, 126, null);
        imageView.setLayoutParams(new ConstraintLayout.b(0, -2));
        imageView.setAdjustViewBounds(true);
        Context context3 = rootView.getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
        final MorkovskShadowButton morkovskShadowButton = new MorkovskShadowButton(context3, null, 0, 6, null);
        morkovskShadowButton.setId(View.generateViewId());
        morkovskShadowButton.setLayoutParams(new ConstraintLayout.b(0, -2));
        morkovskShadowButton.bind(tutorialScreenModel.getMainDrawMajorScreenModel().getFinishButton(), StandaloneMainDrawMajorScreenScreen$show$confirmButtonView$1$1.INSTANCE);
        Context context4 = rootView.getContext();
        Intrinsics.checkNotNullExpressionValue(context4, "getContext(...)");
        final TooltipView tooltipView = new TooltipView(context4, 0.7f, false, true);
        String tooltipImage = tutorialScreenModel.getMainDrawMajorScreenModel().getTooltipImage();
        tooltipView.bind(new ToolTipConfig.BottomViewOnboarding(tutorialScreenModel.getMainDrawMajorScreenModel().getTooltipText(), tooltipImage, tutorialScreenModel.getMainDrawMajorScreenModel().getCarrotsExchangeRate(), tutorialScreenModel.getMainDrawMajorScreenModel().getTicketsExchangeRate(), R$drawable.img_equals));
        constraintLayout.addView(outlinedTextView);
        constraintLayout.addView(imageView);
        constraintLayout.addView(tooltipView);
        constraintLayout.addView(morkovskShadowButton);
        androidx.constraintlayout.widget.d dVar = new androidx.constraintlayout.widget.d();
        dVar.p(constraintLayout);
        dVar.t(outlinedTextView.getId(), 3, 0, 3, getHowToGetPrizeTopMargin());
        dVar.s(outlinedTextView.getId(), 6, 0, 6);
        dVar.s(outlinedTextView.getId(), 7, 0, 7);
        dVar.s(imageView.getId(), 3, outlinedTextView.getId(), 4);
        int id2 = imageView.getId();
        Dimens dimens = Dimens.INSTANCE;
        dVar.t(id2, 6, 0, 6, dimens.getDP_41());
        dVar.t(imageView.getId(), 7, 0, 7, dimens.getDP_41());
        dVar.t(tooltipView.getId(), 3, imageView.getId(), 4, -dimens.getDP_38());
        dVar.t(morkovskShadowButton.getId(), 4, 0, 4, dimens.getDP_16());
        dVar.t(morkovskShadowButton.getId(), 6, 0, 6, dimens.getDP_12());
        dVar.t(morkovskShadowButton.getId(), 7, 0, 7, dimens.getDP_12());
        dVar.f(constraintLayout);
        constraintLayout.setAlpha(0.0f);
        rootView.addView(constraintLayout);
        AnimationsKt.fadeInWithCallback$default(constraintLayout, 0L, new StandaloneMainDrawMajorScreenScreen$show$1(morkovskShadowButton, this, tutorialScreenModel, constraintLayout, rootView, onNext), 1, null);
        t prizeScreenViewEvent = tutorialScreenModel.getMainDrawMajorScreenModel().getPrizeScreenViewEvent();
        if (prizeScreenViewEvent != null) {
            m.c(tokenizedAnalytics, prizeScreenViewEvent, null);
        }
        constraintLayout.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: RF.e
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18) {
                StandaloneMainDrawMajorScreenScreen.show$lambda$8(TooltipView.this, morkovskShadowButton, constraintLayout, outlinedTextView, imageView, view, i11, i12, i13, i14, i15, i16, i17, i18);
            }
        });
        fitsSystemWindow(constraintLayout);
    }
}
