package ru.ozon.app.android.csma.tips.widgets.tipcourierreview.di;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.checkoutgeo.payment.storage.GooglePayAvailabilityStorage;
import ru.ozon.app.android.payment.ui.GooglePayManagerImpl;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lru/ozon/app/android/payment/ui/GooglePayManagerImpl;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
final class TipCourierReviewV2Component$Companion$create$1$googlePayManager$2 extends AbstractC7737t implements Function0<GooglePayManagerImpl> {
    public static final TipCourierReviewV2Component$Companion$create$1$googlePayManager$2 INSTANCE = new TipCourierReviewV2Component$Companion$create$1$googlePayManager$2();

    TipCourierReviewV2Component$Companion$create$1$googlePayManager$2() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final GooglePayManagerImpl invoke() {
        return new GooglePayManagerImpl(GooglePayAvailabilityStorage.INSTANCE.create());
    }
}
