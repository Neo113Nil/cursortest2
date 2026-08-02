package ru.ozon.app.android.travel.pageconfigurator.fullScreen;

import B90.C2622y;
import a00.C4911f;
import android.view.View;
import android.view.Window;
import android.widget.LinearLayout;
import androidx.core.view.C5353y0;
import androidx.core.view.D;
import androidx.core.view.Y;
import androidx.fragment.app.r;
import androidx.lifecycle.J;
import com.google.android.material.appbar.AppBarLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l10.InterfaceC7851b;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.ConfiguratorReferences;
import ru.ozon.app.android.composer.universalscreen.view.ComposerScreenConfig;
import ru.ozon.app.android.composer.view.ComposerViewExtensionKt;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\b\u001a\u00020\u0007*\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000e\u0010\rR\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0015\u001a\u0004\u0018\u00010\u00128BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/travel/pageconfigurator/fullScreen/FullScreenInsetsConfigurator;", "Lru/ozon/app/android/composer/universalscreen/view/ComposerScreenConfig$PageConfigurator;", "<init>", "()V", "Landroid/view/View;", "Landroidx/core/view/y0;", "insets", "", "updateInsets", "(Landroid/view/View;Landroidx/core/view/y0;)V", "Landroidx/lifecycle/J;", "owner", "onStart", "(Landroidx/lifecycle/J;)V", "onStop", "Landroidx/core/view/D;", "insetsListener", "Landroidx/core/view/D;", "Landroid/view/Window;", "getActivityWindow", "()Landroid/view/Window;", "activityWindow", "pageconfigurator_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class FullScreenInsetsConfigurator extends ComposerScreenConfig.PageConfigurator {

    @NotNull
    private final D insetsListener = new C2622y(this);

    private final Window getActivityWindow() {
        C4911f ownerContainer;
        r a11;
        ConfiguratorReferences references = getReferences();
        if (references == null || (ownerContainer = references.getOwnerContainer()) == null || (a11 = ownerContainer.a()) == null) {
            return null;
        }
        return a11.getWindow();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C5353y0 insetsListener$lambda$0(FullScreenInsetsConfigurator fullScreenInsetsConfigurator, View view, C5353y0 insets) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(insets, "insets");
        View view2 = fullScreenInsetsConfigurator.getContainer().j().getView();
        if (view2 != null && view2.getFitsSystemWindows()) {
            return Y.u(view, insets);
        }
        fullScreenInsetsConfigurator.updateInsets(view, insets);
        return Y.u(view, insets);
    }

    private final void updateInsets(View view, C5353y0 c5353y0) {
        InterfaceC7851b controller;
        ConfiguratorReferences references = getReferences();
        if (references != null && (controller = references.getController()) != null) {
            controller.update(new UpdateInsetsEvent(new WindowInsetsWrapper(c5353y0)));
        }
        int i11 = c5353y0.f(2).f42129d;
        int i12 = c5353y0.f(1).f42127b;
        AppBarLayout composerAppbar = ComposerViewExtensionKt.composerAppbar(view);
        if (composerAppbar != null) {
            composerAppbar.setPadding(composerAppbar.getPaddingLeft(), i12, composerAppbar.getPaddingRight(), composerAppbar.getPaddingBottom());
        }
        LinearLayout composerBottomContainer = ComposerViewExtensionKt.composerBottomContainer(view);
        composerBottomContainer.setPadding(composerBottomContainer.getPaddingLeft(), composerBottomContainer.getPaddingTop(), composerBottomContainer.getPaddingRight(), i11);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onStart(@NotNull J owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        Window activityWindow = getActivityWindow();
        if (activityWindow != null) {
            Y.J(activityWindow.getDecorView(), this.insetsListener);
        }
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onStop(@NotNull J owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        Window activityWindow = getActivityWindow();
        if (activityWindow != null) {
            Y.J(activityWindow.getDecorView(), null);
        }
    }
}
