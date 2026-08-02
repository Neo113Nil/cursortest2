package ru.ozon.app.android.storefront.widgets.navbarv2.presentation.configurators;

import android.view.View;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.storefront.widgets.navbarv2.presentation.configurators.FloorConfigurator;
import ru.ozon.app.android.storefront.widgets.navbarv2.presentation.utils.ShellNavBarUtilsKt;
import ru.ozon.app.android.storefront.widgets.navbarv2.presentation.vo.ShellNavBarVO;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J<\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u00052\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\n0\u0013J,\u0010\u0014\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u00052\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\n0\u0013J\u001a\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0005H\u0002J\u001a\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0005H\u0002R\"\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005@RX\u0096\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/storefront/widgets/navbarv2/presentation/configurators/FirstFloorConfigurator;", "Lru/ozon/app/android/storefront/widgets/navbarv2/presentation/configurators/FloorConfigurator;", "<init>", "()V", AppMeasurementSdk.ConditionalUserProperty.VALUE, "Lru/ozon/app/android/storefront/widgets/navbarv2/presentation/configurators/FloorConfigurator$FloorConfigurationParam;", "floorConfig", "getFloorConfig", "()Lru/ozon/app/android/storefront/widgets/navbarv2/presentation/configurators/FloorConfigurator$FloorConfigurationParam;", "configFloor", "", "navBarVO", "Lru/ozon/app/android/storefront/widgets/navbarv2/presentation/vo/ShellNavBarVO;", "floor", "Landroid/view/View;", "statusBarHeight", "", "zeroFloorConfig", "onFloorConfigured", "Lkotlin/Function1;", "onInsetsUpdated", "getMinTopMargin", "getDefaultTopMargin", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class FirstFloorConfigurator implements FloorConfigurator {
    private FloorConfigurator.FloorConfigurationParam floorConfig;

    private final int getDefaultTopMargin(int statusBarHeight, FloorConfigurator.FloorConfigurationParam zeroFloorConfig) {
        View floorView;
        if (zeroFloorConfig != null) {
            statusBarHeight = zeroFloorConfig.getMinTopMargin();
        }
        return statusBarHeight + ((zeroFloorConfig == null || (floorView = zeroFloorConfig.getFloorView()) == null) ? 0 : floorView.getMeasuredHeight()) + (zeroFloorConfig != null ? zeroFloorConfig.getMinBottomMargin() : 0);
    }

    private final int getMinTopMargin(int statusBarHeight, FloorConfigurator.FloorConfigurationParam zeroFloorConfig) {
        if (zeroFloorConfig == null) {
            return statusBarHeight;
        }
        View floorView = zeroFloorConfig.getFloorView();
        return zeroFloorConfig.getMinTopMargin() + (zeroFloorConfig.getCanBeHidden() ? 0 : zeroFloorConfig.getMinBottomMargin() + (floorView != null ? floorView.getMeasuredHeight() : 0));
    }

    public final void configFloor(@NotNull ShellNavBarVO navBarVO, @NotNull View floor, int statusBarHeight, FloorConfigurator.FloorConfigurationParam zeroFloorConfig, @NotNull Function1<? super FloorConfigurator.FloorConfigurationParam, Unit> onFloorConfigured) {
        Intrinsics.checkNotNullParameter(navBarVO, "navBarVO");
        Intrinsics.checkNotNullParameter(floor, "floor");
        Intrinsics.checkNotNullParameter(onFloorConfigured, "onFloorConfigured");
        int defaultTopMargin = getDefaultTopMargin(statusBarHeight, zeroFloorConfig);
        ShellNavBarUtilsKt.updateTopMarginIfNeeded(floor, defaultTopMargin);
        FloorConfigurator.FloorConfigurationParam floorConfigurationParam = new FloorConfigurator.FloorConfigurationParam(defaultTopMargin, getMinTopMargin(statusBarHeight, zeroFloorConfig), navBarVO.getSpacings().getLevel1BottomSpacing(), navBarVO.getSpacings().getLevel1BottomSpacing(), true, floor, zeroFloorConfig);
        onFloorConfigured.invoke(floorConfigurationParam);
        this.floorConfig = floorConfigurationParam;
    }

    @Override // ru.ozon.app.android.storefront.widgets.navbarv2.presentation.configurators.FloorConfigurator
    public FloorConfigurator.FloorConfigurationParam getFloorConfig() {
        return this.floorConfig;
    }

    public final void onInsetsUpdated(int statusBarHeight, FloorConfigurator.FloorConfigurationParam zeroFloorConfig, @NotNull Function1<? super FloorConfigurator.FloorConfigurationParam, Unit> onFloorConfigured) {
        FloorConfigurator.FloorConfigurationParam floorConfigurationParam;
        Intrinsics.checkNotNullParameter(onFloorConfigured, "onFloorConfigured");
        FloorConfigurator.FloorConfigurationParam floorConfig = getFloorConfig();
        if (floorConfig == null || (floorConfigurationParam = FloorConfigurator.FloorConfigurationParam.copy$default(floorConfig, getDefaultTopMargin(statusBarHeight, zeroFloorConfig), getMinTopMargin(statusBarHeight, zeroFloorConfig), 0, 0, false, null, null, 124, null)) == null) {
            floorConfigurationParam = null;
        } else {
            onFloorConfigured.invoke(floorConfigurationParam);
        }
        this.floorConfig = floorConfigurationParam;
    }
}
