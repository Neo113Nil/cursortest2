package ru.ozon.app.android.pdp.ui.configurators.monetization;

import android.view.View;
import android.view.Window;
import androidx.core.graphics.d;
import androidx.core.view.C5353y0;
import androidx.core.view.Y;
import androidx.fragment.app.ComponentCallbacksC5392m;
import androidx.fragment.app.r;
import androidx.lifecycle.J;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.universalscreen.view.ComposerScreenConfig;
import ru.ozon.app.android.composer.view.ComposerViewExtensionKt;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0016\u0010\u0010\u001a\u0004\u0018\u00010\r8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, d2 = {"Lru/ozon/app/android/pdp/ui/configurators/monetization/BottomSheetInsetsConfigurator;", "Lru/ozon/app/android/composer/universalscreen/view/ComposerScreenConfig$PageConfigurator;", "<init>", "()V", "Landroidx/core/view/y0;", "insets", "", "applyInsets", "(Landroidx/core/view/y0;)V", "Landroidx/lifecycle/J;", "owner", "onStart", "(Landroidx/lifecycle/J;)V", "Landroid/view/View;", "getDecorView", "()Landroid/view/View;", "decorView", "configurators_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class BottomSheetInsetsConfigurator extends ComposerScreenConfig.PageConfigurator {
    private final void applyInsets(C5353y0 insets) {
        View view;
        ComponentCallbacksC5392m c11 = getContainer().c();
        if (c11 == null || (view = c11.getView()) == null) {
            return;
        }
        d f7 = insets.f(2);
        Intrinsics.checkNotNullExpressionValue(f7, "getInsets(...)");
        RecyclerView composerRecyclerView = ComposerViewExtensionKt.composerRecyclerView(view);
        composerRecyclerView.setClipToPadding(false);
        composerRecyclerView.setPadding(composerRecyclerView.getPaddingLeft(), composerRecyclerView.getPaddingTop(), composerRecyclerView.getPaddingRight(), f7.f42129d);
    }

    private final View getDecorView() {
        Window window;
        r a11 = getContainer().a();
        if (a11 == null || (window = a11.getWindow()) == null) {
            return null;
        }
        return window.getDecorView();
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onStart(@NotNull J owner) {
        C5353y0 n11;
        Intrinsics.checkNotNullParameter(owner, "owner");
        View decorView = getDecorView();
        if (decorView == null || (n11 = Y.n(decorView)) == null) {
            return;
        }
        applyInsets(n11);
    }
}
