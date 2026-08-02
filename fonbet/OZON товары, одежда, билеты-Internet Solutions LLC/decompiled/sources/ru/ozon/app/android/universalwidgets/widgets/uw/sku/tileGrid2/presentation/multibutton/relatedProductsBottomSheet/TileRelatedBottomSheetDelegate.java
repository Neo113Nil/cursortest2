package ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.presentation.multibutton.relatedProductsBottomSheet;

import De.s;
import U7.d;
import WZ.l;
import android.content.Context;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.fragment.app.ComponentCallbacksC5392m;
import androidx.lifecycle.AbstractC5434v;
import androidx.lifecycle.D;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.J;
import androidx.lifecycle.K;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.view.ComposerViewExtensionKt;
import ru.ozon.app.android.product.tiles.tilegrid2.presentation.multibutton.data.TileRelatedProductsCurtainVO;
import xe.C10720e0;
import xe.C10727i;

@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010#\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J+\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\n\u0010\n\u001a\u00060\bj\u0002`\tH\u0002¢\u0006\u0004\b\f\u0010\rJ;\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\n\u0010\n\u001a\u00060\bj\u0002`\t2\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017R\u0018\u0010\u0019\u001a\u0004\u0018\u00010\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u001c\u0010\u001c\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/presentation/multibutton/relatedProductsBottomSheet/TileRelatedBottomSheetDelegate;", "", "<init>", "()V", "Landroid/content/Context;", "context", "Lru/ozon/app/android/composer/ComposerReferences;", "refs", "LWZ/l;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedAnalytics;", "tokenizedAnalytics", "", "initBottomSheet", "(Landroid/content/Context;Lru/ozon/app/android/composer/ComposerReferences;LWZ/l;)V", "Lru/ozon/app/android/product/tiles/tilegrid2/presentation/multibutton/data/TileRelatedProductsCurtainVO;", "relatedProductsCurtain", "", "skuId", "loadRelatedProducts", "(Landroid/content/Context;Lru/ozon/app/android/composer/ComposerReferences;LWZ/l;Lru/ozon/app/android/product/tiles/tilegrid2/presentation/multibutton/data/TileRelatedProductsCurtainVO;Ljava/lang/Long;)V", "", "isValidatedShow", "showMiniState", "(Z)V", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/presentation/multibutton/relatedProductsBottomSheet/TileRelatedProductsBottomSheetView;", "bottomSheetView", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/presentation/multibutton/relatedProductsBottomSheet/TileRelatedProductsBottomSheetView;", "", "loadedSkuIds", "Ljava/util/Set;", "universalwidgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class TileRelatedBottomSheetDelegate {
    private TileRelatedProductsBottomSheetView bottomSheetView;

    @NotNull
    private final Set<Long> loadedSkuIds = new LinkedHashSet();

    /* JADX INFO: Access modifiers changed from: private */
    public final void initBottomSheet(Context context, final ComposerReferences refs, l tokenizedAnalytics) {
        View view;
        CoordinatorLayout composerCoordinatorLayout;
        View view2;
        CoordinatorLayout composerCoordinatorLayout2;
        TileRelatedProductsBottomSheetView tileRelatedProductsBottomSheetView = new TileRelatedProductsBottomSheetView(context, refs.getContainer(), tokenizedAnalytics);
        ComponentCallbacksC5392m c11 = refs.getContainer().c();
        if (c11 != null && (view2 = c11.getView()) != null && (composerCoordinatorLayout2 = ComposerViewExtensionKt.composerCoordinatorLayout(view2)) != null) {
            composerCoordinatorLayout2.addView(tileRelatedProductsBottomSheetView);
        }
        this.bottomSheetView = tileRelatedProductsBottomSheetView;
        final AbstractC5434v c12 = d.c(refs);
        if (c12.b() != AbstractC5434v.b.DESTROYED) {
            c12.a(new DefaultLifecycleObserver() { // from class: ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.presentation.multibutton.relatedProductsBottomSheet.TileRelatedBottomSheetDelegate$initBottomSheet$$inlined$whenDestroyed$1
                @Override // androidx.lifecycle.DefaultLifecycleObserver
                public void onDestroy(J owner) {
                    View view3;
                    CoordinatorLayout composerCoordinatorLayout3;
                    Intrinsics.checkNotNullParameter(owner, "owner");
                    TileRelatedProductsBottomSheetView tileRelatedProductsBottomSheetView2 = this.bottomSheetView;
                    if (tileRelatedProductsBottomSheetView2 != null) {
                        tileRelatedProductsBottomSheetView2.onDetach();
                    }
                    ComponentCallbacksC5392m c13 = refs.getContainer().c();
                    if (c13 != null && (view3 = c13.getView()) != null && (composerCoordinatorLayout3 = ComposerViewExtensionKt.composerCoordinatorLayout(view3)) != null) {
                        composerCoordinatorLayout3.removeView(this.bottomSheetView);
                    }
                    this.loadedSkuIds.clear();
                    this.bottomSheetView = null;
                    AbstractC5434v.this.e(this);
                }
            });
            return;
        }
        TileRelatedProductsBottomSheetView tileRelatedProductsBottomSheetView2 = this.bottomSheetView;
        if (tileRelatedProductsBottomSheetView2 != null) {
            tileRelatedProductsBottomSheetView2.onDetach();
        }
        ComponentCallbacksC5392m c13 = refs.getContainer().c();
        if (c13 != null && (view = c13.getView()) != null && (composerCoordinatorLayout = ComposerViewExtensionKt.composerCoordinatorLayout(view)) != null) {
            composerCoordinatorLayout.removeView(this.bottomSheetView);
        }
        this.loadedSkuIds.clear();
        this.bottomSheetView = null;
    }

    public final void loadRelatedProducts(@NotNull Context context, @NotNull ComposerReferences refs, @NotNull l tokenizedAnalytics, @NotNull TileRelatedProductsCurtainVO relatedProductsCurtain, Long skuId) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(refs, "refs");
        Intrinsics.checkNotNullParameter(tokenizedAnalytics, "tokenizedAnalytics");
        Intrinsics.checkNotNullParameter(relatedProductsCurtain, "relatedProductsCurtain");
        D a11 = K.a(refs.getContainer().g());
        C10720e0 c10720e0 = C10720e0.f105451a;
        C10727i.c(a11, s.f6650a, null, new TileRelatedBottomSheetDelegate$loadRelatedProducts$1(this, context, refs, tokenizedAnalytics, skuId, relatedProductsCurtain, null), 2);
    }

    public final void showMiniState(boolean isValidatedShow) {
        TileRelatedProductsBottomSheetView tileRelatedProductsBottomSheetView = this.bottomSheetView;
        if (tileRelatedProductsBottomSheetView != null) {
            tileRelatedProductsBottomSheetView.showMiniState(isValidatedShow);
        }
    }
}
