package ru.ozon.app.android.marketing.widgets.couponPromo.presentation.dialog;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l10.InterfaceC7851b;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.marketing.widgets.couponPromo.presentation.dialog.CouponPromoBottomSheetDialog;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0013\u0012\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tR\u001b\u0010\u0004\u001a\u00060\u0002j\u0002`\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\n\u001a\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lru/ozon/app/android/marketing/widgets/couponPromo/presentation/dialog/UpdateAction;", "Lru/ozon/app/android/marketing/widgets/couponPromo/presentation/dialog/CouponPromoBottomSheetDialog$UpdateListener;", "Ll10/b;", "Lru/ozon/app/android/composer/ComposerController;", "bus", "<init>", "(Ll10/b;)V", "", "onUpdate", "()V", "Ll10/b;", "getBus", "()Ll10/b;", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class UpdateAction implements CouponPromoBottomSheetDialog.UpdateListener {

    @NotNull
    private final transient InterfaceC7851b bus;

    public UpdateAction(@NotNull InterfaceC7851b bus) {
        Intrinsics.checkNotNullParameter(bus, "bus");
        this.bus = bus;
    }

    @Override // ru.ozon.app.android.marketing.widgets.couponPromo.presentation.dialog.CouponPromoBottomSheetDialog.UpdateListener
    public void onUpdate() {
        InterfaceC7851b.a.a(this.bus, null, null, null, null, 15);
    }
}
