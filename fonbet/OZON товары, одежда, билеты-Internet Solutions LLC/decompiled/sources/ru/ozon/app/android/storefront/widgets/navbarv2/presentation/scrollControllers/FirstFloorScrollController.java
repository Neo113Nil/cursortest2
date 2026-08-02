package ru.ozon.app.android.storefront.widgets.navbarv2.presentation.scrollControllers;

import Sc.InterfaceC4008j;
import android.view.View;
import android.view.ViewGroup;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.storefront.widgets.navbarv2.presentation.configurators.FloorConfigurator;
import ru.ozon.app.android.storefront.widgets.navbarv2.presentation.utils.ShellNavBarUtilsKt;
import ru.ozon.app.android.utils.LazyUtilsKt;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J7\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\f\u0010\rJ/\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u001b\u0010\u001a\u001a\u00020\u00048BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u001bR\u0014\u0010\u001f\u001a\u00020\u001c8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001e¨\u0006 "}, d2 = {"Lru/ozon/app/android/storefront/widgets/navbarv2/presentation/scrollControllers/FirstFloorScrollController;", "", "<init>", "()V", "", "offset", "Landroid/view/View;", "floorView", "defaultTopMargin", "currentTopMargin", "minTopMargin", "", "manageFloorTopMargin", "(ILandroid/view/View;III)V", "manageFloorAlpha", "(ILandroid/view/View;II)V", "Lru/ozon/app/android/storefront/widgets/navbarv2/presentation/configurators/FloorConfigurator$FloorConfigurationParam;", "floorConfig", "onFloorConfigured", "(Lru/ozon/app/android/storefront/widgets/navbarv2/presentation/configurators/FloorConfigurator$FloorConfigurationParam;)V", "onOffsetChanged", "(I)V", "toolbarAdditionalMargin$delegate", "LSc/j;", "getToolbarAdditionalMargin", "()I", "toolbarAdditionalMargin", "Lru/ozon/app/android/storefront/widgets/navbarv2/presentation/configurators/FloorConfigurator$FloorConfigurationParam;", "", "getCanBeHidden", "()Z", "canBeHidden", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class FirstFloorScrollController {
    private FloorConfigurator.FloorConfigurationParam floorConfig;

    /* renamed from: toolbarAdditionalMargin$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j toolbarAdditionalMargin = LazyUtilsKt.unsafeLazy(FirstFloorScrollController$toolbarAdditionalMargin$2.INSTANCE);

    private final int getToolbarAdditionalMargin() {
        return ((Number) this.toolbarAdditionalMargin.getValue()).intValue();
    }

    private final void manageFloorAlpha(int offset, View floorView, int minTopMargin, int defaultTopMargin) {
        if (!getCanBeHidden()) {
            floorView.setAlpha(1.0f);
            return;
        }
        FloorConfigurator.FloorConfigurationParam floorConfigurationParam = this.floorConfig;
        float height = floorView.getHeight() - ((floorConfigurationParam != null ? floorConfigurationParam.getPrevFloorConfig() : null) != null ? getToolbarAdditionalMargin() : 0);
        floorView.setAlpha(Math.max((((defaultTopMargin - minTopMargin) + height) + offset) / height, 0.0f));
    }

    private final void manageFloorTopMargin(int offset, View floorView, int defaultTopMargin, int currentTopMargin, int minTopMargin) {
        if (currentTopMargin < minTopMargin) {
            ShellNavBarUtilsKt.updateTopMarginIfNeeded(floorView, minTopMargin);
        } else if (defaultTopMargin == minTopMargin) {
            ShellNavBarUtilsKt.updateTopMarginIfNeeded(floorView, defaultTopMargin);
        } else {
            ShellNavBarUtilsKt.updateTopMarginIfNeeded(floorView, Math.max(defaultTopMargin + offset, minTopMargin));
        }
    }

    public boolean getCanBeHidden() {
        FloorConfigurator.FloorConfigurationParam floorConfigurationParam = this.floorConfig;
        if (floorConfigurationParam != null) {
            return floorConfigurationParam.getCanBeHidden();
        }
        return true;
    }

    public void onFloorConfigured(@NotNull FloorConfigurator.FloorConfigurationParam floorConfig) {
        Intrinsics.checkNotNullParameter(floorConfig, "floorConfig");
        this.floorConfig = floorConfig;
    }

    public void onOffsetChanged(int offset) {
        View floorView;
        FloorConfigurator.FloorConfigurationParam floorConfigurationParam;
        FloorConfigurator.FloorConfigurationParam floorConfigurationParam2 = this.floorConfig;
        if (floorConfigurationParam2 == null || (floorView = floorConfigurationParam2.getFloorView()) == null || (floorConfigurationParam = this.floorConfig) == null) {
            return;
        }
        int minTopMargin = floorConfigurationParam.getMinTopMargin();
        FloorConfigurator.FloorConfigurationParam floorConfigurationParam3 = this.floorConfig;
        if (floorConfigurationParam3 != null) {
            int defaultTopMargin = floorConfigurationParam3.getDefaultTopMargin();
            ViewGroup.LayoutParams layoutParams = floorView.getLayoutParams();
            ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
            if (marginLayoutParams != null) {
                int i11 = marginLayoutParams.topMargin;
                manageFloorAlpha(offset, floorView, minTopMargin, defaultTopMargin);
                manageFloorTopMargin(offset, floorView, defaultTopMargin, i11, minTopMargin);
            }
        }
    }
}
