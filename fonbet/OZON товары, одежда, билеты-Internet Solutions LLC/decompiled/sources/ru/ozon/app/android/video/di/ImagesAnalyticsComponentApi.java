package ru.ozon.app.android.video.di;

import Eg0.b;
import Fg0.a;
import Gg0.f;
import hi.InterfaceC6958a;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pikazon.callback.PikazonPerformanceAvailabilityChecker;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00060\u0001j\u0002`\u0002J\u000f\u0010\u0004\u001a\u00020\u0003H&¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H&¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH&¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH&¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lru/ozon/app/android/video/di/ImagesAnalyticsComponentApi;", "Lhi/a;", "Lru/ozon/app/android/di/provider/component/DiComponent;", "LGg0/f;", "getPlaceholderTimeHandler", "()LGg0/f;", "Lru/ozon/app/android/pikazon/callback/PikazonPerformanceAvailabilityChecker;", "getPikazonPerformanceAvailabilityChecker", "()Lru/ozon/app/android/pikazon/callback/PikazonPerformanceAvailabilityChecker;", "LFg0/a;", "getOzonTrackerErrorsLogger", "()LFg0/a;", "LEg0/b;", "getOzonLoggerErrorsLogger", "()LEg0/b;", "video_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface ImagesAnalyticsComponentApi extends InterfaceC6958a {
    @NotNull
    b getOzonLoggerErrorsLogger();

    @NotNull
    a getOzonTrackerErrorsLogger();

    @NotNull
    PikazonPerformanceAvailabilityChecker getPikazonPerformanceAvailabilityChecker();

    @NotNull
    f getPlaceholderTimeHandler();
}
