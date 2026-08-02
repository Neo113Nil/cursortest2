package ru.ozon.app.android.fresh.navigation.configurators;

import Lm0.a;
import io.reactivex.p;
import io.reactivex.u;
import java.util.concurrent.Callable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import mc.C8125a;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.checkoutgeo.address.AddressUpdateManager;
import ru.ozon.app.android.composer.universalscreen.view.ComposerScreenConfig;
import ru.ozon.app.android.fresh.navigation.configurators.DismissOnAddressUpdateConfigurator;
import ru.ozon.app.android.utils.rx.RxExtKt;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0006\u001a\u00020\u0007H\u0014R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lru/ozon/app/android/fresh/navigation/configurators/DismissOnAddressUpdateConfigurator;", "Lru/ozon/app/android/composer/universalscreen/view/ComposerScreenConfig$PageConfigurator;", "addressUpdateManager", "Lru/ozon/app/android/checkoutgeo/address/AddressUpdateManager;", "<init>", "(Lru/ozon/app/android/checkoutgeo/address/AddressUpdateManager;)V", "onComposerInitialized", "", "navigation_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class DismissOnAddressUpdateConfigurator extends ComposerScreenConfig.PageConfigurator {

    @NotNull
    private final AddressUpdateManager addressUpdateManager;

    public DismissOnAddressUpdateConfigurator(@NotNull AddressUpdateManager addressUpdateManager) {
        Intrinsics.checkNotNullParameter(addressUpdateManager, "addressUpdateManager");
        this.addressUpdateManager = addressUpdateManager;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final u onComposerInitialized$lambda$0(DismissOnAddressUpdateConfigurator dismissOnAddressUpdateConfigurator) {
        return dismissOnAddressUpdateConfigurator.addressUpdateManager.getAddressUpdate().g() ? dismissOnAddressUpdateConfigurator.addressUpdateManager.getAddressUpdate().skip(1L) : dismissOnAddressUpdateConfigurator.addressUpdateManager.getAddressUpdate();
    }

    @Override // ru.ozon.app.android.composer.universalscreen.view.ComposerScreenConfig.PageConfigurator
    protected void onComposerInitialized() {
        super.onComposerInitialized();
        p observeOn = p.defer(new Callable() { // from class: Ow.a
            @Override // java.util.concurrent.Callable
            public final Object call() {
                u onComposerInitialized$lambda$0;
                onComposerInitialized$lambda$0 = DismissOnAddressUpdateConfigurator.onComposerInitialized$lambda$0(DismissOnAddressUpdateConfigurator.this);
                return onComposerInitialized$lambda$0;
            }
        }).observeOn(C8125a.a());
        Intrinsics.checkNotNullExpressionValue(observeOn, "observeOn(...)");
        RxExtKt.observeRoute(observeOn, getContainer().f(), new DismissOnAddressUpdateConfigurator$onComposerInitialized$2(this), new DismissOnAddressUpdateConfigurator$onComposerInitialized$3(a.f17149a));
    }
}
