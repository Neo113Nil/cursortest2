package ru.ozon.app.android.storefront.widgets.navbarv2.presentation.scrollControllers;

import android.view.View;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.storefront.widgets.navbarv2.core.Constants;
import ru.ozon.app.android.storefront.widgets.navbarv2.presentation.configurators.FloorConfigurator;
import ru.ozon.app.android.storefront.widgets.navbarv2.presentation.placeholder.ShellNavBarStateListener;
import ru.ozon.app.android.storefront.widgets.navbarv2.presentation.views.ShellNavBarScrollFloorView;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0016\u0010\u0003\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0003\u0010\u000fR(\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\u0010\u001a\u0004\u0018\u00010\u00068\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u0007\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0015\u001a\u00020\u00148\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lru/ozon/app/android/storefront/widgets/navbarv2/presentation/scrollControllers/ScrollFloorScrollController;", "", "Lru/ozon/app/android/storefront/widgets/navbarv2/presentation/placeholder/ShellNavBarStateListener;", "alphaListener", "<init>", "(Lru/ozon/app/android/storefront/widgets/navbarv2/presentation/placeholder/ShellNavBarStateListener;)V", "Lru/ozon/app/android/storefront/widgets/navbarv2/presentation/configurators/FloorConfigurator$FloorConfigurationParam;", "floorConfig", "", "onFloorConfigured", "(Lru/ozon/app/android/storefront/widgets/navbarv2/presentation/configurators/FloorConfigurator$FloorConfigurationParam;)V", "", "offset", "onOffsetChanged", "(I)V", "Lru/ozon/app/android/storefront/widgets/navbarv2/presentation/placeholder/ShellNavBarStateListener;", AppMeasurementSdk.ConditionalUserProperty.VALUE, "Lru/ozon/app/android/storefront/widgets/navbarv2/presentation/configurators/FloorConfigurator$FloorConfigurationParam;", "getFloorConfig", "()Lru/ozon/app/android/storefront/widgets/navbarv2/presentation/configurators/FloorConfigurator$FloorConfigurationParam;", "", "canBeHidden", "Z", "getCanBeHidden", "()Z", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ScrollFloorScrollController {

    @NotNull
    private ShellNavBarStateListener alphaListener;
    private final boolean canBeHidden;
    private FloorConfigurator.FloorConfigurationParam floorConfig;

    public ScrollFloorScrollController(@NotNull ShellNavBarStateListener alphaListener) {
        Intrinsics.checkNotNullParameter(alphaListener, "alphaListener");
        this.alphaListener = alphaListener;
        FloorConfigurator.FloorConfigurationParam floorConfigurationParam = this.floorConfig;
        this.canBeHidden = floorConfigurationParam != null ? floorConfigurationParam.getCanBeHidden() : false;
    }

    public void onFloorConfigured(@NotNull FloorConfigurator.FloorConfigurationParam floorConfig) {
        Intrinsics.checkNotNullParameter(floorConfig, "floorConfig");
        this.floorConfig = floorConfig;
    }

    public void onOffsetChanged(int offset) {
        FloorConfigurator.FloorConfigurationParam floorConfigurationParam = this.floorConfig;
        View floorView = floorConfigurationParam != null ? floorConfigurationParam.getFloorView() : null;
        ShellNavBarScrollFloorView shellNavBarScrollFloorView = floorView instanceof ShellNavBarScrollFloorView ? (ShellNavBarScrollFloorView) floorView : null;
        if (shellNavBarScrollFloorView == null) {
            return;
        }
        Constants constants = Constants.INSTANCE;
        float max = Math.max((constants.getSCROLL_FLOOR_CENTER_CONTENT_HEIGHT() + offset) / constants.getSCROLL_FLOOR_CENTER_CONTENT_HEIGHT(), 0.0f);
        shellNavBarScrollFloorView.setAlpha(max);
        this.alphaListener.onFloorAlphaChanged(max);
        shellNavBarScrollFloorView.updateChildTranslationY(-offset);
    }
}
