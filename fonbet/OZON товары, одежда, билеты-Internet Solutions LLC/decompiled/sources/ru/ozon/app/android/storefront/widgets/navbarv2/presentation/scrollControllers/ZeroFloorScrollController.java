package ru.ozon.app.android.storefront.widgets.navbarv2.presentation.scrollControllers;

import android.view.View;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.storefront.widgets.navbarv2.presentation.configurators.FloorConfigurator;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010\rR\u0014\u0010\u0011\u001a\u00020\u000e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, d2 = {"Lru/ozon/app/android/storefront/widgets/navbarv2/presentation/scrollControllers/ZeroFloorScrollController;", "", "<init>", "()V", "Lru/ozon/app/android/storefront/widgets/navbarv2/presentation/configurators/FloorConfigurator$FloorConfigurationParam;", "floorConfig", "", "onFloorConfigured", "(Lru/ozon/app/android/storefront/widgets/navbarv2/presentation/configurators/FloorConfigurator$FloorConfigurationParam;)V", "", "offset", "onOffsetChanged", "(I)V", "Lru/ozon/app/android/storefront/widgets/navbarv2/presentation/configurators/FloorConfigurator$FloorConfigurationParam;", "", "getCanBeHidden", "()Z", "canBeHidden", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ZeroFloorScrollController {
    private FloorConfigurator.FloorConfigurationParam floorConfig;

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
        FloorConfigurator.FloorConfigurationParam floorConfigurationParam = this.floorConfig;
        if (floorConfigurationParam == null || (floorView = floorConfigurationParam.getFloorView()) == null) {
            return;
        }
        if (!getCanBeHidden()) {
            floorView.setAlpha(1.0f);
            return;
        }
        FloorConfigurator.FloorConfigurationParam floorConfigurationParam2 = this.floorConfig;
        float height = floorView.getHeight() + (floorConfigurationParam2 != null ? floorConfigurationParam2.getDefaultBottomMargin() : 0);
        floorView.setAlpha(Math.max((offset + height) / height, 0.0f));
    }
}
