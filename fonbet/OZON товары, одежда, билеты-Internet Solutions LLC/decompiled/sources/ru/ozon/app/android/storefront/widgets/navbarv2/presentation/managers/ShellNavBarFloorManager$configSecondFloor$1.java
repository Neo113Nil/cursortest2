package ru.ozon.app.android.storefront.widgets.navbarv2.presentation.managers;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C7735q;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.storefront.widgets.navbarv2.presentation.configurators.FloorConfigurator;
import ru.ozon.app.android.storefront.widgets.navbarv2.presentation.scrollControllers.SecondFloorScrollController;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
/* synthetic */ class ShellNavBarFloorManager$configSecondFloor$1 extends C7735q implements Function1<FloorConfigurator.FloorConfigurationParam, Unit> {
    ShellNavBarFloorManager$configSecondFloor$1(Object obj) {
        super(1, obj, SecondFloorScrollController.class, "onFloorConfigured", "onFloorConfigured(Lru/ozon/app/android/storefront/widgets/navbarv2/presentation/configurators/FloorConfigurator$FloorConfigurationParam;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(FloorConfigurator.FloorConfigurationParam floorConfigurationParam) {
        invoke2(floorConfigurationParam);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(FloorConfigurator.FloorConfigurationParam p02) {
        Intrinsics.checkNotNullParameter(p02, "p0");
        ((SecondFloorScrollController) this.receiver).onFloorConfigured(p02);
    }
}
