package ru.ozon.app.android.travel.feature.general.common.shared.filtersButton;

import B90.C2621x;
import Ql.c;
import android.app.Dialog;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.LinearLayout;
import androidx.core.view.C5353y0;
import androidx.core.view.D;
import androidx.core.view.Y;
import androidx.fragment.app.ComponentCallbacksC5392m;
import androidx.fragment.app.r;
import androidx.lifecycle.J;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.universalscreen.view.BottomSheetComposerFragment;
import ru.ozon.app.android.composer.universalscreen.view.ComposerFragment;
import ru.ozon.app.android.composer.universalscreen.view.ComposerScreenConfig;
import ru.ozon.app.android.composer.view.ComposerViewExtensionKt;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0011\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\f\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\f\u0010\u000bR\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/shared/filtersButton/TravelFiltersKeyboardInsetConfigurator;", "Lru/ozon/app/android/composer/universalscreen/view/ComposerScreenConfig$PageConfigurator;", "<init>", "()V", "Landroid/view/Window;", "getWindow", "()Landroid/view/Window;", "Landroidx/lifecycle/J;", "owner", "", "onStart", "(Landroidx/lifecycle/J;)V", "onStop", "Landroidx/core/view/D;", "insetsListener", "Landroidx/core/view/D;", "Companion", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class TravelFiltersKeyboardInsetConfigurator extends ComposerScreenConfig.PageConfigurator {

    @NotNull
    private final D insetsListener = new C2621x(this);

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/shared/filtersButton/TravelFiltersKeyboardInsetConfigurator$Companion;", "", "<init>", "()V", "DEFAULT_HIDE_SIZE", "", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes3.dex */
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    private final Window getWindow() {
        Dialog dialog;
        Window window;
        ComponentCallbacksC5392m c11 = getContainer().c();
        ComposerFragment composerFragment = c11 instanceof ComposerFragment ? (ComposerFragment) c11 : null;
        ComponentCallbacksC5392m parentFragment = composerFragment != null ? composerFragment.getParentFragment() : null;
        BottomSheetComposerFragment bottomSheetComposerFragment = parentFragment instanceof BottomSheetComposerFragment ? (BottomSheetComposerFragment) parentFragment : null;
        if (bottomSheetComposerFragment != null && (dialog = bottomSheetComposerFragment.getDialog()) != null && (window = dialog.getWindow()) != null) {
            return window;
        }
        r a11 = getContainer().a();
        if (a11 != null) {
            return a11.getWindow();
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C5353y0 insetsListener$lambda$3(TravelFiltersKeyboardInsetConfigurator travelFiltersKeyboardInsetConfigurator, View view, C5353y0 c5353y0) {
        View view2;
        int i11 = c.a(view, "view", c5353y0, "windowInsetsCompat", 8).f42129d;
        ComponentCallbacksC5392m c11 = travelFiltersKeyboardInsetConfigurator.getContainer().c();
        LinearLayout composerBottomContainer = (c11 == null || (view2 = c11.getView()) == null) ? null : ComposerViewExtensionKt.composerBottomContainer(view2);
        if (composerBottomContainer != null) {
            if (i11 > 0) {
                ViewGroup.LayoutParams layoutParams = composerBottomContainer.getLayoutParams();
                if (layoutParams == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                }
                layoutParams.height = 0;
                composerBottomContainer.setLayoutParams(layoutParams);
            } else {
                ViewGroup.LayoutParams layoutParams2 = composerBottomContainer.getLayoutParams();
                if (layoutParams2 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                }
                layoutParams2.height = -2;
                composerBottomContainer.setLayoutParams(layoutParams2);
            }
        }
        return Y.u(view, c5353y0);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onStart(@NotNull J owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        Window window = getWindow();
        if (window != null) {
            Y.J(window.getDecorView(), this.insetsListener);
        }
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onStop(@NotNull J owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        Window window = getWindow();
        if (window != null) {
            Y.J(window.getDecorView(), null);
        }
    }
}
