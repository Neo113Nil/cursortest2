package ru.ozon.app.android.checkoutorderdone.orderdone.configurators;

import A00.a;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.J;
import androidx.lifecycle.ProcessLifecycleOwner;
import i10.h;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l10.InterfaceC7851b;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.ConfiguratorReferences;
import ru.ozon.app.android.composer.universalscreen.view.ComposerScreenConfig;

@Metadata(d1 = {"\u0000!\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\b\u0004*\u0001\n\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0005\u0010\u0003J\u0017\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lru/ozon/app/android/checkoutorderdone/orderdone/configurators/RefreshOnStartPageConfigurator;", "Lru/ozon/app/android/composer/universalscreen/view/ComposerScreenConfig$PageConfigurator;", "<init>", "()V", "", "onComposerInitialized", "Landroidx/lifecycle/J;", "owner", "onDestroy", "(Landroidx/lifecycle/J;)V", "ru/ozon/app/android/checkoutorderdone/orderdone/configurators/RefreshOnStartPageConfigurator$lifecycleObserver$1", "lifecycleObserver", "Lru/ozon/app/android/checkoutorderdone/orderdone/configurators/RefreshOnStartPageConfigurator$lifecycleObserver$1;", "orderdone_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class RefreshOnStartPageConfigurator extends ComposerScreenConfig.PageConfigurator {

    @NotNull
    private final RefreshOnStartPageConfigurator$lifecycleObserver$1 lifecycleObserver = new DefaultLifecycleObserver() { // from class: ru.ozon.app.android.checkoutorderdone.orderdone.configurators.RefreshOnStartPageConfigurator$lifecycleObserver$1
        private boolean skipRefresh = true;

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public void onStart(J owner) {
            InterfaceC7851b controller;
            Intrinsics.checkNotNullParameter(owner, "owner");
            if (this.skipRefresh) {
                this.skipRefresh = false;
                return;
            }
            ConfiguratorReferences references = RefreshOnStartPageConfigurator.this.getReferences();
            if (references == null || (controller = references.getController()) == null) {
                return;
            }
            InterfaceC7851b.a.a(controller, null, null, null, new h.b(new a.C.C0000a(0, false), null, 2), 7);
        }
    };

    @Override // ru.ozon.app.android.composer.universalscreen.view.ComposerScreenConfig.PageConfigurator
    protected void onComposerInitialized() {
        ProcessLifecycleOwner processLifecycleOwner;
        int i11 = ProcessLifecycleOwner.f43231j;
        processLifecycleOwner = ProcessLifecycleOwner.f43230i;
        processLifecycleOwner.getLifecycle().a(this.lifecycleObserver);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onDestroy(@NotNull J owner) {
        ProcessLifecycleOwner processLifecycleOwner;
        Intrinsics.checkNotNullParameter(owner, "owner");
        int i11 = ProcessLifecycleOwner.f43231j;
        processLifecycleOwner = ProcessLifecycleOwner.f43230i;
        processLifecycleOwner.getLifecycle().e(this.lifecycleObserver);
    }
}
