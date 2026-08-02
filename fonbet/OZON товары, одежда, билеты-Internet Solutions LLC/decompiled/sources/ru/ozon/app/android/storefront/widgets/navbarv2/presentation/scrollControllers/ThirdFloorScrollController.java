package ru.ozon.app.android.storefront.widgets.navbarv2.presentation.scrollControllers;

import android.view.View;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.storefront.widgets.navbarv2.presentation.configurators.FloorConfigurator;
import ru.ozon.app.android.storefront.widgets.navbarv2.presentation.placeholder.ShellNavBarStateListener;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0003\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0003\u0010\u0011R\u0018\u0010\n\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/storefront/widgets/navbarv2/presentation/scrollControllers/ThirdFloorScrollController;", "", "Lru/ozon/app/android/storefront/widgets/navbarv2/presentation/placeholder/ShellNavBarStateListener;", "alphaListener", "<init>", "(Lru/ozon/app/android/storefront/widgets/navbarv2/presentation/placeholder/ShellNavBarStateListener;)V", "", "setMaxAlpha", "()V", "Lru/ozon/app/android/storefront/widgets/navbarv2/presentation/configurators/FloorConfigurator$FloorConfigurationParam;", "floorConfig", "onFloorConfigured", "(Lru/ozon/app/android/storefront/widgets/navbarv2/presentation/configurators/FloorConfigurator$FloorConfigurationParam;)V", "", "offset", "onOffsetChanged", "(I)V", "Lru/ozon/app/android/storefront/widgets/navbarv2/presentation/placeholder/ShellNavBarStateListener;", "Lru/ozon/app/android/storefront/widgets/navbarv2/presentation/configurators/FloorConfigurator$FloorConfigurationParam;", "", "getCanBeHidden", "()Z", "canBeHidden", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ThirdFloorScrollController {

    @NotNull
    private ShellNavBarStateListener alphaListener;
    private FloorConfigurator.FloorConfigurationParam floorConfig;

    public ThirdFloorScrollController(@NotNull ShellNavBarStateListener alphaListener) {
        Intrinsics.checkNotNullParameter(alphaListener, "alphaListener");
        this.alphaListener = alphaListener;
    }

    private final void setMaxAlpha() {
        View floorView;
        View floorView2;
        FloorConfigurator.FloorConfigurationParam floorConfigurationParam = this.floorConfig;
        if (Intrinsics.b((floorConfigurationParam == null || (floorView2 = floorConfigurationParam.getFloorView()) == null) ? null : Float.valueOf(floorView2.getAlpha()), 1.0f)) {
            return;
        }
        FloorConfigurator.FloorConfigurationParam floorConfigurationParam2 = this.floorConfig;
        if (floorConfigurationParam2 != null && (floorView = floorConfigurationParam2.getFloorView()) != null) {
            floorView.setAlpha(1.0f);
        }
        this.alphaListener.onFloorAlphaChanged(1.0f);
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
        if (!getCanBeHidden()) {
            setMaxAlpha();
            return;
        }
        FloorConfigurator.FloorConfigurationParam floorConfigurationParam2 = this.floorConfig;
        if (floorConfigurationParam2 == null || (floorView = floorConfigurationParam2.getFloorView()) == null || (floorConfigurationParam = this.floorConfig) == null) {
            return;
        }
        int minTopMargin = floorConfigurationParam.getMinTopMargin();
        FloorConfigurator.FloorConfigurationParam floorConfigurationParam3 = this.floorConfig;
        if (floorConfigurationParam3 != null) {
            int defaultTopMargin = floorConfigurationParam3.getDefaultTopMargin() + offset;
            if (defaultTopMargin > minTopMargin) {
                setMaxAlpha();
                floorView.setVisibility(0);
                return;
            }
            int i11 = defaultTopMargin - minTopMargin;
            float measuredHeight = floorView.getMeasuredHeight();
            float max = Math.max((i11 + measuredHeight) / measuredHeight, 0.0f);
            floorView.setVisibility((max > 0.0f ? 1 : (max == 0.0f ? 0 : -1)) == 0 ? 8 : 0);
            floorView.setAlpha(max);
            this.alphaListener.onFloorAlphaChanged(max);
        }
    }
}
