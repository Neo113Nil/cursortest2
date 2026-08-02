package ru.ozon.app.android.travel.feature.avia.widgets.aviaBookedTicketInfo.di;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.sellerproducts.sellerProducts.data.model.ProductContainerDTO;
import ru.ozon.app.android.travel.utils.timerFormatter.TimerFormatter;
import ru.ozon.app.android.travel.utils.timerFormatter.TimerFormatterImpl;
import ru.ozon.app.android.travel.utils.timerFormatter.TimerUnit;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/aviaBookedTicketInfo/di/AviaBookedTicketInfoModule;", "", "<init>", "()V", "provideTimerFormatter", "Lru/ozon/app/android/travel/utils/timerFormatter/TimerFormatter;", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class AviaBookedTicketInfoModule {

    @NotNull
    public static final AviaBookedTicketInfoModule INSTANCE = new AviaBookedTicketInfoModule();

    private AviaBookedTicketInfoModule() {
    }

    @NotNull
    public final TimerFormatter provideTimerFormatter() {
        return new TimerFormatterImpl(ProductContainerDTO.RATIO_DELIMITER, new TimerUnit[]{new TimerUnit("%02d", 3600000L, null), new TimerUnit("%02d", 60000L, 60L), new TimerUnit("%02d", 1000L, 60L)});
    }
}
