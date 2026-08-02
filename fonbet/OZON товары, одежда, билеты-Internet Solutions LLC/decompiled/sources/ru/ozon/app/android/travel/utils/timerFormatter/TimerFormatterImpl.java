package ru.ozon.app.android.travel.utils.timerFormatter;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.sellerproducts.sellerProducts.data.model.ProductContainerDTO;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0000\u0018\u00002\u00020\u0001B!\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\fH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\t¨\u0006\r"}, d2 = {"Lru/ozon/app/android/travel/utils/timerFormatter/TimerFormatterImpl;", "Lru/ozon/app/android/travel/utils/timerFormatter/TimerFormatter;", "timeUnitSeparator", "", "timeUnits", "", "Lru/ozon/app/android/travel/utils/timerFormatter/TimerUnit;", "<init>", "(Ljava/lang/String;[Lru/ozon/app/android/travel/utils/timerFormatter/TimerUnit;)V", "[Lru/ozon/app/android/travel/utils/timerFormatter/TimerUnit;", "format", "time", "", "utils_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class TimerFormatterImpl implements TimerFormatter {

    @NotNull
    private final String timeUnitSeparator;

    @NotNull
    private final TimerUnit[] timeUnits;

    public TimerFormatterImpl(@NotNull String timeUnitSeparator, @NotNull TimerUnit[] timeUnits) {
        Intrinsics.checkNotNullParameter(timeUnitSeparator, "timeUnitSeparator");
        Intrinsics.checkNotNullParameter(timeUnits, "timeUnits");
        this.timeUnitSeparator = timeUnitSeparator;
        this.timeUnits = timeUnits;
    }

    @Override // ru.ozon.app.android.travel.utils.timerFormatter.TimerFormatter
    @NotNull
    public String format(long time) {
        int length = this.timeUnits.length;
        StringBuilder sb2 = new StringBuilder();
        for (int i11 = 0; i11 < length; i11++) {
            sb2.append(this.timeUnits[i11].format(time));
            if (i11 < length - 1) {
                sb2.append(this.timeUnitSeparator);
            }
        }
        String sb3 = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(sb3, "toString(...)");
        return sb3;
    }

    public /* synthetic */ TimerFormatterImpl(String str, TimerUnit[] timerUnitArr, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? ProductContainerDTO.RATIO_DELIMITER : str, (i11 & 2) != 0 ? new TimerUnit[]{new TimerUnit("%02d", 3600L, null), new TimerUnit("%02d", 60L, 60L), new TimerUnit("%02d", 1L, 60L)} : timerUnitArr);
    }
}
