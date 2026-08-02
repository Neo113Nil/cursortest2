package ru.ozon.app.android.regulardraw.onboarding.dialog.tutorial.screens;

import Sc.InterfaceC4008j;
import Sc.o;
import WZ.l;
import WZ.t;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.analytics.modules.tokenized.TokenizedAnalyticsExtensionsKt;
import ru.ozon.app.android.pdp.utils.Dimens;
import ru.ozon.app.android.pikazon.extensions.ImageViewExtKt;
import ru.ozon.app.android.pikazon.glide.loadPriority.LoadPriority;
import ru.ozon.app.android.regulardraw.R$color;
import ru.ozon.app.android.regulardraw.R$id;
import ru.ozon.app.android.regulardraw.onboarding.dialog.tutorial.data.TutorialScreenModel;
import ru.ozon.app.android.regulardraw.onboarding.dialog.tutorial.screens.LotteryOnboardingScreen;
import ru.ozon.app.android.regulardraw.onboarding.dialog.tutorial.utils.AnimationsKt;
import ru.ozon.app.android.regulardraw.onboarding.dialog.tutorial.utils.TapToContinueTextView;
import ru.ozon.app.android.regulardraw.ui.button.MorkovskShadowButton;
import ru.ozon.app.android.regulardraw.ui.button.MorkovskShadowButtonDTO;
import ru.ozon.app.android.regulardraw.utils.UtilKt;
import ru.ozon.app.android.regulardraw.widgets.navbar.ShadowImageButton;
import ru.ozon.app.android.regulardraw.widgets.onboardingInfo.v2.presentation.LotteryOnboardingInfoVI;
import ru.ozon.app.android.utils.LazyUtilsKt;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.android.uikitsdk.ext.ConstraintLayoutExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;

@Metadata(d1 = {"\u0000\u0096\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\b\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ!\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J%\u0010\u0019\u001a\u00020\u0018*\u00020\u00072\u0006\u0010\u0016\u001a\u00020\f2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0010H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0019\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ'\u0010\"\u001a\u00020\u00182\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010 \u001a\u00020\u00072\u0006\u0010!\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\"\u0010#Ji\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00180(2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010 \u001a\u00020\u00072\u0006\u0010!\u001a\u00020\u00132\b\u0010\u0017\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010%\u001a\u00020$2 \u0010)\u001a\u001c\u0012\u0004\u0012\u00020'\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010(\u0012\u0004\u0012\u00020\u00180&H\u0002¢\u0006\u0004\b*\u0010+JY\u0010,\u001a\u00020\u00182\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010 \u001a\u00020\u00072\u0006\u0010!\u001a\u00020\u00132\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010%\u001a\u00020$2 \u0010)\u001a\u001c\u0012\u0004\u0012\u00020'\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010(\u0012\u0004\u0012\u00020\u00180&H\u0002¢\u0006\u0004\b,\u0010-Ji\u00100\u001a\u00020\u00182\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010 \u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020.2\u0006\u0010!\u001a\u00020\u00132\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020/2\u0006\u0010%\u001a\u00020$2 \u0010)\u001a\u001c\u0012\u0004\u0012\u00020'\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010(\u0012\u0004\u0012\u00020\u00180&H\u0002¢\u0006\u0004\b0\u00101Ji\u00106\u001a\u00020\u00182\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010 \u001a\u00020\u00072\u0006\u0010!\u001a\u00020\u00132\u0006\u00102\u001a\u00020'2\u000e\u00105\u001a\n\u0018\u000103j\u0004\u0018\u0001`42\u0006\u0010%\u001a\u00020$2 \u0010)\u001a\u001c\u0012\u0004\u0012\u00020'\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010(\u0012\u0004\u0012\u00020\u00180&H\u0002¢\u0006\u0004\b6\u00107J\u001b\u0010;\u001a\u0004\u0018\u00010:2\b\u00109\u001a\u0004\u0018\u000108H\u0002¢\u0006\u0004\b;\u0010<J5\u0010@\u001a\u00020\u00182\u0006\u0010 \u001a\u00020\u00072\u0006\u0010=\u001a\u00020\u00102\u0006\u0010>\u001a\u00020'2\f\u0010?\u001a\b\u0012\u0004\u0012\u00020\u00180(H\u0002¢\u0006\u0004\b@\u0010AJ)\u0010B\u001a\u00020\u00182\u0006\u0010 \u001a\u00020\u00072\u0006\u0010\u0016\u001a\u00020\f2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0010H\u0002¢\u0006\u0004\bB\u0010\u001aJ'\u0010C\u001a\u00020\u00182\u000e\u00105\u001a\n\u0018\u000103j\u0004\u0018\u0001`42\u0006\u0010%\u001a\u00020$H\u0002¢\u0006\u0004\bC\u0010DJI\u0010F\u001a\u00020\u00182\u0006\u0010\u0006\u001a\u00020E2\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010%\u001a\u00020$2 \u0010)\u001a\u001c\u0012\u0004\u0012\u00020'\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010(\u0012\u0004\u0012\u00020\u00180&H\u0016¢\u0006\u0004\bF\u0010GR\u001b\u0010L\u001a\u00020\u001d8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bH\u0010I\u001a\u0004\bJ\u0010K¨\u0006M"}, d2 = {"Lru/ozon/app/android/regulardraw/onboarding/dialog/tutorial/screens/LotteryOnboardingScreen;", "Lru/ozon/app/android/regulardraw/onboarding/dialog/tutorial/screens/BaseTutorialScreen;", "Lru/ozon/app/android/regulardraw/onboarding/dialog/tutorial/data/TutorialScreenModel$LotteryOnboardingTutorialScreenModel;", "<init>", "()V", "Landroid/view/ViewGroup;", "rootView", "Landroidx/constraintlayout/widget/ConstraintLayout;", "createConstraintLayout", "(Landroid/view/ViewGroup;)Landroidx/constraintlayout/widget/ConstraintLayout;", "", "imageUrl", "Landroid/widget/ImageView;", "createAndLoadImage", "(Landroid/view/ViewGroup;Ljava/lang/String;)Landroid/widget/ImageView;", "tutorialScreenModel", "Landroid/view/View;", "createFooterView", "(Landroid/view/ViewGroup;Lru/ozon/app/android/regulardraw/onboarding/dialog/tutorial/data/TutorialScreenModel$LotteryOnboardingTutorialScreenModel;)Landroid/view/View;", "Lru/ozon/app/android/regulardraw/widgets/navbar/ShadowImageButton;", "getOrCreateCloseScreenButton", "(Landroid/view/ViewGroup;)Lru/ozon/app/android/regulardraw/widgets/navbar/ShadowImageButton;", "imageView", "footerView", "", "addImageAndFooter", "(Landroidx/constraintlayout/widget/ConstraintLayout;Landroid/widget/ImageView;Landroid/view/View;)V", "Lru/ozon/app/android/regulardraw/widgets/onboardingInfo/v2/presentation/LotteryOnboardingInfoVI$OnboardingStep$FooterContent;", "footerContent", "", "getFooterContentHorizontalMargin", "(Lru/ozon/app/android/regulardraw/widgets/onboardingInfo/v2/presentation/LotteryOnboardingInfoVI$OnboardingStep$FooterContent;)I", "constraintLayout", "overlayCloseScreenButton", "addViewsToRootAndConfigure", "(Landroid/view/ViewGroup;Landroidx/constraintlayout/widget/ConstraintLayout;Landroid/view/View;)V", "LWZ/l;", "tokenizedAnalytics", "Lkotlin/Function2;", "", "Lkotlin/Function0;", "onNext", "getOnEndAction", "(Landroid/view/ViewGroup;Landroidx/constraintlayout/widget/ConstraintLayout;Lru/ozon/app/android/regulardraw/widgets/navbar/ShadowImageButton;Landroid/view/View;Lru/ozon/app/android/regulardraw/onboarding/dialog/tutorial/data/TutorialScreenModel$LotteryOnboardingTutorialScreenModel;LWZ/l;Lkotlin/jvm/functions/Function2;)Lkotlin/jvm/functions/Function0;", "configureOverlayCloseButtonClick", "(Landroid/view/ViewGroup;Landroidx/constraintlayout/widget/ConstraintLayout;Lru/ozon/app/android/regulardraw/widgets/navbar/ShadowImageButton;Lru/ozon/app/android/regulardraw/onboarding/dialog/tutorial/data/TutorialScreenModel$LotteryOnboardingTutorialScreenModel;LWZ/l;Lkotlin/jvm/functions/Function2;)V", "Lru/ozon/app/android/regulardraw/ui/button/MorkovskShadowButton;", "Lru/ozon/app/android/regulardraw/widgets/onboardingInfo/v2/presentation/LotteryOnboardingInfoVI$OnboardingStep$FooterContent$FinishButton;", "configureFooterButtonClick", "(Landroid/view/ViewGroup;Landroidx/constraintlayout/widget/ConstraintLayout;Lru/ozon/app/android/regulardraw/ui/button/MorkovskShadowButton;Lru/ozon/app/android/regulardraw/widgets/navbar/ShadowImageButton;Lru/ozon/app/android/regulardraw/onboarding/dialog/tutorial/data/TutorialScreenModel$LotteryOnboardingTutorialScreenModel;Lru/ozon/app/android/regulardraw/widgets/onboardingInfo/v2/presentation/LotteryOnboardingInfoVI$OnboardingStep$FooterContent$FinishButton;LWZ/l;Lkotlin/jvm/functions/Function2;)V", "isLastScreen", "LWZ/t;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedEvent;", "tokenizedEvent", "configureMainScreenClick", "(Landroid/view/ViewGroup;Landroidx/constraintlayout/widget/ConstraintLayout;Lru/ozon/app/android/regulardraw/widgets/navbar/ShadowImageButton;ZLWZ/t;LWZ/l;Lkotlin/jvm/functions/Function2;)V", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "actionDTO", "Lru/ozon/uni/atoms/af/AtomAction;", "getNoDismissAtomAction", "(Lru/ozon/uni/atoms/data/AtomActionDTO;)Lru/ozon/uni/atoms/af/AtomAction;", "overlayButton", "isFirstScreen", "onEndAction", "showScreenContentWithAnimation", "(Landroidx/constraintlayout/widget/ConstraintLayout;Landroid/view/View;ZLkotlin/jvm/functions/Function0;)V", "updateImageHeightOnLayoutChange", "trackScreenView", "(LWZ/t;LWZ/l;)V", "Landroid/widget/FrameLayout;", "show", "(Landroid/widget/FrameLayout;Lru/ozon/app/android/regulardraw/onboarding/dialog/tutorial/data/TutorialScreenModel$LotteryOnboardingTutorialScreenModel;LWZ/l;Lkotlin/jvm/functions/Function2;)V", "closeButtonSize$delegate", "LSc/j;", "getCloseButtonSize", "()I", "closeButtonSize", "regulardraw_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class LotteryOnboardingScreen extends BaseTutorialScreen<TutorialScreenModel.LotteryOnboardingTutorialScreenModel> {

    /* renamed from: closeButtonSize$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j closeButtonSize = LazyUtilsKt.unsafeLazy(LotteryOnboardingScreen$closeButtonSize$2.INSTANCE);

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[AtomActionDTO.Behavior.values().length];
            try {
                iArr[AtomActionDTO.Behavior.DISMISS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AtomActionDTO.Behavior.DISMISS_AND_SCROLL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[AtomActionDTO.Behavior.DISMISS_REDIRECT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[AtomActionDTO.Behavior.DISMISS_REFRESH.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private final void addImageAndFooter(ConstraintLayout constraintLayout, ImageView imageView, View view) {
        constraintLayout.addView(imageView);
        if (view != null) {
            constraintLayout.addView(view);
        }
    }

    private final void addViewsToRootAndConfigure(ViewGroup rootView, ConstraintLayout constraintLayout, View overlayCloseScreenButton) {
        constraintLayout.setAlpha(0.0f);
        rootView.addView(constraintLayout);
        overlayCloseScreenButton.bringToFront();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void configureFooterButtonClick(final ViewGroup rootView, final ConstraintLayout constraintLayout, MorkovskShadowButton footerView, final ShadowImageButton overlayCloseScreenButton, final TutorialScreenModel.LotteryOnboardingTutorialScreenModel tutorialScreenModel, final LotteryOnboardingInfoVI.OnboardingStep.FooterContent.FinishButton footerContent, final l tokenizedAnalytics, final Function2<? super Boolean, ? super Function0<Unit>, Unit> onNext) {
        footerView.setOnClickListener(new View.OnClickListener() { // from class: RF.b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LotteryOnboardingScreen.configureFooterButtonClick$lambda$8(this, overlayCloseScreenButton, rootView, constraintLayout, onNext, footerContent, tutorialScreenModel, tokenizedAnalytics, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void configureFooterButtonClick$lambda$8(LotteryOnboardingScreen lotteryOnboardingScreen, ShadowImageButton shadowImageButton, ViewGroup viewGroup, ConstraintLayout constraintLayout, Function2 function2, LotteryOnboardingInfoVI.OnboardingStep.FooterContent.FinishButton finishButton, TutorialScreenModel.LotteryOnboardingTutorialScreenModel lotteryOnboardingTutorialScreenModel, l lVar, View view) {
        lotteryOnboardingScreen.doOnClick(new LotteryOnboardingScreen$configureFooterButtonClick$1$1(shadowImageButton, viewGroup, constraintLayout, function2, finishButton, lotteryOnboardingTutorialScreenModel, lotteryOnboardingScreen, lVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void configureMainScreenClick(final ViewGroup rootView, final ConstraintLayout constraintLayout, final ShadowImageButton overlayCloseScreenButton, final boolean isLastScreen, final t tokenizedEvent, final l tokenizedAnalytics, final Function2<? super Boolean, ? super Function0<Unit>, Unit> onNext) {
        constraintLayout.setOnClickListener(new View.OnClickListener() { // from class: RF.d
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LotteryOnboardingScreen.configureMainScreenClick$lambda$9(LotteryOnboardingScreen.this, isLastScreen, overlayCloseScreenButton, rootView, constraintLayout, onNext, tokenizedEvent, tokenizedAnalytics, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void configureMainScreenClick$lambda$9(LotteryOnboardingScreen lotteryOnboardingScreen, boolean z11, ShadowImageButton shadowImageButton, ViewGroup viewGroup, ConstraintLayout constraintLayout, Function2 function2, t tVar, l lVar, View view) {
        lotteryOnboardingScreen.doOnClick(new LotteryOnboardingScreen$configureMainScreenClick$1$1(z11, shadowImageButton, viewGroup, constraintLayout, function2, tVar, lVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void configureOverlayCloseButtonClick(final ViewGroup rootView, final ConstraintLayout constraintLayout, final ShadowImageButton overlayCloseScreenButton, final TutorialScreenModel.LotteryOnboardingTutorialScreenModel tutorialScreenModel, final l tokenizedAnalytics, final Function2<? super Boolean, ? super Function0<Unit>, Unit> onNext) {
        overlayCloseScreenButton.setOnClickListener(new View.OnClickListener() { // from class: RF.c
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LotteryOnboardingScreen.configureOverlayCloseButtonClick$lambda$7(LotteryOnboardingScreen.this, overlayCloseScreenButton, rootView, constraintLayout, onNext, tutorialScreenModel, tokenizedAnalytics, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void configureOverlayCloseButtonClick$lambda$7(LotteryOnboardingScreen lotteryOnboardingScreen, ShadowImageButton shadowImageButton, ViewGroup viewGroup, ConstraintLayout constraintLayout, Function2 function2, TutorialScreenModel.LotteryOnboardingTutorialScreenModel lotteryOnboardingTutorialScreenModel, l lVar, View view) {
        lotteryOnboardingScreen.doOnClick(new LotteryOnboardingScreen$configureOverlayCloseButtonClick$1$1(shadowImageButton, viewGroup, constraintLayout, function2, lotteryOnboardingTutorialScreenModel, lotteryOnboardingScreen, lVar));
    }

    private final ImageView createAndLoadImage(ViewGroup rootView, String imageUrl) {
        ImageView imageView = new ImageView(rootView.getContext());
        imageView.setId(R$id.onboarding_image);
        ImageViewExtKt.load$default(imageView, imageUrl, null, null, null, null, false, LoadPriority.HIGH, 62, null);
        imageView.setLayoutParams(new ConstraintLayout.b(0, -2));
        imageView.setAdjustViewBounds(true);
        return imageView;
    }

    private final ConstraintLayout createConstraintLayout(ViewGroup rootView) {
        ConstraintLayout constraintLayout = new ConstraintLayout(rootView.getContext());
        constraintLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        return constraintLayout;
    }

    private final View createFooterView(ViewGroup rootView, TutorialScreenModel.LotteryOnboardingTutorialScreenModel tutorialScreenModel) {
        LotteryOnboardingInfoVI.OnboardingStep.FooterContent footerContent = tutorialScreenModel.getLotteryOnboardingStep().getFooterContent();
        if (!(footerContent instanceof LotteryOnboardingInfoVI.OnboardingStep.FooterContent.FinishButton)) {
            if (footerContent instanceof LotteryOnboardingInfoVI.OnboardingStep.FooterContent.TextContent) {
                Context context = rootView.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                return new TapToContinueTextView(context, ((LotteryOnboardingInfoVI.OnboardingStep.FooterContent.TextContent) footerContent).getActionText());
            }
            if (footerContent == null) {
                return null;
            }
            throw new o();
        }
        Context context2 = rootView.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        MorkovskShadowButton morkovskShadowButton = new MorkovskShadowButton(context2, null, 0, 6, null);
        morkovskShadowButton.setId(View.generateViewId());
        morkovskShadowButton.setLayoutParams(new ConstraintLayout.b(0, -2));
        if (tutorialScreenModel.getIsForceShow()) {
            morkovskShadowButton.bind(((LotteryOnboardingInfoVI.OnboardingStep.FooterContent.FinishButton) footerContent).getDefaultButton(), LotteryOnboardingScreen$createFooterView$1$1.INSTANCE);
            return morkovskShadowButton;
        }
        LotteryOnboardingInfoVI.OnboardingStep.FooterContent.FinishButton finishButton = (LotteryOnboardingInfoVI.OnboardingStep.FooterContent.FinishButton) footerContent;
        MorkovskShadowButtonDTO firstPresentationButton = finishButton.getFirstPresentationButton();
        if (firstPresentationButton == null) {
            firstPresentationButton = finishButton.getDefaultButton();
        }
        morkovskShadowButton.bind(firstPresentationButton, LotteryOnboardingScreen$createFooterView$1$2.INSTANCE);
        return morkovskShadowButton;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int getCloseButtonSize() {
        return ((Number) this.closeButtonSize.getValue()).intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int getFooterContentHorizontalMargin(LotteryOnboardingInfoVI.OnboardingStep.FooterContent footerContent) {
        if (footerContent instanceof LotteryOnboardingInfoVI.OnboardingStep.FooterContent.FinishButton) {
            return Dimens.INSTANCE.getDP_12();
        }
        if (footerContent instanceof LotteryOnboardingInfoVI.OnboardingStep.FooterContent.TextContent) {
            return Dimens.INSTANCE.getDP_52();
        }
        if (footerContent == null) {
            return 0;
        }
        throw new o();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final AtomAction getNoDismissAtomAction(AtomActionDTO actionDTO) {
        AtomActionDTO.Behavior behavior = actionDTO != null ? actionDTO.getBehavior() : null;
        int i11 = behavior == null ? -1 : WhenMappings.$EnumSwitchMapping$0[behavior.ordinal()];
        if (i11 == -1 || i11 == 1) {
            actionDTO = null;
        } else if (i11 == 2) {
            actionDTO = AtomActionDTO.copy$default(actionDTO, AtomActionDTO.Behavior.SCROLL_TO_WIDGET, null, null, null, null, 30, null);
        } else if (i11 == 3) {
            actionDTO = AtomActionDTO.copy$default(actionDTO, AtomActionDTO.Behavior.REDIRECT, null, null, null, null, 30, null);
        } else if (i11 == 4) {
            actionDTO = AtomActionDTO.copy$default(actionDTO, AtomActionDTO.Behavior.BEHAVIOR_TYPE_REFRESH, null, null, null, null, 30, null);
        }
        if (actionDTO != null) {
            return AtomActionMapperKt.toAtomAction(actionDTO, null);
        }
        return null;
    }

    private final Function0<Unit> getOnEndAction(ViewGroup rootView, ConstraintLayout constraintLayout, ShadowImageButton overlayCloseScreenButton, View footerView, TutorialScreenModel.LotteryOnboardingTutorialScreenModel tutorialScreenModel, l tokenizedAnalytics, Function2<? super Boolean, ? super Function0<Unit>, Unit> onNext) {
        return new LotteryOnboardingScreen$getOnEndAction$1(this, rootView, constraintLayout, overlayCloseScreenButton, tutorialScreenModel, tokenizedAnalytics, onNext, footerView);
    }

    private final ShadowImageButton getOrCreateCloseScreenButton(ViewGroup rootView) {
        ShadowImageButton shadowImageButton = (ShadowImageButton) rootView.findViewById(R$id.onboarding_close_button_id);
        if (shadowImageButton != null) {
            return shadowImageButton;
        }
        Context context = rootView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        ShadowImageButton shadowImageButton2 = new ShadowImageButton(context, null, 0, 6, null);
        shadowImageButton2.setId(R$id.onboarding_close_button_id);
        ImageViewExtKt.load$default(shadowImageButton2, "ic_m_cross_filled", null, null, null, null, false, null, 126, null);
        int i11 = R$color.onboarding_close_btn_tint_color;
        Context context2 = shadowImageButton2.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        ThemeExtKt.tint(shadowImageButton2, Integer.valueOf(UtilKt.parseColor(i11, context2)));
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(getCloseButtonSize(), getCloseButtonSize());
        Context context3 = rootView.getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
        int statusBarHeight = ResourceExtKt.getStatusBarHeight(context3);
        Dimens dimens = Dimens.INSTANCE;
        layoutParams.topMargin = dimens.getDP_6() + statusBarHeight;
        layoutParams.rightMargin = dimens.getDP_12();
        layoutParams.gravity = 8388613;
        shadowImageButton2.setLayoutParams(layoutParams);
        int px = ResourceExtKt.toPx(10);
        shadowImageButton2.setPadding(px, px, px, px);
        shadowImageButton2.setAlpha(0.0f);
        rootView.addView(shadowImageButton2);
        return shadowImageButton2;
    }

    private final void showScreenContentWithAnimation(ConstraintLayout constraintLayout, View overlayButton, boolean isFirstScreen, Function0<Unit> onEndAction) {
        if (!isFirstScreen) {
            AnimationsKt.fadeInWithCallback$default(constraintLayout, 0L, onEndAction, 1, null);
            View view = overlayButton.getAlpha() == 0.0f ? overlayButton : null;
            if (view != null) {
                AnimationsKt.fadeInWithCallback$default(view, 0L, LotteryOnboardingScreen$showScreenContentWithAnimation$4.INSTANCE, 1, null);
                return;
            }
            return;
        }
        AnimationsKt.fadeInWithCallback(constraintLayout, 500L, onEndAction);
        if (overlayButton.getAlpha() != 0.0f) {
            overlayButton = null;
        }
        if (overlayButton != null) {
            AnimationsKt.fadeInWithCallback(overlayButton, 500L, LotteryOnboardingScreen$showScreenContentWithAnimation$2.INSTANCE);
        }
    }

    private final void trackScreenView(t tokenizedEvent, l tokenizedAnalytics) {
        if (tokenizedEvent != null) {
            TokenizedAnalyticsExtensionsKt.processViewEvents$default(tokenizedAnalytics, tokenizedEvent, null, 2, null);
        }
    }

    private final void updateImageHeightOnLayoutChange(ConstraintLayout constraintLayout, final ImageView imageView, final View footerView) {
        constraintLayout.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: RF.a
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18) {
                LotteryOnboardingScreen.updateImageHeightOnLayoutChange$lambda$14(footerView, imageView, view, i11, i12, i13, i14, i15, i16, i17, i18);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void updateImageHeightOnLayoutChange$lambda$14(View view, ImageView imageView, View view2, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18) {
        if (view == null || imageView.getBottom() <= view.getTop()) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        layoutParams.height = 0;
        imageView.setLayoutParams(layoutParams);
    }

    public void show(@NotNull FrameLayout rootView, @NotNull TutorialScreenModel.LotteryOnboardingTutorialScreenModel tutorialScreenModel, @NotNull l tokenizedAnalytics, @NotNull Function2<? super Boolean, ? super Function0<Unit>, Unit> onNext) {
        Intrinsics.checkNotNullParameter(rootView, "rootView");
        Intrinsics.checkNotNullParameter(tutorialScreenModel, "tutorialScreenModel");
        Intrinsics.checkNotNullParameter(tokenizedAnalytics, "tokenizedAnalytics");
        Intrinsics.checkNotNullParameter(onNext, "onNext");
        ConstraintLayout createConstraintLayout = createConstraintLayout(rootView);
        ImageView createAndLoadImage = createAndLoadImage(rootView, tutorialScreenModel.getLotteryOnboardingStep().getImageUrl());
        View createFooterView = createFooterView(rootView, tutorialScreenModel);
        ShadowImageButton orCreateCloseScreenButton = getOrCreateCloseScreenButton(rootView);
        addImageAndFooter(createConstraintLayout, createAndLoadImage, createFooterView);
        ConstraintLayoutExtKt.updateConstraints(createConstraintLayout, new LotteryOnboardingScreen$show$1(createAndLoadImage, this, createFooterView, tutorialScreenModel));
        addViewsToRootAndConfigure(rootView, createConstraintLayout, orCreateCloseScreenButton);
        showScreenContentWithAnimation(createConstraintLayout, orCreateCloseScreenButton, tutorialScreenModel.getIsFirstScreen(), getOnEndAction(rootView, createConstraintLayout, orCreateCloseScreenButton, createFooterView, tutorialScreenModel, tokenizedAnalytics, onNext));
        updateImageHeightOnLayoutChange(createConstraintLayout, createAndLoadImage, createFooterView);
        trackScreenView(tutorialScreenModel.getLotteryOnboardingStep().getTokenizedEvent(), tokenizedAnalytics);
        fitsSystemWindow(createConstraintLayout);
    }
}
