package ru.ozon.app.android.travel.feature.hotels.map.shared.presentation.helpers;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.google.android.material.appbar.AppBarLayout;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.view.ComposerViewExtensionKt;
import ru.ozon.app.android.travel.feature.hotels.map.shared.presentation.helpers.ComposerContainersUpdater;
import ru.ozon.app.android.travel.utils.searchView.SearchableChildViewKt;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001BK\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005¢\u0006\u0004\b\n\u0010\u000bJ\u0006\u0010\u0010\u001a\u00020\u0007J\u0006\u0010\u0011\u001a\u00020\u0007R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/map/shared/presentation/helpers/ComposerContainersUpdater;", "", "composerRootView", "Landroid/view/ViewGroup;", "onTopContainerChangeHeight", "Lkotlin/Function1;", "", "", "onBottomContainerChangeHeight", "onAppbarContainerChangeHeight", "<init>", "(Landroid/view/ViewGroup;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "topOnLayoutChangeListener", "Landroid/view/View$OnLayoutChangeListener;", "bottomOnLayoutChangeListener", "appbarOnLayoutChangeListener", "setOnLayoutChangeListeners", "removeOnLayoutChangeListeners", "map_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ComposerContainersUpdater {

    @NotNull
    private final View.OnLayoutChangeListener appbarOnLayoutChangeListener;

    @NotNull
    private final View.OnLayoutChangeListener bottomOnLayoutChangeListener;

    @NotNull
    private final ViewGroup composerRootView;

    @NotNull
    private final Function1<Integer, Unit> onAppbarContainerChangeHeight;

    @NotNull
    private final Function1<Integer, Unit> onBottomContainerChangeHeight;

    @NotNull
    private final Function1<Integer, Unit> onTopContainerChangeHeight;

    @NotNull
    private final View.OnLayoutChangeListener topOnLayoutChangeListener;

    /* JADX WARN: Multi-variable type inference failed */
    public ComposerContainersUpdater(@NotNull ViewGroup composerRootView, @NotNull Function1<? super Integer, Unit> onTopContainerChangeHeight, @NotNull Function1<? super Integer, Unit> onBottomContainerChangeHeight, @NotNull Function1<? super Integer, Unit> onAppbarContainerChangeHeight) {
        Intrinsics.checkNotNullParameter(composerRootView, "composerRootView");
        Intrinsics.checkNotNullParameter(onTopContainerChangeHeight, "onTopContainerChangeHeight");
        Intrinsics.checkNotNullParameter(onBottomContainerChangeHeight, "onBottomContainerChangeHeight");
        Intrinsics.checkNotNullParameter(onAppbarContainerChangeHeight, "onAppbarContainerChangeHeight");
        this.composerRootView = composerRootView;
        this.onTopContainerChangeHeight = onTopContainerChangeHeight;
        this.onBottomContainerChangeHeight = onBottomContainerChangeHeight;
        this.onAppbarContainerChangeHeight = onAppbarContainerChangeHeight;
        this.topOnLayoutChangeListener = new View.OnLayoutChangeListener() { // from class: CR.a
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18) {
                ComposerContainersUpdater.topOnLayoutChangeListener$lambda$0(ComposerContainersUpdater.this, view, i11, i12, i13, i14, i15, i16, i17, i18);
            }
        };
        this.bottomOnLayoutChangeListener = new View.OnLayoutChangeListener() { // from class: CR.b
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18) {
                ComposerContainersUpdater.bottomOnLayoutChangeListener$lambda$1(ComposerContainersUpdater.this, view, i11, i12, i13, i14, i15, i16, i17, i18);
            }
        };
        this.appbarOnLayoutChangeListener = new View.OnLayoutChangeListener() { // from class: CR.c
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18) {
                ComposerContainersUpdater.appbarOnLayoutChangeListener$lambda$2(ComposerContainersUpdater.this, view, i11, i12, i13, i14, i15, i16, i17, i18);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void appbarOnLayoutChangeListener$lambda$2(ComposerContainersUpdater composerContainersUpdater, View view, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18) {
        if (view.getHeight() != 0) {
            View findSearchableChild = SearchableChildViewKt.findSearchableChild(view);
            int i19 = 0;
            if (findSearchableChild != null) {
                ViewGroup.LayoutParams layoutParams = findSearchableChild.getLayoutParams();
                ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
                if (marginLayoutParams != null) {
                    i19 = marginLayoutParams.bottomMargin;
                }
            }
            composerContainersUpdater.onAppbarContainerChangeHeight.invoke(Integer.valueOf(view.getHeight() - i19));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bottomOnLayoutChangeListener$lambda$1(ComposerContainersUpdater composerContainersUpdater, View view, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18) {
        if (view.getHeight() != 0) {
            composerContainersUpdater.onBottomContainerChangeHeight.invoke(Integer.valueOf(view.getHeight()));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void topOnLayoutChangeListener$lambda$0(ComposerContainersUpdater composerContainersUpdater, View view, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18) {
        if (view.getHeight() != 0) {
            composerContainersUpdater.onTopContainerChangeHeight.invoke(Integer.valueOf(view.getHeight()));
        }
    }

    public final void removeOnLayoutChangeListeners() {
        ComposerViewExtensionKt.composerTopContainer(this.composerRootView).removeOnLayoutChangeListener(this.topOnLayoutChangeListener);
        ComposerViewExtensionKt.composerBottomContainer(this.composerRootView).removeOnLayoutChangeListener(this.bottomOnLayoutChangeListener);
        AppBarLayout composerAppbar = ComposerViewExtensionKt.composerAppbar(this.composerRootView);
        if (composerAppbar != null) {
            composerAppbar.removeOnLayoutChangeListener(this.appbarOnLayoutChangeListener);
        }
    }

    public final void setOnLayoutChangeListeners() {
        LinearLayout composerTopContainer = ComposerViewExtensionKt.composerTopContainer(this.composerRootView);
        composerTopContainer.addOnLayoutChangeListener(this.topOnLayoutChangeListener);
        this.onTopContainerChangeHeight.invoke(Integer.valueOf(composerTopContainer.getHeight()));
        LinearLayout composerBottomContainer = ComposerViewExtensionKt.composerBottomContainer(this.composerRootView);
        composerBottomContainer.addOnLayoutChangeListener(this.bottomOnLayoutChangeListener);
        this.onBottomContainerChangeHeight.invoke(Integer.valueOf(composerBottomContainer.getHeight()));
        AppBarLayout composerAppbar = ComposerViewExtensionKt.composerAppbar(this.composerRootView);
        if (composerAppbar != null) {
            composerAppbar.addOnLayoutChangeListener(this.appbarOnLayoutChangeListener);
            this.onAppbarContainerChangeHeight.invoke(Integer.valueOf(composerAppbar.getHeight()));
        }
    }
}
