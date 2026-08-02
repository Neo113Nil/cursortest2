package ru.ozon.app.android.regulardraw.widgets.mainDrawMajorScreen.presentation;

import Lw.ViewOnClickListenerC3598a;
import Vg.d;
import W10.c;
import WZ.l;
import WZ.t;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.gms.common.internal.ImagesContract;
import hd.C6915b;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.analytics.modules.tokenized.TokenizedAnalyticsExtensionsKt;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.pikazon.callback.PikazonLoaderCallback;
import ru.ozon.app.android.pikazon.extensions.ImageViewExtKt;
import ru.ozon.app.android.pikazon.image.ImageSize;
import ru.ozon.app.android.regulardraw.databinding.WidgetMainDrawMajorScreenBinding;
import ru.ozon.app.android.regulardraw.onboarding.MorkovskOnboardingDelegate;
import ru.ozon.app.android.regulardraw.onboarding.OnboardingModel;
import ru.ozon.app.android.regulardraw.widgets.mainDrawMajorScreen.data.MainDrawMajorScreenVO;
import ru.ozon.app.android.regulardraw.widgets.mainDrawMajorScreen.presentation.MainDrawMajorScreenViewModel;
import ru.ozon.app.android.regulardraw.widgets.mainDrawMajorScreen.presentation.sideBar.SideBarConfigurator;
import ru.ozon.app.android.regulardraw.widgets.mainDrawMajorScreen.ui.MainDrawMajorScreenBg;
import ru.ozon.app.android.regulardraw.widgets.mainDrawMajorScreen.ui.animation.MainDrawMajorScreenAnimationView;
import ru.ozon.composer.ui.widget.f;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u0000 42\b\u0012\u0004\u0012\u00020\u00020\u0001:\u00014B?\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\n\u0010\t\u001a\u00060\u0007j\u0002`\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\n\u0010\u000e\u001a\u00060\fj\u0002`\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u001b\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u0019H\u0014¢\u0006\u0004\b\u001b\u0010\u001cJ)\u0010!\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u00022\u0006\u0010\u001e\u001a\u00020\u001d2\b\u0010 \u001a\u0004\u0018\u00010\u001fH\u0016¢\u0006\u0004\b!\u0010\"R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010#R\u0018\u0010\t\u001a\u00060\u0007j\u0002`\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010$R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010%R\u0018\u0010\u000e\u001a\u00060\fj\u0002`\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010&R\u0014\u0010(\u001a\u00020'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R \u0010,\u001a\u000e\u0012\u0004\u0012\u00020+\u0012\u0004\u0012\u00020\u00150*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0014\u0010/\u001a\u00020.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u0014\u00102\u001a\u0002018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103¨\u00065"}, d2 = {"Lru/ozon/app/android/regulardraw/widgets/mainDrawMajorScreen/presentation/MainDrawMajorScreenViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/regulardraw/widgets/mainDrawMajorScreen/data/MainDrawMajorScreenVO;", "Lru/ozon/app/android/composer/ComposerReferences;", "refs", "Lru/ozon/app/android/regulardraw/databinding/WidgetMainDrawMajorScreenBinding;", "binding", "LWZ/l;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedAnalytics;", "tokenizedAnalytics", "Lru/ozon/app/android/regulardraw/onboarding/MorkovskOnboardingDelegate;", "onboardingDelegate", "LVg/d;", "Lru/ozon/app/android/action/custom/CustomActionHandlersStoreFactory;", "customActionHandlersStoreFactory", "Lru/ozon/app/android/regulardraw/widgets/mainDrawMajorScreen/presentation/MainDrawMajorScreenViewModel;", "mainDrawMajorScreenViewModel", "<init>", "(Lru/ozon/app/android/composer/ComposerReferences;Lru/ozon/app/android/regulardraw/databinding/WidgetMainDrawMajorScreenBinding;LWZ/l;Lru/ozon/app/android/regulardraw/onboarding/MorkovskOnboardingDelegate;LVg/d;Lru/ozon/app/android/regulardraw/widgets/mainDrawMajorScreen/presentation/MainDrawMajorScreenViewModel;)V", "", ImagesContract.URL, "", "loadMainImage", "(Ljava/lang/String;)V", "item", "Ll20/d;", "info", "bind", "(Lru/ozon/app/android/regulardraw/widgets/mainDrawMajorScreen/data/MainDrawMajorScreenVO;Ll20/d;)V", "LW10/c;", "trackingData", "Lru/ozon/composer/ui/widget/f;", "viewedPond", "trackView", "(Lru/ozon/app/android/regulardraw/widgets/mainDrawMajorScreen/data/MainDrawMajorScreenVO;LW10/c;Lru/ozon/composer/ui/widget/f;)V", "Lru/ozon/app/android/regulardraw/databinding/WidgetMainDrawMajorScreenBinding;", "LWZ/l;", "Lru/ozon/app/android/regulardraw/onboarding/MorkovskOnboardingDelegate;", "LVg/d;", "", "screenSize", "I", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "Lru/ozon/app/android/regulardraw/widgets/mainDrawMajorScreen/presentation/sideBar/SideBarConfigurator;", "sideBarConfigurator", "Lru/ozon/app/android/regulardraw/widgets/mainDrawMajorScreen/presentation/sideBar/SideBarConfigurator;", "Lru/ozon/app/android/regulardraw/widgets/mainDrawMajorScreen/presentation/MainDrawMajorScreenUpdateAnimationController;", "mainDrawMajorScreenUpdateAnimationController", "Lru/ozon/app/android/regulardraw/widgets/mainDrawMajorScreen/presentation/MainDrawMajorScreenUpdateAnimationController;", "Companion", "regulardraw_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class MainDrawMajorScreenViewHolder extends k<MainDrawMajorScreenVO> {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final WidgetMainDrawMajorScreenBinding binding;

    @NotNull
    private final d customActionHandlersStoreFactory;

    @NotNull
    private final MainDrawMajorScreenUpdateAnimationController mainDrawMajorScreenUpdateAnimationController;

    @NotNull
    private final MorkovskOnboardingDelegate onboardingDelegate;
    private final int screenSize;

    @NotNull
    private final SideBarConfigurator sideBarConfigurator;

    @NotNull
    private final l tokenizedAnalytics;

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lru/ozon/app/android/regulardraw/widgets/mainDrawMajorScreen/presentation/MainDrawMajorScreenViewModel$AnimationState$Start;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.regulardraw.widgets.mainDrawMajorScreen.presentation.MainDrawMajorScreenViewHolder$1, reason: invalid class name */
    static final class AnonymousClass1 extends AbstractC7737t implements Function1<MainDrawMajorScreenViewModel.AnimationState.Start, Unit> {
        AnonymousClass1() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(MainDrawMajorScreenViewModel.AnimationState.Start start) {
            invoke2(start);
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(MainDrawMajorScreenViewModel.AnimationState.Start it) {
            Intrinsics.checkNotNullParameter(it, "it");
            MainDrawMajorScreenViewHolder.this.binding.progress.updateProgress(it.getPercent(), it.getText());
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0006\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lru/ozon/app/android/regulardraw/widgets/mainDrawMajorScreen/presentation/MainDrawMajorScreenViewHolder$Companion;", "", "<init>", "()V", "MAX_IMAGE_WIDTH", "", "IMAGE_HEIGHT_DIMENSION_RATIO", "", "regulardraw_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public MainDrawMajorScreenViewHolder(@NotNull ComposerReferences refs, @NotNull WidgetMainDrawMajorScreenBinding binding, @NotNull l tokenizedAnalytics, @NotNull MorkovskOnboardingDelegate onboardingDelegate, @NotNull d customActionHandlersStoreFactory, @NotNull MainDrawMajorScreenViewModel mainDrawMajorScreenViewModel) {
        super(r0);
        Intrinsics.checkNotNullParameter(refs, "refs");
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(tokenizedAnalytics, "tokenizedAnalytics");
        Intrinsics.checkNotNullParameter(onboardingDelegate, "onboardingDelegate");
        Intrinsics.checkNotNullParameter(customActionHandlersStoreFactory, "customActionHandlersStoreFactory");
        Intrinsics.checkNotNullParameter(mainDrawMajorScreenViewModel, "mainDrawMajorScreenViewModel");
        ConstraintLayout constraintLayout = binding.getConstraintLayout();
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "getRoot(...)");
        this.binding = binding;
        this.tokenizedAnalytics = tokenizedAnalytics;
        this.onboardingDelegate = onboardingDelegate;
        this.customActionHandlersStoreFactory = customActionHandlersStoreFactory;
        this.screenSize = ResourceExtKt.toDp(getContext().getResources().getDisplayMetrics().widthPixels);
        Function1<AtomAction, Unit> buildHandler = new ActionHandler.Builder(refs, this).customActionHandlers(new MainDrawMajorScreenViewHolder$actionHandler$1(this)).buildHandler();
        this.actionHandler = buildHandler;
        this.sideBarConfigurator = new SideBarConfigurator(getContext(), buildHandler);
        MainDrawMajorScreenAnimationView animation = binding.animation;
        Intrinsics.checkNotNullExpressionValue(animation, "animation");
        MainDrawMajorScreenUpdateAnimationController mainDrawMajorScreenUpdateAnimationController = new MainDrawMajorScreenUpdateAnimationController(animation, mainDrawMajorScreenViewModel, refs.getContainer().g().getLifecycle(), buildHandler);
        this.mainDrawMajorScreenUpdateAnimationController = mainDrawMajorScreenUpdateAnimationController;
        mainDrawMajorScreenUpdateAnimationController.setOnAnimationEndListener(new AnonymousClass1());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bind$lambda$0(MainDrawMajorScreenVO mainDrawMajorScreenVO, MainDrawMajorScreenViewHolder mainDrawMajorScreenViewHolder, View view) {
        AtomAction action = mainDrawMajorScreenVO.getAction();
        if (action != null) {
            mainDrawMajorScreenViewHolder.actionHandler.invoke(action);
        }
    }

    private final void loadMainImage(String url) {
        int i11 = this.screenSize;
        if (i11 > 440) {
            i11 = 440;
        }
        int px = ResourceExtKt.toPx(i11);
        int b11 = C6915b.b(px * 1.024d);
        AppCompatImageView mainImage = this.binding.mainImage;
        Intrinsics.checkNotNullExpressionValue(mainImage, "mainImage");
        ViewGroup.LayoutParams layoutParams = mainImage.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        }
        ConstraintLayout.b bVar = (ConstraintLayout.b) layoutParams;
        ((ViewGroup.MarginLayoutParams) bVar).width = px;
        ((ViewGroup.MarginLayoutParams) bVar).height = b11;
        mainImage.setLayoutParams(bVar);
        AppCompatImageView mainImage2 = this.binding.mainImage;
        Intrinsics.checkNotNullExpressionValue(mainImage2, "mainImage");
        ImageViewExtKt.load$default(mainImage2, url, null, new PikazonLoaderCallback<Drawable>() { // from class: ru.ozon.app.android.regulardraw.widgets.mainDrawMajorScreen.presentation.MainDrawMajorScreenViewHolder$loadMainImage$2
            @Override // ru.ozon.app.android.pikazon.callback.PikazonLoaderCallback
            public void onLoadFailed(Exception exc) {
                PikazonLoaderCallback.DefaultImpls.onLoadFailed(this, exc);
            }

            @Override // ru.ozon.app.android.pikazon.callback.PikazonLoaderCallback
            public void onLoadSuccessful(Drawable resource) {
                MorkovskOnboardingDelegate morkovskOnboardingDelegate;
                morkovskOnboardingDelegate = MainDrawMajorScreenViewHolder.this.onboardingDelegate;
                MorkovskOnboardingDelegate.MorkovskOnboarding provideMorokvskOnboarding = morkovskOnboardingDelegate.provideMorokvskOnboarding();
                OnboardingModel.Companion companion = OnboardingModel.INSTANCE;
                AppCompatImageView mainImage3 = MainDrawMajorScreenViewHolder.this.binding.mainImage;
                Intrinsics.checkNotNullExpressionValue(mainImage3, "mainImage");
                provideMorokvskOnboarding.putOnboardingModel(new OnboardingModel.ThirdPrizeProgressTooltipModel.PrizeModel(companion.createGetViewReferenceCallback(mainImage3)));
            }
        }, null, new ImageSize(px, b11), false, null, 106, null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull MainDrawMajorScreenVO item, @NotNull l20.d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        loadMainImage(item.getBackgroundImage());
        this.binding.progress.bind(item.getProgressBlock(), this.actionHandler);
        this.sideBarConfigurator.bindSideBars(item, this.binding);
        this.binding.getConstraintLayout().setOnClickListener(new ViewOnClickListenerC3598a(3, item, this));
        MorkovskOnboardingDelegate.MorkovskOnboarding provideMorokvskOnboarding = this.onboardingDelegate.provideMorokvskOnboarding();
        OnboardingModel.Companion companion = OnboardingModel.INSTANCE;
        MainDrawMajorScreenBg progress = this.binding.progress;
        Intrinsics.checkNotNullExpressionValue(progress, "progress");
        provideMorokvskOnboarding.putOnboardingModel(new OnboardingModel.ThirdPrizeProgressTooltipModel.ProgressModel(companion.createGetViewReferenceCallback(progress)));
        this.mainDrawMajorScreenUpdateAnimationController.startAnimationProcess(item.getUpdateProgressAnimation());
    }

    @Override // ru.ozon.composer.ui.widget.k
    public void trackView(@NotNull MainDrawMajorScreenVO item, @NotNull c trackingData, f viewedPond) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(trackingData, "trackingData");
        t tokenizedEvent = item.getTokenizedEvent();
        if (tokenizedEvent != null) {
            TokenizedAnalyticsExtensionsKt.processViewEvents$default(this.tokenizedAnalytics, tokenizedEvent, null, 2, null);
        }
        Iterator it = C7714v.p0(item.getRightItems(), item.getLeftItems()).iterator();
        while (it.hasNext()) {
            t tokenizedEvent2 = ((MainDrawMajorScreenVO.Lootbox) it.next()).getTokenizedEvent();
            if (tokenizedEvent2 != null) {
                TokenizedAnalyticsExtensionsKt.processViewEvents$default(this.tokenizedAnalytics, tokenizedEvent2, null, 2, null);
            }
        }
        t tokenizedEvent3 = item.getProgressBlock().getTokenizedEvent();
        if (tokenizedEvent3 != null) {
            TokenizedAnalyticsExtensionsKt.processViewEvents$default(this.tokenizedAnalytics, tokenizedEvent3, null, 2, null);
        }
    }
}
