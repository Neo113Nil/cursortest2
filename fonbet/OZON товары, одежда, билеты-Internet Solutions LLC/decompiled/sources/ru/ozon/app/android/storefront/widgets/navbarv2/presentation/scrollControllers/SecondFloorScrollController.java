package ru.ozon.app.android.storefront.widgets.navbarv2.presentation.scrollControllers;

import android.view.View;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.storefront.widgets.navbarv2.presentation.configurators.FloorConfigurator;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010\r¨\u0006\u000e"}, d2 = {"Lru/ozon/app/android/storefront/widgets/navbarv2/presentation/scrollControllers/SecondFloorScrollController;", "", "<init>", "()V", "Lru/ozon/app/android/storefront/widgets/navbarv2/presentation/configurators/FloorConfigurator$FloorConfigurationParam;", "floorConfig", "", "onFloorConfigured", "(Lru/ozon/app/android/storefront/widgets/navbarv2/presentation/configurators/FloorConfigurator$FloorConfigurationParam;)V", "", "offset", "onOffsetChanged", "(I)V", "Lru/ozon/app/android/storefront/widgets/navbarv2/presentation/configurators/FloorConfigurator$FloorConfigurationParam;", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class SecondFloorScrollController {
    private FloorConfigurator.FloorConfigurationParam floorConfig;

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
            FloorConfigurator.FloorConfigurationParam floorConfigurationParam4 = this.floorConfig;
            int defaultBottomMargin = floorConfigurationParam4 != null ? floorConfigurationParam4.getDefaultBottomMargin() : 0;
            if (defaultTopMargin + offset <= minTopMargin) {
                floorView.setTranslationY(-((defaultTopMargin - minTopMargin) + offset + defaultBottomMargin));
            } else {
                floorView.setTranslationY(-defaultBottomMargin);
            }
        }
    }
}
