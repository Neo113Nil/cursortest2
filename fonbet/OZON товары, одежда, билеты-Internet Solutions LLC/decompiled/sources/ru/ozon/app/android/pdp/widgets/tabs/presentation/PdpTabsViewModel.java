package ru.ozon.app.android.pdp.widgets.tabs.presentation;

import androidx.lifecycle.w0;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\tR$\u0010\u000b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u00048\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR$\u0010\u000f\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u00048\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u000f\u0010\f\u001a\u0004\b\u0010\u0010\u000e¨\u0006\u0011"}, d2 = {"Lru/ozon/app/android/pdp/widgets/tabs/presentation/PdpTabsViewModel;", "Landroidx/lifecycle/w0;", "<init>", "()V", "", "index", "offset", "", "saveScroll", "(II)V", AppMeasurementSdk.ConditionalUserProperty.VALUE, "scrollIndex", "I", "getScrollIndex", "()I", "scrollOffset", "getScrollOffset", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class PdpTabsViewModel extends w0 {
    private int scrollIndex;
    private int scrollOffset;

    public final int getScrollIndex() {
        return this.scrollIndex;
    }

    public final int getScrollOffset() {
        return this.scrollOffset;
    }

    public final void saveScroll(int index, int offset) {
        this.scrollIndex = index;
        this.scrollOffset = offset;
    }
}
