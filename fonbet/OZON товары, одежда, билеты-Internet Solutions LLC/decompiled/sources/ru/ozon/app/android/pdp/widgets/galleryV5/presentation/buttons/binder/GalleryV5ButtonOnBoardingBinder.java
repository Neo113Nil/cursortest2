package ru.ozon.app.android.pdp.widgets.galleryV5.presentation.buttons.binder;

import Sc.o;
import WZ.l;
import WZ.t;
import android.view.View;
import androidx.lifecycle.J;
import androidx.lifecycle.P;
import androidx.lifecycle.W;
import bE.ViewOnClickListenerC5598a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.analytics.modules.tokenized.TokenizedAnalyticsExtensionsKt;
import ru.ozon.app.android.pdp.widgets.galleryV5.presentation.GalleryV5Resources;
import ru.ozon.app.android.pdp.widgets.galleryV5.presentation.GalleryV5VO;
import ru.ozon.app.android.pdp.widgets.galleryV5.presentation.buttons.GalleryV5OnBoardingButtonView;
import ru.ozon.app.android.pdp.widgets.galleryV5.presentation.buttons.GalleryV5OnboardingViewModel;
import ru.ozon.app.android.pdp.widgets.galleryV5.presentation.buttons.GalleryV5buttonsOnBoardingViewState;
import ru.ozon.app.android.pdp.widgets.galleryV5.presentation.buttons.binder.GalleryV5ButtonOnBoardingBinder;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B3\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0013\u0010\u0012J3\u0010\u0019\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u00142\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00100\u0016H\u0016¢\u0006\u0004\b\u0019\u0010\u001aR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u001bR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u001cR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u001dR\u001e\u0010 \u001a\n\u0012\u0004\u0012\u00020\u001f\u0018\u00010\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010!R\u0018\u0010#\u001a\u0004\u0018\u00010\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010$R\u0016\u0010&\u001a\u00020%8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010'¨\u0006("}, d2 = {"Lru/ozon/app/android/pdp/widgets/galleryV5/presentation/buttons/binder/GalleryV5ButtonOnBoardingBinder;", "Lru/ozon/app/android/pdp/widgets/galleryV5/presentation/buttons/binder/BaseGalleryV5ButtonBinder;", "Lru/ozon/app/android/pdp/widgets/galleryV5/presentation/buttons/GalleryV5OnBoardingButtonView;", "Lru/ozon/app/android/pdp/widgets/galleryV5/presentation/buttons/GalleryV5OnboardingViewModel;", "viewModel", "LWZ/l;", "tokenizedAnalytics", "Landroidx/lifecycle/J;", "viewOwner", "Lru/ozon/app/android/pdp/widgets/galleryV5/presentation/GalleryV5Resources;", "galleryResources", "", "bgColor", "<init>", "(Lru/ozon/app/android/pdp/widgets/galleryV5/presentation/buttons/GalleryV5OnboardingViewModel;LWZ/l;Landroidx/lifecycle/J;Lru/ozon/app/android/pdp/widgets/galleryV5/presentation/GalleryV5Resources;Ljava/lang/String;)V", "view", "", "init", "(Lru/ozon/app/android/pdp/widgets/galleryV5/presentation/buttons/GalleryV5OnBoardingButtonView;)V", "unsubscribeOnBoarding", "Lru/ozon/app/android/pdp/widgets/galleryV5/presentation/GalleryV5VO$Button;", "item", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "bind", "(Lru/ozon/app/android/pdp/widgets/galleryV5/presentation/buttons/GalleryV5OnBoardingButtonView;Lru/ozon/app/android/pdp/widgets/galleryV5/presentation/GalleryV5VO$Button;Lkotlin/jvm/functions/Function1;)V", "Lru/ozon/app/android/pdp/widgets/galleryV5/presentation/buttons/GalleryV5OnboardingViewModel;", "LWZ/l;", "Landroidx/lifecycle/J;", "Landroidx/lifecycle/W;", "Lru/ozon/app/android/pdp/widgets/galleryV5/presentation/buttons/GalleryV5buttonsOnBoardingViewState;", "observer", "Landroidx/lifecycle/W;", "Lru/ozon/app/android/pdp/widgets/galleryV5/presentation/GalleryV5VO$Button$OnBoarding;", "curOnBoarding", "Lru/ozon/app/android/pdp/widgets/galleryV5/presentation/GalleryV5VO$Button$OnBoarding;", "", "isInitialized", "Z", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class GalleryV5ButtonOnBoardingBinder extends BaseGalleryV5ButtonBinder<GalleryV5OnBoardingButtonView> {
    private GalleryV5VO.Button.OnBoarding curOnBoarding;
    private boolean isInitialized;
    private W<GalleryV5buttonsOnBoardingViewState> observer;

    @NotNull
    private final l tokenizedAnalytics;
    private final GalleryV5OnboardingViewModel viewModel;

    @NotNull
    private final J viewOwner;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GalleryV5ButtonOnBoardingBinder(GalleryV5OnboardingViewModel galleryV5OnboardingViewModel, @NotNull l tokenizedAnalytics, @NotNull J viewOwner, @NotNull GalleryV5Resources galleryResources, String str) {
        super(galleryResources, str);
        Intrinsics.checkNotNullParameter(tokenizedAnalytics, "tokenizedAnalytics");
        Intrinsics.checkNotNullParameter(viewOwner, "viewOwner");
        Intrinsics.checkNotNullParameter(galleryResources, "galleryResources");
        this.viewModel = galleryV5OnboardingViewModel;
        this.tokenizedAnalytics = tokenizedAnalytics;
        this.viewOwner = viewOwner;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bind$lambda$2$lambda$1(Function1 function1, GalleryV5VO.Button button, GalleryV5ButtonOnBoardingBinder galleryV5ButtonOnBoardingBinder, View view) {
        function1.invoke(button.getAction());
        t event = button.getEvent();
        if (event != null) {
            TokenizedAnalyticsExtensionsKt.processClickEvents$default(galleryV5ButtonOnBoardingBinder.tokenizedAnalytics, event, null, 2, null);
        }
    }

    private final void init(final GalleryV5OnBoardingButtonView view) {
        P<GalleryV5buttonsOnBoardingViewState> events;
        W<GalleryV5buttonsOnBoardingViewState> w11 = new W() { // from class: bE.b
            @Override // androidx.lifecycle.W
            public final void onChanged(Object obj) {
                GalleryV5ButtonOnBoardingBinder.init$lambda$3(this, view, (GalleryV5buttonsOnBoardingViewState) obj);
            }
        };
        GalleryV5OnboardingViewModel galleryV5OnboardingViewModel = this.viewModel;
        if (galleryV5OnboardingViewModel != null && (events = galleryV5OnboardingViewModel.getEvents()) != null) {
            events.observe(this.viewOwner, w11);
        }
        this.observer = w11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void init$lambda$3(GalleryV5ButtonOnBoardingBinder galleryV5ButtonOnBoardingBinder, GalleryV5OnBoardingButtonView galleryV5OnBoardingButtonView, GalleryV5buttonsOnBoardingViewState state) {
        Intrinsics.checkNotNullParameter(state, "state");
        GalleryV5VO.Button.OnBoarding onBoarding = galleryV5ButtonOnBoardingBinder.curOnBoarding;
        if (Intrinsics.d(onBoarding != null ? onBoarding.getId() : null, state.getId())) {
            if (state instanceof GalleryV5buttonsOnBoardingViewState.Show) {
                GalleryV5VO.Button.OnBoarding onBoarding2 = galleryV5ButtonOnBoardingBinder.curOnBoarding;
                galleryV5OnBoardingButtonView.showOnBoarding(onBoarding2 != null ? Integer.valueOf(onBoarding2.getTextWidth()) : null);
            } else if (state instanceof GalleryV5buttonsOnBoardingViewState.Hide) {
                galleryV5OnBoardingButtonView.hideOnBoarding();
                galleryV5ButtonOnBoardingBinder.unsubscribeOnBoarding(galleryV5OnBoardingButtonView);
            } else {
                if (!(state instanceof GalleryV5buttonsOnBoardingViewState.Unsubscribe)) {
                    throw new o();
                }
                galleryV5ButtonOnBoardingBinder.unsubscribeOnBoarding(galleryV5OnBoardingButtonView);
            }
        }
    }

    private final void unsubscribeOnBoarding(GalleryV5OnBoardingButtonView view) {
        GalleryV5OnboardingViewModel galleryV5OnboardingViewModel;
        P<GalleryV5buttonsOnBoardingViewState> events;
        W<GalleryV5buttonsOnBoardingViewState> w11 = this.observer;
        if (w11 != null && (galleryV5OnboardingViewModel = this.viewModel) != null && (events = galleryV5OnboardingViewModel.getEvents()) != null) {
            events.removeObserver(w11);
        }
        this.observer = null;
        view.setOnAttach(null);
    }

    public void bind(@NotNull GalleryV5OnBoardingButtonView view, @NotNull GalleryV5VO.Button item, @NotNull Function1<? super AtomAction, Unit> actionHandler) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        if (!this.isInitialized) {
            init(view);
            this.isInitialized = true;
        }
        super.bind((GalleryV5ButtonOnBoardingBinder) view, item, actionHandler);
        GalleryV5VO.Button.OnBoarding onBoarding = item.getOnBoarding();
        if (onBoarding != null) {
            this.curOnBoarding = onBoarding;
            view.bind(item);
            view.setOnClickListener(new ViewOnClickListenerC5598a(actionHandler, item, this, 0));
            if (item.getOnBoarding().getNotHidableOnboarding()) {
                return;
            }
            view.setOnAttach(new GalleryV5ButtonOnBoardingBinder$bind$1$2(this, onBoarding, view));
        }
    }
}
