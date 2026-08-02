package ru.ozon.app.android.pdp.ui.configurators.monetization.edgeConfigurator;

import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.core.view.Q0;
import androidx.fragment.app.ComponentCallbacksC5392m;
import androidx.fragment.app.r;
import androidx.lifecycle.J;
import androidx.lifecycle.K;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.universalscreen.view.ComposerScreenConfig;
import ru.ozon.app.android.composer.view.ComposerViewExtensionKt;
import ru.ozon.app.android.pdp.ui.configurators.monetization.edgeConfigurator.EdgeConfigurator.BackupValues;
import xe.C10727i;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\t\b'\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003:\u0001 B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\u0005J\u000f\u0010\b\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\b\u0010\u0005J'\u0010\u000f\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH&¢\u0006\u0004\b\u000f\u0010\u0010J'\u0010\u0011\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH&¢\u0006\u0004\b\u0011\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u0012\u0010\u0005J\u0017\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0017\u0010\u0016R\u0016\u0010\u0019\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u001e\u0010\u001f\u001a\u0004\u0018\u00018\u00008$@$X¤\u000e¢\u0006\f\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001e¨\u0006!"}, d2 = {"Lru/ozon/app/android/pdp/ui/configurators/monetization/edgeConfigurator/EdgeConfigurator;", "Lru/ozon/app/android/pdp/ui/configurators/monetization/edgeConfigurator/EdgeConfigurator$BackupValues;", "T", "Lru/ozon/app/android/composer/universalscreen/view/ComposerScreenConfig$PageConfigurator;", "<init>", "()V", "", "tryToApplyWindowSettings", "tryToRestoreWindowSettings", "Landroid/view/ViewGroup;", "composerContainer", "Landroid/view/Window;", "window", "Landroidx/core/view/Q0;", "insetsController", "applyWindowSettings", "(Landroid/view/ViewGroup;Landroid/view/Window;Landroidx/core/view/Q0;)V", "restoreWindowSettings", "onComposerInitialized", "Landroidx/lifecycle/J;", "owner", "onStart", "(Landroidx/lifecycle/J;)V", "onStop", "", "needToApplyWindowSettings", "Z", "getBackupValues", "()Lru/ozon/app/android/pdp/ui/configurators/monetization/edgeConfigurator/EdgeConfigurator$BackupValues;", "setBackupValues", "(Lru/ozon/app/android/pdp/ui/configurators/monetization/edgeConfigurator/EdgeConfigurator$BackupValues;)V", "backupValues", "BackupValues", "configurators_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public abstract class EdgeConfigurator<T extends BackupValues> extends ComposerScreenConfig.PageConfigurator {
    private boolean needToApplyWindowSettings = true;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lru/ozon/app/android/pdp/ui/configurators/monetization/edgeConfigurator/EdgeConfigurator$BackupValues;", "", "configurators_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes13.dex */
    public interface BackupValues {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void tryToApplyWindowSettings() {
        ComponentCallbacksC5392m c11;
        View view;
        ViewGroup composerContainer;
        r a11;
        Window window;
        if (getBackupValues() != null || (c11 = getContainer().c()) == null || (view = c11.getView()) == null || (composerContainer = ComposerViewExtensionKt.composerContainer(view)) == null || (a11 = getContainer().a()) == null || (window = a11.getWindow()) == null) {
            return;
        }
        applyWindowSettings(composerContainer, window, new Q0(window.getDecorView(), window));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void tryToRestoreWindowSettings() {
        View view;
        ViewGroup composerContainer;
        r a11;
        Window window;
        ComponentCallbacksC5392m c11 = getContainer().c();
        if (c11 == null || (view = c11.getView()) == null || (composerContainer = ComposerViewExtensionKt.composerContainer(view)) == null || (a11 = getContainer().a()) == null || (window = a11.getWindow()) == null) {
            return;
        }
        restoreWindowSettings(composerContainer, window, new Q0(window.getDecorView(), window));
    }

    public abstract void applyWindowSettings(@NotNull ViewGroup composerContainer, @NotNull Window window, @NotNull Q0 insetsController);

    protected abstract T getBackupValues();

    @Override // ru.ozon.app.android.composer.universalscreen.view.ComposerScreenConfig.PageConfigurator
    protected void onComposerInitialized() {
        C10727i.c(K.a(getOwner()), null, null, new EdgeConfigurator$onComposerInitialized$1(this, null), 3);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onStart(@NotNull J owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        if (this.needToApplyWindowSettings) {
            tryToApplyWindowSettings();
        }
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onStop(@NotNull J owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        tryToRestoreWindowSettings();
    }

    public abstract void restoreWindowSettings(@NotNull ViewGroup composerContainer, @NotNull Window window, @NotNull Q0 insetsController);
}
