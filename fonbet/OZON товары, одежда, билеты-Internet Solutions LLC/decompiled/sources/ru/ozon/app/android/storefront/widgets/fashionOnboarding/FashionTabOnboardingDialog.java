package ru.ozon.app.android.storefront.widgets.fashionOnboarding;

import FK.b;
import GZ.g;
import Sg.a;
import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.os.Bundle;
import android.util.Property;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.ComponentCallbacksC5392m;
import androidx.fragment.app.DialogInterfaceOnCancelListenerC5390k;
import gi.C6739a;
import gi.C6740b;
import hi.InterfaceC6958a;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.analytics.di.AnalyticsComponentApi;
import ru.ozon.app.android.analytics.screen.storage.di.AnalyticsScreenStorageComponentApi;
import ru.ozon.app.android.di.provider.component.ContextComponentDependencies;
import ru.ozon.app.android.navigation.di.NavigationComponentApi;
import ru.ozon.app.android.pikazon.extensions.ImageViewExtKt;
import ru.ozon.app.android.pikazon.glide.transformations.ImageTransformation;
import ru.ozon.app.android.storefront.R$dimen;
import ru.ozon.app.android.storefront.R$style;
import ru.ozon.app.android.storefront.databinding.DialogFragmentFashionTabOnboardingBinding;
import ru.ozon.app.android.storefront.widgets.fashionOnboarding.di.DaggerFashionTabOnboardingComponent;
import ru.ozon.app.android.storefront.widgets.fashionOnboarding.di.FashionTabOnboardingComponent;
import ru.ozon.app.android.tabbar.R$id;
import ru.ozon.app.android.tabbar.ui.OzonBottomNavigationView;
import ru.ozon.app.android.tabbar.ui.OzonMenuItem;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;

@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\b\u0007\u0018\u0000 ?2\u00020\u0001:\u0001?B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\u00020\u0005*\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0013\u0010\u000f\u001a\u00020\u000e*\u00020\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0011\u0010\u0003J\u0019\u0010\u0014\u001a\u00020\n2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J+\u0010\u001a\u001a\u00020\r2\u0006\u0010\u0017\u001a\u00020\u00162\b\u0010\u0019\u001a\u0004\u0018\u00010\u00182\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ!\u0010\u001d\u001a\u00020\n2\u0006\u0010\u001c\u001a\u00020\r2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010 \u001a\u00020\u001fH\u0016¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\nH\u0016¢\u0006\u0004\b\"\u0010\u0003J\u000f\u0010#\u001a\u00020\nH\u0016¢\u0006\u0004\b#\u0010\u0003R\"\u0010%\u001a\u00020$8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R\"\u0010,\u001a\u00020+8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R,\u00104\u001a\u000602j\u0002`38\u0000@\u0000X\u0081.¢\u0006\u0018\n\u0004\b4\u00105\u0012\u0004\b:\u0010\u0003\u001a\u0004\b6\u00107\"\u0004\b8\u00109R\u0018\u0010;\u001a\u0004\u0018\u00010\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b;\u0010<R\u0018\u0010=\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b=\u0010>¨\u0006@"}, d2 = {"Lru/ozon/app/android/storefront/widgets/fashionOnboarding/FashionTabOnboardingDialog;", "Landroidx/fragment/app/k;", "<init>", "()V", "Lru/ozon/app/android/storefront/databinding/DialogFragmentFashionTabOnboardingBinding;", "", "bindFakeTab", "(Lru/ozon/app/android/storefront/databinding/DialogFragmentFashionTabOnboardingBinding;)Z", "Lru/ozon/app/android/storefront/widgets/fashionOnboarding/OnBoardingVO;", "onBoardingVO", "", "startAnimation", "(Lru/ozon/app/android/storefront/widgets/fashionOnboarding/OnBoardingVO;)V", "Landroid/view/View;", "Landroid/animation/Animator;", "fadeInAnimator", "(Landroid/view/View;)Landroid/animation/Animator;", "initScreenAnalytics", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "view", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "", "getTheme", "()I", "onStop", "onDestroyView", "Lru/ozon/app/android/storefront/widgets/fashionOnboarding/FashionTabOnboardingViewModel;", "viewmodel", "Lru/ozon/app/android/storefront/widgets/fashionOnboarding/FashionTabOnboardingViewModel;", "getViewmodel", "()Lru/ozon/app/android/storefront/widgets/fashionOnboarding/FashionTabOnboardingViewModel;", "setViewmodel", "(Lru/ozon/app/android/storefront/widgets/fashionOnboarding/FashionTabOnboardingViewModel;)V", "LGZ/g;", "ozonRouter", "LGZ/g;", "getOzonRouter", "()LGZ/g;", "setOzonRouter", "(LGZ/g;)V", "LSg/a;", "Lru/ozon/app/android/analytics/AnalyticsScreenStorage;", "analyticsScreenStorage", "LSg/a;", "getAnalyticsScreenStorage$storefront_prodGoogleAllVendorsRelease", "()LSg/a;", "setAnalyticsScreenStorage$storefront_prodGoogleAllVendorsRelease", "(LSg/a;)V", "getAnalyticsScreenStorage$storefront_prodGoogleAllVendorsRelease$annotations", "onBoardingAnimation", "Landroid/animation/Animator;", "_binding", "Lru/ozon/app/android/storefront/databinding/DialogFragmentFashionTabOnboardingBinding;", "Companion", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class FashionTabOnboardingDialog extends DialogInterfaceOnCancelListenerC5390k {
    private DialogFragmentFashionTabOnboardingBinding _binding;
    public a analyticsScreenStorage;
    private Animator onBoardingAnimation;
    public g ozonRouter;
    public FashionTabOnboardingViewModel viewmodel;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J<\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00052\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0005H\u0007R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lru/ozon/app/android/storefront/widgets/fashionOnboarding/FashionTabOnboardingDialog$Companion;", "", "<init>", "()V", "SELECTED_TAB_ID", "", "TAB_URL", "TITLE_KEY", "DESCRIPTION_KEY", "IMAGE_KEY", "newInstance", "Lru/ozon/app/android/storefront/widgets/fashionOnboarding/FashionTabOnboardingDialog;", "selectedTabId", "", "tabUrl", SelectionItemFormDTO.TITLE_FIELD_NAME, "description", "image", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final FashionTabOnboardingDialog newInstance(int selectedTabId, @NotNull String tabUrl, String title, String description, String image) {
            Intrinsics.checkNotNullParameter(tabUrl, "tabUrl");
            FashionTabOnboardingDialog fashionTabOnboardingDialog = new FashionTabOnboardingDialog();
            Bundle bundle = new Bundle();
            bundle.putInt("SELECTED_TAB_ID", selectedTabId);
            bundle.putString("TAB_URL", tabUrl);
            bundle.putString("TITLE_KEY", title);
            bundle.putString("DESCRIPTION_KEY", description);
            bundle.putString("IMAGE_KEY", image);
            fashionTabOnboardingDialog.setArguments(bundle);
            return fashionTabOnboardingDialog;
        }

        private Companion() {
        }
    }

    private final boolean bindFakeTab(DialogFragmentFashionTabOnboardingBinding dialogFragmentFashionTabOnboardingBinding) {
        String string;
        Object obj;
        ComponentCallbacksC5392m parentFragment;
        View view;
        Bundle arguments = getArguments();
        if (arguments != null) {
            int i11 = arguments.getInt("SELECTED_TAB_ID");
            Bundle arguments2 = getArguments();
            if (arguments2 != null && (string = arguments2.getString("TAB_URL")) != null) {
                ComponentCallbacksC5392m parentFragment2 = getParentFragment();
                OzonBottomNavigationView ozonBottomNavigationView = (parentFragment2 == null || (parentFragment = parentFragment2.getParentFragment()) == null || (view = parentFragment.getView()) == null) ? null : (OzonBottomNavigationView) view.findViewById(R$id.bottomNavigation);
                View findViewById = ozonBottomNavigationView != null ? ozonBottomNavigationView.findViewById(i11) : null;
                if (findViewById == null) {
                    dismissAllowingStateLoss();
                    return false;
                }
                Iterator<T> it = ozonBottomNavigationView.getMenu().getOzonMenuItems().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    if (((OzonMenuItem) obj).getItemId() == i11) {
                        break;
                    }
                }
                OzonMenuItem ozonMenuItem = (OzonMenuItem) obj;
                dialogFragmentFashionTabOnboardingBinding.fakeFashionTab.setImageDrawable(ozonMenuItem != null ? ozonMenuItem.getIcon() : null);
                dialogFragmentFashionTabOnboardingBinding.fakeTabContainer.setTranslationX((findViewById.getX() + (findViewById.getMeasuredWidth() / 2)) - (getResources().getDimension(R$dimen.fashion_tab_width) / 2));
                dialogFragmentFashionTabOnboardingBinding.fakeTabContainer.setTranslationY(findViewById.getY());
                dialogFragmentFashionTabOnboardingBinding.fakeTabContainer.setOnClickListener(new b(0, this, string));
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bindFakeTab$lambda$3(FashionTabOnboardingDialog fashionTabOnboardingDialog, String str, View view) {
        fashionTabOnboardingDialog.getViewmodel().onFashionTabClicked();
        g.a.a(fashionTabOnboardingDialog.getOzonRouter(), str, null, null, 6);
        fashionTabOnboardingDialog.dismissAllowingStateLoss();
    }

    private final Animator fadeInAnimator(final View view) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, (Property<View, Float>) View.ALPHA, 0.0f, 1.0f);
        Intrinsics.f(ofFloat);
        ofFloat.addListener(new Animator.AnimatorListener() { // from class: ru.ozon.app.android.storefront.widgets.fashionOnboarding.FashionTabOnboardingDialog$fadeInAnimator$lambda$5$$inlined$doOnStart$1
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
        a analyticsScreenStorage$storefront_prodGoogleAllVendorsRelease = getAnalyticsScreenStorage$storefront_prodGoogleAllVendorsRelease();
        Sg.b.a(analyticsScreenStorage$storefront_prodGoogleAllVendorsRelease, this);
        analyticsScreenStorage$storefront_prodGoogleAllVendorsRelease.c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onViewCreated$lambda$0(FashionTabOnboardingDialog fashionTabOnboardingDialog, View view) {
        fashionTabOnboardingDialog.getViewmodel().onCloseIconClicked();
        fashionTabOnboardingDialog.dismissAllowingStateLoss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onViewCreated$lambda$1(FashionTabOnboardingDialog fashionTabOnboardingDialog, View view) {
        fashionTabOnboardingDialog.getViewmodel().onBackgroundClicked();
        fashionTabOnboardingDialog.dismissAllowingStateLoss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void startAnimation(OnBoardingVO onBoardingVO) {
        DialogFragmentFashionTabOnboardingBinding dialogFragmentFashionTabOnboardingBinding = this._binding;
        if (dialogFragmentFashionTabOnboardingBinding == null) {
            return;
        }
        dialogFragmentFashionTabOnboardingBinding.onBoardingTitle.setText(onBoardingVO.getTitle());
        dialogFragmentFashionTabOnboardingBinding.onBoardingDescription.setText(onBoardingVO.getDescription());
        ImageView onBoardingImage = dialogFragmentFashionTabOnboardingBinding.onBoardingImage;
        Intrinsics.checkNotNullExpressionValue(onBoardingImage, "onBoardingImage");
        ImageViewExtKt.load$default(onBoardingImage, onBoardingVO.getImage(), C7714v.a0(new ImageTransformation.FitWidthCropHeight(ImageTransformation.FitWidthCropHeight.CropType.TOP)), null, null, null, false, null, 124, null);
        ConstraintLayout fashionTabOnboardingRoot = dialogFragmentFashionTabOnboardingBinding.fashionTabOnboardingRoot;
        Intrinsics.checkNotNullExpressionValue(fashionTabOnboardingRoot, "fashionTabOnboardingRoot");
        this.onBoardingAnimation = fadeInAnimator(fashionTabOnboardingRoot);
    }

    @NotNull
    public final a getAnalyticsScreenStorage$storefront_prodGoogleAllVendorsRelease() {
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
        return R$style.FashionTabOnboardingDialogTheme;
    }

    @NotNull
    public final FashionTabOnboardingViewModel getViewmodel() {
        FashionTabOnboardingViewModel fashionTabOnboardingViewModel = this.viewmodel;
        if (fashionTabOnboardingViewModel != null) {
            return fashionTabOnboardingViewModel;
        }
        Intrinsics.n("viewmodel");
        throw null;
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC5390k, androidx.fragment.app.ComponentCallbacksC5392m
    public void onCreate(Bundle savedInstanceState) {
        FashionTabOnboardingComponent.Factory factory = DaggerFashionTabOnboardingComponent.factory();
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
        DialogFragmentFashionTabOnboardingBinding inflate = DialogFragmentFashionTabOnboardingBinding.inflate(inflater, container, false);
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(...)");
        this._binding = inflate;
        ConstraintLayout constraintLayout = inflate.getConstraintLayout();
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "getRoot(...)");
        return constraintLayout;
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
        DialogFragmentFashionTabOnboardingBinding dialogFragmentFashionTabOnboardingBinding = this._binding;
        if (dialogFragmentFashionTabOnboardingBinding == null) {
            return;
        }
        Bundle arguments = getArguments();
        String string = arguments != null ? arguments.getString("TITLE_KEY") : null;
        Bundle arguments2 = getArguments();
        String string2 = arguments2 != null ? arguments2.getString("DESCRIPTION_KEY") : null;
        Bundle arguments3 = getArguments();
        String string3 = arguments3 != null ? arguments3.getString("IMAGE_KEY") : null;
        if (bindFakeTab(dialogFragmentFashionTabOnboardingBinding)) {
            dialogFragmentFashionTabOnboardingBinding.tooltipContainer.setClipToOutline(true);
            getViewmodel().getOnBoardingDialogState().observe(this, new FashionTabOnboardingDialog$sam$androidx_lifecycle_Observer$0(new FashionTabOnboardingDialog$onViewCreated$1(this)));
            dialogFragmentFashionTabOnboardingBinding.onBoardingCloseIcon.setOnClickListener(new FK.a(this, 0));
            dialogFragmentFashionTabOnboardingBinding.fashionTabOnboardingRoot.setOnClickListener(new AS.a(this, 2));
            getViewmodel().loadOnBoarding(string, string2, string3);
        }
    }
}
