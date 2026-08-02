package ru.ozon.app.android.storefront.widgets.navbarv2.presentation.configurators;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.storefront.widgets.navbarv2.presentation.configurators.FloorConfigurator;
import ru.ozon.app.android.storefront.widgets.navbarv2.presentation.vo.ShellNavBarTeethVO;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J4\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u00052\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\n0\u0011J\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\r\u001a\u00020\u0005H\u0002J\u0010\u0010\u0014\u001a\u00020\u00132\u0006\u0010\r\u001a\u00020\u0005H\u0002R\"\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005@RX\u0096\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0015"}, d2 = {"Lru/ozon/app/android/storefront/widgets/navbarv2/presentation/configurators/ThirdFloorConfigurator;", "Lru/ozon/app/android/storefront/widgets/navbarv2/presentation/configurators/FloorConfigurator;", "<init>", "()V", AppMeasurementSdk.ConditionalUserProperty.VALUE, "Lru/ozon/app/android/storefront/widgets/navbarv2/presentation/configurators/FloorConfigurator$FloorConfigurationParam;", "floorConfig", "getFloorConfig", "()Lru/ozon/app/android/storefront/widgets/navbarv2/presentation/configurators/FloorConfigurator$FloorConfigurationParam;", "configFloor", "", "floor", "Landroid/view/View;", "secondFloorConfig", "teeth", "Lru/ozon/app/android/storefront/widgets/navbarv2/presentation/vo/ShellNavBarTeethVO;", "onFloorConfigured", "Lkotlin/Function1;", "getMinTopMargin", "", "getDefaultTopMargin", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ThirdFloorConfigurator implements FloorConfigurator {
    private FloorConfigurator.FloorConfigurationParam floorConfig;

    private final int getDefaultTopMargin(FloorConfigurator.FloorConfigurationParam secondFloorConfig) {
        return secondFloorConfig.getDefaultTopMargin();
    }

    private final int getMinTopMargin(FloorConfigurator.FloorConfigurationParam secondFloorConfig) {
        return secondFloorConfig.getMinTopMargin();
    }

    public final void configFloor(@NotNull View floor, @NotNull FloorConfigurator.FloorConfigurationParam secondFloorConfig, ShellNavBarTeethVO teeth, @NotNull Function1<? super FloorConfigurator.FloorConfigurationParam, Unit> onFloorConfigured) {
        Intrinsics.checkNotNullParameter(floor, "floor");
        Intrinsics.checkNotNullParameter(secondFloorConfig, "secondFloorConfig");
        Intrinsics.checkNotNullParameter(onFloorConfigured, "onFloorConfigured");
        ViewGroup.LayoutParams layoutParams = floor.getLayoutParams();
        if (!(layoutParams instanceof CollapsingToolbarLayout.a)) {
            layoutParams = null;
        }
        CollapsingToolbarLayout.a aVar = (CollapsingToolbarLayout.a) layoutParams;
        if (aVar == null) {
            return;
        }
        if (((FrameLayout.LayoutParams) aVar).gravity != 80 || ((FrameLayout.LayoutParams) aVar).height != -2) {
            ((FrameLayout.LayoutParams) aVar).gravity = 80;
            ((FrameLayout.LayoutParams) aVar).bottomMargin = (teeth != null ? teeth.getTeethTopSpacerHeight() : 0) + (teeth != null ? teeth.getTeethHeight() : 0);
            ((FrameLayout.LayoutParams) aVar).height = -2;
            floor.setLayoutParams(aVar);
        }
        FloorConfigurator.FloorConfigurationParam floorConfigurationParam = new FloorConfigurator.FloorConfigurationParam(getDefaultTopMargin(secondFloorConfig), getMinTopMargin(secondFloorConfig), (teeth != null ? teeth.getTeethTopSpacerHeight() : 0) + (teeth != null ? teeth.getTeethHeight() : 0), teeth != null ? teeth.getTeethHeight() : 0, false, floor, null, 80, null);
        onFloorConfigured.invoke(floorConfigurationParam);
        this.floorConfig = floorConfigurationParam;
    }

    @Override // ru.ozon.app.android.storefront.widgets.navbarv2.presentation.configurators.FloorConfigurator
    public FloorConfigurator.FloorConfigurationParam getFloorConfig() {
        return this.floorConfig;
    }
}
