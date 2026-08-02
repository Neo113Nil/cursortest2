package ru.ozon.app.android.favorites.configurators;

import B90.C;
import Ql.c;
import a00.C4911f;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.core.view.C5353y0;
import androidx.core.view.D;
import androidx.core.view.Y;
import androidx.fragment.app.ComponentCallbacksC5392m;
import androidx.fragment.app.r;
import androidx.lifecycle.J;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.ConfiguratorReferences;
import ru.ozon.app.android.composer.universalscreen.view.ComposerScreenConfig;
import ru.ozon.app.android.composer.view.ComposerViewExtensionKt;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0011\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u000f\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000f\u0010\u000eR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lru/ozon/app/android/favorites/configurators/CreateShoppingListInputInsetsConfigurator;", "Lru/ozon/app/android/composer/universalscreen/view/ComposerScreenConfig$PageConfigurator;", "<init>", "()V", "Landroid/view/Window;", "getActivityWindow", "()Landroid/view/Window;", "Landroid/view/ViewGroup;", "getComposerContainer", "()Landroid/view/ViewGroup;", "Landroidx/lifecycle/J;", "owner", "", "onStart", "(Landroidx/lifecycle/J;)V", "onStop", "Landroidx/core/view/D;", "insetsListener", "Landroidx/core/view/D;", "favorites_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class CreateShoppingListInputInsetsConfigurator extends ComposerScreenConfig.PageConfigurator {

    @NotNull
    private final D insetsListener = new C(this);

    private final Window getActivityWindow() {
        C4911f ownerContainer;
        r a11;
        ConfiguratorReferences references = getReferences();
        if (references == null || (ownerContainer = references.getOwnerContainer()) == null || (a11 = ownerContainer.a()) == null) {
            return null;
        }
        return a11.getWindow();
    }

    private final ViewGroup getComposerContainer() {
        C4911f ownerContainer;
        ComponentCallbacksC5392m c11;
        View view;
        ConfiguratorReferences references = getReferences();
        if (references == null || (ownerContainer = references.getOwnerContainer()) == null || (c11 = ownerContainer.c()) == null || (view = c11.getView()) == null) {
            return null;
        }
        return ComposerViewExtensionKt.composerContainer(view);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C5353y0 insetsListener$lambda$1(CreateShoppingListInputInsetsConfigurator createShoppingListInputInsetsConfigurator, View view, C5353y0 c5353y0) {
        int i11 = c.a(view, "view", c5353y0, "windowInsetsCompat", 8).f42129d - c5353y0.f(2).f42129d;
        if (i11 < 0) {
            i11 = 0;
        }
        ViewGroup composerContainer = createShoppingListInputInsetsConfigurator.getComposerContainer();
        if (composerContainer != null) {
            ViewGroup.LayoutParams layoutParams = composerContainer.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            }
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.bottomMargin = i11;
            composerContainer.setLayoutParams(marginLayoutParams);
        }
        return Y.u(view, c5353y0);
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
