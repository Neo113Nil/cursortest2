package ru.ozon.app.android.travel.logger;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J \u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0096\u0001¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lru/ozon/app/android/travel/logger/TravelActionLogger;", "", "<init>", "()V", "", "throwable", "", "locator", "", "logException", "(Ljava/lang/Throwable;Ljava/lang/String;)V", "actionhandler_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class TravelActionLogger {

    @NotNull
    public static final TravelActionLogger INSTANCE = new TravelActionLogger();
    private final /* synthetic */ TravelActionNonFatalLogger $$delegate_0 = new TravelActionNonFatalLogger();

    private TravelActionLogger() {
    }

    public void logException(@NotNull Throwable throwable, @NotNull String locator) {
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        Intrinsics.checkNotNullParameter(locator, "locator");
        this.$$delegate_0.logException(throwable, locator);
    }
}
