package ru.ozon.app.android.storefront.widgets.navbarv2.presentation.scrollControllers;

import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.storefront.widgets.navbarv2.presentation.configurators.FloorConfigurator;
import ru.ozon.app.android.storefront.widgets.navbarv2.presentation.utils.ShellNavBarUtilsKt;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\u0003J\u0017\u0010\f\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000e\u0010\bR(\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u0010\u000f\u001a\u0004\u0018\u00010\n8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u000b\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0014\u001a\u00020\u00138\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lru/ozon/app/android/storefront/widgets/navbarv2/presentation/scrollControllers/BackgroundScrollController;", "", "<init>", "()V", "", "offset", "", "manageAlpha", "(I)V", "setMaxAlpha", "Lru/ozon/app/android/storefront/widgets/navbarv2/presentation/configurators/FloorConfigurator$FloorConfigurationParam;", "floorConfig", "onFloorConfigured", "(Lru/ozon/app/android/storefront/widgets/navbarv2/presentation/configurators/FloorConfigurator$FloorConfigurationParam;)V", "onOffsetChanged", AppMeasurementSdk.ConditionalUserProperty.VALUE, "Lru/ozon/app/android/storefront/widgets/navbarv2/presentation/configurators/FloorConfigurator$FloorConfigurationParam;", "getFloorConfig", "()Lru/ozon/app/android/storefront/widgets/navbarv2/presentation/configurators/FloorConfigurator$FloorConfigurationParam;", "", "canBeHidden", "Z", "getCanBeHidden", "()Z", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class BackgroundScrollController {
    private final boolean canBeHidden;
    private FloorConfigurator.FloorConfigurationParam floorConfig;

    public BackgroundScrollController() {
        FloorConfigurator.FloorConfigurationParam floorConfigurationParam = this.floorConfig;
        this.canBeHidden = floorConfigurationParam != null ? floorConfigurationParam.getCanBeHidden() : false;
    }

    private final void manageAlpha(int offset) {
        FloorConfigurator.FloorConfigurationParam prevFloorConfig;
        View floorView;
        View floorView2;
        FloorConfigurator.FloorConfigurationParam floorConfigurationParam = this.floorConfig;
        if (floorConfigurationParam == null || (prevFloorConfig = floorConfigurationParam.getPrevFloorConfig()) == null || (floorView = prevFloorConfig.getFloorView()) == null) {
            return;
        }
        int minTopMargin = prevFloorConfig.getMinTopMargin();
        if (prevFloorConfig.getDefaultTopMargin() + offset > minTopMargin) {
            setMaxAlpha();
            return;
        }
        float measuredHeight = floorView.getMeasuredHeight();
        float max = Math.max(((r0 - minTopMargin) + measuredHeight) / measuredHeight, 0.0f);
        FloorConfigurator.FloorConfigurationParam floorConfigurationParam2 = this.floorConfig;
        if (floorConfigurationParam2 == null || (floorView2 = floorConfigurationParam2.getFloorView()) == null) {
            return;
        }
        floorView2.setAlpha(max);
    }

    private final void setMaxAlpha() {
        FloorConfigurator.FloorConfigurationParam floorConfigurationParam;
        View floorView;
        View floorView2;
        FloorConfigurator.FloorConfigurationParam floorConfigurationParam2 = this.floorConfig;
        if (Intrinsics.b((floorConfigurationParam2 == null || (floorView2 = floorConfigurationParam2.getFloorView()) == null) ? null : Float.valueOf(floorView2.getAlpha()), 1.0f) || (floorConfigurationParam = this.floorConfig) == null || (floorView = floorConfigurationParam.getFloorView()) == null) {
            return;
        }
        floorView.setAlpha(1.0f);
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
                if (marginLayoutParams.topMargin < minTopMargin) {
                    ShellNavBarUtilsKt.updateTopMarginIfNeeded(floorView, minTopMargin);
                } else if (defaultTopMargin == minTopMargin) {
                    ShellNavBarUtilsKt.updateTopMarginIfNeeded(floorView, defaultTopMargin);
                } else {
                    ShellNavBarUtilsKt.updateTopMarginIfNeeded(floorView, Math.max(defaultTopMargin + offset, minTopMargin));
                }
                manageAlpha(offset);
            }
        }
    }
}
