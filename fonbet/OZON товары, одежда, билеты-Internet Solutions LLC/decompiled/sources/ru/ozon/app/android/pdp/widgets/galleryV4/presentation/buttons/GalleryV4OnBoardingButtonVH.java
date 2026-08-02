package ru.ozon.app.android.pdp.widgets.galleryV4.presentation.buttons;

import Lw.ViewOnClickListenerC3600c;
import Sc.o;
import WZ.l;
import WZ.t;
import android.view.View;
import androidx.lifecycle.J;
import androidx.lifecycle.P;
import androidx.lifecycle.W;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.analytics.modules.tokenized.TokenizedAnalyticsExtensionsKt;
import ru.ozon.app.android.pdp.widgets.galleryV4.presentation.GalleryV4VO;
import ru.ozon.app.android.pdp.widgets.galleryV4.presentation.buttons.GalleryV4OnBoardingButtonVH;
import ru.ozon.app.android.pdp.widgets.galleryV4.presentation.buttons.GalleryV4buttonsOnBoardingViewState;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\r\u0010\u000eJ+\u0010\u0014\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\f0\u0011H\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0016R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0017R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0018R\u001e\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0018\u0010\u001e\u001a\u0004\u0018\u00010\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f¨\u0006 "}, d2 = {"Lru/ozon/app/android/pdp/widgets/galleryV4/presentation/buttons/GalleryV4OnBoardingButtonVH;", "Lru/ozon/app/android/pdp/widgets/galleryV4/presentation/buttons/BaseGalleryV4ButtonVH;", "Lru/ozon/app/android/pdp/widgets/galleryV4/presentation/buttons/GalleryV4OnBoardingButtonView;", "view", "Lru/ozon/app/android/pdp/widgets/galleryV4/presentation/buttons/GalleryV4ButtonsViewModel;", "viewModel", "Landroidx/lifecycle/J;", "viewOwner", "LWZ/l;", "tokenizedAnalytics", "<init>", "(Lru/ozon/app/android/pdp/widgets/galleryV4/presentation/buttons/GalleryV4OnBoardingButtonView;Lru/ozon/app/android/pdp/widgets/galleryV4/presentation/buttons/GalleryV4ButtonsViewModel;Landroidx/lifecycle/J;LWZ/l;)V", "", "unsubscribeOnBoarding", "()V", "Lru/ozon/app/android/pdp/widgets/galleryV4/presentation/GalleryV4VO$Button;", "item", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "bind", "(Lru/ozon/app/android/pdp/widgets/galleryV4/presentation/GalleryV4VO$Button;Lkotlin/jvm/functions/Function1;)V", "Lru/ozon/app/android/pdp/widgets/galleryV4/presentation/buttons/GalleryV4OnBoardingButtonView;", "Lru/ozon/app/android/pdp/widgets/galleryV4/presentation/buttons/GalleryV4ButtonsViewModel;", "LWZ/l;", "Landroidx/lifecycle/W;", "Lru/ozon/app/android/pdp/widgets/galleryV4/presentation/buttons/GalleryV4buttonsOnBoardingViewState;", "observer", "Landroidx/lifecycle/W;", "Lru/ozon/app/android/pdp/widgets/galleryV4/presentation/GalleryV4VO$Button$OnBoarding;", "curOnBoarding", "Lru/ozon/app/android/pdp/widgets/galleryV4/presentation/GalleryV4VO$Button$OnBoarding;", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class GalleryV4OnBoardingButtonVH extends BaseGalleryV4ButtonVH {
    private GalleryV4VO.Button.OnBoarding curOnBoarding;
    private W<GalleryV4buttonsOnBoardingViewState> observer;

    @NotNull
    private final l tokenizedAnalytics;

    @NotNull
    private final GalleryV4OnBoardingButtonView view;
    private final GalleryV4ButtonsViewModel viewModel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GalleryV4OnBoardingButtonVH(@NotNull GalleryV4OnBoardingButtonView view, GalleryV4ButtonsViewModel galleryV4ButtonsViewModel, @NotNull J viewOwner, @NotNull l tokenizedAnalytics) {
        super(view);
        P<GalleryV4buttonsOnBoardingViewState> events;
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(viewOwner, "viewOwner");
        Intrinsics.checkNotNullParameter(tokenizedAnalytics, "tokenizedAnalytics");
        this.view = view;
        this.viewModel = galleryV4ButtonsViewModel;
        this.tokenizedAnalytics = tokenizedAnalytics;
        W<GalleryV4buttonsOnBoardingViewState> w11 = new W() { // from class: TD.a
            @Override // androidx.lifecycle.W
            public final void onChanged(Object obj) {
                GalleryV4OnBoardingButtonVH._init_$lambda$0(GalleryV4OnBoardingButtonVH.this, (GalleryV4buttonsOnBoardingViewState) obj);
            }
        };
        if (galleryV4ButtonsViewModel != null && (events = galleryV4ButtonsViewModel.getEvents()) != null) {
            events.observe(viewOwner, w11);
        }
        this.observer = w11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$0(GalleryV4OnBoardingButtonVH galleryV4OnBoardingButtonVH, GalleryV4buttonsOnBoardingViewState state) {
        Intrinsics.checkNotNullParameter(state, "state");
        GalleryV4VO.Button.OnBoarding onBoarding = galleryV4OnBoardingButtonVH.curOnBoarding;
        if (Intrinsics.d(onBoarding != null ? onBoarding.getId() : null, state.getId())) {
            if (state instanceof GalleryV4buttonsOnBoardingViewState.Show) {
                GalleryV4OnBoardingButtonView galleryV4OnBoardingButtonView = galleryV4OnBoardingButtonVH.view;
                GalleryV4VO.Button.OnBoarding onBoarding2 = galleryV4OnBoardingButtonVH.curOnBoarding;
                galleryV4OnBoardingButtonView.showOnBoarding(onBoarding2 != null ? Integer.valueOf(onBoarding2.getTextWidth()) : null);
            } else if (state instanceof GalleryV4buttonsOnBoardingViewState.Hide) {
                galleryV4OnBoardingButtonVH.view.hideOnBoarding();
                galleryV4OnBoardingButtonVH.unsubscribeOnBoarding();
            } else {
                if (!(state instanceof GalleryV4buttonsOnBoardingViewState.Unsubscribe)) {
                    throw new o();
                }
                galleryV4OnBoardingButtonVH.unsubscribeOnBoarding();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bind$lambda$3$lambda$2(Function1 function1, GalleryV4VO.Button button, GalleryV4OnBoardingButtonVH galleryV4OnBoardingButtonVH, View view) {
        function1.invoke(button.getAction());
        t event = button.getEvent();
        if (event != null) {
            TokenizedAnalyticsExtensionsKt.processClickEvents$default(galleryV4OnBoardingButtonVH.tokenizedAnalytics, event, null, 2, null);
        }
    }

    private final void unsubscribeOnBoarding() {
        GalleryV4ButtonsViewModel galleryV4ButtonsViewModel;
        P<GalleryV4buttonsOnBoardingViewState> events;
        W<GalleryV4buttonsOnBoardingViewState> w11 = this.observer;
        if (w11 != null && (galleryV4ButtonsViewModel = this.viewModel) != null && (events = galleryV4ButtonsViewModel.getEvents()) != null) {
            events.removeObserver(w11);
        }
        this.observer = null;
        this.view.setOnAttach(null);
    }

    @Override // ru.ozon.app.android.pdp.widgets.galleryV4.presentation.buttons.BaseGalleryV4ButtonVH
    public void bind(@NotNull GalleryV4VO.Button item, @NotNull Function1<? super AtomAction, Unit> actionHandler) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        GalleryV4VO.Button.OnBoarding onBoarding = item.getOnBoarding();
        if (onBoarding != null) {
            this.curOnBoarding = onBoarding;
            this.view.bind(item);
            this.view.setOnClickListener(new ViewOnClickListenerC3600c(actionHandler, item, this, 1));
            if (item.getOnBoarding().getNotHidableOnboarding()) {
                return;
            }
            this.view.setOnAttach(new GalleryV4OnBoardingButtonVH$bind$1$2(this, onBoarding));
        }
    }
}
