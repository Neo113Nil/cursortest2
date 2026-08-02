package ru.ozon.app.android.pdp.ui.configurators.monetization;

import B90.C2606h;
import android.os.Bundle;
import androidx.fragment.app.G;
import androidx.fragment.app.r;
import androidx.lifecycle.J;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l10.InterfaceC7851b;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.ConfiguratorReferences;
import ru.ozon.app.android.composer.universalscreen.view.ComposerScreenConfig;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0003J\u000f\u0010\u0006\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0006\u0010\u0003J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lru/ozon/app/android/pdp/ui/configurators/monetization/RefreshAfterDismissAndPopPageConfigurator;", "Lru/ozon/app/android/composer/universalscreen/view/ComposerScreenConfig$PageConfigurator;", "<init>", "()V", "", "setRefreshResultListener", "onComposerInitialized", "Landroidx/lifecycle/J;", "owner", "onDestroy", "(Landroidx/lifecycle/J;)V", "configurators_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class RefreshAfterDismissAndPopPageConfigurator extends ComposerScreenConfig.PageConfigurator {
    private final void setRefreshResultListener() {
        G supportFragmentManager;
        r a11 = getContainer().a();
        if (a11 == null || (supportFragmentManager = a11.getSupportFragmentManager()) == null) {
            return;
        }
        supportFragmentManager.n1("refresh_after_dismiss_and_pop_key", getContainer().f(), new C2606h(this, 6));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setRefreshResultListener$lambda$0(RefreshAfterDismissAndPopPageConfigurator refreshAfterDismissAndPopPageConfigurator, String str, Bundle data) {
        InterfaceC7851b controller;
        Intrinsics.checkNotNullParameter(str, "<unused var>");
        Intrinsics.checkNotNullParameter(data, "data");
        ConfiguratorReferences references = refreshAfterDismissAndPopPageConfigurator.getReferences();
        if (references == null || (controller = references.getController()) == null) {
            return;
        }
        InterfaceC7851b.a.a(controller, null, null, null, null, 15);
    }

    @Override // ru.ozon.app.android.composer.universalscreen.view.ComposerScreenConfig.PageConfigurator
    protected void onComposerInitialized() {
        setRefreshResultListener();
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onDestroy(@NotNull J owner) {
        G supportFragmentManager;
        Intrinsics.checkNotNullParameter(owner, "owner");
        r a11 = getContainer().a();
        if (a11 == null || (supportFragmentManager = a11.getSupportFragmentManager()) == null) {
            return;
        }
        supportFragmentManager.s("refresh_after_dismiss_and_pop_key");
    }
}
