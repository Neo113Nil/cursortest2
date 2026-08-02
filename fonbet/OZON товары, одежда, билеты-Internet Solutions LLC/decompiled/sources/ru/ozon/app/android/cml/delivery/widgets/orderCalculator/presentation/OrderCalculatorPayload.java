package ru.ozon.app.android.cml.delivery.widgets.orderCalculator.presentation;

import android.os.Bundle;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\b\u0000\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\t\u001a\u00020\nJ\u0006\u0010\u000b\u001a\u00020\u0005J\u0006\u0010\f\u001a\u00020\nJ\u0006\u0010\r\u001a\u00020\u0005J\u0006\u0010\u000e\u001a\u00020\nJ\u0006\u0010\u000f\u001a\u00020\u0005J\u0006\u0010\u0010\u001a\u00020\u0005R\u0011\u0010\u0004\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0006R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lru/ozon/app/android/cml/delivery/widgets/orderCalculator/presentation/OrderCalculatorPayload;", "", "<init>", "()V", "isNotEmpty", "", "()Z", "bundle", "Landroid/os/Bundle;", "setSourceChanged", "", "isSourceChanged", "setDestinationChanged", "isDestinationChanged", "setRegionsSwapped", "areRegionsSwapped", "areRegionsChanged", "Companion", "delivery_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class OrderCalculatorPayload {

    @NotNull
    private final Bundle bundle = new Bundle();

    public final boolean areRegionsChanged() {
        return isSourceChanged() || isDestinationChanged();
    }

    public final boolean areRegionsSwapped() {
        return this.bundle.getBoolean("regions_swapped");
    }

    public final boolean isDestinationChanged() {
        return this.bundle.getBoolean("destination_changed");
    }

    public final boolean isNotEmpty() {
        return !this.bundle.isEmpty();
    }

    public final boolean isSourceChanged() {
        return this.bundle.getBoolean("source_changed");
    }

    public final void setDestinationChanged() {
        this.bundle.putBoolean("destination_changed", true);
    }

    public final void setRegionsSwapped() {
        this.bundle.putBoolean("regions_swapped", true);
    }

    public final void setSourceChanged() {
        this.bundle.putBoolean("source_changed", true);
    }
}
