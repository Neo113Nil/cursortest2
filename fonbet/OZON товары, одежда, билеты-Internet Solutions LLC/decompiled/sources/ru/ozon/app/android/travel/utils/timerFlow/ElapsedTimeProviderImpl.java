package ru.ozon.app.android.travel.utils.timerFlow;

import android.os.SystemClock;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/travel/utils/timerFlow/ElapsedTimeProviderImpl;", "Lru/ozon/app/android/travel/utils/timerFlow/ElapsedTimeProvider;", "<init>", "()V", "provideTime", "", "utils_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ElapsedTimeProviderImpl implements ElapsedTimeProvider {
    @Override // ru.ozon.app.android.travel.utils.timerFlow.ElapsedTimeProvider
    public long provideTime() {
        return SystemClock.elapsedRealtime();
    }
}
