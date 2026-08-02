package ru.ozon.app.android.cart.configurator;

import GZ.g;
import GZ.l;
import androidx.activity.C;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.J;
import androidx.lifecycle.ProcessLifecycleOwner;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.cart.common.domain.delegate.CartModeManager;
import ru.ozon.app.android.composer.universalscreen.view.ComposerScreenConfig;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0004*\u0002\u0018\u001b\b\u0007\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\r\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\r\u0010\fJ\u0017\u0010\u000e\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000e\u0010\fJ\u000f\u0010\u000f\u001a\u00020\nH\u0014¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0011\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0011\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0012R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0013R\u0016\u0010\u0015\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0016\u0010\u0017\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0016R\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001c\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"Lru/ozon/app/android/cart/configurator/ResetCartModeConfigurator;", "Lru/ozon/app/android/composer/universalscreen/view/ComposerScreenConfig$PageConfigurator;", "Lru/ozon/app/android/cart/common/domain/delegate/CartModeManager;", "cartModeManager", "LGZ/g;", "ozonRouter", "<init>", "(Lru/ozon/app/android/cart/common/domain/delegate/CartModeManager;LGZ/g;)V", "Landroidx/lifecycle/J;", "owner", "", "onStart", "(Landroidx/lifecycle/J;)V", "onStop", "onDestroy", "onComposerInitialized", "()V", "onCreate", "Lru/ozon/app/android/cart/common/domain/delegate/CartModeManager;", "LGZ/g;", "", "needSetCartViewMode", "Z", "needResetCartManagerState", "ru/ozon/app/android/cart/configurator/ResetCartModeConfigurator$backPressedCallback$1", "backPressedCallback", "Lru/ozon/app/android/cart/configurator/ResetCartModeConfigurator$backPressedCallback$1;", "ru/ozon/app/android/cart/configurator/ResetCartModeConfigurator$lifecycleObserver$1", "lifecycleObserver", "Lru/ozon/app/android/cart/configurator/ResetCartModeConfigurator$lifecycleObserver$1;", "cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ResetCartModeConfigurator extends ComposerScreenConfig.PageConfigurator {

    @NotNull
    private final ResetCartModeConfigurator$backPressedCallback$1 backPressedCallback;

    @NotNull
    private final CartModeManager cartModeManager;

    @NotNull
    private final ResetCartModeConfigurator$lifecycleObserver$1 lifecycleObserver;
    private boolean needResetCartManagerState;
    private boolean needSetCartViewMode;

    @NotNull
    private final g ozonRouter;

    /* JADX WARN: Type inference failed for: r2v2, types: [ru.ozon.app.android.cart.configurator.ResetCartModeConfigurator$backPressedCallback$1] */
    /* JADX WARN: Type inference failed for: r2v3, types: [ru.ozon.app.android.cart.configurator.ResetCartModeConfigurator$lifecycleObserver$1] */
    public ResetCartModeConfigurator(@NotNull CartModeManager cartModeManager, @NotNull g ozonRouter) {
        Intrinsics.checkNotNullParameter(cartModeManager, "cartModeManager");
        Intrinsics.checkNotNullParameter(ozonRouter, "ozonRouter");
        this.cartModeManager = cartModeManager;
        this.ozonRouter = ozonRouter;
        this.needResetCartManagerState = true;
        this.backPressedCallback = new C() { // from class: ru.ozon.app.android.cart.configurator.ResetCartModeConfigurator$backPressedCallback$1
            {
                super(true);
            }

            @Override // androidx.activity.C
            public void handleOnBackPressed() {
                CartModeManager cartModeManager2;
                g gVar;
                cartModeManager2 = ResetCartModeConfigurator.this.cartModeManager;
                if (cartModeManager2.enableResetForPartialClose()) {
                    ResetCartModeConfigurator.this.needResetCartManagerState = false;
                }
                gVar = ResetCartModeConfigurator.this.ozonRouter;
                l.a(gVar);
            }
        };
        this.lifecycleObserver = new DefaultLifecycleObserver() { // from class: ru.ozon.app.android.cart.configurator.ResetCartModeConfigurator$lifecycleObserver$1
            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public void onStop(J owner) {
                CartModeManager cartModeManager2;
                Intrinsics.checkNotNullParameter(owner, "owner");
                super.onStop(owner);
                cartModeManager2 = ResetCartModeConfigurator.this.cartModeManager;
                if (cartModeManager2.enabledResetPerAction()) {
                    ResetCartModeConfigurator.this.needSetCartViewMode = false;
                }
            }
        };
    }

    @Override // ru.ozon.app.android.composer.universalscreen.view.ComposerScreenConfig.PageConfigurator
    protected void onComposerInitialized() {
        ProcessLifecycleOwner processLifecycleOwner;
        int i11 = ProcessLifecycleOwner.f43231j;
        processLifecycleOwner = ProcessLifecycleOwner.f43230i;
        processLifecycleOwner.getLifecycle().a(this.lifecycleObserver);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onCreate(@NotNull J owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        super.onCreate(owner);
        getContainer().i().getOnBackPressedDispatcher().h(owner, this.backPressedCallback);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onDestroy(@NotNull J owner) {
        ProcessLifecycleOwner processLifecycleOwner;
        Intrinsics.checkNotNullParameter(owner, "owner");
        if (this.needResetCartManagerState) {
            this.cartModeManager.resetState();
        } else {
            this.needResetCartManagerState = true;
        }
        int i11 = ProcessLifecycleOwner.f43231j;
        processLifecycleOwner = ProcessLifecycleOwner.f43230i;
        processLifecycleOwner.getLifecycle().e(this.lifecycleObserver);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onStart(@NotNull J owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        super.onStart(owner);
        if (this.cartModeManager.enabledCartModes()) {
            this.cartModeManager.stopResetCartModes();
        }
        if (this.cartModeManager.enabledResetPerAction() && this.needSetCartViewMode) {
            this.cartModeManager.setCartViewMode();
        }
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onStop(@NotNull J owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        super.onStop(owner);
        if (this.cartModeManager.enabledResetPerAction()) {
            this.needSetCartViewMode = true;
        }
    }
}
