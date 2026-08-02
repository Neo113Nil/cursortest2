package ru.ozon.app.android.analytics.plugins.af;

import android.net.Uri;
import io.reactivex.p;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H&¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\tH&¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\r\u001a\b\u0012\u0004\u0012\u00020\n0\tH&¢\u0006\u0004\b\r\u0010\f¨\u0006\u000e"}, d2 = {"Lru/ozon/app/android/analytics/plugins/af/AppsFlyerConversionStorage;", "", "", "start", "()V", "Landroid/net/Uri;", "uri", "performDeeplink", "(Landroid/net/Uri;)V", "Lio/reactivex/p;", "Lru/ozon/app/android/analytics/plugins/af/AppsFlyerDeeplinkResult;", "observeResult", "()Lio/reactivex/p;", "observeDeferredResult", "analytics_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface AppsFlyerConversionStorage {
    @NotNull
    p<AppsFlyerDeeplinkResult> observeDeferredResult();

    @NotNull
    p<AppsFlyerDeeplinkResult> observeResult();

    void performDeeplink(@NotNull Uri uri);

    void start();
}
