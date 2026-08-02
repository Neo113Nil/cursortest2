package ru.ozon.app.android.travel.feature.general.booking.widgets.modalCheckoutTimeLimit.presentation;

import androidx.lifecycle.P;
import androidx.lifecycle.V;
import androidx.lifecycle.w0;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.general.booking.widgets.modalCheckoutTimeLimit.data.ModalCheckoutTimeLimitMapper;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0013\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000fR\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0011¨\u0006\u0012"}, d2 = {"Lru/ozon/app/android/travel/feature/general/booking/widgets/modalCheckoutTimeLimit/presentation/ModalCheckoutTimeLimitViewModel;", "Landroidx/lifecycle/w0;", "Lru/ozon/app/android/travel/feature/general/booking/widgets/modalCheckoutTimeLimit/data/ModalCheckoutTimeLimitMapper;", "mapper", "<init>", "(Lru/ozon/app/android/travel/feature/general/booking/widgets/modalCheckoutTimeLimit/data/ModalCheckoutTimeLimitMapper;)V", "Landroidx/lifecycle/P;", "", "formattedTimeLiveData", "()Landroidx/lifecycle/P;", "", "timeLeftInMillis", "", "onTimerTick", "(J)V", "Lru/ozon/app/android/travel/feature/general/booking/widgets/modalCheckoutTimeLimit/data/ModalCheckoutTimeLimitMapper;", "Landroidx/lifecycle/V;", "Landroidx/lifecycle/V;", "booking_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ModalCheckoutTimeLimitViewModel extends w0 {

    @NotNull
    private final V<CharSequence> formattedTimeLiveData;

    @NotNull
    private final ModalCheckoutTimeLimitMapper mapper;

    public ModalCheckoutTimeLimitViewModel(@NotNull ModalCheckoutTimeLimitMapper mapper) {
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        this.mapper = mapper;
        this.formattedTimeLiveData = new V<>();
    }

    @NotNull
    public final P<CharSequence> formattedTimeLiveData() {
        return this.formattedTimeLiveData;
    }

    public final void onTimerTick(long timeLeftInMillis) {
        this.formattedTimeLiveData.setValue(this.mapper.format(TimeUnit.MILLISECONDS.toSeconds(timeLeftInMillis)));
    }
}
