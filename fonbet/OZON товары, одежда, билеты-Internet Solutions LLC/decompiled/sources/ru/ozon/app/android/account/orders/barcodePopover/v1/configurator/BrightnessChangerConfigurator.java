package ru.ozon.app.android.account.orders.barcodePopover.v1.configurator;

import a00.C4911f;
import androidx.fragment.app.r;
import androidx.lifecycle.J;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.account.orders.barcode.presentation.utils.ScreenBrightnessChanger;
import ru.ozon.app.android.composer.ConfiguratorReferences;
import ru.ozon.app.android.composer.universalscreen.view.ComposerScreenConfig;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000b\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\f¨\u0006\r"}, d2 = {"Lru/ozon/app/android/account/orders/barcodePopover/v1/configurator/BrightnessChangerConfigurator;", "Lru/ozon/app/android/composer/universalscreen/view/ComposerScreenConfig$PageConfigurator;", "Lru/ozon/app/android/account/orders/barcode/presentation/utils/ScreenBrightnessChanger;", "brightnessChanger", "<init>", "(Lru/ozon/app/android/account/orders/barcode/presentation/utils/ScreenBrightnessChanger;)V", "Landroidx/lifecycle/J;", "owner", "", "onResume", "(Landroidx/lifecycle/J;)V", "onPause", "Lru/ozon/app/android/account/orders/barcode/presentation/utils/ScreenBrightnessChanger;", "cs-orders_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class BrightnessChangerConfigurator extends ComposerScreenConfig.PageConfigurator {

    @NotNull
    private final ScreenBrightnessChanger brightnessChanger;

    public BrightnessChangerConfigurator(@NotNull ScreenBrightnessChanger brightnessChanger) {
        Intrinsics.checkNotNullParameter(brightnessChanger, "brightnessChanger");
        this.brightnessChanger = brightnessChanger;
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onPause(@NotNull J owner) {
        C4911f ownerContainer;
        r a11;
        Intrinsics.checkNotNullParameter(owner, "owner");
        super.onPause(owner);
        ConfiguratorReferences references = getReferences();
        if (references == null || (ownerContainer = references.getOwnerContainer()) == null || (a11 = ownerContainer.a()) == null) {
            return;
        }
        ScreenBrightnessChanger.DefaultImpls.returnUserBrightness$default(this.brightnessChanger, a11, false, 2, null);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onResume(@NotNull J owner) {
        C4911f ownerContainer;
        r a11;
        Intrinsics.checkNotNullParameter(owner, "owner");
        super.onResume(owner);
        ConfiguratorReferences references = getReferences();
        if (references == null || (ownerContainer = references.getOwnerContainer()) == null || (a11 = ownerContainer.a()) == null) {
            return;
        }
        this.brightnessChanger.increaseBrightness(a11);
    }
}
