package ru.ozon.app.android.common.filterWidgets.filters.configurators;

import B90.C2615q;
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
import ru.ozon.app.android.common.filterWidgets.flags.FilterButtonInsetEnabledFlag;
import ru.ozon.app.android.composer.universalscreen.view.BottomSheetComposerFragment;
import ru.ozon.app.android.composer.universalscreen.view.ComposerFragment;
import ru.ozon.app.android.composer.universalscreen.view.ComposerScreenConfig;
import ru.ozon.app.android.composer.view.ComposerViewExtensionKt;
import ru.ozon.app.android.network.abtool.FeatureChecker;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0011\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000e\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000fR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/common/filterWidgets/filters/configurators/FiltersKeyboardInsetConfigurator;", "Lru/ozon/app/android/composer/universalscreen/view/ComposerScreenConfig$PageConfigurator;", "Lru/ozon/app/android/network/abtool/FeatureChecker;", "featureChecker", "<init>", "(Lru/ozon/app/android/network/abtool/FeatureChecker;)V", "Landroid/view/Window;", "getActivityWindow", "()Landroid/view/Window;", "Landroidx/lifecycle/J;", "owner", "", "onStart", "(Landroidx/lifecycle/J;)V", "onStop", "Lru/ozon/app/android/network/abtool/FeatureChecker;", "Landroidx/core/view/D;", "insetsListener", "Landroidx/core/view/D;", "Companion", "filter-widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class FiltersKeyboardInsetConfigurator extends ComposerScreenConfig.PageConfigurator {

    @NotNull
    private static final Companion Companion = new Companion(null);

    @NotNull
    private final FeatureChecker featureChecker;

    @NotNull
    private final D insetsListener;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/common/filterWidgets/filters/configurators/FiltersKeyboardInsetConfigurator$Companion;", "", "<init>", "()V", "DEFAULT_HIDE_SIZE", "", "filter-widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes11.dex */
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public FiltersKeyboardInsetConfigurator(@NotNull FeatureChecker featureChecker) {
        Intrinsics.checkNotNullParameter(featureChecker, "featureChecker");
        this.featureChecker = featureChecker;
        this.insetsListener = new C2615q(this, 3);
    }

    private final Window getActivityWindow() {
        Dialog dialog;
        Window window;
        ComponentCallbacksC5392m j11 = getContainer().j();
        ComposerFragment composerFragment = j11 instanceof ComposerFragment ? (ComposerFragment) j11 : null;
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
    public static final C5353y0 insetsListener$lambda$3(FiltersKeyboardInsetConfigurator filtersKeyboardInsetConfigurator, View view, C5353y0 c5353y0) {
        View view2;
        int i11 = c.a(view, "view", c5353y0, "windowInsetsCompat", 8).f42129d;
        ComponentCallbacksC5392m c11 = filtersKeyboardInsetConfigurator.getContainer().c();
        LinearLayout composerBottomContainer = (c11 == null || (view2 = c11.getView()) == null) ? null : ComposerViewExtensionKt.composerBottomContainer(view2);
        if (composerBottomContainer != null) {
            if (i11 > 0) {
                ViewGroup.LayoutParams layoutParams = composerBottomContainer.getLayoutParams();
                if (layoutParams == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                }
                layoutParams.height = 0;
                composerBottomContainer.setLayoutParams(layoutParams);
                composerBottomContainer.setPadding(composerBottomContainer.getPaddingLeft(), composerBottomContainer.getPaddingTop(), composerBottomContainer.getPaddingRight(), i11 - c5353y0.f(2).f42129d);
            } else {
                ViewGroup.LayoutParams layoutParams2 = composerBottomContainer.getLayoutParams();
                if (layoutParams2 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                }
                layoutParams2.height = -2;
                composerBottomContainer.setLayoutParams(layoutParams2);
                composerBottomContainer.setPadding(0, 0, 0, 0);
            }
        }
        return Y.u(view, c5353y0);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onStart(@NotNull J owner) {
        Window activityWindow;
        Intrinsics.checkNotNullParameter(owner, "owner");
        if (this.featureChecker.isEnabled(FilterButtonInsetEnabledFlag.INSTANCE) && (activityWindow = getActivityWindow()) != null) {
            Y.J(activityWindow.getDecorView(), this.insetsListener);
        }
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onStop(@NotNull J owner) {
        Window activityWindow;
        Intrinsics.checkNotNullParameter(owner, "owner");
        if (this.featureChecker.isEnabled(FilterButtonInsetEnabledFlag.INSTANCE) && (activityWindow = getActivityWindow()) != null) {
            Y.J(activityWindow.getDecorView(), null);
        }
    }
}
