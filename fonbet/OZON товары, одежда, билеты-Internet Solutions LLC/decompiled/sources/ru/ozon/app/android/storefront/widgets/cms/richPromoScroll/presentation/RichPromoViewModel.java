package ru.ozon.app.android.storefront.widgets.cms.richPromoScroll.presentation;

import android.os.Parcelable;
import androidx.lifecycle.w0;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bR(\u0010\n\u001a\u0004\u0018\u00010\u00042\b\u0010\t\u001a\u0004\u0018\u00010\u00048\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lru/ozon/app/android/storefront/widgets/cms/richPromoScroll/presentation/RichPromoViewModel;", "Landroidx/lifecycle/w0;", "<init>", "()V", "Landroid/os/Parcelable;", "state", "", "saveScrollState", "(Landroid/os/Parcelable;)V", AppMeasurementSdk.ConditionalUserProperty.VALUE, "scrollState", "Landroid/os/Parcelable;", "getScrollState", "()Landroid/os/Parcelable;", "cms_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class RichPromoViewModel extends w0 {
    private Parcelable scrollState;

    public final Parcelable getScrollState() {
        return this.scrollState;
    }

    public final void saveScrollState(Parcelable state) {
        this.scrollState = state;
    }
}
