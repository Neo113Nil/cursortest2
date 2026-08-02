package ru.ozon.app.android.travel.feature.hotels.widgets.cellWithTimer.di;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.sellerproducts.sellerProducts.data.model.ProductContainerDTO;
import ru.ozon.app.android.travel.utils.timerFormatter.TimerFormatter;
import ru.ozon.app.android.travel.utils.timerFormatter.TimerFormatterImpl;
import ru.ozon.app.android.travel.utils.timerFormatter.TimerUnit;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/widgets/cellWithTimer/di/CellWithTimerModule;", "", "<init>", "()V", "Lru/ozon/app/android/travel/utils/timerFormatter/TimerFormatter;", "provideTimerFormatter", "()Lru/ozon/app/android/travel/utils/timerFormatter/TimerFormatter;", "hotels_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class CellWithTimerModule {

    @NotNull
    public static final CellWithTimerModule INSTANCE = new CellWithTimerModule();

    private CellWithTimerModule() {
    }

    @NotNull
    public final TimerFormatter provideTimerFormatter() {
        return new TimerFormatterImpl(ProductContainerDTO.RATIO_DELIMITER, new TimerUnit[]{new TimerUnit("%02d", 3600L, null), new TimerUnit("%02d", 60L, 60L), new TimerUnit("%02d", 1L, 60L)});
    }
}
