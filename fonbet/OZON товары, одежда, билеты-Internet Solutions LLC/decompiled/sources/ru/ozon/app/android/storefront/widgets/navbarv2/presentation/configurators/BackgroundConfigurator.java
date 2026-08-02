package ru.ozon.app.android.storefront.widgets.navbarv2.presentation.configurators;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.storefront.widgets.navbarv2.presentation.configurators.FloorConfigurator;
import ru.ozon.app.android.storefront.widgets.navbarv2.presentation.views.ShellNavBarBgView;
import ru.ozon.app.android.storefront.widgets.navbarv2.presentation.vo.ShellNavBarTeethVO;
import ru.ozon.app.android.storefront.widgets.navbarv2.presentation.vo.ShellNavBarVO;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\t\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J#\u0010\b\u001a\u0004\u0018\u00010\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\b\u0010\tJQ\u0010\u0017\u001a\u00020\u00152\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000e2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00062\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00150\u0013¢\u0006\u0004\b\u0017\u0010\u0018R(\u0010\u001a\u001a\u0004\u0018\u00010\u00142\b\u0010\u0019\u001a\u0004\u0018\u00010\u00148\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"Lru/ozon/app/android/storefront/widgets/navbarv2/presentation/configurators/BackgroundConfigurator;", "", "<init>", "()V", "Lcom/google/android/material/appbar/CollapsingToolbarLayout$a;", "layoutParams", "", "computedTopMargin", "updateLayoutParams", "(Lcom/google/android/material/appbar/CollapsingToolbarLayout$a;I)Lcom/google/android/material/appbar/CollapsingToolbarLayout$a;", "Lru/ozon/app/android/storefront/widgets/navbarv2/presentation/views/ShellNavBarBgView;", "backgroundView", "Lru/ozon/app/android/storefront/widgets/navbarv2/presentation/vo/ShellNavBarVO;", "navBarVO", "", "", "Lru/ozon/app/android/storefront/widgets/navbarv2/presentation/configurators/FloorConfigurator;", "floorConfigurators", "prevOffset", "Lkotlin/Function1;", "Lru/ozon/app/android/storefront/widgets/navbarv2/presentation/configurators/FloorConfigurator$FloorConfigurationParam;", "", "onFloorConfigured", "configBackground", "(Lru/ozon/app/android/storefront/widgets/navbarv2/presentation/views/ShellNavBarBgView;Lru/ozon/app/android/storefront/widgets/navbarv2/presentation/vo/ShellNavBarVO;Ljava/util/Map;Ljava/lang/Integer;Lkotlin/jvm/functions/Function1;)V", AppMeasurementSdk.ConditionalUserProperty.VALUE, "config", "Lru/ozon/app/android/storefront/widgets/navbarv2/presentation/configurators/FloorConfigurator$FloorConfigurationParam;", "getConfig", "()Lru/ozon/app/android/storefront/widgets/navbarv2/presentation/configurators/FloorConfigurator$FloorConfigurationParam;", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class BackgroundConfigurator {
    private FloorConfigurator.FloorConfigurationParam config;

    private final CollapsingToolbarLayout.a updateLayoutParams(CollapsingToolbarLayout.a layoutParams, int computedTopMargin) {
        if (layoutParams == null) {
            return null;
        }
        if (((FrameLayout.LayoutParams) layoutParams).topMargin != computedTopMargin) {
            layoutParams.a(2);
            layoutParams.b(1.0f);
            ((FrameLayout.LayoutParams) layoutParams).topMargin = computedTopMargin;
        }
        return layoutParams;
    }

    public final void configBackground(@NotNull ShellNavBarBgView backgroundView, @NotNull ShellNavBarVO navBarVO, @NotNull Map<String, FloorConfigurator> floorConfigurators, Integer prevOffset, @NotNull Function1<? super FloorConfigurator.FloorConfigurationParam, Unit> onFloorConfigured) {
        int i11;
        Intrinsics.checkNotNullParameter(backgroundView, "backgroundView");
        Intrinsics.checkNotNullParameter(navBarVO, "navBarVO");
        Intrinsics.checkNotNullParameter(floorConfigurators, "floorConfigurators");
        Intrinsics.checkNotNullParameter(onFloorConfigured, "onFloorConfigured");
        FloorConfigurator floorConfigurator = floorConfigurators.get("zero");
        FloorConfigurator.FloorConfigurationParam floorConfig = floorConfigurator != null ? floorConfigurator.getFloorConfig() : null;
        if (floorConfig != null) {
            int defaultTopMargin = floorConfig.getDefaultTopMargin();
            View floorView = floorConfig.getFloorView();
            i11 = floorConfig.getDefaultBottomMargin() + defaultTopMargin + (floorView != null ? floorView.getMeasuredHeight() : 0);
        } else {
            i11 = 0;
        }
        int minTopMargin = (floorConfig == null || !floorConfig.getCanBeHidden()) ? i11 : floorConfig.getMinTopMargin();
        int min = prevOffset != null ? Math.min(Math.max(prevOffset.intValue() + i11, minTopMargin), i11) : i11;
        backgroundView.setTeeth(navBarVO.getTeeth());
        FloorConfigurator floorConfigurator2 = floorConfigurators.get("third");
        boolean z11 = (floorConfigurator2 != null ? floorConfigurator2.getFloorConfig() : null) != null;
        FloorConfigurator floorConfigurator3 = floorConfigurators.get("third");
        FloorConfigurator.FloorConfigurationParam floorConfig2 = floorConfigurator3 != null ? floorConfigurator3.getFloorConfig() : null;
        ShellNavBarTeethVO teeth = navBarVO.getTeeth();
        int teethHeight = teeth != null ? teeth.getTeethHeight() : 0;
        ShellNavBarTeethVO teeth2 = navBarVO.getTeeth();
        int teethHeight2 = teeth2 != null ? teeth2.getTeethHeight() : 0;
        ShellNavBarTeethVO teeth3 = navBarVO.getTeeth();
        FloorConfigurator.FloorConfigurationParam floorConfigurationParam = new FloorConfigurator.FloorConfigurationParam(i11, minTopMargin, (teeth3 != null ? teeth3.getTeethTopSpacerHeight() : 0) + teethHeight2, teethHeight, z11, backgroundView, floorConfig2);
        onFloorConfigured.invoke(floorConfigurationParam);
        this.config = floorConfigurationParam;
        ViewGroup.LayoutParams layoutParams = backgroundView.getLayoutParams();
        CollapsingToolbarLayout.a aVar = (CollapsingToolbarLayout.a) (layoutParams instanceof CollapsingToolbarLayout.a ? layoutParams : null);
        if (aVar == null) {
            return;
        }
        backgroundView.setLayoutParams(updateLayoutParams(aVar, min));
    }

    public final FloorConfigurator.FloorConfigurationParam getConfig() {
        return this.config;
    }
}
