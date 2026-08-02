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
import ru.ozon.app.android.storefront.widgets.navbarv2.presentation.vo.ShellNavBarVO;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J2\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\n0\u0012R\"\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005@RX\u0096\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0013"}, d2 = {"Lru/ozon/app/android/storefront/widgets/navbarv2/presentation/configurators/ZeroFloorConfigurator;", "Lru/ozon/app/android/storefront/widgets/navbarv2/presentation/configurators/FloorConfigurator;", "<init>", "()V", AppMeasurementSdk.ConditionalUserProperty.VALUE, "Lru/ozon/app/android/storefront/widgets/navbarv2/presentation/configurators/FloorConfigurator$FloorConfigurationParam;", "floorConfig", "getFloorConfig", "()Lru/ozon/app/android/storefront/widgets/navbarv2/presentation/configurators/FloorConfigurator$FloorConfigurationParam;", "configFloor", "", "navBarVO", "Lru/ozon/app/android/storefront/widgets/navbarv2/presentation/vo/ShellNavBarVO;", "floor", "Landroid/view/View;", "statusBarHeight", "", "onFloorConfigured", "Lkotlin/Function1;", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ZeroFloorConfigurator implements FloorConfigurator {
    private FloorConfigurator.FloorConfigurationParam floorConfig;

    public final void configFloor(@NotNull ShellNavBarVO navBarVO, @NotNull View floor, int statusBarHeight, @NotNull Function1<? super FloorConfigurator.FloorConfigurationParam, Unit> onFloorConfigured) {
        Intrinsics.checkNotNullParameter(navBarVO, "navBarVO");
        Intrinsics.checkNotNullParameter(floor, "floor");
        Intrinsics.checkNotNullParameter(onFloorConfigured, "onFloorConfigured");
        View ifNotGone = ViewExtKt.getIfNotGone(floor);
        ViewGroup viewGroup = ifNotGone instanceof ViewGroup ? (ViewGroup) ifNotGone : null;
        if (viewGroup == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
        CollapsingToolbarLayout.a aVar = (CollapsingToolbarLayout.a) (layoutParams instanceof CollapsingToolbarLayout.a ? layoutParams : null);
        if (aVar == null || ((FrameLayout.LayoutParams) aVar).topMargin == statusBarHeight) {
            return;
        }
        ViewGroup.LayoutParams layoutParams2 = viewGroup.getLayoutParams();
        if (layoutParams2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.google.android.material.appbar.CollapsingToolbarLayout.LayoutParams");
        }
        CollapsingToolbarLayout.a aVar2 = (CollapsingToolbarLayout.a) layoutParams2;
        ((FrameLayout.LayoutParams) aVar2).topMargin = statusBarHeight;
        viewGroup.setLayoutParams(aVar2);
        FloorConfigurator.FloorConfigurationParam floorConfigurationParam = new FloorConfigurator.FloorConfigurationParam(statusBarHeight, statusBarHeight, navBarVO.getSpacings().getLevel0BottomSpacing(), navBarVO.getSpacings().getLevel0BottomSpacing(), navBarVO.getShowFullNavbarMode() != null, viewGroup, null, 64, null);
        this.floorConfig = floorConfigurationParam;
        onFloorConfigured.invoke(floorConfigurationParam);
    }

    @Override // ru.ozon.app.android.storefront.widgets.navbarv2.presentation.configurators.FloorConfigurator
    public FloorConfigurator.FloorConfigurationParam getFloorConfig() {
        return this.floorConfig;
    }
}
