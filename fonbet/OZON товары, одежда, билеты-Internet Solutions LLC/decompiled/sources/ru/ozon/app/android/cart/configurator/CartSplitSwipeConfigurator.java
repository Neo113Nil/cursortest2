package ru.ozon.app.android.cart.configurator;

import Pc.a;
import Sc.InterfaceC4008j;
import a00.C4911f;
import android.content.SharedPreferences;
import android.view.View;
import androidx.fragment.app.ComponentCallbacksC5392m;
import androidx.lifecycle.J;
import androidx.lifecycle.K;
import androidx.lifecycle.w0;
import androidx.lifecycle.z0;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.cart.cartSplitV2.v2.util.swipeToDelete.SwipeOnboarding;
import ru.ozon.app.android.cart.cartSplitV2.v2.util.swipeToDelete.SwipeViewModel;
import ru.ozon.app.android.cart.cartSplitV2.v2.util.swipeToDelete.coordinator.GroupSwipeCoordinator;
import ru.ozon.app.android.cart.flags.CartSwipeOnboardingEnabled;
import ru.ozon.app.android.composer.ConfiguratorReferences;
import ru.ozon.app.android.composer.universalscreen.view.ComposerScreenConfig;
import ru.ozon.app.android.composer.view.ComposerViewExtensionKt;
import ru.ozon.app.android.network.abtool.FeatureChecker;
import ru.ozon.app.android.utils.LazyUtilsKt;
import xe.B0;
import xe.C10727i;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u001f\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\u000bJ\u000f\u0010\r\u001a\u00020\tH\u0014¢\u0006\u0004\b\r\u0010\u000bJ\u0017\u0010\u0010\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0012\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0012\u0010\u0011J\u0017\u0010\u0013\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0013\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0014\u0010\u0011R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0015R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0016R\u0018\u0010\u0017\u001a\u0004\u0018\u00010\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001d\u0010\u001e\u001a\u0004\u0018\u00010\u00198BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001b\u0010#\u001a\u00020\u001f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b \u0010\u001b\u001a\u0004\b!\u0010\"R$\u0010%\u001a\u0004\u0018\u00010$8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R\u0016\u0010.\u001a\u0004\u0018\u00010+8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b,\u0010-¨\u0006/"}, d2 = {"Lru/ozon/app/android/cart/configurator/CartSplitSwipeConfigurator;", "Lru/ozon/app/android/composer/universalscreen/view/ComposerScreenConfig$PageConfigurator;", "Lru/ozon/app/android/network/abtool/FeatureChecker;", "featureChecker", "LPc/a;", "Lru/ozon/app/android/cart/cartSplitV2/v2/util/swipeToDelete/SwipeViewModel;", "pSwipeViewModel", "<init>", "(Lru/ozon/app/android/network/abtool/FeatureChecker;LPc/a;)V", "", "showSwipeOnboarding", "()V", "cancelSwipeOnboarding", "onComposerInitialized", "Landroidx/lifecycle/J;", "owner", "onStart", "(Landroidx/lifecycle/J;)V", "onResume", "onStop", "onDestroy", "Lru/ozon/app/android/network/abtool/FeatureChecker;", "LPc/a;", "swipeViewModel", "Lru/ozon/app/android/cart/cartSplitV2/v2/util/swipeToDelete/SwipeViewModel;", "Landroid/content/SharedPreferences;", "sharedPreferences$delegate", "LSc/j;", "getSharedPreferences", "()Landroid/content/SharedPreferences;", "sharedPreferences", "Lru/ozon/app/android/cart/cartSplitV2/v2/util/swipeToDelete/SwipeOnboarding;", "swipeOnboarding$delegate", "getSwipeOnboarding", "()Lru/ozon/app/android/cart/cartSplitV2/v2/util/swipeToDelete/SwipeOnboarding;", "swipeOnboarding", "Lxe/B0;", "onboardingJob", "Lxe/B0;", "getOnboardingJob", "()Lxe/B0;", "setOnboardingJob", "(Lxe/B0;)V", "Landroidx/recyclerview/widget/RecyclerView;", "getComposerRv", "()Landroidx/recyclerview/widget/RecyclerView;", "composerRv", "cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class CartSplitSwipeConfigurator extends ComposerScreenConfig.PageConfigurator {

    @NotNull
    private final FeatureChecker featureChecker;
    private B0 onboardingJob;

    @NotNull
    private final a<SwipeViewModel> pSwipeViewModel;

    /* renamed from: sharedPreferences$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j sharedPreferences;

    /* renamed from: swipeOnboarding$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j swipeOnboarding;
    private SwipeViewModel swipeViewModel;

    public CartSplitSwipeConfigurator(@NotNull FeatureChecker featureChecker, @NotNull a<SwipeViewModel> pSwipeViewModel) {
        Intrinsics.checkNotNullParameter(featureChecker, "featureChecker");
        Intrinsics.checkNotNullParameter(pSwipeViewModel, "pSwipeViewModel");
        this.featureChecker = featureChecker;
        this.pSwipeViewModel = pSwipeViewModel;
        this.sharedPreferences = LazyUtilsKt.unsafeLazy(new CartSplitSwipeConfigurator$sharedPreferences$2(this));
        this.swipeOnboarding = LazyUtilsKt.unsafeLazy(new CartSplitSwipeConfigurator$swipeOnboarding$2(this));
    }

    private final void cancelSwipeOnboarding() {
        B0 b02 = this.onboardingJob;
        if (b02 != null) {
            b02.j(null);
        }
        this.onboardingJob = null;
    }

    private final RecyclerView getComposerRv() {
        C4911f ownerContainer;
        ComponentCallbacksC5392m c11;
        View view;
        ConfiguratorReferences references = getReferences();
        if (references == null || (ownerContainer = references.getOwnerContainer()) == null || (c11 = ownerContainer.c()) == null || (view = c11.getView()) == null) {
            return null;
        }
        return ComposerViewExtensionKt.composerRecyclerView(view);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final SharedPreferences getSharedPreferences() {
        return (SharedPreferences) this.sharedPreferences.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final SwipeOnboarding getSwipeOnboarding() {
        return (SwipeOnboarding) this.swipeOnboarding.getValue();
    }

    private final void showSwipeOnboarding() {
        B0 b02 = this.onboardingJob;
        if (b02 != null) {
            b02.j(null);
        }
        this.onboardingJob = C10727i.c(K.a(getOwner()), null, null, new CartSplitSwipeConfigurator$showSwipeOnboarding$1(this, null), 3);
    }

    @Override // ru.ozon.app.android.composer.universalscreen.view.ComposerScreenConfig.PageConfigurator
    protected void onComposerInitialized() {
        C4911f ownerContainer;
        ComponentCallbacksC5392m c11;
        super.onComposerInitialized();
        ConfiguratorReferences references = getReferences();
        this.swipeViewModel = (references == null || (ownerContainer = references.getOwnerContainer()) == null || (c11 = ownerContainer.c()) == null) ? null : (SwipeViewModel) new z0(c11, new z0.c() { // from class: ru.ozon.app.android.cart.configurator.CartSplitSwipeConfigurator$onComposerInitialized$$inlined$viewModel$1
            @Override // androidx.lifecycle.z0.c, androidx.lifecycle.z0.b
            public <T extends w0> T create(Class<T> modelClass) {
                a aVar;
                Intrinsics.checkNotNullParameter(modelClass, "modelClass");
                aVar = CartSplitSwipeConfigurator.this.pSwipeViewModel;
                SwipeViewModel swipeViewModel = (SwipeViewModel) aVar.get();
                Intrinsics.g(swipeViewModel, "null cannot be cast to non-null type T of ru.ozon.app.android.utils.lifecycle.ViewModelExtKt.vmFactory.<no name provided>.create");
                return swipeViewModel;
            }
        }).a(SwipeViewModel.class);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onDestroy(@NotNull J owner) {
        GroupSwipeCoordinator swipeGroupCoordinator;
        Intrinsics.checkNotNullParameter(owner, "owner");
        super.onDestroy(owner);
        SwipeViewModel swipeViewModel = this.swipeViewModel;
        if (swipeViewModel != null && (swipeGroupCoordinator = swipeViewModel.getSwipeGroupCoordinator()) != null) {
            swipeGroupCoordinator.onDestroy();
        }
        cancelSwipeOnboarding();
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onResume(@NotNull J owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        super.onResume(owner);
        if (this.featureChecker.isEnabled(CartSwipeOnboardingEnabled.INSTANCE)) {
            showSwipeOnboarding();
        }
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onStart(@NotNull J owner) {
        SwipeViewModel swipeViewModel;
        GroupSwipeCoordinator swipeGroupCoordinator;
        Intrinsics.checkNotNullParameter(owner, "owner");
        super.onStart(owner);
        RecyclerView composerRv = getComposerRv();
        if (composerRv == null || (swipeViewModel = this.swipeViewModel) == null || (swipeGroupCoordinator = swipeViewModel.getSwipeGroupCoordinator()) == null) {
            return;
        }
        swipeGroupCoordinator.onAttach(composerRv);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onStop(@NotNull J owner) {
        GroupSwipeCoordinator swipeGroupCoordinator;
        Intrinsics.checkNotNullParameter(owner, "owner");
        super.onStop(owner);
        SwipeViewModel swipeViewModel = this.swipeViewModel;
        if (swipeViewModel != null && (swipeGroupCoordinator = swipeViewModel.getSwipeGroupCoordinator()) != null) {
            swipeGroupCoordinator.onDetach();
        }
        showSwipeOnboarding();
    }
}
