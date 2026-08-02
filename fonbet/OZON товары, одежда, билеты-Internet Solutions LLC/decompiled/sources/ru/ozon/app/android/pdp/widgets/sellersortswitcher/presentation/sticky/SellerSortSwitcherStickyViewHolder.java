package ru.ozon.app.android.pdp.widgets.sellersortswitcher.presentation.sticky;

import android.view.View;
import androidx.core.view.Y;
import com.google.android.material.appbar.AppBarLayout;
import d20.AbstractC6065b;
import java.lang.ref.WeakReference;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l10.i;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.view.ComposerViewExtensionKt;
import ru.ozon.app.android.pdp.utils.Dimens;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001d\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000e\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0010\u0010\fR\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0011R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0018\u001a\u0004\u0018\u00010\u00158VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, d2 = {"Lru/ozon/app/android/pdp/widgets/sellersortswitcher/presentation/sticky/SellerSortSwitcherStickyViewHolder;", "Ld20/b;", "Lru/ozon/app/android/pdp/widgets/sellersortswitcher/presentation/sticky/SellerSortSwitcherStickyVO;", "Ll10/i;", "container", "Ljava/lang/ref/WeakReference;", "Lru/ozon/app/android/pdp/widgets/sellersortswitcher/presentation/sticky/SellerSortSwitcherStickyView;", "wSellerSortSwitcherStickyView", "<init>", "(Ll10/i;Ljava/lang/ref/WeakReference;)V", "", "onWidgetCreated", "()V", "item", "bind", "(Lru/ozon/app/android/pdp/widgets/sellersortswitcher/presentation/sticky/SellerSortSwitcherStickyVO;)V", "onWidgetDestroyed", "Ljava/lang/ref/WeakReference;", "", "anyPositiveElevation", "F", "Landroid/view/View;", "getMetricView", "()Landroid/view/View;", "metricView", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class SellerSortSwitcherStickyViewHolder extends AbstractC6065b<SellerSortSwitcherStickyVO> {
    private final float anyPositiveElevation;

    @NotNull
    private final WeakReference<SellerSortSwitcherStickyView> wSellerSortSwitcherStickyView;

    public SellerSortSwitcherStickyViewHolder(@NotNull i container, @NotNull WeakReference<SellerSortSwitcherStickyView> wSellerSortSwitcherStickyView) {
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(wSellerSortSwitcherStickyView, "wSellerSortSwitcherStickyView");
        this.wSellerSortSwitcherStickyView = wSellerSortSwitcherStickyView;
        this.anyPositiveElevation = Dimens.INSTANCE.getDPF_1();
        AppBarLayout composerAppbar = ComposerViewExtensionKt.composerAppbar(container.Z());
        if (composerAppbar != null) {
            int i11 = Y.f42258g;
            if (!composerAppbar.isLaidOut() || composerAppbar.isLayoutRequested()) {
                composerAppbar.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: ru.ozon.app.android.pdp.widgets.sellersortswitcher.presentation.sticky.SellerSortSwitcherStickyViewHolder$special$$inlined$doOnLayout$1
                    @Override // android.view.View.OnLayoutChangeListener
                    public void onLayoutChange(View view, int left, int top, int right, int bottom, int oldLeft, int oldTop, int oldRight, int oldBottom) {
                        Intrinsics.checkNotNullParameter(view, "view");
                        view.removeOnLayoutChangeListener(this);
                        view.setElevation(SellerSortSwitcherStickyViewHolder.this.anyPositiveElevation);
                        view.setOutlineProvider(null);
                    }
                });
            } else {
                composerAppbar.setElevation(this.anyPositiveElevation);
                composerAppbar.setOutlineProvider(null);
            }
        }
    }

    @Override // d20.AbstractC6065b
    public View getMetricView() {
        SellerSortSwitcherStickyView sellerSortSwitcherStickyView = this.wSellerSortSwitcherStickyView.get();
        if (sellerSortSwitcherStickyView != null) {
            return sellerSortSwitcherStickyView.getContainerView();
        }
        return null;
    }

    @Override // d20.AbstractC6065b
    public void onWidgetCreated() {
        super.onWidgetCreated();
        SellerSortSwitcherStickyView sellerSortSwitcherStickyView = this.wSellerSortSwitcherStickyView.get();
        if (sellerSortSwitcherStickyView != null) {
            sellerSortSwitcherStickyView.setup();
        }
    }

    @Override // d20.AbstractC6065b
    public void onWidgetDestroyed() {
        super.onWidgetDestroyed();
        SellerSortSwitcherStickyView sellerSortSwitcherStickyView = this.wSellerSortSwitcherStickyView.get();
        if (sellerSortSwitcherStickyView != null) {
            sellerSortSwitcherStickyView.remove();
        }
    }

    @Override // d20.AbstractC6065b
    public void bind(@NotNull SellerSortSwitcherStickyVO item) {
        Intrinsics.checkNotNullParameter(item, "item");
        SellerSortSwitcherStickyView sellerSortSwitcherStickyView = this.wSellerSortSwitcherStickyView.get();
        if (sellerSortSwitcherStickyView != null) {
            sellerSortSwitcherStickyView.bind(item);
        }
    }
}
