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

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J*\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u00052\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\n0\u000fR\"\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005@RX\u0096\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0010"}, d2 = {"Lru/ozon/app/android/storefront/widgets/navbarv2/presentation/configurators/SecondCollapsedFloorConfigurator;", "Lru/ozon/app/android/storefront/widgets/navbarv2/presentation/configurators/FloorConfigurator;", "<init>", "()V", AppMeasurementSdk.ConditionalUserProperty.VALUE, "Lru/ozon/app/android/storefront/widgets/navbarv2/presentation/configurators/FloorConfigurator$FloorConfigurationParam;", "floorConfig", "getFloorConfig", "()Lru/ozon/app/android/storefront/widgets/navbarv2/presentation/configurators/FloorConfigurator$FloorConfigurationParam;", "configFloor", "", "floor", "Landroid/view/View;", "secondFloorConfig", "onFloorConfigured", "Lkotlin/Function1;", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class SecondCollapsedFloorConfigurator implements FloorConfigurator {
    private FloorConfigurator.FloorConfigurationParam floorConfig;

    public final void configFloor(@NotNull View floor, @NotNull FloorConfigurator.FloorConfigurationParam secondFloorConfig, @NotNull Function1<? super FloorConfigurator.FloorConfigurationParam, Unit> onFloorConfigured) {
        Intrinsics.checkNotNullParameter(floor, "floor");
        Intrinsics.checkNotNullParameter(secondFloorConfig, "secondFloorConfig");
        Intrinsics.checkNotNullParameter(onFloorConfigured, "onFloorConfigured");
        ViewGroup.LayoutParams layoutParams = floor.getLayoutParams();
        if (!(layoutParams instanceof FrameLayout.LayoutParams)) {
            layoutParams = null;
        }
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
        if (layoutParams2 == null) {
            ViewGroup.LayoutParams layoutParams3 = floor.getLayoutParams();
            layoutParams2 = (CollapsingToolbarLayout.a) (layoutParams3 instanceof CollapsingToolbarLayout.a ? layoutParams3 : null);
            if (layoutParams2 == null) {
                return;
            }
        }
        int measuredHeight = floor.getMeasuredHeight();
        int defaultTopMargin = secondFloorConfig.getDefaultTopMargin();
        int i11 = defaultTopMargin + measuredHeight;
        if (layoutParams2.gravity != 80) {
            layoutParams2.gravity = 80;
            layoutParams2.height = floor.getMeasuredHeight();
            floor.setLayoutParams(layoutParams2);
        }
        FloorConfigurator.FloorConfigurationParam floorConfigurationParam = new FloorConfigurator.FloorConfigurationParam(i11, defaultTopMargin, secondFloorConfig.getDefaultBottomMargin(), secondFloorConfig.getMinBottomMargin(), false, floor, secondFloorConfig);
        onFloorConfigured.invoke(floorConfigurationParam);
        this.floorConfig = floorConfigurationParam;
        floor.setAlpha(0.0f);
        floor.setTranslationY(-floor.getMeasuredHeight());
    }

    @Override // ru.ozon.app.android.storefront.widgets.navbarv2.presentation.configurators.FloorConfigurator
    public FloorConfigurator.FloorConfigurationParam getFloorConfig() {
        return this.floorConfig;
    }
}
