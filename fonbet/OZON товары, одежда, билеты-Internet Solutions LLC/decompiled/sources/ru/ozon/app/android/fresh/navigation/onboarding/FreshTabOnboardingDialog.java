package ru.ozon.app.android.fresh.navigation.onboarding;

import CG.c;
import GZ.g;
import Sg.a;
import Sg.b;
import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.os.Bundle;
import android.util.Property;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.DialogInterfaceOnCancelListenerC5390k;
import gi.C6739a;
import gi.C6740b;
import hi.InterfaceC6958a;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.analytics.di.AnalyticsComponentApi;
import ru.ozon.app.android.analytics.screen.storage.di.AnalyticsScreenStorageComponentApi;
import ru.ozon.app.android.di.provider.component.ContextComponentDependencies;
import ru.ozon.app.android.fresh.navigation.R$layout;
import ru.ozon.app.android.fresh.navigation.R$style;
import ru.ozon.app.android.fresh.navigation.databinding.DialogFragmentFreshTabOnboardingBinding;
import ru.ozon.app.android.fresh.navigation.onboarding.di.DaggerFreshTabOnboardingComponent;
import ru.ozon.app.android.fresh.navigation.onboarding.di.FreshTabOnboardingComponent;
import ru.ozon.app.android.navigation.LinkGenerator;
import ru.ozon.app.android.navigation.di.NavigationComponentApi;
import ru.ozon.app.android.navigation.miniapp.MiniAppExtKt;
import ru.ozon.app.android.pikazon.extensions.ImageViewExtKt;
import ru.ozon.app.android.pikazon.glide.transformations.ImageTransformation;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;

@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 <2\u00020\u0001:\u0001<B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0013\u0010\u000b\u001a\u00020\n*\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\r\u0010\u0003J\u0019\u0010\u0010\u001a\u00020\u00062\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J+\u0010\u0016\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\u00122\b\u0010\u0015\u001a\u0004\u0018\u00010\u00142\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0016¢\u0006\u0004\b\u0016\u0010\u0017J!\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\t2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u001e\u0010\u0003J\u000f\u0010\u001f\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u001f\u0010\u0003R\"\u0010!\u001a\u00020 8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\"\u0010(\u001a\u00020'8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R,\u00100\u001a\u00060.j\u0002`/8\u0000@\u0000X\u0081.¢\u0006\u0018\n\u0004\b0\u00101\u0012\u0004\b6\u0010\u0003\u001a\u0004\b2\u00103\"\u0004\b4\u00105R\u0018\u00107\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b7\u00108R\u0018\u0010:\u001a\u0004\u0018\u0001098\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b:\u0010;¨\u0006="}, d2 = {"Lru/ozon/app/android/fresh/navigation/onboarding/FreshTabOnboardingDialog;", "Landroidx/fragment/app/k;", "<init>", "()V", "Lru/ozon/app/android/fresh/navigation/onboarding/OnBoardingVO;", "onBoardingVO", "", "startAnimation", "(Lru/ozon/app/android/fresh/navigation/onboarding/OnBoardingVO;)V", "Landroid/view/View;", "Landroid/animation/Animator;", "fadeInAnimator", "(Landroid/view/View;)Landroid/animation/Animator;", "initScreenAnalytics", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "view", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "", "getTheme", "()I", "onStop", "onDestroyView", "Lru/ozon/app/android/fresh/navigation/onboarding/FreshTabOnboardingViewModel;", "viewmodel", "Lru/ozon/app/android/fresh/navigation/onboarding/FreshTabOnboardingViewModel;", "getViewmodel", "()Lru/ozon/app/android/fresh/navigation/onboarding/FreshTabOnboardingViewModel;", "setViewmodel", "(Lru/ozon/app/android/fresh/navigation/onboarding/FreshTabOnboardingViewModel;)V", "LGZ/g;", "ozonRouter", "LGZ/g;", "getOzonRouter", "()LGZ/g;", "setOzonRouter", "(LGZ/g;)V", "LSg/a;", "Lru/ozon/app/android/analytics/AnalyticsScreenStorage;", "analyticsScreenStorage", "LSg/a;", "getAnalyticsScreenStorage$navigation_prodGoogleAllVendorsRelease", "()LSg/a;", "setAnalyticsScreenStorage$navigation_prodGoogleAllVendorsRelease", "(LSg/a;)V", "getAnalyticsScreenStorage$navigation_prodGoogleAllVendorsRelease$annotations", "onBoardingAnimation", "Landroid/animation/Animator;", "Lru/ozon/app/android/fresh/navigation/databinding/DialogFragmentFreshTabOnboardingBinding;", "_binding", "Lru/ozon/app/android/fresh/navigation/databinding/DialogFragmentFreshTabOnboardingBinding;", "Companion", "navigation_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class FreshTabOnboardingDialog extends DialogInterfaceOnCancelListenerC5390k {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private DialogFragmentFreshTabOnboardingBinding _binding;
    public a analyticsScreenStorage;
    private Animator onBoardingAnimation;
    public g ozonRouter;
    public FreshTabOnboardingViewModel viewmodel;

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J,\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0005H\u0007R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lru/ozon/app/android/fresh/navigation/onboarding/FreshTabOnboardingDialog$Companion;", "", "<init>", "()V", "TITLE_KEY", "", "DESCRIPTION_KEY", "IMAGE_KEY", "newInstance", "Lru/ozon/app/android/fresh/navigation/onboarding/FreshTabOnboardingDialog;", SelectionItemFormDTO.TITLE_FIELD_NAME, "description", "image", "navigation_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final FreshTabOnboardingDialog newInstance(String title, String description, String image) {
            FreshTabOnboardingDialog freshTabOnboardingDialog = new FreshTabOnboardingDialog();
            Bundle bundle = new Bundle();
            bundle.putString("TITLE_KEY", title);
            bundle.putString("DESCRIPTION_KEY", description);
            bundle.putString("IMAGE_KEY", image);
            freshTabOnboardingDialog.setArguments(bundle);
            return freshTabOnboardingDialog;
        }

        private Companion() {
        }
    }

    private final Animator fadeInAnimator(final View view) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, (Property<View, Float>) View.ALPHA, 0.0f, 1.0f);
        Intrinsics.f(ofFloat);
        ofFloat.addListener(new Animator.AnimatorListener() { // from class: ru.ozon.app.android.fresh.navigation.onboarding.FreshTabOnboardingDialog$fadeInAnimator$lambda$4$$inlined$doOnStart$1
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(@NotNull Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(@NotNull Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(@NotNull Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(@NotNull Animator animator) {
                view.setVisibility(0);
            }
        });
        ofFloat.start();
        Intrinsics.checkNotNullExpressionValue(ofFloat, "apply(...)");
        return ofFloat;
    }

    private final void initScreenAnalytics() {
        a analyticsScreenStorage$navigation_prodGoogleAllVendorsRelease = getAnalyticsScreenStorage$navigation_prodGoogleAllVendorsRelease();
        b.a(analyticsScreenStorage$navigation_prodGoogleAllVendorsRelease, this);
        analyticsScreenStorage$navigation_prodGoogleAllVendorsRelease.c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onViewCreated$lambda$0(FreshTabOnboardingDialog freshTabOnboardingDialog, View view) {
        freshTabOnboardingDialog.getViewmodel().onFreshTabClicked();
        g ozonRouter = freshTabOnboardingDialog.getOzonRouter();
        String builder = MiniAppExtKt.appendExpress(LinkGenerator.INSTANCE.express()).toString();
        Intrinsics.checkNotNullExpressionValue(builder, "toString(...)");
        g.a.a(ozonRouter, builder, null, null, 6);
        freshTabOnboardingDialog.dismissAllowingStateLoss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onViewCreated$lambda$1(FreshTabOnboardingDialog freshTabOnboardingDialog, View view) {
        freshTabOnboardingDialog.getViewmodel().onCloseIconClicked();
        freshTabOnboardingDialog.dismissAllowingStateLoss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onViewCreated$lambda$2(FreshTabOnboardingDialog freshTabOnboardingDialog, View view) {
        freshTabOnboardingDialog.getViewmodel().onBackgroundClicked();
        freshTabOnboardingDialog.dismissAllowingStateLoss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void startAnimation(OnBoardingVO onBoardingVO) {
        DialogFragmentFreshTabOnboardingBinding dialogFragmentFreshTabOnboardingBinding = this._binding;
        if (dialogFragmentFreshTabOnboardingBinding == null) {
            return;
        }
        dialogFragmentFreshTabOnboardingBinding.onBoardingTitle.setText(onBoardingVO.getTitle());
        dialogFragmentFreshTabOnboardingBinding.onBoardingDescription.setText(onBoardingVO.getDescription());
        ImageView onBoardingImage = dialogFragmentFreshTabOnboardingBinding.onBoardingImage;
        Intrinsics.checkNotNullExpressionValue(onBoardingImage, "onBoardingImage");
        ImageViewExtKt.load$default(onBoardingImage, onBoardingVO.getImage(), C7714v.a0(new ImageTransformation.FitWidthCropHeight(ImageTransformation.FitWidthCropHeight.CropType.TOP)), null, null, null, false, null, 124, null);
        ConstraintLayout freshTabOnboardingRoot = dialogFragmentFreshTabOnboardingBinding.freshTabOnboardingRoot;
        Intrinsics.checkNotNullExpressionValue(freshTabOnboardingRoot, "freshTabOnboardingRoot");
        this.onBoardingAnimation = fadeInAnimator(freshTabOnboardingRoot);
    }

    @NotNull
    public final a getAnalyticsScreenStorage$navigation_prodGoogleAllVendorsRelease() {
        a aVar = this.analyticsScreenStorage;
        if (aVar != null) {
            return aVar;
        }
        Intrinsics.n("analyticsScreenStorage");
        throw null;
    }

    @NotNull
    public final g getOzonRouter() {
        g gVar = this.ozonRouter;
        if (gVar != null) {
            return gVar;
        }
        Intrinsics.n("ozonRouter");
        throw null;
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC5390k
    public int getTheme() {
        return R$style.FreshTabOnboardingDialogTheme;
    }

    @NotNull
    public final FreshTabOnboardingViewModel getViewmodel() {
        FreshTabOnboardingViewModel freshTabOnboardingViewModel = this.viewmodel;
        if (freshTabOnboardingViewModel != null) {
            return freshTabOnboardingViewModel;
        }
        Intrinsics.n("viewmodel");
        throw null;
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC5390k, androidx.fragment.app.ComponentCallbacksC5392m
    public void onCreate(Bundle savedInstanceState) {
        FreshTabOnboardingComponent.Factory factory = DaggerFreshTabOnboardingComponent.factory();
        C6740b dependencyStorage = C6739a.b(this, ContextComponentDependencies.class).getDependencyStorage();
        if (ContextComponentDependencies.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component ContextComponentDependencies is not DiComponent");
        }
        ContextComponentDependencies contextComponentDependencies = (ContextComponentDependencies) dependencyStorage.b(ContextComponentDependencies.class);
        C6740b dependencyStorage2 = C6739a.b(this, NavigationComponentApi.class).getDependencyStorage();
        if (NavigationComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component NavigationComponentApi is not DiComponent");
        }
        NavigationComponentApi navigationComponentApi = (NavigationComponentApi) dependencyStorage2.b(NavigationComponentApi.class);
        C6740b dependencyStorage3 = C6739a.b(this, AnalyticsComponentApi.class).getDependencyStorage();
        if (AnalyticsComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component AnalyticsComponentApi is not DiComponent");
        }
        AnalyticsComponentApi analyticsComponentApi = (AnalyticsComponentApi) dependencyStorage3.b(AnalyticsComponentApi.class);
        C6740b dependencyStorage4 = C6739a.b(this, AnalyticsScreenStorageComponentApi.class).getDependencyStorage();
        if (AnalyticsScreenStorageComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component AnalyticsScreenStorageComponentApi is not DiComponent");
        }
        factory.create(contextComponentDependencies, navigationComponentApi, analyticsComponentApi, (AnalyticsScreenStorageComponentApi) dependencyStorage4.b(AnalyticsScreenStorageComponentApi.class)).inject(this);
        super.onCreate(savedInstanceState);
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    @NotNull
    public View onCreateView(@NotNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        View inflate = inflater.inflate(R$layout.dialog_fragment_fresh_tab_onboarding, container);
        this._binding = DialogFragmentFreshTabOnboardingBinding.bind(inflate);
        Intrinsics.f(inflate);
        return inflate;
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC5390k, androidx.fragment.app.ComponentCallbacksC5392m
    public void onDestroyView() {
        super.onDestroyView();
        this._binding = null;
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC5390k, androidx.fragment.app.ComponentCallbacksC5392m
    public void onStop() {
        Animator animator = this.onBoardingAnimation;
        if (animator != null) {
            animator.end();
        }
        this.onBoardingAnimation = null;
        super.onStop();
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    public void onViewCreated(@NotNull View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        initScreenAnalytics();
        DialogFragmentFreshTabOnboardingBinding dialogFragmentFreshTabOnboardingBinding = this._binding;
        if (dialogFragmentFreshTabOnboardingBinding == null) {
            return;
        }
        Bundle arguments = getArguments();
        String string = arguments != null ? arguments.getString("TITLE_KEY") : null;
        Bundle arguments2 = getArguments();
        String string2 = arguments2 != null ? arguments2.getString("DESCRIPTION_KEY") : null;
        Bundle arguments3 = getArguments();
        String string3 = arguments3 != null ? arguments3.getString("IMAGE_KEY") : null;
        dialogFragmentFreshTabOnboardingBinding.tooltipContainer.setClipToOutline(true);
        getViewmodel().getOnBoardingDialogState().observe(this, new FreshTabOnboardingDialog$sam$androidx_lifecycle_Observer$0(new FreshTabOnboardingDialog$onViewCreated$1(this)));
        dialogFragmentFreshTabOnboardingBinding.fakeFreshTab.setOnClickListener(new CG.b(this, 5));
        dialogFragmentFreshTabOnboardingBinding.onBoardingCloseIcon.setOnClickListener(new c(this, 4));
        dialogFragmentFreshTabOnboardingBinding.freshTabOnboardingRoot.setOnClickListener(new Ck.a(this, 5));
        getViewmodel().loadOnBoarding(string, string2, string3);
    }
}
