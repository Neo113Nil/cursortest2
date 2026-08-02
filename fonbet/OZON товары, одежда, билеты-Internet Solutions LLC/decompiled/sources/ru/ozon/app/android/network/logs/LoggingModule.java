package ru.ozon.app.android.network.logs;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.network.abtool.FeatureChecker;
import ru.ozon.app.android.network.abtool.FeatureService;
import sj.a;
import sj.d;
import sj.e;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0006J'\u0010\r\u001a\u00020\f2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lru/ozon/app/android/network/logs/LoggingModule;", "", "<init>", "()V", "Lsj/d;", "provideAndroidLogger", "()Lsj/d;", "Lru/ozon/app/android/network/abtool/FeatureService;", "featureService", "Lru/ozon/app/android/network/abtool/FeatureChecker;", "featureChecker", "ozonLogger", "Lru/ozon/app/android/network/logs/WebViewErrorLogger;", "provideWebViewLogger", "(Lru/ozon/app/android/network/abtool/FeatureService;Lru/ozon/app/android/network/abtool/FeatureChecker;Lsj/d;)Lru/ozon/app/android/network/logs/WebViewErrorLogger;", "network_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class LoggingModule {
    @NotNull
    public final d provideAndroidLogger() {
        return e.f98817f.q(new a("Network", "WebView", null));
    }

    @NotNull
    public final WebViewErrorLogger provideWebViewLogger(@NotNull FeatureService featureService, @NotNull FeatureChecker featureChecker, @NotNull d ozonLogger) {
        Intrinsics.checkNotNullParameter(featureService, "featureService");
        Intrinsics.checkNotNullParameter(featureChecker, "featureChecker");
        Intrinsics.checkNotNullParameter(ozonLogger, "ozonLogger");
        return new WebViewErrorLogger(featureService, featureChecker, ozonLogger);
    }
}
